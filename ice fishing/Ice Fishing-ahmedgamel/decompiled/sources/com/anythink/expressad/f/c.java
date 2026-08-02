package com.anythink.expressad.f;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.Wv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f19241a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f19242b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f19243c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f19244d = 3;

    /* renamed from: A, reason: collision with root package name */
    private String f19245A;

    /* renamed from: B, reason: collision with root package name */
    private int f19246B;

    /* renamed from: C, reason: collision with root package name */
    private long f19247C;

    /* renamed from: D, reason: collision with root package name */
    private long f19248D;

    /* renamed from: F, reason: collision with root package name */
    private int f19250F;

    /* renamed from: G, reason: collision with root package name */
    private int f19251G;

    /* renamed from: H, reason: collision with root package name */
    private int f19252H;

    /* renamed from: N, reason: collision with root package name */
    private int f19257N;

    /* renamed from: P, reason: collision with root package name */
    private int f19259P;

    /* renamed from: Q, reason: collision with root package name */
    private int f19260Q;

    /* renamed from: e, reason: collision with root package name */
    private int f19261e;

    /* renamed from: f, reason: collision with root package name */
    private int f19262f;

    /* renamed from: g, reason: collision with root package name */
    private int f19263g;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private String f19265j;

    /* renamed from: k, reason: collision with root package name */
    private List<Integer> f19266k;

    /* renamed from: l, reason: collision with root package name */
    private long f19267l;

    /* renamed from: n, reason: collision with root package name */
    private int f19269n;

    /* renamed from: o, reason: collision with root package name */
    private List<Integer> f19270o;

    /* renamed from: p, reason: collision with root package name */
    private int f19271p;

    /* renamed from: q, reason: collision with root package name */
    private int f19272q;

    /* renamed from: r, reason: collision with root package name */
    private int f19273r;

    /* renamed from: s, reason: collision with root package name */
    private int f19274s;

    /* renamed from: t, reason: collision with root package name */
    private String f19275t;

    /* renamed from: u, reason: collision with root package name */
    private int f19276u;

    /* renamed from: x, reason: collision with root package name */
    private int f19279x;

    /* renamed from: y, reason: collision with root package name */
    private int f19280y;

    /* renamed from: z, reason: collision with root package name */
    private long f19281z;

    /* renamed from: h, reason: collision with root package name */
    private int f19264h = 30;

    /* renamed from: m, reason: collision with root package name */
    private int f19268m = 1;

    /* renamed from: v, reason: collision with root package name */
    private int f19277v = 1;

    /* renamed from: w, reason: collision with root package name */
    private int f19278w = 5000;

    /* renamed from: E, reason: collision with root package name */
    private int f19249E = 60;

    /* renamed from: I, reason: collision with root package name */
    private String f19253I = "";
    private int J = 10;

    /* renamed from: K, reason: collision with root package name */
    private int f19254K = 60;

    /* renamed from: L, reason: collision with root package name */
    private double f19255L = 1.0d;

    /* renamed from: M, reason: collision with root package name */
    private int f19256M = 1;

    /* renamed from: O, reason: collision with root package name */
    private int f19258O = 0;

    private int A() {
        return this.f19252H;
    }

    private int B() {
        return this.f19256M;
    }

    private int C() {
        return this.f19260Q;
    }

    private String D() {
        return this.f19275t;
    }

    private int E() {
        return this.f19276u;
    }

    private int F() {
        return this.f19259P;
    }

    private long G() {
        return this.f19247C;
    }

    private long H() {
        return this.f19248D;
    }

    private String I() {
        return this.f19245A;
    }

    private int J() {
        return this.f19246B;
    }

    private int K() {
        return this.f19261e;
    }

    private int L() {
        return this.f19262f;
    }

    private int M() {
        return this.f19263g;
    }

    private int N() {
        int i = this.f19264h;
        if (i <= 0 || i > 100) {
            this.f19264h = 30;
        }
        return this.f19264h;
    }

    private static c O() {
        return new c();
    }

    private int P() {
        return this.f19274s;
    }

    private int Q() {
        return this.f19277v;
    }

    private int R() {
        return this.f19278w;
    }

    private int S() {
        return this.f19271p;
    }

    private int T() {
        return this.f19272q;
    }

    private int U() {
        return this.f19273r;
    }

    private String V() {
        return this.i;
    }

    private List<Integer> W() {
        return this.f19266k;
    }

    private List<Integer> X() {
        return this.f19270o;
    }

    private long Y() {
        return this.f19267l;
    }

    private int Z() {
        return this.f19269n;
    }

    private String aa() {
        return this.f19253I;
    }

    private int ab() {
        return this.J;
    }

    private int ac() {
        return this.f19254K;
    }

    private void e(int i) {
        this.f19256M = i;
    }

    private void f(int i) {
        this.f19250F = i;
    }

    private void g(int i) {
        this.f19276u = i;
    }

    public static c y() {
        c cVar = new c();
        cVar.f19279x = 0;
        return cVar;
    }

    private int z() {
        return this.f19251G;
    }

    public final double a() {
        return this.f19255L;
    }

    public final void b(int i) {
        this.f19252H = i;
    }

    public final void c() {
        this.f19249E = 60;
    }

    public final int d() {
        return this.f19250F;
    }

    public final void h() {
        this.f19259P = 1;
    }

    public final long i() {
        return this.f19281z;
    }

    public final void j() {
        this.f19280y = 2;
    }

    public final int k() {
        return this.f19279x;
    }

    public final void l() {
        this.f19279x = 1;
    }

    public final int m() {
        return this.f19280y;
    }

    public final void n() {
        this.f19281z = com.anythink.expressad.f.a.b.f19188P;
    }

    public final void o() {
        this.f19274s = 5;
    }

    public final void p() {
        this.f19271p = 1;
    }

    public final void q() {
        this.f19272q = -2;
    }

    public final void r() {
        this.f19273r = -2;
    }

    public final JSONObject s() {
        JSONObject jSONObject = new JSONObject();
        try {
            List<Integer> list = this.f19266k;
            if (list != null && list.size() > 0) {
                int size = this.f19266k.size();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < size; i++) {
                    jSONArray.put(this.f19266k.get(i));
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            List<Integer> list2 = this.f19270o;
            if (list2 != null && list2.size() > 0) {
                int size2 = this.f19270o.size();
                JSONArray jSONArray2 = new JSONArray();
                for (int i4 = 0; i4 < size2; i4++) {
                    jSONArray2.put(this.f19270o.get(i4));
                }
                jSONObject.put("ad_source_timeout", jSONArray2);
            }
            jSONObject.put(com.anythink.expressad.f.a.b.J, this.f19271p);
            jSONObject.put("aqn", this.f19272q);
            jSONObject.put("acn", this.f19273r);
            jSONObject.put(com.anythink.expressad.f.a.b.f19190R, this.f19274s);
            jSONObject.put("current_time", this.f19267l);
            jSONObject.put("offset", this.f19268m);
            jSONObject.put("dlct", this.f19281z);
            jSONObject.put(com.anythink.expressad.f.a.b.aX, this.f19279x);
            jSONObject.put("dlnet", this.f19280y);
            jSONObject.put(com.anythink.expressad.f.a.b.aL, this.f19245A);
            jSONObject.put(com.anythink.expressad.f.a.b.aM, this.f19246B);
            jSONObject.put(com.anythink.expressad.f.a.b.aN, this.f19247C);
            jSONObject.put(com.anythink.expressad.f.a.b.aO, this.f19248D);
            jSONObject.put("ready_rate", this.f19257N);
            jSONObject.put("content", this.f19259P);
            jSONObject.put(com.anythink.expressad.f.a.b.bD, this.f19260Q);
            jSONObject.put(com.anythink.expressad.f.a.b.cg, this.f19276u);
            jSONObject.put(com.anythink.expressad.f.a.b.ce, this.f19275t);
            jSONObject.put("playclosebtn_tm", this.f19261e);
            jSONObject.put("play_ctdown", this.f19262f);
            jSONObject.put("close_alert", this.f19263g);
            jSONObject.put(com.anythink.expressad.f.a.b.de, this.f19250F);
            jSONObject.put(com.anythink.expressad.f.a.b.dc, this.f19249E);
            jSONObject.put(com.anythink.expressad.f.a.b.dl, this.f19252H);
            jSONObject.put(com.anythink.expressad.f.a.b.dn, this.f19251G);
            jSONObject.put("tmorl", this.f19256M);
            jSONObject.put("unitId", this.i);
            jSONObject.put("placementid", this.f19253I);
            jSONObject.put("ltafemty", this.J);
            jSONObject.put("ltorwc", this.f19254K);
            return jSONObject;
        } catch (Exception e9) {
            e9.printStackTrace();
            return jSONObject;
        }
    }

    public final int t() {
        return this.f19268m;
    }

    public final String toString() {
        List<Integer> list = this.f19266k;
        String str = "";
        if (list != null && list.size() > 0) {
            Iterator<Integer> it = this.f19266k.iterator();
            while (it.hasNext()) {
                str = str + it.next() + ",";
            }
        }
        StringBuilder sb = new StringBuilder("offset = ");
        sb.append(this.f19268m);
        sb.append(" unitId = ");
        sb.append(this.i);
        sb.append(" fbPlacementId = ");
        return Wv.i(sb, this.f19265j, str);
    }

    public final void u() {
        this.f19268m = 1;
    }

    public final void v() {
        this.f19269n = 2;
    }

    public final void w() {
        this.J = 10;
    }

    public final void x() {
        this.f19254K = 60;
    }

    private void a(double d9) {
        this.f19255L = d9;
    }

    private void f(String str) {
        this.f19275t = str;
    }

    private void h(int i) {
        this.f19246B = i;
    }

    private void i(int i) {
        this.f19261e = i;
    }

    private void j(int i) {
        this.f19262f = i;
    }

    private void k(int i) {
        this.f19263g = i;
    }

    private void l(int i) {
        this.f19264h = i;
    }

    private void m(int i) {
        this.f19277v = i;
    }

    private void n(int i) {
        this.f19278w = i;
    }

    public final int b() {
        return this.f19249E;
    }

    public final void c(int i) {
        try {
            this.f19257N = i;
        } catch (Exception unused) {
            this.f19257N = 100;
        }
    }

    public final void d(int i) {
        try {
            this.f19258O = i;
        } catch (Exception unused) {
            this.f19258O = 0;
        }
    }

    public final void e() {
        this.f19260Q = 0;
    }

    public final int g() {
        return this.f19258O;
    }

    private void b(long j6) {
        this.f19248D = j6;
    }

    private void g(String str) {
        this.f19245A = str;
    }

    public final void a(int i) {
        this.f19251G = i;
    }

    public final void e(String str) {
        this.f19253I = str;
    }

    public final int f() {
        return this.f19257N;
    }

    private void a(long j6) {
        this.f19247C = j6;
    }

    private void c(long j6) {
        this.f19267l = j6;
    }

    public static c d(String str) {
        c cVar = new c();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(1);
            cVar.f19266k = arrayList;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(30);
            cVar.f19270o = arrayList2;
            cVar.i = str;
            cVar.f19268m = 1;
            cVar.f19271p = 1;
            cVar.f19273r = -2;
            cVar.f19272q = -2;
            cVar.f19274s = 5;
            cVar.f19281z = com.anythink.expressad.f.a.b.f19188P;
            cVar.f19280y = 2;
            cVar.f19279x = 3;
            return cVar;
        } catch (Exception e9) {
            e9.printStackTrace();
            return cVar;
        }
    }

    public final void b(List<Integer> list) {
        this.f19270o = list;
    }

    public static c b(String str) {
        c cVar = null;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            c cVar2 = new c();
            try {
                JSONObject jSONObject = new JSONObject(str);
                cVar2.i = jSONObject.optString("unitId");
                JSONArray optJSONArray = jSONObject.optJSONArray("adSourceList");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        arrayList.add(Integer.valueOf(optJSONArray.optInt(i)));
                    }
                    cVar2.f19266k = arrayList;
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("ad_source_timeout");
                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i4 = 0; i4 < optJSONArray2.length(); i4++) {
                        arrayList2.add(Integer.valueOf(optJSONArray2.optInt(i4)));
                    }
                    cVar2.f19270o = arrayList2;
                }
                cVar2.f19271p = jSONObject.optInt(com.anythink.expressad.f.a.b.J);
                cVar2.f19272q = jSONObject.optInt("aqn");
                cVar2.f19273r = jSONObject.optInt("acn");
                cVar2.f19274s = jSONObject.optInt(com.anythink.expressad.f.a.b.f19190R);
                int i6 = 1;
                cVar2.f19277v = jSONObject.optInt(com.anythink.expressad.f.a.b.f19191S, 1);
                cVar2.f19278w = jSONObject.optInt(com.anythink.expressad.f.a.b.f19192T, 5000);
                cVar2.f19267l = jSONObject.optLong("current_time");
                cVar2.f19268m = jSONObject.optInt("offset");
                cVar2.f19281z = jSONObject.optLong("dlct", com.anythink.expressad.f.a.b.f19188P);
                cVar2.f19279x = jSONObject.optInt(com.anythink.expressad.f.a.b.aX, 0);
                cVar2.f19280y = jSONObject.optInt("dlnet", 2);
                cVar2.f19245A = jSONObject.optString(com.anythink.expressad.f.a.b.aL);
                cVar2.f19246B = jSONObject.optInt(com.anythink.expressad.f.a.b.aM);
                cVar2.f19247C = jSONObject.optLong(com.anythink.expressad.f.a.b.aN, 86400L);
                cVar2.f19248D = jSONObject.optLong(com.anythink.expressad.f.a.b.aO, 300L);
                cVar2.c(jSONObject.optInt("ready_rate", 100));
                cVar2.d(jSONObject.optInt("cd_rate", 0));
                cVar2.f19259P = jSONObject.optInt("content", 1);
                cVar2.f19260Q = jSONObject.optInt(com.anythink.expressad.f.a.b.bD, 0);
                cVar2.f19276u = jSONObject.optInt(com.anythink.expressad.f.a.b.cg, 1);
                cVar2.f19275t = jSONObject.optString(com.anythink.expressad.f.a.b.ce, "");
                cVar2.f19261e = jSONObject.optInt("playclosebtn_tm", -1);
                cVar2.f19262f = jSONObject.optInt("play_ctdown", 0);
                cVar2.f19263g = jSONObject.optInt("close_alert", 0);
                cVar2.f19264h = jSONObject.optInt(com.anythink.expressad.f.a.b.cs, 30);
                cVar2.f19249E = jSONObject.optInt(com.anythink.expressad.f.a.b.dc, 60);
                cVar2.f19250F = jSONObject.optInt(com.anythink.expressad.f.a.b.de, 0);
                int optInt = jSONObject.optInt("tmorl", 1);
                if (optInt <= 2 && optInt > 0) {
                    i6 = optInt;
                }
                cVar2.f19256M = i6;
                cVar2.f19253I = jSONObject.optString("placementid", "");
                cVar2.J = jSONObject.optInt("ltafemty", 10);
                cVar2.f19254K = jSONObject.optInt("ltorwc", 60);
                return cVar2;
            } catch (Exception e9) {
                e = e9;
                cVar = cVar2;
                e.printStackTrace();
                return cVar;
            }
        } catch (Exception e10) {
            e = e10;
        }
    }

    public static c c(String str) {
        c cVar = new c();
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(8);
        arrayList2.add(8);
        cVar.f19268m = 1;
        cVar.i = str;
        cVar.f19266k = arrayList;
        cVar.f19270o = arrayList2;
        cVar.f19271p = 1;
        cVar.f19273r = -2;
        cVar.f19272q = -2;
        cVar.f19274s = 5;
        cVar.f19281z = com.anythink.expressad.f.a.b.f19188P;
        cVar.f19280y = 2;
        cVar.f19279x = 1;
        cVar.c(100);
        cVar.d(0);
        cVar.f19259P = 1;
        cVar.f19260Q = 0;
        cVar.f19249E = 60;
        cVar.J = 10;
        cVar.f19254K = 60;
        return cVar;
    }

    public final void a(String str) {
        this.i = str;
    }

    public final void a(List<Integer> list) {
        this.f19266k = list;
    }

    private Queue<Integer> d(List<Integer> list) {
        LinkedList linkedList = new LinkedList();
        try {
            List<Integer> list2 = this.f19266k;
            if (list2 != null && list2.size() > 0) {
                for (Integer num : list) {
                    if (num != null) {
                        linkedList.add(Integer.valueOf(num.intValue() * 1000));
                    }
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        return linkedList;
    }

    private static Queue<Integer> c(List<Integer> list) {
        LinkedList linkedList = new LinkedList();
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (Integer num : list) {
                        if (num != null) {
                            linkedList.add(num);
                        }
                    }
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        return linkedList;
    }
}
