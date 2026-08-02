package com.google.android.gms.internal.time;

import android.content.Context;
import android.content.IntentFilter;
import androidx.camera.core.processing.Edge;
import androidx.room.Room;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzb;
import com.google.android.gms.time.Ticks;
import com.squareup.util.Strings;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* loaded from: classes4.dex */
public final class zzu implements zzax {
    public final /* synthetic */ int $r8$classId = 0;
    public final Object zza;
    public final Object zzb;
    public final Object zzc;
    public final Object zzd;
    public final zzs zze;
    public boolean zzf;

    public zzu(zzbi zzbiVar) {
        zzs zzsVar = new zzs(zzhk.zza, new zzcb("DelegatingInternalTimeSignalSupplier"), 1);
        String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(System.identityHashCode(this), "DelegatingInternalTimeSignalSupplier[", "]");
        this.zza = m;
        this.zzd = new Object();
        Objects.requireNonNull(zzbiVar);
        this.zzc = zzbiVar;
        this.zze = zzsVar;
        zzak zzakVar = new zzak(this, 0);
        this.zzb = zzakVar;
        zzbiVar.zzc.zzd(zzakVar);
        zze zzeVar = zzaj.zza;
        zzeVar.getClass();
        zzeVar.zza(Level.FINE).zzm(m, "%s: Construction complete");
    }

    public final String toString() {
        String str;
        String str2;
        switch (this.$r8$classId) {
            case 0:
                synchronized (this.zzd) {
                    str = "BasicInternalTimeSignalSupplier{parentInitializer=" + String.valueOf((zzah) this.zza) + ", tickerFactory=" + String.valueOf((zzb) this.zzc) + ", internalListenersManager=" + String.valueOf(this.zze) + ", timeSignalResultReceiver=" + String.valueOf((zzbr) this.zzb) + ", disposed=" + this.zzf + "}";
                }
                return str;
            default:
                synchronized (this.zzd) {
                    str2 = "DelegatingInternalTimeSignalSupplier{supplierIdentity='" + ((String) this.zza) + "', sharedTimeSignalSupplier=" + String.valueOf((zzbi) this.zzc) + ", internalListenersManager=" + String.valueOf(this.zze) + ", sharedTimeSignalSupplierListener=" + String.valueOf((zzak) this.zzb) + ", disposed=" + this.zzf + "}";
                }
                return str2;
        }
    }

    @Override // com.google.android.gms.internal.time.zzax
    public final Task zza() {
        Task zza;
        switch (this.$r8$classId) {
            case 0:
                synchronized (this.zzd) {
                    try {
                        if (this.zzf) {
                            return Room.forResult(null);
                        }
                        zzb();
                        return ((zzah) this.zza).zzb();
                    } finally {
                    }
                }
            default:
                zze zzeVar = zzaj.zza;
                zzeVar.getClass();
                zzeVar.zza(Level.FINE).zzm((String) this.zza, "%s: dispose() called");
                synchronized (this.zzd) {
                    try {
                        if (this.zzf) {
                            zza = Room.forResult(null);
                        } else {
                            this.zze.m2027zze();
                            this.zzf = true;
                            zzbi zzbiVar = (zzbi) this.zzc;
                            zzak zzakVar = (zzak) this.zzb;
                            zzs zzsVar = zzbiVar.zzc;
                            synchronized (zzsVar) {
                                ((HashSet) zzsVar.zza).remove(zzakVar);
                            }
                            zza = ((zzbi) this.zzc).zza();
                        }
                    } finally {
                    }
                }
                return zza;
        }
    }

