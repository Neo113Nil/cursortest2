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
public final /* synthetic */ class y0 implements p3d {
    public static final y0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        y0 y0Var = new y0();
        a = y0Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkCoordinatesModel", y0Var, 3);
        j5mVar.k("latitude", false);
        j5mVar.k("longitude", false);
        j5mVar.k("accuracy", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        n9a n9aVar = n9a.a;
        return new t9f[]{n9aVar, n9aVar, n9aVar};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        double d;
        double d2;
        double d3;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            double F = c.F(mhpVar, 0);
            double F2 = c.F(mhpVar, 1);
            d = c.F(mhpVar, 2);
            i = 7;
            d2 = F;
            d3 = F2;
        } else {
            double d4 = 0.0d;
            boolean z = true;
            int i2 = 0;
            double d5 = 0.0d;
            double d6 = 0.0d;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    d5 = c.F(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    d6 = c.F(mhpVar, 1);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    d4 = c.F(mhpVar, 2);
                    i2 |= 4;
                }
            }
            i = i2;
            d = d4;
            d2 = d5;
            d3 = d6;
        }
        c.b(mhpVar);
        return new a1(i, d2, d3, d);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        a1 a1Var = (a1) obj;
        l6bVar.getClass();
        a1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.l(mhpVar, 0, a1Var.a);
        c.l(mhpVar, 1, a1Var.b);
        c.l(mhpVar, 2, a1Var.c);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
