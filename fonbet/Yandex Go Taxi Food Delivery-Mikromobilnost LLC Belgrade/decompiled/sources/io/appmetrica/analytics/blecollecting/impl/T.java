package io.appmetrica.analytics.blecollecting.impl;

import io.appmetrica.analytics.blewrapper.internal.config.ServiceData;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes9.dex */
public final class T implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final A fromModel(ServiceData serviceData) {
        A a = new A();
        a.a = String.valueOf(serviceData.getUuid());
        byte[] bArr = serviceData.getIo.appmetrica.analytics.rtm.internal.Constants.KEY_DATA java.lang.String();
        if (bArr != null) {
            a.b = bArr;
        }
        byte[] dataMask = serviceData.getDataMask();
        if (dataMask != null) {
            a.c = dataMask;
        }
        return a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ServiceData toModel(A a) {
        String str = a.a;
        byte[] bArr = a.b;
        byte[] bArr2 = null;
        if (bArr == null || bArr.length == 0) {
            bArr = null;
        }
        byte[] bArr3 = a.c;
        if (bArr3 != null && bArr3.length != 0) {
            bArr2 = bArr3;
        }
        return new ServiceData(str, bArr, bArr2);
    }
}
