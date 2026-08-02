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
public final /* synthetic */ class n7 implements p3d {
    public static final n7 a;

    @NotNull
    private static final mhp descriptor;

    static {
        n7 n7Var = new n7();
        a = n7Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayUpsaleContentSerializer.PayloadDto", n7Var, 2);
        j5mVar.k("data", false);
        j5mVar.k("actions", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{k7.a, h7.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        m7 m7Var;
        j7 j7Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        m7 m7Var2 = null;
        if (c.m()) {
            m7Var = (m7) c.z(mhpVar, 0, k7.a, null);
            j7Var = (j7) c.z(mhpVar, 1, h7.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            j7 j7Var2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    m7Var2 = (m7) c.z(mhpVar, 0, k7.a, m7Var2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    j7Var2 = (j7) c.z(mhpVar, 1, h7.a, j7Var2);
                    i2 |= 2;
                }
            }
            i = i2;
            m7Var = m7Var2;
            j7Var = j7Var2;
        }
        c.b(mhpVar);
        return new p7(i, m7Var, j7Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        p7 p7Var = (p7) obj;
        l6bVar.getClass();
        p7Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, k7.a, p7Var.a);
        c.k(mhpVar, 1, h7.a, p7Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
