package com.yandex.plus.pay.internal.feature.offers;

import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.oc3;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class l implements p3d {
    public static final l a;

    @NotNull
    private static final mhp descriptor;

    static {
        l lVar = new l();
        a = lVar;
        j5m j5mVar = new j5m("com.yandex.plus.pay.internal.feature.offers.PlusPayOfferDetailsConfiguration", lVar, 3);
        j5mVar.k("requestSilentInvoiceAvailability", false);
        j5mVar.k("requestPaymentMethodsGroups", false);
        j5mVar.k("additionalOffers", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        t9f C = ff7.C(m.a);
        oc3 oc3Var = oc3.a;
        return new t9f[]{oc3Var, oc3Var, C};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        boolean z;
        boolean z2;
        int i;
        r rVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            z = c.D(mhpVar, 0);
            z2 = c.D(mhpVar, 1);
            rVar = (r) c.n(mhpVar, 2, m.a, null);
            i = 7;
        } else {
            boolean z3 = true;
            z = false;
            int i2 = 0;
            r rVar2 = null;
            boolean z4 = false;
            while (z3) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z3 = false;
                } else if (w == 0) {
                    z = c.D(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    z4 = c.D(mhpVar, 1);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    rVar2 = (r) c.n(mhpVar, 2, m.a, rVar2);
                    i2 |= 4;
                }
            }
            z2 = z4;
            i = i2;
            rVar = rVar2;
        }
        c.b(mhpVar);
        return new t(i, z, z2, rVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        t tVar = (t) obj;
        l6bVar.getClass();
        tVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.j(mhpVar, 0, tVar.a);
        c.j(mhpVar, 1, tVar.b);
        c.q(mhpVar, 2, m.a, tVar.c);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
