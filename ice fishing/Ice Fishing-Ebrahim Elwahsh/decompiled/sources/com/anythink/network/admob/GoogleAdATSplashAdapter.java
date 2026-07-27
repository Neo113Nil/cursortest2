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
import com.google.android.gms.internal.ads.H8;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import k2.AbstractC4642m;
import k2.C4630a;
import k2.C4636g;
import k2.C4643n;
import k2.EnumC4631b;
import l2.C4686a;
import l2.C4687b;
import m2.AbstractC4777a;
import m2.AbstractC4778b;

/* loaded from: classes.dex */
public class GoogleAdATSplashAdapter extends CustomSplashAdapter {

    /* renamed from: a, reason: collision with root package name */
    private static final String f23123a = "GoogleAdATSplashAdapter";

    /* renamed from: c, reason: collision with root package name */
    private int f23125c;

    /* renamed from: e, reason: collision with root package name */
    private AbstractC4777a f23127e;

    /* renamed from: f, reason: collision with root package name */
    private AbstractC4642m f23128f;

    /* renamed from: g, reason: collision with root package name */
    private AbstractC4778b f23129g;

    /* renamed from: b, reason: collision with root package name */
    private String f23124b = "";

    /* renamed from: d, reason: collision with root package name */
    private Bundle f23126d = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    private Map<String, Object> f23130h = new HashMap();

    /* renamed from: com.anythink.network.admob.GoogleAdATSplashAdapter$2, reason: invalid class name */
    public class AnonymousClass2 extends AbstractC4777a {
        public AnonymousClass2() {
        }

        @Override // k2.x
        public final void onAdFailedToLoad(C4643n c4643n) {
            GoogleAdATSplashAdapter.this.notifyATLoadFail(String.valueOf(c4643n.f38688a), c4643n.f38689b);
        }

