package com.yandex.plus.pay.reporter.impl;

import com.yandex.plus.core.analytics.j;
import com.yandex.plus.core.analytics.k;
import com.yandex.plus.core.analytics.l;
import com.yandex.plus.core.analytics.m;
import com.yandex.plus.pay.reporter.api.e;
import com.yandex.plus.pay.reporter.api.f;
import defpackage.b6e;
import defpackage.e5b;
import defpackage.wop;
import defpackage.xz0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class d implements f {
    public static final Set d;
    public static final LinkedHashSet e;
    public final m a;
    public final k b;
    public final com.yandex.plus.pay.internal.di.a c;

    static {
        Set Y = xz0.Y(new String[]{"sdkVersion", "sdk_version"});
        d = Y;
        e = wop.i(xz0.Y(new String[]{"service", "requestId", "testIds", "testids", "test_ids", "triggeredTestIds", "triggered_testids", "external_triggered_test_ids", "triggered_test_ids", "_meta"}), Y);
    }

    public d(m mVar, k kVar, com.yandex.plus.pay.internal.di.a aVar) {
        this.a = mVar;
        this.b = kVar;
        this.c = aVar;
    }

    public static c c(com.yandex.plus.pay.reporter.api.c cVar) {
        Object obj;
        Object obj2;
        Object obj3;
        String str = null;
        if (!(cVar instanceof com.yandex.plus.pay.reporter.api.a)) {
            if (cVar instanceof com.yandex.plus.pay.reporter.api.b) {
                return new c(null, null, null, ((com.yandex.plus.pay.reporter.api.b) cVar).a);
            }
            b6e.s();
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        Iterator it = d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            String str2 = (String) it.next();
            Map map = ((com.yandex.plus.pay.reporter.api.a) cVar).a;
            obj = map != null ? map.get(str2) : null;
            if (obj != null) {
                break;
            }
        }
        String obj4 = obj != null ? obj.toString() : null;
        Map map2 = ((com.yandex.plus.pay.reporter.api.a) cVar).a;
        String obj5 = (map2 == null || (obj3 = map2.get("service")) == null) ? null : obj3.toString();
        if (map2 != null && (obj2 = map2.get("requestId")) != null) {
            str = obj2.toString();
        }
        if (map2 == null) {
            map2 = e5b.a;
            map2.getClass();
        }
        for (Map.Entry entry : map2.entrySet()) {
            String str3 = (String) entry.getKey();
            Object value = entry.getValue();
            if (!e.contains(str3)) {
                try {
                    jSONObject.put(str3, value);
                } catch (Exception unused) {
                }
            }
        }
        return new c(obj5, obj4, str, jSONObject.toString());
    }

    @Override // com.yandex.plus.pay.reporter.api.f
    public final void a() {
    }

    @Override // com.yandex.plus.pay.reporter.api.f
    public final void b(e eVar) {
        com.yandex.plus.pay.reporter.api.d dVar = eVar.a;
        com.yandex.plus.pay.reporter.api.c cVar = eVar.c;
        int ordinal = dVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            m mVar = this.a;
            if (mVar == null || !((Boolean) this.c.invoke()).booleanValue()) {
                return;
            }
            c c = c(cVar);
            mVar.a(new l(eVar.b, c.b, c.a, c.c, c.d));
            return;
        }
        if (ordinal != 2 && ordinal != 3) {
            if (ordinal == 4) {
                return;
            }
            b6e.s();
            return;
        }
        k kVar = this.b;
        if (kVar != null) {
            c c2 = c(cVar);
            kVar.a(new j(eVar.b, c2.b, c2.a, c2.c, c2.d, eVar.d, null, 904));
        }
    }
}
