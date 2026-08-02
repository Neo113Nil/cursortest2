package com.yandex.plus.pay.ui.webview.paymentwidget.domain;

import com.connectsdk.service.NetcastTVService;
import defpackage.avf;
import defpackage.eg7;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.ohp;
import defpackage.pkr;
import defpackage.q5f;
import defpackage.s4f;
import defpackage.t9f;
import defpackage.v6f;
import defpackage.w4f;
import defpackage.x4f;

/* loaded from: classes5.dex */
public final class m implements t9f {
    public static final m a = new m();
    public static final ohp b = avf.w("WebPaymentWidgetMessageV3", new mhp[0]);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        if (r0.equals("need-auth") == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        return com.yandex.plus.pay.ui.webview.paymentwidget.domain.d.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r0.equals("need-auth-token") == false) goto L104;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.t9f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deserialize(eg7 eg7Var) {
        w4f w4fVar;
        w4f w4fVar2;
        w4f w4fVar3;
        w4f w4fVar4;
        w4f w4fVar5;
        w4f w4fVar6;
        eg7Var.getClass();
        Boolean bool = null;
        r1 = null;
        r1 = null;
        String str = null;
        bool = null;
        s4f s4fVar = eg7Var instanceof s4f ? (s4f) eg7Var : null;
        if (s4fVar != null) {
            w4f w4fVar7 = (w4f) x4f.f(s4fVar.f()).get(NetcastTVService.UDAP_API_EVENT);
            q5f f = w4fVar7 != null ? x4f.f(w4fVar7) : null;
            String a2 = (f == null || (w4fVar6 = (w4f) f.get("name")) == null) ? null : x4f.g(w4fVar6).a();
            if (a2 != null) {
                switch (a2.hashCode()) {
                    case -1867169789:
                        if (a2.equals("success")) {
                            return g.a;
                        }
                        break;
                    case -959507675:
                        if (a2.equals("yb-open-card-success")) {
                            w4f w4fVar8 = (w4f) f.get("data");
                            String a3 = (w4fVar8 == null || (w4fVar = (w4f) x4f.f(w4fVar8).get("paymentMethodId")) == null) ? null : x4f.g(w4fVar).a();
                            if (a3 != null) {
                                return new i(a3);
                            }
                        }
                        break;
                    case -829804187:
                        if (a2.equals("init-start")) {
                            return f.a;
                        }
                        break;
                    case -505795735:
                        if (a2.equals("open-uri")) {
                            w4f w4fVar9 = (w4f) f.get("data");
                            String a4 = (w4fVar9 == null || (w4fVar3 = (w4f) x4f.f(w4fVar9).get("uri")) == null) ? null : x4f.g(w4fVar3).a();
                            w4f w4fVar10 = (w4f) f.get("data");
                            if (w4fVar10 != null && (w4fVar2 = (w4f) x4f.f(w4fVar10).get("requireAuthorization")) != null) {
                                v6f g = x4f.g(w4fVar2);
                                bool = pkr.b(g.a());
                                if (bool == null) {
                                    throw new IllegalStateException(g + " does not represent a Boolean");
                                }
                            }
                            return new e(a4 != null ? a4 : "", bool != null ? bool.booleanValue() : true);
                        }
                        break;
                    case 3327206:
                        if (a2.equals("load")) {
                            return c.a;
                        }
                        break;
                    case 94756344:
                        if (a2.equals("close")) {
                            return a.a;
                        }
                        break;
                    case 96784904:
                        if (a2.equals("error")) {
                            w4f w4fVar11 = (w4f) f.get("data");
                            if (w4fVar11 != null && (w4fVar4 = (w4f) x4f.f(w4fVar11).get("error")) != null && (w4fVar5 = (w4f) x4f.f(w4fVar4).get("code")) != null) {
                                str = x4f.g(w4fVar5).a();
                            }
                            return new b(str != null ? str : "");
                        }
                        break;
                    case 907908907:
                        break;
                    case 1029727359:
                        break;
                }
            }
        }
        return null;
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        l6bVar.getClass();
        throw new UnsupportedOperationException("WebPaymentWidgetMessageV3Deserializer does not support serialization");
    }
}
