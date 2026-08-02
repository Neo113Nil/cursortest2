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
import m2.b;
import m2.c;
import m2.f;
import m2.g;
import m2.i;
import m2.j;
import m2.n;
import m2.p;
import m2.s;
import s2.E0;
import s2.G0;
import s2.K;

/* loaded from: classes.dex */
public class AdmobATBannerAdapter extends CustomBannerAdapter {
    private static final String i = "AdmobATBannerAdapter";

    /* renamed from: b, reason: collision with root package name */
    j f23573b;

    /* renamed from: c, reason: collision with root package name */
    long f23574c;

    /* renamed from: g, reason: collision with root package name */
    Map<String, Object> f23578g;

    /* renamed from: k, reason: collision with root package name */
    private String f23581k;

    /* renamed from: a, reason: collision with root package name */
    g f23572a = null;

    /* renamed from: j, reason: collision with root package name */
    private String f23580j = "";

    /* renamed from: d, reason: collision with root package name */
    int f23575d = 0;

    /* renamed from: e, reason: collision with root package name */
    final int f23576e = 1;

    /* renamed from: f, reason: collision with root package name */
    final int f23577f = 2;

    /* renamed from: l, reason: collision with root package name */
    private boolean f23582l = false;

    /* renamed from: h, reason: collision with root package name */
    boolean f23579h = false;

    /* renamed from: com.anythink.network.admob.AdmobATBannerAdapter$2, reason: invalid class name */
    public class AnonymousClass2 extends c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f23588a;

        /* renamed from: c, reason: collision with root package name */
        private boolean f23590c = false;

        public AnonymousClass2(j jVar) {
            this.f23588a = jVar;
        }

        public static /* synthetic */ boolean b(AnonymousClass2 anonymousClass2) {
            anonymousClass2.f23590c = true;
            return true;
        }

        @Override // m2.c
        public final void onAdClicked() {
            if (AdmobATBannerAdapter.this.f23575d != 1 || Math.abs(SystemClock.elapsedRealtime() - AdmobATBannerAdapter.this.f23574c) >= 1000) {
                AdmobATBannerAdapter admobATBannerAdapter = AdmobATBannerAdapter.this;
                admobATBannerAdapter.f23575d = 2;
                admobATBannerAdapter.f23574c = SystemClock.elapsedRealtime();
                CustomBannerEventListener customBannerEventListener = AdmobATBannerAdapter.this.mImpressionEventListener;
                if (customBannerEventListener != null) {
                    customBannerEventListener.onBannerAdClicked();
                }
            }
        }

        @Override // m2.c
        public final void onAdClosed() {
        }

        @Override // m2.c
        public final void onAdFailedToLoad(n nVar) {
            if (((ATBaseAdInternalAdapter) AdmobATBannerAdapter.this).mLoadListener != null) {
                ((ATBaseAdInternalAdapter) AdmobATBannerAdapter.this).mLoadListener.onAdLoadError(String.valueOf(nVar.f39357a), nVar.f39358b);
            }
        }

