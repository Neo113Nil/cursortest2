package com.anythink.network.admob;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.MediationInitCallback;
import com.anythink.core.common.d.j;
import com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter;
import com.google.android.gms.internal.ads.C2655Kc;
import java.util.HashMap;
import java.util.Map;
import m2.C4741a;
import m2.b;
import m2.f;
import m2.g;
import m2.i;
import m2.m;
import m2.n;
import m2.p;
import s2.E0;
import s2.K;
import s2.U0;
import y2.AbstractC5205a;
import y2.AbstractC5206b;

/* loaded from: classes.dex */
public class AdmobATInterstitialAdapter extends CustomInterstitialAdapter {

    /* renamed from: e, reason: collision with root package name */
    private static final String f23595e = "AdmobATInterstitialAdapter";

    /* renamed from: a, reason: collision with root package name */
    AbstractC5205a f23596a;

    /* renamed from: d, reason: collision with root package name */
    Map<String, Object> f23599d;

    /* renamed from: g, reason: collision with root package name */
    private String f23601g;

    /* renamed from: h, reason: collision with root package name */
    private m f23602h;
    private AbstractC5206b i;

    /* renamed from: b, reason: collision with root package name */
    g f23597b = null;

    /* renamed from: f, reason: collision with root package name */
    private String f23600f = "";

    /* renamed from: c, reason: collision with root package name */
    boolean f23598c = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f23603j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f23604k = false;

    /* renamed from: com.anythink.network.admob.AdmobATInterstitialAdapter$1, reason: invalid class name */
    public class AnonymousClass1 extends AbstractC5206b {
        public AnonymousClass1() {
        }

        @Override // m2.x
        public final void onAdFailedToLoad(n nVar) {
            AdmobATInterstitialAdapter admobATInterstitialAdapter = AdmobATInterstitialAdapter.this;
            admobATInterstitialAdapter.f23596a = null;
            if (((ATBaseAdInternalAdapter) admobATInterstitialAdapter).mLoadListener != null) {
                ((ATBaseAdInternalAdapter) AdmobATInterstitialAdapter.this).mLoadListener.onAdLoadError(String.valueOf(nVar.f39357a), nVar.f39358b);
            }
        }

