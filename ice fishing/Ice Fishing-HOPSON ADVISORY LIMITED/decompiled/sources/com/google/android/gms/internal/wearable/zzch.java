package com.google.android.gms.internal.wearable;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
abstract class zzch extends zzcj {
    private final byte[] zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    /* synthetic */ zzch(byte[] bArr, int i, int i2, boolean z, byte[] bArr2) {
        super(null);
        this.zzi = Integer.MAX_VALUE;
        this.zzd = bArr;
        this.zze = i2;
        this.zzg = 0;
    }

    private final void zzH() {
        int i = this.zze + this.zzf;
        this.zze = i;
        int i2 = this.zzi;
        if (i <= i2) {
            this.zzf = 0;
            return;
        }
        int i3 = i - i2;
        this.zzf = i3;
        this.zze = i - i3;
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final void zzB(int i) {
        this.zzi = i;
        zzH();
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final boolean zzC() throws IOException {
        return this.zzg == this.zze;
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final int zzD() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final int zza() throws IOException {
        if (zzC()) {
            this.zzh = 0;
            return 0;
        }
        int zzt = zzt();
        this.zzh = zzt;
        if ((zzt >>> 3) != 0) {
            return zzt;
        }
        throw new zzdv("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final void zzb(int i) throws zzdv {
        if (this.zzh != 0) {
            throw new zzdv("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final double zzc() throws IOException {
        return Double.longBitsToDouble(zzz());
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final float zzd() throws IOException {
        return Float.intBitsToFloat(zzy());
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final long zze() throws IOException {
        return zzw();
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final long zzf() throws IOException {
        return zzw();
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final int zzg() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final long zzh() throws IOException {
        return zzz();
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final int zzi() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final boolean zzj() throws IOException {
        return zzw() != 0;
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final String zzk() throws IOException {
        int zzt = zzt();
        if (zzt > 0) {
            int i = this.zze;
            int i2 = this.zzg;
            if (zzt <= i - i2) {
                String str = new String(this.zzd, i2, zzt, StandardCharsets.UTF_8);
                this.zzg += zzt;
                return str;
            }
        }
        if (zzt == 0) {
            return "";
        }
        if (zzt < 0) {
            throw new zzdv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final String zzl() throws IOException {
        int zzt = zzt();
        if (zzt > 0) {
            int i = this.zze;
            int i2 = this.zzg;
            if (zzt <= i - i2) {
                String zzd = zzfu.zzd(this.zzd, i2, zzt);
                this.zzg += zzt;
                return zzd;
            }
        }
        if (zzt == 0) {
            return "";
        }
        if (zzt <= 0) {
            throw new zzdv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final zzcg zzm() throws IOException {
        int zzt = zzt();
        if (zzt > 0) {
            int i = this.zze;
            int i2 = this.zzg;
            if (zzt <= i - i2) {
                zzcg zzl = zzcg.zzl(this.zzd, i2, zzt, false);
                this.zzg += zzt;
                return zzl;
            }
        }
        if (zzt == 0) {
            return zzcg.zza;
        }
        if (zzt > 0) {
            int i3 = this.zze;
            int i4 = this.zzg;
            if (zzt <= i3 - i4) {
                int i5 = zzt + i4;
                this.zzg = i5;
                byte[] copyOfRange = Arrays.copyOfRange(this.zzd, i4, i5);
                zzcg zzcgVar = zzcg.zza;
                return copyOfRange.length == 0 ? zzcg.zza : new zzcf(copyOfRange);
            }
        }
        if (zzt <= 0) {
            throw new zzdv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final int zzn() throws IOException {
        return zzt();
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final int zzo() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final int zzp() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final long zzq() throws IOException {
        return zzz();
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final int zzr() throws IOException {
        return zzF(zzt());
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final long zzs() throws IOException {
        return zzG(zzw());
    }

    protected abstract int zzt() throws IOException;

    protected abstract int zzu() throws IOException;

    public final int zzy() throws IOException {
        int i = this.zzg;
        if (this.zze - i < 4) {
            throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zzd;
        this.zzg = i + 4;
        int i2 = bArr[i] & UByte.MAX_VALUE;
        int i3 = bArr[i + 1] & UByte.MAX_VALUE;
        int i4 = bArr[i + 2] & UByte.MAX_VALUE;
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public final long zzz() throws IOException {
        int i = this.zzg;
        if (this.zze - i < 8) {
            throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zzd;
        this.zzg = i + 8;
        long j = bArr[i];
        long j2 = bArr[i + 2];
        long j3 = bArr[i + 3];
        return ((bArr[i + 7] & 255) << 56) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // com.google.android.gms.internal.wearable.zzcj
    public final int zzA(int i) throws zzdv {
        if (i < 0) {
            throw new zzdv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = i + this.zzg;
        if (i2 < 0) {
            throw new zzdv("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i3 = this.zzi;
        if (i2 > i3) {
            throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzi = i2;
        zzH();
        return i3;
    }

    final long zzx() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.zzg;
            if (i2 == this.zze) {
                throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            byte[] bArr = this.zzd;
            this.zzg = i2 + 1;
            j |= (r3 & ByteCompanionObject.MAX_VALUE) << i;
            if ((bArr[i2] & ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw new zzdv("CodedInputStream encountered a malformed varint.");
    }

    protected final int zzv() throws IOException {
        int i;
        int i2 = this.zzg;
        int i3 = this.zze;
        if (i3 != i2) {
            byte[] bArr = this.zzd;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.zzg = i4;
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
                this.zzg = i5;
                return i;
            }
        }
        return (int) zzx();
    }

    public final long zzw() throws IOException {
        long j;
        long j2;
        long j3;
        int i = this.zzg;
        int i2 = this.zze;
        if (i2 != i) {
            byte[] bArr = this.zzd;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.zzg = i3;
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
                            long j5 = (bArr[i8] << 28) ^ i9;
                            if (j5 >= 0) {
                                j = j5 ^ 266354560;
                            } else {
                                i4 = i + 6;
                                long j6 = (bArr[i6] << 35) ^ j5;
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    int i10 = i + 7;
                                    long j7 = j6 ^ (bArr[i4] << 42);
                                    if (j7 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i4 = i + 8;
                                        j6 = j7 ^ (bArr[i10] << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i10 = i + 9;
                                            j7 = j6 ^ (bArr[i4] << 56);
                                            if (j7 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                i4 = i + 10;
                                                long j8 = j7 ^ (bArr[i10] << 63);
                                                if (j8 >= 0) {
                                                    j = j8 ^ (-9151873028817141888L);
                                                }
                                            }
                                        }
                                    }
                                    j = j7 ^ j2;
                                    i4 = i10;
                                }
                                j = j6 ^ j3;
                            }
                        }
                    }
                    i4 = i6;
                }
                this.zzg = i4;
                return j;
            }
        }
        return zzx();
    }
}
