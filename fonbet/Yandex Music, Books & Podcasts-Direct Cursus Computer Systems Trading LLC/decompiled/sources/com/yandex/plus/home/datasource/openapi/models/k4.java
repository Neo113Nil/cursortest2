package com.yandex.plus.home.datasource.openapi.models;

import defpackage.cqe;
import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class k4 implements p3d {
    public static final k4 a;

    @NotNull
    private static final mhp descriptor;

    static {
        k4 k4Var = new k4();
        a = k4Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkLocationModel", k4Var, 3);
        j5mVar.k("geoId", true);
        j5mVar.k("coordinates", true);
        j5mVar.k("geoPinPosition", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        t9f C = ff7.C(cqe.a);
        y0 y0Var = y0.a;
        return new t9f[]{C, ff7.C(y0Var), ff7.C(y0Var)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        Integer num;
        a1 a1Var;
        a1 a1Var2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        Integer num2 = null;
        if (c.m()) {
            num = (Integer) c.n(mhpVar, 0, cqe.a, null);
            y0 y0Var = y0.a;
            a1Var = (a1) c.n(mhpVar, 1, y0Var, null);
            a1Var2 = (a1) c.n(mhpVar, 2, y0Var, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            a1 a1Var3 = null;
            a1 a1Var4 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    num2 = (Integer) c.n(mhpVar, 0, cqe.a, num2);
                    i2 |= 1;
                } else if (w == 1) {
                    a1Var3 = (a1) c.n(mhpVar, 1, y0.a, a1Var3);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    a1Var4 = (a1) c.n(mhpVar, 2, y0.a, a1Var4);
                    i2 |= 4;
                }
            }
            i = i2;
            num = num2;
            a1Var = a1Var3;
            a1Var2 = a1Var4;
        }
        c.b(mhpVar);
        return new m4(i, num, a1Var, a1Var2);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        m4 m4Var = (m4) obj;
        l6bVar.getClass();
        m4Var.getClass();
        a1 a1Var = m4Var.c;
        a1 a1Var2 = m4Var.b;
        Integer num = m4Var.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        if (c.e(mhpVar) || num != null) {
            c.q(mhpVar, 0, cqe.a, num);
        }
        if (c.e(mhpVar) || a1Var2 != null) {
            c.q(mhpVar, 1, y0.a, a1Var2);
        }
        if (c.e(mhpVar) || a1Var != null) {
            c.q(mhpVar, 2, y0.a, a1Var);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
