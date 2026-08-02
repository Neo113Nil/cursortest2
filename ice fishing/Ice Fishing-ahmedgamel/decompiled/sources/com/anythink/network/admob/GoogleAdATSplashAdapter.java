package com.anythink.network.admob;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.api.MediationInitCallback;
import com.anythink.splashad.unitgroup.api.CustomSplashAdapter;
import com.anythink.splashad.unitgroup.api.CustomSplashEventListener;
import com.google.android.gms.internal.ads.K8;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import m2.C4741a;
import m2.b;
import m2.g;
import m2.m;
import m2.n;
import n2.C4766a;
import n2.C4767b;
import o2.AbstractC4801a;
import o2.AbstractC4802b;

/* loaded from: classes.dex */
public class GoogleAdATSplashAdapter extends CustomSplashAdapter {

    /* renamed from: a, reason: collision with root package name */
    private static final String f23752a = "GoogleAdATSplashAdapter";

    /* renamed from: c, reason: collision with root package name */
    private int f23754c;

    /* renamed from: e, reason: collision with root package name */
    private AbstractC4801a f23756e;

    /* renamed from: f, reason: collision with root package name */
    private m f23757f;

    /* renamed from: g, reason: collision with root package name */
    private AbstractC4802b f23758g;

    /* renamed from: b, reason: collision with root package name */
    private String f23753b = "";

    /* renamed from: d, reason: collision with root package name */
    private Bundle f23755d = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    private Map<String, Object> f23759h = new HashMap();

    /* renamed from: com.anythink.network.admob.GoogleAdATSplashAdapter$2, reason: invalid class name */
    public class AnonymousClass2 extends AbstractC4801a {
        public AnonymousClass2() {
        }

        @Override // m2.x
        public final void onAdFailedToLoad(n nVar) {
            GoogleAdATSplashAdapter.this.notifyATLoadFail(String.valueOf(nVar.f39357a), nVar.f39358b);
        }

