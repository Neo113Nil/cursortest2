package com.yandex.passport.data.network;

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

/* loaded from: classes4.dex */
public final /* synthetic */ class jc implements p3d {
    public static final jc a;

    @NotNull
    private static final mhp descriptor;

    static {
        jc jcVar = new jc();
        a = jcVar;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.ValidatePhoneNumberRequest.Result", jcVar, 4);
        j5mVar.k("status", false);
        j5mVar.k("phone_number", false);
        j5mVar.k("valid_for_call", false);
        j5mVar.k("valid_for_flash_call", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        oc3 oc3Var = oc3.a;
        return new t9f[]{tkr.a, fc.a, oc3Var, oc3Var};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        boolean z;
        boolean z2;
        int i;
        String str;
        hc hcVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            hc hcVar2 = (hc) c.z(mhpVar, 1, fc.a, null);
            boolean D = c.D(mhpVar, 2);
            str = g;
            z = c.D(mhpVar, 3);
            z2 = D;
            hcVar = hcVar2;
            i = 15;
        } else {
            boolean z3 = true;
            boolean z4 = false;
            int i2 = 0;
            String str2 = null;
            hc hcVar3 = null;
            boolean z5 = false;
            while (z3) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z3 = false;
                } else if (w == 0) {
                    str2 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    hcVar3 = (hc) c.z(mhpVar, 1, fc.a, hcVar3);
                    i2 |= 2;
                } else if (w == 2) {
                    z5 = c.D(mhpVar, 2);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    z4 = c.D(mhpVar, 3);
                    i2 |= 8;
                }
            }
            z = z4;
            z2 = z5;
            i = i2;
            str = str2;
            hcVar = hcVar3;
        }
        c.b(mhpVar);
        return new lc(i, str, hcVar, z2, z);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        lc lcVar = (lc) obj;
        l6bVar.getClass();
        lcVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.p(mhpVar, 0, lcVar.a);
        c.k(mhpVar, 1, fc.a, lcVar.b);
        c.j(mhpVar, 2, lcVar.c);
        c.j(mhpVar, 3, lcVar.d);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
