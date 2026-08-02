package com.yandex.passport.internal.ui.account_upgrade;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.b6;
import defpackage.ezf;
import defpackage.g4i;
import defpackage.hdu;
import defpackage.qvc;
import defpackage.rof;

/* loaded from: classes4.dex */
public final class f extends b6 {
    public final boolean d;

    public f(AccountUpgraderActivity accountUpgraderActivity, boolean z) {
        super(accountUpgraderActivity, 10);
        this.d = z;
    }

    @Override // defpackage.b6
    public final View z(hdu hduVar) {
        qvc qvcVar = new qvc(ezf.a0(hduVar.getCtx(), 0), 0, 0);
        if (hduVar instanceof rof) {
            ((rof) hduVar).j(qvcVar);
        }
        Context context = qvcVar.getContext();
        context.getClass();
        View view = (View) e.a.invoke(ezf.a0(qvcVar.getCtx(), 0), 0, 0);
        qvcVar.a.j(view);
        View g = com.yandex.plus.core.locale.b.g(qvcVar, context, this.d, (com.yandex.passport.common.ui.view.d) view, 1.0f, 0L);
        ViewGroup.LayoutParams a = qvcVar.a(-2, -2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a;
        layoutParams.width = -2;
        layoutParams.height = (int) (50 * g4i.a.density);
        layoutParams.gravity = 17;
        g.setLayoutParams(a);
        return qvcVar;
    }
}
