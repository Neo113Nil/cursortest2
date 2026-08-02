package com.knotapi.knot.webview;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.knotapi.knot.interfaces.LoaderHandler;
import com.knotapi.knot.interfaces.MerchantViewListener;
import com.knotapi.knot.interfaces.MerchantWebViewDelegate;
import com.knotapi.knot.interfaces.ScreenshotCallback;
import com.knotapi.knot.models.Bot;
import com.knotapi.knot.models.ErrorView;
import com.knotapi.knot.models.Interceptor;
import com.knotapi.knot.services.KnotSDKInitProvider;
import com.knotapi.knot.services.Reporter;
import com.knotapi.knot.ui.activities.KnotActivity;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.knotapi.knot.utilities.Constants;
import com.knotapi.knot.utilities.Cookie;
import com.knotapi.knot.utilities.CookiePredicate;
import com.knotapi.knot.utilities.CookiesActionsHandler;
import com.knotapi.knot.utilities.ErrorViewActionsManager;
import com.knotapi.knot.utilities.Helper;
import com.knotapi.knot.utilities.InterceptorManager;
import com.knotapi.knot.utilities.JsScripts;
import com.knotapi.knot.utilities.PageActionsManager;
import com.knotapi.knot.utilities.RunCustomScript;
import com.knotapi.knot.utilities.ScreenshotHelper;
import com.knotapi.knot.utilities.SsoCookieHelper;
import com.knotapi.knot.utilities.SsoLoginHelper;
import com.knotapi.knot.utilities.StorageHelper;
import com.knotapi.knot.utilities.WebViewCookieCollector;
import com.knotapi.knot.utilities.WorkflowValidationHelper;
import com.knotapi.knot.webview.merchants.KnotViewClientResolver;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;
import org.slf4j.Marker;

/* loaded from: classes4.dex */
public class KnotViewClient extends WebViewClient {
    public static final String TAG = "Knot:KnotViewClient";
    protected Bot bot;
    protected KnotView knotView;
    MerchantViewListener merchantViewListener;
    public SsoCookieHelper ssoCookieHelper = new SsoCookieHelper();
    public boolean delayLoader = false;
    public boolean isLoaderShownForRedirection = false;
    private List<String> preRedirectionUrls = new ArrayList();
    private List<String> postRedirectionUrls = new ArrayList();
    private boolean loginEventFired = false;
    private boolean pageContentLoaded = false;

    public KnotViewClient(KnotView knotView) {
        this.knotView = knotView;
        this.bot = knotView.getBot();
        this.merchantViewListener = knotView.merchantViewListener;
    }

