package io.appmetrica.analytics.blecollecting.impl;

import android.os.ParcelUuid;
import io.appmetrica.analytics.blewrapper.internal.config.ServiceUuid;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes9.dex */
public final class V implements Converter {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ServiceUuid toModel(B b) {
        ParcelUuid parcelUuid;
        String str;
        String str2 = b.a;
        ParcelUuid parcelUuid2 = null;
        if (str2 != null) {
            if (str2.length() == 0) {
                str2 = null;
            }
            if (str2 != null) {
                try {
                    parcelUuid = ParcelUuid.fromString(str2);
                } catch (Throwable unused) {
                }
                str = b.b;
                if (str != null) {
                    if (str.length() == 0) {
                        str = null;
                    }
                    if (str != null) {
                        try {
                            parcelUuid2 = ParcelUuid.fromString(str);
                        } catch (Throwable unused2) {
                        }
                    }
                }
                return new ServiceUuid(parcelUuid, parcelUuid2);
            }
        }
        parcelUuid = null;
        str = b.b;
        if (str != null) {
        }
        return new ServiceUuid(parcelUuid, parcelUuid2);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final B fromModel(ServiceUuid serviceUuid) {
        B b = new B();
        ParcelUuid uuid = serviceUuid.getUuid();
        if (uuid != null) {
            b.a = uuid.toString();
        }
        ParcelUuid uuidMask = serviceUuid.getUuidMask();
        if (uuidMask != null) {
            b.b = uuidMask.toString();
        }
        return b;
    }
}
