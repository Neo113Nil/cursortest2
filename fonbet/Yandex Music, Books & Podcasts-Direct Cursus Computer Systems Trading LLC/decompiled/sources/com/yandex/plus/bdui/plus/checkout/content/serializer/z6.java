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
public final /* synthetic */ class z6 implements p3d {
    public static final z6 a;

    @NotNull
    private static final mhp descriptor;

    static {
        z6 z6Var = new z6();
        a = z6Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPaySuccessContentSerializer.PayloadDto", z6Var, 2);
        j5mVar.k("data", false);
        j5mVar.k("actions", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{t6.a, q6.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        v6 v6Var;
        s6 s6Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        v6 v6Var2 = null;
        if (c.m()) {
            v6Var = (v6) c.z(mhpVar, 0, t6.a, null);
            s6Var = (s6) c.z(mhpVar, 1, q6.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            s6 s6Var2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    v6Var2 = (v6) c.z(mhpVar, 0, t6.a, v6Var2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    s6Var2 = (s6) c.z(mhpVar, 1, q6.a, s6Var2);
                    i2 |= 2;
                }
            }
            i = i2;
            v6Var = v6Var2;
            s6Var = s6Var2;
        }
        c.b(mhpVar);
        return new b7(i, v6Var, s6Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        b7 b7Var = (b7) obj;
        l6bVar.getClass();
        b7Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, t6.a, b7Var.a);
        c.k(mhpVar, 1, q6.a, b7Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
