package com.icefishing.icefishingbigwin;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.internal.ads.C3753pw;
import h.AbstractActivityC4551k;

/* loaded from: classes2.dex */
public class MWebActivity extends AbstractActivityC4551k {

    /* renamed from: n, reason: collision with root package name */
    public MWebActivity f36806n;

    /* renamed from: u, reason: collision with root package name */
    public ProgressBar f36807u;

    /* renamed from: v, reason: collision with root package name */
    public WebView f36808v;

    @Override // androidx.activity.p, android.app.Activity
    public final void onBackPressed() {
        if (this.f36808v.isFocused() && this.f36808v.canGoBack()) {
            this.f36808v.goBack();
            return;
        }
        Dialog dialog = new Dialog(this);
        dialog.setContentView(C5275R.layout.playgame_dialog);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        o4.m.c(this.f36806n, o4.m.f39628u, o4.m.f39620m, o4.m.f39601K, (ViewGroup) dialog.findViewById(C5275R.id.native_ad_container));
        window.setLayout(-1, -2);
        ((TextView) dialog.findViewById(C5275R.id.play)).setOnClickListener(new r(this, dialog, 0));
        ((TextView) dialog.findViewById(C5275R.id.no)).setOnClickListener(new r(this, dialog, 1));
        ((TextView) dialog.findViewById(C5275R.id.yes)).setOnClickListener(new r(this, dialog, 2));
        dialog.show();
    }

    @Override // androidx.fragment.app.AbstractActivityC0480x, androidx.activity.p, D.AbstractActivityC0295n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5275R.layout.activity_m_web);
        this.f36806n = this;
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.clearFlags(67108864);
        window.addFlags(1024);
        this.f36808v = (WebView) findViewById(C5275R.id.webviewm);
        this.f36807u = (ProgressBar) findViewById(C5275R.id.progressbarm);
        Bundle extras = getIntent().getExtras();
        extras.getString("url1");
        extras.getString("url1");
        this.f36808v.setSoundEffectsEnabled(true);
        this.f36808v.getSettings().setJavaScriptEnabled(true);
        this.f36808v.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.f36808v.getSettings().setGeolocationEnabled(true);
        this.f36808v.getSettings().setUseWideViewPort(true);
        this.f36808v.getSettings().setLoadWithOverviewMode(true);
        this.f36808v.getSettings().setAllowContentAccess(true);
        this.f36808v.getSettings().setDatabaseEnabled(true);
        this.f36808v.getSettings().setLoadsImagesAutomatically(true);
        CookieManager.getInstance().setAcceptCookie(true);
        this.f36808v.setBackgroundColor(Color.parseColor("#000000"));
        this.f36808v.getSettings().setDomStorageEnabled(true);
        this.f36808v.getSettings().setDatabaseEnabled(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.f36808v, true);
        this.f36808v.getSettings().setMixedContentMode(0);
        this.f36808v.getSettings().setMediaPlaybackRequiresUserGesture(false);
        this.f36808v.getSettings().setAllowFileAccessFromFileURLs(true);
        this.f36808v.getSettings().setAllowUniversalAccessFromFileURLs(true);
        WebView.setWebContentsDebuggingEnabled(false);
        this.f36808v.setLayerType(2, null);
        this.f36808v.setWebViewClient(new C3753pw(this));
        getIntent().getExtras().getString("url");
        this.f36808v.loadUrl(getIntent().getStringExtra("web_url"));
        this.f36808v.setWebChromeClient(new s(this));
    }

    @Override // h.AbstractActivityC4551k, androidx.fragment.app.AbstractActivityC0480x, android.app.Activity
    public final void onDestroy() {
        this.f36808v.destroy();
        this.f36808v = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.AbstractActivityC0480x, android.app.Activity
    public final void onPause() {
        this.f36808v.onPause();
        super.onPause();
    }

    @Override // androidx.fragment.app.AbstractActivityC0480x, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f36808v.resumeTimers();
        this.f36808v.onResume();
    }
}
