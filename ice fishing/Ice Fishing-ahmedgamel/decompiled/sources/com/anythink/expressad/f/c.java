package com.anythink.expressad.f;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.json.JSONArray;
import org.json.JSONObject;
import u1.h;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f18454a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f18455b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f18456c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f18457d = 3;

    /* renamed from: A, reason: collision with root package name */
    private String f18458A;

    /* renamed from: B, reason: collision with root package name */
    private int f18459B;

    /* renamed from: C, reason: collision with root package name */
    private long f18460C;

    /* renamed from: D, reason: collision with root package name */
    private long f18461D;

    /* renamed from: F, reason: collision with root package name */
    private int f18463F;

    /* renamed from: G, reason: collision with root package name */
    private int f18464G;

    /* renamed from: H, reason: collision with root package name */
    private int f18465H;

    /* renamed from: N, reason: collision with root package name */
    private int f18470N;

    /* renamed from: P, reason: collision with root package name */
    private int f18472P;

    /* renamed from: Q, reason: collision with root package name */
    private int f18473Q;

    /* renamed from: e, reason: collision with root package name */
    private int f18474e;

    /* renamed from: f, reason: collision with root package name */
    private int f18475f;

    /* renamed from: g, reason: collision with root package name */
    private int f18476g;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private String f18478j;

    /* renamed from: k, reason: collision with root package name */
    private List<Integer> f18479k;

    /* renamed from: l, reason: collision with root package name */
    private long f18480l;

    /* renamed from: n, reason: collision with root package name */
    private int f18482n;

    /* renamed from: o, reason: collision with root package name */
    private List<Integer> f18483o;

    /* renamed from: p, reason: collision with root package name */
    private int f18484p;

    /* renamed from: q, reason: collision with root package name */
    private int f18485q;

    /* renamed from: r, reason: collision with root package name */
    private int f18486r;

    /* renamed from: s, reason: collision with root package name */
    private int f18487s;

    /* renamed from: t, reason: collision with root package name */
    private String f18488t;

    /* renamed from: u, reason: collision with root package name */
    private int f18489u;

    /* renamed from: x, reason: collision with root package name */
    private int f18492x;

    /* renamed from: y, reason: collision with root package name */
    private int f18493y;

    /* renamed from: z, reason: collision with root package name */
    private long f18494z;

    /* renamed from: h, reason: collision with root package name */
    private int f18477h = 30;

    /* renamed from: m, reason: collision with root package name */
    private int f18481m = 1;

    /* renamed from: v, reason: collision with root package name */
    private int f18490v = 1;

    /* renamed from: w, reason: collision with root package name */
    private int f18491w = 5000;

    /* renamed from: E, reason: collision with root package name */
    private int f18462E = 60;

    /* renamed from: I, reason: collision with root package name */
    private String f18466I = "";
    private int J = 10;

    /* renamed from: K, reason: collision with root package name */
    private int f18467K = 60;

    /* renamed from: L, reason: collision with root package name */
    private double f18468L = 1.0d;

    /* renamed from: M, reason: collision with root package name */
    private int f18469M = 1;

    /* renamed from: O, reason: collision with root package name */
    private int f18471O = 0;

    private int A() {
        return this.f18465H;
    }

    private int B() {
        return this.f18469M;
    }

    private int C() {
        return this.f18473Q;
    }

    private String D() {
        return this.f18488t;
    }

    private int E() {
        return this.f18489u;
    }

    private int F() {
        return this.f18472P;
    }

    private long G() {
        return this.f18460C;
    }

    private long H() {
        return this.f18461D;
    }

    private String I() {
        return this.f18458A;
    }

    private int J() {
        return this.f18459B;
    }

    private int K() {
        return this.f18474e;
    }

    private int L() {
        return this.f18475f;
    }

    private int M() {
        return this.f18476g;
    }

    private int N() {
        int i = this.f18477h;
        if (i <= 0 || i > 100) {
            this.f18477h = 30;
        }
        return this.f18477h;
    }

    private static c O() {
        return new c();
    }

    private int P() {
        return this.f18487s;
    }

    private int Q() {
        return this.f18490v;
    }

    private int R() {
        return this.f18491w;
    }

    private int S() {
        return this.f18484p;
    }

    private int T() {
        return this.f18485q;
    }

    private int U() {
        return this.f18486r;
    }

    private String V() {
        return this.i;
    }

    private List<Integer> W() {
        return this.f18479k;
    }

    private List<Integer> X() {
        return this.f18483o;
    }

    private long Y() {
        return this.f18480l;
    }

    private int Z() {
        return this.f18482n;
    }

    private String aa() {
        return this.f18466I;
    }

    private int ab() {
        return this.J;
    }

    private int ac() {
        return this.f18467K;
    }

    private void e(int i) {
        this.f18469M = i;
    }

    private void f(int i) {
        this.f18463F = i;
    }

    private void g(int i) {
        this.f18489u = i;
    }

    public static c y() {
        c cVar = new c();
        cVar.f18492x = 0;
        return cVar;
    }

    private int z() {
        return this.f18464G;
    }

    public final double a() {
        return this.f18468L;
    }

    public final void b(int i) {
        this.f18465H = i;
    }

    public final void c() {
        this.f18462E = 60;
    }

    public final int d() {
        return this.f18463F;
    }

    public final void h() {
        this.f18472P = 1;
    }

    public final long i() {
        return this.f18494z;
    }

    public final void j() {
        this.f18493y = 2;
    }

    public final int k() {
        return this.f18492x;
    }

    public final void l() {
        this.f18492x = 1;
    }

    public final int m() {
        return this.f18493y;
    }

    public final void n() {
        this.f18494z = com.anythink.expressad.f.a.b.f18401P;
    }

    public final void o() {
        this.f18487s = 5;
    }

    public final void p() {
        this.f18484p = 1;
    }

    public final void q() {
        this.f18485q = -2;
    }

    public final void r() {
        this.f18486r = -2;
    }

    public final JSONObject s() {
        JSONObject jSONObject = new JSONObject();
        try {
            List<Integer> list = this.f18479k;
            if (list != null && list.size() > 0) {
                int size = this.f18479k.size();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < size; i++) {
                    jSONArray.put(this.f18479k.get(i));
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            List<Integer> list2 = this.f18483o;
            if (list2 != null && list2.size() > 0) {
                int size2 = this.f18483o.size();
                JSONArray jSONArray2 = new JSONArray();
                for (int i6 = 0; i6 < size2; i6++) {
                    jSONArray2.put(this.f18483o.get(i6));
                }
                jSONObject.put("ad_source_timeout", jSONArray2);
            }
            jSONObject.put(com.anythink.expressad.f.a.b.J, this.f18484p);
            jSONObject.put("aqn", this.f18485q);
            jSONObject.put("acn", this.f18486r);
            jSONObject.put(com.anythink.expressad.f.a.b.f18403R, this.f18487s);
            jSONObject.put("current_time", this.f18480l);
            jSONObject.put("offset", this.f18481m);
            jSONObject.put("dlct", this.f18494z);
            jSONObject.put(com.anythink.expressad.f.a.b.aX, this.f18492x);
            jSONObject.put("dlnet", this.f18493y);
            jSONObject.put(com.anythink.expressad.f.a.b.aL, this.f18458A);
            jSONObject.put(com.anythink.expressad.f.a.b.aM, this.f18459B);
            jSONObject.put(com.anythink.expressad.f.a.b.aN, this.f18460C);
            jSONObject.put(com.anythink.expressad.f.a.b.aO, this.f18461D);
            jSONObject.put("ready_rate", this.f18470N);
            jSONObject.put("content", this.f18472P);
            jSONObject.put(com.anythink.expressad.f.a.b.bD, this.f18473Q);
            jSONObject.put(com.anythink.expressad.f.a.b.cg, this.f18489u);
            jSONObject.put(com.anythink.expressad.f.a.b.ce, this.f18488t);
            jSONObject.put("playclosebtn_tm", this.f18474e);
            jSONObject.put("play_ctdown", this.f18475f);
            jSONObject.put("close_alert", this.f18476g);
            jSONObject.put(com.anythink.expressad.f.a.b.de, this.f18463F);
            jSONObject.put(com.anythink.expressad.f.a.b.dc, this.f18462E);
            jSONObject.put(com.anythink.expressad.f.a.b.dl, this.f18465H);
            jSONObject.put(com.anythink.expressad.f.a.b.dn, this.f18464G);
            jSONObject.put("tmorl", this.f18469M);
            jSONObject.put("unitId", this.i);
            jSONObject.put("placementid", this.f18466I);
            jSONObject.put("ltafemty", this.J);
            jSONObject.put("ltorwc", this.f18467K);
            return jSONObject;
        } catch (Exception e9) {
            e9.printStackTrace();
            return jSONObject;
        }
    }

    public final int t() {
        return this.f18481m;
    }

    public final String toString() {
        List<Integer> list = this.f18479k;
        String str = "";
        if (list != null && list.size() > 0) {
            Iterator<Integer> it = this.f18479k.iterator();
            while (it.hasNext()) {
                str = str + it.next() + ",";
            }
        }
        StringBuilder sb = new StringBuilder("offset = ");
        sb.append(this.f18481m);
        sb.append(" unitId = ");
        sb.append(this.i);
        sb.append(" fbPlacementId = ");
        return h.g(sb, this.f18478j, str);
    }

    public final void u() {
        this.f18481m = 1;
    }

    public final void v() {
        this.f18482n = 2;
    }

    public final void w() {
        this.J = 10;
    }

    public final void x() {
        this.f18467K = 60;
    }

    private void a(double d2) {
        this.f18468L = d2;
    }

    private void f(String str) {
        this.f18488t = str;
    }

    private void h(int i) {
        this.f18459B = i;
    }

    private void i(int i) {
        this.f18474e = i;
    }

    private void j(int i) {
        this.f18475f = i;
    }

    private void k(int i) {
        this.f18476g = i;
    }

    private void l(int i) {
        this.f18477h = i;
    }

    private void m(int i) {
        this.f18490v = i;
    }

    private void n(int i) {
        this.f18491w = i;
    }

    public final int b() {
        return this.f18462E;
    }

    public final void c(int i) {
        try {
            this.f18470N = i;
        } catch (Exception unused) {
            this.f18470N = 100;
        }
    }

    public final void d(int i) {
        try {
            this.f18471O = i;
        } catch (Exception unused) {
            this.f18471O = 0;
        }
    }

    public final void e() {
        this.f18473Q = 0;
    }

    public final int g() {
        return this.f18471O;
    }

    private void b(long j6) {
        this.f18461D = j6;
    }

    private void g(String str) {
        this.f18458A = str;
    }

    public final void a(int i) {
        this.f18464G = i;
    }

    public final void e(String str) {
        this.f18466I = str;
    }

    public final int f() {
        return this.f18470N;
    }

    private void a(long j6) {
        this.f18460C = j6;
    }

    private void c(long j6) {
        this.f18480l = j6;
    }

    public static c d(String str) {
        c cVar = new c();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(1);
            cVar.f18479k = arrayList;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(30);
            cVar.f18483o = arrayList2;
            cVar.i = str;
            cVar.f18481m = 1;
            cVar.f18484p = 1;
            cVar.f18486r = -2;
            cVar.f18485q = -2;
            cVar.f18487s = 5;
            cVar.f18494z = com.anythink.expressad.f.a.b.f18401P;
            cVar.f18493y = 2;
            cVar.f18492x = 3;
            return cVar;
        } catch (Exception e9) {
            e9.printStackTrace();
            return cVar;
        }
    }

    public final void b(List<Integer> list) {
        this.f18483o = list;
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
                    cVar2.f18479k = arrayList;
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("ad_source_timeout");
                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i6 = 0; i6 < optJSONArray2.length(); i6++) {
                        arrayList2.add(Integer.valueOf(optJSONArray2.optInt(i6)));
                    }
                    cVar2.f18483o = arrayList2;
                }
                cVar2.f18484p = jSONObject.optInt(com.anythink.expressad.f.a.b.J);
                cVar2.f18485q = jSONObject.optInt("aqn");
                cVar2.f18486r = jSONObject.optInt("acn");
                cVar2.f18487s = jSONObject.optInt(com.anythink.expressad.f.a.b.f18403R);
                int i9 = 1;
                cVar2.f18490v = jSONObject.optInt(com.anythink.expressad.f.a.b.f18404S, 1);
                cVar2.f18491w = jSONObject.optInt(com.anythink.expressad.f.a.b.f18405T, 5000);
                cVar2.f18480l = jSONObject.optLong("current_time");
                cVar2.f18481m = jSONObject.optInt("offset");
                cVar2.f18494z = jSONObject.optLong("dlct", com.anythink.expressad.f.a.b.f18401P);
                cVar2.f18492x = jSONObject.optInt(com.anythink.expressad.f.a.b.aX, 0);
                cVar2.f18493y = jSONObject.optInt("dlnet", 2);
                cVar2.f18458A = jSONObject.optString(com.anythink.expressad.f.a.b.aL);
                cVar2.f18459B = jSONObject.optInt(com.anythink.expressad.f.a.b.aM);
                cVar2.f18460C = jSONObject.optLong(com.anythink.expressad.f.a.b.aN, 86400L);
                cVar2.f18461D = jSONObject.optLong(com.anythink.expressad.f.a.b.aO, 300L);
                cVar2.c(jSONObject.optInt("ready_rate", 100));
                cVar2.d(jSONObject.optInt("cd_rate", 0));
                cVar2.f18472P = jSONObject.optInt("content", 1);
                cVar2.f18473Q = jSONObject.optInt(com.anythink.expressad.f.a.b.bD, 0);
                cVar2.f18489u = jSONObject.optInt(com.anythink.expressad.f.a.b.cg, 1);
                cVar2.f18488t = jSONObject.optString(com.anythink.expressad.f.a.b.ce, "");
                cVar2.f18474e = jSONObject.optInt("playclosebtn_tm", -1);
                cVar2.f18475f = jSONObject.optInt("play_ctdown", 0);
                cVar2.f18476g = jSONObject.optInt("close_alert", 0);
                cVar2.f18477h = jSONObject.optInt(com.anythink.expressad.f.a.b.cs, 30);
                cVar2.f18462E = jSONObject.optInt(com.anythink.expressad.f.a.b.dc, 60);
                cVar2.f18463F = jSONObject.optInt(com.anythink.expressad.f.a.b.de, 0);
                int optInt = jSONObject.optInt("tmorl", 1);
                if (optInt <= 2 && optInt > 0) {
                    i9 = optInt;
                }
                cVar2.f18469M = i9;
                cVar2.f18466I = jSONObject.optString("placementid", "");
                cVar2.J = jSONObject.optInt("ltafemty", 10);
                cVar2.f18467K = jSONObject.optInt("ltorwc", 60);
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
        cVar.f18481m = 1;
        cVar.i = str;
        cVar.f18479k = arrayList;
        cVar.f18483o = arrayList2;
        cVar.f18484p = 1;
        cVar.f18486r = -2;
        cVar.f18485q = -2;
        cVar.f18487s = 5;
        cVar.f18494z = com.anythink.expressad.f.a.b.f18401P;
        cVar.f18493y = 2;
        cVar.f18492x = 1;
        cVar.c(100);
        cVar.d(0);
        cVar.f18472P = 1;
        cVar.f18473Q = 0;
        cVar.f18462E = 60;
        cVar.J = 10;
        cVar.f18467K = 60;
        return cVar;
    }

    public final void a(String str) {
        this.i = str;
    }

    public final void a(List<Integer> list) {
        this.f18479k = list;
    }

    private Queue<Integer> d(List<Integer> list) {
        LinkedList linkedList = new LinkedList();
        try {
            List<Integer> list2 = this.f18479k;
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
