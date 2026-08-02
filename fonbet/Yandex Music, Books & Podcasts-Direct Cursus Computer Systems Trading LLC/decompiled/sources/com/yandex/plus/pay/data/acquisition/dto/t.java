package com.yandex.plus.pay.data.acquisition.dto;

import defpackage.arf;
import defpackage.c5b;
import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class t implements p3d {
    public static final t a;

    @NotNull
    private static final mhp descriptor;

    static {
        t tVar = new t();
        a = tVar;
        j5m j5mVar = new j5m("com.yandex.plus.pay.data.acquisition.dto.PlusPayAcquisitionOfferDto", tVar, 5);
        j5mVar.k("positionId", false);
        j5mVar.k("forActiveTariff", true);
        j5mVar.k("tariffOffer", true);
        j5mVar.k("optionOffers", true);
        j5mVar.k("asset", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{tkr.a, ff7.C(n.a), ff7.C(c1.a), v.f[3].getValue(), q.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        String str;
        p pVar;
        e1 e1Var;
        List list;
        s sVar;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = v.f;
        String str2 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            p pVar2 = (p) c.n(mhpVar, 1, n.a, null);
            e1 e1Var2 = (e1) c.n(mhpVar, 2, c1.a, null);
            list = (List) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            str = g;
            sVar = (s) c.z(mhpVar, 4, q.a, null);
            e1Var = e1Var2;
            i = 31;
            pVar = pVar2;
        } else {
            boolean z = true;
            int i2 = 0;
            p pVar3 = null;
            e1 e1Var3 = null;
            List list2 = null;
            s sVar2 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    str2 = c.g(mhpVar, 0);
                    i2 |= 1;
                } else if (w == 1) {
                    pVar3 = (p) c.n(mhpVar, 1, n.a, pVar3);
                    i2 |= 2;
                } else if (w == 2) {
                    e1Var3 = (e1) c.n(mhpVar, 2, c1.a, e1Var3);
                    i2 |= 4;
                } else if (w == 3) {
                    list2 = (List) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), list2);
                    i2 |= 8;
                } else {
                    if (w != 4) {
                        l1j.g(w);
                        return null;
                    }
                    sVar2 = (s) c.z(mhpVar, 4, q.a, sVar2);
                    i2 |= 16;
                }
            }
            i = i2;
            str = str2;
            pVar = pVar3;
            e1Var = e1Var3;
            list = list2;
            sVar = sVar2;
        }
        c.b(mhpVar);
        return new v(i, str, pVar, e1Var, list, sVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        v vVar = (v) obj;
        l6bVar.getClass();
        vVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = v.f;
        String str = vVar.a;
        List list = vVar.d;
        e1 e1Var = vVar.c;
        p pVar = vVar.b;
        c.p(mhpVar, 0, str);
        if (c.e(mhpVar) || pVar != null) {
            c.q(mhpVar, 1, n.a, pVar);
        }
        if (c.e(mhpVar) || e1Var != null) {
            c.q(mhpVar, 2, c1.a, e1Var);
        }
        if (c.e(mhpVar) || !Intrinsics.d(list, c5b.a)) {
            c.k(mhpVar, 3, (t9f) arfVarArr[3].getValue(), list);
        }
        c.k(mhpVar, 4, q.a, vVar.e);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
