package io.appmetrica.analytics.impl;

import android.util.Base64;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.b64;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes4.dex */
public final class Yc {
    public final byte[] a;
    public final String b;
    public final int c;
    public final HashMap d;
    public final String e;
    public final Integer f;
    public final String g;
    public final String h;
    public final CounterConfigurationReporterType i;
    public final String j;
    public final long k;

    public Yc(String str, long j) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject(DatabaseHelper.OttTrackingTable.COLUMN_EVENT);
        this.a = Base64.decode(jSONObject2.getString("jvm_crash"), 0);
        this.b = jSONObject2.getString("name");
        this.c = jSONObject2.getInt("bytes_truncated");
        this.j = JsonUtils.optStringOrNull(jSONObject2, WebViewActivity.KEY_ENVIRONMENT);
        String optString = jSONObject2.optString("trimmed_fields");
        this.d = new HashMap();
        if (optString != null) {
            try {
                HashMap d = Vc.d(optString);
                if (d != null) {
                    for (Map.Entry entry : d.entrySet()) {
                        this.d.put(F4.valueOf((String) entry.getKey()), Integer.valueOf(Integer.parseInt((String) entry.getValue())));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("process_configuration");
        this.e = jSONObject3.getString("package_name");
        this.f = Integer.valueOf(jSONObject3.getInt("pid"));
        this.g = jSONObject3.getString("psid");
        JSONObject jSONObject4 = jSONObject.getJSONObject("reporter_configuration");
        this.h = jSONObject4.getString("api_key");
        this.i = a(jSONObject4);
        this.k = j;
    }

    public static CounterConfigurationReporterType a(JSONObject jSONObject) {
        return jSONObject.has("reporter_type") ? CounterConfigurationReporterType.fromStringValue(jSONObject.getString("reporter_type")) : CounterConfigurationReporterType.MAIN;
    }

    public final int b() {
        return this.c;
    }

    public final byte[] c() {
        return this.a;
    }

    public final String d() {
        return this.j;
    }

    public final long e() {
        return this.k;
    }

    public final String f() {
        return this.b;
    }

    public final String g() {
        return this.e;
    }

    public final Integer h() {
        return this.f;
    }

    public final String i() {
        return this.g;
    }

    public final CounterConfigurationReporterType j() {
        return this.i;
    }

    public final HashMap<F4, Integer> k() {
        return this.d;
    }

    public final String l() throws JSONException {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.d.entrySet()) {
            hashMap.put(((F4) entry.getKey()).name(), (Integer) entry.getValue());
        }
        return new JSONObject().put("process_configuration", new JSONObject().put("pid", this.f).put("psid", this.g).put("package_name", this.e)).put("reporter_configuration", new JSONObject().put("api_key", this.h).put("reporter_type", this.i.getStringValue())).put(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, new JSONObject().put("jvm_crash", Base64.encodeToString(this.a, 0)).put("name", this.b).put("bytes_truncated", this.c).put("trimmed_fields", Vc.c(hashMap)).putOpt(WebViewActivity.KEY_ENVIRONMENT, this.j)).toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JvmCrash{name='");
        sb.append(this.b);
        sb.append("', packageName='");
        sb.append(this.e);
        sb.append("', pid=");
        sb.append(this.f);
        sb.append(", psid='");
        sb.append(this.g);
        sb.append("', apiKey='");
        sb.append(this.h);
        sb.append("', errorEnvironment='");
        sb.append(this.j);
        sb.append("', reporterType=");
        sb.append(this.i);
        sb.append(", fileModifiedTimestamp=");
        return b64.o(sb, this.k, '}');
    }

    public final String a() {
        return this.h;
    }

    public Yc(K6 k6, B4 b4, HashMap<F4, Integer> hashMap) {
        this.a = k6.getValueBytes();
        this.b = k6.getName();
        this.c = k6.getBytesTruncated();
        if (hashMap != null) {
            this.d = hashMap;
        } else {
            this.d = new HashMap();
        }
        C0597oi a = b4.a();
        this.e = a.f();
        this.f = a.g();
        this.g = a.h();
        CounterConfiguration b = b4.b();
        this.h = b.getApiKey();
        this.i = b.getReporterType();
        this.j = k6.f();
        this.k = 0L;
    }
}
