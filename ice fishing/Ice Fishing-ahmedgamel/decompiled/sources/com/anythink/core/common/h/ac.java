package com.anythink.core.common.h;

import android.text.TextUtils;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ac {

    /* renamed from: a, reason: collision with root package name */
    static final String f14155a = "reqId";

    /* renamed from: b, reason: collision with root package name */
    static final String f14156b = "hasShow";

    /* renamed from: c, reason: collision with root package name */
    static final String f14157c = "hasClick";

    /* renamed from: d, reason: collision with root package name */
    static final String f14158d = "price";

    /* renamed from: e, reason: collision with root package name */
    static final String f14159e = "networkFirmId";

    /* renamed from: f, reason: collision with root package name */
    static final String f14160f = "isHB";

    /* renamed from: g, reason: collision with root package name */
    static final String f14161g = "adsListType";

    /* renamed from: h, reason: collision with root package name */
    static final String f14162h = "tpBidId";
    static final String i = "deal_type";

    /* renamed from: j, reason: collision with root package name */
    static final String f14163j = "deal_id";

    /* renamed from: k, reason: collision with root package name */
    static final String f14164k = "deal_pri";

    /* renamed from: l, reason: collision with root package name */
    private static String f14165l = "ac";

    /* renamed from: m, reason: collision with root package name */
    private boolean f14166m;

    /* renamed from: n, reason: collision with root package name */
    private final String f14167n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f14168o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f14169p;

    /* renamed from: q, reason: collision with root package name */
    private bv f14170q;

    /* renamed from: r, reason: collision with root package name */
    private bv f14171r;

    /* renamed from: s, reason: collision with root package name */
    private int f14172s;

    /* renamed from: t, reason: collision with root package name */
    private double f14173t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f14174u;

    /* renamed from: v, reason: collision with root package name */
    private int f14175v;

    /* renamed from: w, reason: collision with root package name */
    private String f14176w;

    /* renamed from: x, reason: collision with root package name */
    private String f14177x;

    /* renamed from: y, reason: collision with root package name */
    private String f14178y;

    /* renamed from: z, reason: collision with root package name */
    private int f14179z;

    public ac(String str) {
        this.f14167n = str;
    }

    private static int a(int i4) {
        if (i4 != 2) {
            if (i4 != 3) {
                if (i4 == 4 || i4 == 5) {
                    return 4;
                }
                if (i4 != 7) {
                    if (i4 != 8 && i4 != 11) {
                        return 1;
                    }
                }
            }
            return 2;
        }
        return 3;
    }

    private boolean m() {
        return this.f14166m;
    }

    public final synchronized void b(bv bvVar) {
        Objects.toString(bvVar);
        this.f14171r = bvVar;
    }

    public final String c() {
        return this.f14167n;
    }

    public final void d() {
        this.f14168o = true;
    }

    public final void e() {
        this.f14169p = true;
    }

    public final boolean f() {
        return this.f14168o;
    }

    public final boolean g() {
        return this.f14169p;
    }

    public final String h() {
        double a9;
        int i4;
        int i6;
        int i9;
        String str;
        String str2;
        String str3;
        String str4;
        JSONObject jSONObject = new JSONObject();
        try {
            boolean z6 = this.f14168o;
            int i10 = 0;
            boolean z9 = this.f14169p;
            if (this.f14166m) {
                a9 = this.f14173t;
                i6 = this.f14172s;
                i9 = a(this.f14175v);
                str = this.f14176w;
                str2 = this.f14177x;
                str3 = this.f14178y;
                i4 = this.f14179z;
            } else {
                a9 = com.anythink.core.common.v.p.a(this.f14170q);
                int g9 = this.f14170q.g();
                ad R8 = this.f14170q.R();
                int a10 = a(this.f14170q.d());
                String str5 = (R8 == null || TextUtils.isEmpty(R8.f14211g)) ? "" : R8.f14211g;
                if (R8 != null) {
                    if (TextUtils.isEmpty(R8.u())) {
                        str4 = "";
                    } else {
                        str4 = R8.u();
                        i10 = R8.w();
                    }
                    if (TextUtils.isEmpty(R8.v())) {
                        String str6 = str4;
                        i4 = i10;
                        i6 = g9;
                        i9 = a10;
                        str2 = str6;
                        str = str5;
                        str3 = "";
                    } else {
                        String str7 = str4;
                        i4 = i10;
                        i6 = g9;
                        i9 = a10;
                        str2 = str7;
                        String str8 = str5;
                        str3 = R8.v();
                        str = str8;
                    }
                } else {
                    i4 = 0;
                    i6 = g9;
                    i9 = a10;
                    str = str5;
                    str2 = "";
                    str3 = str2;
                }
            }
            jSONObject.put("price", a9);
            jSONObject.put(f14159e, i6);
            jSONObject.put("demandType", i9);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("tp_bid_id", str);
            }
            jSONObject.put("imp", z6 ? 1 : 0);
            jSONObject.put("click", z9 ? 1 : 0);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put(i, str2);
                jSONObject.put(f14164k, i4);
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put(f14163j, str3);
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
            jSONObject.put(f14155a, this.f14167n);
            jSONObject.put(f14156b, this.f14168o);
            jSONObject.put(f14157c, this.f14169p);
            bv bvVar = this.f14170q;
            if (bvVar != null) {
                jSONObject.put("price", com.anythink.core.common.v.p.a(bvVar));
                jSONObject.put(f14159e, this.f14170q.g());
                jSONObject.put(f14160f, this.f14170q.o());
                jSONObject.put(f14161g, this.f14170q.d());
                ad R8 = this.f14170q.R();
                if (R8 != null && !TextUtils.isEmpty(R8.f14211g)) {
                    jSONObject.put(f14162h, R8.f14211g);
                }
                if (R8 != null) {
                    if (!TextUtils.isEmpty(R8.u())) {
                        jSONObject.put(i, R8.u());
                        jSONObject.put(f14164k, R8.w());
                    }
                    if (!TextUtils.isEmpty(R8.v())) {
                        jSONObject.put(f14163j, R8.v());
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public final double j() {
        if (this.f14166m) {
            return this.f14173t;
        }
        bv bvVar = this.f14170q;
        if (bvVar != null) {
            return com.anythink.core.common.v.p.a(bvVar);
        }
        return -1.0d;
    }

    public final int k() {
        if (this.f14166m) {
            return this.f14172s;
        }
        bv bvVar = this.f14170q;
        if (bvVar != null) {
            return bvVar.g();
        }
        return 0;
    }

    public final boolean l() {
        if (this.f14166m) {
            return this.f14174u;
        }
        bv bvVar = this.f14170q;
        if (bvVar != null) {
            return bvVar.o();
        }
        return false;
    }

    public String toString() {
        String str;
        if (this.f14166m) {
            str = ", priceInDisk=" + this.f14173t + ", networkFirmIdInDisk=" + this.f14172s + ", winnerIsHBInDisk=" + this.f14174u + ", adsListTypeInDisk=" + this.f14175v + ", tpBidIdInDisk=" + this.f14176w + ", pmpTypeStringInDisk=" + this.f14177x + ", pmpOrderIdInDisk=" + this.f14178y + ", pmpPriorityInDisk=" + this.f14179z;
        } else {
            str = null;
        }
        StringBuilder sb = new StringBuilder("BiddingRecorder{fromLocalDisk=");
        sb.append(this.f14166m);
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(", requestId=");
        sb.append(this.f14167n);
        sb.append(", hasShow=");
        sb.append(this.f14168o);
        sb.append(", hasClick=");
        sb.append(this.f14169p);
        sb.append(", loadedMaxPriceUgInMemory=");
        sb.append(this.f14170q);
        sb.append('}');
        return sb.toString();
    }

    public final synchronized void a(bv bvVar) {
        Objects.toString(bvVar);
        this.f14170q = bvVar;
    }

    public final synchronized bv b() {
        return this.f14171r;
    }

    public final synchronized bv a() {
        return this.f14170q;
    }

    public static ac a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            ac acVar = new ac(jSONObject.getString(f14155a));
            acVar.f14166m = true;
            acVar.f14168o = jSONObject.optBoolean(f14156b);
            acVar.f14169p = jSONObject.optBoolean(f14157c);
            acVar.f14173t = jSONObject.optDouble("price", -1.0d);
            acVar.f14172s = jSONObject.optInt(f14159e);
            acVar.f14174u = jSONObject.optBoolean(f14160f);
            acVar.f14175v = jSONObject.optInt(f14161g);
            acVar.f14176w = jSONObject.optString(f14162h);
            acVar.f14177x = jSONObject.optString(i, "");
            acVar.f14178y = jSONObject.optString(f14163j, "");
            acVar.f14179z = jSONObject.optInt(f14164k, 0);
            return acVar;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
