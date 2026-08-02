package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzarj extends zzbjr {
    private static final zzarj zzl;
    private static volatile zzblh zzm;
    private int zzb;
    private int zze;
    private zzbkb zzf;
    private String zzg;
    private String zzh;
    private boolean zzi;
    private zzbkb zzj;
    private int zzk;

    static {
        zzarj zzarjVar = new zzarj();
        zzl = zzarjVar;
        zzbjr.zzbF(zzarj.class, zzarjVar);
    }

    public zzarj() {
        zzblk zzblkVar = zzblk.zzb;
        this.zzf = zzblkVar;
        this.zzg = "";
        this.zzh = "";
        this.zzj = zzblkVar;
    }

    public static zzari zza$1() {
        return (zzari) zzl.zzbB();
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzl, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001င\u0000\u0002\u001a\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006\u001a\u0007င\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzarj();
        }
        if (i2 == 4) {
            return new zzari(zzl);
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
        synchronized (zzarj.class) {
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

    public final void zzc(String str) {
        str.getClass();
        zzbkb zzbkbVar = this.zzf;
        if (!((zzbic) zzbkbVar).zza) {
            int size = zzbkbVar.size();
            this.zzf = zzbkbVar.zzg(size + size);
        }
        this.zzf.add(str);
    }
}
