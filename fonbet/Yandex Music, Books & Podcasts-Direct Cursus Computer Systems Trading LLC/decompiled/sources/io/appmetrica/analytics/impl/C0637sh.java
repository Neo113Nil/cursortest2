package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.sh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0637sh extends Tf implements Lr {
    public static final long d = 0;
    public static final int e = -1;
    public static final String f = "";
    public static final String g = "";
    public static final String r = "SESSION_";
    public static final C0695uh h = new C0695uh("PERMISSIONS_CHECK_TIME", null);
    public static final C0695uh i = new C0695uh("PROFILE_ID", null);
    public static final C0695uh j = new C0695uh("APP_ENVIRONMENT", null);
    public static final C0695uh k = new C0695uh("APP_ENVIRONMENT_REVISION", null);
    public static final C0695uh l = new C0695uh("LAST_APP_VERSION_WITH_FEATURES", null);
    public static final C0695uh m = new C0695uh("APPLICATION_FEATURES", null);
    public static final C0695uh n = new C0695uh("CERTIFICATES_SHA1_FINGERPRINTS", null);
    public static final C0695uh o = new C0695uh("VITAL_DATA", null);
    public static final C0695uh p = new C0695uh("SENT_EXTERNAL_ATTRIBUTIONS", null);
    public static final C0695uh q = new C0695uh("AUTO_COLLECTED_DATA_SUBSCRIBERS", null);
    public static final C0695uh s = new C0695uh("MAIN_REPORTER_EVENTS_TRIGGER_CONDITION_MET", null);

    public C0637sh(Tb tb) {
        super(tb);
    }

    public final void a(@NonNull Map<String, Long> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        b(q.b, jSONObject.toString());
    }

    public final void b(@NonNull Map<Integer, String> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey().toString(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        b(p.b, jSONObject.toString());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0666th
    @NonNull
    public final Set<String> c() {
        return this.a.a();
    }

    public final C0447m0 d() {
        C0447m0 c0447m0;
        synchronized (this) {
            c0447m0 = new C0447m0(this.a.getString(j.b, "{}"), this.a.getLong(k.b, 0L));
        }
        return c0447m0;
    }

    public final C0637sh e(String str, String str2) {
        return (C0637sh) b(new C0695uh(r, str).b, str2);
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

    @NonNull
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
        return this.a.getString(new C0695uh(r, str).b, "");
    }

    public final long i() {
        return this.a.getLong(h.b, 0L);
    }

    public final String j() {
        return this.a.getString(i.b, null);
    }

    @NonNull
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

    public final C0637sh j(String str) {
        return (C0637sh) b(i.b, str);
    }

    public final C0637sh i(String str) {
        return (C0637sh) b(m.b, str);
    }

    public final String e() {
        return this.a.getString(m.b, "");
    }

    public final int h() {
        return this.a.getInt(l.b, -1);
    }

    public final C0637sh a(long j2) {
        return (C0637sh) b(h.b, j2);
    }

    public final C0637sh a(int i2) {
        return (C0637sh) b(l.b, i2);
    }

    public final void b(boolean z) {
        b(s.b, z);
    }

    @Override // io.appmetrica.analytics.impl.Tf
    @NonNull
    public final String f(@NonNull String str) {
        return new C0695uh(str, null).b;
    }

    public final C0637sh a(List<String> list) {
        return (C0637sh) a(n.b, list);
    }

    public final boolean a(boolean z) {
        return this.a.getBoolean(s.b, z);
    }

    @Override // io.appmetrica.analytics.impl.Lr
    public final String a() {
        return this.a.getString(o.b, null);
    }

    @Override // io.appmetrica.analytics.impl.Lr
    public final void a(@NonNull String str) {
        b(o.b, str);
    }

    public final C0637sh a(C0447m0 c0447m0) {
        synchronized (this) {
            b(j.b, c0447m0.a);
            b(k.b, c0447m0.b);
        }
        return this;
    }
}
