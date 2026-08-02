package com.google.android.libraries.places.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Locale;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzbis extends zzbiv {
    public final byte[] zzc;
    public final int zzd;
    public int zze;

    public zzbis(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            a$$ExternalSyntheticBUOutline0.m$2("buffer");
            throw null;
        }
        int i3 = i + i2;
        int length = bArr.length;
        if ((i | i2 | (length - i3)) < 0) {
            Locale locale = Locale.US;
            Handlers$$ExternalSyntheticBUOutline0.m(i2, Recorder$$ExternalSyntheticOutline2.m107m(length, i, "Array range is invalid. Buffer.length=", ", offset=", ", length="));
            throw null;
        }
        this.zzc = bArr;
        this.zze = i;
        this.zzd = i3;
    }

    @Override // com.google.android.libraries.places.internal.zzib
    public final void zza(int i, int i2, byte[] bArr) {
        zzw(i, i2, bArr);
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final void zzc(int i, int i2) {
        zzs((i << 3) | i2);
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final void zzd(int i, int i2) {
        zzs(i << 3);
        zzr(i2);
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final void zze(int i, int i2) {
        zzs(i << 3);
        zzs(i2);
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final void zzf(int i, int i2) {
        zzs((i << 3) | 5);
        zzt(i2);
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final void zzg(int i, long j) {
        zzs(i << 3);
        zzu(j);
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final void zzh(int i, long j) {
        zzs((i << 3) | 1);
        zzv(j);
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final void zzi(int i, boolean z) {
        zzs(i << 3);
        zzq(z ? (byte) 1 : (byte) 0);
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
        zzw(0, i, bArr);
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
        int i = this.zze;
        try {
            int i2 = i + 1;
            try {
                this.zzc[i] = b;
                this.zze = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new zzbit(i, this.zzd, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
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
        int i2;
        int i3 = this.zze;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.zzc;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.zze = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzbit(i2, this.zzd, 1, e);
                }
            }
            throw new zzbit(i2, this.zzd, 1, e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final void zzt(int i) {
        int i2 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.zze = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzbit(i2, this.zzd, 4, e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final void zzu(long j) {
        int i;
        int i2 = this.zze;
        byte[] bArr = this.zzc;
        int i3 = this.zzd;
        if (!zzbiv.zzc || i3 - i2 < 10) {
            while ((j & (-128)) != 0) {
                int i4 = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i2 = i4;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i = i4;
                    throw new zzbit(i, i3, 1, e);
                }
            }
            i = i2 + 1;
            try {
                bArr[i2] = (byte) j;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new zzbit(i, i3, 1, e);
            }
        } else {
            while ((j & (-128)) != 0) {
                zzbmg.zzo(bArr, i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            zzbmg.zzo(bArr, i2, (byte) j);
        }
        this.zze = i;
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final void zzv(long j) {
        int i = this.zze;
        try {
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
        } catch (IndexOutOfBoundsException e) {
            throw new zzbit(i, this.zzd, 8, e);
        }
    }

    public final void zzw(int i, int i2, byte[] bArr) {
        try {
            System.arraycopy(bArr, i, this.zzc, this.zze, i2);
            this.zze += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzbit(this.zze, this.zzd, i2, e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final void zzx(String str) {
        int i = this.zze;
        try {
            int zzG = zzbiv.zzG(str.length() * 3);
            int zzG2 = zzbiv.zzG(str.length());
            byte[] bArr = this.zzc;
            if (zzG2 != zzG) {
                zzs(zzbml.zza(str));
                int i2 = this.zze;
                this.zze = zzbml.zzb(str, bArr, i2, bArr.length - i2);
            } else {
                int i3 = i + zzG2;
                this.zze = i3;
                int zzb = zzbml.zzb(str, bArr, i3, bArr.length - i3);
                this.zze = i;
                zzs((zzb - i) - zzG2);
                this.zze = zzb;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new zzbit(e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbiv
    public final int zzz() {
        return this.zzd - this.zze;
    }
}
