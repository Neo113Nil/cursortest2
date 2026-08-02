package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts;

import defpackage.cdk;
import defpackage.dfi;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class b {
    public final cdk a;

    public b(cdk cdkVar) {
        cdkVar.getClass();
        this.a = cdkVar;
    }

    public final void a(String str) {
        cdk cdkVar = this.a;
        cdkVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("fail_reason", str);
        linkedHashMap.put("_meta", cdk.c(new HashMap()));
        cdkVar.f("CollectingContacts.SendMail.Failed", linkedHashMap);
    }

    public final void b(String str, String str2, String str3) {
        dfi.s(str, str2, str3);
        cdk cdkVar = this.a;
        cdkVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("purchase_session_id", str);
        linkedHashMap.put("url", str2);
        linkedHashMap.put("skipButtonText", str3);
        linkedHashMap.put("_meta", cdk.c(new HashMap()));
        cdkVar.f("CollectingContacts.SendMail.Success", linkedHashMap);
    }
}
