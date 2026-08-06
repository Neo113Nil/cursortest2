package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class fn0 {
    public int[] ZpBGe2uQfcn8;
    public int giKS3J6vZuNy;

    public fn0(int i) {
        this.ZpBGe2uQfcn8 = i == 0 ? defpackage.t90.ZpBGe2uQfcn8 : new int[i];
    }

    public final void JhCgjQRTAOCT(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.giKS3J6vZuNy)) {
            defpackage.h7.WmetiUbpKU9I("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.ZpBGe2uQfcn8;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            defpackage.y7.cCeDCHgnx5OL(iArr, iArr, i, i + 1, i2);
        }
        this.giKS3J6vZuNy--;
    }

    public final void WDYagTQQm9ns(int i, int i2) {
        if (i < 0 || i >= this.giKS3J6vZuNy) {
            defpackage.h7.WmetiUbpKU9I("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.ZpBGe2uQfcn8;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public final void ZpBGe2uQfcn8(int i) {
        int i2 = this.giKS3J6vZuNy + 1;
        int[] iArr = this.ZpBGe2uQfcn8;
        if (iArr.length < i2) {
            this.ZpBGe2uQfcn8 = java.util.Arrays.copyOf(iArr, java.lang.Math.max(i2, (iArr.length * 3) / 2));
        }
        int[] iArr2 = this.ZpBGe2uQfcn8;
        int i3 = this.giKS3J6vZuNy;
        iArr2[i3] = i;
        this.giKS3J6vZuNy = i3 + 1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.fn0) {
            defpackage.fn0 fn0Var = (defpackage.fn0) obj;
            int i = fn0Var.giKS3J6vZuNy;
            int i2 = this.giKS3J6vZuNy;
            if (i == i2) {
                int[] iArr = this.ZpBGe2uQfcn8;
                int[] iArr2 = fn0Var.ZpBGe2uQfcn8;
                defpackage.p90 OVwOqzUGHcCU = defpackage.j80.OVwOqzUGHcCU(0, i2);
                int i3 = OVwOqzUGHcCU.WDYagTQQm9ns;
                int i4 = OVwOqzUGHcCU.oh71FJcDz6S2;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int fWTAfUmVKrZq() {
        int i = this.giKS3J6vZuNy;
        if (i != 0) {
            return this.ZpBGe2uQfcn8[i - 1];
        }
        throw new java.util.NoSuchElementException("IntList is empty.");
    }

    public final int giKS3J6vZuNy(int i) {
        if (i >= 0 && i < this.giKS3J6vZuNy) {
            return this.ZpBGe2uQfcn8[i];
        }
        defpackage.h7.WmetiUbpKU9I("Index must be between 0 and size");
        return 0;
    }

    public final int hashCode() {
        int[] iArr = this.ZpBGe2uQfcn8;
        int i = this.giKS3J6vZuNy;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += java.lang.Integer.hashCode(iArr[i3]) * 31;
        }
        return i2;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) "[");
        int[] iArr = this.ZpBGe2uQfcn8;
        int i = this.giKS3J6vZuNy;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((java.lang.CharSequence) "]");
                break;
            }
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((java.lang.CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((java.lang.CharSequence) ", ");
            }
            sb.append(i3);
            i2++;
        }
        return sb.toString();
    }

    public /* synthetic */ fn0() {
        this(16);
    }
}
