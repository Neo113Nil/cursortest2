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
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class m0 implements p3d {
    public static final m0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        m0 m0Var = new m0();
        a = m0Var;
        j5m j5mVar = new j5m("IntroUntilPlan", m0Var, 2);
        j5mVar.k("price", false);
        j5mVar.k("until", false);
        j5mVar.l(new p0());
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{x0.a, mvg.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        z0 z0Var;
        int i;
        long j;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            z0Var = (z0) c.z(mhpVar, 0, x0.a, null);
            j = c.q(mhpVar, 1);
            i = 3;
        } else {
            long j2 = 0;
            boolean z = true;
            z0Var = null;
            i = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    z0Var = (z0) c.z(mhpVar, 0, x0.a, z0Var);
                    i |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    j2 = c.q(mhpVar, 1);
                    i |= 2;
                }
            }
            j = j2;
        }
        c.b(mhpVar);
        return new o0(i, z0Var, j);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        o0 o0Var = (o0) obj;
        l6bVar.getClass();
        o0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, x0.a, o0Var.a);
        c.g(mhpVar, 1, o0Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
