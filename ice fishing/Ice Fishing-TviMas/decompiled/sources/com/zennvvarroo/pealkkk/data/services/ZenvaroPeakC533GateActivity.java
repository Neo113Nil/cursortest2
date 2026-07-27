package com.zennvvarroo.pealkkk.data.services;

import android.content.ClipData;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.zennvvarroo.pealkkk.data.services.ZenvaroPeakC533GateActivity;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: ZenvaroPeakC533GateActivity.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0007\u0018\u0000 92\u00020\u0001:\u000289B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0006H\u0003J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u0014H\u0002J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u0006H\u0002J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u0006H\u0002J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u0006H\u0002J\u0010\u0010#\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u0006H\u0002J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u0006H\u0002J\u0010\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u001cH\u0002J\u0006\u0010'\u001a\u00020\u0014J\u0010\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u001cH\u0002J\b\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020\u0014H\u0017J\u0012\u0010-\u001a\u00020\u00142\b\u0010.\u001a\u0004\u0018\u00010/H\u0015J\b\u00100\u001a\u00020\u0014H\u0014J\u0010\u00101\u001a\u00020\u00142\u0006\u00102\u001a\u00020\u0006H\u0002J\u000e\u00103\u001a\u00020\u00142\u0006\u00104\u001a\u000205J\u0010\u00106\u001a\u00020\u00142\u0006\u00107\u001a\u00020\u001cH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/zennvvarroo/pealkkk/data/services/ZenvaroPeakC533GateActivity;", "Landroidx/activity/ComponentActivity;", "()V", "appOverlay", "Landroid/widget/FrameLayout;", "appOverlayWebView", "Landroid/webkit/WebView;", "fileChooserLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "filePathCallback", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "mainHandler", "Landroid/os/Handler;", "mainWeb", "root", "safeContainer", "analyzeScrollBehavior", "", "applySafeAreaInsets", "closeWindowOverlay", "createConfiguredWebView", "dp", "", SDKConstants.PARAM_VALUE, "extractWindowOverlayUrl", "", "source", "handleWebBack", "injectAllScripts", "webView", "injectHelperScript", "injectNativePopupPatch", "injectNoAutoplayScript", "injectViewportScript", "loadContent", "urlString", "logWebOffset", "makeAbsoluteUrl", "raw", "makeCloseButton", "Landroid/widget/TextView;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "presentPopupInOverlay", "popup", "reloadAfterDelay", "seconds", "", "showWindowOverlay", "url", "AndroidBridge", "Companion", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ZenvaroPeakC533GateActivity extends ComponentActivity {
    public static final String EXTRA_URL = "GoldenSproutUpdateManagerInfo";
    private static final String TAG = "GoldenSproutWeb";
    private FrameLayout appOverlay;
    private WebView appOverlayWebView;
    private ValueCallback<Uri[]> filePathCallback;
    private WebView mainWeb;
    private FrameLayout root;
    private FrameLayout safeContainer;
    public static final int $stable = 8;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final ActivityResultLauncher<Intent> fileChooserLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.zennvvarroo.pealkkk.data.services.ZenvaroPeakC533GateActivity$$ExternalSyntheticLambda0
        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(Object obj) {
            ZenvaroPeakC533GateActivity.fileChooserLauncher$lambda$0(ZenvaroPeakC533GateActivity.this, (ActivityResult) obj);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fileChooserLauncher$lambda$0(ZenvaroPeakC533GateActivity this$0, ActivityResult result) {
        Uri[] uriArr;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        ValueCallback<Uri[]> valueCallback = this$0.filePathCallback;
        this$0.filePathCallback = null;
        if (valueCallback == null) {
            Log.e(TAG, "File chooser result ignored: callback is null");
            return;
        }
        if (result.getResultCode() != -1) {
            Log.d(TAG, "File chooser cancelled");
            valueCallback.onReceiveValue(null);
            return;
        }
        Intent data = result.getData();
        if ((data != null ? data.getClipData() : null) != null) {
            ClipData clipData = data.getClipData();
            Intrinsics.checkNotNull(clipData);
            int itemCount = clipData.getItemCount();
            uriArr = new Uri[itemCount];
            for (int i = 0; i < itemCount; i++) {
                Uri uri = clipData.getItemAt(i).getUri();
                Intrinsics.checkNotNullExpressionValue(uri, "getUri(...)");
                uriArr[i] = uri;
            }
        } else if ((data != null ? data.getData() : null) != null) {
            Uri data2 = data.getData();
            Intrinsics.checkNotNull(data2);
            uriArr = new Uri[]{data2};
        } else {
            uriArr = new Uri[0];
        }
        Log.d(TAG, "File chooser selected count -> " + uriArr.length);
        valueCallback.onReceiveValue(uriArr);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(10);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        getWindow().setStatusBarColor(-1);
        getWindow().setNavigationBarColor(-1);
        getWindow().getDecorView().setSystemUiVisibility(8208);
        ZenvaroPeakC533GateActivity zenvaroPeakC533GateActivity = this;
        FrameLayout frameLayout = new FrameLayout(zenvaroPeakC533GateActivity);
        this.root = frameLayout;
        frameLayout.setBackgroundColor(-1);
        FrameLayout frameLayout2 = new FrameLayout(zenvaroPeakC533GateActivity);
        this.safeContainer = frameLayout2;
        frameLayout2.setBackgroundColor(-1);
        FrameLayout frameLayout3 = this.root;
        WebView webView = null;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("root");
            frameLayout3 = null;
        }
        FrameLayout frameLayout4 = this.safeContainer;
        if (frameLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("safeContainer");
            frameLayout4 = null;
        }
        frameLayout3.addView(frameLayout4, new FrameLayout.LayoutParams(-1, -1));
        applySafeAreaInsets();
        FrameLayout frameLayout5 = this.root;
        if (frameLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("root");
            frameLayout5 = null;
        }
        setContentView(frameLayout5);
        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback() { // from class: com.zennvvarroo.pealkkk.data.services.ZenvaroPeakC533GateActivity$onCreate$1
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                ZenvaroPeakC533GateActivity.this.handleWebBack();
            }
        });
        WebView createConfiguredWebView = createConfiguredWebView();
        this.mainWeb = createConfiguredWebView;
        if (createConfiguredWebView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainWeb");
            createConfiguredWebView = null;
        }
        createConfiguredWebView.addJavascriptInterface(new AndroidBridge(), "AndroidBridge");
        FrameLayout frameLayout6 = this.safeContainer;
        if (frameLayout6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("safeContainer");
            frameLayout6 = null;
        }
        WebView webView2 = this.mainWeb;
        if (webView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainWeb");
        } else {
            webView = webView2;
        }
        frameLayout6.addView(webView, new FrameLayout.LayoutParams(-1, -1));
        String stringExtra = getIntent().getStringExtra(EXTRA_URL);
        if (stringExtra == null) {
            stringExtra = "";
        }
        loadContent(stringExtra);
        Log.d(TAG, "runSceneController -> localDouble: " + Random.INSTANCE.nextDouble(0.0d, 10.0d));
    }

    private final void applySafeAreaInsets() {
        FrameLayout frameLayout = this.root;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("root");
            frameLayout = null;
        }
        ViewCompat.setOnApplyWindowInsetsListener(frameLayout, new OnApplyWindowInsetsListener() { // from class: com.zennvvarroo.pealkkk.data.services.ZenvaroPeakC533GateActivity$$ExternalSyntheticLambda3
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat applySafeAreaInsets$lambda$1;
                applySafeAreaInsets$lambda$1 = ZenvaroPeakC533GateActivity.applySafeAreaInsets$lambda$1(ZenvaroPeakC533GateActivity.this, view, windowInsetsCompat);
                return applySafeAreaInsets$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat applySafeAreaInsets$lambda$1(ZenvaroPeakC533GateActivity this$0, View view, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        FrameLayout frameLayout = this$0.safeContainer;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("safeContainer");
            frameLayout = null;
        }
        frameLayout.setPadding(insets2.left, insets2.top, insets2.right, insets2.bottom);
        FrameLayout frameLayout2 = this$0.appOverlay;
        if (frameLayout2 != null) {
            frameLayout2.setPadding(insets2.left, insets2.top, insets2.right, insets2.bottom);
        }
        return insets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WebView createConfiguredWebView() {
        WebView webView = new WebView(this);
        webView.setBackgroundColor(-1);
        webView.setVerticalScrollBarEnabled(true);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setOverScrollMode(2);
        WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setMediaPlaybackRequiresUserGesture(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSupportMultipleWindows(true);
        settings.setCacheMode(-1);
        settings.setMixedContentMode(0);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(true);
        webView.setWebViewClient(new WebViewClient() { // from class: com.zennvvarroo.pealkkk.data.services.ZenvaroPeakC533GateActivity$createConfiguredWebView$1
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                String extractWindowOverlayUrl;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(request, "request");
                String uri = request.getUrl().toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                if (uri.length() <= 0) {
                    return false;
                }
                String lowerCase = uri.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (Intrinsics.areEqual(lowerCase, "about:blank") || (extractWindowOverlayUrl = ZenvaroPeakC533GateActivity.this.extractWindowOverlayUrl(uri)) == null) {
                    return false;
                }
                ZenvaroPeakC533GateActivity.this.showWindowOverlay(extractWindowOverlayUrl);
                return true;
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView view, String url) {
                Intrinsics.checkNotNullParameter(view, "view");
                super.onPageFinished(view, url);
                ZenvaroPeakC533GateActivity.this.injectAllScripts(view);
                if (url == null) {
                    url = "";
                }
                ZenvaroPeakC533LocalVault zenvaroPeakC533LocalVault = new ZenvaroPeakC533LocalVault(ZenvaroPeakC533GateActivity.this);
                if (!StringsKt.isBlank(url)) {
                    String lowerCase = url.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    if (Intrinsics.areEqual(lowerCase, "about:blank") || !StringsKt.startsWith$default(url, "http", false, 2, (Object) null)) {
                        return;
                    }
                    zenvaroPeakC533LocalVault.setFinalUrl(url);
                    Log.d("GoldenSproutWeb", "webView(didFinish) -> saved finalUrlLen = " + url.length());
                }
            }
        });
        webView.setWebChromeClient(new WebChromeClient() { // from class: com.zennvvarroo.pealkkk.data.services.ZenvaroPeakC533GateActivity$createConfiguredWebView$2
            @Override // android.webkit.WebChromeClient
            public boolean onShowFileChooser(WebView webView2, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                ValueCallback valueCallback;
                Intent createIntent;
                ValueCallback valueCallback2;
                ActivityResultLauncher activityResultLauncher;
                Log.d("GoldenSproutWeb", "onShowFileChooser called");
                valueCallback = ZenvaroPeakC533GateActivity.this.filePathCallback;
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(null);
                }
                ZenvaroPeakC533GateActivity.this.filePathCallback = filePathCallback;
                if (fileChooserParams != null) {
                    try {
                        createIntent = fileChooserParams.createIntent();
                    } catch (Exception e) {
                        Log.e("GoldenSproutWeb", "onShowFileChooser error -> " + e.getLocalizedMessage(), e);
                        valueCallback2 = ZenvaroPeakC533GateActivity.this.filePathCallback;
                        if (valueCallback2 != null) {
                            valueCallback2.onReceiveValue(null);
                        }
                        ZenvaroPeakC533GateActivity.this.filePathCallback = null;
                    }
                } else {
                    createIntent = null;
                }
                if (createIntent == null) {
                    createIntent = new Intent("android.intent.action.GET_CONTENT");
                    createIntent.addCategory("android.intent.category.OPENABLE");
                    createIntent.setType("image/*");
                    createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                }
                createIntent.setType("image/*");
                createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                activityResultLauncher = ZenvaroPeakC533GateActivity.this.fileChooserLauncher;
                activityResultLauncher.launch(createIntent);
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onCreateWindow(WebView view, boolean isDialog, boolean isUserGesture, Message resultMsg) {
                WebView createConfiguredWebView;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(resultMsg, "resultMsg");
                createConfiguredWebView = ZenvaroPeakC533GateActivity.this.createConfiguredWebView();
                ZenvaroPeakC533GateActivity.this.presentPopupInOverlay(createConfiguredWebView);
                Object obj = resultMsg.obj;
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.webkit.WebView.WebViewTransport");
                ((WebView.WebViewTransport) obj).setWebView(createConfiguredWebView);
                resultMsg.sendToTarget();
                return true;
            }
        });
        return webView;
    }

    private final void loadContent(String urlString) {
        try {
            urlString = Uri.decode(urlString);
        } catch (Exception unused) {
        }
        Intrinsics.checkNotNull(urlString);
        if (!StringsKt.isBlank(urlString)) {
            WebView webView = this.mainWeb;
            if (webView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mainWeb");
                webView = null;
            }
            webView.loadUrl(urlString);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void injectAllScripts(WebView webView) {
        injectViewportScript(webView);
        injectNoAutoplayScript(webView);
        injectHelperScript(webView);
        injectNativePopupPatch(webView);
    }

    private final void injectViewportScript(WebView webView) {
        webView.evaluateJavascript("(function() {\n    var existing = document.querySelector('meta[name=\"viewport\"]');\n    if (!existing) {\n        var meta = document.createElement('meta');\n        meta.name = 'viewport';\n        meta.content = 'width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no, viewport-fit=cover';\n        document.getElementsByTagName('head')[0].appendChild(meta);\n    } else {\n        existing.content = 'width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no, viewport-fit=cover';\n    }\n})();", null);
    }

    private final void injectNoAutoplayScript(WebView webView) {
        webView.evaluateJavascript("(function() {\n  const stopAll = () => {\n    document.querySelectorAll('video, audio').forEach(m => {\n      m.autoplay = false;\n      m.removeAttribute('autoplay');\n      try { m.pause(); } catch (_) {}\n      m.muted = false;\n      if (!m.__guardedPlay) {\n        const origPlay = m.play.bind(m);\n        let allow = false;\n        const trust = () => { allow = true; setTimeout(() => { allow = false; }, 250); };\n        ['pointerdown','mousedown','touchstart','keydown'].forEach(ev =>\n          window.addEventListener(ev, trust, {capture:true, passive:true})\n        );\n        m.play = function() {\n          if (!allow) {\n            try { m.pause(); } catch(_) {}\n            return Promise.reject('user-gesture-required');\n          }\n          return origPlay();\n        };\n        m.__guardedPlay = true;\n      }\n    });\n  };\n  stopAll();\n  const mo = new MutationObserver(stopAll);\n  mo.observe(document.documentElement || document.body, { childList: true, subtree: true });\n})();", null);
    }

    private final void injectHelperScript(WebView webView) {
        webView.evaluateJavascript("(function(){\n  try {\n    const oOpen = XMLHttpRequest.prototype.open;\n    const oSend = XMLHttpRequest.prototype.send;\n    XMLHttpRequest.prototype.open = function(m,u) {\n      this._url = u;\n      return oOpen.apply(this, arguments);\n    };\n    XMLHttpRequest.prototype.send = function(b) {\n      this.addEventListener('load', () => {\n        if (this._url && this._url.includes('/profile/identification/diia')) {\n          try {\n            const j = JSON.parse(this.responseText);\n            const data = j.data || {};\n            const link = data.url || data.secondary_url;\n            if (link && window.AndroidBridge) {\n              window.AndroidBridge.onLink(String(link));\n            }\n          } catch(e) {\n            console.error('XHR hook parse error', e);\n          }\n        }\n      });\n      return oSend.apply(this, arguments);\n    };\n  } catch(e) {}\n\n  try {\n    (function () {\n      var __inflight = 0;\n      function __maybeCommit() {\n        if (__pendingMain && !__paymentSeen && __inflight === 0) {\n          try { location.assign(__pendingMain); } catch (_) {}\n          __pendingMain = null;\n        }\n      }\n      var __oSend = XMLHttpRequest.prototype.send;\n      XMLHttpRequest.prototype.send = function (body) {\n        __inflight++;\n        this.addEventListener('loadend', function () {\n          __inflight--;\n          __maybeCommit();\n        });\n        return __oSend.apply(this, arguments);\n      };\n      var __oFetch = window.fetch ? window.fetch.bind(window) : null;\n      if (__oFetch) {\n        window.fetch = function () {\n          __inflight++;\n          return __oFetch.apply(this, arguments)\n            .finally(function () { __inflight--; __maybeCommit(); });\n        };\n      }\n      var __pendingMain = null;\n      var __paymentSeen = false;\n      var PAY_RE = /(?:^|[?&])purchaseurl(?:=|%3D)/i;\n      window.open = function (url) {\n        var s = \"\";\n        try {\n          s = (typeof url === \"string\") ? url\n            : (url && typeof url.href === \"string\") ? url.href\n            : String(url || \"\");\n        } catch (_) {}\n        if (PAY_RE.test(s) && window.AndroidBridge) {\n          __paymentSeen = true;\n          __pendingMain = null;\n          try { window.AndroidBridge.onNewWindow(s); } catch (e) {}\n          return null;\n        }\n        __pendingMain = s;\n        __maybeCommit();\n        return null;\n      };\n    })();\n  } catch (e) {}\n})();", null);
    }

    private final void injectNativePopupPatch(WebView webView) {
        webView.evaluateJavascript("(function(){\n  try {\n    function str(u){\n      try {\n        return (typeof u==='string') ? u\n          : (u && typeof u.href==='string') ? u.href\n          : String(u||'');\n      } catch(_) { return ''; }\n    }\n    function openViaAnchor(url) {\n      var s = str(url);\n      if (s && window.AndroidBridge) {\n        try { window.AndroidBridge.onNewWindow(s); } catch(e) {}\n      }\n      return {\n        closed: false,\n        focus: function(){},\n        close: function(){ this.closed = true; },\n        location: {\n          set href(u){ try { openViaAnchor(u); } catch(_){} },\n          assign: function(u){ try { openViaAnchor(u); } catch(_){} },\n          replace: function(u){ try { openViaAnchor(u); } catch(_){} }\n        }\n      };\n    }\n    var prev = window.open;\n    window.open = function(url, target, features){\n      try { return openViaAnchor(url); }\n      catch(e){\n        try { return prev.apply(this, arguments); }\n        catch(_) { return null; }\n      }\n    };\n  } catch(_) {}\n})();", null);
    }

    /* compiled from: ZenvaroPeakC533GateActivity.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\b"}, d2 = {"Lcom/zennvvarroo/pealkkk/data/services/ZenvaroPeakC533GateActivity$AndroidBridge;", "", "(Lcom/zennvvarroo/pealkkk/data/services/ZenvaroPeakC533GateActivity;)V", "onLink", "", "raw", "", "onNewWindow", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class AndroidBridge {
        public AndroidBridge() {
        }

        @JavascriptInterface
        public final void onLink(final String raw) {
            Intrinsics.checkNotNullParameter(raw, "raw");
            Handler handler = ZenvaroPeakC533GateActivity.this.mainHandler;
            final ZenvaroPeakC533GateActivity zenvaroPeakC533GateActivity = ZenvaroPeakC533GateActivity.this;
            handler.post(new Runnable() { // from class: com.zennvvarroo.pealkkk.data.services.ZenvaroPeakC533GateActivity$AndroidBridge$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    ZenvaroPeakC533GateActivity.AndroidBridge.onLink$lambda$0(raw, zenvaroPeakC533GateActivity);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onLink$lambda$0(String raw, ZenvaroPeakC533GateActivity this$0) {
            Intrinsics.checkNotNullParameter(raw, "$raw");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            try {
                raw = Uri.decode(raw);
            } catch (Exception unused) {
            }
            Intrinsics.checkNotNull(raw);
            if (!StringsKt.isBlank(raw)) {
                String lowerCase = raw.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (Intrinsics.areEqual(lowerCase, "about:blank")) {
                    return;
                }
                WebView webView = this$0.mainWeb;
                if (webView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mainWeb");
                    webView = null;
                }
                webView.loadUrl(raw);
            }
        }

        @JavascriptInterface
        public final void onNewWindow(final String raw) {
            Intrinsics.checkNotNullParameter(raw, "raw");
            Handler handler = ZenvaroPeakC533GateActivity.this.mainHandler;
            final ZenvaroPeakC533GateActivity zenvaroPeakC533GateActivity = ZenvaroPeakC533GateActivity.this;
            handler.post(new Runnable() { // from class: com.zennvvarroo.pealkkk.data.services.ZenvaroPeakC533GateActivity$AndroidBridge$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ZenvaroPeakC533GateActivity.AndroidBridge.onNewWindow$lambda$1(ZenvaroPeakC533GateActivity.this, raw);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onNewWindow$lambda$1(ZenvaroPeakC533GateActivity this$0, String raw) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(raw, "$raw");
            String extractWindowOverlayUrl = this$0.extractWindowOverlayUrl(raw);
            if (extractWindowOverlayUrl != null) {
                this$0.showWindowOverlay(extractWindowOverlayUrl);
                return;
            }
            try {
                raw = Uri.decode(raw);
            } catch (Exception unused) {
            }
            Intrinsics.checkNotNull(raw);
            if (!StringsKt.isBlank(raw)) {
                String lowerCase = raw.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (Intrinsics.areEqual(lowerCase, "about:blank")) {
                    return;
                }
                String makeAbsoluteUrl = this$0.makeAbsoluteUrl(raw);
                WebView webView = this$0.mainWeb;
                if (webView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mainWeb");
                    webView = null;
                }
                webView.loadUrl(makeAbsoluteUrl);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String makeAbsoluteUrl(String raw) {
        try {
            WebView webView = this.mainWeb;
            if (webView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mainWeb");
                webView = null;
            }
            String url = webView.getUrl();
            if (url == null) {
                url = "";
            }
            if (StringsKt.startsWith$default(raw, "http://", false, 2, (Object) null) || StringsKt.startsWith$default(raw, "https://", false, 2, (Object) null) || !(!StringsKt.isBlank(url))) {
                return raw;
            }
            String uri = Uri.withAppendedPath(Uri.parse(url), raw).toString();
            Intrinsics.checkNotNull(uri);
            return uri;
        } catch (Exception unused) {
            return raw;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void presentPopupInOverlay(WebView popup) {
        if (this.appOverlay != null) {
            closeWindowOverlay();
        }
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setBackgroundColor(Color.argb(153, 0, 0, 0));
        FrameLayout frameLayout2 = this.root;
        FrameLayout frameLayout3 = null;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("root");
            frameLayout2 = null;
        }
        frameLayout2.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(popup, new FrameLayout.LayoutParams(-1, -1));
        TextView makeCloseButton = makeCloseButton();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dp(36), dp(36));
        layoutParams.gravity = 8388661;
        layoutParams.topMargin = dp(16);
        layoutParams.setMarginEnd(dp(16));
        frameLayout.addView(makeCloseButton, layoutParams);
        this.appOverlay = frameLayout;
        this.appOverlayWebView = popup;
        FrameLayout frameLayout4 = this.root;
        if (frameLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("root");
        } else {
            frameLayout3 = frameLayout4;
        }
        ViewCompat.requestApplyInsets(frameLayout3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showWindowOverlay(String url) {
        if (this.appOverlay != null) {
            closeWindowOverlay();
        }
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setBackgroundColor(Color.argb(153, 0, 0, 0));
        FrameLayout frameLayout2 = this.root;
        FrameLayout frameLayout3 = null;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("root");
            frameLayout2 = null;
        }
        frameLayout2.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        WebView createConfiguredWebView = createConfiguredWebView();
        frameLayout.addView(createConfiguredWebView, new FrameLayout.LayoutParams(-1, -1));
        TextView makeCloseButton = makeCloseButton();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dp(36), dp(36));
        layoutParams.gravity = 8388661;
        layoutParams.topMargin = dp(16);
        layoutParams.setMarginEnd(dp(16));
        frameLayout.addView(makeCloseButton, layoutParams);
        this.appOverlay = frameLayout;
        this.appOverlayWebView = createConfiguredWebView;
        FrameLayout frameLayout4 = this.root;
        if (frameLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("root");
        } else {
            frameLayout3 = frameLayout4;
        }
        ViewCompat.requestApplyInsets(frameLayout3);
        createConfiguredWebView.loadUrl(url);
    }

    private final TextView makeCloseButton() {
        TextView textView = new TextView(this);
        textView.setText("✕");
        textView.setTextSize(22.0f);
        textView.setGravity(17);
        textView.setTextColor(-1);
        textView.setBackgroundColor(Color.argb(140, 0, 0, 0));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.zennvvarroo.pealkkk.data.services.ZenvaroPeakC533GateActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZenvaroPeakC533GateActivity.makeCloseButton$lambda$2(ZenvaroPeakC533GateActivity.this, view);
            }
        });
        return textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void makeCloseButton$lambda$2(ZenvaroPeakC533GateActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.closeWindowOverlay();
    }

    private final void closeWindowOverlay() {
        WebView webView = this.appOverlayWebView;
        if (webView != null) {
            webView.stopLoading();
        }
        FrameLayout frameLayout = this.appOverlay;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        if (this.appOverlay != null) {
            FrameLayout frameLayout2 = this.root;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("root");
                frameLayout2 = null;
            }
            frameLayout2.removeView(this.appOverlay);
        }
        this.appOverlayWebView = null;
        this.appOverlay = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r6, (java.lang.CharSequence) "purchaseUrl=", false, 2, (java.lang.Object) null) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String extractWindowOverlayUrl(String source) {
        try {
            MatchResult find$default = Regex.find$default(new Regex("purchaseUrl=([^&]+)"), source, 0, 2, null);
            if (find$default != null) {
                source = (String) CollectionsKt.getOrNull(find$default.getGroupValues(), 1);
                if (source == null) {
                    source = "";
                }
                try {
                    source = Uri.decode(source);
                } catch (Exception unused) {
                }
                try {
                    source = Uri.decode(source);
                } catch (Exception unused2) {
                }
                Intrinsics.checkNotNull(source);
                if (!StringsKt.startsWith$default(source, "http://", false, 2, (Object) null)) {
                    if (StringsKt.startsWith$default(source, "https://", false, 2, (Object) null)) {
                    }
                    source = null;
                }
                return source;
            }
        } catch (Exception unused3) {
            return null;
        }
    }

    public final void reloadAfterDelay(double seconds) {
        Log.d(TAG, "runReloadAfterDelay -> scheduling in " + seconds + " s.");
        this.mainHandler.postDelayed(new Runnable() { // from class: com.zennvvarroo.pealkkk.data.services.ZenvaroPeakC533GateActivity$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                ZenvaroPeakC533GateActivity.reloadAfterDelay$lambda$3(ZenvaroPeakC533GateActivity.this);
            }
        }, (long) (seconds * 1000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reloadAfterDelay$lambda$3(ZenvaroPeakC533GateActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Log.d(TAG, "runReloadAfterDelay -> reloading now.");
        WebView webView = this$0.mainWeb;
        if (webView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainWeb");
            webView = null;
        }
        webView.reload();
    }

    public final void logWebOffset() {
        WebView webView = this.mainWeb;
        WebView webView2 = null;
        if (webView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainWeb");
            webView = null;
        }
        int scrollX = webView.getScrollX();
        WebView webView3 = this.mainWeb;
        if (webView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainWeb");
        } else {
            webView2 = webView3;
        }
        Log.d(TAG, "runLogWebOffset -> x=" + scrollX + " y=" + webView2.getScrollY());
    }

    public final void analyzeScrollBehavior() {
        WebView webView = this.mainWeb;
        if (webView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainWeb");
            webView = null;
        }
        Log.d(TAG, "runAnalyzeScrollBehavior -> overScrollMode: " + webView.getOverScrollMode());
    }

    private final int dp(int value) {
        return (int) (value * getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleWebBack() {
        if (this.appOverlay != null) {
            closeWindowOverlay();
            return;
        }
        WebView webView = this.mainWeb;
        if (webView != null) {
            WebView webView2 = null;
            if (webView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mainWeb");
                webView = null;
            }
            if (webView.canGoBack()) {
                WebView webView3 = this.mainWeb;
                if (webView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mainWeb");
                } else {
                    webView2 = webView3;
                }
                webView2.goBack();
                return;
            }
        }
        Log.d(TAG, "Back blocked: user stays in WebView");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @Deprecated(message = "Deprecated in Java")
    public void onBackPressed() {
        handleWebBack();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        ValueCallback<Uri[]> valueCallback = this.filePathCallback;
        WebView webView = null;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
        this.filePathCallback = null;
        WebView webView2 = this.appOverlayWebView;
        if (webView2 != null) {
            webView2.destroy();
        }
        WebView webView3 = this.mainWeb;
        if (webView3 != null) {
            if (webView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mainWeb");
            } else {
                webView = webView3;
            }
            webView.destroy();
        }
        super.onDestroy();
    }
}
