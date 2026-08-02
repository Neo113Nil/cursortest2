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
public final /* synthetic */ class b0 implements p3d {
    public static final b0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        b0 b0Var = new b0();
        a = b0Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayButtonContentSerializer.PayloadDto", b0Var, 2);
        j5mVar.k("data", false);
        j5mVar.k("actions", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{y.a, s.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        a0 a0Var;
        u uVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        a0 a0Var2 = null;
        if (c.m()) {
            a0Var = (a0) c.z(mhpVar, 0, y.a, null);
            uVar = (u) c.z(mhpVar, 1, s.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            u uVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    a0Var2 = (a0) c.z(mhpVar, 0, y.a, a0Var2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    uVar2 = (u) c.z(mhpVar, 1, s.a, uVar2);
                    i2 |= 2;
                }
            }
            i = i2;
            a0Var = a0Var2;
            uVar = uVar2;
        }
        c.b(mhpVar);
        return new d0(i, a0Var, uVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        d0 d0Var = (d0) obj;
        l6bVar.getClass();
        d0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, y.a, d0Var.a);
        c.k(mhpVar, 1, s.a, d0Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
