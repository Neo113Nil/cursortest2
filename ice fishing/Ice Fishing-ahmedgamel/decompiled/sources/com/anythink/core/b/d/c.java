package com.anythink.core.b.d;

import android.text.TextUtils;
import android.util.Log;
import com.IceFishing.LiveIceFishing.k;
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
    public static final int f12526A = 7;

    /* renamed from: B, reason: collision with root package name */
    public static final int f12527B = 8;

    /* renamed from: C, reason: collision with root package name */
    public static final int f12528C = 9;

    /* renamed from: D, reason: collision with root package name */
    public static final int f12529D = 10;

    /* renamed from: E, reason: collision with root package name */
    public static final int f12530E = 11;

    /* renamed from: F, reason: collision with root package name */
    public static final String f12531F = "100";

    /* renamed from: G, reason: collision with root package name */
    public static final String f12532G = "102";

    /* renamed from: H, reason: collision with root package name */
    public static final String f12533H = "103";

    /* renamed from: I, reason: collision with root package name */
    public static final String f12534I = "103";
    public static final String J = "2";

    /* renamed from: K, reason: collision with root package name */
    public static final String f12535K = "1";

    /* renamed from: a, reason: collision with root package name */
    static final String f12536a = "c";

    /* renamed from: b, reason: collision with root package name */
    public static final String f12537b = "${AUCTION_PRICE}";

    /* renamed from: c, reason: collision with root package name */
    public static final String f12538c = "${AUCTION_PRICE_INT}";

    /* renamed from: d, reason: collision with root package name */
    public static final String f12539d = "${AUCTION_LOSS}";

    /* renamed from: e, reason: collision with root package name */
    public static final String f12540e = "${AUCTION_SEAT_ID}";

    /* renamed from: f, reason: collision with root package name */
    public static final String f12541f = "${AUCTION_BID_TO_WIN}";

    /* renamed from: g, reason: collision with root package name */
    public static final String f12542g = "${AUCTION_CURRENCY}";

    /* renamed from: h, reason: collision with root package name */
    public static final String f12543h = "${SECOND_PRICE}";
    public static final String i = "{__BIDDER__}";

    /* renamed from: j, reason: collision with root package name */
    public static final String f12544j = "${AUCTION_LOSS_BD}";

    /* renamed from: k, reason: collision with root package name */
    public static final String f12545k = "{__TS__}";

    /* renamed from: l, reason: collision with root package name */
    public static final String f12546l = "__ADN_TYPE__";

    /* renamed from: m, reason: collision with root package name */
    public static final String f12547m = "__ADN_NAME__";

    /* renamed from: n, reason: collision with root package name */
    public static final String f12548n = "__AD_N__";

    /* renamed from: o, reason: collision with root package name */
    public static final String f12549o = "__AD_TI__";

    /* renamed from: p, reason: collision with root package name */
    public static final String f12550p = "__AD_REQID__";

    /* renamed from: q, reason: collision with root package name */
    public static final String f12551q = "__IS_S__";

    /* renamed from: r, reason: collision with root package name */
    public static final String f12552r = "__IS_C__";

    /* renamed from: s, reason: collision with root package name */
    public static final String f12553s = "__AD_ECPM__";

    /* renamed from: t, reason: collision with root package name */
    public static final String f12554t = "${WIN_PRICE}";

    /* renamed from: u, reason: collision with root package name */
    public static final int f12555u = 1;

    /* renamed from: v, reason: collision with root package name */
    public static final int f12556v = 2;

    /* renamed from: w, reason: collision with root package name */
    public static final int f12557w = 3;

    /* renamed from: x, reason: collision with root package name */
    public static final int f12558x = 4;

    /* renamed from: y, reason: collision with root package name */
    public static final int f12559y = 5;

    /* renamed from: z, reason: collision with root package name */
    public static final int f12560z = 6;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f12581a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f12582b = 2;
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final int f12583a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f12584b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f12585c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f12586d = 4;

        /* renamed from: e, reason: collision with root package name */
        public static final int f12587e = 21;

        /* renamed from: f, reason: collision with root package name */
        public static final int f12588f = 22;

        /* renamed from: g, reason: collision with root package name */
        public static final int f12589g = 23;

        /* renamed from: h, reason: collision with root package name */
        public static final int f12590h = 24;
        public static final int i = 25;

        /* renamed from: j, reason: collision with root package name */
        public static final int f12591j = 26;

        /* renamed from: k, reason: collision with root package name */
        public static final int f12592k = 27;

        /* renamed from: l, reason: collision with root package name */
        public static final int f12593l = 28;

        /* renamed from: m, reason: collision with root package name */
        public static final int f12594m = 29;

        /* renamed from: n, reason: collision with root package name */
        public static final int f12595n = 30;

        /* renamed from: o, reason: collision with root package name */
        public static final int f12596o = 31;

        /* renamed from: p, reason: collision with root package name */
        public static final int f12597p = 32;

        /* renamed from: q, reason: collision with root package name */
        public static final int f12598q = 33;

        /* renamed from: r, reason: collision with root package name */
        public static final int f12599r = 34;

        /* renamed from: s, reason: collision with root package name */
        public static final int f12600s = 35;

        /* renamed from: t, reason: collision with root package name */
        public static final int f12601t = 36;

        public static boolean a(int i4) {
            return i4 == 34 || i4 == 35;
        }
    }

    public static void a(com.anythink.core.common.h.c cVar, boolean z6, int i4) {
        try {
            bv unitGroupInfo = cVar.e().getUnitGroupInfo();
            n i6 = cVar.i();
            ad R8 = unitGroupInfo.R();
            if (R8 != null) {
                a(R8, new aw(z6 ? 2 : 1, unitGroupInfo, i6), true, i4);
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
            n i6 = cVar.i();
            ad R8 = unitGroupInfo.R();
            if (R8 != null) {
                aw awVar = new aw(i4, unitGroupInfo, i6);
                int i9 = i4 == 2 ? 34 : i4 == 11 ? 36 : 30;
                unitGroupInfo.u();
                a(R8, awVar, true, i9);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(final n nVar, final List<bv> list, final long j6, final int i4, final int i6) {
        com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.b.d.c.1
            @Override // java.lang.Runnable
            public final void run() {
                if (n.this == null) {
                    k.x("BiddingUtil#sendFinishHBTracking", "placementTrackingInfo is null.");
                    return;
                }
                JSONArray jSONArray = new JSONArray();
                n.this.s(j6);
                n.this.t(System.currentTimeMillis());
                n.this.f14811t = i4;
                for (int i9 = 0; i9 < list.size(); i9++) {
                    bv bvVar = (bv) list.get(i9);
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
                            jSONObject.put(com.anythink.core.common.k.ap, bvVar.Q() ? String.valueOf(bvVar.at()) : "0");
                            jSONObject.put("nw_firm_id", String.valueOf(bvVar.g()));
                            jSONObject.put("tp_bid_id", bvVar.R() != null ? bvVar.R().f14211g : null);
                            jSONObject.put("rl_bid_status", bvVar.T());
                            jSONObject.put("errormsg", bvVar.F());
                            int ae = bvVar.ae();
                            String valueOf = String.valueOf(i6);
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
                            jSONObject.put(com.anythink.core.common.k.aN, bvVar.aQ());
                            jSONObject.put(com.anythink.core.common.k.aQ, bvVar.aS());
                            jSONObject.put("bid_floor", bvVar.ar());
                            jSONObject.put("en_p", R8 != null ? R8.getExtra() : "");
                            if (R8 != null && R8.t() != 0) {
                                jSONObject.put("deal_id", R8.v());
                                jSONObject.put("deal_type", R8.u());
                                n.this.B(R8.u());
                                n.this.C(R8.v());
                            }
                            jSONObject.put(com.anythink.core.common.k.bi, bvVar.bq());
                            jSONObject.put(com.anythink.core.common.k.bj, bvVar.bp());
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
                n.this.K(String.valueOf(i6));
                n.this.x(jSONArray.toString());
                com.anythink.core.common.u.c.a(t.b().g()).a(11, n.this);
            }
        });
    }

    public static void a(ad adVar, boolean z6, double d9, boolean z9, boolean z10) {
        if (adVar == null) {
            return;
        }
        double d10 = adVar.f14215l;
        String str = adVar.f14213j;
        int i4 = adVar.f14208d;
        if (d10 > 0.0d) {
            d9 *= d10;
        }
        if (z6) {
            if (TextUtils.isEmpty(str)) {
                str = adVar.displayNoticeUrl;
            }
            if (!TextUtils.isEmpty(str)) {
                a(str.replace(f12537b, com.anythink.core.b.d.a.a(adVar, d9)), (q) null);
            }
        } else {
            String str2 = adVar.displayNoticeUrl;
            if (!TextUtils.isEmpty(str2)) {
                a(str2.replace(f12537b, com.anythink.core.b.d.a.a(adVar, d9)).replace(f12539d, com.anythink.core.b.d.a.a(z9, 2, i4, z10)), (q) null);
            }
        }
        synchronized (adVar) {
            try {
                ATBiddingNotice aTBiddingNotice = adVar.biddingNotice;
                if (aTBiddingNotice != null) {
                    aTBiddingNotice.notifyBidDisplay(z6, d9);
                    if (z6) {
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
    public static void a(final ad adVar, final aw awVar, boolean z6, int i4) {
        boolean z9;
        boolean z10;
        int i6;
        boolean z11;
        double sortPrice;
        String str;
        double d9;
        String a9;
        int i9;
        boolean z12;
        int i10;
        final String str2;
        bv bvVar;
        final double d10;
        int i11;
        ad adVar2;
        int i12;
        double d11;
        boolean z13;
        int i13;
        int i14;
        Map<String, Object> map;
        boolean z14;
        double d12;
        String a10;
        aw awVar2;
        ad.a k9;
        double d13;
        Map<String, Object> aX;
        if (adVar == null) {
            return;
        }
        if (z6) {
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
        int i15 = adVar.f14208d;
        bv f2 = adVar.f();
        boolean z15 = false;
        if (f2 != null) {
            boolean z16 = ak.b(f2) && f2.R() != null && f2.R().s();
            double a11 = p.a(f2);
            double b9 = p.b(f2);
            int g9 = f2.g();
            z10 = f2.o();
            try {
                if (awVar.h() != 8 && (aX = f2.aX()) != null) {
                    ATAdMixBidInfo.BidEntity bidEntity = new ATAdMixBidInfo.BidEntity();
                    Object obj = aX.get(j.w.f13390A);
                    Object obj2 = aX.get(j.w.f13391B);
                    Object obj3 = aX.get(j.w.f13392C);
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
            z9 = z16;
            sortPrice2 = a11;
            i15 = g9;
            rmbPrice = b9;
        } else {
            z9 = false;
            z10 = true;
        }
        if (awVar.g() > 0.0d && awVar.g() > sortPrice2) {
            sortPrice2 = awVar.g();
            i15 = adVar.f14208d;
            z10 = true;
        }
        double c9 = awVar.c();
        String e10 = awVar.e();
        if (c9 > 0.0d) {
            sortPrice2 = c9;
            z11 = TextUtils.equals("102", e10) || TextUtils.equals("100", e10);
            i6 = -1;
        } else {
            i6 = i15;
            z11 = z10;
        }
        int h3 = awVar.h();
        double d14 = sortPrice2;
        if (adVar.f14208d == 28) {
            sortPrice = adVar.originPrice;
        } else {
            sortPrice = adVar.getSortPrice();
        }
        double d15 = sortPrice;
        int i16 = adVar.f14208d;
        double rmbPrice2 = adVar.getRmbPrice();
        if (d14 <= d15) {
            awVar.a(Double.valueOf(d14));
            double d16 = 0.01d;
            if (z9) {
                bv a12 = a(adVar);
                if (a12 != null) {
                    d13 = p.a(a12);
                }
                d13 = d15;
                int D8 = awVar.D();
                if (D8 == 2) {
                    str = e10;
                } else if (D8 != 3) {
                    if (D8 == 4) {
                        str = e10;
                        d9 = 0.0d;
                    } else if (D8 != 5) {
                        str = e10;
                        d16 = d13 + 0.01d;
                        d13 = ((d13 * 1.3d) - d16) * new Random(System.currentTimeMillis()).nextDouble();
                    } else {
                        str = e10;
                        d9 = -1.0d;
                    }
                }
                d9 = d13 + d16;
            } else {
                str = e10;
                d9 = d15 + 0.01d;
            }
            a9 = com.anythink.core.b.d.a.a(z11, h3, i16, z9);
            if (str != null) {
                a9 = str;
            }
            if (b.a(i4)) {
                double a13 = a(awVar.F());
                if (a13 > 0.0d && a13 > d9) {
                    d9 = a13;
                }
            }
            awVar.a(d9);
            awVar.a(a9);
            awVar.c(i6);
            awVar.b(rmbPrice);
            awVar.c(rmbPrice2);
            n z17 = awVar.z();
            z17.a(ab.a(awVar));
            com.anythink.core.common.u.c.a(t.b().g()).a(24, z17);
            awVar.a(adVar.biddingNotice != null);
            if (awVar.u() && a9.equals("-1")) {
                double d17 = d9;
                boolean z18 = z9;
                i11 = 1;
                String str3 = a9;
                i10 = i16;
                bvVar = f2;
                z12 = z11;
                i9 = i6;
                e.a(awVar, d17, str3, 0.0d, d17, adVar.getSortPrice(), adVar.j(), "200", "", z18);
                d10 = d17;
                str2 = str3;
                z9 = z18;
            } else {
                i9 = i6;
                z12 = z11;
                i10 = i16;
                str2 = a9;
                bvVar = f2;
                d10 = d9;
                i11 = 1;
            }
            double a14 = a(adVar, d10);
            com.anythink.core.common.v.d.a().a(awVar.z(), awVar.A(), com.anythink.core.common.v.d.f17518d, "2");
            if (awVar.f()) {
                com.anythink.core.common.a.a.a().a(adVar);
            }
            if (awVar.u() || str2.equals("-1")) {
                adVar2 = adVar;
                i12 = i10;
            } else {
                bv bvVar2 = bvVar;
                boolean z19 = z12;
                int i17 = i9;
                int i18 = i10;
                Map<String, Object> a15 = com.anythink.core.b.d.a.a(z19, i17, i18, bvVar2, adVar);
                if (awVar.h() == 8) {
                    a15.put(ATBiddingNotice.ADN_REQUEST_IS_SHOW, Integer.valueOf(i11));
                    int i19 = i11;
                    if (awVar.b() == i19) {
                        a15.put(ATBiddingNotice.ADN_REQUEST_IS_CLICK, Integer.valueOf(i19));
                    } else {
                        a15.put(ATBiddingNotice.ADN_REQUEST_IS_CLICK, 0);
                    }
                    if (awVar.a() != null) {
                        Map<String, Object> aX2 = bvVar2 != null ? bvVar2.aX() : null;
                        if (aX2 == null) {
                            aX2 = new HashMap<>();
                        }
                        ATAdMixBidInfo.BidEntity a16 = awVar.a();
                        aX2.put(j.w.f13390A, a16.getAdTittle());
                        aX2.put(j.w.f13391B, a16.getAdUserName());
                        a15.put(ATBiddingNotice.ADN_EXTRA_NATIVE_MATERIAL_INFO, aX2);
                    }
                }
                synchronized (adVar) {
                    try {
                        ATBiddingNotice aTBiddingNotice = adVar.biddingNotice;
                        if (aTBiddingNotice != null) {
                            try {
                                String a17 = com.anythink.core.b.d.a.a(z19, h3);
                                final double d18 = d10;
                                z13 = z19;
                                z14 = true;
                                final boolean z20 = z9;
                                try {
                                    ATIBiddingResultListener aTIBiddingResultListener = new ATIBiddingResultListener() { // from class: com.anythink.core.b.d.c.2

                                        /* renamed from: d, reason: collision with root package name */
                                        final /* synthetic */ double f12569d = 0.0d;

                                        @Override // com.anythink.core.api.ATIBiddingResultListener
                                        public final void reportFailed(int i20, String str4, Map<String, Object> map2) {
                                            if (isNeedWait()) {
                                                e.a(aw.this, d10, str2, this.f12569d, d18, adVar.getSortPrice(), adVar.j(), String.valueOf(i20), str4, z20);
                                            }
                                        }

                                        @Override // com.anythink.core.api.ATIBiddingResultListener
                                        public final void reportSuccess(Map<String, Object> map2) {
                                            if (isNeedWait()) {
                                                e.a(aw.this, d10, str2, this.f12569d, d18, adVar.getSortPrice(), adVar.j(), "200", "", z20);
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
                                        d11 = a14;
                                        i13 = i17;
                                        i14 = i18;
                                        map = a15;
                                        d12 = d10;
                                    } else {
                                        try {
                                            i13 = i17;
                                            try {
                                                z9 = z20;
                                                map = a15;
                                                i14 = i18;
                                                d11 = a14;
                                                try {
                                                    e.a(awVar, d10, str2, 0.0d, d10, adVar.getSortPrice(), adVar.j(), "200", "", z9);
                                                    d12 = d10;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    d12 = d10;
                                                    try {
                                                        th.printStackTrace();
                                                        Log.e("anythink", "notifyBidLoss: error: " + th.getMessage());
                                                        z15 = z14;
                                                        String str4 = str2;
                                                        final double d19 = d11;
                                                        a10 = com.anythink.core.b.d.a.a(adVar, awVar, i13, z13, d19, d15, str4, map);
                                                        final String str5 = str4;
                                                        if (TextUtils.isEmpty(a10)) {
                                                        }
                                                        awVar2 = awVar;
                                                        k9 = adVar.k();
                                                        adVar2 = adVar;
                                                        if (k9 != null) {
                                                        }
                                                        i12 = i14;
                                                        if (i12 != 28) {
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        throw th;
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                d11 = a14;
                                                z9 = z20;
                                                i14 = i18;
                                                map = a15;
                                                d12 = d10;
                                                th.printStackTrace();
                                                Log.e("anythink", "notifyBidLoss: error: " + th.getMessage());
                                                z15 = z14;
                                                String str42 = str2;
                                                final double d192 = d11;
                                                a10 = com.anythink.core.b.d.a.a(adVar, awVar, i13, z13, d192, d15, str42, map);
                                                final String str52 = str42;
                                                if (TextUtils.isEmpty(a10)) {
                                                }
                                                awVar2 = awVar;
                                                k9 = adVar.k();
                                                adVar2 = adVar;
                                                if (k9 != null) {
                                                }
                                                i12 = i14;
                                                if (i12 != 28) {
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            d11 = a14;
                                            z9 = z20;
                                            i13 = i17;
                                            i14 = i18;
                                            map = a15;
                                            d12 = d10;
                                            th.printStackTrace();
                                            Log.e("anythink", "notifyBidLoss: error: " + th.getMessage());
                                            z15 = z14;
                                            String str422 = str2;
                                            final double d1922 = d11;
                                            a10 = com.anythink.core.b.d.a.a(adVar, awVar, i13, z13, d1922, d15, str422, map);
                                            final String str522 = str422;
                                            if (TextUtils.isEmpty(a10)) {
                                            }
                                            awVar2 = awVar;
                                            k9 = adVar.k();
                                            adVar2 = adVar;
                                            if (k9 != null) {
                                            }
                                            i12 = i14;
                                            if (i12 != 28) {
                                            }
                                        }
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    z9 = z20;
                                    d11 = a14;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                d11 = a14;
                                z13 = z19;
                                i13 = i17;
                                i14 = i18;
                                map = a15;
                                z14 = true;
                            }
                            z15 = z14;
                        } else {
                            d11 = a14;
                            z13 = z19;
                            i13 = i17;
                            i14 = i18;
                            map = a15;
                            d12 = d10;
                        }
                        String str4222 = str2;
                        final double d19222 = d11;
                        a10 = com.anythink.core.b.d.a.a(adVar, awVar, i13, z13, d19222, d15, str4222, map);
                        final String str5222 = str4222;
                        if (TextUtils.isEmpty(a10)) {
                            final double d20 = d12;
                            final boolean z21 = z9;
                            final boolean z22 = z15;
                            final double d21 = d12;
                            com.anythink.core.common.m.b bVar = new com.anythink.core.common.m.b() { // from class: com.anythink.core.b.d.c.3

                                /* renamed from: f, reason: collision with root package name */
                                final /* synthetic */ double f12578f = 0.0d;

                                @Override // com.anythink.core.common.m.q
                                public final void onLoadError(int i20, String str6, AdError adError) {
                                    String str7;
                                    String str8;
                                    if (ad.this.biddingNotice != null || z22) {
                                        return;
                                    }
                                    if (adError != null) {
                                        str7 = adError.getPlatformCode();
                                        str8 = !TextUtils.isEmpty(adError.getPlatformMSG()) ? adError.getPlatformMSG() : adError.toString();
                                    } else {
                                        str7 = com.anythink.core.common.res.image.c.f17033a;
                                        str8 = "";
                                    }
                                    e.a(awVar, d21, str5222, this.f12578f, d20, ad.this.getSortPrice(), ad.this.j(), str7, str8, z21, d19222);
                                }

                                @Override // com.anythink.core.common.m.q
                                public final void onLoadFinish(int i20, Object obj4) {
                                    ad adVar3 = ad.this;
                                    if (adVar3.biddingNotice != null || z22) {
                                        return;
                                    }
                                    e.a(awVar, d21, str5222, this.f12578f, d20, adVar3.getSortPrice(), ad.this.j(), "200", "", z21, d19222);
                                }
                            };
                            str5222 = str5222;
                            d19222 = d19222;
                            a(a10, bVar);
                        } else {
                            double d22 = d12;
                            boolean z23 = z15;
                            if (adVar.biddingNotice == null && !z23) {
                                awVar2 = awVar;
                                e.a(awVar2, d22, str5222, 0.0d, d22, adVar.getSortPrice(), adVar.j(), "200", "", z9, d19222);
                                d19222 = d19222;
                                k9 = adVar.k();
                                adVar2 = adVar;
                                if (k9 != null) {
                                    k9.b(com.anythink.core.b.d.a.a(adVar2, awVar2, d19222, str5222));
                                }
                                i12 = i14;
                            }
                        }
                        awVar2 = awVar;
                        k9 = adVar.k();
                        adVar2 = adVar;
                        if (k9 != null) {
                        }
                        i12 = i14;
                    } catch (Throwable th7) {
                        th = th7;
                    }
                }
            }
            if (i12 != 28) {
                adVar2.e();
                adVar2.h();
                return;
            }
            return;
        }
        str = e10;
        d9 = d14;
        a9 = com.anythink.core.b.d.a.a(z11, h3, i16, z9);
        if (str != null) {
        }
        if (b.a(i4)) {
        }
        awVar.a(d9);
        awVar.a(a9);
        awVar.c(i6);
        awVar.b(rmbPrice);
        awVar.c(rmbPrice2);
        n z172 = awVar.z();
        z172.a(ab.a(awVar));
        com.anythink.core.common.u.c.a(t.b().g()).a(24, z172);
        awVar.a(adVar.biddingNotice != null);
        if (awVar.u()) {
        }
        i9 = i6;
        z12 = z11;
        i10 = i16;
        str2 = a9;
        bvVar = f2;
        d10 = d9;
        i11 = 1;
        double a142 = a(adVar, d10);
        com.anythink.core.common.v.d.a().a(awVar.z(), awVar.A(), com.anythink.core.common.v.d.f17518d, "2");
        if (awVar.f()) {
        }
        if (awVar.u()) {
        }
        adVar2 = adVar;
        i12 = i10;
        if (i12 != 28) {
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
        R8.f14225v = cdVar;
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

    private static double a(ad adVar, double d9) {
        double d10 = adVar.f14215l;
        return d10 > 0.0d ? d9 * d10 : d9;
    }

    private static double a(int i4, double d9, double d10) {
        if (i4 == 2) {
            return d10 + 0.01d;
        }
        if (i4 == 3) {
            return d9;
        }
        if (i4 == 4) {
            return 0.0d;
        }
        if (i4 == 5) {
            return -1.0d;
        }
        double d11 = 0.01d + d10;
        return (((d10 * 1.3d) - d11) * new Random(System.currentTimeMillis()).nextDouble()) + d11;
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
        ad.a k9;
        if (adVar == null || bvVar == null || (cdVar = adVar.f14225v) == null || adVar.d()) {
            return;
        }
        cdVar.a(i4);
        double a9 = p.a(bvVar);
        double b9 = p.b(bvVar);
        double d9 = adVar.f14221r;
        Double a10 = cdVar.a();
        double doubleValue = a10 != null ? a10.doubleValue() : d9;
        if (adVar.s() || (doubleValue <= a9 && doubleValue > 0.0d)) {
            d9 = doubleValue;
        } else if (d9 != 0.0d) {
            cdVar.a(Double.valueOf(doubleValue));
            d9 = a9 - 0.01d;
            if (d9 < 0.0d) {
                d9 = 0.0d;
            }
        }
        if (bvVar.g() == 8) {
            double ar = bvVar.ar();
            if (ar > 0.0d && ar > d9) {
                d9 = ar;
            }
        }
        if (b.a(i4)) {
            double a11 = a(cdVar.C());
            if (a11 > 0.0d) {
                if (a11 <= d9) {
                    String z6 = bvVar.z();
                    bv l9 = adVar.l();
                    String z9 = l9 != null ? l9.z() : "";
                    if (!TextUtils.isEmpty(z6)) {
                    }
                }
                d9 = a11;
            }
        }
        cdVar.a(a9);
        cdVar.b(d9);
        cdVar.c(b9);
        cdVar.s();
        cdVar.d(d9);
        cdVar.b(Double.valueOf(adVar.j()));
        double a12 = a(adVar, a9);
        double a13 = a(adVar, d9);
        boolean v9 = cdVar.v();
        com.anythink.core.common.v.d.a().a(cdVar.y(), bvVar, com.anythink.core.common.v.d.f17518d, "1");
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
