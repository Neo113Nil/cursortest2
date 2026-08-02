package com.yandex.plus.bdui.plus.checkout.content.serializer;

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

/* loaded from: classes4.dex */
public final /* synthetic */ class s2 implements p3d {
    public static final s2 a;

    @NotNull
    private static final mhp descriptor;

    static {
        s2 s2Var = new s2();
        a = s2Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayClosingOfferContentSerializer.DataDto", s2Var, 8);
        j5mVar.k("backgroundImage", false);
        j5mVar.k("title", false);
        j5mVar.k("subtitle", false);
        j5mVar.k("assets", false);
        j5mVar.k("acceptButtonText", false);
        j5mVar.k("rejectButtonText", false);
        j5mVar.k("footerText", false);
        j5mVar.k("user", false);
        descriptor = j5mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = u2.i;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1 k1Var = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a;
        tkr tkrVar = tkr.a;
        return new t9f[]{com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r.a, k1Var, ff7.C(k1Var), arfVarArr[3].getValue(), tkrVar, tkrVar, ff7.C(k1Var), ff7.C(a.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        c cVar;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t tVar;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var2;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var3;
        List list;
        String str;
        String str2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = u2.i;
        int i2 = 7;
        char c2 = 2;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t tVar2 = null;
        if (c.m()) {
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t tVar3 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t) c.z(mhpVar, 0, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r.a, null);
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1 k1Var = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a;
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var4 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.z(mhpVar, 1, k1Var, null);
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var5 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.n(mhpVar, 2, k1Var, null);
            List list2 = (List) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), null);
            String g = c.g(mhpVar, 4);
            String g2 = c.g(mhpVar, 5);
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var6 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.n(mhpVar, 6, k1Var, null);
            list = list2;
            tVar = tVar3;
            cVar = (c) c.n(mhpVar, 7, a.a, null);
            m1Var = m1Var6;
            str2 = g2;
            str = g;
            m1Var3 = m1Var5;
            i = 255;
            m1Var2 = m1Var4;
        } else {
            boolean z = true;
            int i3 = 0;
            c cVar2 = null;
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var7 = null;
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var8 = null;
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var9 = null;
            List list3 = null;
            String str3 = null;
            String str4 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        i2 = 7;
                    case 0:
                        tVar2 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t) c.z(mhpVar, 0, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r.a, tVar2);
                        i3 |= 1;
                        i2 = 7;
                        c2 = 2;
                    case 1:
                        m1Var8 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.z(mhpVar, 1, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, m1Var8);
                        i3 |= 2;
                        i2 = 7;
                        c2 = 2;
                    case 2:
                        m1Var9 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.n(mhpVar, 2, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, m1Var9);
                        i3 |= 4;
                        c2 = 2;
                        i2 = 7;
                    case 3:
                        list3 = (List) c.z(mhpVar, 3, (t9f) arfVarArr[3].getValue(), list3);
                        i3 |= 8;
                        c2 = 2;
                    case 4:
                        str3 = c.g(mhpVar, 4);
                        i3 |= 16;
                        c2 = 2;
                    case 5:
                        str4 = c.g(mhpVar, 5);
                        i3 |= 32;
                        c2 = 2;
                    case 6:
                        m1Var7 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.n(mhpVar, 6, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, m1Var7);
                        i3 |= 64;
                        c2 = 2;
                    case 7:
                        cVar2 = (c) c.n(mhpVar, i2, a.a, cVar2);
                        i3 |= 128;
                        c2 = 2;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i3;
            cVar = cVar2;
            m1Var = m1Var7;
            tVar = tVar2;
            m1Var2 = m1Var8;
            m1Var3 = m1Var9;
            list = list3;
            str = str3;
            str2 = str4;
        }
        c.b(mhpVar);
        return new u2(i, tVar, m1Var2, m1Var3, list, str, str2, m1Var, cVar);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        u2 u2Var = (u2) obj;
        l6bVar.getClass();
        u2Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = u2.i;
        c.k(mhpVar, 0, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r.a, u2Var.a);
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1 k1Var = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a;
        c.k(mhpVar, 1, k1Var, u2Var.b);
        c.q(mhpVar, 2, k1Var, u2Var.c);
        c.k(mhpVar, 3, (t9f) arfVarArr[3].getValue(), u2Var.d);
        c.p(mhpVar, 4, u2Var.e);
        c.p(mhpVar, 5, u2Var.f);
        c.q(mhpVar, 6, k1Var, u2Var.g);
        c.q(mhpVar, 7, a.a, u2Var.h);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
