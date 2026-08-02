package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbef extends zzbjr {
    private static final zzbef zzh;
    private static volatile zzblh zzi;
    private String zzb = "";
    private int zze;
    private int zzf;
    private boolean zzg;

    static {
        zzbef zzbefVar = new zzbef();
        zzh = zzbefVar;
        zzbjr.zzbF(zzbef.class, zzbefVar);
    }

    public static zzbee zza$1() {
        return (zzbee) zzh.zzbB();
    }

    public static zzbef zzc() {
        return zzh;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0007", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzbef();
        }
        if (i2 == 4) {
            return new zzbee(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzi;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzbef.class) {
            try {
                zzblhVar = zzi;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzh);
                    zzi = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }

    public final /* synthetic */ void zzd(String str) {
        this.zzb = str;
    }

    public final /* synthetic */ void zze(int i) {
        this.zze = i;
    }

    public final /* synthetic */ void zzf$1(int i) {
        this.zzf = i;
    }

    public final /* synthetic */ void zzg$1() {
        this.zzg = true;
    }
}
