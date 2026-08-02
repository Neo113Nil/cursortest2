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
public final /* synthetic */ class c8 implements p3d {
    public static final c8 a;

    @NotNull
    private static final mhp descriptor;

    static {
        c8 c8Var = new c8();
        a = c8Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayUserAddNewCardContentSerializer.PayloadDto", c8Var, 2);
        j5mVar.k("data", false);
        j5mVar.k("actions", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{z7.a, w7.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        b8 b8Var;
        y7 y7Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        b8 b8Var2 = null;
        if (c.m()) {
            b8Var = (b8) c.z(mhpVar, 0, z7.a, null);
            y7Var = (y7) c.z(mhpVar, 1, w7.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            y7 y7Var2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    b8Var2 = (b8) c.z(mhpVar, 0, z7.a, b8Var2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    y7Var2 = (y7) c.z(mhpVar, 1, w7.a, y7Var2);
                    i2 |= 2;
                }
            }
            i = i2;
            b8Var = b8Var2;
            y7Var = y7Var2;
        }
        c.b(mhpVar);
        return new e8(i, b8Var, y7Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        e8 e8Var = (e8) obj;
        l6bVar.getClass();
        e8Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, z7.a, e8Var.a);
        c.k(mhpVar, 1, w7.a, e8Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