        @Override // m2.x
        public final void onAdLoaded(AbstractC5205a abstractC5205a) {
            AdmobATInterstitialAdapter.this.f23596a = abstractC5205a;
            AdmobATInterstitialAdapter.this.f23599d.put("response_info", abstractC5205a.a());
            AdmobATInterstitialAdapter admobATInterstitialAdapter = AdmobATInterstitialAdapter.this;
            admobATInterstitialAdapter.f23598c = true;
            if (admobATInterstitialAdapter.f23603j) {
                AbstractC5205a abstractC5205a2 = AdmobATInterstitialAdapter.this.f23596a;
                p pVar = new p() { // from class: com.anythink.network.admob.AdmobATInterstitialAdapter.1.1
                    @Override // m2.p
                    public final void onPaidEvent(i iVar) {
                        if (AdmobATInterstitialAdapter.this.f23604k) {
                            return;
                        }
                        AdmobATInterstitialAdapter.c(AdmobATInterstitialAdapter.this);
                        AdMobATInitManager.getInstance();
                        AdMobATInitManager.a(AdmobATInterstitialAdapter.this.f23599d, iVar);
                        if (((CustomInterstitialAdapter) AdmobATInterstitialAdapter.this).mImpressListener != null) {
                            ((CustomInterstitialAdapter) AdmobATInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
                        }
                    }
                };
                C2655Kc c2655Kc = (C2655Kc) abstractC5205a2;
                c2655Kc.getClass();
                try {
                    K k9 = c2655Kc.f26711c;
                    if (k9 != null) {
                        k9.M3(new U0(pVar));
                    }
                } catch (RemoteException e9) {
                    x2.i.i("#007 Could not call remote method.", e9);
                }
            }
            if (((ATBaseAdInternalAdapter) AdmobATInterstitialAdapter.this).mLoadListener != null) {
                ((ATBaseAdInternalAdapter) AdmobATInterstitialAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }
    }

    /* renamed from: com.anythink.network.admob.AdmobATInterstitialAdapter$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f23607a;

        public AnonymousClass2(Context context) {
            this.f23607a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Context context = this.f23607a;
                String str = AdmobATInterstitialAdapter.this.f23600f;
                AdmobATInterstitialAdapter admobATInterstitialAdapter = AdmobATInterstitialAdapter.this;
                AbstractC5205a.b(context, str, admobATInterstitialAdapter.f23597b, admobATInterstitialAdapter.i);
            } catch (Throwable th) {
                if (((ATBaseAdInternalAdapter) AdmobATInterstitialAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) AdmobATInterstitialAdapter.this).mLoadListener.onAdLoadError("", th.getMessage());
                }
            }
        }
    }

    public static /* synthetic */ boolean c(AdmobATInterstitialAdapter admobATInterstitialAdapter) {
        admobATInterstitialAdapter.f23604k = true;
        return true;
    }

    public static /* synthetic */ int r(AdmobATInterstitialAdapter admobATInterstitialAdapter) {
        admobATInterstitialAdapter.mDismissType = 99;
        return 99;
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        try {
            AbstractC5205a abstractC5205a = this.f23596a;
            if (abstractC5205a != null) {
                abstractC5205a.c(null);
                this.f23596a = null;
            }
            this.i = null;
            this.f23602h = null;
            this.f23597b = null;
        } catch (Exception unused) {
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        AdMobATInitManager.getInstance().a(context, map, map2, b.INTERSTITIAL, aTBidRequestInfoListener);
    }

    @Override // com.anythink.core.api.ATBaseAdInternalAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<Integer, Class<? extends ATBaseAdAdapter>> getFormatAdapterMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(4, AdmobATSplashAdapter.class);
        hashMap.put(0, AdmobATAdapter.class);
        return hashMap;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f23599d;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return AdMobATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f23600f;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean isAdReady() {
        return this.f23596a != null && this.f23598c;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        this.f23600f = ATInitMediation.getStringFromMap(map, "unit_id");
        this.f23601g = ATInitMediation.getStringFromMap(map, "payload");
        this.f23603j = ATInitMediation.getIntFromMap(map, j.w.f13415q, 2) == 1;
        if (!TextUtils.isEmpty(this.f23600f)) {
            final Context applicationContext = context.getApplicationContext();
            AdMobATInitManager.getInstance().initSDK(applicationContext, map, new MediationInitCallback() { // from class: com.anythink.network.admob.AdmobATInterstitialAdapter.3
                @Override // com.anythink.core.api.MediationInitCallback
                public final void onFail(String str) {
                    if (((ATBaseAdInternalAdapter) AdmobATInterstitialAdapter.this).mLoadListener != null) {
                        ((ATBaseAdInternalAdapter) AdmobATInterstitialAdapter.this).mLoadListener.onAdLoadError("", str);
                    }
                }

                @Override // com.anythink.core.api.MediationInitCallback
                public final void onSuccess() {
                    AdmobATInterstitialAdapter.a(AdmobATInterstitialAdapter.this, applicationContext, map, map2);
                }
            });
        } else {
            ATCustomLoadListener aTCustomLoadListener = this.mLoadListener;
            if (aTCustomLoadListener != null) {
                aTCustomLoadListener.onAdLoadError("", "unitId is empty.");
            }
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z6, boolean z9) {
        return AdMobATInitManager.getInstance().setUserDataConsent(context, z6, z9);
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter
    public void show(Activity activity) {
        if (isAdReady()) {
            if (activity == null) {
                Log.e(f23595e, "Admob: show(), activity = null");
                return;
            }
            this.f23598c = false;
            m mVar = new m() { // from class: com.anythink.network.admob.AdmobATInterstitialAdapter.4
                @Override // m2.m
                public final void onAdClicked() {
                    if (((CustomInterstitialAdapter) AdmobATInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) AdmobATInterstitialAdapter.this).mImpressListener.onInterstitialAdClicked();
                    }
                }

                @Override // m2.m
                public final void onAdDismissedFullScreenContent() {
                    try {
                        AdMobATInitManager.getInstance().a(AdmobATInterstitialAdapter.this.getTrackingInfo().z());
                    } catch (Throwable unused) {
                    }
                    if (((CustomInterstitialAdapter) AdmobATInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) AdmobATInterstitialAdapter.this).mImpressListener.onInterstitialAdClose();
                    }
                }

                @Override // m2.m
                public final void onAdFailedToShowFullScreenContent(C4741a c4741a) {
                    AdmobATInterstitialAdapter.r(AdmobATInterstitialAdapter.this);
                }

                @Override // m2.m
                public final void onAdShowedFullScreenContent() {
                    try {
                        if (AdmobATInterstitialAdapter.this.f23596a != null) {
                            AdMobATInitManager.getInstance().a(AdmobATInterstitialAdapter.this.getTrackingInfo().z(), AdmobATInterstitialAdapter.this.f23596a);
                        }
                    } catch (Throwable unused) {
                    }
                    if (AdmobATInterstitialAdapter.this.f23603j) {
                        AdmobATInterstitialAdapter.this.postOnMainThreadDelayed(new Runnable() { // from class: com.anythink.network.admob.AdmobATInterstitialAdapter.4.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (AdmobATInterstitialAdapter.this.f23604k) {
                                    return;
                                }
                                AdmobATInterstitialAdapter.c(AdmobATInterstitialAdapter.this);
                                if (((CustomInterstitialAdapter) AdmobATInterstitialAdapter.this).mImpressListener != null) {
                                    ((CustomInterstitialAdapter) AdmobATInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
                                }
                            }
                        }, 500L);
                    } else if (((CustomInterstitialAdapter) AdmobATInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) AdmobATInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
                    }
                }
            };
            this.f23602h = mVar;
            this.f23596a.c(mVar);
            this.f23596a.d(activity);
        }
    }

    private void a(Context context, Map<String, Object> map, Map<String, Object> map2) {
        f a9 = AdMobATInitManager.getInstance().a(context.getApplicationContext(), map, map2, b.INTERSTITIAL, !TextUtils.isEmpty(this.f23601g));
        if (!TextUtils.isEmpty(this.f23601g)) {
            ((E0) a9.f67u).f40321m = this.f23601g;
        }
        a9.getClass();
        this.f23597b = new g(a9);
        this.f23599d = new HashMap();
        this.i = new AnonymousClass1();
        postOnMainThread(new AnonymousClass2(context));
    }

    public static void a(AdmobATInterstitialAdapter admobATInterstitialAdapter, Context context, Map map, Map map2) {
        f a9 = AdMobATInitManager.getInstance().a(context.getApplicationContext(), (Map<String, Object>) map, (Map<String, Object>) map2, b.INTERSTITIAL, !TextUtils.isEmpty(admobATInterstitialAdapter.f23601g));
        if (!TextUtils.isEmpty(admobATInterstitialAdapter.f23601g)) {
            ((E0) a9.f67u).f40321m = admobATInterstitialAdapter.f23601g;
        }
        a9.getClass();
        admobATInterstitialAdapter.f23597b = new g(a9);
        admobATInterstitialAdapter.f23599d = new HashMap();
        admobATInterstitialAdapter.i = admobATInterstitialAdapter.new AnonymousClass1();
        admobATInterstitialAdapter.postOnMainThread(admobATInterstitialAdapter.new AnonymousClass2(context));
    }
}
