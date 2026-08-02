package com.yandex.plus.pay.data.acquisition.dto;

import defpackage.eg7;
import defpackage.ff7;
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

/* loaded from: classes5.dex */
public final /* synthetic */ class d implements p3d {
    public static final d a;

    @NotNull
    private static final mhp descriptor;

    static {
        d dVar = new d();
        a = dVar;
        j5m j5mVar = new j5m("com.yandex.plus.pay.data.acquisition.dto.PlusPayAcquisitionGetSmartOffersRequestDto", dVar, 2);
        j5mVar.k("context", false);
        j5mVar.k("geoInfo", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{ff7.C(g.a), ff7.C(a.a)};
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
            iVar = (i) c.n(mhpVar, 0, g.a, null);
            cVar = (c) c.n(mhpVar, 1, a.a, null);
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
                    iVar2 = (i) c.n(mhpVar, 0, g.a, iVar2);
                    i2 |= 1;
                } else {
                    if (w != 1) {
                        l1j.g(w);
                        return null;
                    }
                    cVar2 = (c) c.n(mhpVar, 1, a.a, cVar2);
                    i2 |= 2;
                }
            }
            i = i2;
            iVar = iVar2;
            cVar = cVar2;
        }
        c.b(mhpVar);
        return new m(i, iVar, cVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        m mVar = (m) obj;
        l6bVar.getClass();
        mVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        c.q(mhpVar, 0, g.a, mVar.a);
        c.q(mhpVar, 1, a.a, mVar.b);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
