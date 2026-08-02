package com.google.android.libraries.places.internal;

import java.nio.charset.StandardCharsets;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzbtv implements zzbsm {
    private zzbtv() {
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzbsm
    public final byte[] zza(Object obj) {
        return ((zzbtx) obj).zzn.zzs;
    }

    @Override // com.google.android.libraries.places.internal.zzbsm
    public final /* synthetic */ Object zzb(byte[] bArr) {
        int i;
        byte b;
        List list = zzbtx.zzl;
        int length = bArr.length;
        char c = 0;
        if (length == 1) {
            if (bArr[0] == 48) {
                return zzbtx.zza;
            }
            length = 1;
        }
        if (length != 1) {
            if (length == 2 && (b = bArr[0]) >= 48 && b <= 57) {
                i = (b - 48) * 10;
                c = 1;
            }
            return zzbtx.zzc.zze("Unknown code ".concat(new String(bArr, StandardCharsets.US_ASCII)));
        }
        i = 0;
        byte b2 = bArr[c];
        if (b2 >= 48 && b2 <= 57) {
            int i2 = (b2 - 48) + i;
            List list2 = zzbtx.zzl;
            if (i2 < list2.size()) {
                return (zzbtx) list2.get(i2);
            }
        }
        return zzbtx.zzc.zze("Unknown code ".concat(new String(bArr, StandardCharsets.US_ASCII)));
    }
}
