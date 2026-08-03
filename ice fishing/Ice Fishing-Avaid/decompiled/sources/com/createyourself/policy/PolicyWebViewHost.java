package com.createyourself.policy;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: PolicyGate.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 $2\u00020\u0001:\u0001$B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\fJ\u0006\u0010\u0019\u001a\u00020\u0016J\u0006\u0010\u001a\u001a\u00020\u0016J\u0006\u0010\u001b\u001a\u00020\u0016J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0003J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\nH\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010#\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\r\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/createyourself/policy/PolicyWebViewHost;", "", "bridge", "Lcom/createyourself/policy/PolicyJsBridge;", "config", "Lcom/createyourself/policy/PolicyWebViewConfig;", "<init>", "(Lcom/createyourself/policy/PolicyJsBridge;Lcom/createyourself/policy/PolicyWebViewConfig;)V", "viewStack", "Ljava/util/Stack;", "Landroid/webkit/WebView;", "lastHtml", "", "currentView", "getCurrentView", "()Landroid/webkit/WebView;", "container", "Landroid/widget/FrameLayout;", "createContainer", "context", "Landroid/content/Context;", "loadPolicy", "", "html", "url", "pause", "resume", "destroy", "createConfiguredView", "setupCookies", "webView", "createViewClient", "Landroid/webkit/WebViewClient;", "createChromeClient", "Landroid/webkit/WebChromeClient;", "addToStack", "Companion", "policy_release"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
final class PolicyWebViewHost {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String JS_BRIDGE_NAME = "CreateYourselfPolicy";

    @Deprecated
    public static final String POLICY_BASE_URL = "https://emamaldpulse.pro/policy";
    private final PolicyJsBridge bridge;
    private final PolicyWebViewConfig config;
    private FrameLayout container;
    private String lastHtml;
    private final Stack<WebView> viewStack;

    public PolicyWebViewHost(PolicyJsBridge bridge, PolicyWebViewConfig config) {
        Intrinsics.checkNotNullParameter(bridge, "bridge");
        Intrinsics.checkNotNullParameter(config, "config");
        this.bridge = bridge;
        this.config = config;
        this.viewStack = new Stack<>();
    }

    public final WebView getCurrentView() {
        return (WebView) CollectionsKt.lastOrNull((List) this.viewStack);
    }

