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
import k2.b;
import k2.c;
import k2.f;
import k2.g;
import k2.i;
import k2.j;
import k2.n;
import k2.p;
import k2.s;
import q2.E0;
import q2.G0;
import q2.K;

/* loaded from: classes.dex */
public class AdmobATBannerAdapter extends CustomBannerAdapter {
    private static final String i = "AdmobATBannerAdapter";

    /* renamed from: b, reason: collision with root package name */
    j f22786b;

    /* renamed from: c, reason: collision with root package name */
    long f22787c;

    /* renamed from: g, reason: collision with root package name */
    Map<String, Object> f22791g;

    /* renamed from: k, reason: collision with root package name */
    private String f22794k;

    /* renamed from: a, reason: collision with root package name */
    g f22785a = null;

    /* renamed from: j, reason: collision with root package name */
    private String f22793j = "";

    /* renamed from: d, reason: collision with root package name */
    int f22788d = 0;

    /* renamed from: e, reason: collision with root package name */
    final int f22789e = 1;

    /* renamed from: f, reason: collision with root package name */
    final int f22790f = 2;

    /* renamed from: l, reason: collision with root package name */
    private boolean f22795l = false;

    /* renamed from: h, reason: collision with root package name */
    boolean f22792h = false;

    /* renamed from: com.anythink.network.admob.AdmobATBannerAdapter$2, reason: invalid class name */
    public class AnonymousClass2 extends c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f22801a;

        /* renamed from: c, reason: collision with root package name */
        private boolean f22803c = false;

        public AnonymousClass2(j jVar) {
            this.f22801a = jVar;
        }

        public static /* synthetic */ boolean b(AnonymousClass2 anonymousClass2) {
            anonymousClass2.f22803c = true;
            return true;
        }

        @Override // k2.c
        public final void onAdClicked() {
            if (AdmobATBannerAdapter.this.f22788d != 1 || Math.abs(SystemClock.elapsedRealtime() - AdmobATBannerAdapter.this.f22787c) >= 1000) {
                AdmobATBannerAdapter admobATBannerAdapter = AdmobATBannerAdapter.this;
                admobATBannerAdapter.f22788d = 2;
                admobATBannerAdapter.f22787c = SystemClock.elapsedRealtime();
                CustomBannerEventListener customBannerEventListener = AdmobATBannerAdapter.this.mImpressionEventListener;
                if (customBannerEventListener != null) {
                    customBannerEventListener.onBannerAdClicked();
                }
            }
        }

        @Override // k2.c
        public final void onAdClosed() {
        }

        @Override // k2.c
        public final void onAdFailedToLoad(n nVar) {
            if (((ATBaseAdInternalAdapter) AdmobATBannerAdapter.this).mLoadListener != null) {
                ((ATBaseAdInternalAdapter) AdmobATBannerAdapter.this).mLoadListener.onAdLoadError(String.valueOf(nVar.f38568a), nVar.f38569b);
            }
        }

