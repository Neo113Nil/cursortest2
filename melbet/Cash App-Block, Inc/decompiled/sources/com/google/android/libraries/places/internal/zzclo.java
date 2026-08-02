package com.google.android.libraries.places.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzclo implements Cloneable, ByteChannel, ReadableByteChannel, zzcme, zzclp {
    public zzclz zza;
    public long zzb;

    public final Object clone() {
        zzclo zzcloVar = new zzclo();
        if (this.zzb == 0) {
            return zzcloVar;
        }
        zzclz zzclzVar = this.zza;
        zzclzVar.getClass();
        zzclz zza = zzclzVar.zza();
        zzcloVar.zza = zza;
        zza.zzg = zza;
        zza.zzf = zza;
        for (zzclz zzclzVar2 = zzclzVar.zzf; zzclzVar2 != zzclzVar; zzclzVar2 = zzclzVar2.zzf) {
            zzclz zzclzVar3 = zza.zzg;
            zzclzVar3.getClass();
            zzclzVar2.getClass();
            zzclzVar3.zzc(zzclzVar2.zza());
        }
        zzcloVar.zzb = this.zzb;
        return zzcloVar;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, com.google.android.libraries.places.internal.zzcmc
    public final void close() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzclo)) {
            return false;
        }
        long j = this.zzb;
        zzclo zzcloVar = (zzclo) obj;
        if (j != zzcloVar.zzb) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        zzclz zzclzVar = this.zza;
        zzclzVar.getClass();
        zzclz zzclzVar2 = zzcloVar.zza;
        zzclzVar2.getClass();
        int i = zzclzVar.zzb;
        int i2 = zzclzVar2.zzb;
        long j2 = 0;
        while (j2 < this.zzb) {
            long min = Math.min(zzclzVar.zzc - i, zzclzVar2.zzc - i2);
            long j3 = 0;
            while (j3 < min) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (zzclzVar.zza[i] != zzclzVar2.zza[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == zzclzVar.zzc) {
                zzclzVar = zzclzVar.zzf;
                zzclzVar.getClass();
                i = zzclzVar.zzb;
            }
            if (i2 == zzclzVar2.zzc) {
                zzclzVar2 = zzclzVar2.zzf;
                zzclzVar2.getClass();
                i2 = zzclzVar2.zzb;
            }
            j2 += min;
        }
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzcmc, java.io.Flushable
    public final void flush() {
    }

    public final int hashCode() {
        zzclz zzclzVar = this.zza;
        if (zzclzVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = zzclzVar.zzc;
            for (int i3 = zzclzVar.zzb; i3 < i2; i3++) {
                i = (i * 31) + zzclzVar.zza[i3];
            }
            zzclzVar = zzclzVar.zzf;
            zzclzVar.getClass();
        } while (zzclzVar != this.zza);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        zzclz zzclzVar = this.zza;
        if (zzclzVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), zzclzVar.zzc - zzclzVar.zzb);
        byteBuffer.put(zzclzVar.zza, zzclzVar.zzb, min);
        int i = zzclzVar.zzb + min;
        zzclzVar.zzb = i;
        this.zzb -= min;
        if (i == zzclzVar.zzc) {
            this.zza = zzclzVar.zzb();
            zzcma.zzb(zzclzVar);
        }
        return min;
    }

    public final String toString() {
        return zzF().toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            zzclz zzE = zzE(1);
            int min = Math.min(i, 8192 - zzE.zzc);
            byteBuffer.get(zzE.zza, zzE.zzc, min);
            i -= min;
            zzE.zzc += min;
        }
        this.zzb += remaining;
        return remaining;
    }

    public final void zzA(int i) {
        zzclz zzE = zzE(1);
        byte[] bArr = zzE.zza;
        int i2 = zzE.zzc;
        zzE.zzc = i2 + 1;
        bArr[i2] = (byte) i;
        this.zzb++;
    }

    public final zzclz zzE(int i) {
        if (i <= 0) {
            a$$ExternalSyntheticBUOutline0.m$3("unexpected capacity");
            return null;
        }
        zzclz zzclzVar = this.zza;
        if (zzclzVar == null) {
            zzclz zza = zzcma.zza();
            this.zza = zza;
            zza.zzg = zza;
            zza.zzf = zza;
            return zza;
        }
        zzclz zzclzVar2 = zzclzVar.zzg;
        zzclzVar2.getClass();
        if (zzclzVar2.zzc + i <= 8192 && zzclzVar2.zze) {
            return zzclzVar2;
        }
        zzclz zza2 = zzcma.zza();
        zzclzVar2.zzc(zza2);
        return zza2;
    }

    public final zzcls zzF() {
        long j = this.zzb;
        if (j <= 2147483647L) {
            return zzG((int) j);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 22);
        sb.append("size > Int.MAX_VALUE: ");
        sb.append(j);
        throw new IllegalStateException(sb.toString());
    }

    public final zzcls zzG(int i) {
        if (i == 0) {
            return zzcls.zza;
        }
        zzkf.zza(this.zzb, 0L, i);
        zzclz zzclzVar = this.zza;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            zzclzVar.getClass();
            int i5 = zzclzVar.zzc;
            int i6 = zzclzVar.zzb;
            if (i5 == i6) {
                a$$ExternalSyntheticBUOutline0.m$1((Object) "s.limit == s.pos");
                return null;
            }
            i3 += i5 - i6;
            i4++;
            zzclzVar = zzclzVar.zzf;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 + i4];
        zzclz zzclzVar2 = this.zza;
        int i7 = 0;
        while (i2 < i) {
            zzclzVar2.getClass();
            bArr[i7] = zzclzVar2.zza;
            i2 += zzclzVar2.zzc - zzclzVar2.zzb;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = zzclzVar2.zzb;
            zzclzVar2.zzd = true;
            i7++;
            zzclzVar2 = zzclzVar2.zzf;
        }
        return new zzcmb(bArr, iArr);
    }

    @Override // com.google.android.libraries.places.internal.zzcme
    public final long zza(zzclo zzcloVar, long j) {
        if (j < 0) {
            TransportImpl$$ExternalSyntheticLambda0.m(j, "byteCount < 0: ", String.valueOf(j).length() + 15);
            return 0L;
        }
        long j2 = this.zzb;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        zzcloVar.zzc(this, j);
        return j;
    }

    @Override // com.google.android.libraries.places.internal.zzcmc
    public final void zzc(zzclo zzcloVar, long j) {
        zzclz zza;
        zzcloVar.getClass();
        if (zzcloVar == this) {
            a$$ExternalSyntheticBUOutline0.m$3("source == this");
            return;
        }
        zzkf.zza(zzcloVar.zzb, 0L, j);
        while (j > 0) {
            zzclz zzclzVar = zzcloVar.zza;
            zzclzVar.getClass();
            int i = zzclzVar.zzc;
            zzclz zzclzVar2 = zzcloVar.zza;
            zzclzVar2.getClass();
            long j2 = i - zzclzVar2.zzb;
            int i2 = 0;
            if (j < j2) {
                zzclz zzclzVar3 = this.zza;
                zzclz zzclzVar4 = zzclzVar3 != null ? zzclzVar3.zzg : null;
                int i3 = (int) j;
                if (zzclzVar4 != null && zzclzVar4.zze) {
                    if ((zzclzVar4.zzc + j) - (zzclzVar4.zzd ? 0 : zzclzVar4.zzb) <= 8192) {
                        zzclz zzclzVar5 = zzcloVar.zza;
                        zzclzVar5.getClass();
                        zzclzVar5.zze(zzclzVar4, i3);
                        zzcloVar.zzb -= j;
                        this.zzb += j;
                        return;
                    }
                }
                zzclz zzclzVar6 = zzcloVar.zza;
                zzclzVar6.getClass();
                if (i3 > zzclzVar6.zzc - zzclzVar6.zzb) {
                    a$$ExternalSyntheticBUOutline0.m$3("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    zza = zzclzVar6.zza();
                } else {
                    byte[] bArr = zzclzVar6.zza;
                    zza = zzcma.zza();
                    byte[] bArr2 = zza.zza;
                    int i4 = zzclzVar6.zzb;
                    ArraysKt___ArraysJvmKt.copyInto$default(bArr, bArr2, 0, i4, i4 + i3, 2);
                }
                zza.zzc = zza.zzb + i3;
                zzclzVar6.zzb += i3;
                zzclz zzclzVar7 = zzclzVar6.zzg;
                zzclzVar7.getClass();
                zzclzVar7.zzc(zza);
                zzcloVar.zza = zza;
            }
            zzclz zzclzVar8 = zzcloVar.zza;
            zzclzVar8.getClass();
            int i5 = zzclzVar8.zzc - zzclzVar8.zzb;
            zzcloVar.zza = zzclzVar8.zzb();
            zzclz zzclzVar9 = this.zza;
            if (zzclzVar9 == null) {
                this.zza = zzclzVar8;
                zzclzVar8.zzg = zzclzVar8;
                zzclzVar8.zzf = zzclzVar8;
            } else {
                zzclz zzclzVar10 = zzclzVar9.zzg;
                zzclzVar10.getClass();
                zzclzVar10.zzc(zzclzVar8);
                zzclz zzclzVar11 = zzclzVar8.zzg;
                if (zzclzVar11 == zzclzVar8) {
                    a$$ExternalSyntheticBUOutline0.m$1("cannot compact");
                    return;
                }
                zzclzVar11.getClass();
                if (zzclzVar11.zze) {
                    int i6 = zzclzVar8.zzc - zzclzVar8.zzb;
                    zzclz zzclzVar12 = zzclzVar8.zzg;
                    zzclzVar12.getClass();
                    int i7 = 8192 - zzclzVar12.zzc;
                    zzclz zzclzVar13 = zzclzVar8.zzg;
                    zzclzVar13.getClass();
                    if (!zzclzVar13.zzd) {
                        zzclz zzclzVar14 = zzclzVar8.zzg;
                        zzclzVar14.getClass();
                        i2 = zzclzVar14.zzb;
                    }
                    if (i6 <= i7 + i2) {
                        zzclz zzclzVar15 = zzclzVar8.zzg;
                        zzclzVar15.getClass();
                        zzclzVar8.zze(zzclzVar15, i6);
                        zzclzVar8.zzb();
                        zzcma.zzb(zzclzVar8);
                    }
                }
            }
            long j3 = i5;
            zzcloVar.zzb -= j3;
            this.zzb += j3;
            j -= j3;
        }
    }

    public final long zzi() {
        long j = this.zzb;
        if (j == 0) {
            return 0L;
        }
        zzclz zzclzVar = this.zza;
        zzclzVar.getClass();
        zzclz zzclzVar2 = zzclzVar.zzg;
        zzclzVar2.getClass();
        return (zzclzVar2.zzc >= 8192 || !zzclzVar2.zze) ? j : j - (r2 - zzclzVar2.zzb);
    }

    public final byte zzj() {
        if (this.zzb == 0) {
            Path$$ExternalSyntheticBUOutline0.m$1();
            return (byte) 0;
        }
        zzclz zzclzVar = this.zza;
        zzclzVar.getClass();
        int i = zzclzVar.zzb;
        int i2 = zzclzVar.zzc;
        int i3 = i + 1;
        byte b = zzclzVar.zza[i];
        this.zzb--;
        if (i3 != i2) {
            zzclzVar.zzb = i3;
            return b;
        }
        this.zza = zzclzVar.zzb();
        zzcma.zzb(zzclzVar);
        return b;
    }

    public final byte zzk(long j) {
        zzkf.zza(this.zzb, j, 1L);
        zzclz zzclzVar = this.zza;
        zzclzVar.getClass();
        long j2 = this.zzb;
        if (j2 - j < j) {
            while (j2 > j) {
                zzclzVar = zzclzVar.zzg;
                zzclzVar.getClass();
                j2 -= zzclzVar.zzc - zzclzVar.zzb;
            }
            return zzclzVar.zza[(int) ((zzclzVar.zzb + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = zzclzVar.zzc;
            int i2 = zzclzVar.zzb;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                return zzclzVar.zza[(int) ((i2 + j) - j3)];
            }
            zzclzVar = zzclzVar.zzf;
            zzclzVar.getClass();
            j3 = j4;
        }
    }

    public final zzcls zzn(long j) {
        if (j < 0 || j > 2147483647L) {
            TransportImpl$$ExternalSyntheticLambda0.m(j, "byteCount: ", String.valueOf(j).length() + 11);
            return null;
        }
        if (this.zzb < j) {
            Path$$ExternalSyntheticBUOutline0.m$1();
            return null;
        }
        if (j < 4096) {
            return new zzcls(zzr(j));
        }
        zzcls zzG = zzG((int) j);
        zzt(j);
        return zzG;
    }

    public final String zzp(long j, Charset charset) {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            TransportImpl$$ExternalSyntheticLambda0.m(j, "byteCount: ", String.valueOf(j).length() + 11);
            return null;
        }
        if (this.zzb < j) {
            Path$$ExternalSyntheticBUOutline0.m$1();
            return null;
        }
        if (j == 0) {
            return "";
        }
        zzclz zzclzVar = this.zza;
        zzclzVar.getClass();
        int i = zzclzVar.zzb;
        int i2 = zzclzVar.zzc;
        if (i + j > i2) {
            return new String(zzr(j), charset);
        }
        int i3 = (int) j;
        String str = new String(zzclzVar.zza, i, i3, charset);
        int i4 = i + i3;
        zzclzVar.zzb = i4;
        this.zzb -= j;
        if (i4 == i2) {
            this.zza = zzclzVar.zzb();
            zzcma.zzb(zzclzVar);
        }
        return str;
    }

    public final byte[] zzr(long j) {
        if (j < 0 || j > 2147483647L) {
            TransportImpl$$ExternalSyntheticLambda0.m(j, "byteCount: ", String.valueOf(j).length() + 11);
            return null;
        }
        if (this.zzb < j) {
            Path$$ExternalSyntheticBUOutline0.m$1();
            return null;
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int zzs = zzs(i2, i - i2, bArr);
            if (zzs == -1) {
                Path$$ExternalSyntheticBUOutline0.m$1();
                return null;
            }
            i2 += zzs;
        }
        return bArr;
    }

    public final int zzs(int i, int i2, byte[] bArr) {
        bArr.getClass();
        zzkf.zza(bArr.length, i, i2);
        zzclz zzclzVar = this.zza;
        if (zzclzVar == null) {
            return -1;
        }
        int min = Math.min(i2, zzclzVar.zzc - zzclzVar.zzb);
        int i3 = zzclzVar.zzb;
        ArraysKt___ArraysJvmKt.copyInto(i, zzclzVar.zza, i3, bArr, i3 + min);
        int i4 = zzclzVar.zzb + min;
        zzclzVar.zzb = i4;
        this.zzb -= min;
        if (i4 != zzclzVar.zzc) {
            return min;
        }
        this.zza = zzclzVar.zzb();
        zzcma.zzb(zzclzVar);
        return min;
    }

    public final void zzt(long j) {
        while (j > 0) {
            zzclz zzclzVar = this.zza;
            if (zzclzVar == null) {
                Path$$ExternalSyntheticBUOutline0.m$1();
                return;
            }
            int min = (int) Math.min(j, zzclzVar.zzc - zzclzVar.zzb);
            long j2 = min;
            this.zzb -= j2;
            j -= j2;
            int i = zzclzVar.zzb + min;
            zzclzVar.zzb = i;
            if (i == zzclzVar.zzc) {
                this.zza = zzclzVar.zzb();
                zzcma.zzb(zzclzVar);
            }
        }
    }

    public final void zzw(int i, String str) {
        str.getClass();
        if (i < 0) {
            a$$ExternalSyntheticBUOutline0.m$3(re$$ExternalSyntheticOutline0.m(i, "endIndex < beginIndex: ", " < 0", new StringBuilder(String.valueOf(i).length() + 27)));
            return;
        }
        if (i > str.length()) {
            int length = str.length();
            TransportImpl$$ExternalSyntheticLambda0.m(String.valueOf(i).length() + 29 + String.valueOf(length).length(), "endIndex > string.length: ", " > ", i, length);
            return;
        }
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                zzclz zzE = zzE(1);
                byte[] bArr = zzE.zza;
                int i4 = zzE.zzc - i2;
                int min = Math.min(i, 8192 - i4);
                bArr[i2 + i4] = (byte) charAt;
                i2 = i3;
                while (i2 < min) {
                    char charAt2 = str.charAt(i2);
                    if (charAt2 >= 128) {
                        break;
                    }
                    bArr[i2 + i4] = (byte) charAt2;
                    i2++;
                }
                int i5 = zzE.zzc;
                int i6 = (i4 + i2) - i5;
                zzE.zzc = i5 + i6;
                this.zzb += i6;
            } else {
                if (charAt < 2048) {
                    zzclz zzE2 = zzE(2);
                    byte[] bArr2 = zzE2.zza;
                    int i7 = zzE2.zzc;
                    bArr2[i7] = (byte) ((charAt >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((charAt & '?') | 128);
                    zzE2.zzc = i7 + 2;
                    this.zzb += 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    zzclz zzE3 = zzE(3);
                    byte[] bArr3 = zzE3.zza;
                    int i8 = zzE3.zzc;
                    bArr3[i8] = (byte) ((charAt >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((charAt & '?') | 128);
                    zzE3.zzc = i8 + 3;
                    this.zzb += 3;
                } else {
                    char charAt3 = i3 < i ? str.charAt(i3) : (char) 0;
                    if (charAt > 56319 || charAt3 < 56320 || charAt3 >= 57344) {
                        zzA(63);
                    } else {
                        zzclz zzE4 = zzE(4);
                        byte[] bArr4 = zzE4.zza;
                        int i9 = zzE4.zzc;
                        int i10 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        bArr4[i9] = (byte) ((i10 >> 18) | EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                        bArr4[i9 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i9 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i9 + 3] = (byte) ((i10 & 63) | 128);
                        zzE4.zzc = i9 + 4;
                        this.zzb += 4;
                        i2 += 2;
                    }
                }
                i2 = i3;
            }
        }
    }

    public final void zzz(int i, int i2, byte[] bArr) {
        bArr.getClass();
        long j = i2;
        zzkf.zza(bArr.length, i, j);
        int i3 = i;
        while (true) {
            int i4 = i + i2;
            if (i3 >= i4) {
                this.zzb += j;
                return;
            }
            zzclz zzE = zzE(1);
            int min = Math.min(i4 - i3, 8192 - zzE.zzc);
            int i5 = i3 + min;
            ArraysKt___ArraysJvmKt.copyInto(zzE.zzc, bArr, i3, zzE.zza, i5);
            zzE.zzc += min;
            i3 = i5;
        }
    }
}
