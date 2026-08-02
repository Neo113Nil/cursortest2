package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class J4 {
    public final Ep a;
    public final Y b;

    public J4(Ep ep, Y y) {
        this.a = ep;
        this.b = y;
    }

    public final I4 a(HashMap hashMap) {
        AdvertisingIdsHolder a;
        C0385jp e = this.a.e();
        Y y = this.b;
        synchronized (y) {
            a = y.a(new C0694ug());
        }
        return new I4(I4.a(e.d), I4.a(e.a), I4.a(e.b), I4.a(e.k), I4.a(e.j), I4.a(Fc.a(Jp.a(e.l))), I4.a(Fc.a(hashMap)), new IdentifiersResult(a.getGoogle().mAdTrackingInfo == null ? null : a.getGoogle().mAdTrackingInfo.advId, a.getGoogle().mStatus, a.getGoogle().mErrorExplanation), new IdentifiersResult(a.getHuawei().mAdTrackingInfo == null ? null : a.getHuawei().mAdTrackingInfo.advId, a.getHuawei().mStatus, a.getHuawei().mErrorExplanation), new IdentifiersResult(a.getYandex().mAdTrackingInfo == null ? null : a.getYandex().mAdTrackingInfo.advId, a.getYandex().mStatus, a.getYandex().mErrorExplanation), I4.a(Fc.a(e.i)), Nq.a(), e.p + e.A.a, I4.a(e.o.f), new Bundle());
    }
}
