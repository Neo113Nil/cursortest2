package com.google.android.libraries.places.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public final class zzbiu extends zzbiv {
    public final byte[] zzc;
    public final int zzd;
    public int zze;
    public final OutputStream zzg;

    public zzbiu(OutputStream outputStream, int i) {
        if (outputStream == null) {
            a$$ExternalSyntheticBUOutline0.m$2("out");
            throw null;
        }
        this.zzg = outputStream;
        if (i < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("bufferSize must be >= 0");
            throw null;
        }
        byte[] bArr = new byte[Math.max(i, 20)];
        this.zzc = bArr;
        this.zzd = bArr.length;
    }

    public final void zzA(int i) {
        boolean z = zzbiv.zzc;
        byte[] bArr = this.zzc;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.zze;
                if (i2 == 0) {
                    this.zze = i3 + 1;
                    zzbmg.zzo(bArr, i3, (byte) i);
                    return;
                } else {
                    this.zze = i3 + 1;
                    zzbmg.zzo(bArr, i3, (byte) (i | 128));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.zze;
                if (i4 == 0) {
                    this.zze = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.zze = i5 + 1;
                    bArr[i5] = (byte) (i | 128);
                    i >>>= 7;
                }
            }
        }
    }

    public final void zzB(long j) {
        boolean z = zzbiv.zzc;
        byte[] bArr = this.zzc;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = (int) j;
                int i2 = this.zze;
                if (j2 == 0) {
                    this.zze = i2 + 1;
                    zzbmg.zzo(bArr, i2, (byte) i);
                    return;
                } else {
                    this.zze = i2 + 1;
                    zzbmg.zzo(bArr, i2, (byte) (i | 128));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i3 = (int) j;
                int i4 = this.zze;
                if (j3 == 0) {
                    this.zze = i4 + 1;
                    bArr[i4] = (byte) i3;
                    return;
                } else {
                    this.zze = i4 + 1;
                    bArr[i4] = (byte) (i3 | 128);
                    j >>>= 7;
                }
            }
        }
    }

    public final void zzC(int i) {
        int i2 = this.zze;
        byte[] bArr = this.zzc;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.zze = i2 + 4;
    }

    public final void zzD(long j) {
        int i = this.zze;
        byte[] bArr = this.zzc;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.zze = i + 8;
    }

    public final void zzE(int i, int i2, byte[] bArr) {
        int i3 = this.zze;
        int i4 = this.zzd;
        int i5 = i4 - i3;
        byte[] bArr2 = this.zzc;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.zze += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        this.zze = i4;
        zzM();
        int i7 = i2 - i5;
        if (i7 > i4) {
            this.zzg.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.zze = i7;
        }
    }

    public final void zzL(int i) {
        if (this.zzd - this.zze < i) {
            zzM();
        }
    }

    public final void zzM() {
        this.zzg.write(this.zzc, 0, this.zze);
        this.zze = 0;
    }

    @Override // com.google.android.libraries.places.internal.zzib
    public final void zza(int i, int i2, byte[] bArr) {
        zzE(i, i2, bArr);
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final void zzc(int i, int i2) {
        zzs((i << 3) | i2);
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final void zzd(int i, int i2) {
        zzL(20);
        zzA(i << 3);
        if (i2 >= 0) {
            zzA(i2);
        } else {
            zzB(i2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final void zze(int i, int i2) {
        zzL(20);
        zzA(i << 3);
        zzA(i2);
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final void zzf(int i, int i2) {
        zzL(14);
        zzA((i << 3) | 5);
        zzC(i2);
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final void zzg(int i, long j) {
        zzL(20);
        zzA(i << 3);
        zzB(j);
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final void zzh(int i, long j) {
        zzL(18);
        zzA((i << 3) | 1);
        zzD(j);
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final void zzi(int i, boolean z) {
        zzL(11);
        zzA(i << 3);
        int i2 = this.zze;
        this.zzc[i2] = z ? (byte) 1 : (byte) 0;
        this.zze = i2 + 1;
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final void zzj(int i, String str) {
        zzs((i << 3) | 2);
        zzx(str);
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final void zzk(int i, zzbim zzbimVar) {
        zzs((i << 3) | 2);
        zzl(zzbimVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final void zzl(zzbim zzbimVar) {
        zzs(zzbimVar.zzb());
        zzbimVar.zze(this);
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final void zzm(int i, byte[] bArr) {
        zzs(i);
        zzE(0, i, bArr);
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final void zzn(int i, zzbhz zzbhzVar) {
        zzs(11);
        zze(2, i);
        zzs(26);
        zzp(zzbhzVar);
        zzs(12);
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final void zzo(int i, zzbim zzbimVar) {
        zzs(11);
        zze(2, i);
        zzk(3, zzbimVar);
        zzs(12);
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final void zzp(zzbhz zzbhzVar) {
        zzbjr zzbjrVar = (zzbjr) zzbhzVar;
        zzs(zzbjrVar.zzbD());
        zzbjrVar.zzbR(this);
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final void zzq(byte b) {
        if (this.zze == this.zzd) {
            zzM();
        }
        int i = this.zze;
        this.zzc[i] = b;
        this.zze = i + 1;
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final void zzr(int i) {
        if (i >= 0) {
            zzs(i);
        } else {
            zzu(i);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final void zzs(int i) {
        zzL(5);
        zzA(i);
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final void zzt(int i) {
        zzL(4);
        zzC(i);
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final void zzu(long j) {
        zzL(10);
        zzB(j);
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final void zzv(long j) {
        zzL(8);
        zzD(j);
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final void zzx(String str) {
        int length = str.length() * 3;
        int zzG = zzbiv.zzG(length);
        int i = zzG + length;
        int i2 = this.zzd;
        if (i > i2) {
            byte[] bArr = new byte[length];
            int zzb = zzbml.zzb(str, bArr, 0, length);
            zzs(zzb);
            zzE(0, zzb, bArr);
            return;
        }
        if (i > i2 - this.zze) {
            zzM();
        }
        int zzG2 = zzbiv.zzG(str.length());
        int i3 = this.zze;
        byte[] bArr2 = this.zzc;
        try {
            if (zzG2 == zzG) {
                int i4 = i3 + zzG2;
                this.zze = i4;
                int zzb2 = zzbml.zzb(str, bArr2, i4, i2 - i4);
                this.zze = i3;
                zzA((zzb2 - i3) - zzG2);
                this.zze = zzb2;
            } else {
                int zza = zzbml.zza(str);
                zzA(zza);
                this.zze = zzbml.zzb(str, bArr2, this.zze, zza);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzbit(e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final int zzz() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}
