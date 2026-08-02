package com.yandex.plus.pay.adapter.api;

import defpackage.eg7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.oc3;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class p implements p3d {
    public static final p a;

    @NotNull
    private static final mhp descriptor;

    static {
        p pVar = new p();
        a = pVar;
        j5m j5mVar = new j5m("com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter.GoogleBillingConfig", pVar, 2);
        j5mVar.k("googleCountryCode", false);
        j5mVar.k("isNativePaymentAllowed", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{tkr.a, oc3.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        String str;
        boolean z;
        int i;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            str = c.g(mhpVar, 0);
            z = c.D(mhpVar, 1);
            i = 3;
        } else {
            str = null;
            boolean z2 = true;
            boolean z3 = false;
            int i2 = 0;
            while (z2) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z2 = false;
                } else if (w == 0) {
                    str = c.g(mhpVar, 0);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    z3 = c.D(mhpVar, 1);
                    i2 |= 2;
                }
            }
            z = z3;
            i = i2;
        }
        c.b(mhpVar);
        return new r(i, str, z);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        r rVar = (r) obj;
        l6bVar.getClass();
        rVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.p(mhpVar, 0, rVar.a);
        c.j(mhpVar, 1, rVar.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