        @Override // k2.c
        public final void onAdImpression() {
            String unused = AdmobATBannerAdapter.i;
            try {
                if (AdmobATBannerAdapter.this.f22786b != null) {
                    AdMobATInitManager.getInstance().a(AdmobATBannerAdapter.this.getTrackingInfo().z(), AdmobATBannerAdapter.this.f22786b);
                }
            } catch (Throwable unused2) {
            }
            if (AdmobATBannerAdapter.this.f22795l) {
                this.f22803c = false;
                AdmobATBannerAdapter.this.postOnMainThreadDelayed(new Runnable() { // from class: com.anythink.network.admob.AdmobATBannerAdapter.2.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (AnonymousClass2.this.f22803c) {
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
            this.f22803c = true;
            CustomBannerEventListener customBannerEventListener = AdmobATBannerAdapter.this.mImpressionEventListener;
            if (customBannerEventListener != null) {
                customBannerEventListener.onBannerAdShow();
            }
        }

        @Override // k2.c
        public final void onAdLoaded() {
            AdmobATBannerAdapter admobATBannerAdapter = AdmobATBannerAdapter.this;
            j jVar = this.f22801a;
            admobATBannerAdapter.f22786b = jVar;
            s responseInfo = jVar.getResponseInfo();
            if (responseInfo != null) {
                AdmobATBannerAdapter.this.f22791g.put("response_info", responseInfo);
            }
            if (AdmobATBannerAdapter.this.f22795l) {
                AdmobATBannerAdapter.this.f22786b.setOnPaidEventListener(new p() { // from class: com.anythink.network.admob.AdmobATBannerAdapter.2.1
                    @Override // k2.p
                    public final void onPaidEvent(i iVar) {
                        String unused = AdmobATBannerAdapter.i;
                        if (AnonymousClass2.this.f22803c) {
                            return;
                        }
                        AnonymousClass2.b(AnonymousClass2.this);
                        AdMobATInitManager.getInstance();
                        AdMobATInitManager.a(AdmobATBannerAdapter.this.f22791g, iVar);
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

        @Override // k2.c
        public final void onAdOpened() {
            AdmobATBannerAdapter admobATBannerAdapter = AdmobATBannerAdapter.this;
            if (admobATBannerAdapter.f22792h) {
                return;
            }
            if (admobATBannerAdapter.f22788d != 2 || Math.abs(SystemClock.elapsedRealtime() - AdmobATBannerAdapter.this.f22787c) >= 1000) {
                AdmobATBannerAdapter admobATBannerAdapter2 = AdmobATBannerAdapter.this;
                admobATBannerAdapter2.f22788d = 1;
                admobATBannerAdapter2.f22787c = SystemClock.elapsedRealtime();
                CustomBannerEventListener customBannerEventListener = AdmobATBannerAdapter.this.mImpressionEventListener;
                if (customBannerEventListener != null) {
                    customBannerEventListener.onBannerAdClicked();
                }
            }
        }
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        j jVar = this.f22786b;
        if (jVar != null) {
            jVar.setAdListener(null);
            this.f22786b.a();
            this.f22786b = null;
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        return this.f22786b;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        AdMobATInitManager.getInstance().a(context, map, map2, b.BANNER, aTBidRequestInfoListener);
    }

    @Override // com.anythink.core.api.ATBaseAdInternalAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<Integer, Class<? extends ATBaseAdAdapter>> getFormatAdapterMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, AdmobATAdapter.class);
        return hashMap;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        boolean z3;
        K k9;
        if (this.f22791g == null) {
            this.f22791g = new HashMap();
        }
        try {
            j jVar = this.f22786b;
            if (jVar != null) {
                Map<String, Object> map = this.f22791g;
                G0 g02 = jVar.f38604n;
                g02.getClass();
                try {
                    k9 = g02.i;
                } catch (RemoteException e9) {
                    v2.i.i("#007 Could not call remote method.", e9);
                }
                if (k9 != null) {
                    z3 = k9.u();
                    map.put(AdmobATConst.ADMOB_IS_COLLAPSIBLE, Boolean.valueOf(z3));
                }
                z3 = false;
                map.put(AdmobATConst.ADMOB_IS_COLLAPSIBLE, Boolean.valueOf(z3));
            }
        } catch (Throwable unused) {
        }
        return this.f22791g;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return AdMobATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f22793j;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(final Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        this.f22793j = ATInitMediation.getStringFromMap(map, "unit_id");
        this.f22794k = ATInitMediation.getStringFromMap(map, "payload");
        this.f22795l = ATInitMediation.getIntFromMap(map, j.w.f12629q, 2) == 1;
        this.f22792h = ATInitMediation.getIntFromMap(map, "admob_clbn_sw", 1) != 1;
        if (!TextUtils.isEmpty(this.f22793j)) {
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
    public boolean setUserDataConsent(Context context, boolean z3, boolean z6) {
        return AdMobATInitManager.getInstance().setUserDataConsent(context, z3, z6);
    }

    private void a(Context context, Map<String, Object> map, Map<String, Object> map2) {
        k2.j jVar = new k2.j(context);
        jVar.setAdSize(AdmobATConst.a(context, map2, map));
        jVar.setAdUnitId(this.f22793j);
        this.f22791g = new HashMap();
        jVar.setAdListener(new AnonymousClass2(jVar));
        f a9 = AdMobATInitManager.getInstance().a(context, map, map2, b.BANNER, !TextUtils.isEmpty(this.f22794k));
        if (!TextUtils.isEmpty(this.f22794k)) {
            ((E0) a9.f1720u).f40019m = this.f22794k;
        }
        a9.getClass();
        g gVar = new g(a9);
        this.f22785a = gVar;
        jVar.b(gVar);
    }

    public static void a(AdmobATBannerAdapter admobATBannerAdapter, Context context, Map map, Map map2) {
        k2.j jVar = new k2.j(context);
        jVar.setAdSize(AdmobATConst.a(context, (Map<String, Object>) map2, (Map<String, Object>) map));
        jVar.setAdUnitId(admobATBannerAdapter.f22793j);
        admobATBannerAdapter.f22791g = new HashMap();
        jVar.setAdListener(admobATBannerAdapter.new AnonymousClass2(jVar));
        f a9 = AdMobATInitManager.getInstance().a(context, (Map<String, Object>) map, (Map<String, Object>) map2, b.BANNER, !TextUtils.isEmpty(admobATBannerAdapter.f22794k));
        if (!TextUtils.isEmpty(admobATBannerAdapter.f22794k)) {
            ((E0) a9.f1720u).f40019m = admobATBannerAdapter.f22794k;
        }
        a9.getClass();
        g gVar = new g(a9);
        admobATBannerAdapter.f22785a = gVar;
        jVar.b(gVar);
    }
}
