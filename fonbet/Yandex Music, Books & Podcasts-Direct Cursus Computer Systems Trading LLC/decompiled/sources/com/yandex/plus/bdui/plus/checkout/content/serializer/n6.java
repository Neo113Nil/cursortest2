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
public final /* synthetic */ class n6 implements p3d {
    public static final n6 a;

    @NotNull
    private static final mhp descriptor;

    static {
        n6 n6Var = new n6();
        a = n6Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayPurchaseContentSerializer.PurchaseDto", n6Var, 1);
        j5mVar.k("payload", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{k6.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        m6 m6Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        m6 m6Var2 = null;
        if (c.m()) {
            m6Var = (m6) c.z(mhpVar, 0, k6.a, null);
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
                    m6Var2 = (m6) c.z(mhpVar, 0, k6.a, m6Var2);
                    i2 = 1;
                }
            }
            m6Var = m6Var2;
            i = i2;
        }
        c.b(mhpVar);
        return new p6(i, m6Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        p6 p6Var = (p6) obj;
        l6bVar.getClass();
        p6Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, k6.a, p6Var.a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
