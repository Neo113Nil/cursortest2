package io.appmetrica.analytics.blecollecting.impl;

import io.appmetrica.analytics.blewrapper.internal.config.ManufacturerData;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.blecollecting.impl.t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0164t implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final z fromModel(ManufacturerData manufacturerData) {
        z zVar = new z();
        zVar.a = manufacturerData.getManufacturerId();
        byte[] bArr = manufacturerData.getIo.appmetrica.analytics.rtm.internal.Constants.KEY_DATA java.lang.String();
        if (bArr != null) {
            zVar.b = bArr;
        }
        byte[] dataMask = manufacturerData.getDataMask();
        if (dataMask != null) {
            zVar.c = dataMask;
        }
        return zVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ManufacturerData toModel(z zVar) {
        int i = zVar.a;
        byte[] bArr = zVar.b;
        byte[] bArr2 = null;
        if (bArr == null || bArr.length == 0) {
            bArr = null;
        }
        byte[] bArr3 = zVar.c;
        if (bArr3 != null && bArr3.length != 0) {
            bArr2 = bArr3;
        }
        return new ManufacturerData(i, bArr, bArr2);
    }
}
