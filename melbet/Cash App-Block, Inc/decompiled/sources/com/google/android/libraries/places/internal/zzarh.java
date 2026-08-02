package com.google.android.libraries.places.internal;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzarh extends zzbjr {
    private static final zzarh zzp;
    private static volatile zzblh zzq;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private zzbjz zzh = zzbjs.zzb;
    private int zzi;
    private int zzj;
    private boolean zzk;
    private zzaun zzl;
    private int zzm;
    private int zzn;
    private zzasq zzo;

    static {
        zzarh zzarhVar = new zzarh();
        zzp = zzarhVar;
        zzbjr.zzbF(zzarh.class, zzarhVar);
    }

    public static zzaqz zza$1() {
        return (zzaqz) zzp.zzbB();
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzp, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ࠬ\u0005᠌\u0003\u0006င\u0004\u0007ဇ\u0005\bဉ\u0006\t᠌\u0007\n᠌\b\u000bဉ\t", new Object[]{"zzb", "zze", zzanz.zza$28, "zzf", zzat.zza$1, "zzg", zzanz.zza$29, "zzh", zzanz.zza$27, "zzi", zzanz.zza$26, "zzj", "zzk", "zzl", "zzm", zzat.zza$14, "zzn", zzat.zza$16, "zzo"});
        }
        if (i2 == 3) {
            return new zzarh();
        }
        if (i2 == 4) {
            return new zzaqz(zzp);
        }
        if (i2 == 5) {
            return zzp;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzq;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzarh.class) {
            try {
                zzblhVar = zzq;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzp);
                    zzq = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }

    public final void zzc$2(int i) {
        this.zzf = CameraSelector$$ExternalSyntheticOutline0.ordinal(i);
        this.zzb |= 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(Iterable iterable) {
        zzbjz zzbjzVar = this.zzh;
        if (!((zzbic) zzbjzVar).zza) {
            this.zzh = zzbjr.zzbK(zzbjzVar);
        }
        Iterator it = ((ArrayList) iterable).iterator();
        while (it.hasNext()) {
            zzarc zzarcVar = (zzarc) it.next();
            ((zzbjs) this.zzh).zzh(zzarcVar.zzt);
        }
    }

    public final /* synthetic */ void zze(int i) {
        this.zzb |= 16;
        this.zzj = i;
    }

    public final /* synthetic */ void zzf(boolean z) {
        this.zzb |= 32;
        this.zzk = z;
    }

    public final /* synthetic */ void zzg(zzaun zzaunVar) {
        this.zzl = zzaunVar;
        this.zzb |= 64;
    }

    public final void zzh$2(int i) {
        this.zzn = CameraSelector$$ExternalSyntheticOutline0.ordinal(i);
        this.zzb |= 256;
    }

    public final /* synthetic */ void zzi(zzasq zzasqVar) {
        this.zzo = zzasqVar;
        this.zzb |= 512;
    }

    public final /* synthetic */ void zzk(int i) {
        this.zzi = i - 1;
        this.zzb |= 8;
    }
}
