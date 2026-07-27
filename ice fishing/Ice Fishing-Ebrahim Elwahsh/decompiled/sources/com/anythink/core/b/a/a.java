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
    private static final String f11784K = "a";

    /* renamed from: a, reason: collision with root package name */
    public static final int f11785a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f11786b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final String f11787c = "ex_pkg";

    /* renamed from: A, reason: collision with root package name */
    String f11788A;

    /* renamed from: B, reason: collision with root package name */
    JSONObject f11789B;

    /* renamed from: C, reason: collision with root package name */
    public long f11790C;

    /* renamed from: D, reason: collision with root package name */
    public long f11791D;

    /* renamed from: E, reason: collision with root package name */
    public long f11792E;

    /* renamed from: F, reason: collision with root package name */
    public long f11793F;

    /* renamed from: G, reason: collision with root package name */
    public long f11794G;

    /* renamed from: H, reason: collision with root package name */
    public long f11795H;

    /* renamed from: I, reason: collision with root package name */
    public int f11796I;
    public long J;

    /* renamed from: L, reason: collision with root package name */
    private int f11797L;

    /* renamed from: M, reason: collision with root package name */
    private final String f11798M = l.a.f17573j;

    /* renamed from: N, reason: collision with root package name */
    private final String f11799N = "request_id";

    /* renamed from: O, reason: collision with root package name */
    private final String f11800O = "ch_info";

    /* renamed from: P, reason: collision with root package name */
    private final String f11801P = e.bn;

    /* renamed from: Q, reason: collision with root package name */
    private final String f11802Q = "np";

    /* renamed from: R, reason: collision with root package name */
    private final String f11803R = "hb_size";

    /* renamed from: S, reason: collision with root package name */
    private final String f11804S = "last_wf";

    /* renamed from: T, reason: collision with root package name */
    private final String f11805T = "co";

    /* renamed from: U, reason: collision with root package name */
    private final String f11806U = l.a.f17558S;

    /* renamed from: V, reason: collision with root package name */
    private final String f11807V = "debug";

    /* renamed from: W, reason: collision with root package name */
    private final String f11808W = e.bg;

    /* renamed from: X, reason: collision with root package name */
    private final String f11809X = "last_win";
    private final String Y = "last_m_data";

    /* renamed from: Z, reason: collision with root package name */
    private int f11810Z;
    private ATAdRequest aa;

    /* renamed from: d, reason: collision with root package name */
    String f11811d;

    /* renamed from: e, reason: collision with root package name */
    String f11812e;

    /* renamed from: f, reason: collision with root package name */
    String f11813f;

    /* renamed from: g, reason: collision with root package name */
    String f11814g;

    /* renamed from: h, reason: collision with root package name */
    String f11815h;
    String i;

    /* renamed from: j, reason: collision with root package name */
    String f11816j;

    /* renamed from: k, reason: collision with root package name */
    String f11817k;

    /* renamed from: l, reason: collision with root package name */
    int f11818l;

    /* renamed from: u, reason: collision with root package name */
    int f11819u;

    /* renamed from: v, reason: collision with root package name */
    int f11820v;

    /* renamed from: w, reason: collision with root package name */
    String f11821w;

    /* renamed from: x, reason: collision with root package name */
    String f11822x;

    /* renamed from: y, reason: collision with root package name */
    String f11823y;

    /* renamed from: z, reason: collision with root package name */
    String f11824z;

    public a(String str, String str2, String str3, List<JSONObject> list, int i, l lVar) {
        this.f11810Z = 0;
        this.f11811d = str3;
        this.f11814g = str;
        this.f11815h = str2;
        this.f11797L = i;
        JSONArray jSONArray = new JSONArray();
        Iterator<JSONObject> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        this.f11812e = k.a(jSONArray.toString().getBytes());
        if (lVar != null) {
            this.f11818l = lVar.ai();
            this.f11819u = lVar.ay();
            this.f11810Z = lVar.aW();
        }
    }

    private void d(int i) {
        this.f11820v = i;
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
        if (this.f11797L == 0) {
            hashMap.put("Accept-Encoding", com.anythink.expressad.foundation.g.f.g.b.f19499d);
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
        JSONObject e6 = super.e();
        try {
            e6.put("app_id", t.b().p());
            e6.put(e.bk, this.f11815h);
            e6.put("session_id", t.b().g(this.f11815h));
            e6.put("t_g_id", this.f11818l);
            e6.put("gro_id", this.f11819u);
            String C7 = t.b().C();
            if (!TextUtils.isEmpty(C7)) {
                e6.put("sy_id", C7);
            }
            String D8 = t.b().D();
            if (TextUtils.isEmpty(D8)) {
                t.b().k(t.b().B());
                e6.put("bk_id", t.b().B());
            } else {
                e6.put("bk_id", D8);
            }
            e6.put("deny", m.q(t.b().g()));
            if (this.f11797L == 0) {
                e6.put("misk_spt", o.a().c());
                o.a();
                e6.put("misk_pt_det", o.b());
            }
            JSONObject a10 = e.a(this.f11815h);
            if (a10 != null) {
                e6.put("customs", a10);
            }
            e.a(e6);
            n a11 = n.a(t.b().g());
            String str = this.f11815h;
            if (!TextUtils.isEmpty(str)) {
                try {
                    if (!TextUtils.isEmpty(str) && (b9 = a11.b(str)) != null && (aQ = b9.aQ()) != null) {
                        e6.put(l.a.aa, aQ);
                    }
                } catch (Exception unused) {
                }
            }
            if (this.f11810Z > 0 && (a9 = com.anythink.core.c.b.a().a(this.f11815h, this.f11810Z)) != null) {
                e6.put(e.ar, a9);
            }
            if (ATAdxSetting.getInstance().isAdxNetworkMode(this.f11815h)) {
                e6.put(e.be, 1);
                e6.put("adap_c", this.f11789B);
            }
            boolean b10 = p.b();
            com.anythink.core.d.b b11 = d.a(t.b().g()).b(t.b().p());
            e6.put("coppa", (b11.C() == 2 && b10) ? 1 : 2);
            e6.put("ccpa", b11.B() == 3 ? 1 : 2);
            e6.put("bid_ver", 1);
            s c4 = t.b().c();
            if (c4 != null) {
                c4.fillRequestDataForDl(e6);
            }
            long j9 = this.f11790C;
            if (j9 > 0) {
                e6.put("l_t_bstart", j9);
            }
            long j10 = this.f11791D;
            if (j10 > 0) {
                e6.put("l_t_breq", j10);
            }
            long j11 = this.f11792E;
            if (j11 > 0) {
                e6.put("h_s_t", j11);
            }
            long j12 = this.f11793F;
            if (j12 > 0) {
                e6.put("h_b_to", j12);
            }
            long j13 = this.f11794G;
            if (j13 > 0) {
                e6.put(l.a.f17542B, j13);
            }
            long j14 = this.f11795H;
            if (j14 > 0) {
                e6.put("sp_to", j14);
            }
            Pair<Integer, List<String>> I2 = t.b().I();
            if (I2 != null && (obj = I2.first) != null) {
                e6.put(e.bq, ((Integer) obj).intValue());
            }
            String f6 = b11.f();
            if (!TextUtils.isEmpty(f6)) {
                e6.put(e.br, f6);
            }
            ATAdRequest aTAdRequest = this.aa;
            if (aTAdRequest != null) {
                e6.put(e.bp, aTAdRequest.getChannelSource());
            } else {
                e6.put(e.bp, t.b().E());
            }
        } catch (Exception unused2) {
        }
        return e6;
    }

    @Override // com.anythink.core.common.m.a
    public final JSONObject f() {
        JSONObject f6 = super.f();
        try {
            f6.put("p_ls", this.f11796I);
            f6.put("p_lt_f_i", this.J);
        } catch (Throwable unused) {
        }
        return f6;
    }

    @Override // com.anythink.core.common.m.a
    public final String g() {
        String jSONObject = e().toString();
        String jSONObject2 = f().toString();
        HashMap hashMap = new HashMap();
        String a9 = k.a(jSONObject);
        String a10 = k.a(jSONObject2);
        hashMap.put("p", a9);
        hashMap.put(e.f14788W, a10);
        hashMap.put(l.a.f17573j, this.f11812e);
        hashMap.put("request_id", this.f11811d);
        int i = this.f11820v;
        if (i > 0) {
            hashMap.put("hb_size", Integer.valueOf(i));
        }
        if (this.f11797L == 0) {
            if (!TextUtils.isEmpty(this.f11813f)) {
                hashMap.put("ch_info", this.f11813f);
            }
            if (!TextUtils.isEmpty(this.i)) {
                hashMap.put(e.bn, this.i);
            }
            if (!TextUtils.isEmpty(this.f11816j)) {
                hashMap.put("np", this.f11816j);
            }
            if (!TextUtils.isEmpty(this.f11821w)) {
                hashMap.put("last_wf", this.f11821w);
            }
            if (!TextUtils.isEmpty(this.f11822x)) {
                hashMap.put("co", this.f11822x);
            }
            hashMap.put(l.a.f17558S, this.f11823y);
            if (t.b().l() != null) {
                hashMap.put(f11787c, k.a(t.b().l().toString()));
            }
            if (t.b().F() && t.b().y()) {
                hashMap.put("debug", 1);
            }
            if (!TextUtils.isEmpty(this.f11817k)) {
                hashMap.put(e.bg, this.f11817k);
            }
            if (!TextUtils.isEmpty(this.f11824z)) {
                hashMap.put("last_win", this.f11824z);
            }
            if (!TextUtils.isEmpty(this.f11788A)) {
                hashMap.put("last_m_data", this.f11788A);
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
        arrayList.add(j.aa.f12548a);
        return arrayList;
    }

    @Override // com.anythink.core.common.m.a
    public final void a(AdError adError) {
    }

    @Override // com.anythink.core.common.m.a
    public final String b() {
        return this.f11814g;
    }

    @Override // com.anythink.core.common.m.a
    public final byte[] d() {
        return g().getBytes();
    }

    public final void a(b bVar) {
        String str = bVar.f11825a;
        if (str != null) {
            this.f11813f = k.a(str.getBytes());
        }
        this.f11820v = bVar.f11830f;
        if (!TextUtils.isEmpty(bVar.f11826b) && !TextUtils.equals("[]", bVar.f11826b)) {
            this.i = k.a(bVar.f11826b.getBytes());
        }
        if (!TextUtils.isEmpty(bVar.f11827c) && !TextUtils.equals("[]", bVar.f11827c)) {
            this.f11816j = k.a(bVar.f11827c.getBytes());
        }
        if (!TextUtils.isEmpty(bVar.f11828d) && !TextUtils.equals("[]", bVar.f11828d)) {
            this.f11821w = k.a(bVar.f11828d.getBytes());
        }
        if (!TextUtils.isEmpty(bVar.f11829e) && !TextUtils.equals("[]", bVar.f11829e)) {
            this.f11822x = k.a(bVar.f11829e.getBytes());
        }
        this.f11823y = "";
        if (!TextUtils.isEmpty(bVar.f11831g)) {
            this.f11823y = k.a(bVar.f11831g.getBytes());
        }
        if (!TextUtils.isEmpty(bVar.f11832h)) {
            this.f11817k = k.a(bVar.f11832h.getBytes());
        }
        if (!TextUtils.isEmpty(bVar.i) && !TextUtils.equals("{}", bVar.i)) {
            this.f11824z = k.a(bVar.i.getBytes());
        }
        if (!TextUtils.isEmpty(bVar.f11833j) && !TextUtils.equals("[]", bVar.f11833j)) {
            this.f11788A = k.a(bVar.f11833j.getBytes());
        }
        this.f11789B = bVar.f11834k;
        this.f11790C = bVar.f11835l;
        this.f11791D = bVar.f11836m;
        this.f11792E = bVar.f11837n;
        this.f11793F = bVar.f11838o;
        this.f11794G = bVar.f11839p;
        this.f11795H = bVar.f11840q;
        this.f11796I = bVar.f11841r;
        this.J = bVar.f11842s;
        this.aa = bVar.f11843t;
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
