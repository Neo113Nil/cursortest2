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
import k2.C4631a;
import k2.b;
import k2.g;
import k2.m;
import k2.n;
import l2.C4657a;
import l2.C4658b;
import m2.AbstractC4730a;
import m2.AbstractC4731b;

/* loaded from: classes.dex */
public class GoogleAdATSplashAdapter extends CustomSplashAdapter {

    /* renamed from: a, reason: collision with root package name */
    private static final String f22965a = "GoogleAdATSplashAdapter";

    /* renamed from: c, reason: collision with root package name */
    private int f22967c;

    /* renamed from: e, reason: collision with root package name */
    private AbstractC4730a f22969e;

    /* renamed from: f, reason: collision with root package name */
    private m f22970f;

    /* renamed from: g, reason: collision with root package name */
    private AbstractC4731b f22971g;

    /* renamed from: b, reason: collision with root package name */
    private String f22966b = "";

    /* renamed from: d, reason: collision with root package name */
    private Bundle f22968d = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    private Map<String, Object> f22972h = new HashMap();

    /* renamed from: com.anythink.network.admob.GoogleAdATSplashAdapter$2, reason: invalid class name */
    public class AnonymousClass2 extends AbstractC4730a {
        public AnonymousClass2() {
        }

        @Override // k2.x
        public final void onAdFailedToLoad(n nVar) {
            GoogleAdATSplashAdapter.this.notifyATLoadFail(String.valueOf(nVar.f38568a), nVar.f38569b);
        }

