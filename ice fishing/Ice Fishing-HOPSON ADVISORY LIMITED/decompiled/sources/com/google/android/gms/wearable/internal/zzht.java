package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzht implements Result {
    private final Status zza;
    private final String zzb;

    public zzht(Status status, String str) {
        this.zza = status;
        this.zzb = str;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }

    public final String zza() {
        return this.zzb;
    }
}
