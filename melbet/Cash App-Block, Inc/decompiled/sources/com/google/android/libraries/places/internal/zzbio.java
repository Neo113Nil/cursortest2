package com.google.android.libraries.places.internal;

import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzbio extends zzbiq {
    public final byte[] zzf;
    public int zzg;
    public int zzh;
    public int zzj;
    public int zzk = Integer.MAX_VALUE;
    public int zzi = 0;

    public /* synthetic */ zzbio(byte[] bArr, int i) {
        this.zzf = bArr;
        this.zzg = i;
    }

    public final long zzA() {
        int i = this.zzi;
        if (this.zzg - i < 8) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0L;
        }
        this.zzi = i + 8;
        byte[] bArr = this.zzf;
        long j = bArr[i];
        long j2 = bArr[i + 2];
        long j3 = bArr[i + 3];
        long j4 = bArr[i + 4];
        return ((bArr[i + 7] & 255) << 56) | ((bArr[i + 1] & 255) << 8) | (j & 255) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((j4 & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final int zzB(int i) {
        if (i < 0) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i2 = i + this.zzi;
        if (i2 < 0) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        int i3 = this.zzk;
        if (i2 > i3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.zzk = i2;
        int i4 = this.zzg + this.zzh;
        this.zzg = i4;
        if (i4 <= i2) {
            this.zzh = 0;
            return i3;
        }
        int i5 = i4 - i2;
        this.zzh = i5;
        this.zzg = i4 - i5;
        return i3;
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final void zzC(int i) {
        this.zzk = i;
        int i2 = this.zzg + this.zzh;
        this.zzg = i2;
        if (i2 <= i) {
            this.zzh = 0;
            return;
        }
        int i3 = i2 - i;
        this.zzh = i3;
        this.zzg = i2 - i3;
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final boolean zzD() {
        return this.zzi == this.zzg;
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final int zzE() {
        return this.zzi;
    }

    public final void zzG(int i) {
        if (i >= 0) {
            int i2 = this.zzg;
            int i3 = this.zzi;
            if (i <= i2 - i3) {
                this.zzi = i3 + i;
                return;
            }
        }
        if (i < 0) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else {
            AesGcmSiv$$ExternalSyntheticLambda0.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final int zza() {
        if (zzD()) {
            this.zzj = 0;
            return 0;
        }
        int zzw$com$google$android$libraries$places$internal$zzbin = zzw$com$google$android$libraries$places$internal$zzbin();
        this.zzj = zzw$com$google$android$libraries$places$internal$zzbin;
        if ((zzw$com$google$android$libraries$places$internal$zzbin >>> 3) != 0) {
            return zzw$com$google$android$libraries$places$internal$zzbin;
        }
        AesGcmSiv$$ExternalSyntheticLambda0.m("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final void zzb(int i) {
        if (this.zzj == i) {
            return;
        }
        AesGcmSiv$$ExternalSyntheticLambda0.m("Protocol message end-group tag did not match expected tag.");
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final boolean zzc(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                zzG(8);
                return true;
            }
            if (i2 == 2) {
                zzG(zzw$com$google$android$libraries$places$internal$zzbin());
                return true;
            }
            if (i2 == 3) {
                zzM();
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
                zzG(4);
                return true;
            }
            TransportImpl$$ExternalSyntheticLambda0.m$1();
            return false;
        }
        int i4 = this.zzg - this.zzi;
        byte[] bArr = this.zzf;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.zzi;
                this.zzi = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            AesGcmSiv$$ExternalSyntheticLambda0.m("CodedInputStream encountered a malformed varint.");
            return false;
        }
        while (i3 < 10) {
            int i6 = this.zzi;
            if (i6 == this.zzg) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return false;
            }
            this.zzi = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        AesGcmSiv$$ExternalSyntheticLambda0.m("CodedInputStream encountered a malformed varint.");
        return false;
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final double zzd() {
        return Double.longBitsToDouble(zzA());
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final float zze() {
        return Float.intBitsToFloat(zzz());
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final long zzf() {
        return zzx();
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final long zzg() {
        return zzx();
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final int zzh() {
        return zzw$com$google$android$libraries$places$internal$zzbin();
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final long zzi() {
        return zzA();
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final int zzj() {
        return zzz();
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final boolean zzk() {
        return zzx() != 0;
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final String zzl() {
        int zzw$com$google$android$libraries$places$internal$zzbin = zzw$com$google$android$libraries$places$internal$zzbin();
        if (zzw$com$google$android$libraries$places$internal$zzbin > 0) {
            int i = this.zzg;
            int i2 = this.zzi;
            if (zzw$com$google$android$libraries$places$internal$zzbin <= i - i2) {
                String str = new String(this.zzf, i2, zzw$com$google$android$libraries$places$internal$zzbin, StandardCharsets.UTF_8);
                this.zzi += zzw$com$google$android$libraries$places$internal$zzbin;
                return str;
            }
        }
        if (zzw$com$google$android$libraries$places$internal$zzbin == 0) {
            return "";
        }
        if (zzw$com$google$android$libraries$places$internal$zzbin < 0) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        AesGcmSiv$$ExternalSyntheticLambda0.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final String zzm() {
        int zzw$com$google$android$libraries$places$internal$zzbin = zzw$com$google$android$libraries$places$internal$zzbin();
        if (zzw$com$google$android$libraries$places$internal$zzbin > 0) {
            int i = this.zzg;
            int i2 = this.zzi;
            if (zzw$com$google$android$libraries$places$internal$zzbin <= i - i2) {
                String zzc = zzbml.zzc(i2, zzw$com$google$android$libraries$places$internal$zzbin, this.zzf);
                this.zzi += zzw$com$google$android$libraries$places$internal$zzbin;
                return zzc;
            }
        }
        if (zzw$com$google$android$libraries$places$internal$zzbin == 0) {
            return "";
        }
        if (zzw$com$google$android$libraries$places$internal$zzbin <= 0) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        AesGcmSiv$$ExternalSyntheticLambda0.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final zzbil zzn() {
        int zzw$com$google$android$libraries$places$internal$zzbin = zzw$com$google$android$libraries$places$internal$zzbin();
        byte[] bArr = this.zzf;
        if (zzw$com$google$android$libraries$places$internal$zzbin > 0) {
            int i = this.zzg;
            int i2 = this.zzi;
            if (zzw$com$google$android$libraries$places$internal$zzbin <= i - i2) {
                zzbil zzk = zzbim.zzk(i2, zzw$com$google$android$libraries$places$internal$zzbin, bArr);
                this.zzi += zzw$com$google$android$libraries$places$internal$zzbin;
                return zzk;
            }
        }
        if (zzw$com$google$android$libraries$places$internal$zzbin == 0) {
            return zzbim.zza;
        }
        if (zzw$com$google$android$libraries$places$internal$zzbin > 0) {
            int i3 = this.zzg;
            int i4 = this.zzi;
            if (zzw$com$google$android$libraries$places$internal$zzbin <= i3 - i4) {
                int i5 = zzw$com$google$android$libraries$places$internal$zzbin + i4;
                this.zzi = i5;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, i4, i5);
                zzbil zzbilVar = zzbim.zza;
                return copyOfRange.length == 0 ? zzbim.zza : new zzbil(copyOfRange);
            }
        }
        if (zzw$com$google$android$libraries$places$internal$zzbin <= 0) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        AesGcmSiv$$ExternalSyntheticLambda0.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final int zzo() {
        return zzw$com$google$android$libraries$places$internal$zzbin();
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final int zzp() {
        return zzw$com$google$android$libraries$places$internal$zzbin();
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final int zzq() {
        return zzz();
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final long zzr() {
        return zzA();
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final int zzs() {
        int zzw$com$google$android$libraries$places$internal$zzbin = zzw$com$google$android$libraries$places$internal$zzbin();
        return (zzw$com$google$android$libraries$places$internal$zzbin >>> 1) ^ (-(zzw$com$google$android$libraries$places$internal$zzbin & 1));
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final long zzt() {
        long zzx = zzx();
        return (zzx >>> 1) ^ (-(1 & zzx));
    }

    public final int zzw$com$google$android$libraries$places$internal$zzbin() {
        int i;
        int i2 = this.zzi;
        int i3 = this.zzg;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.zzf;
            byte b = bArr[i2];
            if (b >= 0) {
                this.zzi = i4;
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
                this.zzi = i5;
                return i;
            }
        }
        return (int) zzy();
    }

    public final long zzx() {
        long j;
        long j2;
        long j3;
        int i = this.zzi;
        int i2 = this.zzg;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.zzf;
            byte b = bArr[i];
            if (b >= 0) {
                this.zzi = i3;
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
                this.zzi = i4;
                return j;
            }
        }
        return zzy();
    }

    public final long zzy() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.zzi;
            if (i2 == this.zzg) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0L;
            }
            this.zzi = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.zzf[i2] & 128) == 0) {
                return j;
            }
        }
        AesGcmSiv$$ExternalSyntheticLambda0.m("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    public final int zzz() {
        int i = this.zzi;
        if (this.zzg - i < 4) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.zzi = i + 4;
        byte[] bArr = this.zzf;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }
}
