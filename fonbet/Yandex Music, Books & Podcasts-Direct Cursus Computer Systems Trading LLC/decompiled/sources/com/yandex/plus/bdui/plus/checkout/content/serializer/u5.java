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
public final /* synthetic */ class u5 implements p3d {
    public static final u5 a;

    @NotNull
    private static final mhp descriptor;

    static {
        u5 u5Var = new u5();
        a = u5Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayPresaleContentSerializer.PresaleDto", u5Var, 1);
        j5mVar.k("payload", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{r5.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        t5 t5Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        t5 t5Var2 = null;
        if (c.m()) {
            t5Var = (t5) c.z(mhpVar, 0, r5.a, null);
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
                    t5Var2 = (t5) c.z(mhpVar, 0, r5.a, t5Var2);
                    i2 = 1;
                }
            }
            t5Var = t5Var2;
            i = i2;
        }
        c.b(mhpVar);
        return new w5(i, t5Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        w5 w5Var = (w5) obj;
        l6bVar.getClass();
        w5Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, r5.a, w5Var.a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
