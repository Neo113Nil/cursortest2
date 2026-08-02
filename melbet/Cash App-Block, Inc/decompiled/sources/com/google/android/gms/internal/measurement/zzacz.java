package com.google.android.gms.internal.measurement;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public final class zzacz extends zzada {
    public final byte[] zzc;
    public final int zzd;
    public int zze;
    public final OutputStream zzg;

    public zzacz(OutputStream outputStream, int i) {
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

    public final void zzA(long j) {
        boolean z = zzada.zzc;
        byte[] bArr = this.zzc;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = (int) j;
                int i2 = this.zze;
                if (j2 == 0) {
                    this.zze = i2 + 1;
                    zzagg.zzo(bArr, i2, (byte) i);
                    return;
                } else {
                    this.zze = i2 + 1;
                    zzagg.zzo(bArr, i2, (byte) (i | 128));
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

    public final void zzB(int i) {
        int i2 = this.zze;
        byte[] bArr = this.zzc;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.zze = i2 + 4;
    }

    public final void zzC(long j) {
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

    public final void zzD(int i, int i2, byte[] bArr) {
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
        zzK();
        int i7 = i2 - i5;
        if (i7 > i4) {
            this.zzg.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.zze = i7;
        }
    }

    public final void zzJ(int i) {
        if (this.zzd - this.zze < i) {
            zzK();
        }
    }

    public final void zzK() {
        this.zzg.write(this.zzc, 0, this.zze);
        this.zze = 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zza(int i, int i2, byte[] bArr) {
        zzD(i, i2, bArr);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzb(int i, int i2) {
        zzr((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzc(int i, int i2) {
        zzJ(20);
        zzz(i << 3);
        if (i2 >= 0) {
            zzz(i2);
        } else {
            zzA(i2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzd(int i, int i2) {
        zzJ(20);
        zzz(i << 3);
        zzz(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zze(int i, int i2) {
        zzJ(14);
        zzz((i << 3) | 5);
        zzB(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzf(int i, long j) {
        zzJ(20);
        zzz(i << 3);
        zzA(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzg(int i, long j) {
        zzJ(18);
        zzz((i << 3) | 1);
        zzC(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzh(int i, boolean z) {
        zzJ(11);
        zzz(i << 3);
        int i2 = this.zze;
        this.zzc[i2] = z ? (byte) 1 : (byte) 0;
        this.zze = i2 + 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzi(int i, String str) {
        zzr((i << 3) | 2);
        zzw(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzj(int i, zzacr zzacrVar) {
        zzr((i << 3) | 2);
        zzk(zzacrVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzk(zzacr zzacrVar) {
        zzr(zzacrVar.zzb());
        zzacrVar.zze(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzl(int i, byte[] bArr) {
        zzr(i);
        zzD(0, i, bArr);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzo(zzacb zzacbVar) {
        zzadu zzaduVar = (zzadu) zzacbVar;
        zzr(zzaduVar.zzcq());
        zzaduVar.zzcH(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzp(byte b) {
        if (this.zze == this.zzd) {
            zzK();
        }
        int i = this.zze;
        this.zzc[i] = b;
        this.zze = i + 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzq(int i) {
        if (i >= 0) {
            zzr(i);
        } else {
            zzt(i);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzr(int i) {
        zzJ(5);
        zzz(i);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzs(int i) {
        zzJ(4);
        zzB(i);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzt(long j) {
        zzJ(10);
        zzA(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzu(long j) {
        zzJ(8);
        zzC(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzw(String str) {
        int length = str.length() * 3;
        int zzE = zzada.zzE(length);
        int i = zzE + length;
        int i2 = this.zzd;
        if (i > i2) {
            byte[] bArr = new byte[length];
            int zzc = zzagl.zzc(str, bArr, 0, length);
            zzr(zzc);
            zzD(0, zzc, bArr);
            return;
        }
        if (i > i2 - this.zze) {
            zzK();
        }
        int zzE2 = zzada.zzE(str.length());
        int i3 = this.zze;
        byte[] bArr2 = this.zzc;
        try {
            if (zzE2 == zzE) {
                int i4 = i3 + zzE2;
                this.zze = i4;
                int zzc2 = zzagl.zzc(str, bArr2, i4, i2 - i4);
                this.zze = i3;
                zzz((zzc2 - i3) - zzE2);
                this.zze = zzc2;
            } else {
                int zzb = zzagl.zzb(str);
                zzz(zzb);
                this.zze = zzagl.zzc(str, bArr2, this.zze, zzb);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzacy(e);
        }
    }

    public final void zzx() {
        if (this.zze > 0) {
            zzK();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final int zzy() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    public final void zzz(int i) {
        boolean z = zzada.zzc;
        byte[] bArr = this.zzc;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.zze;
                if (i2 == 0) {
                    this.zze = i3 + 1;
                    zzagg.zzo(bArr, i3, (byte) i);
                    return;
                } else {
                    this.zze = i3 + 1;
                    zzagg.zzo(bArr, i3, (byte) (i | 128));
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
}
