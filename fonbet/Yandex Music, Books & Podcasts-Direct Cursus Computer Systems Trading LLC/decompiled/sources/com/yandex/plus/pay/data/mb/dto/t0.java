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
public final /* synthetic */ class t0 implements p3d {
    public static final t0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        t0 t0Var = new t0();
        a = t0Var;
        j5m j5mVar = new j5m("TrialUntilPlan", t0Var, 1);
        j5mVar.k("until", false);
        j5mVar.l(new p0());
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{mvg.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        long j;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        if (c.m()) {
            j = c.q(mhpVar, 0);
        } else {
            long j2 = 0;
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
                    j2 = c.q(mhpVar, 0);
                    i2 = 1;
                }
            }
            j = j2;
            i = i2;
        }
        c.b(mhpVar);
        return new v0(i, j);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        v0 v0Var = (v0) obj;
        l6bVar.getClass();
        v0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.g(mhpVar, 0, v0Var.a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
