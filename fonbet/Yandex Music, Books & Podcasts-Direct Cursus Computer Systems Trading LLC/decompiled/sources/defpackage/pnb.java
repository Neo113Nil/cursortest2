package defpackage;

import com.connectsdk.service.NetcastTVService;
import com.yandex.plus.home.plaque.plugin.internal.proxy.a;
import com.yandex.plus.pay.internal.di.e;
import com.yandex.plus.pay.internal.di.p;
import com.yandex.plus.pay.internal.di.q;
import com.yandex.plus.pay.reporter.api.d;
import com.yandex.plus.pay.reporter.api.f;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class pnb {
    public final a a;
    public final p b;
    public final q c;

    public pnb(a aVar, p pVar, q qVar) {
        pVar.getClass();
        qVar.getClass();
        this.a = aVar;
        this.b = pVar;
        this.c = qVar;
    }

    public static HashMap a(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap3.put("version", 1);
        hashMap2.put(NetcastTVService.UDAP_API_EVENT, hashMap3);
        hashMap2.put("interfaces", hashMap);
        return hashMap2;
    }

    public final void b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map map) {
        str.getClass();
        str2.getClass();
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("session_id", str);
        linkedHashMap.put("service", str2);
        linkedHashMap.put("service_channel", str3);
        linkedHashMap.put("external_id", str4);
        linkedHashMap.put("test_ids", str5);
        linkedHashMap.put("triggered_test_ids", str6);
        linkedHashMap.put("external_test_ids", str7);
        linkedHashMap.put("external_triggered_test_ids", str8);
        linkedHashMap.put("custom_parameters", map);
        linkedHashMap.put("_meta", a(new HashMap()));
        e("PlusPayment.FrontSessionStart", linkedHashMap);
    }

    public final void c(String str, onb onbVar, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("session_id", str);
        linkedHashMap.put("reason", onbVar.a);
        linkedHashMap.put("target", str2);
        linkedHashMap.put("error", str3);
        linkedHashMap.put("_meta", a(new HashMap()));
        e("PlusPayment.LoadOffers.ClientError", linkedHashMap);
    }

    public final void d(String str, String str2, String str3, List list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("session_id", str);
        linkedHashMap.put("target", str2);
        linkedHashMap.put("offers_batch_id", str3);
        linkedHashMap.put("resulted_offer_position_ids", list);
        linkedHashMap.put("_meta", a(new HashMap()));
        e("PlusPayment.LoadOffers.Resulted", linkedHashMap);
    }

    public final void e(String str, LinkedHashMap linkedHashMap) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(linkedHashMap);
        hashMap.putAll(this.b.a().a);
        hashMap.putAll(this.c.a().b);
        ((f) ((e) ((ie5) this.a.b).b).d.getValue()).b(new com.yandex.plus.pay.reporter.api.e(d.a, str, hashMap, (Throwable) null));
    }
}
