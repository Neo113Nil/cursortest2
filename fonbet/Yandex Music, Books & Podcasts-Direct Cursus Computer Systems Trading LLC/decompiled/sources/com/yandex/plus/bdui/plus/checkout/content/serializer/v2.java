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
public final /* synthetic */ class v2 implements p3d {
    public static final v2 a;

    @NotNull
    private static final mhp descriptor;

    static {
        v2 v2Var = new v2();
        a = v2Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayClosingOfferContentSerializer.PayloadDto", v2Var, 2);
        j5mVar.k("data", false);
        j5mVar.k("actions", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{s2.a, j2.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        u2 u2Var;
        l2 l2Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        u2 u2Var2 = null;
        if (c.m()) {
            u2Var = (u2) c.z(mhpVar, 0, s2.a, null);
            l2Var = (l2) c.z(mhpVar, 1, j2.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            l2 l2Var2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    u2Var2 = (u2) c.z(mhpVar, 0, s2.a, u2Var2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    l2Var2 = (l2) c.z(mhpVar, 1, j2.a, l2Var2);
                    i2 |= 2;
                }
            }
            i = i2;
            u2Var = u2Var2;
            l2Var = l2Var2;
        }
        c.b(mhpVar);
        return new x2(i, u2Var, l2Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        x2 x2Var = (x2) obj;
        l6bVar.getClass();
        x2Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, s2.a, x2Var.a);
        c.k(mhpVar, 1, j2.a, x2Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
