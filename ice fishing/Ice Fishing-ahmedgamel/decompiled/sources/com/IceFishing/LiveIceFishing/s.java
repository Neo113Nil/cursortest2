package com.IceFishing.LiveIceFishing;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class s extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public View f6424a;

    /* renamed from: b, reason: collision with root package name */
    public WebChromeClient.CustomViewCallback f6425b;

    /* renamed from: c, reason: collision with root package name */
    public int f6426c;

    /* renamed from: d, reason: collision with root package name */
    public int f6427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MWebActivity f6428e;

    public s(MWebActivity mWebActivity) {
        this.f6428e = mWebActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        if (this.f6424a == null) {
            return null;
        }
        return BitmapFactory.decodeResource(this.f6428e.getApplicationContext().getResources(), 2130837573);
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        MWebActivity mWebActivity = this.f6428e;
        ((FrameLayout) mWebActivity.getWindow().getDecorView()).removeView(this.f6424a);
        this.f6424a = null;
        mWebActivity.getWindow().getDecorView().setSystemUiVisibility(this.f6427d);
        mWebActivity.setRequestedOrientation(this.f6426c);
        this.f6425b.onCustomViewHidden();
        this.f6425b = null;
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        if (this.f6424a != null) {
            onHideCustomView();
            return;
        }
        this.f6424a = view;
        MWebActivity mWebActivity = this.f6428e;
        this.f6427d = mWebActivity.getWindow().getDecorView().getSystemUiVisibility();
        this.f6426c = mWebActivity.getRequestedOrientation();
        this.f6425b = customViewCallback;
        ((FrameLayout) mWebActivity.getWindow().getDecorView()).addView(this.f6424a, new FrameLayout.LayoutParams(-1, -1));
        mWebActivity.getWindow().getDecorView().setSystemUiVisibility(3846);
    }
}
