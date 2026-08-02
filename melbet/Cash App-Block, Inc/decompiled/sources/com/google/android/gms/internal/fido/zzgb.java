package com.google.android.gms.internal.fido;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.math.RoundingMode;
import java.util.Arrays;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzgb {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final String zze;
    public final char[] zzf;
    public final byte[] zzg;
    public final boolean zzh;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0061 A[LOOP:0: B:13:0x005d->B:15:0x0061, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzgb(String str, char[] cArr, byte[] bArr, boolean z) {
        int numberOfLeadingZeros;
        int i;
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            if (length <= 0) {
                throw new IllegalArgumentException("x (0) must be > 0");
            }
            switch (zzgg.zza[roundingMode.ordinal()]) {
                case 1:
                    if (((length - 1) & length) != 0) {
                        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                    }
                case 2:
                case 3:
                    numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(length);
                    this.zzb = numberOfLeadingZeros;
                    int numberOfTrailingZeros = Integer.numberOfTrailingZeros(numberOfLeadingZeros);
                    int i2 = 1 << (3 - numberOfTrailingZeros);
                    this.zzc = i2;
                    this.zzd = numberOfLeadingZeros >> numberOfTrailingZeros;
                    this.zza = length - 1;
                    this.zzg = bArr;
                    boolean[] zArr = new boolean[i2];
                    for (i = 0; i < this.zzd; i++) {
                        int i3 = this.zzb;
                        RoundingMode roundingMode2 = RoundingMode.CEILING;
                        zArr[zzh.zza(i * 8, i3)] = true;
                    }
                    this.zzh = z;
                    return;
                case 4:
                case 5:
                    numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(length - 1);
                    this.zzb = numberOfLeadingZeros;
                    int numberOfTrailingZeros2 = Integer.numberOfTrailingZeros(numberOfLeadingZeros);
                    int i22 = 1 << (3 - numberOfTrailingZeros2);
                    this.zzc = i22;
                    this.zzd = numberOfLeadingZeros >> numberOfTrailingZeros2;
                    this.zza = length - 1;
                    this.zzg = bArr;
                    boolean[] zArr2 = new boolean[i22];
                    while (i < this.zzd) {
                    }
                    this.zzh = z;
                    return;
                case 6:
                case 7:
                case 8:
                    int numberOfLeadingZeros2 = Integer.numberOfLeadingZeros(length);
                    numberOfLeadingZeros = (31 - numberOfLeadingZeros2) + ((((-1257966797) >>> numberOfLeadingZeros2) - length) >>> 31);
                    this.zzb = numberOfLeadingZeros;
                    int numberOfTrailingZeros22 = Integer.numberOfTrailingZeros(numberOfLeadingZeros);
                    int i222 = 1 << (3 - numberOfTrailingZeros22);
                    this.zzc = i222;
                    this.zzd = numberOfLeadingZeros >> numberOfTrailingZeros22;
                    this.zza = length - 1;
                    this.zzg = bArr;
                    boolean[] zArr22 = new boolean[i222];
                    while (i < this.zzd) {
                    }
                    this.zzh = z;
                    return;
                default:
                    throw new AssertionError();
            }
        } catch (ArithmeticException e) {
            Handlers$$ExternalSyntheticBUOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(cArr.length, "Illegal alphabet length "), e);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgb)) {
            return false;
        }
        zzgb zzgbVar = (zzgb) obj;
        return this.zzh == zzgbVar.zzh && Arrays.equals(this.zzf, zzgbVar.zzf);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + (true != this.zzh ? 1237 : 1231);
    }

    public final String toString() {
        return this.zze;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzgb(String str, char[] cArr) {
        this(str, cArr, r1, false);
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (c < 128) {
                if (bArr[c] == -1) {
                    bArr[c] = (byte) i;
                } else {
                    a$$ExternalSyntheticBUOutline0.m$3(zzh.zza("Duplicate character: %s", Character.valueOf(c)));
                    throw null;
                }
            } else {
                a$$ExternalSyntheticBUOutline0.m$3(zzh.zza("Non-ASCII character: %s", Character.valueOf(c)));
                throw null;
            }
        }
    }
}
