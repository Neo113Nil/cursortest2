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
    private boolean f19528A;

    /* renamed from: B, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.d f19529B;

    /* renamed from: C, reason: collision with root package name */
    private List<com.anythink.expressad.foundation.d.d> f19530C;

    /* renamed from: a, reason: collision with root package name */
    private boolean f19531a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Map<String, String>> f19532b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Map<String, String>> f19533c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Long> f19534d;

    /* renamed from: e, reason: collision with root package name */
    private com.anythink.expressad.foundation.e.c f19535e;

    /* renamed from: f, reason: collision with root package name */
    private String f19536f;

    /* renamed from: g, reason: collision with root package name */
    private List<com.anythink.expressad.foundation.d.d> f19537g;

    /* renamed from: h, reason: collision with root package name */
    private long f19538h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private int f19539j;

    /* renamed from: k, reason: collision with root package name */
    private String f19540k;

    /* renamed from: l, reason: collision with root package name */
    private String f19541l;

    /* renamed from: m, reason: collision with root package name */
    private String f19542m;

    /* renamed from: n, reason: collision with root package name */
    private String f19543n;

    /* renamed from: o, reason: collision with root package name */
    private String f19544o;

    /* renamed from: p, reason: collision with root package name */
    private String f19545p;

    /* renamed from: q, reason: collision with root package name */
    private String f19546q;

    /* renamed from: r, reason: collision with root package name */
    private String f19547r;

    /* renamed from: s, reason: collision with root package name */
    private String f19548s;

    /* renamed from: t, reason: collision with root package name */
    private String f19549t;

    /* renamed from: u, reason: collision with root package name */
    private String f19550u;

    /* renamed from: v, reason: collision with root package name */
    private int f19551v;

    /* renamed from: w, reason: collision with root package name */
    private int f19552w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f19553x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f19554y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f19555z;

    public e() {
        this.f19531a = false;
        this.f19532b = new HashMap();
        this.f19533c = new HashMap();
        this.f19534d = new HashMap();
        this.f19536f = "";
        this.f19551v = -1;
        this.f19553x = false;
        this.f19555z = false;
    }

    private boolean A() {
        return this.f19555z;
    }

    private boolean B() {
        return this.f19528A;
    }

    private String C() {
        return this.f19544o;
    }

    private void a(boolean z3) {
        this.f19553x = z3;
    }

    private void b(String str) {
        this.f19549t = str;
    }

    private boolean c() {
        return this.f19531a;
    }

    private boolean d() {
        return this.f19553x;
    }

    private int e() {
        return this.f19551v;
    }

    private String f() {
        return this.f19550u;
    }

    private String g() {
        return this.f19549t;
    }

    private List<com.anythink.expressad.foundation.d.d> h() {
        return this.f19537g;
    }

    private String i() {
        return this.f19536f;
    }

    private com.anythink.expressad.foundation.d.d j() {
        return this.f19529B;
    }

    private List<com.anythink.expressad.foundation.d.d> k() {
        return this.f19530C;
    }

    private long l() {
        return this.f19538h;
    }

    private String m() {
        Map<String, String> map;
        if (!TextUtils.isEmpty(this.i)) {
            return this.i;
        }
        try {
            if (TextUtils.isEmpty(this.i)) {
                String str = this.f19536f + this.f19550u;
                Map<String, Map<String, String>> map2 = this.f19532b;
                if (map2 != null && map2.containsKey(str) && (map = this.f19532b.get(str)) != null && map.containsKey("unit_id")) {
                    this.i = map.get("unit_id");
                }
            }
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f17618a) {
                e9.printStackTrace();
            }
        }
        return this.i;
    }

    private int n() {
        return this.f19539j;
    }

    private String o() {
        return this.f19540k;
    }

    private String p() {
        return this.f19541l;
    }

    private String q() {
        return this.f19543n;
    }

    private String r() {
        return this.f19546q;
    }

    private int s() {
        return this.f19552w;
    }

    private String t() {
        return this.f19547r;
    }

    private static void u() {
    }

    private void v() {
        Map<String, Map<String, String>> map = this.f19532b;
        if (map != null) {
            map.clear();
        }
        Map<String, Map<String, String>> map2 = this.f19533c;
        if (map2 != null) {
            map2.clear();
        }
        List<com.anythink.expressad.foundation.d.d> list = this.f19530C;
        if (list != null) {
            list.clear();
        }
        this.f19536f = "";
    }

    private com.anythink.expressad.foundation.e.c w() {
        return this.f19535e;
    }

    private Map<String, Map<String, String>> x() {
        return this.f19532b;
    }

    private Map<String, Map<String, String>> y() {
        return this.f19533c;
    }

    private boolean z() {
        return this.f19554y;
    }

    public final Object clone() {
        return super.clone();
    }

    private void b(List<com.anythink.expressad.foundation.d.d> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f19530C = list;
    }

    private void c(String str) {
        this.f19536f = str;
    }

    private void d(String str) {
        this.i = str;
    }

    private void e(String str) {
        this.f19540k = str;
    }

    private void f(String str) {
        this.f19541l = str;
    }

    private void g(String str) {
        this.f19543n = str;
    }

    private void h(String str) {
        this.f19546q = str;
    }

    private void i(String str) {
        this.f19547r = str;
    }

    private Map<String, String> j(String str) {
        com.anythink.expressad.foundation.e.c cVar;
        com.anythink.expressad.foundation.e.c cVar2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        f fVar = new f();
        try {
            this.f19550u = str;
            fVar.a("ts", Long.valueOf(System.currentTimeMillis()));
            if (!TextUtils.isEmpty(m())) {
                fVar.a("unit_id", m());
            }
            int i = this.f19539j;
            if (i != 0) {
                fVar.a(b.f19436e, Integer.valueOf(i));
            }
            if (!TextUtils.isEmpty(this.f19547r)) {
                fVar.a("hb", this.f19547r);
            }
            if (!TextUtils.isEmpty(this.f19540k)) {
                fVar.a(b.f19447q, this.f19540k);
            }
            if (!TextUtils.isEmpty(str)) {
                fVar.a("key", str);
            }
            if (Arrays.asList(d.f19516l).contains(str)) {
                fVar.a(b.aR, this.f19553x ? "1" : "2");
            }
            if (c.f19460D.contains(str) && (cVar2 = this.f19535e) != null) {
                fVar.a("type", Integer.valueOf(cVar2.d()));
                fVar.a("reason", cVar2.a());
                if (!TextUtils.isEmpty(cVar2.f())) {
                    fVar.a(b.am, cVar2.f());
                    fVar.a(b.al, Integer.valueOf(cVar2.e()));
                }
            }
            if (c.f19461E.contains(str) && (cVar = this.f19535e) != null && !TextUtils.isEmpty(cVar.f())) {
                fVar.a("type", Integer.valueOf(cVar.e()));
                fVar.a("reason", cVar.f());
            }
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f17618a) {
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
            String str2 = this.f19536f + str;
            Map<String, Map<String, String>> map = this.f19532b;
            if (map == null || !map.containsKey(str2)) {
                return;
            }
            this.f19532b.remove(str2);
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f17618a) {
                e9.printStackTrace();
            }
        }
    }

    private long l(String str) {
        Map<String, Long> map;
        try {
            if (!TextUtils.isEmpty(str) && (map = this.f19534d) != null && map.containsKey(str)) {
                Long l9 = this.f19534d.get(str);
                return System.currentTimeMillis() - (l9 != null ? l9.longValue() : 0L);
            }
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f17618a) {
                e9.printStackTrace();
            }
        }
        return 0L;
    }

    private void n(String str) {
        this.f19544o = str;
    }

    public final void a() {
        this.f19551v = 2;
    }

    private void a(String str) {
        this.f19550u = str;
    }

    private void c(boolean z3) {
        this.f19555z = z3;
    }

    private void d(boolean z3) {
        this.f19528A = z3;
    }

    private void a(List<com.anythink.expressad.foundation.d.d> list) {
        this.f19537g = list;
    }

    public final void b() {
        this.f19539j = com.anythink.expressad.foundation.g.a.aZ;
    }

    private void b(boolean z3) {
        this.f19554y = z3;
    }

    public final void a(com.anythink.expressad.foundation.d.d dVar) {
        this.f19529B = dVar;
    }

    private void a(long j6) {
        this.f19538h = j6;
    }

    public final void a(int i) {
        this.f19552w = i;
    }

    public final void a(String str, f fVar) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String str2 = this.f19536f + str;
            Map<String, Map<String, String>> map2 = this.f19532b;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f19532b.get(str2)) != null) {
                    map.putAll(fVar.a());
                } else {
                    this.f19532b.put(str2, fVar.a());
                }
            }
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f17618a) {
                e9.printStackTrace();
            }
        }
    }

    private e(boolean z3) {
        this.f19531a = false;
        this.f19532b = new HashMap();
        this.f19533c = new HashMap();
        this.f19534d = new HashMap();
        this.f19536f = "";
        this.f19551v = -1;
        this.f19553x = false;
        this.f19555z = false;
        this.f19531a = z3;
    }

    private void m(String str) {
        if (this.f19534d == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f19534d.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    private void a(String str, f fVar, int i) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || fVar == null) {
            return;
        }
        try {
            String str2 = this.f19536f + "_" + i + "_" + str;
            Map<String, Map<String, String>> map2 = this.f19533c;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.f19533c.get(str2)) != null) {
                    map.putAll(fVar.a());
                } else {
                    this.f19533c.put(str2, fVar.a());
                }
            }
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f17618a) {
                e9.printStackTrace();
            }
        }
    }

    private void a(com.anythink.expressad.foundation.e.c cVar) {
        this.f19535e = cVar;
    }
}
