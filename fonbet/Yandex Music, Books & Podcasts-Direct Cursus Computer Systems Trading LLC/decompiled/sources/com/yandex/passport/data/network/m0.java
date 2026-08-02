package com.yandex.passport.data.network;

import defpackage.arf;
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
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class m0 implements p3d {
    public static final m0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        m0 m0Var = new m0();
        a = m0Var;
        j5m j5mVar = new j5m("com.yandex.passport.data.network.CheckLinkageRequest.Result", m0Var, 4);
        j5mVar.k("status", false);
        j5mVar.k("is_account_bound", false);
        j5mVar.k("is_possible", false);
        j5mVar.k("offer_delays", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = o0.e;
        oc3 oc3Var = oc3.a;
        return new t9f[]{tkr.a, oc3Var, oc3Var, arfVarArr[3].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        boolean z;
        int i;
        boolean z2;
        String str;
        List list;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = o0.e;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            boolean D = c.D(mhpVar, 1);
            boolean D2 = c.D(mhpVar, 2);
            list = (List) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            str = g;
            z = D2;
            i = 15;
            z2 = D;
        } else {
            boolean z3 = true;
            boolean z4 = false;
            boolean z5 = false;
            String str2 = null;
            List list2 = null;
            int i2 = 0;
            while (z3) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z3 = false;
                } else if (w == 0) {
                    str2 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    z5 = c.D(mhpVar, 1);
                    i2 |= 2;
                } else if (w == 2) {
                    z4 = c.D(mhpVar, 2);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    list2 = (List) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), list2);
                    i2 |= 8;
                }
            }
            z = z4;
            i = i2;
            z2 = z5;
            str = str2;
            list = list2;
        }
        c.b(mhpVar);
        return new o0(i, str, list, z2, z);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        o0 o0Var = (o0) obj;
        l6bVar.getClass();
        o0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = o0.e;
        c.p(mhpVar, 0, o0Var.a);
        c.j(mhpVar, 1, o0Var.b);
        c.j(mhpVar, 2, o0Var.c);
        c.k(mhpVar, 3, (t9f) arfVarArr[3].getValue(), o0Var.d);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
