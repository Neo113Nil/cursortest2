package com.yandex.passport.internal.social.esia;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import defpackage.na8;

/* loaded from: classes4.dex */
public final class i implements na8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebView b;

    public /* synthetic */ i(WebView webView, int i) {
        this.a = i;
        this.b = webView;
    }

    @Override // defpackage.na8
    public final void a() {
        switch (this.a) {
            case 0:
                this.b.destroy();
                break;
            case 1:
                WebView webView = this.b;
                ViewParent parent = webView.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(webView);
                }
                webView.stopLoading();
                webView.destroy();
                break;
            case 2:
                this.b.destroy();
                break;
            default:
                this.b.destroy();
                break;
        }
    }
}
