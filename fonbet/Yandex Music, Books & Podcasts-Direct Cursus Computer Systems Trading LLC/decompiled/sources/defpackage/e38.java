package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e38 {
    public final ArrayList a;
    public final int[] b;
    public final int[] c;
    public final j66 d;
    public final int e;
    public final int f;
    public final boolean g;

    public e38(j66 j66Var, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int i;
        d38 d38Var;
        int i2;
        this.a = arrayList;
        this.b = iArr;
        this.c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = j66Var;
        int a0 = j66Var.a0();
        this.e = a0;
        int Z = j66Var.Z();
        this.f = Z;
        this.g = true;
        d38 d38Var2 = arrayList.isEmpty() ? null : (d38) arrayList.get(0);
        if (d38Var2 == null || d38Var2.a != 0 || d38Var2.b != 0) {
            arrayList.add(0, new d38(0, 0, 0));
        }
        arrayList.add(new d38(a0, Z, 0));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d38 d38Var3 = (d38) it.next();
            for (int i3 = 0; i3 < d38Var3.c; i3++) {
                int i4 = d38Var3.a + i3;
                int i5 = d38Var3.b + i3;
                int i6 = j66Var.I(i4, i5) ? 1 : 2;
                iArr[i4] = (i5 << 4) | i6;
                iArr2[i5] = (i4 << 4) | i6;
            }
        }
        if (this.g) {
            Iterator it2 = arrayList.iterator();
            int i7 = 0;
            while (it2.hasNext()) {
                d38 d38Var4 = (d38) it2.next();
                while (true) {
                    i = d38Var4.a;
                    if (i7 < i) {
                        if (iArr[i7] == 0) {
                            int size = arrayList.size();
                            int i8 = 0;
                            int i9 = 0;
                            while (true) {
                                if (i8 < size) {
                                    d38Var = (d38) arrayList.get(i8);
                                    while (true) {
                                        i2 = d38Var.b;
                                        if (i9 < i2) {
                                            if (iArr2[i9] == 0 && j66Var.J(i7, i9)) {
                                                int i10 = j66Var.I(i7, i9) ? 8 : 4;
                                                iArr[i7] = (i9 << 4) | i10;
                                                iArr2[i9] = i10 | (i7 << 4);
                                            } else {
                                                i9++;
                                            }
                                        }
                                    }
                                }
                                i9 = d38Var.c + i2;
                                i8++;
                            }
                        }
                        i7++;
                    }
                }
                i7 = d38Var4.c + i;
            }
        }
    }

    public static f38 b(ArrayDeque arrayDeque, int i, boolean z) {
        f38 f38Var;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                f38Var = null;
                break;
            }
            f38Var = (f38) it.next();
            if (f38Var.a == i && f38Var.c == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            f38 f38Var2 = (f38) it.next();
            if (z) {
                f38Var2.b--;
            } else {
                f38Var2.b++;
            }
        }
        return f38Var;
    }

    public final void a(kag kagVar) {
        int[] iArr;
        j66 j66Var;
        int i;
        int i2;
        ArrayList arrayList;
        e38 e38Var = this;
        aw2 aw2Var = kagVar instanceof aw2 ? (aw2) kagVar : new aw2(kagVar);
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList2 = e38Var.a;
        boolean z = true;
        int size = arrayList2.size() - 1;
        int i3 = e38Var.e;
        int i4 = e38Var.f;
        int i5 = i3;
        while (size >= 0) {
            d38 d38Var = (d38) arrayList2.get(size);
            int i6 = d38Var.a;
            int i7 = d38Var.c;
            int i8 = i6 + i7;
            int i9 = d38Var.b;
            int i10 = i9 + i7;
            while (true) {
                iArr = e38Var.b;
                j66Var = e38Var.d;
                boolean z2 = z;
                i = 0;
                if (i5 <= i8) {
                    break;
                }
                i5--;
                int i11 = iArr[i5];
                if ((i11 & 12) != 0) {
                    arrayList = arrayList2;
                    int i12 = i11 >> 4;
                    f38 b = b(arrayDeque, i12, false);
                    if (b != null) {
                        int i13 = (i3 - b.b) - 1;
                        aw2Var.l(i5, i13);
                        if ((i11 & 4) != 0) {
                            aw2Var.k(i13, z2 ? 1 : 0, j66Var.T(i5, i12));
                        }
                    } else {
                        arrayDeque.add(new f38(i5, (i3 - i5) - (z2 ? 1 : 0), z2));
                    }
                } else {
                    arrayList = arrayList2;
                    aw2Var.j(i5, z2 ? 1 : 0);
                    i3--;
                }
                arrayList2 = arrayList;
                z = true;
            }
            ArrayList arrayList3 = arrayList2;
            while (i4 > i10) {
                i4--;
                int i14 = e38Var.c[i4];
                if ((i14 & 12) != 0) {
                    int i15 = i14 >> 4;
                    f38 b2 = b(arrayDeque, i15, true);
                    if (b2 == null) {
                        arrayDeque.add(new f38(i4, i3 - i5, false));
                        i2 = 0;
                    } else {
                        i2 = 0;
                        aw2Var.l((i3 - b2.b) - 1, i5);
                        if ((i14 & 4) != 0) {
                            aw2Var.k(i5, 1, j66Var.T(i15, i4));
                        }
                    }
                } else {
                    i2 = i;
                    aw2Var.d(i5, 1);
                    i3++;
                }
                e38Var = this;
                i = i2;
            }
            int i16 = i9;
            int i17 = i6;
            while (i < i7) {
                if ((iArr[i17] & 15) == 2) {
                    aw2Var.k(i17, 1, j66Var.T(i17, i16));
                }
                i17++;
                i16++;
                i++;
            }
            size--;
            e38Var = this;
            z = true;
            i4 = i9;
            i5 = i6;
            arrayList2 = arrayList3;
        }
        aw2Var.a();
    }
}
