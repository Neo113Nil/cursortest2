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
public final /* synthetic */ class u implements p3d {
    public static final u a;

    @NotNull
    private static final mhp descriptor;

    static {
        u uVar = new u();
        a = uVar;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.action.serializer.PlusPayGooglePlayPurchaseActionSerializer.PurchaseDto", uVar, 2);
        j5mVar.k("data", false);
        j5mVar.k("actions", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{m.a, j.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        t tVar;
        l lVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        t tVar2 = null;
        if (c.m()) {
            tVar = (t) c.z(mhpVar, 0, m.a, null);
            lVar = (l) c.z(mhpVar, 1, j.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            l lVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    tVar2 = (t) c.z(mhpVar, 0, m.a, tVar2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    lVar2 = (l) c.z(mhpVar, 1, j.a, lVar2);
                    i2 |= 2;
                }
            }
            i = i2;
            tVar = tVar2;
            lVar = lVar2;
        }
        c.b(mhpVar);
        return new w(i, tVar, lVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        w wVar = (w) obj;
        l6bVar.getClass();
        wVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, m.a, wVar.a);
        c.k(mhpVar, 1, j.a, wVar.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
