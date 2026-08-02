package com.anythink.core.common.h;

import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.basead.adx.api.IATAdxHandler;
import com.anythink.core.c.b.e;
import com.anythink.core.common.e.o;
import com.anythink.core.d.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ad extends z implements Comparable<ad> {

    /* renamed from: A, reason: collision with root package name */
    public static final String f14180A = "PA";

    /* renamed from: B, reason: collision with root package name */
    public static final int f14181B = 0;

    /* renamed from: C, reason: collision with root package name */
    public static final int f14182C = 1;

    /* renamed from: D, reason: collision with root package name */
    public static final int f14183D = 2;

    /* renamed from: E, reason: collision with root package name */
    public static final int f14184E = 3;

    /* renamed from: x, reason: collision with root package name */
    public static final String f14185x = "";

    /* renamed from: y, reason: collision with root package name */
    public static final String f14186y = "PDB";

    /* renamed from: z, reason: collision with root package name */
    public static final String f14187z = "PD";

    /* renamed from: F, reason: collision with root package name */
    private final String f14188F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f14189G;

    /* renamed from: H, reason: collision with root package name */
    private bv f14190H;

    /* renamed from: I, reason: collision with root package name */
    private String f14191I;
    private a J;

    /* renamed from: K, reason: collision with root package name */
    private IATAdxHandler f14192K;

    /* renamed from: L, reason: collision with root package name */
    private double f14193L;

    /* renamed from: M, reason: collision with root package name */
    private String f14194M;

    /* renamed from: N, reason: collision with root package name */
    private int f14195N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f14196O;

    /* renamed from: P, reason: collision with root package name */
    private String f14197P;

    /* renamed from: Q, reason: collision with root package name */
    private int f14198Q;

    /* renamed from: R, reason: collision with root package name */
    private String f14199R;

    /* renamed from: S, reason: collision with root package name */
    private String f14200S;

    /* renamed from: T, reason: collision with root package name */
    private int f14201T;

    /* renamed from: U, reason: collision with root package name */
    private String f14202U;

    /* renamed from: V, reason: collision with root package name */
    private int f14203V;

    /* renamed from: W, reason: collision with root package name */
    private String f14204W;

    /* renamed from: a, reason: collision with root package name */
    public int f14205a;

    /* renamed from: b, reason: collision with root package name */
    public String f14206b;

    /* renamed from: c, reason: collision with root package name */
    public String f14207c;

    /* renamed from: d, reason: collision with root package name */
    public int f14208d;

    /* renamed from: e, reason: collision with root package name */
    public long f14209e;

    /* renamed from: f, reason: collision with root package name */
    public long f14210f;

    /* renamed from: g, reason: collision with root package name */
    public String f14211g;

    /* renamed from: h, reason: collision with root package name */
    public String f14212h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f14213j;

    /* renamed from: k, reason: collision with root package name */
    public String f14214k;

    /* renamed from: l, reason: collision with root package name */
    public double f14215l;

    /* renamed from: m, reason: collision with root package name */
    public String f14216m;

    /* renamed from: n, reason: collision with root package name */
    public int f14217n;

    /* renamed from: o, reason: collision with root package name */
    public double f14218o;

    /* renamed from: p, reason: collision with root package name */
    public double f14219p;

    /* renamed from: q, reason: collision with root package name */
    public String f14220q;

    /* renamed from: r, reason: collision with root package name */
    public double f14221r;

    /* renamed from: s, reason: collision with root package name */
    public com.anythink.core.b.c.b f14222s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f14223t;

    /* renamed from: u, reason: collision with root package name */
    public List<ac> f14224u;

    /* renamed from: v, reason: collision with root package name */
    public cd f14225v;

    /* renamed from: w, reason: collision with root package name */
    public JSONObject f14226w;

    public interface a {
        void a(Map<String, Object> map);

        void b(Map<String, Object> map);
    }

    public ad(boolean z6, double d9, String str, String str2, String str3, String str4, String str5) {
        super(z6, d9, str, str2, str3, str4, str5, ATAdConst.CURRENCY.USD);
        this.f14188F = "ad:";
        this.f14193L = 0.0d;
        this.f14198Q = -1;
        this.f14200S = "";
        this.f14201T = 0;
    }

    private cd y() {
        return this.f14225v;
    }

    private List<ac> z() {
        return this.f14224u;
    }

    public final boolean a() {
        return this.f14210f < System.currentTimeMillis();
    }

    public final String b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(o.a.f13853c, this.token);
            jSONObject.put("cur", this.f14206b);
            jSONObject.put("origin_price", this.originPrice);
            jSONObject.put(e.a.f12854h, this.price);
            jSONObject.put("nurl", this.winNoticeUrl);
            jSONObject.put("lurl", this.loseNoticeUrl);
            jSONObject.put("unit_id", this.f14207c);
            jSONObject.put("nw_firm_id", this.f14208d);
            jSONObject.put("is_success", this.isSuccess ? 1 : 0);
            jSONObject.put("err_code", this.f14205a);
            jSONObject.put("err_msg", this.errorMsg);
            jSONObject.put("expire", this.f14209e);
            jSONObject.put("out_data_time", this.f14210f);
            jSONObject.put("is_send_winurl", this.f14189G);
            jSONObject.put("tp_bid_id", this.f14211g);
            jSONObject.put("burl", this.displayNoticeUrl);
            jSONObject.put("ad_source_id", this.f14214k);
            jSONObject.put("cur_rate", this.f14215l);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(com.anythink.core.common.k.ai, this.f14217n);
            jSONObject.put("ctrl", jSONObject2);
            if (!TextUtils.isEmpty(this.f14216m)) {
                jSONObject.put("bid_response", this.f14216m);
            }
            jSONObject.put("ecpm_api", this.f14218o);
            jSONObject.put("cny_ecpm_api", this.f14219p);
            jSONObject.put(com.anythink.core.common.k.f15082T, this.f14220q);
            jSONObject.put("second_price", this.f14221r);
            jSONObject.put("req_url", this.f14212h);
            jSONObject.put("bd_type", this.useType);
            jSONObject.put(com.anythink.core.common.k.ap, this.sortPrice);
            jSONObject.put("cny_price", this.rmbPrice);
            jSONObject.put("request_id", this.f14191I);
            jSONObject.put("a_r", this.f14193L);
            Object obj = this.f14226w;
            if (obj != null) {
                jSONObject.put("adx_ctrl", obj);
            }
            if (!TextUtils.isEmpty(this.f14194M)) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(com.anythink.core.common.k.aS, this.f14194M);
                jSONObject3.put("id", this.f14195N);
                if (!TextUtils.isEmpty(this.f14197P)) {
                    jSONObject3.put("cny_e_c", this.f14197P);
                }
                jSONObject.put(l.a.aB, jSONObject3);
            }
            jSONObject.put("adx_mtg_mix_type", this.f14198Q);
            jSONObject.put("deal_type", this.f14200S);
            jSONObject.put("deal_id", this.f14202U);
            jSONObject.put("deal_pri", this.f14203V);
            jSONObject.put("origin_request_id", getOriginRequestId());
            jSONObject.put("x_c", this.f14204W);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    public final String c() {
        return this.f14191I;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ad adVar) {
        return com.anythink.core.common.v.l.a(this, adVar);
    }

    public final synchronized boolean d() {
        if (this.f14189G) {
            return true;
        }
        this.f14189G = true;
        return false;
    }

    public final synchronized void e() {
        this.biddingNotice = null;
    }

    public final synchronized bv f() {
        bv bvVar;
        List<ac> list = this.f14224u;
        bvVar = null;
        if (list != null) {
            Iterator<ac> it = list.iterator();
            while (it.hasNext()) {
                bv a9 = it.next().a();
                if (a9 != null && com.anythink.core.common.v.l.a(a9, bvVar) < 0) {
                    bvVar = a9;
                }
            }
        }
        return bvVar;
    }

    public final synchronized bv g() {
        bv bvVar;
        List<ac> list = this.f14224u;
        bvVar = null;
        if (list != null) {
            Iterator<ac> it = list.iterator();
            while (it.hasNext()) {
                bv b9 = it.next().b();
                if (b9 != null && com.anythink.core.common.v.l.a(b9, bvVar) < 0) {
                    bvVar = b9;
                }
            }
        }
        return bvVar;
    }

    public final synchronized void h() {
        List<ac> list = this.f14224u;
        if (list != null) {
            list.clear();
        }
    }

    public final IATAdxHandler i() {
        return this.f14192K;
    }

    public final double j() {
        return this.f14193L;
    }

    public final a k() {
        return this.J;
    }

    public final bv l() {
        return this.f14190H;
    }

    public final String m() {
        return this.f14194M;
    }

    public final String n() {
        return this.f14197P;
    }

    public final int o() {
        return this.f14195N;
    }

    public final boolean p() {
        return this.f14196O;
    }

    public final void q() {
        this.f14196O = true;
    }

    public final String r() {
        return this.f14199R;
    }

    public final boolean s() {
        return this.f14201T != 0;
    }

    public final int t() {
        return this.f14201T;
    }

    public final String u() {
        return this.f14200S;
    }

    public final String v() {
        return this.f14202U;
    }

    public final int w() {
        return this.f14203V;
    }

    public final String x() {
        return this.f14204W;
    }

    public static ad a(String str) {
        try {
            return a(new JSONObject(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void c(String str) {
        this.f14199R = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x01b8, code lost:
    
        if (r3 == 1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01ba, code lost:
    
        if (r3 == 2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01bc, code lost:
    
        r6.f14201T = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01c0, code lost:
    
        r6.f14201T = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01c3, code lost:
    
        r6.f14201T = 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ad a(JSONObject jSONObject) {
        try {
            ad adVar = new ad(jSONObject.optInt("is_success") == 1, jSONObject.has(e.a.f12854h) ? jSONObject.optDouble(e.a.f12854h, 0.0d) : 0.0d, jSONObject.optString(o.a.f13853c), jSONObject.optString("nurl"), jSONObject.optString("lurl"), jSONObject.optString("burl"), jSONObject.optString("err_msg"));
            adVar.f14206b = jSONObject.optString("cur");
            adVar.f14207c = jSONObject.optString("unit_id");
            adVar.f14208d = jSONObject.optInt("nw_firm_id");
            adVar.f14205a = jSONObject.optInt("err_code");
            adVar.f14209e = jSONObject.optLong("expire");
            adVar.f14210f = jSONObject.optLong("out_data_time");
            adVar.f14189G = jSONObject.optBoolean("is_send_winurl");
            adVar.i = jSONObject.optString("offer_data");
            adVar.f14211g = jSONObject.optString("tp_bid_id");
            adVar.f14213j = jSONObject.optString("burl_win");
            adVar.f14214k = jSONObject.optString("ad_source_id");
            adVar.f14215l = jSONObject.optDouble("cur_rate", 0.0d);
            adVar.f14216m = jSONObject.optString("bid_response");
            JSONObject optJSONObject = jSONObject.optJSONObject("ctrl");
            if (optJSONObject != null) {
                adVar.f14217n = optJSONObject.optInt(com.anythink.core.common.k.ai);
            }
            adVar.f14218o = jSONObject.optDouble("ecpm_api", 0.0d);
            adVar.f14219p = jSONObject.optDouble("cny_ecpm_api", 0.0d);
            adVar.f14220q = jSONObject.optString(com.anythink.core.common.k.f15082T);
            adVar.f14221r = jSONObject.optDouble("second_price", 0.0d);
            adVar.f14212h = jSONObject.optString("req_url", "");
            adVar.useType = jSONObject.optInt("bd_type", 1);
            double optDouble = jSONObject.optDouble(com.anythink.core.common.k.ap, adVar.price);
            adVar.sortPrice = optDouble;
            adVar.originPrice = jSONObject.optDouble("origin_price", optDouble);
            adVar.rmbPrice = jSONObject.optDouble("cny_price", 0.0d);
            int i = adVar.f14208d;
            if (i == 1) {
                double d9 = adVar.f14218o;
                if (d9 > 0.0d) {
                    adVar.price = d9;
                    adVar.sortPrice = d9;
                }
                double d10 = adVar.f14219p;
                if (d10 > 0.0d) {
                    adVar.rmbPrice = d10;
                }
            }
            if (i == 66) {
                adVar.f14193L = jSONObject.optDouble("a_r", 0.0d);
            }
            Object opt = jSONObject.opt("request_id");
            if (opt != null) {
                adVar.f14191I = opt.toString();
            }
            adVar.f14226w = jSONObject.optJSONObject("adx_ctrl");
            JSONObject optJSONObject2 = jSONObject.optJSONObject(l.a.aB);
            if (optJSONObject2 != null && optJSONObject2.length() > 0) {
                adVar.f14194M = optJSONObject2.optString(com.anythink.core.common.k.aS);
                adVar.f14197P = optJSONObject2.optString("cny_e_c");
                adVar.f14195N = optJSONObject2.optInt("id");
            }
            char c9 = 65535;
            adVar.f14198Q = jSONObject.optInt("adx_mtg_mix_type", -1);
            String optString = jSONObject.optString("deal_type", "");
            adVar.f14200S = optString;
            int hashCode = optString.hashCode();
            if (hashCode != 0) {
                if (hashCode != 2545) {
                    if (hashCode != 2548) {
                        if (hashCode == 79054 && optString.equals(f14186y)) {
                            c9 = 0;
                        }
                    } else if (optString.equals(f14187z)) {
                        c9 = 1;
                    }
                } else if (optString.equals(f14180A)) {
                    c9 = 2;
                }
            } else if (optString.equals("")) {
                c9 = 3;
            }
            adVar.f14201T = 3;
            adVar.f14202U = jSONObject.optString("deal_id", "");
            adVar.f14203V = jSONObject.optInt("deal_pri", 0);
            adVar.setOriginRequestId(jSONObject.optString("origin_request_id", ""));
            adVar.f14204W = jSONObject.optString("x_c", "");
            return adVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    private void e(String str) {
        this.f14197P = str;
    }

    private void d(String str) {
        this.f14194M = str;
    }

    public ad(boolean z6, double d9, double d10, String str, String str2, String str3, String str4, String str5) {
        super(z6, d10, str, str2, str3, str4, str5, ATAdConst.CURRENCY.USD);
        this.f14188F = "ad:";
        this.f14193L = 0.0d;
        this.f14198Q = -1;
        this.f14200S = "";
        this.f14201T = 0;
        this.sortPrice = d9;
    }

    public final void b(String str) {
        this.f14191I = str;
    }

    private void b(int i) {
        this.f14195N = i;
    }

    private int a(ad adVar) {
        return com.anythink.core.common.v.l.a(this, adVar);
    }

    public final synchronized void a(ac acVar) {
        if (acVar == null) {
            return;
        }
        try {
            if (this.f14224u == null) {
                this.f14224u = Collections.synchronizedList(new ArrayList(4));
            }
            if (!this.f14224u.contains(acVar)) {
                this.f14224u.add(acVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void a(cd cdVar) {
        this.f14225v = cdVar;
    }

    public final void a(IATAdxHandler iATAdxHandler) {
        this.f14192K = iATAdxHandler;
    }

    public final void a(a aVar) {
        this.J = aVar;
    }

    public final void a(bv bvVar, double d9) {
        this.f14190H = bvVar;
        this.f14221r = d9;
    }

    public final int a(int i) {
        int i4 = this.f14198Q;
        if (i4 < 0 || i != 4) {
            return -1;
        }
        return i4 == 5 ? 3 : 4;
    }
}
