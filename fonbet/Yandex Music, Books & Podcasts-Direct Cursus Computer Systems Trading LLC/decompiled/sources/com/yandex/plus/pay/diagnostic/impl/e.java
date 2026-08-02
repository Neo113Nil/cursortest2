package com.yandex.plus.pay.diagnostic.impl;

import defpackage.bck;
import defpackage.dfi;
import defpackage.x3f;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class e {
    public final bck a;
    public final x3f b;

    public e(bck bckVar, x3f x3fVar) {
        x3fVar.getClass();
        this.a = bckVar;
        this.b = x3fVar;
    }

    public final void a(String str, String str2, String str3, String str4) {
        if (str == null) {
            str = "no_value";
        }
        if (str2 == null) {
            str2 = "no_value";
        }
        if (str4 == null) {
            str4 = "no_value";
        }
        LinkedHashMap m = dfi.m("requestId", str, "additionalData", "silent_param_always_false");
        m.put("sessionId", str2);
        m.put("invoiceId", str3);
        m.put("status", str4);
        m.put("silent", String.valueOf(false));
        m.put("_meta", bck.c(new HashMap()));
        this.a.d("Error.Subscription.Tarifficator.Native.Invoice.GetStatus.UnexpectedStatus", m);
    }
}
