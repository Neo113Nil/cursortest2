package com.yandex.plus.pay.ui.webview.family.domain;

import defpackage.cdk;
import defpackage.dfi;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class a {
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b a;
    public final cdk b;

    public a(com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.b bVar, cdk cdkVar) {
        bVar.getClass();
        cdkVar.getClass();
        this.a = bVar;
        this.b = cdkVar;
    }

    public final void a(String str) {
        str.getClass();
        cdk cdkVar = this.b;
        cdkVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("fail_reason", str);
        linkedHashMap.put("_meta", cdk.c(new HashMap()));
        cdkVar.f("FamilyInvite.Fail", linkedHashMap);
    }

    public final void b(String str, String str2, String str3, String str4) {
        dfi.s(str, str2, str3);
        cdk cdkVar = this.b;
        cdkVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("purchase_session_id", str);
        linkedHashMap.put("url", str2);
        linkedHashMap.put("skipButtonText", str3);
        linkedHashMap.put("fail_reason", str4);
        linkedHashMap.put("_meta", cdk.c(new HashMap()));
        cdkVar.f("FamilyInvite.Screen.WebView.Fail", linkedHashMap);
    }

    public final void c(String str, String str2, String str3) {
        dfi.s(str, str2, str3);
        cdk cdkVar = this.b;
        cdkVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("purchase_session_id", str);
        linkedHashMap.put("url", str2);
        linkedHashMap.put("skipButtonText", str3);
        linkedHashMap.put("_meta", cdk.c(new HashMap()));
        cdkVar.f("FamilyInvite.Screen.WebView.Loaded", linkedHashMap);
    }
}
