package com.anythink.core.api;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.l.d.b;
import com.anythink.expressad.foundation.g.a;
import com.google.android.gms.internal.ads.Wv;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class ATBaseAdAdapter extends ATBaseAdInternalAdapter {
    private void cleanLoadListener() {
        this.mBiddingListener = null;
        this.mLoadListener = null;
    }

    public String closeAd() {
        return "";
    }

    public String getAdCustomExt() {
        b bVar = this.serverExtraInfo;
        return bVar != null ? bVar.d() : "";
    }

    public Map<String, Object> getAdExtraInfoMap() {
        return null;
    }

    public BaseAd getBaseAdObject(Context context) {
        return null;
    }

    public MediationBidManager getBidManager() {
        return null;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        if (aTBidRequestInfoListener != null) {
            aTBidRequestInfoListener.onFailed(ATBidRequestInfo.NO_SUPPORT_BIDDING_TYPE);
        }
    }

    public final int getDismissType() {
        return this.mDismissType;
    }

    public String getILRD() {
        return null;
    }

    public ATInitMediation getMediationInitManager() {
        return null;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return null;
    }

    public final String getUserCustomData() {
        return this.mUserData;
    }

    public final String getUserId() {
        return this.mUserId;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        return false;
    }

    public void internalFormatShow(Activity activity, ViewGroup viewGroup, ATCommonImpressionListener aTCommonImpressionListener) {
    }

    public final void notifyATLoadFail(String str, String str2) {
        if (this.mBiddingListener != null) {
            this.mBiddingListener.onC2SBiddingResultWithCache(ATBiddingResult.fail(!TextUtils.isEmpty(str) ? Wv.h(str, a.bU, str2) : str2), null);
        }
        ATCustomLoadListener aTCustomLoadListener = this.mLoadListener;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdLoadError(str, str2);
        }
    }

    @Override // com.anythink.core.common.d.b.a
    public void onCreate(Activity activity) {
    }

    @Override // com.anythink.core.common.d.b.a
    public void onDestroy(Activity activity) {
    }

    @Override // com.anythink.core.common.d.b.a
    public void onPause(Activity activity) {
    }

    @Override // com.anythink.core.common.d.b.a
    public void onResume(Activity activity) {
    }

    @Override // com.anythink.core.common.d.b.a
    public void onStart(Activity activity) {
    }

    @Override // com.anythink.core.common.d.b.a
    public void onStop(Activity activity) {
    }

    public void releaseLoadResource() {
        cleanLoadListener();
    }

    public final void setFetchAdTimeout(int i) {
        this.mFetchAdTimeout = i;
    }

    public final void setRequestNum(int i) {
        if (i > 0) {
            this.mRequestNum = i;
        }
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z6, boolean z9) {
        return false;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean startBiddingRequest(Context context, Map<String, Object> map, Map<String, Object> map2, ATBiddingListener aTBiddingListener) {
        return false;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean supportImpressionCallback() {
        return true;
    }

    public final void notifyATLoadFail(String str, String str2, ATBiddingNotice aTBiddingNotice, ATAdConst.CURRENCY currency) {
        if (this.mBiddingListener != null) {
            this.mBiddingListener.onC2SBiddingResultWithCache(ATBiddingResult.fail(!TextUtils.isEmpty(str) ? Wv.h(str, a.bU, str2) : str2, aTBiddingNotice, currency), null);
        }
        ATCustomLoadListener aTCustomLoadListener = this.mLoadListener;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdLoadError(str, str2);
        }
    }
}
