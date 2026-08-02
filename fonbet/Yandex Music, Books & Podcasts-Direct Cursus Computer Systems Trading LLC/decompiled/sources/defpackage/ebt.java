package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ebt implements r2c {
    public final int a;
    public final int b;
    public final List c;
    public final d7k d;
    public final SparseIntArray e;
    public final et7 f;
    public final spr g;
    public final SparseArray h;
    public final SparseBooleanArray i;
    public final SparseBooleanArray j;
    public final a0n k;
    public pgc l;
    public t2c m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public gbt r;
    public int s;
    public int t;

    public ebt(int i, int i2, spr sprVar, ojs ojsVar, et7 et7Var) {
        this.f = et7Var;
        this.a = i;
        this.b = i2;
        this.g = sprVar;
        if (i == 1 || i == 2) {
            this.c = Collections.singletonList(ojsVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(ojsVar);
        }
        this.d = new d7k(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.i = sparseBooleanArray;
        this.j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        this.e = new SparseIntArray();
        this.k = new a0n(1);
        this.m = t2c.g0;
        this.t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (gbt) sparseArray2.valueAt(i3));
        }
        sparseArray.put(0, new x8p(new nur(this)));
        this.r = null;
    }

    @Override // defpackage.r2c
    public final void b(long j, long j2) {
        pgc pgcVar;
        long j3;
        SparseArray sparseArray = this.h;
        List list = this.c;
        vq1.A(this.a != 2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ojs ojsVar = (ojs) list.get(i);
            synchronized (ojsVar) {
                j3 = ojsVar.b;
            }
            boolean z = j3 == -9223372036854775807L;
            if (!z) {
                long d = ojsVar.d();
                z = (d == -9223372036854775807L || d == 0 || d == j2) ? false : true;
            }
            if (z) {
                ojsVar.f(j2);
            }
        }
        if (j2 != 0 && (pgcVar = this.l) != null) {
            pgcVar.B(j2);
        }
        this.d.E(0);
        this.e.clear();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((gbt) sparseArray.valueAt(i2)).c();
        }
        this.s = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // defpackage.r2c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(s2c s2cVar) {
        byte[] bArr = this.d.a;
        gm7 gm7Var = (gm7) s2cVar;
        gm7Var.l(bArr, 0, 940, false);
        int i = 0;
        while (i < 188) {
            for (int i2 = 0; i2 < 5; i2++) {
                if (bArr[(i2 * 188) + i] != 71) {
                    break;
                }
            }
            gm7Var.y(i);
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    @Override // defpackage.r2c
    public final int h(s2c s2cVar, ci0 ci0Var) {
        s2c s2cVar2;
        ?? r1;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        long length = s2cVar.getLength();
        int i5 = this.a;
        boolean z2 = i5 == 2;
        if (this.o) {
            long j = -9223372036854775807L;
            a0n a0nVar = this.k;
            if (length != -1 && !z2 && !a0nVar.d) {
                int i6 = this.t;
                ojs ojsVar = a0nVar.b;
                d7k d7kVar = a0nVar.c;
                if (i6 <= 0) {
                    a0nVar.a(s2cVar);
                    return 0;
                }
                if (a0nVar.f) {
                    if (a0nVar.h == -9223372036854775807L) {
                        a0nVar.a(s2cVar);
                        return 0;
                    }
                    if (a0nVar.e) {
                        long j2 = a0nVar.g;
                        if (j2 == -9223372036854775807L) {
                            a0nVar.a(s2cVar);
                            return 0;
                        }
                        a0nVar.i = ojsVar.c(a0nVar.h) - ojsVar.b(j2);
                        a0nVar.a(s2cVar);
                        return 0;
                    }
                    int min = (int) Math.min(112800, s2cVar.getLength());
                    long j3 = 0;
                    if (s2cVar.getPosition() != j3) {
                        ci0Var.a = j3;
                        return 1;
                    }
                    d7kVar.E(min);
                    s2cVar.n();
                    s2cVar.A(d7kVar.a, 0, min);
                    int i7 = d7kVar.b;
                    int i8 = d7kVar.c;
                    while (true) {
                        if (i7 >= i8) {
                            break;
                        }
                        if (d7kVar.a[i7] == 71) {
                            long U = f8g.U(d7kVar, i7, i6);
                            if (U != -9223372036854775807L) {
                                j = U;
                                break;
                            }
                        }
                        i7++;
                    }
                    a0nVar.g = j;
                    a0nVar.e = true;
                    return 0;
                }
                long length2 = s2cVar.getLength();
                int min2 = (int) Math.min(112800, length2);
                long j4 = length2 - min2;
                if (s2cVar.getPosition() != j4) {
                    ci0Var.a = j4;
                    return 1;
                }
                d7kVar.E(min2);
                s2cVar.n();
                s2cVar.A(d7kVar.a, 0, min2);
                int i9 = d7kVar.b;
                int i10 = d7kVar.c;
                int i11 = i10 - 188;
                while (true) {
                    if (i11 < i9) {
                        break;
                    }
                    byte[] bArr = d7kVar.a;
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
                                long U2 = f8g.U(d7kVar, i11, i6);
                                if (U2 != -9223372036854775807L) {
                                    j = U2;
                                    break;
                                }
                            }
                        }
                        i12++;
                    }
                    i11--;
                }
                a0nVar.h = j;
                a0nVar.f = true;
                return 0;
            }
            if (this.p) {
                i = 1;
                z = false;
                i2 = i5;
            } else {
                this.p = true;
                long j5 = a0nVar.i;
                if (j5 != -9223372036854775807L) {
                    i = 1;
                    z = false;
                    i2 = i5;
                    pgc pgcVar = new pgc(new d51(15), new w2r(this.t, a0nVar.b), j5, 1 + j5, 0L, length, 188L, 940);
                    this.l = pgcVar;
                    this.m.E((o03) pgcVar.c);
                } else {
                    i = 1;
                    z = false;
                    i2 = i5;
                    this.m.E(new zg2(j5));
                }
            }
            if (this.q) {
                this.q = z;
                b(0L, 0L);
                if (s2cVar.getPosition() != 0) {
                    ci0Var.a = 0L;
                    return i;
                }
            }
            pgc pgcVar2 = this.l;
            if (pgcVar2 != null && ((bq0) pgcVar2.e) != null) {
                return pgcVar2.t(s2cVar, ci0Var);
            }
            s2cVar2 = s2cVar;
            r1 = z;
        } else {
            s2cVar2 = s2cVar;
            r1 = 0;
            i = 1;
            i2 = i5;
        }
        d7k d7kVar2 = this.d;
        byte[] bArr2 = d7kVar2.a;
        if (9400 - d7kVar2.b < 188) {
            int a = d7kVar2.a();
            if (a > 0) {
                System.arraycopy(bArr2, d7kVar2.b, bArr2, r1, a);
            }
            d7kVar2.F(a, bArr2);
        }
        while (true) {
            int a2 = d7kVar2.a();
            SparseArray sparseArray = this.h;
            if (a2 >= 188) {
                int i15 = d7kVar2.b;
                int i16 = d7kVar2.c;
                byte[] bArr3 = d7kVar2.a;
                int i17 = i15;
                while (i17 < i16 && bArr3[i17] != 71) {
                    i17++;
                }
                d7kVar2.H(i17);
                int i18 = i17 + 188;
                if (i18 > i16) {
                    int i19 = (i17 - i15) + this.s;
                    this.s = i19;
                    i3 = i2;
                    i4 = 2;
                    if (i3 == 2 && i19 > 376) {
                        throw r7k.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i3 = i2;
                    i4 = 2;
                    this.s = r1;
                }
                int i20 = d7kVar2.c;
                if (i18 > i20) {
                    return r1;
                }
                int h = d7kVar2.h();
                if ((8388608 & h) != 0) {
                    d7kVar2.H(i18);
                    return r1;
                }
                int i21 = (4194304 & h) != 0 ? 1 : r1;
                int i22 = (2096896 & h) >> 8;
                boolean z3 = (h & 32) != 0 ? true : r1;
                gbt gbtVar = (h & 16) != 0 ? (gbt) sparseArray.get(i22) : null;
                if (gbtVar == null) {
                    d7kVar2.H(i18);
                    return r1;
                }
                if (i3 != i4) {
                    int i23 = h & 15;
                    SparseIntArray sparseIntArray = this.e;
                    int i24 = sparseIntArray.get(i22, i23 - 1);
                    sparseIntArray.put(i22, i23);
                    if (i24 == i23) {
                        d7kVar2.H(i18);
                        return r1;
                    }
                    if (i23 != ((i24 + 1) & 15)) {
                        gbtVar.c();
                    }
                }
                if (z3) {
                    int v = d7kVar2.v();
                    i21 |= (d7kVar2.v() & 64) != 0 ? i4 : r1;
                    d7kVar2.I(v - 1);
                }
                boolean z4 = this.o;
                if (i3 == i4 || z4 || !this.j.get(i22, r1)) {
                    d7kVar2.G(i18);
                    gbtVar.a(i21, d7kVar2);
                    d7kVar2.G(i20);
                }
                if (i3 != i4 && !z4 && this.o && length != -1) {
                    this.q = true;
                }
                d7kVar2.H(i18);
                return r1;
            }
            int i25 = d7kVar2.c;
            int read = s2cVar2.read(bArr2, i25, 9400 - i25);
            if (read == -1) {
                int i26 = r1;
                while (i26 < sparseArray.size()) {
                    gbt gbtVar2 = (gbt) sparseArray.valueAt(i26);
                    if (gbtVar2 instanceof zmk) {
                        zmk zmkVar = (zmk) gbtVar2;
                        int i27 = (!z2 || zmkVar.d()) ? i : r1;
                        if (zmkVar.c == 3 && zmkVar.j == -1 && ((!z2 || !(zmkVar.a instanceof lrd)) && i27 != 0)) {
                            zmkVar.a(i, new d7k());
                        }
                    }
                    i26++;
                    i = 1;
                }
                return -1;
            }
            d7kVar2.G(i25 + read);
            i = 1;
        }
    }

    @Override // defpackage.r2c
    public final void l(t2c t2cVar) {
        if ((this.b & 1) == 0) {
            t2cVar = new z0j(t2cVar, this.g);
        }
        this.m = t2cVar;
    }

    @Override // defpackage.r2c
    public final void a() {
    }
}
