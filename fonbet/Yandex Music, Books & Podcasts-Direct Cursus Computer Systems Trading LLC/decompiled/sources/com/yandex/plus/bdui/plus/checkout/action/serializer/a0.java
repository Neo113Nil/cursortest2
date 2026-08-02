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
public final /* synthetic */ class a0 implements p3d {
    public static final a0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        a0 a0Var = new a0();
        a = a0Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.action.serializer.PlusPayGooglePlayRestorePurchasesActionSerializer.RestorePurchasesDto", a0Var, 1);
        j5mVar.k("actions", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{x.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        z zVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        int i = 1;
        z zVar2 = null;
        if (c.m()) {
            zVar = (z) c.z(mhpVar, 0, x.a, null);
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
                    zVar2 = (z) c.z(mhpVar, 0, x.a, zVar2);
                    i2 = 1;
                }
            }
            zVar = zVar2;
            i = i2;
        }
        c.b(mhpVar);
        return new c0(i, zVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        c0 c0Var = (c0) obj;
        l6bVar.getClass();
        c0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, x.a, c0Var.a);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
