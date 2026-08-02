package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzbbk implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzceu zza;
    final /* synthetic */ zzbbl zzb;

    zzbbk(zzbbl zzbblVar, zzceu zzceuVar) {
        this.zza = zzceuVar;
        this.zzb = zzbblVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        obj = this.zzb.zzd;
        synchronized (obj) {
            this.zza.zzd(new RuntimeException("Connection failed."));
        }
    }
}
