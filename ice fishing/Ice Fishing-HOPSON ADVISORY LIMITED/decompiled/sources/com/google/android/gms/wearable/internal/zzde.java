package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataApi;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzde implements DataApi.DeleteDataItemsResult {
    private final Status zza;
    private final int zzb;

    public zzde(Status status, int i) {
        this.zza = status;
        this.zzb = i;
    }

    @Override // com.google.android.gms.wearable.DataApi.DeleteDataItemsResult
    public final int getNumDeleted() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }
}
