package com.google.android.gms.internal.measurement;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.InputStream;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public abstract class zzacv {
    public int zza;
    public int zzb;
    public Object zzd;

    public static int decodeZigZag32(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long decodeZigZag64(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static zzacv zzM(InputStream inputStream, int i) {
        if (i <= 0) {
            a$$ExternalSyntheticBUOutline0.m$3("bufferSize must be > 0");
            return null;
        }
        if (inputStream != null) {
            return new zzacu(inputStream, i);
        }
        zzact zzactVar = new zzact(zzaed.zza);
        try {
            zzactVar.zzD(0);
            return zzactVar;
        } catch (zzaeh e) {
            Path$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    public static int zzR(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long zzS(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd();

    public abstract int pushLimit(int i);

    public abstract boolean readBool();

    public abstract int readTag();

    public abstract int zzD(int i);

    public abstract void zzE(int i);

    public abstract int zzF();

    public abstract boolean zzG();

    public abstract int zzH();

    public abstract int zzK(int i, int i2, byte[] bArr);

    public abstract void zzL(int i);

    public void zzQ() {
        int zza;
        do {
            zza = zza();
            if (zza == 0) {
                return;
            }
            int i = this.zza;
            int i2 = this.zzb;
            if (i + i2 >= 100) {
                a$$ExternalSyntheticBUOutline0.m$5("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                return;
            } else {
                this.zzb = i2 + 1;
                this.zzb--;
            }
        } while (zzc(zza));
    }

    public abstract int zza();

    public abstract void zzb(int i);

    public abstract boolean zzc(int i);

    public abstract double zzd();

    public abstract float zze();

    public abstract long zzf();

    public abstract long zzg();

    public abstract int zzh();

    public abstract long zzi();

    public abstract int zzj();

    public abstract boolean zzk();

    public abstract String zzl();

    public abstract String zzm();

    public abstract zzacq zzn();

    public abstract byte[] zzo();

    public abstract int zzp();

    public abstract int zzq();

    public abstract int zzr();

    public abstract long zzs();

    public abstract int zzt();

    public abstract long zzu();

    public abstract int zzx();

    public abstract long zzz();
}
