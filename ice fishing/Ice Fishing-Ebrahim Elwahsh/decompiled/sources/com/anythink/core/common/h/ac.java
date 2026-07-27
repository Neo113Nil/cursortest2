package com.anythink.core.common.h;

import android.text.TextUtils;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ac {

    /* renamed from: a, reason: collision with root package name */
    static final String f13526a = "reqId";

    /* renamed from: b, reason: collision with root package name */
    static final String f13527b = "hasShow";

    /* renamed from: c, reason: collision with root package name */
    static final String f13528c = "hasClick";

    /* renamed from: d, reason: collision with root package name */
    static final String f13529d = "price";

    /* renamed from: e, reason: collision with root package name */
    static final String f13530e = "networkFirmId";

    /* renamed from: f, reason: collision with root package name */
    static final String f13531f = "isHB";

    /* renamed from: g, reason: collision with root package name */
    static final String f13532g = "adsListType";

    /* renamed from: h, reason: collision with root package name */
    static final String f13533h = "tpBidId";
    static final String i = "deal_type";

    /* renamed from: j, reason: collision with root package name */
    static final String f13534j = "deal_id";

    /* renamed from: k, reason: collision with root package name */
    static final String f13535k = "deal_pri";

    /* renamed from: l, reason: collision with root package name */
    private static String f13536l = "ac";

    /* renamed from: m, reason: collision with root package name */
    private boolean f13537m;

    /* renamed from: n, reason: collision with root package name */
    private final String f13538n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f13539o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f13540p;

    /* renamed from: q, reason: collision with root package name */
    private bv f13541q;

    /* renamed from: r, reason: collision with root package name */
    private bv f13542r;

    /* renamed from: s, reason: collision with root package name */
    private int f13543s;

    /* renamed from: t, reason: collision with root package name */
    private double f13544t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f13545u;

    /* renamed from: v, reason: collision with root package name */
    private int f13546v;

    /* renamed from: w, reason: collision with root package name */
    private String f13547w;

    /* renamed from: x, reason: collision with root package name */
    private String f13548x;

    /* renamed from: y, reason: collision with root package name */
    private String f13549y;

    /* renamed from: z, reason: collision with root package name */
    private int f13550z;

    public ac(String str) {
        this.f13538n = str;
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
        return this.f13537m;
    }

    public final synchronized void b(bv bvVar) {
        Objects.toString(bvVar);
        this.f13542r = bvVar;
    }

    public final String c() {
        return this.f13538n;
    }

    public final void d() {
        this.f13539o = true;
    }

    public final void e() {
        this.f13540p = true;
    }

    public final boolean f() {
        return this.f13539o;
    }

    public final boolean g() {
        return this.f13540p;
    }

    public final String h() {
        double a9;
        int i4;
        int i9;
        int i10;
        String str;
        String str2;
        String str3;
        String str4;
        JSONObject jSONObject = new JSONObject();
        try {
            boolean z8 = this.f13539o;
            int i11 = 0;
            boolean z9 = this.f13540p;
            if (this.f13537m) {
                a9 = this.f13544t;
                i9 = this.f13543s;
                i10 = a(this.f13546v);
                str = this.f13547w;
                str2 = this.f13548x;
                str3 = this.f13549y;
                i4 = this.f13550z;
            } else {
                a9 = com.anythink.core.common.v.p.a(this.f13541q);
                int g9 = this.f13541q.g();
                ad R8 = this.f13541q.R();
                int a10 = a(this.f13541q.d());
                String str5 = (R8 == null || TextUtils.isEmpty(R8.f13582g)) ? "" : R8.f13582g;
                if (R8 != null) {
                    if (TextUtils.isEmpty(R8.u())) {
                        str4 = "";
                    } else {
                        str4 = R8.u();
                        i11 = R8.w();
                    }
                    if (TextUtils.isEmpty(R8.v())) {
                        String str6 = str4;
                        i4 = i11;
                        i9 = g9;
                        i10 = a10;
                        str2 = str6;
                        str = str5;
                        str3 = "";
                    } else {
                        String str7 = str4;
                        i4 = i11;
                        i9 = g9;
                        i10 = a10;
                        str2 = str7;
                        String str8 = str5;
                        str3 = R8.v();
                        str = str8;
                    }
                } else {
                    i4 = 0;
                    i9 = g9;
                    i10 = a10;
                    str = str5;
                    str2 = "";
                    str3 = str2;
                }
            }
            jSONObject.put("price", a9);
            jSONObject.put(f13530e, i9);
            jSONObject.put("demandType", i10);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("tp_bid_id", str);
            }
            jSONObject.put("imp", z8 ? 1 : 0);
            jSONObject.put("click", z9 ? 1 : 0);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put(i, str2);
                jSONObject.put(f13535k, i4);
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put(f13534j, str3);
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
            jSONObject.put(f13526a, this.f13538n);
            jSONObject.put(f13527b, this.f13539o);
            jSONObject.put(f13528c, this.f13540p);
            bv bvVar = this.f13541q;
            if (bvVar != null) {
                jSONObject.put("price", com.anythink.core.common.v.p.a(bvVar));
                jSONObject.put(f13530e, this.f13541q.g());
                jSONObject.put(f13531f, this.f13541q.o());
                jSONObject.put(f13532g, this.f13541q.d());
                ad R8 = this.f13541q.R();
                if (R8 != null && !TextUtils.isEmpty(R8.f13582g)) {
                    jSONObject.put(f13533h, R8.f13582g);
                }
                if (R8 != null) {
                    if (!TextUtils.isEmpty(R8.u())) {
                        jSONObject.put(i, R8.u());
                        jSONObject.put(f13535k, R8.w());
                    }
                    if (!TextUtils.isEmpty(R8.v())) {
                        jSONObject.put(f13534j, R8.v());
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public final double j() {
        if (this.f13537m) {
            return this.f13544t;
        }
        bv bvVar = this.f13541q;
        if (bvVar != null) {
            return com.anythink.core.common.v.p.a(bvVar);
        }
        return -1.0d;
    }

    public final int k() {
        if (this.f13537m) {
            return this.f13543s;
        }
        bv bvVar = this.f13541q;
        if (bvVar != null) {
            return bvVar.g();
        }
        return 0;
    }

    public final boolean l() {
        if (this.f13537m) {
            return this.f13545u;
        }
        bv bvVar = this.f13541q;
        if (bvVar != null) {
            return bvVar.o();
        }
        return false;
    }

    public String toString() {
        String str;
        if (this.f13537m) {
            str = ", priceInDisk=" + this.f13544t + ", networkFirmIdInDisk=" + this.f13543s + ", winnerIsHBInDisk=" + this.f13545u + ", adsListTypeInDisk=" + this.f13546v + ", tpBidIdInDisk=" + this.f13547w + ", pmpTypeStringInDisk=" + this.f13548x + ", pmpOrderIdInDisk=" + this.f13549y + ", pmpPriorityInDisk=" + this.f13550z;
        } else {
            str = null;
        }
        StringBuilder sb = new StringBuilder("BiddingRecorder{fromLocalDisk=");
        sb.append(this.f13537m);
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(", requestId=");
        sb.append(this.f13538n);
        sb.append(", hasShow=");
        sb.append(this.f13539o);
        sb.append(", hasClick=");
        sb.append(this.f13540p);
        sb.append(", loadedMaxPriceUgInMemory=");
        sb.append(this.f13541q);
        sb.append('}');
        return sb.toString();
    }

    public final synchronized void a(bv bvVar) {
        Objects.toString(bvVar);
        this.f13541q = bvVar;
    }

    public final synchronized bv b() {
        return this.f13542r;
    }

    public final synchronized bv a() {
        return this.f13541q;
    }

    public static ac a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            ac acVar = new ac(jSONObject.getString(f13526a));
            acVar.f13537m = true;
            acVar.f13539o = jSONObject.optBoolean(f13527b);
            acVar.f13540p = jSONObject.optBoolean(f13528c);
            acVar.f13544t = jSONObject.optDouble("price", -1.0d);
            acVar.f13543s = jSONObject.optInt(f13530e);
            acVar.f13545u = jSONObject.optBoolean(f13531f);
            acVar.f13546v = jSONObject.optInt(f13532g);
            acVar.f13547w = jSONObject.optString(f13533h);
            acVar.f13548x = jSONObject.optString(i, "");
            acVar.f13549y = jSONObject.optString(f13534j, "");
            acVar.f13550z = jSONObject.optInt(f13535k, 0);
            return acVar;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
