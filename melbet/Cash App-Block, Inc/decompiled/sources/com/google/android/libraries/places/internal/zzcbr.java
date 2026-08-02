package com.google.android.libraries.places.internal;

import androidx.core.provider.CallbackWrapper$2;
import androidx.tracing.Trace;
import com.android.volley.Response;
import com.google.common.base.Ascii;
import com.google.mlkit.common.sdkinternal.zzb;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import net.oneformapp.schema.Schema;

/* loaded from: classes4.dex */
public final class zzcbr extends zzbpa {
    public static final zzbwr zzk;
    public final zzbpv zza;
    public final ScheduledFuture zza$1;
    public final Schema zzb;
    public final Executor zzb$1;
    public final zzbov zzc;
    public final zzbpv zzc$1;
    public final /* synthetic */ zzcbs zzd;
    public volatile boolean zzd$1;
    public final long zze;
    public zzboz zze$1;
    public zzbsn zzf;
    public zzbpa zzg;
    public zzbtx zzh;
    public List zzi;
    public zzbwy zzj;

    static {
        Logger.getLogger(zzcbr.class.getName());
        zzk = new zzbwr();
    }

    public zzcbr(zzcbs zzcbsVar, zzbpv zzbpvVar, Schema schema, zzbov zzbovVar) {
        ScheduledFuture<?> scheduledFuture;
        this.zzd = zzcbsVar;
        zzcby zzcbyVar = zzcbsVar.zza;
        zzcbyVar.getClass();
        Executor executor = zzbovVar.zzc;
        executor = executor == null ? zzcbyVar.zzr : executor;
        zzcbt zzcbtVar = zzcbyVar.zzq;
        zzbpy zzbpyVar = zzbovVar.zzb;
        this.zzi = new ArrayList();
        Trace.checkNotNull(executor, "callExecutor");
        this.zzb$1 = executor;
        Trace.checkNotNull(zzcbtVar, "scheduler");
        Logger logger = zzbpv.zza;
        zzbpv zzc = zzbpt.zza.zzc();
        this.zzc$1 = zzc == null ? zzbpv.zzb : zzc;
        if (zzbpyVar != null) {
            long zzc2 = zzbpyVar.zzc();
            scheduledFuture = zzcbtVar.zza.schedule(new com.google.android.gms.measurement.internal.zzly(this, zzc2), zzc2, TimeUnit.NANOSECONDS);
        } else {
            scheduledFuture = null;
        }
        this.zza$1 = scheduledFuture;
        this.zza = zzbpvVar;
        this.zzb = schema;
        this.zzc = zzbovVar;
        this.zze = System.nanoTime();
    }

