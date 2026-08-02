package com.yandex.plus.core.graphql.fragment;

import com.connectsdk.device.ConnectableDevice;
import defpackage.a7f;
import defpackage.fah;
import defpackage.fx6;
import defpackage.irf;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.u75;
import defpackage.vgj;
import defpackage.xq0;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class w8 implements defpackage.pj {
    public static final List a = u75.h(ConnectableDevice.KEY_ID, "invoiceStatus", "form", "paymentMethodId", "paidAmount", "payment", "totalAmount", "invoicePollingParams", "widgetQrCodeParams");

    public static v8 c(a7f a7fVar, fx6 fx6Var) {
        Object obj;
        Object obj2;
        Object b;
        Object obj3;
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        com.yandex.plus.core.graphql.type.w wVar = null;
        String str2 = null;
        String str3 = null;
        r8 r8Var = null;
        s8 s8Var = null;
        t8 t8Var = null;
        q8 q8Var = null;
        u8 u8Var = null;
        while (true) {
            switch (a7fVar.z0(a)) {
                case 0:
                    str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
                    break;
                case 1:
                    com.yandex.plus.core.graphql.type.adapter.a aVar = com.yandex.plus.core.graphql.type.adapter.a.j;
                    defpackage.tj tjVar = defpackage.uj.a;
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj2 = null;
                    } else {
                        obj2 = aVar.b(a7fVar, fx6Var);
                    }
                    wVar = (com.yandex.plus.core.graphql.type.w) obj2;
                    break;
                case 2:
                    defpackage.pj e = fx6Var.e(com.yandex.plus.core.graphql.type.z.g);
                    defpackage.tj tjVar2 = defpackage.uj.a;
                    if (!(e instanceof vgj)) {
                        if (a7fVar.peek() == 10) {
                            a7fVar.w();
                            b = null;
                        } else {
                            b = e.b(a7fVar, fx6Var);
                        }
                        str2 = (String) b;
                        break;
                    } else {
                        xq0.q("The adapter is already nullable");
                        return null;
                    }
                case 3:
                    str3 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
                    break;
                case 4:
                    y8 y8Var = y8.a;
                    defpackage.tj tjVar3 = defpackage.uj.a;
                    r8Var = (r8) new qhj(y8Var, true).b(a7fVar, fx6Var);
                    break;
                case 5:
                    z8 z8Var = z8.a;
                    defpackage.tj tjVar4 = defpackage.uj.a;
                    qhj qhjVar = new qhj(z8Var, true);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj3 = null;
                    } else {
                        obj3 = qhjVar.b(a7fVar, fx6Var);
                    }
                    s8Var = (s8) obj3;
                    break;
                case 6:
                    a9 a9Var = a9.a;
                    defpackage.tj tjVar5 = defpackage.uj.a;
                    t8Var = (t8) new qhj(a9Var, true).b(a7fVar, fx6Var);
                    break;
                case 7:
                    x8 x8Var = x8.a;
                    defpackage.tj tjVar6 = defpackage.uj.a;
                    q8Var = (q8) new qhj(x8Var, false).b(a7fVar, fx6Var);
                    break;
                case 8:
                    b9 b9Var = b9.a;
                    defpackage.tj tjVar7 = defpackage.uj.a;
                    qhj qhjVar2 = new qhj(b9Var, false);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj = null;
                    } else {
                        obj = qhjVar2.b(a7fVar, fx6Var);
                    }
                    u8Var = (u8) obj;
                    break;
                default:
                    str.getClass();
                    r8Var.getClass();
                    t8Var.getClass();
                    q8Var.getClass();
                    return new v8(str, wVar, str2, str3, r8Var, s8Var, t8Var, q8Var, u8Var);
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, v8 v8Var) {
        r7fVar.getClass();
        fx6Var.getClass();
        v8Var.getClass();
        r7fVar.Z(ConnectableDevice.KEY_ID);
        defpackage.uj.a.a(r7fVar, fx6Var, v8Var.a);
        r7fVar.Z("invoiceStatus");
        com.yandex.plus.core.graphql.type.adapter.a aVar = com.yandex.plus.core.graphql.type.adapter.a.j;
        com.yandex.plus.core.graphql.type.w wVar = v8Var.b;
        if (wVar == null) {
            r7fVar.B0();
        } else {
            aVar.a(r7fVar, fx6Var, wVar);
        }
        r7fVar.Z("form");
        defpackage.pj e = fx6Var.e(com.yandex.plus.core.graphql.type.z.g);
        if (e instanceof vgj) {
            xq0.q("The adapter is already nullable");
            return;
        }
        String str = v8Var.c;
        if (str == null) {
            r7fVar.B0();
        } else {
            e.a(r7fVar, fx6Var, str);
        }
        r7fVar.Z("paymentMethodId");
        defpackage.uj.i.a(r7fVar, fx6Var, v8Var.d);
        r7fVar.Z("paidAmount");
        y8 y8Var = y8.a;
        r8 r8Var = v8Var.e;
        boolean z = r7fVar instanceof fah;
        if (z) {
            r7fVar.j();
            y8Var.a(r7fVar, fx6Var, r8Var);
            r7fVar.p();
        } else {
            fah fahVar = new fah();
            fahVar.j();
            y8Var.a(fahVar, fx6Var, r8Var);
            fahVar.p();
            Object b = fahVar.b();
            b.getClass();
            irf.V(r7fVar, b);
        }
        r7fVar.Z("payment");
        qhj qhjVar = new qhj(z8.a, true);
        s8 s8Var = v8Var.f;
        if (s8Var == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, s8Var);
        }
        r7fVar.Z("totalAmount");
        a9 a9Var = a9.a;
        t8 t8Var = v8Var.g;
        if (z) {
            r7fVar.j();
            a9Var.a(r7fVar, fx6Var, t8Var);
            r7fVar.p();
        } else {
            fah fahVar2 = new fah();
            fahVar2.j();
            a9Var.a(fahVar2, fx6Var, t8Var);
            fahVar2.p();
            Object b2 = fahVar2.b();
            b2.getClass();
            irf.V(r7fVar, b2);
        }
        r7fVar.Z("invoicePollingParams");
        x8 x8Var = x8.a;
        q8 q8Var = v8Var.h;
        r7fVar.j();
        x8Var.a(r7fVar, fx6Var, q8Var);
        r7fVar.p();
        r7fVar.Z("widgetQrCodeParams");
        qhj qhjVar2 = new qhj(b9.a, false);
        u8 u8Var = v8Var.i;
        if (u8Var == null) {
            r7fVar.B0();
        } else {
            qhjVar2.a(r7fVar, fx6Var, u8Var);
        }
    }
}
