package com.google.android.libraries.places.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes4.dex */
public class zzcls implements Serializable, Comparable {
    public static final zzcls zza = new zzcls(new byte[0]);
    public final byte[] zzb;
    public transient int zzc;
    public transient String zzd;

    public zzcls(byte[] bArr) {
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzcls zzclsVar = (zzcls) obj;
        zzclsVar.getClass();
        int zzj = zzj();
        int zzj2 = zzclsVar.zzj();
        int min = Math.min(zzj, zzj2);
        for (int i = 0; i < min; i++) {
            int zzi = zzi(i) & 255;
            int zzi2 = zzclsVar.zzi(i) & 255;
            if (zzi != zzi2) {
                return zzi >= zzi2 ? 1 : -1;
            }
        }
        if (zzj == zzj2) {
            return 0;
        }
        return zzj >= zzj2 ? 1 : -1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcls) {
            zzcls zzclsVar = (zzcls) obj;
            int zzj = zzclsVar.zzj();
            byte[] bArr = this.zzb;
            int length = bArr.length;
            if (zzj == length && zzclsVar.zzo(0, 0, length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.zzc;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.zzb);
        this.zzc = hashCode;
        return hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00d1, code lost:
    
        if (r9 < 65536) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00ba, code lost:
    
        if (r5 != 64) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00d4, code lost:
    
        if (r5 != 64) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00d8, code lost:
    
        if (r5 != 64) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x009b, code lost:
    
        if (r5 != 64) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0118, code lost:
    
        if (r5 != 64) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x011e, code lost:
    
        if (r5 != 64) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0110, code lost:
    
        if (r5 != 64) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x012c, code lost:
    
        if (r5 != 64) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0130, code lost:
    
        if (r5 != 64) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0134, code lost:
    
        if (r5 != 64) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x00e4, code lost:
    
        if (r5 != 64) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0138, code lost:
    
        if (r5 != 64) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x004d, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0082, code lost:
    
        if (r10 < 65536) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0084, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0087, code lost:
    
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0071, code lost:
    
        if (r5 != 64) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x008a, code lost:
    
        if (r5 != 64) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0061, code lost:
    
        if (r5 != 64) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00c2, code lost:
    
        if (r5 != 64) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        int i;
        int i2;
        byte[] bArr = this.zzb;
        int length = bArr.length;
        if (length == 0) {
            return "[size=0]";
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        loop0: while (true) {
            if (i3 >= length) {
                break;
            }
            byte b = bArr[i3];
            if (b >= 0) {
                i = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if (b != 10 && b != 13 && (b < 32 || b >= Byte.MAX_VALUE)) {
                    break;
                }
                i5++;
                i3++;
                while (i3 < length) {
                    byte b2 = bArr[i3];
                    if (b2 >= 0) {
                        i3++;
                        int i6 = i + 1;
                        if (i != 64) {
                            if (b2 != 10 && b2 != 13 && (b2 < 32 || b2 >= Byte.MAX_VALUE)) {
                                break loop0;
                            }
                            i5++;
                            i = i6;
                        } else {
                            break loop0;
                        }
                    }
                }
                i4 = i;
            } else {
                if ((b >> 5) == -2) {
                    int i7 = i3 + 1;
                    if (length > i7) {
                        byte b3 = bArr[i7];
                        if ((b3 & 192) == 128) {
                            int i8 = (b << 6) ^ (b3 ^ 3968);
                            if (i8 >= 128) {
                                i = i4 + 1;
                                if (i4 != 64) {
                                    if (i8 < 160 || i8 == 65533) {
                                        break;
                                    }
                                    i3 += 2;
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                } else if ((b >> 4) == -2) {
                    int i9 = i3 + 2;
                    if (length > i9) {
                        byte b4 = bArr[i3 + 1];
                        if ((b4 & 192) == 128) {
                            byte b5 = bArr[i9];
                            if ((b5 & 192) == 128) {
                                int i10 = ((b5 ^ (-123008)) ^ (b4 << 6)) ^ (b << 12);
                                if (i10 >= 2048) {
                                    if (i10 < 55296 || i10 >= 57344) {
                                        i = i4 + 1;
                                        if (i4 == 64) {
                                            break;
                                        }
                                        if (i10 == 65533) {
                                            break;
                                        }
                                        i3 += 3;
                                    }
                                }
                            }
                        }
                    }
                } else if ((b >> 3) == -2) {
                    int i11 = i3 + 3;
                    if (length > i11) {
                        byte b6 = bArr[i3 + 1];
                        if ((b6 & 192) == 128) {
                            byte b7 = bArr[i3 + 2];
                            if ((b7 & 192) == 128) {
                                byte b8 = bArr[i11];
                                if ((b8 & 192) == 128) {
                                    int i12 = (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12)) ^ (b << 18);
                                    if (i12 <= 1114111) {
                                        if (i12 < 55296 || i12 >= 57344) {
                                            if (i12 >= 65536) {
                                                i = i4 + 1;
                                                if (i4 == 64) {
                                                    break;
                                                }
                                                i5 += 2;
                                                i3 += 4;
                                                i4 = i;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i5 += i2;
                i4 = i;
            }
        }
        i5 = -1;
        if (i5 != -1) {
            String zze = zze();
            String replace$default = StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(zze.substring(0, i5), "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i5 >= zze.length()) {
                return Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(replace$default.length() + 7), "[text=", replace$default, "]");
            }
            int length2 = bArr.length;
            StringBuilder sb = new StringBuilder(Boxes$$ExternalSyntheticOutline1.m(String.valueOf(length2).length() + 12, 2, replace$default));
            sb.append("[size=");
            sb.append(length2);
            sb.append(" text=");
            sb.append(replace$default);
            sb.append("…]");
            return sb.toString();
        }
        int length3 = bArr.length;
        if (length3 <= 64) {
            String zzg = zzg();
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzg).length() + 6);
            sb2.append("[hex=");
            sb2.append(zzg);
            sb2.append("]");
            return sb2.toString();
        }
        String zzg2 = new zzcls(ArraysKt___ArraysJvmKt.copyOfRange(bArr, 0, 64)).zzg();
        StringBuilder sb3 = new StringBuilder(Boxes$$ExternalSyntheticOutline1.m(String.valueOf(length3).length() + 11, 2, zzg2));
        sb3.append("[size=");
        sb3.append(length3);
        sb3.append(" hex=");
        sb3.append(zzg2);
        sb3.append("…]");
        return sb3.toString();
    }

    public final String zze() {
        String str = this.zzd;
        if (str != null) {
            return str;
        }
        byte[] zzl = zzl();
        zzl.getClass();
        String str2 = new String(zzl, Charsets.UTF_8);
        this.zzd = str2;
        return str2;
    }

    public final String zzf() {
        byte[] bArr = zzclj.zza;
        byte[] bArr2 = this.zzb;
        bArr2.getClass();
        bArr.getClass();
        int length = bArr2.length;
        int i = length + 2;
        int i2 = length - (length % 3);
        byte[] bArr3 = new byte[(i / 3) * 4];
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i4 + 3;
            byte b = bArr2[i3];
            int i6 = i3 + 2;
            byte b2 = bArr2[i3 + 1];
            i3 += 3;
            byte b3 = bArr2[i6];
            bArr3[i4] = bArr[(b & 255) >> 2];
            bArr3[i4 + 1] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
            bArr3[i4 + 2] = bArr[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i4 += 4;
            bArr3[i5] = bArr[b3 & 63];
        }
        int length2 = bArr2.length - i2;
        if (length2 == 1) {
            byte b4 = bArr2[i3];
            bArr3[i4] = bArr[(b4 & 255) >> 2];
            bArr3[i4 + 1] = bArr[(b4 & 3) << 4];
            bArr3[i4 + 2] = 61;
            bArr3[i4 + 3] = 61;
        } else if (length2 == 2) {
            int i7 = i3 + 1;
            byte b5 = bArr2[i3];
            byte b6 = bArr2[i7];
            bArr3[i4] = bArr[(b5 & 255) >> 2];
            bArr3[i4 + 1] = bArr[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr3[i4 + 2] = bArr[(b6 & 15) << 2];
            bArr3[i4 + 3] = 61;
        }
        return new String(bArr3, Charsets.UTF_8);
    }

    public String zzg() {
        byte[] bArr = this.zzb;
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b : bArr) {
            char[] cArr2 = zzkf.f80zzb;
            cArr[i] = cArr2[(b >> 4) & 15];
            cArr[i + 1] = cArr2[b & 15];
            i += 2;
        }
        return new String(cArr);
    }

    public zzcls zzh() {
        int i = 0;
        while (true) {
            byte[] bArr = this.zzb;
            int length = bArr.length;
            if (i >= length) {
                return this;
            }
            int i2 = i + 1;
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, length);
                copyOf[i] = (byte) (b + PnmConstants.PNM_SEPARATOR);
                while (i2 < copyOf.length) {
                    int i3 = i2 + 1;
                    byte b2 = copyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i2] = (byte) (b2 + PnmConstants.PNM_SEPARATOR);
                    }
                    i2 = i3;
                }
                return new zzcls(copyOf);
            }
            i = i2;
        }
    }

    public byte zzi(int i) {
        return this.zzb[i];
    }

    public int zzj() {
        return this.zzb.length;
    }

    public byte[] zzk() {
        byte[] bArr = this.zzb;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public byte[] zzl() {
        return this.zzb;
    }

    public void zzm(zzclo zzcloVar, int i) {
        zzcloVar.zzz(0, i, this.zzb);
    }

    public boolean zzn(zzcls zzclsVar, int i) {
        zzclsVar.getClass();
        return zzclsVar.zzo(0, 0, i, this.zzb);
    }

    public boolean zzo(int i, int i2, int i3, byte[] bArr) {
        bArr.getClass();
        if (i >= 0) {
            byte[] bArr2 = this.zzb;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (bArr2[i4 + i] == bArr[i4 + i2]) {
                    }
                }
                return true;
            }
        }
        return false;
    }
}