    public void zzb() {
        synchronized (this.zzd) {
            this.zze.m2027zze();
            zzbr zzbrVar = (zzbr) this.zzb;
            synchronized (zzbrVar.zze) {
                try {
                    zzbq zzbqVar = zzbrVar.zzf;
                    if (zzbqVar != null) {
                        zzbrVar.zzf = null;
                        zzbrVar.zzc.unregisterReceiver(zzbqVar);
                        zzbr.zzb.decrementAndGet();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.zzf = true;
        }
    }

    public void zzc(zzq zzqVar) {
        Object obj;
        synchronized (this.zzd) {
            try {
                if (this.zzf) {
                    return;
                }
                zzb zzbVar = (zzb) this.zzc;
                zzo zzoVar = zzqVar.zzc;
                zzoVar.getClass();
                zzaw zzawVar = new zzaw(zzqVar.zza, zzqVar.zzb, new Ticks((zzai) zzbVar.zza, zzoVar.zzb), zzqVar.zzd, zzqVar.zze);
                zzs zzsVar = this.zze;
                synchronized (zzsVar) {
                    obj = zzsVar.zzd;
                }
                zzaw zzawVar2 = (zzaw) obj;
                if (zzawVar2 != null) {
                    Ticks ticks = zzawVar2.zzc;
                    Ticks ticks2 = zzawVar.zzc;
                    if (ticks.zza != ticks2.zza) {
                        throw new IllegalArgumentException("Ticks must be from the same origin");
                    }
                    if (ticks.zzb > ticks2.zzb) {
                        return;
                    }
                }
                this.zze.zzf(zzawVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.time.zzax
    public final void zzd(zzak zzakVar) {
        int size;
        int size2;
        switch (this.$r8$classId) {
            case 0:
                synchronized (this.zzd) {
                    try {
                        if (this.zzf) {
                            throw new IllegalStateException("dispose() has been called");
                        }
                        zzs zzsVar = this.zze;
                        synchronized (zzsVar) {
                            size = ((HashSet) zzsVar.zza).size();
                        }
                        if (size != 0) {
                            throw new IllegalStateException("Listener already set");
                        }
                        zzs zzsVar2 = this.zze;
                        Objects.requireNonNull(zzakVar);
                        zzsVar2.zzd(zzakVar);
                    } finally {
                    }
                }
                return;
            default:
                zze zzeVar = zzaj.zza;
                zzeVar.getClass();
                zzeVar.zza(Level.FINE).zzn("%s: Adding listener %s", (String) this.zza, zzakVar);
                synchronized (this.zzd) {
                    try {
                        if (this.zzf) {
                            throw new IllegalStateException("dispose() has been called");
                        }
                        zzs zzsVar3 = this.zze;
                        synchronized (zzsVar3) {
                            size2 = ((HashSet) zzsVar3.zza).size();
                        }
                        if (size2 != 0) {
                            throw new IllegalStateException("listener already set");
                        }
                        zzs zzsVar4 = this.zze;
                        Objects.requireNonNull(zzakVar);
                        zzsVar4.zzd(zzakVar);
                    } finally {
                    }
                }
                return;
        }
    }

    public void zze() {
        Edge edge = new Edge(this, 4);
        zzbr zzbrVar = (zzbr) this.zzb;
        synchronized (zzbrVar.zze) {
            try {
                zzbq zzbqVar = zzbrVar.zzf;
                if (zzbqVar != null) {
                    throw new IllegalStateException("timeSignalReceiver != null, timeSignalReceiver=" + zzbqVar.toString());
                }
                zzbq zzbqVar2 = new zzbq(edge, 0);
                zzbrVar.zzf = zzbqVar2;
                zzbr.zzb.incrementAndGet();
                IntentFilter intentFilter = new IntentFilter(zzbrVar.zzd.zzb);
                zze zzeVar = zzaj.zza;
                zzeVar.getClass();
                zzeVar.zza(Level.FINE).zzn("Registering broadcast receiver=%s with filter=%s", zzbqVar2, intentFilter);
                Strings.registerReceiver(zzbrVar.zzc, zzbqVar2, intentFilter, "com.google.android.gms.time.permission.SEND_TRUSTED_TIME_SIGNAL", 2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzu(Context context, zzah zzahVar, zzk zzkVar, Executor executor) {
        zzbr zzbrVar = new zzbr(context, zzkVar);
        zzb zzbVar = new zzb(zzkVar);
        zzs zzsVar = new zzs(executor, new zzcb("BasicInternalTimeSignalSupplier"), 1);
        this.zzd = new Object();
        this.zzb = zzbrVar;
        this.zza = zzahVar;
        this.zzc = zzbVar;
        this.zze = zzsVar;
    }
}
