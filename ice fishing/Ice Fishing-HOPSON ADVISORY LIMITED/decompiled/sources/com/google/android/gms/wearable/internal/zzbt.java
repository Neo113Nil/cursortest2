package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzbt extends zzt {
    final /* synthetic */ int zza;
    final /* synthetic */ zzcb zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbt(zzcb zzcbVar, GoogleApiClient googleApiClient, int i) {
        super(googleApiClient);
        this.zza = i;
        Objects.requireNonNull(zzcbVar);
        this.zzb = zzcbVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzkf) anyClient).zzu(this, this.zzb.zzb(), this.zza);
    }
}
