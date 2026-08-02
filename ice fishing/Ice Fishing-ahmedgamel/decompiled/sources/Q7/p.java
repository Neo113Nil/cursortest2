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
    public static final boolean Z(String str) {
        char c9;
        boolean z6;
        boolean z9;
        int charAt;
        int i;
        boolean z10;
        boolean z11;
        boolean z12 = true;
        int length = str.length() - 1;
        int i4 = 0;
        while (true) {
            c9 = ' ';
            if (i4 > length || str.charAt(i4) > ' ') {
                break;
            }
            i4++;
        }
        if (i4 > length) {
            return false;
        }
        while (length > i4 && str.charAt(length) <= ' ') {
            length--;
        }
        if (str.charAt(i4) == '+' || str.charAt(i4) == '-') {
            i4++;
        }
        if (i4 > length) {
            return false;
        }
        if (str.charAt(i4) == '0') {
            int i6 = i4 + 1;
            if (i6 > length) {
                return true;
            }
            if ((str.charAt(i6) | ' ') == 120) {
                int i9 = i4 + 2;
                int i10 = i9;
                while (true) {
                    if (i10 > length) {
                        z6 = z12;
                        break;
                    }
                    z6 = z12;
                    if (((str.charAt(i10) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                        break;
                    }
                    i10++;
                    z12 = z6;
                }
                boolean z13 = i9 != i10 ? z6 : false;
                if (i10 <= length) {
                    if (str.charAt(i10) == '.') {
                        int i11 = i10 + 1;
                        int i12 = i11;
                        while (i12 <= length) {
                            char c10 = c9;
                            if (((str.charAt(i12) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                                break;
                            }
                            i12++;
                            c9 = c10;
                        }
                        z11 = i11 != i12 ? z6 : false;
                        i10 = i12;
                    } else {
                        z11 = false;
                    }
                    if (z13 || z11) {
                        i4 = i10;
                        if (i4 != -1 || i4 > length) {
                            return false;
                        }
                        z9 = z6;
                        if (!z9) {
                            int i13 = i4;
                            while (i13 <= length && ((str.charAt(i13) - '0') & 65535) < 10) {
                                i13++;
                            }
                            boolean z14 = i4 != i13 ? z6 : false;
                            if (i13 > length) {
                                i4 = i13;
                            } else {
                                if (str.charAt(i13) == '.') {
                                    int i14 = i13 + 1;
                                    i = i14;
                                    while (i <= length && ((str.charAt(i) - '0') & 65535) < 10) {
                                        i++;
                                    }
                                    if (i14 != i) {
                                        z10 = z6;
                                        if (!z14 || z10) {
                                            i4 = i;
                                        } else {
                                            String str2 = length == i + 2 ? "NaN" : length == i + 7 ? "Infinity" : null;
                                            i4 = (str2 != null && j.o0(str, str2, i, false) == i) ? length + 1 : -1;
                                        }
                                    }
                                } else {
                                    i = i13;
                                }
                                z10 = false;
                                if (z14) {
                                }
                                i4 = i;
                            }
                            if (i4 == -1) {
                                return false;
                            }
                            if (i4 > length) {
                                return z6;
                            }
                        }
                        int i15 = i4 + 1;
                        charAt = str.charAt(i4) | ' ';
                        if (charAt == (!z9 ? 112 : 101)) {
                            if (z9 || (!(charAt == 102 || charAt == 100) || i15 <= length)) {
                                return false;
                            }
                            return z6;
                        }
                        if (i15 > length) {
                            return false;
                        }
                        if ((str.charAt(i15) == '+' || str.charAt(i15) == '-') && (i15 = i4 + 2) > length) {
                            return false;
                        }
                        while (i15 <= length && ((str.charAt(i15) - '0') & 65535) < 10) {
                            i15++;
                        }
                        if (i15 > length) {
                            return z6;
                        }
                        if (i15 != length) {
                            return false;
                        }
                        int charAt2 = str.charAt(i15) | ' ';
                        if (charAt2 == 102 || charAt2 == 100) {
                            return z6;
                        }
                        return false;
                    }
                }
                i4 = -1;
                if (i4 != -1) {
                }
                return false;
            }
        }
        z6 = true;
        z9 = false;
        if (!z9) {
        }
        int i152 = i4 + 1;
        charAt = str.charAt(i4) | ' ';
        if (charAt == (!z9 ? 112 : 101)) {
        }
    }
}
