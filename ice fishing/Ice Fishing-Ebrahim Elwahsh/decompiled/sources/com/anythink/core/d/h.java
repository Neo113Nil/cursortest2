package com.anythink.core.d;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h extends e {

    /* renamed from: a, reason: collision with root package name */
    public static final int f17444a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f17445b = 3;

    /* renamed from: c, reason: collision with root package name */
    public static final int f17446c = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f17447e = 5;

    /* renamed from: f, reason: collision with root package name */
    public static final long f17448f = 604800000;

    /* renamed from: g, reason: collision with root package name */
    private int f17449g;

    /* renamed from: h, reason: collision with root package name */
    private a f17450h;
    private JSONObject i;

    /* renamed from: j, reason: collision with root package name */
    private long f17451j;

    /* renamed from: k, reason: collision with root package name */
    private long f17452k;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f17453a;

        /* renamed from: b, reason: collision with root package name */
        public int f17454b;

        /* renamed from: c, reason: collision with root package name */
        public int f17455c;
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static String f17456a = "adap_c";

        /* renamed from: b, reason: collision with root package name */
        public static String f17457b = "updateTime";

        /* renamed from: c, reason: collision with root package name */
        private static String f17458c = "rule";

        /* renamed from: d, reason: collision with root package name */
        private static String f17459d = "group_st";

        /* renamed from: e, reason: collision with root package name */
        private static String f17460e = "num";

        /* renamed from: f, reason: collision with root package name */
        private static String f17461f = "value_times";

        /* renamed from: g, reason: collision with root package name */
        private static String f17462g = "cold_times";

        /* renamed from: h, reason: collision with root package name */
        private static String f17463h = "st_timeout";
    }

    private void a(long j9) {
        this.f17452k = j9;
    }

    private long d() {
        return this.f17452k;
    }

    private JSONObject e() {
        return this.i;
    }

    private long f() {
        return this.f17451j;
    }

    public final a b() {
        return this.f17450h;
    }

    public final boolean c() {
        System.currentTimeMillis();
        return System.currentTimeMillis() - this.f17452k > this.f17451j;
    }

    private void b(long j9) {
        this.f17451j = j9;
    }

    private void e(JSONObject jSONObject) {
        this.i = jSONObject;
    }

    public final int a() {
        return this.f17449g;
    }

    private void a(int i) {
        this.f17449g = i;
    }

    private void a(a aVar) {
        this.f17450h = aVar;
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
            hVar.f17449g = jSONObject.optInt(b.f17458c, 1);
            String optString = jSONObject.optString(b.f17459d);
            if (!TextUtils.isEmpty(optString)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(optString);
                    a aVar = new a();
                    aVar.f17453a = jSONObject2.optInt(b.f17460e, 3);
                    aVar.f17454b = jSONObject2.optInt(b.f17461f, 3);
                    aVar.f17455c = jSONObject2.optInt(b.f17462g, 5);
                    hVar.f17450h = aVar;
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            hVar.i = jSONObject.optJSONObject(b.f17456a);
            hVar.f17452k = jSONObject.optLong(b.f17457b, 0L);
            hVar.f17451j = jSONObject.optLong(b.f17463h, f17448f);
        } catch (Throwable unused) {
        }
        return hVar;
    }
}
