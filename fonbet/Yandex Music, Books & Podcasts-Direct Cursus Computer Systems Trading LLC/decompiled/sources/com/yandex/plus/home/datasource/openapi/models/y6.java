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
public final /* synthetic */ class y6 implements p3d {
    public static final y6 a;

    @NotNull
    private static final mhp descriptor;

    static {
        y6 y6Var = new y6();
        a = y6Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkSdkConfigurationResponseModel", y6Var, 2);
        j5mVar.k("error", true);
        j5mVar.k("data", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{ff7.C(z2.a), ff7.C(v6.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        b3 b3Var;
        x6 x6Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        b3 b3Var2 = null;
        if (c.m()) {
            b3Var = (b3) c.n(mhpVar, 0, z2.a, null);
            x6Var = (x6) c.n(mhpVar, 1, v6.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            x6 x6Var2 = null;
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
                    x6Var2 = (x6) c.n(mhpVar, 1, v6.a, x6Var2);
                    i2 |= 2;
                }
            }
            i = i2;
            b3Var = b3Var2;
            x6Var = x6Var2;
        }
        c.b(mhpVar);
        return new a7(i, b3Var, x6Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        a7 a7Var = (a7) obj;
        l6bVar.getClass();
        a7Var.getClass();
        x6 x6Var = a7Var.b;
        b3 b3Var = a7Var.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        if (c.e(mhpVar) || b3Var != null) {
            c.q(mhpVar, 0, z2.a, b3Var);
        }
        if (c.e(mhpVar) || x6Var != null) {
            c.q(mhpVar, 1, v6.a, x6Var);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
