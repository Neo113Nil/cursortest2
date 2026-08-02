package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbzi implements zzbrb {
    @Override // com.google.android.libraries.places.internal.zzbsm
    public final /* synthetic */ byte[] zza(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.libraries.places.internal.zzbsm
    public final /* bridge */ /* synthetic */ Object zzb(byte[] bArr) {
        if (bArr.length < 3) {
            throw new NumberFormatException("Malformed status code ".concat(new String(bArr, zzbrc.zza)));
        }
        return Integer.valueOf(((bArr[1] - 48) * 10) + ((bArr[0] - 48) * 100) + (bArr[2] - 48));
    }
}
