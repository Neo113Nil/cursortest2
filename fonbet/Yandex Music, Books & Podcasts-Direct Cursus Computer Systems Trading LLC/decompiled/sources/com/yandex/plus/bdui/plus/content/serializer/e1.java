package com.yandex.plus.bdui.plus.content.serializer;

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
public final /* synthetic */ class e1 implements p3d {
    public static final e1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        e1 e1Var = new e1();
        a = e1Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.content.serializer.PlusTechnicalErrorFailureContentSerializer.PayloadDto", e1Var, 2);
        j5mVar.k("data", false);
        j5mVar.k("actions", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{y0.a, v0.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        a1 a1Var;
        x0 x0Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        a1 a1Var2 = null;
        if (c.m()) {
            a1Var = (a1) c.z(mhpVar, 0, y0.a, null);
            x0Var = (x0) c.z(mhpVar, 1, v0.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            x0 x0Var2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    a1Var2 = (a1) c.z(mhpVar, 0, y0.a, a1Var2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    x0Var2 = (x0) c.z(mhpVar, 1, v0.a, x0Var2);
                    i2 |= 2;
                }
            }
            i = i2;
            a1Var = a1Var2;
            x0Var = x0Var2;
        }
        c.b(mhpVar);
        return new g1(i, a1Var, x0Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        g1 g1Var = (g1) obj;
        l6bVar.getClass();
        g1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, y0.a, g1Var.a);
        c.k(mhpVar, 1, v0.a, g1Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
