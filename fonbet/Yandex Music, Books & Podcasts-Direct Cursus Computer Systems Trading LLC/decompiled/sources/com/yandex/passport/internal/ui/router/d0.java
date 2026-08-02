package com.yandex.passport.internal.ui.router;

import android.view.View;
import com.yandex.passport.api.s2;
import defpackage.b6;
import defpackage.ezf;
import defpackage.hdu;
import defpackage.qvc;
import defpackage.rof;

/* loaded from: classes4.dex */
public final class d0 extends b6 {
    public final com.yandex.passport.internal.properties.v d;
    public final View e;
    public final s2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(LoginRouterActivity loginRouterActivity, com.yandex.passport.internal.properties.v vVar, boolean z) {
        super(loginRouterActivity, 10);
        vVar.getClass();
        this.d = vVar;
        this.e = com.yandex.passport.common.ui.e.b(this, loginRouterActivity, vVar, z, 0.0f, 16);
        this.f = vVar.b.v();
    }

    @Override // defpackage.b6
    public final View z(hdu hduVar) {
        qvc qvcVar = new qvc(ezf.a0(hduVar.getCtx(), 0), 0, 0);
        if (hduVar instanceof rof) {
            ((rof) hduVar).j(qvcVar);
        }
        qvcVar.setBackgroundColor(0);
        qvcVar.b(this.e, new com.yandex.passport.internal.ui.bouncer.o(12, qvcVar, this));
        return qvcVar;
    }
}
