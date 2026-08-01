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
import com.google.android.gms.internal.ads.C2635Kc;
import java.util.HashMap;
import java.util.Map;
import k2.C4631a;
import k2.b;
import k2.f;
import k2.g;
import k2.i;
import k2.m;
import k2.n;
import k2.p;
import q2.E0;
import q2.K;
import q2.U0;
import w2.AbstractC5148a;
import w2.AbstractC5149b;

/* loaded from: classes.dex */
public class AdmobATInterstitialAdapter extends CustomInterstitialAdapter {

    /* renamed from: e, reason: collision with root package name */
    private static final String f22808e = "AdmobATInterstitialAdapter";

    /* renamed from: a, reason: collision with root package name */
    AbstractC5148a f22809a;

    /* renamed from: d, reason: collision with root package name */
    Map<String, Object> f22812d;

    /* renamed from: g, reason: collision with root package name */
    private String f22814g;

    /* renamed from: h, reason: collision with root package name */
    private m f22815h;
    private AbstractC5149b i;

    /* renamed from: b, reason: collision with root package name */
    g f22810b = null;

    /* renamed from: f, reason: collision with root package name */
    private String f22813f = "";

    /* renamed from: c, reason: collision with root package name */
    boolean f22811c = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f22816j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f22817k = false;

    /* renamed from: com.anythink.network.admob.AdmobATInterstitialAdapter$1, reason: invalid class name */
    public class AnonymousClass1 extends AbstractC5149b {
        public AnonymousClass1() {
        }

        @Override // k2.x
        public final void onAdFailedToLoad(n nVar) {
            AdmobATInterstitialAdapter admobATInterstitialAdapter = AdmobATInterstitialAdapter.this;
            admobATInterstitialAdapter.f22809a = null;
            if (((ATBaseAdInternalAdapter) admobATInterstitialAdapter).mLoadListener != null) {
                ((ATBaseAdInternalAdapter) AdmobATInterstitialAdapter.this).mLoadListener.onAdLoadError(String.valueOf(nVar.f38568a), nVar.f38569b);
            }
        }

