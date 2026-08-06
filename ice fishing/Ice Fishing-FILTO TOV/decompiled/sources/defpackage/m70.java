package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class m70 {
    public final ArrayList AvO7iQsrTN;
    public final ArrayList EljAMC1QTz;
    public final hg0 GWasM1elztuh;
    public final ArrayList OOA6hdeuvCS;
    public final ig0 X1lG3V04pd;
    public x0 Yi7zF1RB1;
    public final ArrayList encWxUiV2;
    public final ie0 mOu10nynGul;
    public final ArrayList xqGvceK5x;

    public m70() {
        long[] jArr = kx0.GWasM1elztuh;
        this.GWasM1elztuh = new hg0();
        ig0 ig0Var = lx0.GWasM1elztuh;
        this.X1lG3V04pd = new ig0();
        this.xqGvceK5x = new ArrayList();
        this.OOA6hdeuvCS = new ArrayList();
        this.EljAMC1QTz = new ArrayList();
        this.AvO7iQsrTN = new ArrayList();
        this.encWxUiV2 = new ArrayList();
        this.mOu10nynGul = new j70(this);
    }

    public static int OOA6hdeuvCS(int[] iArr, q80 q80Var) {
        q80Var.getClass();
        int i = iArr[0] + q80Var.E7jCp8Ls;
        iArr[0] = i;
        return Math.max(0, i);
    }

    public final long GWasM1elztuh() {
        ArrayList arrayList = this.encWxUiV2;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        mr0.WIEu4Ya2g8(arrayList.get(0));
        throw null;
    }

    public final void X1lG3V04pd() {
        hg0 hg0Var = this.GWasM1elztuh;
        if (hg0Var.JFJ3QoxA()) {
            Object[] objArr = hg0Var.X1lG3V04pd;
            long[] jArr = hg0Var.GWasM1elztuh;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                mr0.WIEu4Ya2g8(objArr[(i << 3) + i3]);
                                throw null;
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            hg0Var.GWasM1elztuh();
        }
    }

    public final void Yi7zF1RB1(int i, int i2, ArrayList arrayList, x0 x0Var, n80 n80Var, boolean z, boolean z2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        ig0 ig0Var;
        x0 x0Var2 = this.Yi7zF1RB1;
        this.Yi7zF1RB1 = x0Var;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            q80 q80Var = (q80) arrayList.get(i11);
            int size2 = q80Var.Yi7zF1RB1.size();
            for (int i12 = 0; i12 < size2; i12++) {
                ((up0) q80Var.Yi7zF1RB1.get(i12)).encWxUiV2();
            }
        }
        hg0 hg0Var = this.GWasM1elztuh;
        if (hg0Var.mOu10nynGul()) {
            X1lG3V04pd();
            return;
        }
        boolean z3 = z || !z2;
        Object[] objArr = hg0Var.Yi7zF1RB1;
        long[] jArr = hg0Var.GWasM1elztuh;
        int length = jArr.length - 2;
        ig0 ig0Var2 = this.X1lG3V04pd;
        int i13 = 8;
        boolean z4 = z3;
        if (length >= 0) {
            int i14 = 0;
            while (true) {
                long j = jArr[i14];
                ig0 ig0Var3 = ig0Var2;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    long j2 = j;
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j2 & 255) < 128) {
                            ig0Var = ig0Var3;
                            ig0Var.GWasM1elztuh(objArr[(i14 << 3) + i16]);
                        } else {
                            ig0Var = ig0Var3;
                        }
                        j2 >>= 8;
                        i16++;
                        ig0Var3 = ig0Var;
                    }
                    ig0Var2 = ig0Var3;
                    if (i15 != 8) {
                        break;
                    }
                } else {
                    ig0Var2 = ig0Var3;
                }
                if (i14 == length) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        int size3 = arrayList.size();
        for (int i17 = 0; i17 < size3; i17++) {
            q80 q80Var2 = (q80) arrayList.get(i17);
            Object obj = q80Var2.AvO7iQsrTN;
            List list = q80Var2.Yi7zF1RB1;
            ig0Var2.E7jCp8Ls(obj);
            int size4 = list.size();
            for (int i18 = 0; i18 < size4; i18++) {
                ((up0) list.get(i18)).encWxUiV2();
            }
            mr0.WIEu4Ya2g8(hg0Var.rQPn8YBR(q80Var2.AvO7iQsrTN));
        }
        int[] iArr = new int[1];
        ArrayList arrayList2 = this.OOA6hdeuvCS;
        ArrayList arrayList3 = this.xqGvceK5x;
        if (z4 && x0Var2 != null) {
            if (arrayList3.isEmpty()) {
                i10 = 0;
            } else {
                if (arrayList3.size() > 1) {
                    vb.Qd9Q8OZgvOo4(arrayList3, new l70(x0Var2, 2));
                }
                if (arrayList3.size() > 0) {
                    q80 q80Var3 = (q80) arrayList3.get(0);
                    OOA6hdeuvCS(iArr, q80Var3);
                    Object AvO7iQsrTN = hg0Var.AvO7iQsrTN(q80Var3.AvO7iQsrTN);
                    AvO7iQsrTN.getClass();
                    mr0.WIEu4Ya2g8(AvO7iQsrTN);
                    q80Var3.GWasM1elztuh(0);
                    throw null;
                }
                i10 = 0;
                Arrays.fill(iArr, 0, 1, 0);
            }
            if (!arrayList2.isEmpty()) {
                if (arrayList2.size() > 1) {
                    vb.Qd9Q8OZgvOo4(arrayList2, new l70(x0Var2, i10));
                }
                if (arrayList2.size() > 0) {
                    q80 q80Var4 = (q80) arrayList2.get(i10);
                    OOA6hdeuvCS(iArr, q80Var4);
                    Object AvO7iQsrTN2 = hg0Var.AvO7iQsrTN(q80Var4.AvO7iQsrTN);
                    AvO7iQsrTN2.getClass();
                    mr0.WIEu4Ya2g8(AvO7iQsrTN2);
                    q80Var4.GWasM1elztuh(i10);
                    throw null;
                }
                Arrays.fill(iArr, i10, 1, i10);
            }
        }
        Object[] objArr2 = ig0Var2.Yi7zF1RB1;
        long[] jArr2 = ig0Var2.GWasM1elztuh;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i19 = 0;
            while (true) {
                long j3 = jArr2[i19];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i20 = 8 - ((~(i19 - length2)) >>> 31);
                    int i21 = 0;
                    while (i21 < i20) {
                        if ((j3 & 255) < 128) {
                            i9 = i13;
                            mr0.WIEu4Ya2g8(hg0Var.AvO7iQsrTN(objArr2[(i19 << 3) + i21]));
                        } else {
                            i9 = i13;
                        }
                        j3 >>= i9;
                        i21++;
                        i13 = i9;
                    }
                    i8 = i13;
                    if (i20 != i8) {
                        break;
                    }
                } else {
                    i8 = i13;
                }
                if (i19 == length2) {
                    break;
                }
                i19++;
                i13 = i8;
            }
        }
        ArrayList arrayList4 = this.EljAMC1QTz;
        if (arrayList4.isEmpty()) {
            i5 = i;
            i6 = i2;
            i7 = 1;
        } else {
            if (arrayList4.size() > 1) {
                vb.Qd9Q8OZgvOo4(arrayList4, new l70(x0Var, 3));
            }
            int size5 = arrayList4.size();
            for (int i22 = 0; i22 < size5; i22++) {
                q80 q80Var5 = (q80) arrayList4.get(i22);
                Object AvO7iQsrTN3 = hg0Var.AvO7iQsrTN(q80Var5.AvO7iQsrTN);
                AvO7iQsrTN3.getClass();
                mr0.WIEu4Ya2g8(AvO7iQsrTN3);
                q80Var5.X1lG3V04pd((z ? (int) (4294967295L & ((q80) rb.jed7WnvkLvFq(arrayList)).GWasM1elztuh(0)) : 0) - OOA6hdeuvCS(iArr, q80Var5), i, i2);
                if (z4) {
                    xqGvceK5x(q80Var5, true);
                    throw null;
                }
            }
            i5 = i;
            i6 = i2;
            i7 = 1;
            Arrays.fill(iArr, 0, 1, 0);
        }
        ArrayList arrayList5 = this.AvO7iQsrTN;
        if (!arrayList5.isEmpty()) {
            if (arrayList5.size() > i7) {
                vb.Qd9Q8OZgvOo4(arrayList5, new l70(x0Var, i7));
            }
            int size6 = arrayList5.size();
            for (int i23 = 0; i23 < size6; i23++) {
                q80 q80Var6 = (q80) arrayList5.get(i23);
                Object AvO7iQsrTN4 = hg0Var.AvO7iQsrTN(q80Var6.AvO7iQsrTN);
                AvO7iQsrTN4.getClass();
                mr0.WIEu4Ya2g8(AvO7iQsrTN4);
                q80Var6.X1lG3V04pd((0 - q80Var6.E7jCp8Ls) + OOA6hdeuvCS(iArr, q80Var6), i5, i6);
                if (z4) {
                    xqGvceK5x(q80Var6, true);
                    throw null;
                }
            }
        }
        Collections.reverse(arrayList4);
        arrayList.addAll(0, arrayList4);
        arrayList.addAll(arrayList5);
        arrayList3.clear();
        arrayList2.clear();
        arrayList4.clear();
        arrayList5.clear();
        ig0Var2.Yi7zF1RB1();
    }

    public final void xqGvceK5x(q80 q80Var, boolean z) {
        Object AvO7iQsrTN = this.GWasM1elztuh.AvO7iQsrTN(q80Var.AvO7iQsrTN);
        AvO7iQsrTN.getClass();
        mr0.WIEu4Ya2g8(AvO7iQsrTN);
        throw null;
    }
}
