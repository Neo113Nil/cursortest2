package com.anythink.network.admob;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.anythink.banner.unitgroup.api.CustomBannerAdapter;
import com.anythink.banner.unitgroup.api.CustomBannerEventListener;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.MediationInitCallback;
import com.anythink.core.common.d.j;
import java.util.HashMap;
import java.util.Map;
import k2.AbstractC4632c;
import k2.C4635f;
import k2.C4636g;
import k2.C4638i;
import k2.C4639j;
import k2.C4643n;
import k2.EnumC4631b;
import k2.p;
import k2.s;
import q2.E0;
import q2.G0;
import q2.K;
import u2.i;

/* loaded from: classes.dex */
public class AdmobATBannerAdapter extends CustomBannerAdapter {
    private static final String i = "AdmobATBannerAdapter";

    /* renamed from: b, reason: collision with root package name */
    C4639j f22944b;

    /* renamed from: c, reason: collision with root package name */
    long f22945c;

    /* renamed from: g, reason: collision with root package name */
    Map<String, Object> f22949g;

    /* renamed from: k, reason: collision with root package name */
    private String f22952k;

    /* renamed from: a, reason: collision with root package name */
    C4636g f22943a = null;

    /* renamed from: j, reason: collision with root package name */
    private String f22951j = "";

    /* renamed from: d, reason: collision with root package name */
    int f22946d = 0;

    /* renamed from: e, reason: collision with root package name */
    final int f22947e = 1;

    /* renamed from: f, reason: collision with root package name */
    final int f22948f = 2;

    /* renamed from: l, reason: collision with root package name */
    private boolean f22953l = false;

    /* renamed from: h, reason: collision with root package name */
    boolean f22950h = false;

    /* renamed from: com.anythink.network.admob.AdmobATBannerAdapter$2, reason: invalid class name */
    public class AnonymousClass2 extends AbstractC4632c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4639j f22959a;

        /* renamed from: c, reason: collision with root package name */
        private boolean f22961c = false;

        public AnonymousClass2(C4639j c4639j) {
            this.f22959a = c4639j;
        }

        public static /* synthetic */ boolean b(AnonymousClass2 anonymousClass2) {
            anonymousClass2.f22961c = true;
            return true;
        }

        @Override // k2.AbstractC4632c
        public final void onAdClicked() {
            if (AdmobATBannerAdapter.this.f22946d != 1 || Math.abs(SystemClock.elapsedRealtime() - AdmobATBannerAdapter.this.f22945c) >= 1000) {
                AdmobATBannerAdapter admobATBannerAdapter = AdmobATBannerAdapter.this;
                admobATBannerAdapter.f22946d = 2;
                admobATBannerAdapter.f22945c = SystemClock.elapsedRealtime();
                CustomBannerEventListener customBannerEventListener = AdmobATBannerAdapter.this.mImpressionEventListener;
                if (customBannerEventListener != null) {
                    customBannerEventListener.onBannerAdClicked();
                }
            }
        }

        @Override // k2.AbstractC4632c
        public final void onAdClosed() {
        }

        @Override // k2.AbstractC4632c
        public final void onAdFailedToLoad(C4643n c4643n) {
            if (((ATBaseAdInternalAdapter) AdmobATBannerAdapter.this).mLoadListener != null) {
                ((ATBaseAdInternalAdapter) AdmobATBannerAdapter.this).mLoadListener.onAdLoadError(String.valueOf(c4643n.f38688a), c4643n.f38689b);
            }
        }

