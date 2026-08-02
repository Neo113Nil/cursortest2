package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzaxc extends zzbjr {
    private static final zzaxc zzJ;
    private static volatile zzblh zzK;
    private double zzA;
    private zzaxg zzB;
    private zzaxg zzC;
    private zzaxg zzD;
    private zzaxg zzE;
    private zzaxg zzF;
    private zzaxg zzG;
    private zzbjz zzH = zzbjs.zzb;
    private int zzI;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private long zzi;
    private zzaxe zzj;
    private zzaxe zzk;
    private zzaxe zzl;
    private zzaxe zzm;
    private zzaxe zzn;
    private zzaxe zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private float zzt;
    private int zzu;
    private double zzv;
    private int zzw;
    private int zzx;
    private float zzy;
    private long zzz;

    static {
        zzaxc zzaxcVar = new zzaxc();
        zzJ = zzaxcVar;
        zzbjr.zzbF(zzaxc.class, zzaxcVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzJ, "\u0001\u001f\u0000\u0001\u0001\u001f\u001f\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဂ\u0004\u0006င\r\u0007င\u000e\bခ\u000f\tင\u0010\nက\u0011\u000bင\u0012\fင\u0013\rခ\u0014\u000eဂ\u0015\u000fက\u0016\u0010ဉ\u0005\u0011ဉ\u0006\u0012ဉ\u0007\u0013ဉ\b\u0014ဉ\t\u0015ဉ\n\u0016ဉ\u0017\u0017ဉ\u0018\u0018ဉ\u0019\u0019ဉ\u001a\u001aဉ\u001b\u001bဉ\u001c\u001cင\u000b\u001d'\u001eင\f\u001fင\u001d", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG", "zzp", "zzH", "zzq", "zzI"});
        }
        if (i2 == 3) {
            return new zzaxc();
        }
        if (i2 == 4) {
            return new zzaw(zzJ);
        }
        if (i2 == 5) {
            return zzJ;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzK;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzaxc.class) {
            try {
                zzblhVar = zzK;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzJ);
                    zzK = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