        @Override // m2.c
        public final void onAdImpression() {
            String unused = AdmobATBannerAdapter.i;
            try {
                if (AdmobATBannerAdapter.this.f23573b != null) {
                    AdMobATInitManager.getInstance().a(AdmobATBannerAdapter.this.getTrackingInfo().z(), AdmobATBannerAdapter.this.f23573b);
                }
            } catch (Throwable unused2) {
            }
            if (AdmobATBannerAdapter.this.f23582l) {
                this.f23590c = false;
                AdmobATBannerAdapter.this.postOnMainThreadDelayed(new Runnable() { // from class: com.anythink.network.admob.AdmobATBannerAdapter.2.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (AnonymousClass2.this.f23590c) {
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
            this.f23590c = true;
            CustomBannerEventListener customBannerEventListener = AdmobATBannerAdapter.this.mImpressionEventListener;
            if (customBannerEventListener != null) {
                customBannerEventListener.onBannerAdShow();
            }
        }

        @Override // m2.c
        public final void onAdLoaded() {
            AdmobATBannerAdapter admobATBannerAdapter = AdmobATBannerAdapter.this;
            j jVar = this.f23588a;
            admobATBannerAdapter.f23573b = jVar;
            s responseInfo = jVar.getResponseInfo();
            if (responseInfo != null) {
                AdmobATBannerAdapter.this.f23578g.put("response_info", responseInfo);
            }
            if (AdmobATBannerAdapter.this.f23582l) {
                AdmobATBannerAdapter.this.f23573b.setOnPaidEventListener(new p() { // from class: com.anythink.network.admob.AdmobATBannerAdapter.2.1
                    @Override // m2.p
                    public final void onPaidEvent(i iVar) {
                        String unused = AdmobATBannerAdapter.i;
                        if (AnonymousClass2.this.f23590c) {
                            return;
                        }
                        AnonymousClass2.b(AnonymousClass2.this);
                        AdMobATInitManager.getInstance();
                        AdMobATInitManager.a(AdmobATBannerAdapter.this.f23578g, iVar);
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

        @Override // m2.c
        public final void onAdOpened() {
            AdmobATBannerAdapter admobATBannerAdapter = AdmobATBannerAdapter.this;
            if (admobATBannerAdapter.f23579h) {
                return;
            }
            if (admobATBannerAdapter.f23575d != 2 || Math.abs(SystemClock.elapsedRealtime() - AdmobATBannerAdapter.this.f23574c) >= 1000) {
                AdmobATBannerAdapter admobATBannerAdapter2 = AdmobATBannerAdapter.this;
                admobATBannerAdapter2.f23575d = 1;
                admobATBannerAdapter2.f23574c = SystemClock.elapsedRealtime();
                CustomBannerEventListener customBannerEventListener = AdmobATBannerAdapter.this.mImpressionEventListener;
                if (customBannerEventListener != null) {
                    customBannerEventListener.onBannerAdClicked();
                }
            }
        }
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        j jVar = this.f23573b;
        if (jVar != null) {
            jVar.setAdListener(null);
            this.f23573b.a();
            this.f23573b = null;
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        return this.f23573b;
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
        boolean z6;
        K k9;
        if (this.f23578g == null) {
            this.f23578g = new HashMap();
        }
        try {
            j jVar = this.f23573b;
            if (jVar != null) {
                Map<String, Object> map = this.f23578g;
                G0 g02 = jVar.f39393n;
                g02.getClass();
                try {
                    k9 = g02.i;
                } catch (RemoteException e9) {
                    x2.i.i("#007 Could not call remote method.", e9);
                }
                if (k9 != null) {
                    z6 = k9.u();
                    map.put(AdmobATConst.ADMOB_IS_COLLAPSIBLE, Boolean.valueOf(z6));
                }
                z6 = false;
                map.put(AdmobATConst.ADMOB_IS_COLLAPSIBLE, Boolean.valueOf(z6));
            }
        } catch (Throwable unused) {
        }
        return this.f23578g;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return AdMobATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f23580j;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(final Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        this.f23580j = ATInitMediation.getStringFromMap(map, "unit_id");
        this.f23581k = ATInitMediation.getStringFromMap(map, "payload");
        this.f23582l = ATInitMediation.getIntFromMap(map, j.w.f13415q, 2) == 1;
        this.f23579h = ATInitMediation.getIntFromMap(map, "admob_clbn_sw", 1) != 1;
        if (!TextUtils.isEmpty(this.f23580j)) {
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
    public boolean setUserDataConsent(Context context, boolean z6, boolean z9) {
        return AdMobATInitManager.getInstance().setUserDataConsent(context, z6, z9);
    }

    private void a(Context context, Map<String, Object> map, Map<String, Object> map2) {
        m2.j jVar = new m2.j(context);
        jVar.setAdSize(AdmobATConst.a(context, map2, map));
        jVar.setAdUnitId(this.f23580j);
        this.f23578g = new HashMap();
        jVar.setAdListener(new AnonymousClass2(jVar));
        f a9 = AdMobATInitManager.getInstance().a(context, map, map2, b.BANNER, !TextUtils.isEmpty(this.f23581k));
        if (!TextUtils.isEmpty(this.f23581k)) {
            ((E0) a9.f67u).f40321m = this.f23581k;
        }
        a9.getClass();
        g gVar = new g(a9);
        this.f23572a = gVar;
        jVar.b(gVar);
    }

    public static void a(AdmobATBannerAdapter admobATBannerAdapter, Context context, Map map, Map map2) {
        m2.j jVar = new m2.j(context);
        jVar.setAdSize(AdmobATConst.a(context, (Map<String, Object>) map2, (Map<String, Object>) map));
        jVar.setAdUnitId(admobATBannerAdapter.f23580j);
        admobATBannerAdapter.f23578g = new HashMap();
        jVar.setAdListener(admobATBannerAdapter.new AnonymousClass2(jVar));
        f a9 = AdMobATInitManager.getInstance().a(context, (Map<String, Object>) map, (Map<String, Object>) map2, b.BANNER, !TextUtils.isEmpty(admobATBannerAdapter.f23581k));
        if (!TextUtils.isEmpty(admobATBannerAdapter.f23581k)) {
            ((E0) a9.f67u).f40321m = admobATBannerAdapter.f23581k;
        }
        a9.getClass();
        g gVar = new g(a9);
        admobATBannerAdapter.f23572a = gVar;
        jVar.b(gVar);
    }
}
