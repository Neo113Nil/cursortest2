package com.icefishinggame.icefishinggamemultigames;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class s extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public View f36935a;

    /* renamed from: b, reason: collision with root package name */
    public WebChromeClient.CustomViewCallback f36936b;

    /* renamed from: c, reason: collision with root package name */
    public int f36937c;

    /* renamed from: d, reason: collision with root package name */
    public int f36938d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MWebActivity f36939e;

    public s(MWebActivity mWebActivity) {
        this.f36939e = mWebActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        if (this.f36935a == null) {
            return null;
        }
        return BitmapFactory.decodeResource(this.f36939e.getApplicationContext().getResources(), 2130837573);
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        MWebActivity mWebActivity = this.f36939e;
        ((FrameLayout) mWebActivity.getWindow().getDecorView()).removeView(this.f36935a);
        this.f36935a = null;
        mWebActivity.getWindow().getDecorView().setSystemUiVisibility(this.f36938d);
        mWebActivity.setRequestedOrientation(this.f36937c);
        this.f36936b.onCustomViewHidden();
        this.f36936b = null;
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        if (this.f36935a != null) {
            onHideCustomView();
            return;
        }
        this.f36935a = view;
        MWebActivity mWebActivity = this.f36939e;
        this.f36938d = mWebActivity.getWindow().getDecorView().getSystemUiVisibility();
        this.f36937c = mWebActivity.getRequestedOrientation();
        this.f36936b = customViewCallback;
        ((FrameLayout) mWebActivity.getWindow().getDecorView()).addView(this.f36935a, new FrameLayout.LayoutParams(-1, -1));
        mWebActivity.getWindow().getDecorView().setSystemUiVisibility(3846);
    }
}
