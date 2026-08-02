package com.yandex.plus.bdui.plus.checkout.action.serializer;

import defpackage.eg7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.oc3;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class d0 implements p3d {
    public static final d0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        d0 d0Var = new d0();
        a = d0Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.action.serializer.PlusPayOpenUrlActionSerializer.DataDto", d0Var, 2);
        j5mVar.k("url", false);
        j5mVar.k("authorize", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{tkr.a, oc3.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        String str;
        boolean z;
        int i;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            str = c.g(mhpVar, 0);
            z = c.D(mhpVar, 1);
            i = 3;
        } else {
            str = null;
            boolean z2 = true;
            boolean z3 = false;
            int i2 = 0;
            while (z2) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z2 = false;
                } else if (w == 0) {
                    str = c.g(mhpVar, 0);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    z3 = c.D(mhpVar, 1);
                    i2 |= 2;
                }
            }
            z = z3;
            i = i2;
        }
        c.b(mhpVar);
        return new f0(i, str, z);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        f0 f0Var = (f0) obj;
        l6bVar.getClass();
        f0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        String str = f0Var.a;
        boolean z = f0Var.b;
        c.p(mhpVar, 0, str);
        if (c.e(mhpVar) || !z) {
            c.j(mhpVar, 1, z);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
