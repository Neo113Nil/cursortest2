package com.anythink.core.common.h;

import android.text.TextUtils;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ac {

    /* renamed from: a, reason: collision with root package name */
    static final String f13369a = "reqId";

    /* renamed from: b, reason: collision with root package name */
    static final String f13370b = "hasShow";

    /* renamed from: c, reason: collision with root package name */
    static final String f13371c = "hasClick";

    /* renamed from: d, reason: collision with root package name */
    static final String f13372d = "price";

    /* renamed from: e, reason: collision with root package name */
    static final String f13373e = "networkFirmId";

    /* renamed from: f, reason: collision with root package name */
    static final String f13374f = "isHB";

    /* renamed from: g, reason: collision with root package name */
    static final String f13375g = "adsListType";

    /* renamed from: h, reason: collision with root package name */
    static final String f13376h = "tpBidId";
    static final String i = "deal_type";

    /* renamed from: j, reason: collision with root package name */
    static final String f13377j = "deal_id";

    /* renamed from: k, reason: collision with root package name */
    static final String f13378k = "deal_pri";

    /* renamed from: l, reason: collision with root package name */
    private static String f13379l = "ac";

    /* renamed from: m, reason: collision with root package name */
    private boolean f13380m;

    /* renamed from: n, reason: collision with root package name */
    private final String f13381n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f13382o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f13383p;

    /* renamed from: q, reason: collision with root package name */
    private bv f13384q;

    /* renamed from: r, reason: collision with root package name */
    private bv f13385r;

    /* renamed from: s, reason: collision with root package name */
    private int f13386s;

    /* renamed from: t, reason: collision with root package name */
    private double f13387t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f13388u;

    /* renamed from: v, reason: collision with root package name */
    private int f13389v;

    /* renamed from: w, reason: collision with root package name */
    private String f13390w;

    /* renamed from: x, reason: collision with root package name */
    private String f13391x;

    /* renamed from: y, reason: collision with root package name */
    private String f13392y;

    /* renamed from: z, reason: collision with root package name */
    private int f13393z;

    public ac(String str) {
        this.f13381n = str;
    }

    private static int a(int i6) {
        if (i6 != 2) {
            if (i6 != 3) {
                if (i6 == 4 || i6 == 5) {
                    return 4;
                }
                if (i6 != 7) {
                    if (i6 != 8 && i6 != 11) {
                        return 1;
                    }
                }
            }
            return 2;
        }
        return 3;
    }

    private boolean m() {
        return this.f13380m;
    }

    public final synchronized void b(bv bvVar) {
        Objects.toString(bvVar);
        this.f13385r = bvVar;
    }

    public final String c() {
        return this.f13381n;
    }

    public final void d() {
        this.f13382o = true;
    }

    public final void e() {
        this.f13383p = true;
    }

    public final boolean f() {
        return this.f13382o;
    }

    public final boolean g() {
        return this.f13383p;
    }

    public final String h() {
        double a9;
        int i6;
        int i9;
        int i10;
        String str;
        String str2;
        String str3;
        String str4;
        JSONObject jSONObject = new JSONObject();
        try {
            boolean z3 = this.f13382o;
            int i11 = 0;
            boolean z6 = this.f13383p;
            if (this.f13380m) {
                a9 = this.f13387t;
                i9 = this.f13386s;
                i10 = a(this.f13389v);
                str = this.f13390w;
                str2 = this.f13391x;
                str3 = this.f13392y;
                i6 = this.f13393z;
            } else {
                a9 = com.anythink.core.common.v.p.a(this.f13384q);
                int g4 = this.f13384q.g();
                ad R8 = this.f13384q.R();
                int a10 = a(this.f13384q.d());
                String str5 = (R8 == null || TextUtils.isEmpty(R8.f13425g)) ? "" : R8.f13425g;
                if (R8 != null) {
                    if (TextUtils.isEmpty(R8.u())) {
                        str4 = "";
                    } else {
                        str4 = R8.u();
                        i11 = R8.w();
                    }
                    if (TextUtils.isEmpty(R8.v())) {
                        String str6 = str4;
                        i6 = i11;
                        i9 = g4;
                        i10 = a10;
                        str2 = str6;
                        str = str5;
                        str3 = "";
                    } else {
                        String str7 = str4;
                        i6 = i11;
                        i9 = g4;
                        i10 = a10;
                        str2 = str7;
                        String str8 = str5;
                        str3 = R8.v();
                        str = str8;
                    }
                } else {
                    i6 = 0;
                    i9 = g4;
                    i10 = a10;
                    str = str5;
                    str2 = "";
                    str3 = str2;
                }
            }
            jSONObject.put("price", a9);
            jSONObject.put(f13373e, i9);
            jSONObject.put("demandType", i10);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("tp_bid_id", str);
            }
            jSONObject.put("imp", z3 ? 1 : 0);
            jSONObject.put("click", z6 ? 1 : 0);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put(i, str2);
                jSONObject.put(f13378k, i6);
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put(f13377j, str3);
            }
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public final synchronized JSONObject i() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put(f13369a, this.f13381n);
            jSONObject.put(f13370b, this.f13382o);
            jSONObject.put(f13371c, this.f13383p);
            bv bvVar = this.f13384q;
            if (bvVar != null) {
                jSONObject.put("price", com.anythink.core.common.v.p.a(bvVar));
                jSONObject.put(f13373e, this.f13384q.g());
                jSONObject.put(f13374f, this.f13384q.o());
                jSONObject.put(f13375g, this.f13384q.d());
                ad R8 = this.f13384q.R();
                if (R8 != null && !TextUtils.isEmpty(R8.f13425g)) {
                    jSONObject.put(f13376h, R8.f13425g);
                }
                if (R8 != null) {
                    if (!TextUtils.isEmpty(R8.u())) {
                        jSONObject.put(i, R8.u());
                        jSONObject.put(f13378k, R8.w());
                    }
                    if (!TextUtils.isEmpty(R8.v())) {
                        jSONObject.put(f13377j, R8.v());
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public final double j() {
        if (this.f13380m) {
            return this.f13387t;
        }
        bv bvVar = this.f13384q;
        if (bvVar != null) {
            return com.anythink.core.common.v.p.a(bvVar);
        }
        return -1.0d;
    }

    public final int k() {
        if (this.f13380m) {
            return this.f13386s;
        }
        bv bvVar = this.f13384q;
        if (bvVar != null) {
            return bvVar.g();
        }
        return 0;
    }

    public final boolean l() {
        if (this.f13380m) {
            return this.f13388u;
        }
        bv bvVar = this.f13384q;
        if (bvVar != null) {
            return bvVar.o();
        }
        return false;
    }

    public String toString() {
        String str;
        if (this.f13380m) {
            str = ", priceInDisk=" + this.f13387t + ", networkFirmIdInDisk=" + this.f13386s + ", winnerIsHBInDisk=" + this.f13388u + ", adsListTypeInDisk=" + this.f13389v + ", tpBidIdInDisk=" + this.f13390w + ", pmpTypeStringInDisk=" + this.f13391x + ", pmpOrderIdInDisk=" + this.f13392y + ", pmpPriorityInDisk=" + this.f13393z;
        } else {
            str = null;
        }
        StringBuilder sb = new StringBuilder("BiddingRecorder{fromLocalDisk=");
        sb.append(this.f13380m);
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(", requestId=");
        sb.append(this.f13381n);
        sb.append(", hasShow=");
        sb.append(this.f13382o);
        sb.append(", hasClick=");
        sb.append(this.f13383p);
        sb.append(", loadedMaxPriceUgInMemory=");
        sb.append(this.f13384q);
        sb.append('}');
        return sb.toString();
    }

    public final synchronized void a(bv bvVar) {
        Objects.toString(bvVar);
        this.f13384q = bvVar;
    }

    public final synchronized bv b() {
        return this.f13385r;
    }

    public final synchronized bv a() {
        return this.f13384q;
    }

    public static ac a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            ac acVar = new ac(jSONObject.getString(f13369a));
            acVar.f13380m = true;
            acVar.f13382o = jSONObject.optBoolean(f13370b);
            acVar.f13383p = jSONObject.optBoolean(f13371c);
            acVar.f13387t = jSONObject.optDouble("price", -1.0d);
            acVar.f13386s = jSONObject.optInt(f13373e);
            acVar.f13388u = jSONObject.optBoolean(f13374f);
            acVar.f13389v = jSONObject.optInt(f13375g);
            acVar.f13390w = jSONObject.optString(f13376h);
            acVar.f13391x = jSONObject.optString(i, "");
            acVar.f13392y = jSONObject.optString(f13377j, "");
            acVar.f13393z = jSONObject.optInt(f13378k, 0);
            return acVar;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
