package com.google.android.libraries.places.internal;

import java.util.IdentityHashMap;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzbuo implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object zza;
    public final /* synthetic */ Object zzb;
    public final /* synthetic */ Object zzc;
    public final /* synthetic */ Object zzd;

    public zzbuo(zzcge zzcgeVar, zzcgc zzcgcVar, zzcgd zzcgdVar, Object obj) {
        this.$r8$classId = 3;
        this.zza = zzcgcVar;
        this.zzb = zzcgdVar;
        this.zzc = obj;
        Objects.requireNonNull(zzcgeVar);
        this.zzd = zzcgeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((zzcho) this.zzd).zzz((zzbtx) this.zza, (zzbvs) this.zzb, (zzbsn) this.zzc);
                return;
            case 1:
                ((zzbxx) this.zzd).zza.zzc((zzbtx) this.zza, (zzbvs) this.zzb, (zzbsn) this.zzc);
                return;
            case 2:
                zzcax zzcaxVar = (zzcax) this.zzd;
                zzcaxVar.zzC = true;
                zzcaxVar.zzx.zzc((zzbtx) this.zza, (zzbvs) this.zzb, (zzbsn) this.zzc);
                return;
            default:
                zzcge zzcgeVar = (zzcge) this.zzd;
                synchronized (zzcgeVar) {
                    try {
                        if (((zzcgc) this.zza).zzb == 0) {
                            IdentityHashMap identityHashMap = zzcgeVar.zzb;
                            zzcgd zzcgdVar = (zzcgd) this.zzb;
                            identityHashMap.remove(zzcgdVar);
                            if (zzcgeVar.zzb.isEmpty()) {
                                zzcgeVar.zzc.shutdown();
                                zzcgeVar.zzc = null;
                            }
                            zzcgdVar.zza(this.zzc);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }

    public /* synthetic */ zzbuo(Object obj, zzbtx zzbtxVar, zzbvs zzbvsVar, zzbsn zzbsnVar, int i) {
        this.$r8$classId = i;
        this.zza = zzbtxVar;
        this.zzb = zzbvsVar;
        this.zzc = zzbsnVar;
        this.zzd = obj;
    }
}
