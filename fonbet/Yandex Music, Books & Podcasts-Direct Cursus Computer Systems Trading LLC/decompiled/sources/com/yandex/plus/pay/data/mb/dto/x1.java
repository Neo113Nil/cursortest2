package com.yandex.plus.pay.data.mb.dto;

import defpackage.eg7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.mvg;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class x1 implements p3d {
    public static final x1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        x1 x1Var = new x1();
        a = x1Var;
        j5m j5mVar = new j5m("com.yandex.plus.pay.data.mb.dto.FeatureDto", x1Var, 2);
        j5mVar.k("end", false);
        j5mVar.k("feature", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{mvg.a, tkr.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        String str;
        int i;
        long j;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            j = c.q(mhpVar, 0);
            str = c.g(mhpVar, 1);
            i = 3;
        } else {
            str = null;
            boolean z = true;
            long j2 = 0;
            int i2 = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    j2 = c.q(mhpVar, 0);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    str = c.g(mhpVar, 1);
                    i2 |= 2;
                }
            }
            i = i2;
            j = j2;
        }
        c.b(mhpVar);
        return new z1(str, i, j);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        z1 z1Var = (z1) obj;
        l6bVar.getClass();
        z1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.g(mhpVar, 0, z1Var.a);
        c.p(mhpVar, 1, z1Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
