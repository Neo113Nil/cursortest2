package com.google.android.gms.internal.time;

import android.os.SystemClock;
import androidx.core.app.NotificationManagerCompat;
import androidx.room.Room;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.time.Ticks;
import com.google.android.gms.time.TrustedTimeClient;
import java.util.logging.Level;

/* loaded from: classes4.dex */
public final class zzbt implements TrustedTimeClient {
    public final zzby zza;
    public final zzs zzb;
    public final Object zzc = new Object();
    public boolean zze;

    public zzbt(zzby zzbyVar, zzs zzsVar) {
        this.zza = zzbyVar;
        this.zzb = zzsVar;
        zzbyVar.zzd(new zzak(this, 2));
    }

    @Override // com.google.android.gms.time.TrustedTimeClient
    public final Long computeCurrentUnixEpochMillis() {
        Object obj;
        zzbo zzboVar;
        synchronized (this.zzc) {
            if (this.zze) {
                throw new IllegalStateException("dispose() has been called");
            }
            zzs zzsVar = this.zzb;
            synchronized (zzsVar) {
                obj = zzsVar.zzd;
            }
            zzboVar = (zzbo) obj;
        }
        Long l = null;
        if (zzboVar == null) {
            return null;
        }
        zzaw zzawVar = zzboVar.zza;
        zzai zzaiVar = zzawVar.zzc.zza;
        zzaiVar.getClass();
        Ticks ticks = new Ticks(zzaiVar, SystemClock.elapsedRealtime());
        Ticks ticks2 = zzawVar.zzc;
        zzai zzaiVar2 = ticks2.zza;
        zzaiVar2.zzd(ticks2);
        zzaiVar2.zzd(ticks);
        long zzc = zzbz.zzc(ticks.zzb, ticks2.zzb);
        zzi zziVar = zzawVar.zzb;
        long j = zziVar.zza;
        int i = zziVar.zzb / 1000000;
        if (j < 0 && i > 0) {
            j++;
            i += NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
        }
        long zza = zzbz.zza(zzbz.zzb(j, 1000L) + i, zzc);
        long[] zza2 = zzc > 0 ? zzbo.zza(zzc, zzawVar.zzd) : zzc < 0 ? zzbo.zza(zzc, zzawVar.zze) : new long[]{0, 0};
        long j2 = zza2[0];
        long j3 = zza2[1];
        long zza3 = zzbz.zza(zza, j2);
        zzai zzaiVar3 = ticks2.zza;
        zzaiVar3.getClass();
        if (zzaiVar3 != ticks.zza) {
            a$$ExternalSyntheticBUOutline0.m$3("Ticks must be from the same origin");
            return null;
        }
        Long l2 = zzaiVar3.zza;
        if (l2 != null) {
            zzaiVar3.zzd(ticks2);
            zzaiVar3.zzd(ticks);
            long abs = Math.abs(zzbz.zzc(ticks.zzb, ticks2.zzb));
            if (zzaiVar3.zzb != 0 || abs <= 86400000) {
                l = Long.valueOf(zzbz.zzb(l2.longValue(), abs) / 1000000);
            }
        }
        if (l != null) {
            zzbz.zza(zzbz.zza(l.longValue(), zzawVar.zza.zzc()), j3);
        }
        return Long.valueOf(zza3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0037, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003f, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void finalize() {
        synchronized (this.zzc) {
            try {
                if (!this.zze) {
                    zze zzeVar = zzaj.zza;
                    zzeVar.getClass();
                    zzeVar.zza(Level.FINE).zzl("TrustedTimeClientAdapter.finalize() causing dispose()");
                    synchronized (this.zzc) {
                        if (this.zze) {
                            Room.forResult(null);
                        } else {
                            this.zzb.m2027zze();
                            this.zze = true;
                            this.zza.zza();
                        }
                    }
                }
            } finally {
            }
        }
        super.finalize();
    }

    public final String toString() {
        String str;
        synchronized (this.zzc) {
            str = "TrustedTimeClientAdapter{internalTimeSignalSupplier=" + String.valueOf(this.zza) + ", apiListenersManager=" + String.valueOf(this.zzb) + ", disposed=" + this.zze + "}";
        }
        return str;
    }
}
