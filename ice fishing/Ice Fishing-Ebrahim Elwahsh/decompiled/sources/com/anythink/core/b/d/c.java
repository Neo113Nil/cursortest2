package com.anythink.core.b.d;

import android.text.TextUtils;
import android.util.Log;
import com.anythink.basead.b.c.i;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATAdMixBidInfo;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBiddingNotice;
import com.anythink.core.api.ATIBiddingResultListener;
import com.anythink.core.api.AdError;
import com.anythink.core.api.BaseAd;
import com.anythink.core.b.f;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.ab;
import com.anythink.core.common.h.ad;
import com.anythink.core.common.h.aw;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.cd;
import com.anythink.core.common.h.n;
import com.anythink.core.common.k;
import com.anythink.core.common.m.q;
import com.anythink.core.common.u.e;
import com.anythink.core.common.v.ak;
import com.anythink.core.common.v.m;
import com.anythink.core.common.v.p;
import com.anythink.core.d.d;
import com.anythink.core.mg.api.MgAdInfo;
import com.anythink.core.mg.api.MgComparedResult;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: A, reason: collision with root package name */
    public static final int f11897A = 7;

    /* renamed from: B, reason: collision with root package name */
    public static final int f11898B = 8;

    /* renamed from: C, reason: collision with root package name */
    public static final int f11899C = 9;

    /* renamed from: D, reason: collision with root package name */
    public static final int f11900D = 10;

    /* renamed from: E, reason: collision with root package name */
    public static final int f11901E = 11;

    /* renamed from: F, reason: collision with root package name */
    public static final String f11902F = "100";

    /* renamed from: G, reason: collision with root package name */
    public static final String f11903G = "102";

    /* renamed from: H, reason: collision with root package name */
    public static final String f11904H = "103";

    /* renamed from: I, reason: collision with root package name */
    public static final String f11905I = "103";
    public static final String J = "2";

    /* renamed from: K, reason: collision with root package name */
    public static final String f11906K = "1";

    /* renamed from: a, reason: collision with root package name */
    static final String f11907a = "c";

    /* renamed from: b, reason: collision with root package name */
    public static final String f11908b = "${AUCTION_PRICE}";

    /* renamed from: c, reason: collision with root package name */
    public static final String f11909c = "${AUCTION_PRICE_INT}";

    /* renamed from: d, reason: collision with root package name */
    public static final String f11910d = "${AUCTION_LOSS}";

    /* renamed from: e, reason: collision with root package name */
    public static final String f11911e = "${AUCTION_SEAT_ID}";

    /* renamed from: f, reason: collision with root package name */
    public static final String f11912f = "${AUCTION_BID_TO_WIN}";

    /* renamed from: g, reason: collision with root package name */
    public static final String f11913g = "${AUCTION_CURRENCY}";

    /* renamed from: h, reason: collision with root package name */
    public static final String f11914h = "${SECOND_PRICE}";
    public static final String i = "{__BIDDER__}";

    /* renamed from: j, reason: collision with root package name */
    public static final String f11915j = "${AUCTION_LOSS_BD}";

    /* renamed from: k, reason: collision with root package name */
    public static final String f11916k = "{__TS__}";

    /* renamed from: l, reason: collision with root package name */
    public static final String f11917l = "__ADN_TYPE__";

    /* renamed from: m, reason: collision with root package name */
    public static final String f11918m = "__ADN_NAME__";

    /* renamed from: n, reason: collision with root package name */
    public static final String f11919n = "__AD_N__";

    /* renamed from: o, reason: collision with root package name */
    public static final String f11920o = "__AD_TI__";

    /* renamed from: p, reason: collision with root package name */
    public static final String f11921p = "__AD_REQID__";

    /* renamed from: q, reason: collision with root package name */
    public static final String f11922q = "__IS_S__";

    /* renamed from: r, reason: collision with root package name */
    public static final String f11923r = "__IS_C__";

    /* renamed from: s, reason: collision with root package name */
    public static final String f11924s = "__AD_ECPM__";

    /* renamed from: t, reason: collision with root package name */
    public static final String f11925t = "${WIN_PRICE}";

    /* renamed from: u, reason: collision with root package name */
    public static final int f11926u = 1;

    /* renamed from: v, reason: collision with root package name */
    public static final int f11927v = 2;

    /* renamed from: w, reason: collision with root package name */
    public static final int f11928w = 3;

    /* renamed from: x, reason: collision with root package name */
    public static final int f11929x = 4;

    /* renamed from: y, reason: collision with root package name */
    public static final int f11930y = 5;

    /* renamed from: z, reason: collision with root package name */
    public static final int f11931z = 6;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f11952a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f11953b = 2;
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final int f11954a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f11955b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f11956c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f11957d = 4;

        /* renamed from: e, reason: collision with root package name */
        public static final int f11958e = 21;

        /* renamed from: f, reason: collision with root package name */
        public static final int f11959f = 22;

        /* renamed from: g, reason: collision with root package name */
        public static final int f11960g = 23;

        /* renamed from: h, reason: collision with root package name */
        public static final int f11961h = 24;
        public static final int i = 25;

        /* renamed from: j, reason: collision with root package name */
        public static final int f11962j = 26;

        /* renamed from: k, reason: collision with root package name */
        public static final int f11963k = 27;

        /* renamed from: l, reason: collision with root package name */
        public static final int f11964l = 28;

        /* renamed from: m, reason: collision with root package name */
        public static final int f11965m = 29;

        /* renamed from: n, reason: collision with root package name */
        public static final int f11966n = 30;

        /* renamed from: o, reason: collision with root package name */
        public static final int f11967o = 31;

        /* renamed from: p, reason: collision with root package name */
        public static final int f11968p = 32;

        /* renamed from: q, reason: collision with root package name */
        public static final int f11969q = 33;

        /* renamed from: r, reason: collision with root package name */
        public static final int f11970r = 34;

        /* renamed from: s, reason: collision with root package name */
        public static final int f11971s = 35;

        /* renamed from: t, reason: collision with root package name */
        public static final int f11972t = 36;

        public static boolean a(int i4) {
            return i4 == 34 || i4 == 35;
        }
    }

    public static void a(com.anythink.core.common.h.c cVar, boolean z8, int i4) {
        try {
            bv unitGroupInfo = cVar.e().getUnitGroupInfo();
            n i9 = cVar.i();
            ad R8 = unitGroupInfo.R();
            if (R8 != null) {
                a(R8, new aw(z8 ? 2 : 1, unitGroupInfo, i9), true, i4);
            }
        } catch (Throwable unused) {
        }
    }

    private static bv b(ad adVar) {
        if (adVar != null) {
            return adVar.f();
        }
        return null;
    }

    public static void a(com.anythink.core.common.h.c cVar) {
        a(cVar, false, 25);
    }

    public static void a(com.anythink.core.common.h.c cVar, int i4) {
        try {
            bv unitGroupInfo = cVar.e().getUnitGroupInfo();
            n i9 = cVar.i();
            ad R8 = unitGroupInfo.R();
            if (R8 != null) {
                aw awVar = new aw(i4, unitGroupInfo, i9);
                int i10 = i4 == 2 ? 34 : i4 == 11 ? 36 : 30;
                unitGroupInfo.u();
                a(R8, awVar, true, i10);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(final n nVar, final List<bv> list, final long j9, final int i4, final int i9) {
        com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.b.d.c.1
            @Override // java.lang.Runnable
            public final void run() {
                if (n.this == null) {
                    i.v("BiddingUtil#sendFinishHBTracking", "placementTrackingInfo is null.");
                    return;
                }
                JSONArray jSONArray = new JSONArray();
                n.this.s(j9);
                n.this.t(System.currentTimeMillis());
                n.this.f14182t = i4;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    bv bvVar = (bv) list.get(i10);
                    if (bvVar.q() != 7 && bvVar.o()) {
                        try {
                            int t9 = bvVar.t();
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("sorttype", t9);
                            jSONObject.put("unit_id", bvVar.z());
                            jSONObject.put("bidresult", bvVar.U());
                            jSONObject.put("bid_token_succ_t", bvVar.a());
                            jSONObject.put("bid_start_t", bvVar.b());
                            jSONObject.put("bidprice", bvVar.Q() ? String.valueOf(bvVar.D()) : "0");
                            jSONObject.put("bidprice_cny", bvVar.Q() ? String.valueOf(bvVar.c()) : "0");
                            jSONObject.put(k.ap, bvVar.Q() ? String.valueOf(bvVar.at()) : "0");
                            jSONObject.put("nw_firm_id", String.valueOf(bvVar.g()));
                            jSONObject.put("tp_bid_id", bvVar.R() != null ? bvVar.R().f13582g : null);
                            jSONObject.put("rl_bid_status", bvVar.T());
                            jSONObject.put("errormsg", bvVar.F());
                            int ae = bvVar.ae();
                            String valueOf = String.valueOf(i9);
                            if (!valueOf.equals("0")) {
                                if (ae == -1) {
                                    try {
                                        ae = Integer.parseInt(valueOf);
                                    } catch (Exception unused) {
                                    }
                                }
                                jSONObject.put("ad_type", ae);
                            }
                            jSONObject.put("ads_list_type", bvVar.d());
                            jSONObject.put("unit_type", bvVar.aM());
                            ad R8 = bvVar.R();
                            jSONObject.put("dd_ori_price", R8 != null ? String.valueOf(R8.originPrice) : "0");
                            jSONObject.put(k.aN, bvVar.aQ());
                            jSONObject.put(k.aQ, bvVar.aS());
                            jSONObject.put("bid_floor", bvVar.ar());
                            jSONObject.put("en_p", R8 != null ? R8.getExtra() : "");
                            if (R8 != null && R8.t() != 0) {
                                jSONObject.put("deal_id", R8.v());
                                jSONObject.put("deal_type", R8.u());
                                n.this.B(R8.u());
                                n.this.C(R8.v());
                            }
                            jSONObject.put(k.bi, bvVar.bq());
                            jSONObject.put(k.bj, bvVar.bp());
                            jSONObject.put("network_pl_id", ak.a(bvVar, (ATBaseAdAdapter) null));
                            jSONArray.put(jSONObject);
                        } catch (Exception unused2) {
                        }
                        try {
                            com.anythink.core.d.b b9 = d.a(t.b().g()).b(t.b().p());
                            if (b9 != null && b9.c() != null) {
                                String valueOf2 = String.valueOf(bvVar.g());
                                if (b9.c().contains(Integer.valueOf(bvVar.g()))) {
                                    e.a(n.this, valueOf2, m.b(valueOf2), bvVar.z());
                                }
                            }
                        } catch (Throwable unused3) {
                        }
                    }
                }
                n.this.K(String.valueOf(i9));
                n.this.x(jSONArray.toString());
                com.anythink.core.common.u.c.a(t.b().g()).a(11, n.this);
            }
        });
    }

    public static void a(ad adVar, boolean z8, double d2, boolean z9, boolean z10) {
        if (adVar == null) {
            return;
        }
        double d3 = adVar.f13586l;
        String str = adVar.f13584j;
        int i4 = adVar.f13579d;
        if (d3 > 0.0d) {
            d2 *= d3;
        }
        if (z8) {
            if (TextUtils.isEmpty(str)) {
                str = adVar.displayNoticeUrl;
            }
            if (!TextUtils.isEmpty(str)) {
                a(str.replace(f11908b, com.anythink.core.b.d.a.a(adVar, d2)), (q) null);
            }
        } else {
            String str2 = adVar.displayNoticeUrl;
            if (!TextUtils.isEmpty(str2)) {
                a(str2.replace(f11908b, com.anythink.core.b.d.a.a(adVar, d2)).replace(f11910d, com.anythink.core.b.d.a.a(z9, 2, i4, z10)), (q) null);
            }
        }
        synchronized (adVar) {
            try {
                ATBiddingNotice aTBiddingNotice = adVar.biddingNotice;
                if (aTBiddingNotice != null) {
                    aTBiddingNotice.notifyBidDisplay(z8, d2);
                    if (z8) {
                        adVar.e();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static bv a(ad adVar) {
        if (adVar != null) {
            return adVar.g();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0149, code lost:
    
        if (r21 < r27) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0254  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 5 */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(final ad adVar, final aw awVar, boolean z8, int i4) {
        boolean z9;
        boolean z10;
        int i9;
        boolean z11;
        double sortPrice;
        String str;
        double d2;
        String a9;
        int i10;
        boolean z12;
        int i11;
        final String str2;
        bv bvVar;
        final double d3;
        int i12;
        ad adVar2;
        int i13;
        double d9;
        boolean z13;
        int i14;
        int i15;
        Map<String, Object> map;
        boolean z14;
        double d10;
        String a10;
        aw awVar2;
        ad.a k6;
        double d11;
        Map<String, Object> aX;
        if (adVar == null) {
            return;
        }
        if (z8) {
            f.a().a(awVar.j(), adVar);
            if (awVar.f()) {
                com.anythink.core.common.a.a.a().b(t.b().g(), adVar.token);
            }
        }
        if ((awVar.h() != 8 && adVar.d()) || adVar.useType == 2) {
            return;
        }
        awVar.b(i4);
        double sortPrice2 = adVar.getSortPrice();
        double rmbPrice = adVar.getRmbPrice();
        int i16 = adVar.f13579d;
        bv f6 = adVar.f();
        boolean z15 = false;
        if (f6 != null) {
            boolean z16 = ak.b(f6) && f6.R() != null && f6.R().s();
            double a11 = p.a(f6);
            double b9 = p.b(f6);
            int g9 = f6.g();
            z10 = f6.o();
            try {
                if (awVar.h() != 8 && (aX = f6.aX()) != null) {
                    ATAdMixBidInfo.BidEntity bidEntity = new ATAdMixBidInfo.BidEntity();
                    Object obj = aX.get(j.w.f12761A);
                    Object obj2 = aX.get(j.w.f12762B);
                    Object obj3 = aX.get(j.w.f12763C);
                    if (obj != null) {
                        bidEntity.setAdTittle((String) obj);
                    }
                    if (obj2 != null) {
                        bidEntity.setAdUserName((String) obj2);
                    }
                    if (obj3 != null) {
                        bidEntity.setAdPackageName((String) obj3);
                    }
                    awVar.a(bidEntity);
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            z9 = z16;
            sortPrice2 = a11;
            i16 = g9;
            rmbPrice = b9;
        } else {
            z9 = false;
            z10 = true;
        }
        if (awVar.g() > 0.0d && awVar.g() > sortPrice2) {
            sortPrice2 = awVar.g();
            i16 = adVar.f13579d;
            z10 = true;
        }
        double c4 = awVar.c();
        String e9 = awVar.e();
        if (c4 > 0.0d) {
            sortPrice2 = c4;
            z11 = TextUtils.equals("102", e9) || TextUtils.equals("100", e9);
            i9 = -1;
        } else {
            i9 = i16;
            z11 = z10;
        }
        int h9 = awVar.h();
        double d12 = sortPrice2;
        if (adVar.f13579d == 28) {
            sortPrice = adVar.originPrice;
        } else {
            sortPrice = adVar.getSortPrice();
        }
        double d13 = sortPrice;
        int i17 = adVar.f13579d;
        double rmbPrice2 = adVar.getRmbPrice();
        if (d12 <= d13) {
            awVar.a(Double.valueOf(d12));
            double d14 = 0.01d;
            if (z9) {
                bv a12 = a(adVar);
                if (a12 != null) {
                    d11 = p.a(a12);
                }
                d11 = d13;
                int D8 = awVar.D();
                if (D8 == 2) {
                    str = e9;
                } else if (D8 != 3) {
                    if (D8 == 4) {
                        str = e9;
                        d2 = 0.0d;
                    } else if (D8 != 5) {
                        str = e9;
                        d14 = d11 + 0.01d;
                        d11 = ((d11 * 1.3d) - d14) * new Random(System.currentTimeMillis()).nextDouble();
                    } else {
                        str = e9;
                        d2 = -1.0d;
                    }
                }
                d2 = d11 + d14;
            } else {
                str = e9;
                d2 = d13 + 0.01d;
            }
            a9 = com.anythink.core.b.d.a.a(z11, h9, i17, z9);
            if (str != null) {
                a9 = str;
            }
            if (b.a(i4)) {
                double a13 = a(awVar.F());
                if (a13 > 0.0d && a13 > d2) {
                    d2 = a13;
                }
            }
            awVar.a(d2);
            awVar.a(a9);
            awVar.c(i9);
            awVar.b(rmbPrice);
            awVar.c(rmbPrice2);
            n z17 = awVar.z();
            z17.a(ab.a(awVar));
            com.anythink.core.common.u.c.a(t.b().g()).a(24, z17);
            awVar.a(adVar.biddingNotice != null);
            if (awVar.u() && a9.equals("-1")) {
                double d15 = d2;
                boolean z18 = z9;
                i12 = 1;
                String str3 = a9;
                i11 = i17;
                bvVar = f6;
                z12 = z11;
                i10 = i9;
                e.a(awVar, d15, str3, 0.0d, d15, adVar.getSortPrice(), adVar.j(), "200", "", z18);
                d3 = d15;
                str2 = str3;
                z9 = z18;
            } else {
                i10 = i9;
                z12 = z11;
                i11 = i17;
                str2 = a9;
                bvVar = f6;
                d3 = d2;
                i12 = 1;
            }
            double a14 = a(adVar, d3);
            com.anythink.core.common.v.d.a().a(awVar.z(), awVar.A(), com.anythink.core.common.v.d.f16889d, "2");
            if (awVar.f()) {
                com.anythink.core.common.a.a.a().a(adVar);
            }
            if (awVar.u() || str2.equals("-1")) {
                adVar2 = adVar;
                i13 = i11;
            } else {
                bv bvVar2 = bvVar;
                boolean z19 = z12;
                int i18 = i10;
                int i19 = i11;
                Map<String, Object> a15 = com.anythink.core.b.d.a.a(z19, i18, i19, bvVar2, adVar);
                if (awVar.h() == 8) {
                    a15.put(ATBiddingNotice.ADN_REQUEST_IS_SHOW, Integer.valueOf(i12));
                    int i20 = i12;
                    if (awVar.b() == i20) {
                        a15.put(ATBiddingNotice.ADN_REQUEST_IS_CLICK, Integer.valueOf(i20));
                    } else {
                        a15.put(ATBiddingNotice.ADN_REQUEST_IS_CLICK, 0);
                    }
                    if (awVar.a() != null) {
                        Map<String, Object> aX2 = bvVar2 != null ? bvVar2.aX() : null;
                        if (aX2 == null) {
                            aX2 = new HashMap<>();
                        }
                        ATAdMixBidInfo.BidEntity a16 = awVar.a();
                        aX2.put(j.w.f12761A, a16.getAdTittle());
                        aX2.put(j.w.f12762B, a16.getAdUserName());
                        a15.put(ATBiddingNotice.ADN_EXTRA_NATIVE_MATERIAL_INFO, aX2);
                    }
                }
                synchronized (adVar) {
                    try {
                        ATBiddingNotice aTBiddingNotice = adVar.biddingNotice;
                        if (aTBiddingNotice != null) {
                            try {
                                String a17 = com.anythink.core.b.d.a.a(z19, h9);
                                final double d16 = d3;
                                z13 = z19;
                                z14 = true;
                                final boolean z20 = z9;
                                try {
                                    ATIBiddingResultListener aTIBiddingResultListener = new ATIBiddingResultListener() { // from class: com.anythink.core.b.d.c.2

                                        /* renamed from: d, reason: collision with root package name */
                                        final /* synthetic */ double f11940d = 0.0d;

                                        @Override // com.anythink.core.api.ATIBiddingResultListener
                                        public final void reportFailed(int i21, String str4, Map<String, Object> map2) {
                                            if (isNeedWait()) {
                                                e.a(aw.this, d3, str2, this.f11940d, d16, adVar.getSortPrice(), adVar.j(), String.valueOf(i21), str4, z20);
                                            }
                                        }

                                        @Override // com.anythink.core.api.ATIBiddingResultListener
                                        public final void reportSuccess(Map<String, Object> map2) {
                                            if (isNeedWait()) {
                                                e.a(aw.this, d3, str2, this.f11940d, d16, adVar.getSortPrice(), adVar.j(), "200", "", z20);
                                            }
                                        }
                                    };
                                    a15.put(ATBiddingNotice.ADN_BID_LISTENER_OBJECT, aTIBiddingResultListener);
                                    try {
                                        aTBiddingNotice.notifyBidLoss(a17, a14, a15);
                                    } catch (Throwable unused) {
                                    }
                                    if (aTIBiddingResultListener.isNeedWait()) {
                                        z9 = z20;
                                        d9 = a14;
                                        i14 = i18;
                                        i15 = i19;
                                        map = a15;
                                        d10 = d3;
                                    } else {
                                        try {
                                            i14 = i18;
                                            try {
                                                z9 = z20;
                                                map = a15;
                                                i15 = i19;
                                                d9 = a14;
                                                try {
                                                    e.a(awVar, d3, str2, 0.0d, d3, adVar.getSortPrice(), adVar.j(), "200", "", z9);
                                                    d10 = d3;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    d10 = d3;
                                                    try {
                                                        th.printStackTrace();
                                                        Log.e("anythink", "notifyBidLoss: error: " + th.getMessage());
                                                        z15 = z14;
                                                        String str4 = str2;
                                                        final double d17 = d9;
                                                        a10 = com.anythink.core.b.d.a.a(adVar, awVar, i14, z13, d17, d13, str4, map);
                                                        final String str5 = str4;
                                                        if (TextUtils.isEmpty(a10)) {
                                                        }
                                                        awVar2 = awVar;
                                                        k6 = adVar.k();
                                                        adVar2 = adVar;
                                                        if (k6 != null) {
                                                        }
                                                        i13 = i15;
                                                        if (i13 != 28) {
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        throw th;
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                d9 = a14;
                                                z9 = z20;
                                                i15 = i19;
                                                map = a15;
                                                d10 = d3;
                                                th.printStackTrace();
                                                Log.e("anythink", "notifyBidLoss: error: " + th.getMessage());
                                                z15 = z14;
                                                String str42 = str2;
                                                final double d172 = d9;
                                                a10 = com.anythink.core.b.d.a.a(adVar, awVar, i14, z13, d172, d13, str42, map);
                                                final String str52 = str42;
                                                if (TextUtils.isEmpty(a10)) {
                                                }
                                                awVar2 = awVar;
                                                k6 = adVar.k();
                                                adVar2 = adVar;
                                                if (k6 != null) {
                                                }
                                                i13 = i15;
                                                if (i13 != 28) {
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            d9 = a14;
                                            z9 = z20;
                                            i14 = i18;
                                            i15 = i19;
                                            map = a15;
                                            d10 = d3;
                                            th.printStackTrace();
                                            Log.e("anythink", "notifyBidLoss: error: " + th.getMessage());
                                            z15 = z14;
                                            String str422 = str2;
                                            final double d1722 = d9;
                                            a10 = com.anythink.core.b.d.a.a(adVar, awVar, i14, z13, d1722, d13, str422, map);
                                            final String str522 = str422;
                                            if (TextUtils.isEmpty(a10)) {
                                            }
                                            awVar2 = awVar;
                                            k6 = adVar.k();
                                            adVar2 = adVar;
                                            if (k6 != null) {
                                            }
                                            i13 = i15;
                                            if (i13 != 28) {
                                            }
                                        }
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    z9 = z20;
                                    d9 = a14;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                d9 = a14;
                                z13 = z19;
                                i14 = i18;
                                i15 = i19;
                                map = a15;
                                z14 = true;
                            }
                            z15 = z14;
                        } else {
                            d9 = a14;
                            z13 = z19;
                            i14 = i18;
                            i15 = i19;
                            map = a15;
                            d10 = d3;
                        }
                        String str4222 = str2;
                        final double d17222 = d9;
                        a10 = com.anythink.core.b.d.a.a(adVar, awVar, i14, z13, d17222, d13, str4222, map);
                        final String str5222 = str4222;
                        if (TextUtils.isEmpty(a10)) {
                            final double d18 = d10;
                            final boolean z21 = z9;
                            final boolean z22 = z15;
                            final double d19 = d10;
                            com.anythink.core.common.m.b bVar = new com.anythink.core.common.m.b() { // from class: com.anythink.core.b.d.c.3

                                /* renamed from: f, reason: collision with root package name */
                                final /* synthetic */ double f11949f = 0.0d;

                                @Override // com.anythink.core.common.m.q
                                public final void onLoadError(int i21, String str6, AdError adError) {
                                    String str7;
                                    String str8;
                                    if (ad.this.biddingNotice != null || z22) {
                                        return;
                                    }
                                    if (adError != null) {
                                        str7 = adError.getPlatformCode();
                                        str8 = !TextUtils.isEmpty(adError.getPlatformMSG()) ? adError.getPlatformMSG() : adError.toString();
                                    } else {
                                        str7 = com.anythink.core.common.res.image.c.f16404a;
                                        str8 = "";
                                    }
                                    e.a(awVar, d19, str5222, this.f11949f, d18, ad.this.getSortPrice(), ad.this.j(), str7, str8, z21, d17222);
                                }

                                @Override // com.anythink.core.common.m.q
                                public final void onLoadFinish(int i21, Object obj4) {
                                    ad adVar3 = ad.this;
                                    if (adVar3.biddingNotice != null || z22) {
                                        return;
                                    }
                                    e.a(awVar, d19, str5222, this.f11949f, d18, adVar3.getSortPrice(), ad.this.j(), "200", "", z21, d17222);
                                }
                            };
                            str5222 = str5222;
                            d17222 = d17222;
                            a(a10, bVar);
                        } else {
                            double d20 = d10;
                            boolean z23 = z15;
                            if (adVar.biddingNotice == null && !z23) {
                                awVar2 = awVar;
                                e.a(awVar2, d20, str5222, 0.0d, d20, adVar.getSortPrice(), adVar.j(), "200", "", z9, d17222);
                                d17222 = d17222;
                                k6 = adVar.k();
                                adVar2 = adVar;
                                if (k6 != null) {
                                    k6.b(com.anythink.core.b.d.a.a(adVar2, awVar2, d17222, str5222));
                                }
                                i13 = i15;
                            }
                        }
                        awVar2 = awVar;
                        k6 = adVar.k();
                        adVar2 = adVar;
                        if (k6 != null) {
                        }
                        i13 = i15;
                    } catch (Throwable th7) {
                        th = th7;
                    }
                }
            }
            if (i13 != 28) {
                adVar2.e();
                adVar2.h();
                return;
            }
            return;
        }
        str = e9;
        d2 = d12;
        a9 = com.anythink.core.b.d.a.a(z11, h9, i17, z9);
        if (str != null) {
        }
        if (b.a(i4)) {
        }
        awVar.a(d2);
        awVar.a(a9);
        awVar.c(i9);
        awVar.b(rmbPrice);
        awVar.c(rmbPrice2);
        n z172 = awVar.z();
        z172.a(ab.a(awVar));
        com.anythink.core.common.u.c.a(t.b().g()).a(24, z172);
        awVar.a(adVar.biddingNotice != null);
        if (awVar.u()) {
        }
        i10 = i9;
        z12 = z11;
        i11 = i17;
        str2 = a9;
        bvVar = f6;
        d3 = d2;
        i12 = 1;
        double a142 = a(adVar, d3);
        com.anythink.core.common.v.d.a().a(awVar.z(), awVar.A(), com.anythink.core.common.v.d.f16889d, "2");
        if (awVar.f()) {
        }
        if (awVar.u()) {
        }
        adVar2 = adVar;
        i13 = i11;
        if (i13 != 28) {
        }
    }

    private static void a(String str, q qVar) {
        com.anythink.core.common.m.i.a(str).a(0, qVar);
    }

    private static void a(String str, cd cdVar) {
        if (cdVar == null) {
            return;
        }
        com.anythink.core.common.m.i.a(str, cdVar).a(0, (q) null);
    }

    public static void a(cd cdVar) {
        n y6 = cdVar.y();
        y6.a(ab.a(cdVar));
        com.anythink.core.common.u.c.a(t.b().g()).a(24, y6);
        e.a(cdVar);
    }

    public static void a(ATBaseAdAdapter aTBaseAdAdapter, bv bvVar, n nVar, BaseAd... baseAdArr) {
        ad R8;
        Map<String, Object> internalNetworkInfoMap;
        BaseAd baseAd;
        if (aTBaseAdAdapter == null || bvVar == null || (R8 = bvVar.R()) == null) {
            return;
        }
        if (baseAdArr != null && baseAdArr.length > 0 && (baseAd = baseAdArr[0]) != null) {
            internalNetworkInfoMap = baseAd.getNetworkInfoMap();
        } else {
            internalNetworkInfoMap = aTBaseAdAdapter.getInternalNetworkInfoMap();
        }
        cd cdVar = new cd();
        n af = nVar.af();
        cdVar.a(af);
        cdVar.a(internalNetworkInfoMap);
        cdVar.a(bvVar);
        if (cdVar.d() != 0) {
            bvVar.F(cdVar.d());
        }
        R8.f13596v = cdVar;
        if (internalNetworkInfoMap != null) {
            Object obj = internalNetworkInfoMap.get(ATAdConst.NETWORK_CUSTOM_KEY.WS_ACTION);
            if (obj instanceof ad.a) {
                R8.a((ad.a) obj);
            }
        }
        if (nVar.Y() == 66 && af.ah()) {
            R8.a(new com.anythink.core.basead.a.b(R8, bvVar, af));
        }
    }

    private static double a(ad adVar, double d2) {
        double d3 = adVar.f13586l;
        return d3 > 0.0d ? d2 * d3 : d2;
    }

    private static double a(int i4, double d2, double d3) {
        if (i4 == 2) {
            return d3 + 0.01d;
        }
        if (i4 == 3) {
            return d2;
        }
        if (i4 == 4) {
            return 0.0d;
        }
        if (i4 == 5) {
            return -1.0d;
        }
        double d9 = 0.01d + d3;
        return (((d3 * 1.3d) - d9) * new Random(System.currentTimeMillis()).nextDouble()) + d9;
    }

    private static double a(MgComparedResult mgComparedResult) {
        MgAdInfo mgAdInfo = mgComparedResult != null ? mgComparedResult.getMgAdInfo() : null;
        if (mgAdInfo != null) {
            return mgAdInfo.getUSDEcpm();
        }
        return 0.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009e, code lost:
    
        if (r15.equals(r9) != false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(ad adVar, bv bvVar, int i4) {
        cd cdVar;
        ad adVar2;
        ad.a k6;
        if (adVar == null || bvVar == null || (cdVar = adVar.f13596v) == null || adVar.d()) {
            return;
        }
        cdVar.a(i4);
        double a9 = p.a(bvVar);
        double b9 = p.b(bvVar);
        double d2 = adVar.f13592r;
        Double a10 = cdVar.a();
        double doubleValue = a10 != null ? a10.doubleValue() : d2;
        if (adVar.s() || (doubleValue <= a9 && doubleValue > 0.0d)) {
            d2 = doubleValue;
        } else if (d2 != 0.0d) {
            cdVar.a(Double.valueOf(doubleValue));
            d2 = a9 - 0.01d;
            if (d2 < 0.0d) {
                d2 = 0.0d;
            }
        }
        if (bvVar.g() == 8) {
            double ar = bvVar.ar();
            if (ar > 0.0d && ar > d2) {
                d2 = ar;
            }
        }
        if (b.a(i4)) {
            double a11 = a(cdVar.C());
            if (a11 > 0.0d) {
                if (a11 <= d2) {
                    String z8 = bvVar.z();
                    bv l9 = adVar.l();
                    String z9 = l9 != null ? l9.z() : "";
                    if (!TextUtils.isEmpty(z8)) {
                    }
                }
                d2 = a11;
            }
        }
        cdVar.a(a9);
        cdVar.b(d2);
        cdVar.c(b9);
        cdVar.s();
        cdVar.d(d2);
        cdVar.b(Double.valueOf(adVar.j()));
        double a12 = a(adVar, a9);
        double a13 = a(adVar, d2);
        boolean v6 = cdVar.v();
        com.anythink.core.common.v.d.a().a(cdVar.y(), bvVar, com.anythink.core.common.v.d.f16889d, "1");
        if (bvVar.am()) {
            com.anythink.core.common.a.a.a().a(adVar);
        }
        cdVar.a(adVar.biddingNotice == null);
        if (v6) {
            adVar2 = adVar;
            String a14 = com.anythink.core.b.d.a.a(adVar2, cdVar, a12, a13);
            if (!TextUtils.isEmpty(a14)) {
                com.anythink.core.common.m.i.a(a14, cdVar).a(0, (q) null);
            } else {
                a(cdVar);
            }
            ATBiddingNotice aTBiddingNotice = adVar2.biddingNotice;
            if (aTBiddingNotice != null) {
                try {
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    aTBiddingNotice.notifyBidWin(a12, a13, com.anythink.core.b.d.a.a(bvVar.g(), adVar2.l()));
                    a13 = a13;
                } catch (Throwable th2) {
                    th = th2;
                    a13 = a13;
                    Throwable th3 = th;
                    th3.printStackTrace();
                    Log.e("anythink", "notifyBidWin: error: " + th3.getMessage());
                    k6 = adVar2.k();
                    if (k6 != null) {
                    }
                    adVar2.h();
                }
            }
            k6 = adVar2.k();
            if (k6 != null) {
                k6.a(com.anythink.core.b.d.a.a(adVar2, cdVar, a13));
            }
        } else {
            adVar2 = adVar;
            a(cdVar);
        }
        adVar2.h();
    }
}
