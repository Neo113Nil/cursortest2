package com.google.android.gms.internal.measurement;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class zzacx extends zzada {
    public final byte[] zzc;
    public final int zzd;
    public int zze;

    public zzacx(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("Array range is invalid. Buffer.length=", length, i, ", offset=0, length="));
            throw null;
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zza(int i, int i2, byte[] bArr) {
        zzv(i, i2, bArr);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzb(int i, int i2) {
        zzr((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzc(int i, int i2) {
        zzr(i << 3);
        zzq(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzd(int i, int i2) {
        zzr(i << 3);
        zzr(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zze(int i, int i2) {
        zzr((i << 3) | 5);
        zzs(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzf(int i, long j) {
        zzr(i << 3);
        zzt(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzg(int i, long j) {
        zzr((i << 3) | 1);
        zzu(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzh(int i, boolean z) {
        zzr(i << 3);
        zzp(z ? (byte) 1 : (byte) 0);
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
        zzv(0, i, bArr);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzo(zzacb zzacbVar) {
        zzadu zzaduVar = (zzadu) zzacbVar;
        zzr(zzaduVar.zzcq());
        zzaduVar.zzcH(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzp(byte b) {
        int i = this.zze;
        try {
            int i2 = i + 1;
            try {
                this.zzc[i] = b;
                this.zze = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new zzacy(i, this.zzd, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
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
                    throw new zzacy(i2, this.zzd, 1, e);
                }
            }
            throw new zzacy(i2, this.zzd, 1, e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzs(int i) {
        int i2 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.zze = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzacy(i2, this.zzd, 4, e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzt(long j) {
        int i;
        int i2 = this.zze;
        byte[] bArr = this.zzc;
        int i3 = this.zzd;
        if (!zzada.zzc || i3 - i2 < 10) {
            while ((j & (-128)) != 0) {
                int i4 = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i2 = i4;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i = i4;
                    throw new zzacy(i, i3, 1, e);
                }
            }
            i = i2 + 1;
            try {
                bArr[i2] = (byte) j;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new zzacy(i, i3, 1, e);
            }
        } else {
            while ((j & (-128)) != 0) {
                zzagg.zzo(bArr, i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            zzagg.zzo(bArr, i2, (byte) j);
        }
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzu(long j) {
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
            throw new zzacy(i, this.zzd, 8, e);
        }
    }

    public final void zzv(int i, int i2, byte[] bArr) {
        try {
            System.arraycopy(bArr, i, this.zzc, this.zze, i2);
            this.zze += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzacy(this.zze, this.zzd, i2, e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final void zzw(String str) {
        int i = this.zze;
        try {
            int zzE = zzada.zzE(str.length() * 3);
            int zzE2 = zzada.zzE(str.length());
            byte[] bArr = this.zzc;
            if (zzE2 != zzE) {
                zzr(zzagl.zzb(str));
                int i2 = this.zze;
                this.zze = zzagl.zzc(str, bArr, i2, bArr.length - i2);
            } else {
                int i3 = i + zzE2;
                this.zze = i3;
                int zzc = zzagl.zzc(str, bArr, i3, bArr.length - i3);
                this.zze = i;
                zzr((zzc - i) - zzE2);
                this.zze = zzc;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new zzacy(e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzada
    public final int zzy() {
        return this.zzd - this.zze;
    }
}
