package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class vi11 implements b5p {
    public final int a;
    public final int b;
    public final int c;
    public final List d;
    public final ef90 e;
    public final SparseIntArray f;
    public final ymh g;
    public final o2v0 h;
    public final SparseArray i;
    public final SparseBooleanArray j;
    public final SparseBooleanArray k;
    public final ayf0 l;
    public wer m;
    public d5p n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public yi11 s;
    public int t;
    public int u;

    public vi11(int i, int i2, o2v0 o2v0Var, sez0 sez0Var, ymh ymhVar) {
        this.g = ymhVar;
        this.c = 112800;
        this.a = i;
        this.b = i2;
        this.h = o2v0Var;
        if (i == 1 || i == 2) {
            this.d = Collections.singletonList(sez0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.d = arrayList;
            arrayList.add(sez0Var);
        }
        this.e = new ef90(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.j = sparseBooleanArray;
        this.k = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.i = sparseArray;
        this.f = new SparseIntArray();
        this.l = new ayf0(1);
        this.n = d5p.f2;
        this.u = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (yi11) sparseArray2.valueAt(i3));
        }
        kcz0 kcz0Var = new kcz0();
        kcz0Var.b = this;
        kcz0Var.a = new df90(new byte[4], 4);
        sparseArray.put(0, new l3q0(kcz0Var));
        this.s = null;
    }

    @Override // defpackage.b5p
    public final void a(long j, long j2) {
        wer werVar;
        long j3;
        SparseArray sparseArray = this.i;
        List list = this.d;
        d6z.x(this.a != 2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sez0 sez0Var = (sez0) list.get(i);
            synchronized (sez0Var) {
                j3 = sez0Var.b;
            }
            boolean z = j3 == -9223372036854775807L;
            if (!z) {
                long d = sez0Var.d();
                z = (d == -9223372036854775807L || d == 0 || d == j2) ? false : true;
            }
            if (z) {
                sez0Var.f(j2);
            }
        }
        if (j2 != 0 && (werVar = this.m) != null) {
            werVar.e(j2);
        }
        this.e.H(0);
        this.f.clear();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((yi11) sparseArray.valueAt(i2)).d();
        }
        this.t = 0;
    }

    @Override // defpackage.b5p
    public final void e(d5p d5pVar) {
        if ((this.b & 1) == 0) {
            d5pVar = new kzo(d5pVar, this.h);
        }
        this.n = d5pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    @Override // defpackage.b5p
    public final int g(c5p c5pVar, xde0 xde0Var) {
        c5p c5pVar2;
        ?? r1;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        long j;
        long length = c5pVar.getLength();
        int i5 = this.a;
        boolean z2 = i5 == 2;
        if (this.p) {
            long j2 = -9223372036854775807L;
            ayf0 ayf0Var = this.l;
            if (length != -1 && !z2 && !ayf0Var.d) {
                int i6 = this.u;
                sez0 sez0Var = ayf0Var.b;
                ef90 ef90Var = ayf0Var.c;
                if (i6 <= 0) {
                    ayf0Var.a(c5pVar);
                    return 0;
                }
                if (ayf0Var.f) {
                    if (ayf0Var.h == -9223372036854775807L) {
                        ayf0Var.a(c5pVar);
                        return 0;
                    }
                    if (ayf0Var.e) {
                        long j3 = ayf0Var.g;
                        if (j3 == -9223372036854775807L) {
                            ayf0Var.a(c5pVar);
                            return 0;
                        }
                        ayf0Var.i = sez0Var.c(ayf0Var.h) - sez0Var.b(j3);
                        ayf0Var.a(c5pVar);
                        return 0;
                    }
                    int min = (int) Math.min(112800L, c5pVar.getLength());
                    if (c5pVar.getPosition() != 0) {
                        xde0Var.a = 0L;
                        return 1;
                    }
                    ef90Var.H(min);
                    c5pVar.J();
                    c5pVar.g(0, min, ef90Var.a);
                    int i7 = ef90Var.b;
                    int i8 = ef90Var.c;
                    while (true) {
                        if (i7 >= i8) {
                            j = -9223372036854775807L;
                            break;
                        }
                        if (ef90Var.a[i7] == 71) {
                            j = tub1.c(ef90Var, i7, i6);
                            if (j != -9223372036854775807L) {
                                break;
                            }
                        }
                        i7++;
                    }
                    ayf0Var.g = j;
                    ayf0Var.e = true;
                    return 0;
                }
                long length2 = c5pVar.getLength();
                int min2 = (int) Math.min(112800L, length2);
                long j4 = length2 - min2;
                if (c5pVar.getPosition() != j4) {
                    xde0Var.a = j4;
                    return 1;
                }
                ef90Var.H(min2);
                c5pVar.J();
                c5pVar.g(0, min2, ef90Var.a);
                int i9 = ef90Var.b;
                int i10 = ef90Var.c;
                int i11 = i10 - 188;
                while (true) {
                    if (i11 < i9) {
                        break;
                    }
                    byte[] bArr = ef90Var.a;
                    int i12 = -4;
                    int i13 = 0;
                    while (true) {
                        if (i12 > 4) {
                            break;
                        }
                        int i14 = (i12 * 188) + i11;
                        if (i14 < i9 || i14 >= i10 || bArr[i14] != 71) {
                            i13 = 0;
                        } else {
                            i13++;
                            if (i13 == 5) {
                                long c = tub1.c(ef90Var, i11, i6);
                                if (c != -9223372036854775807L) {
                                    j2 = c;
                                    break;
                                }
                            }
                        }
                        i12++;
                    }
                    i11--;
                }
                ayf0Var.h = j2;
                ayf0Var.f = true;
                return 0;
            }
            if (this.q) {
                i = 1;
                z = false;
                i2 = i5;
            } else {
                this.q = true;
                long j5 = ayf0Var.i;
                if (j5 != -9223372036854775807L) {
                    z = false;
                    i2 = i5;
                    i = 1;
                    wer werVar = new wer(new wt5(), new yi6(this.u, ayf0Var.b, this.c), j5, j5 + 1, 0L, length, 188L, 940);
                    this.m = werVar;
                    this.n.w((vt5) werVar.b);
                } else {
                    i = 1;
                    z = false;
                    i2 = i5;
                    this.n.w(new qb4(j5));
                }
            }
            if (this.r) {
                this.r = z;
                a(0L, 0L);
                if (c5pVar.getPosition() != 0) {
                    xde0Var.a = 0L;
                    return i;
                }
            }
            wer werVar2 = this.m;
            if (werVar2 != null && ((xt5) werVar2.d) != null) {
                return werVar2.c(c5pVar, xde0Var);
            }
            c5pVar2 = c5pVar;
            r1 = z;
        } else {
            c5pVar2 = c5pVar;
            r1 = 0;
            i = 1;
            i2 = i5;
        }
        ef90 ef90Var2 = this.e;
        byte[] bArr2 = ef90Var2.a;
        if (9400 - ef90Var2.b < 188) {
            int a = ef90Var2.a();
            if (a > 0) {
                System.arraycopy(bArr2, ef90Var2.b, bArr2, r1, a);
            }
            ef90Var2.I(a, bArr2);
        }
        while (true) {
            int a2 = ef90Var2.a();
            SparseArray sparseArray = this.i;
            if (a2 >= 188) {
                int i15 = ef90Var2.b;
                int i16 = ef90Var2.c;
                byte[] bArr3 = ef90Var2.a;
                int i17 = i15;
                while (i17 < i16 && bArr3[i17] != 71) {
                    i17++;
                }
                ef90Var2.K(i17);
                int i18 = i17 + 188;
                if (i18 > i16) {
                    int i19 = (i17 - i15) + this.t;
                    this.t = i19;
                    i3 = i2;
                    i4 = 2;
                    if (i3 == 2 && i19 > 376) {
                        throw ParserException.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i3 = i2;
                    i4 = 2;
                    this.t = r1;
                }
                int i20 = ef90Var2.c;
                if (i18 > i20) {
                    return r1;
                }
                int k = ef90Var2.k();
                if ((8388608 & k) != 0) {
                    ef90Var2.K(i18);
                    return r1;
                }
                int i21 = (4194304 & k) != 0 ? 1 : r1;
                int i22 = (2096896 & k) >> 8;
                boolean z3 = (k & 32) != 0 ? true : r1;
                yi11 yi11Var = (k & 16) != 0 ? (yi11) sparseArray.get(i22) : null;
                if (yi11Var == null) {
                    ef90Var2.K(i18);
                    return r1;
                }
                if (i3 != i4) {
                    int i23 = k & 15;
                    SparseIntArray sparseIntArray = this.f;
                    int i24 = sparseIntArray.get(i22, i23 - 1);
                    sparseIntArray.put(i22, i23);
                    if (i24 == i23) {
                        ef90Var2.K(i18);
                        return r1;
                    }
                    if (i23 != ((i24 + 1) & 15)) {
                        yi11Var.d();
                    }
                }
                if (z3) {
                    int y = ef90Var2.y();
                    i21 |= (ef90Var2.y() & 64) != 0 ? i4 : r1;
                    ef90Var2.L(y - 1);
                }
                boolean z4 = this.p;
                if (i3 == i4 || z4 || !this.k.get(i22, r1)) {
                    ef90Var2.J(i18);
                    yi11Var.a(i21, ef90Var2);
                    ef90Var2.J(i20);
                }
                if (i3 != i4 && !z4 && this.p && length != -1) {
                    this.r = true;
                }
                ef90Var2.K(i18);
                return r1;
            }
            int i25 = ef90Var2.c;
            int read = c5pVar2.read(bArr2, i25, 9400 - i25);
            if (read == -1) {
                int i26 = r1;
                while (i26 < sparseArray.size()) {
                    yi11 yi11Var2 = (yi11) sparseArray.valueAt(i26);
                    if (yi11Var2 instanceof n8b0) {
                        n8b0 n8b0Var = (n8b0) yi11Var2;
                        int i27 = (!z2 || n8b0Var.e()) ? i : r1;
                        if (n8b0Var.c == 3 && n8b0Var.j == -1 && ((!z2 || !(n8b0Var.a instanceof t4u)) && i27 != 0)) {
                            n8b0Var.a(i, new ef90());
                        }
                    }
                    i26++;
                    i = 1;
                }
                return -1;
            }
            ef90Var2.J(i25 + read);
            i = 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // defpackage.b5p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(c5p c5pVar) {
        byte[] bArr = this.e.a;
        kbh kbhVar = (kbh) c5pVar;
        kbhVar.H(bArr, 0, 940, false);
        int i = 0;
        while (i < 188) {
            for (int i2 = 0; i2 < 5; i2++) {
                if (bArr[(i2 * 188) + i] != 71) {
                    break;
                }
            }
            kbhVar.O(i);
            return true;
        }
        return false;
    }

    @Override // defpackage.b5p
    public final void release() {
    }

    @Deprecated
    public vi11() {
        this(1, 1, o2v0.d4, new sez0(0L), new ymh(0));
    }
}
