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
final class zzbw extends zzt {
    final /* synthetic */ Uri zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzcb zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbw(zzcb zzcbVar, GoogleApiClient googleApiClient, Uri uri, boolean z) {
        super(googleApiClient);
        this.zza = uri;
        this.zzb = z;
        Objects.requireNonNull(zzcbVar);
        this.zzc = zzcbVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzkf) anyClient).zzv(this, this.zzc.zzb(), this.zza, this.zzb);
    }
}
