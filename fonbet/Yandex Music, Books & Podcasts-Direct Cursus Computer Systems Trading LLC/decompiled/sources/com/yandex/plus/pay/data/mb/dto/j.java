package com.yandex.plus.pay.data.mb.dto;

import defpackage.arf;
import defpackage.c5b;
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
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class j implements p3d {
    public static final j a;

    @NotNull
    private static final mhp descriptor;

    static {
        j jVar = new j();
        a = jVar;
        j5m j5mVar = new j5m("com.yandex.plus.pay.data.mb.dto.CompositeOfferDto", jVar, 9);
        j5mVar.k("positionId", false);
        j5mVar.k("structureType", false);
        j5mVar.k("asset", false);
        j5mVar.k("forActiveOffers", true);
        j5mVar.k("tariffOffer", true);
        j5mVar.k("optionOffers", true);
        j5mVar.k("legalInfo", false);
        j5mVar.k("silentInvoiceAvailable", true);
        j5mVar.k("invoices", true);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = l1.j;
        return new t9f[]{tkr.a, arfVarArr[1].getValue(), k.a, ff7.C((t9f) arfVarArr[3].getValue()), ff7.C(d1.a), arfVarArr[5].getValue(), r.a, oc3.a, arfVarArr[8].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        boolean z;
        b0 b0Var;
        i1 i1Var;
        List list;
        List list2;
        List list3;
        m mVar;
        int i;
        String str;
        b1 b1Var;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = l1.j;
        int i2 = 7;
        char c2 = 6;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            b1 b1Var2 = (b1) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            m mVar2 = (m) c.z(mhpVar, 2, k.a, null);
            List list4 = (List) c.n(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            i1 i1Var2 = (i1) c.n(mhpVar, 4, d1.a, null);
            List list5 = (List) c.z(mhpVar, 5, (t9f) arfVarArr[5].getValue(), null);
            b0 b0Var2 = (b0) c.z(mhpVar, 6, r.a, null);
            boolean D = c.D(mhpVar, 7);
            list = (List) c.z(mhpVar, 8, (t9f) arfVarArr[8].getValue(), null);
            str = g;
            z = D;
            b0Var = b0Var2;
            i1Var = i1Var2;
            mVar = mVar2;
            list2 = list5;
            list3 = list4;
            i = 511;
            b1Var = b1Var2;
        } else {
            int i3 = 5;
            int i4 = 3;
            boolean z2 = true;
            boolean z3 = false;
            b0 b0Var3 = null;
            i1 i1Var3 = null;
            List list6 = null;
            List list7 = null;
            List list8 = null;
            String str2 = null;
            b1 b1Var3 = null;
            int i5 = 0;
            m mVar3 = null;
            while (z2) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z2 = false;
                        c2 = 6;
                        i4 = 3;
                        i3 = 5;
                    case 0:
                        str2 = c.g(mhpVar, 0);
                        i5 |= 1;
                        i2 = 7;
                        c2 = 6;
                        i4 = 3;
                        i3 = 5;
                    case 1:
                        b1Var3 = (b1) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), b1Var3);
                        i5 |= 2;
                        i2 = 7;
                        c2 = 6;
                        i4 = 3;
                        i3 = 5;
                    case 2:
                        mVar3 = (m) c.z(mhpVar, 2, k.a, mVar3);
                        i5 |= 4;
                        i2 = 7;
                        c2 = 6;
                        i4 = 3;
                        i3 = 5;
                    case 3:
                        list8 = (List) c.n(mhpVar, i4, (t9f) arfVarArr[i4].getValue(), list8);
                        i5 |= 8;
                        i2 = 7;
                        c2 = 6;
                        i3 = 5;
                    case 4:
                        i1Var3 = (i1) c.n(mhpVar, 4, d1.a, i1Var3);
                        i5 |= 16;
                        i2 = 7;
                        c2 = 6;
                        i3 = 5;
                    case 5:
                        list7 = (List) c.z(mhpVar, i3, (t9f) arfVarArr[i3].getValue(), list7);
                        i5 |= 32;
                        i2 = 7;
                        c2 = 6;
                    case 6:
                        b0Var3 = (b0) c.z(mhpVar, 6, r.a, b0Var3);
                        i5 |= 64;
                        c2 = 6;
                        i2 = 7;
                    case 7:
                        z3 = c.D(mhpVar, i2);
                        i5 |= 128;
                        c2 = 6;
                    case 8:
                        list6 = (List) c.z(mhpVar, 8, (t9f) arfVarArr[8].getValue(), list6);
                        i5 |= 256;
                        c2 = 6;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            z = z3;
            b0Var = b0Var3;
            i1Var = i1Var3;
            list = list6;
            list2 = list7;
            list3 = list8;
            mVar = mVar3;
            i = i5;
            str = str2;
            b1Var = b1Var3;
        }
        c.b(mhpVar);
        return new l1(i, str, b1Var, mVar, list3, i1Var, list2, b0Var, z, list);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        l1 l1Var = (l1) obj;
        l6bVar.getClass();
        l1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = l1.j;
        String str = l1Var.a;
        List list = l1Var.i;
        boolean z = l1Var.h;
        List list2 = l1Var.f;
        i1 i1Var = l1Var.e;
        List list3 = l1Var.d;
        c.p(mhpVar, 0, str);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), l1Var.b);
        c.k(mhpVar, 2, k.a, l1Var.c);
        if (c.e(mhpVar) || list3 != null) {
            c.q(mhpVar, 3, (t9f) arfVarArr[3].getValue(), list3);
        }
        if (c.e(mhpVar) || i1Var != null) {
            c.q(mhpVar, 4, d1.a, i1Var);
        }
        if (c.e(mhpVar) || !Intrinsics.d(list2, c5b.a)) {
            c.k(mhpVar, 5, (t9f) arfVarArr[5].getValue(), list2);
        }
        c.k(mhpVar, 6, r.a, l1Var.g);
        if (c.e(mhpVar) || z) {
            c.j(mhpVar, 7, z);
        }
        if (c.e(mhpVar) || !Intrinsics.d(list, c5b.a)) {
            c.k(mhpVar, 8, (t9f) arfVarArr[8].getValue(), list);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
