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
public final /* synthetic */ class t4 implements p3d {
    public static final t4 a;

    @NotNull
    private static final mhp descriptor;

    static {
        t4 t4Var = new t4();
        a = t4Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayGetInAppInfoContentSerializer.PayloadDto", t4Var, 2);
        j5mVar.k("data", false);
        j5mVar.k("actions", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{n4.a, k4.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        p4 p4Var;
        m4 m4Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        p4 p4Var2 = null;
        if (c.m()) {
            p4Var = (p4) c.z(mhpVar, 0, n4.a, null);
            m4Var = (m4) c.z(mhpVar, 1, k4.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            m4 m4Var2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    p4Var2 = (p4) c.z(mhpVar, 0, n4.a, p4Var2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    m4Var2 = (m4) c.z(mhpVar, 1, k4.a, m4Var2);
                    i2 |= 2;
                }
            }
            i = i2;
            p4Var = p4Var2;
            m4Var = m4Var2;
        }
        c.b(mhpVar);
        return new v4(i, p4Var, m4Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        v4 v4Var = (v4) obj;
        l6bVar.getClass();
        v4Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, n4.a, v4Var.a);
        c.k(mhpVar, 1, k4.a, v4Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
