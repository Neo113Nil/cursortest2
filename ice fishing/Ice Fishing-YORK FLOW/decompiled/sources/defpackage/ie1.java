package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class ie1 {
    public static final defpackage.ge1 JhCgjQRTAOCT(defpackage.ge1 ge1Var) {
        if (!(ge1Var instanceof defpackage.ge1)) {
            ge1Var = null;
        }
        if (ge1Var != null) {
            return ge1Var;
        }
        defpackage.ej.giKS3J6vZuNy("Inconsistent composition");
        defpackage.h7.JhCgjQRTAOCT();
        return null;
    }

    public static final int WDYagTQQm9ns(java.util.ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((defpackage.y20) arrayList.get(i4)).ZpBGe2uQfcn8;
            if (i5 < 0) {
                i5 += i2;
            }
            int fNwYGHIYeJcR = defpackage.ma0.fNwYGHIYeJcR(i5, i);
            if (fNwYGHIYeJcR < 0) {
                i3 = i4 + 1;
            } else {
                if (fNwYGHIYeJcR <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int ZpBGe2uQfcn8(java.util.ArrayList arrayList, int i, int i2) {
        int WDYagTQQm9ns = WDYagTQQm9ns(arrayList, i, i2);
        return WDYagTQQm9ns >= 0 ? WDYagTQQm9ns : -(WDYagTQQm9ns + 1);
    }

    public static final void fWTAfUmVKrZq(int[] iArr, int i, int i2) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final int giKS3J6vZuNy(int[] iArr, int i) {
        int i2 = i * 5;
        return java.lang.Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final void oh71FJcDz6S2() {
        throw new java.util.ConcurrentModificationException();
    }
}
