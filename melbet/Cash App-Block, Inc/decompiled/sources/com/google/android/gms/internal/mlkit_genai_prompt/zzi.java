package com.google.android.gms.internal.mlkit_genai_prompt;

/* loaded from: classes4.dex */
public final class zzi extends zzals {
    private static final zzi zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private float zzh;
    private float zzi;
    private float zzj;

    static {
        zzi zziVar = new zzi();
        zzb = zziVar;
        zzals.zzt(zzi.class, zziVar);
    }

    public static zzi zzf() {
        return zzb;
    }

    public final float zza() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzals
    public final Object zzb(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzana(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005", new Object[]{"zzd", "zze", zzanz.zza$3, "zzf", zzanz.zza$2, "zzg", zzanz.zza$1, "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzi();
        }
        if (i2 == 4) {
            return new zza(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final float zzc() {
        return this.zzh;
    }

    public final float zzd() {
        return this.zzj;
    }

    public final int zzg() {
        int i;
        int i2 = this.zzg;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int zzh() {
        int i;
        int i2 = this.zzf;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int zzi() {
        int i = this.zze;
        int i2 = i != 0 ? i != 1 ? 0 : 2 : 1;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