        @Override // k2.AbstractC4632c
        public final void onAdImpression() {
            String unused = AdmobATBannerAdapter.i;
            try {
                if (AdmobATBannerAdapter.this.f22944b != null) {
                    AdMobATInitManager.getInstance().a(AdmobATBannerAdapter.this.getTrackingInfo().z(), AdmobATBannerAdapter.this.f22944b);
                }
            } catch (Throwable unused2) {
            }
            if (AdmobATBannerAdapter.this.f22953l) {
                this.f22961c = false;
                AdmobATBannerAdapter.this.postOnMainThreadDelayed(new Runnable() { // from class: com.anythink.network.admob.AdmobATBannerAdapter.2.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (AnonymousClass2.this.f22961c) {
                            return;
                        }
                        AnonymousClass2.b(AnonymousClass2.this);
                        CustomBannerEventListener customBannerEventListener = AdmobATBannerAdapter.this.mImpressionEventListener;
                        if (customBannerEventListener != null) {
                            customBannerEventListener.onBannerAdShow();
                        }
                    }
                }, 500L);
                return;
            }
            this.f22961c = true;
            CustomBannerEventListener customBannerEventListener = AdmobATBannerAdapter.this.mImpressionEventListener;
            if (customBannerEventListener != null) {
                customBannerEventListener.onBannerAdShow();
            }
        }

        @Override // k2.AbstractC4632c
        public final void onAdLoaded() {
            AdmobATBannerAdapter admobATBannerAdapter = AdmobATBannerAdapter.this;
            C4639j c4639j = this.f22959a;
            admobATBannerAdapter.f22944b = c4639j;
            s responseInfo = c4639j.getResponseInfo();
            if (responseInfo != null) {
                AdmobATBannerAdapter.this.f22949g.put("response_info", responseInfo);
            }
            if (AdmobATBannerAdapter.this.f22953l) {
                AdmobATBannerAdapter.this.f22944b.setOnPaidEventListener(new p() { // from class: com.anythink.network.admob.AdmobATBannerAdapter.2.1
                    @Override // k2.p
                    public final void onPaidEvent(C4638i c4638i) {
                        String unused = AdmobATBannerAdapter.i;
                        if (AnonymousClass2.this.f22961c) {
                            return;
                        }
                        AnonymousClass2.b(AnonymousClass2.this);
                        AdMobATInitManager.getInstance();
                        AdMobATInitManager.a(AdmobATBannerAdapter.this.f22949g, c4638i);
                        CustomBannerEventListener customBannerEventListener = AdmobATBannerAdapter.this.mImpressionEventListener;
                        if (customBannerEventListener != null) {
                            customBannerEventListener.onBannerAdShow();
                        }
                    }
                });
            }
            if (((ATBaseAdInternalAdapter) AdmobATBannerAdapter.this).mLoadListener != null) {
                ((ATBaseAdInternalAdapter) AdmobATBannerAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }

        @Override // k2.AbstractC4632c
        public final void onAdOpened() {
            AdmobATBannerAdapter admobATBannerAdapter = AdmobATBannerAdapter.this;
            if (admobATBannerAdapter.f22950h) {
                return;
            }
            if (admobATBannerAdapter.f22946d != 2 || Math.abs(SystemClock.elapsedRealtime() - AdmobATBannerAdapter.this.f22945c) >= 1000) {
                AdmobATBannerAdapter admobATBannerAdapter2 = AdmobATBannerAdapter.this;
                admobATBannerAdapter2.f22946d = 1;
                admobATBannerAdapter2.f22945c = SystemClock.elapsedRealtime();
                CustomBannerEventListener customBannerEventListener = AdmobATBannerAdapter.this.mImpressionEventListener;
                if (customBannerEventListener != null) {
                    customBannerEventListener.onBannerAdClicked();
                }
            }
        }
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        C4639j c4639j = this.f22944b;
        if (c4639j != null) {
            c4639j.setAdListener(null);
            this.f22944b.a();
            this.f22944b = null;
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        return this.f22944b;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        AdMobATInitManager.getInstance().a(context, map, map2, EnumC4631b.BANNER, aTBidRequestInfoListener);
    }

    @Override // com.anythink.core.api.ATBaseAdInternalAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<Integer, Class<? extends ATBaseAdAdapter>> getFormatAdapterMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, AdmobATAdapter.class);
        return hashMap;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        boolean z8;
        K k6;
        if (this.f22949g == null) {
            this.f22949g = new HashMap();
        }
        try {
            C4639j c4639j = this.f22944b;
            if (c4639j != null) {
                Map<String, Object> map = this.f22949g;
                G0 g02 = c4639j.f38724n;
                g02.getClass();
                try {
                    k6 = g02.i;
                } catch (RemoteException e6) {
                    i.i("#007 Could not call remote method.", e6);
                }
                if (k6 != null) {
                    z8 = k6.L();
                    map.put(AdmobATConst.ADMOB_IS_COLLAPSIBLE, Boolean.valueOf(z8));
                }
                z8 = false;
                map.put(AdmobATConst.ADMOB_IS_COLLAPSIBLE, Boolean.valueOf(z8));
            }
        } catch (Throwable unused) {
        }
        return this.f22949g;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return AdMobATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f22951j;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(final Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        this.f22951j = ATInitMediation.getStringFromMap(map, "unit_id");
        this.f22952k = ATInitMediation.getStringFromMap(map, "payload");
        this.f22953l = ATInitMediation.getIntFromMap(map, j.w.f12786q, 2) == 1;
        this.f22950h = ATInitMediation.getIntFromMap(map, "admob_clbn_sw", 1) != 1;
        if (!TextUtils.isEmpty(this.f22951j)) {
            AdMobATInitManager.getInstance().initSDK(context.getApplicationContext(), map, new MediationInitCallback() { // from class: com.anythink.network.admob.AdmobATBannerAdapter.1
                @Override // com.anythink.core.api.MediationInitCallback
                public final void onFail(String str) {
                    if (((ATBaseAdInternalAdapter) AdmobATBannerAdapter.this).mLoadListener != null) {
                        ((ATBaseAdInternalAdapter) AdmobATBannerAdapter.this).mLoadListener.onAdLoadError("", str);
                    }
                }

                @Override // com.anythink.core.api.MediationInitCallback
                public final void onSuccess() {
                    AdmobATBannerAdapter.this.postOnMainThread(new Runnable() { // from class: com.anythink.network.admob.AdmobATBannerAdapter.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            AdmobATBannerAdapter.a(AdmobATBannerAdapter.this, context, map, map2);
                        }
                    });
                }
            });
            return;
        }
        ATCustomLoadListener aTCustomLoadListener = this.mLoadListener;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdLoadError("", "unitId is empty.");
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z8, boolean z9) {
        return AdMobATInitManager.getInstance().setUserDataConsent(context, z8, z9);
    }

    private void a(Context context, Map<String, Object> map, Map<String, Object> map2) {
        C4639j c4639j = new C4639j(context);
        c4639j.setAdSize(AdmobATConst.a(context, map2, map));
        c4639j.setAdUnitId(this.f22951j);
        this.f22949g = new HashMap();
        c4639j.setAdListener(new AnonymousClass2(c4639j));
        C4635f a9 = AdMobATInitManager.getInstance().a(context, map, map2, EnumC4631b.BANNER, !TextUtils.isEmpty(this.f22952k));
        if (!TextUtils.isEmpty(this.f22952k)) {
            ((E0) a9.f37200u).f39929m = this.f22952k;
        }
        a9.getClass();
        C4636g c4636g = new C4636g(a9);
        this.f22943a = c4636g;
        c4639j.b(c4636g);
    }

    public static void a(AdmobATBannerAdapter admobATBannerAdapter, Context context, Map map, Map map2) {
        C4639j c4639j = new C4639j(context);
        c4639j.setAdSize(AdmobATConst.a(context, (Map<String, Object>) map2, (Map<String, Object>) map));
        c4639j.setAdUnitId(admobATBannerAdapter.f22951j);
        admobATBannerAdapter.f22949g = new HashMap();
        c4639j.setAdListener(admobATBannerAdapter.new AnonymousClass2(c4639j));
        C4635f a9 = AdMobATInitManager.getInstance().a(context, (Map<String, Object>) map, (Map<String, Object>) map2, EnumC4631b.BANNER, !TextUtils.isEmpty(admobATBannerAdapter.f22952k));
        if (!TextUtils.isEmpty(admobATBannerAdapter.f22952k)) {
            ((E0) a9.f37200u).f39929m = admobATBannerAdapter.f22952k;
        }
        a9.getClass();
        C4636g c4636g = new C4636g(a9);
        admobATBannerAdapter.f22943a = c4636g;
        c4639j.b(c4636g);
    }
}
