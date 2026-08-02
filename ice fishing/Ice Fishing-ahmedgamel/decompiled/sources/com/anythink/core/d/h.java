package com.anythink.core.d;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h extends e {

    /* renamed from: a, reason: collision with root package name */
    public static final int f18073a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f18074b = 3;

    /* renamed from: c, reason: collision with root package name */
    public static final int f18075c = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f18076e = 5;

    /* renamed from: f, reason: collision with root package name */
    public static final long f18077f = 604800000;

    /* renamed from: g, reason: collision with root package name */
    private int f18078g;

    /* renamed from: h, reason: collision with root package name */
    private a f18079h;
    private JSONObject i;

    /* renamed from: j, reason: collision with root package name */
    private long f18080j;

    /* renamed from: k, reason: collision with root package name */
    private long f18081k;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f18082a;

        /* renamed from: b, reason: collision with root package name */
        public int f18083b;

        /* renamed from: c, reason: collision with root package name */
        public int f18084c;
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static String f18085a = "adap_c";

        /* renamed from: b, reason: collision with root package name */
        public static String f18086b = "updateTime";

        /* renamed from: c, reason: collision with root package name */
        private static String f18087c = "rule";

        /* renamed from: d, reason: collision with root package name */
        private static String f18088d = "group_st";

        /* renamed from: e, reason: collision with root package name */
        private static String f18089e = "num";

        /* renamed from: f, reason: collision with root package name */
        private static String f18090f = "value_times";

        /* renamed from: g, reason: collision with root package name */
        private static String f18091g = "cold_times";

        /* renamed from: h, reason: collision with root package name */
        private static String f18092h = "st_timeout";
    }

    private void a(long j6) {
        this.f18081k = j6;
    }

    private long d() {
        return this.f18081k;
    }

    private JSONObject e() {
        return this.i;
    }

    private long f() {
        return this.f18080j;
    }

    public final a b() {
        return this.f18079h;
    }

    public final boolean c() {
        System.currentTimeMillis();
        return System.currentTimeMillis() - this.f18081k > this.f18080j;
    }

    private void b(long j6) {
        this.f18080j = j6;
    }

    private void e(JSONObject jSONObject) {
        this.i = jSONObject;
    }

    public final int a() {
        return this.f18078g;
    }

    private void a(int i) {
        this.f18078g = i;
    }

    private void a(a aVar) {
        this.f18079h = aVar;
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
            hVar.f18078g = jSONObject.optInt(b.f18087c, 1);
            String optString = jSONObject.optString(b.f18088d);
            if (!TextUtils.isEmpty(optString)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(optString);
                    a aVar = new a();
                    aVar.f18082a = jSONObject2.optInt(b.f18089e, 3);
                    aVar.f18083b = jSONObject2.optInt(b.f18090f, 3);
                    aVar.f18084c = jSONObject2.optInt(b.f18091g, 5);
                    hVar.f18079h = aVar;
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            hVar.i = jSONObject.optJSONObject(b.f18085a);
            hVar.f18081k = jSONObject.optLong(b.f18086b, 0L);
            hVar.f18080j = jSONObject.optLong(b.f18092h, f18077f);
        } catch (Throwable unused) {
        }
        return hVar;
    }
}
