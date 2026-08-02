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
    private static final String f12413K = "a";

    /* renamed from: a, reason: collision with root package name */
    public static final int f12414a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f12415b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final String f12416c = "ex_pkg";

    /* renamed from: A, reason: collision with root package name */
    String f12417A;

    /* renamed from: B, reason: collision with root package name */
    JSONObject f12418B;

    /* renamed from: C, reason: collision with root package name */
    public long f12419C;

    /* renamed from: D, reason: collision with root package name */
    public long f12420D;

    /* renamed from: E, reason: collision with root package name */
    public long f12421E;

    /* renamed from: F, reason: collision with root package name */
    public long f12422F;

    /* renamed from: G, reason: collision with root package name */
    public long f12423G;

    /* renamed from: H, reason: collision with root package name */
    public long f12424H;

    /* renamed from: I, reason: collision with root package name */
    public int f12425I;
    public long J;

    /* renamed from: L, reason: collision with root package name */
    private int f12426L;

    /* renamed from: M, reason: collision with root package name */
    private final String f12427M = l.a.f18202j;

    /* renamed from: N, reason: collision with root package name */
    private final String f12428N = "request_id";

    /* renamed from: O, reason: collision with root package name */
    private final String f12429O = "ch_info";

    /* renamed from: P, reason: collision with root package name */
    private final String f12430P = e.bn;

    /* renamed from: Q, reason: collision with root package name */
    private final String f12431Q = "np";

    /* renamed from: R, reason: collision with root package name */
    private final String f12432R = "hb_size";

    /* renamed from: S, reason: collision with root package name */
    private final String f12433S = "last_wf";

    /* renamed from: T, reason: collision with root package name */
    private final String f12434T = "co";

    /* renamed from: U, reason: collision with root package name */
    private final String f12435U = l.a.f18187S;

    /* renamed from: V, reason: collision with root package name */
    private final String f12436V = "debug";

    /* renamed from: W, reason: collision with root package name */
    private final String f12437W = e.bg;

    /* renamed from: X, reason: collision with root package name */
    private final String f12438X = "last_win";
    private final String Y = "last_m_data";

    /* renamed from: Z, reason: collision with root package name */
    private int f12439Z;
    private ATAdRequest aa;

    /* renamed from: d, reason: collision with root package name */
    String f12440d;

    /* renamed from: e, reason: collision with root package name */
    String f12441e;

    /* renamed from: f, reason: collision with root package name */
    String f12442f;

    /* renamed from: g, reason: collision with root package name */
    String f12443g;

    /* renamed from: h, reason: collision with root package name */
    String f12444h;
    String i;

    /* renamed from: j, reason: collision with root package name */
    String f12445j;

    /* renamed from: k, reason: collision with root package name */
    String f12446k;

    /* renamed from: l, reason: collision with root package name */
    int f12447l;

    /* renamed from: u, reason: collision with root package name */
    int f12448u;

    /* renamed from: v, reason: collision with root package name */
    int f12449v;

    /* renamed from: w, reason: collision with root package name */
    String f12450w;

    /* renamed from: x, reason: collision with root package name */
    String f12451x;

    /* renamed from: y, reason: collision with root package name */
    String f12452y;

    /* renamed from: z, reason: collision with root package name */
    String f12453z;

    public a(String str, String str2, String str3, List<JSONObject> list, int i, l lVar) {
        this.f12439Z = 0;
        this.f12440d = str3;
        this.f12443g = str;
        this.f12444h = str2;
        this.f12426L = i;
        JSONArray jSONArray = new JSONArray();
        Iterator<JSONObject> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        this.f12441e = k.a(jSONArray.toString().getBytes());
        if (lVar != null) {
            this.f12447l = lVar.ai();
            this.f12448u = lVar.ay();
            this.f12439Z = lVar.aW();
        }
    }

    private void d(int i) {
        this.f12449v = i;
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
        if (this.f12426L == 0) {
            hashMap.put("Accept-Encoding", com.anythink.expressad.foundation.g.f.g.b.f20128d);
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
            e9.put(e.bk, this.f12444h);
            e9.put("session_id", t.b().g(this.f12444h));
            e9.put("t_g_id", this.f12447l);
            e9.put("gro_id", this.f12448u);
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
            if (this.f12426L == 0) {
                e9.put("misk_spt", o.a().c());
                o.a();
                e9.put("misk_pt_det", o.b());
            }
            JSONObject a10 = e.a(this.f12444h);
            if (a10 != null) {
                e9.put("customs", a10);
            }
            e.a(e9);
            n a11 = n.a(t.b().g());
            String str = this.f12444h;
            if (!TextUtils.isEmpty(str)) {
                try {
                    if (!TextUtils.isEmpty(str) && (b9 = a11.b(str)) != null && (aQ = b9.aQ()) != null) {
                        e9.put(l.a.aa, aQ);
                    }
                } catch (Exception unused) {
                }
            }
            if (this.f12439Z > 0 && (a9 = com.anythink.core.c.b.a().a(this.f12444h, this.f12439Z)) != null) {
                e9.put(e.ar, a9);
            }
            if (ATAdxSetting.getInstance().isAdxNetworkMode(this.f12444h)) {
                e9.put(e.be, 1);
                e9.put("adap_c", this.f12418B);
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
            long j6 = this.f12419C;
            if (j6 > 0) {
                e9.put("l_t_bstart", j6);
            }
            long j9 = this.f12420D;
            if (j9 > 0) {
                e9.put("l_t_breq", j9);
            }
            long j10 = this.f12421E;
            if (j10 > 0) {
                e9.put("h_s_t", j10);
            }
            long j11 = this.f12422F;
            if (j11 > 0) {
                e9.put("h_b_to", j11);
            }
            long j12 = this.f12423G;
            if (j12 > 0) {
                e9.put(l.a.f18171B, j12);
            }
            long j13 = this.f12424H;
            if (j13 > 0) {
                e9.put("sp_to", j13);
            }
            Pair<Integer, List<String>> I8 = t.b().I();
            if (I8 != null && (obj = I8.first) != null) {
                e9.put(e.bq, ((Integer) obj).intValue());
            }
            String f2 = b11.f();
            if (!TextUtils.isEmpty(f2)) {
                e9.put(e.br, f2);
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
        JSONObject f2 = super.f();
        try {
            f2.put("p_ls", this.f12425I);
            f2.put("p_lt_f_i", this.J);
        } catch (Throwable unused) {
        }
        return f2;
    }

    @Override // com.anythink.core.common.m.a
    public final String g() {
        String jSONObject = e().toString();
        String jSONObject2 = f().toString();
        HashMap hashMap = new HashMap();
        String a9 = k.a(jSONObject);
        String a10 = k.a(jSONObject2);
        hashMap.put("p", a9);
        hashMap.put(e.f15417W, a10);
        hashMap.put(l.a.f18202j, this.f12441e);
        hashMap.put("request_id", this.f12440d);
        int i = this.f12449v;
        if (i > 0) {
            hashMap.put("hb_size", Integer.valueOf(i));
        }
        if (this.f12426L == 0) {
            if (!TextUtils.isEmpty(this.f12442f)) {
                hashMap.put("ch_info", this.f12442f);
            }
            if (!TextUtils.isEmpty(this.i)) {
                hashMap.put(e.bn, this.i);
            }
            if (!TextUtils.isEmpty(this.f12445j)) {
                hashMap.put("np", this.f12445j);
            }
            if (!TextUtils.isEmpty(this.f12450w)) {
                hashMap.put("last_wf", this.f12450w);
            }
            if (!TextUtils.isEmpty(this.f12451x)) {
                hashMap.put("co", this.f12451x);
            }
            hashMap.put(l.a.f18187S, this.f12452y);
            if (t.b().l() != null) {
                hashMap.put(f12416c, k.a(t.b().l().toString()));
            }
            if (t.b().F() && t.b().y()) {
                hashMap.put("debug", 1);
            }
            if (!TextUtils.isEmpty(this.f12446k)) {
                hashMap.put(e.bg, this.f12446k);
            }
            if (!TextUtils.isEmpty(this.f12453z)) {
                hashMap.put("last_win", this.f12453z);
            }
            if (!TextUtils.isEmpty(this.f12417A)) {
                hashMap.put("last_m_data", this.f12417A);
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
        arrayList.add(j.aa.f13177a);
        return arrayList;
    }

    @Override // com.anythink.core.common.m.a
    public final void a(AdError adError) {
    }

    @Override // com.anythink.core.common.m.a
    public final String b() {
        return this.f12443g;
    }

    @Override // com.anythink.core.common.m.a
    public final byte[] d() {
        return g().getBytes();
    }

    public final void a(b bVar) {
        String str = bVar.f12454a;
        if (str != null) {
            this.f12442f = k.a(str.getBytes());
        }
        this.f12449v = bVar.f12459f;
        if (!TextUtils.isEmpty(bVar.f12455b) && !TextUtils.equals("[]", bVar.f12455b)) {
            this.i = k.a(bVar.f12455b.getBytes());
        }
        if (!TextUtils.isEmpty(bVar.f12456c) && !TextUtils.equals("[]", bVar.f12456c)) {
            this.f12445j = k.a(bVar.f12456c.getBytes());
        }
        if (!TextUtils.isEmpty(bVar.f12457d) && !TextUtils.equals("[]", bVar.f12457d)) {
            this.f12450w = k.a(bVar.f12457d.getBytes());
        }
        if (!TextUtils.isEmpty(bVar.f12458e) && !TextUtils.equals("[]", bVar.f12458e)) {
            this.f12451x = k.a(bVar.f12458e.getBytes());
        }
        this.f12452y = "";
        if (!TextUtils.isEmpty(bVar.f12460g)) {
            this.f12452y = k.a(bVar.f12460g.getBytes());
        }
        if (!TextUtils.isEmpty(bVar.f12461h)) {
            this.f12446k = k.a(bVar.f12461h.getBytes());
        }
        if (!TextUtils.isEmpty(bVar.i) && !TextUtils.equals("{}", bVar.i)) {
            this.f12453z = k.a(bVar.i.getBytes());
        }
        if (!TextUtils.isEmpty(bVar.f12462j) && !TextUtils.equals("[]", bVar.f12462j)) {
            this.f12417A = k.a(bVar.f12462j.getBytes());
        }
        this.f12418B = bVar.f12463k;
        this.f12419C = bVar.f12464l;
        this.f12420D = bVar.f12465m;
        this.f12421E = bVar.f12466n;
        this.f12422F = bVar.f12467o;
        this.f12423G = bVar.f12468p;
        this.f12424H = bVar.f12469q;
        this.f12425I = bVar.f12470r;
        this.J = bVar.f12471s;
        this.aa = bVar.f12472t;
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
