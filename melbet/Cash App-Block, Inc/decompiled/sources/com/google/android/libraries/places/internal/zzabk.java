package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzabk extends zzbjr {
    private static final zzabk zzQ;
    private static volatile zzblh zzR;
    private zzak zzA;
    private zzdj zzB;
    private zzbn zzC;
    private zzamu zzD;
    private zzce zzE;
    private zzcl zzF;
    private zzaxz zzG;
    private zzaho zzH;
    private zzaxl zzI;
    private zzaxh zzJ;
    private zzav zzK;
    private zzabq zzL;
    private zzais zzM;
    private zzh zzN;
    private zzcz zzO;
    private int zzb;
    private int zze;
    private zzatw zzg;
    private zzaej zzh;
    private zzayd zzi;
    private zzaox zzj;
    private zzakh zzk;
    private zzbw zzl;
    private zzaee zzm;
    private zzadg zzn;
    private zzahm zzo;
    private zzamd zzp;
    private zzamx zzq;
    private zzamz zzr;
    private zzach zzs;
    private zzaig zzt;
    private zzj zzu;
    private zzar zzv;
    private zzbb zzw;
    private zzdx zzx;
    private zzbd zzy;
    private zzbi zzz;
    private byte zzP = 2;
    private int zzf = 1;

    static {
        zzabk zzabkVar = new zzabk();
        zzQ = zzabkVar;
        zzbjr.zzbF(zzabk.class, zzabkVar);
    }

    public static zzabi zza$1() {
        return (zzabi) zzQ.zzbB();
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzP);
        }
        if (i2 == 2) {
            return new zzbll(zzQ, "\u0001$\u0000\u0002\u0001%$\u0000\u0000\u0002\u0001᠌\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000fဉ\r\u0010ဉ\u000e\u0011ဉ\u000f\u0012ဉ\u0010\u0013ဉ\u0011\u0014ဉ\u0012\u0015ဉ\u0013\u0016ဉ\u0014\u0017ဉ\u0015\u0018ဉ\u0016\u0019ဉ\u0017\u001aဉ\u0018\u001bဉ\u0019\u001cဉ\u001a\u001dဉ\u001b\u001eဉ\u001c\u001fဉ\u001d ဉ\u001e!ဉ\u001f\"ဉ #ဉ!$ဉ\"%ဉ#", new Object[]{"zzb", "zze", "zzf", zzaa.zza$1, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO"});
        }
        if (i2 == 3) {
            return new zzabk();
        }
        if (i2 == 4) {
            return new zzabi(zzQ);
        }
        if (i2 == 5) {
            return zzQ;
        }
        if (i2 != 6) {
            this.zzP = zzbjrVar == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzblh zzblhVar2 = zzR;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzabk.class) {
            try {
                zzblhVar = zzR;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzQ);
                    zzR = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }

    public final /* synthetic */ void zzc(zzatw zzatwVar) {
        this.zzg = zzatwVar;
        this.zzb |= 2;
    }

    public final /* synthetic */ void zze(int i) {
        this.zzf = 1;
        this.zzb = 1 | this.zzb;
    }
}
