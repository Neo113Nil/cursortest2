package com.google.android.gms.internal.fido;

import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzgc extends zzge {
    public final char[] zza;

    public zzgc(zzgb zzgbVar) {
        super(zzgbVar, (Character) null);
        this.zza = new char[512];
        char[] cArr = zzgbVar.zzf;
        if (cArr.length != 16) {
            Path$$ExternalSyntheticBUOutline0.m$3();
            throw null;
        }
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.zza;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override // com.google.android.gms.internal.fido.zzge
    public final void zzb(StringBuilder sb, byte[] bArr, int i) {
        zzh.zze(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.zza;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }
}
