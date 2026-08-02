package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* loaded from: classes9.dex */
public final class M implements J {
    public final J a;

    public M(J j) {
        this.a = j;
    }

    public static AdTrackingInfoResult a(Provider provider) {
        AdTrackingInfoResult adTrackingInfoResult = (AdTrackingInfoResult) provider.get();
        AdTrackingInfo adTrackingInfo = adTrackingInfoResult.mAdTrackingInfo;
        return (adTrackingInfo == null || !"00000000-0000-0000-0000-000000000000".equals(adTrackingInfo.advId)) ? adTrackingInfoResult : new AdTrackingInfoResult(null, IdentifierStatus.INVALID_ADV_ID, "AdvId is invalid: 00000000-0000-0000-0000-000000000000");
    }

    @Override // io.appmetrica.analytics.impl.J
    public final AdTrackingInfoResult a(Context context, InterfaceC0918zl interfaceC0918zl) {
        return a(new L(this, context, interfaceC0918zl));
    }

    @Override // io.appmetrica.analytics.impl.J
    public final AdTrackingInfoResult a(Context context) {
        return a(new K(this, context));
    }
}
