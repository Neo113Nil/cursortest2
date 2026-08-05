package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.PutDataRequest;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzcu extends zzt {
    final /* synthetic */ PutDataRequest zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcu(zzdg zzdgVar, GoogleApiClient googleApiClient, PutDataRequest putDataRequest) {
        super(googleApiClient);
        this.zza = putDataRequest;
        Objects.requireNonNull(zzdgVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        return new zzdd(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzkf) anyClient).zzp(this, this.zza);
    }
}
