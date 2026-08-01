package com.anythink.core.b;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBidRequestInfo;
import com.anythink.core.api.ATBiddingResult;
import com.anythink.core.api.AdError;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.ad;
import com.anythink.core.common.h.ap;
import com.anythink.core.common.h.ar;
import com.anythink.core.common.h.aw;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.p;
import com.anythink.core.common.h.z;
import com.anythink.core.common.v.ab;
import com.anythink.core.common.v.ae;
import com.anythink.core.common.v.aj;
import com.anythink.core.common.v.u;
import com.anythink.core.d.l;
import com.anythink.core.d.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a extends d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11608a = "a";

    /* renamed from: b, reason: collision with root package name */
    private List<bv> f11609b;

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.core.b.b.b f11610c;

    /* renamed from: d, reason: collision with root package name */
    private long f11611d;

    /* renamed from: e, reason: collision with root package name */
    private List<ATBaseAdAdapter> f11612e;

    /* renamed from: j, reason: collision with root package name */
    private l f11613j;

    /* renamed from: com.anythink.core.b.a$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11626a;

        static {
            int[] iArr = new int[ATAdConst.CURRENCY.values().length];
            f11626a = iArr;
            try {
                iArr[ATAdConst.CURRENCY.RMB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11626a[ATAdConst.CURRENCY.RMB_CENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11626a[ATAdConst.CURRENCY.USD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public a(com.anythink.core.common.h.a aVar) {
        super(aVar);
        this.f11609b = Collections.synchronizedList(new ArrayList(this.f11736f.f13334j));
        this.f11612e = Collections.synchronizedList(new ArrayList());
    }

    private static int b(ATBiddingResult aTBiddingResult) {
        if (aTBiddingResult.isSuccessWithUseType()) {
            return 0;
        }
        return TextUtils.equals(aTBiddingResult.errorMsg, ATBidRequestInfo.BID_TYPE_ERROR_TYPE) ? -10 : -1;
    }

    private static boolean b(double d2, bv bvVar) {
        double aP = bvVar.aP();
        return aP <= 0.0d || d2 <= aP;
    }

    @Override // com.anythink.core.b.d
    public final void a(final com.anythink.core.b.b.b bVar) {
        this.f11610c = bVar;
        List<bv> list = this.f11736f.f13334j;
        this.f11611d = SystemClock.elapsedRealtime();
        for (int i = 0; i < list.size(); i++) {
            final bv bvVar = list.get(i);
            if (bvVar != null) {
                long bq = bvVar.bq();
                if (bq > 0) {
                    com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.b.a.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (a.this.f11738h.get()) {
                                bvVar.z();
                            } else {
                                a.this.a(bvVar, bVar);
                            }
                        }
                    }, bq);
                } else {
                    a(bvVar, bVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final bv bvVar, com.anythink.core.b.b.b bVar) {
        p a9 = u.a(bvVar);
        ATBaseAdAdapter aTBaseAdAdapter = a9 != null ? a9.f14035a : null;
        if (aTBaseAdAdapter == null) {
            String str = bvVar.m() + " not exist!";
            if (a9 != null) {
                str = a9.a(str);
            }
            a(false, ATBiddingResult.fail(str), bvVar, -9, (com.anythink.core.b.c.b) null, (com.anythink.core.b.c.a) null);
            return;
        }
        this.f11612e.add(aTBaseAdAdapter);
        try {
            com.anythink.core.b.b.c cVar = new com.anythink.core.b.b.c(aTBaseAdAdapter) { // from class: com.anythink.core.b.a.2
                private void a(final ATBiddingResult aTBiddingResult, final com.anythink.core.b.c.b bVar2, final com.anythink.core.b.c.a aVar) {
                    com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.b.a.2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.this.a(aTBiddingResult.isSuccessWithUseType(), aTBiddingResult, bvVar, a.a(aTBiddingResult), bVar2, aVar);
                        }
                    });
                }

                @Override // com.anythink.core.api.ATBiddingListener
                public final void onC2SBidResult(ATBiddingResult aTBiddingResult) {
                    ATBaseAdAdapter aTBaseAdAdapter2 = this.f11726c;
                    String str2 = "";
                    if (aTBaseAdAdapter2 != null) {
                        try {
                            str2 = aTBaseAdAdapter2.getInternalNetworkSDKVersion();
                        } catch (Throwable unused) {
                        }
                        a.this.f11612e.remove(this.f11726c);
                        this.f11726c.releaseLoadResource();
                    }
                    a(aTBiddingResult, null, new com.anythink.core.b.c.a(str2));
                }

                @Override // com.anythink.core.api.ATBiddingListener
                public final void onC2SBiddingResultWithCache(ATBiddingResult aTBiddingResult, BaseAd baseAd) {
                    ATBaseAdAdapter aTBaseAdAdapter2 = this.f11726c;
                    String str2 = "";
                    if (aTBaseAdAdapter2 != null) {
                        try {
                            str2 = aTBaseAdAdapter2.getInternalNetworkSDKVersion();
                        } catch (Throwable unused) {
                        }
                        a.this.f11612e.remove(this.f11726c);
                        this.f11726c.releaseLoadResource();
                    }
                    a(aTBiddingResult, new com.anythink.core.b.c.b(this.f11726c, baseAd), new com.anythink.core.b.c.a(str2));
                }
            };
            aTBaseAdAdapter.getInternalNetworkName();
            this.f11613j = n.a(this.f11736f.f13327b).a(this.f11736f.f13330e);
            ar arVar = this.f11736f.f13328c;
            ATAdRequest b9 = arVar != null ? arVar.b() : null;
            l lVar = this.f11613j;
            com.anythink.core.common.h.a aVar = this.f11736f;
            Map<String, Object> a10 = lVar.a(aVar.f13330e, aVar.f13329d, bvVar, b9);
            try {
                double a11 = com.anythink.core.b.d.b.a(this.f11736f, bvVar);
                if (a11 > 0.0d) {
                    a10.put("bid_floor", Double.valueOf(a11 * a(bvVar)));
                }
            } catch (Throwable th) {
                Log.w(ab.f16621a, "C2S startBidRequest with exception:" + th.getMessage());
            }
            com.anythink.core.common.h.n af = this.f11736f.f13343s.af();
            aj.a(af, bvVar, 0, false);
            com.anythink.core.common.v.p.a(a10, af);
            if (bvVar.g() == 22) {
                com.anythink.core.common.v.f.a(this.f11613j, a10, bvVar, this.f11736f.f13348x);
            }
            ar arVar2 = this.f11736f.f13328c;
            Context a12 = arVar2 != null ? arVar2.a() : null;
            if (a12 == null) {
                a12 = this.f11736f.f13327b;
            }
            com.anythink.core.common.h.a aVar2 = this.f11736f;
            boolean internalStartBiddingRequest = aTBaseAdAdapter.internalStartBiddingRequest(a12, a10, aVar2.f13341q, new com.anythink.core.b.b.a(aVar2.f13343s, bvVar.z(), a10, cVar));
            if (bVar != null) {
                bVar.a(bvVar, aTBaseAdAdapter);
            }
            if (internalStartBiddingRequest) {
                return;
            }
            a(ATBiddingResult.fail("This network don't support head bidding in current TopOn's version."), bvVar);
        } catch (Throwable th2) {
            th2.printStackTrace();
            a(ATBiddingResult.fail(th2.getMessage()), bvVar);
        }
    }

    private boolean a(final bv bvVar, z zVar, long j6, int i, com.anythink.core.b.c.b bVar, com.anythink.core.b.c.a aVar) {
        int i6;
        final ATBaseAdAdapter a9;
        boolean isSuccessWithUseType = zVar.isSuccessWithUseType();
        ad a10 = a(bvVar, zVar, j6, bVar, aVar);
        double price = isSuccessWithUseType ? a10.getPrice() : 0.0d;
        boolean a11 = d.a(isSuccessWithUseType, bvVar, a10);
        double aP = bvVar.aP();
        boolean z3 = aP <= 0.0d || price <= aP;
        AdError a12 = ae.a(0, this.f11736f.f13343s, bvVar, a10);
        boolean z6 = a12 != null;
        if (isSuccessWithUseType && !a11 && z3 && !z6) {
            bvVar.z();
            bvVar.g();
            zVar.getPrice();
            zVar.getSortPrice();
            zVar.currency.toString();
            a(bvVar, a10);
            String str = j.r.f12540m;
            com.anythink.core.common.h.a aVar2 = this.f11736f;
            ab.a(str, aVar2.f13330e, com.anythink.core.common.v.p.f(String.valueOf(aVar2.f13331f)), bvVar);
            return true;
        }
        if (a11) {
            d.a(bvVar, ATBidRequestInfo.LESS_THAN_BID_FLOOR_TYPE, j6, -11);
            bvVar.b(price);
            bvVar.e(a10.getSortPrice());
            a(a10, bvVar);
        } else if (z6) {
            d.a(bvVar, a12.getPlatformMSG(), j6, -13);
            bvVar.b(price);
            bvVar.e(a10.getSortPrice());
            b(a10, bvVar);
        } else {
            if (z3 || bvVar.g() != 72) {
                i6 = i;
            } else {
                zVar.errorMsg = ATBidRequestInfo.JAD_PRICE_EXCEPTION_TYPE;
                i6 = -12;
            }
            d.a(bvVar, zVar.errorMsg, j6, i6);
            a10.errorMsg = zVar.getErrorMsg();
            bvVar.a(a10);
        }
        if (bVar != null && (a9 = bVar.a()) != null) {
            t.b().b(new Runnable() { // from class: com.anythink.core.b.a.3
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        Objects.toString(a9);
                        Objects.toString(bvVar);
                        ATBaseAdAdapter aTBaseAdAdapter = a9;
                        if (aTBaseAdAdapter != null) {
                            aTBaseAdAdapter.internalDestory();
                        }
                    } catch (Throwable th) {
                        Log.e("anythink", "destroy error:" + a9, th);
                    }
                }
            });
        }
        String str2 = j.r.f12541n;
        com.anythink.core.common.h.a aVar3 = this.f11736f;
        ab.a(str2, aVar3.f13330e, com.anythink.core.common.v.p.f(String.valueOf(aVar3.f13331f)), bvVar);
        return false;
    }

    private static void a(bv bvVar, z zVar) {
        if (bvVar.g() == 75) {
            bvVar.z();
            Object extra = zVar.getExtra();
            if (extra == null) {
                bvVar.z();
                return;
            }
            String str = (String) extra;
            JSONObject aR = bvVar.aR();
            if (aR != null && !TextUtils.isEmpty(str)) {
                double optDouble = aR.optDouble(str, 0.0d);
                if (optDouble > 0.0d) {
                    bvVar.z();
                    zVar.setSortPrice(optDouble);
                    zVar.setPrice(optDouble);
                    return;
                }
                bvVar.z();
                return;
            }
            Objects.toString(aR);
            bvVar.z();
        }
    }

    private ad a(bv bvVar, z zVar, long j6, com.anythink.core.b.c.b bVar, com.anythink.core.b.c.a aVar) {
        double d2;
        double d9;
        Double d10;
        a(bvVar, zVar);
        bvVar.c(j6);
        bvVar.a(zVar.currency);
        double a9 = a(zVar.getSortPrice(), bvVar);
        boolean isSamePrice = zVar.isSamePrice();
        double a10 = isSamePrice ? a9 : a(zVar.getPrice(), bvVar);
        Double d11 = null;
        if (a9 <= 0.0d) {
            StringBuilder sb = new StringBuilder("NetworkName:");
            d2 = 0.0d;
            sb.append(bvVar.h());
            sb.append(",AdSourceId:");
            sb.append(bvVar.z());
            sb.append(" c2s sort price return 0,please check network placement c2s config");
            Log.w(ab.f16621a, sb.toString());
            d10 = Double.valueOf(a9);
            d9 = com.anythink.core.common.v.p.a(bvVar);
        } else {
            d2 = 0.0d;
            d9 = a9;
            d10 = null;
        }
        if (a10 <= d2) {
            Log.w(ab.f16621a, "NetworkName:" + bvVar.h() + ",AdSourceId:" + bvVar.z() + " c2s real price return 0,please check network placement c2s config");
            d11 = Double.valueOf(a10);
            a10 = com.anythink.core.common.v.p.a(bvVar);
        }
        double d12 = a10;
        Double d13 = d11;
        if (d10 != null || d13 != null) {
            com.anythink.core.common.h.a aVar2 = this.f11736f;
            com.anythink.core.common.u.e.a(aVar2.f13329d, aVar2.f13330e, bvVar, d10, d13, aVar);
        }
        ad adVar = new ad(zVar.isSuccessWithUseType(), d9, d12, zVar.token, zVar.winNoticeUrl, zVar.loseNoticeUrl, zVar.displayNoticeUrl, "");
        adVar.f13429l = a(bvVar);
        ATAdConst.CURRENCY currency = zVar.currency;
        if (currency != null) {
            adVar.f13420b = currency.toString();
        }
        adVar.setExtra(zVar.getExtra());
        adVar.setBiddingNotice(zVar.biddingNotice);
        adVar.f13424f = System.currentTimeMillis() + bvVar.s();
        adVar.f13423e = bvVar.s();
        adVar.f13428k = bvVar.z();
        adVar.f13422d = bvVar.g();
        adVar.f13436s = bVar;
        adVar.f13437t = bVar != null;
        double d14 = zVar.originPrice;
        int i = AnonymousClass4.f11626a[zVar.currency.ordinal()];
        if (i == 1) {
            d14 = zVar.originPrice;
        } else if (i == 2) {
            d14 = zVar.originPrice / 100.0d;
        } else if (i == 3) {
            d14 = zVar.originPrice * com.anythink.core.common.v.t.a();
        }
        adVar.rmbPrice = d14;
        a(bvVar.g(), adVar, 0.0d, isSamePrice);
        a((z) adVar, bvVar);
        return adVar;
    }

    @Override // com.anythink.core.b.d
    public final void a(bv bvVar, z zVar, long j6) {
        a(bvVar, zVar, j6, -1, (com.anythink.core.b.c.b) null, (com.anythink.core.b.c.a) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(boolean z3, ATBiddingResult aTBiddingResult, bv bvVar, int i, com.anythink.core.b.c.b bVar, com.anythink.core.b.c.a aVar) {
        boolean z6;
        ap aW;
        ap bi;
        if (z3) {
            try {
                f a9 = f.a();
                String z9 = bvVar.z();
                ConcurrentHashMap<String, Integer> concurrentHashMap = a9.f11843b;
                if (concurrentHashMap != null) {
                    if (concurrentHashMap.get(z9 + "_c2sfirstStatus") != null) {
                        z6 = false;
                        com.anythink.core.common.u.e.a(this.f11736f.f13330e, bvVar, z6, SystemClock.elapsedRealtime() - this.f11611d, this.f11736f);
                    }
                }
                z6 = true;
                com.anythink.core.common.u.e.a(this.f11736f.f13330e, bvVar, z6, SystemClock.elapsedRealtime() - this.f11611d, this.f11736f);
            } catch (Throwable th) {
                throw th;
            }
        }
        f a10 = f.a();
        String z10 = bvVar.z();
        if (a10.f11843b == null) {
            a10.f11843b = new ConcurrentHashMap<>();
        }
        a10.f11843b.put(z10 + "_c2sfirstStatus", 1);
        if (!this.f11738h.get()) {
            boolean a11 = a(bvVar, aTBiddingResult, SystemClock.elapsedRealtime() - this.f11611d, i, bVar, aVar);
            List<bv> synchronizedList = Collections.synchronizedList(new ArrayList(1));
            synchronizedList.add(bvVar);
            this.f11609b.remove(bvVar);
            if (this.f11609b.size() == 0) {
                this.f11738h.set(true);
            }
            if (this.f11610c != null) {
                if (!a11) {
                    a11 = a(bvVar, aTBiddingResult.errorMsg, -1);
                }
                if (a11) {
                    l lVar = this.f11613j;
                    if (lVar != null && (aW = bvVar.aW()) != null && (bi = lVar.bi()) != null) {
                        String c9 = bi.c();
                        aW.c(c9);
                        if (!TextUtils.isEmpty(c9)) {
                            String z11 = bvVar.z();
                            com.anythink.core.common.q.b b9 = com.anythink.core.common.q.a.b(c9, z11 + "_" + bvVar.D() + "_" + this.f11736f.f13329d);
                            b9.b();
                            aW.b(b9.a());
                            com.anythink.core.common.q.b b10 = com.anythink.core.common.q.a.b(c9, z11 + "_" + bvVar.c() + "_" + this.f11736f.f13329d);
                            b10.b();
                            aW.d(b10.a());
                        }
                    }
                    this.f11610c.a(synchronizedList, (List<bv>) null);
                    return;
                }
                this.f11610c.a((List<bv>) null, synchronizedList);
            }
            return;
        }
        ad a12 = a(bvVar, aTBiddingResult, SystemClock.elapsedRealtime() - this.f11611d, bVar, aVar);
        com.anythink.core.b.d.c.a(a12, new aw(4, bvVar, this.f11736f.f13343s, a12.getPrice()), true, 29);
    }

    private synchronized void a(ATBiddingResult aTBiddingResult, bv bvVar) {
        a(false, aTBiddingResult, bvVar, -1, (com.anythink.core.b.c.b) null, (com.anythink.core.b.c.a) null);
    }

    private static ATBiddingResult a(String str) {
        return ATBiddingResult.fail(str);
    }

    @Override // com.anythink.core.b.d
    public final synchronized void a() {
        try {
            try {
                if (!this.f11738h.get()) {
                    this.f11738h.set(true);
                    ArrayList arrayList = new ArrayList(3);
                    ArrayList arrayList2 = new ArrayList(3);
                    for (bv bvVar : this.f11609b) {
                        if (a(bvVar, "bid timeout", -3)) {
                            arrayList.add(bvVar);
                        } else {
                            a(bvVar, ATBiddingResult.fail("bid timeout!"), SystemClock.elapsedRealtime() - this.f11611d, -3, (com.anythink.core.b.c.b) null, (com.anythink.core.b.c.a) null);
                            arrayList2.add(bvVar);
                        }
                    }
                    this.f11609b.clear();
                    com.anythink.core.b.b.b bVar = this.f11610c;
                    if (bVar != null) {
                        bVar.a(arrayList, arrayList2);
                    }
                    this.f11610c = null;
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    private static void a(z zVar, bv bvVar) {
        double aQ = bvVar.aQ();
        double d2 = zVar.originPrice;
        if (aQ > 0.0d) {
            double d9 = (1.0d - aQ) * zVar.originPrice;
            zVar.setPrice(d9);
            zVar.setSortPrice(d9);
        }
    }

    private void a(l lVar, bv bvVar) {
        ap aW;
        ap bi;
        if (lVar == null || bvVar == null || (aW = bvVar.aW()) == null || (bi = lVar.bi()) == null) {
            return;
        }
        String c9 = bi.c();
        aW.c(c9);
        if (TextUtils.isEmpty(c9)) {
            return;
        }
        String z3 = bvVar.z();
        com.anythink.core.common.q.b b9 = com.anythink.core.common.q.a.b(c9, z3 + "_" + bvVar.D() + "_" + this.f11736f.f13329d);
        b9.b();
        aW.b(b9.a());
        com.anythink.core.common.q.b b10 = com.anythink.core.common.q.a.b(c9, z3 + "_" + bvVar.c() + "_" + this.f11736f.f13329d);
        b10.b();
        aW.d(b10.a());
    }

    public static /* synthetic */ int a(ATBiddingResult aTBiddingResult) {
        if (aTBiddingResult.isSuccessWithUseType()) {
            return 0;
        }
        return TextUtils.equals(aTBiddingResult.errorMsg, ATBidRequestInfo.BID_TYPE_ERROR_TYPE) ? -10 : -1;
    }
}
