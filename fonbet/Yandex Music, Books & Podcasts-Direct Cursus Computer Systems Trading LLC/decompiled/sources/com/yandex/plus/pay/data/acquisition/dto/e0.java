package com.yandex.plus.pay.data.acquisition.dto;

import defpackage.arf;
import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.mvg;
import defpackage.p3d;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.wq5;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class e0 implements p3d {
    public static final e0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        e0 e0Var = new e0();
        a = e0Var;
        j5m j5mVar = new j5m("com.yandex.plus.pay.data.acquisition.dto.PlusPayAcquisitionSmartOffersBatchDto", e0Var, 7);
        j5mVar.k("sessionId", true);
        j5mVar.k(Constants.KEY_PAGE, true);
        j5mVar.k("mlRequestId", true);
        j5mVar.k("offerConfigId", true);
        j5mVar.k("language", false);
        j5mVar.k("offers", true);
        j5mVar.k("bdui", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = b1.h;
        tkr tkrVar = tkr.a;
        return new t9f[]{ff7.C(tkrVar), ff7.C(tkrVar), ff7.C(tkrVar), ff7.C(mvg.a), tkrVar, ff7.C((t9f) arfVarArr[5].getValue()), ff7.C(f0.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        h0 h0Var;
        List list;
        String str;
        String str2;
        String str3;
        Long l;
        String str4;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = b1.h;
        int i2 = 6;
        char c2 = 2;
        String str5 = null;
        if (c.m()) {
            tkr tkrVar = tkr.a;
            String str6 = (String) c.n(mhpVar, 0, tkrVar, null);
            String str7 = (String) c.n(mhpVar, 1, tkrVar, null);
            String str8 = (String) c.n(mhpVar, 2, tkrVar, null);
            Long l2 = (Long) c.n(mhpVar, 3, mvg.a, null);
            String g = c.g(mhpVar, 4);
            list = (List) c.n(mhpVar, 5, (t9f) arfVarArr[5].getValue(), null);
            str3 = str8;
            h0Var = (h0) c.n(mhpVar, 6, f0.a, null);
            l = l2;
            str4 = g;
            i = 127;
            str2 = str7;
            str = str6;
        } else {
            boolean z = true;
            int i3 = 0;
            h0 h0Var2 = null;
            List list2 = null;
            String str9 = null;
            String str10 = null;
            Long l3 = null;
            String str11 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        i2 = 6;
                    case 0:
                        str5 = (String) c.n(mhpVar, 0, tkr.a, str5);
                        i3 |= 1;
                        i2 = 6;
                        c2 = 2;
                    case 1:
                        str9 = (String) c.n(mhpVar, 1, tkr.a, str9);
                        i3 |= 2;
                        i2 = 6;
                        c2 = 2;
                    case 2:
                        str10 = (String) c.n(mhpVar, 2, tkr.a, str10);
                        i3 |= 4;
                        c2 = 2;
                        i2 = 6;
                    case 3:
                        l3 = (Long) c.n(mhpVar, 3, mvg.a, l3);
                        i3 |= 8;
                        c2 = 2;
                    case 4:
                        str11 = c.g(mhpVar, 4);
                        i3 |= 16;
                        c2 = 2;
                    case 5:
                        list2 = (List) c.n(mhpVar, 5, (t9f) arfVarArr[5].getValue(), list2);
                        i3 |= 32;
                        c2 = 2;
                    case 6:
                        h0Var2 = (h0) c.n(mhpVar, i2, f0.a, h0Var2);
                        i3 |= 64;
                        c2 = 2;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i3;
            h0Var = h0Var2;
            list = list2;
            str = str5;
            str2 = str9;
            str3 = str10;
            l = l3;
            str4 = str11;
        }
        c.b(mhpVar);
        return new b1(i, str, str2, str3, l, str4, list, h0Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        b1 b1Var = (b1) obj;
        l6bVar.getClass();
        b1Var.getClass();
        Long l = b1Var.d;
        String str = b1Var.c;
        String str2 = b1Var.b;
        String str3 = b1Var.a;
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = b1.h;
        if (c.e(mhpVar) || str3 != null) {
            c.q(mhpVar, 0, tkr.a, str3);
        }
        if (c.e(mhpVar) || str2 != null) {
            c.q(mhpVar, 1, tkr.a, str2);
        }
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 2, tkr.a, str);
        }
        if (c.e(mhpVar) || l != null) {
            c.q(mhpVar, 3, mvg.a, l);
        }
        String str4 = b1Var.e;
        h0 h0Var = b1Var.g;
        List list = b1Var.f;
        c.p(mhpVar, 4, str4);
        if (c.e(mhpVar) || list != null) {
            c.q(mhpVar, 5, (t9f) arfVarArr[5].getValue(), list);
        }
        if (c.e(mhpVar) || h0Var != null) {
            c.q(mhpVar, 6, f0.a, h0Var);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
