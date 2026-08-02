package com.yandex.plus.divkit.impl;

import defpackage.a8k;
import defpackage.btf;
import defpackage.jyr;
import defpackage.ozb;
import defpackage.pzb;
import defpackage.qzb;
import defpackage.szb;
import defpackage.uct;
import defpackage.x5f;
import defpackage.xzb;
import defpackage.y7k;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class n {
    public final xzb a;
    public final jyr b;
    public final jyr c;

    public n(xzb xzbVar, com.yandex.plus.bdui.plus.webview.navigation.a aVar, com.yandex.plus.bdui.content.b bVar) {
        xzbVar.getClass();
        this.a = xzbVar;
        this.b = btf.b(new com.yandex.plus.bdui.content.b(12, aVar, this));
        this.c = btf.b(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(n nVar, JSONObject jSONObject, String str, Function1 function1, uct uctVar, int i) {
        szb qzbVar;
        o oVar = new o(0, new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, uctVar, uct.class, "isTypeValid", "isTypeValid(Ljava/lang/Object;)Z", 0, 6));
        y7k y7kVar = (y7k) nVar.c.getValue();
        int i2 = x5f.a;
        Object opt = jSONObject.opt(str);
        if (opt == null || opt == JSONObject.NULL) {
            opt = null;
        }
        if (opt != null) {
            if ((opt instanceof String) && StringsKt.M((CharSequence) opt, "@{", false)) {
                qzbVar = new pzb(str, opt.toString(), function1, oVar, y7kVar, uctVar, null);
            } else {
                try {
                    Object invoke = function1.invoke(opt);
                    if (invoke == null) {
                        y7kVar.a(a8k.e(jSONObject, str, opt));
                    } else if (uctVar.b(invoke)) {
                        try {
                            if (oVar.a(invoke)) {
                                qzbVar = invoke instanceof String ? new qzb(y7kVar, (String) invoke) : new ozb(invoke);
                            } else {
                                y7kVar.a(a8k.e(jSONObject, str, opt));
                            }
                        } catch (ClassCastException unused) {
                            y7kVar.a(a8k.l(jSONObject, str, opt));
                        }
                    } else {
                        y7kVar.a(a8k.l(jSONObject, str, opt));
                    }
                } catch (ClassCastException unused2) {
                    y7kVar.a(a8k.l(jSONObject, str, opt));
                } catch (Exception e) {
                    y7kVar.a(a8k.f(jSONObject, str, opt, e));
                }
            }
            if (qzbVar == null) {
                return qzbVar.a(nVar.a);
            }
            return null;
        }
        qzbVar = null;
        if (qzbVar == null) {
        }
    }
}
