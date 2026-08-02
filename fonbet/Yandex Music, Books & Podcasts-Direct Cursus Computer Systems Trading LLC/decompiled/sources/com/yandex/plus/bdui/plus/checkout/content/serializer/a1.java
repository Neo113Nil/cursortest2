package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.eg7;
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

/* loaded from: classes4.dex */
public final /* synthetic */ class a1 implements p3d {
    public static final a1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        a1 a1Var = new a1();
        a = a1Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayCheckoutContentSerializer.PayloadDto", a1Var, 2);
        j5mVar.k("data", false);
        j5mVar.k("actions", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{r0.a, e0.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        t0 t0Var;
        g0 g0Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        t0 t0Var2 = null;
        if (c.m()) {
            t0Var = (t0) c.z(mhpVar, 0, r0.a, null);
            g0Var = (g0) c.z(mhpVar, 1, e0.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            g0 g0Var2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    t0Var2 = (t0) c.z(mhpVar, 0, r0.a, t0Var2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    g0Var2 = (g0) c.z(mhpVar, 1, e0.a, g0Var2);
                    i2 |= 2;
                }
            }
            i = i2;
            t0Var = t0Var2;
            g0Var = g0Var2;
        }
        c.b(mhpVar);
        return new c1(i, t0Var, g0Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        c1 c1Var = (c1) obj;
        l6bVar.getClass();
        c1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, r0.a, c1Var.a);
        c.k(mhpVar, 1, e0.a, c1Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
