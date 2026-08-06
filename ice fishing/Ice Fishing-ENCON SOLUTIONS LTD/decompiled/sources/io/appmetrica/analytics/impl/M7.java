package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class M7 {

    /* renamed from: a, reason: collision with root package name */
    public final U f4739a;

    /* renamed from: b, reason: collision with root package name */
    public final C0266a2 f4740b;

    public M7(U u2, C0266a2 c0266a2) {
        this.f4739a = u2;
        this.f4740b = c0266a2;
    }

    public final String a() {
        AdvertisingIdsHolder advertisingIdsHolder;
        byte[] bArr;
        U u2 = this.f4739a;
        Jn jn = new Jn(5, 500);
        synchronized (u2) {
            try {
                u2.a((Gi) jn, true).get();
            } catch (InterruptedException | ExecutionException unused) {
            }
            advertisingIdsHolder = u2.f5141k;
        }
        AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
        if (!yandex.isValid()) {
            String id = this.f4740b.getAppSetId().getId();
            if (id != null && id.length() != 0) {
                try {
                    UUID.fromString(id);
                    if (!id.equals("00000000-0000-0000-0000-000000000000")) {
                        return z1.o.P(id, "-", "");
                    }
                } catch (Throwable unused2) {
                }
            }
            return z1.o.P(UUID.randomUUID().toString(), "-", "").toLowerCase(Locale.US);
        }
        AdTrackingInfo adTrackingInfo = yandex.mAdTrackingInfo;
        kotlin.jvm.internal.i.b(adTrackingInfo);
        String str = adTrackingInfo.advId;
        kotlin.jvm.internal.i.b(str);
        try {
            bArr = MessageDigest.getInstance("MD5").digest(str.getBytes(z1.a.f8620a));
        } catch (NoSuchAlgorithmException unused3) {
            bArr = new byte[0];
        }
        return StringUtils.toHexString(bArr);
    }

    public M7() {
        this(C0610na.k().c(), C0610na.k().d());
    }
}
