package com.anythink.nativead.api;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdMultipleLoadedListener;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.ATAdSourceStatusListener;
import com.anythink.core.api.ATAdStatusInfo;
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
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class ATNative {
    private final String TAG = "ATNative";
    a adLoadListener = new a() { // from class: com.anythink.nativead.api.ATNative.1
        @Override // com.anythink.core.common.d.a
        public void onAdLoadFail(final AdError adError) {
            t.b().b(new Runnable() { // from class: com.anythink.nativead.api.ATNative.1.2
                @Override // java.lang.Runnable
                public final void run() {
                    ATNativeNetworkListener aTNativeNetworkListener = ATNative.this.mListener;
                    if (aTNativeNetworkListener != null) {
                        aTNativeNetworkListener.onNativeAdLoadFail(adError);
                    }
                }
            });
        }

        @Override // com.anythink.core.common.d.a
        public void onAdLoaded() {
            t.b().b(new Runnable() { // from class: com.anythink.nativead.api.ATNative.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    ATNativeNetworkListener aTNativeNetworkListener = ATNative.this.mListener;
                    if (aTNativeNetworkListener != null) {
                        aTNativeNetworkListener.onNativeAdLoaded();
                    }
                }
            });
        }
    };
    public ATAdMultipleLoadedListener adMultipleLoadedListener = new ATAdMultipleLoadedListener() { // from class: com.anythink.nativead.api.ATNative.2
        @Override // com.anythink.core.api.ATAdMultipleLoadedListener
        public void onAdMultipleLoaded(final ATRequestingInfo aTRequestingInfo) {
            t.b().b(new Runnable() { // from class: com.anythink.nativead.api.ATNative.2.1
                @Override // java.lang.Runnable
                public final void run() {
                    ATAdMultipleLoadedListener aTAdMultipleLoadedListener = ATNative.this.mMultipleLoadedListener;
                    if (aTAdMultipleLoadedListener != null) {
                        aTAdMultipleLoadedListener.onAdMultipleLoaded(aTRequestingInfo);
                    }
                }
            });
        }
    };
    WeakReference<Activity> mActivityRef;
    com.anythink.nativead.a.a mAdLoadManager;
    c mAdSourceEventListener;
    Context mContext;
    ATAdSourceStatusListener mDeveloperStatusListener;
    ATNativeNetworkListener mListener;
    ATAdMultipleLoadedListener mMultipleLoadedListener;
    String mPlacementId;
    Map<String, Object> mTKExtraMap;

    public ATNative(Context context, String str, ATNativeNetworkListener aTNativeNetworkListener) {
        this.mContext = context.getApplicationContext();
        if (context instanceof Activity) {
            this.mActivityRef = new WeakReference<>((Activity) context);
        }
        this.mPlacementId = str;
        this.mListener = aTNativeNetworkListener;
        this.mAdLoadManager = com.anythink.nativead.a.a.a(context, str);
    }

    public static void entryAdScenario(String str, String str2) {
        t.b().a(str, str2, "0", (Map<String, Object>) null);
    }

    private Context getContext() {
        Activity activity;
        WeakReference<Activity> weakReference = this.mActivityRef;
        return (weakReference == null || (activity = weakReference.get()) == null) ? this.mContext : activity;
    }

    public ATAdStatusInfo checkAdStatus() {
        if (t.b().g() == null || TextUtils.isEmpty(t.b().p()) || TextUtils.isEmpty(t.b().q())) {
            Log.e(this.TAG, "SDK init error!");
            return new ATAdStatusInfo(false, false, null);
        }
        ATAdStatusInfo a9 = this.mAdLoadManager.a(getContext(), this.mTKExtraMap);
        ab.b(this.mPlacementId, j.r.f12546s, j.r.f12525C, a9.toString(), "");
        return a9;
    }

    public List<ATAdInfo> checkValidAdCaches() {
        com.anythink.nativead.a.a aVar = this.mAdLoadManager;
        if (aVar != null) {
            return aVar.a(getContext());
        }
        return null;
    }

    public NativeAd getNativeAd() {
        return getNativeAd((ATShowConfig) null);
    }

    public void makeAdRequest() {
        makeAdRequest((ATAdRequest) null);
    }

    public void setAdListener(ATNativeNetworkListener aTNativeNetworkListener) {
        this.mListener = aTNativeNetworkListener;
    }

    public void setAdMultipleLoadedListener(ATAdMultipleLoadedListener aTAdMultipleLoadedListener) {
        this.mMultipleLoadedListener = aTAdMultipleLoadedListener;
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

    public void setTKExtra(Map<String, Object> map) {
        if (this.mTKExtraMap == null) {
            this.mTKExtraMap = new ConcurrentHashMap();
        }
        this.mTKExtraMap.clear();
        this.mTKExtraMap.putAll(map);
    }

    public static void entryAdScenario(String str, String str2, Map<String, Object> map) {
        t.b().a(str, str2, "0", map);
    }

    @Deprecated
    public NativeAd getNativeAd(String str) {
        return getNativeAd(p.e(str));
    }

    @Deprecated
    public void makeAdRequest(ATAdxBidFloorInfo aTAdxBidFloorInfo) {
        makeAdRequest(aTAdxBidFloorInfo != null ? new ATAdRequest.Builder().setATAdxBidFloorInfo(aTAdxBidFloorInfo).build() : null);
    }

    public NativeAd getNativeAd(ATShowConfig aTShowConfig) {
        com.anythink.core.common.h.c a9 = this.mAdLoadManager.a(aTShowConfig, this.mTKExtraMap);
        if (a9 != null) {
            return new NativeAd(getContext(), this.mPlacementId, a9);
        }
        return null;
    }

    public void makeAdRequest(ATAdRequest aTAdRequest) {
        ab.a(this.mPlacementId, j.r.f12546s, j.r.f12552y, j.r.f12542o, "", true);
        this.mAdLoadManager.a(getContext(), this.adLoadListener, this.mAdSourceEventListener, this.adMultipleLoadedListener, this.mTKExtraMap, aTAdRequest);
    }
}
