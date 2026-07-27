package com.icefishing.icefishingliveapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class r extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public View f37096a;

    /* renamed from: b, reason: collision with root package name */
    public WebChromeClient.CustomViewCallback f37097b;

    /* renamed from: c, reason: collision with root package name */
    public int f37098c;

    /* renamed from: d, reason: collision with root package name */
    public int f37099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MWebActivity f37100e;

    public r(MWebActivity mWebActivity) {
        this.f37100e = mWebActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        if (this.f37096a == null) {
            return null;
        }
        return BitmapFactory.decodeResource(this.f37100e.getApplicationContext().getResources(), 2130837573);
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        MWebActivity mWebActivity = this.f37100e;
        ((FrameLayout) mWebActivity.getWindow().getDecorView()).removeView(this.f37096a);
        this.f37096a = null;
        mWebActivity.getWindow().getDecorView().setSystemUiVisibility(this.f37099d);
        mWebActivity.setRequestedOrientation(this.f37098c);
        this.f37097b.onCustomViewHidden();
        this.f37097b = null;
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        if (this.f37096a != null) {
            onHideCustomView();
            return;
        }
        this.f37096a = view;
        MWebActivity mWebActivity = this.f37100e;
        this.f37099d = mWebActivity.getWindow().getDecorView().getSystemUiVisibility();
        this.f37098c = mWebActivity.getRequestedOrientation();
        this.f37097b = customViewCallback;
        ((FrameLayout) mWebActivity.getWindow().getDecorView()).addView(this.f37096a, new FrameLayout.LayoutParams(-1, -1));
        mWebActivity.getWindow().getDecorView().setSystemUiVisibility(3846);
    }
}
