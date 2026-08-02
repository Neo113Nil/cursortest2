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
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class c3 implements p3d {
    public static final c3 a;

    @NotNull
    private static final mhp descriptor;

    static {
        c3 c3Var = new c3();
        a = c3Var;
        j5m j5mVar = new j5m("com.yandex.plus.home.datasource.openapi.models.NetworkGradientColorModel", c3Var, 2);
        j5mVar.k("color", false);
        j5mVar.k("position", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{tkr.a, n9a.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        String str;
        double d;
        int i;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            str = c.g(mhpVar, 0);
            d = c.F(mhpVar, 1);
            i = 3;
        } else {
            str = null;
            double d2 = 0.0d;
            boolean z = true;
            int i2 = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str = c.g(mhpVar, 0);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    d2 = c.F(mhpVar, 1);
                    i2 |= 2;
                }
            }
            d = d2;
            i = i2;
        }
        c.b(mhpVar);
        return new e3(i, str, d);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        e3 e3Var = (e3) obj;
        l6bVar.getClass();
        e3Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.p(mhpVar, 0, e3Var.a);
        c.l(mhpVar, 1, e3Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
