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
import com.google.android.gms.internal.ads.H8;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import k2.AbstractC4642m;
import k2.C4630a;
import k2.C4635f;
import k2.C4636g;
import k2.C4638i;
import k2.C4643n;
import k2.EnumC4631b;
import k2.p;
import m2.AbstractC4777a;
import m2.AbstractC4778b;
import q2.E0;
import q2.V0;
import u2.i;

/* loaded from: classes.dex */
public class AdmobATSplashAdapter extends CustomSplashAdapter {
    public static final String TAG = "AdmobATSplashAdapter";

    /* renamed from: c, reason: collision with root package name */
    AbstractC4777a f23041c;

    /* renamed from: d, reason: collision with root package name */
    AbstractC4642m f23042d;

    /* renamed from: e, reason: collision with root package name */
    AbstractC4778b f23043e;

    /* renamed from: f, reason: collision with root package name */
    Map<String, Object> f23044f;

    /* renamed from: h, reason: collision with root package name */
    private String f23046h;
    private int i;

    /* renamed from: g, reason: collision with root package name */
    private String f23045g = "";

    /* renamed from: a, reason: collision with root package name */
    Bundle f23039a = new Bundle();

    /* renamed from: b, reason: collision with root package name */
    boolean f23040b = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f23047j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f23048k = false;

    /* renamed from: com.anythink.network.admob.AdmobATSplashAdapter$2, reason: invalid class name */
    public class AnonymousClass2 extends AbstractC4777a {
        public AnonymousClass2() {
        }

        @Override // k2.x
        public final void onAdFailedToLoad(C4643n c4643n) {
            if (((ATBaseAdInternalAdapter) AdmobATSplashAdapter.this).mLoadListener != null) {
                ((ATBaseAdInternalAdapter) AdmobATSplashAdapter.this).mLoadListener.onAdLoadError(String.valueOf(c4643n.f38688a), c4643n.f38689b);
            }
        }

