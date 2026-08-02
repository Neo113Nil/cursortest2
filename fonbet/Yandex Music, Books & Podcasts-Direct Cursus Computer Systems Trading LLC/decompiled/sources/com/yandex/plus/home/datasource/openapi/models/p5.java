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
public final /* synthetic */ class p5 implements p3d {
    public static final p5 a;

    @NotNull
    private static final mhp descriptor;

    static {
        p5 p5Var = new p5();
        a = p5Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkPlaqueResponseModel", p5Var, 2);
        j5mVar.k("error", true);
        j5mVar.k("data", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{ff7.C(z2.a), ff7.C(h5.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        b3 b3Var;
        j5 j5Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        b3 b3Var2 = null;
        if (c.m()) {
            b3Var = (b3) c.n(mhpVar, 0, z2.a, null);
            j5Var = (j5) c.n(mhpVar, 1, h5.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            j5 j5Var2 = null;
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
                    j5Var2 = (j5) c.n(mhpVar, 1, h5.a, j5Var2);
                    i2 |= 2;
                }
            }
            i = i2;
            b3Var = b3Var2;
            j5Var = j5Var2;
        }
        c.b(mhpVar);
        return new r5(i, b3Var, j5Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        r5 r5Var = (r5) obj;
        l6bVar.getClass();
        r5Var.getClass();
        j5 j5Var = r5Var.b;
        b3 b3Var = r5Var.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        if (c.e(mhpVar) || b3Var != null) {
            c.q(mhpVar, 0, z2.a, b3Var);
        }
        if (c.e(mhpVar) || j5Var != null) {
            c.q(mhpVar, 1, h5.a, j5Var);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
