package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import java.io.OutputStream;
import java.nio.InvalidMarkException;

/* loaded from: classes4.dex */
public final class zzcdw extends zzbur {
    public int zza;
    public final int zzb;
    public final byte[] zzc;
    public int zzd = -1;

    public zzcdw(byte[] bArr, int i, int i2) {
        Trace.checkArgument("offset must be >= 0", i >= 0);
        Trace.checkArgument("length must be >= 0", i2 >= 0);
        int i3 = i2 + i;
        Trace.checkArgument("offset + length exceeds array boundary", i3 <= bArr.length);
        this.zzc = bArr;
        this.zza = i;
        this.zzb = i3;
    }

    @Override // com.google.android.libraries.places.internal.zzbur
    public final void zzb() {
        this.zzd = this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbur
    public final void zzc() {
        int i = this.zzd;
        if (i == -1) {
            throw new InvalidMarkException();
        }
        this.zza = i;
    }

    @Override // com.google.android.libraries.places.internal.zzbur
    public final int zzf() {
        return this.zzb - this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbur
    public final int zzg() {
        zzd(1);
        int i = this.zza;
        this.zza = i + 1;
        return this.zzc[i] & 255;
    }

    @Override // com.google.android.libraries.places.internal.zzbur
    public final void zzh(int i) {
        zzd(i);
        this.zza += i;
    }

    @Override // com.google.android.libraries.places.internal.zzbur
    public final void zzi(int i, int i2, byte[] bArr) {
        System.arraycopy(this.zzc, this.zza, bArr, i, i2);
        this.zza += i2;
    }

    @Override // com.google.android.libraries.places.internal.zzbur
    public final void zzj(OutputStream outputStream, int i) {
        zzd(i);
        outputStream.write(this.zzc, this.zza, i);
        this.zza += i;
    }

    @Override // com.google.android.libraries.places.internal.zzbur
    public final /* bridge */ /* synthetic */ zzbur zzk(int i) {
        zzd(i);
        int i2 = this.zza;
        this.zza = i2 + i;
        return new zzcdw(this.zzc, i2, i);
    }
}
