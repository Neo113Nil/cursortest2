package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common;

import defpackage.eg7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.oc3;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tq5;
import defpackage.wq5;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class r implements p3d {
    public static final r a;

    @NotNull
    private static final mhp descriptor;

    static {
        r rVar = new r();
        a = rVar;
        j5m j5mVar = new j5m("com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.ProductDto", rVar, 2);
        j5mVar.k("available", false);
        j5mVar.k("product", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{oc3.a, t.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        boolean z;
        int i;
        d0 d0Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        if (c.m()) {
            z = c.D(mhpVar, 0);
            d0Var = (d0) c.z(mhpVar, 1, t.a, null);
            i = 3;
        } else {
            boolean z2 = true;
            z = false;
            d0 d0Var2 = null;
            int i2 = 0;
            while (z2) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z2 = false;
                } else if (w == 0) {
                    z = c.D(mhpVar, 0);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    d0Var2 = (d0) c.z(mhpVar, 1, t.a, d0Var2);
                    i2 |= 2;
                }
            }
            i = i2;
            d0Var = d0Var2;
        }
        c.b(mhpVar);
        return new e0(i, z, d0Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        e0 e0Var = (e0) obj;
        l6bVar.getClass();
        e0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.j(mhpVar, 0, e0Var.a);
        c.k(mhpVar, 1, t.a, e0Var.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
