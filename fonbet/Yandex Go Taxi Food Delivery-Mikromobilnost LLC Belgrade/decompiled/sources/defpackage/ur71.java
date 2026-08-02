package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public final class ur71 implements n771 {
    public final int a;
    public final int b;
    public final List c;
    public final dl81 d;
    public final SparseIntArray e;
    public final zc71 f;
    public final SparseArray g;
    public final SparseBooleanArray h;
    public final SparseBooleanArray i;
    public final li71 j;
    public v071 k;
    public yg71 l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public w481 q;
    public int r;
    public int s;

    public ur71() {
        lo61 lo61Var = new lo61(0L);
        this.f = new zc71();
        this.b = 112800;
        this.a = 1;
        this.c = Collections.singletonList(lo61Var);
        this.d = new dl81(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.h = sparseBooleanArray;
        this.i = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.g = sparseArray;
        this.e = new SparseIntArray();
        this.j = new li71();
        this.l = yg71.x5;
        this.s = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        int i = 0;
        while (true) {
            SparseArray sparseArray3 = this.g;
            if (i >= size) {
                sparseArray3.put(0, new vy61(new cf71(this)));
                this.q = null;
                return;
            } else {
                sparseArray3.put(sparseArray2.keyAt(i), (w481) sparseArray2.valueAt(i));
                i++;
            }
        }
    }

    @Override // defpackage.n771
    public final void b(yg71 yg71Var) {
        this.l = yg71Var;
    }

    @Override // defpackage.n771
    public final void c(long j, long j2) {
        v071 v071Var;
        long j3;
        if (this.a == 2) {
            ny61.k();
            return;
        }
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            lo61 lo61Var = (lo61) this.c.get(i);
            synchronized (lo61Var) {
                j3 = lo61Var.b;
            }
            boolean z = true;
            boolean z2 = j3 == -9223372036854775807L;
            if (z2) {
                z = z2;
            } else {
                long a = lo61Var.a();
                if (a == -9223372036854775807L || a == 0 || a == j2) {
                    z = false;
                }
            }
            if (z) {
                lo61Var.d(j2);
            }
        }
        if (j2 != 0 && (v071Var = this.k) != null) {
            v071Var.b(j2);
        }
        this.d.i(0);
        this.e.clear();
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            ((w481) this.g.valueAt(i2)).a();
        }
        this.r = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    @Override // defpackage.n771
    public final int e(bb71 bb71Var, jp61 jp61Var) {
        w971 w971Var;
        int i;
        int i2;
        ?? r3;
        int i3;
        int i4;
        int i5;
        w971 w971Var2;
        long j;
        boolean z;
        long j2;
        long j3;
        w971 w971Var3 = (w971) bb71Var;
        long j4 = w971Var3.c;
        boolean z2 = this.n;
        int i6 = this.a;
        if (z2) {
            li71 li71Var = this.j;
            if (j4 != -1 && i6 != 2) {
                boolean z3 = li71Var.c;
                lo61 lo61Var = li71Var.a;
                dl81 dl81Var = li71Var.b;
                if (!z3) {
                    int i7 = this.s;
                    if (i7 <= 0) {
                        dl81Var.e(rf71.f);
                        li71Var.c = true;
                        w971Var3.y = 0;
                        return 0;
                    }
                    if (!li71Var.e) {
                        int min = (int) Math.min(112800L, j4);
                        long j5 = j4 - min;
                        if (w971Var3.w != j5) {
                            jp61Var.a = j5;
                            return 1;
                        }
                        dl81Var.i(min);
                        w971Var3.y = 0;
                        w971Var3.I(dl81Var.a, 0, min, false);
                        int i8 = dl81Var.b;
                        int i9 = dl81Var.c;
                        int i10 = i9 - 188;
                        while (true) {
                            if (i10 < i8) {
                                j3 = -9223372036854775807L;
                                break;
                            }
                            byte[] bArr = dl81Var.a;
                            int i11 = -4;
                            int i12 = 0;
                            while (true) {
                                if (i11 > 4) {
                                    break;
                                }
                                int i13 = (i11 * 188) + i10;
                                if (i13 < i8 || i13 >= i9 || bArr[i13] != 71) {
                                    i12 = 0;
                                } else {
                                    i12++;
                                    if (i12 == 5) {
                                        long a = lia1.a(dl81Var, i10, i7);
                                        if (a != -9223372036854775807L) {
                                            j3 = a;
                                            break;
                                        }
                                    }
                                }
                                i11++;
                            }
                            i10--;
                        }
                        li71Var.g = j3;
                        li71Var.e = true;
                        return 0;
                    }
                    if (li71Var.g == -9223372036854775807L) {
                        dl81Var.e(rf71.f);
                        li71Var.c = true;
                        w971Var3.y = 0;
                        return 0;
                    }
                    if (li71Var.d) {
                        long j6 = li71Var.f;
                        if (j6 == -9223372036854775807L) {
                            dl81Var.e(rf71.f);
                            li71Var.c = true;
                            w971Var3.y = 0;
                            return 0;
                        }
                        long c = lo61Var.c(li71Var.g) - lo61Var.c(j6);
                        li71Var.h = c;
                        if (c < 0) {
                            nba1.e();
                            li71Var.h = -9223372036854775807L;
                        }
                        dl81Var.e(rf71.f);
                        li71Var.c = true;
                        w971Var3.y = 0;
                        return 0;
                    }
                    int min2 = (int) Math.min(112800L, j4);
                    if (w971Var3.w != 0) {
                        jp61Var.a = 0L;
                        return 1;
                    }
                    dl81Var.i(min2);
                    w971Var3.y = 0;
                    w971Var3.I(dl81Var.a, 0, min2, false);
                    int i14 = dl81Var.b;
                    int i15 = dl81Var.c;
                    while (true) {
                        if (i14 >= i15) {
                            j2 = -9223372036854775807L;
                            break;
                        }
                        if (dl81Var.a[i14] == 71) {
                            long a2 = lia1.a(dl81Var, i14, i7);
                            if (a2 != -9223372036854775807L) {
                                j2 = a2;
                                break;
                            }
                        }
                        i14++;
                    }
                    li71Var.f = j2;
                    li71Var.d = true;
                    return 0;
                }
            }
            if (this.o) {
                w971Var2 = w971Var3;
                i = i6;
                j = 0;
            } else {
                this.o = true;
                long j7 = li71Var.h;
                if (j7 != -9223372036854775807L) {
                    w971Var2 = w971Var3;
                    i = i6;
                    j = 0;
                    v071 v071Var = new v071(new q771(), new yi6(this.s, li71Var.a, this.b), j7, 1 + j7, 0L, j4, 188L, 940);
                    this.k = v071Var;
                    this.l.r((q471) v071Var.b);
                } else {
                    w971Var2 = w971Var3;
                    i = i6;
                    j = 0;
                    this.l.r(new w471(j7, 0L));
                }
            }
            if (this.p) {
                z = false;
                this.p = false;
                c(j, j);
                w971Var = w971Var2;
                if (w971Var.w != j) {
                    jp61Var.a = j;
                    return 1;
                }
            } else {
                w971Var = w971Var2;
                z = false;
            }
            i2 = 1;
            v071 v071Var2 = this.k;
            r3 = z;
            if (v071Var2 != null) {
                r3 = z;
                if (((xt5) v071Var2.d) != null) {
                    return v071Var2.a(w971Var, jp61Var);
                }
            }
        } else {
            w971Var = w971Var3;
            i = i6;
            i2 = 1;
            r3 = 0;
        }
        dl81 dl81Var2 = this.d;
        byte[] bArr2 = dl81Var2.a;
        int i16 = dl81Var2.b;
        if (9400 - i16 < 188) {
            int i17 = dl81Var2.c - i16;
            if (i17 > 0) {
                System.arraycopy(bArr2, i16, bArr2, r3, i17);
            }
            dl81Var2.a = bArr2;
            dl81Var2.c = i17;
            dl81Var2.b = r3;
        }
        while (true) {
            int i18 = dl81Var2.c;
            int i19 = dl81Var2.b;
            if (i18 - i19 >= 188) {
                byte[] bArr3 = dl81Var2.a;
                int i20 = i19;
                while (i20 < i18 && bArr3[i20] != 71) {
                    i20++;
                }
                dl81Var2.m(i20);
                int i21 = i20 + 188;
                if (i21 > i18) {
                    int i22 = (i20 - i19) + this.r;
                    this.r = i22;
                    i3 = i;
                    i4 = 2;
                    if (i3 == 2 && i22 > 376) {
                        dy31.g(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                        return r3;
                    }
                } else {
                    i3 = i;
                    i4 = 2;
                    this.r = r3;
                }
                int i23 = dl81Var2.c;
                if (i21 > i23) {
                    return r3;
                }
                int a3 = dl81Var2.a();
                if ((8388608 & a3) != 0) {
                    dl81Var2.m(i21);
                    return r3;
                }
                int i24 = (4194304 & a3) != 0 ? i2 : r3;
                int i25 = (2096896 & a3) >> 8;
                int i26 = (a3 & 32) != 0 ? i2 : r3;
                w481 w481Var = (a3 & 16) != 0 ? (w481) this.g.get(i25) : null;
                if (w481Var == null) {
                    dl81Var2.m(i21);
                    return r3;
                }
                if (i3 != i4) {
                    int i27 = a3 & 15;
                    i5 = i2;
                    SparseIntArray sparseIntArray = this.e;
                    int i28 = sparseIntArray.get(i25, i27 - 1);
                    sparseIntArray.put(i25, i27);
                    if (i28 == i27) {
                        dl81Var2.m(i21);
                        return r3;
                    }
                    if (i27 != ((i28 + 1) & 15)) {
                        w481Var.a();
                    }
                } else {
                    i5 = i2;
                }
                if (i26 != 0) {
                    int s = dl81Var2.s();
                    i24 |= (dl81Var2.s() & 64) != 0 ? i4 : r3;
                    dl81Var2.m(dl81Var2.b + (s - 1));
                }
                boolean z4 = this.n;
                if (i3 == i4 || z4 || !this.i.get(i25, r3)) {
                    dl81Var2.k(i21);
                    w481Var.a(i24, dl81Var2);
                    dl81Var2.k(i23);
                }
                if (i3 != i4 && !z4 && this.n && j4 != -1) {
                    this.p = i5;
                }
                dl81Var2.m(i21);
                return r3;
            }
            int v = w971Var.v(i18, 9400 - i18, bArr2);
            if (v == -1) {
                return -1;
            }
            dl81Var2.k(i18 + v);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // defpackage.n771
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(bb71 bb71Var) {
        byte[] bArr = this.d.a;
        w971 w971Var = (w971) bb71Var;
        w971Var.I(bArr, 0, 940, false);
        int i = 0;
        while (i < 188) {
            for (int i2 = 0; i2 < 5; i2++) {
                if (bArr[(i2 * 188) + i] != 71) {
                    break;
                }
            }
            w971Var.b(i);
            return true;
        }
        return false;
    }
}
