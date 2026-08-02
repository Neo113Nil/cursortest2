package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class N4 {
    public final Wp a;
    public final C0175a0 b;

    public N4(Wp wp, C0175a0 c0175a0) {
        this.a = wp;
        this.b = c0175a0;
    }

    public final M4 a(HashMap hashMap) {
        Bp e = this.a.e();
        AdvertisingIdsHolder identifiers = this.b.getIdentifiers();
        return new M4(M4.a(e.d), M4.a(e.a), M4.a(e.b), M4.a(e.k), M4.a(e.j), M4.a(Vc.a(AbstractC0230bq.a(e.l))), M4.a(Vc.a(hashMap)), new IdentifiersResult(identifiers.getGoogle().mAdTrackingInfo == null ? null : identifiers.getGoogle().mAdTrackingInfo.advId, identifiers.getGoogle().mStatus, identifiers.getGoogle().mErrorExplanation), new IdentifiersResult(identifiers.getHuawei().mAdTrackingInfo == null ? null : identifiers.getHuawei().mAdTrackingInfo.advId, identifiers.getHuawei().mStatus, identifiers.getHuawei().mErrorExplanation), new IdentifiersResult(identifiers.getYandex().mAdTrackingInfo != null ? identifiers.getYandex().mAdTrackingInfo.advId : null, identifiers.getYandex().mStatus, identifiers.getYandex().mErrorExplanation), M4.a(Vc.a(e.i)), AbstractC0375gr.a(), e.p + e.A.a, M4.a(e.o.f), new Bundle());
    }
}
