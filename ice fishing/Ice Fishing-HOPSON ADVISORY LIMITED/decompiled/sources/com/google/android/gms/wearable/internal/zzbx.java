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
final class zzbx extends zzt {
    final /* synthetic */ Uri zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzcb zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbx(zzcb zzcbVar, GoogleApiClient googleApiClient, Uri uri, long j, long j2) {
        super(googleApiClient);
        this.zza = uri;
        this.zzb = j;
        this.zzc = j2;
        Objects.requireNonNull(zzcbVar);
        this.zzd = zzcbVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzkf) anyClient).zzw(this, this.zzd.zzb(), this.zza, this.zzb, this.zzc);
    }
}
