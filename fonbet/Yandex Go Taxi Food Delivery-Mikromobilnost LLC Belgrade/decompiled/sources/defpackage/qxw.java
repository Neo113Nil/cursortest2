package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import com.yandex.plus.core.graphql.type.INVOICE_STATUS;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class qxw implements b70 {
    public static final List a = scc.g("id", "invoiceStatus", "form", "paymentMethodId", "paidAmount", "payment", "totalAmount", "invoicePollingParams", "widgetQrCodeParams");

    public static lxw c(xdx xdxVar, c cVar) {
        Object obj;
        Object obj2;
        Object b;
        Object obj3;
        String str = null;
        INVOICE_STATUS invoice_status = null;
        String str2 = null;
        String str3 = null;
        dxw dxwVar = null;
        fxw fxwVar = null;
        hxw hxwVar = null;
        cxw cxwVar = null;
        jxw jxwVar = null;
        while (true) {
            switch (xdxVar.h2(a)) {
                case 0:
                    foe foeVar = l80.a;
                    str = xdxVar.nextString();
                    break;
                case 1:
                    g97 g97Var = g97.j;
                    foe foeVar2 = l80.a;
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj2 = null;
                    } else {
                        obj2 = g97Var.b(xdxVar, cVar);
                    }
                    invoice_status = (INVOICE_STATUS) obj2;
                    break;
                case 2:
                    b70 d = cVar.d(mr11.a);
                    foe foeVar3 = l80.a;
                    if (!(d instanceof om60)) {
                        if (xdxVar.peek() == JsonReader$Token.NULL) {
                            xdxVar.skipValue();
                            b = null;
                        } else {
                            b = d.b(xdxVar, cVar);
                        }
                        str2 = (String) b;
                        break;
                    } else {
                        ny61.r("The adapter is already nullable");
                        return null;
                    }
                case 3:
                    str3 = (String) l80.i.b(xdxVar, cVar);
                    break;
                case 4:
                    sxw sxwVar = sxw.a;
                    foe foeVar4 = l80.a;
                    dxwVar = (dxw) new ep60(sxwVar, true).b(xdxVar, cVar);
                    break;
                case 5:
                    txw txwVar = txw.a;
                    foe foeVar5 = l80.a;
                    ep60 ep60Var = new ep60(txwVar, true);
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj3 = null;
                    } else {
                        obj3 = ep60Var.b(xdxVar, cVar);
                    }
                    fxwVar = (fxw) obj3;
                    break;
                case 6:
                    uxw uxwVar = uxw.a;
                    foe foeVar6 = l80.a;
                    hxwVar = (hxw) new ep60(uxwVar, true).b(xdxVar, cVar);
                    break;
                case 7:
                    cxwVar = (cxw) l80.a(rxw.a).b(xdxVar, cVar);
                    break;
                case 8:
                    ep60 a2 = l80.a(vxw.a);
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj = null;
                    } else {
                        obj = a2.b(xdxVar, cVar);
                    }
                    jxwVar = (jxw) obj;
                    break;
                default:
                    return new lxw(str, invoice_status, str2, str3, dxwVar, fxwVar, hxwVar, cxwVar, jxwVar);
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, lxw lxwVar) {
        bfxVar.A1("id");
        foe foeVar = l80.a;
        bfxVar.r0(lxwVar.a);
        bfxVar.A1("invoiceStatus");
        g97 g97Var = g97.j;
        INVOICE_STATUS invoice_status = lxwVar.b;
        if (invoice_status == null) {
            bfxVar.k2();
        } else {
            g97Var.a(bfxVar, cVar, invoice_status);
        }
        bfxVar.A1("form");
        b70 d = cVar.d(mr11.a);
        if (d instanceof om60) {
            ny61.r("The adapter is already nullable");
            return;
        }
        String str = lxwVar.c;
        if (str == null) {
            bfxVar.k2();
        } else {
            d.a(bfxVar, cVar, str);
        }
        bfxVar.A1("paymentMethodId");
        l80.i.a(bfxVar, cVar, lxwVar.d);
        bfxVar.A1("paidAmount");
        sxw sxwVar = sxw.a;
        dxw dxwVar = lxwVar.e;
        boolean z = bfxVar instanceof ek00;
        if (z) {
            ek00 ek00Var = (ek00) bfxVar;
            ek00Var.u();
            sxwVar.a(bfxVar, cVar, dxwVar);
            ek00Var.y();
        } else {
            ek00 ek00Var2 = new ek00();
            ek00Var2.u();
            sxwVar.a(ek00Var2, cVar, dxwVar);
            ek00Var2.y();
            uga1.f(bfxVar, ek00Var2.c());
        }
        bfxVar.A1("payment");
        ep60 ep60Var = new ep60(txw.a, true);
        fxw fxwVar = lxwVar.f;
        if (fxwVar == null) {
            bfxVar.k2();
        } else {
            ep60Var.a(bfxVar, cVar, fxwVar);
        }
        bfxVar.A1("totalAmount");
        uxw uxwVar = uxw.a;
        hxw hxwVar = lxwVar.g;
        if (z) {
            ek00 ek00Var3 = (ek00) bfxVar;
            ek00Var3.u();
            uxwVar.a(bfxVar, cVar, hxwVar);
            ek00Var3.y();
        } else {
            ek00 ek00Var4 = new ek00();
            ek00Var4.u();
            uxwVar.a(ek00Var4, cVar, hxwVar);
            ek00Var4.y();
            uga1.f(bfxVar, ek00Var4.c());
        }
        bfxVar.A1("invoicePollingParams");
        l80.a(rxw.a).a(bfxVar, cVar, lxwVar.h);
        bfxVar.A1("widgetQrCodeParams");
        ep60 a2 = l80.a(vxw.a);
        jxw jxwVar = lxwVar.i;
        if (jxwVar == null) {
            bfxVar.k2();
        } else {
            a2.a(bfxVar, cVar, jxwVar);
        }
    }
}
