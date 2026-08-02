package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class Ih extends AbstractC0421ig implements es {
    public static final long d = 0;
    public static final int e = -1;
    public static final String f = "";
    public static final String g = "";
    public static final String r = "SESSION_";
    public static final Kh h = new Kh("PERMISSIONS_CHECK_TIME", null);
    public static final Kh i = new Kh("PROFILE_ID", null);
    public static final Kh j = new Kh("APP_ENVIRONMENT", null);
    public static final Kh k = new Kh("APP_ENVIRONMENT_REVISION", null);
    public static final Kh l = new Kh("LAST_APP_VERSION_WITH_FEATURES", null);
    public static final Kh m = new Kh("APPLICATION_FEATURES", null);
    public static final Kh n = new Kh("CERTIFICATES_SHA1_FINGERPRINTS", null);
    public static final Kh o = new Kh("VITAL_DATA", null);
    public static final Kh p = new Kh("SENT_EXTERNAL_ATTRIBUTIONS", null);
    public static final Kh q = new Kh("AUTO_COLLECTED_DATA_SUBSCRIBERS", null);
    public static final Kh s = new Kh("MAIN_REPORTER_EVENTS_TRIGGER_CONDITION_MET", null);

    public Ih(InterfaceC0418ic interfaceC0418ic) {
        super(interfaceC0418ic);
    }

    public final void a(Map<String, Long> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        d(q.b, jSONObject.toString());
    }

    public final void b(Map<Integer, String> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey().toString(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        d(p.b, jSONObject.toString());
    }

    @Override // io.appmetrica.analytics.impl.Jh
    public final Set<String> c() {
        return this.a.b();
    }

    public final C0579o0 d() {
        C0579o0 c0579o0;
        synchronized (this) {
            c0579o0 = new C0579o0(this.a.getString(j.b, "{}"), this.a.getLong(k.b, 0L));
        }
        return c0579o0;
    }

    public final Ih e(String str, String str2) {
        return (Ih) d(new Kh(r, str).b, str2);
    }

    public final Map<String, Long> f() {
        HashMap hashMap = new HashMap();
        try {
            String string = this.a.getString(q.b, null);
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, Long.valueOf(jSONObject.getLong(next)));
                }
            }
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    @Override // io.appmetrica.analytics.impl.Jh, io.appmetrica.analytics.impl.So, io.appmetrica.analytics.impl.es
    public final void flushAsync() {
        this.a.flushAsync();
    }

    public final List<String> g() {
        String str = n.b;
        List list = Collections.EMPTY_LIST;
        String[] strArr = list == null ? null : (String[]) list.toArray(new String[list.size()]);
        String string = this.a.getString(str, null);
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                strArr = new String[jSONArray.length()];
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    strArr[i2] = jSONArray.optString(i2);
                }
            } catch (Throwable unused) {
            }
        }
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    public final String h(String str) {
        return this.a.getString(new Kh(r, str).b, "");
    }

    public final long i() {
        return this.a.getLong(h.b, 0L);
    }

    public final String j() {
        return this.a.getString(i.b, null);
    }

    public final Map<Integer, String> k() {
        HashMap hashMap = new HashMap();
        try {
            String string = this.a.getString(p.b, null);
            if (string != null) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(Integer.valueOf(Integer.parseInt(next)), jSONObject.getString(next));
                }
            }
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    public final Ih j(String str) {
        return (Ih) d(i.b, str);
    }

    public final Ih i(String str) {
        return (Ih) d(m.b, str);
    }

    public final String e() {
        return this.a.getString(m.b, "");
    }

    public final int h() {
        return this.a.getInt(l.b, -1);
    }

    public final Ih a(long j2) {
        return (Ih) d(h.b, j2);
    }

    public final Ih a(int i2) {
        return (Ih) d(l.b, i2);
    }

    @Override // io.appmetrica.analytics.impl.es
    public final String b() {
        return this.a.getString(o.b, null);
    }

    public final Ih a(List<String> list) {
        return (Ih) a(n.b, list);
    }

    public final void b(boolean z) {
        d(s.b, z);
    }

    public final boolean a(boolean z) {
        return this.a.getBoolean(s.b, z);
    }

    @Override // io.appmetrica.analytics.impl.es
    public final void a(String str) {
        d(o.b, str);
    }

    @Override // io.appmetrica.analytics.impl.Jh, io.appmetrica.analytics.impl.es
    public final void a() {
        super.a();
    }

    public final Ih a(C0579o0 c0579o0) {
        synchronized (this) {
            d(j.b, c0579o0.a);
            d(k.b, c0579o0.b);
        }
        return this;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0421ig
    public final String g(String str) {
        return new Kh(str, null).b;
    }
}
