package com.google.android.libraries.places.internal;

import kotlin.collections.ArraysKt___ArraysJvmKt;

/* loaded from: classes4.dex */
public final class zzcmb extends zzcls {
    public final transient byte[][] zzb;
    public final transient int[] zzc;

    public zzcmb(byte[][] bArr, int[] iArr) {
        super(zzcls.zza.zzb);
        this.zzb = bArr;
        this.zzc = iArr;
    }

    @Override // com.google.android.libraries.places.internal.zzcls
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzcls)) {
            return false;
        }
        zzcls zzclsVar = (zzcls) obj;
        return zzclsVar.zzj() == zzj() && zzn(zzclsVar, zzj());
    }

    @Override // com.google.android.libraries.places.internal.zzcls
    public final int hashCode() {
        int i = super.zzc;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.zzb;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.zzc;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        super.zzc = i3;
        return i3;
    }

    @Override // com.google.android.libraries.places.internal.zzcls
    public final String toString() {
        return new zzcls(zzk()).toString();
    }

    @Override // com.google.android.libraries.places.internal.zzcls
    public final String zzg() {
        return new zzcls(zzk()).zzg();
    }

    @Override // com.google.android.libraries.places.internal.zzcls
    public final zzcls zzh() {
        return new zzcls(zzk()).zzh();
    }

    @Override // com.google.android.libraries.places.internal.zzcls
    public final byte zzi(int i) {
        byte[][] bArr = this.zzb;
        int length = bArr.length;
        int[] iArr = this.zzc;
        zzkf.zza(iArr[length - 1], i, 1L);
        int zza = zzwr.zza(this, i);
        return bArr[zza][(i - (zza == 0 ? 0 : iArr[zza - 1])) + iArr[length + zza]];
    }

    @Override // com.google.android.libraries.places.internal.zzcls
    public final int zzj() {
        return this.zzc[this.zzb.length - 1];
    }

    @Override // com.google.android.libraries.places.internal.zzcls
    public final byte[] zzk() {
        byte[] bArr = new byte[zzj()];
        byte[][] bArr2 = this.zzb;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.zzc;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            ArraysKt___ArraysJvmKt.copyInto(i3, bArr2[i], i4, bArr, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // com.google.android.libraries.places.internal.zzcls
    public final byte[] zzl() {
        return zzk();
    }

    @Override // com.google.android.libraries.places.internal.zzcls
    public final void zzm(zzclo zzcloVar, int i) {
        int i2;
        int zza = zzwr.zza(this, 0);
        int i3 = 0;
        while (i3 < i) {
            int[] iArr = this.zzc;
            if (zza == 0) {
                zza = 0;
                i2 = 0;
            } else {
                i2 = iArr[zza - 1];
            }
            int i4 = iArr[zza] - i2;
            byte[][] bArr = this.zzb;
            int i5 = iArr[bArr.length + zza];
            int min = Math.min(i, i4 + i2) - i3;
            int i6 = (i3 - i2) + i5;
            zzclz zzclzVar = new zzclz(bArr[zza], i6, i6 + min, true);
            zzclz zzclzVar2 = zzcloVar.zza;
            if (zzclzVar2 == null) {
                zzclzVar.zzg = zzclzVar;
                zzclzVar.zzf = zzclzVar;
                zzcloVar.zza = zzclzVar;
            } else {
                zzclz zzclzVar3 = zzclzVar2.zzg;
                zzclzVar3.getClass();
                zzclzVar3.zzc(zzclzVar);
            }
            i3 += min;
            zza++;
        }
        zzcloVar.zzb += i;
    }

    @Override // com.google.android.libraries.places.internal.zzcls
    public final boolean zzn(zzcls zzclsVar, int i) {
        int i2;
        zzclsVar.getClass();
        if (zzj() - i >= 0) {
            int zza = zzwr.zza(this, 0);
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                int[] iArr = this.zzc;
                if (zza == 0) {
                    zza = 0;
                    i2 = 0;
                } else {
                    i2 = iArr[zza - 1];
                }
                int i5 = iArr[zza] - i2;
                byte[][] bArr = this.zzb;
                int i6 = iArr[bArr.length + zza];
                int min = Math.min(i, i5 + i2) - i3;
                if (zzclsVar.zzo(i4, (i3 - i2) + i6, min, bArr[zza])) {
                    i4 += min;
                    i3 += min;
                    zza++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzcls
    public final boolean zzo(int i, int i2, int i3, byte[] bArr) {
        int i4;
        bArr.getClass();
        if (i >= 0 && i <= zzj() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int i5 = i3 + i;
            int zza = zzwr.zza(this, i);
            while (i < i5) {
                int[] iArr = this.zzc;
                if (zza == 0) {
                    zza = 0;
                    i4 = 0;
                } else {
                    i4 = iArr[zza - 1];
                }
                int i6 = iArr[zza] - i4;
                byte[][] bArr2 = this.zzb;
                int i7 = iArr[bArr2.length + zza];
                int min = Math.min(i5, i6 + i4) - i;
                int i8 = (i - i4) + i7;
                byte[] bArr3 = bArr2[zza];
                bArr3.getClass();
                for (int i9 = 0; i9 < min; i9++) {
                    if (bArr3[i9 + i8] == bArr[i9 + i2]) {
                    }
                }
                i2 += min;
                i += min;
                zza++;
            }
            return true;
        }
        return false;
    }
}
