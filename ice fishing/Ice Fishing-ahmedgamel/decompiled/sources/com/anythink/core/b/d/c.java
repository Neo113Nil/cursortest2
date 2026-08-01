package com.anythink.core.b.d;

import D.y;
import android.text.TextUtils;
import android.util.Log;
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
import com.anythink.core.common.m.i;
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
    public static final int f11740A = 7;

    /* renamed from: B, reason: collision with root package name */
    public static final int f11741B = 8;

    /* renamed from: C, reason: collision with root package name */
    public static final int f11742C = 9;

    /* renamed from: D, reason: collision with root package name */
    public static final int f11743D = 10;

    /* renamed from: E, reason: collision with root package name */
    public static final int f11744E = 11;

    /* renamed from: F, reason: collision with root package name */
    public static final String f11745F = "100";

    /* renamed from: G, reason: collision with root package name */
    public static final String f11746G = "102";

    /* renamed from: H, reason: collision with root package name */
    public static final String f11747H = "103";

    /* renamed from: I, reason: collision with root package name */
    public static final String f11748I = "103";
    public static final String J = "2";

    /* renamed from: K, reason: collision with root package name */
    public static final String f11749K = "1";

    /* renamed from: a, reason: collision with root package name */
    static final String f11750a = "c";

    /* renamed from: b, reason: collision with root package name */
    public static final String f11751b = "${AUCTION_PRICE}";

    /* renamed from: c, reason: collision with root package name */
    public static final String f11752c = "${AUCTION_PRICE_INT}";

    /* renamed from: d, reason: collision with root package name */
    public static final String f11753d = "${AUCTION_LOSS}";

    /* renamed from: e, reason: collision with root package name */
    public static final String f11754e = "${AUCTION_SEAT_ID}";

    /* renamed from: f, reason: collision with root package name */
    public static final String f11755f = "${AUCTION_BID_TO_WIN}";

    /* renamed from: g, reason: collision with root package name */
    public static final String f11756g = "${AUCTION_CURRENCY}";

    /* renamed from: h, reason: collision with root package name */
    public static final String f11757h = "${SECOND_PRICE}";
    public static final String i = "{__BIDDER__}";

    /* renamed from: j, reason: collision with root package name */
    public static final String f11758j = "${AUCTION_LOSS_BD}";

    /* renamed from: k, reason: collision with root package name */
    public static final String f11759k = "{__TS__}";

    /* renamed from: l, reason: collision with root package name */
    public static final String f11760l = "__ADN_TYPE__";

    /* renamed from: m, reason: collision with root package name */
    public static final String f11761m = "__ADN_NAME__";

    /* renamed from: n, reason: collision with root package name */
    public static final String f11762n = "__AD_N__";

    /* renamed from: o, reason: collision with root package name */
    public static final String f11763o = "__AD_TI__";

    /* renamed from: p, reason: collision with root package name */
    public static final String f11764p = "__AD_REQID__";

    /* renamed from: q, reason: collision with root package name */
    public static final String f11765q = "__IS_S__";

    /* renamed from: r, reason: collision with root package name */
    public static final String f11766r = "__IS_C__";

    /* renamed from: s, reason: collision with root package name */
    public static final String f11767s = "__AD_ECPM__";

    /* renamed from: t, reason: collision with root package name */
    public static final String f11768t = "${WIN_PRICE}";

    /* renamed from: u, reason: collision with root package name */
    public static final int f11769u = 1;

    /* renamed from: v, reason: collision with root package name */
    public static final int f11770v = 2;

    /* renamed from: w, reason: collision with root package name */
    public static final int f11771w = 3;

    /* renamed from: x, reason: collision with root package name */
    public static final int f11772x = 4;

    /* renamed from: y, reason: collision with root package name */
    public static final int f11773y = 5;

    /* renamed from: z, reason: collision with root package name */
    public static final int f11774z = 6;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f11795a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f11796b = 2;
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final int f11797a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f11798b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f11799c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f11800d = 4;

        /* renamed from: e, reason: collision with root package name */
        public static final int f11801e = 21;

        /* renamed from: f, reason: collision with root package name */
        public static final int f11802f = 22;

        /* renamed from: g, reason: collision with root package name */
        public static final int f11803g = 23;

        /* renamed from: h, reason: collision with root package name */
        public static final int f11804h = 24;
        public static final int i = 25;

        /* renamed from: j, reason: collision with root package name */
        public static final int f11805j = 26;

        /* renamed from: k, reason: collision with root package name */
        public static final int f11806k = 27;

        /* renamed from: l, reason: collision with root package name */
        public static final int f11807l = 28;

        /* renamed from: m, reason: collision with root package name */
        public static final int f11808m = 29;

        /* renamed from: n, reason: collision with root package name */
        public static final int f11809n = 30;

        /* renamed from: o, reason: collision with root package name */
        public static final int f11810o = 31;

        /* renamed from: p, reason: collision with root package name */
        public static final int f11811p = 32;

        /* renamed from: q, reason: collision with root package name */
        public static final int f11812q = 33;

        /* renamed from: r, reason: collision with root package name */
        public static final int f11813r = 34;

        /* renamed from: s, reason: collision with root package name */
        public static final int f11814s = 35;

        /* renamed from: t, reason: collision with root package name */
        public static final int f11815t = 36;

        public static boolean a(int i6) {
            return i6 == 34 || i6 == 35;
        }
    }

    public static void a(com.anythink.core.common.h.c cVar, boolean z3, int i6) {
        try {
            bv unitGroupInfo = cVar.e().getUnitGroupInfo();
            n i9 = cVar.i();
            ad R8 = unitGroupInfo.R();
            if (R8 != null) {
                a(R8, new aw(z3 ? 2 : 1, unitGroupInfo, i9), true, i6);
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

    public static void a(com.anythink.core.common.h.c cVar, int i6) {
        try {
            bv unitGroupInfo = cVar.e().getUnitGroupInfo();
            n i9 = cVar.i();
            ad R8 = unitGroupInfo.R();
            if (R8 != null) {
                aw awVar = new aw(i6, unitGroupInfo, i9);
                int i10 = i6 == 2 ? 34 : i6 == 11 ? 36 : 30;
                unitGroupInfo.u();
                a(R8, awVar, true, i10);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(final n nVar, final List<bv> list, final long j6, final int i6, final int i9) {
        com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.b.d.c.1
            @Override // java.lang.Runnable
            public final void run() {
                if (n.this == null) {
                    y.w("BiddingUtil#sendFinishHBTracking", "placementTrackingInfo is null.");
                    return;
                }
                JSONArray jSONArray = new JSONArray();
                n.this.s(j6);
                n.this.t(System.currentTimeMillis());
                n.this.f14025t = i6;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    bv bvVar = (bv) list.get(i10);
                    if (bvVar.q() != 7 && bvVar.o()) {
                        try {
                            int t6 = bvVar.t();
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("sorttype", t6);
                            jSONObject.put("unit_id", bvVar.z());
                            jSONObject.put("bidresult", bvVar.U());
                            jSONObject.put("bid_token_succ_t", bvVar.a());
                            jSONObject.put("bid_start_t", bvVar.b());
                            jSONObject.put("bidprice", bvVar.Q() ? String.valueOf(bvVar.D()) : "0");
                            jSONObject.put("bidprice_cny", bvVar.Q() ? String.valueOf(bvVar.c()) : "0");
                            jSONObject.put(k.ap, bvVar.Q() ? String.valueOf(bvVar.at()) : "0");
                            jSONObject.put("nw_firm_id", String.valueOf(bvVar.g()));
                            jSONObject.put("tp_bid_id", bvVar.R() != null ? bvVar.R().f13425g : null);
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

    public static void a(ad adVar, boolean z3, double d2, boolean z6, boolean z9) {
        if (adVar == null) {
            return;
        }
        double d9 = adVar.f13429l;
        String str = adVar.f13427j;
        int i6 = adVar.f13422d;
        if (d9 > 0.0d) {
            d2 *= d9;
        }
        if (z3) {
            if (TextUtils.isEmpty(str)) {
                str = adVar.displayNoticeUrl;
            }
            if (!TextUtils.isEmpty(str)) {
                a(str.replace(f11751b, com.anythink.core.b.d.a.a(adVar, d2)), (q) null);
            }
        } else {
            String str2 = adVar.displayNoticeUrl;
            if (!TextUtils.isEmpty(str2)) {
                a(str2.replace(f11751b, com.anythink.core.b.d.a.a(adVar, d2)).replace(f11753d, com.anythink.core.b.d.a.a(z6, 2, i6, z9)), (q) null);
            }
        }
        synchronized (adVar) {
            try {
                ATBiddingNotice aTBiddingNotice = adVar.biddingNotice;
                if (aTBiddingNotice != null) {
                    aTBiddingNotice.notifyBidDisplay(z3, d2);
                    if (z3) {
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
    public static void a(final ad adVar, final aw awVar, boolean z3, int i6) {
        boolean z6;
        boolean z9;
        int i9;
        boolean z10;
        double sortPrice;
        String str;
        double d2;
        String a9;
        int i10;
        boolean z11;
        int i11;
        final String str2;
        bv bvVar;
        final double d9;
        int i12;
        ad adVar2;
        int i13;
        double d10;
        boolean z12;
        int i14;
        int i15;
        Map<String, Object> map;
        boolean z13;
        double d11;
        String a10;
        aw awVar2;
        ad.a k9;
        double d12;
        Map<String, Object> aX;
        if (adVar == null) {
            return;
        }
        if (z3) {
            f.a().a(awVar.j(), adVar);
            if (awVar.f()) {
                com.anythink.core.common.a.a.a().b(t.b().g(), adVar.token);
            }
        }
        if ((awVar.h() != 8 && adVar.d()) || adVar.useType == 2) {
            return;
        }
        awVar.b(i6);
        double sortPrice2 = adVar.getSortPrice();
        double rmbPrice = adVar.getRmbPrice();
        int i16 = adVar.f13422d;
        bv f3 = adVar.f();
        boolean z14 = false;
        if (f3 != null) {
            boolean z15 = ak.b(f3) && f3.R() != null && f3.R().s();
            double a11 = p.a(f3);
            double b9 = p.b(f3);
            int g4 = f3.g();
            z9 = f3.o();
            try {
                if (awVar.h() != 8 && (aX = f3.aX()) != null) {
                    ATAdMixBidInfo.BidEntity bidEntity = new ATAdMixBidInfo.BidEntity();
                    Object obj = aX.get(j.w.f12604A);
                    Object obj2 = aX.get(j.w.f12605B);
                    Object obj3 = aX.get(j.w.f12606C);
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
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            z6 = z15;
            sortPrice2 = a11;
            i16 = g4;
            rmbPrice = b9;
        } else {
            z6 = false;
            z9 = true;
        }
        if (awVar.g() > 0.0d && awVar.g() > sortPrice2) {
            sortPrice2 = awVar.g();
            i16 = adVar.f13422d;
            z9 = true;
        }
        double c9 = awVar.c();
        String e10 = awVar.e();
        if (c9 > 0.0d) {
            sortPrice2 = c9;
            z10 = TextUtils.equals("102", e10) || TextUtils.equals("100", e10);
            i9 = -1;
        } else {
            i9 = i16;
            z10 = z9;
        }
        int h9 = awVar.h();
        double d13 = sortPrice2;
        if (adVar.f13422d == 28) {
            sortPrice = adVar.originPrice;
        } else {
            sortPrice = adVar.getSortPrice();
        }
        double d14 = sortPrice;
        int i17 = adVar.f13422d;
        double rmbPrice2 = adVar.getRmbPrice();
        if (d13 <= d14) {
            awVar.a(Double.valueOf(d13));
            double d15 = 0.01d;
            if (z6) {
                bv a12 = a(adVar);
                if (a12 != null) {
                    d12 = p.a(a12);
                }
                d12 = d14;
                int D8 = awVar.D();
                if (D8 == 2) {
                    str = e10;
                } else if (D8 != 3) {
                    if (D8 == 4) {
                        str = e10;
                        d2 = 0.0d;
                    } else if (D8 != 5) {
                        str = e10;
                        d15 = d12 + 0.01d;
                        d12 = ((d12 * 1.3d) - d15) * new Random(System.currentTimeMillis()).nextDouble();
                    } else {
                        str = e10;
                        d2 = -1.0d;
                    }
                }
                d2 = d12 + d15;
            } else {
                str = e10;
                d2 = d14 + 0.01d;
            }
            a9 = com.anythink.core.b.d.a.a(z10, h9, i17, z6);
            if (str != null) {
                a9 = str;
            }
            if (b.a(i6)) {
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
            n z16 = awVar.z();
            z16.a(ab.a(awVar));
            com.anythink.core.common.u.c.a(t.b().g()).a(24, z16);
            awVar.a(adVar.biddingNotice != null);
            if (awVar.u() && a9.equals("-1")) {
                double d16 = d2;
                boolean z17 = z6;
                i12 = 1;
                String str3 = a9;
                i11 = i17;
                bvVar = f3;
                z11 = z10;
                i10 = i9;
                e.a(awVar, d16, str3, 0.0d, d16, adVar.getSortPrice(), adVar.j(), "200", "", z17);
                d9 = d16;
                str2 = str3;
                z6 = z17;
            } else {
                i10 = i9;
                z11 = z10;
                i11 = i17;
                str2 = a9;
                bvVar = f3;
                d9 = d2;
                i12 = 1;
            }
            double a14 = a(adVar, d9);
            com.anythink.core.common.v.d.a().a(awVar.z(), awVar.A(), com.anythink.core.common.v.d.f16731d, "2");
            if (awVar.f()) {
                com.anythink.core.common.a.a.a().a(adVar);
            }
            if (awVar.u() || str2.equals("-1")) {
                adVar2 = adVar;
                i13 = i11;
            } else {
                bv bvVar2 = bvVar;
                boolean z18 = z11;
                int i18 = i10;
                int i19 = i11;
                Map<String, Object> a15 = com.anythink.core.b.d.a.a(z18, i18, i19, bvVar2, adVar);
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
                        aX2.put(j.w.f12604A, a16.getAdTittle());
                        aX2.put(j.w.f12605B, a16.getAdUserName());
                        a15.put(ATBiddingNotice.ADN_EXTRA_NATIVE_MATERIAL_INFO, aX2);
                    }
                }
                synchronized (adVar) {
                    try {
                        ATBiddingNotice aTBiddingNotice = adVar.biddingNotice;
                        if (aTBiddingNotice != null) {
                            try {
                                String a17 = com.anythink.core.b.d.a.a(z18, h9);
                                final double d17 = d9;
                                z12 = z18;
                                z13 = true;
                                final boolean z19 = z6;
                                try {
                                    ATIBiddingResultListener aTIBiddingResultListener = new ATIBiddingResultListener() { // from class: com.anythink.core.b.d.c.2

                                        /* renamed from: d, reason: collision with root package name */
                                        final /* synthetic */ double f11783d = 0.0d;

                                        @Override // com.anythink.core.api.ATIBiddingResultListener
                                        public final void reportFailed(int i21, String str4, Map<String, Object> map2) {
                                            if (isNeedWait()) {
                                                e.a(aw.this, d9, str2, this.f11783d, d17, adVar.getSortPrice(), adVar.j(), String.valueOf(i21), str4, z19);
                                            }
                                        }

                                        @Override // com.anythink.core.api.ATIBiddingResultListener
                                        public final void reportSuccess(Map<String, Object> map2) {
                                            if (isNeedWait()) {
                                                e.a(aw.this, d9, str2, this.f11783d, d17, adVar.getSortPrice(), adVar.j(), "200", "", z19);
                                            }
                                        }
                                    };
                                    a15.put(ATBiddingNotice.ADN_BID_LISTENER_OBJECT, aTIBiddingResultListener);
                                    try {
                                        aTBiddingNotice.notifyBidLoss(a17, a14, a15);
                                    } catch (Throwable unused) {
                                    }
                                    if (aTIBiddingResultListener.isNeedWait()) {
                                        z6 = z19;
                                        d10 = a14;
                                        i14 = i18;
                                        i15 = i19;
                                        map = a15;
                                        d11 = d9;
                                    } else {
                                        try {
                                            i14 = i18;
                                            try {
                                                z6 = z19;
                                                map = a15;
                                                i15 = i19;
                                                d10 = a14;
                                                try {
                                                    e.a(awVar, d9, str2, 0.0d, d9, adVar.getSortPrice(), adVar.j(), "200", "", z6);
                                                    d11 = d9;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    d11 = d9;
                                                    try {
                                                        th.printStackTrace();
                                                        Log.e("anythink", "notifyBidLoss: error: " + th.getMessage());
                                                        z14 = z13;
                                                        String str4 = str2;
                                                        final double d18 = d10;
                                                        a10 = com.anythink.core.b.d.a.a(adVar, awVar, i14, z12, d18, d14, str4, map);
                                                        final String str5 = str4;
                                                        if (TextUtils.isEmpty(a10)) {
                                                        }
                                                        awVar2 = awVar;
                                                        k9 = adVar.k();
                                                        adVar2 = adVar;
                                                        if (k9 != null) {
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
                                                d10 = a14;
                                                z6 = z19;
                                                i15 = i19;
                                                map = a15;
                                                d11 = d9;
                                                th.printStackTrace();
                                                Log.e("anythink", "notifyBidLoss: error: " + th.getMessage());
                                                z14 = z13;
                                                String str42 = str2;
                                                final double d182 = d10;
                                                a10 = com.anythink.core.b.d.a.a(adVar, awVar, i14, z12, d182, d14, str42, map);
                                                final String str52 = str42;
                                                if (TextUtils.isEmpty(a10)) {
                                                }
                                                awVar2 = awVar;
                                                k9 = adVar.k();
                                                adVar2 = adVar;
                                                if (k9 != null) {
                                                }
                                                i13 = i15;
                                                if (i13 != 28) {
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            d10 = a14;
                                            z6 = z19;
                                            i14 = i18;
                                            i15 = i19;
                                            map = a15;
                                            d11 = d9;
                                            th.printStackTrace();
                                            Log.e("anythink", "notifyBidLoss: error: " + th.getMessage());
                                            z14 = z13;
                                            String str422 = str2;
                                            final double d1822 = d10;
                                            a10 = com.anythink.core.b.d.a.a(adVar, awVar, i14, z12, d1822, d14, str422, map);
                                            final String str522 = str422;
                                            if (TextUtils.isEmpty(a10)) {
                                            }
                                            awVar2 = awVar;
                                            k9 = adVar.k();
                                            adVar2 = adVar;
                                            if (k9 != null) {
                                            }
                                            i13 = i15;
                                            if (i13 != 28) {
                                            }
                                        }
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    z6 = z19;
                                    d10 = a14;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                d10 = a14;
                                z12 = z18;
                                i14 = i18;
                                i15 = i19;
                                map = a15;
                                z13 = true;
                            }
                            z14 = z13;
                        } else {
                            d10 = a14;
                            z12 = z18;
                            i14 = i18;
                            i15 = i19;
                            map = a15;
                            d11 = d9;
                        }
                        String str4222 = str2;
                        final double d18222 = d10;
                        a10 = com.anythink.core.b.d.a.a(adVar, awVar, i14, z12, d18222, d14, str4222, map);
                        final String str5222 = str4222;
                        if (TextUtils.isEmpty(a10)) {
                            final double d19 = d11;
                            final boolean z20 = z6;
                            final boolean z21 = z14;
                            final double d20 = d11;
                            com.anythink.core.common.m.b bVar = new com.anythink.core.common.m.b() { // from class: com.anythink.core.b.d.c.3

                                /* renamed from: f, reason: collision with root package name */
                                final /* synthetic */ double f11792f = 0.0d;

                                @Override // com.anythink.core.common.m.q
                                public final void onLoadError(int i21, String str6, AdError adError) {
                                    String str7;
                                    String str8;
                                    if (ad.this.biddingNotice != null || z21) {
                                        return;
                                    }
                                    if (adError != null) {
                                        str7 = adError.getPlatformCode();
                                        str8 = !TextUtils.isEmpty(adError.getPlatformMSG()) ? adError.getPlatformMSG() : adError.toString();
                                    } else {
                                        str7 = com.anythink.core.common.res.image.c.f16246a;
                                        str8 = "";
                                    }
                                    e.a(awVar, d20, str5222, this.f11792f, d19, ad.this.getSortPrice(), ad.this.j(), str7, str8, z20, d18222);
                                }

                                @Override // com.anythink.core.common.m.q
                                public final void onLoadFinish(int i21, Object obj4) {
                                    ad adVar3 = ad.this;
                                    if (adVar3.biddingNotice != null || z21) {
                                        return;
                                    }
                                    e.a(awVar, d20, str5222, this.f11792f, d19, adVar3.getSortPrice(), ad.this.j(), "200", "", z20, d18222);
                                }
                            };
                            str5222 = str5222;
                            d18222 = d18222;
                            a(a10, bVar);
                        } else {
                            double d21 = d11;
                            boolean z22 = z14;
                            if (adVar.biddingNotice == null && !z22) {
                                awVar2 = awVar;
                                e.a(awVar2, d21, str5222, 0.0d, d21, adVar.getSortPrice(), adVar.j(), "200", "", z6, d18222);
                                d18222 = d18222;
                                k9 = adVar.k();
                                adVar2 = adVar;
                                if (k9 != null) {
                                    k9.b(com.anythink.core.b.d.a.a(adVar2, awVar2, d18222, str5222));
                                }
                                i13 = i15;
                            }
                        }
                        awVar2 = awVar;
                        k9 = adVar.k();
                        adVar2 = adVar;
                        if (k9 != null) {
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
        str = e10;
        d2 = d13;
        a9 = com.anythink.core.b.d.a.a(z10, h9, i17, z6);
        if (str != null) {
        }
        if (b.a(i6)) {
        }
        awVar.a(d2);
        awVar.a(a9);
        awVar.c(i9);
        awVar.b(rmbPrice);
        awVar.c(rmbPrice2);
        n z162 = awVar.z();
        z162.a(ab.a(awVar));
        com.anythink.core.common.u.c.a(t.b().g()).a(24, z162);
        awVar.a(adVar.biddingNotice != null);
        if (awVar.u()) {
        }
        i10 = i9;
        z11 = z10;
        i11 = i17;
        str2 = a9;
        bvVar = f3;
        d9 = d2;
        i12 = 1;
        double a142 = a(adVar, d9);
        com.anythink.core.common.v.d.a().a(awVar.z(), awVar.A(), com.anythink.core.common.v.d.f16731d, "2");
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
        i.a(str).a(0, qVar);
    }

    private static void a(String str, cd cdVar) {
        if (cdVar == null) {
            return;
        }
        i.a(str, cdVar).a(0, (q) null);
    }

    public static void a(cd cdVar) {
        n y7 = cdVar.y();
        y7.a(ab.a(cdVar));
        com.anythink.core.common.u.c.a(t.b().g()).a(24, y7);
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
        R8.f13439v = cdVar;
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
        double d9 = adVar.f13429l;
        return d9 > 0.0d ? d2 * d9 : d2;
    }

    private static double a(int i6, double d2, double d9) {
        if (i6 == 2) {
            return d9 + 0.01d;
        }
        if (i6 == 3) {
            return d2;
        }
        if (i6 == 4) {
            return 0.0d;
        }
        if (i6 == 5) {
            return -1.0d;
        }
        double d10 = 0.01d + d9;
        return (((d9 * 1.3d) - d10) * new Random(System.currentTimeMillis()).nextDouble()) + d10;
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
    public static void a(ad adVar, bv bvVar, int i6) {
        cd cdVar;
        ad adVar2;
        ad.a k9;
        if (adVar == null || bvVar == null || (cdVar = adVar.f13439v) == null || adVar.d()) {
            return;
        }
        cdVar.a(i6);
        double a9 = p.a(bvVar);
        double b9 = p.b(bvVar);
        double d2 = adVar.f13435r;
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
        if (b.a(i6)) {
            double a11 = a(cdVar.C());
            if (a11 > 0.0d) {
                if (a11 <= d2) {
                    String z3 = bvVar.z();
                    bv l9 = adVar.l();
                    String z6 = l9 != null ? l9.z() : "";
                    if (!TextUtils.isEmpty(z3)) {
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
        boolean v9 = cdVar.v();
        com.anythink.core.common.v.d.a().a(cdVar.y(), bvVar, com.anythink.core.common.v.d.f16731d, "1");
        if (bvVar.am()) {
            com.anythink.core.common.a.a.a().a(adVar);
        }
        cdVar.a(adVar.biddingNotice == null);
        if (v9) {
            adVar2 = adVar;
            String a14 = com.anythink.core.b.d.a.a(adVar2, cdVar, a12, a13);
            if (!TextUtils.isEmpty(a14)) {
                i.a(a14, cdVar).a(0, (q) null);
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
                    k9 = adVar2.k();
                    if (k9 != null) {
                    }
                    adVar2.h();
                }
            }
            k9 = adVar2.k();
            if (k9 != null) {
                k9.a(com.anythink.core.b.d.a.a(adVar2, cdVar, a13));
            }
        } else {
            adVar2 = adVar;
            a(cdVar);
        }
        adVar2.h();
    }
}
