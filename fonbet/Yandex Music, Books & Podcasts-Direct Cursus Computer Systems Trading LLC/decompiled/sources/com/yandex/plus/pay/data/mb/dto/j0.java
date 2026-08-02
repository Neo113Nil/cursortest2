package com.yandex.plus.pay.data.mb.dto;

import defpackage.cqe;
import defpackage.eg7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class j0 implements p3d {
    public static final j0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        j0 j0Var = new j0();
        a = j0Var;
        j5m j5mVar = new j5m("IntroPlan", j0Var, 3);
        j5mVar.k("price", false);
        j5mVar.k("period", false);
        j5mVar.k("repeatCount", false);
        j5mVar.l(new p0());
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{x0.a, tkr.a, cqe.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        int i2;
        z0 z0Var;
        String str;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            z0Var = (z0) c.z(mhpVar, 0, x0.a, null);
            str = c.g(mhpVar, 1);
            i = c.k(mhpVar, 2);
            i2 = 7;
        } else {
            boolean z = true;
            int i3 = 0;
            z0 z0Var2 = null;
            String str2 = null;
            int i4 = 0;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    z0Var2 = (z0) c.z(mhpVar, 0, x0.a, z0Var2);
                    i4 |= 1;
                } else if (w == 1) {
                    str2 = c.g(mhpVar, 1);
                    i4 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    i3 = c.k(mhpVar, 2);
                    i4 |= 4;
                }
            }
            i = i3;
            i2 = i4;
            z0Var = z0Var2;
            str = str2;
        }
        c.b(mhpVar);
        return new l0(i2, z0Var, str, i);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        l0 l0Var = (l0) obj;
        l6bVar.getClass();
        l0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, x0.a, l0Var.a);
        c.p(mhpVar, 1, l0Var.b);
        c.A(2, l0Var.c, mhpVar);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
