package com.yandex.plus.home.datasource.openapi.models;

import defpackage.eg7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.n9a;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class f3 implements p3d {
    public static final f3 a;

    @NotNull
    private static final mhp descriptor;

    static {
        f3 f3Var = new f3();
        a = f3Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkGradientPointModel", f3Var, 2);
        j5mVar.k("x", false);
        j5mVar.k("y", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        n9a n9aVar = n9a.a;
        return new t9f[]{n9aVar, n9aVar};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        double d;
        double d2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            double F = c.F(mhpVar, 0);
            d = c.F(mhpVar, 1);
            d2 = F;
            i = 3;
        } else {
            double d3 = 0.0d;
            boolean z = true;
            int i2 = 0;
            double d4 = 0.0d;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    d4 = c.F(mhpVar, 0);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    d3 = c.F(mhpVar, 1);
                    i2 |= 2;
                }
            }
            i = i2;
            d = d3;
            d2 = d4;
        }
        c.b(mhpVar);
        return new h3(i, d2, d);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        h3 h3Var = (h3) obj;
        l6bVar.getClass();
        h3Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.l(mhpVar, 0, h3Var.a);
        c.l(mhpVar, 1, h3Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
