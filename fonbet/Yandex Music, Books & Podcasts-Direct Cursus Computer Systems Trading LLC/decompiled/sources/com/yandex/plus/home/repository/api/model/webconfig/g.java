package com.yandex.plus.home.repository.api.model.webconfig;

import defpackage.arf;
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
public final /* synthetic */ class g implements p3d {
    public static final g a;

    @NotNull
    private static final mhp descriptor;

    static {
        g gVar = new g();
        a = gVar;
        j5m j5mVar = new j5m("com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration.PayInfo", gVar, 4);
        j5mVar.k("legalInfo", false);
        j5mVar.k("oneClickLegalInfo", false);
        j5mVar.k("textColor", false);
        j5mVar.k("backgroundColor", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{ff7.C(i.a), ff7.C(m.a), com.yandex.plus.core.data.common.a.a, p.e[3].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        k kVar;
        o oVar;
        com.yandex.plus.core.data.common.c cVar;
        com.yandex.plus.core.data.common.v vVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = p.e;
        k kVar2 = null;
        if (c.m()) {
            k kVar3 = (k) c.n(mhpVar, 0, i.a, null);
            o oVar2 = (o) c.n(mhpVar, 1, m.a, null);
            com.yandex.plus.core.data.common.c cVar2 = (com.yandex.plus.core.data.common.c) c.z(mhpVar, 2, com.yandex.plus.core.data.common.a.a, null);
            vVar = (com.yandex.plus.core.data.common.v) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            kVar = kVar3;
            cVar = cVar2;
            i = 15;
            oVar = oVar2;
        } else {
            boolean z = true;
            int i2 = 0;
            o oVar3 = null;
            com.yandex.plus.core.data.common.c cVar3 = null;
            com.yandex.plus.core.data.common.v vVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    kVar2 = (k) c.n(mhpVar, 0, i.a, kVar2);
                    i2 |= 1;
                } else if (w == 1) {
                    oVar3 = (o) c.n(mhpVar, 1, m.a, oVar3);
                    i2 |= 2;
                } else if (w == 2) {
                    cVar3 = (com.yandex.plus.core.data.common.c) c.z(mhpVar, 2, com.yandex.plus.core.data.common.a.a, cVar3);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    vVar2 = (com.yandex.plus.core.data.common.v) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), vVar2);
                    i2 |= 8;
                }
            }
            i = i2;
            kVar = kVar2;
            oVar = oVar3;
            cVar = cVar3;
            vVar = vVar2;
        }
        c.b(mhpVar);
        return new p(i, kVar, oVar, cVar, vVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        p pVar = (p) obj;
        l6bVar.getClass();
        pVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = p.e;
        c.q(mhpVar, 0, i.a, pVar.a);
        c.q(mhpVar, 1, m.a, pVar.b);
        c.k(mhpVar, 2, com.yandex.plus.core.data.common.a.a, pVar.c);
        c.k(mhpVar, 3, (t9f) arfVarArr[3].getValue(), pVar.d);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
