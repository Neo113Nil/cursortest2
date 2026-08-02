package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import com.google.android.filament.Box;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.mlkit.common.sdkinternal.zzb;
import java.io.IOException;
import java.net.Socket;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import okhttp3.internal.http1.HeadersReader;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzmu implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object zza;

    public zzmu(zzcfq zzcfqVar) {
        this.$r8$classId = 15;
        Objects.requireNonNull(zzcfqVar);
        this.zza = zzcfqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.$r8$classId) {
            case 0:
                ((TaskCompletionSource) this.zza).trySetException(new ApiException(new Status(15, "Location timeout.", null, null)));
                return;
            case 1:
                zzaze zzazeVar = (zzaze) this.zza;
                if (zzazeVar.zzs) {
                    return;
                }
                zzazeVar.zzq = true;
                zzazeVar.zzC();
                return;
            case 2:
                zzaza zzazaVar = (zzaza) this.zza;
                if (zzazaVar.zza) {
                    return;
                }
                ((zzazr) zzazaVar.zzc).zzd();
                return;
            case 3:
                ((zzboz) this.zza).zzd();
                return;
            case 4:
                zzbvd zzbvdVar = (zzbvd) this.zza;
                Box box = zzbvdVar.zzc;
                if (box != null) {
                    zzbud zzbudVar = (zzbud) box.mCenter;
                    if (!zzbudVar.zzc && !zzbudVar.zzb) {
                        box.zza();
                    }
                }
                zzbvdVar.zze = null;
                return;
            case 5:
                ((zzbwy) this.zza).zza.zzd();
                return;
            case 6:
                ((zzbxx) this.zza).zza.zzd();
                return;
            case 7:
                zzcah zzcahVar = (zzcah) ((zzb) this.zza).zzb;
                zzcahVar.zzq = null;
                zzcahVar.zzr = null;
                zzcahVar.zzr.zzd(zzbtx.zzi.zze("InternalSubchannel closed transport due to address change"));
                return;
            case 8:
                zzcby zzcbyVar = (zzcby) this.zza;
                if (zzcbyVar.zzF == null) {
                    return;
                }
                zzcbyVar.zzao(true);
                zzbxg zzbxgVar = zzcbyVar.zzK;
                zzbxgVar.zzg(null);
                zzcbyVar.zzU.zza(2, "Entering IDLE state");
                zzcbyVar.zzz.zza(zzbpq.zzd);
                Object[] objArr = {zzcbyVar.zzJ, zzbxgVar};
                zzbzo zzbzoVar = zzcbyVar.zzf;
                zzbzoVar.getClass();
                while (i < 2) {
                    if (((zzbzl) zzbzoVar).zza.contains(objArr[i])) {
                        zzcbyVar.zze();
                        return;
                    }
                    i++;
                }
                return;
            case 9:
                zzcby zzcbyVar2 = ((zzcbg) this.zza).zzb;
                zzcbyVar2.zze.zzc();
                if (zzcbyVar2.zzE) {
                    zzcbyVar2.zzD.zzd();
                    return;
                }
                return;
            case 10:
                ((zzcbs) this.zza).zza.zze();
                return;
            case 11:
                zzcah zzcahVar2 = ((zzcbw) this.zza).zzf;
                zzbtx zzbtxVar = zzcby.zzd;
                zzcahVar2.getClass();
                zzbzt zzbztVar = new zzbzt(zzcahVar2, zzbtxVar, i);
                zzbuf zzbufVar = zzcahVar2.zzl;
                zzbufVar.zzb(zzbztVar);
                zzbufVar.zza();
                return;
            case 12:
                ((zzcdo) this.zza).zzd();
                return;
            case 13:
                zzcax zzcaxVar = ((zzcee) this.zza).zzg;
                zzcaxVar.zzC = true;
                com.google.android.gms.maps.zzah zzahVar = zzcaxVar.zzv;
                zzcaxVar.zzx.zzc((zzbtx) zzahVar.f68zza, (zzbvs) zzahVar.zzb, (zzbsn) zzahVar.zzc);
                return;
            case 14:
                zzcax zzcaxVar2 = (zzcax) this.zza;
                if (zzcaxVar2.zzC) {
                    return;
                }
                zzcaxVar2.zzx.zzd();
                return;
            case 15:
                ((zzcfq) this.zza).zzd();
                return;
            case 16:
                zzchc zzchcVar = (zzchc) this.zza;
                try {
                    zzcll zzcllVar = zzchcVar.zzh;
                    if (zzcllVar != null) {
                        zzclo zzcloVar = zzchcVar.zzb;
                        long j = zzcloVar.zzb;
                        if (j > 0) {
                            zzcllVar.zzc(zzcloVar, j);
                        }
                    }
                } catch (IOException e) {
                    zzchcVar.zzd.zzg(e);
                }
                try {
                    zzcll zzcllVar2 = zzchcVar.zzh;
                    if (zzcllVar2 != null) {
                        zzcllVar2.close();
                    }
                } catch (IOException e2) {
                    zzchcVar.zzd.zzg(e2);
                }
                try {
                    Socket socket = zzchcVar.zzi;
                    if (socket != null) {
                        socket.close();
                        return;
                    }
                    return;
                } catch (IOException e3) {
                    zzchcVar.zzd.zzg(e3);
                    return;
                }
            case 17:
                HeadersReader headersReader = (HeadersReader) this.zza;
                zzbuy zzbuyVar = (zzbuy) headersReader.source;
                AtomicLong atomicLong = zzbuyVar.zzc;
                long j2 = headersReader.headerLimit;
                long max = Math.max(j2 + j2, j2);
                if (atomicLong.compareAndSet(j2, max)) {
                    String str = zzbuyVar.zzb;
                    zzbuy.zza.logp(Level.WARNING, "io.grpc.internal.AtomicBackoff$State", "backoff", "Increased {0} to {1}", new Object[]{str, Long.valueOf(max)});
                    return;
                }
                return;
            default:
                zzchy zzchyVar = (zzchy) this.zza;
                synchronized (zzchyVar.zzs) {
                    zzchyVar.zzM = Integer.MAX_VALUE;
                    Trace.checkState("Pending streams detected during transport start. RPCs should not be started before transport is ready.", zzchyVar.zzN.isEmpty());
                }
                zzchy zzchyVar2 = (zzchy) this.zza;
                zzchyVar2.zzw.execute(zzchyVar2.zzB);
                return;
        }
    }

    public /* synthetic */ zzmu(Object obj, int i) {
        this.$r8$classId = i;
        this.zza = obj;
    }

    public zzmu(zzchl zzchlVar, HeadersReader headersReader) {
        this.$r8$classId = 17;
        this.zza = headersReader;
    }
}
