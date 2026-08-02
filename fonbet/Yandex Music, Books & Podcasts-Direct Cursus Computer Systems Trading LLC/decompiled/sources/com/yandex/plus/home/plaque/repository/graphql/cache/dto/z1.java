package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

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
import io.appmetrica.analytics.rtm.internal.Constants;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class z1 implements p3d {
    public static final z1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        z1 z1Var = new z1();
        a = z1Var;
        j5m j5mVar = new j5m("DoubleValue", z1Var, 1);
        j5mVar.k(Constants.KEY_VALUE, false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{n9a.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        double d;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        if (c.m()) {
            d = c.F(mhpVar, 0);
        } else {
            double d2 = 0.0d;
            boolean z = true;
            int i2 = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else {
                    if (w != 0) {
                        l1j.g(w);
                        return null;
                    }
                    d2 = c.F(mhpVar, 0);
                    i2 = 1;
                }
            }
            d = d2;
            i = i2;
        }
        c.b(mhpVar);
        return new b2(i, d);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        b2 b2Var = (b2) obj;
        l6bVar.getClass();
        b2Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.l(mhpVar, 0, b2Var.a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
