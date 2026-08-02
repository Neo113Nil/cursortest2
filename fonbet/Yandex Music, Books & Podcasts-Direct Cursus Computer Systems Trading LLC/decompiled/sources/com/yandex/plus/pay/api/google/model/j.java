package com.yandex.plus.pay.api.google.model;

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
public final /* synthetic */ class j implements p3d {
    public static final j a;

    @NotNull
    private static final mhp descriptor;

    static {
        j jVar = new j();
        a = jVar;
        j5m j5mVar = new j5m("com.yandex.plus.pay.api.google.model.PurchaseData", jVar, 3);
        j5mVar.k("purchase", false);
        j5mVar.k("userId", false);
        j5mVar.k("isSubscription", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{g.a, tkr.a, oc3.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        boolean z;
        int i;
        i iVar;
        String str;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            iVar = (i) c.z(mhpVar, 0, g.a, null);
            str = c.g(mhpVar, 1);
            z = c.D(mhpVar, 2);
            i = 7;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            i iVar2 = null;
            String str2 = null;
            int i2 = 0;
            while (z2) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z2 = false;
                } else if (w == 0) {
                    iVar2 = (i) c.z(mhpVar, 0, g.a, iVar2);
                    i2 |= 1;
                } else if (w == 1) {
                    str2 = c.g(mhpVar, 1);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    z3 = c.D(mhpVar, 2);
                    i2 |= 4;
                }
            }
            z = z3;
            i = i2;
            iVar = iVar2;
            str = str2;
        }
        c.b(mhpVar);
        return new l(i, iVar, str, z);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        l lVar = (l) obj;
        l6bVar.getClass();
        lVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, g.a, lVar.a);
        c.p(mhpVar, 1, lVar.b);
        c.j(mhpVar, 2, lVar.c);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
