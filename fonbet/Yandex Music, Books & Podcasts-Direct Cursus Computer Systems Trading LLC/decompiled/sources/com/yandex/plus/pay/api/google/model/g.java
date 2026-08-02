package com.yandex.plus.pay.api.google.model;

import defpackage.arf;
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
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final /* synthetic */ class g implements p3d {
    public static final g a;

    @NotNull
    private static final mhp descriptor;

    static {
        g gVar = new g();
        a = gVar;
        j5m j5mVar = new j5m("com.yandex.plus.pay.api.google.model.GooglePlayPurchase", gVar, 8);
        j5mVar.k("orderId", false);
        j5mVar.k("products", false);
        j5mVar.k("originalJson", false);
        j5mVar.k("jsonBase64", false);
        j5mVar.k("signature", false);
        j5mVar.k("token", false);
        j5mVar.k("acknowledge", false);
        j5mVar.k("state", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = i.i;
        tkr tkrVar = tkr.a;
        return new t9f[]{ff7.C(tkrVar), arfVarArr[1].getValue(), tkrVar, tkrVar, tkrVar, tkrVar, oc3.a, arfVarArr[7].getValue()};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        boolean z;
        m mVar;
        int i;
        String str;
        List list;
        String str2;
        String str3;
        String str4;
        String str5;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = i.i;
        int i2 = 6;
        int i3 = 1;
        if (c.m()) {
            String str6 = (String) c.n(mhpVar, 0, tkr.a, null);
            List list2 = (List) c.z(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            String g = c.g(mhpVar, 2);
            String g2 = c.g(mhpVar, 3);
            String g3 = c.g(mhpVar, 4);
            String g4 = c.g(mhpVar, 5);
            boolean D = c.D(mhpVar, 6);
            mVar = (m) c.z(mhpVar, 7, (t9f) arfVarArr[7].getValue(), null);
            str = str6;
            z = D;
            str5 = g4;
            str3 = g2;
            str4 = g3;
            str2 = g;
            i = 255;
            list = list2;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            String str7 = null;
            List list3 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            int i4 = 0;
            m mVar2 = null;
            while (z2) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z2 = false;
                        break;
                    case 0:
                        str7 = (String) c.n(mhpVar, 0, tkr.a, str7);
                        i4 |= 1;
                        i2 = 6;
                        i3 = 1;
                        continue;
                    case 1:
                        int i5 = i3;
                        list3 = (List) c.z(mhpVar, i5, (t9f) arfVarArr[i5].getValue(), list3);
                        i4 |= 2;
                        i3 = i5;
                        break;
                    case 2:
                        str8 = c.g(mhpVar, 2);
                        i4 |= 4;
                        continue;
                    case 3:
                        str9 = c.g(mhpVar, 3);
                        i4 |= 8;
                        continue;
                    case 4:
                        str10 = c.g(mhpVar, 4);
                        i4 |= 16;
                        continue;
                    case 5:
                        str11 = c.g(mhpVar, 5);
                        i4 |= 32;
                        continue;
                    case 6:
                        z3 = c.D(mhpVar, i2);
                        i4 |= 64;
                        continue;
                    case 7:
                        mVar2 = (m) c.z(mhpVar, 7, (t9f) arfVarArr[7].getValue(), mVar2);
                        i4 |= 128;
                        i3 = i3;
                        continue;
                    default:
                        l1j.g(w);
                        return null;
                }
                i2 = 6;
            }
            z = z3;
            mVar = mVar2;
            i = i4;
            str = str7;
            list = list3;
            str2 = str8;
            str3 = str9;
            str4 = str10;
            str5 = str11;
        }
        c.b(mhpVar);
        return new i(i, str, list, str2, str3, str4, str5, z, mVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        i iVar = (i) obj;
        l6bVar.getClass();
        iVar.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = i.i;
        c.q(mhpVar, 0, tkr.a, iVar.a);
        c.k(mhpVar, 1, (t9f) arfVarArr[1].getValue(), iVar.b);
        c.p(mhpVar, 2, iVar.c);
        c.p(mhpVar, 3, iVar.d);
        c.p(mhpVar, 4, iVar.e);
        c.p(mhpVar, 5, iVar.f);
        c.j(mhpVar, 6, iVar.g);
        c.k(mhpVar, 7, (t9f) arfVarArr[7].getValue(), iVar.h);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
