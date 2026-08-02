package com.anythink.expressad.foundation.g.g.a;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements Serializable, Cloneable {

    /* renamed from: A, reason: collision with root package name */
    private boolean f20315A;

    /* renamed from: B, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.d f20316B;

    /* renamed from: C, reason: collision with root package name */
    private List<com.anythink.expressad.foundation.d.d> f20317C;

    /* renamed from: a, reason: collision with root package name */
    private boolean f20318a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Map<String, String>> f20319b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Map<String, String>> f20320c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Long> f20321d;

    /* renamed from: e, reason: collision with root package name */
    private com.anythink.expressad.foundation.e.c f20322e;

    /* renamed from: f, reason: collision with root package name */
    private String f20323f;

    /* renamed from: g, reason: collision with root package name */
    private List<com.anythink.expressad.foundation.d.d> f20324g;

    /* renamed from: h, reason: collision with root package name */
    private long f20325h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private int f20326j;

    /* renamed from: k, reason: collision with root package name */
    private String f20327k;

    /* renamed from: l, reason: collision with root package name */
    private String f20328l;

    /* renamed from: m, reason: collision with root package name */
    private String f20329m;

    /* renamed from: n, reason: collision with root package name */
    private String f20330n;

    /* renamed from: o, reason: collision with root package name */
    private String f20331o;

    /* renamed from: p, reason: collision with root package name */
    private String f20332p;

    /* renamed from: q, reason: collision with root package name */
    private String f20333q;

    /* renamed from: r, reason: collision with root package name */
    private String f20334r;

    /* renamed from: s, reason: collision with root package name */
    private String f20335s;

    /* renamed from: t, reason: collision with root package name */
    private String f20336t;

    /* renamed from: u, reason: collision with root package name */
    private String f20337u;

    /* renamed from: v, reason: collision with root package name */
    private int f20338v;

    /* renamed from: w, reason: collision with root package name */
    private int f20339w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f20340x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f20341y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f20342z;

    public e() {
        this.f20318a = false;
        this.f20319b = new HashMap();
        this.f20320c = new HashMap();
        this.f20321d = new HashMap();
        this.f20323f = "";
        this.f20338v = -1;
        this.f20340x = false;
        this.f20342z = false;
    }

    private boolean A() {
        return this.f20342z;
    }

    private boolean B() {
        return this.f20315A;
    }

    private String C() {
        return this.f20331o;
    }

    private void a(boolean z6) {
        this.f20340x = z6;
    }

    private void b(String str) {
        this.f20336t = str;
    }

    private boolean c() {
        return this.f20318a;
    }

    private boolean d() {
        return this.f20340x;
    }

    private int e() {
        return this.f20338v;
    }

    private String f() {
        return this.f20337u;
    }

    private String g() {
        return this.f20336t;
    }

    private List<com.anythink.expressad.foundation.d.d> h() {
        return this.f20324g;
    }

    private String i() {
        return this.f20323f;
    }

    private com.anythink.expressad.foundation.d.d j() {
        return this.f20316B;
    }

    private List<com.anythink.expressad.foundation.d.d> k() {
        return this.f20317C;
    }

    private long l() {
        return this.f20325h;
    }

    private String m() {
        Map<String, String> map;
        if (!TextUtils.isEmpty(this.i)) {
            return this.i;
        }
        try {
            if (TextUtils.isEmpty(this.i)) {
                String str = this.f20323f + this.f20337u;
                Map<String, Map<String, String>> map2 = this.f20319b;
                if (map2 != null && map2.containsKey(str) && (map = this.f20319b.get(str)) != null && map.containsKey("unit_id")) {
                    this.i = map.get("unit_id");
                }
            }
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f18405a) {
                e9.printStackTrace();
            }
        }
        return this.i;
    }

    private int n() {
        return this.f20326j;
    }

    private String o() {
        return this.f20327k;
    }

    private String p() {
        return this.f20328l;
    }

    private String q() {
        return this.f20330n;
    }

    private String r() {
        return this.f20333q;
    }

    private int s() {
        return this.f20339w;
    }

    private String t() {
        return this.f20334r;
    }

    private static void u() {
    }

    private void v() {
        Map<String, Map<String, String>> map = this.f20319b;
        if (map != null) {
            map.clear();
        }
        Map<String, Map<String, String>> map2 = this.f20320c;
        if (map2 != null) {
            map2.clear();
        }
        List<com.anythink.expressad.foundation.d.d> list = this.f20317C;
        if (list != null) {
            list.clear();
        }
        this.f20323f = "";
    }

    private com.anythink.expressad.foundation.e.c w() {
        return this.f20322e;
    }

    private Map<String, Map<String, String>> x() {
        return this.f20319b;
    }

    private Map<String, Map<String, String>> y() {
        return this.f20320c;
    }

    private boolean z() {
        return this.f20341y;
    }

    public final Object clone() {
        return super.clone();
    }

    private void b(List<com.anythink.expressad.foundation.d.d> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f20317C = list;
    }

    private void c(String str) {
        this.f20323f = str;
    }

    private void d(String str) {
        this.i = str;
    }

    private void e(String str) {
        this.f20327k = str;
    }

    private void f(String str) {
        this.f20328l = str;
    }

    private void g(String str) {
        this.f20330n = str;
    }

    private void h(String str) {
        this.f20333q = str;
    }

    private void i(String str) {
        this.f20334r = str;
    }

    private Map<String, String> j(String str) {
        com.anythink.expressad.foundation.e.c cVar;
        com.anythink.expressad.foundation.e.c cVar2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        f fVar = new f();
        try {
            this.f20337u = str;
            fVar.a("ts", Long.valueOf(System.currentTimeMillis()));
            if (!TextUtils.isEmpty(m())) {
                fVar.a("unit_id", m());
            }
            int i = this.f20326j;
            if (i != 0) {
                fVar.a(b.f20223e, Integer.valueOf(i));
            }
            if (!TextUtils.isEmpty(this.f20334r)) {
                fVar.a("hb", this.f20334r);
            }
            if (!TextUtils.isEmpty(this.f20327k)) {
                fVar.a(b.f20234q, this.f20327k);
            }
            if (!TextUtils.isEmpty(str)) {
                fVar.a("key", str);
            }
            if (Arrays.asList(d.f20303l).contains(str)) {
                fVar.a(b.aR, this.f20340x ? "1" : "2");
            }
            if (c.f20247D.contains(str) && (cVar2 = this.f20322e) != null) {
                fVar.a("type", Integer.valueOf(cVar2.d()));
                fVar.a("reason", cVar2.a());
                if (!TextUtils.isEmpty(cVar2.f())) {
                    fVar.a(b.am, cVar2.f());
                    fVar.a(b.al, Integer.valueOf(cVar2.e()));
                }
            }
            if (c.f20248E.contains(str) && (cVar = this.f20322e) != null && !TextUtils.isEmpty(cVar.f())) {
                fVar.a("type", Integer.valueOf(cVar.e()));
                fVar.a("reason", cVar.f());
            }
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f18405a) {
                e9.printStackTrace();
            }
        }
        return fVar.a();
    }

    private void k(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String str2 = this.f20323f + str;
            Map<String, Map<String, String>> map = this.f20319b;
            if (map == null || !map.containsKey(str2)) {
                return;
            }
            this.f20319b.remove(str2);
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f18405a) {
                e9.printStackTrace();
            }
        }
    }

    private long l(String str) {
        Map<String, Long> map;
        try {
            if (!TextUtils.isEmpty(str) && (map = this.f20321d) != null && map.containsKey(str)) {
                Long l9 = this.f20321d.get(str);
                return System.currentTimeMillis() - (l9 != null ? l9.longValue() : 0L);
            }
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f18405a) {
                e9.printStackTrace();
            }
        }
        return 0L;
    }

    private void n(String str) {
        this.f20331o = str;
    }

    public final void a() {
        this.f20338v = 2;
    }

    private void a(String str) {
        this.f20337u = str;
    }

    private void c(boolean z6) {
        this.f20342z = z6;
    }

    private void d(boolean z6) {
        this.f20315A = z6;
    }

    private void a(List<com.anythink.expressad.foundation.d.d> list) {
        this.f20324g = list;
    }

    public final void b() {
        this.f20326j = com.anythink.expressad.foundation.g.a.aZ;
    }

    private void b(boolean z6) {
        this.f20341y = z6;
    }

    public final void a(com.anythink.expressad.foundation.d.d dVar) {
        this.f20316B = dVar;
    }

    private void a(long j6) {
        this.f20325h = j6;
    }

    public final void a(int i) {
        this.f20339w = i;
    }

    public final void a(String str, f fVar) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String str2 = this.f20323f + str;
            Map<String, Map<String, String>> map2 = this.f20319b;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f20319b.get(str2)) != null) {
                    map.putAll(fVar.a());
                } else {
                    this.f20319b.put(str2, fVar.a());
                }
            }
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f18405a) {
                e9.printStackTrace();
            }
        }
    }

    private e(boolean z6) {
        this.f20318a = false;
        this.f20319b = new HashMap();
        this.f20320c = new HashMap();
        this.f20321d = new HashMap();
        this.f20323f = "";
        this.f20338v = -1;
        this.f20340x = false;
        this.f20342z = false;
        this.f20318a = z6;
    }

    private void m(String str) {
        if (this.f20321d == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f20321d.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    private void a(String str, f fVar, int i) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || fVar == null) {
            return;
        }
        try {
            String str2 = this.f20323f + "_" + i + "_" + str;
            Map<String, Map<String, String>> map2 = this.f20320c;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f20320c.get(str2)) != null) {
                    map.putAll(fVar.a());
                } else {
                    this.f20320c.put(str2, fVar.a());
                }
            }
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f18405a) {
                e9.printStackTrace();
            }
        }
    }

    private void a(com.anythink.expressad.foundation.e.c cVar) {
        this.f20322e = cVar;
    }
}
