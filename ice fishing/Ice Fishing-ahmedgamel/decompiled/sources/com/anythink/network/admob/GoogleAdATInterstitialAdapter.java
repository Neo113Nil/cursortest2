package com.anythink.network.admob;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.MediationInitCallback;
import com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter;
import java.util.HashMap;
import java.util.Map;
import k2.C4631a;
import k2.b;
import k2.m;
import k2.n;
import l2.C4657a;
import l2.C4658b;
import w2.AbstractC5148a;
import w2.AbstractC5149b;

/* loaded from: classes.dex */
public class GoogleAdATInterstitialAdapter extends CustomInterstitialAdapter {

    /* renamed from: d, reason: collision with root package name */
    private static final String f22920d = "AdmobATInterstitialAdapter";

    /* renamed from: a, reason: collision with root package name */
    AbstractC5148a f22921a;

    /* renamed from: f, reason: collision with root package name */
    private m f22925f;

    /* renamed from: g, reason: collision with root package name */
    private AbstractC5149b f22926g;

    /* renamed from: b, reason: collision with root package name */
    C4658b f22922b = null;

    /* renamed from: e, reason: collision with root package name */
    private String f22924e = "";

    /* renamed from: c, reason: collision with root package name */
    boolean f22923c = false;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, Object> f22927h = new HashMap();

    /* renamed from: com.anythink.network.admob.GoogleAdATInterstitialAdapter$1, reason: invalid class name */
    public class AnonymousClass1 extends AbstractC5149b {
        public AnonymousClass1() {
        }

        @Override // k2.x
        public final void onAdFailedToLoad(n nVar) {
            GoogleAdATInterstitialAdapter googleAdATInterstitialAdapter = GoogleAdATInterstitialAdapter.this;
            googleAdATInterstitialAdapter.f22921a = null;
            if (((ATBaseAdInternalAdapter) googleAdATInterstitialAdapter).mLoadListener != null) {
                ((ATBaseAdInternalAdapter) GoogleAdATInterstitialAdapter.this).mLoadListener.onAdLoadError(String.valueOf(nVar.f38568a), nVar.f38569b);
            }
        }

