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
import m2.C4741a;
import m2.b;
import m2.m;
import m2.n;
import n2.C4766a;
import n2.C4767b;
import y2.AbstractC5205a;
import y2.AbstractC5206b;

/* loaded from: classes.dex */
public class GoogleAdATInterstitialAdapter extends CustomInterstitialAdapter {

    /* renamed from: d, reason: collision with root package name */
    private static final String f23707d = "AdmobATInterstitialAdapter";

    /* renamed from: a, reason: collision with root package name */
    AbstractC5205a f23708a;

    /* renamed from: f, reason: collision with root package name */
    private m f23712f;

    /* renamed from: g, reason: collision with root package name */
    private AbstractC5206b f23713g;

    /* renamed from: b, reason: collision with root package name */
    C4767b f23709b = null;

    /* renamed from: e, reason: collision with root package name */
    private String f23711e = "";

    /* renamed from: c, reason: collision with root package name */
    boolean f23710c = false;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, Object> f23714h = new HashMap();

    /* renamed from: com.anythink.network.admob.GoogleAdATInterstitialAdapter$1, reason: invalid class name */
    public class AnonymousClass1 extends AbstractC5206b {
        public AnonymousClass1() {
        }

        @Override // m2.x
        public final void onAdFailedToLoad(n nVar) {
            GoogleAdATInterstitialAdapter googleAdATInterstitialAdapter = GoogleAdATInterstitialAdapter.this;
            googleAdATInterstitialAdapter.f23708a = null;
            if (((ATBaseAdInternalAdapter) googleAdATInterstitialAdapter).mLoadListener != null) {
                ((ATBaseAdInternalAdapter) GoogleAdATInterstitialAdapter.this).mLoadListener.onAdLoadError(String.valueOf(nVar.f39357a), nVar.f39358b);
            }
        }

        @Override // m2.x
        public final void onAdLoaded(AbstractC5205a abstractC5205a) {
            GoogleAdATInterstitialAdapter.this.f23708a = abstractC5205a;
            GoogleAdATInterstitialAdapter.this.f23714h.put("response_info", abstractC5205a.a());
            GoogleAdATInterstitialAdapter googleAdATInterstitialAdapter = GoogleAdATInterstitialAdapter.this;
            googleAdATInterstitialAdapter.f23710c = true;
            if (((ATBaseAdInternalAdapter) googleAdATInterstitialAdapter).mLoadListener != null) {
                ((ATBaseAdInternalAdapter) GoogleAdATInterstitialAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }
    }

    /* renamed from: com.anythink.network.admob.GoogleAdATInterstitialAdapter$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f23716a;

        public AnonymousClass2(Context context) {
            this.f23716a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Context context = this.f23716a;
                String str = GoogleAdATInterstitialAdapter.this.f23711e;
                GoogleAdATInterstitialAdapter googleAdATInterstitialAdapter = GoogleAdATInterstitialAdapter.this;
                AbstractC5205a.b(context, str, googleAdATInterstitialAdapter.f23709b, googleAdATInterstitialAdapter.f23713g);
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
            AbstractC5205a abstractC5205a = this.f23708a;
            if (abstractC5205a != null) {
                abstractC5205a.c(null);
                this.f23708a = null;
            }
            this.f23713g = null;
            this.f23712f = null;
            this.f23709b = null;
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
        return this.f23714h;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return AdMobATInitManager.getInstance().getGoogleAdManagerName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f23711e;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean isAdReady() {
        return this.f23708a != null && this.f23710c;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        String stringFromMap = ATInitMediation.getStringFromMap(map, "unit_id");
        this.f23711e = stringFromMap;
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
    public boolean setUserDataConsent(Context context, boolean z6, boolean z9) {
        return AdMobATInitManager.getInstance().setUserDataConsent(context, z6, z9);
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter
    public void show(Activity activity) {
        if (isAdReady()) {
            if (activity == null) {
                Log.e(f23707d, "show(), activity = null");
                return;
            }
            this.f23710c = false;
            m mVar = new m() { // from class: com.anythink.network.admob.GoogleAdATInterstitialAdapter.4
                @Override // m2.m
                public final void onAdClicked() {
                    if (((CustomInterstitialAdapter) GoogleAdATInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) GoogleAdATInterstitialAdapter.this).mImpressListener.onInterstitialAdClicked();
                    }
                }

                @Override // m2.m
                public final void onAdDismissedFullScreenContent() {
                    try {
                        if (GoogleAdATInterstitialAdapter.this.f23708a != null) {
                            AdMobATInitManager.getInstance().a(GoogleAdATInterstitialAdapter.this.getTrackingInfo().z());
                        }
                    } catch (Throwable unused) {
                    }
                    if (((CustomInterstitialAdapter) GoogleAdATInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) GoogleAdATInterstitialAdapter.this).mImpressListener.onInterstitialAdClose();
                    }
                }

                @Override // m2.m
                public final void onAdFailedToShowFullScreenContent(C4741a c4741a) {
                    GoogleAdATInterstitialAdapter.n(GoogleAdATInterstitialAdapter.this);
                }

                @Override // m2.m
                public final void onAdShowedFullScreenContent() {
                    try {
                        if (GoogleAdATInterstitialAdapter.this.f23708a != null) {
                            AdMobATInitManager.getInstance().a(GoogleAdATInterstitialAdapter.this.getTrackingInfo().z(), GoogleAdATInterstitialAdapter.this.f23708a);
                        }
                    } catch (Throwable unused) {
                    }
                    if (((CustomInterstitialAdapter) GoogleAdATInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) GoogleAdATInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
                    }
                }
            };
            this.f23712f = mVar;
            this.f23708a.c(mVar);
            this.f23708a.d(activity);
        }
    }

    private void a(Context context, Map<String, Object> map, Map<String, Object> map2) {
        C4766a a9 = AdMobATInitManager.getInstance().a(context, map, map2, b.INTERSTITIAL);
        a9.getClass();
        this.f23709b = new C4767b(a9);
        this.f23713g = new AnonymousClass1();
        postOnMainThread(new AnonymousClass2(context));
    }

    public static void a(GoogleAdATInterstitialAdapter googleAdATInterstitialAdapter, Context context, Map map, Map map2) {
        C4766a a9 = AdMobATInitManager.getInstance().a(context, (Map<String, Object>) map, (Map<String, Object>) map2, b.INTERSTITIAL);
        a9.getClass();
        googleAdATInterstitialAdapter.f23709b = new C4767b(a9);
        googleAdATInterstitialAdapter.f23713g = googleAdATInterstitialAdapter.new AnonymousClass1();
        googleAdATInterstitialAdapter.postOnMainThread(googleAdATInterstitialAdapter.new AnonymousClass2(context));
    }
}
