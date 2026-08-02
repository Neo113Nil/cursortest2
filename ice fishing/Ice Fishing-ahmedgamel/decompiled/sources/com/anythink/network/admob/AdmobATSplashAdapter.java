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
import m2.C4741a;
import m2.b;
import m2.f;
import m2.g;
import m2.i;
import m2.m;
import m2.n;
import m2.p;
import o2.AbstractC4801a;
import o2.AbstractC4802b;
import s2.E0;
import s2.U0;

/* loaded from: classes.dex */
public class AdmobATSplashAdapter extends CustomSplashAdapter {
    public static final String TAG = "AdmobATSplashAdapter";

    /* renamed from: c, reason: collision with root package name */
    AbstractC4801a f23670c;

    /* renamed from: d, reason: collision with root package name */
    m f23671d;

    /* renamed from: e, reason: collision with root package name */
    AbstractC4802b f23672e;

    /* renamed from: f, reason: collision with root package name */
    Map<String, Object> f23673f;

    /* renamed from: h, reason: collision with root package name */
    private String f23675h;
    private int i;

    /* renamed from: g, reason: collision with root package name */
    private String f23674g = "";

    /* renamed from: a, reason: collision with root package name */
    Bundle f23668a = new Bundle();

    /* renamed from: b, reason: collision with root package name */
    boolean f23669b = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f23676j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f23677k = false;

    /* renamed from: com.anythink.network.admob.AdmobATSplashAdapter$2, reason: invalid class name */
    public class AnonymousClass2 extends AbstractC4801a {
        public AnonymousClass2() {
        }

        @Override // m2.x
        public final void onAdFailedToLoad(n nVar) {
            if (((ATBaseAdInternalAdapter) AdmobATSplashAdapter.this).mLoadListener != null) {
                ((ATBaseAdInternalAdapter) AdmobATSplashAdapter.this).mLoadListener.onAdLoadError(String.valueOf(nVar.f39357a), nVar.f39358b);
            }
        }

