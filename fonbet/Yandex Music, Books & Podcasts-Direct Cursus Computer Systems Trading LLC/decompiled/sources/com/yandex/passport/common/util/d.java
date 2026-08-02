package com.yandex.passport.common.util;

import defpackage.es3;
import defpackage.l3o;
import defpackage.ps3;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import defpackage.zt3;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class d implements ps3 {
    public final /* synthetic */ zt3 a;
    public final /* synthetic */ IOException b;

    public d(zt3 zt3Var, IOException iOException) {
        this.a = zt3Var;
        this.b = iOException;
    }

    @Override // defpackage.ps3
    public final void a(es3 es3Var, l3o l3oVar) {
        es3Var.getClass();
        l3oVar.getClass();
        r7o r7oVar = z7o.b;
        this.a.resumeWith(l3oVar);
    }

    @Override // defpackage.ps3
    public final void d(es3 es3Var, IOException iOException) {
        es3Var.getClass();
        zt3 zt3Var = this.a;
        if (zt3Var.x()) {
            return;
        }
        IOException iOException2 = this.b;
        if (iOException2 != null) {
            iOException2.initCause(iOException);
        }
        if (iOException2 != null) {
            iOException = iOException2;
        }
        r7o r7oVar = z7o.b;
        zt3Var.resumeWith(new t7o(iOException));
    }
}
