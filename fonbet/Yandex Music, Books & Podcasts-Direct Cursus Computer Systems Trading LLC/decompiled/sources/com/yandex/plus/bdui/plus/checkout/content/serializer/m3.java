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
public final /* synthetic */ class m3 implements p3d {
    public static final m3 a;

    @NotNull
    private static final mhp descriptor;

    static {
        m3 m3Var = new m3();
        a = m3Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayCounterOffersContentSerializer.PayloadDto", m3Var, 2);
        j5mVar.k("data", false);
        j5mVar.k("actions", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{j3.a, a3.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        l3 l3Var;
        c3 c3Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        l3 l3Var2 = null;
        if (c.m()) {
            l3Var = (l3) c.z(mhpVar, 0, j3.a, null);
            c3Var = (c3) c.z(mhpVar, 1, a3.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            c3 c3Var2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    l3Var2 = (l3) c.z(mhpVar, 0, j3.a, l3Var2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    c3Var2 = (c3) c.z(mhpVar, 1, a3.a, c3Var2);
                    i2 |= 2;
                }
            }
            i = i2;
            l3Var = l3Var2;
            c3Var = c3Var2;
        }
        c.b(mhpVar);
        return new o3(i, l3Var, c3Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        o3 o3Var = (o3) obj;
        l6bVar.getClass();
        o3Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, j3.a, o3Var.a);
        c.k(mhpVar, 1, a3.a, o3Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
