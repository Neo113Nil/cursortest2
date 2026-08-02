package com.google.android.libraries.places.internal;

import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.squareup.moshi.LinkedHashTreeMap;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public abstract class zzbiq {
    public int zza;
    public int zzb;
    public LinkedHashTreeMap.AvlBuilder zze;

    public static zzbio zzJ(int i, byte[] bArr) {
        zzbio zzbioVar = new zzbio(bArr, i);
        try {
            zzbioVar.zzB(i);
            return zzbioVar;
        } catch (zzbke e) {
            Path$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    public abstract int zzB(int i);

    public abstract void zzC(int i);

    public abstract boolean zzD();

    public abstract int zzE();

    public final void zzM() {
        int zza;
        do {
            zza = zza();
            if (zza == 0) {
                return;
            }
            int i = this.zza;
            int i2 = this.zzb;
            if (i + i2 >= 100) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
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

    public abstract zzbil zzn();

    public abstract int zzo();

    public abstract int zzp();

    public abstract int zzq();

    public abstract long zzr();

    public abstract int zzs();

    public abstract long zzt();
}
