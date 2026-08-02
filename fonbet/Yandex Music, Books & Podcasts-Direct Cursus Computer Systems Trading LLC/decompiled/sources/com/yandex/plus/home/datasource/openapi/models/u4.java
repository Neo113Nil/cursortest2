package com.yandex.plus.home.datasource.openapi.models;

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
public final /* synthetic */ class u4 implements p3d {
    public static final u4 a;

    @NotNull
    private static final mhp descriptor;

    static {
        u4 u4Var = new u4();
        a = u4Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkMissionResponseModel", u4Var, 2);
        j5mVar.k("error", true);
        j5mVar.k("data", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{ff7.C(z2.a), ff7.C(q4.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        b3 b3Var;
        t4 t4Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        b3 b3Var2 = null;
        if (c.m()) {
            b3Var = (b3) c.n(mhpVar, 0, z2.a, null);
            t4Var = (t4) c.n(mhpVar, 1, q4.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            t4 t4Var2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    b3Var2 = (b3) c.n(mhpVar, 0, z2.a, b3Var2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    t4Var2 = (t4) c.n(mhpVar, 1, q4.a, t4Var2);
                    i2 |= 2;
                }
            }
            i = i2;
            b3Var = b3Var2;
            t4Var = t4Var2;
        }
        c.b(mhpVar);
        return new w4(i, b3Var, t4Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        w4 w4Var = (w4) obj;
        l6bVar.getClass();
        w4Var.getClass();
        t4 t4Var = w4Var.b;
        b3 b3Var = w4Var.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        if (c.e(mhpVar) || b3Var != null) {
            c.q(mhpVar, 0, z2.a, b3Var);
        }
        if (c.e(mhpVar) || t4Var != null) {
            c.q(mhpVar, 1, q4.a, t4Var);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
