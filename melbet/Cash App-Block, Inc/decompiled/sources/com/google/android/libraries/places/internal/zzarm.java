package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzarm extends zzbjr {
    private static final zzarm zzn;
    private static volatile zzblh zzo;
    private int zzb;
    private int zze;
    private int zzf;
    private zzbjz zzg = zzbjs.zzb;
    private boolean zzh;
    private boolean zzi;
    private int zzj;
    private int zzk;
    private zzaun zzl;
    private zzasq zzm;

    static {
        zzarm zzarmVar = new zzarm();
        zzn = zzarmVar;
        zzbjr.zzbF(zzarm.class, zzarmVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzn, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ࠬ\u0005ဇ\u0002\u0006ဇ\u0003\u0007᠌\u0004\b᠌\u0005\tဉ\u0006\nဉ\u0007", new Object[]{"zzb", "zze", zzat.zza$14, "zzf", zzat.zza$16, "zzg", zzat.zza$2, "zzh", "zzi", "zzj", zzat.zza$15, "zzk", zzat.zza$13, "zzl", "zzm"});
        }
        if (i2 == 3) {
            return new zzarm();
        }
        if (i2 == 4) {
            return new zzaq(zzn);
        }
        if (i2 == 5) {
            return zzn;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzo;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzarm.class) {
            try {
                zzblhVar = zzo;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzn);
                    zzo = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
