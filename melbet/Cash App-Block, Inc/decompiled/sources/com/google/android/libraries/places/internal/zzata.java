package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzata extends zzbjr {
    private static final zzata zzi;
    private static volatile zzblh zzj;
    private int zzb;
    private zzaib zzf;
    private zzarj zzg;
    private byte zzh = 2;
    private String zze = "";

    static {
        zzata zzataVar = new zzata();
        zzi = zzataVar;
        zzbjr.zzbF(zzata.class, zzataVar);
    }

    public static zzasz zza$1() {
        return (zzasz) zzi.zzbB();
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i2 == 2) {
            return new zzbll(zzi, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzata();
        }
        if (i2 == 4) {
            return new zzasz(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            this.zzh = zzbjrVar == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzblh zzblhVar2 = zzj;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzata.class) {
            try {
                zzblhVar = zzj;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzi);
                    zzj = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }

    public final /* synthetic */ void zzc(zzarj zzarjVar) {
        this.zzg = zzarjVar;
        this.zzb |= 4;
    }
}
