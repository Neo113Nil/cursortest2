package com.yandex.passport.internal.warm;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import defpackage.b6;
import defpackage.ezf;
import defpackage.hdu;
import defpackage.qvc;
import defpackage.rof;

/* loaded from: classes4.dex */
public final class g extends b6 implements b {
    public final WebView d;
    public final View e;

    /* JADX WARN: Multi-variable type inference failed */
    public g(WarmUpWebViewActivity warmUpWebViewActivity) {
        super(warmUpWebViewActivity, 10);
        View view = (View) f.a.invoke(ezf.a0(warmUpWebViewActivity, 0), 0, 0);
        if (this instanceof rof) {
            ((rof) this).j(view);
        }
        this.d = (WebView) view;
        this.e = e();
    }

    @Override // com.yandex.passport.internal.warm.b
    public final View getTheRootView() {
        return this.e;
    }

    @Override // com.yandex.passport.internal.warm.b
    public final WebView getWarmWebView() {
        return this.d;
    }

    @Override // defpackage.b6
    public final View z(hdu hduVar) {
        qvc qvcVar = new qvc(ezf.a0(hduVar.getCtx(), 0), 0, 0);
        if (hduVar instanceof rof) {
            ((rof) hduVar).j(qvcVar);
        }
        qvcVar.b(this.d, new com.yandex.passport.internal.ui.bouncer.roundabout.items.a(qvcVar, 1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = -1;
        qvcVar.setLayoutParams(layoutParams);
        return qvcVar;
    }
}
