package com.google.android.gms.common;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzk extends zzj {
    public final byte[] zza;

    public zzk(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.zza = bArr;
    }

    @Override // com.google.android.gms.common.zzj
    public final byte[] zzc() {
        return this.zza;
    }
}
