package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.jb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0507jb {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f6267a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6268b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6269c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f6270d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6271e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f6272f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6273g;

    /* renamed from: h, reason: collision with root package name */
    public final String f6274h;

    /* renamed from: i, reason: collision with root package name */
    public final CounterConfigurationReporterType f6275i;

    /* renamed from: j, reason: collision with root package name */
    public final String f6276j;

    public C0507jb(String str) {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject("event");
        this.f6267a = Base64.decode(jSONObject2.getString("jvm_crash"), 0);
        this.f6268b = jSONObject2.getString("name");
        this.f6269c = jSONObject2.getInt("bytes_truncated");
        this.f6276j = JsonUtils.optStringOrNull(jSONObject2, "environment");
        String optString = jSONObject2.optString("trimmed_fields");
        this.f6270d = new HashMap();
        if (optString != null) {
            try {
                HashMap c2 = AbstractC0430gb.c(optString);
                if (c2 != null) {
                    for (Map.Entry entry : c2.entrySet()) {
                        this.f6270d.put(L3.valueOf((String) entry.getKey()), Integer.valueOf(Integer.parseInt((String) entry.getValue())));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("process_configuration");
        this.f6271e = jSONObject3.getString("package_name");
        this.f6272f = Integer.valueOf(jSONObject3.getInt("pid"));
        this.f6273g = jSONObject3.getString("psid");
        JSONObject jSONObject4 = jSONObject.getJSONObject("reporter_configuration");
        this.f6274h = jSONObject4.getString("api_key");
        this.f6275i = a(jSONObject4);
    }

    public final String a() {
        return this.f6274h;
    }

    public final int b() {
        return this.f6269c;
    }

    public final byte[] c() {
        return this.f6267a;
    }

    public final String d() {
        return this.f6276j;
    }

    public final String e() {
        return this.f6268b;
    }

    public final String f() {
        return this.f6271e;
    }

    public final Integer g() {
        return this.f6272f;
    }

    public final String h() {
        return this.f6273g;
    }

    public final CounterConfigurationReporterType i() {
        return this.f6275i;
    }

    public final HashMap<L3, Integer> j() {
        return this.f6270d;
    }

    public final String k() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f6270d.entrySet()) {
            hashMap.put(((L3) entry.getKey()).name(), (Integer) entry.getValue());
        }
        return new JSONObject().put("process_configuration", new JSONObject().put("pid", this.f6272f).put("psid", this.f6273g).put("package_name", this.f6271e)).put("reporter_configuration", new JSONObject().put("api_key", this.f6274h).put("reporter_type", this.f6275i.getStringValue())).put("event", new JSONObject().put("jvm_crash", Base64.encodeToString(this.f6267a, 0)).put("name", this.f6268b).put("bytes_truncated", this.f6269c).put("trimmed_fields", AbstractC0430gb.b(hashMap)).putOpt("environment", this.f6276j)).toString();
    }

    public static CounterConfigurationReporterType a(JSONObject jSONObject) {
        return jSONObject.has("reporter_type") ? CounterConfigurationReporterType.fromStringValue(jSONObject.getString("reporter_type")) : CounterConfigurationReporterType.MAIN;
    }

    public C0507jb(P5 p5, H3 h3, HashMap<L3, Integer> hashMap) {
        this.f6267a = p5.getValueBytes();
        this.f6268b = p5.getName();
        this.f6269c = p5.getBytesTruncated();
        if (hashMap != null) {
            this.f6270d = hashMap;
        } else {
            this.f6270d = new HashMap();
        }
        Bf a2 = h3.a();
        this.f6271e = a2.e();
        this.f6272f = a2.f();
        this.f6273g = a2.g();
        CounterConfiguration b2 = h3.b();
        this.f6274h = b2.getApiKey();
        this.f6275i = b2.getReporterType();
        this.f6276j = p5.f();
    }
}
