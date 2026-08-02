package com.google.android.gms.ads.identifier;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.OnFailureListener;

/* loaded from: classes.dex */
public final /* synthetic */ class zzc implements OnFailureListener {
    public final Object zza;
    public long zzb;

    public zzc(DefaultClock defaultClock) {
        zzae.checkNotNull(defaultClock);
        this.zza = defaultClock;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ConnectionResult connectionResult;
        zzd zzdVar = (zzd) this.zza;
        long j = this.zzb;
        zzdVar.getClass();
        Log.i("AdvertisingIdClient", "getting error as ".concat(String.valueOf(exc.getMessage())));
        if ((exc instanceof ApiException) && (connectionResult = ((ApiException) exc).mStatus.zzd) != null && connectionResult.zzb == 24) {
            zzdVar.zzd.set(j);
        }
    }

    public /* synthetic */ zzc(zzd zzdVar, long j) {
        this.zza = zzdVar;
        this.zzb = j;
    }
}
