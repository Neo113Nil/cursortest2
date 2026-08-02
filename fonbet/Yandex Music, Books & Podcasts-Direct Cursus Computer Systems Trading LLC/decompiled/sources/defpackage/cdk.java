package defpackage;

import com.connectsdk.service.NetcastTVService;
import com.yandex.plus.domain.auth.api.d;
import com.yandex.plus.domain.auth.api.e;
import com.yandex.plus.experiments.impl.providers.h;
import com.yandex.plus.pay.ui.core.internal.common.a;
import com.yandex.plus.pay.ui.core.internal.common.b;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class cdk {
    public final a a;
    public final a b;
    public final com.yandex.plus.home.plaque.plugin.internal.proxy.a c;

    public cdk(a aVar, a aVar2, com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public static HashMap c(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap3.put("version", 1);
        hashMap2.put(NetcastTVService.UDAP_API_EVENT, hashMap3);
        hashMap2.put("interfaces", hashMap);
        return hashMap2;
    }

    public final void a(String str, String str2, String str3, vck vckVar) {
        str2.getClass();
        str3.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("purchase_session_id", str);
        linkedHashMap.put("url", str2);
        linkedHashMap.put("skipButtonText", str3);
        linkedHashMap.put("source", vckVar.a);
        linkedHashMap.put("_meta", c(new HashMap()));
        f("CollectingContacts.Close.Clicked", linkedHashMap);
    }

    public final void b(String str, String str2, String str3, wck wckVar) {
        str3.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("purchase_session_id", str);
        linkedHashMap.put("url", str2);
        linkedHashMap.put("skipButtonText", str3);
        linkedHashMap.put("source", wckVar.a);
        linkedHashMap.put("_meta", c(new HashMap()));
        f("FamilyInvite.Close.Clicked", linkedHashMap);
    }

    public final void d(String str, String str2, ArrayList arrayList, boolean z, List list) {
        str.getClass();
        list.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("purchase_session_id", str);
        linkedHashMap.put("product_id", str2);
        dfi.u(linkedHashMap, "options_id", arrayList, true, "is_tarifficator");
        linkedHashMap.put("card_linked", String.valueOf(z));
        linkedHashMap.put("payment_method_ids", list);
        linkedHashMap.put("_meta", c(new HashMap()));
        f("PaymentMethods.Shown", linkedHashMap);
    }

    public final void e(String str, String str2, ArrayList arrayList, zck zckVar, String str3, String str4, String str5, String str6, adk adkVar, boolean z) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("purchase_session_id", str);
        linkedHashMap.put("product_id", str2);
        dfi.u(linkedHashMap, "options_id", arrayList, true, "is_tarifficator");
        linkedHashMap.put("payment_option", zckVar.a);
        linkedHashMap.put("payment_method_id", str3);
        linkedHashMap.put("fail_reason", str4);
        linkedHashMap.put(Constants.KEY_PAGE, str5);
        linkedHashMap.put("place", str6);
        linkedHashMap.put("source_type", adkVar.a);
        linkedHashMap.put("silent", String.valueOf(z));
        linkedHashMap.put("_meta", c(new HashMap()));
        f("PaymentProcess.Failed", linkedHashMap);
    }

    public final void f(String str, LinkedHashMap linkedHashMap) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(linkedHashMap);
        b bVar = this.b.a;
        h hVar = bVar.g;
        vdr vdrVar = bVar.e;
        Object f = hVar.f();
        r7o r7oVar = z7o.b;
        if (f instanceof t7o) {
            f = null;
        }
        com.yandex.plus.experiments.api.a aVar = (com.yandex.plus.experiments.api.a) f;
        String str2 = bVar.c;
        String str3 = bVar.d;
        String str4 = bVar.a;
        com.yandex.plus.core.user.a aVar2 = (com.yandex.plus.core.user.a) bVar.f.invoke();
        idk idkVar = vdrVar.getValue() instanceof d ? idk.NotLoggedIn : aVar2 == com.yandex.plus.core.user.a.a ? idk.NoSubscription : aVar2 == com.yandex.plus.core.user.a.b ? idk.Active : idk.Unknown;
        String str5 = aVar != null ? aVar.a : null;
        if (str5 == null) {
            str5 = "no_value";
        }
        String str6 = aVar != null ? aVar.b : null;
        if (str6 == null) {
            str6 = "no_value";
        }
        Long id = ((e) vdrVar.getValue()).getId();
        String l = id != null ? id.toString() : null;
        String str7 = l != null ? l : "no_value";
        String uuid = bVar.j.a.toString();
        uuid.getClass();
        String lowerCase = com.yandex.plus.core.locale.b.m(bVar.h).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        str4.getClass();
        hashMap.putAll(uah.e(new Pair(CommonUrlParts.APP_ID, str2), new Pair("app_version", str3), new Pair("service", str4), new Pair("sdk_version", "110.0.0"), new Pair("subscription_state", idkVar.a), new Pair("testids", str5), new Pair("triggered_testids", str6), new Pair("puid", str7), new Pair("log_session_id", uuid), new Pair("language", lowerCase)));
        hashMap.putAll((Map) ((pv9) this.c.b).b);
        this.a.a.i.b(new com.yandex.plus.pay.reporter.api.e(com.yandex.plus.pay.reporter.api.d.b, str, hashMap, (Throwable) null));
    }
}
