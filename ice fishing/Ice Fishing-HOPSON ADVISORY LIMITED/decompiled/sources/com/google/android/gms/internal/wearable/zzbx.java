package com.google.android.gms.internal.wearable;

import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzbx {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    static int zza(byte[] bArr, int i, zzbw zzbwVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzb(b, bArr, i2, zzbwVar);
        }
        zzbwVar.zza = b;
        return i2;
    }

    static int zzb(int i, byte[] bArr, int i2, zzbw zzbwVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & WorkQueueKt.MASK;
        if (b >= 0) {
            zzbwVar.zza = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & ByteCompanionObject.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzbwVar.zza = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & ByteCompanionObject.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzbwVar.zza = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & ByteCompanionObject.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzbwVar.zza = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzbwVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int zzc(byte[] bArr, int i, zzbw zzbwVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zzbwVar.zzb = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & ByteCompanionObject.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & ByteCompanionObject.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        zzbwVar.zzb = j2;
        return i3;
    }

    static int zzd(byte[] bArr, int i) {
        int i2 = bArr[i] & UByte.MAX_VALUE;
        int i3 = bArr[i + 1] & UByte.MAX_VALUE;
        int i4 = bArr[i + 2] & UByte.MAX_VALUE;
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static long zze(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    static int zzf(byte[] bArr, int i, zzbw zzbwVar) throws zzdv {
        int zza2 = zza(bArr, i, zzbwVar);
        int i2 = zzbwVar.zza;
        if (i2 < 0) {
            throw new zzdv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - zza2) {
            throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            zzbwVar.zzc = zzcg.zza;
            return zza2;
        }
        zzbwVar.zzc = zzcg.zzk(bArr, zza2, i2);
        return zza2 + i2;
    }

    static int zzg(zzey zzeyVar, byte[] bArr, int i, int i2, zzbw zzbwVar) throws IOException {
        Object zza2 = zzeyVar.zza();
        int zzi = zzi(zza2, zzeyVar, bArr, i, i2, zzbwVar);
        zzeyVar.zzk(zza2);
        zzbwVar.zzc = zza2;
        return zzi;
    }

    static int zzh(zzey zzeyVar, byte[] bArr, int i, int i2, int i3, zzbw zzbwVar) throws IOException {
        Object zza2 = zzeyVar.zza();
        int zzj = zzj(zza2, zzeyVar, bArr, i, i2, i3, zzbwVar);
        zzeyVar.zzk(zza2);
        zzbwVar.zzc = zza2;
        return zzj;
    }

    static int zzi(Object obj, zzey zzeyVar, byte[] bArr, int i, int i2, zzbw zzbwVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zzb(i4, bArr, i3, zzbwVar);
            i4 = zzbwVar.zza;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = zzbwVar.zze + 1;
        zzbwVar.zze = i6;
        zzo(i6);
        int i7 = i4 + i5;
        zzeyVar.zzj(obj, bArr, i5, i7, zzbwVar);
        zzbwVar.zze--;
        zzbwVar.zzc = obj;
        return i7;
    }

    static int zzj(Object obj, zzey zzeyVar, byte[] bArr, int i, int i2, int i3, zzbw zzbwVar) throws IOException {
        zzeo zzeoVar = (zzeo) zzeyVar;
        int i4 = zzbwVar.zze + 1;
        zzbwVar.zze = i4;
        zzo(i4);
        int zzi = zzeoVar.zzi(obj, bArr, i, i2, i3, zzbwVar);
        zzbwVar.zze--;
        zzbwVar.zzc = obj;
        return zzi;
    }

    static int zzk(int i, byte[] bArr, int i2, int i3, zzdp zzdpVar, zzbw zzbwVar) {
        zzdh zzdhVar = (zzdh) zzdpVar;
        int zza2 = zza(bArr, i2, zzbwVar);
        zzdhVar.zzf(zzbwVar.zza);
        while (zza2 < i3) {
            int zza3 = zza(bArr, zza2, zzbwVar);
            if (i != zzbwVar.zza) {
                break;
            }
            zza2 = zza(bArr, zza3, zzbwVar);
            zzdhVar.zzf(zzbwVar.zza);
        }
        return zza2;
    }

    static int zzl(byte[] bArr, int i, zzdp zzdpVar, zzbw zzbwVar) throws IOException {
        zzdh zzdhVar = (zzdh) zzdpVar;
        int zza2 = zza(bArr, i, zzbwVar);
        int i2 = zzbwVar.zza + zza2;
        while (zza2 < i2) {
            zza2 = zza(bArr, zza2, zzbwVar);
            zzdhVar.zzf(zzbwVar.zza);
        }
        if (zza2 == i2) {
            return zza2;
        }
        throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int zzm(zzey zzeyVar, int i, byte[] bArr, int i2, int i3, zzdp zzdpVar, zzbw zzbwVar) throws IOException {
        int zzg = zzg(zzeyVar, bArr, i2, i3, zzbwVar);
        zzdpVar.add(zzbwVar.zzc);
        while (zzg < i3) {
            int zza2 = zza(bArr, zzg, zzbwVar);
            if (i != zzbwVar.zza) {
                break;
            }
            zzg = zzg(zzeyVar, bArr, zza2, i3, zzbwVar);
            zzdpVar.add(zzbwVar.zzc);
        }
        return zzg;
    }

    static int zzn(int i, byte[] bArr, int i2, int i3, zzfj zzfjVar, zzbw zzbwVar) throws zzdv {
        if ((i >>> 3) == 0) {
            throw new zzdv("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int zzc = zzc(bArr, i2, zzbwVar);
            zzfjVar.zzk(i, Long.valueOf(zzbwVar.zzb));
            return zzc;
        }
        if (i4 == 1) {
            zzfjVar.zzk(i, Long.valueOf(zze(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int zza2 = zza(bArr, i2, zzbwVar);
            int i5 = zzbwVar.zza;
            if (i5 < 0) {
                throw new zzdv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - zza2) {
                throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                zzfjVar.zzk(i, zzcg.zza);
            } else {
                zzfjVar.zzk(i, zzcg.zzk(bArr, zza2, i5));
            }
            return zza2 + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new zzdv("Protocol message contained an invalid tag (zero).");
            }
            zzfjVar.zzk(i, Integer.valueOf(zzd(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        zzfj zzb2 = zzfj.zzb();
        int i7 = zzbwVar.zze + 1;
        zzbwVar.zze = i7;
        zzo(i7);
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int zza3 = zza(bArr, i2, zzbwVar);
            i8 = zzbwVar.zza;
            if (i8 == i6) {
                i2 = zza3;
                break;
            }
            i2 = zzn(i8, bArr, zza3, i3, zzb2, zzbwVar);
        }
        zzbwVar.zze--;
        if (i2 > i3 || i8 != i6) {
            throw new zzdv("Failed to parse the message.");
        }
        zzfjVar.zzk(i, zzb2);
        return i2;
    }

    private static void zzo(int i) throws zzdv {
        if (i >= zzb) {
            throw new zzdv("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
