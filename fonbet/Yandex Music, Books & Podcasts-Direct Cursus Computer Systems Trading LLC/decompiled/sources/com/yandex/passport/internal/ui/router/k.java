package com.yandex.passport.internal.ui.router;

import android.view.View;
import defpackage.b6;
import defpackage.ezf;
import defpackage.hdu;
import defpackage.qvc;
import defpackage.rof;

/* loaded from: classes4.dex */
public final class k extends b6 {
    @Override // defpackage.b6
    public final View z(hdu hduVar) {
        qvc qvcVar = new qvc(ezf.a0(hduVar.getCtx(), 0), 0, 0);
        if (hduVar instanceof rof) {
            ((rof) hduVar).j(qvcVar);
        }
        qvcVar.setBackgroundColor(0);
        return qvcVar;
    }
}
