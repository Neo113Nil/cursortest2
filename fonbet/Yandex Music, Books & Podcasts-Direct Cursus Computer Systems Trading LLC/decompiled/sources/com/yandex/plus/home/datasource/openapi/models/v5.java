package com.yandex.plus.home.datasource.openapi.models;

import defpackage.arf;
import defpackage.eg7;
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
public final /* synthetic */ class v5 implements p3d {
    public static final v5 a;

    @NotNull
    private static final mhp descriptor;

    static {
        v5 v5Var = new v5();
        a = v5Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkPlusStateModel", v5Var, 2);
        j5mVar.k("balance", false);
        j5mVar.k("plusSubscriptionStatus", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{u.a, y5.c[1].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        x xVar;
        x5 x5Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = y5.c;
        x xVar2 = null;
        if (c.m()) {
            xVar = (x) c.z(mhpVar, 0, u.a, null);
            x5Var = (x5) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            x5 x5Var2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    xVar2 = (x) c.z(mhpVar, 0, u.a, xVar2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    x5Var2 = (x5) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), x5Var2);
                    i2 |= 2;
                }
            }
            i = i2;
            xVar = xVar2;
            x5Var = x5Var2;
        }
        c.b(mhpVar);
        return new y5(i, xVar, x5Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        y5 y5Var = (y5) obj;
        l6bVar.getClass();
        y5Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = y5.c;
        c.k(mhpVar, 0, u.a, y5Var.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), y5Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