        @Override // k2.x
        public final void onAdLoaded(AbstractC4731b abstractC4731b) {
            GoogleAdATSplashAdapter.this.f22971g = abstractC4731b;
            GoogleAdATSplashAdapter.this.f22972h.put("response_info", GoogleAdATSplashAdapter.this.f22971g.a());
            if (((ATBaseAdInternalAdapter) GoogleAdATSplashAdapter.this).mLoadListener != null) {
                ((ATBaseAdInternalAdapter) GoogleAdATSplashAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }
    }

    /* renamed from: com.anythink.network.admob.GoogleAdATSplashAdapter$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f22978a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f22979b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Method f22980c;

        public AnonymousClass3(Context context, g gVar, Method method) {
            this.f22978a = context;
            this.f22979b = gVar;
            this.f22980c = method;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!AdMobATInitManager.getInstance().isLowestFor2400()) {
                AbstractC4731b.b(this.f22978a, GoogleAdATSplashAdapter.this.f22966b, this.f22979b, GoogleAdATSplashAdapter.this.f22969e);
                return;
            }
            Method method = this.f22980c;
            if (method == null) {
                GoogleAdATSplashAdapter.this.notifyATLoadFail("", "can not found the load method");
                return;
            }
            try {
                method.invoke(null, this.f22978a, GoogleAdATSplashAdapter.this.f22966b, this.f22979b, Integer.valueOf(GoogleAdATSplashAdapter.this.f22967c), GoogleAdATSplashAdapter.this.f22969e);
            } catch (Throwable th) {
                Log.e(GoogleAdATSplashAdapter.f22965a, "startLoadSplashAd() >>> network version: +" + GoogleAdATSplashAdapter.this.getNetworkSDKVersion() + ", load error: " + th.getMessage());
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
        this.f22971g = null;
        this.f22968d = null;
        this.f22969e = null;
        this.f22970f = null;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f22972h;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return AdMobATInitManager.getInstance().getGoogleAdManagerName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f22966b;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean isAdReady() {
        return this.f22971g != null;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        if (context == null) {
            notifyATLoadFail("", "context is null.");
            return;
        }
        String stringFromMap = ATInitMediation.getStringFromMap(map, "unit_id");
        this.f22966b = stringFromMap;
        if (!TextUtils.isEmpty(stringFromMap)) {
            this.f22967c = ATInitMediation.getIntFromMap(map, "orientation", 1);
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
    public boolean setUserDataConsent(Context context, boolean z3, boolean z6) {
        return AdMobATInitManager.getInstance().setUserDataConsent(context, z3, z6);
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashAdapter
    public void show(Activity activity, ViewGroup viewGroup) {
        if (!isAdReady()) {
            notifyATLoadFail("", "GAM Ad not ready.");
            return;
        }
        m mVar = new m() { // from class: com.anythink.network.admob.GoogleAdATSplashAdapter.4
            @Override // k2.m
            public final void onAdClicked() {
                if (((CustomSplashAdapter) GoogleAdATSplashAdapter.this).mImpressionListener != null) {
                    ((CustomSplashAdapter) GoogleAdATSplashAdapter.this).mImpressionListener.onSplashAdClicked();
                }
            }

            @Override // k2.m
            public final void onAdDismissedFullScreenContent() {
                try {
                    AdMobATInitManager.getInstance().a(GoogleAdATSplashAdapter.this.getTrackingInfo().z());
                } catch (Throwable unused) {
                }
                if (((CustomSplashAdapter) GoogleAdATSplashAdapter.this).mImpressionListener != null) {
                    ((CustomSplashAdapter) GoogleAdATSplashAdapter.this).mImpressionListener.onSplashAdDismiss();
                }
            }

            @Override // k2.m
            public final void onAdFailedToShowFullScreenContent(C4631a c4631a) {
                StringBuilder sb = new StringBuilder("GAM splash show fail: ");
                sb.append(c4631a.f38568a);
                sb.append(", ");
                String str = c4631a.f38569b;
                sb.append(str);
                Log.e(GoogleAdATSplashAdapter.f22965a, sb.toString());
                GoogleAdATSplashAdapter.j(GoogleAdATSplashAdapter.this);
                if (((CustomSplashAdapter) GoogleAdATSplashAdapter.this).mImpressionListener != null) {
                    CustomSplashEventListener customSplashEventListener = ((CustomSplashAdapter) GoogleAdATSplashAdapter.this).mImpressionListener;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(c4631a.f38568a);
                    customSplashEventListener.onSplashAdShowFail(ErrorCode.getErrorCode(ErrorCode.adShowError, sb2.toString(), str));
                    ((CustomSplashAdapter) GoogleAdATSplashAdapter.this).mImpressionListener.onSplashAdDismiss();
                }
            }

            @Override // k2.m
            public final void onAdShowedFullScreenContent() {
                try {
                    if (GoogleAdATSplashAdapter.this.f22971g != null) {
                        AdMobATInitManager.getInstance().a(GoogleAdATSplashAdapter.this.getTrackingInfo().z(), GoogleAdATSplashAdapter.this.f22971g);
                    }
                } catch (Throwable unused) {
                }
                if (((CustomSplashAdapter) GoogleAdATSplashAdapter.this).mImpressionListener != null) {
                    ((CustomSplashAdapter) GoogleAdATSplashAdapter.this).mImpressionListener.onSplashAdShow();
                }
            }
        };
        this.f22970f = mVar;
        AbstractC4731b abstractC4731b = this.f22971g;
        ((K8) abstractC4731b).f25872b.f26067n = mVar;
        abstractC4731b.c(activity);
    }

    private void a(Context context, Map<String, Object> map, Map<String, Object> map2) {
        this.f22969e = new AnonymousClass2();
        C4657a a9 = AdMobATInitManager.getInstance().a(context, map, map2, b.APP_OPEN_AD);
        a9.getClass();
        postOnMainThread(new AnonymousClass3(context, new C4658b(a9), AdMobATInitManager.getInstance().getAppOpenLoadMethod()));
    }

    public static void a(GoogleAdATSplashAdapter googleAdATSplashAdapter, Context context, Map map, Map map2) {
        googleAdATSplashAdapter.f22969e = googleAdATSplashAdapter.new AnonymousClass2();
        C4657a a9 = AdMobATInitManager.getInstance().a(context, (Map<String, Object>) map, (Map<String, Object>) map2, b.APP_OPEN_AD);
        a9.getClass();
        googleAdATSplashAdapter.postOnMainThread(googleAdATSplashAdapter.new AnonymousClass3(context, new C4658b(a9), AdMobATInitManager.getInstance().getAppOpenLoadMethod()));
    }
}
