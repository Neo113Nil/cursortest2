package com.google.android.gms.internal.fido;

import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzgd extends zzge {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzgd(String str, String str2) {
        super(new zzgb(str, r3), (Character) '=');
        char[] charArray = str2.toCharArray();
        if (charArray.length == 64) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m$3();
        throw null;
    }

    @Override // com.google.android.gms.internal.fido.zzge
    public final void zzb(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        zzh.zze(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16) | (bArr[i2 + 2] & 255);
            zzgb zzgbVar = this.zzb;
            char[] cArr = zzgbVar.zzf;
            char[] cArr2 = zzgbVar.zzf;
            sb.append(cArr[i4 >>> 18]);
            sb.append(cArr2[(i4 >>> 12) & 63]);
            sb.append(cArr2[(i4 >>> 6) & 63]);
            sb.append(cArr2[i4 & 63]);
            i2 += 3;
        }
        if (i2 < i) {
            zze(sb, bArr, i2, i - i2);
        }
    }
}
