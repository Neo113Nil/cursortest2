package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class rrd implements q2b {
    public final sfm a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public azs j;
    public qrd k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final csb d = new csb(7);
    public final csb e = new csb(8);
    public final csb f = new csb(6);
    public long m = -9223372036854775807L;
    public final d7k o = new d7k();

    public rrd(sfm sfmVar, boolean z, boolean z2) {
        this.a = sfmVar;
        this.b = z;
        this.c = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x01bd, code lost:
    
        if (r3.j == r4.j) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01c7, code lost:
    
        if (r8 != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01d9, code lost:
    
        if (r3.n == r4.n) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01ea, code lost:
    
        if (r3.p == r4.p) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01f8, code lost:
    
        if (r3.l == r4.l) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0253, code lost:
    
        if (r3 == 1) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0247  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j, long j2, int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        sj sjVar = (sj) this.a.c;
        if (!this.l || this.k.c) {
            csb csbVar = this.d;
            csbVar.d(i2);
            csb csbVar2 = this.e;
            csbVar2.d(i2);
            boolean z5 = this.l;
            boolean z6 = csbVar.e;
            if (z5) {
                if (z6) {
                    kwi U = zc4.U((byte[]) csbVar.f, 3, csbVar.c);
                    int i5 = U.s;
                    sjVar.getClass();
                    vq1.A(i5 >= 0);
                    sjVar.a = i5;
                    sjVar.h(i5);
                    this.k.d.append(U.d, U);
                    csbVar.f();
                } else if (csbVar2.e) {
                    v94 v94Var = new v94((byte[]) csbVar2.f, 4, csbVar2.c);
                    int m = v94Var.m();
                    int m2 = v94Var.m();
                    v94Var.s();
                    this.k.e.append(m, new jwi(m, m2, v94Var.h()));
                    csbVar2.f();
                }
            } else if (z6 && csbVar2.e) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf((byte[]) csbVar.f, csbVar.c));
                arrayList.add(Arrays.copyOf((byte[]) csbVar2.f, csbVar2.c));
                kwi U2 = zc4.U((byte[]) csbVar.f, 3, csbVar.c);
                int i6 = U2.s;
                v94 v94Var2 = new v94((byte[]) csbVar2.f, 4, csbVar2.c);
                int m3 = v94Var2.m();
                int m4 = v94Var2.m();
                v94Var2.s();
                jwi jwiVar = new jwi(m3, m4, v94Var2.h());
                String a = ir4.a(U2.a, U2.b, U2.c);
                azs azsVar = this.j;
                bsc bscVar = new bsc();
                bscVar.a = this.i;
                bscVar.l = l5i.p("video/mp2t");
                bscVar.m = l5i.p("video/avc");
                bscVar.j = a;
                bscVar.t = U2.e;
                bscVar.u = U2.f;
                bscVar.A = new q85(U2.p, U2.q, U2.r, U2.h + 8, U2.i + 8, null);
                bscVar.x = U2.g;
                bscVar.p = arrayList;
                bscVar.o = i6;
                eta.o(bscVar, azsVar);
                this.l = true;
                sjVar.getClass();
                vq1.A(i6 >= 0);
                sjVar.a = i6;
                sjVar.h(i6);
                this.k.d.append(U2.d, U2);
                this.k.e.append(m3, jwiVar);
                csbVar.f();
                csbVar2.f();
            }
        }
        csb csbVar3 = this.f;
        if (csbVar3.d(i2)) {
            int d0 = zc4.d0(csbVar3.c, (byte[]) csbVar3.f);
            byte[] bArr = (byte[]) csbVar3.f;
            d7k d7kVar = this.o;
            d7kVar.F(d0, bArr);
            d7kVar.H(4);
            sjVar.a(j2, d7kVar);
        }
        qrd qrdVar = this.k;
        boolean z7 = this.l;
        if (qrdVar.i != 9) {
            if (qrdVar.c) {
                prd prdVar = qrdVar.n;
                prd prdVar2 = qrdVar.m;
                if (prdVar.a) {
                    if (prdVar2.a) {
                        kwi kwiVar = prdVar.c;
                        vq1.B(kwiVar);
                        kwi kwiVar2 = prdVar2.c;
                        vq1.B(kwiVar2);
                        int i7 = kwiVar2.m;
                        if (prdVar.f == prdVar2.f) {
                            if (prdVar.g == prdVar2.g) {
                                if (prdVar.h == prdVar2.h) {
                                    if (prdVar.i) {
                                        if (prdVar2.i) {
                                        }
                                    }
                                    int i8 = prdVar.d;
                                    int i9 = prdVar2.d;
                                    if (i8 != i9) {
                                        if (i8 != 0) {
                                        }
                                    }
                                    int i10 = kwiVar.m;
                                    if (i10 == 0) {
                                        if (i7 == 0) {
                                            if (prdVar.m == prdVar2.m) {
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                        if (i7 == 1) {
                                            if (prdVar.o == prdVar2.o) {
                                            }
                                        }
                                    }
                                    boolean z8 = prdVar.k;
                                    if (z8 == prdVar2.k) {
                                        if (z8) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (qrdVar.b) {
                z = qrdVar.s;
            } else {
                prd prdVar3 = qrdVar.n;
                z = prdVar3.b && ((i4 = prdVar3.e) == 7 || i4 == 2);
            }
            boolean z9 = qrdVar.r;
            i3 = qrdVar.i;
            if (i3 == 5) {
                z4 = z ? true : true;
                z2 = false;
                z3 = z9 | z2;
                qrdVar.r = z3;
                qrdVar.i = 24;
                if (z3) {
                    this.n = false;
                    return;
                }
                return;
            }
            z2 = z4;
            z3 = z9 | z2;
            qrdVar.r = z3;
            qrdVar.i = 24;
            if (z3) {
            }
        }
        if (z7 && qrdVar.o) {
            long j3 = qrdVar.j;
            int i11 = i + ((int) (j - j3));
            long j4 = qrdVar.q;
            if (j4 != -9223372036854775807L) {
                long j5 = qrdVar.p;
                if (j3 != j5) {
                    qrdVar.a.a(j4, qrdVar.r ? 1 : 0, (int) (j3 - j5), i11, null);
                }
            }
        }
        qrdVar.p = qrdVar.j;
        qrdVar.q = qrdVar.l;
        qrdVar.r = false;
        qrdVar.o = true;
        if (qrdVar.b) {
        }
        boolean z92 = qrdVar.r;
        i3 = qrdVar.i;
        if (i3 == 5) {
        }
        z2 = z4;
        z3 = z92 | z2;
        qrdVar.r = z3;
        qrdVar.i = 24;
        if (z3) {
        }
    }

    @Override // defpackage.q2b
    public final void b(d7k d7kVar) {
        int i;
        vq1.B(this.j);
        int i2 = dvt.a;
        int i3 = d7kVar.b;
        int i4 = d7kVar.c;
        byte[] bArr = d7kVar.a;
        this.g += d7kVar.a();
        this.j.b(d7kVar, d7kVar.a(), 0);
        while (true) {
            int z = zc4.z(bArr, i3, i4, this.h);
            if (z == i4) {
                g(bArr, i3, i4);
                return;
            }
            int i5 = bArr[z + 3] & 31;
            if (z <= 0 || bArr[z - 1] != 0) {
                i = 3;
            } else {
                z--;
                i = 4;
            }
            int i6 = z;
            int i7 = i;
            int i8 = i6 - i3;
            if (i8 > 0) {
                g(bArr, i3, i6);
            }
            int i9 = i4 - i6;
            long j = this.g - i9;
            a(j, this.m, i9, i8 < 0 ? -i8 : 0);
            h(i5, j, this.m);
            i3 = i6 + i7;
        }
    }

    @Override // defpackage.q2b
    public final void c() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        zc4.t(this.h);
        this.d.f();
        this.e.f();
        this.f.f();
        ((sj) this.a.c).h(0);
        qrd qrdVar = this.k;
        if (qrdVar != null) {
            qrdVar.k = false;
            qrdVar.o = false;
            prd prdVar = qrdVar.n;
            prdVar.b = false;
            prdVar.a = false;
        }
    }

    @Override // defpackage.q2b
    public final void d(boolean z) {
        vq1.B(this.j);
        int i = dvt.a;
        if (z) {
            ((sj) this.a.c).h(0);
            a(this.g, this.m, 0, 0);
            h(9, this.g, this.m);
            a(this.g, this.m, 0, 0);
        }
    }

    @Override // defpackage.q2b
    public final void e(t2c t2cVar, cp2 cp2Var) {
        cp2Var.g();
        cp2Var.i();
        this.i = (String) cp2Var.e;
        cp2Var.i();
        azs M = t2cVar.M(cp2Var.c, 2);
        this.j = M;
        this.k = new qrd(M, this.b, this.c);
        this.a.n(t2cVar, cp2Var);
    }

    @Override // defpackage.q2b
    public final void f(int i, long j) {
        this.m = j;
        this.n = ((i & 2) != 0) | this.n;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(byte[] bArr, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (!this.l || this.k.c) {
            this.d.a(bArr, i, i2);
            this.e.a(bArr, i, i2);
        }
        this.f.a(bArr, i, i2);
        qrd qrdVar = this.k;
        SparseArray sparseArray = qrdVar.e;
        v94 v94Var = qrdVar.f;
        if (qrdVar.k) {
            int i9 = i2 - i;
            byte[] bArr2 = qrdVar.g;
            int length = bArr2.length;
            int i10 = qrdVar.h + i9;
            if (length < i10) {
                qrdVar.g = Arrays.copyOf(bArr2, i10 * 2);
            }
            System.arraycopy(bArr, i, qrdVar.g, qrdVar.h, i9);
            int i11 = qrdVar.h + i9;
            qrdVar.h = i11;
            v94Var.b = qrdVar.g;
            v94Var.d = 0;
            v94Var.c = i11;
            v94Var.e = 0;
            v94Var.a();
            if (v94Var.d(8)) {
                v94Var.s();
                int i12 = v94Var.i(2);
                v94Var.t(5);
                if (v94Var.e()) {
                    v94Var.m();
                    if (v94Var.e()) {
                        int m = v94Var.m();
                        if (!qrdVar.c) {
                            qrdVar.k = false;
                            prd prdVar = qrdVar.n;
                            prdVar.e = m;
                            prdVar.b = true;
                            return;
                        }
                        if (v94Var.e()) {
                            int m2 = v94Var.m();
                            if (sparseArray.indexOfKey(m2) < 0) {
                                qrdVar.k = false;
                                return;
                            }
                            jwi jwiVar = (jwi) sparseArray.get(m2);
                            SparseArray sparseArray2 = qrdVar.d;
                            int i13 = jwiVar.a;
                            boolean z5 = jwiVar.b;
                            kwi kwiVar = (kwi) sparseArray2.get(i13);
                            boolean z6 = kwiVar.j;
                            int i14 = kwiVar.n;
                            int i15 = kwiVar.l;
                            if (z6) {
                                if (!v94Var.d(2)) {
                                    return;
                                } else {
                                    v94Var.t(2);
                                }
                            }
                            if (v94Var.d(i15)) {
                                int i16 = v94Var.i(i15);
                                if (kwiVar.k) {
                                    z = false;
                                    z2 = false;
                                } else {
                                    if (!v94Var.d(1)) {
                                        return;
                                    }
                                    z = v94Var.h();
                                    if (z) {
                                        if (v94Var.d(1)) {
                                            z2 = v94Var.h();
                                            z3 = true;
                                            z4 = qrdVar.i != 5;
                                            if (z4) {
                                                i3 = 0;
                                            } else if (!v94Var.e()) {
                                                return;
                                            } else {
                                                i3 = v94Var.m();
                                            }
                                            i4 = kwiVar.m;
                                            if (i4 != 0) {
                                                if (!v94Var.d(i14)) {
                                                    return;
                                                }
                                                i7 = v94Var.i(i14);
                                                if (!z5 || z) {
                                                    i5 = 0;
                                                } else if (!v94Var.e()) {
                                                    return;
                                                } else {
                                                    i5 = v94Var.n();
                                                }
                                                i6 = 0;
                                            } else {
                                                if (i4 == 1 && !kwiVar.o) {
                                                    if (v94Var.e()) {
                                                        int n = v94Var.n();
                                                        if (!z5 || z) {
                                                            i8 = n;
                                                            i5 = 0;
                                                            i6 = 0;
                                                        } else {
                                                            if (!v94Var.e()) {
                                                                return;
                                                            }
                                                            i6 = v94Var.n();
                                                            i8 = n;
                                                            i5 = 0;
                                                        }
                                                        i7 = 0;
                                                        prd prdVar2 = qrdVar.n;
                                                        prdVar2.c = kwiVar;
                                                        prdVar2.d = i12;
                                                        prdVar2.e = m;
                                                        prdVar2.f = i16;
                                                        prdVar2.g = m2;
                                                        prdVar2.h = z;
                                                        prdVar2.i = z3;
                                                        prdVar2.j = z2;
                                                        prdVar2.k = z4;
                                                        prdVar2.l = i3;
                                                        prdVar2.m = i7;
                                                        prdVar2.n = i5;
                                                        prdVar2.o = i8;
                                                        prdVar2.p = i6;
                                                        prdVar2.a = true;
                                                        prdVar2.b = true;
                                                        qrdVar.k = false;
                                                    }
                                                    return;
                                                }
                                                i5 = 0;
                                                i6 = 0;
                                                i7 = 0;
                                            }
                                            i8 = 0;
                                            prd prdVar22 = qrdVar.n;
                                            prdVar22.c = kwiVar;
                                            prdVar22.d = i12;
                                            prdVar22.e = m;
                                            prdVar22.f = i16;
                                            prdVar22.g = m2;
                                            prdVar22.h = z;
                                            prdVar22.i = z3;
                                            prdVar22.j = z2;
                                            prdVar22.k = z4;
                                            prdVar22.l = i3;
                                            prdVar22.m = i7;
                                            prdVar22.n = i5;
                                            prdVar22.o = i8;
                                            prdVar22.p = i6;
                                            prdVar22.a = true;
                                            prdVar22.b = true;
                                            qrdVar.k = false;
                                        }
                                        return;
                                    }
                                    z2 = false;
                                }
                                z3 = z2;
                                if (qrdVar.i != 5) {
                                }
                                if (z4) {
                                }
                                i4 = kwiVar.m;
                                if (i4 != 0) {
                                }
                                i8 = 0;
                                prd prdVar222 = qrdVar.n;
                                prdVar222.c = kwiVar;
                                prdVar222.d = i12;
                                prdVar222.e = m;
                                prdVar222.f = i16;
                                prdVar222.g = m2;
                                prdVar222.h = z;
                                prdVar222.i = z3;
                                prdVar222.j = z2;
                                prdVar222.k = z4;
                                prdVar222.l = i3;
                                prdVar222.m = i7;
                                prdVar222.n = i5;
                                prdVar222.o = i8;
                                prdVar222.p = i6;
                                prdVar222.a = true;
                                prdVar222.b = true;
                                qrdVar.k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void h(int i, long j, long j2) {
        if (!this.l || this.k.c) {
            this.d.g(i);
            this.e.g(i);
        }
        this.f.g(i);
        qrd qrdVar = this.k;
        boolean z = this.n;
        qrdVar.i = i;
        qrdVar.l = j2;
        qrdVar.j = j;
        qrdVar.s = z;
        if (!qrdVar.b || i != 1) {
            if (!qrdVar.c) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        prd prdVar = qrdVar.m;
        qrdVar.m = qrdVar.n;
        qrdVar.n = prdVar;
        prdVar.b = false;
        prdVar.a = false;
        qrdVar.h = 0;
        qrdVar.k = true;
    }
}
