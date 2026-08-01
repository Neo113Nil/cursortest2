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
    public static final String f13394A = "PA";

    /* renamed from: B, reason: collision with root package name */
    public static final int f13395B = 0;

    /* renamed from: C, reason: collision with root package name */
    public static final int f13396C = 1;

    /* renamed from: D, reason: collision with root package name */
    public static final int f13397D = 2;

    /* renamed from: E, reason: collision with root package name */
    public static final int f13398E = 3;

    /* renamed from: x, reason: collision with root package name */
    public static final String f13399x = "";

    /* renamed from: y, reason: collision with root package name */
    public static final String f13400y = "PDB";

    /* renamed from: z, reason: collision with root package name */
    public static final String f13401z = "PD";

    /* renamed from: F, reason: collision with root package name */
    private final String f13402F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f13403G;

    /* renamed from: H, reason: collision with root package name */
    private bv f13404H;

    /* renamed from: I, reason: collision with root package name */
    private String f13405I;
    private a J;

    /* renamed from: K, reason: collision with root package name */
    private IATAdxHandler f13406K;

    /* renamed from: L, reason: collision with root package name */
    private double f13407L;

    /* renamed from: M, reason: collision with root package name */
    private String f13408M;

    /* renamed from: N, reason: collision with root package name */
    private int f13409N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f13410O;

    /* renamed from: P, reason: collision with root package name */
    private String f13411P;

    /* renamed from: Q, reason: collision with root package name */
    private int f13412Q;

    /* renamed from: R, reason: collision with root package name */
    private String f13413R;

    /* renamed from: S, reason: collision with root package name */
    private String f13414S;

    /* renamed from: T, reason: collision with root package name */
    private int f13415T;

    /* renamed from: U, reason: collision with root package name */
    private String f13416U;

    /* renamed from: V, reason: collision with root package name */
    private int f13417V;

    /* renamed from: W, reason: collision with root package name */
    private String f13418W;

    /* renamed from: a, reason: collision with root package name */
    public int f13419a;

    /* renamed from: b, reason: collision with root package name */
    public String f13420b;

    /* renamed from: c, reason: collision with root package name */
    public String f13421c;

    /* renamed from: d, reason: collision with root package name */
    public int f13422d;

    /* renamed from: e, reason: collision with root package name */
    public long f13423e;

    /* renamed from: f, reason: collision with root package name */
    public long f13424f;

    /* renamed from: g, reason: collision with root package name */
    public String f13425g;

    /* renamed from: h, reason: collision with root package name */
    public String f13426h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f13427j;

    /* renamed from: k, reason: collision with root package name */
    public String f13428k;

    /* renamed from: l, reason: collision with root package name */
    public double f13429l;

    /* renamed from: m, reason: collision with root package name */
    public String f13430m;

    /* renamed from: n, reason: collision with root package name */
    public int f13431n;

    /* renamed from: o, reason: collision with root package name */
    public double f13432o;

    /* renamed from: p, reason: collision with root package name */
    public double f13433p;

    /* renamed from: q, reason: collision with root package name */
    public String f13434q;

    /* renamed from: r, reason: collision with root package name */
    public double f13435r;

    /* renamed from: s, reason: collision with root package name */
    public com.anythink.core.b.c.b f13436s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f13437t;

    /* renamed from: u, reason: collision with root package name */
    public List<ac> f13438u;

    /* renamed from: v, reason: collision with root package name */
    public cd f13439v;

    /* renamed from: w, reason: collision with root package name */
    public JSONObject f13440w;

    public interface a {
        void a(Map<String, Object> map);

        void b(Map<String, Object> map);
    }

    public ad(boolean z3, double d2, String str, String str2, String str3, String str4, String str5) {
        super(z3, d2, str, str2, str3, str4, str5, ATAdConst.CURRENCY.USD);
        this.f13402F = "ad:";
        this.f13407L = 0.0d;
        this.f13412Q = -1;
        this.f13414S = "";
        this.f13415T = 0;
    }

    private cd y() {
        return this.f13439v;
    }

    private List<ac> z() {
        return this.f13438u;
    }

    public final boolean a() {
        return this.f13424f < System.currentTimeMillis();
    }

    public final String b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(o.a.f13067c, this.token);
            jSONObject.put("cur", this.f13420b);
            jSONObject.put("origin_price", this.originPrice);
            jSONObject.put(e.a.f12068h, this.price);
            jSONObject.put("nurl", this.winNoticeUrl);
            jSONObject.put("lurl", this.loseNoticeUrl);
            jSONObject.put("unit_id", this.f13421c);
            jSONObject.put("nw_firm_id", this.f13422d);
            jSONObject.put("is_success", this.isSuccess ? 1 : 0);
            jSONObject.put("err_code", this.f13419a);
            jSONObject.put("err_msg", this.errorMsg);
            jSONObject.put("expire", this.f13423e);
            jSONObject.put("out_data_time", this.f13424f);
            jSONObject.put("is_send_winurl", this.f13403G);
            jSONObject.put("tp_bid_id", this.f13425g);
            jSONObject.put("burl", this.displayNoticeUrl);
            jSONObject.put("ad_source_id", this.f13428k);
            jSONObject.put("cur_rate", this.f13429l);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(com.anythink.core.common.k.ai, this.f13431n);
            jSONObject.put("ctrl", jSONObject2);
            if (!TextUtils.isEmpty(this.f13430m)) {
                jSONObject.put("bid_response", this.f13430m);
            }
            jSONObject.put("ecpm_api", this.f13432o);
            jSONObject.put("cny_ecpm_api", this.f13433p);
            jSONObject.put(com.anythink.core.common.k.f14296T, this.f13434q);
            jSONObject.put("second_price", this.f13435r);
            jSONObject.put("req_url", this.f13426h);
            jSONObject.put("bd_type", this.useType);
            jSONObject.put(com.anythink.core.common.k.ap, this.sortPrice);
            jSONObject.put("cny_price", this.rmbPrice);
            jSONObject.put("request_id", this.f13405I);
            jSONObject.put("a_r", this.f13407L);
            Object obj = this.f13440w;
            if (obj != null) {
                jSONObject.put("adx_ctrl", obj);
            }
            if (!TextUtils.isEmpty(this.f13408M)) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(com.anythink.core.common.k.aS, this.f13408M);
                jSONObject3.put("id", this.f13409N);
                if (!TextUtils.isEmpty(this.f13411P)) {
                    jSONObject3.put("cny_e_c", this.f13411P);
                }
                jSONObject.put(l.a.aB, jSONObject3);
            }
            jSONObject.put("adx_mtg_mix_type", this.f13412Q);
            jSONObject.put("deal_type", this.f13414S);
            jSONObject.put("deal_id", this.f13416U);
            jSONObject.put("deal_pri", this.f13417V);
            jSONObject.put("origin_request_id", getOriginRequestId());
            jSONObject.put("x_c", this.f13418W);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    public final String c() {
        return this.f13405I;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ad adVar) {
        return com.anythink.core.common.v.l.a(this, adVar);
    }

    public final synchronized boolean d() {
        if (this.f13403G) {
            return true;
        }
        this.f13403G = true;
        return false;
    }

    public final synchronized void e() {
        this.biddingNotice = null;
    }

    public final synchronized bv f() {
        bv bvVar;
        List<ac> list = this.f13438u;
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
        List<ac> list = this.f13438u;
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
        List<ac> list = this.f13438u;
        if (list != null) {
            list.clear();
        }
    }

    public final IATAdxHandler i() {
        return this.f13406K;
    }

    public final double j() {
        return this.f13407L;
    }

    public final a k() {
        return this.J;
    }

    public final bv l() {
        return this.f13404H;
    }

    public final String m() {
        return this.f13408M;
    }

    public final String n() {
        return this.f13411P;
    }

    public final int o() {
        return this.f13409N;
    }

    public final boolean p() {
        return this.f13410O;
    }

    public final void q() {
        this.f13410O = true;
    }

    public final String r() {
        return this.f13413R;
    }

    public final boolean s() {
        return this.f13415T != 0;
    }

    public final int t() {
        return this.f13415T;
    }

    public final String u() {
        return this.f13414S;
    }

    public final String v() {
        return this.f13416U;
    }

    public final int w() {
        return this.f13417V;
    }

    public final String x() {
        return this.f13418W;
    }

    public static ad a(String str) {
        try {
            return a(new JSONObject(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void c(String str) {
        this.f13413R = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x01b8, code lost:
    
        if (r3 == 1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01ba, code lost:
    
        if (r3 == 2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01bc, code lost:
    
        r6.f13415T = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01c0, code lost:
    
        r6.f13415T = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01c3, code lost:
    
        r6.f13415T = 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ad a(JSONObject jSONObject) {
        try {
            ad adVar = new ad(jSONObject.optInt("is_success") == 1, jSONObject.has(e.a.f12068h) ? jSONObject.optDouble(e.a.f12068h, 0.0d) : 0.0d, jSONObject.optString(o.a.f13067c), jSONObject.optString("nurl"), jSONObject.optString("lurl"), jSONObject.optString("burl"), jSONObject.optString("err_msg"));
            adVar.f13420b = jSONObject.optString("cur");
            adVar.f13421c = jSONObject.optString("unit_id");
            adVar.f13422d = jSONObject.optInt("nw_firm_id");
            adVar.f13419a = jSONObject.optInt("err_code");
            adVar.f13423e = jSONObject.optLong("expire");
            adVar.f13424f = jSONObject.optLong("out_data_time");
            adVar.f13403G = jSONObject.optBoolean("is_send_winurl");
            adVar.i = jSONObject.optString("offer_data");
            adVar.f13425g = jSONObject.optString("tp_bid_id");
            adVar.f13427j = jSONObject.optString("burl_win");
            adVar.f13428k = jSONObject.optString("ad_source_id");
            adVar.f13429l = jSONObject.optDouble("cur_rate", 0.0d);
            adVar.f13430m = jSONObject.optString("bid_response");
            JSONObject optJSONObject = jSONObject.optJSONObject("ctrl");
            if (optJSONObject != null) {
                adVar.f13431n = optJSONObject.optInt(com.anythink.core.common.k.ai);
            }
            adVar.f13432o = jSONObject.optDouble("ecpm_api", 0.0d);
            adVar.f13433p = jSONObject.optDouble("cny_ecpm_api", 0.0d);
            adVar.f13434q = jSONObject.optString(com.anythink.core.common.k.f14296T);
            adVar.f13435r = jSONObject.optDouble("second_price", 0.0d);
            adVar.f13426h = jSONObject.optString("req_url", "");
            adVar.useType = jSONObject.optInt("bd_type", 1);
            double optDouble = jSONObject.optDouble(com.anythink.core.common.k.ap, adVar.price);
            adVar.sortPrice = optDouble;
            adVar.originPrice = jSONObject.optDouble("origin_price", optDouble);
            adVar.rmbPrice = jSONObject.optDouble("cny_price", 0.0d);
            int i = adVar.f13422d;
            if (i == 1) {
                double d2 = adVar.f13432o;
                if (d2 > 0.0d) {
                    adVar.price = d2;
                    adVar.sortPrice = d2;
                }
                double d9 = adVar.f13433p;
                if (d9 > 0.0d) {
                    adVar.rmbPrice = d9;
                }
            }
            if (i == 66) {
                adVar.f13407L = jSONObject.optDouble("a_r", 0.0d);
            }
            Object opt = jSONObject.opt("request_id");
            if (opt != null) {
                adVar.f13405I = opt.toString();
            }
            adVar.f13440w = jSONObject.optJSONObject("adx_ctrl");
            JSONObject optJSONObject2 = jSONObject.optJSONObject(l.a.aB);
            if (optJSONObject2 != null && optJSONObject2.length() > 0) {
                adVar.f13408M = optJSONObject2.optString(com.anythink.core.common.k.aS);
                adVar.f13411P = optJSONObject2.optString("cny_e_c");
                adVar.f13409N = optJSONObject2.optInt("id");
            }
            char c9 = 65535;
            adVar.f13412Q = jSONObject.optInt("adx_mtg_mix_type", -1);
            String optString = jSONObject.optString("deal_type", "");
            adVar.f13414S = optString;
            int hashCode = optString.hashCode();
            if (hashCode != 0) {
                if (hashCode != 2545) {
                    if (hashCode != 2548) {
                        if (hashCode == 79054 && optString.equals(f13400y)) {
                            c9 = 0;
                        }
                    } else if (optString.equals(f13401z)) {
                        c9 = 1;
                    }
                } else if (optString.equals(f13394A)) {
                    c9 = 2;
                }
            } else if (optString.equals("")) {
                c9 = 3;
            }
            adVar.f13415T = 3;
            adVar.f13416U = jSONObject.optString("deal_id", "");
            adVar.f13417V = jSONObject.optInt("deal_pri", 0);
            adVar.setOriginRequestId(jSONObject.optString("origin_request_id", ""));
            adVar.f13418W = jSONObject.optString("x_c", "");
            return adVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    private void e(String str) {
        this.f13411P = str;
    }

    private void d(String str) {
        this.f13408M = str;
    }

    public ad(boolean z3, double d2, double d9, String str, String str2, String str3, String str4, String str5) {
        super(z3, d9, str, str2, str3, str4, str5, ATAdConst.CURRENCY.USD);
        this.f13402F = "ad:";
        this.f13407L = 0.0d;
        this.f13412Q = -1;
        this.f13414S = "";
        this.f13415T = 0;
        this.sortPrice = d2;
    }

    public final void b(String str) {
        this.f13405I = str;
    }

    private void b(int i) {
        this.f13409N = i;
    }

    private int a(ad adVar) {
        return com.anythink.core.common.v.l.a(this, adVar);
    }

    public final synchronized void a(ac acVar) {
        if (acVar == null) {
            return;
        }
        try {
            if (this.f13438u == null) {
                this.f13438u = Collections.synchronizedList(new ArrayList(4));
            }
            if (!this.f13438u.contains(acVar)) {
                this.f13438u.add(acVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void a(cd cdVar) {
        this.f13439v = cdVar;
    }

    public final void a(IATAdxHandler iATAdxHandler) {
        this.f13406K = iATAdxHandler;
    }

    public final void a(a aVar) {
        this.J = aVar;
    }

    public final void a(bv bvVar, double d2) {
        this.f13404H = bvVar;
        this.f13435r = d2;
    }

    public final int a(int i) {
        int i6 = this.f13412Q;
        if (i6 < 0 || i != 4) {
            return -1;
        }
        return i6 == 5 ? 3 : 4;
    }
}
