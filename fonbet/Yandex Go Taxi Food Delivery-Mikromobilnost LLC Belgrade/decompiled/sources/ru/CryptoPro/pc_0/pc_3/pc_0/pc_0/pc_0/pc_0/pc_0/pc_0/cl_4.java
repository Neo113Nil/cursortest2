package ru.CryptoPro.pc_0.pc_3.pc_0.pc_0.pc_0.pc_0.pc_0.pc_0;

import defpackage.ny61;
import defpackage.oyr;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.math.BigDecimal;

/* loaded from: classes4.dex */
class cl_4 implements Serializable {
    private static final long serialVersionUID = 1;
    private final String a;

    public cl_4(String str) {
        this.a = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
    
        if (r2 == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ab, code lost:
    
        defpackage.ny61.g(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ae, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Object readResolve() throws ObjectStreamException {
        boolean z;
        char c;
        boolean z2;
        char charAt;
        char charAt2;
        String str = this.a;
        cl_2 cl_2Var = new cl_2();
        int length = str.length();
        int[] iArr = {0};
        if (length == 0 || str.charAt(0) != '-') {
            z = true;
        } else {
            iArr[0] = iArr[0] + 1;
            z = false;
        }
        int i = iArr[0];
        if (length != i) {
            iArr[0] = i + 1;
            if (str.charAt(i) != 'P') {
                ny61.g(str);
                return null;
            }
        }
        String[] strArr = new String[3];
        int[] iArr2 = new int[3];
        int i2 = 0;
        while (true) {
            int i3 = iArr[0];
            c = '9';
            if (length == i3 || '0' > (charAt2 = str.charAt(i3)) || charAt2 > '9' || i2 >= 3) {
                break;
            }
            iArr2[i2] = iArr[0];
            strArr[i2] = cl_2.m(str, iArr);
            i2++;
        }
        int i4 = iArr[0];
        if (length != i4) {
            iArr[0] = i4 + 1;
            if (str.charAt(i4) != 'T') {
                ny61.g(str);
                return null;
            }
            z2 = true;
        } else {
            z2 = false;
        }
        String[] strArr2 = new String[3];
        int[] iArr3 = new int[3];
        int i5 = 0;
        while (true) {
            int i6 = iArr[0];
            if (length == i6 || ((('0' > (charAt = str.charAt(i6)) || charAt > c) && charAt != '.') || i5 >= 3)) {
                break;
            }
            iArr3[i5] = iArr[0];
            strArr2[i5] = cl_2.m(str, iArr);
            i5++;
            c = '9';
        }
        if (length != iArr[0]) {
            ny61.g(str);
            return null;
        }
        if (i2 == 0 && i5 == 0) {
            ny61.g(str);
            return null;
        }
        cl_2.p(str, strArr, iArr2, i2, "YMD");
        cl_2.p(str, strArr2, iArr3, i5, "HMS");
        cl_2Var.b = cl_2.n(strArr[0]);
        cl_2Var.c = cl_2.n(strArr[1]);
        cl_2Var.d = cl_2.n(strArr[2]);
        cl_2Var.e = cl_2.n(strArr2[0]);
        cl_2Var.f = cl_2.n(strArr2[1]);
        String str2 = strArr2[2];
        cl_2Var.g = str2 == null ? null : new BigDecimal(oyr.g(1, 0, str2));
        cl_2Var.a = cl_2Var.l(z);
        return cl_2Var;
    }
}
