package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.ChannelApi;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzau implements ChannelApi {
    @Override // com.google.android.gms.wearable.ChannelApi
    public final PendingResult<Status> addListener(GoogleApiClient googleApiClient, ChannelApi.ChannelListener channelListener) {
        com.google.android.gms.internal.wearable.zzai.zzd(googleApiClient, "client is null");
        com.google.android.gms.internal.wearable.zzai.zzd(channelListener, "listener is null");
        return zze.zza(googleApiClient, new zzar(new IntentFilter[]{zzjd.zza("com.google.android.gms.wearable.CHANNEL_EVENT")}), channelListener);
    }

    @Override // com.google.android.gms.wearable.ChannelApi
    public final PendingResult<ChannelApi.OpenChannelResult> openChannel(GoogleApiClient googleApiClient, String str, String str2) {
        com.google.android.gms.internal.wearable.zzai.zzd(googleApiClient, "client is null");
        com.google.android.gms.internal.wearable.zzai.zzd(str, "nodeId is null");
        com.google.android.gms.internal.wearable.zzai.zzd(str2, "path is null");
        return googleApiClient.enqueue(new zzaq(this, googleApiClient, str, str2));
    }

    @Override // com.google.android.gms.wearable.ChannelApi
    public final PendingResult<Status> removeListener(GoogleApiClient googleApiClient, ChannelApi.ChannelListener channelListener) {
        com.google.android.gms.internal.wearable.zzai.zzd(googleApiClient, "client is null");
        com.google.android.gms.internal.wearable.zzai.zzd(channelListener, "listener is null");
        return googleApiClient.enqueue(new zzat(googleApiClient, channelListener, null));
    }
}
