package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zze extends zzt {
    private Object zza;
    private ListenerHolder zzb;
    private zzd zzc;

    private zze(GoogleApiClient googleApiClient, Object obj, ListenerHolder listenerHolder, zzd zzdVar) {
        super(googleApiClient);
        obj.getClass();
        this.zza = obj;
        listenerHolder.getClass();
        this.zzb = listenerHolder;
        this.zzc = zzdVar;
    }

    static PendingResult zza(GoogleApiClient googleApiClient, zzd zzdVar, Object obj) {
        return googleApiClient.enqueue(new zze(googleApiClient, obj, googleApiClient.registerListener(obj), zzdVar));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ Result createFailedResult(Status status) {
        this.zza = null;
        this.zzb = null;
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        this.zzc.zza((zzkf) anyClient, this, this.zza, this.zzb);
        this.zza = null;
        this.zzb = null;
    }
}
