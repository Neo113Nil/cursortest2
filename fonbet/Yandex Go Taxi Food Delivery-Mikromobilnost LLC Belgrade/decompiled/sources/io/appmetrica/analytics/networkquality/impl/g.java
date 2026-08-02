package io.appmetrica.analytics.networkquality.impl;

import defpackage.a7e;
import defpackage.c6w;
import defpackage.d6w;
import defpackage.qrq0;
import defpackage.scc;
import defpackage.y6i0;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.networkquality.internal.NetworkQualityConfigWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class g implements JsonParser {
    public final String a = "startup_random_delay_max_seconds";
    public final String b = "repeat_interval_seconds";
    public final String c = "requests";
    public final String d = "url";
    public final String e = "method";
    public final String f = "headers";
    public final String g = "type";
    public final String h = "delay";
    public final String i = "retry_count";
    public final String j = "retry_base_delay";
    public final String k = "retry_jitter";
    public final String l = "connect_timeout_seconds";
    public final String m = "attempt_timeout_seconds";
    public final String n = "retry_on_success";
    public final String o = "collect_network_metrics";
    public final String p = "network_metrics_failure_only";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.ArrayList] */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final NetworkQualityConfigWrapper parse(JSONObject jSONObject) {
        ?? r9;
        Object failure;
        JSONObject optJSONObject = jSONObject.optJSONObject("network_quality");
        j jVar = new j();
        jVar.a = RemoteConfigJsonUtils.extractFeature(jSONObject, "network_quality", jVar.a);
        if (optJSONObject != null) {
            jVar.b = optJSONObject.optInt(this.a, jVar.b);
            jVar.c = optJSONObject.optInt(this.b, jVar.c);
        }
        NetworkQualityConfigWrapper.Companion companion = NetworkQualityConfigWrapper.INSTANCE;
        boolean z = jVar.a;
        int i = jVar.b;
        int i2 = jVar.c;
        JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray(this.c) : null;
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            r9 = EmptyList.a;
        } else {
            d6w n = y6i0.n(0, optJSONArray.length());
            r9 = new ArrayList();
            c6w it = n.iterator();
            while (it.c) {
                try {
                    failure = c(optJSONArray.getJSONObject(it.nextInt()));
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                t tVar = (t) failure;
                if (tVar != null) {
                    r9.add(tVar);
                }
            }
        }
        boolean isEmpty = r9.isEmpty();
        List list = r9;
        if (isEmpty) {
            Map map = b.a;
            list = scc.g(new t("https://yastatic.net/nearest.js", "GET", map, "beacon", 0, 2, 250, 150, 5, 10, false, false, false), new t("https://network-lc.ru", "GET", map, "target", 0, 3, 250, 150, 5, 10, false, false, false));
        }
        return companion.toWrapper$network_quality_release(new f(z, i, i2, list));
    }

    public final NetworkQualityConfigWrapper b(JSONObject jSONObject) {
        return (NetworkQualityConfigWrapper) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    public final t c(JSONObject jSONObject) {
        Map f;
        i iVar = new i();
        iVar.a = jSONObject.optString(this.d, iVar.a);
        iVar.b = jSONObject.optString(this.e, iVar.b);
        iVar.d = jSONObject.optString(this.g, iVar.d);
        iVar.e = jSONObject.optInt(this.h, iVar.e);
        iVar.f = jSONObject.optInt(this.i, iVar.f);
        iVar.g = jSONObject.optInt(this.j, iVar.g);
        iVar.h = jSONObject.optInt(this.k, iVar.h);
        iVar.i = jSONObject.optInt(this.l, iVar.i);
        iVar.j = jSONObject.optInt(this.m, iVar.j);
        iVar.k = jSONObject.optBoolean(this.n, iVar.k);
        iVar.l = jSONObject.optBoolean(this.o, iVar.l);
        iVar.m = jSONObject.optBoolean(this.p, iVar.m);
        JSONObject optJSONObject = jSONObject.optJSONObject(this.f);
        if (optJSONObject != null) {
            qrq0 b = kotlin.sequences.a.b(optJSONObject.keys());
            f = new LinkedHashMap();
            Iterator it = ((a7e) b).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                f.put(next, optJSONObject.optString((String) next, ""));
            }
        } else {
            f = kotlin.collections.b.f();
        }
        return new t(iVar.a, iVar.b, f, iVar.d, iVar.e, iVar.f, iVar.g, iVar.h, iVar.i, iVar.j, iVar.k, iVar.l, iVar.m);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (NetworkQualityConfigWrapper) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
