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
public final /* synthetic */ class c5 implements p3d {
    public static final c5 a;

    @NotNull
    private static final mhp descriptor;

    static {
        c5 c5Var = new c5();
        a = c5Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayPollingContentSerializer.PayloadDto", c5Var, 2);
        j5mVar.k("data", false);
        j5mVar.k("actions", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{z4.a, w4.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        b5 b5Var;
        y4 y4Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        b5 b5Var2 = null;
        if (c.m()) {
            b5Var = (b5) c.z(mhpVar, 0, z4.a, null);
            y4Var = (y4) c.z(mhpVar, 1, w4.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            y4 y4Var2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    b5Var2 = (b5) c.z(mhpVar, 0, z4.a, b5Var2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    y4Var2 = (y4) c.z(mhpVar, 1, w4.a, y4Var2);
                    i2 |= 2;
                }
            }
            i = i2;
            b5Var = b5Var2;
            y4Var = y4Var2;
        }
        c.b(mhpVar);
        return new e5(i, b5Var, y4Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        e5 e5Var = (e5) obj;
        l6bVar.getClass();
        e5Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, z4.a, e5Var.a);
        c.k(mhpVar, 1, w4.a, e5Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