        @Override // k2.x
        public final void onAdLoaded(AbstractC4778b abstractC4778b) {
            GoogleAdATSplashAdapter.this.f23129g = abstractC4778b;
            GoogleAdATSplashAdapter.this.f23130h.put("response_info", GoogleAdATSplashAdapter.this.f23129g.a());
            if (((ATBaseAdInternalAdapter) GoogleAdATSplashAdapter.this).mLoadListener != null) {
                ((ATBaseAdInternalAdapter) GoogleAdATSplashAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }
    }

    /* renamed from: com.anythink.network.admob.GoogleAdATSplashAdapter$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f23136a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4636g f23137b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Method f23138c;

        public AnonymousClass3(Context context, C4636g c4636g, Method method) {
            this.f23136a = context;
            this.f23137b = c4636g;
            this.f23138c = method;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!AdMobATInitManager.getInstance().isLowestFor2400()) {
                AbstractC4778b.b(this.f23136a, GoogleAdATSplashAdapter.this.f23124b, this.f23137b, GoogleAdATSplashAdapter.this.f23127e);
                return;
            }
            Method method = this.f23138c;
            if (method == null) {
                GoogleAdATSplashAdapter.this.notifyATLoadFail("", "can not found the load method");
                return;
            }
            try {
                method.invoke(null, this.f23136a, GoogleAdATSplashAdapter.this.f23124b, this.f23137b, Integer.valueOf(GoogleAdATSplashAdapter.this.f23125c), GoogleAdATSplashAdapter.this.f23127e);
            } catch (Throwable th) {
                Log.e(GoogleAdATSplashAdapter.f23123a, "startLoadSplashAd() >>> network version: +" + GoogleAdATSplashAdapter.this.getNetworkSDKVersion() + ", load error: " + th.getMessage());
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
        this.f23129g = null;
        this.f23126d = null;
        this.f23127e = null;
        this.f23128f = null;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f23130h;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return AdMobATInitManager.getInstance().getGoogleAdManagerName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f23124b;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean isAdReady() {
        return this.f23129g != null;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        if (context == null) {
            notifyATLoadFail("", "context is null.");
            return;
        }
        String stringFromMap = ATInitMediation.getStringFromMap(map, "unit_id");
        this.f23124b = stringFromMap;
        if (!TextUtils.isEmpty(stringFromMap)) {
            this.f23125c = ATInitMediation.getIntFromMap(map, "orientation", 1);
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
    public boolean setUserDataConsent(Context context, boolean z8, boolean z9) {
        return AdMobATInitManager.getInstance().setUserDataConsent(context, z8, z9);
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashAdapter
    public void show(Activity activity, ViewGroup viewGroup) {
        if (!isAdReady()) {
            notifyATLoadFail("", "GAM Ad not ready.");
            return;
        }
        AbstractC4642m abstractC4642m = new AbstractC4642m() { // from class: com.anythink.network.admob.GoogleAdATSplashAdapter.4
            @Override // k2.AbstractC4642m
            public final void onAdClicked() {
                if (((CustomSplashAdapter) GoogleAdATSplashAdapter.this).mImpressionListener != null) {
                    ((CustomSplashAdapter) GoogleAdATSplashAdapter.this).mImpressionListener.onSplashAdClicked();
                }
            }

            @Override // k2.AbstractC4642m
            public final void onAdDismissedFullScreenContent() {
                try {
                    AdMobATInitManager.getInstance().a(GoogleAdATSplashAdapter.this.getTrackingInfo().z());
                } catch (Throwable unused) {
                }
                if (((CustomSplashAdapter) GoogleAdATSplashAdapter.this).mImpressionListener != null) {
                    ((CustomSplashAdapter) GoogleAdATSplashAdapter.this).mImpressionListener.onSplashAdDismiss();
                }
            }

            @Override // k2.AbstractC4642m
            public final void onAdFailedToShowFullScreenContent(C4630a c4630a) {
                StringBuilder sb = new StringBuilder("GAM splash show fail: ");
                sb.append(c4630a.f38688a);
                sb.append(", ");
                String str = c4630a.f38689b;
                sb.append(str);
                Log.e(GoogleAdATSplashAdapter.f23123a, sb.toString());
                GoogleAdATSplashAdapter.j(GoogleAdATSplashAdapter.this);
                if (((CustomSplashAdapter) GoogleAdATSplashAdapter.this).mImpressionListener != null) {
                    CustomSplashEventListener customSplashEventListener = ((CustomSplashAdapter) GoogleAdATSplashAdapter.this).mImpressionListener;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(c4630a.f38688a);
                    customSplashEventListener.onSplashAdShowFail(ErrorCode.getErrorCode(ErrorCode.adShowError, sb2.toString(), str));
                    ((CustomSplashAdapter) GoogleAdATSplashAdapter.this).mImpressionListener.onSplashAdDismiss();
                }
            }

            @Override // k2.AbstractC4642m
            public final void onAdShowedFullScreenContent() {
                try {
                    if (GoogleAdATSplashAdapter.this.f23129g != null) {
                        AdMobATInitManager.getInstance().a(GoogleAdATSplashAdapter.this.getTrackingInfo().z(), GoogleAdATSplashAdapter.this.f23129g);
                    }
                } catch (Throwable unused) {
                }
                if (((CustomSplashAdapter) GoogleAdATSplashAdapter.this).mImpressionListener != null) {
                    ((CustomSplashAdapter) GoogleAdATSplashAdapter.this).mImpressionListener.onSplashAdShow();
                }
            }
        };
        this.f23128f = abstractC4642m;
        AbstractC4778b abstractC4778b = this.f23129g;
        ((H8) abstractC4778b).f25315b.f25531n = abstractC4642m;
        abstractC4778b.c(activity);
    }

    private void a(Context context, Map<String, Object> map, Map<String, Object> map2) {
        this.f23127e = new AnonymousClass2();
        C4686a a9 = AdMobATInitManager.getInstance().a(context, map, map2, EnumC4631b.APP_OPEN_AD);
        a9.getClass();
        postOnMainThread(new AnonymousClass3(context, new C4687b(a9), AdMobATInitManager.getInstance().getAppOpenLoadMethod()));
    }

    public static void a(GoogleAdATSplashAdapter googleAdATSplashAdapter, Context context, Map map, Map map2) {
        googleAdATSplashAdapter.f23127e = googleAdATSplashAdapter.new AnonymousClass2();
        C4686a a9 = AdMobATInitManager.getInstance().a(context, (Map<String, Object>) map, (Map<String, Object>) map2, EnumC4631b.APP_OPEN_AD);
        a9.getClass();
        googleAdATSplashAdapter.postOnMainThread(googleAdATSplashAdapter.new AnonymousClass3(context, new C4687b(a9), AdMobATInitManager.getInstance().getAppOpenLoadMethod()));
    }
}