    private String checkInterceptorRules(String str) {
        try {
            if (this.bot.getInterceptorRules() == null) {
                return null;
            }
            for (Interceptor interceptor : this.bot.getInterceptorRules()) {
                if (interceptor.isUrlRegex() && str.matches(interceptor.getUrl())) {
                    if (interceptor.isSendToServer()) {
                        this.knotView.mExtraInfo.interceptedHashmap.put(interceptor.getServerKey(), str);
                    }
                    if (Objects.equals(interceptor.getReplaceType(), "change_url_query_param") && str.contains(interceptor.getReplaceKey())) {
                        return InterceptorManager.replaceUrlParameter(str, interceptor.getReplaceKey(), interceptor.getReplaceValue());
                    }
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private void checkLoginAndUIRenderedEvent(String str) {
        if (!str.startsWith(this.bot.getLoginUrl()) || this.loginEventFired) {
            return;
        }
        MerchantWebViewDelegate merchantWebViewDelegate = this.knotView.webViewDelegate;
        if (merchantWebViewDelegate != null) {
            merchantWebViewDelegate.sendNativeLogEvent(Integer.valueOf(this.bot.getBotId()), Constants.META_FLOW, "url loaded", str);
        }
        this.loginEventFired = true;
    }

    private static void clearLocalAndWebStorage(KnotView knotView) {
        knotView.clear();
        if (knotView.bot.hasClearLocalAndWebStorage() && knotView.bot.isClearLocalAndWebStorage()) {
            knotView.evaluateJavascript(JsScripts.CLEAR_LOCAL_STORAGE, null);
            WebStorage.getInstance().deleteAllData();
        }
    }

    private boolean extractElement(JsonObject jsonObject, String str, List<String> list) {
        JsonElement jsonElement = jsonObject.get(str);
        if (list != null) {
            list.clear();
        }
        if (jsonElement == null || jsonElement.isJsonNull()) {
            return false;
        }
        try {
            if (!jsonElement.isJsonPrimitive() || !jsonElement.getAsJsonPrimitive().isString()) {
                return false;
            }
            String trim = jsonElement.getAsString().trim();
            if (trim.startsWith("\"") && trim.endsWith("\"")) {
                trim = trim.substring(1, trim.length() - 1);
            }
            if (!trim.equalsIgnoreCase("true") && !trim.equalsIgnoreCase("false")) {
                Iterator<JsonElement> it = JsonParser.parseString(trim.replace("\\\"", "\"")).getAsJsonArray().iterator();
                while (it.hasNext()) {
                    list.add(it.next().getAsString());
                }
                return false;
            }
            return Boolean.parseBoolean(trim);
        } catch (Exception unused) {
            jsonElement.toString();
            return false;
        }
    }

    private void injectStorageHooks() {
        if (this.bot.getCheckLocalStorage().booleanValue() || this.bot.getCheckSessionStorage().booleanValue()) {
            try {
                String str = KnotActivity.getCachedAssets().get("realTimeStorageHook.js");
                if (str == null || str.isEmpty()) {
                    return;
                }
                String localStorageRequiredProps = this.bot.getLocalStorageRequiredProps();
                String sessionStorageRequiredProps = this.bot.getSessionStorageRequiredProps();
                StringBuilder sb = new StringBuilder("{\"localStorageRequiredProps\":");
                if (localStorageRequiredProps == null) {
                    localStorageRequiredProps = "[]";
                }
                sb.append(localStorageRequiredProps);
                sb.append(",\"sessionStorageRequiredProps\":");
                if (sessionStorageRequiredProps == null) {
                    sessionStorageRequiredProps = "[]";
                }
                sb.append(sessionStorageRequiredProps);
                sb.append("}");
                String sb2 = sb.toString();
                this.knotView.evaluateJavascript(str.replace("})();", "})(" + sb2 + ");"), null);
            } catch (Exception e) {
                Reporter.error(e, "injectStorageHooks()");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendPasskeyLogs$0() {
        ScreenshotHelper.captureAndMaskScreenshot(this.knotView, new ScreenshotCallback() { // from class: com.knotapi.knot.webview.KnotViewClient.1
            @Override // com.knotapi.knot.interfaces.ScreenshotCallback
            public void onScreenshotReady(String str) {
                String str2;
                if (KnotViewClient.this.knotView.getUrl() != null) {
                    str2 = KnotViewClient.this.knotView.getUrl() + " || Google Passkey || Passkey page";
                } else {
                    str2 = "";
                }
                KnotViewClient.this.knotView.getWebViewDelegate().sendNativeLogEvent(Integer.valueOf(KnotViewClient.this.knotView.bot.getBotId()), Constants.META_SCREENSHOT, str, str2);
            }
        });
    }

    public static KnotViewClient newInstance(KnotView knotView) {
        clearLocalAndWebStorage(knotView);
        return KnotViewClientResolver.getKnotViewClient(knotView);
    }

    private void triggerWorkflowValidation(String str) {
        KnotView knotView;
        WorkflowValidationHelper workflowValidationHelper;
        Bot bot = this.bot;
        if ((bot != null && !bot.isWorkflowValidationFeatureFlagEnabled() && (this.bot.getDisableWorkflowValidation() || this.bot.isTriggerDisabled(str))) || (knotView = this.knotView) == null || (workflowValidationHelper = knotView.workflowValidationHelper) == null) {
            return;
        }
        try {
            workflowValidationHelper.collectAndSendWorkflowData(str);
        } catch (Exception e) {
            Reporter.error(e, "Error executing triggerWorkflowValidation");
        }
    }

    public Cookie buildCookie(String str, String str2) {
        return Cookie.buildCookie(str, str2);
    }

    public void checkLoggedInInLoadResource() {
        new Handler().post(new Runnable() { // from class: com.knotapi.knot.webview.KnotViewClient.2
            @Override // java.lang.Runnable
            public void run() {
                boolean isInterceptRedirectionIntent = KnotViewClient.this.bot.isInterceptRedirectionIntent();
                KnotViewClient knotViewClient = KnotViewClient.this;
                if (isInterceptRedirectionIntent) {
                    String url = knotViewClient.knotView.getUrl();
                    Objects.requireNonNull(url);
                    if (url.contains(KnotViewClient.this.knotView.bot.getInterceptIntentUrl())) {
                        KnotViewClient.this.knotView.loginDone();
                        return;
                    }
                    return;
                }
                boolean isCheckLoggedInInLoadResource = knotViewClient.bot.isCheckLoggedInInLoadResource();
                KnotViewClient knotViewClient2 = KnotViewClient.this;
                if (isCheckLoggedInInLoadResource) {
                    KnotView knotView = knotViewClient2.knotView;
                    if (knotView.isUserLoggedIn(knotView.getUrl())) {
                        KnotViewClient.this.knotView.loginDone();
                        return;
                    }
                    return;
                }
                boolean isCheckLoggedInWithLoggedInUrlContains = knotViewClient2.bot.isCheckLoggedInWithLoggedInUrlContains();
                KnotViewClient knotViewClient3 = KnotViewClient.this;
                if (isCheckLoggedInWithLoggedInUrlContains) {
                    KnotView knotView2 = knotViewClient3.knotView;
                    if (knotView2.isUserLoggedIn(knotView2.getUrl()) || KnotViewClient.this.knotView.getUrl().contains(KnotViewClient.this.bot.getLoggedInUrl())) {
                        KnotViewClient.this.knotView.loginDone();
                        return;
                    }
                    return;
                }
                boolean isCheckLoggedInWithAndroidUrlEquals = knotViewClient3.bot.isCheckLoggedInWithAndroidUrlEquals();
                KnotViewClient knotViewClient4 = KnotViewClient.this;
                if (isCheckLoggedInWithAndroidUrlEquals) {
                    KnotView knotView3 = knotViewClient4.knotView;
                    if (knotView3.isUserLoggedIn(knotView3.getUrl()) || KnotViewClient.this.knotView.getUrl().equals(KnotViewClient.this.bot.getAndroidLoggedInUrl())) {
                        KnotViewClient.this.knotView.loginDone();
                        return;
                    }
                    return;
                }
                if (knotViewClient4.bot.isCheckLoggedInWithAndroidUrlContains()) {
                    KnotView knotView4 = KnotViewClient.this.knotView;
                    if (knotView4.isUserLoggedIn(knotView4.getUrl()) || KnotViewClient.this.knotView.getUrl().contains(KnotViewClient.this.bot.getAndroidLoggedInUrl())) {
                        KnotViewClient.this.knotView.loginDone();
                    }
                }
            }
        });
    }

    public void checkNoSubscriptionStatus() {
        MerchantViewListener merchantViewListener;
        try {
            if (!this.bot.noSubscriptionUrlSameAs(this.knotView.getUrl()) || (merchantViewListener = this.merchantViewListener) == null || merchantViewListener.isErrorViewVisible()) {
                return;
            }
            showErrorPage(getErrorView());
        } catch (Exception unused) {
        }
    }

    public void configureLogin(String str, String str2) {
        KnotView knotView = this.knotView;
        knotView.loginType = str;
        if (knotView.getSettings().getUserAgentString().equals(str2)) {
            return;
        }
        this.knotView.getSettings().setUserAgentString(str2);
    }

    public Bot getBot() {
        return this.bot;
    }

    public List<Cookie> getCookies(String str) {
        return new WebViewCookieCollector(new MaterialButton$$ExternalSyntheticLambda3(this, 10)).getAllCookiesAsList(this.knotView, str);
    }

    public ErrorView getErrorView() {
        return new ErrorView(this.bot.getMerchantName(), Constants.subscription_title, Constants.subscription_subTitle, this.bot.getLogoURL(), this.bot.getTheme().get("background_color").getAsString(), this.bot.getTheme().get("text_color").getAsString(), "Custom Merchant Error Screen");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ErrorView getErrorViewWithMessage(JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        try {
            str = jSONObject.optString("title");
        } catch (Exception unused) {
            str = "";
        }
        try {
            str2 = jSONObject.optString("content");
        } catch (Exception unused2) {
            str2 = "";
            if (str.isEmpty()) {
            }
            String str4 = str;
            if (str2.isEmpty()) {
            }
            str3 = str2;
            if (!str3.contains("down")) {
            }
            KnotView knotView = this.knotView;
            this.knotView.webViewDelegate.sendNativeLogEvent(Integer.valueOf(this.bot.getBotId()), Constants.META_MERCHANT_ISSUE, str3, knotView != null ? knotView.getUrl() : "");
            return new ErrorView(this.bot.getMerchantName(), str4, str3, this.bot.getLogoURL(), this.bot.getTheme().get("background_color").getAsString(), this.bot.getTheme().get("text_color").getAsString(), "onCardSwitchNativeError");
        }
        if (str.isEmpty()) {
            str = Constants.subscription_title;
        }
        String str42 = str;
        if (str2.isEmpty()) {
            str2 = Constants.subscription_subTitle;
        }
        str3 = str2;
        if (!str3.contains("down") || str42.contains("unavailable")) {
            KnotView knotView2 = this.knotView;
            this.knotView.webViewDelegate.sendNativeLogEvent(Integer.valueOf(this.bot.getBotId()), Constants.META_MERCHANT_ISSUE, str3, knotView2 != null ? knotView2.getUrl() : "");
        }
        return new ErrorView(this.bot.getMerchantName(), str42, str3, this.bot.getLogoURL(), this.bot.getTheme().get("background_color").getAsString(), this.bot.getTheme().get("text_color").getAsString(), "onCardSwitchNativeError");
    }

    public String getUserAgent() {
        return this.bot.getUserAgent(this.knotView);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean googlePasskeyLoader(WebResourceRequest webResourceRequest, boolean z, LoaderHandler loaderHandler) {
        boolean extractElement;
        String uri = webResourceRequest.getUrl().toString();
        JsonObject allSettings = this.bot.getAllSettings();
        JsonElement jsonElement = allSettings != null && allSettings.has("globalSettings") ? this.bot.getAllSettings().getAsJsonObject("globalSettings").get("redirect_passkey_urls") : null;
        if (jsonElement != null) {
            try {
                JsonObject asJsonObject = JsonParser.parseString(jsonElement.getAsString()).getAsJsonObject();
                extractElement = extractElement(asJsonObject, "enableLoader", null);
                try {
                    extractElement(asJsonObject, "preRedirectionUrls", this.preRedirectionUrls);
                    extractElement(asJsonObject, "postRedirectionUrls", this.postRedirectionUrls);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
            }
            if (extractElement && isPasskeyUrl(uri, this.preRedirectionUrls) && !this.isLoaderShownForRedirection) {
                sendPasskeyLogs();
                if (loaderHandler == null && z) {
                    loaderHandler.showLoader();
                } else {
                    this.knotView.showLoader();
                }
                this.isLoaderShownForRedirection = true;
            }
            if (!isPasskeyUrl(uri, this.preRedirectionUrls) && this.isLoaderShownForRedirection) {
                this.isLoaderShownForRedirection = false;
            }
            if (isPasskeyUrl(uri, this.postRedirectionUrls)) {
                this.delayLoader = true;
            }
            return false;
        }
        extractElement = false;
        if (extractElement) {
            sendPasskeyLogs();
            if (loaderHandler == null) {
            }
            this.knotView.showLoader();
            this.isLoaderShownForRedirection = true;
        }
        if (!isPasskeyUrl(uri, this.preRedirectionUrls)) {
            this.isLoaderShownForRedirection = false;
        }
        if (isPasskeyUrl(uri, this.postRedirectionUrls)) {
        }
        return false;
    }

    public void handleLoader(String str) {
        KnotView knotView = this.knotView;
        if (knotView.isLoggedIn || knotView.isUserLoggedIn(str)) {
            this.knotView.showLoader();
        } else {
            this.knotView.hideLoader();
        }
    }

    public boolean isPasskeyUrl(String str, List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    public boolean isUserLoggedIn(String str) {
        if (this.knotView.isLoggedIn) {
            return true;
        }
        boolean isDetectLoginUsingCookiesAndLoggedInUrl = this.bot.isDetectLoginUsingCookiesAndLoggedInUrl();
        Bot bot = this.bot;
        if (isDetectLoginUsingCookiesAndLoggedInUrl) {
            return this.bot.loggedInUrlSameAs(str) & CookiePredicate.isUserLoggedIn(bot, this.knotView.getCookies()).booleanValue();
        }
        if (bot.hasCookieActions() && this.bot.hasRequiredCookies()) {
            return CookiesActionsHandler.isUserLoggedIn(this.bot, this.knotView.getCookies());
        }
        boolean hasLoggedInPredicate = this.bot.hasLoggedInPredicate();
        Bot bot2 = this.bot;
        return hasLoggedInPredicate ? CookiePredicate.isUserLoggedIn(bot2, this.knotView.getCookies()).booleanValue() : bot2.loggedInUrlSameAs(str);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        try {
            if (CookiesActionsHandler.canAddCookies("onLoadResource", this.bot)) {
                this.knotView.addCookies(str);
            }
            this.ssoCookieHelper.saveCookiesForDomain(KnotActivity.activity, str);
            KnotView knotView = this.knotView;
            knotView.performAllBulkActions(knotView, false);
            KnotView knotView2 = this.knotView;
            knotView2.defaultAction(knotView2);
            handleLoader(webView.getUrl());
            checkNoSubscriptionStatus();
            checkLoggedInInLoadResource();
            this.ssoCookieHelper.fetchEmailFromWebView(webView, this.knotView, KnotActivity.activity);
            triggerWorkflowValidation("onLoadResource");
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        MerchantWebViewDelegate merchantWebViewDelegate;
        super.onPageCommitVisible(webView, str);
        String url = this.knotView.getUrl();
        if (this.bot.isInterceptRedirectionIntent() && url != null && url.contains(this.knotView.bot.getInterceptIntentUrl())) {
            this.knotView.loginDone();
        }
        if (!this.pageContentLoaded && (merchantWebViewDelegate = this.knotView.webViewDelegate) != null) {
            this.pageContentLoaded = true;
            merchantWebViewDelegate.sendNativeLogEvent(Integer.valueOf(this.bot.getBotId()), Constants.META_FLOW, "url content rendered", str);
        }
        triggerWorkflowValidation("onPageCommitVisible");
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        try {
            if (CookiesActionsHandler.canAddCookies("onLoadResource", this.bot)) {
                this.knotView.addCookies(str);
            }
            if (this.knotView.isUserLoggedIn(str) || this.knotView.isLoggedIn) {
                if (this.bot.getAndroidPageActions() != null) {
                    this.knotView.isLoggedIn = true;
                    BreadcrumbHelper.trackForMerchant(this.bot.getMerchantName(), this.bot.getMerchantId(), "Starting page actions", BreadcrumbHelper.Category.AUTOMATION);
                    PageActionsManager.startPageActions(str, this.knotView, this.bot.getAndroidPageActions());
                } else if (this.bot.isPaymentUrlSet()) {
                    boolean paymentUrlSameAs = this.bot.paymentUrlSameAs(str);
                    KnotView knotView = this.knotView;
                    if (paymentUrlSameAs) {
                        knotView.finalStep();
                    } else {
                        knotView.loginDone();
                    }
                } else {
                    this.knotView.loginDone();
                }
            }
        } catch (Exception unused) {
        }
        this.ssoCookieHelper.saveCookiesForDomain(KnotActivity.activity, str);
        checkLoginAndUIRenderedEvent(str);
        triggerWorkflowValidation("onPageFinished");
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            BreadcrumbHelper.trackForMerchant(this.bot.getMerchantName(), this.bot.getMerchantId(), "Page started: " + str, BreadcrumbHelper.Category.NAVIGATION);
            if (this.bot.getErrorViewActions() != null) {
                ErrorViewActionsManager.startErrorViewActions(str, this.knotView, this.bot.getErrorViewActions());
            }
            this.knotView.checkWebPageNotAvailable();
            SsoLoginHelper.processSSO(str, this.bot, this.knotView, this.ssoCookieHelper, null, false);
            ScreenshotHelper.startScreenshotFlow(webView, this.knotView, null);
            this.knotView.listenToDOMChanges();
            this.knotView.trackNativeMerchantEvents();
            this.knotView.getMerchantViewListener().sendPageUrl(str);
            Bot bot = this.bot;
            KnotView knotView = this.knotView;
            RunCustomScript.runScriptInMerchantView(bot, knotView, knotView.activity, false);
            if (this.bot.isTransactionsUrlSet()) {
                this.merchantViewListener.loadTransactionUrl(this.bot.getTransactionsUrl());
            }
            if (this.bot.hasCheckLoginScript()) {
                this.knotView.evaluateJavascript(this.bot.getCheckLoginScript(), null);
            }
            if (str.equals(this.bot.getLoginUrl()) && this.bot.hasLoginScript()) {
                this.knotView.evaluateJavascript(this.bot.getLoginScript(), null);
            }
            injectStorageHooks();
            triggerWorkflowValidation("onPageStarted");
        } catch (Exception unused) {
        }
    }

    public void onStorageDetails(String str, String str2) {
        CookiesActionsHandler.updateCookies(this.knotView, this.bot);
        StorageHelper.validateStorages(str, str2, this.knotView, this.bot);
        if (this.ssoCookieHelper.fromReusedCookies) {
            this.knotView.clearCookies();
        }
    }

    public void sendPasskeyLogs() {
        KnotView knotView = this.knotView;
        knotView.webViewDelegate.sendNativeLogEvent(Integer.valueOf(knotView.bot.getBotId()), "Google Passkey", "{ url: " + this.knotView.getUrl() + " , merchantName: " + this.bot.getMerchantName() + " }", "Passkey Page");
        try {
            new Handler(Looper.getMainLooper()).post(new KnotView$$ExternalSyntheticLambda1(this, 17));
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String uri;
        try {
            uri = webResourceRequest.getUrl().toString();
            triggerWorkflowValidation("shouldInterceptRequest");
        } catch (Exception unused) {
        }
        if (Helper.matchesAnyCondition(this.bot.getBlockedUrls(), uri)) {
            return new WebResourceResponse("text/plain", "UTF-8", null);
        }
        if (this.ssoCookieHelper.checkShouldIntercept(webView, webResourceRequest, KnotActivity.activity, this.knotView) && this.ssoCookieHelper.shouldBlockRequest) {
            SsoCookieHelper ssoCookieHelper = this.ssoCookieHelper;
            return new WebResourceResponse(ssoCookieHelper.mimeType, ssoCookieHelper.f1026encoding, new ByteArrayInputStream(new byte[0]));
        }
        for (String str : Constants.BLOCKED_ANALYTICS_URLS) {
            if (uri.contains(str)) {
                return new WebResourceResponse("text/plain", "UTF-8", null);
            }
        }
        if (this.bot.isNoCORSMode() && webResourceRequest.getMethod().equals("OPTIONS")) {
            HashMap hashMap = new HashMap();
            hashMap.put("Access-Control-Allow-Origin", Marker.ANY_MARKER);
            hashMap.put("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
            hashMap.put("Access-Control-Allow-Headers", Marker.ANY_MARKER);
            hashMap.put("Access-Control-Max-Age", "3600");
            return new WebResourceResponse("text/plain", "UTF-8", 200, "OK", hashMap, new ByteArrayInputStream(new byte[0]));
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Objects.toString(webResourceRequest.getUrl());
        String checkInterceptorRules = checkInterceptorRules(webResourceRequest.getUrl().toString());
        if (checkInterceptorRules != null) {
            webView.loadUrl(checkInterceptorRules);
        }
        triggerWorkflowValidation("shouldOverrideUrlLoading");
        if (!this.bot.hasSupportDeepLinks() || this.bot.isSupportDeepLinks()) {
            return googlePasskeyLoader(webResourceRequest, false, null);
        }
        return true;
    }

    public void showErrorPage(ErrorView errorView) {
        try {
            KnotView knotView = this.knotView;
            if (knotView.showErrorPage) {
                return;
            }
            knotView.showErrorPage = true;
            this.merchantViewListener.showErrorView(KnotSDKInitProvider.rootUrl + "/error-page" + ("?merchantId=" + URLEncoder.encode(String.valueOf(this.bot.getMerchantId()), "UTF-8") + "&merchantCounts=" + URLEncoder.encode(String.valueOf(this.bot.getMerchantCount()), "UTF-8") + "&name=" + URLEncoder.encode(errorView.getName(), "UTF-8") + "&logo=" + URLEncoder.encode(errorView.getLogoLink(), "UTF-8") + "&bg=" + URLEncoder.encode(errorView.getThemeBackground(), "UTF-8") + "&color=" + URLEncoder.encode(errorView.getThemeTextColor(), "UTF-8") + "&title=" + URLEncoder.encode(errorView.getTitle(), "UTF-8") + "&subTitle=" + URLEncoder.encode(String.format(errorView.getContent(), errorView.getName()), "UTF-8") + "&displayedAt=" + URLEncoder.encode(errorView.getDisplayedAt(), "UTF-8")));
        } catch (UnsupportedEncodingException e) {
            Reporter.error(e, "showErrorPage()");
        }
    }
}