        @Override // k2.x
        public final void onAdLoaded(AbstractC5148a abstractC5148a) {
            AdmobATInterstitialAdapter.this.f22809a = abstractC5148a;
            AdmobATInterstitialAdapter.this.f22812d.put("response_info", abstractC5148a.a());
            AdmobATInterstitialAdapter admobATInterstitialAdapter = AdmobATInterstitialAdapter.this;
            admobATInterstitialAdapter.f22811c = true;
            if (admobATInterstitialAdapter.f22816j) {
                AbstractC5148a abstractC5148a2 = AdmobATInterstitialAdapter.this.f22809a;
                p pVar = new p() { // from class: com.anythink.network.admob.AdmobATInterstitialAdapter.1.1
                    @Override // k2.p
                    public final void onPaidEvent(i iVar) {
                        if (AdmobATInterstitialAdapter.this.f22817k) {
                            return;
                        }
                        AdmobATInterstitialAdapter.c(AdmobATInterstitialAdapter.this);
                        AdMobATInitManager.getInstance();
                        AdMobATInitManager.a(AdmobATInterstitialAdapter.this.f22812d, iVar);
                        if (((CustomInterstitialAdapter) AdmobATInterstitialAdapter.this).mImpressListener != null) {
                            ((CustomInterstitialAdapter) AdmobATInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
                        }
                    }
                };
                C2635Kc c2635Kc = (C2635Kc) abstractC5148a2;
                c2635Kc.getClass();
                try {
                    K k9 = c2635Kc.f25933c;
                    if (k9 != null) {
                        k9.s0(new U0(pVar));
                    }
                } catch (RemoteException e9) {
                    v2.i.i("#007 Could not call remote method.", e9);
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
        final /* synthetic */ Context f22820a;

        public AnonymousClass2(Context context) {
            this.f22820a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Context context = this.f22820a;
                String str = AdmobATInterstitialAdapter.this.f22813f;
                AdmobATInterstitialAdapter admobATInterstitialAdapter = AdmobATInterstitialAdapter.this;
                AbstractC5148a.b(context, str, admobATInterstitialAdapter.f22810b, admobATInterstitialAdapter.i);
            } catch (Throwable th) {
                if (((ATBaseAdInternalAdapter) AdmobATInterstitialAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) AdmobATInterstitialAdapter.this).mLoadListener.onAdLoadError("", th.getMessage());
                }
            }
        }
    }

    public static /* synthetic */ boolean c(AdmobATInterstitialAdapter admobATInterstitialAdapter) {
        admobATInterstitialAdapter.f22817k = true;
        return true;
    }

    public static /* synthetic */ int r(AdmobATInterstitialAdapter admobATInterstitialAdapter) {
        admobATInterstitialAdapter.mDismissType = 99;
        return 99;
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        try {
            AbstractC5148a abstractC5148a = this.f22809a;
            if (abstractC5148a != null) {
                abstractC5148a.c(null);
                this.f22809a = null;
            }
            this.i = null;
            this.f22815h = null;
            this.f22810b = null;
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
        return this.f22812d;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return AdMobATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f22813f;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean isAdReady() {
        return this.f22809a != null && this.f22811c;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        this.f22813f = ATInitMediation.getStringFromMap(map, "unit_id");
        this.f22814g = ATInitMediation.getStringFromMap(map, "payload");
        this.f22816j = ATInitMediation.getIntFromMap(map, j.w.f12629q, 2) == 1;
        if (!TextUtils.isEmpty(this.f22813f)) {
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
    public boolean setUserDataConsent(Context context, boolean z3, boolean z6) {
        return AdMobATInitManager.getInstance().setUserDataConsent(context, z3, z6);
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter
    public void show(Activity activity) {
        if (isAdReady()) {
            if (activity == null) {
                Log.e(f22808e, "Admob: show(), activity = null");
                return;
            }
            this.f22811c = false;
            m mVar = new m() { // from class: com.anythink.network.admob.AdmobATInterstitialAdapter.4
                @Override // k2.m
                public final void onAdClicked() {
                    if (((CustomInterstitialAdapter) AdmobATInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) AdmobATInterstitialAdapter.this).mImpressListener.onInterstitialAdClicked();
                    }
                }

                @Override // k2.m
                public final void onAdDismissedFullScreenContent() {
                    try {
                        AdMobATInitManager.getInstance().a(AdmobATInterstitialAdapter.this.getTrackingInfo().z());
                    } catch (Throwable unused) {
                    }
                    if (((CustomInterstitialAdapter) AdmobATInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) AdmobATInterstitialAdapter.this).mImpressListener.onInterstitialAdClose();
                    }
                }

                @Override // k2.m
                public final void onAdFailedToShowFullScreenContent(C4631a c4631a) {
                    AdmobATInterstitialAdapter.r(AdmobATInterstitialAdapter.this);
                }

                @Override // k2.m
                public final void onAdShowedFullScreenContent() {
                    try {
                        if (AdmobATInterstitialAdapter.this.f22809a != null) {
                            AdMobATInitManager.getInstance().a(AdmobATInterstitialAdapter.this.getTrackingInfo().z(), AdmobATInterstitialAdapter.this.f22809a);
                        }
                    } catch (Throwable unused) {
                    }
                    if (AdmobATInterstitialAdapter.this.f22816j) {
                        AdmobATInterstitialAdapter.this.postOnMainThreadDelayed(new Runnable() { // from class: com.anythink.network.admob.AdmobATInterstitialAdapter.4.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (AdmobATInterstitialAdapter.this.f22817k) {
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
            this.f22815h = mVar;
            this.f22809a.c(mVar);
            this.f22809a.d(activity);
        }
    }

    private void a(Context context, Map<String, Object> map, Map<String, Object> map2) {
        f a9 = AdMobATInitManager.getInstance().a(context.getApplicationContext(), map, map2, b.INTERSTITIAL, !TextUtils.isEmpty(this.f22814g));
        if (!TextUtils.isEmpty(this.f22814g)) {
            ((E0) a9.f1720u).f40022m = this.f22814g;
        }
        a9.getClass();
        this.f22810b = new g(a9);
        this.f22812d = new HashMap();
        this.i = new AnonymousClass1();
        postOnMainThread(new AnonymousClass2(context));
    }

    public static void a(AdmobATInterstitialAdapter admobATInterstitialAdapter, Context context, Map map, Map map2) {
        f a9 = AdMobATInitManager.getInstance().a(context.getApplicationContext(), (Map<String, Object>) map, (Map<String, Object>) map2, b.INTERSTITIAL, !TextUtils.isEmpty(admobATInterstitialAdapter.f22814g));
        if (!TextUtils.isEmpty(admobATInterstitialAdapter.f22814g)) {
            ((E0) a9.f1720u).f40022m = admobATInterstitialAdapter.f22814g;
        }
        a9.getClass();
        admobATInterstitialAdapter.f22810b = new g(a9);
        admobATInterstitialAdapter.f22812d = new HashMap();
        admobATInterstitialAdapter.i = admobATInterstitialAdapter.new AnonymousClass1();
        admobATInterstitialAdapter.postOnMainThread(admobATInterstitialAdapter.new AnonymousClass2(context));
    }
}
