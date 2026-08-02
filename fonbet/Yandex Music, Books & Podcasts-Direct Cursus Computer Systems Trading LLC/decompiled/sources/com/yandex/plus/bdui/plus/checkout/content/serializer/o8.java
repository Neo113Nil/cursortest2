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
public final /* synthetic */ class o8 implements p3d {
    public static final o8 a;

    @NotNull
    private static final mhp descriptor;

    static {
        o8 o8Var = new o8();
        a = o8Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayUserAddNewSbpContentSerializer.PayloadDto", o8Var, 2);
        j5mVar.k("data", false);
        j5mVar.k("actions", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{l8.a, i8.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        n8 n8Var;
        k8 k8Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        n8 n8Var2 = null;
        if (c.m()) {
            n8Var = (n8) c.z(mhpVar, 0, l8.a, null);
            k8Var = (k8) c.z(mhpVar, 1, i8.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            k8 k8Var2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    n8Var2 = (n8) c.z(mhpVar, 0, l8.a, n8Var2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    k8Var2 = (k8) c.z(mhpVar, 1, i8.a, k8Var2);
                    i2 |= 2;
                }
            }
            i = i2;
            n8Var = n8Var2;
            k8Var = k8Var2;
        }
        c.b(mhpVar);
        return new q8(i, n8Var, k8Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        q8 q8Var = (q8) obj;
        l6bVar.getClass();
        q8Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, l8.a, q8Var.a);
        c.k(mhpVar, 1, i8.a, q8Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