        @Override // m2.x
        public final void onAdLoaded(AbstractC4802b abstractC4802b) {
            GoogleAdATSplashAdapter.this.f23758g = abstractC4802b;
            GoogleAdATSplashAdapter.this.f23759h.put("response_info", GoogleAdATSplashAdapter.this.f23758g.a());
            if (((ATBaseAdInternalAdapter) GoogleAdATSplashAdapter.this).mLoadListener != null) {
                ((ATBaseAdInternalAdapter) GoogleAdATSplashAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }
    }

    /* renamed from: com.anythink.network.admob.GoogleAdATSplashAdapter$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f23765a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f23766b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Method f23767c;

        public AnonymousClass3(Context context, g gVar, Method method) {
            this.f23765a = context;
            this.f23766b = gVar;
            this.f23767c = method;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!AdMobATInitManager.getInstance().isLowestFor2400()) {
                AbstractC4802b.b(this.f23765a, GoogleAdATSplashAdapter.this.f23753b, this.f23766b, GoogleAdATSplashAdapter.this.f23756e);
                return;
            }
            Method method = this.f23767c;
            if (method == null) {
                GoogleAdATSplashAdapter.this.notifyATLoadFail("", "can not found the load method");
                return;
            }
            try {
                method.invoke(null, this.f23765a, GoogleAdATSplashAdapter.this.f23753b, this.f23766b, Integer.valueOf(GoogleAdATSplashAdapter.this.f23754c), GoogleAdATSplashAdapter.this.f23756e);
            } catch (Throwable th) {
                Log.e(GoogleAdATSplashAdapter.f23752a, "startLoadSplashAd() >>> network version: +" + GoogleAdATSplashAdapter.this.getNetworkSDKVersion() + ", load error: " + th.getMessage());
                GoogleAdATSplashAdapter googleAdATSplashAdapter = GoogleAdATSplashAdapter.this;
                StringBuilder sb = new StringBuilder("load error: ");
                sb.append(th.getMessage());
                googleAdATSplashAdapter.notifyATLoadFail("", sb.toString());
            }
        }
    }

    public static /* synthetic */ int j(GoogleAdATSplashAdapter googleAdATSplashAdapter) {
        googleAdATSplashAdapter.mDismissType = 99;
        return 99;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        this.f23758g = null;
        this.f23755d = null;
        this.f23756e = null;
        this.f23757f = null;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f23759h;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return AdMobATInitManager.getInstance().getGoogleAdManagerName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f23753b;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean isAdReady() {
        return this.f23758g != null;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        if (context == null) {
            notifyATLoadFail("", "context is null.");
            return;
        }
        String stringFromMap = ATInitMediation.getStringFromMap(map, "unit_id");
        this.f23753b = stringFromMap;
        if (!TextUtils.isEmpty(stringFromMap)) {
            this.f23754c = ATInitMediation.getIntFromMap(map, "orientation", 1);
            final Context applicationContext = context.getApplicationContext();
            AdMobATInitManager.getInstance().initSDK(applicationContext, map, new MediationInitCallback() { // from class: com.anythink.network.admob.GoogleAdATSplashAdapter.1
                @Override // com.anythink.core.api.MediationInitCallback
                public final void onFail(String str) {
                    if (((ATBaseAdInternalAdapter) GoogleAdATSplashAdapter.this).mLoadListener != null) {
                        ((ATBaseAdInternalAdapter) GoogleAdATSplashAdapter.this).mLoadListener.onAdLoadError("", str);
                    }
                }

                @Override // com.anythink.core.api.MediationInitCallback
                public final void onSuccess() {
                    GoogleAdATSplashAdapter.a(GoogleAdATSplashAdapter.this, applicationContext, map, map2);
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

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashAdapter
    public void show(Activity activity, ViewGroup viewGroup) {
        if (!isAdReady()) {
            notifyATLoadFail("", "GAM Ad not ready.");
            return;
        }
        m mVar = new m() { // from class: com.anythink.network.admob.GoogleAdATSplashAdapter.4
            @Override // m2.m
            public final void onAdClicked() {
                if (((CustomSplashAdapter) GoogleAdATSplashAdapter.this).mImpressionListener != null) {
                    ((CustomSplashAdapter) GoogleAdATSplashAdapter.this).mImpressionListener.onSplashAdClicked();
                }
            }

            @Override // m2.m
            public final void onAdDismissedFullScreenContent() {
                try {
                    AdMobATInitManager.getInstance().a(GoogleAdATSplashAdapter.this.getTrackingInfo().z());
                } catch (Throwable unused) {
                }
                if (((CustomSplashAdapter) GoogleAdATSplashAdapter.this).mImpressionListener != null) {
                    ((CustomSplashAdapter) GoogleAdATSplashAdapter.this).mImpressionListener.onSplashAdDismiss();
                }
            }

            @Override // m2.m
            public final void onAdFailedToShowFullScreenContent(C4741a c4741a) {
                StringBuilder sb = new StringBuilder("GAM splash show fail: ");
                sb.append(c4741a.f39357a);
                sb.append(", ");
                String str = c4741a.f39358b;
                sb.append(str);
                Log.e(GoogleAdATSplashAdapter.f23752a, sb.toString());
                GoogleAdATSplashAdapter.j(GoogleAdATSplashAdapter.this);
                if (((CustomSplashAdapter) GoogleAdATSplashAdapter.this).mImpressionListener != null) {
                    CustomSplashEventListener customSplashEventListener = ((CustomSplashAdapter) GoogleAdATSplashAdapter.this).mImpressionListener;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(c4741a.f39357a);
                    customSplashEventListener.onSplashAdShowFail(ErrorCode.getErrorCode(ErrorCode.adShowError, sb2.toString(), str));
                    ((CustomSplashAdapter) GoogleAdATSplashAdapter.this).mImpressionListener.onSplashAdDismiss();
                }
            }

            @Override // m2.m
            public final void onAdShowedFullScreenContent() {
                try {
                    if (GoogleAdATSplashAdapter.this.f23758g != null) {
                        AdMobATInitManager.getInstance().a(GoogleAdATSplashAdapter.this.getTrackingInfo().z(), GoogleAdATSplashAdapter.this.f23758g);
                    }
                } catch (Throwable unused) {
                }
                if (((CustomSplashAdapter) GoogleAdATSplashAdapter.this).mImpressionListener != null) {
                    ((CustomSplashAdapter) GoogleAdATSplashAdapter.this).mImpressionListener.onSplashAdShow();
                }
            }
        };
        this.f23757f = mVar;
        AbstractC4802b abstractC4802b = this.f23758g;
        ((K8) abstractC4802b).f26624b.f26867n = mVar;
        abstractC4802b.c(activity);
    }

    private void a(Context context, Map<String, Object> map, Map<String, Object> map2) {
        this.f23756e = new AnonymousClass2();
        C4766a a9 = AdMobATInitManager.getInstance().a(context, map, map2, b.APP_OPEN_AD);
        a9.getClass();
        postOnMainThread(new AnonymousClass3(context, new C4767b(a9), AdMobATInitManager.getInstance().getAppOpenLoadMethod()));
    }

    public static void a(GoogleAdATSplashAdapter googleAdATSplashAdapter, Context context, Map map, Map map2) {
        googleAdATSplashAdapter.f23756e = googleAdATSplashAdapter.new AnonymousClass2();
        C4766a a9 = AdMobATInitManager.getInstance().a(context, (Map<String, Object>) map, (Map<String, Object>) map2, b.APP_OPEN_AD);
        a9.getClass();
        googleAdATSplashAdapter.postOnMainThread(googleAdATSplashAdapter.new AnonymousClass3(context, new C4767b(a9), AdMobATInitManager.getInstance().getAppOpenLoadMethod()));
    }
}
