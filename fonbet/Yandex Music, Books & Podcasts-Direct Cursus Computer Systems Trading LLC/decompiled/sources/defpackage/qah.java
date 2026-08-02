package defpackage;

/* loaded from: classes.dex */
public final class qah {
    public final int a;
    public final int[] b;
    public final yvs[] c;
    public final int[] d;
    public final int[][][] e;
    public final yvs f;

    public qah(int[] iArr, yvs[] yvsVarArr, int[] iArr2, int[][][] iArr3, yvs yvsVar) {
        this.b = iArr;
        this.c = yvsVarArr;
        this.e = iArr3;
        this.d = iArr2;
        this.f = yvsVar;
        this.a = iArr.length;
    }

    public final int a(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            if (this.b[i3] == i) {
                int[][] iArr = this.e[i3];
                int length = iArr.length;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    for (int i6 : iArr[i4]) {
                        int i7 = i6 & 7;
                        int i8 = 1;
                        if (i7 != 0 && i7 != 1 && i7 != 2) {
                            if (i7 == 3) {
                                i8 = 2;
                            } else {
                                if (i7 != 4) {
                                    e7o.n();
                                    return 0;
                                }
                                i5 = 3;
                            }
                        }
                        i5 = Math.max(i5, i8);
                    }
                    i4++;
                }
                i2 = Math.max(i2, i5);
            }
        }
        return i2;
    }
}
