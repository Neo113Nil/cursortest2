package com.google.android.libraries.places.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzbip extends zzbiq {
    public final InputStream zzf;
    public int zzi;
    public int zzk;
    public int zzm = Integer.MAX_VALUE;
    public final byte[] zzg = new byte[4096];
    public int zzh = 0;
    public int zzj = 0;
    public int zzl = 0;

    public /* synthetic */ zzbip(InputStream inputStream) {
        this.zzf = inputStream;
    }

    public final void zzA(int i) {
        InputStream inputStream = this.zzf;
        int i2 = this.zzh;
        int i3 = this.zzj;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.zzj = i3 + i;
            return;
        }
        if (i < 0) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return;
        }
        int i5 = this.zzl;
        int i6 = i5 + i3;
        int i7 = this.zzm;
        if (i6 + i > i7) {
            zzA((i7 - i5) - i3);
            AesGcmSiv$$ExternalSyntheticLambda0.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return;
        }
        this.zzl = i6;
        this.zzh = 0;
        this.zzj = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long skip = inputStream.skip(j);
                    if (skip < 0 || skip > j) {
                        String valueOf = String.valueOf(inputStream.getClass());
                        StringBuilder sb = new StringBuilder(valueOf.length() + 31 + String.valueOf(skip).length() + 41);
                        sb.append(valueOf);
                        sb.append("#skip returned invalid result: ");
                        sb.append(skip);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb.toString());
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i4 += (int) skip;
                    }
                } catch (zzbke e) {
                    e.zza = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.zzl += i4;
                zzF();
                throw th;
            }
        }
        this.zzl += i4;
        zzF();
        if (i4 >= i) {
            return;
        }
        int i8 = this.zzh;
        int i9 = i8 - this.zzj;
        this.zzj = i8;
        zzG$1(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.zzh;
            if (i10 <= i11) {
                this.zzj = i10;
                return;
            } else {
                i9 += i11;
                this.zzj = i11;
                zzG$1(1);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final int zzB(int i) {
        if (i < 0) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i2 = this.zzl + this.zzj + i;
        if (i2 < 0) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        int i3 = this.zzm;
        if (i2 > i3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.zzm = i2;
        zzF();
        return i3;
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final void zzC(int i) {
        this.zzm = i;
        zzF();
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final boolean zzD() {
        return this.zzj == this.zzh && !zzQ(1);
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final int zzE() {
        return this.zzl + this.zzj;
    }

    public final void zzF() {
        int i = this.zzh + this.zzi;
        this.zzh = i;
        int i2 = this.zzl + i;
        int i3 = this.zzm;
        if (i2 <= i3) {
            this.zzi = 0;
            return;
        }
        int i4 = i2 - i3;
        this.zzi = i4;
        this.zzh = i - i4;
    }

    public final void zzG$1(int i) {
        if (zzQ(i)) {
            return;
        }
        if (i > (Integer.MAX_VALUE - this.zzl) - this.zzj) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        } else {
            AesGcmSiv$$ExternalSyntheticLambda0.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final boolean zzQ(int i) {
        InputStream inputStream = this.zzf;
        int i2 = this.zzj;
        int i3 = i2 + i;
        int i4 = this.zzh;
        if (i3 <= i4) {
            a$$ExternalSyntheticBUOutline0.m$1(re$$ExternalSyntheticOutline0.m(i, "refillBuffer() called when ", " bytes were already available in buffer", new StringBuilder(String.valueOf(i).length() + 66)));
            return false;
        }
        int i5 = this.zzl;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.zzm) {
            byte[] bArr = this.zzg;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                i5 = this.zzl + i2;
                this.zzl = i5;
                i4 = this.zzh - i2;
                this.zzh = i4;
                this.zzj = 0;
            }
            try {
                int read = inputStream.read(bArr, i4, Math.min(4096 - i4, (Integer.MAX_VALUE - i5) - i4));
                if (read == 0 || read < -1 || read > 4096) {
                    String valueOf = String.valueOf(inputStream.getClass());
                    StringBuilder sb = new StringBuilder(String.valueOf(read).length() + valueOf.length() + 39 + 41);
                    sb.append(valueOf);
                    sb.append("#read(byte[]) returned invalid result: ");
                    sb.append(read);
                    sb.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb.toString());
                }
                if (read > 0) {
                    this.zzh += read;
                    zzF();
                    if (this.zzh >= i || zzQ(i)) {
                        return true;
                    }
                }
            } catch (zzbke e) {
                e.zza = true;
                throw e;
            }
        }
        return false;
    }

    public final byte[] zzR(int i) {
        byte[] zzS = zzS(i);
        if (zzS != null) {
            return zzS;
        }
        int i2 = this.zzj;
        int i3 = this.zzh;
        int i4 = i3 - i2;
        this.zzl += i3;
        this.zzj = 0;
        this.zzh = 0;
        ArrayList zzT = zzT(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.zzg, i2, bArr, 0, i4);
        Iterator it = zzT.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    public final byte[] zzS(int i) {
        if (i == 0) {
            return zzbkc.zza;
        }
        int i2 = this.zzl;
        int i3 = this.zzj;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return null;
        }
        int i5 = this.zzm;
        if (i4 > i5) {
            zzA((i5 - i2) - i3);
            AesGcmSiv$$ExternalSyntheticLambda0.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
        int i6 = this.zzh - i3;
        int i7 = i - i6;
        InputStream inputStream = this.zzf;
        if (i7 >= 4096) {
            try {
                if (i7 > inputStream.available()) {
                    return null;
                }
            } catch (zzbke e) {
                e.zza = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.zzg, this.zzj, bArr, 0, i6);
        this.zzl += this.zzh;
        this.zzj = 0;
        this.zzh = 0;
        while (i6 < i) {
            try {
                int read = inputStream.read(bArr, i6, i - i6);
                if (read == -1) {
                    AesGcmSiv$$ExternalSyntheticLambda0.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    return null;
                }
                this.zzl += read;
                i6 += read;
            } catch (zzbke e2) {
                e2.zza = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList zzT(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                try {
                    int read = this.zzf.read(bArr, i2, min - i2);
                    if (read == -1) {
                        AesGcmSiv$$ExternalSyntheticLambda0.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        return null;
                    }
                    this.zzl += read;
                    i2 += read;
                } catch (zzbke e) {
                    e.zza = true;
                    throw e;
                }
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final int zza() {
        if (zzD()) {
            this.zzk = 0;
            return 0;
        }
        int zzu = zzu();
        this.zzk = zzu;
        if ((zzu >>> 3) != 0) {
            return zzu;
        }
        AesGcmSiv$$ExternalSyntheticLambda0.m("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final void zzb(int i) {
        if (this.zzk == i) {
            return;
        }
        AesGcmSiv$$ExternalSyntheticLambda0.m("Protocol message end-group tag did not match expected tag.");
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final boolean zzc(int i) {
        int i2 = i & 7;
        if (i2 != 0) {
            if (i2 == 1) {
                zzA(8);
                return true;
            }
            if (i2 == 2) {
                zzA(zzu());
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
                zzA(4);
                return true;
            }
            TransportImpl$$ExternalSyntheticLambda0.m$1();
            return false;
        }
        int i3 = this.zzh - this.zzj;
        byte[] bArr = this.zzg;
        if (i3 >= 10) {
            for (int i4 = 0; i4 < 10; i4++) {
                int i5 = this.zzj;
                this.zzj = i5 + 1;
                if (bArr[i5] < 0) {
                }
            }
            AesGcmSiv$$ExternalSyntheticLambda0.m("CodedInputStream encountered a malformed varint.");
            return false;
        }
        for (int i6 = 0; i6 < 10; i6++) {
            if (this.zzj == this.zzh) {
                zzG$1(1);
            }
            int i7 = this.zzj;
            this.zzj = i7 + 1;
            if (bArr[i7] < 0) {
            }
        }
        AesGcmSiv$$ExternalSyntheticLambda0.m("CodedInputStream encountered a malformed varint.");
        return false;
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final double zzd() {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final float zze() {
        return Float.intBitsToFloat(zzx());
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final long zzf() {
        return zzv();
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final long zzg() {
        return zzv();
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final int zzh() {
        return zzu();
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final long zzi() {
        return zzy();
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final int zzj() {
        return zzx();
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final boolean zzk() {
        return zzv() != 0;
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final String zzl() {
        int zzu = zzu();
        byte[] bArr = this.zzg;
        if (zzu > 0) {
            int i = this.zzh;
            int i2 = this.zzj;
            if (zzu <= i - i2) {
                String str = new String(bArr, i2, zzu, StandardCharsets.UTF_8);
                this.zzj += zzu;
                return str;
            }
        }
        if (zzu == 0) {
            return "";
        }
        if (zzu < 0) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        if (zzu > this.zzh) {
            return new String(zzR(zzu), StandardCharsets.UTF_8);
        }
        zzG$1(zzu);
        String str2 = new String(bArr, this.zzj, zzu, StandardCharsets.UTF_8);
        this.zzj += zzu;
        return str2;
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final String zzm() {
        int zzu = zzu();
        int i = this.zzj;
        int i2 = this.zzh;
        int i3 = i2 - i;
        byte[] bArr = this.zzg;
        if (zzu <= i3 && zzu > 0) {
            this.zzj = i + zzu;
        } else {
            if (zzu == 0) {
                return "";
            }
            if (zzu < 0) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return null;
            }
            i = 0;
            if (zzu <= i2) {
                zzG$1(zzu);
                this.zzj = zzu;
            } else {
                bArr = zzR(zzu);
            }
        }
        return zzbml.zzc(i, zzu, bArr);
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final zzbil zzn() {
        int zzu = zzu();
        int i = this.zzh;
        int i2 = this.zzj;
        int i3 = i - i2;
        byte[] bArr = this.zzg;
        if (zzu <= i3 && zzu > 0) {
            zzbil zzk = zzbim.zzk(i2, zzu, bArr);
            this.zzj += zzu;
            return zzk;
        }
        if (zzu == 0) {
            return zzbim.zza;
        }
        if (zzu < 0) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        byte[] zzS = zzS(zzu);
        if (zzS != null) {
            return zzbim.zzk(0, zzS.length, zzS);
        }
        int i4 = this.zzj;
        int i5 = this.zzh;
        int i6 = i5 - i4;
        this.zzl += i5;
        this.zzj = 0;
        this.zzh = 0;
        ArrayList zzT = zzT(zzu - i6);
        byte[] bArr2 = new byte[zzu];
        System.arraycopy(bArr, i4, bArr2, 0, i6);
        Iterator it = zzT.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i6, length);
            i6 += length;
        }
        try {
            zzbil zzbilVar = zzbim.zza;
            return zzu == 0 ? zzbim.zza : new zzbil(bArr2);
        } catch (zzbke e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final int zzo() {
        return zzu();
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final int zzp() {
        return zzu();
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final int zzq() {
        return zzx();
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final long zzr() {
        return zzy();
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final int zzs() {
        int zzu = zzu();
        return (zzu >>> 1) ^ (-(zzu & 1));
    }

    @Override // com.google.android.libraries.places.internal.zzbiq
    public final long zzt() {
        long zzv = zzv();
        return (zzv >>> 1) ^ (-(1 & zzv));
    }

    public final int zzu() {
        int i;
        int i2 = this.zzj;
        int i3 = this.zzh;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.zzg;
            byte b = bArr[i2];
            if (b >= 0) {
                this.zzj = i4;
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
                this.zzj = i5;
                return i;
            }
        }
        return (int) zzw();
    }

    public final long zzv() {
        long j;
        long j2;
        long j3;
        int i = this.zzj;
        int i2 = this.zzh;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.zzg;
            byte b = bArr[i];
            if (b >= 0) {
                this.zzj = i3;
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
                this.zzj = i4;
                return j;
            }
        }
        return zzw();
    }

    public final long zzw() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.zzj == this.zzh) {
                zzG$1(1);
            }
            int i2 = this.zzj;
            this.zzj = i2 + 1;
            j |= (r5 & Byte.MAX_VALUE) << i;
            if ((this.zzg[i2] & 128) == 0) {
                return j;
            }
        }
        AesGcmSiv$$ExternalSyntheticLambda0.m("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    public final int zzx() {
        int i = this.zzj;
        if (this.zzh - i < 4) {
            zzG$1(4);
            i = this.zzj;
        }
        this.zzj = i + 4;
        byte[] bArr = this.zzg;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public final long zzy() {
        int i = this.zzj;
        if (this.zzh - i < 8) {
            zzG$1(8);
            i = this.zzj;
        }
        this.zzj = i + 8;
        byte[] bArr = this.zzg;
        long j = bArr[i];
        long j2 = bArr[i + 2];
        long j3 = bArr[i + 3];
        long j4 = bArr[i + 4];
        return ((bArr[i + 7] & 255) << 56) | ((bArr[i + 1] & 255) << 8) | (j & 255) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((j4 & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}
