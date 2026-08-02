package defpackage;

/* loaded from: classes13.dex */
public final class sys {
    public final rys a;
    public final int[] b;

    public sys(rys rysVar, int[] iArr) {
        if (iArr.length == 0) {
            w511.q();
            throw null;
        }
        this.a = rysVar;
        int length = iArr.length;
        int i = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.b = iArr;
            return;
        }
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.b = new int[]{0};
            return;
        }
        int i2 = length - i;
        int[] iArr2 = new int[i2];
        this.b = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, i2);
    }

    public final sys a(sys sysVar) {
        rys rysVar = sysVar.a;
        rys rysVar2 = this.a;
        if (!rysVar2.equals(rysVar)) {
            ny61.g("GenericGFPolys do not have same GenericGF field");
            return null;
        }
        if (e()) {
            return sysVar;
        }
        if (sysVar.e()) {
            return this;
        }
        int[] iArr = sysVar.b;
        int[] iArr2 = this.b;
        if (iArr2.length > iArr.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = iArr2[i - length] ^ iArr[i];
        }
        return new sys(rysVar2, iArr3);
    }

    public final int b(int i) {
        if (i == 0) {
            return c(0);
        }
        int[] iArr = this.b;
        if (i != 1) {
            int i2 = iArr[0];
            int length = iArr.length;
            for (int i3 = 1; i3 < length; i3++) {
                i2 = this.a.c(i, i2) ^ iArr[i3];
            }
            return i2;
        }
        int i4 = 0;
        for (int i5 : iArr) {
            rys rysVar = rys.h;
            i4 ^= i5;
        }
        return i4;
    }

    public final int c(int i) {
        return this.b[(r1.length - 1) - i];
    }

    public final int d() {
        return this.b.length - 1;
    }

    public final boolean e() {
        return this.b[0] == 0;
    }

    public final sys f(int i) {
        rys rysVar = this.a;
        if (i == 0) {
            return rysVar.c;
        }
        if (i == 1) {
            return this;
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr2[i2] = rysVar.c(iArr[i2], i);
        }
        return new sys(rysVar, iArr2);
    }

    public final sys g(sys sysVar) {
        rys rysVar = sysVar.a;
        rys rysVar2 = this.a;
        if (!rysVar2.equals(rysVar)) {
            ny61.g("GenericGFPolys do not have same GenericGF field");
            return null;
        }
        if (e() || sysVar.e()) {
            return rysVar2.c;
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = sysVar.b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                iArr3[i4] = iArr3[i4] ^ rysVar2.c(i2, iArr2[i3]);
            }
        }
        return new sys(rysVar2, iArr3);
    }

    public final sys h(int i, int i2) {
        if (i < 0) {
            w511.q();
            return null;
        }
        rys rysVar = this.a;
        if (i2 == 0) {
            return rysVar.c;
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = new int[i + length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr2[i3] = rysVar.c(iArr[i3], i2);
        }
        return new sys(rysVar, iArr2);
    }

    public final String toString() {
        if (e()) {
            return "0";
        }
        StringBuilder sb = new StringBuilder(d() * 8);
        for (int d = d(); d >= 0; d--) {
            int c = c(d);
            if (c != 0) {
                if (c < 0) {
                    if (d == d()) {
                        sb.append("-");
                    } else {
                        sb.append(" - ");
                    }
                    c = -c;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (d == 0 || c != 1) {
                    rys rysVar = this.a;
                    if (c == 0) {
                        rysVar.getClass();
                        w511.q();
                        return null;
                    }
                    int i = rysVar.b[c];
                    if (i == 0) {
                        sb.append('1');
                    } else if (i == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(i);
                    }
                }
                if (d != 0) {
                    if (d == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(d);
                    }
                }
            }
        }
        return sb.toString();
    }
}
