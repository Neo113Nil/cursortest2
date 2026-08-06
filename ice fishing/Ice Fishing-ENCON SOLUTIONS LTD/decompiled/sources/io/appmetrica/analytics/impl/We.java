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

/* loaded from: classes.dex */
public final class We extends AbstractC0898yd implements Bo {

    /* renamed from: d, reason: collision with root package name */
    public static final long f5292d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f5293e = -1;

    /* renamed from: f, reason: collision with root package name */
    public static final String f5294f = "";

    /* renamed from: g, reason: collision with root package name */
    public static final String f5295g = "";

    /* renamed from: r, reason: collision with root package name */
    public static final String f5306r = "SESSION_";

    /* renamed from: h, reason: collision with root package name */
    public static final Ye f5296h = new Ye("PERMISSIONS_CHECK_TIME", null);

    /* renamed from: i, reason: collision with root package name */
    public static final Ye f5297i = new Ye("PROFILE_ID", null);

    /* renamed from: j, reason: collision with root package name */
    public static final Ye f5298j = new Ye("APP_ENVIRONMENT", null);

    /* renamed from: k, reason: collision with root package name */
    public static final Ye f5299k = new Ye("APP_ENVIRONMENT_REVISION", null);

    /* renamed from: l, reason: collision with root package name */
    public static final Ye f5300l = new Ye("LAST_APP_VERSION_WITH_FEATURES", null);

    /* renamed from: m, reason: collision with root package name */
    public static final Ye f5301m = new Ye("APPLICATION_FEATURES", null);

    /* renamed from: n, reason: collision with root package name */
    public static final Ye f5302n = new Ye("CERTIFICATES_SHA1_FINGERPRINTS", null);

    /* renamed from: o, reason: collision with root package name */
    public static final Ye f5303o = new Ye("VITAL_DATA", null);

    /* renamed from: p, reason: collision with root package name */
    public static final Ye f5304p = new Ye("SENT_EXTERNAL_ATTRIBUTIONS", null);

    /* renamed from: q, reason: collision with root package name */
    public static final Ye f5305q = new Ye("AUTO_COLLECTED_DATA_SUBSCRIBERS", null);

    /* renamed from: s, reason: collision with root package name */
    public static final Ye f5307s = new Ye("MAIN_REPORTER_EVENTS_TRIGGER_CONDITION_MET", null);

    public We(Ha ha) {
        super(ha);
    }

    public final We a(C0471i0 c0471i0) {
        synchronized (this) {
            b(f5298j.f5434b, c0471i0.f6158a);
            b(f5299k.f5434b, c0471i0.f6159b);
        }
        return this;
    }

    public final void b(boolean z2) {
        b(f5307s.f5434b, z2);
    }

    @Override // io.appmetrica.analytics.impl.Xe
    public final Set<String> c() {
        return this.f5393a.a();
    }

    public final C0471i0 d() {
        C0471i0 c0471i0;
        synchronized (this) {
            c0471i0 = new C0471i0(this.f5393a.getString(f5298j.f5434b, "{}"), this.f5393a.getLong(f5299k.f5434b, 0L));
        }
        return c0471i0;
    }

    public final String e() {
        return this.f5393a.getString(f5301m.f5434b, "");
    }

    public final Map<String, Long> f() {
        HashMap hashMap = new HashMap();
        try {
            String string = this.f5393a.getString(f5305q.f5434b, null);
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

    public final List<String> g() {
        String str = f5302n.f5434b;
        List emptyList = Collections.emptyList();
        String[] strArr = emptyList == null ? null : (String[]) emptyList.toArray(new String[emptyList.size()]);
        String string = this.f5393a.getString(str, null);
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

    public final int h() {
        return this.f5393a.getInt(f5300l.f5434b, -1);
    }

    public final long i() {
        return this.f5393a.getLong(f5296h.f5434b, 0L);
    }

    public final String j() {
        return this.f5393a.getString(f5297i.f5434b, null);
    }

    public final Map<Integer, String> k() {
        HashMap hashMap = new HashMap();
        try {
            String string = this.f5393a.getString(f5304p.f5434b, null);
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

    public final void b(Map<Integer, String> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey().toString(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        b(f5304p.f5434b, jSONObject.toString());
    }

    public final String h(String str) {
        return this.f5393a.getString(new Ye(f5306r, str).f5434b, "");
    }

    public final We i(String str) {
        return (We) b(f5301m.f5434b, str);
    }

    public final We j(String str) {
        return (We) b(f5297i.f5434b, str);
    }

    public final We e(String str, String str2) {
        return (We) b(new Ye(f5306r, str).f5434b, str2);
    }

    public final We a(long j2) {
        return (We) b(f5296h.f5434b, j2);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0898yd
    public final String f(String str) {
        return new Ye(str, null).f5434b;
    }

    public final We a(int i2) {
        return (We) b(f5300l.f5434b, i2);
    }

    public final We a(List<String> list) {
        return (We) a(f5302n.f5434b, list);
    }

    public final boolean a(boolean z2) {
        return this.f5393a.getBoolean(f5307s.f5434b, z2);
    }

    @Override // io.appmetrica.analytics.impl.Bo
    public final String a() {
        return this.f5393a.getString(f5303o.f5434b, null);
    }

    @Override // io.appmetrica.analytics.impl.Bo
    public final void a(String str) {
        b(f5303o.f5434b, str);
    }

    public final void a(Map<String, Long> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        b(f5305q.f5434b, jSONObject.toString());
    }
}
