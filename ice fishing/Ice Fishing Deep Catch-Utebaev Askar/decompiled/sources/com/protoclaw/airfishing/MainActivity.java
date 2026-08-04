package com.protoclaw.airfishing;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.appsflyer.AppsFlyerLib;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class MainActivity extends Activity {
    private final Handler handler = new Handler(Looper.getMainLooper());
    private boolean loaderActive;
    private FrameLayout loaderOverlay;
    private Runnable pendingHide;
    private String privacyCanon;
    private WebView webView;

    @Metadata
    public final class NativeActions {
        public NativeActions() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void postMessage$lambda$0(MainActivity this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            SharedPreferences sharedPreferences = a.c.f14c;
            if (sharedPreferences == null) {
                Intrinsics.e("sp");
                throw null;
            }
            sharedPreferences.edit().putBoolean("st_f", true).apply();
            this$0.shwLdr();
            WebView webView = this$0.webView;
            if (webView != null) {
                webView.loadUrl("file:///android_asset/screen-main.html");
            } else {
                Intrinsics.e("webView");
                throw null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void postMessage$lambda$1(MainActivity this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.shwLdr();
            SharedPreferences sharedPreferences = a.c.f14c;
            if (sharedPreferences == null) {
                Intrinsics.e("sp");
                throw null;
            }
            if (sharedPreferences.getBoolean("st_f", false)) {
                WebView webView = this$0.webView;
                if (webView != null) {
                    webView.loadUrl("file:///android_asset/screen-main.html");
                    return;
                } else {
                    Intrinsics.e("webView");
                    throw null;
                }
            }
            WebView webView2 = this$0.webView;
            if (webView2 != null) {
                this$0.shwCntnt(webView2);
            } else {
                Intrinsics.e("webView");
                throw null;
            }
        }

        @JavascriptInterface
        public final void postMessage(String msg) {
            MainActivity mainActivity;
            a aVar;
            Intrinsics.checkNotNullParameter(msg, "msg");
            int iHashCode = msg.hashCode();
            if (iHashCode != -1423461112) {
                if (iHashCode == 3127582) {
                    if (msg.equals("exit")) {
                        MainActivity.this.finish();
                        return;
                    }
                    return;
                } else {
                    if (iHashCode != 3443508 || !msg.equals("play")) {
                        return;
                    }
                    mainActivity = MainActivity.this;
                    aVar = new a(mainActivity, 2);
                }
            } else {
                if (!msg.equals("accept")) {
                    return;
                }
                mainActivity = MainActivity.this;
                aVar = new a(mainActivity, 1);
            }
            mainActivity.runOnUiThread(aVar);
        }
    }

    private final FrameLayout buildLoader() {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setBackgroundColor(Color.parseColor("#F00A1628"));
        int i2 = 1;
        frameLayout.setClickable(true);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        b bVar = new b(this);
        int iIntValue = ((Number) bVar.invoke(56)).intValue();
        ProgressBar progressBar = new ProgressBar(this, null, android.R.attr.progressBarStyleLarge);
        progressBar.setIndeterminateTintList(ColorStateList.valueOf(Color.parseColor("#F59E0B")));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iIntValue, iIntValue);
        layoutParams.gravity = 1;
        linearLayout.addView(progressBar, layoutParams);
        TextView textView = new TextView(this);
        textView.setText("Loading...");
        textView.setTextColor(Color.parseColor("#80FFFFFF"));
        textView.setTextSize(14.0f);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = ((Number) bVar.invoke(16)).intValue();
        layoutParams2.gravity = 1;
        linearLayout.addView(textView, layoutParams2);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, "alpha", 0.4f, 1.0f);
        objectAnimatorOfFloat.setDuration(1200L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.start();
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        int[] iArr = {Color.parseColor("#06B6D4"), Color.parseColor("#F59E0B"), Color.parseColor("#22C55E")};
        int i3 = 0;
        while (i3 < 3) {
            View view = new View(this);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(i2);
            gradientDrawable.setColor(iArr[i3]);
            view.setBackground(gradientDrawable);
            view.setAlpha(0.6f);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(((Number) bVar.invoke(8)).intValue(), ((Number) bVar.invoke(8)).intValue());
            layoutParams3.setMarginStart(i3 > 0 ? ((Number) bVar.invoke(8)).intValue() : 0);
            linearLayout2.addView(view, layoutParams3);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "alpha", 0.2f, 1.0f);
            objectAnimatorOfFloat2.setDuration(800L);
            objectAnimatorOfFloat2.setStartDelay(i3 * 250);
            objectAnimatorOfFloat2.setRepeatMode(2);
            objectAnimatorOfFloat2.setRepeatCount(-1);
            objectAnimatorOfFloat2.start();
            i3++;
            i2 = 1;
        }
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = ((Number) bVar.invoke(20)).intValue();
        layoutParams4.gravity = 1;
        linearLayout.addView(linearLayout2, layoutParams4);
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-2, -2, 17));
        return frameLayout;
    }

    private final void configureWebView() {
        WebView webView = this.webView;
        if (webView == null) {
            Intrinsics.e("webView");
            throw null;
        }
        WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(false);
        settings.setDisplayZoomControls(false);
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setMixedContentMode(0);
        settings.setCacheMode(-1);
        WebView webView2 = this.webView;
        if (webView2 == null) {
            Intrinsics.e("webView");
            throw null;
        }
        webView2.setBackgroundColor(Color.parseColor("#0A1628"));
        WebView webView3 = this.webView;
        if (webView3 == null) {
            Intrinsics.e("webView");
            throw null;
        }
        webView3.addJavascriptInterface(new NativeActions(), "NativeActions");
        WebView webView4 = this.webView;
        if (webView4 == null) {
            Intrinsics.e("webView");
            throw null;
        }
        webView4.setWebChromeClient(new c(this));
        WebView webView5 = this.webView;
        if (webView5 != null) {
            webView5.setWebViewClient(new d(this));
        } else {
            Intrinsics.e("webView");
            throw null;
        }
    }

    private final void goImmersive() {
        if (Build.VERSION.SDK_INT < 30) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
            return;
        }
        getWindow().setDecorFitsSystemWindows(false);
        WindowInsetsController insetsController = getWindow().getInsetsController();
        if (insetsController != null) {
            insetsController.hide(WindowInsets.Type.systemBars());
            insetsController.setSystemBarsBehavior(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hdLdr() {
        int i2 = 0;
        this.loaderActive = false;
        Runnable runnable = this.pendingHide;
        if (runnable != null) {
            this.handler.removeCallbacks(runnable);
        }
        this.pendingHide = null;
        FrameLayout frameLayout = this.loaderOverlay;
        if (frameLayout != null) {
            frameLayout.animate().alpha(0.0f).setDuration(300L).withEndAction(new a(this, i2)).start();
        } else {
            Intrinsics.e("loaderOverlay");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hdLdr$lambda$13(MainActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FrameLayout frameLayout = this$0.loaderOverlay;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        } else {
            Intrinsics.e("loaderOverlay");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void shwCntnt(WebView webView) {
        g gVar = g.f115b;
        Intrinsics.checkNotNullParameter(this, "ctx");
        Intrinsics.checkNotNullParameter("https://deepaircatch.online", "base");
        String packageName = getPackageName();
        String appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(this);
        if (appsFlyerUID == null) {
            appsFlyerUID = "";
        }
        StringBuilder sb = new StringBuilder("https://deepaircatch.online?bundle=");
        sb.append(packageName);
        sb.append("&afid=");
        sb.append(appsFlyerUID);
        sb.append("&devkey=NNKY5pzzwhMThZnxnTUnCZ");
        if (gVar.f116a.length() > 0) {
            sb.append("&referrer=");
            sb.append(Uri.encode(gVar.f116a));
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.privacyCanon = a.c.a(string);
        webView.loadUrl(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void shwLdr() {
        this.loaderActive = true;
        FrameLayout frameLayout = this.loaderOverlay;
        if (frameLayout == null) {
            Intrinsics.e("loaderOverlay");
            throw null;
        }
        frameLayout.setAlpha(0.0f);
        FrameLayout frameLayout2 = this.loaderOverlay;
        if (frameLayout2 == null) {
            Intrinsics.e("loaderOverlay");
            throw null;
        }
        frameLayout2.setVisibility(0);
        FrameLayout frameLayout3 = this.loaderOverlay;
        if (frameLayout3 != null) {
            frameLayout3.animate().alpha(1.0f).setDuration(200L).start();
        } else {
            Intrinsics.e("loaderOverlay");
            throw null;
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        WebView webView = this.webView;
        if (webView == null) {
            Intrinsics.e("webView");
            throw null;
        }
        if (!webView.canGoBack()) {
            super.onBackPressed();
            return;
        }
        WebView webView2 = this.webView;
        if (webView2 != null) {
            webView2.goBack();
        } else {
            Intrinsics.e("webView");
            throw null;
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRequestedOrientation(1);
        getWindow().addFlags(128);
        FrameLayout frameLayout = new FrameLayout(this);
        setContentView(frameLayout);
        this.webView = new WebView(this);
        configureWebView();
        WebView webView = this.webView;
        if (webView == null) {
            Intrinsics.e("webView");
            throw null;
        }
        frameLayout.addView(webView, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayoutBuildLoader = buildLoader();
        this.loaderOverlay = frameLayoutBuildLoader;
        if (frameLayoutBuildLoader == null) {
            Intrinsics.e("loaderOverlay");
            throw null;
        }
        frameLayout.addView(frameLayoutBuildLoader, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = this.loaderOverlay;
        if (frameLayout2 == null) {
            Intrinsics.e("loaderOverlay");
            throw null;
        }
        frameLayout2.setVisibility(8);
        goImmersive();
        SharedPreferences sharedPreferences = a.c.f14c;
        if (sharedPreferences == null) {
            Intrinsics.e("sp");
            throw null;
        }
        String string = sharedPreferences.getString("dl_v", null);
        if (string == null) {
            WebView webView2 = this.webView;
            if (webView2 != null) {
                webView2.loadUrl("file:///android_asset/screen-menu.html");
                return;
            } else {
                Intrinsics.e("webView");
                throw null;
            }
        }
        shwLdr();
        WebView webView3 = this.webView;
        if (webView3 != null) {
            webView3.loadUrl(string);
        } else {
            Intrinsics.e("webView");
            throw null;
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        WebView webView = this.webView;
        if (webView != null) {
            webView.onPause();
        } else {
            Intrinsics.e("webView");
            throw null;
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        goImmersive();
        WebView webView = this.webView;
        if (webView != null) {
            webView.onResume();
        } else {
            Intrinsics.e("webView");
            throw null;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            goImmersive();
        }
    }
}
