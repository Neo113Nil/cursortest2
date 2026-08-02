package com.google.android.gms.internal.time;

import androidx.room.Room;
import com.google.android.gms.tasks.Task;
import java.util.Objects;
import java.util.logging.Level;

/* loaded from: classes4.dex */
public final class zzbi {
    public final /* synthetic */ zzbj zza;
    public final zzax zzb;
    public final zzs zzc;

    public zzbi(zzbj zzbjVar, zzax zzaxVar, zzs zzsVar) {
        this.zza = zzbjVar;
        Objects.requireNonNull(zzaxVar);
        this.zzb = zzaxVar;
        this.zzc = zzsVar;
        zzaxVar.zzd(new zzak(zzsVar, 1));
    }

    public final String toString() {
        String str;
        synchronized (this.zza.zzc) {
            str = "ShareableTimeSignalSupplierAdapter{ShareableTimeSignalSupplierManager.this=" + this.zza.toString() + ",delegate=" + String.valueOf(this.zzb) + ", internalListenersManager=" + String.valueOf(this.zzc) + "}";
        }
        return str;
    }

    public final Task zza() {
        zzbj zzbjVar = this.zza;
        synchronized (zzbjVar.zzc) {
            int i = zzbjVar.zze - 1;
            zzbjVar.zze = i;
            if (i != 0) {
                return Room.forResult(null);
            }
            zzbjVar.zzd = null;
            zze zzeVar = zzaj.zza;
            zzeVar.getClass();
            zzeVar.zza(Level.FINE).zzl("Disposing of shared InternalTimeSignalSupplier instance");
            this.zzc.m2027zze();
            return this.zzb.zza();
        }
    }
}
