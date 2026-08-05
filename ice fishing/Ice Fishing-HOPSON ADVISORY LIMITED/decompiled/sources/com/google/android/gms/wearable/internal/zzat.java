package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.ChannelApi;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzat extends zzt {
    private final String zza;
    private ChannelApi.ChannelListener zzb;

    zzat(GoogleApiClient googleApiClient, ChannelApi.ChannelListener channelListener, String str) {
        super(googleApiClient);
        channelListener.getClass();
        this.zzb = channelListener;
        this.zza = str;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        this.zzb = null;
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzkf) anyClient).zzG(this, this.zzb, this.zza);
        this.zzb = null;
    }
}
