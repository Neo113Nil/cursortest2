package com.google.android.gms.internal.measurement;

import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzacu extends zzacv {
    public final InputStream zze;
    public final byte[] zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    public int zzj;
    public int zzk;
    public int zzl = Integer.MAX_VALUE;

    public /* synthetic */ zzacu(InputStream inputStream, int i) {
        this.zze = inputStream;
        this.zzf = new byte[i < 8 ? 8 : i];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    public final void zzB() {
        int i = this.zzg + this.zzh;
        this.zzg = i;
        int i2 = this.zzk + i;
        int i3 = this.zzl;
        if (i2 <= i3) {
            this.zzh = 0;
            return;
        }
        int i4 = i2 - i3;
        this.zzh = i4;
        this.zzg = i - i4;
    }

    public final void zzC(int i) {
        if (zzI(i)) {
            return;
        }
        if (i > (Integer.MAX_VALUE - this.zzk) - this.zzi) {
            a$$ExternalSyntheticBUOutline0.m$5("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        } else {
            a$$ExternalSyntheticBUOutline0.m$5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzD(int i) {
        if (i < 0) {
            a$$ExternalSyntheticBUOutline0.m$5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i2 = this.zzk + this.zzi + i;
        if (i2 < 0) {
            a$$ExternalSyntheticBUOutline0.m$5("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        int i3 = this.zzl;
        if (i2 > i3) {
            a$$ExternalSyntheticBUOutline0.m$5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.zzl = i2;
        zzB();
        return i3;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void zzE(int i) {
        this.zzl = i;
        zzB();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzF() {
        int i = this.zzl;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.zzk + this.zzi);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final boolean zzG() {
        return this.zzi == this.zzg && !zzI(1);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzH() {
        return this.zzk + this.zzi;
    }

    public final boolean zzI(int i) {
        InputStream inputStream = this.zze;
        int i2 = this.zzi;
        int i3 = i2 + i;
        int i4 = this.zzg;
        if (i3 <= i4) {
            a$$ExternalSyntheticBUOutline0.m$1(re$$ExternalSyntheticOutline0.m(i, "refillBuffer() called when ", " bytes were already available in buffer", new StringBuilder(String.valueOf(i).length() + 66)));
            return false;
        }
        int i5 = this.zzk;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.zzl) {
            byte[] bArr = this.zzf;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                i5 = this.zzk + i2;
                this.zzk = i5;
                i4 = this.zzg - i2;
                this.zzg = i4;
                this.zzi = 0;
            }
            try {
                int read = inputStream.read(bArr, i4, Math.min(bArr.length - i4, (Integer.MAX_VALUE - i5) - i4));
                if (read == 0 || read < -1 || read > bArr.length) {
                    String valueOf = String.valueOf(inputStream.getClass());
                    StringBuilder sb = new StringBuilder(String.valueOf(read).length() + valueOf.length() + 39 + 41);
                    sb.append(valueOf);
                    sb.append("#read(byte[]) returned invalid result: ");
                    sb.append(read);
                    sb.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb.toString());
                }
                if (read > 0) {
                    this.zzg += read;
                    zzB();
                    if (this.zzg >= i || zzI(i)) {
                        return true;
                    }
                }
            } catch (zzaeh e) {
                e.zza = true;
                throw e;
            }
        }
        return false;
    }

    public final byte[] zzJ$1(int i) {
        byte[] zzU = zzU(i);
        if (zzU != null) {
            return zzU;
        }
        int i2 = this.zzi;
        int i3 = this.zzg;
        int i4 = i3 - i2;
        this.zzk += i3;
        this.zzi = 0;
        this.zzg = 0;
        ArrayList zzV = zzV(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.zzf, i2, bArr, 0, i4);
        Iterator it = zzV.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
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
        int i3 = this.zzg;
        int i4 = this.zzi;
        int i5 = i3 - i4;
        if (i5 > 0) {
            int min = Math.min(i2, i5);
            System.arraycopy(this.zzf, this.zzi, bArr, i, min);
            this.zzi += min;
            return min;
        }
        int min2 = Math.min(i2, (this.zzl - this.zzk) - i4);
        if (min2 <= 0) {
            return -1;
        }
        try {
            int read = this.zze.read(bArr, i, min2);
            if (read != -1) {
                this.zzk += read;
            }
            return read;
        } catch (zzaeh e) {
            e.zza = true;
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void zzL(int i) {
        InputStream inputStream = this.zze;
        int i2 = this.zzg;
        int i3 = this.zzi;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.zzi = i3 + i;
            return;
        }
        if (i < 0) {
            a$$ExternalSyntheticBUOutline0.m$5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return;
        }
        int i5 = this.zzk;
        int i6 = i5 + i3;
        int i7 = this.zzl;
        if (i6 + i > i7) {
            zzL((i7 - i5) - i3);
            a$$ExternalSyntheticBUOutline0.m$5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return;
        }
        this.zzk = i6;
        this.zzg = 0;
        this.zzi = 0;
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
                } catch (zzaeh e) {
                    e.zza = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.zzk += i4;
                zzB();
                throw th;
            }
        }
        this.zzk += i4;
        zzB();
        if (i4 >= i) {
            return;
        }
        int i8 = this.zzg;
        int i9 = i8 - this.zzi;
        this.zzi = i8;
        zzC(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.zzg;
            if (i10 <= i11) {
                this.zzi = i10;
                return;
            } else {
                i9 += i11;
                this.zzi = i11;
                zzC(1);
            }
        }
    }

    public final byte[] zzU(int i) {
        if (i == 0) {
            return zzaed.zza;
        }
        int i2 = this.zzk;
        int i3 = this.zzi;
        int i4 = i2 + i3 + i;
        if ((-2147483647) + i4 > 0) {
            a$$ExternalSyntheticBUOutline0.m$5("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return null;
        }
        int i5 = this.zzl;
        if (i4 > i5) {
            zzL((i5 - i2) - i3);
            a$$ExternalSyntheticBUOutline0.m$5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
        int i6 = this.zzg - i3;
        int i7 = i - i6;
        InputStream inputStream = this.zze;
        if (i7 >= 4096) {
            try {
                if (i7 > inputStream.available()) {
                    return null;
                }
            } catch (zzaeh e) {
                e.zza = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.zzf, this.zzi, bArr, 0, i6);
        this.zzk += this.zzg;
        this.zzi = 0;
        this.zzg = 0;
        while (i6 < i) {
            try {
                int read = inputStream.read(bArr, i6, i - i6);
                if (read == -1) {
                    a$$ExternalSyntheticBUOutline0.m$5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    return null;
                }
                this.zzk += read;
                i6 += read;
            } catch (zzaeh e2) {
                e2.zza = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList zzV(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                try {
                    int read = this.zze.read(bArr, i2, min - i2);
                    if (read == -1) {
                        a$$ExternalSyntheticBUOutline0.m$5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        return null;
                    }
                    this.zzk += read;
                    i2 += read;
                } catch (zzaeh e) {
                    e.zza = true;
                    throw e;
                }
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zza() {
        if (zzG()) {
            this.zzj = 0;
            return 0;
        }
        int zzx = zzx();
        this.zzj = zzx;
        if ((zzx >>> 3) != 0) {
            return zzx;
        }
        a$$ExternalSyntheticBUOutline0.m$5("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void zzb(int i) {
        if (this.zzj == i) {
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
                zzL(zzx());
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
        int i3 = this.zzg - this.zzi;
        byte[] bArr = this.zzf;
        if (i3 >= 10) {
            for (int i4 = 0; i4 < 10; i4++) {
                int i5 = this.zzi;
                this.zzi = i5 + 1;
                if (bArr[i5] < 0) {
                }
            }
            a$$ExternalSyntheticBUOutline0.m$5("CodedInputStream encountered a malformed varint.");
            return false;
        }
        for (int i6 = 0; i6 < 10; i6++) {
            if (this.zzi == this.zzg) {
                zzC(1);
            }
            int i7 = this.zzi;
            this.zzi = i7 + 1;
            if (bArr[i7] < 0) {
            }
        }
        a$$ExternalSyntheticBUOutline0.m$5("CodedInputStream encountered a malformed varint.");
        return false;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final double zzd() {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final float zze() {
        return Float.intBitsToFloat(zzw());
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
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzi() {
        return zzy();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzj() {
        return zzw();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final boolean zzk() {
        return zzz() != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final String zzl() {
        int zzx = zzx();
        byte[] bArr = this.zzf;
        if (zzx > 0) {
            int i = this.zzg;
            int i2 = this.zzi;
            if (zzx <= i - i2) {
                String str = new String(bArr, i2, zzx, StandardCharsets.UTF_8);
                this.zzi += zzx;
                return str;
            }
        }
        if (zzx == 0) {
            return "";
        }
        if (zzx < 0) {
            a$$ExternalSyntheticBUOutline0.m$5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        if (zzx > this.zzg) {
            return new String(zzJ$1(zzx), StandardCharsets.UTF_8);
        }
        zzC(zzx);
        String str2 = new String(bArr, this.zzi, zzx, StandardCharsets.UTF_8);
        this.zzi += zzx;
        return str2;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final String zzm() {
        int zzx = zzx();
        int i = this.zzi;
        int i2 = this.zzg;
        int i3 = i2 - i;
        byte[] bArr = this.zzf;
        if (zzx <= i3 && zzx > 0) {
            this.zzi = i + zzx;
        } else {
            if (zzx == 0) {
                return "";
            }
            if (zzx < 0) {
                a$$ExternalSyntheticBUOutline0.m$5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return null;
            }
            i = 0;
            if (zzx <= i2) {
                zzC(zzx);
                this.zzi = zzx;
            } else {
                bArr = zzJ$1(zzx);
            }
        }
        return zzagl.zzd(i, zzx, bArr);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final zzacq zzn() {
        int zzx = zzx();
        int i = this.zzg;
        int i2 = this.zzi;
        int i3 = i - i2;
        byte[] bArr = this.zzf;
        if (zzx <= i3 && zzx > 0) {
            zzacq zzk = zzacr.zzk(i2, zzx, bArr);
            this.zzi += zzx;
            return zzk;
        }
        if (zzx == 0) {
            return zzacr.zza;
        }
        if (zzx < 0) {
            a$$ExternalSyntheticBUOutline0.m$5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        byte[] zzU = zzU(zzx);
        if (zzU != null) {
            return zzacr.zzk(0, zzU.length, zzU);
        }
        int i4 = this.zzi;
        int i5 = this.zzg;
        int i6 = i5 - i4;
        this.zzk += i5;
        this.zzi = 0;
        this.zzg = 0;
        ArrayList zzV = zzV(zzx - i6);
        byte[] bArr2 = new byte[zzx];
        System.arraycopy(bArr, i4, bArr2, 0, i6);
        Iterator it = zzV.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i6, length);
            i6 += length;
        }
        try {
            zzacq zzacqVar = zzacr.zza;
            return zzx == 0 ? zzacr.zza : new zzacq(bArr2);
        } catch (zzaeh e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final byte[] zzo() {
        int zzx = zzx();
        int i = this.zzg;
        int i2 = this.zzi;
        if (zzx <= i - i2 && zzx > 0) {
            byte[] copyOfRange = Arrays.copyOfRange(this.zzf, i2, i2 + zzx);
            this.zzi += zzx;
            return copyOfRange;
        }
        if (zzx >= 0) {
            return zzJ$1(zzx);
        }
        a$$ExternalSyntheticBUOutline0.m$5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzp() {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzq() {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzr() {
        return zzw();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzs() {
        return zzy();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzt() {
        return zzacv.zzR(zzx());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzu() {
        return zzacv.zzS(zzz());
    }

    public final long zzv() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.zzi == this.zzg) {
                zzC(1);
            }
            int i2 = this.zzi;
            this.zzi = i2 + 1;
            j |= (r5 & Byte.MAX_VALUE) << i;
            if ((this.zzf[i2] & 128) == 0) {
                return j;
            }
        }
        a$$ExternalSyntheticBUOutline0.m$5("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    public final int zzw() {
        int i = this.zzi;
        if (this.zzg - i < 4) {
            zzC(4);
            i = this.zzi;
        }
        this.zzi = i + 4;
        byte[] bArr = this.zzf;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzx() {
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
        return (int) zzv();
    }

    public final long zzy() {
        int i = this.zzi;
        if (this.zzg - i < 8) {
            zzC(8);
            i = this.zzi;
        }
        this.zzi = i + 8;
        byte[] bArr = this.zzf;
        long j = bArr[i];
        long j2 = bArr[i + 2];
        long j3 = bArr[i + 3];
        long j4 = bArr[i + 4];
        return ((bArr[i + 7] & 255) << 56) | ((bArr[i + 1] & 255) << 8) | (j & 255) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((j4 & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzz() {
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
        return zzv();
    }
}
