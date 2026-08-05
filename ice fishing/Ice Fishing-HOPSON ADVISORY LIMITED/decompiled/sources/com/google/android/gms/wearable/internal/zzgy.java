package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.MessageApi;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzgy implements MessageApi.SendMessageResult {
    private final Status zza;
    private final int zzb;

    public zzgy(Status status, int i) {
        this.zza = status;
        this.zzb = i;
    }

    @Override // com.google.android.gms.wearable.MessageApi.SendMessageResult
    public final int getRequestId() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }
}