    public final String toString() {
        Response stringHelper = Ascii.toStringHelper(this);
        stringHelper.add(this.zzg, "realCall");
        return stringHelper.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbpa
    public final void zza(zzboz zzbozVar, zzbsn zzbsnVar) {
        zzbtx zzbtxVar;
        boolean z;
        Trace.checkNotNull(zzbsnVar, "headers");
        Trace.checkState("already started", this.zze$1 == null);
        synchronized (this) {
            try {
                Trace.checkNotNull(zzbozVar, "listener");
                this.zze$1 = zzbozVar;
                zzbtxVar = this.zzh;
                z = this.zzd$1;
                if (!z) {
                    zzbwy zzbwyVar = new zzbwy(zzbozVar);
                    this.zzj = zzbwyVar;
                    this.zzf = zzbsnVar;
                    zzbozVar = zzbwyVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zzbtxVar != null) {
            this.zzb$1.execute(new zzbws(this, zzbozVar, zzbtxVar));
        } else if (z) {
            this.zzg.zza(zzbozVar, zzbsnVar);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbpa
    public final void zzb(Object obj) {
        if (this.zzd$1) {
            this.zzg.zzb(obj);
        } else {
            zzo(new com.google.android.gms.tasks.zzc(17, this, obj));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbpa
    public final void zzc(int i) {
        if (this.zzd$1) {
            this.zzg.zzc(i);
        } else {
            zzo(new CallbackWrapper$2(this, i, 4));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbpa
    public final void zzd() {
        zzo(new zzbwq(this, 0));
    }

    @Override // com.google.android.libraries.places.internal.zzbpa
    public final void zze(String str, Throwable th) {
        zzbtx zzbtxVar = zzbtx.zzb;
        zzbtx zze = str != null ? zzbtxVar.zze(str) : zzbtxVar.zze("Call cancelled without message");
        if (th != null) {
            zze = zze.zzd(th);
        }
        zzn(zze, false);
    }

    public final void zzm$1() {
        zzbvo zzbvoVar;
        zzbpv zzb = this.zza.zzb();
        try {
            zzbpa zzh = this.zzd.zzh(this.zzb, this.zzc.zzh(zzbph.zza, Long.valueOf(System.nanoTime() - this.zze)));
            synchronized (this) {
                try {
                    zzbpa zzbpaVar = this.zzg;
                    zzbvoVar = null;
                    if (zzbpaVar == null) {
                        Trace.checkState("realCall already set to %s", zzbpaVar, zzbpaVar == null);
                        ScheduledFuture scheduledFuture = this.zza$1;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        this.zzg = zzh;
                        zzbwy zzbwyVar = this.zzj;
                        if (zzbwyVar == null) {
                            this.zzi = null;
                            this.zzd$1 = true;
                        } else {
                            zzbsn zzbsnVar = this.zzf;
                            this.zzf = null;
                            zzbpv zzbpvVar = this.zzc$1;
                            zzbpv zzb2 = zzbpvVar.zzb();
                            try {
                                this.zzg.zza(zzbwyVar, zzbsnVar);
                                zzbpvVar.zzc(zzb2);
                                zzbvoVar = new zzbvo(this, this.zzc$1);
                            } catch (Throwable th) {
                                zzbpvVar.zzc(zzb2);
                                throw th;
                            }
                        }
                    }
                } finally {
                }
            }
            zzcbs zzcbsVar = this.zzd;
            if (zzbvoVar == null) {
                zzbwq zzbwqVar = new zzbwq(this, 1);
                zzbuf zzbufVar = zzcbsVar.zza.zze;
                zzbufVar.zzb(zzbwqVar);
                zzbufVar.zza();
                return;
            }
            zzbov zzbovVar = this.zzc;
            zzcby zzcbyVar = zzcbsVar.zza;
            zzcbyVar.getClass();
            Executor executor = zzbovVar.zzc;
            if (executor == null) {
                executor = zzcbyVar.zzr;
            }
            executor.execute(new zzb(this, zzbvoVar));
        } finally {
            this.zza.zzc(zzb);
        }
    }

    public final void zzn(zzbtx zzbtxVar, boolean z) {
        zzboz zzbozVar;
        boolean z2;
        synchronized (this) {
            try {
                zzbpa zzbpaVar = this.zzg;
                if (zzbpaVar == null) {
                    zzbwr zzbwrVar = zzk;
                    z2 = false;
                    Trace.checkState("realCall already set to %s", zzbpaVar, zzbpaVar == null);
                    ScheduledFuture scheduledFuture = this.zza$1;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.zzg = zzbwrVar;
                    zzbozVar = this.zze$1;
                    this.zzh = zzbtxVar;
                } else {
                    if (z) {
                        return;
                    }
                    zzbozVar = null;
                    z2 = true;
                }
                if (z2) {
                    zzo(new com.google.android.gms.tasks.zzc(16, this, zzbtxVar));
                } else {
                    if (zzbozVar != null) {
                        this.zzb$1.execute(new zzbws(this, zzbozVar, zzbtxVar));
                    }
                    zzbsn zzbsnVar = this.zzf;
                    this.zzf = null;
                    zzbpv zzbpvVar = this.zzc$1;
                    zzbpv zzb = zzbpvVar.zzb();
                    try {
                        this.zzg.zza(zzbozVar, zzbsnVar);
                        zzbpvVar.zzc(zzb);
                        zzp$1();
                    } catch (Throwable th) {
                        zzbpvVar.zzc(zzb);
                        throw th;
                    }
                }
                zzbwq zzbwqVar = new zzbwq(this, 1);
                zzbuf zzbufVar = this.zzd.zza.zze;
                zzbufVar.zzb(zzbwqVar);
                zzbufVar.zza();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzo(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.zzd$1) {
                    runnable.run();
                } else {
                    this.zzi.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzp$1() {
        zzbwy zzbwyVar;
        List list;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (this) {
                if (this.zzi.isEmpty()) {
                    break;
                }
                list = this.zzi;
                this.zzi = arrayList;
            }
            if (zzbwyVar == null) {
                this.zzb$1.execute(new zzbvo(this, zzbwyVar));
                return;
            }
            return;
            list.clear();
            arrayList = list;
        }
        this.zzi = null;
        this.zzd$1 = true;
        zzbwyVar = this.zzj;
        if (zzbwyVar == null) {
        }
    }
}
