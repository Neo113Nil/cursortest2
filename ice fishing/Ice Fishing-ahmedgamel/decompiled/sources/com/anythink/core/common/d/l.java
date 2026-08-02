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
    private Map<String, Object> f13455C;

    /* renamed from: H, reason: collision with root package name */
    private Map<String, Object> f13460H;

    /* renamed from: K, reason: collision with root package name */
    private double f13462K;

    /* renamed from: a, reason: collision with root package name */
    private ATBaseAdAdapter f13472a;

    /* renamed from: f, reason: collision with root package name */
    private double f13477f;

    /* renamed from: g, reason: collision with root package name */
    private String f13478g;

    /* renamed from: h, reason: collision with root package name */
    private String f13479h;
    private int i;

    /* renamed from: m, reason: collision with root package name */
    private Double f13483m;

    /* renamed from: b, reason: collision with root package name */
    private int f13473b = -1;

    /* renamed from: c, reason: collision with root package name */
    private String f13474c = "";

    /* renamed from: d, reason: collision with root package name */
    private int f13475d = -1;

    /* renamed from: e, reason: collision with root package name */
    private double f13476e = 0.0d;

    /* renamed from: j, reason: collision with root package name */
    private int f13480j = 0;

    /* renamed from: k, reason: collision with root package name */
    private String f13481k = "";

    /* renamed from: l, reason: collision with root package name */
    private Double f13482l = Double.valueOf(0.0d);

    /* renamed from: n, reason: collision with root package name */
    private String f13484n = "";

    /* renamed from: o, reason: collision with root package name */
    private String f13485o = "";

    /* renamed from: p, reason: collision with root package name */
    private String f13486p = "";

    /* renamed from: q, reason: collision with root package name */
    private String f13487q = "";

    /* renamed from: r, reason: collision with root package name */
    private String f13488r = "unknow";

    /* renamed from: s, reason: collision with root package name */
    private String f13489s = "Network";

    /* renamed from: t, reason: collision with root package name */
    private String f13490t = "";

    /* renamed from: u, reason: collision with root package name */
    private int f13491u = 1;

    /* renamed from: v, reason: collision with root package name */
    private int f13492v = 0;

    /* renamed from: w, reason: collision with root package name */
    private String f13493w = "";

    /* renamed from: x, reason: collision with root package name */
    private String f13494x = "";

    /* renamed from: y, reason: collision with root package name */
    private int f13495y = 0;

    /* renamed from: z, reason: collision with root package name */
    private String f13496z = "";

    /* renamed from: A, reason: collision with root package name */
    private String f13453A = "";

    /* renamed from: B, reason: collision with root package name */
    private Map<String, Object> f13454B = null;

    /* renamed from: D, reason: collision with root package name */
    private String f13456D = "";

    /* renamed from: E, reason: collision with root package name */
    private int f13457E = 0;

    /* renamed from: F, reason: collision with root package name */
    private String f13458F = "";

    /* renamed from: G, reason: collision with root package name */
    private int f13459G = 0;

    /* renamed from: I, reason: collision with root package name */
    private int f13461I = 1;
    private String J = "";

    /* renamed from: L, reason: collision with root package name */
    private IATAdxHandler f13463L = null;

    /* renamed from: M, reason: collision with root package name */
    private int f13464M = -1;

    /* renamed from: N, reason: collision with root package name */
    private String f13465N = "";

    /* renamed from: P, reason: collision with root package name */
    private String f13467P = "";

    /* renamed from: Q, reason: collision with root package name */
    private String f13468Q = "";

    /* renamed from: O, reason: collision with root package name */
    private Map<String, String> f13466O = new HashMap();

    /* renamed from: R, reason: collision with root package name */
    private String f13469R = "";

    /* renamed from: T, reason: collision with root package name */
    private ATCustomContentResult f13471T = null;

    /* renamed from: S, reason: collision with root package name */
    private int f13470S = 0;

    /* renamed from: com.anythink.core.common.d.l$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13497a;

        static {
            int[] iArr = new int[ATAdConst.CURRENCY.values().length];
            f13497a = iArr;
            try {
                iArr[ATAdConst.CURRENCY.RMB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13497a[ATAdConst.CURRENCY.RMB_CENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13497a[ATAdConst.CURRENCY.USD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r10 != 5) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (r1.f14145g == 3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        r9.M();
        r8.f13476e = 0.0d;
        r8.f13477f = 0.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r1.f14144f == 3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r1.f14143e == 3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (r1.f14142d == 3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        if (r1.f14146h == 3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0105, code lost:
    
        if (r10.equals(com.anythink.core.common.h.ad.f14186y) == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static l a(l lVar, com.anythink.core.common.h.n nVar, int i) {
        String str;
        ATRewardInfo F8;
        ATRewardInfo aTRewardInfo;
        char c9 = 2;
        lVar.f13473b = nVar.Y();
        lVar.f13474c = nVar.M();
        lVar.f13475d = nVar.P();
        lVar.f13480j = nVar.J();
        lVar.f13476e = nVar.p();
        lVar.f13477f = nVar.q();
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
        lVar.f13478g = nVar.r();
        lVar.f13479h = nVar.s();
        lVar.i = nVar.t();
        lVar.f13462K = nVar.e();
        lVar.f13484n = nVar.v();
        lVar.f13481k = nVar.z();
        lVar.f13482l = Double.valueOf(lVar.f13476e / 1000.0d);
        lVar.f13483m = Double.valueOf(lVar.f13477f / 1000.0d);
        lVar.f13485o = nVar.C();
        lVar.f13487q = com.anythink.core.common.v.p.f(nVar.aK());
        String aI = nVar.aI();
        String g9 = nVar.g();
        if (TextUtils.isEmpty(g9) || TextUtils.equals(aI, g9)) {
            str = "";
        } else {
            str = aI;
            aI = g9;
        }
        lVar.f13486p = aI;
        lVar.J = str;
        lVar.f13488r = nVar.B();
        if (nVar.Y() == 35) {
            lVar.f13489s = "Cross_Promotion";
        } else if (nVar.Y() == 66) {
            String au = nVar.au();
            au.getClass();
            switch (au.hashCode()) {
                case 2545:
                    if (au.equals(ad.f14180A)) {
                        c9 = 0;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 2548:
                    if (au.equals(ad.f14187z)) {
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
                    lVar.f13489s = "Adx_pa";
                    break;
                case 1:
                    lVar.f13489s = "Adx_pd";
                    break;
                case 2:
                    lVar.f13489s = "Adx_pdb";
                    break;
                default:
                    lVar.f13489s = "Adx";
                    break;
            }
        } else {
            lVar.f13489s = "Network";
        }
        lVar.f13490t = nVar.y();
        lVar.f13491u = nVar.A();
        lVar.f13492v = nVar.Z();
        lVar.f13493w = nVar.f14797F;
        if (TextUtils.equals(j.n.f13292b, lVar.f13487q)) {
            Map<String, ATRewardInfo> E8 = nVar.E();
            if (E8 != null && E8.containsKey(lVar.f13493w) && (aTRewardInfo = E8.get(lVar.f13493w)) != null) {
                lVar.f13494x = aTRewardInfo.rewardName;
                lVar.f13495y = aTRewardInfo.rewardNumber;
            }
            if ((TextUtils.isEmpty(lVar.f13494x) || lVar.f13495y == 0) && (F8 = nVar.F()) != null) {
                lVar.f13494x = F8.rewardName;
                lVar.f13495y = F8.rewardNumber;
            }
        }
        lVar.f13453A = t.b().n();
        lVar.f13496z = t.b().o();
        lVar.f13454B = nVar.G();
        lVar.f13456D = nVar.o();
        lVar.f13457E = nVar.ae();
        lVar.f13458F = nVar.aB();
        lVar.f13459G = nVar.aG();
        Map<String, Object> j6 = nVar.j();
        if (j6 != null) {
            lVar.f13460H = new HashMap(j6);
        }
        lVar.f13461I = nVar.i();
        Map<String, String> al = nVar.al();
        if (al != null) {
            lVar.f13466O = new HashMap(al);
        }
        lVar.f13467P = nVar.aF();
        lVar.f13468Q = nVar.ak();
        lVar.f13469R = nVar.aJ();
        lVar.f13471T = nVar.aq();
        lVar.f13470S = com.anythink.core.common.v.p.e(nVar.k());
        return lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r5 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r0.f14145g == 3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r4.M();
        r3.f13476e = 0.0d;
        r3.f13477f = 0.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        if (r0.f14144f == 3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
    
        if (r0.f14143e == 3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
    
        if (r0.f14142d == 3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
    
        if (r0.f14146h == 3) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(l lVar, com.anythink.core.common.h.n nVar, int i) {
        lVar.f13476e = nVar.p();
        lVar.f13477f = nVar.q();
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
        return this.f13459G;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getAdNetworkType() {
        return this.f13489s;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getAdSourceAdType() {
        return this.f13464M;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getAdSourceCustomExt() {
        return this.f13465N;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getAdsourceId() {
        return this.f13474c;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getAdsourceIndex() {
        return this.f13475d;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final IATAdxHandler getAdxHandler() {
        return this.f13463L;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final double getBidFloor() {
        return this.f13462K;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getBidType() {
        return this.f13470S;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getChannel() {
        return this.f13453A;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getCountry() {
        return this.f13485o;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getCurrency() {
        return this.f13484n;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final ATCustomContentResult getCustomContentResult() {
        return this.f13471T;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getCustomRule() {
        return this.f13454B != null ? new JSONObject(this.f13454B).toString() : "";
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getDismissType() {
        return this.f13457E;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final double getEcpm() {
        return this.f13476e;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getEcpmLevel() {
        return this.f13491u;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getEcpmPrecision() {
        return this.f13488r;
    }

    @Override // com.anythink.core.api.ATAdInfo
    @Deprecated
    public final double getEcpmWithCurrency(ATAdConst.CURRENCY currency) {
        return com.anythink.core.common.v.t.a(this.f13476e, com.anythink.core.common.v.t.a(this.f13484n), currency);
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getEncEcpmInfo() {
        return this.f13478g;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final Map<String, Object> getExtInfoMap() {
        return this.f13455C;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getFormat() {
        return this.f13487q;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final Map<String, Object> getLocalExtra() {
        return this.f13460H;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getNetworkFirmId() {
        return this.f13473b;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getNetworkName() {
        return this.f13467P;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getNetworkPlacementId() {
        return this.f13490t;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getPlacementId() {
        return this.f13486p;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getPlacementType() {
        return this.f13461I;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final Double getPublisherRevenue() {
        return this.f13482l;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getRequestId() {
        return this.f13469R;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getRewardUserCustomData() {
        ATBaseAdAdapter aTBaseAdAdapter = this.f13472a;
        return aTBaseAdAdapter != null ? aTBaseAdAdapter.getUserCustomData() : "";
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getRmbEncEcpmInfo() {
        return this.f13479h;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getScenarioId() {
        return this.f13493w;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getScenarioRewardName() {
        return this.f13494x;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getScenarioRewardNumber() {
        return this.f13495y;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getSecretId() {
        return this.i;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int getSegmentId() {
        return this.f13492v;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getSharedPlacementId() {
        return this.J;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getShowCustomExt() {
        return this.f13468Q;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getShowId() {
        return this.f13481k;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getSubChannel() {
        return this.f13496z;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getTopOnAdFormat() {
        return this.f13487q;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getTopOnPlacementId() {
        return this.f13486p;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getTpBidId() {
        return this.f13456D;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final Map<String, String> getUrlTagParams() {
        return this.f13466O;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final String getWaterfallId() {
        return this.f13458F;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final int isHeaderBiddingAdsource() {
        return this.f13480j;
    }

    public final String toString() {
        return a().toString();
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final double getEcpm(ATAdConst.CURRENCY currency) {
        int i = AnonymousClass1.f13497a[currency.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? getEcpmWithCurrency(currency) : this.f13476e : this.f13477f * 100.0d : this.f13477f;
    }

    @Override // com.anythink.core.api.ATAdInfo
    public final Double getPublisherRevenue(ATAdConst.CURRENCY currency) {
        int i = AnonymousClass1.f13497a[currency.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? getPublisherRevenue() : this.f13482l : Double.valueOf(this.f13483m.doubleValue() * 100.0d) : this.f13483m;
    }

    public final void b(double d9) {
        this.f13477f = d9;
        this.f13483m = Double.valueOf(d9 / 1000.0d);
    }

    public static l a(BaseAd baseAd, ATBaseAdAdapter aTBaseAdAdapter) {
        return a(baseAd, aTBaseAdAdapter, 0);
    }

    public static l a(BaseAd baseAd, ATBaseAdAdapter aTBaseAdAdapter, int i) {
        if (baseAd != null) {
            l a9 = a(a(baseAd.getDetail(), i), aTBaseAdAdapter);
            a9.f13455C = baseAd.getNetworkInfoMap();
            return a9;
        }
        return new l();
    }

    private static l a(l lVar, f fVar) {
        if (fVar != null && (fVar instanceof ATBaseAdAdapter)) {
            ATBaseAdAdapter aTBaseAdAdapter = (ATBaseAdAdapter) fVar;
            lVar.f13472a = aTBaseAdAdapter;
            lVar.f13455C = aTBaseAdAdapter.getInternalNetworkInfoMap();
            lVar.f13464M = lVar.f13472a.getTrackingInfo().ad();
            lVar.f13465N = aTBaseAdAdapter.getAdCustomExt();
            try {
                if (lVar.f13472a.getTrackingInfo().ah()) {
                    lVar.f13463L = lVar.f13472a.getUnitGroupInfo().R().i();
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
            jSONObject.put("id", this.f13481k);
            jSONObject.put("publisher_revenue", this.f13482l);
            jSONObject.put("publisher_revenue_cny", this.f13483m);
            jSONObject.put("currency", this.f13484n);
            jSONObject.put("country", this.f13485o);
            jSONObject.put("adunit_id", this.f13486p);
            jSONObject.put("adunit_format", this.f13487q);
            jSONObject.put(com.anythink.core.common.k.f15082T, this.f13488r);
            jSONObject.put("network_type", this.f13489s);
            jSONObject.put("network_placement_id", this.f13490t);
            jSONObject.put(com.anythink.core.common.k.f15081S, this.f13491u);
            jSONObject.put("segment_id", this.f13492v);
            if (!TextUtils.isEmpty(this.f13493w)) {
                jSONObject.put("scenario_id", this.f13493w);
            }
            if (!TextUtils.isEmpty(this.f13494x) && this.f13495y != 0) {
                jSONObject.put("scenario_reward_name", this.f13494x);
                jSONObject.put("scenario_reward_number", this.f13495y);
            }
            if (!TextUtils.isEmpty(this.f13453A)) {
                jSONObject.put("channel", this.f13453A);
            }
            if (!TextUtils.isEmpty(this.f13496z)) {
                jSONObject.put("sub_channel", this.f13496z);
            }
            Map<String, Object> map = this.f13454B;
            if (map != null && map.size() > 0) {
                jSONObject.put("custom_rule", new JSONObject(this.f13454B));
            }
            jSONObject.put("network_firm_id", this.f13473b);
            jSONObject.put("adsource_id", this.f13474c);
            jSONObject.put("adsource_index", this.f13475d);
            jSONObject.put("adsource_price", this.f13476e);
            jSONObject.put("adsource_price_cny", this.f13477f);
            jSONObject.put("adsource_isheaderbidding", this.f13480j);
            Map<String, Object> map2 = this.f13455C;
            if (map2 != null && map2.size() > 0) {
                jSONObject.put("ext_info", new JSONObject(this.f13455C));
            }
            ATBaseAdAdapter aTBaseAdAdapter = this.f13472a;
            if (aTBaseAdAdapter != null) {
                jSONObject.put("reward_custom_data", aTBaseAdAdapter.getUserCustomData());
            }
            if (!TextUtils.isEmpty(this.f13456D)) {
                jSONObject.put("tp_bid_id", this.f13456D);
            }
            int i = this.f13457E;
            if (i != 0) {
                jSONObject.put("dismiss_type", i);
            }
            if (!TextUtils.isEmpty(this.f13458F)) {
                jSONObject.put(l.a.f18188T, this.f13458F);
            }
            jSONObject.put(com.anythink.core.common.m.e.J, this.f13459G);
            Map<String, Object> map3 = this.f13460H;
            if (map3 != null && map3.size() > 0) {
                jSONObject.put("user_load_extra_data", new JSONObject(this.f13460H));
            }
            jSONObject.put("placement_type", this.f13461I);
            if (!TextUtils.isEmpty(this.J)) {
                jSONObject.put("shared_placement_id", this.J);
            }
            jSONObject.put("bid_floor", this.f13462K);
            jSONObject.put("ad_source_type", this.f13464M);
            jSONObject.put("ad_source_custom_ext", this.f13465N);
            jSONObject.put("url_tag_params", this.f13466O);
            jSONObject.put(ATAdConst.NETWORK_CUSTOM_KEY.NETWORK_NAME, this.f13467P);
            jSONObject.put("show_custom_ext", this.f13468Q);
            if (!TextUtils.isEmpty(this.f13478g)) {
                jSONObject.put(com.anythink.core.common.k.aS, this.f13478g);
            }
            if (!TextUtils.isEmpty(this.f13479h)) {
                jSONObject.put(com.anythink.core.common.k.aT, this.f13479h);
            }
            jSONObject.put(l.a.aD, this.i);
            jSONObject.put("req_id", this.f13469R);
            jSONObject.put(com.anythink.core.common.k.J, this.f13470S);
            return jSONObject;
        } catch (Throwable th) {
            th.printStackTrace();
            return jSONObject;
        }
    }

    public final void a(double d9) {
        this.f13476e = d9;
        this.f13482l = Double.valueOf(d9 / 1000.0d);
    }
}
