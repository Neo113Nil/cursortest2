package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbac extends zzbjr {
    private static final zzbac zzaa;
    private static volatile zzblh zzab;
    private int zzA;
    private int zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private int zzF;
    private int zzG;
    private boolean zzH;
    private int zzI;
    private int zzJ;
    private int zzK;
    private int zzL;
    private int zzM;
    private int zzN;
    private int zzO;
    private int zzP;
    private int zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private int zzX;
    private int zzY;
    private zzbas zzZ;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private int zzz;

    static {
        zzbac zzbacVar = new zzbac();
        zzaa = zzbacVar;
        zzbjr.zzbF(zzbac.class, zzbacVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzaa, "\u0001/\u0000\u0002\u0001//\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဇ\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bင\u000b\fင\f\rင\r\u000eင\u000e\u000fင\u000f\u0010င\u0010\u0011င\n\u0012င\u0011\u0013င\u0012\u0014င\u0013\u0015င\u0014\u0016င\u0015\u0017င\u0016\u0018င\u0017\u0019င\u0018\u001aင\u0019\u001bင\u001a\u001cင\u001b\u001dဇ\u001c\u001eင\u001d\u001fင\u001e င\u001f!င \"င!#င\"$င#%င$&င%'င&(င')င(*င)+င*,င+-င,.င-/ဉ.", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzp", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", "zzZ"});
        }
        if (i2 == 3) {
            return new zzbac();
        }
        if (i2 == 4) {
            return new zzba(zzaa);
        }
        if (i2 == 5) {
            return zzaa;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzab;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzbac.class) {
            try {
                zzblhVar = zzab;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzaa);
                    zzab = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
