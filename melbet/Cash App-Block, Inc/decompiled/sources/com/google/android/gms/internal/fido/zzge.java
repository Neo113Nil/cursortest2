package com.google.android.gms.internal.fido;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public class zzge {
    public static final zzgc zze;
    public volatile zzge zza;
    public final zzgb zzb;
    public final Character zzc;

    static {
        new zzgd("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new zzgd("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new zzge("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new zzge("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        zze = new zzgc(new zzgb("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    public zzge(zzgb zzgbVar, Character ch) {
        this.zzb = zzgbVar;
        if (ch != null) {
            byte[] bArr = zzgbVar.zzg;
            if (bArr.length > 61 && bArr[61] != -1) {
                a$$ExternalSyntheticBUOutline0.m$3(zzh.zza("Padding character %s was already in alphabet", ch));
                throw null;
            }
        }
        this.zzc = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzge) {
            zzge zzgeVar = (zzge) obj;
            if (this.zzb.equals(zzgeVar.zzb) && Objects.equals(this.zzc, zzgeVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzc) ^ this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        zzgb zzgbVar = this.zzb;
        sb.append(zzgbVar);
        if (8 % zzgbVar.zzb != 0) {
            Character ch = this.zzc;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public void zzb(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        zzh.zze(0, i, bArr.length);
        while (i2 < i) {
            zzgb zzgbVar = this.zzb;
            zze(sb, bArr, i2, Math.min(zzgbVar.zzd, i - i2));
            i2 += zzgbVar.zzd;
        }
    }

    public final void zze(StringBuilder sb, byte[] bArr, int i, int i2) {
        zzh.zze(i, i + i2, bArr.length);
        zzgb zzgbVar = this.zzb;
        int i3 = zzgbVar.zzd;
        int i4 = zzgbVar.zzb;
        if (i2 > i3) {
            Path$$ExternalSyntheticBUOutline0.m$3();
            return;
        }
        int i5 = 0;
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | (bArr[i + i6] & 255)) << 8;
        }
        int i7 = (i2 + 1) * 8;
        while (i5 < i2 * 8) {
            sb.append(zzgbVar.zzf[((int) (j >>> ((i7 - i4) - i5))) & zzgbVar.zza]);
            i5 += i4;
        }
        if (this.zzc != null) {
            while (i5 < zzgbVar.zzd * 8) {
                sb.append('=');
                i5 += i4;
            }
        }
    }

    public final String zzg(int i, byte[] bArr) {
        zzh.zze(0, i, bArr.length);
        zzgb zzgbVar = this.zzb;
        int i2 = zzgbVar.zzd;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(zzgbVar.zzc * zzh.zza(i, i2));
        try {
            zzb(sb, bArr, i);
            return sb.toString();
        } catch (IOException e) {
            a$$ExternalSyntheticBUOutline0.m$1(e);
            return null;
        }
    }

    public zzge(String str, String str2) {
        this(new zzgb(str, str2.toCharArray()), (Character) '=');
    }
}
