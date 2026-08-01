package com.anythink.network.admob;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.api.MediationInitCallback;
import com.anythink.core.common.d.j;
import com.anythink.splashad.unitgroup.api.CustomSplashAdapter;
import com.anythink.splashad.unitgroup.api.CustomSplashEventListener;
import com.google.android.gms.internal.ads.K8;
import java.lang.reflect.Method;
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
import m2.AbstractC4730a;
import m2.AbstractC4731b;
import q2.E0;
import q2.U0;

/* loaded from: classes.dex */
public class AdmobATSplashAdapter extends CustomSplashAdapter {
    public static final String TAG = "AdmobATSplashAdapter";

    /* renamed from: c, reason: collision with root package name */
    AbstractC4730a f22883c;

    /* renamed from: d, reason: collision with root package name */
    m f22884d;

    /* renamed from: e, reason: collision with root package name */
    AbstractC4731b f22885e;

    /* renamed from: f, reason: collision with root package name */
    Map<String, Object> f22886f;

    /* renamed from: h, reason: collision with root package name */
    private String f22888h;
    private int i;

    /* renamed from: g, reason: collision with root package name */
    private String f22887g = "";

    /* renamed from: a, reason: collision with root package name */
    Bundle f22881a = new Bundle();

    /* renamed from: b, reason: collision with root package name */
    boolean f22882b = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f22889j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f22890k = false;

    /* renamed from: com.anythink.network.admob.AdmobATSplashAdapter$2, reason: invalid class name */
    public class AnonymousClass2 extends AbstractC4730a {
        public AnonymousClass2() {
        }

        @Override // k2.x
        public final void onAdFailedToLoad(n nVar) {
            if (((ATBaseAdInternalAdapter) AdmobATSplashAdapter.this).mLoadListener != null) {
                ((ATBaseAdInternalAdapter) AdmobATSplashAdapter.this).mLoadListener.onAdLoadError(String.valueOf(nVar.f38568a), nVar.f38569b);
            }
        }

