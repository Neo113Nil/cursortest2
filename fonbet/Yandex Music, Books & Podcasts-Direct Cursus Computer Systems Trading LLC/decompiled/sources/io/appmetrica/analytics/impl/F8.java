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
import kotlin.text.Charsets;

/* loaded from: classes5.dex */
public final class F8 {
    public final Y a;
    public final M2 b;

    public F8() {
        this(C0747wb.k().c(), C0747wb.k().d());
    }

    public final String a() {
        AdvertisingIdsHolder advertisingIdsHolder;
        byte[] bArr;
        Y y = this.a;
        Oq oq = new Oq(5, 500);
        synchronized (y) {
            try {
                y.a((InterfaceC0526ol) oq, true).get();
            } catch (InterruptedException | ExecutionException unused) {
            }
            advertisingIdsHolder = y.k;
        }
        AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
        if (!yandex.isValid()) {
            String id = this.b.getAppSetId().getId();
            if (id != null && id.length() != 0) {
                try {
                    UUID.fromString(id);
                    if (!id.equals("00000000-0000-0000-0000-000000000000")) {
                        return kotlin.text.c.r(id, "-", "", false);
                    }
                } catch (Throwable unused2) {
                }
            }
            return kotlin.text.c.r(UUID.randomUUID().toString(), "-", "", false).toLowerCase(Locale.US);
        }
        AdTrackingInfo adTrackingInfo = yandex.mAdTrackingInfo;
        adTrackingInfo.getClass();
        String str = adTrackingInfo.advId;
        str.getClass();
        try {
            bArr = MessageDigest.getInstance("MD5").digest(str.getBytes(Charsets.UTF_8));
        } catch (NoSuchAlgorithmException unused3) {
            bArr = new byte[0];
        }
        return StringUtils.toHexString(bArr);
    }

    public F8(Y y, M2 m2) {
        this.a = y;
        this.b = m2;
    }
}
