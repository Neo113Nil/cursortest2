package com.anythink.core.b.a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.AdError;
import com.anythink.core.basead.adx.api.ATAdxSetting;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.s;
import com.anythink.core.common.d.t;
import com.anythink.core.common.m.b.g;
import com.anythink.core.common.m.e;
import com.anythink.core.common.o;
import com.anythink.core.common.v.k;
import com.anythink.core.common.v.m;
import com.anythink.core.common.v.p;
import com.anythink.core.d.d;
import com.anythink.core.d.l;
import com.anythink.core.d.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a extends com.anythink.core.common.m.a {

    /* renamed from: K, reason: collision with root package name */
    private static final String f11627K = "a";

    /* renamed from: a, reason: collision with root package name */
    public static final int f11628a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f11629b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final String f11630c = "ex_pkg";

    /* renamed from: A, reason: collision with root package name */
    String f11631A;

    /* renamed from: B, reason: collision with root package name */
    JSONObject f11632B;

    /* renamed from: C, reason: collision with root package name */
    public long f11633C;

    /* renamed from: D, reason: collision with root package name */
    public long f11634D;

    /* renamed from: E, reason: collision with root package name */
    public long f11635E;

    /* renamed from: F, reason: collision with root package name */
    public long f11636F;

    /* renamed from: G, reason: collision with root package name */
    public long f11637G;

    /* renamed from: H, reason: collision with root package name */
    public long f11638H;

    /* renamed from: I, reason: collision with root package name */
    public int f11639I;
    public long J;

    /* renamed from: L, reason: collision with root package name */
    private int f11640L;

    /* renamed from: M, reason: collision with root package name */
    private final String f11641M = l.a.f17415j;

    /* renamed from: N, reason: collision with root package name */
    private final String f11642N = "request_id";

    /* renamed from: O, reason: collision with root package name */
    private final String f11643O = "ch_info";

    /* renamed from: P, reason: collision with root package name */
    private final String f11644P = e.bn;

    /* renamed from: Q, reason: collision with root package name */
    private final String f11645Q = "np";

    /* renamed from: R, reason: collision with root package name */
    private final String f11646R = "hb_size";

    /* renamed from: S, reason: collision with root package name */
    private final String f11647S = "last_wf";

    /* renamed from: T, reason: collision with root package name */
    private final String f11648T = "co";

    /* renamed from: U, reason: collision with root package name */
    private final String f11649U = l.a.f17400S;

    /* renamed from: V, reason: collision with root package name */
    private final String f11650V = "debug";

    /* renamed from: W, reason: collision with root package name */
    private final String f11651W = e.bg;

    /* renamed from: X, reason: collision with root package name */
    private final String f11652X = "last_win";
    private final String Y = "last_m_data";

    /* renamed from: Z, reason: collision with root package name */
    private int f11653Z;
    private ATAdRequest aa;

    /* renamed from: d, reason: collision with root package name */
    String f11654d;

    /* renamed from: e, reason: collision with root package name */
    String f11655e;

    /* renamed from: f, reason: collision with root package name */
    String f11656f;

    /* renamed from: g, reason: collision with root package name */
    String f11657g;

    /* renamed from: h, reason: collision with root package name */
    String f11658h;
    String i;

    /* renamed from: j, reason: collision with root package name */
    String f11659j;

    /* renamed from: k, reason: collision with root package name */
    String f11660k;

    /* renamed from: l, reason: collision with root package name */
    int f11661l;

    /* renamed from: u, reason: collision with root package name */
    int f11662u;

    /* renamed from: v, reason: collision with root package name */
    int f11663v;

    /* renamed from: w, reason: collision with root package name */
    String f11664w;

    /* renamed from: x, reason: collision with root package name */
    String f11665x;

    /* renamed from: y, reason: collision with root package name */
    String f11666y;

    /* renamed from: z, reason: collision with root package name */
    String f11667z;

    public a(String str, String str2, String str3, List<JSONObject> list, int i, l lVar) {
        this.f11653Z = 0;
        this.f11654d = str3;
        this.f11657g = str;
        this.f11658h = str2;
        this.f11640L = i;
        JSONArray jSONArray = new JSONArray();
        Iterator<JSONObject> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        this.f11655e = k.a(jSONArray.toString().getBytes());
        if (lVar != null) {
            this.f11661l = lVar.ai();
            this.f11662u = lVar.ay();
            this.f11653Z = lVar.aW();
        }
    }

    private void d(int i) {
        this.f11663v = i;
    }

    @Override // com.anythink.core.common.m.a
    public final int a() {
        return 1;
    }

    @Override // com.anythink.core.common.m.a
    public final void b(AdError adError) {
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, String> c() {
        HashMap hashMap = new HashMap();
        if (this.f11640L == 0) {
            hashMap.put("Accept-Encoding", com.anythink.expressad.foundation.g.f.g.b.f19341d);
        }
        hashMap.put("Content-Type", "application/json;charset=utf-8");
        return hashMap;
    }

    @Override // com.anythink.core.common.m.a
    public final JSONObject e() {
        l b9;
        JSONObject aQ;
        Object obj;
        JSONObject a9;
        JSONObject e9 = super.e();
        try {
            e9.put("app_id", t.b().p());
            e9.put(e.bk, this.f11658h);
            e9.put("session_id", t.b().g(this.f11658h));
            e9.put("t_g_id", this.f11661l);
            e9.put("gro_id", this.f11662u);
            String C8 = t.b().C();
            if (!TextUtils.isEmpty(C8)) {
                e9.put("sy_id", C8);
            }
            String D8 = t.b().D();
            if (TextUtils.isEmpty(D8)) {
                t.b().k(t.b().B());
                e9.put("bk_id", t.b().B());
            } else {
                e9.put("bk_id", D8);
            }
            e9.put("deny", m.q(t.b().g()));
            if (this.f11640L == 0) {
                e9.put("misk_spt", o.a().c());
                o.a();
                e9.put("misk_pt_det", o.b());
            }
            JSONObject a10 = e.a(this.f11658h);
            if (a10 != null) {
                e9.put("customs", a10);
            }
            e.a(e9);
            n a11 = n.a(t.b().g());
            String str = this.f11658h;
            if (!TextUtils.isEmpty(str)) {
                try {
                    if (!TextUtils.isEmpty(str) && (b9 = a11.b(str)) != null && (aQ = b9.aQ()) != null) {
                        e9.put(l.a.aa, aQ);
                    }
                } catch (Exception unused) {
                }
            }
            if (this.f11653Z > 0 && (a9 = com.anythink.core.c.b.a().a(this.f11658h, this.f11653Z)) != null) {
                e9.put(e.ar, a9);
            }
            if (ATAdxSetting.getInstance().isAdxNetworkMode(this.f11658h)) {
                e9.put(e.be, 1);
                e9.put("adap_c", this.f11632B);
            }
            boolean b10 = p.b();
            com.anythink.core.d.b b11 = d.a(t.b().g()).b(t.b().p());
            e9.put("coppa", (b11.C() == 2 && b10) ? 1 : 2);
            e9.put("ccpa", b11.B() == 3 ? 1 : 2);
            e9.put("bid_ver", 1);
            s c9 = t.b().c();
            if (c9 != null) {
                c9.fillRequestDataForDl(e9);
            }
            long j6 = this.f11633C;
            if (j6 > 0) {
                e9.put("l_t_bstart", j6);
            }
            long j9 = this.f11634D;
            if (j9 > 0) {
                e9.put("l_t_breq", j9);
            }
            long j10 = this.f11635E;
            if (j10 > 0) {
                e9.put("h_s_t", j10);
            }
            long j11 = this.f11636F;
            if (j11 > 0) {
                e9.put("h_b_to", j11);
            }
            long j12 = this.f11637G;
            if (j12 > 0) {
                e9.put(l.a.f17384B, j12);
            }
            long j13 = this.f11638H;
            if (j13 > 0) {
                e9.put("sp_to", j13);
            }
            Pair<Integer, List<String>> I8 = t.b().I();
            if (I8 != null && (obj = I8.first) != null) {
                e9.put(e.bq, ((Integer) obj).intValue());
            }
            String f3 = b11.f();
            if (!TextUtils.isEmpty(f3)) {
                e9.put(e.br, f3);
            }
            ATAdRequest aTAdRequest = this.aa;
            if (aTAdRequest != null) {
                e9.put(e.bp, aTAdRequest.getChannelSource());
            } else {
                e9.put(e.bp, t.b().E());
            }
        } catch (Exception unused2) {
        }
        return e9;
    }

    @Override // com.anythink.core.common.m.a
    public final JSONObject f() {
        JSONObject f3 = super.f();
        try {
            f3.put("p_ls", this.f11639I);
            f3.put("p_lt_f_i", this.J);
        } catch (Throwable unused) {
        }
        return f3;
    }

    @Override // com.anythink.core.common.m.a
    public final String g() {
        String jSONObject = e().toString();
        String jSONObject2 = f().toString();
        HashMap hashMap = new HashMap();
        String a9 = k.a(jSONObject);
        String a10 = k.a(jSONObject2);
        hashMap.put("p", a9);
        hashMap.put(e.f14631W, a10);
        hashMap.put(l.a.f17415j, this.f11655e);
        hashMap.put("request_id", this.f11654d);
        int i = this.f11663v;
        if (i > 0) {
            hashMap.put("hb_size", Integer.valueOf(i));
        }
        if (this.f11640L == 0) {
            if (!TextUtils.isEmpty(this.f11656f)) {
                hashMap.put("ch_info", this.f11656f);
            }
            if (!TextUtils.isEmpty(this.i)) {
                hashMap.put(e.bn, this.i);
            }
            if (!TextUtils.isEmpty(this.f11659j)) {
                hashMap.put("np", this.f11659j);
            }
            if (!TextUtils.isEmpty(this.f11664w)) {
                hashMap.put("last_wf", this.f11664w);
            }
            if (!TextUtils.isEmpty(this.f11665x)) {
                hashMap.put("co", this.f11665x);
            }
            hashMap.put(l.a.f17400S, this.f11666y);
            if (t.b().l() != null) {
                hashMap.put(f11630c, k.a(t.b().l().toString()));
            }
            if (t.b().F() && t.b().y()) {
                hashMap.put("debug", 1);
            }
            if (!TextUtils.isEmpty(this.f11660k)) {
                hashMap.put(e.bg, this.f11660k);
            }
            if (!TextUtils.isEmpty(this.f11667z)) {
                hashMap.put("last_win", this.f11667z);
            }
            if (!TextUtils.isEmpty(this.f11631A)) {
                hashMap.put("last_m_data", this.f11631A);
            }
        }
        Set<String> keySet = hashMap.keySet();
        JSONObject jSONObject3 = new JSONObject();
        try {
            for (String str : keySet) {
                jSONObject3.put(str, hashMap.get(str));
            }
            return jSONObject3.toString();
        } catch (Exception unused) {
            return null;
        } catch (OutOfMemoryError unused2) {
            System.gc();
            return null;
        }
    }

    @Override // com.anythink.core.common.m.a
    public final String h() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final Context i() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final String j() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, Object> k() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final int l() {
        return 246;
    }

    @Override // com.anythink.core.common.m.a
    public final com.anythink.core.common.m.b.d m() {
        return com.anythink.core.common.m.b.d.a(g.i);
    }

    @Override // com.anythink.core.common.m.a
    public final List<String> q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j.aa.f12391a);
        return arrayList;
    }

    @Override // com.anythink.core.common.m.a
    public final void a(AdError adError) {
    }

    @Override // com.anythink.core.common.m.a
    public final String b() {
        return this.f11657g;
    }

    @Override // com.anythink.core.common.m.a
    public final byte[] d() {
        return g().getBytes();
    }

    public final void a(b bVar) {
        String str = bVar.f11668a;
        if (str != null) {
            this.f11656f = k.a(str.getBytes());
        }
        this.f11663v = bVar.f11673f;
        if (!TextUtils.isEmpty(bVar.f11669b) && !TextUtils.equals("[]", bVar.f11669b)) {
            this.i = k.a(bVar.f11669b.getBytes());
        }
        if (!TextUtils.isEmpty(bVar.f11670c) && !TextUtils.equals("[]", bVar.f11670c)) {
            this.f11659j = k.a(bVar.f11670c.getBytes());
        }
        if (!TextUtils.isEmpty(bVar.f11671d) && !TextUtils.equals("[]", bVar.f11671d)) {
            this.f11664w = k.a(bVar.f11671d.getBytes());
        }
        if (!TextUtils.isEmpty(bVar.f11672e) && !TextUtils.equals("[]", bVar.f11672e)) {
            this.f11665x = k.a(bVar.f11672e.getBytes());
        }
        this.f11666y = "";
        if (!TextUtils.isEmpty(bVar.f11674g)) {
            this.f11666y = k.a(bVar.f11674g.getBytes());
        }
        if (!TextUtils.isEmpty(bVar.f11675h)) {
            this.f11660k = k.a(bVar.f11675h.getBytes());
        }
        if (!TextUtils.isEmpty(bVar.i) && !TextUtils.equals("{}", bVar.i)) {
            this.f11667z = k.a(bVar.i.getBytes());
        }
        if (!TextUtils.isEmpty(bVar.f11676j) && !TextUtils.equals("[]", bVar.f11676j)) {
            this.f11631A = k.a(bVar.f11676j.getBytes());
        }
        this.f11632B = bVar.f11677k;
        this.f11633C = bVar.f11678l;
        this.f11634D = bVar.f11679m;
        this.f11635E = bVar.f11680n;
        this.f11636F = bVar.f11681o;
        this.f11637G = bVar.f11682p;
        this.f11638H = bVar.f11683q;
        this.f11639I = bVar.f11684r;
        this.J = bVar.f11685s;
        this.aa = bVar.f11686t;
    }

    @Override // com.anythink.core.common.m.a
    public final void a(int i, Object obj) {
        super.a(i, obj);
    }

    @Override // com.anythink.core.common.m.a
    public final Object a(Object obj) {
        try {
            return new JSONObject(obj.toString());
        } catch (Exception unused) {
            return null;
        }
    }
}
