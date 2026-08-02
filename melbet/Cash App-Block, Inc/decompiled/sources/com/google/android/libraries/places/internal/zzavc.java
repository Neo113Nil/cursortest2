package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzavc extends zzbjr {
    private static final zzavc zze;
    private static volatile zzblh zzf;
    private zzbkb zzb = zzblk.zzb;

    static {
        zzavc zzavcVar = new zzavc();
        zze = zzavcVar;
        zzbjr.zzbF(zzavc.class, zzavcVar);
    }

    public static zzavb zza() {
        return (zzavb) zze.zzbB();
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i2 == 3) {
            return new zzavc();
        }
        if (i2 == 4) {
            return new zzavb(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzf;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzavc.class) {
            try {
                zzblhVar = zzf;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zze);
                    zzf = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }

    public final void zzc(Iterable iterable) {
        zzbkb zzbkbVar = this.zzb;
        if (!((zzbic) zzbkbVar).zza) {
            int size = zzbkbVar.size();
            this.zzb = zzbkbVar.zzg(size + size);
        }
        zzbhz.zzbu(iterable, this.zzb);
    }
}
