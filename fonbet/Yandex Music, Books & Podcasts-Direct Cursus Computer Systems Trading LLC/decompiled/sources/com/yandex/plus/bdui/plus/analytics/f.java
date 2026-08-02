package com.yandex.plus.bdui.plus.analytics;

import com.connectsdk.service.NetcastTVService;
import defpackage.btf;
import defpackage.e5b;
import defpackage.jyr;
import defpackage.r0w;
import defpackage.tah;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class f extends a {
    public static final LinkedHashMap e;
    public final jyr d;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map b = tah.b(new Pair("version", 1));
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        linkedHashMap.put(NetcastTVService.UDAP_API_EVENT, b);
        linkedHashMap.put("interfaces", e5bVar);
        e = linkedHashMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Function0 function0, com.yandex.plus.log.api.b bVar) {
        super(null, bVar, "PlusDwhAnalyticsTransport");
        function0.getClass();
        bVar.getClass();
        this.d = btf.b(function0);
    }

    @Override // com.yandex.plus.bdui.analytics.a
    public final void a(com.yandex.plus.bdui.analytics.c cVar) {
        cVar.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.b;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "PlusDwhAnalyticsTransport", "sendEvent(); event = " + cVar);
        }
        b((com.yandex.plus.analytics.dwh.a) this.d.getValue(), cVar, new r0w(15, this));
    }
}
