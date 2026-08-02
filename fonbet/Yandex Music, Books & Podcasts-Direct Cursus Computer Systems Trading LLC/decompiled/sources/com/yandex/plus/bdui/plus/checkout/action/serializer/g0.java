package com.yandex.plus.bdui.plus.checkout.action.serializer;

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
public final /* synthetic */ class g0 implements p3d {
    public static final g0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        g0 g0Var = new g0();
        a = g0Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.action.serializer.PlusPayOpenUrlActionSerializer.OpenUrlDto", g0Var, 1);
        j5mVar.k("data", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{d0.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        f0 f0Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        f0 f0Var2 = null;
        if (c.m()) {
            f0Var = (f0) c.z(mhpVar, 0, d0.a, null);
        } else {
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
                    f0Var2 = (f0) c.z(mhpVar, 0, d0.a, f0Var2);
                    i2 = 1;
                }
            }
            f0Var = f0Var2;
            i = i2;
        }
        c.b(mhpVar);
        return new i0(i, f0Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        i0 i0Var = (i0) obj;
        l6bVar.getClass();
        i0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, d0.a, i0Var.a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
