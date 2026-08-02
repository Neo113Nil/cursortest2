package io.appmetrica.analytics.coreapi.internal.identifiers;

import android.text.TextUtils;
import defpackage.oyr;

/* loaded from: classes9.dex */
public class AdTrackingInfoResult {
    public final AdTrackingInfo mAdTrackingInfo;
    public final String mErrorExplanation;
    public final IdentifierStatus mStatus;

    public AdTrackingInfoResult(AdTrackingInfo adTrackingInfo, IdentifierStatus identifierStatus, String str) {
        this.mAdTrackingInfo = adTrackingInfo;
        this.mStatus = identifierStatus;
        this.mErrorExplanation = str;
    }

    public static AdTrackingInfoResult getProviderUnavailableResult(String str) {
        return new AdTrackingInfoResult(null, IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, str);
    }

    public boolean isValid() {
        AdTrackingInfo adTrackingInfo = this.mAdTrackingInfo;
        return (adTrackingInfo == null || TextUtils.isEmpty(adTrackingInfo.advId)) ? false : true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdTrackingInfoResult{mAdTrackingInfo=");
        sb.append(this.mAdTrackingInfo);
        sb.append(", mStatus=");
        sb.append(this.mStatus);
        sb.append(", mErrorExplanation='");
        return oyr.t(sb, this.mErrorExplanation, "'}");
    }

    public AdTrackingInfoResult() {
        this(null, IdentifierStatus.UNKNOWN, "identifier info has never been updated");
    }
}
