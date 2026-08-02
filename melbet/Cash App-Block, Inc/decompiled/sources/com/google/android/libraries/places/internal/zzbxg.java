package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import com.google.android.gms.auth.api.zbc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import net.oneformapp.schema.Schema;

/* loaded from: classes4.dex */
public final class zzbxg implements zzcck {
    public final Executor zzc;
    public final zzbuf zzd;
    public zzbxa zze;
    public zzbxa zzf;
    public zzbxa zzg;
    public zzccj zzh;
    public volatile zbc zzj;
    public final zzbra zza = zzbra.zza(zzbxg.class, null);
    public final Object zzb = new Object();
    public Collection zzi = new LinkedHashSet();

    public zzbxg(Executor executor, zzbuf zzbufVar) {
        Object obj = null;
        this.zzj = new zbc(obj, obj, false, 19);
        this.zzc = executor;
        this.zzd = zzbufVar;
    }

    @Override // com.google.android.libraries.places.internal.zzcck
    public final void zzaq(zzccj zzccjVar) {
        this.zzh = zzccjVar;
        this.zze = new zzbxa(this, zzccjVar, 0);
        this.zzf = new zzbxa(this, zzccjVar, 1);
        this.zzg = new zzbxa(this, zzccjVar, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        r4 = new com.google.android.libraries.places.internal.zzbxe(r3, r0, r7);
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (r0.zza.zzk() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if (r5 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r5.zzb != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r5.zzd.zzj() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        r4.zze = r5.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        r3.zzi.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        monitor-enter(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
    
        r5 = r3.zzi.size();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [com.google.android.libraries.places.internal.zzbvr] */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.google.android.libraries.places.internal.zzbym] */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.libraries.places.internal.zzbvr] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.android.libraries.places.internal.zzbxe, java.lang.Object] */
    @Override // com.google.android.libraries.places.internal.zzbvu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzbvr zzb(Schema schema, zzbsn zzbsnVar, zzbov zzbovVar, zzbph[] zzbphVarArr) {
        ?? zzbymVar;
        zzbro zzbroVar;
        zbc zbcVar;
        int i;
        int size;
        try {
            zzgc zzgcVar = new zzgc(11);
            Trace.checkNotNull(zzbphVarArr, "tracers");
            zzcdq zzcdqVar = new zzcdq(schema, zzbsnVar, zzbovVar, zzgcVar);
            zbc zbcVar2 = this.zzj;
            while (true) {
                zzbtx zzbtxVar = (zzbtx) zbcVar2.zbb;
                if (zzbtxVar != null) {
                    zzbymVar = new zzbym(zzbtxVar, zzbvs.zza, zzbphVarArr);
                    break;
                }
                zzbrt zzbrtVar = (zzbrt) zbcVar2.zba;
                if (zzbrtVar != null) {
                    zzbroVar = zzbrtVar.zza(zzcdqVar);
                    zzbov zzbovVar2 = zzcdqVar.zza;
                    zzbvu zze = zzbzg.zze(zzbroVar, zzbovVar2.zzk());
                    if (zze != null) {
                        zzbymVar = zze.zzb(zzcdqVar.zzc, zzcdqVar.zzb, zzbovVar2, zzbphVarArr);
                        break;
                    }
                } else {
                    zzbroVar = null;
                }
                Object obj = this.zzb;
                synchronized (obj) {
                    try {
                        zbcVar = this.zzj;
                        if (zbcVar2 == zbcVar) {
                            break;
                        }
                    } finally {
                    }
                }
                if (size == 1) {
                    this.zzd.zzb(this.zze);
                }
                for (zzbph zzbphVar : zzbphVarArr) {
                }
                zbcVar2 = zbcVar;
            }
            this.zzd.zza();
            return zzbymVar;
        } catch (Throwable th) {
            this.zzd.zza();
            throw th;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbqz
    public final zzbra zzc() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzcck
    public final void zzd(zzbtx zzbtxVar) {
        zzbxa zzbxaVar;
        synchronized (this.zzb) {
            try {
                if (((zzbtx) this.zzj.zbb) != null) {
                    return;
                }
                this.zzj = new zbc(this.zzj.zba, (Object) zzbtxVar, false, 19);
                zzbuf zzbufVar = this.zzd;
                zzbufVar.zzb(new com.google.android.gms.tasks.zzc(20, this, zzbtxVar));
                if (!zzf() && (zzbxaVar = this.zzg) != null) {
                    zzbufVar.zzb(zzbxaVar);
                    this.zzg = null;
                }
                this.zzd.zza();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcck
    public final void zze(zzbtx zzbtxVar) {
        Collection<zzbxe> collection;
        zzbxa zzbxaVar;
        zzd(zzbtxVar);
        synchronized (this.zzb) {
            try {
                collection = this.zzi;
                zzbxaVar = this.zzg;
                this.zzg = null;
                if (!collection.isEmpty()) {
                    this.zzi = Collections.EMPTY_LIST;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zzbxaVar != null) {
            for (zzbxe zzbxeVar : collection) {
                zzbxi zzo = zzbxeVar.zzo(new zzbym(zzbtxVar, zzbvs.zzb, zzbxeVar.zzd));
                if (zzo != null) {
                    zzo.zza.zzg();
                }
            }
            zzbuf zzbufVar = this.zzd;
            zzbufVar.zzb(zzbxaVar);
            zzbufVar.zza();
        }
    }

    public final boolean zzf() {
        boolean z;
        synchronized (this.zzb) {
            z = !this.zzi.isEmpty();
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzg(zzbrt zzbrtVar) {
        zzbxa zzbxaVar;
        synchronized (this.zzb) {
            this.zzj = new zbc((Object) zzbrtVar, this.zzj.zbb, (boolean) (0 == true ? 1 : 0), 19);
            if (zzbrtVar != null && zzf()) {
                ArrayList arrayList = new ArrayList(this.zzi);
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    zzbxe zzbxeVar = (zzbxe) arrayList.get(i);
                    zzbro zza = zzbrtVar.zza(zzbxeVar.zzb);
                    zzbov zzbovVar = zzbxeVar.zzb.zza;
                    if (zzbovVar.zzk() && (zza.zzb != null || !zza.zzd.zzj())) {
                        zzbxeVar.zze = zza.zzd;
                    }
                    zzbvu zze = zzbzg.zze(zza, zzbovVar.zzk());
                    if (zze != null) {
                        Executor executor = this.zzc;
                        Executor executor2 = zzbovVar.zzc;
                        if (executor2 != null) {
                            executor = executor2;
                        }
                        zzbpv zzbpvVar = zzbxeVar.zzc;
                        zzbpv zzb = zzbpvVar.zzb();
                        try {
                            zzcdq zzcdqVar = zzbxeVar.zzb;
                            zzbvr zzb2 = zze.zzb(zzcdqVar.zzc, zzcdqVar.zzb, zzcdqVar.zza, zzbxeVar.zzd);
                            zzbpvVar.zzc(zzb);
                            zzbxi zzo = zzbxeVar.zzo(zzb2);
                            if (zzo != null) {
                                executor.execute(zzo);
                            }
                            arrayList2.add(zzbxeVar);
                        } catch (Throwable th) {
                            zzbpvVar.zzc(zzb);
                            throw th;
                        }
                    }
                }
                synchronized (this.zzb) {
                    try {
                        if (zzf()) {
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                this.zzi.remove((zzbxe) it.next());
                            }
                            if (this.zzi.isEmpty()) {
                                this.zzi = new LinkedHashSet();
                            }
                            if (!zzf()) {
                                zzbuf zzbufVar = this.zzd;
                                zzbufVar.zzb(this.zzf);
                                if (((zzbtx) this.zzj.zbb) != null && (zzbxaVar = this.zzg) != null) {
                                    zzbufVar.zzb(zzbxaVar);
                                    this.zzg = null;
                                }
                            }
                            this.zzd.zza();
                        }
                    } finally {
                    }
                }
            }
        }
    }
}
