package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzaup extends zzbjr {
    private static final zzaup zzl;
    private static volatile zzblh zzm;
    private int zzb;
    private int zze;
    private int zzg;
    private int zzh;
    private long zzi;
    private boolean zzk;
    private zzbkb zzf = zzblk.zzb;
    private String zzj = "";

    static {
        zzaup zzaupVar = new zzaup();
        zzl = zzaupVar;
        zzbjr.zzbF(zzaup.class, zzaupVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzl, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001a\u0003င\u0001\u0004᠌\u0002\u0005ဂ\u0003\u0006ဈ\u0004\u0007ဇ\u0005", new Object[]{"zzb", "zze", zzanz.zza$19, "zzf", "zzg", "zzh", zzc.zza$3, "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzaup();
        }
        if (i2 == 4) {
            return new zzaw(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzm;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzaup.class) {
            try {
                zzblhVar = zzm;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzl);
                    zzm = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
