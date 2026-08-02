package defpackage;

import com.connectsdk.service.NetcastTVService;
import com.yandex.plus.home.plaque.plugin.internal.proxy.a;
import com.yandex.plus.pay.internal.analytics.evgen.c;
import com.yandex.plus.pay.reporter.api.d;
import com.yandex.plus.pay.reporter.api.e;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ybk {
    public final a a;
    public final c b;
    public final a c;

    public ybk(a aVar, c cVar, a aVar2) {
        cVar.getClass();
        this.a = aVar;
        this.b = cVar;
        this.c = aVar2;
    }

    public static HashMap a(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap3.put("version", 1);
        hashMap2.put(NetcastTVService.UDAP_API_EVENT, hashMap3);
        hashMap2.put("interfaces", hashMap);
        return hashMap2;
    }

    public final void b(String str, LinkedHashMap linkedHashMap) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(linkedHashMap);
        hashMap.putAll(this.b.a().a);
        hashMap.putAll((Map) ((h4b) this.c.b).a);
        ((com.yandex.plus.pay.internal.analytics.evgen.a) this.a.b).b.b(new e(d.b, str, hashMap, (Throwable) null));
    }
}
