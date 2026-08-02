package com.google.android.libraries.places.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.request.ViewTargetDisposable;
import com.android.volley.Response;
import com.google.common.base.Ascii;
import com.google.common.base.Stopwatch;
import com.google.common.base.Supplier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.oneformapp.schema.Schema;

/* loaded from: classes4.dex */
public final class zzcby extends zzbsd implements zzbqz {
    public static final Logger zza = Logger.getLogger(zzcby.class.getName());
    public static final zzcaw zzai;
    public static final zzbtx zzb;
    public static final zzbtx zzc;
    public static final zzbtx zzd;
    public static final zzcci zzg;
    public static final zzcap zzh;
    public static final zzcau zzi;
    public final zzbow zzA;
    public final ArrayList zzB;
    public final String zzC;
    public zzcfq zzD;
    public boolean zzE;
    public zzcbg zzF;
    public boolean zzG;
    public LinkedHashSet zzI;
    public final zzbxg zzK;
    public boolean zzO;
    public volatile boolean zzP;
    public final zzcar zzR;
    public final zzyr zzS;
    public final zzbvj zzT;
    public final zzbvi zzU;
    public final zzbqr zzV;
    public final zzcbs zzW;
    public final boolean zzZ;
    public final long zzab;
    public final long zzac;
    public final boolean zzad;
    public final zzfv zzae;
    public final ViewTargetDisposable zzaf;
    public final zzceb zzag;
    public final zzfv zzah;
    public final zzbzo zzf;
    public final zzbra zzj;
    public final String zzk;
    public final zzcgu zzl;
    public final zzbtg zzm;
    public final zzbsy zzn;
    public final zzbvb zzo;
    public final zzbvf zzp;
    public final zzcbt zzq;
    public final Executor zzr;
    public final zzfv zzs;
    public final zzayv zzt;
    public final zzayv zzu;
    public final zzcgm zzv;
    public final zzbqb zzw;
    public final Supplier zzx;
    public final long zzy;
    public final zzbuf zze = new zzbuf(new zzcav(this));
    public final zzbwh zzz = new zzbwh();
    public final HashSet zzH = new HashSet(16, 0.75f);
    public final Object zzJ = new Object();
    public final zzyr zzL = new zzyr(this);
    public final AtomicBoolean zzM = new AtomicBoolean(false);
    public final CountDownLatch zzQ = new CountDownLatch(1);
    public int zzaj = 1;
    public zzcci zzX = zzg;
    public boolean zzY = false;
    public final zzceu zzaa = new zzceu();

