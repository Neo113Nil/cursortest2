package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzbs extends zzt {
    final /* synthetic */ zzcb zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbs(zzcb zzcbVar, GoogleApiClient googleApiClient) {
        super(googleApiClient);
        Objects.requireNonNull(zzcbVar);
        this.zza = zzcbVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzkf) anyClient).zzt(this, this.zza.zzb());
    }
}
