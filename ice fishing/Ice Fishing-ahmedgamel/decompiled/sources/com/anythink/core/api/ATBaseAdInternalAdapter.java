package com.anythink.core.api;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.d.b;
import com.anythink.core.common.d.f;
import com.anythink.core.common.h.n;
import com.anythink.core.common.v.p;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class ATBaseAdInternalAdapter extends f implements IATBaseAdAdapter, b.a {
    protected static final int BANNER_FORMAT = 2;
    protected static final int INTERSTITIAL_FORMAT = 3;
    protected static final int NATIVE_FORMAT = 0;
    protected static final int REWARDVIDEO_FORMAT = 1;
    protected static final int SPLASH_FORMAT = 4;
    private static final String TAG = "ATBaseAdInternalAdapter";
    private static final String VERSION_INCOMPATIBLE_ERROR_MSG = "Adapter version and sdk version are incompatible";
    public ATBiddingListener mBiddingListener;
    protected ATEventInterface mDownloadListener;
    protected ATCustomLoadListener mLoadListener;
    protected com.anythink.core.common.l.d.b serverExtraInfo;
    private final IATBaseAdAdapter mBaseAdAdapterProxy = new com.anythink.core.common.l.a.b(this);
    protected String mUserId = "";
    protected String mUserData = "";
    protected String mScenario = "";
    protected int mDismissType = 0;
    protected int mFetchAdTimeout = 10000;
    protected int mRequestNum = 1;
    protected int carouselShowType = 0;

    private void fillParams(Map<String, Object> map) {
        if (getTrackingInfo() != null) {
            p.a(map, getTrackingInfo().af());
        }
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public Map<Integer, Class<? extends ATBaseAdAdapter>> getFormatAdapterMap() {
        return null;
    }

    public final Map<String, Object> getInternalNetworkInfoMap() {
        return this.mBaseAdAdapterProxy.getNetworkInfoMap();
    }

    public final String getInternalNetworkName() {
        return this.mBaseAdAdapterProxy.getNetworkName();
    }

    public final String getInternalNetworkPlacementId() {
        return this.mBaseAdAdapterProxy.getNetworkPlacementId();
    }

    public final String getInternalNetworkSDKVersion() {
        return this.mBaseAdAdapterProxy.getNetworkSDKVersion();
    }

    public View getMixView() {
        return null;
    }

    @Deprecated
    public final int getMixedFormatAdType() {
        com.anythink.core.common.l.d.b bVar = this.serverExtraInfo;
        if (bVar != null) {
            return bVar.b();
        }
        return -1;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public final com.anythink.core.common.l.d.b getServerExtraInfo() {
        return this.serverExtraInfo;
    }

    public final void internalDestory() {
        this.mBaseAdAdapterProxy.destory();
    }

    public final void internalGetBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        this.mBaseAdAdapterProxy.getBidRequestInfo(context, map, map2, aTBidRequestInfoListener);
    }

    public final boolean internalInitNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        return this.mBaseAdAdapterProxy.initNetworkObjectByPlacementId(context, map, map2);
    }

    public final boolean internalIsAdReady() {
        return this.mBaseAdAdapterProxy.isAdReady();
    }

    public final void internalLoad(Context context, Map<String, Object> map, Map<String, Object> map2, ATCustomLoadListener aTCustomLoadListener) {
        this.mBaseAdAdapterProxy.loadCustomNetworkAd(context, map, map2, aTCustomLoadListener);
    }

    public final boolean internalSetUserDataConsent(Context context, boolean z6, boolean z9) {
        return this.mBaseAdAdapterProxy.setUserDataConsent(context, z6, z9);
    }

    public final void internalShow(Activity activity, ViewGroup viewGroup, ATCommonImpressionListener aTCommonImpressionListener) {
        this.mBaseAdAdapterProxy.internalFormatShow(activity, viewGroup, aTCommonImpressionListener);
    }

    public final boolean internalStartBiddingRequest(Context context, Map<String, Object> map, Map<String, Object> map2, ATBiddingListener aTBiddingListener) {
        boolean startBiddingRequest = this.mBaseAdAdapterProxy.startBiddingRequest(context, map, map2, aTBiddingListener);
        if (!startBiddingRequest) {
            this.mBiddingListener = null;
        }
        return startBiddingRequest;
    }

    public final boolean isMixBanner() {
        com.anythink.core.common.l.d.b bVar = this.serverExtraInfo;
        return bVar != null && bVar.n();
    }

    public final boolean isMixFormatAd() {
        com.anythink.core.common.l.d.b bVar = this.serverExtraInfo;
        return bVar != null && bVar.k();
    }

    public final boolean isMixInterstitial() {
        com.anythink.core.common.l.d.b bVar = this.serverExtraInfo;
        return bVar != null && bVar.o();
    }

    public final boolean isMixNative() {
        com.anythink.core.common.l.d.b bVar = this.serverExtraInfo;
        return bVar != null && bVar.l();
    }

    public final boolean isMixSplash() {
        com.anythink.core.common.l.d.b bVar = this.serverExtraInfo;
        return bVar != null && bVar.m();
    }

    public final boolean isNativeMixToBanner() {
        com.anythink.core.common.l.d.b bVar;
        return isMixNative() && (bVar = this.serverExtraInfo) != null && bVar.f();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2, ATCustomLoadListener aTCustomLoadListener) {
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void parseGlobalParams(Map<String, Object> map, Map<String, Object> map2) {
        try {
            fillParams(map);
            if (map2 != null) {
                this.mUserId = map2.get("user_id") != null ? map2.get("user_id").toString() : "";
                this.mUserData = map2.get(ATAdConst.KEY.USER_CUSTOM_DATA) != null ? map2.get(ATAdConst.KEY.USER_CUSTOM_DATA).toString() : "";
            }
            if (map != null) {
                this.serverExtraInfo = new com.anythink.core.common.l.d.b(map);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void setAdDownloadListener(ATEventInterface aTEventInterface) {
        this.mDownloadListener = aTEventInterface;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void setBiddingListener(ATBiddingListener aTBiddingListener) {
        this.mBiddingListener = aTBiddingListener;
    }

    public final void setCarouselShowType(int i) {
        this.carouselShowType = i;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void setLoadListener(ATCustomLoadListener aTCustomLoadListener) {
        this.mLoadListener = aTCustomLoadListener;
    }

    public final void setScenario(String str) {
        this.mScenario = str;
    }

    @Override // com.anythink.core.common.d.f, com.anythink.core.api.IATBaseAdAdapter
    public final void setTrackingInfo(n nVar) {
        super.setTrackingInfo(nVar);
        this.mBaseAdAdapterProxy.setTrackingInfo(nVar);
    }

    @Deprecated
    public final void thirdPartyLoad(ATBaseAdAdapter aTBaseAdAdapter, Context context, Map<String, Object> map, Map<String, Object> map2) {
        ATCustomLoadListener aTCustomLoadListener = this.mLoadListener;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdLoadError("", VERSION_INCOMPATIBLE_ERROR_MSG);
        }
    }

    @Deprecated
    public final boolean thirdPartyStartBiddingRequest(ATBaseAdAdapter aTBaseAdAdapter, Context context, Map<String, Object> map, Map<String, Object> map2, ATBiddingListener aTBiddingListener) {
        if (aTBiddingListener == null) {
            return false;
        }
        aTBiddingListener.onC2SBiddingResultWithCache(ATBiddingResult.fail(VERSION_INCOMPATIBLE_ERROR_MSG), null);
        return false;
    }
}
