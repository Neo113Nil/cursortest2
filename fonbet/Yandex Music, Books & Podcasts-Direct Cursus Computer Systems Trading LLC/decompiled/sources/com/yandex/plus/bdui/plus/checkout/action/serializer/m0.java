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
public final /* synthetic */ class m0 implements p3d {
    public static final m0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        m0 m0Var = new m0();
        a = m0Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.action.serializer.PlusPayShareActionSerializer.ShareDto", m0Var, 1);
        j5mVar.k("data", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{j0.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        l0 l0Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        l0 l0Var2 = null;
        if (c.m()) {
            l0Var = (l0) c.z(mhpVar, 0, j0.a, null);
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
                    l0Var2 = (l0) c.z(mhpVar, 0, j0.a, l0Var2);
                    i2 = 1;
                }
            }
            l0Var = l0Var2;
            i = i2;
        }
        c.b(mhpVar);
        return new o0(i, l0Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        o0 o0Var = (o0) obj;
        l6bVar.getClass();
        o0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, j0.a, o0Var.a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
