package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataItem;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzdd implements DataApi.DataItemResult {
    private final Status zza;
    private final DataItem zzb;

    public zzdd(Status status, DataItem dataItem) {
        this.zza = status;
        this.zzb = dataItem;
    }

    @Override // com.google.android.gms.wearable.DataApi.DataItemResult
    public final DataItem getDataItem() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }
}
