package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class zzbxe implements zzbvr {
    public final /* synthetic */ zzbxg zza;
    public final zzcdq zzb;
    public volatile boolean zzb$1;
    public final zzbpv zzc;
    public zzbvt zzc$1;
    public final zzbph[] zzd;
    public zzbvr zzd$1;
    public volatile zzbtx zze;
    public zzbtx zze$1;
    public zzbxx zzg;
    public long zzh;
    public long zzi;
    public List zzf = new ArrayList();
    public ArrayList zzj = new ArrayList();
    public final String zza$1 = "connecting_and_lb";

    public zzbxe(zzbxg zzbxgVar, zzcdq zzcdqVar, zzbph[] zzbphVarArr) {
        this.zza = zzbxgVar;
        Logger logger = zzbpv.zza;
        zzbpv zzc = zzbpt.zza.zzc();
        this.zzc = zzc == null ? zzbpv.zzb : zzc;
        this.zzb = zzcdqVar;
        this.zzd = zzbphVarArr;
    }

    @Override // com.google.android.libraries.places.internal.zzbvr
    public final void zza(zzbpy zzbpyVar) {
        Trace.checkState("May only be called before start", this.zzc$1 == null);
        this.zzj.add(new com.google.android.gms.tasks.zzc(23, this, zzbpyVar));
    }

    @Override // com.google.android.libraries.places.internal.zzbvr
    public final void zzb(int i) {
        Trace.checkState("May only be called before start", this.zzc$1 == null);
        this.zzj.add(new zzbxh(this, i, 2));
    }

    @Override // com.google.android.libraries.places.internal.zzbvr
    public final void zzc(int i) {
        Trace.checkState("May only be called before start", this.zzc$1 == null);
        this.zzj.add(new zzbxh(this, i, 1));
    }

    @Override // com.google.android.libraries.places.internal.zzbvr
    public final void zzd(zzbqb zzbqbVar) {
        Trace.checkState("May only be called before start", this.zzc$1 == null);
        Trace.checkNotNull(zzbqbVar, "decompressorRegistry");
        this.zzj.add(new com.google.android.gms.tasks.zzc(22, this, zzbqbVar));
    }

    @Override // com.google.android.libraries.places.internal.zzbvr
    public final void zzf(zzbvt zzbvtVar) {
        zzbtx zzbtxVar;
        boolean z;
        Trace.checkNotNull(zzbvtVar, "listener");
        Trace.checkState("already started", this.zzc$1 == null);
        synchronized (this) {
            try {
                zzbtxVar = this.zze$1;
                z = this.zzb$1;
                if (!z) {
                    zzbxx zzbxxVar = new zzbxx(zzbvtVar);
                    this.zzg = zzbxxVar;
                    zzbvtVar = zzbxxVar;
                }
                this.zzc$1 = zzbvtVar;
                this.zzh = System.nanoTime();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zzbtxVar != null) {
            zzbvtVar.zzc(zzbtxVar, zzbvs.zza, new zzbsn());
            return;
        }
        if (z) {
            Iterator it = this.zzj.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.zzj = null;
            this.zzd$1.zzf(zzbvtVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005f, code lost:
    
        if (r0.hasNext() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0057, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzg() {
        zzbxx zzbxxVar;
        List list;
        List list2;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (this) {
                if (this.zzf.isEmpty()) {
                    break;
                }
                list2 = this.zzf;
                this.zzf = arrayList;
            }
            if (zzbxxVar != null) {
                return;
            }
            List arrayList2 = new ArrayList();
            while (true) {
                synchronized (zzbxxVar) {
                    try {
                        if (zzbxxVar.zzc.isEmpty()) {
                            zzbxxVar.zzc = null;
                            zzbxxVar.zzb = true;
                            return;
                        } else {
                            list = zzbxxVar.zzc;
                            zzbxxVar.zzc = arrayList2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                list.clear();
                arrayList2 = list;
            }
            list2.clear();
            arrayList = list2;
        }
        this.zzf = null;
        this.zzb$1 = true;
        zzbxxVar = this.zzg;
        if (zzbxxVar != null) {
        }
    }

    public final void zzh(Runnable runnable) {
        Trace.checkState("May only be called after start", this.zzc$1 != null);
        synchronized (this) {
            try {
                if (this.zzb$1) {
                    runnable.run();
                } else {
                    this.zzf.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbvr
    public final void zzk() {
        Trace.checkState("May only be called after start", this.zzc$1 != null);
        zzh(new zzbxi(this, 3));
    }

    @Override // com.google.android.libraries.places.internal.zzbvr
    public final void zzl(zzbtx zzbtxVar) {
        int i = 0;
        boolean z = true;
        Trace.checkState("May only be called after start", this.zzc$1 != null);
        Trace.checkNotNull(zzbtxVar, "reason");
        synchronized (this) {
            try {
                zzbvr zzbvrVar = this.zzd$1;
                if (zzbvrVar == null) {
                    zzccu zzccuVar = zzccu.zza;
                    if (zzbvrVar != null) {
                        z = false;
                    }
                    Trace.checkState("realStream already set to %s", zzbvrVar, z);
                    this.zzd$1 = zzccuVar;
                    this.zzi = System.nanoTime();
                    this.zze$1 = zzbtxVar;
                    z = false;
                }
            } finally {
            }
        }
        if (z) {
            zzh(new com.google.android.gms.tasks.zzc(25, this, zzbtxVar));
        } else {
            zzg();
            while (true) {
                zzbph[] zzbphVarArr = this.zzd;
                if (i >= zzbphVarArr.length) {
                    break;
                }
                zzbph zzbphVar = zzbphVarArr[i];
                i++;
            }
            this.zzc$1.zzc(zzbtxVar, zzbvs.zza, new zzbsn());
        }
        zzbxg zzbxgVar = this.zza;
        synchronized (zzbxgVar.zzb) {
            try {
                if (zzbxgVar.zzg != null) {
                    boolean remove = zzbxgVar.zzi.remove(this);
                    if (!zzbxgVar.zzf() && remove) {
                        zzbxgVar.zzd.zzb(zzbxgVar.zzf);
                        if (((zzbtx) zzbxgVar.zzj.zbb) != null) {
                            zzbxgVar.zzd.zzb(zzbxgVar.zzg);
                            zzbxgVar.zzg = null;
                        }
                    }
                }
            } finally {
            }
        }
        this.zza.zzd.zza();
    }

    @Override // com.google.android.libraries.places.internal.zzcgi
    public final boolean zzm() {
        if (this.zzb$1) {
            return this.zzd$1.zzm();
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzbvr
    public final void zzn(zzbzm zzbzmVar) {
        if (this.zzb.zza.zzk()) {
            zzbzmVar.zza.add("wait_for_ready");
            zzbtx zzbtxVar = this.zze;
            if (zzbtxVar != null && !zzbtxVar.zzj()) {
                zzbzmVar.zzb(zzbtxVar, "Last Pick Failure");
            }
        }
        synchronized (this) {
            try {
                if (this.zzc$1 == null) {
                    return;
                }
                zzbvr zzbvrVar = this.zzd$1;
                String str = this.zza$1;
                if (zzbvrVar != null) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6);
                    sb.append(str);
                    sb.append("_delay");
                    String sb2 = sb.toString();
                    long j = this.zzi - this.zzh;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(j).length() + 2);
                    sb3.append(j);
                    sb3.append("ns");
                    zzbzmVar.zzb(sb3.toString(), sb2);
                    this.zzd$1.zzn(zzbzmVar);
                } else {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 6);
                    sb4.append(str);
                    sb4.append("_delay");
                    String sb5 = sb4.toString();
                    long nanoTime = System.nanoTime() - this.zzh;
                    StringBuilder sb6 = new StringBuilder(String.valueOf(nanoTime).length() + 2);
                    sb6.append(nanoTime);
                    sb6.append("ns");
                    zzbzmVar.zzb(sb6.toString(), sb5);
                    zzbzmVar.zza.add("was_still_waiting");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzbxi zzo(zzbvr zzbvrVar) {
        synchronized (this) {
            try {
                if (this.zzd$1 != null) {
                    return null;
                }
                Trace.checkNotNull(zzbvrVar, "stream");
                zzbvr zzbvrVar2 = this.zzd$1;
                Trace.checkState("realStream already set to %s", zzbvrVar2, zzbvrVar2 == null);
                this.zzd$1 = zzbvrVar;
                this.zzi = System.nanoTime();
                zzbvt zzbvtVar = this.zzc$1;
                if (zzbvtVar == null) {
                    this.zzf = null;
                    this.zzb$1 = true;
                }
                if (zzbvtVar == null) {
                    return null;
                }
                Iterator it = this.zzj.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                this.zzj = null;
                this.zzd$1.zzf(zzbvtVar);
                return new zzbxi(this, 1);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcgi
    public final void zzr() {
        Trace.checkState("May only be called before start", this.zzc$1 == null);
        this.zzj.add(new zzbxi(this, 0));
    }

    @Override // com.google.android.libraries.places.internal.zzcgi
    public final void zzs(int i) {
        Trace.checkState("May only be called after start", this.zzc$1 != null);
        if (this.zzb$1) {
            this.zzd$1.zzs(i);
        } else {
            zzh(new zzbxh(this, i, 0));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcgi
    public final void zzt(zzcjz zzcjzVar) {
        Trace.checkState("May only be called after start", this.zzc$1 != null);
        if (this.zzb$1) {
            this.zzd$1.zzt(zzcjzVar);
        } else {
            zzh(new com.google.android.gms.tasks.zzc(24, this, zzcjzVar));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcgi
    public final void zzu() {
        Trace.checkState("May only be called after start", this.zzc$1 != null);
        if (this.zzb$1) {
            this.zzd$1.zzu();
        } else {
            zzh(new zzbxi(this, 2));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcgi
    public final void zzv(zzbpl zzbplVar) {
        Trace.checkState("May only be called before start", this.zzc$1 == null);
        Trace.checkNotNull(zzbplVar, "compressor");
        this.zzj.add(new com.google.android.gms.tasks.zzc(21, this, zzbplVar));
    }
}
