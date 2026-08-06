package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class T3 {

    /* renamed from: a, reason: collision with root package name */
    public final Am f5087a;

    /* renamed from: b, reason: collision with root package name */
    public final U f5088b;

    public T3(Am am, U u2) {
        this.f5087a = am;
        this.f5088b = u2;
    }

    public final S3 a(HashMap hashMap) {
        AdvertisingIdsHolder a2;
        C0415fm e2 = this.f5087a.e();
        U u2 = this.f5088b;
        synchronized (u2) {
            a2 = u2.a(new Xd());
        }
        return new S3(S3.a(e2.f6005d), S3.a(e2.f6002a), S3.a(e2.f6003b), S3.a(e2.f6011j), S3.a(e2.f6010i), S3.a(AbstractC0430gb.a(Fm.a(e2.f6012k))), S3.a(AbstractC0430gb.a(hashMap)), new IdentifiersResult(a2.getGoogle().mAdTrackingInfo == null ? null : a2.getGoogle().mAdTrackingInfo.advId, a2.getGoogle().mStatus, a2.getGoogle().mErrorExplanation), new IdentifiersResult(a2.getHuawei().mAdTrackingInfo == null ? null : a2.getHuawei().mAdTrackingInfo.advId, a2.getHuawei().mStatus, a2.getHuawei().mErrorExplanation), new IdentifiersResult(a2.getYandex().mAdTrackingInfo == null ? null : a2.getYandex().mAdTrackingInfo.advId, a2.getYandex().mStatus, a2.getYandex().mErrorExplanation), S3.a(AbstractC0430gb.a(e2.f6009h)), In.a(), e2.f6016o + e2.f6026z.f4275a, S3.a(e2.f6015n.f6419f), new Bundle());
    }
}
