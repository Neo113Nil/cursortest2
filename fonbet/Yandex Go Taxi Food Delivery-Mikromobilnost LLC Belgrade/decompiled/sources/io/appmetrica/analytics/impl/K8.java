package io.appmetrica.analytics.impl;

import defpackage.cvu0;
import defpackage.uza;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes9.dex */
public final class K8 {
    public final C0175a0 a;
    public final M2 b;

    public K8() {
        this(Jb.k().c(), Jb.k().d());
    }

    public final String a() {
        byte[] bArr;
        AdTrackingInfoResult yandex = this.a.getIdentifiers().getYandex();
        if (yandex.isValid()) {
            try {
                bArr = MessageDigest.getInstance("MD5").digest(yandex.mAdTrackingInfo.advId.getBytes(uza.a));
            } catch (NoSuchAlgorithmException unused) {
                bArr = new byte[0];
            }
            return StringUtils.toHexString(bArr);
        }
        String id = this.b.getAppSetId().getId();
        if (id != null && id.length() != 0) {
            try {
                UUID.fromString(id);
                if (!id.equals("00000000-0000-0000-0000-000000000000")) {
                    return cvu0.v(id, "-", "", false);
                }
            } catch (Throwable unused2) {
            }
        }
        return cvu0.v(UUID.randomUUID().toString(), "-", "", false).toLowerCase(Locale.US);
    }

    public K8(C0175a0 c0175a0, M2 m2) {
        this.a = c0175a0;
        this.b = m2;
    }
}
