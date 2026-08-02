package com.yandex.passport.internal.ui.sloth.menu;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.passport.sloth.ui.b0;
import com.yandex.passport.sloth.ui.j2;
import defpackage.b6;
import defpackage.ezf;
import defpackage.hdu;
import defpackage.qvc;
import defpackage.rof;
import defpackage.urq;

/* loaded from: classes4.dex */
public final class i extends b6 {
    public final o d;
    public final j2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, Activity activity, com.yandex.passport.sloth.ui.string.b bVar) {
        super(activity, 10);
        oVar.getClass();
        activity.getClass();
        bVar.getClass();
        this.d = oVar;
        this.e = new j2(activity, bVar, oVar.b);
    }

    @Override // defpackage.b6
    public final View z(hdu hduVar) {
        qvc qvcVar = new qvc(ezf.a0(hduVar.getCtx(), 0), 0, 0);
        if (hduVar instanceof rof) {
            ((rof) hduVar).j(qvcVar);
        }
        b0 b0Var = (b0) this.d.d.getValue();
        b0Var.getClass();
        urq urqVar = new urq(b0Var);
        ezf.a0(qvcVar.getCtx(), 0).getClass();
        qvcVar.j(urqVar.e());
        qvcVar.setVisibility(8);
        ViewGroup.LayoutParams a = qvcVar.a(-2, -2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a;
        layoutParams.width = -1;
        layoutParams.height = -1;
        qvcVar.setLayoutParams(a);
        ezf.a0(qvcVar.getCtx(), 0).getClass();
        qvcVar.j(this.e.e());
        qvcVar.setVisibility(0);
        ViewGroup.LayoutParams a2 = qvcVar.a(-2, -2);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) a2;
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        qvcVar.setLayoutParams(a2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = -1;
        qvcVar.setLayoutParams(layoutParams3);
        return qvcVar;
    }
}
