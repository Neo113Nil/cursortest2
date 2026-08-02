package com.google.android.libraries.places.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.collections.AbstractList;
import kotlin.text.Charsets;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzcjv {
    public String zza;
    public String zzb;
    public int zzc = -1;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.zza);
        sb.append("://");
        int i = -1;
        if (this.zzb.indexOf(58) != -1) {
            sb.append('[');
            sb.append(this.zzb);
            sb.append(']');
        } else {
            sb.append(this.zzb);
        }
        int i2 = this.zzc;
        if (i2 == -1) {
            String str = this.zza;
            i2 = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        }
        String str2 = this.zza;
        if (str2.equals("http")) {
            i = 80;
        } else if (str2.equals("https")) {
            i = 443;
        }
        if (i2 != i) {
            sb.append(':');
            sb.append(i2);
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x01d3, code lost:
    
        r22 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzb(String str) {
        char c;
        char c2;
        int i;
        int i2;
        long j;
        int i3;
        String substring;
        String str2;
        char c3;
        int i4;
        int i5;
        InetAddress byAddress;
        int i6;
        int i7;
        int i8;
        long j2;
        int i9;
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$3("host == null");
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int length = str.length();
            c = '0';
            c2 = '\b';
            int i12 = -1;
            i = 2;
            if (i11 >= length) {
                i2 = -1;
                j = 3;
                i3 = 1;
                substring = str.substring(0, length);
                break;
            }
            int i13 = 37;
            if (str.charAt(i11) != '%') {
                i11++;
            } else {
                zzclo zzcloVar = new zzclo();
                zzcloVar.zzw(i11, str);
                while (i11 < length) {
                    int codePointAt = str.codePointAt(i11);
                    if (codePointAt == i13) {
                        int i14 = i11 + 2;
                        if (i14 < length) {
                            int zzd = zzcjw.zzd(str.charAt(i11 + 1));
                            j2 = 3;
                            int zzd2 = zzcjw.zzd(str.charAt(i14));
                            if (zzd == i12 || zzd2 == i12) {
                                codePointAt = i13;
                                if (codePointAt >= 128) {
                                    zzcloVar.zzA(codePointAt);
                                    i9 = i12;
                                } else if (codePointAt < 2048) {
                                    zzclz zzE = zzcloVar.zzE(2);
                                    byte[] bArr = zzE.zza;
                                    int i15 = zzE.zzc;
                                    bArr[i15] = (byte) ((codePointAt >> 6) | 192);
                                    i9 = i12;
                                    bArr[i15 + 1] = (byte) (128 | (codePointAt & 63));
                                    zzE.zzc = i15 + 2;
                                    zzcloVar.zzb += 2;
                                } else {
                                    i9 = i12;
                                    if (codePointAt >= 55296 && codePointAt < 57344) {
                                        zzcloVar.zzA(63);
                                    } else if (codePointAt < 65536) {
                                        zzclz zzE2 = zzcloVar.zzE(3);
                                        byte[] bArr2 = zzE2.zza;
                                        int i16 = zzE2.zzc;
                                        bArr2[i16] = (byte) ((codePointAt >> 12) | 224);
                                        bArr2[i16 + 1] = (byte) (((codePointAt >> 6) & 63) | 128);
                                        bArr2[i16 + 2] = (byte) (128 | (codePointAt & 63));
                                        zzE2.zzc = i16 + 3;
                                        zzcloVar.zzb += j2;
                                    } else {
                                        if (codePointAt > 1114111) {
                                            char[] cArr = zzkf.f80zzb;
                                            char[] cArr2 = {cArr[codePointAt >> 28], cArr[(codePointAt >> 24) & 15], cArr[(codePointAt >> 20) & 15], cArr[(codePointAt >> 16) & 15], cArr[(codePointAt >> 12) & 15], cArr[(codePointAt >> 8) & 15], cArr[(codePointAt >> 4) & 15], cArr[codePointAt & 15]};
                                            while (i10 < 8 && cArr2[i10] == '0') {
                                                i10++;
                                            }
                                            AbstractList.Companion.getClass();
                                            AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(i10, 8, 8);
                                            throw new IllegalArgumentException("Unexpected code point: 0x".concat(new String(cArr2, i10, 8 - i10)));
                                        }
                                        zzclz zzE3 = zzcloVar.zzE(4);
                                        byte[] bArr3 = zzE3.zza;
                                        int i17 = zzE3.zzc;
                                        bArr3[i17] = (byte) ((codePointAt >> 18) | EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                                        bArr3[i17 + 1] = (byte) (((codePointAt >> 12) & 63) | 128);
                                        bArr3[i17 + 2] = (byte) (((codePointAt >> 6) & 63) | 128);
                                        bArr3[i17 + 3] = (byte) (128 | (codePointAt & 63));
                                        zzE3.zzc = i17 + 4;
                                        zzcloVar.zzb += 4;
                                    }
                                }
                                i11 += Character.charCount(codePointAt);
                                i12 = i9;
                                i13 = 37;
                            } else {
                                zzcloVar.zzA((zzd << 4) + zzd2);
                                i9 = i12;
                                i11 = i14;
                                codePointAt = i13;
                                i11 += Character.charCount(codePointAt);
                                i12 = i9;
                                i13 = 37;
                            }
                        } else {
                            codePointAt = i13;
                        }
                    }
                    j2 = 3;
                    if (codePointAt >= 128) {
                    }
                    i11 += Character.charCount(codePointAt);
                    i12 = i9;
                    i13 = 37;
                }
                i2 = i12;
                j = 3;
                i3 = 1;
                substring = zzcloVar.zzp(zzcloVar.zzb, Charsets.UTF_8);
            }
        }
        if (!substring.startsWith("[") || !substring.endsWith("]")) {
            try {
                String lowerCase = IDN.toASCII(substring).toLowerCase(Locale.US);
                if (!lowerCase.isEmpty()) {
                    while (i10 < lowerCase.length()) {
                        char charAt = lowerCase.charAt(i10);
                        if (charAt > 31 && charAt < 127 && " #%/:?@[\\]".indexOf(charAt) == -1) {
                            i10++;
                        }
                    }
                    str2 = lowerCase;
                }
            } catch (IllegalArgumentException unused) {
            }
            str2 = null;
            break;
        }
        int length2 = substring.length() - 1;
        int i18 = 16;
        byte[] bArr4 = new byte[16];
        int i19 = 0;
        int i20 = i3;
        int i21 = i2;
        int i22 = i21;
        while (true) {
            if (i20 >= length2) {
                c3 = c2;
                i4 = i;
                i5 = i18;
                break;
            }
            if (i19 == i18) {
                c3 = c2;
                break;
            }
            int i23 = i20 + 2;
            c3 = c2;
            if (i23 > length2 || !substring.regionMatches(i20, "::", i10, i)) {
                if (i19 != 0) {
                    int i24 = i3;
                    if (substring.regionMatches(i20, ":", i10, i24)) {
                        i20++;
                    } else if (substring.regionMatches(i20, ".", i10, i24)) {
                        int i25 = i19 - 2;
                        int i26 = i25;
                        loop9: while (true) {
                            if (i22 >= length2) {
                                i4 = i;
                                i19 += 2;
                                if (i26 == i19) {
                                    i5 = 16;
                                }
                            } else if (i26 != i18) {
                                if (i26 != i25) {
                                    i4 = i;
                                    if (substring.charAt(i22) != '.') {
                                        break;
                                    } else {
                                        i22++;
                                    }
                                } else {
                                    i4 = i;
                                }
                                int i27 = i10;
                                int i28 = i22;
                                while (i28 < length2) {
                                    char charAt2 = substring.charAt(i28);
                                    if (charAt2 < c || charAt2 > '9') {
                                        break;
                                    }
                                    if (i27 == 0) {
                                        if (i22 != i28) {
                                            break loop9;
                                        } else {
                                            i27 = 0;
                                        }
                                    }
                                    i27 = Boxes$$ExternalSyntheticOutline1.m(i27, 10, charAt2, -48);
                                    if (i27 > 255) {
                                        break loop9;
                                    }
                                    i28++;
                                    c = '0';
                                }
                                if (i28 - i22 == 0) {
                                    break;
                                }
                                bArr4[i26] = (byte) i27;
                                i26++;
                                i22 = i28;
                                i = i4;
                                i10 = 0;
                                i18 = 16;
                                c = '0';
                            } else {
                                i4 = i;
                                break;
                            }
                        }
                    }
                }
                i4 = i;
                i22 = i20;
                i20 = i22;
                i7 = 0;
                while (i20 < length2) {
                    int zzd3 = zzcjw.zzd(substring.charAt(i20));
                    if (zzd3 == -1) {
                        break;
                    }
                    i20++;
                    i7 = (i7 << 4) + zzd3;
                }
                i8 = i20 - i22;
                if (i8 != 0 || i8 > 4) {
                    break;
                    break;
                }
                int i29 = i19 + 1;
                bArr4[i19] = (byte) ((i7 >>> 8) & 255);
                i19 += 2;
                bArr4[i29] = (byte) (i7 & 255);
                c2 = c3;
                i = i4;
                i10 = 0;
                i18 = 16;
                c = '0';
                i3 = 1;
                i2 = -1;
            } else {
                if (i21 != i2) {
                    break;
                }
                i21 = i19 + 2;
                if (i23 == length2) {
                    i5 = i18;
                    i4 = i;
                    i19 = i21;
                    break;
                }
                i22 = i23;
                i4 = i;
                i19 = i21;
                i20 = i22;
                i7 = 0;
                while (i20 < length2) {
                }
                i8 = i20 - i22;
                if (i8 != 0) {
                    break;
                }
                int i292 = i19 + 1;
                bArr4[i19] = (byte) ((i7 >>> 8) & 255);
                i19 += 2;
                bArr4[i292] = (byte) (i7 & 255);
                c2 = c3;
                i = i4;
                i10 = 0;
                i18 = 16;
                c = '0';
                i3 = 1;
                i2 = -1;
            }
        }
        try {
            if (i19 != i5) {
                if (i21 != -1) {
                    int i30 = i19 - i21;
                    System.arraycopy(bArr4, i21, bArr4, 16 - i30, i30);
                    i10 = 0;
                    Arrays.fill(bArr4, i21, (16 - i19) + i21, (byte) 0);
                }
                i10 = 0;
                byAddress = null;
                if (byAddress != null) {
                    byte[] address = byAddress.getAddress();
                    int i31 = 16;
                    if (address.length != 16) {
                        Path$$ExternalSyntheticBUOutline0.m$2();
                        return;
                    }
                    int i32 = i10;
                    int i33 = i32;
                    int i34 = -1;
                    while (i32 < address.length) {
                        int i35 = i32;
                        while (i35 < i31 && address[i35] == 0 && address[i35 + 1] == 0) {
                            i35 += 2;
                            i31 = 16;
                        }
                        int i36 = i35 - i32;
                        int i37 = i36 > i33 ? i36 : i33;
                        if (i36 > i33) {
                            i34 = i32;
                        }
                        i32 = i35 + 2;
                        i33 = i37;
                        i31 = 16;
                    }
                    zzclo zzcloVar2 = new zzclo();
                    while (i10 < address.length) {
                        if (i10 == i34) {
                            zzcloVar2.zzA(58);
                            i10 += i33;
                            if (i10 == 16) {
                                zzcloVar2.zzA(58);
                            }
                        } else {
                            if (i10 > 0) {
                                zzcloVar2.zzA(58);
                            }
                            long j3 = ((address[i10] & 255) << 8) | (address[i10 + 1] & 255);
                            if (j3 == 0) {
                                zzcloVar2.zzA(48);
                                i6 = i33;
                            } else {
                                long j4 = (j3 >>> 1) | j3;
                                long j5 = j4 | (j4 >>> i4);
                                long j6 = j5 | (j5 >>> 4);
                                long j7 = j6 | (j6 >>> c3);
                                long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
                                long j9 = ((j8 >>> i4) & 3689348814741910323L) + (j8 & 3689348814741910323L);
                                long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
                                long j11 = j10 + (j10 >>> c3);
                                long j12 = j11 + (j11 >>> 16);
                                int i38 = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + j) >> i4);
                                zzclz zzE4 = zzcloVar2.zzE(i38);
                                byte[] bArr5 = zzE4.zza;
                                int i39 = zzE4.zzc;
                                int i40 = (i39 + i38) - 1;
                                while (i40 >= i39) {
                                    bArr5[i40] = zzcmi.zzb[(int) (j3 & 15)];
                                    j3 >>>= 4;
                                    i40--;
                                    i33 = i33;
                                }
                                i6 = i33;
                                zzE4.zzc += i38;
                                zzcloVar2.zzb += i38;
                            }
                            i10 += 2;
                            i33 = i6;
                        }
                    }
                    str2 = zzcloVar2.zzp(zzcloVar2.zzb, Charsets.UTF_8);
                }
                str2 = null;
                break;
            }
            i10 = 0;
            byAddress = InetAddress.getByAddress(bArr4);
            if (byAddress != null) {
            }
            str2 = null;
            break;
        } catch (UnknownHostException unused2) {
            Path$$ExternalSyntheticBUOutline0.m$2();
            return;
        }
        if (str2 != null) {
            this.zzb = str2;
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("unexpected host: ".concat(str));
        }
    }
}
