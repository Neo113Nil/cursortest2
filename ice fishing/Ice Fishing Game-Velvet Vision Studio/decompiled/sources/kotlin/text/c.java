package kotlin.text;

import com.gamericefishpro.space.mi.l;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class c extends l {
    /* JADX WARN: Code duplicated, block: B:105:0x0126  */
    /* JADX WARN: Code duplicated, block: B:108:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x012d A[PHI: r4
      0x012d: PHI (r4v5 int) = (r4v4 int), (r4v18 int) binds: [B:69:0x00cf, B:108:0x012a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:112:0x0137  */
    /* JADX WARN: Code duplicated, block: B:113:0x013a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0142  */
    /* JADX WARN: Code duplicated, block: B:117:0x0144 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:121:0x014b  */
    /* JADX WARN: Code duplicated, block: B:123:0x014e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0161  */
    /* JADX WARN: Code duplicated, block: B:136:0x016f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0171  */
    /* JADX WARN: Code duplicated, block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x0101  */
    /* JADX WARN: Code duplicated, block: B:89:0x0104  */
    /* JADX WARN: Code duplicated, block: B:92:0x0108 A[ADDED_TO_REGION] */
    public static final boolean e(String str) {
        char c;
        boolean z;
        boolean z2;
        int i;
        int iCharAt;
        int i2;
        int iCharAt2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        String str2;
        int i5;
        boolean z5;
        boolean z6 = true;
        int length = str.length() - 1;
        int i6 = 0;
        while (true) {
            c = ' ';
            if (i6 > length || str.charAt(i6) > ' ') {
                break;
            }
            i6++;
        }
        if (i6 <= length) {
            while (length > i6 && str.charAt(length) <= ' ') {
                length--;
            }
            if (str.charAt(i6) == '+' || str.charAt(i6) == '-') {
                i6++;
            }
            if (i6 <= length) {
                if (str.charAt(i6) != '0') {
                    z = true;
                    z2 = false;
                    if (z2) {
                        i = i6 + 1;
                        iCharAt = str.charAt(i6) | ' ';
                        if (z2) {
                            i2 = 112;
                        } else {
                            i2 = 101;
                        }
                        if (iCharAt != i2) {
                            if (z2) {
                            }
                        } else if (i <= length) {
                            while (i <= length) {
                                i++;
                            }
                            if (i > length) {
                                return z;
                            }
                            if (i != length) {
                            }
                        }
                    } else {
                        i3 = i6;
                        while (i3 <= length && ((str.charAt(i3) - '0') & 65535) < 10) {
                            i3++;
                        }
                        if (i6 != i3) {
                            z3 = z;
                        } else {
                            z3 = false;
                        }
                        if (i3 > length) {
                            i6 = i3;
                        } else {
                            if (str.charAt(i3) == '.') {
                                i5 = i3 + 1;
                                i4 = i5;
                                while (i4 <= length && ((str.charAt(i4) - '0') & 65535) < 10) {
                                    i4++;
                                }
                                if (i5 != i4) {
                                    z4 = z;
                                }
                                if (!z3 || z4) {
                                    i6 = i4;
                                } else {
                                    if (length == i4 + 2) {
                                        str2 = "NaN";
                                    } else {
                                        str2 = length == i4 + 7 ? "Infinity" : null;
                                    }
                                    i6 = (str2 != null && StringsKt__StringsKt.l(str, str2, i4, false) == i4) ? length + 1 : -1;
                                }
                            } else {
                                i4 = i3;
                            }
                            z4 = false;
                            if (z3) {
                                i6 = i4;
                            } else {
                                i6 = i4;
                            }
                        }
                        if (i6 != -1) {
                            if (i6 > length) {
                                return z;
                            }
                            i = i6 + 1;
                            iCharAt = str.charAt(i6) | ' ';
                            if (z2) {
                                i2 = 112;
                            } else {
                                i2 = 101;
                            }
                            if (iCharAt != i2) {
                                if (z2 && ((iCharAt == 102 || iCharAt == 100) && i > length)) {
                                    return z;
                                }
                            } else if (i <= length && ((str.charAt(i) != '+' && str.charAt(i) != '-') || (i = i6 + 2) <= length)) {
                                while (i <= length && ((str.charAt(i) - '0') & 65535) < 10) {
                                    i++;
                                }
                                if (i > length) {
                                    return z;
                                }
                                if (i != length && ((iCharAt2 = str.charAt(i) | ' ') == 102 || iCharAt2 == 100)) {
                                    return z;
                                }
                            }
                        }
                    }
                } else {
                    int i7 = i6 + 1;
                    if (i7 > length) {
                        return true;
                    }
                    if ((str.charAt(i7) | ' ') == 120) {
                        int i8 = i6 + 2;
                        int i9 = i8;
                        while (true) {
                            if (i9 > length) {
                                z = z6;
                                break;
                            }
                            char cCharAt = str.charAt(i9);
                            z = z6;
                            if (((cCharAt - '0') & 65535) >= 10 && (((cCharAt | ' ') - 97) & 65535) >= 6) {
                                break;
                            }
                            i9++;
                            z6 = z;
                        }
                        boolean z7 = i8 != i9 ? z : false;
                        if (i9 <= length) {
                            if (str.charAt(i9) == '.') {
                                int i10 = i9 + 1;
                                int i11 = i10;
                                while (i11 <= length) {
                                    char cCharAt2 = str.charAt(i11);
                                    char c2 = c;
                                    if (((cCharAt2 - '0') & 65535) >= 10 && (((cCharAt2 | ' ') - 97) & 65535) >= 6) {
                                        break;
                                    }
                                    i11++;
                                    c = c2;
                                }
                                z5 = i10 != i11 ? z : false;
                                i9 = i11;
                            } else {
                                z5 = false;
                            }
                            if (z7 || z5) {
                                i6 = i9;
                            }
                            if (i6 != -1 && i6 <= length) {
                                z2 = z;
                            }
                        }
                        i6 = -1;
                        if (i6 != -1) {
                            z2 = z;
                        }
                    } else {
                        z = true;
                        z2 = false;
                    }
                    if (z2) {
                        i3 = i6;
                        while (i3 <= length) {
                            i3++;
                        }
                        if (i6 != i3) {
                            z3 = z;
                        } else {
                            z3 = false;
                        }
                        if (i3 > length) {
                            i6 = i3;
                        } else {
                            if (str.charAt(i3) == '.') {
                                i5 = i3 + 1;
                                i4 = i5;
                                while (i4 <= length) {
                                    i4++;
                                }
                                if (i5 != i4) {
                                    z4 = z;
                                }
                                if (z3) {
                                    i6 = i4;
                                } else {
                                    i6 = i4;
                                }
                            } else {
                                i4 = i3;
                            }
                            z4 = false;
                            if (z3) {
                                i6 = i4;
                            } else {
                                i6 = i4;
                            }
                        }
                        if (i6 != -1) {
                            if (i6 > length) {
                                return z;
                            }
                            i = i6 + 1;
                            iCharAt = str.charAt(i6) | ' ';
                            if (z2) {
                                i2 = 112;
                            } else {
                                i2 = 101;
                            }
                            if (iCharAt != i2) {
                                if (z2) {
                                }
                            } else if (i <= length) {
                                while (i <= length) {
                                    i++;
                                }
                                if (i > length) {
                                    return z;
                                }
                                if (i != length) {
                                }
                            }
                        }
                    } else {
                        i = i6 + 1;
                        iCharAt = str.charAt(i6) | ' ';
                        if (z2) {
                            i2 = 112;
                        } else {
                            i2 = 101;
                        }
                        if (iCharAt != i2) {
                            if (z2) {
                            }
                        } else if (i <= length) {
                            while (i <= length) {
                                i++;
                            }
                            if (i > length) {
                                return z;
                            }
                            if (i != length) {
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
