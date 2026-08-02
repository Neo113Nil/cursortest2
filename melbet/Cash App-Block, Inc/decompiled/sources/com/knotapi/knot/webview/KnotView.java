package com.knotapi.knot.webview;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.knotapi.knot.interfaces.ImageLoadCallback;
import com.knotapi.knot.interfaces.MerchantViewListener;
import com.knotapi.knot.interfaces.MerchantWebViewDelegate;
import com.knotapi.knot.models.Bot;
import com.knotapi.knot.models.CustomEvent;
import com.knotapi.knot.models.DialogOptions;
import com.knotapi.knot.models.ExtraInfo;
import com.knotapi.knot.services.Reporter;
import com.knotapi.knot.ui.activities.KnotActivity;
import com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.knotapi.knot.utilities.Constants;
import com.knotapi.knot.utilities.Cookie;
import com.knotapi.knot.utilities.Helper;
import com.knotapi.knot.utilities.JsScripts;
import com.knotapi.knot.utilities.PreferenceManager;
import com.knotapi.knot.utilities.ScreenshotHelper;
import com.knotapi.knot.utilities.WebAppJSFetcher;
import com.knotapi.knot.utilities.WorkflowValidationHelper;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class KnotView extends WebView {
    public static final String TAG = "Knot:KnotView";
    public Activity activity;
    public Bot bot;
    public Context context;
    public List<Cookie> cookies;
    private JSONObject currentLocalStorage;
    private JSONObject currentSessionStorage;
    public boolean fromDialog;
    JsonObject globalSettings;
    private final Map<String, String> injectedAssets;
    boolean isEmailLinkError;
    public boolean isLoggedIn;
    public boolean isPaymentPageLoaded;
    public Boolean isTimeOutStart;
    public boolean isUserAuthed;
    private WebAppJSFetcher jsHelper;
    public String loginType;
    Bitmap logoBitmap;
    public ExtraInfo mExtraInfo;
    public MerchantViewListener merchantViewListener;
    public boolean showErrorPage;
    private ValueCallback<String> storageDetailsCallBack;
    private final Object storageLock;
    private long storageValidationStartTime;
    public KnotViewClient viewClient;
    public MerchantWebViewDelegate webViewDelegate;
    public WorkflowValidationHelper workflowValidationHelper;

    public KnotView(Context context) {
        super(context);
        this.isLoggedIn = false;
        this.showErrorPage = false;
        this.isPaymentPageLoaded = false;
        this.isTimeOutStart = Boolean.FALSE;
        this.loginType = Constants.NORMAL_LOGIN;
        this.fromDialog = false;
        this.globalSettings = null;
        this.storageValidationStartTime = 0L;
        this.injectedAssets = new HashMap();
        this.isUserAuthed = false;
        this.currentLocalStorage = null;
        this.currentSessionStorage = null;
        this.storageLock = new Object();
        this.storageDetailsCallBack = new ValueCallback<String>() { // from class: com.knotapi.knot.webview.KnotView.2
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                String str2;
                try {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        str2 = jSONObject.getString("l");
                        try {
                            KnotView.this.onStorageDetails(str2, jSONObject.getString("s"));
                        } catch (JSONException unused) {
                            String str3 = KnotView.TAG;
                            KnotView.this.onStorageDetails(str2, null);
                        }
                    } catch (Throwable th) {
                        th = th;
                        KnotView.this.onStorageDetails(str, null);
                        throw th;
                    }
                } catch (JSONException unused2) {
                    str2 = null;
                } catch (Throwable th2) {
                    th = th2;
                    str = null;
                    KnotView.this.onStorageDetails(str, null);
                    throw th;
                }
            }
        };
        this.isEmailLinkError = false;
        this.logoBitmap = null;
        try {
            this.context = context;
        } catch (Exception e) {
            Reporter.error(e, "Error creating context");
        }
    }

    private void addCleanCookies(String str) {
        HashSet hashSet = new HashSet();
        List<Cookie> list = this.cookies;
        if (list != null) {
            Iterator<Cookie> it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(getCookieSignature(it.next()));
            }
        }
        for (Cookie cookie : this.viewClient.getCookies(str)) {
            if (!hashSet.contains(getCookieSignature(cookie))) {
                this.cookies.add(cookie);
                hashSet.add(getCookieSignature(cookie));
            }
        }
    }

    private void executeJavaScript(WebView webView, String str, String str2, String str3) {
        try {
            webView.evaluateJavascript(String.format(str, str2), null);
        } catch (Exception unused) {
        }
    }

    private void fetchJSForPasskeyPage(final WebView webView, final JsonElement jsonElement) {
        if (webView == null || webView.getUrl() == null || !webView.getUrl().contains("google.com") || jsonElement == null || jsonElement.getAsString().isEmpty()) {
            return;
        }
        try {
            JsonElement jsonElement2 = JsonParser.parseString(jsonElement.getAsString()).getAsJsonObject().get("passkeyRedirectJS");
            if (jsonElement2 == null || !jsonElement2.isJsonPrimitive()) {
                return;
            }
            this.jsHelper.fetchJS(jsonElement2.getAsString(), new WebAppJSFetcher.JSFetchCallback() { // from class: com.knotapi.knot.webview.KnotView.3
                @Override // com.knotapi.knot.utilities.WebAppJSFetcher.JSFetchCallback
                public void onFetchFailed(Exception exc) {
                    exc.getClass();
                    KnotView.this.redirectPasskeyPage(webView, jsonElement);
                }

                @Override // com.knotapi.knot.utilities.WebAppJSFetcher.JSFetchCallback
                public void onJSCodeFetched(String str) {
                    KnotView.this.handleJsCode(webView, jsonElement, str);
                }
            });
        } catch (Exception unused) {
            redirectPasskeyPage(webView, jsonElement);
        }
    }

    private String getCookieSignature(Cookie cookie) {
        return cookie.name + "|" + cookie.value;
    }

    private String getElementSelector(JsonElement jsonElement, JsonElement jsonElement2) {
        String str;
        JsonObject asJsonObject;
        if (jsonElement != null && jsonElement.isJsonPrimitive()) {
            try {
                asJsonObject = JsonParser.parseString(jsonElement.getAsString()).getAsJsonObject();
            } catch (Exception e) {
                e.getMessage();
            }
            if (asJsonObject.has("key")) {
                str = asJsonObject.get("key").getAsString();
                return jsonElement2 != null ? str : str;
            }
        }
        str = "[\".yOnVIb .G8ZO0d li\"]";
        return jsonElement2 != null ? str : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleJsCode(WebView webView, JsonElement jsonElement, String str) {
        try {
            JsonObject asJsonObject = JsonParser.parseString(jsonElement.getAsString()).getAsJsonObject();
            Gson gson = new Gson();
            String[] strArr = (String[]) gson.fromJson(asJsonObject.get("passkeyTexts"), String[].class);
            String[] strArr2 = (String[]) gson.fromJson(asJsonObject.get("deviceTexts"), String[].class);
            String[] strArr3 = (String[]) gson.fromJson(asJsonObject.get("buttonTexts"), String[].class);
            if (strArr == null || strArr2 == null || strArr3 == null || strArr.length <= 0 || strArr2.length <= 0 || strArr3.length <= 0 || str == null || str.isEmpty()) {
                return;
            }
            webView.evaluateJavascript(String.format(str.concat("checkAndClick(%s, %s, %s);"), gson.toJson(strArr), gson.toJson(strArr2), gson.toJson(strArr3)), null);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isConfirmationLinkValidForMerchant(int i, String str) {
        if (i == 91) {
            return this.bot.checkEmailLinkIsValid(str);
        }
        if (i != 102) {
            return false;
        }
        return checkEmailConfirmationRegex(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$preloadImage$1(String str, ImageLoadCallback imageLoadCallback) {
        int i = 0;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            new Handler(Looper.getMainLooper()).post(new KnotView$$ExternalSyntheticLambda0(i, imageLoadCallback, BitmapFactory.decodeStream(httpURLConnection.getInputStream())));
        } catch (Exception unused) {
            Handler handler = new Handler(Looper.getMainLooper());
            Objects.requireNonNull(imageLoadCallback);
            handler.post(new KnotView$$ExternalSyntheticLambda1(imageLoadCallback, i));
        }
    }

    private void preloadImage(String str, ImageLoadCallback imageLoadCallback) {
        new Thread(new KnotView$$ExternalSyntheticLambda0(str, imageLoadCallback)).start();
    }

    private void reTryCookiesDisabled(WebView webView, JsonElement jsonElement) {
        try {
            if (!webView.getUrl().contains("google.com") || jsonElement == null || jsonElement.getAsString().isEmpty()) {
                return;
            }
            JsonObject asJsonObject = JsonParser.parseString(jsonElement.getAsString()).getAsJsonObject();
            String asString = asJsonObject.has("cookiesDisabledText") ? asJsonObject.get("cookiesDisabledText").getAsString() : "Cookies are disabled";
            String asString2 = asJsonObject.has("tryAgainText") ? asJsonObject.get("tryAgainText").getAsString() : "Try again";
            if (asString == null || asString2 == null) {
                return;
            }
            webView.evaluateJavascript(String.format(JsScripts.retryCookies, asString, asString2), null);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void redirectPasskeyPage(WebView webView, JsonElement jsonElement) {
        if (webView == null || webView.getUrl() == null || !webView.getUrl().contains("google.com") || jsonElement == null || jsonElement.getAsString().isEmpty()) {
            return;
        }
        try {
            handleJsCode(webView, jsonElement, JsScripts.redirectPasskeyPage);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupAndShowBottomSheet(Bitmap bitmap, boolean z) {
        this.isEmailLinkError = z;
        final KnotBottomSheetDialog knotBottomSheetDialog = new KnotBottomSheetDialog(this.webViewDelegate);
        String invalidLinkDialogTitle = z ? getInvalidLinkDialogTitle() : getEmailDialogTitle();
        String invalidLinkDialogMessage = z ? getInvalidLinkDialogMessage() : getEmailDialogMessage();
        if (!z) {
            this.webViewDelegate.sendNativeLogEvent(Integer.valueOf(this.bot.getBotId()), Constants.META_FLOW, "login paste link overlay", "");
        }
        DialogOptions dialogOptions = new DialogOptions(invalidLinkDialogTitle, invalidLinkDialogMessage, "", getDialogButtonText(), new View.OnClickListener() { // from class: com.knotapi.knot.webview.KnotView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }, new View.OnClickListener() { // from class: com.knotapi.knot.webview.KnotView.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                String confirmationLink = knotBottomSheetDialog.getConfirmationLink();
                KnotView knotView = KnotView.this;
                knotView.webViewDelegate.sendNativeLogEvent(Integer.valueOf(knotView.bot.getBotId()), Constants.META_BUTTON_CLICKED, KnotView.this.getDialogButtonText(), "Merchant Login Paste Link");
                KnotView knotView2 = KnotView.this;
                boolean isConfirmationLinkValidForMerchant = knotView2.isConfirmationLinkValidForMerchant(knotView2.bot.getMerchantId(), confirmationLink);
                KnotView knotView3 = KnotView.this;
                if (isConfirmationLinkValidForMerchant) {
                    knotView3.showLoader();
                    KnotView.this.loadUrl(confirmationLink);
                    KnotView.this.fromDialog = true;
                } else {
                    knotView3.isEmailLinkError = true;
                    knotView3.openLinkDialog(true);
                }
                knotBottomSheetDialog.closeSheet();
            }
        }, new View.OnClickListener() { // from class: com.knotapi.knot.webview.KnotView.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                KnotView knotView = KnotView.this;
                knotView.webViewDelegate.sendNativeLogEvent(Integer.valueOf(knotView.bot.getBotId()), Constants.META_BUTTON_CLICKED, "Close merchant overlay", "Merchant Login Paste Link");
                KnotView knotView2 = KnotView.this;
                knotView2.webViewDelegate.userCloseMerchantView(knotView2.bot.getBotId(), KnotView.this.bot.getMerchantId());
                knotBottomSheetDialog.closeSheet();
            }
        }, getDialogHint());
        if (bitmap != null) {
            knotBottomSheetDialog.setBitmap(bitmap);
        }
        knotBottomSheetDialog.setDialogOptions(dialogOptions);
        knotBottomSheetDialog.setNonDismissible(true);
        Activity activity = this.activity;
        if (activity instanceof FragmentActivity) {
            knotBottomSheetDialog.show(((FragmentActivity) activity).getSupportFragmentManager(), knotBottomSheetDialog.getTag());
        }
    }

    private void startTimeOutFunction() {
        try {
            this.webViewDelegate.setNeedTimeOutCall(true);
            this.webViewDelegate.callTimeOutErrorCallback(this.bot.getBotId());
        } catch (Exception e) {
            Reporter.error(e, "Generic error executing startTimeOutFunction");
        }
    }

    public void addCookies(String str) {
        try {
            if (this.bot.hasGetCleanCookies() && this.bot.getCleanCookies()) {
                addCleanCookies(str);
            } else {
                this.cookies = Cookie.mergeAll(this.cookies, this.viewClient.getCookies(str));
            }
        } catch (Exception e) {
            Reporter.error(e, "Generic error executing addCookies for url " + str);
        }
    }

    public void addLocalStorage(String str, String str2) {
        try {
            evaluateJavascript("(async () => {             try {\n                await Promise.all([\n                    (function() { localStorage.setItem('" + str + "', '" + str2 + "'); })(),\n                ]);\n            } catch (error) {\n                console.log(error);\n            }\n })();", null);
        } catch (Exception e) {
            Reporter.error(e, "Generic error evaluating js for addLocalStorage");
        }
    }

    public void adjustAppleHeight() {
        try {
            evaluateJavascript("(async () => {async function updateBodyHeight(height) {   var interval = setInterval(() => {       var body = document.getElementsByTagName('body')[0];       var html = document.getElementsByTagName('html')[0];       var newHeight = height || window.innerHeight + 'px';       body.style.height = newHeight;       html.style.height = newHeight;   }, 50);}var height = 'auto';await Promise.all([   updateBodyHeight(height === '' ? null : height),]);})()", null);
        } catch (Exception unused) {
        }
    }

    public void captureManualScreenshot(KnotView knotView) {
        knotView.evaluateJavascript("window.requestKnotScreenshot({ type: 'manual', reason: 'native_button' });", null);
    }

    public boolean checkEmailConfirmationRegex(String str) {
        try {
            return Pattern.compile(this.bot.getAllSettings().get("confirmationLinkRegex").getAsString()).matcher(str).matches();
        } catch (Exception unused) {
            this.bot.getAllSettings().get("confirmationLinkRegex").getAsString();
            return false;
        }
    }

    public void checkWebPageNotAvailable() {
        evaluateJavascript(JsScripts.CHECK_WEBPAGE_NOT_AVAILABLE, null);
    }

    public void clear() {
        try {
            clearCache(true);
            clearFormData();
            clearHistory();
            clearCookies();
            clearLocalStorage();
        } catch (Exception e) {
            Reporter.error(e, "Generic error clearing browser");
        }
    }

    public void clearCookies() {
        try {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.removeAllCookies(null);
            cookieManager.flush();
            this.cookies.clear();
            if (KnotActivity.domainUrls != null) {
                Helper.resetCookies(new PreferenceManager().getString(this.context, PreferenceManager.PREF_CLIENT_COOKIES, ""));
            }
        } catch (Exception e) {
            Reporter.error(e, "Generic error clearing cookies");
        }
    }

    public void clearLocalStorage() {
        try {
            evaluateJavascript(JsScripts.CLEAR_LOCAL_STORAGE, null);
        } catch (Exception e) {
            Reporter.error(e, "Generic error evaluating js for clearLocalStorage");
        }
    }

    public void defaultAction(WebView webView) {
        JsonElement jsonElement;
        JsonElement jsonElement2;
        JsonElement jsonElement3;
        JsonObject jsonObject = this.globalSettings;
        if (jsonObject != null) {
            jsonElement = jsonObject.get("chrome_element");
            jsonElement2 = this.globalSettings.get("disabled_cookies_element");
            jsonElement3 = this.globalSettings.get("redirect_passkey_values");
        } else {
            jsonElement = null;
            jsonElement2 = null;
            jsonElement3 = null;
        }
        performBulkAction(webView, getElementSelector(jsonElement, this.bot.getAllSettings().get("removeChromeElement")), "removeChromeElements");
        reTryCookiesDisabled(webView, jsonElement2);
        fetchJSForPasskeyPage(webView, jsonElement3);
    }

    public void finalStep() {
        try {
            BreadcrumbHelper.trackForMerchant(this.bot.getMerchantName(), this.bot.getMerchantId(), "Final step triggered", BreadcrumbHelper.Category.AUTHENTICATION);
            this.viewClient.ssoCookieHelper.saveTempCookiesToSharedPreferencesAsync(this.activity);
            if (getUrl().equals(this.bot.getCallbackUrl()) && this.bot.getCallbackScript() != null) {
                evaluateJavascript(this.bot.getCallbackScript(), null);
            }
            this.mExtraInfo.setUserAgent(getSettings().getUserAgentString());
            addCookies(getUrl());
            captureManualScreenshot(this);
            setWebViewClient(new WebViewClient() { // from class: com.knotapi.knot.webview.KnotView.1
                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                    return super.shouldOverrideUrlLoading(webView, webResourceRequest);
                }
            });
            getStorageDetails();
        } catch (Exception e) {
            Reporter.error(e, "Generic error executing finalStep");
        }
    }

    public Bot getBot() {
        return this.bot;
    }

    public List<Cookie> getCookies() {
        return this.cookies;
    }

    public JSONObject getCurrentLocalStorage() {
        JSONObject jSONObject;
        synchronized (this.storageLock) {
            jSONObject = this.currentLocalStorage;
        }
        return jSONObject;
    }

    public JSONObject getCurrentSessionStorage() {
        JSONObject jSONObject;
        synchronized (this.storageLock) {
            jSONObject = this.currentSessionStorage;
        }
        return jSONObject;
    }

    public String getDialogButtonText() {
        return this.bot.getAllSettings().has("dialogButtonText") ? this.bot.getAllSettings().get("dialogButtonText").getAsString() : "Continue";
    }

    public String getDialogHint() {
        boolean has = this.bot.getAllSettings().has("dialogHint");
        Bot bot = this.bot;
        if (has) {
            return bot.getAllSettings().get("dialogHint").getAsString();
        }
        return "https://" + bot.getMerchantName().replace(" ", "").toLowerCase() + ".com/";
    }

    public String getEmailDialogMessage() {
        return this.bot.getAllSettings().has("completionDialogMessage") ? this.bot.getAllSettings().get("completionDialogMessage").getAsString() : "Complete Login";
    }

    public String getEmailDialogTitle() {
        boolean has = this.bot.getAllSettings().has("completionDialogTitle");
        Bot bot = this.bot;
        if (has) {
            return bot.getAllSettings().get("completionDialogTitle").getAsString();
        }
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("You should have received a link from "), bot.getMerchantName() != null ? this.bot.getMerchantName() : "", ". Paste it into the field below.");
    }

    public String getInvalidLinkDialogMessage() {
        return this.bot.getAllSettings().has("invalidLinkDialogMessage") ? this.bot.getAllSettings().get("invalidLinkDialogMessage").getAsString() : "The link you pasted in does not look like a confirmation link. Please try again or tap \"Cancel\" to update your card with another merchant.";
    }

    public String getInvalidLinkDialogTitle() {
        return this.bot.getAllSettings().has("invalidLinkDialogTitle") ? this.bot.getAllSettings().get("invalidLinkDialogTitle").getAsString() : "Error";
    }

    public MerchantViewListener getMerchantViewListener() {
        return this.merchantViewListener;
    }

    public void getStorageDetails() {
        try {
            evaluateJavascript(JsScripts.GET_LOCAL_SESSION_STORAGE, this.storageDetailsCallBack);
        } catch (Exception e) {
            Reporter.error(e, "Generic error evaluating js for getStorageDetails");
        }
    }

    public long getStorageValidationStartTime() {
        return this.storageValidationStartTime;
    }

    public KnotViewClient getViewClient() {
        return this.viewClient;
    }

    public MerchantWebViewDelegate getWebViewDelegate() {
        return this.webViewDelegate;
    }

    public ExtraInfo getmExtraInfo() {
        return this.mExtraInfo;
    }

    public void handleAction(WebView webView, String str, String str2) {
        str2.getClass();
        switch (str2) {
            case "removeElements":
                executeJavaScript(webView, JsScripts.REMOVE_ITEM, str, str2);
                break;
            case "disableLinks":
                executeJavaScript(webView, JsScripts.DISABLE_LINKS, str, str2);
                break;
            case "removeChromeElements":
                executeJavaScript(webView, JsScripts.REMOVE_CHROME_ITEM, str, str2);
                break;
        }
    }

    public void handleStorageUpdateAndSendWorkflowData() {
        if (this.workflowValidationHelper == null) {
            return;
        }
        try {
            this.workflowValidationHelper.processStreamData(getCurrentLocalStorage(), getCurrentSessionStorage(), "storage_stream");
        } catch (Exception e) {
            Reporter.error(e, "Error sending workflow validation data from storage");
        }
    }

    public void hideLoader() {
        try {
            boolean isUrlMatch = Helper.isUrlMatch(getUrl(), this.bot.hasHiddenPagesPattern() ? this.bot.getHiddenPagesPattern() : "", true);
            MerchantViewListener merchantViewListener = this.merchantViewListener;
            if (!isUrlMatch) {
                if (merchantViewListener.isLoaderVisible()) {
                    this.merchantViewListener.setLoaderVisibility(8);
                }
            } else {
                if (merchantViewListener.isLoaderVisible() || this.showErrorPage) {
                    return;
                }
                this.merchantViewListener.setLoaderVisibility(0);
            }
        } catch (Exception e) {
            Reporter.error(e, "Generic error executing hideLoader");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KnotView init(Activity activity, MerchantViewListener merchantViewListener) {
        try {
            this.activity = activity;
            this.workflowValidationHelper = new WorkflowValidationHelper(this);
            this.merchantViewListener = merchantViewListener;
            this.webViewDelegate = (MerchantWebViewDelegate) activity;
            this.cookies = new ArrayList();
            this.mExtraInfo = new ExtraInfo();
            listenToDOMChanges();
            this.jsHelper = WebAppJSFetcher.getInstance();
            return this;
        } catch (Exception e) {
            Reporter.error(e, "Generic error executing init");
            return this;
        }
    }

    public boolean isUserLoggedIn(String str) {
        return this.viewClient.isUserLoggedIn(str);
    }

    public void listenToDOMChanges() {
        try {
            String str = this.injectedAssets.containsKey("listenDomChanges.js") ? this.injectedAssets.get("listenDomChanges.js") : JsScripts.LISTEN_DOM_CHANGES;
            if (str == null || str.trim().isEmpty()) {
                return;
            }
            evaluateJavascript(str, null);
        } catch (Exception e) {
            Reporter.error(e, "Error executing listenToDOMChanges");
        }
    }

    public void loginDone() {
        try {
            this.viewClient.ssoCookieHelper.saveTempCookiesToSharedPreferencesAsync(this.activity);
            if (this.isLoggedIn) {
                return;
            }
            captureManualScreenshot(this);
            this.isLoggedIn = true;
            if (!this.isTimeOutStart.booleanValue()) {
                this.isTimeOutStart = Boolean.TRUE;
                startTimeOutFunction();
            }
            if (this.bot.isInterceptRedirectionIntent()) {
                getmExtraInfo().setIntentRedirection(getUrl());
                finalStep();
            }
            proceedAfterLogin();
        } catch (Exception e) {
            Reporter.error(e, "Error in loginDone");
        }
    }

    public void onStorageDetails(String str, String str2) {
        try {
            this.viewClient.onStorageDetails(str, str2);
        } catch (Exception e) {
            Reporter.error(e, "Generic error on viewClient while executing onStorageDetails");
        }
    }

    public void openLinkDialog(final boolean z) {
        Bitmap bitmap = this.logoBitmap;
        if (bitmap != null) {
            setupAndShowBottomSheet(bitmap, z);
        } else {
            preloadImage(this.bot.getLogoURL(), new ImageLoadCallback() { // from class: com.knotapi.knot.webview.KnotView.4
                @Override // com.knotapi.knot.interfaces.ImageLoadCallback
                public void onImageLoadFailed() {
                    KnotView.this.setupAndShowBottomSheet(null, z);
                }

                @Override // com.knotapi.knot.interfaces.ImageLoadCallback
                public void onImageLoaded(Bitmap bitmap2) {
                    KnotView knotView = KnotView.this;
                    knotView.logoBitmap = bitmap2;
                    knotView.setupAndShowBottomSheet(bitmap2, z);
                }
            });
        }
    }

    public void performAllBulkActions(WebView webView, boolean z) {
        Bot bot = this.bot;
        if (z) {
            if (bot.hasChromeRemoveElements()) {
                performBulkAction(webView, this.bot.getChromeDisableLinks(), "disableLinks");
            }
            if (this.bot.hasChromeDisableLinks()) {
                performBulkAction(webView, this.bot.getChromeRemoveElements(), "removeElements");
                return;
            }
            return;
        }
        if (bot.hasDisableLinks()) {
            performBulkAction(webView, this.bot.getDisableLinks(), "disableLinks");
        }
        if (this.bot.hasRemoveElements()) {
            performBulkAction(webView, this.bot.getRemoveElements(), "removeElements");
        }
    }

    public void performBulkAction(WebView webView, String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                handleAction(webView, jSONArray.getString(i), str2);
            }
        } catch (JSONException | Exception unused) {
        }
    }

    public void proceedAfterLogin() {
        String paymentUrlAndroid;
        try {
            if (!this.bot.isPaymentUrlSet() || this.isPaymentPageLoaded) {
                finalStep();
                return;
            }
            this.isPaymentPageLoaded = true;
            boolean hasPaymentsRedirectUrl = this.bot.hasPaymentsRedirectUrl();
            Bot bot = this.bot;
            if (hasPaymentsRedirectUrl) {
                paymentUrlAndroid = bot.getPaymentsRedirectUrl();
            } else {
                boolean hasPaymentUrlAndroid = bot.hasPaymentUrlAndroid();
                Bot bot2 = this.bot;
                paymentUrlAndroid = hasPaymentUrlAndroid ? bot2.getPaymentUrlAndroid() : bot2.getPaymentUrl();
            }
            loadUrl(paymentUrlAndroid);
        } catch (Exception unused) {
        }
    }

    public void removeFBWarning() {
        try {
            evaluateJavascript(JsScripts.REMOVE_FB_WARNING, null);
        } catch (Exception unused) {
        }
    }

    public void sendCustomEvents(CustomEvent customEvent) {
        this.webViewDelegate.sendBotCustomEvent(customEvent);
    }

    public KnotView setBot(Bot bot) {
        try {
            this.bot = bot;
            this.globalSettings = bot.fetchGlobalSettings();
            if (this.jsHelper == null) {
                this.jsHelper = WebAppJSFetcher.getInstance();
            }
            ScreenshotHelper.fetchScreenshotJS(this.globalSettings, this.jsHelper);
            return this;
        } catch (Exception e) {
            Reporter.error(e, "Error creating context");
            return this;
        }
    }

    public void setCookies(List<Cookie> list) {
        this.cookies = list;
    }

    public KnotView setDefaultSettings() {
        try {
            setScrollBarStyle(0);
            WebView.setWebContentsDebuggingEnabled(false);
            WebSettings settings = getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setTextZoom(100);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setSupportMultipleWindows(true);
            settings.setSupportZoom(true);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            if (this.bot.isLoadNoCacheMode()) {
                settings.setCacheMode(2);
            } else {
                settings.setCacheMode(-1);
            }
            settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            settings.setUseWideViewPort(true);
            settings.setSaveFormData(true);
            settings.setEnableSmoothTransition(true);
            settings.setSavePassword(true);
            CookieManager.getInstance().setAcceptCookie(true);
            CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
            this.viewClient = KnotViewClient.newInstance(this);
            addJavascriptInterface(new JSInterfaceObject(this, this.webViewDelegate), "JSInterface");
            setWebViewClient(this.viewClient);
            getSettings().setUserAgentString(this.viewClient.getUserAgent());
            clear();
            return this;
        } catch (Exception e) {
            Reporter.error(e, "Error executing setDefaultSettings");
            return this;
        }
    }

    public KnotView setInjectedAssets(Map<String, String> map) {
        if (map != null) {
            this.injectedAssets.clear();
            this.injectedAssets.putAll(map);
        }
        return this;
    }

    public void setStorageValidationStartTime(long j) {
        this.storageValidationStartTime = j;
    }

    public void showLoader() {
        try {
            boolean isUrlMatch = Helper.isUrlMatch(getUrl(), this.bot.hasVisiblePagesPattern() ? this.bot.getVisiblePagesPattern() : "", true);
            MerchantViewListener merchantViewListener = this.merchantViewListener;
            if (isUrlMatch) {
                if (merchantViewListener.isLoaderVisible()) {
                    this.merchantViewListener.setLoaderVisibility(8);
                }
            } else {
                if (merchantViewListener.isLoaderVisible() || this.showErrorPage) {
                    return;
                }
                this.merchantViewListener.setLoaderVisibility(0);
            }
        } catch (Exception e) {
            Reporter.error(e, "Generic error executing showLoader");
        }
    }

    public KnotView start() {
        try {
            boolean isLoginTypeAndroid = this.bot.isLoginTypeAndroid();
            Bot bot = this.bot;
            String loginUrlAndroid = isLoginTypeAndroid ? bot.getLoginUrlAndroid() : bot.getLoginUrl();
            BreadcrumbHelper.trackForMerchant(this.bot.getMerchantName(), this.bot.getMerchantId(), "Loading login URL: " + loginUrlAndroid, BreadcrumbHelper.Category.NAVIGATION);
            boolean isLoginTypeAndroid2 = this.bot.isLoginTypeAndroid();
            Bot bot2 = this.bot;
            if (isLoginTypeAndroid2) {
                loadUrl(bot2.getLoginUrlAndroid());
            } else {
                loadUrl(bot2.getLoginUrl());
            }
            if (this.bot.hasCustomLoginScript()) {
                evaluateJavascript(this.bot.getCustomLoginScript(), null);
            }
            if (this.bot.hasLoginScript()) {
                startBot();
                this.merchantViewListener.hideBottomFragment();
                startTimeOutFunction();
            }
            return this;
        } catch (Exception e) {
            Reporter.error(e, "Generic error executing start");
            return this;
        }
    }

    public void startBot() {
        try {
            CustomEvent customEvent = new CustomEvent(this.bot);
            customEvent.setShouldStartBot(true);
            this.webViewDelegate.sendBotCustomEvent(customEvent);
        } catch (Exception e) {
            Reporter.error(e, "Generic error executing startBot");
        }
    }

    public void trackNativeMerchantEvents() {
        try {
            evaluateJavascript(JsScripts.EVENT_TRACKER_SCRIPT, null);
        } catch (Exception e) {
            Reporter.error(e, "Generic error evaluating js for trackNativeMerchantEvents");
        }
    }

    public void updateStorageData(JSONObject jSONObject, JSONObject jSONObject2) {
        synchronized (this.storageLock) {
            this.currentLocalStorage = jSONObject;
            this.currentSessionStorage = jSONObject2;
        }
    }

    public void updateStorageDelta(String str, String str2, String str3, String str4) {
        synchronized (this.storageLock) {
            try {
                try {
                    if ("localStorage".equals(str)) {
                        if (this.currentLocalStorage == null) {
                            this.currentLocalStorage = new JSONObject();
                        }
                        if ("set".equals(str3)) {
                            this.currentLocalStorage.put(str2, str4);
                        } else if ("remove".equals(str3)) {
                            this.currentLocalStorage.remove(str2);
                        }
                    } else if ("sessionStorage".equals(str)) {
                        if (this.currentSessionStorage == null) {
                            this.currentSessionStorage = new JSONObject();
                        }
                        if ("set".equals(str3)) {
                            this.currentSessionStorage.put(str2, str4);
                        } else if ("remove".equals(str3)) {
                            this.currentSessionStorage.remove(str2);
                        }
                    }
                } catch (Exception e) {
                    Reporter.error(e, "Error updating storage delta");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public KnotView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isLoggedIn = false;
        this.showErrorPage = false;
        this.isPaymentPageLoaded = false;
        this.isTimeOutStart = Boolean.FALSE;
        this.loginType = Constants.NORMAL_LOGIN;
        this.fromDialog = false;
        this.globalSettings = null;
        this.storageValidationStartTime = 0L;
        this.injectedAssets = new HashMap();
        this.isUserAuthed = false;
        this.currentLocalStorage = null;
        this.currentSessionStorage = null;
        this.storageLock = new Object();
        this.storageDetailsCallBack = new ValueCallback<String>() { // from class: com.knotapi.knot.webview.KnotView.2
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                String str2;
                try {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        str2 = jSONObject.getString("l");
                        try {
                            KnotView.this.onStorageDetails(str2, jSONObject.getString("s"));
                        } catch (JSONException unused) {
                            String str3 = KnotView.TAG;
                            KnotView.this.onStorageDetails(str2, null);
                        }
                    } catch (Throwable th) {
                        th = th;
                        KnotView.this.onStorageDetails(str, null);
                        throw th;
                    }
                } catch (JSONException unused2) {
                    str2 = null;
                } catch (Throwable th2) {
                    th = th2;
                    str = null;
                    KnotView.this.onStorageDetails(str, null);
                    throw th;
                }
            }
        };
        this.isEmailLinkError = false;
        this.logoBitmap = null;
        try {
            this.context = context;
        } catch (Exception e) {
            Reporter.error(e, "Generic error creating context with attrs");
        }
    }
}
