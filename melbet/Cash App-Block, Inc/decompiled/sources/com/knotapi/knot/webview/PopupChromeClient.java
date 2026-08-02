package com.knotapi.knot.webview;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.fragment.app.FragmentActivity;
import com.knotapi.knot.R;
import com.knotapi.knot.interfaces.LoaderHandler;
import com.knotapi.knot.interfaces.MerchantWebViewDelegate;
import com.knotapi.knot.models.Bot;
import com.knotapi.knot.models.DialogOptions;
import com.knotapi.knot.services.Reporter;
import com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog;
import com.knotapi.knot.utilities.Constants;
import com.knotapi.knot.utilities.Helper;
import com.knotapi.knot.utilities.JsScripts;
import com.knotapi.knot.utilities.RunCustomScript;
import com.knotapi.knot.utilities.ScreenUtils;
import com.knotapi.knot.utilities.ScreenshotHelper;
import com.knotapi.knot.utilities.SsoCookieHelper;
import com.knotapi.knot.utilities.SsoLoginHelper;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import com.plaid.internal.Q0$$ExternalSyntheticLambda0;
import java.io.ByteArrayInputStream;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class PopupChromeClient extends WebChromeClient implements LoaderHandler {
    private static PopupChromeClient INSTANCE = null;
    private static final String TAG = "Knot:PopupChromeClient";
    public FragmentActivity activity;
    public ImageView backButton;
    public KnotBottomSheetDialog bottomSheet;
    public AlertDialog builder;
    public ImageView closeButton;
    public KnotView knotView;
    RelativeLayout loaderContainer;
    public RelativeLayout loader_container;
    public Bot mBot;
    public MerchantWebViewDelegate webViewDelegate;
    public WebView webViewPopUp;
    SsoCookieHelper ssoCookieHelper = new SsoCookieHelper();
    private boolean isLoaderVisible = false;

    /* renamed from: com.knotapi.knot.webview.PopupChromeClient$2, reason: invalid class name */
    public class AnonymousClass2 {
        public AnonymousClass2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCardSwitchNativeError$0(String str) {
            String unused = PopupChromeClient.TAG;
            try {
                JSONObject jSONObject = new JSONObject(str);
                KnotViewClient viewClient = PopupChromeClient.this.knotView.getViewClient();
                viewClient.showErrorPage(viewClient.getErrorViewWithMessage(jSONObject));
                PopupChromeClient.this.webViewPopUp.destroy();
                PopupChromeClient.this.builder.dismiss();
            } catch (Exception e) {
                Reporter.error(e, "onCardSwitchNativeError");
            }
        }

        @JavascriptInterface
        public void domChanged(String str) {
            if (str == null || str.isEmpty()) {
                str = "{}";
            }
            PopupChromeClient popupChromeClient = PopupChromeClient.this;
            ScreenshotHelper.startScreenshotFlow(popupChromeClient.webViewPopUp, popupChromeClient.knotView, str);
        }

        @JavascriptInterface
        public void onCardSwitchNativeError(String str) {
            new Handler(Looper.getMainLooper()).post(new KnotView$$ExternalSyntheticLambda0(1, this, str));
        }
    }

    public static PopupChromeClient getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PopupChromeClient();
        }
        return INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateWindow$0(final String str, View view) {
        this.bottomSheet = new KnotBottomSheetDialog(this.webViewDelegate);
        this.bottomSheet.setDialogOptions(new DialogOptions(Constants.EXIT_CONFIRMATION_TITLE, "", Constants.EXIT_NO_BUTTON, Constants.EXIT_YES_BUTTON, new View.OnClickListener() { // from class: com.knotapi.knot.webview.PopupChromeClient.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                PopupChromeClient.this.bottomSheet.closeSheet();
            }
        }, new View.OnClickListener() { // from class: com.knotapi.knot.webview.PopupChromeClient.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                PopupChromeClient popupChromeClient = PopupChromeClient.this;
                if (popupChromeClient.webViewDelegate != null) {
                    popupChromeClient.bottomSheet.closeSheet();
                    PopupChromeClient.this.webViewPopUp.destroy();
                    PopupChromeClient popupChromeClient2 = PopupChromeClient.this;
                    popupChromeClient2.webViewDelegate.sendNativeLogEvent(Integer.valueOf(popupChromeClient2.mBot.getBotId()), Constants.META_FLOW, "Pressed exit button on SSO page", str);
                    PopupChromeClient popupChromeClient3 = PopupChromeClient.this;
                    popupChromeClient3.webViewDelegate.userCloseMerchantView(popupChromeClient3.mBot.getBotId(), PopupChromeClient.this.mBot.getMerchantId());
                    PopupChromeClient.this.builder.dismiss();
                }
            }
        }, new View.OnClickListener() { // from class: com.knotapi.knot.webview.PopupChromeClient.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                PopupChromeClient popupChromeClient = PopupChromeClient.this;
                popupChromeClient.webViewDelegate.sendNativeLogEvent(Integer.valueOf(popupChromeClient.mBot.getBotId()), Constants.META_BUTTON_CLICKED, Constants.EXIT_OVERLAY_CLOSE_BUTTON, str);
                PopupChromeClient.this.bottomSheet.closeSheet();
            }
        }, ""));
        this.bottomSheet.show(this.activity.getSupportFragmentManager(), this.bottomSheet.getTag());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreateWindow$1(View view) {
        handleBackPress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static WindowInsetsCompat lambda$onCreateWindow$2(View view, WindowInsetsCompat windowInsetsCompat) {
        view.setPadding(view.getPaddingLeft(), windowInsetsCompat.mImpl.getInsets(519).top, view.getPaddingRight(), view.getPaddingBottom());
        return WindowInsetsCompat.CONSUMED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void performCustomActions() {
        this.knotView.performAllBulkActions(this.webViewPopUp, true);
        this.knotView.defaultAction(this.webViewPopUp);
    }

    public void handleBackPress() {
        Bot bot;
        if (this.knotView != null && (bot = this.mBot) != null && bot.getMerchantId() == 2325) {
            this.webViewDelegate.userCloseMerchantView(this.mBot.getBotId(), this.mBot.getMerchantId());
        }
        this.webViewPopUp.destroy();
        this.builder.dismiss();
        SsoCookieHelper ssoCookieHelper = this.ssoCookieHelper;
        ssoCookieHelper.ssoSessionActive = false;
        ssoCookieHelper.dialogShown = false;
        ssoCookieHelper.proceedWithoutCookies = false;
    }

    public void init(FragmentActivity fragmentActivity, KnotView knotView, MerchantWebViewDelegate merchantWebViewDelegate, Bot bot) {
        this.activity = fragmentActivity;
        this.knotView = knotView;
        this.webViewDelegate = merchantWebViewDelegate;
        this.mBot = bot;
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView webView) {
        WebView webView2 = this.webViewPopUp;
        String url = webView2 != null ? webView2.getUrl() : "";
        try {
            this.webViewPopUp.destroy();
        } catch (Exception e) {
            this.webViewDelegate.sendNativeLogEvent(Integer.valueOf(this.mBot.getBotId()), Constants.META_CONSOLE_ERROR, Fragment$5$$ExternalSyntheticOutline0.m(e, new StringBuilder("Destroyed with Error ")), url);
        }
        try {
            this.builder.dismiss();
        } catch (Exception e2) {
            this.webViewDelegate.sendNativeLogEvent(Integer.valueOf(this.mBot.getBotId()), Constants.META_CONSOLE_ERROR, Fragment$5$$ExternalSyntheticOutline0.m(e2, new StringBuilder("Dismissed with Error: ")), url);
        }
        KnotView knotView = this.knotView;
        if (knotView != null) {
            knotView.viewClient.onLoadResource(knotView, knotView.getUrl());
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        View inflate = this.activity.getLayoutInflater().inflate(R.layout.dialog_sso_web_view, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.loader_container);
        this.loaderContainer = relativeLayout;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
        layoutParams.height = ScreenUtils.getScreenHeight(this.activity);
        this.loaderContainer.setLayoutParams(layoutParams);
        this.webViewPopUp = new WebView(this.activity);
        int merchantId = this.mBot.getMerchantId();
        WebView webView2 = this.webViewPopUp;
        if (merchantId == 15) {
            webView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            webView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        }
        this.webViewPopUp.clearCache(true);
        this.webViewPopUp.clearHistory();
        this.webViewPopUp.setVerticalScrollBarEnabled(false);
        this.webViewPopUp.setHorizontalScrollBarEnabled(false);
        this.webViewPopUp.getSettings().setJavaScriptEnabled(true);
        this.webViewPopUp.getSettings().setDomStorageEnabled(true);
        this.webViewPopUp.getSettings().setSupportZoom(true);
        this.webViewPopUp.getSettings().setSaveFormData(true);
        this.webViewPopUp.getSettings().setTextZoom(100);
        this.webViewPopUp.getSettings().setEnableSmoothTransition(true);
        this.webViewPopUp.setWebChromeClient(getInstance());
        WebSettings settings = this.webViewPopUp.getSettings();
        boolean isEmpty = this.mBot.getAndroidFbSSO().isEmpty();
        Bot bot = this.mBot;
        settings.setUserAgentString(isEmpty ? bot.getAndroidSSOGlobal() : bot.getAndroidFbSSO());
        this.webViewPopUp.getSettings().setSavePassword(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.webViewPopUp, true);
        this.webViewPopUp.setVisibility(8);
        this.webViewPopUp.addJavascriptInterface(new AnonymousClass2(), "JSInterface");
        this.webViewPopUp.setWebViewClient(new WebViewClient() { // from class: com.knotapi.knot.webview.PopupChromeClient.3
            @Override // android.webkit.WebViewClient
            public void onLoadResource(WebView webView3, String str) {
                super.onLoadResource(webView3, str);
                PopupChromeClient.this.knotView.addCookies(str);
                if (PopupChromeClient.this.mBot.getMerchantId() == 80) {
                    WebSettings settings2 = PopupChromeClient.this.webViewPopUp.getSettings();
                    PopupChromeClient popupChromeClient = PopupChromeClient.this;
                    settings2.setUserAgentString(popupChromeClient.mBot.getUserAgent(popupChromeClient.knotView));
                }
                PopupChromeClient.this.performCustomActions();
                PopupChromeClient popupChromeClient2 = PopupChromeClient.this;
                popupChromeClient2.ssoCookieHelper.fetchEmailFromWebView(webView3, popupChromeClient2.knotView, popupChromeClient2.activity);
                PopupChromeClient popupChromeClient3 = PopupChromeClient.this;
                RunCustomScript.runScriptInPopUpView(popupChromeClient3.mBot, popupChromeClient3.webViewPopUp, popupChromeClient3.activity, true);
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView3, String str) {
                super.onPageFinished(webView3, str);
                PopupChromeClient.this.knotView.addCookies(str);
                PopupChromeClient popupChromeClient = PopupChromeClient.this;
                popupChromeClient.ssoCookieHelper.saveCookiesForDomain(popupChromeClient.activity, str);
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView webView3, String str, Bitmap bitmap) {
                try {
                    PopupChromeClient.this.knotView.addCookies(str);
                    PopupChromeClient.this.webViewPopUp.evaluateJavascript(JsScripts.LISTEN_DOM_CHANGES, null);
                    PopupChromeClient popupChromeClient = PopupChromeClient.this;
                    SsoLoginHelper.processSSO(str, popupChromeClient.mBot, popupChromeClient.knotView, popupChromeClient.ssoCookieHelper, popupChromeClient, true);
                } catch (Exception unused) {
                    String unused2 = PopupChromeClient.TAG;
                }
            }

            @Override // android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView3, WebResourceRequest webResourceRequest) {
                if (Helper.matchesAnyCondition(PopupChromeClient.this.mBot.getBlockedUrls(), webResourceRequest.getUrl().toString())) {
                    return new WebResourceResponse("text/plain", "UTF-8", null);
                }
                PopupChromeClient popupChromeClient = PopupChromeClient.this;
                if (!popupChromeClient.ssoCookieHelper.checkShouldIntercept(webView3, webResourceRequest, popupChromeClient.activity, popupChromeClient.knotView)) {
                    return super.shouldInterceptRequest(webView3, webResourceRequest);
                }
                SsoCookieHelper ssoCookieHelper = PopupChromeClient.this.ssoCookieHelper;
                return new WebResourceResponse(ssoCookieHelper.mimeType, ssoCookieHelper.f1026encoding, new ByteArrayInputStream(new byte[0]));
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView3, WebResourceRequest webResourceRequest) {
                PopupChromeClient popupChromeClient = PopupChromeClient.this;
                return popupChromeClient.knotView.viewClient.googlePasskeyLoader(webResourceRequest, true, popupChromeClient);
            }
        });
        AlertDialog create = new AlertDialog.Builder(this.activity, android.R.style.Theme.Material.Light.NoActionBar).create();
        this.builder = create;
        create.setTitle("");
        this.builder.setView(this.webViewPopUp);
        this.builder.setCancelable(false);
        this.builder.setCanceledOnTouchOutside(false);
        this.builder.setCustomTitle(inflate);
        this.builder.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.knotapi.knot.webview.PopupChromeClient.4
            @Override // android.content.DialogInterface.OnKeyListener
            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                Bot bot2;
                if (i != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                WebView webView3 = PopupChromeClient.this.webViewPopUp;
                if (webView3 == null || !webView3.canGoBack() || (bot2 = PopupChromeClient.this.mBot) == null || bot2.getMerchantId() == 2325) {
                    PopupChromeClient.this.handleBackPress();
                } else {
                    PopupChromeClient.this.webViewPopUp.goBack();
                }
                return true;
            }
        });
        this.closeButton = (ImageView) inflate.findViewById(R.id.close_icon);
        WebView webView3 = this.webViewPopUp;
        final String url = webView3 != null ? webView3.getUrl() : "";
        this.closeButton.setOnClickListener(new View.OnClickListener() { // from class: com.knotapi.knot.webview.PopupChromeClient$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PopupChromeClient.this.lambda$onCreateWindow$0(url, view);
            }
        });
        ImageView imageView = (ImageView) inflate.findViewById(R.id.back_icon);
        this.backButton = imageView;
        int i = 13;
        imageView.setOnClickListener(new Q0$$ExternalSyntheticLambda0(this, i));
        this.loader_container = (RelativeLayout) inflate.findViewById(R.id.loader_container);
        this.builder.show();
        this.builder.getWindow().clearFlags(131080);
        try {
            JWK$$ExternalSyntheticBUOutline0 jWK$$ExternalSyntheticBUOutline0 = new JWK$$ExternalSyntheticBUOutline0(i);
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(inflate, jWK$$ExternalSyntheticBUOutline0);
            inflate.requestApplyInsets();
            if (this.builder.getWindow() != null) {
                Helper.configureSystemBars(this.activity, this.builder.getWindow(), inflate);
            }
        } catch (Exception e) {
            Reporter.error(e, "requestApplyInsets");
        }
        CookieManager.getInstance().setAcceptCookie(true);
        ((WebView.WebViewTransport) message.obj).setWebView(this.webViewPopUp);
        message.sendToTarget();
        return true;
    }

    public void setLoaderVisibility(int i) {
        WebView webView;
        WebView webView2;
        KnotViewClient knotViewClient = this.knotView.viewClient;
        if (knotViewClient.isLoaderShownForRedirection) {
            return;
        }
        if (knotViewClient.delayLoader && i == 8) {
            this.loader_container.postDelayed(new Runnable() { // from class: com.knotapi.knot.webview.PopupChromeClient.8
                @Override // java.lang.Runnable
                public void run() {
                    PopupChromeClient.this.loader_container.setVisibility(8);
                    PopupChromeClient.this.isLoaderVisible = false;
                    WebView webView3 = PopupChromeClient.this.webViewPopUp;
                    if (webView3 != null) {
                        webView3.setVisibility(0);
                    }
                }
            }, 1000L);
            return;
        }
        this.loader_container.setVisibility(i);
        boolean z = i == 0;
        this.isLoaderVisible = z;
        if (z && (webView2 = this.webViewPopUp) != null) {
            webView2.setVisibility(8);
        } else {
            if (z || (webView = this.webViewPopUp) == null) {
                return;
            }
            webView.setVisibility(0);
        }
    }

    public void setUserAgentAndVisibility(String str, String str2) {
        this.webViewPopUp.getSettings().setUserAgentString(str);
        updateWebViewPopUpVisibility(str2);
    }

    @Override // com.knotapi.knot.interfaces.LoaderHandler
    public void showLoader() {
        setLoaderVisibility(0);
    }

    public void updateWebViewPopUpVisibility(final String str) {
        new Handler().postDelayed(new Runnable() { // from class: com.knotapi.knot.webview.PopupChromeClient.1
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
            
                if (r0.equals("spotify") == false) goto L7;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void run() {
                PopupChromeClient.this.setLoaderVisibility(8);
                char c = 0;
                if (!PopupChromeClient.this.isLoaderVisible) {
                    PopupChromeClient.this.webViewPopUp.setVisibility(0);
                }
                String str2 = str;
                str2.getClass();
                switch (str2.hashCode()) {
                    case -1998723398:
                        break;
                    case -1240244679:
                        if (str2.equals("google")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 497130182:
                        if (str2.equals("facebook")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        String str3 = String.valueOf(ScreenUtils.getScreenHeight(PopupChromeClient.this.activity)) + "px";
                        PopupChromeClient.this.webViewPopUp.evaluateJavascript("(async () => {async function updateBodyHeight(height) {   var interval = setInterval(() => {       var body = document.getElementsByTagName('body')[0];       var html = document.getElementsByTagName('html')[0];       var newHeight = height || window.innerHeight + 'px';       body.style.height = newHeight;       html.style.height = newHeight;   }, 50);}var height = '" + str3 + "';await Promise.all([   updateBodyHeight(height === '' ? null : height),]);})()", null);
                        break;
                    case 1:
                        PopupChromeClient.this.webViewPopUp.evaluateJavascript("(async () => {async function updateBodyHeight(height) {   var interval = setInterval(() => {       var body = document.getElementsByTagName('body')[0];       var html = document.getElementsByTagName('html')[0];       var newHeight = height || window.innerHeight + 'px';       body.style.height = newHeight;       html.style.height = newHeight;   }, 50);}var height = '';await Promise.all([   updateBodyHeight(height === '' ? null : height),]);})()", null);
                        break;
                    case 2:
                        PopupChromeClient.this.webViewPopUp.evaluateJavascript(JsScripts.REMOVE_ITEM, null);
                        PopupChromeClient.this.webViewPopUp.evaluateJavascript(JsScripts.REMOVE_FB_WARNING, null);
                        break;
                    default:
                        PopupChromeClient.this.webViewPopUp.evaluateJavascript("(async () => {async function updateBodyHeight(height) {   var interval = setInterval(() => {       var body = document.getElementsByTagName('body')[0];       var html = document.getElementsByTagName('html')[0];       var newHeight = height || window.innerHeight + 'px';       body.style.height = newHeight;       html.style.height = newHeight;   }, 50);}var height = 'auto';await Promise.all([   updateBodyHeight(height === '' ? null : height),]);})()", null);
                        break;
                }
            }
        }, 2000L);
    }
}
