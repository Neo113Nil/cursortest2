package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelApi;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzas implements ChannelApi.OpenChannelResult {
    private final Status zza;
    private final Channel zzb;

    @Override // com.google.android.gms.wearable.ChannelApi.OpenChannelResult
    public final Channel getChannel() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }

    zzas(Status status, Channel channel) {
        status.getClass();
        this.zza = status;
        this.zzb = channel;
    }
}
