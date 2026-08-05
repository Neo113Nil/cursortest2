package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzcv extends zzt {
    final /* synthetic */ Uri zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcv(zzdg zzdgVar, GoogleApiClient googleApiClient, Uri uri) {
        super(googleApiClient);
        this.zza = uri;
        Objects.requireNonNull(zzdgVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ Result createFailedResult(Status status) {
        return new zzdd(status, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzgq) ((zzkf) anyClient).getService()).zze(new zzjp(this), this.zza);
    }
}