        @Override // k2.x
        public final void onAdLoaded(AbstractC4731b abstractC4731b) {
            AdmobATSplashAdapter.this.f22885e = abstractC4731b;
            AdmobATSplashAdapter.this.f22886f.put("response_info", abstractC4731b.a());
            if (AdmobATSplashAdapter.this.f22889j) {
                AbstractC4731b abstractC4731b2 = AdmobATSplashAdapter.this.f22885e;
                p pVar = new p() { // from class: com.anythink.network.admob.AdmobATSplashAdapter.2.1
                    @Override // k2.p
                    public final void onPaidEvent(i iVar) {
                        if (AdmobATSplashAdapter.this.f22890k) {
                            return;
                        }
                        AdmobATSplashAdapter.e(AdmobATSplashAdapter.this);
                        AdMobATInitManager.getInstance();
                        AdMobATInitManager.a(AdmobATSplashAdapter.this.f22886f, iVar);
                        if (((CustomSplashAdapter) AdmobATSplashAdapter.this).mImpressionListener != null) {
                            ((CustomSplashAdapter) AdmobATSplashAdapter.this).mImpressionListener.onSplashAdShow();
                        }
                    }
                };
                K8 k82 = (K8) abstractC4731b2;
                k82.getClass();
                try {
                    k82.f25871a.N0(new U0(pVar));
                } catch (RemoteException e9) {
                    v2.i.i("#007 Could not call remote method.", e9);
                }
            }
            if (((ATBaseAdInternalAdapter) AdmobATSplashAdapter.this).mLoadListener != null) {
                ((ATBaseAdInternalAdapter) AdmobATSplashAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }
    }

    /* renamed from: com.anythink.network.admob.AdmobATSplashAdapter$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f22897a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f22898b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Method f22899c;

        public AnonymousClass3(Context context, g gVar, Method method) {
            this.f22897a = context;
            this.f22898b = gVar;
            this.f22899c = method;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!AdMobATInitManager.getInstance().isLowestFor2400()) {
                AbstractC4731b.b(this.f22897a, AdmobATSplashAdapter.this.f22887g, this.f22898b, AdmobATSplashAdapter.this.f22883c);
                return;
            }
            Method method = this.f22899c;
            if (method == null) {
                AdmobATSplashAdapter.this.notifyATLoadFail("", "can not found the load method");
                return;
            }
            try {
                method.invoke(null, this.f22897a, AdmobATSplashAdapter.this.f22887g, this.f22898b, Integer.valueOf(AdmobATSplashAdapter.this.i), AdmobATSplashAdapter.this.f22883c);
            } catch (Throwable th) {
                Log.e(AdmobATSplashAdapter.TAG, "startLoadSplashAd() >>> network version: +" + AdmobATSplashAdapter.this.getNetworkSDKVersion() + ", load error: " + th.getMessage());
                AdmobATSplashAdapter admobATSplashAdapter = AdmobATSplashAdapter.this;
                StringBuilder sb = new StringBuilder("load error: ");
                sb.append(th.getMessage());
                admobATSplashAdapter.notifyATLoadFail("", sb.toString());
            }
        }
    }

    /* renamed from: com.anythink.network.admob.AdmobATSplashAdapter$4, reason: invalid class name */
    public class AnonymousClass4 extends m {
        public AnonymousClass4() {
        }

        @Override // k2.m
        public final void onAdClicked() {
            if (((CustomSplashAdapter) AdmobATSplashAdapter.this).mImpressionListener != null) {
                ((CustomSplashAdapter) AdmobATSplashAdapter.this).mImpressionListener.onSplashAdClicked();
            }
        }

        @Override // k2.m
        public final void onAdDismissedFullScreenContent() {
            try {
                AdMobATInitManager.getInstance().a(AdmobATSplashAdapter.this.getTrackingInfo().z());
            } catch (Throwable unused) {
            }
            if (((CustomSplashAdapter) AdmobATSplashAdapter.this).mImpressionListener != null) {
                ((CustomSplashAdapter) AdmobATSplashAdapter.this).mImpressionListener.onSplashAdDismiss();
            }
        }

        @Override // k2.m
        public final void onAdFailedToShowFullScreenContent(C4631a c4631a) {
            String str = AdmobATSplashAdapter.TAG;
            StringBuilder sb = new StringBuilder("Admob splash show fail: ");
            sb.append(c4631a.f38568a);
            sb.append(", ");
            String str2 = c4631a.f38569b;
            sb.append(str2);
            Log.e(str, sb.toString());
            AdmobATSplashAdapter.n(AdmobATSplashAdapter.this);
            if (((CustomSplashAdapter) AdmobATSplashAdapter.this).mImpressionListener != null) {
                CustomSplashEventListener customSplashEventListener = ((CustomSplashAdapter) AdmobATSplashAdapter.this).mImpressionListener;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c4631a.f38568a);
                customSplashEventListener.onSplashAdShowFail(ErrorCode.getErrorCode(ErrorCode.adShowError, sb2.toString(), str2));
                ((CustomSplashAdapter) AdmobATSplashAdapter.this).mImpressionListener.onSplashAdDismiss();
            }
        }

        @Override // k2.m
        public final void onAdShowedFullScreenContent() {
            try {
                if (AdmobATSplashAdapter.this.f22885e != null) {
                    AdMobATInitManager.getInstance().a(AdmobATSplashAdapter.this.getTrackingInfo().z(), AdmobATSplashAdapter.this.f22885e);
                }
            } catch (Throwable unused) {
            }
            if (AdmobATSplashAdapter.this.f22889j) {
                AdmobATSplashAdapter.this.postOnMainThreadDelayed(new Runnable() { // from class: com.anythink.network.admob.AdmobATSplashAdapter.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (AdmobATSplashAdapter.this.f22890k) {
                            return;
                        }
                        AdmobATSplashAdapter.e(AdmobATSplashAdapter.this);
                        if (((CustomSplashAdapter) AdmobATSplashAdapter.this).mImpressionListener != null) {
                            ((CustomSplashAdapter) AdmobATSplashAdapter.this).mImpressionListener.onSplashAdShow();
                        }
                    }
                }, 500L);
            } else if (((CustomSplashAdapter) AdmobATSplashAdapter.this).mImpressionListener != null) {
                ((CustomSplashAdapter) AdmobATSplashAdapter.this).mImpressionListener.onSplashAdShow();
            }
        }
    }

    public static /* synthetic */ boolean e(AdmobATSplashAdapter admobATSplashAdapter) {
        admobATSplashAdapter.f22890k = true;
        return true;
    }

    public static /* synthetic */ int n(AdmobATSplashAdapter admobATSplashAdapter) {
        admobATSplashAdapter.mDismissType = 99;
        return 99;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        this.f22883c = null;
        this.f22884d = null;
        this.f22881a = null;
        this.f22882b = true;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        AdMobATInitManager.getInstance().a(context, map, map2, b.APP_OPEN_AD, aTBidRequestInfoListener);
    }

    @Override // com.anythink.core.api.ATBaseAdInternalAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<Integer, Class<? extends ATBaseAdAdapter>> getFormatAdapterMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(2, AdmobATBannerAdapter.class);
        hashMap.put(3, AdmobATInterstitialAdapter.class);
        hashMap.put(0, AdmobATAdapter.class);
        return hashMap;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f22886f;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return AdMobATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f22887g;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean isAdReady() {
        return this.f22885e != null;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        this.f22887g = ATInitMediation.getStringFromMap(map, "unit_id");
        this.f22888h = ATInitMediation.getStringFromMap(map, "payload");
        this.f22889j = ATInitMediation.getIntFromMap(map, j.w.f12629q, 2) == 1;
        if (!TextUtils.isEmpty(this.f22887g)) {
            this.i = ATInitMediation.getIntFromMap(map, "orientation", 1);
            final Context applicationContext = context.getApplicationContext();
            AdMobATInitManager.getInstance().initSDK(applicationContext, map, new MediationInitCallback() { // from class: com.anythink.network.admob.AdmobATSplashAdapter.1
                @Override // com.anythink.core.api.MediationInitCallback
                public final void onFail(String str) {
                    if (((ATBaseAdInternalAdapter) AdmobATSplashAdapter.this).mLoadListener != null) {
                        ((ATBaseAdInternalAdapter) AdmobATSplashAdapter.this).mLoadListener.onAdLoadError("", str);
                    }
                }

                @Override // com.anythink.core.api.MediationInitCallback
                public final void onSuccess() {
                    AdmobATSplashAdapter.a(AdmobATSplashAdapter.this, applicationContext, map, map2);
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
        AnonymousClass4 anonymousClass4 = new AnonymousClass4();
        this.f22884d = anonymousClass4;
        AbstractC4731b abstractC4731b = this.f22885e;
        ((K8) abstractC4731b).f25872b.f26067n = anonymousClass4;
        abstractC4731b.c(activity);
    }

    private void a(Context context, Map<String, Object> map, Map<String, Object> map2) {
        this.f22886f = new HashMap();
        this.f22883c = new AnonymousClass2();
        f a9 = AdMobATInitManager.getInstance().a(context, map, map2, b.APP_OPEN_AD, !TextUtils.isEmpty(this.f22888h));
        if (!TextUtils.isEmpty(this.f22888h)) {
            ((E0) a9.f1720u).f40022m = this.f22888h;
        }
        a9.getClass();
        postOnMainThread(new AnonymousClass3(context, new g(a9), AdMobATInitManager.getInstance().getAppOpenLoadMethod()));
    }

    private void a(Activity activity) {
        AnonymousClass4 anonymousClass4 = new AnonymousClass4();
        this.f22884d = anonymousClass4;
        AbstractC4731b abstractC4731b = this.f22885e;
        ((K8) abstractC4731b).f25872b.f26067n = anonymousClass4;
        abstractC4731b.c(activity);
    }

    public static void a(AdmobATSplashAdapter admobATSplashAdapter, Context context, Map map, Map map2) {
        admobATSplashAdapter.f22886f = new HashMap();
        admobATSplashAdapter.f22883c = admobATSplashAdapter.new AnonymousClass2();
        f a9 = AdMobATInitManager.getInstance().a(context, (Map<String, Object>) map, (Map<String, Object>) map2, b.APP_OPEN_AD, !TextUtils.isEmpty(admobATSplashAdapter.f22888h));
        if (!TextUtils.isEmpty(admobATSplashAdapter.f22888h)) {
            ((E0) a9.f1720u).f40022m = admobATSplashAdapter.f22888h;
        }
        a9.getClass();
        admobATSplashAdapter.postOnMainThread(admobATSplashAdapter.new AnonymousClass3(context, new g(a9), AdMobATInitManager.getInstance().getAppOpenLoadMethod()));
    }
}
