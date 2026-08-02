package com.google.android.gms.internal.measurement;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzact extends zzacv {
    public final byte[] zze;
    public int zzg;
    public int zzi;
    public int zzj = Integer.MAX_VALUE;
    public int zzf = 0;
    public int zzh = 0;

    public /* synthetic */ zzact(byte[] bArr) {
        this.zze = bArr;
    }

    public final long zzA() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.zzh;
            if (i2 == this.zzf) {
                a$$ExternalSyntheticBUOutline0.m$5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0L;
            }
            this.zzh = i2 + 1;
            j |= (r5 & Byte.MAX_VALUE) << i;
            if ((this.zze[i2] & 128) == 0) {
                return j;
            }
        }
        a$$ExternalSyntheticBUOutline0.m$5("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    public final int zzB() {
        int i = this.zzh;
        if (this.zzf - i < 4) {
            a$$ExternalSyntheticBUOutline0.m$5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.zzh = i + 4;
        byte[] bArr = this.zze;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public final long zzC() {
        int i = this.zzh;
        if (this.zzf - i < 8) {
            a$$ExternalSyntheticBUOutline0.m$5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0L;
        }
        this.zzh = i + 8;
        byte[] bArr = this.zze;
        long j = bArr[i];
        long j2 = bArr[i + 2];
        long j3 = bArr[i + 3];
        long j4 = bArr[i + 4];
        return ((bArr[i + 7] & 255) << 56) | ((bArr[i + 1] & 255) << 8) | (j & 255) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((j4 & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzD(int i) {
        if (i < 0) {
            a$$ExternalSyntheticBUOutline0.m$5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i2 = i + this.zzh;
        if (i2 < 0) {
            a$$ExternalSyntheticBUOutline0.m$5("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        int i3 = this.zzj;
        if (i2 > i3) {
            a$$ExternalSyntheticBUOutline0.m$5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.zzj = i2;
        int i4 = this.zzf + this.zzg;
        this.zzf = i4;
        if (i4 <= i2) {
            this.zzg = 0;
            return i3;
        }
        int i5 = i4 - i2;
        this.zzg = i5;
        this.zzf = i4 - i5;
        return i3;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void zzE(int i) {
        this.zzj = i;
        int i2 = this.zzf + this.zzg;
        this.zzf = i2;
        if (i2 <= i) {
            this.zzg = 0;
            return;
        }
        int i3 = i2 - i;
        this.zzg = i3;
        this.zzf = i2 - i3;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzF() {
        int i = this.zzj;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.zzh;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final boolean zzG() {
        return this.zzh == this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzH() {
        return this.zzh;
    }

    public final byte[] zzJ(int i) {
        if (i > 0) {
            int i2 = this.zzf;
            int i3 = this.zzh;
            if (i <= i2 - i3) {
                int i4 = i + i3;
                this.zzh = i4;
                return Arrays.copyOfRange(this.zze, i3, i4);
            }
        }
        if (i > 0) {
            a$$ExternalSyntheticBUOutline0.m$5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
        if (i == 0) {
            return zzaed.zza;
        }
        a$$ExternalSyntheticBUOutline0.m$5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzK(int i, int i2, byte[] bArr) {
        if ((bArr.length - i) - i2 < 0 || (i | i2) < 0) {
            JWK$$ExternalSyntheticBUOutline0.m2173m();
            return 0;
        }
        if (i2 == 0) {
            return 0;
        }
        int min = Math.min(i2, this.zzf - this.zzh);
        if (min == 0) {
            return -1;
        }
        System.arraycopy(this.zze, this.zzh, bArr, i, min);
        this.zzh += min;
        return min;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void zzL(int i) {
        if (i >= 0) {
            int i2 = this.zzf;
            int i3 = this.zzh;
            if (i <= i2 - i3) {
                this.zzh = i3 + i;
                return;
            }
        }
        if (i < 0) {
            a$$ExternalSyntheticBUOutline0.m$5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else {
            a$$ExternalSyntheticBUOutline0.m$5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zza() {
        if (zzG()) {
            this.zzi = 0;
            return 0;
        }
        int zzy$com$google$android$gms$internal$measurement$zzacs = zzy$com$google$android$gms$internal$measurement$zzacs();
        this.zzi = zzy$com$google$android$gms$internal$measurement$zzacs;
        if ((zzy$com$google$android$gms$internal$measurement$zzacs >>> 3) != 0) {
            return zzy$com$google$android$gms$internal$measurement$zzacs;
        }
        a$$ExternalSyntheticBUOutline0.m$5("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void zzb(int i) {
        if (this.zzi == i) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$5("Protocol message end-group tag did not match expected tag.");
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final boolean zzc(int i) {
        int i2 = i & 7;
        if (i2 != 0) {
            if (i2 == 1) {
                zzL(8);
                return true;
            }
            if (i2 == 2) {
                zzL(zzy$com$google$android$gms$internal$measurement$zzacs());
                return true;
            }
            if (i2 == 3) {
                zzQ();
                zzb(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                if (this.zzb == 0) {
                    zzb(0);
                }
                return false;
            }
            if (i2 == 5) {
                zzL(4);
                return true;
            }
            TransportImpl$$ExternalSyntheticLambda0.m();
            return false;
        }
        int i3 = this.zzf - this.zzh;
        byte[] bArr = this.zze;
        if (i3 >= 10) {
            for (int i4 = 0; i4 < 10; i4++) {
                int i5 = this.zzh;
                this.zzh = i5 + 1;
                if (bArr[i5] < 0) {
                }
            }
            a$$ExternalSyntheticBUOutline0.m$5("CodedInputStream encountered a malformed varint.");
            return false;
        }
        for (int i6 = 0; i6 < 10; i6++) {
            int i7 = this.zzh;
            if (i7 == this.zzf) {
                a$$ExternalSyntheticBUOutline0.m$5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return false;
            }
            this.zzh = i7 + 1;
            if (bArr[i7] < 0) {
            }
        }
        a$$ExternalSyntheticBUOutline0.m$5("CodedInputStream encountered a malformed varint.");
        return false;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final double zzd() {
        return Double.longBitsToDouble(zzC());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final float zze() {
        return Float.intBitsToFloat(zzB());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzf() {
        return zzz();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzg() {
        return zzz();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzh() {
        return zzy$com$google$android$gms$internal$measurement$zzacs();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzi() {
        return zzC();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzj() {
        return zzB();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final boolean zzk() {
        return zzz() != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final String zzl() {
        int zzy$com$google$android$gms$internal$measurement$zzacs = zzy$com$google$android$gms$internal$measurement$zzacs();
        if (zzy$com$google$android$gms$internal$measurement$zzacs > 0) {
            int i = this.zzf;
            int i2 = this.zzh;
            if (zzy$com$google$android$gms$internal$measurement$zzacs <= i - i2) {
                String str = new String(this.zze, i2, zzy$com$google$android$gms$internal$measurement$zzacs, StandardCharsets.UTF_8);
                this.zzh += zzy$com$google$android$gms$internal$measurement$zzacs;
                return str;
            }
        }
        if (zzy$com$google$android$gms$internal$measurement$zzacs == 0) {
            return "";
        }
        if (zzy$com$google$android$gms$internal$measurement$zzacs < 0) {
            a$$ExternalSyntheticBUOutline0.m$5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        a$$ExternalSyntheticBUOutline0.m$5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final String zzm() {
        int zzy$com$google$android$gms$internal$measurement$zzacs = zzy$com$google$android$gms$internal$measurement$zzacs();
        if (zzy$com$google$android$gms$internal$measurement$zzacs > 0) {
            int i = this.zzf;
            int i2 = this.zzh;
            if (zzy$com$google$android$gms$internal$measurement$zzacs <= i - i2) {
                String zzd = zzagl.zzd(i2, zzy$com$google$android$gms$internal$measurement$zzacs, this.zze);
                this.zzh += zzy$com$google$android$gms$internal$measurement$zzacs;
                return zzd;
            }
        }
        if (zzy$com$google$android$gms$internal$measurement$zzacs == 0) {
            return "";
        }
        if (zzy$com$google$android$gms$internal$measurement$zzacs <= 0) {
            a$$ExternalSyntheticBUOutline0.m$5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        a$$ExternalSyntheticBUOutline0.m$5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final zzacq zzn() {
        int zzy$com$google$android$gms$internal$measurement$zzacs = zzy$com$google$android$gms$internal$measurement$zzacs();
        if (zzy$com$google$android$gms$internal$measurement$zzacs > 0) {
            int i = this.zzf;
            int i2 = this.zzh;
            if (zzy$com$google$android$gms$internal$measurement$zzacs <= i - i2) {
                zzacq zzk = zzacr.zzk(i2, zzy$com$google$android$gms$internal$measurement$zzacs, this.zze);
                this.zzh += zzy$com$google$android$gms$internal$measurement$zzacs;
                return zzk;
            }
        }
        if (zzy$com$google$android$gms$internal$measurement$zzacs == 0) {
            return zzacr.zza;
        }
        byte[] zzJ = zzJ(zzy$com$google$android$gms$internal$measurement$zzacs);
        zzacq zzacqVar = zzacr.zza;
        return zzJ.length == 0 ? zzacr.zza : new zzacq(zzJ);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final byte[] zzo() {
        return zzJ(zzy$com$google$android$gms$internal$measurement$zzacs());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzp() {
        return zzy$com$google$android$gms$internal$measurement$zzacs();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzq() {
        return zzy$com$google$android$gms$internal$measurement$zzacs();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzr() {
        return zzB();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzs() {
        return zzC();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzt() {
        return zzacv.zzR(zzy$com$google$android$gms$internal$measurement$zzacs());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzu() {
        return zzacv.zzS(zzz());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzx() {
        return zzy$com$google$android$gms$internal$measurement$zzacs();
    }

    public final int zzy$com$google$android$gms$internal$measurement$zzacs() {
        int i;
        int i2 = this.zzh;
        int i3 = this.zzf;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.zze;
            byte b = bArr[i2];
            if (b >= 0) {
                this.zzh = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.zzh = i5;
                return i;
            }
        }
        return (int) zzA();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzz() {
        long j;
        long j2;
        long j3;
        int i = this.zzh;
        int i2 = this.zzf;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.zze;
            byte b = bArr[i];
            if (b >= 0) {
                this.zzh = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            long j4 = (-2080896) ^ i9;
                            i4 = i8;
                            j = j4;
                        } else {
                            i6 = i + 5;
                            long j5 = i9 ^ (bArr[i8] << 28);
                            if (j5 >= 0) {
                                j2 = 266354560;
                            } else {
                                int i10 = i + 6;
                                long j6 = j5 ^ (bArr[i6] << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i6 = i + 7;
                                    j5 = j6 ^ (bArr[i10] << 42);
                                    if (j5 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i10 = i + 8;
                                        j6 = j5 ^ (bArr[i6] << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i6 = i + 9;
                                            j5 = j6 ^ (bArr[i10] << 56);
                                            if (j5 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                int i11 = i + 10;
                                                long j7 = j5 ^ (bArr[i6] << 63);
                                                if (j7 >= 0) {
                                                    j = j7 ^ (-9151873028817141888L);
                                                    i4 = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j6 ^ j3;
                                i4 = i10;
                            }
                            j = j5 ^ j2;
                        }
                    }
                    i4 = i6;
                }
                this.zzh = i4;
                return j;
            }
        }
        return zzA();
    }
}
