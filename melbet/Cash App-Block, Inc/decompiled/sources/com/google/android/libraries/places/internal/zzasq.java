package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzasq extends zzbjr {
    private static final zzasq zzg;
    private static volatile zzblh zzh;
    private int zzb;
    private zzaso zze;
    private zzaso zzf;

    static {
        zzasq zzasqVar = new zzasq();
        zzg = zzasqVar;
        zzbjr.zzbF(zzasq.class, zzasqVar);
    }

    public static zzasp zza$1() {
        return (zzasp) zzg.zzbB();
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzasq();
        }
        if (i2 == 4) {
            return new zzasp(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzh;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzasq.class) {
            try {
                zzblhVar = zzh;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzg);
                    zzh = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }

    public final /* synthetic */ void zzc(zzaso zzasoVar) {
        this.zze = zzasoVar;
        this.zzb |= 1;
    }

    public final /* synthetic */ void zzd(zzaso zzasoVar) {
        this.zzf = zzasoVar;
        this.zzb |= 2;
    }
}
