package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.NodeApi;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzhp implements NodeApi.GetLocalNodeResult {
    private final Status zza;
    private final Node zzb;

    public zzhp(Status status, Node node) {
        this.zza = status;
        this.zzb = node;
    }

    @Override // com.google.android.gms.wearable.NodeApi.GetLocalNodeResult
    public final Node getNode() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }
}
