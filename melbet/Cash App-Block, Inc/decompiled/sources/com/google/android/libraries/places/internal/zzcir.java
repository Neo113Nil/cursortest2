package com.google.android.libraries.places.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes4.dex */
public final class zzcir {
    public final String zza;
    public final int zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public char[] zzg;

    public zzcir(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.zza = name;
        this.zzb = name.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0080, code lost:
    
        r7 = r15.zzd;
        r4 = new java.lang.String(r6, r7, r15.zze - r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String zza() {
        String str;
        int i;
        char[] cArr;
        char c;
        int i2;
        char c2;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        String str2 = this.zza;
        this.zzg = str2.toCharArray();
        String zzb = zzb();
        if (zzb != null) {
            loop0: do {
                int i3 = this.zzc;
                int i4 = this.zzb;
                if (i3 != i4) {
                    char c3 = this.zzg[i3];
                    if (c3 == '\"') {
                        int i5 = i3 + 1;
                        this.zzc = i5;
                        this.zzd = i5;
                        this.zze = i5;
                        while (true) {
                            int i6 = this.zzc;
                            if (i6 == i4) {
                                a$$ExternalSyntheticBUOutline0.m$1("Unexpected end of DN: ".concat(str2));
                                break loop0;
                            }
                            char[] cArr2 = this.zzg;
                            char c4 = cArr2[i6];
                            if (c4 == '\"') {
                                this.zzc = i6 + 1;
                                while (true) {
                                    int i7 = this.zzc;
                                    if (i7 >= i4 || this.zzg[i7] != ' ') {
                                        break;
                                    }
                                    this.zzc = i7 + 1;
                                }
                                char[] cArr3 = this.zzg;
                                int i8 = this.zzd;
                                str = new String(cArr3, i8, this.zze - i8);
                            } else {
                                int i9 = this.zze;
                                if (c4 == '\\') {
                                    cArr2[i9] = zzc();
                                } else {
                                    cArr2[i9] = c4;
                                }
                                this.zzc++;
                                this.zze++;
                            }
                        }
                    } else if (c3 != '#') {
                        if (c3 == '+' || c3 == ',' || c3 == ';') {
                            str = "";
                        } else {
                            this.zzd = i3;
                            this.zze = i3;
                            while (true) {
                                int i10 = this.zzc;
                                char[] cArr4 = this.zzg;
                                if (i10 >= i4) {
                                    int i11 = this.zzd;
                                    str = new String(cArr4, i11, this.zze - i11);
                                    break;
                                }
                                char c5 = cArr4[i10];
                                if (c5 == ' ') {
                                    int i12 = this.zze;
                                    this.zzf = i12;
                                    this.zzc = i10 + 1;
                                    this.zze = i12 + 1;
                                    cArr4[i12] = ' ';
                                    while (true) {
                                        i2 = this.zzc;
                                        if (i2 >= i4) {
                                            break;
                                        }
                                        char[] cArr5 = this.zzg;
                                        if (cArr5[i2] != ' ') {
                                            break;
                                        }
                                        int i13 = this.zze;
                                        this.zze = i13 + 1;
                                        cArr5[i13] = ' ';
                                        this.zzc = i2 + 1;
                                    }
                                    if (i2 == i4 || (c2 = this.zzg[i2]) == ',' || c2 == '+' || c2 == ';') {
                                        break;
                                    }
                                } else {
                                    if (c5 == ';') {
                                        break;
                                    }
                                    if (c5 == '\\') {
                                        int i14 = this.zze;
                                        this.zze = i14 + 1;
                                        cArr4[i14] = zzc();
                                        this.zzc++;
                                    } else {
                                        if (c5 == '+' || c5 == ',') {
                                            break;
                                        }
                                        int i15 = this.zze;
                                        this.zze = i15 + 1;
                                        cArr4[i15] = c5;
                                        this.zzc = i10 + 1;
                                    }
                                }
                            }
                            char[] cArr6 = this.zzg;
                            int i16 = this.zzd;
                            str = new String(cArr6, i16, this.zzf - i16);
                        }
                    } else {
                        if (i3 + 4 >= i4) {
                            a$$ExternalSyntheticBUOutline0.m$1("Unexpected end of DN: ".concat(str2));
                            return null;
                        }
                        this.zzd = i3;
                        this.zzc = i3 + 1;
                        while (true) {
                            i = this.zzc;
                            if (i == i4 || (c = (cArr = this.zzg)[i]) == '+' || c == ',' || c == ';') {
                                break;
                            }
                            int i17 = i + 1;
                            if (c == ' ') {
                                this.zze = i;
                                this.zzc = i17;
                                while (true) {
                                    int i18 = this.zzc;
                                    if (i18 >= i4 || this.zzg[i18] != ' ') {
                                        break;
                                    }
                                    this.zzc = i18 + 1;
                                }
                            } else {
                                if (c >= 'A' && c <= 'F') {
                                    cArr[i] = (char) (c + ' ');
                                }
                                this.zzc = i17;
                            }
                        }
                        this.zze = i;
                        int i19 = this.zze;
                        int i20 = this.zzd;
                        int i21 = i19 - i20;
                        if (i21 < 5 || (i21 & 1) == 0) {
                            a$$ExternalSyntheticBUOutline0.m$1("Unexpected end of DN: ".concat(str2));
                            return null;
                        }
                        int i22 = i21 >> 1;
                        int i23 = i20 + 1;
                        byte[] bArr = new byte[i22];
                        int i24 = 0;
                        while (i24 < i22) {
                            bArr[i24] = (byte) zzd(i23);
                            i24++;
                            i23 += 2;
                        }
                        str = new String(this.zzg, this.zzd, i21);
                    }
                    if ("cn".equalsIgnoreCase(zzb)) {
                        return str;
                    }
                    int i25 = this.zzc;
                    if (i25 < i4) {
                        char c6 = this.zzg[i25];
                        if (c6 != ',' && c6 != ';' && c6 != '+') {
                            a$$ExternalSyntheticBUOutline0.m$1("Malformed DN: ".concat(str2));
                            return null;
                        }
                        this.zzc = i25 + 1;
                        zzb = zzb();
                    }
                }
            } while (zzb != null);
            a$$ExternalSyntheticBUOutline0.m$1("Malformed DN: ".concat(str2));
            return null;
        }
        return null;
    }

    public final String zzb() {
        int i;
        int i2;
        int i3;
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        while (true) {
            i = this.zzc;
            i2 = this.zzb;
            if (i >= i2 || this.zzg[i] != ' ') {
                break;
            }
            this.zzc = i + 1;
        }
        if (i == i2) {
            return null;
        }
        this.zzd = i;
        this.zzc = i + 1;
        while (true) {
            i3 = this.zzc;
            if (i3 >= i2 || (c5 = this.zzg[i3]) == '=' || c5 == ' ') {
                break;
            }
            this.zzc = i3 + 1;
        }
        String str = this.zza;
        if (i3 >= i2) {
            a$$ExternalSyntheticBUOutline0.m$1("Unexpected end of DN: ".concat(String.valueOf(str)));
            return null;
        }
        this.zze = i3;
        if (this.zzg[i3] == ' ') {
            while (true) {
                i3 = this.zzc;
                if (i3 >= i2 || (c4 = this.zzg[i3]) == '=' || c4 != ' ') {
                    break;
                }
                this.zzc = i3 + 1;
            }
            if (this.zzg[i3] != '=' || i3 == i2) {
                a$$ExternalSyntheticBUOutline0.m$1("Unexpected end of DN: ".concat(String.valueOf(str)));
                return null;
            }
        }
        this.zzc = i3 + 1;
        while (true) {
            int i4 = this.zzc;
            if (i4 >= i2 || this.zzg[i4] != ' ') {
                break;
            }
            this.zzc = i4 + 1;
        }
        int i5 = this.zze;
        int i6 = this.zzd;
        if (i5 - i6 > 4) {
            char[] cArr = this.zzg;
            if (cArr[i6 + 3] == '.' && (((c = cArr[i6]) == 'O' || c == 'o') && (((c2 = cArr[i6 + 1]) == 'I' || c2 == 'i') && ((c3 = cArr[i6 + 2]) == 'D' || c3 == 'd')))) {
                i6 += 4;
                this.zzd = i6;
            }
        }
        return new String(this.zzg, i6, i5 - i6);
    }

    public final char zzc() {
        int i;
        int i2;
        int i3 = this.zzc + 1;
        this.zzc = i3;
        int i4 = this.zzb;
        if (i3 == i4) {
            a$$ExternalSyntheticBUOutline0.m$1("Unexpected end of DN: ".concat(String.valueOf(this.zza)));
            return (char) 0;
        }
        char c = this.zzg[i3];
        if (c != ' ' && c != '%' && c != '\\' && c != '_' && c != '\"' && c != '#') {
            switch (c) {
                default:
                    switch (c) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            int zzd = zzd(i3);
                            this.zzc++;
                            if (zzd >= 128) {
                                if (zzd >= 192 && zzd <= 247) {
                                    if (zzd <= 223) {
                                        i = zzd & 31;
                                        i2 = 1;
                                    } else if (zzd <= 239) {
                                        i = zzd & 15;
                                        i2 = 2;
                                    } else {
                                        i = zzd & 7;
                                        i2 = 3;
                                    }
                                    for (int i5 = 0; i5 < i2; i5++) {
                                        int i6 = this.zzc;
                                        int i7 = i6 + 1;
                                        this.zzc = i7;
                                        if (i7 != i4 && this.zzg[i7] == '\\') {
                                            int i8 = i6 + 2;
                                            this.zzc = i8;
                                            int zzd2 = zzd(i8);
                                            this.zzc++;
                                            if ((zzd2 & 192) == 128) {
                                                i = (i << 6) + (zzd2 & 63);
                                            }
                                        }
                                    }
                                    zzd = (char) i;
                                }
                                zzd = 63;
                            }
                            return (char) zzd;
                    }
                case '*':
                case '+':
                case ',':
                    return c;
            }
        }
        return c;
    }

    public final int zzd(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        String str = this.zza;
        if (i4 >= this.zzb) {
            a$$ExternalSyntheticBUOutline0.m$1("Malformed DN: ".concat(String.valueOf(str)));
            return 0;
        }
        char[] cArr = this.zzg;
        char c = cArr[i];
        if (c >= '0' && c <= '9') {
            i2 = c - '0';
        } else if (c >= 'a' && c <= 'f') {
            i2 = c - 'W';
        } else {
            if (c < 'A' || c > 'F') {
                a$$ExternalSyntheticBUOutline0.m$1("Malformed DN: ".concat(String.valueOf(str)));
                return 0;
            }
            i2 = c - '7';
        }
        char c2 = cArr[i4];
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i3 = c2 - 'W';
        } else {
            if (c2 < 'A' || c2 > 'F') {
                a$$ExternalSyntheticBUOutline0.m$1("Malformed DN: ".concat(String.valueOf(str)));
                return 0;
            }
            i3 = c2 - '7';
        }
        return (i2 << 4) + i3;
    }
}
