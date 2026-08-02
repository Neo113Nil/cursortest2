package defpackage;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* loaded from: classes3.dex */
public final class n5d {
    public final m5d a;
    public final int[] b;

    public n5d(m5d m5dVar, int[] iArr) {
        if (iArr.length == 0) {
            e7o.e();
            throw null;
        }
        this.a = m5dVar;
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

    public final n5d a(n5d n5dVar) {
        m5d m5dVar = n5dVar.a;
        m5d m5dVar2 = this.a;
        if (!m5dVar2.equals(m5dVar)) {
            xq0.x("GenericGFPolys do not have same GenericGF field");
            return null;
        }
        if (c()) {
            return n5dVar;
        }
        if (n5dVar.c()) {
            return this;
        }
        int[] iArr = n5dVar.b;
        int[] iArr2 = this.b;
        if (iArr2.length > iArr.length) {
            iArr2 = iArr;
            iArr = iArr2;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = iArr2[i - length] ^ iArr[i];
        }
        return new n5d(m5dVar2, iArr3);
    }

    public final int b() {
        return this.b.length - 1;
    }

    public final boolean c() {
        return this.b[0] == 0;
    }

    public final String toString() {
        if (c()) {
            return CommonUrlParts.Values.FALSE_INTEGER;
        }
        StringBuilder sb = new StringBuilder(b() * 8);
        for (int b = b(); b >= 0; b--) {
            int[] iArr = this.b;
            int i = iArr[(iArr.length - 1) - b];
            if (i != 0) {
                if (i < 0) {
                    if (b == b()) {
                        sb.append("-");
                    } else {
                        sb.append(" - ");
                    }
                    i = -i;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (b == 0 || i != 1) {
                    m5d m5dVar = this.a;
                    if (i == 0) {
                        m5dVar.getClass();
                        e7o.e();
                        return null;
                    }
                    int i2 = m5dVar.b[i];
                    if (i2 == 0) {
                        sb.append('1');
                    } else if (i2 == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(i2);
                    }
                }
                if (b != 0) {
                    if (b == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(b);
                    }
                }
            }
        }
        return sb.toString();
    }
}