    static {
        zzbtx zzbtxVar = zzbtx.zzi;
        zzb = zzbtxVar.zze("Channel shutdownNow invoked");
        zzc = zzbtxVar.zze("Channel shutdown invoked");
        zzd = zzbtxVar.zze("Subchannel shutdown invoked");
        zzg = new zzcci(null, new HashMap(), new HashMap(), null, null, null);
        zzh = new zzcap();
        zzi = new zzcau();
        zzai = new zzcaw();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [com.google.android.libraries.places.internal.zzbpc] */
    public zzcby(zzccd zzccdVar, zzchl zzchlVar, zzcgu zzcguVar, zzbtg zzbtgVar, zzbyk zzbykVar, zzfv zzfvVar, Supplier supplier, ArrayList arrayList, zzcgm zzcgmVar) {
        Throwable th;
        zzbsa zzbsaVar;
        zzbpw zzbpwVar = zzbpy.zzb;
        this.zzae = new zzfv(this, 6);
        this.zzf = new zzbzo(this, 1);
        this.zzaf = new ViewTargetDisposable(this);
        String str = zzccdVar.zzh;
        Trace.checkNotNull(str, "target");
        this.zzk = str;
        zzbra zzbraVar = new zzbra("Channel", str, zzbra.zza.incrementAndGet());
        this.zzj = zzbraVar;
        Trace.checkNotNull(zzcgmVar, "timeProvider");
        this.zzv = zzcgmVar;
        zzfv zzfvVar2 = zzccdVar.zzd;
        Trace.checkNotNull(zzfvVar2, "executorPool");
        this.zzs = zzfvVar2;
        Executor executor = (Executor) zzfvVar2.zza();
        Trace.checkNotNull(executor, "executor");
        this.zzr = executor;
        zzfv zzfvVar3 = zzccdVar.zze;
        Trace.checkNotNull(zzfvVar3, "offloadExecutorPool");
        zzayv zzayvVar = new zzayv(zzfvVar3);
        this.zzu = zzayvVar;
        this.zzp = new zzbvf(zzchlVar, zzayvVar);
        this.zzq = new zzcbt(zzchlVar.zzb);
        zzbvj zzbvjVar = new zzbvj(zzbraVar, zzcgmVar.zza(), Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(str.length() + 14), "Channel for '", str, "'"));
        this.zzT = zzbvjVar;
        this.zzU = new zzbvi(zzbvjVar, zzcgmVar);
        zzcdt zzcdtVar = zzbzg.zzk;
        this.zzad = true;
        Logger logger = zzbsa.zza;
        synchronized (zzbsa.class) {
            try {
                Throwable th2 = null;
                if (zzbsa.zzb == null) {
                    zzbrx.class.getClassLoader();
                    List zza2 = zzey.zza(zzbrx.class, Collections.singletonList(zzcdp.class.getDeclaredConstructor(null).newInstance(null)).iterator(), new Supplier() { // from class: com.google.android.libraries.places.internal.zzbrz
                        @Override // com.google.common.base.Supplier
                        public final Object get() {
                            Logger logger2 = zzbsa.zza;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                boolean z = zzcdp.zza;
                                arrayList2.add(zzcdp.class);
                            } catch (ClassNotFoundException e) {
                                zzbsa.zza.logp(Level.WARNING, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find pick-first LoadBalancer", (Throwable) e);
                            }
                            try {
                                int i = zzclc.$r8$clinit;
                                arrayList2.add(zzclc.class);
                            } catch (ClassNotFoundException e2) {
                                zzbsa.zza.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find round-robin LoadBalancer", (Throwable) e2);
                            }
                            return Collections.unmodifiableList(arrayList2);
                        }
                    }, new zzbry());
                    zzbsa.zzb = new zzbsa();
                    Iterator it = zza2.iterator();
                    while (it.hasNext()) {
                        zzbrx zzbrxVar = (zzbrx) it.next();
                        Throwable th3 = th2;
                        Iterator it2 = it;
                        zzbsa.zza.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(zzbrxVar)));
                        zzbsa zzbsaVar2 = zzbsa.zzb;
                        synchronized (zzbsaVar2) {
                            zzbrxVar.getClass();
                            zzbsaVar2.zzc.add(zzbrxVar);
                        }
                        th2 = th3;
                        it = it2;
                    }
                    th = th2;
                    zzbsa.zzb.zze();
                } else {
                    th = null;
                }
                zzbsaVar = zzbsa.zzb;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        zzbvb zzbvbVar = new zzbvb(zzbsaVar);
        this.zzo = zzbvbVar;
        Trace.checkNotNull(zzcguVar, "targetUri");
        this.zzl = zzcguVar;
        Trace.checkNotNull(zzbtgVar, "nameResolverProvider");
        this.zzm = zzbtgVar;
        zzcfr zzcfrVar = new zzcfr(this.zzad, zzbvbVar);
        zzfv zzfvVar4 = new zzfv(zzccdVar.zzo, zzbsu.zza());
        this.zzah = zzfvVar4;
        zzbsx zzbsxVar = new zzbsx();
        int i = zzccdVar.zzw.zza.zzl;
        int i2 = i - 1;
        if (i == 0) {
            throw th;
        }
        if (i2 != 0) {
            a$$ExternalSyntheticBUOutline0.m$1((Object) "TLS not handled");
            throw th;
        }
        zzbsxVar.zza = 443;
        zzcdtVar.getClass();
        zzbsxVar.zzb = zzcdtVar;
        zzbuf zzbufVar = this.zze;
        zzbufVar.getClass();
        zzbsxVar.zzc = zzbufVar;
        zzcbt zzcbtVar = this.zzq;
        zzcbtVar.getClass();
        zzbsxVar.zze = zzcbtVar;
        zzbsxVar.zzd = zzcfrVar;
        zzbvi zzbviVar = this.zzU;
        zzbviVar.getClass();
        zzbsxVar.zzf = zzbviVar;
        zzbsxVar.zzg = this.zzu;
        zzbsxVar.zzh = zzfvVar4;
        zzbsxVar.zzi = zzccdVar.zzf;
        zzbsy zzbsyVar = new zzbsy(zzbsxVar);
        this.zzn = zzbsyVar;
        this.zzD = zzf(zzcguVar, zzbtgVar, zzbsyVar);
        this.zzt = new zzayv(zzfvVar);
        zzbxg zzbxgVar = new zzbxg(this.zzr, this.zze);
        this.zzK = zzbxgVar;
        zzbxgVar.zzaq(this.zzae);
        this.zzZ = true;
        zzcbs zzcbsVar = new zzcbs(this, this.zzD.zzb$1.zza());
        this.zzW = zzcbsVar;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            zzcbsVar = new zzbpc(zzcbsVar, (zzayi) it3.next());
        }
        this.zzA = zzcbsVar;
        this.zzB = new ArrayList(zzccdVar.zzg);
        Trace.checkNotNull(supplier, "stopwatchSupplier");
        this.zzx = supplier;
        long j = zzccdVar.zzm;
        if (j == -1) {
            this.zzy = -1L;
        } else {
            Trace.checkArgument(j, "invalid idleTimeoutMillis %s", j >= zzccd.zzb);
            this.zzy = zzccdVar.zzm;
        }
        this.zzag = new zzceb(new zzmu(this, 8), this.zze, this.zzp.zza.zzb, new Stopwatch());
        zzbqb zzbqbVar = zzccdVar.zzk;
        Trace.checkNotNull(zzbqbVar, "decompressorRegistry");
        this.zzw = zzbqbVar;
        Trace.checkNotNull(zzccdVar.zzl, "compressorRegistry");
        this.zzC = zzccdVar.zzi;
        this.zzac = 16777216L;
        this.zzab = 1048576L;
        this.zzR = new zzcar(this, zzcgmVar);
        this.zzS = new zzyr(zzcgmVar);
        zzbqr zzbqrVar = zzccdVar.zzn;
        zzbqrVar.getClass();
        this.zzV = zzbqrVar;
    }

    public static zzcfq zzf(zzcgu zzcguVar, zzbtg zzbtgVar, zzbsy zzbsyVar) {
        zzbtf zza2 = zzcguVar.zza(zzbtgVar, zzbsyVar);
        if (zza2 == null) {
            a$$ExternalSyntheticBUOutline0.m$3("cannot create a NameResolver for ".concat(String.valueOf(zzcguVar)));
            return null;
        }
        new zzbyk();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) zzbsyVar.zze;
        if (scheduledExecutorService != null) {
            return new zzcfq(zza2, new zzbvd(scheduledExecutorService, (zzbuf) zzbsyVar.zzc));
        }
        a$$ExternalSyntheticBUOutline0.m$1("ScheduledExecutorService not set in Builder");
        return null;
    }

    public final String toString() {
        Response stringHelper = Ascii.toStringHelper(this);
        stringHelper.add(this.zzj.zzd, "logId");
        stringHelper.add(this.zzk, "target");
        return stringHelper.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbow
    public final zzbpa zza(Schema schema, zzbov zzbovVar) {
        return this.zzA.zza(schema, zzbovVar);
    }

    public final void zzao(boolean z) {
        this.zze.zzc();
        if (z) {
            Trace.checkState("nameResolver is not started", this.zzE);
            Trace.checkState("lbHelper is null", this.zzF != null);
        }
        zzcfq zzcfqVar = this.zzD;
        if (zzcfqVar != null) {
            zzcfqVar.zzc();
            this.zzE = false;
            if (z) {
                this.zzD = zzf(this.zzl, this.zzm, this.zzn);
            } else {
                this.zzD = null;
            }
        }
        zzcbg zzcbgVar = this.zzF;
        if (zzcbgVar != null) {
            zzcbgVar.zza.zzc();
            this.zzF = null;
        }
    }

    public final void zzap() {
        long j;
        long j2 = this.zzy;
        if (j2 == -1) {
            return;
        }
        zzceb zzcebVar = this.zzag;
        zzcebVar.getClass();
        long nanos = TimeUnit.MILLISECONDS.toNanos(j2);
        Stopwatch stopwatch = zzcebVar.zzd;
        if (stopwatch.isRunning) {
            stopwatch.ticker.getClass();
            j = System.nanoTime() - stopwatch.startTick;
        } else {
            j = 0;
        }
        long j3 = j + nanos;
        int i = 1;
        zzcebVar.zzf = true;
        if (j3 - zzcebVar.zze < 0 || zzcebVar.zzg == null) {
            ScheduledFuture scheduledFuture = zzcebVar.zzg;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            zzcebVar.zzg = zzcebVar.zza.schedule(new zzcdz(zzcebVar, i), nanos, TimeUnit.NANOSECONDS);
        }
        zzcebVar.zze = j3;
    }

    @Override // com.google.android.libraries.places.internal.zzbow
    public final String zzb() {
        return this.zzA.zzb();
    }

    @Override // com.google.android.libraries.places.internal.zzbqz
    public final zzbra zzc() {
        return this.zzj;
    }

    public final void zze() {
        this.zze.zzc();
        if (this.zzM.get() || this.zzG) {
            return;
        }
        if (((zzbzl) this.zzf).zza.isEmpty()) {
            zzap();
        } else {
            this.zzag.zzf = false;
        }
        if (this.zzF == null) {
            this.zzU.zza(2, "Exiting idle mode");
            zzcbg zzcbgVar = new zzcbg(this);
            zzcbgVar.zza = new zzbva(this.zzo, zzcbgVar);
            this.zzF = zzcbgVar;
            this.zzz.zza(zzbpq.zza);
            this.zzD.zzb(new zzcbi(this, zzcbgVar, this.zzD));
            this.zzE = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzh(Throwable th) {
        zzbpq zzbpqVar = zzbpq.zzc;
        zzbwh zzbwhVar = this.zzz;
        zzbvi zzbviVar = this.zzU;
        zzcbs zzcbsVar = this.zzW;
        zzbxg zzbxgVar = this.zzK;
        if (this.zzG) {
            return;
        }
        this.zzG = true;
        try {
            zzceb zzcebVar = this.zzag;
            zzcebVar.zzf = false;
            ScheduledFuture scheduledFuture = zzcebVar.zzg;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                zzcebVar.zzg = null;
            }
            zzao(false);
        } finally {
            zzbtx zzd2 = zzbtx.zzh.zze("Panic! This is a bug!").zzd(th);
            zzbro zzbroVar = zzbro.zza;
            Trace.checkArgument("drop status shouldn't be OK", !zzd2.zzj());
            zzbxgVar.zzg(new zzbrl(new zzbro(null, zzd2, true)));
            zzcbsVar.zzc(null);
            zzbviVar.zza(4, "PANIC! Entering TRANSIENT_FAILURE");
            zzbwhVar.zza(zzbpqVar);
        }
    }

    public final void zzq() {
        if (!this.zzP && this.zzM.get() && this.zzH.isEmpty()) {
            this.zzU.zza(2, "Terminated");
            this.zzs.zzb(this.zzr);
            zzayv zzayvVar = this.zzt;
            synchronized (zzayvVar) {
                Executor executor = (Executor) zzayvVar.zzb;
                if (executor != null) {
                    ((zzfv) zzayvVar.zza).zzb(executor);
                    zzayvVar.zzb = null;
                }
            }
            zzayv zzayvVar2 = this.zzu;
            synchronized (zzayvVar2) {
                Executor executor2 = (Executor) zzayvVar2.zzb;
                if (executor2 != null) {
                    ((zzfv) zzayvVar2.zza).zzb(executor2);
                    zzayvVar2.zzb = null;
                }
            }
            this.zzp.close();
            this.zzP = true;
            this.zzQ.countDown();
        }
    }
}
