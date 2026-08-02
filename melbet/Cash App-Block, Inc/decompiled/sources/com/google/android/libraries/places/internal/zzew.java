package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzew extends zzbjr {
    private static final zzew zzE;
    private static volatile zzblh zzF;
    private float zzA;
    private float zzB;
    private boolean zzC;
    private int zzD;
    private int zzb;
    private float zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private float zzm;
    private float zzn;
    private float zzo;
    private float zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private float zzt;
    private float zzu;
    private float zzv;
    private float zzw;
    private float zzx;
    private float zzy;
    private float zzz;

    static {
        zzew zzewVar = new zzew();
        zzE = zzewVar;
        zzbjr.zzbF(zzew.class, zzewVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzE, "\u0001\u001a\u0000\u0001\u0001\u001a\u001a\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tခ\b\nခ\t\u000bခ\n\fခ\u000b\rင\f\u000eင\r\u000fင\u000e\u0010ခ\u000f\u0011ခ\u0010\u0012ခ\u0011\u0013ခ\u0012\u0014ခ\u0013\u0015ခ\u0014\u0016ခ\u0015\u0017ခ\u0016\u0018ခ\u0017\u0019ဇ\u0018\u001aင\u0019", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD"});
        }
        if (i2 == 3) {
            return new zzew();
        }
        if (i2 == 4) {
            return new zze(zzE);
        }
        if (i2 == 5) {
            return zzE;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzF;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzew.class) {
            try {
                zzblhVar = zzF;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzE);
                    zzF = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
