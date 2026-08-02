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
public final /* synthetic */ class k6 implements p3d {
    public static final k6 a;

    @NotNull
    private static final mhp descriptor;

    static {
        k6 k6Var = new k6();
        a = k6Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayPurchaseContentSerializer.PayloadDto", k6Var, 2);
        j5mVar.k("data", false);
        j5mVar.k("actions", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{c6.a, z5.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        j6 j6Var;
        b6 b6Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        j6 j6Var2 = null;
        if (c.m()) {
            j6Var = (j6) c.z(mhpVar, 0, c6.a, null);
            b6Var = (b6) c.z(mhpVar, 1, z5.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            b6 b6Var2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    j6Var2 = (j6) c.z(mhpVar, 0, c6.a, j6Var2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    b6Var2 = (b6) c.z(mhpVar, 1, z5.a, b6Var2);
                    i2 |= 2;
                }
            }
            i = i2;
            j6Var = j6Var2;
            b6Var = b6Var2;
        }
        c.b(mhpVar);
        return new m6(i, j6Var, b6Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        m6 m6Var = (m6) obj;
        l6bVar.getClass();
        m6Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, c6.a, m6Var.a);
        c.k(mhpVar, 1, z5.a, m6Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