        @Override // k2.x
        public final void onAdLoaded(AbstractC5148a abstractC5148a) {
            GoogleAdATInterstitialAdapter.this.f22921a = abstractC5148a;
            GoogleAdATInterstitialAdapter.this.f22927h.put("response_info", abstractC5148a.a());
            GoogleAdATInterstitialAdapter googleAdATInterstitialAdapter = GoogleAdATInterstitialAdapter.this;
            googleAdATInterstitialAdapter.f22923c = true;
            if (((ATBaseAdInternalAdapter) googleAdATInterstitialAdapter).mLoadListener != null) {
                ((ATBaseAdInternalAdapter) GoogleAdATInterstitialAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }
    }

    /* renamed from: com.anythink.network.admob.GoogleAdATInterstitialAdapter$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f22929a;

        public AnonymousClass2(Context context) {
            this.f22929a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Context context = this.f22929a;
                String str = GoogleAdATInterstitialAdapter.this.f22924e;
                GoogleAdATInterstitialAdapter googleAdATInterstitialAdapter = GoogleAdATInterstitialAdapter.this;
                AbstractC5148a.b(context, str, googleAdATInterstitialAdapter.f22922b, googleAdATInterstitialAdapter.f22926g);
            } catch (Throwable th) {
                if (((ATBaseAdInternalAdapter) GoogleAdATInterstitialAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) GoogleAdATInterstitialAdapter.this).mLoadListener.onAdLoadError("", th.getMessage());
                }
            }
        }
    }

    public static /* synthetic */ int n(GoogleAdATInterstitialAdapter googleAdATInterstitialAdapter) {
        googleAdATInterstitialAdapter.mDismissType = 99;
        return 99;
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        try {
            AbstractC5148a abstractC5148a = this.f22921a;
            if (abstractC5148a != null) {
                abstractC5148a.c(null);
                this.f22921a = null;
            }
            this.f22926g = null;
            this.f22925f = null;
            this.f22922b = null;
        } catch (Exception unused) {
        }
    }

    @Override // com.anythink.core.api.ATBaseAdInternalAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<Integer, Class<? extends ATBaseAdAdapter>> getFormatAdapterMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(4, GoogleAdATSplashAdapter.class);
        return hashMap;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f22927h;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return AdMobATInitManager.getInstance().getGoogleAdManagerName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f22924e;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean isAdReady() {
        return this.f22921a != null && this.f22923c;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        String stringFromMap = ATInitMediation.getStringFromMap(map, "unit_id");
        this.f22924e = stringFromMap;
        if (!TextUtils.isEmpty(stringFromMap)) {
            final Context applicationContext = context.getApplicationContext();
            AdMobATInitManager.getInstance().initSDK(applicationContext, map, new MediationInitCallback() { // from class: com.anythink.network.admob.GoogleAdATInterstitialAdapter.3
                @Override // com.anythink.core.api.MediationInitCallback
                public final void onFail(String str) {
                    if (((ATBaseAdInternalAdapter) GoogleAdATInterstitialAdapter.this).mLoadListener != null) {
                        ((ATBaseAdInternalAdapter) GoogleAdATInterstitialAdapter.this).mLoadListener.onAdLoadError("", str);
                    }
                }

                @Override // com.anythink.core.api.MediationInitCallback
                public final void onSuccess() {
                    GoogleAdATInterstitialAdapter.a(GoogleAdATInterstitialAdapter.this, applicationContext, map, map2);
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
                Log.e(f22920d, "show(), activity = null");
                return;
            }
            this.f22923c = false;
            m mVar = new m() { // from class: com.anythink.network.admob.GoogleAdATInterstitialAdapter.4
                @Override // k2.m
                public final void onAdClicked() {
                    if (((CustomInterstitialAdapter) GoogleAdATInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) GoogleAdATInterstitialAdapter.this).mImpressListener.onInterstitialAdClicked();
                    }
                }

                @Override // k2.m
                public final void onAdDismissedFullScreenContent() {
                    try {
                        if (GoogleAdATInterstitialAdapter.this.f22921a != null) {
                            AdMobATInitManager.getInstance().a(GoogleAdATInterstitialAdapter.this.getTrackingInfo().z());
                        }
                    } catch (Throwable unused) {
                    }
                    if (((CustomInterstitialAdapter) GoogleAdATInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) GoogleAdATInterstitialAdapter.this).mImpressListener.onInterstitialAdClose();
                    }
                }

                @Override // k2.m
                public final void onAdFailedToShowFullScreenContent(C4631a c4631a) {
                    GoogleAdATInterstitialAdapter.n(GoogleAdATInterstitialAdapter.this);
                }

                @Override // k2.m
                public final void onAdShowedFullScreenContent() {
                    try {
                        if (GoogleAdATInterstitialAdapter.this.f22921a != null) {
                            AdMobATInitManager.getInstance().a(GoogleAdATInterstitialAdapter.this.getTrackingInfo().z(), GoogleAdATInterstitialAdapter.this.f22921a);
                        }
                    } catch (Throwable unused) {
                    }
                    if (((CustomInterstitialAdapter) GoogleAdATInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) GoogleAdATInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
                    }
                }
            };
            this.f22925f = mVar;
            this.f22921a.c(mVar);
            this.f22921a.d(activity);
        }
    }

    private void a(Context context, Map<String, Object> map, Map<String, Object> map2) {
        C4657a a9 = AdMobATInitManager.getInstance().a(context, map, map2, b.INTERSTITIAL);
        a9.getClass();
        this.f22922b = new C4658b(a9);
        this.f22926g = new AnonymousClass1();
        postOnMainThread(new AnonymousClass2(context));
    }

    public static void a(GoogleAdATInterstitialAdapter googleAdATInterstitialAdapter, Context context, Map map, Map map2) {
        C4657a a9 = AdMobATInitManager.getInstance().a(context, (Map<String, Object>) map, (Map<String, Object>) map2, b.INTERSTITIAL);
        a9.getClass();
        googleAdATInterstitialAdapter.f22922b = new C4658b(a9);
        googleAdATInterstitialAdapter.f22926g = googleAdATInterstitialAdapter.new AnonymousClass1();
        googleAdATInterstitialAdapter.postOnMainThread(googleAdATInterstitialAdapter.new AnonymousClass2(context));
    }
}
