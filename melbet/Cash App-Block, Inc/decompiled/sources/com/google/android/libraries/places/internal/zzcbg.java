package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public final class zzcbg extends zzbrm {
    public zzbva zza;
    public final /* synthetic */ zzcby zzb;

    public /* synthetic */ zzcbg(zzcby zzcbyVar) {
        this.zzb = zzcbyVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbrm
    public final /* synthetic */ zzbrs zza(com.google.android.gms.maps.zzah zzahVar) {
        zzcby zzcbyVar = this.zzb;
        zzcbyVar.zze.zzc();
        Trace.checkState("Channel is being terminated", !zzcbyVar.zzO);
        return new zzcbw(zzcbyVar, zzahVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbrm
    public final void zzb(zzbpq zzbpqVar, zzbrt zzbrtVar) {
        zzcby zzcbyVar = this.zzb;
        zzcbyVar.zze.zzc();
        Trace.checkNotNull(zzbpqVar, "newState");
        Trace.checkNotNull(zzbrtVar, "newPicker");
        if (this != zzcbyVar.zzF || zzcbyVar.zzG) {
            return;
        }
        zzcbyVar.zzK.zzg(zzbrtVar);
        if (zzbpqVar != zzbpq.zze) {
            zzcbyVar.zzU.zzb("Entering {0} state with picker: {1}", 2, zzbpqVar, zzbrtVar);
            zzcbyVar.zzz.zza(zzbpqVar);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbrm
    public final void zzc() {
        zzbuf zzbufVar = this.zzb.zze;
        zzbufVar.zzc();
        zzbufVar.zzb(new zzmu(this, 9));
        zzbufVar.zza();
    }

    @Override // com.google.android.libraries.places.internal.zzbrm
    public final zzbuf zzd() {
        return this.zzb.zze;
    }

    @Override // com.google.android.libraries.places.internal.zzbrm
    public final ScheduledExecutorService zze() {
        return this.zzb.zzq;
    }
}