        @Override // m2.x
        public final void onAdLoaded(AbstractC4802b abstractC4802b) {
            AdmobATSplashAdapter.this.f23672e = abstractC4802b;
            AdmobATSplashAdapter.this.f23673f.put("response_info", abstractC4802b.a());
            if (AdmobATSplashAdapter.this.f23676j) {
                AbstractC4802b abstractC4802b2 = AdmobATSplashAdapter.this.f23672e;
                p pVar = new p() { // from class: com.anythink.network.admob.AdmobATSplashAdapter.2.1
                    @Override // m2.p
                    public final void onPaidEvent(i iVar) {
                        if (AdmobATSplashAdapter.this.f23677k) {
                            return;
                        }
                        AdmobATSplashAdapter.e(AdmobATSplashAdapter.this);
                        AdMobATInitManager.getInstance();
                        AdMobATInitManager.a(AdmobATSplashAdapter.this.f23673f, iVar);
                        if (((CustomSplashAdapter) AdmobATSplashAdapter.this).mImpressionListener != null) {
                            ((CustomSplashAdapter) AdmobATSplashAdapter.this).mImpressionListener.onSplashAdShow();
                        }
                    }
                };
                K8 k82 = (K8) abstractC4802b2;
                k82.getClass();
                try {
                    k82.f26623a.c3(new U0(pVar));
                } catch (RemoteException e9) {
                    x2.i.i("#007 Could not call remote method.", e9);
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
        final /* synthetic */ Context f23684a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f23685b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Method f23686c;

        public AnonymousClass3(Context context, g gVar, Method method) {
            this.f23684a = context;
            this.f23685b = gVar;
            this.f23686c = method;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!AdMobATInitManager.getInstance().isLowestFor2400()) {
                AbstractC4802b.b(this.f23684a, AdmobATSplashAdapter.this.f23674g, this.f23685b, AdmobATSplashAdapter.this.f23670c);
                return;
            }
            Method method = this.f23686c;
            if (method == null) {
                AdmobATSplashAdapter.this.notifyATLoadFail("", "can not found the load method");
                return;
            }
            try {
                method.invoke(null, this.f23684a, AdmobATSplashAdapter.this.f23674g, this.f23685b, Integer.valueOf(AdmobATSplashAdapter.this.i), AdmobATSplashAdapter.this.f23670c);
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

        @Override // m2.m
        public final void onAdClicked() {
            if (((CustomSplashAdapter) AdmobATSplashAdapter.this).mImpressionListener != null) {
                ((CustomSplashAdapter) AdmobATSplashAdapter.this).mImpressionListener.onSplashAdClicked();
            }
        }

        @Override // m2.m
        public final void onAdDismissedFullScreenContent() {
            try {
                AdMobATInitManager.getInstance().a(AdmobATSplashAdapter.this.getTrackingInfo().z());
            } catch (Throwable unused) {
            }
            if (((CustomSplashAdapter) AdmobATSplashAdapter.this).mImpressionListener != null) {
                ((CustomSplashAdapter) AdmobATSplashAdapter.this).mImpressionListener.onSplashAdDismiss();
            }
        }

        @Override // m2.m
        public final void onAdFailedToShowFullScreenContent(C4741a c4741a) {
            String str = AdmobATSplashAdapter.TAG;
            StringBuilder sb = new StringBuilder("Admob splash show fail: ");
            sb.append(c4741a.f39357a);
            sb.append(", ");
            String str2 = c4741a.f39358b;
            sb.append(str2);
            Log.e(str, sb.toString());
            AdmobATSplashAdapter.n(AdmobATSplashAdapter.this);
            if (((CustomSplashAdapter) AdmobATSplashAdapter.this).mImpressionListener != null) {
                CustomSplashEventListener customSplashEventListener = ((CustomSplashAdapter) AdmobATSplashAdapter.this).mImpressionListener;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c4741a.f39357a);
                customSplashEventListener.onSplashAdShowFail(ErrorCode.getErrorCode(ErrorCode.adShowError, sb2.toString(), str2));
                ((CustomSplashAdapter) AdmobATSplashAdapter.this).mImpressionListener.onSplashAdDismiss();
            }
        }

        @Override // m2.m
        public final void onAdShowedFullScreenContent() {
            try {
                if (AdmobATSplashAdapter.this.f23672e != null) {
                    AdMobATInitManager.getInstance().a(AdmobATSplashAdapter.this.getTrackingInfo().z(), AdmobATSplashAdapter.this.f23672e);
                }
            } catch (Throwable unused) {
            }
            if (AdmobATSplashAdapter.this.f23676j) {
                AdmobATSplashAdapter.this.postOnMainThreadDelayed(new Runnable() { // from class: com.anythink.network.admob.AdmobATSplashAdapter.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (AdmobATSplashAdapter.this.f23677k) {
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
        admobATSplashAdapter.f23677k = true;
        return true;
    }

    public static /* synthetic */ int n(AdmobATSplashAdapter admobATSplashAdapter) {
        admobATSplashAdapter.mDismissType = 99;
        return 99;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        this.f23670c = null;
        this.f23671d = null;
        this.f23668a = null;
        this.f23669b = true;
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
        return this.f23673f;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return AdMobATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f23674g;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean isAdReady() {
        return this.f23672e != null;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        this.f23674g = ATInitMediation.getStringFromMap(map, "unit_id");
        this.f23675h = ATInitMediation.getStringFromMap(map, "payload");
        this.f23676j = ATInitMediation.getIntFromMap(map, j.w.f13415q, 2) == 1;
        if (!TextUtils.isEmpty(this.f23674g)) {
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
    public boolean setUserDataConsent(Context context, boolean z6, boolean z9) {
        return AdMobATInitManager.getInstance().setUserDataConsent(context, z6, z9);
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashAdapter
    public void show(Activity activity, ViewGroup viewGroup) {
        AnonymousClass4 anonymousClass4 = new AnonymousClass4();
        this.f23671d = anonymousClass4;
        AbstractC4802b abstractC4802b = this.f23672e;
        ((K8) abstractC4802b).f26624b.f26867n = anonymousClass4;
        abstractC4802b.c(activity);
    }

    private void a(Context context, Map<String, Object> map, Map<String, Object> map2) {
        this.f23673f = new HashMap();
        this.f23670c = new AnonymousClass2();
        f a9 = AdMobATInitManager.getInstance().a(context, map, map2, b.APP_OPEN_AD, !TextUtils.isEmpty(this.f23675h));
        if (!TextUtils.isEmpty(this.f23675h)) {
            ((E0) a9.f67u).f40321m = this.f23675h;
        }
        a9.getClass();
        postOnMainThread(new AnonymousClass3(context, new g(a9), AdMobATInitManager.getInstance().getAppOpenLoadMethod()));
    }

    private void a(Activity activity) {
        AnonymousClass4 anonymousClass4 = new AnonymousClass4();
        this.f23671d = anonymousClass4;
        AbstractC4802b abstractC4802b = this.f23672e;
        ((K8) abstractC4802b).f26624b.f26867n = anonymousClass4;
        abstractC4802b.c(activity);
    }

    public static void a(AdmobATSplashAdapter admobATSplashAdapter, Context context, Map map, Map map2) {
        admobATSplashAdapter.f23673f = new HashMap();
        admobATSplashAdapter.f23670c = admobATSplashAdapter.new AnonymousClass2();
        f a9 = AdMobATInitManager.getInstance().a(context, (Map<String, Object>) map, (Map<String, Object>) map2, b.APP_OPEN_AD, !TextUtils.isEmpty(admobATSplashAdapter.f23675h));
        if (!TextUtils.isEmpty(admobATSplashAdapter.f23675h)) {
            ((E0) a9.f67u).f40321m = admobATSplashAdapter.f23675h;
        }
        a9.getClass();
        admobATSplashAdapter.postOnMainThread(admobATSplashAdapter.new AnonymousClass3(context, new g(a9), AdMobATInitManager.getInstance().getAppOpenLoadMethod()));
    }
}
