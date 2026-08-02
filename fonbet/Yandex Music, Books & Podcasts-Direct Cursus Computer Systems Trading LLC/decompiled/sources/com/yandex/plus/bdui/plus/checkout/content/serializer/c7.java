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
public final /* synthetic */ class c7 implements p3d {
    public static final c7 a;

    @NotNull
    private static final mhp descriptor;

    static {
        c7 c7Var = new c7();
        a = c7Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPaySuccessContentSerializer.SuccessDto", c7Var, 1);
        j5mVar.k("payload", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{z6.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        b7 b7Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        b7 b7Var2 = null;
        if (c.m()) {
            b7Var = (b7) c.z(mhpVar, 0, z6.a, null);
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
                    b7Var2 = (b7) c.z(mhpVar, 0, z6.a, b7Var2);
                    i2 = 1;
                }
            }
            b7Var = b7Var2;
            i = i2;
        }
        c.b(mhpVar);
        return new e7(i, b7Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        e7 e7Var = (e7) obj;
        l6bVar.getClass();
        e7Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, z6.a, e7Var.a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
