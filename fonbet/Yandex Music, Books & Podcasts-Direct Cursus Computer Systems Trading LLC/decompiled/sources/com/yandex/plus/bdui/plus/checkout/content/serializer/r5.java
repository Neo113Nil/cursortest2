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
public final /* synthetic */ class r5 implements p3d {
    public static final r5 a;

    @NotNull
    private static final mhp descriptor;

    static {
        r5 r5Var = new r5();
        a = r5Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayPresaleContentSerializer.PayloadDto", r5Var, 2);
        j5mVar.k("data", false);
        j5mVar.k("actions", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{o5.a, l5.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        q5 q5Var;
        n5 n5Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        q5 q5Var2 = null;
        if (c.m()) {
            q5Var = (q5) c.z(mhpVar, 0, o5.a, null);
            n5Var = (n5) c.z(mhpVar, 1, l5.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            n5 n5Var2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    q5Var2 = (q5) c.z(mhpVar, 0, o5.a, q5Var2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    n5Var2 = (n5) c.z(mhpVar, 1, l5.a, n5Var2);
                    i2 |= 2;
                }
            }
            i = i2;
            q5Var = q5Var2;
            n5Var = n5Var2;
        }
        c.b(mhpVar);
        return new t5(i, q5Var, n5Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        t5 t5Var = (t5) obj;
        l6bVar.getClass();
        t5Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, o5.a, t5Var.a);
        c.k(mhpVar, 1, l5.a, t5Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
