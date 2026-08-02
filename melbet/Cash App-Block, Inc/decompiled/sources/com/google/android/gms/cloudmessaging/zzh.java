package com.google.android.gms.cloudmessaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.Room;
import com.fillr.browsersdk.Fillr;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zznl;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.libraries.places.internal.zzbor;
import com.google.android.libraries.places.internal.zzbsn;
import com.google.android.libraries.places.internal.zzbtu;
import com.google.android.libraries.places.internal.zzbtx;
import com.google.android.libraries.places.internal.zzbuf;
import com.google.android.libraries.places.internal.zzbvs;
import com.google.android.libraries.places.internal.zzcac;
import com.google.android.libraries.places.internal.zzcaf;
import com.google.android.libraries.places.internal.zzcah;
import com.google.android.libraries.places.internal.zzchp;
import com.google.android.libraries.places.internal.zzchy;
import com.google.android.libraries.places.internal.zzcje;
import com.google.android.libraries.places.internal.zzcji;
import com.google.android.libraries.places.internal.zzcjo;
import com.google.android.libraries.places.internal.zzcjt;
import com.google.android.libraries.places.internal.zzclf;
import com.google.android.libraries.places.internal.zzclo;
import com.google.android.libraries.places.internal.zzcly;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzh implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final Object zzb;
    public final Object zzc;
    public boolean zzd;
    public final /* synthetic */ Object zze;

    public zzh(zzchy zzchyVar, zzcjo zzcjoVar) {
        this.$r8$classId = 4;
        Objects.requireNonNull(zzchyVar);
        this.zze = zzchyVar;
        Level level = Level.FINE;
        this.zzb = new zbc(22);
        this.zzd = true;
        this.zzc = zzcjoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor;
        int i;
        boolean zza;
        zzchy zzchyVar;
        zzbtx zzbtxVar;
        switch (this.$r8$classId) {
            case 0:
                Intent intent = (Intent) this.zzb;
                Context context = (Context) this.zzc;
                boolean z = this.zzd;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.zze;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent2 != null) {
                        i = FirebaseInstanceIdReceiver.zzb(intent2);
                    } else {
                        int i2 = 500;
                        if (intent.getExtras() != null) {
                            CloudMessage cloudMessage = new CloudMessage(intent);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference = FirebaseInstanceIdReceiver.zzb;
                                    executor = softReference != null ? (Executor) softReference.get() : null;
                                    if (executor == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("pscm-ack-executor"));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.zzb = new SoftReference(executor);
                                    }
                                } finally {
                                }
                            }
                            executor.execute(new Fillr.AnonymousClass2(6, context, cloudMessage, countDownLatch));
                            try {
                                i2 = ((Integer) Room.await(new FcmBroadcastProcessor(context).process(intent))).intValue();
                            } catch (InterruptedException | ExecutionException e) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", e);
                            }
                            try {
                                if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e2) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e2.toString()));
                            }
                        }
                        i = i2;
                    }
                    if (z && pendingResult != null) {
                        pendingResult.setResultCode(i);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } finally {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                }
            case 1:
                zznl zznlVar = (zznl) this.zze;
                zzgb zzgbVar = zznlVar.zzb;
                if (zzgbVar != null) {
                    zznlVar.zzm(zzgbVar, this.zzd ? null : (zzpl) this.zzc, (com.google.android.gms.measurement.internal.zzr) this.zzb);
                    zznlVar.zzae();
                    return;
                } else {
                    zzgu zzguVar = ((zzic) zznlVar.$$delegate_0).zzi;
                    zzic.zzP(zzguVar);
                    zzguVar.zzd.zza("Discarding data. Failed to set user property");
                    return;
                }
            case 2:
                zznl zznlVar2 = (zznl) this.zze;
                zzgb zzgbVar2 = zznlVar2.zzb;
                if (zzgbVar2 != null) {
                    zznlVar2.zzm(zzgbVar2, this.zzd ? null : (zzbh) this.zzc, (com.google.android.gms.measurement.internal.zzr) this.zzb);
                    zznlVar2.zzae();
                    return;
                } else {
                    zzgu zzguVar2 = ((zzic) zznlVar2.$$delegate_0).zzi;
                    zzic.zzP(zzguVar2);
                    zzguVar2.zzd.zza("Discarding data. Failed to send event to service");
                    return;
                }
            case 3:
                zznl zznlVar3 = (zznl) this.zze;
                zzgb zzgbVar3 = zznlVar3.zzb;
                if (zzgbVar3 == null) {
                    zzgu zzguVar3 = ((zzic) zznlVar3.$$delegate_0).zzi;
                    zzic.zzP(zzguVar3);
                    zzguVar3.zzd.zza("Discarding data. Failed to send conditional user property to service");
                    return;
                } else {
                    zznlVar3.zzm(zzgbVar3, this.zzd ? null : (zzah) this.zzc, (com.google.android.gms.measurement.internal.zzr) this.zzb);
                    zznlVar3.zzae();
                    return;
                }
            default:
                String name = Thread.currentThread().getName();
                Thread.currentThread().setName("OkHttpClientTransport");
                while (true) {
                    try {
                        zza = ((zzcjo) this.zzc).zza(this);
                        zzchyVar = (zzchy) this.zze;
                    } catch (Throwable th) {
                        try {
                            ((zzchy) this.zze).zzag(0, zzcje.PROTOCOL_ERROR, zzbtx.zzh.zze("error in frame handler").zzd(th));
                        } catch (Throwable th2) {
                            try {
                                ((zzcjo) this.zzc).close();
                            } catch (IOException e3) {
                                zzchy.zzf.logp(Level.INFO, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "run", "Exception closing frame reader", (Throwable) e3);
                            } catch (RuntimeException e4) {
                                if (!"bio == null".equals(e4.getMessage())) {
                                    throw e4;
                                }
                            }
                            ((zzchy) this.zze).zzp.zze();
                            Thread.currentThread().setName(name);
                            throw th2;
                        }
                    }
                    if (!zza) {
                        synchronized (zzchyVar.zzs) {
                            zzbtxVar = zzchyVar.zzD;
                        }
                        if (zzbtxVar == null) {
                            zzbtxVar = zzbtx.zzi.zze("End of stream or IOException");
                        }
                        ((zzchy) this.zze).zzag(0, zzcje.INTERNAL_ERROR, zzbtxVar);
                        try {
                            ((zzcjo) this.zzc).close();
                        } catch (IOException e5) {
                            zzchy.zzf.logp(Level.INFO, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "run", "Exception closing frame reader", (Throwable) e5);
                        } catch (RuntimeException e6) {
                            if (!"bio == null".equals(e6.getMessage())) {
                                throw e6;
                            }
                        }
                        ((zzchy) this.zze).zzp.zze();
                        Thread.currentThread().setName(name);
                        return;
                    }
                    zzchyVar.getClass();
                }
        }
    }

    public void zza(boolean z, int i, zzcly zzclyVar, int i2, int i3) {
        zzchp zzchpVar;
        ((zbc) this.zzb).zza(1, i, zzclyVar.zzb, i2, z);
        zzchy zzchyVar = (zzchy) this.zze;
        synchronized (zzchyVar.zzs) {
            zzchpVar = (zzchp) zzchyVar.zzv.get(Integer.valueOf(i));
        }
        if (zzchpVar != null) {
            long j = i2;
            zzclyVar.zzg(j);
            zzclo zzcloVar = new zzclo();
            zzcloVar.zzc(zzclyVar.zzb, j);
            zzchpVar.zzg.getClass();
            int i4 = zzclf.$r8$clinit;
            synchronized (((zzchy) this.zze).zzs) {
                zzchpVar.zzg.zzH(i3 - i2, zzcloVar, z);
            }
        } else {
            if (!zzchyVar.zzp(i)) {
                zzchy zzchyVar2 = (zzchy) this.zze;
                zzcje zzcjeVar = zzcje.PROTOCOL_ERROR;
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 34);
                sb.append("Received data for unknown stream: ");
                sb.append(i);
                String sb2 = sb.toString();
                zzchyVar2.getClass();
                zzchyVar2.zzag(0, zzcjeVar, zzchy.zzr(zzcjeVar).zzf(sb2));
                return;
            }
            synchronized (zzchyVar.zzs) {
                zzchyVar.zzq.zzb(i, zzcje.STREAM_CLOSED);
            }
            zzclyVar.zzt(i2);
        }
        zzchy zzchyVar3 = (zzchy) this.zze;
        int i5 = zzchyVar3.zzA + i3;
        zzchyVar3.zzA = i5;
        if (i5 >= zzchyVar3.zzn * 0.5f) {
            synchronized (zzchyVar3.zzs) {
                zzchyVar3.zzq.zzk(0, zzchyVar3.zzA);
            }
            ((zzchy) this.zze).zzA = 0;
        }
    }

    public void zzb(int i, zzcje zzcjeVar) {
        boolean z = true;
        ((zbc) this.zzb).zzc(1, i, zzcjeVar);
        zzbtx zzf = zzchy.zzr(zzcjeVar).zzf("Rst Stream");
        zzbtu zzbtuVar = zzf.zzn;
        if (zzbtuVar != zzbtu.CANCELLED && zzbtuVar != zzbtu.DEADLINE_EXCEEDED) {
            z = false;
        }
        boolean z2 = z;
        zzchy zzchyVar = (zzchy) this.zze;
        synchronized (zzchyVar.zzs) {
            try {
                zzchp zzchpVar = (zzchp) zzchyVar.zzv.get(Integer.valueOf(i));
                if (zzchpVar != null) {
                    zzchpVar.zzg.getClass();
                    int i2 = zzclf.$r8$clinit;
                    zzchyVar.zzo(i, zzf, zzcjeVar == zzcje.REFUSED_STREAM ? zzbvs.zzb : zzbvs.zza, z2, null, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void zzc(zzcjt zzcjtVar) {
        boolean z = true;
        ((zbc) this.zzb).zze(1, zzcjtVar);
        zzchy zzchyVar = (zzchy) this.zze;
        synchronized (zzchyVar.zzs) {
            try {
                int i = zzcjtVar.zza;
                int i2 = 0;
                if ((i & 16) != 0) {
                    zzchyVar.zzM = zzcjtVar.zzb[4];
                }
                if ((i & 128) == 0) {
                    z = false;
                }
                boolean zza = z ? zzchyVar.zzr.zza(zzcjtVar.zzb[7]) : false;
                if (this.zzd) {
                    zzcaf zzcafVar = zzchyVar.zzp;
                    zzbor zzborVar = zzchyVar.zzC;
                    Iterator it = ((zzcah) zzcafVar.zzc).zzk.iterator();
                    if (it.hasNext()) {
                        throw null;
                    }
                    zzchyVar.zzC = zzborVar;
                    zzcaf zzcafVar2 = zzchyVar.zzp;
                    zzcah zzcahVar = (zzcah) zzcafVar2.zzc;
                    zzcahVar.zzi.zza(2, "READY");
                    zzcac zzcacVar = new zzcac(zzcafVar2, i2);
                    zzbuf zzbufVar = zzcahVar.zzl;
                    zzbufVar.zzb(zzcacVar);
                    zzbufVar.zza();
                    this.zzd = false;
                }
                zzchyVar.zzq.zza(zzcjtVar);
                if (zza) {
                    zzchyVar.zzr.zzf();
                }
                zzchyVar.zzae();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void zzh(boolean z, int i, ArrayList arrayList) {
        zbc zbcVar = (zbc) this.zzb;
        if (zbcVar.zzl()) {
            Logger logger = (Logger) zbcVar.zba;
            Level level = (Level) zbcVar.zbb;
            String obj = arrayList.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 35 + obj.length() + 11 + String.valueOf(z).length());
            sb.append("INBOUND HEADERS: streamId=");
            sb.append(i);
            sb.append(" headers=");
            sb.append(obj);
            sb.append(" endStream=");
            sb.append(z);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logHeaders", sb.toString());
        }
        zzchy zzchyVar = (zzchy) this.zze;
        zzbtx zzbtxVar = null;
        boolean z2 = true;
        if (zzchyVar.zzR != Integer.MAX_VALUE) {
            long j = 0;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                zzcji zzcjiVar = (zzcji) arrayList.get(i2);
                j += zzcjiVar.zzg.zzj() + zzcjiVar.zzf.zzj() + 32;
            }
            int min = (int) Math.min(j, 2147483647L);
            int i3 = zzchyVar.zzR;
            if (min > i3) {
                zzbtx zzbtxVar2 = zzbtx.zzf;
                Locale locale = Locale.US;
                StringBuilder m = Recorder$$ExternalSyntheticOutline2.m("Response ", i3, true != z ? "header" : "trailer", " metadata larger than ", ": ");
                m.append(min);
                zzbtxVar = zzbtxVar2.zze(m.toString());
            }
        }
        synchronized (zzchyVar.zzs) {
            try {
                zzchp zzchpVar = (zzchp) zzchyVar.zzv.get(Integer.valueOf(i));
                if (zzchpVar == null) {
                    if (zzchyVar.zzp(i)) {
                        zzchyVar.zzq.zzb(i, zzcje.STREAM_CLOSED);
                    }
                } else if (zzbtxVar == null) {
                    zzchpVar.zzg.getClass();
                    int i4 = zzclf.$r8$clinit;
                    zzchpVar.zzg.zzG(arrayList, z);
                } else {
                    if (!z) {
                        zzchyVar.zzq.zzb(i, zzcje.CANCEL);
                    }
                    zzchpVar.zzg.zzg(zzbtxVar, zzbvs.zza, false, new zzbsn());
                }
                z2 = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            zzchy zzchyVar2 = (zzchy) this.zze;
            zzcje zzcjeVar = zzcje.PROTOCOL_ERROR;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 36);
            sb2.append("Received header for unknown stream: ");
            sb2.append(i);
            String sb3 = sb2.toString();
            zzchyVar2.getClass();
            zzchyVar2.zzag(0, zzcjeVar, zzchy.zzr(zzcjeVar).zzf(sb3));
        }
    }

    public /* synthetic */ zzh(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.$r8$classId = 0;
        this.zzb = intent;
        this.zzc = context;
        this.zzd = z;
        this.zze = pendingResult;
    }

    public zzh(zznl zznlVar, com.google.android.gms.measurement.internal.zzr zzrVar, boolean z, zzah zzahVar) {
        this.$r8$classId = 3;
        this.zzb = zzrVar;
        this.zzd = z;
        this.zzc = zzahVar;
        Objects.requireNonNull(zznlVar);
        this.zze = zznlVar;
    }

    public /* synthetic */ zzh(zznl zznlVar, com.google.android.gms.measurement.internal.zzr zzrVar, boolean z, AbstractSafeParcelable abstractSafeParcelable, int i) {
        this.$r8$classId = i;
        this.zzb = zzrVar;
        this.zzd = z;
        this.zzc = abstractSafeParcelable;
        this.zze = zznlVar;
    }
}
