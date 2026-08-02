package com.yandex.plus.pay.ui.webview.paymentwidget.domain;

import defpackage.avf;
import defpackage.eg7;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.ohp;
import defpackage.q5f;
import defpackage.s4f;
import defpackage.t9f;
import defpackage.w4f;
import defpackage.x4f;

/* loaded from: classes5.dex */
public final class l implements t9f {
    public static final l a = new l();
    public static final ohp b = avf.w("WebPaymentWidgetMessageV2", new mhp[0]);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        w4f w4fVar;
        w4f w4fVar2;
        w4f w4fVar3;
        eg7Var.getClass();
        s4f s4fVar = eg7Var instanceof s4f ? (s4f) eg7Var : null;
        if (s4fVar != null) {
            q5f f = x4f.f(s4fVar.f());
            w4f w4fVar4 = (w4f) f.get("type");
            String a2 = w4fVar4 != null ? x4f.g(w4fVar4).a() : null;
            if (a2 != null) {
                switch (a2.hashCode()) {
                    case -1149187101:
                        if (a2.equals("SUCCESS")) {
                            return g.a;
                        }
                        break;
                    case -402916431:
                        if (a2.equals("NEED_AUTH")) {
                            return d.a;
                        }
                        break;
                    case 66247144:
                        if (a2.equals("ERROR")) {
                            w4f w4fVar5 = (w4f) f.get("data");
                            String a3 = (w4fVar5 == null || (w4fVar = (w4f) x4f.f(w4fVar5).get("error")) == null || (w4fVar2 = (w4f) x4f.f(w4fVar).get("code")) == null) ? null : x4f.g(w4fVar2).a();
                            if (a3 != null) {
                                return new b(a3);
                            }
                        }
                        break;
                    case 79219825:
                        if (a2.equals("STATE")) {
                            w4f w4fVar6 = (w4f) f.get("data");
                            String a4 = (w4fVar6 == null || (w4fVar3 = (w4f) x4f.f(w4fVar6).get("status")) == null) ? null : x4f.g(w4fVar3).a();
                            if (a4 != null) {
                                int hashCode = a4.hashCode();
                                if (hashCode != -1097519099) {
                                    if (hashCode != 94756344) {
                                        if (hashCode == 1422096580 && a4.equals("init-started")) {
                                            return f.a;
                                        }
                                    } else if (a4.equals("close")) {
                                        return a.a;
                                    }
                                } else if (a4.equals("loaded")) {
                                    return c.a;
                                }
                            }
                        }
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
        throw new UnsupportedOperationException("WebPaymentWidgetMessageV2Deserializer does not support serialization");
    }
}
