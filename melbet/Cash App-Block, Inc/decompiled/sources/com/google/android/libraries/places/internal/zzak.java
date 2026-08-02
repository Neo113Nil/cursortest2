package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzak extends zzbjr {
    private static final zzak zzn;
    private static volatile zzblh zzo;
    private int zzb;
    private zzdq zze;
    private boolean zzf;
    private zzbkb zzg;
    private zzbkb zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;

    static {
        zzak zzakVar = new zzak();
        zzn = zzakVar;
        zzbjr.zzbF(zzak.class, zzakVar);
    }

    public zzak() {
        zzblk zzblkVar = zzblk.zzb;
        this.zzg = zzblkVar;
        this.zzh = zzblkVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003\u001b\u0004\u001b\u0005င\u0002\u0006င\u0003\u0007င\u0004\bင\u0005\tဂ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", zzay.class, "zzh", zzay.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i2 == 3) {
            return new zzak();
        }
        if (i2 == 4) {
            return new zzaj(zzn);
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
        synchronized (zzak.class) {
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
