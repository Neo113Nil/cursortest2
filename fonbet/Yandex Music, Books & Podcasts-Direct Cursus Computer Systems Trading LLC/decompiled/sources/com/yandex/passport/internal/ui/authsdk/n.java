package com.yandex.passport.internal.ui.authsdk;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.b6;
import defpackage.ezf;
import defpackage.hdu;
import defpackage.qvc;
import defpackage.rof;
import defpackage.t86;

/* loaded from: classes4.dex */
public final class n extends b6 {
    public final com.yandex.passport.internal.ui.bouncer.error.q d;
    public final com.yandex.passport.common.common.a e;
    public final com.yandex.passport.common.analytics.f f;
    public final com.yandex.passport.internal.clipboard.a g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Activity activity, com.yandex.passport.internal.ui.bouncer.error.q qVar, com.yandex.passport.common.common.a aVar, com.yandex.passport.common.analytics.f fVar, com.yandex.passport.internal.clipboard.a aVar2) {
        super(activity, 10);
        activity.getClass();
        qVar.getClass();
        aVar.getClass();
        fVar.getClass();
        aVar2.getClass();
        this.d = qVar;
        this.e = aVar;
        this.f = fVar;
        this.g = aVar2;
    }

    @Override // defpackage.b6
    public final View z(hdu hduVar) {
        qvc qvcVar = new qvc(ezf.a0(hduVar.getCtx(), 0), 0, 0);
        if (hduVar instanceof rof) {
            ((rof) hduVar).j(qvcVar);
        }
        ezf.a0(qvcVar.getCtx(), 0).getClass();
        com.yandex.passport.internal.ui.bouncer.error.q qVar = this.d;
        qvcVar.j(qVar.e());
        qvcVar.setVisibility(0);
        ViewGroup.LayoutParams b = qVar.b(-2, -2);
        t86 t86Var = (t86) b;
        ((ViewGroup.MarginLayoutParams) t86Var).width = -1;
        ((ViewGroup.MarginLayoutParams) t86Var).height = -1;
        qvcVar.setLayoutParams(b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = -1;
        qvcVar.setLayoutParams(layoutParams);
        return qvcVar;
    }
}
