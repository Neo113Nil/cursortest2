package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import coil3.request.ViewTargetDisposable;
import com.google.mlkit.common.sdkinternal.zzb;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import net.oneformapp.schema.Schema;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class zzcax implements zzbvr {
    public static final Random zzD;
    public static final boolean zzE;
    public static final zzbtx zza$1;
    public static final zzbsh zze;
    public static final zzbsh zzf;
    public long zzA;
    public zzbtx zzB;
    public boolean zzC;
    public final /* synthetic */ Schema zza;
    public final /* synthetic */ zzbov zzb;
    public final Schema zzb$1;
    public final /* synthetic */ zzbpv zzc;
    public final Executor zzc$1;
    public final /* synthetic */ ViewTargetDisposable zzd;
    public final zzbuf zzd$1;
    public final ScheduledExecutorService zzg;
    public final zzbsn zzh;
    public final zzcfm zzi;
    public final zzbzh zzj;
    public final boolean zzk;
    public final Object zzl;
    public final zzceu zzm;
    public final long zzn;
    public final long zzo;
    public final zzcfk zzp;
    public final zzbzm zzq;
    public volatile zzcfa zzr;
    public final AtomicBoolean zzs;
    public final AtomicInteger zzt;
    public final AtomicInteger zzu;
    public com.google.android.gms.maps.zzah zzv;
    public long zzw;
    public zzbvt zzx;
    public zzcaf zzy;
    public zzcaf zzz;

    static {
        zzbsg zzbsgVar = zzbsn.zza;
        BitSet bitSet = zzbsj.zzb;
        zze = new zzbsh("grpc-previous-rpc-attempts", zzbsgVar);
        zzf = new zzbsh("grpc-retry-pushback-ms", zzbsgVar);
        zza$1 = zzbtx.zzb.zze("Stream thrown away because RetriableStream committed");
        zzD = new Random();
        Logger logger = zzbzg.zzp;
        zzE = zzbqe.zzb("GRPC_EXPERIMENTAL_XDS_RLS_LB", true);
    }

    public zzcax(ViewTargetDisposable viewTargetDisposable, Schema schema, zzbsn zzbsnVar, zzbov zzbovVar, zzcfm zzcfmVar, zzbzh zzbzhVar, zzbpv zzbpvVar) {
        this.zza = schema;
        this.zzb = zzbovVar;
        this.zzc = zzbpvVar;
        Objects.requireNonNull(viewTargetDisposable);
        this.zzd = viewTargetDisposable;
        zzcby zzcbyVar = (zzcby) viewTargetDisposable.view;
        zzceu zzceuVar = zzcbyVar.zzaa;
        long j = zzcbyVar.zzab;
        long j2 = zzcbyVar.zzac;
        Executor executor = zzbovVar.zzc;
        executor = executor == null ? zzcbyVar.zzr : executor;
        ScheduledExecutorService scheduledExecutorService = zzcbyVar.zzp.zza.zzb;
        zzcfk zzcfkVar = (zzcfk) viewTargetDisposable.job;
        this.zzd$1 = new zzbuf(new zzcec());
        this.zzl = new Object();
        this.zzq = new zzbzm();
        this.zzr = new zzcfa(new ArrayList(8), Collections.EMPTY_LIST, null, null, false, false, false, 0);
        this.zzs = new AtomicBoolean();
        this.zzt = new AtomicInteger();
        this.zzu = new AtomicInteger();
        this.zzb$1 = schema;
        this.zzm = zzceuVar;
        this.zzn = j;
        this.zzo = j2;
        this.zzc$1 = executor;
        this.zzg = scheduledExecutorService;
        this.zzh = zzbsnVar;
        this.zzi = zzcfmVar;
        if (zzcfmVar != null) {
            this.zzA = zzcfmVar.zzb;
        }
        this.zzj = zzbzhVar;
        Trace.checkArgument("Should not provide both retryPolicy and hedgingPolicy", zzcfmVar == null || zzbzhVar == null);
        this.zzk = zzbzhVar != null;
        this.zzp = zzcfkVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbvr
    public final void zza(zzbpy zzbpyVar) {
        zzai(new zzcef(this, zzbpyVar, 1));
    }

    public final zzcee zzaf(zzcfj zzcfjVar) {
        List list;
        boolean z;
        Collection collection;
        Future future;
        Future future2;
        synchronized (this.zzl) {
            try {
                if (this.zzr.zzf != null) {
                    return null;
                }
                Collection collection2 = this.zzr.zzc;
                zzcfa zzcfaVar = this.zzr;
                Trace.checkState("Already committed", zzcfaVar.zzf == null);
                List list2 = zzcfaVar.zzb;
                if (zzcfaVar.zzc.contains(zzcfjVar)) {
                    list = null;
                    collection = Collections.singleton(zzcfjVar);
                    z = true;
                } else {
                    list = list2;
                    z = false;
                    collection = Collections.EMPTY_LIST;
                }
                this.zzr = new zzcfa(list, collection, zzcfaVar.zzd, zzcfjVar, zzcfaVar.zzg, z, zzcfaVar.zzh, zzcfaVar.zze);
                this.zzm.zza.addAndGet(-this.zzw);
                zzcaf zzcafVar = this.zzy;
                boolean z2 = zzcafVar == null;
                boolean z3 = zzcafVar != null ? zzcafVar.zzb : false;
                boolean z4 = z2;
                boolean z5 = !z4;
                if (z4) {
                    future = null;
                } else {
                    zzcafVar.zzb = true;
                    future = (Future) zzcafVar.zzc;
                    this.zzy = null;
                }
                zzcaf zzcafVar2 = this.zzz;
                if (zzcafVar2 != null) {
                    zzcafVar2.zzb = true;
                    Future future3 = (Future) zzcafVar2.zzc;
                    this.zzz = null;
                    future2 = future3;
                } else {
                    future2 = null;
                }
                return new zzcee(this, collection2, zzcfjVar, z5, future, z3, future2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzcfj zzag(int i, boolean z, boolean z2) {
        AtomicInteger atomicInteger;
        int i2;
        do {
            atomicInteger = this.zzu;
            i2 = atomicInteger.get();
            if (i2 < 0) {
                return null;
            }
        } while (!atomicInteger.compareAndSet(i2, i2 + 1));
        zzcfj zzcfjVar = new zzcfj(i);
        zzcep zzcepVar = new zzcep(this, new zzcet(this, zzcfjVar));
        zzbsn zzbsnVar = new zzbsn();
        zzbsnVar.zzf(this.zzh);
        if (i > 0) {
            zzbsnVar.zzc(zze, String.valueOf(i));
        }
        zzbov zzbovVar = this.zzb;
        zzbovVar.getClass();
        List list = zzbovVar.zze;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(zzcepVar);
        zzbot zzp = zzbov.zzp(zzbovVar);
        zzp.zzd = Collections.unmodifiableList(arrayList);
        zzbov zzbovVar2 = new zzbov(zzp);
        zzbph[] zzf2 = zzbzg.zzf(zzbovVar2, zzbsnVar, i, z, z2);
        zzbpv zzbpvVar = this.zzc;
        zzbpv zzb = zzbpvVar.zzb();
        try {
            zzbvr zzb2 = ((zzcby) this.zzd.view).zzK.zzb(this.zza, zzbsnVar, zzbovVar2, zzf2);
            zzbpvVar.zzc(zzb);
            zzcfjVar.zza = zzb2;
            return zzcfjVar;
        } catch (Throwable th) {
            zzbpvVar.zzc(zzb);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        r9 = r9.zzd$1;
        r9.zzb(r1);
        r9.zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if (r4 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        r10.zza.zzf(new com.google.android.filament.Box(r9, r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        r0 = r10.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (r9.zzr.zzf != r10) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        r9 = r9.zzB;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        r0.zzl(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        r9 = com.google.android.libraries.places.internal.zzcax.zza$1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        r2 = r3.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:
    
        if (r5 >= r2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
    
        r7 = (com.google.android.libraries.places.internal.zzces) r3.get(r5);
        r7.zza(r10);
        r4 = r4 | (r7 instanceof com.google.android.libraries.places.internal.zzcez);
        r7 = r9.zzr;
        r8 = r7.zzf;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009f, code lost:
    
        if (r8 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a1, code lost:
    
        if (r8 != r10) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a3, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a7, code lost:
    
        if (r7.zzg == false) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzah(zzcfj zzcfjVar) {
        int min;
        zzmu zzmuVar = null;
        int i = 0;
        boolean z = false;
        ArrayList arrayList = null;
        while (true) {
            synchronized (this.zzl) {
                try {
                    zzcfa zzcfaVar = this.zzr;
                    zzcfj zzcfjVar2 = zzcfaVar.zzf;
                    if (zzcfjVar2 == null || zzcfjVar2 == zzcfjVar) {
                        if (!zzcfaVar.zzg) {
                            List list = zzcfaVar.zzb;
                            if (i == list.size()) {
                                this.zzr = zzcfaVar.zza(zzcfjVar);
                                if (!zzm()) {
                                    return;
                                } else {
                                    zzmuVar = new zzmu(this, 14);
                                }
                            } else {
                                if (zzcfjVar.zzb) {
                                    return;
                                }
                                min = Math.min(i + 128, list.size());
                                if (arrayList == null) {
                                    arrayList = new ArrayList(list.subList(i, min));
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(list.subList(i, min));
                                }
                            }
                        }
                    }
                } finally {
                }
            }
            i = min;
        }
    }

    public final void zzai(zzces zzcesVar) {
        Collection collection;
        synchronized (this.zzl) {
            try {
                if (!this.zzr.zza) {
                    this.zzr.zzb.add(zzcesVar);
                }
                collection = this.zzr.zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zzcesVar.zza((zzcfj) it.next());
        }
    }

    public final boolean zzaj(zzcfa zzcfaVar) {
        return zzcfaVar.zzf == null && zzcfaVar.zze < this.zzj.zza && !zzcfaVar.zzh;
    }

    public final void zzak() {
        Future future;
        synchronized (this.zzl) {
            try {
                zzcaf zzcafVar = this.zzz;
                future = null;
                if (zzcafVar != null) {
                    zzcafVar.zzb = true;
                    Future future2 = (Future) zzcafVar.zzc;
                    this.zzz = null;
                    future = future2;
                }
                zzcfa zzcfaVar = this.zzr;
                if (!zzcfaVar.zzh) {
                    zzcfaVar = new zzcfa(zzcfaVar.zzb, zzcfaVar.zzc, zzcfaVar.zzd, zzcfaVar.zzf, zzcfaVar.zzg, zzcfaVar.zza, true, zzcfaVar.zze);
                }
                this.zzr = zzcfaVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    public final void zzal(zzbtx zzbtxVar, zzbvs zzbvsVar, zzbsn zzbsnVar) {
        this.zzv = new com.google.android.gms.maps.zzah(21, zzbtxVar, zzbvsVar, zzbsnVar);
        if (this.zzu.addAndGet(PKIFailureInfo.systemUnavail) == Integer.MIN_VALUE) {
            zzbuo zzbuoVar = new zzbuo(this, zzbtxVar, zzbvsVar, zzbsnVar, 2);
            zzbuf zzbufVar = this.zzd$1;
            zzbufVar.zzb(zzbuoVar);
            zzbufVar.zza();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbvr
    public final void zzb(int i) {
        zzai(new zzcek(this, i, 1));
    }

    @Override // com.google.android.libraries.places.internal.zzbvr
    public final void zzc(int i) {
        zzai(new zzcek(this, i, 0));
    }

    @Override // com.google.android.libraries.places.internal.zzbvr
    public final void zzd(zzbqb zzbqbVar) {
        zzai(new zzcef(this, zzbqbVar, 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0066, code lost:
    
        if ((r3.zzd.get() > r3.zzb) != false) goto L35;
     */
    @Override // com.google.android.libraries.places.internal.zzbvr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(zzbvt zzbvtVar) {
        zzbtx zzbtxVar;
        zzcaf zzcafVar;
        this.zzx = zzbvtVar;
        zzyr zzyrVar = ((zzcby) this.zzd.view).zzL;
        synchronized (zzyrVar.zzc) {
            try {
                zzbtxVar = (zzbtx) zzyrVar.zze;
                zzcafVar = null;
                if (zzbtxVar == null) {
                    ((HashSet) zzyrVar.zzd).add(this);
                    zzbtxVar = null;
                }
            } finally {
            }
        }
        if (zzbtxVar != null) {
            zzl(zzbtxVar);
            return;
        }
        synchronized (this.zzl) {
            this.zzr.zzb.add(new zzcez(this));
        }
        zzcfj zzag = zzag(0, false, false);
        if (zzag == null) {
            return;
        }
        if (this.zzk) {
            Object obj = this.zzl;
            synchronized (obj) {
                try {
                    this.zzr = this.zzr.zzc(zzag);
                    if (zzaj(this.zzr)) {
                        zzcfk zzcfkVar = this.zzp;
                        if (zzcfkVar != null) {
                        }
                        zzcafVar = new zzcaf(obj);
                        this.zzz = zzcafVar;
                    }
                } finally {
                }
            }
            if (zzcafVar != null) {
                zzcafVar.zza(this.zzg.schedule(new zzb(this, zzcafVar), this.zzj.zzb, TimeUnit.NANOSECONDS));
            }
        }
        zzah(zzag);
    }

    public final void zzi(Object obj) {
        zzcfa zzcfaVar = this.zzr;
        if (zzcfaVar.zza) {
            zzcfaVar.zzf.zza.zzt(this.zzb$1.zze(obj));
        } else {
            zzai(new zzceo(this, obj));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbvr
    public final void zzk() {
        zzai(new zzcei(1));
    }

    @Override // com.google.android.libraries.places.internal.zzbvr
    public final void zzl(zzbtx zzbtxVar) {
        zzcfj zzcfjVar;
        zzcfj zzcfjVar2 = new zzcfj(0);
        zzcfjVar2.zza = new zzccu();
        zzcee zzaf = zzaf(zzcfjVar2);
        Object obj = this.zzl;
        if (zzaf != null) {
            synchronized (obj) {
                this.zzr = this.zzr.zza(zzcfjVar2);
            }
            zzaf.run();
            zzal(zzbtxVar, zzbvs.zza, new zzbsn());
            return;
        }
        synchronized (obj) {
            try {
                if (this.zzr.zzc.contains(this.zzr.zzf)) {
                    zzcfjVar = this.zzr.zzf;
                } else {
                    this.zzB = zzbtxVar;
                    zzcfjVar = null;
                }
                zzcfa zzcfaVar = this.zzr;
                this.zzr = new zzcfa(zzcfaVar.zzb, zzcfaVar.zzc, zzcfaVar.zzd, zzcfaVar.zzf, true, zzcfaVar.zza, zzcfaVar.zzh, zzcfaVar.zze);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zzcfjVar != null) {
            zzcfjVar.zza.zzl(zzbtxVar);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcgi
    public final boolean zzm() {
        Iterator it = this.zzr.zzc.iterator();
        while (it.hasNext()) {
            if (((zzcfj) it.next()).zza.zzm()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzbvr
    public final void zzn(zzbzm zzbzmVar) {
        zzcfa zzcfaVar;
        synchronized (this.zzl) {
            zzbzmVar.zzb(this.zzq, "closed");
            zzcfaVar = this.zzr;
        }
        zzcfj zzcfjVar = zzcfaVar.zzf;
        if (zzcfjVar != null) {
            zzbzm zzbzmVar2 = new zzbzm();
            zzcfjVar.zza.zzn(zzbzmVar2);
            zzbzmVar.zzb(zzbzmVar2, "committed");
            return;
        }
        zzbzm zzbzmVar3 = new zzbzm();
        for (zzcfj zzcfjVar2 : zzcfaVar.zzc) {
            zzbzm zzbzmVar4 = new zzbzm();
            zzcfjVar2.zza.zzn(zzbzmVar4);
            zzbzmVar3.zza.add(String.valueOf(zzbzmVar4));
        }
        zzbzmVar.zzb(zzbzmVar3, "open");
    }

    @Override // com.google.android.libraries.places.internal.zzcgi
    public final void zzr() {
        zzai(new zzcei(2));
    }

    @Override // com.google.android.libraries.places.internal.zzcgi
    public final void zzs(int i) {
        zzcfa zzcfaVar = this.zzr;
        if (zzcfaVar.zza) {
            zzcfaVar.zzf.zza.zzs(i);
        } else {
            zzai(new zzcek(this, i, 2));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcgi
    public final void zzt(zzcjz zzcjzVar) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // com.google.android.libraries.places.internal.zzcgi
    public final void zzu() {
        zzcfa zzcfaVar = this.zzr;
        if (zzcfaVar.zza) {
            zzcfaVar.zzf.zza.zzu();
        } else {
            zzai(new zzcei(0));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcgi
    public final void zzv(zzbpl zzbplVar) {
        zzai(new zzcef(this, zzbplVar, 0));
    }

    public final void zzy(Integer num) {
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            zzak();
            return;
        }
        Object obj = this.zzl;
        synchronized (obj) {
            try {
                zzcaf zzcafVar = this.zzz;
                if (zzcafVar == null) {
                    return;
                }
                zzcafVar.zzb = true;
                Future future = (Future) zzcafVar.zzc;
                zzcaf zzcafVar2 = new zzcaf(obj);
                this.zzz = zzcafVar2;
                if (future != null) {
                    future.cancel(false);
                }
                zzcafVar2.zza(this.zzg.schedule(new zzb(this, zzcafVar2), num.intValue(), TimeUnit.MILLISECONDS));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