    public final FrameLayout createContainer(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(-16777216);
        final FrameLayout frameLayout2 = frameLayout;
        ViewCompat.setOnApplyWindowInsetsListener(frameLayout2, new OnApplyWindowInsetsListener() { // from class: com.createyourself.policy.PolicyWebViewHost$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat createContainer$lambda$1;
                createContainer$lambda$1 = PolicyWebViewHost.createContainer$lambda$1(view, windowInsetsCompat);
                return createContainer$lambda$1;
            }
        });
        if (frameLayout2.isAttachedToWindow()) {
            ViewCompat.requestApplyInsets(frameLayout2);
        } else {
            frameLayout2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.createyourself.policy.PolicyWebViewHost$createContainer$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    frameLayout2.removeOnAttachStateChangeListener(this);
                    ViewCompat.requestApplyInsets(view);
                }
            });
        }
        this.container = frameLayout;
        WebView createConfiguredView = createConfiguredView(context);
        addToStack(createConfiguredView);
        setupCookies(createConfiguredView);
        frameLayout.addView(createConfiguredView);
        return frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat createContainer$lambda$1(View view, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        view.setPadding(0, insets2.top, 0, insets2.bottom);
        return insets;
    }

    public final void loadPolicy(String html, String url) {
        Intrinsics.checkNotNullParameter(html, "html");
        this.lastHtml = html;
        WebView currentView = getCurrentView();
        if (currentView != null) {
            currentView.setTag(url == null ? html : url);
            String str = url;
            if (str == null || StringsKt.isBlank(str)) {
                currentView.loadDataWithBaseURL(POLICY_BASE_URL, html, "text/html", "UTF-8", null);
            } else {
                currentView.loadUrl(url);
            }
        }
    }

    public final void pause() {
        WebView currentView = getCurrentView();
        if (currentView != null) {
            currentView.onPause();
        }
    }

    public final void resume() {
        WebView currentView = getCurrentView();
        if (currentView != null) {
            currentView.onResume();
        }
    }

    public final void destroy() {
        while (!this.viewStack.isEmpty()) {
            WebView pop = this.viewStack.pop();
            pop.removeJavascriptInterface(JS_BRIDGE_NAME);
            pop.stopLoading();
            pop.setWebChromeClient(new WebChromeClient());
            pop.setWebViewClient(new WebViewClient());
            pop.destroy();
        }
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.container = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WebView createConfiguredView(Context context) {
        WebView webView = new WebView(context);
        webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        webView.setOverScrollMode(2);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setLayerType(2, null);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(this.config.getDatabaseEnabled());
        settings.setMixedContentMode(this.config.getMixedContentMode());
        settings.setAllowFileAccess(this.config.getAllowFileAccess());
        settings.setAllowContentAccess(this.config.getAllowContentAccess());
        settings.setSupportMultipleWindows(true);
        settings.setCacheMode(-1);
        settings.setBuiltInZoomControls(false);
        settings.setDisplayZoomControls(false);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setTextZoom(100);
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, this.config.getAcceptThirdPartyCookies());
        webView.addJavascriptInterface(this.bridge, JS_BRIDGE_NAME);
        webView.setWebViewClient(createViewClient());
        webView.setWebChromeClient(createChromeClient(context));
        return webView;
    }

    private final void setupCookies(WebView webView) {
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        cookieManager.setAcceptThirdPartyCookies(webView, this.config.getAcceptThirdPartyCookies());
        cookieManager.flush();
    }

    private final WebViewClient createViewClient() {
        return new WebViewClient() { // from class: com.createyourself.policy.PolicyWebViewHost$createViewClient$1
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                Uri url;
                String uri;
                if (request == null || (url = request.getUrl()) == null || (uri = url.toString()) == null || StringsKt.startsWith$default(uri, PolicyWebViewHost.POLICY_BASE_URL, false, 2, (Object) null) || StringsKt.startsWith$default(uri, "http://", false, 2, (Object) null) || StringsKt.startsWith$default(uri, "https://", false, 2, (Object) null)) {
                    return false;
                }
                if (view == null) {
                    return true;
                }
                view.loadUrl(uri);
                return true;
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                CookieManager.getInstance().flush();
            }
        };
    }

    private final WebChromeClient createChromeClient(final Context context) {
        return new WebChromeClient() { // from class: com.createyourself.policy.PolicyWebViewHost$createChromeClient$1
            @Override // android.webkit.WebChromeClient
            public boolean onCreateWindow(WebView view, boolean isDialog, boolean isUserGesture, Message resultMsg) {
                WebView createConfiguredView;
                FrameLayout frameLayout;
                createConfiguredView = PolicyWebViewHost.this.createConfiguredView(context);
                PolicyWebViewHost.this.addToStack(createConfiguredView);
                frameLayout = PolicyWebViewHost.this.container;
                if (frameLayout != null) {
                    frameLayout.addView(createConfiguredView);
                }
                Object obj = resultMsg != null ? resultMsg.obj : null;
                WebView.WebViewTransport webViewTransport = obj instanceof WebView.WebViewTransport ? (WebView.WebViewTransport) obj : null;
                if (webViewTransport == null) {
                    return false;
                }
                webViewTransport.setWebView(createConfiguredView);
                resultMsg.sendToTarget();
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public void onCloseWindow(WebView window) {
                Stack stack;
                FrameLayout frameLayout;
                if (window == null) {
                    return;
                }
                stack = PolicyWebViewHost.this.viewStack;
                if (stack.removeElement(window)) {
                    frameLayout = PolicyWebViewHost.this.container;
                    if (frameLayout != null) {
                        frameLayout.removeView(window);
                    }
                    window.destroy();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addToStack(WebView webView) {
        this.viewStack.push(webView);
    }

    /* compiled from: PolicyGate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/createyourself/policy/PolicyWebViewHost$Companion;", "", "<init>", "()V", "JS_BRIDGE_NAME", "", "POLICY_BASE_URL", "policy_release"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
