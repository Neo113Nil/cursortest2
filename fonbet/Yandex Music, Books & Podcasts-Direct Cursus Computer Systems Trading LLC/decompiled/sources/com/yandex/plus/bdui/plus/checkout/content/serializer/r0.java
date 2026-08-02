package com.yandex.plus.bdui.plus.checkout.content.serializer;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
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

/* loaded from: classes4.dex */
public final /* synthetic */ class r0 implements p3d {
    public static final r0 a;

    @NotNull
    private static final mhp descriptor;

    static {
        r0 r0Var = new r0();
        a = r0Var;
        j5m j5mVar = new j5m("com.yandex.plus.bdui.plus.checkout.content.serializer.PlusPayCheckoutContentSerializer.DataDto", r0Var, 14);
        j5mVar.k("tariff", false);
        j5mVar.k("options", false);
        j5mVar.k("title", false);
        j5mVar.k("paymentText", false);
        j5mVar.k("legal", false);
        j5mVar.k("mailAgreement", false);
        j5mVar.k("nextTitle", false);
        j5mVar.k("nextButton", false);
        j5mVar.k("user", false);
        j5mVar.k("paymentButtonGroups", false);
        j5mVar.k("selectedPaymentMethodId", false);
        j5mVar.k("paymentPromoLegalInfo", false);
        j5mVar.k("showPaymentViaYb", false);
        j5mVar.k("additionalOffers", false);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        arf[] arfVarArr = t0.o;
        t9f C = ff7.C(v1.a);
        t9f C2 = ff7.C((t9f) arfVarArr[1].getValue());
        tkr tkrVar = tkr.a;
        return new t9f[]{C, C2, tkrVar, tkrVar, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, ff7.C(u0.a), tkrVar, tkrVar, ff7.C(a.a), ff7.C((t9f) arfVarArr[9].getValue()), ff7.C(tkrVar), ff7.C(p1.a), ff7.C(oc3.a), ff7.C(k0.a)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        x1 x1Var;
        int i;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var;
        List list;
        Boolean bool;
        r1 r1Var;
        String str;
        c cVar;
        m0 m0Var;
        List list2;
        w0 w0Var;
        String str2;
        String str3;
        String str4;
        String str5;
        int i2;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        arf[] arfVarArr = t0.o;
        int i3 = 9;
        if (c.m()) {
            x1Var = (x1) c.n(mhpVar, 0, v1.a, null);
            List list3 = (List) c.n(mhpVar, 1, (t9f) arfVarArr[1].getValue(), null);
            String g = c.g(mhpVar, 2);
            String g2 = c.g(mhpVar, 3);
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var2 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.z(mhpVar, 4, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, null);
            w0 w0Var2 = (w0) c.n(mhpVar, 5, u0.a, null);
            String g3 = c.g(mhpVar, 6);
            String g4 = c.g(mhpVar, 7);
            c cVar2 = (c) c.n(mhpVar, 8, a.a, null);
            List list4 = (List) c.n(mhpVar, 9, (t9f) arfVarArr[9].getValue(), null);
            String str6 = (String) c.n(mhpVar, 10, tkr.a, null);
            r1 r1Var2 = (r1) c.n(mhpVar, 11, p1.a, null);
            Boolean bool2 = (Boolean) c.n(mhpVar, 12, oc3.a, null);
            i = 16383;
            m0Var = (m0) c.n(mhpVar, 13, k0.a, null);
            list = list3;
            str2 = g;
            str = str6;
            str5 = g4;
            str4 = g3;
            w0Var = w0Var2;
            str3 = g2;
            cVar = cVar2;
            m1Var = m1Var2;
            r1Var = r1Var2;
            bool = bool2;
            list2 = list4;
        } else {
            int i4 = 1;
            boolean z = true;
            x1Var = null;
            com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var3 = null;
            Boolean bool3 = null;
            r1 r1Var3 = null;
            String str7 = null;
            c cVar3 = null;
            m0 m0Var2 = null;
            List list5 = null;
            w0 w0Var3 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            i = 0;
            List list6 = null;
            while (z) {
                int w = c.w(mhpVar);
                switch (w) {
                    case -1:
                        z = false;
                        i3 = 9;
                        i4 = 1;
                    case 0:
                        x1Var = (x1) c.n(mhpVar, 0, v1.a, x1Var);
                        i |= 1;
                        i3 = 9;
                        i4 = 1;
                    case 1:
                        list6 = (List) c.n(mhpVar, i4, (t9f) arfVarArr[i4].getValue(), list6);
                        i |= 2;
                        i3 = 9;
                    case 2:
                        str8 = c.g(mhpVar, 2);
                        i |= 4;
                        i3 = 9;
                    case 3:
                        str9 = c.g(mhpVar, 3);
                        i |= 8;
                        i3 = 9;
                    case 4:
                        m1Var3 = (com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) c.z(mhpVar, 4, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, m1Var3);
                        i |= 16;
                        i3 = 9;
                    case 5:
                        w0Var3 = (w0) c.n(mhpVar, 5, u0.a, w0Var3);
                        i |= 32;
                        i3 = 9;
                    case 6:
                        str10 = c.g(mhpVar, 6);
                        i |= 64;
                        i3 = 9;
                    case 7:
                        str11 = c.g(mhpVar, 7);
                        i |= 128;
                        i3 = 9;
                    case 8:
                        cVar3 = (c) c.n(mhpVar, 8, a.a, cVar3);
                        i |= 256;
                        i3 = 9;
                    case 9:
                        int i5 = i3;
                        list5 = (List) c.n(mhpVar, i5, (t9f) arfVarArr[i5].getValue(), list5);
                        i |= RemoteCameraConfig.Mic.BUFFER_SIZE;
                        i3 = i5;
                    case 10:
                        str7 = (String) c.n(mhpVar, 10, tkr.a, str7);
                        i |= 1024;
                        i3 = i3;
                    case 11:
                        i2 = i3;
                        r1Var3 = (r1) c.n(mhpVar, 11, p1.a, r1Var3);
                        i |= 2048;
                        i3 = i2;
                    case 12:
                        i2 = i3;
                        bool3 = (Boolean) c.n(mhpVar, 12, oc3.a, bool3);
                        i |= 4096;
                        i3 = i2;
                    case 13:
                        i2 = i3;
                        m0Var2 = (m0) c.n(mhpVar, 13, k0.a, m0Var2);
                        i |= RemoteCameraConfig.Notification.ID;
                        i3 = i2;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            m1Var = m1Var3;
            list = list6;
            bool = bool3;
            r1Var = r1Var3;
            str = str7;
            cVar = cVar3;
            m0Var = m0Var2;
            list2 = list5;
            w0Var = w0Var3;
            str2 = str8;
            str3 = str9;
            str4 = str10;
            str5 = str11;
        }
        x1 x1Var2 = x1Var;
        int i6 = i;
        c.b(mhpVar);
        return new t0(i6, x1Var2, list, str2, str3, m1Var, w0Var, str4, str5, cVar, list2, str, r1Var, bool, m0Var);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        t0 t0Var = (t0) obj;
        l6bVar.getClass();
        t0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        arf[] arfVarArr = t0.o;
        c.q(mhpVar, 0, v1.a, t0Var.a);
        c.q(mhpVar, 1, (t9f) arfVarArr[1].getValue(), t0Var.b);
        c.p(mhpVar, 2, t0Var.c);
        c.p(mhpVar, 3, t0Var.d);
        c.k(mhpVar, 4, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.k1.a, t0Var.e);
        c.q(mhpVar, 5, u0.a, t0Var.f);
        c.p(mhpVar, 6, t0Var.g);
        c.p(mhpVar, 7, t0Var.h);
        c.q(mhpVar, 8, a.a, t0Var.i);
        c.q(mhpVar, 9, (t9f) arfVarArr[9].getValue(), t0Var.j);
        c.q(mhpVar, 10, tkr.a, t0Var.k);
        c.q(mhpVar, 11, p1.a, t0Var.l);
        c.q(mhpVar, 12, oc3.a, t0Var.m);
        c.q(mhpVar, 13, k0.a, t0Var.n);
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
