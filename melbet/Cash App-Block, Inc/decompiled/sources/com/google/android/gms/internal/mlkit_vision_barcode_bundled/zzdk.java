package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class zzdk {
    public static final Logger zzb$1 = Logger.getLogger(zzdk.class.getName());
    public static final boolean zzc$1 = zzgz.zzh;
    public zzfe zza;
    public final byte[] zzb;
    public final int zzc;
    public int zzd;

    public zzdk(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            JWK$$ExternalSyntheticBUOutline0.m("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i)});
            throw null;
        }
        this.zzb = bArr;
        this.zzd = 0;
        this.zzc = i;
    }

    public static int zzA(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int zzB(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int zzz(String str) {
        int length;
        try {
            length = zzhe.zze(str);
        } catch (zzhd unused) {
            length = str.getBytes(zzep.zza).length;
        }
        return zzA(length) + length;
    }

    public final void zzb(byte b) {
        try {
            byte[] bArr = this.zzb;
            int i = this.zzd;
            this.zzd = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e);
        }
    }

    public final void zzc(int i, int i2, byte[] bArr) {
        try {
            System.arraycopy(bArr, i, this.zzb, this.zzd, i2);
            this.zzd += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i2)), e);
        }
    }

    public final void zze(int i, zzdf zzdfVar) {
        zzt((i << 3) | 2);
        zzt(zzdfVar.zzd());
        zzdfVar.zzm(this);
    }

    public final void zzf(int i, int i2) {
        zzt((i << 3) | 5);
        zzg(i2);
    }

    public final void zzg(int i) {
        try {
            byte[] bArr = this.zzb;
            int i2 = this.zzd;
            int i3 = i2 + 1;
            this.zzd = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.zzd = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.zzd = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.zzd = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e);
        }
    }

    public final void zzh(int i, long j) {
        zzt((i << 3) | 1);
        zzi(j);
    }

    public final void zzi(long j) {
        try {
            byte[] bArr = this.zzb;
            int i = this.zzd;
            int i2 = i + 1;
            this.zzd = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.zzd = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.zzd = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.zzd = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.zzd = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.zzd = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.zzd = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.zzd = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e);
        }
    }

    public final void zzj(int i, int i2) {
        zzt(i << 3);
        zzk(i2);
    }

    public final void zzk(int i) {
        if (i >= 0) {
            zzt(i);
        } else {
            zzv(i);
        }
    }

    public final void zzp(int i, String str) {
        zzt((i << 3) | 2);
        int i2 = this.zzd;
        try {
            int zzA = zzA(str.length() * 3);
            int zzA2 = zzA(str.length());
            int i3 = this.zzc;
            byte[] bArr = this.zzb;
            if (zzA2 != zzA) {
                zzt(zzhe.zze(str));
                int i4 = this.zzd;
                this.zzd = zzhe.zzd(str, bArr, i4, i3 - i4);
            } else {
                int i5 = i2 + zzA2;
                this.zzd = i5;
                int zzd = zzhe.zzd(str, bArr, i5, i3 - i5);
                this.zzd = i2;
                zzt((zzd - i2) - zzA2);
                this.zzd = zzd;
            }
        } catch (zzhd e) {
            this.zzd = i2;
            zzb$1.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = str.getBytes(zzep.zza);
            try {
                int length = bytes.length;
                zzt(length);
                zzc(0, length, bytes);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzdl(e2);
            }
        } catch (IndexOutOfBoundsException e3) {
            throw new zzdl(e3);
        }
    }

    public final void zzr(int i, int i2) {
        zzt((i << 3) | i2);
    }

    public final void zzs(int i, int i2) {
        zzt(i << 3);
        zzt(i2);
    }

    public final void zzt(int i) {
        while (true) {
            int i2 = i & (-128);
            int i3 = this.zzd;
            byte[] bArr = this.zzb;
            if (i2 == 0) {
                this.zzd = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    this.zzd = i3 + 1;
                    bArr[i3] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e);
                }
            }
            throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e);
        }
    }

    public final void zzu(int i, long j) {
        zzt(i << 3);
        zzv(j);
    }

    public final void zzv(long j) {
        boolean z = zzc$1;
        byte[] bArr = this.zzb;
        int i = this.zzc;
        if (!z || i - this.zzd < 10) {
            while (true) {
                long j2 = j & (-128);
                int i2 = this.zzd;
                if (j2 == 0) {
                    this.zzd = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    try {
                        this.zzd = i2 + 1;
                        bArr[i2] = (byte) ((((int) j) | 128) & 255);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(i), 1), e);
                    }
                }
                throw new zzdl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(i), 1), e);
            }
        }
        while (true) {
            long j3 = j & (-128);
            int i3 = (int) j;
            int i4 = this.zzd;
            if (j3 == 0) {
                this.zzd = i4 + 1;
                zzgz.zzf.zzd(bArr, zzgz.zza + i4, (byte) i3);
                return;
            }
            this.zzd = i4 + 1;
            zzgz.zzf.zzd(bArr, zzgz.zza + i4, (byte) ((i3 | 128) & 255));
            j >>>= 7;
        }
    }
}
