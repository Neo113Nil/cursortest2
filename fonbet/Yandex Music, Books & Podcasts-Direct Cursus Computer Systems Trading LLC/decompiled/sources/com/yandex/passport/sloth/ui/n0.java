package com.yandex.passport.sloth.ui;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import defpackage.b6;
import defpackage.ezf;
import defpackage.g4i;
import defpackage.hdu;
import defpackage.ldg;
import defpackage.qvc;
import defpackage.rof;

/* loaded from: classes4.dex */
public final class n0 extends b6 {
    public final Activity d;
    public final com.yandex.passport.sloth.ui.dependencies.o e;
    public final WebView f;
    public final j2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n0(Activity activity, com.yandex.passport.sloth.ui.string.b bVar, com.yandex.passport.sloth.ui.dependencies.o oVar) {
        super(activity, 10);
        activity.getClass();
        bVar.getClass();
        oVar.getClass();
        this.d = activity;
        this.e = oVar;
        View view = (View) m0.a.invoke(ezf.a0(activity, 0), 0, 0);
        if (this instanceof rof) {
            ((rof) this).j(view);
        }
        WebView webView = (WebView) view;
        webView.setVisibility(8);
        this.f = webView;
        this.g = new j2(activity, bVar, oVar);
    }

    @Override // defpackage.b6
    public final View z(hdu hduVar) {
        qvc qvcVar = new qvc(ezf.a0(hduVar.getCtx(), 0), 0, 0);
        if (hduVar instanceof rof) {
            ((rof) hduVar).j(qvcVar);
        }
        qvcVar.setLayoutTransition(new LayoutTransition());
        com.yandex.passport.sloth.ui.dependencies.o oVar = this.e;
        com.yandex.passport.sloth.ui.dependencies.i d = oVar.d();
        if (d instanceof com.yandex.passport.sloth.ui.dependencies.h) {
            qvcVar.setBackgroundResource(((com.yandex.passport.sloth.ui.dependencies.h) d).a);
        } else {
            ldg.H(oVar.b().b, qvcVar);
        }
        qvcVar.b(this.f, new com.yandex.passport.internal.ui.bouncer.o(16, qvcVar, this));
        ezf.a0(qvcVar.getCtx(), 0).getClass();
        qvcVar.j(this.g.e());
        ViewGroup.LayoutParams a = qvcVar.a(-2, -2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a;
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.gravity = 17;
        int i = (int) (44 * g4i.a.density);
        layoutParams.leftMargin = i;
        layoutParams.rightMargin = i;
        qvcVar.setLayoutParams(a);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = -1;
        qvcVar.setLayoutParams(layoutParams2);
        return qvcVar;
    }
}
