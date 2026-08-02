package com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common;

import defpackage.arf;
import defpackage.cqe;
import defpackage.eg7;
import defpackage.ff7;
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
public final /* synthetic */ class c implements p3d {
    public static final c a;

    @NotNull
    private static final mhp descriptor;

    static {
        c cVar = new c();
        a = cVar;
        j5m j5mVar = new j5m("com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PresentationOptionsDto", cVar, 5);
        j5mVar.k("openFormat", false);
        j5mVar.k("header", true);
        j5mVar.k("modalHeight", true);
        j5mVar.k("shadowAlpha", true);
        j5mVar.k("disableClose", true);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{q.f[0].getValue(), ff7.C(e.a), ff7.C(h.a), ff7.C(cqe.a), ff7.C(oc3.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        n nVar;
        g gVar;
        l lVar;
        Integer num;
        Boolean bool;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = q.f;
        int i2 = 0;
        n nVar2 = null;
        if (c.m()) {
            n nVar3 = (n) c.z(mhpVar, 0, (t9f) arfVarArr[0].getValue(), null);
            g gVar2 = (g) c.n(mhpVar, 1, e.a, null);
            l lVar2 = (l) c.n(mhpVar, 2, h.a, null);
            nVar = nVar3;
            gVar = gVar2;
            num = (Integer) c.n(mhpVar, 3, cqe.a, null);
            bool = (Boolean) c.n(mhpVar, 4, oc3.a, null);
            lVar = lVar2;
            i = 31;
        } else {
            int i3 = 1;
            int i4 = 0;
            g gVar3 = null;
            l lVar3 = null;
            Integer num2 = null;
            Boolean bool2 = null;
            while (i3 != 0) {
                int w = c.w(mhpVar);
                int i5 = i2;
                if (w == -1) {
                    i2 = i5;
                    i3 = i2;
                } else if (w != 0) {
                    if (w == 1) {
                        gVar3 = (g) c.n(mhpVar, 1, e.a, gVar3);
                        i4 |= 2;
                    } else if (w == 2) {
                        lVar3 = (l) c.n(mhpVar, 2, h.a, lVar3);
                        i4 |= 4;
                    } else if (w == 3) {
                        num2 = (Integer) c.n(mhpVar, 3, cqe.a, num2);
                        i4 |= 8;
                    } else {
                        if (w != 4) {
                            l1j.g(w);
                            return null;
                        }
                        bool2 = (Boolean) c.n(mhpVar, 4, oc3.a, bool2);
                        i4 |= 16;
                    }
                    i2 = i5;
                } else {
                    nVar2 = (n) c.z(mhpVar, i5, (t9f) arfVarArr[i5].getValue(), nVar2);
                    i4 |= 1;
                    i2 = i5;
                }
            }
            i = i4;
            nVar = nVar2;
            gVar = gVar3;
            lVar = lVar3;
            num = num2;
            bool = bool2;
        }
        c.b(mhpVar);
        return new q(i, nVar, gVar, lVar, num, bool);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        q qVar = (q) obj;
        l6bVar.getClass();
        qVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        t9f t9fVar = (t9f) q.f[0].getValue();
        n nVar = qVar.a;
        Boolean bool = qVar.e;
        Integer num = qVar.d;
        l lVar = qVar.c;
        g gVar = qVar.b;
        c.k(mhpVar, 0, t9fVar, nVar);
        if (c.e(mhpVar) || gVar != null) {
            c.q(mhpVar, 1, e.a, gVar);
        }
        if (c.e(mhpVar) || lVar != null) {
            c.q(mhpVar, 2, h.a, lVar);
        }
        if (c.e(mhpVar) || num != null) {
            c.q(mhpVar, 3, cqe.a, num);
        }
        if (c.e(mhpVar) || bool != null) {
            c.q(mhpVar, 4, oc3.a, bool);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
