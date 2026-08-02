package com.yandex.plus.pay.data.mb.dto;

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
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class m1 implements p3d {
    public static final m1 a;

    @NotNull
    private static final mhp descriptor;

    static {
        m1 m1Var = new m1();
        a = m1Var;
        j5m j5mVar = new j5m("com.yandex.plus.pay.data.mb.dto.CounterOffersDto", m1Var, 8);
        j5mVar.k("eventSessionId", false);
        j5mVar.k("batchId", false);
        j5mVar.k("counterOfferTarget", false);
        j5mVar.k("errorTitle", true);
        j5mVar.k("errorSubtitle", true);
        j5mVar.k("offers", false);
        j5mVar.k("alternativeActionTitle", true);
        j5mVar.k("supportTitle", true);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = r1.i;
        tkr tkrVar = tkr.a;
        c3 c3Var = c3.a;
        return new t9f[]{tkrVar, tkrVar, tkrVar, ff7.C(c3Var), ff7.C(c3Var), arfVarArr[5].getValue(), ff7.C(c3Var), ff7.C(c3Var)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        j3 j3Var;
        j3 j3Var2;
        List list;
        j3 j3Var3;
        String str;
        String str2;
        String str3;
        j3 j3Var4;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = r1.i;
        int i2 = 7;
        char c2 = 4;
        String str4 = null;
        if (c.m()) {
            String g = c.g(mhpVar, 0);
            String g2 = c.g(mhpVar, 1);
            String g3 = c.g(mhpVar, 2);
            c3 c3Var = c3.a;
            j3 j3Var5 = (j3) c.n(mhpVar, 3, c3Var, null);
            j3 j3Var6 = (j3) c.n(mhpVar, 4, c3Var, null);
            List list2 = (List) c.z(mhpVar, 5, (t9f) arfVarArr[5].getValue(), null);
            j3 j3Var7 = (j3) c.n(mhpVar, 6, c3Var, null);
            list = list2;
            str = g;
            j3Var = (j3) c.n(mhpVar, 7, c3Var, null);
            j3Var2 = j3Var7;
            j3Var4 = j3Var5;
            j3Var3 = j3Var6;
            str3 = g3;
            i = 255;
            str2 = g2;
        } else {
            boolean z = true;
            int i3 = 0;
            j3 j3Var8 = null;
            j3 j3Var9 = null;
            List list3 = null;
            j3 j3Var10 = null;
            String str5 = null;
            String str6 = null;
            j3 j3Var11 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        c2 = 4;
                    case 0:
                        i3 |= 1;
                        str4 = c.g(mhpVar, 0);
                        i2 = 7;
                        c2 = 4;
                    case 1:
                        i3 |= 2;
                        str5 = c.g(mhpVar, 1);
                        i2 = 7;
                        c2 = 4;
                    case 2:
                        str6 = c.g(mhpVar, 2);
                        i3 |= 4;
                        i2 = 7;
                        c2 = 4;
                    case 3:
                        j3Var11 = (j3) c.n(mhpVar, 3, c3.a, j3Var11);
                        i3 |= 8;
                        i2 = 7;
                        c2 = 4;
                    case 4:
                        j3Var10 = (j3) c.n(mhpVar, 4, c3.a, j3Var10);
                        i3 |= 16;
                        c2 = 4;
                        i2 = 7;
                    case 5:
                        list3 = (List) c.z(mhpVar, 5, (t9f) arfVarArr[5].getValue(), list3);
                        i3 |= 32;
                        c2 = 4;
                    case 6:
                        j3Var9 = (j3) c.n(mhpVar, 6, c3.a, j3Var9);
                        i3 |= 64;
                        c2 = 4;
                    case 7:
                        j3Var8 = (j3) c.n(mhpVar, i2, c3.a, j3Var8);
                        i3 |= 128;
                        c2 = 4;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i3;
            j3Var = j3Var8;
            j3Var2 = j3Var9;
            list = list3;
            j3Var3 = j3Var10;
            str = str4;
            str2 = str5;
            str3 = str6;
            j3Var4 = j3Var11;
        }
        c.b(mhpVar);
        return new r1(i, str, str2, str3, j3Var4, j3Var3, list, j3Var2, j3Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        r1 r1Var = (r1) obj;
        l6bVar.getClass();
        r1Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = r1.i;
        String str = r1Var.a;
        j3 j3Var = r1Var.h;
        j3 j3Var2 = r1Var.g;
        j3 j3Var3 = r1Var.e;
        j3 j3Var4 = r1Var.d;
        c.p(mhpVar, 0, str);
        c.p(mhpVar, 1, r1Var.b);
        c.p(mhpVar, 2, r1Var.c);
        if (c.e(mhpVar) || j3Var4 != null) {
            c.q(mhpVar, 3, c3.a, j3Var4);
        }
        if (c.e(mhpVar) || j3Var3 != null) {
            c.q(mhpVar, 4, c3.a, j3Var3);
        }
        c.k(mhpVar, 5, (t9f) arfVarArr[5].getValue(), r1Var.f);
        if (c.e(mhpVar) || j3Var2 != null) {
            c.q(mhpVar, 6, c3.a, j3Var2);
        }
        if (c.e(mhpVar) || j3Var != null) {
            c.q(mhpVar, 7, c3.a, j3Var);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
