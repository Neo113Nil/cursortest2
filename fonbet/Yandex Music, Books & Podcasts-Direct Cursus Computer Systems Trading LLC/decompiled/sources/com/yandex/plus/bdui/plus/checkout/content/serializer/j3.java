package com.yandex.plus.bdui.plus.checkout.content.serializer;

import defpackage.arf;
import defpackage.cqe;
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

/* loaded from: classes4.dex */
public final /* synthetic */ class j3 implements p3d {
    public static final j3 a;

    @NotNull
    private static final mhp descriptor;

    static {
        j3 j3Var = new j3();
        a = j3Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayCounterOffersContentSerializer.DataDto", j3Var, 9);
        j5mVar.k("title", false);
        j5mVar.k("subtitle", false);
        j5mVar.k("assets", false);
        j5mVar.k("alternativeActionText", false);
        j5mVar.k("supportText", false);
        j5mVar.k("errorCode", false);
        j5mVar.k("errorCodeContentDescription", false);
        j5mVar.k("prioritizedAssetIndex", false);
        j5mVar.k("user", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = l3.j;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1 k1Var = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a;
        tkr tkrVar = tkr.a;
        return new t9f[]{ff7.C(k1Var), ff7.C(k1Var), arfVarArr[2].getValue(), ff7.C(k1Var), ff7.C(k1Var), ff7.C(tkrVar), ff7.C(tkrVar), ff7.C(cqe.a), ff7.C(a.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        c cVar;
        String str;
        Integer num;
        String str2;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var2;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var3;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var4;
        List list;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = l3.j;
        int i2 = 7;
        char c2 = 6;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var5 = null;
        if (c.m()) {
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1 k1Var = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a;
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var6 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.n(mhpVar, 0, k1Var, null);
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var7 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.n(mhpVar, 1, k1Var, null);
            List list2 = (List) c.z(mhpVar, 2, (t9f) arfVarArr[2].getValue(), null);
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var8 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.n(mhpVar, 3, k1Var, null);
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var9 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.n(mhpVar, 4, k1Var, null);
            tkr tkrVar = tkr.a;
            String str3 = (String) c.n(mhpVar, 5, tkrVar, null);
            String str4 = (String) c.n(mhpVar, 6, tkrVar, null);
            list = list2;
            m1Var = m1Var9;
            num = (Integer) c.n(mhpVar, 7, cqe.a, null);
            str = str4;
            str2 = str3;
            m1Var2 = m1Var8;
            cVar = (c) c.n(mhpVar, 8, a.a, null);
            i = 511;
            m1Var4 = m1Var7;
            m1Var3 = m1Var6;
        } else {
            int i3 = 2;
            boolean z = true;
            int i4 = 0;
            c cVar2 = null;
            String str5 = null;
            Integer num2 = null;
            String str6 = null;
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var10 = null;
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var11 = null;
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var12 = null;
            List list3 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        i2 = 7;
                        i3 = 2;
                    case 0:
                        m1Var5 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.n(mhpVar, 0, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, m1Var5);
                        i4 |= 1;
                        i2 = 7;
                        c2 = 6;
                        i3 = 2;
                    case 1:
                        m1Var12 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.n(mhpVar, 1, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, m1Var12);
                        i4 |= 2;
                        i2 = 7;
                        c2 = 6;
                        i3 = 2;
                    case 2:
                        list3 = (List) c.z(mhpVar, i3, (t9f) arfVarArr[i3].getValue(), list3);
                        i4 |= 4;
                        i2 = 7;
                        c2 = 6;
                    case 3:
                        m1Var11 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.n(mhpVar, 3, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, m1Var11);
                        i4 |= 8;
                        i2 = 7;
                        c2 = 6;
                    case 4:
                        m1Var10 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.n(mhpVar, 4, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, m1Var10);
                        i4 |= 16;
                        i2 = 7;
                        c2 = 6;
                    case 5:
                        str6 = (String) c.n(mhpVar, 5, tkr.a, str6);
                        i4 |= 32;
                        i2 = 7;
                        c2 = 6;
                    case 6:
                        str5 = (String) c.n(mhpVar, 6, tkr.a, str5);
                        i4 |= 64;
                        c2 = 6;
                        i2 = 7;
                    case 7:
                        num2 = (Integer) c.n(mhpVar, i2, cqe.a, num2);
                        i4 |= 128;
                        c2 = 6;
                    case 8:
                        cVar2 = (c) c.n(mhpVar, 8, a.a, cVar2);
                        i4 |= 256;
                        c2 = 6;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i4;
            cVar = cVar2;
            str = str5;
            num = num2;
            str2 = str6;
            m1Var = m1Var10;
            m1Var2 = m1Var11;
            m1Var3 = m1Var5;
            m1Var4 = m1Var12;
            list = list3;
        }
        c.b(mhpVar);
        return new l3(i, m1Var3, m1Var4, list, m1Var2, m1Var, str2, str, num, cVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        l3 l3Var = (l3) obj;
        l6bVar.getClass();
        l3Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = l3.j;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1 k1Var = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a;
        c.q(mhpVar, 0, k1Var, l3Var.a);
        c.q(mhpVar, 1, k1Var, l3Var.b);
        c.k(mhpVar, 2, (t9f) arfVarArr[2].getValue(), l3Var.c);
        c.q(mhpVar, 3, k1Var, l3Var.d);
        c.q(mhpVar, 4, k1Var, l3Var.e);
        tkr tkrVar = tkr.a;
        c.q(mhpVar, 5, tkrVar, l3Var.f);
        c.q(mhpVar, 6, tkrVar, l3Var.g);
        c.q(mhpVar, 7, cqe.a, l3Var.h);
        c.q(mhpVar, 8, a.a, l3Var.i);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
