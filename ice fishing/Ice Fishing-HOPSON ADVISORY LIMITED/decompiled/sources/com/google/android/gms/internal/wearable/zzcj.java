package com.google.android.gms.internal.wearable;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public abstract class zzcj {
    private static volatile int zzd = 100;
    int zza;
    final int zzb = zzd;
    Object zzc;

    private zzcj() {
    }

    /* synthetic */ zzcj(byte[] bArr) {
    }

    static zzcj zzE(byte[] bArr, int i, int i2, boolean z) {
        zzci zzciVar = new zzci(bArr, 0, i2, z, null);
        try {
            zzciVar.zzA(i2);
            return zzciVar;
        } catch (zzdv e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int zzF(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long zzG(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public abstract int zzA(int i) throws zzdv;

    public abstract void zzB(int i);

    public abstract boolean zzC() throws IOException;

    public abstract int zzD();

    public abstract int zza() throws IOException;

    public abstract void zzb(int i) throws zzdv;

    public abstract double zzc() throws IOException;

    public abstract float zzd() throws IOException;

    public abstract long zze() throws IOException;

    public abstract long zzf() throws IOException;

    public abstract int zzg() throws IOException;

    public abstract long zzh() throws IOException;

    public abstract int zzi() throws IOException;

    public abstract boolean zzj() throws IOException;

    public abstract String zzk() throws IOException;

    public abstract String zzl() throws IOException;

    public abstract zzcg zzm() throws IOException;

    public abstract int zzn() throws IOException;

    public abstract int zzo() throws IOException;

    public abstract int zzp() throws IOException;

    public abstract long zzq() throws IOException;

    public abstract int zzr() throws IOException;

    public abstract long zzs() throws IOException;
}
