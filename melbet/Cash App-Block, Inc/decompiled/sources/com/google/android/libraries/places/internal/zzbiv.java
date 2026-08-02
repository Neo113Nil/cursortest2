package com.google.android.libraries.places.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public abstract class zzbiv extends zzib {
    public static final boolean zzc = zzbmg.zzg;
    public zzfv zza;

    public static int zzG(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int zzH(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void zzJ() {
        if (zzz() > 0) {
            a$$ExternalSyntheticBUOutline0.m$1("Did not write as much data as expected.");
        } else {
            if (zzz() >= 0) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$1("Wrote more data than expected.");
        }
    }

    public abstract void zzc(int i, int i2);

    public abstract void zzd(int i, int i2);

    public abstract void zze(int i, int i2);

    public abstract void zzf(int i, int i2);

    public abstract void zzg(int i, long j);

    public abstract void zzh(int i, long j);

    public abstract void zzi(int i, boolean z);

    public abstract void zzj(int i, String str);

    public abstract void zzk(int i, zzbim zzbimVar);

    public abstract void zzl(zzbim zzbimVar);

    public abstract void zzm(int i, byte[] bArr);

    public abstract void zzn(int i, zzbhz zzbhzVar);

    public abstract void zzo(int i, zzbim zzbimVar);

    public abstract void zzp(zzbhz zzbhzVar);

    public abstract void zzq(byte b);

    public abstract void zzr(int i);

    public abstract void zzs(int i);

    public abstract void zzt(int i);

    public abstract void zzu(long j);

    public abstract void zzv(long j);

    public abstract void zzx(String str);

    public abstract int zzz();
}
