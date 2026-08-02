package defpackage;

/* loaded from: classes.dex */
public final class bo3 extends ah3 {
    public bo3(String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
    }

    public static int M(int i) {
        if (i >= 48 && i <= 57) {
            return i - 48;
        }
        if (i >= 65 && i <= 70) {
            return i - 55;
        }
        if (i < 97 || i > 102) {
            return -1;
        }
        return i - 87;
    }

    public final String N() {
        int M;
        if (p()) {
            return null;
        }
        char charAt = ((String) this.d).charAt(this.b);
        if (charAt != '\'' && charAt != '\"') {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        this.b++;
        int intValue = A().intValue();
        while (intValue != -1 && intValue != charAt) {
            if (intValue == 92) {
                intValue = A().intValue();
                if (intValue != -1) {
                    if (intValue == 10 || intValue == 13 || intValue == 12) {
                        intValue = A().intValue();
                    } else {
                        int M2 = M(intValue);
                        if (M2 != -1) {
                            for (int i = 1; i <= 5 && (M = M((intValue = A().intValue()))) != -1; i++) {
                                M2 = (M2 * 16) + M;
                            }
                            sb.append((char) M2);
                        }
                    }
                }
            }
            sb.append((char) intValue);
            intValue = A().intValue();
        }
        return sb.toString();
    }

    public final String O() {
        int i;
        String str = (String) this.d;
        boolean p = p();
        int i2 = this.b;
        if (!p) {
            int charAt = str.charAt(i2);
            if (charAt == 45) {
                charAt = i();
            }
            if ((charAt < 65 || charAt > 90) && ((charAt < 97 || charAt > 122) && charAt != 95)) {
                i = i2;
            } else {
                int i3 = i();
                while (true) {
                    if ((i3 < 65 || i3 > 90) && ((i3 < 97 || i3 > 122) && !((i3 >= 48 && i3 <= 57) || i3 == 45 || i3 == 95))) {
                        break;
                    }
                    i3 = i();
                }
                i = this.b;
            }
            this.b = i2;
            i2 = i;
        }
        int i4 = this.b;
        if (i2 == i4) {
            return null;
        }
        String substring = str.substring(i4, i2);
        this.b = i2;
        return substring;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public final java.util.ArrayList P() {
        /*
            Method dump skipped, instructions count: 1192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bo3.P():java.util.ArrayList");
    }
}
