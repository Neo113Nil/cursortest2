package com.IceFishing.LiveIceFishing;

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
import h.AbstractActivityC4555k;

/* loaded from: classes.dex */
public class MWebActivity extends AbstractActivityC4555k {

    /* renamed from: n, reason: collision with root package name */
    public MWebActivity f6296n;

    /* renamed from: u, reason: collision with root package name */
    public ProgressBar f6297u;

    /* renamed from: v, reason: collision with root package name */
    public WebView f6298v;

    @Override // androidx.activity.p, android.app.Activity
    public final void onBackPressed() {
        if (this.f6298v.isFocused() && this.f6298v.canGoBack()) {
            this.f6298v.goBack();
            return;
        }
        Dialog dialog = new Dialog(this);
        dialog.setContentView(C5248R.layout.playgame_dialog);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        Y0.p.c(this.f6296n, Y0.p.f3891u, Y0.p.f3883m, Y0.p.f3864K, (ViewGroup) dialog.findViewById(C5248R.id.native_ad_container));
        window.setLayout(-1, -2);
        ((TextView) dialog.findViewById(C5248R.id.play)).setOnClickListener(new r(this, dialog, 0));
        ((TextView) dialog.findViewById(C5248R.id.no)).setOnClickListener(new r(this, dialog, 1));
        ((TextView) dialog.findViewById(C5248R.id.yes)).setOnClickListener(new r(this, dialog, 2));
        dialog.show();
    }

    @Override // androidx.fragment.app.AbstractActivityC0484x, androidx.activity.p, D.AbstractActivityC0283m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5248R.layout.activity_m_web);
        this.f6296n = this;
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.clearFlags(67108864);
        window.addFlags(1024);
        this.f6298v = (WebView) findViewById(C5248R.id.webviewm);
        this.f6297u = (ProgressBar) findViewById(C5248R.id.progressbarm);
        Bundle extras = getIntent().getExtras();
        extras.getString("url1");
        extras.getString("url1");
        this.f6298v.setSoundEffectsEnabled(true);
        this.f6298v.getSettings().setJavaScriptEnabled(true);
        this.f6298v.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.f6298v.getSettings().setGeolocationEnabled(true);
        this.f6298v.getSettings().setUseWideViewPort(true);
        this.f6298v.getSettings().setLoadWithOverviewMode(true);
        this.f6298v.getSettings().setAllowContentAccess(true);
        this.f6298v.getSettings().setDatabaseEnabled(true);
        this.f6298v.getSettings().setLoadsImagesAutomatically(true);
        CookieManager.getInstance().setAcceptCookie(true);
        this.f6298v.setBackgroundColor(Color.parseColor("#000000"));
        this.f6298v.getSettings().setDomStorageEnabled(true);
        this.f6298v.getSettings().setDatabaseEnabled(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.f6298v, true);
        this.f6298v.getSettings().setMixedContentMode(0);
        this.f6298v.getSettings().setMediaPlaybackRequiresUserGesture(false);
        this.f6298v.getSettings().setAllowFileAccessFromFileURLs(true);
        this.f6298v.getSettings().setAllowUniversalAccessFromFileURLs(true);
        WebView.setWebContentsDebuggingEnabled(false);
        this.f6298v.setLayerType(2, null);
        this.f6298v.setWebViewClient(new t(this));
        getIntent().getExtras().getString("url");
        this.f6298v.loadUrl(getIntent().getStringExtra("web_url"));
        this.f6298v.setWebChromeClient(new s(this));
    }

    @Override // h.AbstractActivityC4555k, androidx.fragment.app.AbstractActivityC0484x, android.app.Activity
    public final void onDestroy() {
        this.f6298v.destroy();
        this.f6298v = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.AbstractActivityC0484x, android.app.Activity
    public final void onPause() {
        this.f6298v.onPause();
        super.onPause();
    }

    @Override // androidx.fragment.app.AbstractActivityC0484x, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f6298v.resumeTimers();
        this.f6298v.onResume();
    }
}
