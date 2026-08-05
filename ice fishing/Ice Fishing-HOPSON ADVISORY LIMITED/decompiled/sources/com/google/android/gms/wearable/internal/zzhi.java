package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzhi implements Result {
    private final Status zza;
    private final byte[] zzb;

    public zzhi(Status status, int i, byte[] bArr) {
        this.zza = status;
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }

    public final byte[] zza() {
        return this.zzb;
    }
}
