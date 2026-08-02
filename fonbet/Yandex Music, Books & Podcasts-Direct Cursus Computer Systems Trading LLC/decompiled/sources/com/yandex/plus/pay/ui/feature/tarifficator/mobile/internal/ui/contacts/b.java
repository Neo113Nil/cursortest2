package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts;

import androidx.fragment.app.o;
import defpackage.cdk;
import defpackage.cg1;
import defpackage.dfi;
import defpackage.ot0;
import defpackage.s9f;
import defpackage.x97;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class b implements com.yandex.plus.pay.ui.webview.paymentwidget.ui.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ b(o oVar, int i) {
        this.a = i;
        this.b = oVar;
    }

    @Override // com.yandex.plus.pay.ui.webview.paymentwidget.ui.b
    public final void a() {
        int i = this.a;
        o oVar = this.b;
        switch (i) {
            case 0:
                s9f[] s9fVarArr = g.q;
                k z = ((g) oVar).z();
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.a aVar = z.o;
                if (aVar != null) {
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a = z.k.a.a();
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b bVar = z.n;
                    String uuid = a.a.toString();
                    uuid.getClass();
                    String str = aVar.a;
                    String str2 = aVar.b;
                    bVar.getClass();
                    str.getClass();
                    str2.getClass();
                    cdk cdkVar = bVar.a;
                    cdkVar.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("purchase_session_id", uuid);
                    linkedHashMap.put("url", str);
                    linkedHashMap.put("skipButtonText", str2);
                    linkedHashMap.put("_meta", cdk.c(new HashMap()));
                    cdkVar.f("CollectingContacts.Screen.WebView.Loaded", linkedHashMap);
                    break;
                }
                break;
            case 1:
                s9f[] s9fVarArr2 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.f.q;
                com.yandex.plus.pay.log.impl.b.d(((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.f) oVar).z().q, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.log.a.a, "Success WebView loaded URL successfully");
                break;
            default:
                s9f[] s9fVarArr3 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.d.m;
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.h y = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.d) oVar).y();
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.topup.a aVar2 = y.o;
                if (aVar2 != null) {
                    com.yandex.plus.pay.ui.core.tarifficator.api.domain.topup.a aVar3 = y.m;
                    String str3 = aVar2.a;
                    String str4 = aVar2.b;
                    if (str4 == null) {
                        str4 = "no_value";
                    }
                    aVar3.getClass();
                    str3.getClass();
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a2 = aVar3.a.a();
                    cdk cdkVar2 = aVar3.b;
                    String d = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a2.a);
                    cdkVar2.getClass();
                    d.getClass();
                    LinkedHashMap m = dfi.m("purchase_session_id", d, "action_scenario", str3);
                    m.put("url", str4);
                    m.put("_meta", cdk.c(new HashMap()));
                    cdkVar2.f("PostPaymentYB.WebView.Loaded", m);
                }
                com.yandex.plus.pay.log.impl.b.d(y.n, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.log.a.a, "Topup WebView loaded URL successfully");
                break;
        }
    }

    @Override // com.yandex.plus.pay.ui.webview.paymentwidget.ui.b
    public final void b(String str) {
        int i = this.a;
        o oVar = this.b;
        switch (i) {
            case 0:
                s9f[] s9fVarArr = g.q;
                k z = ((g) oVar).z();
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.a aVar = z.o;
                if (aVar != null) {
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a = z.k.a.a();
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b bVar = z.n;
                    String uuid = a.a.toString();
                    uuid.getClass();
                    String str2 = aVar.a;
                    String str3 = aVar.b;
                    bVar.getClass();
                    str2.getClass();
                    str3.getClass();
                    cdk cdkVar = bVar.a;
                    cdkVar.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("purchase_session_id", uuid);
                    linkedHashMap.put("url", str2);
                    linkedHashMap.put("skipButtonText", str3);
                    linkedHashMap.put("fail_reason", str);
                    linkedHashMap.put("_meta", cdk.c(new HashMap()));
                    cdkVar.f("CollectingContacts.Screen.WebView.Fail", linkedHashMap);
                    break;
                }
                break;
            case 1:
                s9f[] s9fVarArr2 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.f.q;
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.k z2 = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.f) oVar).z();
                com.yandex.plus.pay.log.impl.b.f(z2.q, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.log.a.a, "Success WebView could\\'t load contacts URL", null, 12);
                z2.H();
                break;
            default:
                s9f[] s9fVarArr3 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.d.m;
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.h y = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.d) oVar).y();
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.topup.a aVar2 = y.o;
                if (aVar2 != null) {
                    com.yandex.plus.pay.ui.core.tarifficator.api.domain.topup.a aVar3 = y.m;
                    String str4 = aVar2.a;
                    String str5 = aVar2.b;
                    if (str5 == null) {
                        str5 = "no_value";
                    }
                    aVar3.getClass();
                    str4.getClass();
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a2 = aVar3.a.a();
                    cdk cdkVar2 = aVar3.b;
                    String d = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a2.a);
                    cdkVar2.getClass();
                    d.getClass();
                    LinkedHashMap m = dfi.m("purchase_session_id", d, "action_scenario", str4);
                    m.put("url", str5);
                    m.put("fail_reason", str);
                    m.put("_meta", cdk.c(new HashMap()));
                    cdkVar2.f("PostPaymentYB.WebView.Fail", m);
                }
                com.yandex.plus.pay.log.impl.b.f(y.n, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.log.a.a, "Topup WebView could\\'t load URL", null, 12);
                y.G();
                break;
        }
    }

    @Override // com.yandex.plus.pay.ui.webview.paymentwidget.ui.b
    public final void e() {
        int i = this.a;
        o oVar = this.b;
        switch (i) {
            case 0:
                s9f[] s9fVarArr = g.q;
                ((g) oVar).z().G();
                break;
            case 1:
                s9f[] s9fVarArr2 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.f.q;
                ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.f) oVar).z().l.b(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.b.e);
                break;
            default:
                s9f[] s9fVarArr3 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.d.m;
                ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.d) oVar).y().H();
                break;
        }
    }

    @Override // com.yandex.plus.pay.ui.webview.paymentwidget.ui.b
    public final void h() {
        int i = this.a;
        o oVar = this.b;
        switch (i) {
            case 0:
                s9f[] s9fVarArr = g.q;
                ((g) oVar).z().G();
                break;
            case 1:
                s9f[] s9fVarArr2 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.f.q;
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.k z = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.f) oVar).z();
                com.yandex.plus.pay.log.impl.b.f(z.q, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.log.a.a, "Success WebView error on the web side", null, 12);
                z.H();
                break;
            default:
                s9f[] s9fVarArr3 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.d.m;
                ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.d) oVar).y().H();
                break;
        }
    }

    @Override // com.yandex.plus.pay.ui.webview.paymentwidget.ui.b
    public final void m(String str, boolean z) {
        switch (this.a) {
            case 1:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.f fVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.f) this.b;
                s9f[] s9fVarArr = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.f.q;
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.k z2 = fVar.z();
                x97.y(ot0.F(z2), null, null, new cg1(z, z2, str, (Continuation) null, 26), 3);
                break;
        }
    }

    @Override // com.yandex.plus.pay.ui.webview.paymentwidget.ui.b
    public final void v() {
        int i = this.a;
        o oVar = this.b;
        switch (i) {
            case 0:
                s9f[] s9fVarArr = g.q;
                k z = ((g) oVar).z();
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.a aVar = z.o;
                if (aVar != null) {
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a = z.k.a.a();
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.contacts.b bVar = z.n;
                    String uuid = a.a.toString();
                    uuid.getClass();
                    bVar.b(uuid, aVar.a, aVar.b);
                }
                z.G();
                break;
            case 1:
                s9f[] s9fVarArr2 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.f.q;
                ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.f) oVar).z().l.b(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.b.e);
                break;
            default:
                s9f[] s9fVarArr3 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.d.m;
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.h y = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.d) oVar).y();
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.topup.a aVar2 = y.o;
                if (aVar2 != null) {
                    com.yandex.plus.pay.ui.core.tarifficator.api.domain.topup.a aVar3 = y.m;
                    String str = aVar2.a;
                    String str2 = aVar2.b;
                    if (str2 == null) {
                        str2 = "no_value";
                    }
                    aVar3.getClass();
                    str.getClass();
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a2 = aVar3.a.a();
                    cdk cdkVar = aVar3.b;
                    String d = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a2.a);
                    cdkVar.getClass();
                    d.getClass();
                    LinkedHashMap m = dfi.m("purchase_session_id", d, "action_scenario", str);
                    m.put("url", str2);
                    m.put("_meta", cdk.c(new HashMap()));
                    cdkVar.f("PostPaymentYB.Result.Success", m);
                    break;
                }
                break;
        }
    }

    @Override // com.yandex.plus.pay.ui.webview.paymentwidget.ui.b
    public final void y(String str) {
        int i = this.a;
        o oVar = this.b;
        switch (i) {
            case 0:
                s9f[] s9fVarArr = g.q;
                k z = ((g) oVar).z();
                if (z.o != null) {
                    z.n.a(str);
                }
                z.G();
                break;
            case 1:
                s9f[] s9fVarArr2 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.f.q;
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.k z2 = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.f) oVar).z();
                com.yandex.plus.pay.log.impl.b.f(z2.q, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.log.a.a, "Success WebView error on the web side", null, 12);
                z2.H();
                break;
            default:
                s9f[] s9fVarArr3 = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.d.m;
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.h y = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.d) oVar).y();
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.topup.a aVar = y.o;
                if (aVar != null) {
                    com.yandex.plus.pay.ui.core.tarifficator.api.domain.topup.a aVar2 = y.m;
                    String str2 = aVar.a;
                    String str3 = aVar.b;
                    if (str3 == null) {
                        str3 = "no_value";
                    }
                    aVar2.getClass();
                    str2.getClass();
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a = aVar2.a.a();
                    cdk cdkVar = aVar2.b;
                    String d = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a.a);
                    cdkVar.getClass();
                    d.getClass();
                    LinkedHashMap m = dfi.m("purchase_session_id", d, "action_scenario", str2);
                    m.put("url", str3);
                    m.put("fail_reason", str);
                    m.put("_meta", cdk.c(new HashMap()));
                    cdkVar.f("PostPaymentYB.Result.Failed", m);
                }
                com.yandex.plus.pay.log.impl.b.f(y.n, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.log.a.a, "Topup WebView error on the web side", null, 12);
                y.G();
                break;
        }
    }

    private final void c(String str, boolean z) {
    }

    private final void d(String str, boolean z) {
    }
}
