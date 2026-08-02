package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class z4u implements tqn {
    public final amp0 a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public g001 j;
    public y4u k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final c150 d = new c150(7, 0);
    public final c150 e = new c150(8, 0);
    public final c150 f = new c150(6, 0);
    public long m = -9223372036854775807L;
    public final ef90 o = new ef90();

    public z4u(amp0 amp0Var, boolean z, boolean z2) {
        this.a = amp0Var;
        this.b = z;
        this.c = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x01af, code lost:
    
        if (r3.j == r4.j) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01b9, code lost:
    
        if (r9 != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01cb, code lost:
    
        if (r3.n == r4.n) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01db, code lost:
    
        if (r3.p == r4.p) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01e9, code lost:
    
        if (r3.l == r4.l) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0237  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, int i2, long j, long j2) {
        boolean z;
        int i3;
        boolean z2;
        int i4;
        zp1 zp1Var = (zp1) this.a.c;
        boolean z3 = true;
        if (!this.l || this.k.c) {
            c150 c150Var = this.d;
            c150Var.e(i2);
            c150 c150Var2 = this.e;
            c150Var2.e(i2);
            boolean z4 = this.l;
            boolean z5 = c150Var.c;
            if (z4) {
                if (z5) {
                    k150 j3 = l150.j(3, c150Var.e, c150Var.d);
                    int i5 = j3.s;
                    zp1Var.getClass();
                    d6z.x(i5 >= 0);
                    zp1Var.a = i5;
                    zp1Var.g(i5);
                    this.k.d.append(j3.d, j3);
                    c150Var.f();
                } else if (c150Var2.c) {
                    a69 a69Var = new a69(4, c150Var2.e, 1, c150Var2.d);
                    int q = a69Var.q();
                    int q2 = a69Var.q();
                    a69Var.t();
                    this.k.e.append(q, new j150(q, q2, a69Var.o()));
                    c150Var2.f();
                }
            } else if (z5 && c150Var2.c) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(c150Var.d, c150Var.e));
                arrayList.add(Arrays.copyOf(c150Var2.d, c150Var2.e));
                k150 j4 = l150.j(3, c150Var.e, c150Var.d);
                int i6 = j4.s;
                a69 a69Var2 = new a69(4, c150Var2.e, 1, c150Var2.d);
                int q3 = a69Var2.q();
                int q4 = a69Var2.q();
                a69Var2.t();
                j150 j150Var = new j150(q3, q4, a69Var2.o());
                String a = bac.a(j4.a, j4.b, j4.c);
                g001 g001Var = this.j;
                f7s f7sVar = new f7s();
                f7sVar.a = this.i;
                f7sVar.l = eh20.q("video/mp2t");
                f7sVar.m = eh20.q("video/avc");
                f7sVar.j = a;
                f7sVar.t = j4.e;
                f7sVar.u = j4.f;
                jfc jfcVar = new jfc();
                jfcVar.a = j4.p;
                jfcVar.b = j4.q;
                jfcVar.c = j4.r;
                jfcVar.e = j4.h + 8;
                jfcVar.f = j4.i + 8;
                f7sVar.A = jfcVar.a();
                f7sVar.x = j4.g;
                f7sVar.p = arrayList;
                f7sVar.o = i6;
                smw0.u(f7sVar, g001Var);
                this.l = true;
                zp1Var.getClass();
                d6z.x(i6 >= 0);
                zp1Var.a = i6;
                zp1Var.g(i6);
                this.k.d.append(j4.d, j4);
                this.k.e.append(q3, j150Var);
                c150Var.f();
                c150Var2.f();
            }
        }
        c150 c150Var3 = this.f;
        if (c150Var3.e(i2)) {
            int l = l150.l(c150Var3.e, c150Var3.d);
            byte[] bArr = c150Var3.d;
            ef90 ef90Var = this.o;
            ef90Var.I(l, bArr);
            ef90Var.K(4);
            zp1Var.b(j2, ef90Var);
        }
        y4u y4uVar = this.k;
        boolean z6 = this.l;
        if (y4uVar.i != 9) {
            if (y4uVar.c) {
                x4u x4uVar = y4uVar.n;
                x4u x4uVar2 = y4uVar.m;
                if (x4uVar.a) {
                    if (x4uVar2.a) {
                        k150 k150Var = x4uVar.c;
                        d6z.z(k150Var);
                        k150 k150Var2 = x4uVar2.c;
                        d6z.z(k150Var2);
                        int i7 = k150Var2.m;
                        if (x4uVar.f == x4uVar2.f) {
                            if (x4uVar.g == x4uVar2.g) {
                                if (x4uVar.h == x4uVar2.h) {
                                    if (x4uVar.i) {
                                        if (x4uVar2.i) {
                                        }
                                    }
                                    int i8 = x4uVar.d;
                                    int i9 = x4uVar2.d;
                                    if (i8 != i9) {
                                        if (i8 != 0) {
                                        }
                                    }
                                    int i10 = k150Var.m;
                                    if (i10 == 0) {
                                        if (i7 == 0) {
                                            if (x4uVar.m == x4uVar2.m) {
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                        if (i7 == 1) {
                                            if (x4uVar.o == x4uVar2.o) {
                                            }
                                        }
                                    }
                                    boolean z7 = x4uVar.k;
                                    if (z7 == x4uVar2.k) {
                                        if (z7) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (y4uVar.b) {
                z = y4uVar.s;
            } else {
                x4u x4uVar3 = y4uVar.n;
                z = x4uVar3.b && ((i4 = x4uVar3.e) == 7 || i4 == 2);
            }
            boolean z8 = y4uVar.r;
            i3 = y4uVar.i;
            if (i3 != 5 && (!z || i3 != 1)) {
                z3 = false;
            }
            z2 = z8 | z3;
            y4uVar.r = z2;
            y4uVar.i = 24;
            if (z2) {
                return;
            }
            this.n = false;
            return;
        }
        if (z6 && y4uVar.o) {
            long j5 = y4uVar.j;
            int i11 = i + ((int) (j - j5));
            long j6 = y4uVar.q;
            if (j6 != -9223372036854775807L) {
                long j7 = y4uVar.p;
                if (j5 != j7) {
                    y4uVar.a.c(j6, y4uVar.r ? 1 : 0, (int) (j5 - j7), i11, null);
                }
            }
        }
        y4uVar.p = y4uVar.j;
        y4uVar.q = y4uVar.l;
        y4uVar.r = false;
        y4uVar.o = true;
        if (y4uVar.b) {
        }
        boolean z82 = y4uVar.r;
        i3 = y4uVar.i;
        if (i3 != 5) {
            z3 = false;
        }
        z2 = z82 | z3;
        y4uVar.r = z2;
        y4uVar.i = 24;
        if (z2) {
        }
    }

    @Override // defpackage.tqn
    public final void b(ef90 ef90Var) {
        int i;
        d6z.z(this.j);
        int i2 = tw21.a;
        int i3 = ef90Var.b;
        int i4 = ef90Var.c;
        byte[] bArr = ef90Var.a;
        this.g += ef90Var.a();
        this.j.a(ef90Var, ef90Var.a(), 0);
        while (true) {
            int b = l150.b(bArr, i3, i4, this.h);
            if (b == i4) {
                c(i3, i4, bArr);
                return;
            }
            int i5 = bArr[b + 3] & 31;
            if (b <= 0 || bArr[b - 1] != 0) {
                i = 3;
            } else {
                b--;
                i = 4;
            }
            int i6 = b;
            int i7 = i;
            int i8 = i6 - i3;
            if (i8 > 0) {
                c(i3, i6, bArr);
            }
            int i9 = i4 - i6;
            long j = this.g - i9;
            a(i9, i8 < 0 ? -i8 : 0, j, this.m);
            f(i5, j, this.m);
            i3 = i6 + i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i, int i2, byte[] bArr) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        int r;
        int i7;
        if (!this.l || this.k.c) {
            this.d.c(i, i2, bArr);
            this.e.c(i, i2, bArr);
        }
        this.f.c(i, i2, bArr);
        y4u y4uVar = this.k;
        SparseArray sparseArray = y4uVar.e;
        a69 a69Var = y4uVar.f;
        if (y4uVar.k) {
            int i8 = i2 - i;
            byte[] bArr2 = y4uVar.g;
            int length = bArr2.length;
            int i9 = y4uVar.h + i8;
            if (length < i9) {
                y4uVar.g = Arrays.copyOf(bArr2, i9 * 2);
            }
            System.arraycopy(bArr, i, y4uVar.g, y4uVar.h, i8);
            int i10 = y4uVar.h + i8;
            y4uVar.h = i10;
            a69Var.b = y4uVar.g;
            a69Var.d = 0;
            a69Var.c = i10;
            a69Var.e = 0;
            a69Var.d();
            if (a69Var.i(8)) {
                a69Var.t();
                int p = a69Var.p(2);
                a69Var.u(5);
                if (a69Var.j()) {
                    a69Var.q();
                    if (a69Var.j()) {
                        int q = a69Var.q();
                        if (!y4uVar.c) {
                            y4uVar.k = false;
                            x4u x4uVar = y4uVar.n;
                            x4uVar.e = q;
                            x4uVar.b = true;
                            return;
                        }
                        if (a69Var.j()) {
                            int q2 = a69Var.q();
                            if (sparseArray.indexOfKey(q2) < 0) {
                                y4uVar.k = false;
                                return;
                            }
                            j150 j150Var = (j150) sparseArray.get(q2);
                            SparseArray sparseArray2 = y4uVar.d;
                            int i11 = j150Var.a;
                            boolean z5 = j150Var.b;
                            k150 k150Var = (k150) sparseArray2.get(i11);
                            boolean z6 = k150Var.j;
                            int i12 = k150Var.n;
                            int i13 = k150Var.l;
                            if (z6) {
                                if (!a69Var.i(2)) {
                                    return;
                                } else {
                                    a69Var.u(2);
                                }
                            }
                            if (a69Var.i(i13)) {
                                int p2 = a69Var.p(i13);
                                if (k150Var.k) {
                                    z = false;
                                    z2 = false;
                                } else {
                                    if (!a69Var.i(1)) {
                                        return;
                                    }
                                    z = a69Var.o();
                                    if (z) {
                                        if (a69Var.i(1)) {
                                            z2 = a69Var.o();
                                            z3 = true;
                                            z4 = y4uVar.i != 5;
                                            if (z4) {
                                                i3 = 0;
                                            } else if (!a69Var.j()) {
                                                return;
                                            } else {
                                                i3 = a69Var.q();
                                            }
                                            i4 = k150Var.m;
                                            if (i4 != 0) {
                                                if (!a69Var.i(i12)) {
                                                    return;
                                                }
                                                i5 = a69Var.p(i12);
                                                if (z5 && !z) {
                                                    if (a69Var.j()) {
                                                        i7 = a69Var.r();
                                                        i6 = 0;
                                                        r = 0;
                                                        x4u x4uVar2 = y4uVar.n;
                                                        x4uVar2.c = k150Var;
                                                        x4uVar2.d = p;
                                                        x4uVar2.e = q;
                                                        x4uVar2.f = p2;
                                                        x4uVar2.g = q2;
                                                        x4uVar2.h = z;
                                                        x4uVar2.i = z3;
                                                        x4uVar2.j = z2;
                                                        x4uVar2.k = z4;
                                                        x4uVar2.l = i3;
                                                        x4uVar2.m = i5;
                                                        x4uVar2.n = i7;
                                                        x4uVar2.o = i6;
                                                        x4uVar2.p = r;
                                                        x4uVar2.a = true;
                                                        x4uVar2.b = true;
                                                        y4uVar.k = false;
                                                    }
                                                    return;
                                                }
                                            } else {
                                                if (i4 == 1 && !k150Var.o) {
                                                    if (a69Var.j()) {
                                                        int r2 = a69Var.r();
                                                        if (!z5 || z) {
                                                            i6 = r2;
                                                            i5 = 0;
                                                            i7 = 0;
                                                            r = 0;
                                                            x4u x4uVar22 = y4uVar.n;
                                                            x4uVar22.c = k150Var;
                                                            x4uVar22.d = p;
                                                            x4uVar22.e = q;
                                                            x4uVar22.f = p2;
                                                            x4uVar22.g = q2;
                                                            x4uVar22.h = z;
                                                            x4uVar22.i = z3;
                                                            x4uVar22.j = z2;
                                                            x4uVar22.k = z4;
                                                            x4uVar22.l = i3;
                                                            x4uVar22.m = i5;
                                                            x4uVar22.n = i7;
                                                            x4uVar22.o = i6;
                                                            x4uVar22.p = r;
                                                            x4uVar22.a = true;
                                                            x4uVar22.b = true;
                                                            y4uVar.k = false;
                                                        }
                                                        if (a69Var.j()) {
                                                            r = a69Var.r();
                                                            i7 = 0;
                                                            i6 = r2;
                                                            i5 = 0;
                                                            x4u x4uVar222 = y4uVar.n;
                                                            x4uVar222.c = k150Var;
                                                            x4uVar222.d = p;
                                                            x4uVar222.e = q;
                                                            x4uVar222.f = p2;
                                                            x4uVar222.g = q2;
                                                            x4uVar222.h = z;
                                                            x4uVar222.i = z3;
                                                            x4uVar222.j = z2;
                                                            x4uVar222.k = z4;
                                                            x4uVar222.l = i3;
                                                            x4uVar222.m = i5;
                                                            x4uVar222.n = i7;
                                                            x4uVar222.o = i6;
                                                            x4uVar222.p = r;
                                                            x4uVar222.a = true;
                                                            x4uVar222.b = true;
                                                            y4uVar.k = false;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                                i5 = 0;
                                            }
                                            i6 = 0;
                                            i7 = 0;
                                            r = 0;
                                            x4u x4uVar2222 = y4uVar.n;
                                            x4uVar2222.c = k150Var;
                                            x4uVar2222.d = p;
                                            x4uVar2222.e = q;
                                            x4uVar2222.f = p2;
                                            x4uVar2222.g = q2;
                                            x4uVar2222.h = z;
                                            x4uVar2222.i = z3;
                                            x4uVar2222.j = z2;
                                            x4uVar2222.k = z4;
                                            x4uVar2222.l = i3;
                                            x4uVar2222.m = i5;
                                            x4uVar2222.n = i7;
                                            x4uVar2222.o = i6;
                                            x4uVar2222.p = r;
                                            x4uVar2222.a = true;
                                            x4uVar2222.b = true;
                                            y4uVar.k = false;
                                        }
                                        return;
                                    }
                                    z2 = false;
                                }
                                z3 = z2;
                                if (y4uVar.i != 5) {
                                }
                                if (z4) {
                                }
                                i4 = k150Var.m;
                                if (i4 != 0) {
                                }
                                i6 = 0;
                                i7 = 0;
                                r = 0;
                                x4u x4uVar22222 = y4uVar.n;
                                x4uVar22222.c = k150Var;
                                x4uVar22222.d = p;
                                x4uVar22222.e = q;
                                x4uVar22222.f = p2;
                                x4uVar22222.g = q2;
                                x4uVar22222.h = z;
                                x4uVar22222.i = z3;
                                x4uVar22222.j = z2;
                                x4uVar22222.k = z4;
                                x4uVar22222.l = i3;
                                x4uVar22222.m = i5;
                                x4uVar22222.n = i7;
                                x4uVar22222.o = i6;
                                x4uVar22222.p = r;
                                x4uVar22222.a = true;
                                x4uVar22222.b = true;
                                y4uVar.k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.tqn
    public final void d() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        l150.a(this.h);
        this.d.f();
        this.e.f();
        this.f.f();
        ((zp1) this.a.c).g(0);
        y4u y4uVar = this.k;
        if (y4uVar != null) {
            y4uVar.k = false;
            y4uVar.o = false;
            x4u x4uVar = y4uVar.n;
            x4uVar.b = false;
            x4uVar.a = false;
        }
    }

    @Override // defpackage.tqn
    public final void e(int i, long j) {
        this.m = j;
        this.n = ((i & 2) != 0) | this.n;
    }

    public final void f(int i, long j, long j2) {
        if (!this.l || this.k.c) {
            this.d.g(i);
            this.e.g(i);
        }
        this.f.g(i);
        y4u y4uVar = this.k;
        boolean z = this.n;
        y4uVar.i = i;
        y4uVar.l = j2;
        y4uVar.j = j;
        y4uVar.s = z;
        if (!y4uVar.b || i != 1) {
            if (!y4uVar.c) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        x4u x4uVar = y4uVar.m;
        y4uVar.m = y4uVar.n;
        y4uVar.n = x4uVar;
        x4uVar.b = false;
        x4uVar.a = false;
        y4uVar.h = 0;
        y4uVar.k = true;
    }

    @Override // defpackage.tqn
    public final void g(boolean z) {
        d6z.z(this.j);
        int i = tw21.a;
        if (z) {
            ((zp1) this.a.c).g(0);
            a(0, 0, this.g, this.m);
            f(9, this.g, this.m);
            a(0, 0, this.g, this.m);
        }
    }

    @Override // defpackage.tqn
    public final void h(d5p d5pVar, xi11 xi11Var) {
        xi11Var.c();
        xi11Var.d();
        this.i = xi11Var.e;
        xi11Var.d();
        g001 B = d5pVar.B(xi11Var.d, 2);
        this.j = B;
        this.k = new y4u(B, this.b, this.c);
        this.a.H(d5pVar, xi11Var);
    }
}
