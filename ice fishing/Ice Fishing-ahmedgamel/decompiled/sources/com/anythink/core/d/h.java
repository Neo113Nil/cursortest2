package com.anythink.core.d;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h extends e {

    /* renamed from: a, reason: collision with root package name */
    public static final int f17286a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f17287b = 3;

    /* renamed from: c, reason: collision with root package name */
    public static final int f17288c = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f17289e = 5;

    /* renamed from: f, reason: collision with root package name */
    public static final long f17290f = 604800000;

    /* renamed from: g, reason: collision with root package name */
    private int f17291g;

    /* renamed from: h, reason: collision with root package name */
    private a f17292h;
    private JSONObject i;

    /* renamed from: j, reason: collision with root package name */
    private long f17293j;

    /* renamed from: k, reason: collision with root package name */
    private long f17294k;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f17295a;

        /* renamed from: b, reason: collision with root package name */
        public int f17296b;

        /* renamed from: c, reason: collision with root package name */
        public int f17297c;
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static String f17298a = "adap_c";

        /* renamed from: b, reason: collision with root package name */
        public static String f17299b = "updateTime";

        /* renamed from: c, reason: collision with root package name */
        private static String f17300c = "rule";

        /* renamed from: d, reason: collision with root package name */
        private static String f17301d = "group_st";

        /* renamed from: e, reason: collision with root package name */
        private static String f17302e = "num";

        /* renamed from: f, reason: collision with root package name */
        private static String f17303f = "value_times";

        /* renamed from: g, reason: collision with root package name */
        private static String f17304g = "cold_times";

        /* renamed from: h, reason: collision with root package name */
        private static String f17305h = "st_timeout";
    }

    private void a(long j6) {
        this.f17294k = j6;
    }

    private long d() {
        return this.f17294k;
    }

    private JSONObject e() {
        return this.i;
    }

    private long f() {
        return this.f17293j;
    }

    public final a b() {
        return this.f17292h;
    }

    public final boolean c() {
        System.currentTimeMillis();
        return System.currentTimeMillis() - this.f17294k > this.f17293j;
    }

    private void b(long j6) {
        this.f17293j = j6;
    }

    private void e(JSONObject jSONObject) {
        this.i = jSONObject;
    }

    public final int a() {
        return this.f17291g;
    }

    private void a(int i) {
        this.f17291g = i;
    }

    private void a(a aVar) {
        this.f17292h = aVar;
    }

    public static h a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        h hVar = new h();
        try {
            hVar.b(jSONObject);
            hVar.c(jSONObject);
            hVar.d(jSONObject);
            hVar.f17291g = jSONObject.optInt(b.f17300c, 1);
            String optString = jSONObject.optString(b.f17301d);
            if (!TextUtils.isEmpty(optString)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(optString);
                    a aVar = new a();
                    aVar.f17295a = jSONObject2.optInt(b.f17302e, 3);
                    aVar.f17296b = jSONObject2.optInt(b.f17303f, 3);
                    aVar.f17297c = jSONObject2.optInt(b.f17304g, 5);
                    hVar.f17292h = aVar;
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            hVar.i = jSONObject.optJSONObject(b.f17298a);
            hVar.f17294k = jSONObject.optLong(b.f17299b, 0L);
            hVar.f17293j = jSONObject.optLong(b.f17305h, f17290f);
        } catch (Throwable unused) {
        }
        return hVar;
    }
}
