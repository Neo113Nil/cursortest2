package com.anythink.core.common.d;

import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATCustomContentResult;
import com.anythink.core.api.ATRewardInfo;
import com.anythink.core.api.BaseAd;
import com.anythink.core.basead.adx.api.IATAdxHandler;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.aa;
import com.anythink.core.common.h.ad;
import com.anythink.core.d.l;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l extends ATAdInfo {

    /* renamed from: C, reason: collision with root package name */
    private Map<String, Object> f12669C;

    /* renamed from: H, reason: collision with root package name */
    private Map<String, Object> f12674H;

    /* renamed from: K, reason: collision with root package name */
    private double f12676K;

    /* renamed from: a, reason: collision with root package name */
    private ATBaseAdAdapter f12686a;

    /* renamed from: f, reason: collision with root package name */
    private double f12691f;

    /* renamed from: g, reason: collision with root package name */
    private String f12692g;

    /* renamed from: h, reason: collision with root package name */
    private String f12693h;
    private int i;

    /* renamed from: m, reason: collision with root package name */
    private Double f12697m;

    /* renamed from: b, reason: collision with root package name */
    private int f12687b = -1;

    /* renamed from: c, reason: collision with root package name */
    private String f12688c = "";

    /* renamed from: d, reason: collision with root package name */
    private int f12689d = -1;

    /* renamed from: e, reason: collision with root package name */
    private double f12690e = 0.0d;

    /* renamed from: j, reason: collision with root package name */
    private int f12694j = 0;

    /* renamed from: k, reason: collision with root package name */
    private String f12695k = "";

    /* renamed from: l, reason: collision with root package name */
    private Double f12696l = Double.valueOf(0.0d);

    /* renamed from: n, reason: collision with root package name */
    private String f12698n = "";

    /* renamed from: o, reason: collision with root package name */
    private String f12699o = "";

    /* renamed from: p, reason: collision with root package name */
    private String f12700p = "";

    /* renamed from: q, reason: collision with root package name */
    private String f12701q = "";

    /* renamed from: r, reason: collision with root package name */
    private String f12702r = "unknow";

    /* renamed from: s, reason: collision with root package name */
    private String f12703s = "Network";

    /* renamed from: t, reason: collision with root package name */
    private String f12704t = "";

    /* renamed from: u, reason: collision with root package name */
    private int f12705u = 1;

    /* renamed from: v, reason: collision with root package name */
    private int f12706v = 0;

    /* renamed from: w, reason: collision with root package name */
    private String f12707w = "";

    /* renamed from: x, reason: collision with root package name */
    private String f12708x = "";

    /* renamed from: y, reason: collision with root package name */
    private int f12709y = 0;

    /* renamed from: z, reason: collision with root package name */
    private String f12710z = "";

    /* renamed from: A, reason: collision with root package name */
    private String f12667A = "";

    /* renamed from: B, reason: collision with root package name */
    private Map<String, Object> f12668B = null;

    /* renamed from: D, reason: collision with root package name */
    private String f12670D = "";

    /* renamed from: E, reason: collision with root package name */
    private int f12671E = 0;

    /* renamed from: F, reason: collision with root package name */
    private String f12672F = "";

    /* renamed from: G, reason: collision with root package name */
    private int f12673G = 0;

    /* renamed from: I, reason: collision with root package name */
    private int f12675I = 1;
    private String J = "";

    /* renamed from: L, reason: collision with root package name */
    private IATAdxHandler f12677L = null;

    /* renamed from: M, reason: collision with root package name */
    private int f12678M = -1;

    /* renamed from: N, reason: collision with root package name */
    private String f12679N = "";

    /* renamed from: P, reason: collision with root package name */
    private String f12681P = "";

    /* renamed from: Q, reason: collision with root package name */
    private String f12682Q = "";

    /* renamed from: O, reason: collision with root package name */
    private Map<String, String> f12680O = new HashMap();

    /* renamed from: R, reason: collision with root package name */
    private String f12683R = "";

    /* renamed from: T, reason: collision with root package name */
    private ATCustomContentResult f12685T = null;

    /* renamed from: S, reason: collision with root package name */
    private int f12684S = 0;

    /* renamed from: com.anythink.core.common.d.l$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12711a;

        static {
            int[] iArr = new int[ATAdConst.CURRENCY.values().length];
            f12711a = iArr;
            try {
                iArr[ATAdConst.CURRENCY.RMB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12711a[ATAdConst.CURRENCY.RMB_CENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12711a[ATAdConst.CURRENCY.USD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r10 != 5) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (r1.f13359g == 3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        r9.M();
        r8.f12690e = 0.0d;
        r8.f12691f = 0.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r1.f13358f == 3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r1.f13357e == 3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (r1.f13356d == 3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        if (r1.f13360h == 3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0105, code lost:
    
        if (r10.equals(com.anythink.core.common.h.ad.f13400y) == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static l a(l lVar, com.anythink.core.common.h.n nVar, int i) {
        String str;
        ATRewardInfo F8;
        ATRewardInfo aTRewardInfo;
        char c9 = 2;
        lVar.f12687b = nVar.Y();
        lVar.f12688c = nVar.M();
        lVar.f12689d = nVar.P();
        lVar.f12694j = nVar.J();
        lVar.f12690e = nVar.p();
        lVar.f12691f = nVar.q();
        if (nVar.J() == 1) {
            aa ap = nVar.ap();
            Objects.toString(ap);
            if (ap != null) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                }
                            }
                        }
                    }
                }
            }
            nVar.M();
        }
        lVar.f12692g = nVar.r();
        lVar.f12693h = nVar.s();
        lVar.i = nVar.t();
        lVar.f12676K = nVar.e();
        lVar.f12698n = nVar.v();
        lVar.f12695k = nVar.z();
        lVar.f12696l = Double.valueOf(lVar.f12690e / 1000.0d);
        lVar.f12697m = Double.valueOf(lVar.f12691f / 1000.0d);
        lVar.f12699o = nVar.C();
        lVar.f12701q = com.anythink.core.common.v.p.f(nVar.aK());
        String aI = nVar.aI();
        String g4 = nVar.g();
        if (TextUtils.isEmpty(g4) || TextUtils.equals(aI, g4)) {
            str = "";
        } else {
            str = aI;
            aI = g4;
        }
        lVar.f12700p = aI;
        lVar.J = str;
        lVar.f12702r = nVar.B();
        if (nVar.Y() == 35) {
            lVar.f12703s = "Cross_Promotion";
        } else if (nVar.Y() == 66) {
            String au = nVar.au();
            au.getClass();
            switch (au.hashCode()) {
                case 2545:
                    if (au.equals(ad.f13394A)) {
                        c9 = 0;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 2548:
                    if (au.equals(ad.f13401z)) {
                        c9 = 1;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 79054:
                    break;
                default:
                    c9 = 65535;
                    break;
            }
            switch (c9) {
                case 0:
                    lVar.f12703s = "Adx_pa";
                    break;
                case 1:
                    lVar.f12703s = "Adx_pd";
                    break;
                case 2:
                    lVar.f12703s = "Adx_pdb";
                    break;
                default:
                    lVar.f12703s = "Adx";
                    break;
            }
        } else {
            lVar.f12703s = "Network";
        }
        lVar.f12704t = nVar.y();
        lVar.f12705u = nVar.A();
        lVar.f12706v = nVar.Z();
        lVar.f12707w = nVar.f14011F;
        if (TextUtils.equals(j.n.f12506b, lVar.f12701q)) {
            Map<String, ATRewardInfo> E8 = nVar.E();
            if (E8 != null && E8.containsKey(lVar.f12707w) && (aTRewardInfo = E8.get(lVar.f12707w)) != null) {
                lVar.f12708x = aTRewardInfo.rewardName;
                lVar.f12709y = aTRewardInfo.rewardNumber;
            }
            if ((TextUtils.isEmpty(lVar.f12708x) || lVar.f12709y == 0) && (F8 = nVar.F()) != null) {
                lVar.f12708x = F8.rewardName;
                lVar.f12709y = F8.rewardNumber;
            }
        }
        lVar.f12667A = t.b().n();
        lVar.f12710z = t.b().o();
        lVar.f12668B = nVar.G();
        lVar.f12670D = nVar.o();
        lVar.f12671E = nVar.ae();
        lVar.f12672F = nVar.aB();
        lVar.f12673G = nVar.aG();
        Map<String, Object> j6 = nVar.j();
        if (j6 != null) {
            lVar.f12674H = new HashMap(j6);
        }
        lVar.f12675I = nVar.i();
        Map<String, String> al = nVar.al();
        if (al != null) {
            lVar.f12680O = new HashMap(al);
        }
        lVar.f12681P = nVar.aF();
        lVar.f12682Q = nVar.ak();
        lVar.f12683R = nVar.aJ();
        lVar.f12685T = nVar.aq();
        lVar.f12684S = com.anythink.core.common.v.p.e(nVar.k());
        return lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r5 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r0.f13359g == 3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r4.M();
        r3.f12690e = 0.0d;
        r3.f12691f = 0.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        if (r0.f13358f == 3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
    
        if (r0.f13357e == 3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
    
        if (r0.f13356d == 3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
    
        if (r0.f13360h == 3) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(l lVar, com.anythink.core.common.h.n nVar, int i) {
        lVar.f12690e = nVar.p();
        lVar.f12691f = nVar.q();
        if (nVar.J() != 1) {
            return;
        }
        aa ap = nVar.ap();
        Objects.toString(ap);
        if (ap != null) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                            }
                        }
                    }
                }
            }
        }
        nVar.M();
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getABTestId() {
        return this.f12673G;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getAdNetworkType() {
        return this.f12703s;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getAdSourceAdType() {
        return this.f12678M;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getAdSourceCustomExt() {
        return this.f12679N;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getAdsourceId() {
        return this.f12688c;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getAdsourceIndex() {
        return this.f12689d;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final IATAdxHandler getAdxHandler() {
        return this.f12677L;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final double getBidFloor() {
        return this.f12676K;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getBidType() {
        return this.f12684S;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getChannel() {
        return this.f12667A;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getCountry() {
        return this.f12699o;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getCurrency() {
        return this.f12698n;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final ATCustomContentResult getCustomContentResult() {
        return this.f12685T;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getCustomRule() {
        return this.f12668B != null ? new JSONObject(this.f12668B).toString() : "";
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getDismissType() {
        return this.f12671E;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final double getEcpm() {
        return this.f12690e;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getEcpmLevel() {
        return this.f12705u;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getEcpmPrecision() {
        return this.f12702r;
    }

    @Override // com.anythink.core.api.ATAdInfo
    @Deprecated
    public final double getEcpmWithCurrency(ATAdConst.CURRENCY currency) {
        return com.anythink.core.common.v.t.a(this.f12690e, com.anythink.core.common.v.t.a(this.f12698n), currency);
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getEncEcpmInfo() {
        return this.f12692g;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final Map<String, Object> getExtInfoMap() {
        return this.f12669C;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getFormat() {
        return this.f12701q;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final Map<String, Object> getLocalExtra() {
        return this.f12674H;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getNetworkFirmId() {
        return this.f12687b;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getNetworkName() {
        return this.f12681P;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getNetworkPlacementId() {
        return this.f12704t;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getPlacementId() {
        return this.f12700p;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getPlacementType() {
        return this.f12675I;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final Double getPublisherRevenue() {
        return this.f12696l;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getRequestId() {
        return this.f12683R;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getRewardUserCustomData() {
        ATBaseAdAdapter aTBaseAdAdapter = this.f12686a;
        return aTBaseAdAdapter != null ? aTBaseAdAdapter.getUserCustomData() : "";
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getRmbEncEcpmInfo() {
        return this.f12693h;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getScenarioId() {
        return this.f12707w;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getScenarioRewardName() {
        return this.f12708x;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getScenarioRewardNumber() {
        return this.f12709y;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getSecretId() {
        return this.i;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getSegmentId() {
        return this.f12706v;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getSharedPlacementId() {
        return this.J;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getShowCustomExt() {
        return this.f12682Q;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getShowId() {
        return this.f12695k;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getSubChannel() {
        return this.f12710z;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getTopOnAdFormat() {
        return this.f12701q;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getTopOnPlacementId() {
        return this.f12700p;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getTpBidId() {
        return this.f12670D;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final Map<String, String> getUrlTagParams() {
        return this.f12680O;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getWaterfallId() {
        return this.f12672F;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int isHeaderBiddingAdsource() {
        return this.f12694j;
    }

    public final String toString() {
        return a().toString();
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final double getEcpm(ATAdConst.CURRENCY currency) {
        int i = AnonymousClass1.f12711a[currency.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? getEcpmWithCurrency(currency) : this.f12690e : this.f12691f * 100.0d : this.f12691f;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final Double getPublisherRevenue(ATAdConst.CURRENCY currency) {
        int i = AnonymousClass1.f12711a[currency.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? getPublisherRevenue() : this.f12696l : Double.valueOf(this.f12697m.doubleValue() * 100.0d) : this.f12697m;
    }

    public final void b(double d2) {
        this.f12691f = d2;
        this.f12697m = Double.valueOf(d2 / 1000.0d);
    }

    public static l a(BaseAd baseAd, ATBaseAdAdapter aTBaseAdAdapter) {
        return a(baseAd, aTBaseAdAdapter, 0);
    }

    public static l a(BaseAd baseAd, ATBaseAdAdapter aTBaseAdAdapter, int i) {
        if (baseAd != null) {
            l a9 = a(a(baseAd.getDetail(), i), aTBaseAdAdapter);
            a9.f12669C = baseAd.getNetworkInfoMap();
            return a9;
        }
        return new l();
    }

    private static l a(l lVar, f fVar) {
        if (fVar != null && (fVar instanceof ATBaseAdAdapter)) {
            ATBaseAdAdapter aTBaseAdAdapter = (ATBaseAdAdapter) fVar;
            lVar.f12686a = aTBaseAdAdapter;
            lVar.f12669C = aTBaseAdAdapter.getInternalNetworkInfoMap();
            lVar.f12678M = lVar.f12686a.getTrackingInfo().ad();
            lVar.f12679N = aTBaseAdAdapter.getAdCustomExt();
            try {
                if (lVar.f12686a.getTrackingInfo().ah()) {
                    lVar.f12677L = lVar.f12686a.getUnitGroupInfo().R().i();
                    return lVar;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return lVar;
    }

    public static l a(f fVar) {
        return a(fVar, 0);
    }

    public static l a(f fVar, int i) {
        if (fVar != null) {
            return a(a(fVar.getTrackingInfo(), i), fVar);
        }
        return new l();
    }

    public static l a(com.anythink.core.common.h.n nVar, f fVar, int i) {
        return a(a(nVar, i), fVar);
    }

    public static l a(com.anythink.core.common.h.n nVar, f fVar) {
        return a(nVar, fVar, 0);
    }

    private static l a(com.anythink.core.common.h.n nVar, int i) {
        l lVar = new l();
        return nVar != null ? a(lVar, nVar, i) : lVar;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f12695k);
            jSONObject.put("publisher_revenue", this.f12696l);
            jSONObject.put("publisher_revenue_cny", this.f12697m);
            jSONObject.put("currency", this.f12698n);
            jSONObject.put("country", this.f12699o);
            jSONObject.put("adunit_id", this.f12700p);
            jSONObject.put("adunit_format", this.f12701q);
            jSONObject.put(com.anythink.core.common.k.f14296T, this.f12702r);
            jSONObject.put("network_type", this.f12703s);
            jSONObject.put("network_placement_id", this.f12704t);
            jSONObject.put(com.anythink.core.common.k.f14295S, this.f12705u);
            jSONObject.put("segment_id", this.f12706v);
            if (!TextUtils.isEmpty(this.f12707w)) {
                jSONObject.put("scenario_id", this.f12707w);
            }
            if (!TextUtils.isEmpty(this.f12708x) && this.f12709y != 0) {
                jSONObject.put("scenario_reward_name", this.f12708x);
                jSONObject.put("scenario_reward_number", this.f12709y);
            }
            if (!TextUtils.isEmpty(this.f12667A)) {
                jSONObject.put("channel", this.f12667A);
            }
            if (!TextUtils.isEmpty(this.f12710z)) {
                jSONObject.put("sub_channel", this.f12710z);
            }
            Map<String, Object> map = this.f12668B;
            if (map != null && map.size() > 0) {
                jSONObject.put("custom_rule", new JSONObject(this.f12668B));
            }
            jSONObject.put("network_firm_id", this.f12687b);
            jSONObject.put("adsource_id", this.f12688c);
            jSONObject.put("adsource_index", this.f12689d);
            jSONObject.put("adsource_price", this.f12690e);
            jSONObject.put("adsource_price_cny", this.f12691f);
            jSONObject.put("adsource_isheaderbidding", this.f12694j);
            Map<String, Object> map2 = this.f12669C;
            if (map2 != null && map2.size() > 0) {
                jSONObject.put("ext_info", new JSONObject(this.f12669C));
            }
            ATBaseAdAdapter aTBaseAdAdapter = this.f12686a;
            if (aTBaseAdAdapter != null) {
                jSONObject.put("reward_custom_data", aTBaseAdAdapter.getUserCustomData());
            }
            if (!TextUtils.isEmpty(this.f12670D)) {
                jSONObject.put("tp_bid_id", this.f12670D);
            }
            int i = this.f12671E;
            if (i != 0) {
                jSONObject.put("dismiss_type", i);
            }
            if (!TextUtils.isEmpty(this.f12672F)) {
                jSONObject.put(l.a.f17401T, this.f12672F);
            }
            jSONObject.put(com.anythink.core.common.m.e.J, this.f12673G);
            Map<String, Object> map3 = this.f12674H;
            if (map3 != null && map3.size() > 0) {
                jSONObject.put("user_load_extra_data", new JSONObject(this.f12674H));
            }
            jSONObject.put("placement_type", this.f12675I);
            if (!TextUtils.isEmpty(this.J)) {
                jSONObject.put("shared_placement_id", this.J);
            }
            jSONObject.put("bid_floor", this.f12676K);
            jSONObject.put("ad_source_type", this.f12678M);
            jSONObject.put("ad_source_custom_ext", this.f12679N);
            jSONObject.put("url_tag_params", this.f12680O);
            jSONObject.put(ATAdConst.NETWORK_CUSTOM_KEY.NETWORK_NAME, this.f12681P);
            jSONObject.put("show_custom_ext", this.f12682Q);
            if (!TextUtils.isEmpty(this.f12692g)) {
                jSONObject.put(com.anythink.core.common.k.aS, this.f12692g);
            }
            if (!TextUtils.isEmpty(this.f12693h)) {
                jSONObject.put(com.anythink.core.common.k.aT, this.f12693h);
            }
            jSONObject.put(l.a.aD, this.i);
            jSONObject.put("req_id", this.f12683R);
            jSONObject.put(com.anythink.core.common.k.J, this.f12684S);
            return jSONObject;
        } catch (Throwable th) {
            th.printStackTrace();
            return jSONObject;
        }
    }

    public final void a(double d2) {
        this.f12690e = d2;
        this.f12696l = Double.valueOf(d2 / 1000.0d);
    }
}
