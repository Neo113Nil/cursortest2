package com.anythink.expressad.f;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.json.JSONArray;
import org.json.JSONObject;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f18612a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f18613b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f18614c = 3;

    /* renamed from: d, reason: collision with root package name */
    public static final int f18615d = 3;

    /* renamed from: A, reason: collision with root package name */
    private String f18616A;

    /* renamed from: B, reason: collision with root package name */
    private int f18617B;

    /* renamed from: C, reason: collision with root package name */
    private long f18618C;

    /* renamed from: D, reason: collision with root package name */
    private long f18619D;

    /* renamed from: F, reason: collision with root package name */
    private int f18621F;

    /* renamed from: G, reason: collision with root package name */
    private int f18622G;

    /* renamed from: H, reason: collision with root package name */
    private int f18623H;

    /* renamed from: N, reason: collision with root package name */
    private int f18628N;

    /* renamed from: P, reason: collision with root package name */
    private int f18630P;

    /* renamed from: Q, reason: collision with root package name */
    private int f18631Q;

    /* renamed from: e, reason: collision with root package name */
    private int f18632e;

    /* renamed from: f, reason: collision with root package name */
    private int f18633f;

    /* renamed from: g, reason: collision with root package name */
    private int f18634g;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private String f18636j;

    /* renamed from: k, reason: collision with root package name */
    private List<Integer> f18637k;

    /* renamed from: l, reason: collision with root package name */
    private long f18638l;

    /* renamed from: n, reason: collision with root package name */
    private int f18640n;

    /* renamed from: o, reason: collision with root package name */
    private List<Integer> f18641o;

    /* renamed from: p, reason: collision with root package name */
    private int f18642p;

    /* renamed from: q, reason: collision with root package name */
    private int f18643q;

    /* renamed from: r, reason: collision with root package name */
    private int f18644r;

    /* renamed from: s, reason: collision with root package name */
    private int f18645s;

    /* renamed from: t, reason: collision with root package name */
    private String f18646t;

    /* renamed from: u, reason: collision with root package name */
    private int f18647u;

    /* renamed from: x, reason: collision with root package name */
    private int f18650x;

    /* renamed from: y, reason: collision with root package name */
    private int f18651y;

    /* renamed from: z, reason: collision with root package name */
    private long f18652z;

    /* renamed from: h, reason: collision with root package name */
    private int f18635h = 30;

    /* renamed from: m, reason: collision with root package name */
    private int f18639m = 1;

    /* renamed from: v, reason: collision with root package name */
    private int f18648v = 1;

    /* renamed from: w, reason: collision with root package name */
    private int f18649w = 5000;

    /* renamed from: E, reason: collision with root package name */
    private int f18620E = 60;

    /* renamed from: I, reason: collision with root package name */
    private String f18624I = "";
    private int J = 10;

    /* renamed from: K, reason: collision with root package name */
    private int f18625K = 60;

    /* renamed from: L, reason: collision with root package name */
    private double f18626L = 1.0d;

    /* renamed from: M, reason: collision with root package name */
    private int f18627M = 1;

    /* renamed from: O, reason: collision with root package name */
    private int f18629O = 0;

    private int A() {
        return this.f18623H;
    }

    private int B() {
        return this.f18627M;
    }

    private int C() {
        return this.f18631Q;
    }

    private String D() {
        return this.f18646t;
    }

    private int E() {
        return this.f18647u;
    }

    private int F() {
        return this.f18630P;
    }

    private long G() {
        return this.f18618C;
    }

    private long H() {
        return this.f18619D;
    }

    private String I() {
        return this.f18616A;
    }

    private int J() {
        return this.f18617B;
    }

    private int K() {
        return this.f18632e;
    }

    private int L() {
        return this.f18633f;
    }

    private int M() {
        return this.f18634g;
    }

    private int N() {
        int i = this.f18635h;
        if (i <= 0 || i > 100) {
            this.f18635h = 30;
        }
        return this.f18635h;
    }

    private static c O() {
        return new c();
    }

    private int P() {
        return this.f18645s;
    }

    private int Q() {
        return this.f18648v;
    }

    private int R() {
        return this.f18649w;
    }

    private int S() {
        return this.f18642p;
    }

    private int T() {
        return this.f18643q;
    }

    private int U() {
        return this.f18644r;
    }

    private String V() {
        return this.i;
    }

    private List<Integer> W() {
        return this.f18637k;
    }

    private List<Integer> X() {
        return this.f18641o;
    }

    private long Y() {
        return this.f18638l;
    }

    private int Z() {
        return this.f18640n;
    }

    private String aa() {
        return this.f18624I;
    }

    private int ab() {
        return this.J;
    }

    private int ac() {
        return this.f18625K;
    }

    private void e(int i) {
        this.f18627M = i;
    }

    private void f(int i) {
        this.f18621F = i;
    }

    private void g(int i) {
        this.f18647u = i;
    }

    public static c y() {
        c cVar = new c();
        cVar.f18650x = 0;
        return cVar;
    }

    private int z() {
        return this.f18622G;
    }

    public final double a() {
        return this.f18626L;
    }

    public final void b(int i) {
        this.f18623H = i;
    }

    public final void c() {
        this.f18620E = 60;
    }

    public final int d() {
        return this.f18621F;
    }

    public final void h() {
        this.f18630P = 1;
    }

    public final long i() {
        return this.f18652z;
    }

    public final void j() {
        this.f18651y = 2;
    }

    public final int k() {
        return this.f18650x;
    }

    public final void l() {
        this.f18650x = 1;
    }

    public final int m() {
        return this.f18651y;
    }

    public final void n() {
        this.f18652z = com.anythink.expressad.f.a.b.f18559P;
    }

    public final void o() {
        this.f18645s = 5;
    }

    public final void p() {
        this.f18642p = 1;
    }

    public final void q() {
        this.f18643q = -2;
    }

    public final void r() {
        this.f18644r = -2;
    }

    public final JSONObject s() {
        JSONObject jSONObject = new JSONObject();
        try {
            List<Integer> list = this.f18637k;
            if (list != null && list.size() > 0) {
                int size = this.f18637k.size();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < size; i++) {
                    jSONArray.put(this.f18637k.get(i));
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            List<Integer> list2 = this.f18641o;
            if (list2 != null && list2.size() > 0) {
                int size2 = this.f18641o.size();
                JSONArray jSONArray2 = new JSONArray();
                for (int i4 = 0; i4 < size2; i4++) {
                    jSONArray2.put(this.f18641o.get(i4));
                }
                jSONObject.put("ad_source_timeout", jSONArray2);
            }
            jSONObject.put(com.anythink.expressad.f.a.b.J, this.f18642p);
            jSONObject.put("aqn", this.f18643q);
            jSONObject.put("acn", this.f18644r);
            jSONObject.put(com.anythink.expressad.f.a.b.f18561R, this.f18645s);
            jSONObject.put("current_time", this.f18638l);
            jSONObject.put("offset", this.f18639m);
            jSONObject.put("dlct", this.f18652z);
            jSONObject.put(com.anythink.expressad.f.a.b.aX, this.f18650x);
            jSONObject.put("dlnet", this.f18651y);
            jSONObject.put(com.anythink.expressad.f.a.b.aL, this.f18616A);
            jSONObject.put(com.anythink.expressad.f.a.b.aM, this.f18617B);
            jSONObject.put(com.anythink.expressad.f.a.b.aN, this.f18618C);
            jSONObject.put(com.anythink.expressad.f.a.b.aO, this.f18619D);
            jSONObject.put("ready_rate", this.f18628N);
            jSONObject.put("content", this.f18630P);
            jSONObject.put(com.anythink.expressad.f.a.b.bD, this.f18631Q);
            jSONObject.put(com.anythink.expressad.f.a.b.cg, this.f18647u);
            jSONObject.put(com.anythink.expressad.f.a.b.ce, this.f18646t);
            jSONObject.put("playclosebtn_tm", this.f18632e);
            jSONObject.put("play_ctdown", this.f18633f);
            jSONObject.put("close_alert", this.f18634g);
            jSONObject.put(com.anythink.expressad.f.a.b.de, this.f18621F);
            jSONObject.put(com.anythink.expressad.f.a.b.dc, this.f18620E);
            jSONObject.put(com.anythink.expressad.f.a.b.dl, this.f18623H);
            jSONObject.put(com.anythink.expressad.f.a.b.dn, this.f18622G);
            jSONObject.put("tmorl", this.f18627M);
            jSONObject.put("unitId", this.i);
            jSONObject.put("placementid", this.f18624I);
            jSONObject.put("ltafemty", this.J);
            jSONObject.put("ltorwc", this.f18625K);
            return jSONObject;
        } catch (Exception e6) {
            e6.printStackTrace();
            return jSONObject;
        }
    }

    public final int t() {
        return this.f18639m;
    }

    public final String toString() {
        List<Integer> list = this.f18637k;
        String str = "";
        if (list != null && list.size() > 0) {
            Iterator<Integer> it = this.f18637k.iterator();
            while (it.hasNext()) {
                str = str + it.next() + ",";
            }
        }
        StringBuilder sb = new StringBuilder("offset = ");
        sb.append(this.f18639m);
        sb.append(" unitId = ");
        sb.append(this.i);
        sb.append(" fbPlacementId = ");
        return AbstractC5051n.g(sb, this.f18636j, str);
    }

    public final void u() {
        this.f18639m = 1;
    }

    public final void v() {
        this.f18640n = 2;
    }

    public final void w() {
        this.J = 10;
    }

    public final void x() {
        this.f18625K = 60;
    }

    private void a(double d2) {
        this.f18626L = d2;
    }

    private void f(String str) {
        this.f18646t = str;
    }

    private void h(int i) {
        this.f18617B = i;
    }

    private void i(int i) {
        this.f18632e = i;
    }

    private void j(int i) {
        this.f18633f = i;
    }

    private void k(int i) {
        this.f18634g = i;
    }

    private void l(int i) {
        this.f18635h = i;
    }

    private void m(int i) {
        this.f18648v = i;
    }

    private void n(int i) {
        this.f18649w = i;
    }

    public final int b() {
        return this.f18620E;
    }

    public final void c(int i) {
        try {
            this.f18628N = i;
        } catch (Exception unused) {
            this.f18628N = 100;
        }
    }

    public final void d(int i) {
        try {
            this.f18629O = i;
        } catch (Exception unused) {
            this.f18629O = 0;
        }
    }

    public final void e() {
        this.f18631Q = 0;
    }

    public final int g() {
        return this.f18629O;
    }

    private void b(long j9) {
        this.f18619D = j9;
    }

    private void g(String str) {
        this.f18616A = str;
    }

    public final void a(int i) {
        this.f18622G = i;
    }

    public final void e(String str) {
        this.f18624I = str;
    }

    public final int f() {
        return this.f18628N;
    }

    private void a(long j9) {
        this.f18618C = j9;
    }

    private void c(long j9) {
        this.f18638l = j9;
    }

    public static c d(String str) {
        c cVar = new c();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(1);
            cVar.f18637k = arrayList;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(30);
            cVar.f18641o = arrayList2;
            cVar.i = str;
            cVar.f18639m = 1;
            cVar.f18642p = 1;
            cVar.f18644r = -2;
            cVar.f18643q = -2;
            cVar.f18645s = 5;
            cVar.f18652z = com.anythink.expressad.f.a.b.f18559P;
            cVar.f18651y = 2;
            cVar.f18650x = 3;
            return cVar;
        } catch (Exception e6) {
            e6.printStackTrace();
            return cVar;
        }
    }

    public final void b(List<Integer> list) {
        this.f18641o = list;
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
                    cVar2.f18637k = arrayList;
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("ad_source_timeout");
                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i4 = 0; i4 < optJSONArray2.length(); i4++) {
                        arrayList2.add(Integer.valueOf(optJSONArray2.optInt(i4)));
                    }
                    cVar2.f18641o = arrayList2;
                }
                cVar2.f18642p = jSONObject.optInt(com.anythink.expressad.f.a.b.J);
                cVar2.f18643q = jSONObject.optInt("aqn");
                cVar2.f18644r = jSONObject.optInt("acn");
                cVar2.f18645s = jSONObject.optInt(com.anythink.expressad.f.a.b.f18561R);
                int i9 = 1;
                cVar2.f18648v = jSONObject.optInt(com.anythink.expressad.f.a.b.f18562S, 1);
                cVar2.f18649w = jSONObject.optInt(com.anythink.expressad.f.a.b.f18563T, 5000);
                cVar2.f18638l = jSONObject.optLong("current_time");
                cVar2.f18639m = jSONObject.optInt("offset");
                cVar2.f18652z = jSONObject.optLong("dlct", com.anythink.expressad.f.a.b.f18559P);
                cVar2.f18650x = jSONObject.optInt(com.anythink.expressad.f.a.b.aX, 0);
                cVar2.f18651y = jSONObject.optInt("dlnet", 2);
                cVar2.f18616A = jSONObject.optString(com.anythink.expressad.f.a.b.aL);
                cVar2.f18617B = jSONObject.optInt(com.anythink.expressad.f.a.b.aM);
                cVar2.f18618C = jSONObject.optLong(com.anythink.expressad.f.a.b.aN, 86400L);
                cVar2.f18619D = jSONObject.optLong(com.anythink.expressad.f.a.b.aO, 300L);
                cVar2.c(jSONObject.optInt("ready_rate", 100));
                cVar2.d(jSONObject.optInt("cd_rate", 0));
                cVar2.f18630P = jSONObject.optInt("content", 1);
                cVar2.f18631Q = jSONObject.optInt(com.anythink.expressad.f.a.b.bD, 0);
                cVar2.f18647u = jSONObject.optInt(com.anythink.expressad.f.a.b.cg, 1);
                cVar2.f18646t = jSONObject.optString(com.anythink.expressad.f.a.b.ce, "");
                cVar2.f18632e = jSONObject.optInt("playclosebtn_tm", -1);
                cVar2.f18633f = jSONObject.optInt("play_ctdown", 0);
                cVar2.f18634g = jSONObject.optInt("close_alert", 0);
                cVar2.f18635h = jSONObject.optInt(com.anythink.expressad.f.a.b.cs, 30);
                cVar2.f18620E = jSONObject.optInt(com.anythink.expressad.f.a.b.dc, 60);
                cVar2.f18621F = jSONObject.optInt(com.anythink.expressad.f.a.b.de, 0);
                int optInt = jSONObject.optInt("tmorl", 1);
                if (optInt <= 2 && optInt > 0) {
                    i9 = optInt;
                }
                cVar2.f18627M = i9;
                cVar2.f18624I = jSONObject.optString("placementid", "");
                cVar2.J = jSONObject.optInt("ltafemty", 10);
                cVar2.f18625K = jSONObject.optInt("ltorwc", 60);
                return cVar2;
            } catch (Exception e6) {
                e = e6;
                cVar = cVar2;
                e.printStackTrace();
                return cVar;
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    public static c c(String str) {
        c cVar = new c();
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(8);
        arrayList2.add(8);
        cVar.f18639m = 1;
        cVar.i = str;
        cVar.f18637k = arrayList;
        cVar.f18641o = arrayList2;
        cVar.f18642p = 1;
        cVar.f18644r = -2;
        cVar.f18643q = -2;
        cVar.f18645s = 5;
        cVar.f18652z = com.anythink.expressad.f.a.b.f18559P;
        cVar.f18651y = 2;
        cVar.f18650x = 1;
        cVar.c(100);
        cVar.d(0);
        cVar.f18630P = 1;
        cVar.f18631Q = 0;
        cVar.f18620E = 60;
        cVar.J = 10;
        cVar.f18625K = 60;
        return cVar;
    }

    public final void a(String str) {
        this.i = str;
    }

    public final void a(List<Integer> list) {
        this.f18637k = list;
    }

    private Queue<Integer> d(List<Integer> list) {
        LinkedList linkedList = new LinkedList();
        try {
            List<Integer> list2 = this.f18637k;
            if (list2 != null && list2.size() > 0) {
                for (Integer num : list) {
                    if (num != null) {
                        linkedList.add(Integer.valueOf(num.intValue() * 1000));
                    }
                }
            }
        } catch (Exception e6) {
            e6.printStackTrace();
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
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
        return linkedList;
    }
}
