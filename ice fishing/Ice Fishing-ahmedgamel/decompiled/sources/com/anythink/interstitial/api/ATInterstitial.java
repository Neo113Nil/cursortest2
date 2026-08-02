package com.anythink.interstitial.api;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdMultipleLoadedListener;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.ATAdRevenueListener;
import com.anythink.core.api.ATAdSourceStatusListener;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATEventInterface;
import com.anythink.core.api.ATNativeAdCustomRender;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.ATRequestingInfo;
import com.anythink.core.api.ATShowConfig;
import com.anythink.core.api.AdError;
import com.anythink.core.basead.adx.api.ATAdxBidFloorInfo;
import com.anythink.core.common.d.a;
import com.anythink.core.common.d.c;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.t;
import com.anythink.core.common.u;
import com.anythink.core.common.v.ab;
import com.anythink.core.common.v.p;
import com.anythink.interstitial.a.b;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class ATInterstitial {
    public static final String TAG = "ATInterstitial";
    WeakReference<Activity> mActivityWef;
    b mAdLoadManager;
    private ATAdRevenueListener mAdRevenueListener;
    c mAdSourceEventListener;
    public Context mContext;
    ATAdSourceStatusListener mDeveloperStatusListener;
    ATEventInterface mDownloadListener;
    public ATInterstitialListener mInterstitialListener;
    ATAdMultipleLoadedListener mMultipleLoadedListener;
    public String mPlacementId;
    Map<String, Object> mTKExtraMap;
    private ATNativeAdCustomRender mixNativeAdListener;
    private ATInterstitialExListener mInterListener = new ATInterstitialExListener() { // from class: com.anythink.interstitial.api.ATInterstitial.1
        @Override // com.anythink.interstitial.api.ATInterstitialExListener
        public void onDeeplinkCallback(final ATAdInfo aTAdInfo, final boolean z6) {
            t.b().b(new Runnable() { // from class: com.anythink.interstitial.api.ATInterstitial.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    ATInterstitialListener aTInterstitialListener = ATInterstitial.this.mInterstitialListener;
                    if (aTInterstitialListener == null || !(aTInterstitialListener instanceof ATInterstitialExListener)) {
                        return;
                    }
                    ((ATInterstitialExListener) aTInterstitialListener).onDeeplinkCallback(aTAdInfo, z6);
                }
            });
        }

        @Override // com.anythink.interstitial.api.ATInterstitialExListener
        public void onDownloadConfirm(final Context context, final ATAdInfo aTAdInfo, final ATNetworkConfirmInfo aTNetworkConfirmInfo) {
            t.b().b(new Runnable() { // from class: com.anythink.interstitial.api.ATInterstitial.1.2
                @Override // java.lang.Runnable
                public final void run() {
                    ATInterstitial aTInterstitial = ATInterstitial.this;
                    ATInterstitialListener aTInterstitialListener = aTInterstitial.mInterstitialListener;
                    if (aTInterstitialListener == null || !(aTInterstitialListener instanceof ATInterstitialExListener)) {
                        return;
                    }
                    ATInterstitialExListener aTInterstitialExListener = (ATInterstitialExListener) aTInterstitialListener;
                    Context context2 = context;
                    if (context2 == null) {
                        context2 = aTInterstitial.mContext;
                    }
                    aTInterstitialExListener.onDownloadConfirm(context2, aTAdInfo, aTNetworkConfirmInfo);
                }
            });
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public void onInterstitialAdClicked(final ATAdInfo aTAdInfo) {
            t.b().b(new Runnable() { // from class: com.anythink.interstitial.api.ATInterstitial.1.7
                @Override // java.lang.Runnable
                public final void run() {
                    ATInterstitialListener aTInterstitialListener = ATInterstitial.this.mInterstitialListener;
                    if (aTInterstitialListener != null) {
                        aTInterstitialListener.onInterstitialAdClicked(aTAdInfo);
                    }
                }
            });
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public void onInterstitialAdClose(final ATAdInfo aTAdInfo) {
            t.b().b(new Runnable() { // from class: com.anythink.interstitial.api.ATInterstitial.1.6
                @Override // java.lang.Runnable
                public final void run() {
                    ATInterstitialListener aTInterstitialListener = ATInterstitial.this.mInterstitialListener;
                    if (aTInterstitialListener != null) {
                        aTInterstitialListener.onInterstitialAdClose(aTAdInfo);
                    }
                }
            });
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public void onInterstitialAdLoadFail(AdError adError) {
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public void onInterstitialAdLoaded() {
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public void onInterstitialAdShow(final ATAdInfo aTAdInfo) {
            t.b().b(new Runnable() { // from class: com.anythink.interstitial.api.ATInterstitial.1.8
                @Override // java.lang.Runnable
                public final void run() {
                    if (ATInterstitial.this.mAdRevenueListener != null) {
                        ATInterstitial.this.mAdRevenueListener.onAdRevenuePaid(aTAdInfo);
                    }
                    ATInterstitialListener aTInterstitialListener = ATInterstitial.this.mInterstitialListener;
                    if (aTInterstitialListener != null) {
                        aTInterstitialListener.onInterstitialAdShow(aTAdInfo);
                    }
                }
            });
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public void onInterstitialAdVideoEnd(final ATAdInfo aTAdInfo) {
            t.b().b(new Runnable() { // from class: com.anythink.interstitial.api.ATInterstitial.1.4
                @Override // java.lang.Runnable
                public final void run() {
                    ATInterstitialListener aTInterstitialListener = ATInterstitial.this.mInterstitialListener;
                    if (aTInterstitialListener != null) {
                        aTInterstitialListener.onInterstitialAdVideoEnd(aTAdInfo);
                    }
                }
            });
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public void onInterstitialAdVideoError(final AdError adError) {
            t.b().b(new Runnable() { // from class: com.anythink.interstitial.api.ATInterstitial.1.5
                @Override // java.lang.Runnable
                public final void run() {
                    ATInterstitialListener aTInterstitialListener = ATInterstitial.this.mInterstitialListener;
                    if (aTInterstitialListener != null) {
                        aTInterstitialListener.onInterstitialAdVideoError(adError);
                    }
                }
            });
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public void onInterstitialAdVideoStart(final ATAdInfo aTAdInfo) {
            t.b().b(new Runnable() { // from class: com.anythink.interstitial.api.ATInterstitial.1.3
                @Override // java.lang.Runnable
                public final void run() {
                    ATInterstitialListener aTInterstitialListener = ATInterstitial.this.mInterstitialListener;
                    if (aTInterstitialListener != null) {
                        aTInterstitialListener.onInterstitialAdVideoStart(aTAdInfo);
                    }
                }
            });
        }
    };
    a adLoadListener = new a() { // from class: com.anythink.interstitial.api.ATInterstitial.2
        @Override // com.anythink.core.common.d.a
        public void onAdLoadFail(final AdError adError) {
            t.b().b(new Runnable() { // from class: com.anythink.interstitial.api.ATInterstitial.2.2
                @Override // java.lang.Runnable
                public final void run() {
                    ATInterstitialListener aTInterstitialListener = ATInterstitial.this.mInterstitialListener;
                    if (aTInterstitialListener != null) {
                        aTInterstitialListener.onInterstitialAdLoadFail(adError);
                    }
                }
            });
        }

        @Override // com.anythink.core.common.d.a
        public void onAdLoaded() {
            t.b().b(new Runnable() { // from class: com.anythink.interstitial.api.ATInterstitial.2.1
                @Override // java.lang.Runnable
                public final void run() {
                    ATInterstitialListener aTInterstitialListener = ATInterstitial.this.mInterstitialListener;
                    if (aTInterstitialListener != null) {
                        aTInterstitialListener.onInterstitialAdLoaded();
                    }
                }
            });
        }
    };
    public ATAdMultipleLoadedListener adMultipleLoadedListener = new ATAdMultipleLoadedListener() { // from class: com.anythink.interstitial.api.ATInterstitial.3
        @Override // com.anythink.core.api.ATAdMultipleLoadedListener
        public void onAdMultipleLoaded(final ATRequestingInfo aTRequestingInfo) {
            t.b().b(new Runnable() { // from class: com.anythink.interstitial.api.ATInterstitial.3.1
                @Override // java.lang.Runnable
                public final void run() {
                    ATAdMultipleLoadedListener aTAdMultipleLoadedListener = ATInterstitial.this.mMultipleLoadedListener;
                    if (aTAdMultipleLoadedListener != null) {
                        aTAdMultipleLoadedListener.onAdMultipleLoaded(aTRequestingInfo);
                    }
                }
            });
        }
    };

    public ATInterstitial(Context context, String str) {
        this.mContext = context.getApplicationContext();
        if (context instanceof Activity) {
            this.mActivityWef = new WeakReference<>((Activity) context);
        }
        this.mPlacementId = str;
        this.mAdLoadManager = b.a(context, str);
    }

    private void controlShow(Activity activity, ATShowConfig aTShowConfig) {
        ab.b(this.mPlacementId, j.r.f13330q, j.r.f13309A, j.r.f13328o, "");
        if (t.b().g() == null || TextUtils.isEmpty(t.b().p()) || TextUtils.isEmpty(t.b().q())) {
            Log.e(TAG, "Show error: SDK init error!");
            return;
        }
        if (activity == null) {
            Context context = this.mContext;
            if (context instanceof Activity) {
                activity = (Activity) context;
            }
        }
        Activity activity2 = activity;
        if (activity2 == null) {
            Log.e(TAG, "Interstitial Show Activity is null.");
        }
        this.mAdLoadManager.a(activity2, aTShowConfig, this.mInterListener, this.mDownloadListener, this.mTKExtraMap, this.mixNativeAdListener);
    }

    public static void entryAdScenario(String str, String str2) {
        t.b().a(str, str2, "3", (Map<String, Object>) null);
    }

    private ATAdStatusInfo getAdStatus() {
        if (t.b().g() != null && !TextUtils.isEmpty(t.b().p()) && !TextUtils.isEmpty(t.b().q())) {
            return this.mAdLoadManager.a(this.mContext, this.mTKExtraMap);
        }
        Log.e(TAG, "SDK init error!");
        return null;
    }

    private Context getRequestContext() {
        WeakReference<Activity> weakReference = this.mActivityWef;
        Activity activity = weakReference != null ? weakReference.get() : null;
        return activity != null ? activity : this.mContext;
    }

    public ATAdStatusInfo checkAdStatus() {
        ATAdStatusInfo adStatus = getAdStatus();
        if (adStatus == null) {
            return new ATAdStatusInfo(false, false, null);
        }
        ab.b(this.mPlacementId, j.r.f13330q, j.r.f13311C, adStatus.toString(), "");
        return adStatus;
    }

    public List<ATAdInfo> checkValidAdCaches() {
        b bVar = this.mAdLoadManager;
        if (bVar != null) {
            return bVar.a(this.mContext);
        }
        return null;
    }

    public boolean isAdReady() {
        ATAdStatusInfo adStatus = getAdStatus();
        if (adStatus == null) {
            return false;
        }
        boolean isReady = adStatus.isReady();
        ab.b(this.mPlacementId, j.r.f13330q, j.r.f13310B, String.valueOf(isReady), "");
        return isReady;
    }

    public void load() {
        load(null);
    }

    public void setAdDownloadListener(ATEventInterface aTEventInterface) {
        this.mDownloadListener = aTEventInterface;
    }

    public void setAdListener(ATInterstitialListener aTInterstitialListener) {
        this.mInterstitialListener = aTInterstitialListener;
    }

    public void setAdMultipleLoadedListener(ATAdMultipleLoadedListener aTAdMultipleLoadedListener) {
        this.mMultipleLoadedListener = aTAdMultipleLoadedListener;
    }

    public void setAdRevenueListener(ATAdRevenueListener aTAdRevenueListener) {
        this.mAdRevenueListener = aTAdRevenueListener;
    }

    public void setAdSourceStatusListener(ATAdSourceStatusListener aTAdSourceStatusListener) {
        if (this.mAdSourceEventListener == null) {
            this.mAdSourceEventListener = new c();
        }
        this.mDeveloperStatusListener = aTAdSourceStatusListener;
        this.mAdSourceEventListener.setAdSourceStatusListener(aTAdSourceStatusListener);
    }

    public void setLocalExtra(Map<String, Object> map) {
        u.a().a(this.mPlacementId, map);
    }

    public void setNativeAdCustomRender(ATNativeAdCustomRender aTNativeAdCustomRender) {
        this.mixNativeAdListener = aTNativeAdCustomRender;
    }

    public void setTKExtra(Map<String, Object> map) {
        if (this.mTKExtraMap == null) {
            this.mTKExtraMap = new ConcurrentHashMap();
        }
        this.mTKExtraMap.clear();
        this.mTKExtraMap.putAll(map);
    }

    @Deprecated
    public void show(Activity activity, String str) {
        controlShow(activity, p.e(str));
    }

    public static void entryAdScenario(String str, String str2, Map<String, Object> map) {
        t.b().a(str, str2, "3", map);
    }

    public void load(Context context) {
        load(context, (ATAdRequest) null);
    }

    public void show(Activity activity) {
        show(activity, "");
    }

    public void load(Context context, ATAdRequest aTAdRequest) {
        if (context == null) {
            context = getRequestContext();
        }
        load(context, aTAdRequest, 0);
    }

    public void show(Activity activity, ATShowConfig aTShowConfig) {
        controlShow(activity, aTShowConfig);
    }

    @Deprecated
    public void load(Context context, ATAdxBidFloorInfo aTAdxBidFloorInfo) {
        ATAdRequest build = aTAdxBidFloorInfo != null ? new ATAdRequest.Builder().setATAdxBidFloorInfo(aTAdxBidFloorInfo).build() : null;
        if (context == null) {
            context = getRequestContext();
        }
        load(context, build, 0);
    }

    private void load(Context context, ATAdRequest aTAdRequest, int i) {
        ab.a(this.mPlacementId, j.r.f13330q, j.r.f13338y, j.r.f13328o, "", true);
        this.mAdLoadManager.a(context, i, this.adLoadListener, this.mAdSourceEventListener, this.adMultipleLoadedListener, this.mTKExtraMap, aTAdRequest);
    }
}
