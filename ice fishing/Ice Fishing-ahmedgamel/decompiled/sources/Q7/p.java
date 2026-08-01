package Q7;

/* loaded from: classes2.dex */
public abstract class p extends o {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean J(String str) {
        char c9;
        boolean z3;
        boolean z6;
        int charAt;
        int i;
        boolean z9;
        boolean z10;
        boolean z11 = true;
        int length = str.length() - 1;
        int i6 = 0;
        while (true) {
            c9 = ' ';
            if (i6 > length || str.charAt(i6) > ' ') {
                break;
            }
            i6++;
        }
        if (i6 > length) {
            return false;
        }
        while (length > i6 && str.charAt(length) <= ' ') {
            length--;
        }
        if (str.charAt(i6) == '+' || str.charAt(i6) == '-') {
            i6++;
        }
        if (i6 > length) {
            return false;
        }
        if (str.charAt(i6) == '0') {
            int i9 = i6 + 1;
            if (i9 > length) {
                return true;
            }
            if ((str.charAt(i9) | ' ') == 120) {
                int i10 = i6 + 2;
                int i11 = i10;
                while (true) {
                    if (i11 > length) {
                        z3 = z11;
                        break;
                    }
                    z3 = z11;
                    if (((str.charAt(i11) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                        break;
                    }
                    i11++;
                    z11 = z3;
                }
                boolean z12 = i10 != i11 ? z3 : false;
                if (i11 <= length) {
                    if (str.charAt(i11) == '.') {
                        int i12 = i11 + 1;
                        int i13 = i12;
                        while (i13 <= length) {
                            char c10 = c9;
                            if (((str.charAt(i13) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                                break;
                            }
                            i13++;
                            c9 = c10;
                        }
                        z10 = i12 != i13 ? z3 : false;
                        i11 = i13;
                    } else {
                        z10 = false;
                    }
                    if (z12 || z10) {
                        i6 = i11;
                        if (i6 != -1 || i6 > length) {
                            return false;
                        }
                        z6 = z3;
                        if (!z6) {
                            int i14 = i6;
                            while (i14 <= length && ((str.charAt(i14) - '0') & 65535) < 10) {
                                i14++;
                            }
                            boolean z13 = i6 != i14 ? z3 : false;
                            if (i14 > length) {
                                i6 = i14;
                            } else {
                                if (str.charAt(i14) == '.') {
                                    int i15 = i14 + 1;
                                    i = i15;
                                    while (i <= length && ((str.charAt(i) - '0') & 65535) < 10) {
                                        i++;
                                    }
                                    if (i15 != i) {
                                        z9 = z3;
                                        if (!z13 || z9) {
                                            i6 = i;
                                        } else {
                                            String str2 = length == i + 2 ? "NaN" : length == i + 7 ? "Infinity" : null;
                                            i6 = (str2 != null && j.Y(str, str2, i, false) == i) ? length + 1 : -1;
                                        }
                                    }
                                } else {
                                    i = i14;
                                }
                                z9 = false;
                                if (z13) {
                                }
                                i6 = i;
                            }
                            if (i6 == -1) {
                                return false;
                            }
                            if (i6 > length) {
                                return z3;
                            }
                        }
                        int i16 = i6 + 1;
                        charAt = str.charAt(i6) | ' ';
                        if (charAt == (!z6 ? 112 : 101)) {
                            if (z6 || (!(charAt == 102 || charAt == 100) || i16 <= length)) {
                                return false;
                            }
                            return z3;
                        }
                        if (i16 > length) {
                            return false;
                        }
                        if ((str.charAt(i16) == '+' || str.charAt(i16) == '-') && (i16 = i6 + 2) > length) {
                            return false;
                        }
                        while (i16 <= length && ((str.charAt(i16) - '0') & 65535) < 10) {
                            i16++;
                        }
                        if (i16 > length) {
                            return z3;
                        }
                        if (i16 != length) {
                            return false;
                        }
                        int charAt2 = str.charAt(i16) | ' ';
                        if (charAt2 == 102 || charAt2 == 100) {
                            return z3;
                        }
                        return false;
                    }
                }
                i6 = -1;
                if (i6 != -1) {
                }
                return false;
            }
        }
        z3 = true;
        z6 = false;
        if (!z6) {
        }
        int i162 = i6 + 1;
        charAt = str.charAt(i6) | ' ';
        if (charAt == (!z6 ? 112 : 101)) {
        }
    }
}