        @Override // k2.x
        public final void onAdLoaded(AbstractC4778b abstractC4778b) {
            AdmobATSplashAdapter.this.f23043e = abstractC4778b;
            AdmobATSplashAdapter.this.f23044f.put("response_info", abstractC4778b.a());
            if (AdmobATSplashAdapter.this.f23047j) {
                AbstractC4778b abstractC4778b2 = AdmobATSplashAdapter.this.f23043e;
                p pVar = new p() { // from class: com.anythink.network.admob.AdmobATSplashAdapter.2.1
                    @Override // k2.p
                    public final void onPaidEvent(C4638i c4638i) {
                        if (AdmobATSplashAdapter.this.f23048k) {
                            return;
                        }
                        AdmobATSplashAdapter.e(AdmobATSplashAdapter.this);
                        AdMobATInitManager.getInstance();
                        AdMobATInitManager.a(AdmobATSplashAdapter.this.f23044f, c4638i);
                        if (((CustomSplashAdapter) AdmobATSplashAdapter.this).mImpressionListener != null) {
                            ((CustomSplashAdapter) AdmobATSplashAdapter.this).mImpressionListener.onSplashAdShow();
                        }
                    }
                };
                H8 h82 = (H8) abstractC4778b2;
                h82.getClass();
                try {
                    h82.f25314a.E0(new V0(pVar));
                } catch (RemoteException e6) {
                    i.i("#007 Could not call remote method.", e6);
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
        final /* synthetic */ Context f23055a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4636g f23056b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Method f23057c;

        public AnonymousClass3(Context context, C4636g c4636g, Method method) {
            this.f23055a = context;
            this.f23056b = c4636g;
            this.f23057c = method;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!AdMobATInitManager.getInstance().isLowestFor2400()) {
                AbstractC4778b.b(this.f23055a, AdmobATSplashAdapter.this.f23045g, this.f23056b, AdmobATSplashAdapter.this.f23041c);
                return;
            }
            Method method = this.f23057c;
            if (method == null) {
                AdmobATSplashAdapter.this.notifyATLoadFail("", "can not found the load method");
                return;
            }
            try {
                method.invoke(null, this.f23055a, AdmobATSplashAdapter.this.f23045g, this.f23056b, Integer.valueOf(AdmobATSplashAdapter.this.i), AdmobATSplashAdapter.this.f23041c);
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
    public class AnonymousClass4 extends AbstractC4642m {
        public AnonymousClass4() {
        }

        @Override // k2.AbstractC4642m
        public final void onAdClicked() {
            if (((CustomSplashAdapter) AdmobATSplashAdapter.this).mImpressionListener != null) {
                ((CustomSplashAdapter) AdmobATSplashAdapter.this).mImpressionListener.onSplashAdClicked();
            }
        }

        @Override // k2.AbstractC4642m
        public final void onAdDismissedFullScreenContent() {
            try {
                AdMobATInitManager.getInstance().a(AdmobATSplashAdapter.this.getTrackingInfo().z());
            } catch (Throwable unused) {
            }
            if (((CustomSplashAdapter) AdmobATSplashAdapter.this).mImpressionListener != null) {
                ((CustomSplashAdapter) AdmobATSplashAdapter.this).mImpressionListener.onSplashAdDismiss();
            }
        }

        @Override // k2.AbstractC4642m
        public final void onAdFailedToShowFullScreenContent(C4630a c4630a) {
            String str = AdmobATSplashAdapter.TAG;
            StringBuilder sb = new StringBuilder("Admob splash show fail: ");
            sb.append(c4630a.f38688a);
            sb.append(", ");
            String str2 = c4630a.f38689b;
            sb.append(str2);
            Log.e(str, sb.toString());
            AdmobATSplashAdapter.n(AdmobATSplashAdapter.this);
            if (((CustomSplashAdapter) AdmobATSplashAdapter.this).mImpressionListener != null) {
                CustomSplashEventListener customSplashEventListener = ((CustomSplashAdapter) AdmobATSplashAdapter.this).mImpressionListener;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c4630a.f38688a);
                customSplashEventListener.onSplashAdShowFail(ErrorCode.getErrorCode(ErrorCode.adShowError, sb2.toString(), str2));
                ((CustomSplashAdapter) AdmobATSplashAdapter.this).mImpressionListener.onSplashAdDismiss();
            }
        }

        @Override // k2.AbstractC4642m
        public final void onAdShowedFullScreenContent() {
            try {
                if (AdmobATSplashAdapter.this.f23043e != null) {
                    AdMobATInitManager.getInstance().a(AdmobATSplashAdapter.this.getTrackingInfo().z(), AdmobATSplashAdapter.this.f23043e);
                }
            } catch (Throwable unused) {
            }
            if (AdmobATSplashAdapter.this.f23047j) {
                AdmobATSplashAdapter.this.postOnMainThreadDelayed(new Runnable() { // from class: com.anythink.network.admob.AdmobATSplashAdapter.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (AdmobATSplashAdapter.this.f23048k) {
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
        admobATSplashAdapter.f23048k = true;
        return true;
    }

    public static /* synthetic */ int n(AdmobATSplashAdapter admobATSplashAdapter) {
        admobATSplashAdapter.mDismissType = 99;
        return 99;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        this.f23041c = null;
        this.f23042d = null;
        this.f23039a = null;
        this.f23040b = true;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        AdMobATInitManager.getInstance().a(context, map, map2, EnumC4631b.APP_OPEN_AD, aTBidRequestInfoListener);
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
        return this.f23044f;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return AdMobATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f23045g;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean isAdReady() {
        return this.f23043e != null;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        this.f23045g = ATInitMediation.getStringFromMap(map, "unit_id");
        this.f23046h = ATInitMediation.getStringFromMap(map, "payload");
        this.f23047j = ATInitMediation.getIntFromMap(map, j.w.f12786q, 2) == 1;
        if (!TextUtils.isEmpty(this.f23045g)) {
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
    public boolean setUserDataConsent(Context context, boolean z8, boolean z9) {
        return AdMobATInitManager.getInstance().setUserDataConsent(context, z8, z9);
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashAdapter
    public void show(Activity activity, ViewGroup viewGroup) {
        AnonymousClass4 anonymousClass4 = new AnonymousClass4();
        this.f23042d = anonymousClass4;
        AbstractC4778b abstractC4778b = this.f23043e;
        ((H8) abstractC4778b).f25315b.f25531n = anonymousClass4;
        abstractC4778b.c(activity);
    }

    private void a(Context context, Map<String, Object> map, Map<String, Object> map2) {
        this.f23044f = new HashMap();
        this.f23041c = new AnonymousClass2();
        C4635f a9 = AdMobATInitManager.getInstance().a(context, map, map2, EnumC4631b.APP_OPEN_AD, !TextUtils.isEmpty(this.f23046h));
        if (!TextUtils.isEmpty(this.f23046h)) {
            ((E0) a9.f37200u).f39929m = this.f23046h;
        }
        a9.getClass();
        postOnMainThread(new AnonymousClass3(context, new C4636g(a9), AdMobATInitManager.getInstance().getAppOpenLoadMethod()));
    }

    private void a(Activity activity) {
        AnonymousClass4 anonymousClass4 = new AnonymousClass4();
        this.f23042d = anonymousClass4;
        AbstractC4778b abstractC4778b = this.f23043e;
        ((H8) abstractC4778b).f25315b.f25531n = anonymousClass4;
        abstractC4778b.c(activity);
    }

    public static void a(AdmobATSplashAdapter admobATSplashAdapter, Context context, Map map, Map map2) {
        admobATSplashAdapter.f23044f = new HashMap();
        admobATSplashAdapter.f23041c = admobATSplashAdapter.new AnonymousClass2();
        C4635f a9 = AdMobATInitManager.getInstance().a(context, (Map<String, Object>) map, (Map<String, Object>) map2, EnumC4631b.APP_OPEN_AD, !TextUtils.isEmpty(admobATSplashAdapter.f23046h));
        if (!TextUtils.isEmpty(admobATSplashAdapter.f23046h)) {
            ((E0) a9.f37200u).f39929m = admobATSplashAdapter.f23046h;
        }
        a9.getClass();
        admobATSplashAdapter.postOnMainThread(admobATSplashAdapter.new AnonymousClass3(context, new C4636g(a9), AdMobATInitManager.getInstance().getAppOpenLoadMethod()));
    }
}
