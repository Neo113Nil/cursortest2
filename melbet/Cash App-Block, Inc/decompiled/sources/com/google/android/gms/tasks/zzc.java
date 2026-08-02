package com.google.android.gms.tasks;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.ComponentName;
import android.os.RemoteException;
import android.util.Log;
import androidx.tracing.Trace;
import coil3.Extras;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.measurement.zzcv;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zznf;
import com.google.android.gms.measurement.internal.zznl;
import com.google.android.gms.measurement.internal.zznp;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.stats.zza;
import com.google.android.libraries.places.internal.zzaza;
import com.google.android.libraries.places.internal.zzazb;
import com.google.android.libraries.places.internal.zzaze;
import com.google.android.libraries.places.internal.zzazr;
import com.google.android.libraries.places.internal.zzbpa;
import com.google.android.libraries.places.internal.zzbpl;
import com.google.android.libraries.places.internal.zzbpy;
import com.google.android.libraries.places.internal.zzbqb;
import com.google.android.libraries.places.internal.zzbsn;
import com.google.android.libraries.places.internal.zzbtb;
import com.google.android.libraries.places.internal.zzbtc;
import com.google.android.libraries.places.internal.zzbtd;
import com.google.android.libraries.places.internal.zzbtx;
import com.google.android.libraries.places.internal.zzbtz;
import com.google.android.libraries.places.internal.zzbwy;
import com.google.android.libraries.places.internal.zzbxe;
import com.google.android.libraries.places.internal.zzbxg;
import com.google.android.libraries.places.internal.zzbxx;
import com.google.android.libraries.places.internal.zzbyi;
import com.google.android.libraries.places.internal.zzcbr;
import com.google.android.libraries.places.internal.zzcgg;
import com.google.android.libraries.places.internal.zzcjz;
import com.google.android.libraries.places.internal.zzfv;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class zzc implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object zza;
    public final /* synthetic */ Object zzb;

    public zzc(Extras.Key key, zzpg zzpgVar, Runnable runnable) {
        this.$r8$classId = 4;
        this.zza = zzpgVar;
        this.zzb = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 4;
        switch (this.$r8$classId) {
            case 0:
                Task task = (Task) this.zza;
                boolean isCanceled = task.isCanceled();
                zzd zzdVar = (zzd) this.zzb;
                if (isCanceled) {
                    zzdVar.zzc.zze();
                    return;
                }
                try {
                    zzdVar.zzc.zza(zzdVar.zzb.then(task));
                    return;
                } catch (RuntimeExecutionException e) {
                    if (!(e.getCause() instanceof Exception)) {
                        zzdVar.zzc.zzc(e);
                        return;
                    } else {
                        zzdVar.zzc.zzc((Exception) e.getCause());
                        return;
                    }
                } catch (Exception e2) {
                    zzdVar.zzc.zzc(e2);
                    return;
                }
            case 1:
                ((zznf) this.zzb).zza.zzW((ComponentName) this.zza);
                return;
            case 2:
                zznf zznfVar = (zznf) this.zzb;
                synchronized (zznfVar) {
                    try {
                        zznfVar.zzb = false;
                        zznl zznlVar = zznfVar.zza;
                        if (!zznlVar.zzh()) {
                            zzgu zzguVar = ((zzic) zznlVar.$$delegate_0).zzi;
                            zzic.zzP(zzguVar);
                            zzguVar.zzk.zza("Connected to remote service");
                            zzgb zzgbVar = (zzgb) this.zza;
                            zznlVar.zzg();
                            zznlVar.zzb = zzgbVar;
                            zznlVar.zzae();
                            zznlVar.zzag$2();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                zznl zznlVar2 = ((zznf) this.zzb).zza;
                ScheduledExecutorService scheduledExecutorService = zznlVar2.zze;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    zznlVar2.zze = null;
                    return;
                }
                return;
            case 3:
                zznl zznlVar3 = ((zznf) this.zzb).zza;
                zznlVar3.zzb = null;
                if (((ConnectionResult) this.zza).zzb != 7777) {
                    zznlVar3.zzag$2();
                    return;
                }
                if (zznlVar3.zze == null) {
                    zznlVar3.zze = Executors.newScheduledThreadPool(1);
                }
                zznlVar3.zze.schedule(new zza(this, i), ((Long) zzfy.zzZ.zzb(null)).longValue(), TimeUnit.MILLISECONDS);
                return;
            case 4:
                zzpg zzpgVar = (zzpg) this.zza;
                zzpgVar.zzaa$1();
                Runnable runnable = (Runnable) this.zzb;
                zzpgVar.zzaX().zzg();
                if (zzpgVar.zzq == null) {
                    zzpgVar.zzq = new ArrayList();
                }
                zzpgVar.zzq.add(runnable);
                zzpgVar.zzM();
                return;
            case 5:
                Extras.Key key = (Extras.Key) this.zza;
                JobParameters jobParameters = (JobParameters) this.zzb;
                Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
                ((zznp) ((Service) key.f61default)).zzb(jobParameters);
                return;
            case 6:
                try {
                    ((zzcv) this.zzb).zze();
                    return;
                } catch (RemoteException e3) {
                    zzic zzicVar = ((AppMeasurementDynamiteService) this.zza).zza;
                    com.google.android.gms.common.internal.zzae.checkNotNull(zzicVar);
                    zzgu zzguVar2 = zzicVar.zzi;
                    zzic.zzP(zzguVar2);
                    zzguVar2.zzg.zzb(e3, "Failed to call IDynamiteUploadBatchesCallback");
                    return;
                }
            case 7:
                zzd zzdVar2 = (zzd) this.zzb;
                try {
                    Task task2 = (Task) zzdVar2.zzb.then((Task) this.zza);
                    if (task2 == null) {
                        zzdVar2.onFailure(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    zzt zztVar = TaskExecutors.zza;
                    task2.addOnSuccessListener(zztVar, zzdVar2);
                    task2.addOnFailureListener(zztVar, zzdVar2);
                    task2.addOnCanceledListener(zztVar, zzdVar2);
                    return;
                } catch (RuntimeExecutionException e4) {
                    if (!(e4.getCause() instanceof Exception)) {
                        zzdVar2.zzc.zzc(e4);
                        return;
                    } else {
                        zzdVar2.zzc.zzc((Exception) e4.getCause());
                        return;
                    }
                } catch (Exception e5) {
                    zzdVar2.zzc.zzc(e5);
                    return;
                }
            case 8:
                ((zzaze) this.zza).zzt((zzbsn) this.zzb);
                return;
            case 9:
                zzaze zzazeVar = (zzaze) this.zza;
                try {
                    ((Runnable) this.zzb).run();
                    return;
                } catch (Throwable th2) {
                    zzazeVar.zzs = true;
                    zzaza zzazaVar = zzazeVar.zzo;
                    if (zzazaVar != null) {
                        zzazaVar.zzc(zzbtx.zzb(th2), new zzbsn());
                        zzbpa zzbpaVar = zzazeVar.zzt;
                        if (zzbpaVar == null || zzazeVar.zzl.endY != 4) {
                            return;
                        }
                        zzbpaVar.zze(null, th2);
                        return;
                    }
                    return;
                }
            case 10:
                zzaze zzazeVar2 = (zzaze) this.zza;
                zzazeVar2.zze.remove((ListenableFuture) this.zzb);
                return;
            case 11:
                zzaze zzazeVar3 = (zzaze) this.zza;
                zzazeVar3.zzh.add(new zzazb(zzazeVar3, this.zzb));
                zzazeVar3.zzy();
                return;
            case 12:
                zzaza zzazaVar2 = (zzaza) this.zza;
                Object obj = this.zzb;
                if (zzazaVar2.zza) {
                    return;
                }
                ((zzazr) zzazaVar2.zzc).zzb(obj);
                return;
            case 13:
                zzaza zzazaVar3 = (zzaza) this.zza;
                zzbsn zzbsnVar = (zzbsn) this.zzb;
                if (zzazaVar3.zza) {
                    return;
                }
                ((zzazr) zzazaVar3.zzc).zza(zzbsnVar);
                return;
            case 14:
                zzazr zzazrVar = (zzazr) this.zza;
                zzazrVar.zza.zzb(this.zzb);
                return;
            case 15:
                zzazr zzazrVar2 = (zzazr) this.zza;
                zzazrVar2.zza.zza((zzbsn) this.zzb);
                return;
            case 16:
                zzbtx zzbtxVar = (zzbtx) this.zza;
                ((zzcbr) this.zzb).zzg.zze(zzbtxVar.zzo, zzbtxVar.zzp);
                return;
            case 17:
                ((zzcbr) this.zzb).zzg.zzb(this.zza);
                return;
            case 18:
                ((zzbwy) this.zzb).zza.zza((zzbsn) this.zza);
                return;
            case 19:
                ((zzbwy) this.zzb).zza.zzb(this.zza);
                return;
            case 20:
                ((zzbxg) this.zzb).zzh.zzd((zzbtx) this.zza, zzcgg.SUBCHANNEL_SHUTDOWN);
                return;
            case 21:
                ((zzbxe) this.zzb).zzd$1.zzv((zzbpl) this.zza);
                return;
            case 22:
                ((zzbxe) this.zzb).zzd$1.zzd((zzbqb) this.zza);
                return;
            case 23:
                ((zzbxe) this.zzb).zzd$1.zza((zzbpy) this.zza);
                return;
            case 24:
                ((zzbxe) this.zzb).zzd$1.zzt((zzcjz) this.zza);
                return;
            case 25:
                ((zzbxe) this.zzb).zzd$1.zzl((zzbtx) this.zza);
                return;
            case 26:
                ((zzbxx) this.zzb).zza.zzb((zzfv) this.zza);
                return;
            case 27:
                ((zzbxx) this.zzb).zza.zza((zzbsn) this.zza);
                return;
            case 28:
                com.google.mlkit.common.sdkinternal.zzb zzbVar = (com.google.mlkit.common.sdkinternal.zzb) this.zza;
                ((zzbtb) zzbVar.zza).zza((zzbtd) this.zzb);
                return;
            default:
                com.google.mlkit.common.sdkinternal.zzb zzbVar2 = (com.google.mlkit.common.sdkinternal.zzb) this.zza;
                IOException iOException = (IOException) this.zzb;
                String str = ((zzbyi) zzbVar2.zzb).zzr;
                zzbtc zzbtcVar = new zzbtc();
                zzbtx zzd = zzbtx.zzi.zze("Unable to resolve host ".concat(String.valueOf(str))).zzd(iOException);
                zzbtz zzbtzVar = new zzbtz(zzd, null);
                Trace.checkArgument("cannot use OK status: %s", zzd, true ^ zzd.zzj());
                zzbtcVar.zza = zzbtzVar;
                ((zzbtb) zzbVar2.zza).zza(new zzbtd(zzbtzVar, zzbtcVar.zzb, zzbtcVar.zzc));
                return;
        }
    }

    public /* synthetic */ zzc(Object obj, Object obj2, boolean z, int i) {
        this.$r8$classId = i;
        this.zza = obj;
        this.zzb = obj2;
    }

    public /* synthetic */ zzc(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.zza = obj2;
        this.zzb = obj;
    }
}
