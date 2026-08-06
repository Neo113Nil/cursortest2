package defpackage;

/* loaded from: classes.dex */
public abstract class ha1 {
    public static final defpackage.fa1 F7NU4MC0GW(defpackage.fa1 fa1Var) {
        if (!(fa1Var instanceof defpackage.fa1)) {
            fa1Var = null;
        }
        if (fa1Var != null) {
            return fa1Var;
        }
        defpackage.dh.oh6vYeIP("Inconsistent composition");
        throw new defpackage.cf();
    }

    public static final int IHQe1A4L2xu(java.util.ArrayList arrayList, int i, int i2) {
        int adDC3e2L = adDC3e2L(arrayList, i, i2);
        return adDC3e2L >= 0 ? adDC3e2L : -(adDC3e2L + 1);
    }

    public static final int adDC3e2L(java.util.ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((defpackage.o10) arrayList.get(i4)).IHQe1A4L2xu;
            if (i5 < 0) {
                i5 += i2;
            }
            int kNAkVymC = defpackage.x70.kNAkVymC(i5, i);
            if (kNAkVymC < 0) {
                i3 = i4 + 1;
            } else {
                if (kNAkVymC <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int oh6vYeIP(int[] iArr, int i) {
        int i2 = i * 5;
        return java.lang.Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final void r1MBDhnF(int[] iArr, int i, int i2) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final void xiZrDbcSW0() {
        throw new java.util.ConcurrentModificationException();
    }
}
