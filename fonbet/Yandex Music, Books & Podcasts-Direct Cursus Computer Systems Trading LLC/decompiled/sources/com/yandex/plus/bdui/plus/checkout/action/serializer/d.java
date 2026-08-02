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
public final /* synthetic */ class d implements p3d {
    public static final d a;

    @NotNull
    private static final mhp descriptor;

    static {
        d dVar = new d();
        a = dVar;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.action.serializer.PlusPayGooglePlayCompletePurchaseActionSerializer.CompleteDto", dVar, 2);
        j5mVar.k("data", false);
        j5mVar.k("actions", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{g.a, a.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        i iVar;
        c cVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        i iVar2 = null;
        if (c.m()) {
            iVar = (i) c.z(mhpVar, 0, g.a, null);
            cVar = (c) c.z(mhpVar, 1, a.a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            c cVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    iVar2 = (i) c.z(mhpVar, 0, g.a, iVar2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    cVar2 = (c) c.z(mhpVar, 1, a.a, cVar2);
                    i2 |= 2;
                }
            }
            i = i2;
            iVar = iVar2;
            cVar = cVar2;
        }
        c.b(mhpVar);
        return new f(i, iVar, cVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        f fVar = (f) obj;
        l6bVar.getClass();
        fVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.k(mhpVar, 0, g.a, fVar.a);
        c.k(mhpVar, 1, a.a, fVar.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
