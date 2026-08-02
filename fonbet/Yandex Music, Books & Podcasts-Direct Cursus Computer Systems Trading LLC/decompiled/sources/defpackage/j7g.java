package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j7g {
    public static boolean q = false;
    public final psm d;
    public final osh m;
    public bz0 p;
    public int a = 1000;
    public boolean b = false;
    public int c = 0;
    public int e = 32;
    public int f = 32;
    public boolean h = false;
    public boolean[] i = new boolean[32];
    public int j = 1;
    public int k = 0;
    public int l = 32;
    public i3r[] n = new i3r[1000];
    public int o = 0;
    public bz0[] g = new bz0[32];

    public j7g() {
        s();
        osh oshVar = new osh();
        oshVar.a = new dhm();
        oshVar.b = new dhm();
        oshVar.c = new i3r[32];
        this.m = oshVar;
        psm psmVar = new psm(oshVar);
        psmVar.f = new i3r[128];
        psmVar.g = new i3r[128];
        psmVar.h = 0;
        psmVar.i = new aqd(psmVar);
        this.d = psmVar;
        this.p = new bz0(oshVar);
    }

    public static int n(Object obj) {
        i3r i3rVar = ((o86) obj).i;
        if (i3rVar != null) {
            return (int) (i3rVar.e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final i3r a(int i) {
        dhm dhmVar = (dhm) this.m.b;
        int i2 = dhmVar.b;
        i3r i3rVar = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = dhmVar.a;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            dhmVar.b = i3;
            i3rVar = r4;
        }
        i3r i3rVar2 = i3rVar;
        if (i3rVar2 == null) {
            i3rVar2 = new i3r(i);
            i3rVar2.l = i;
        } else {
            i3rVar2.c();
            i3rVar2.l = i;
        }
        int i4 = this.o;
        int i5 = this.a;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            this.a = i6;
            this.n = (i3r[]) Arrays.copyOf(this.n, i6);
        }
        i3r[] i3rVarArr = this.n;
        int i7 = this.o;
        this.o = i7 + 1;
        i3rVarArr[i7] = i3rVar2;
        return i3rVar2;
    }

    public final void b(i3r i3rVar, i3r i3rVar2, int i, float f, i3r i3rVar3, i3r i3rVar4, int i2, int i3) {
        bz0 l = l();
        if (i3rVar2 == i3rVar3) {
            l.d.g(i3rVar, 1.0f);
            l.d.g(i3rVar4, 1.0f);
            l.d.g(i3rVar2, -2.0f);
        } else {
            py0 py0Var = l.d;
            if (f == 0.5f) {
                py0Var.g(i3rVar, 1.0f);
                l.d.g(i3rVar2, -1.0f);
                l.d.g(i3rVar3, -1.0f);
                l.d.g(i3rVar4, 1.0f);
                if (i > 0 || i2 > 0) {
                    l.b = (-i) + i2;
                }
            } else if (f <= 0.0f) {
                py0Var.g(i3rVar, -1.0f);
                l.d.g(i3rVar2, 1.0f);
                l.b = i;
            } else if (f >= 1.0f) {
                py0Var.g(i3rVar4, -1.0f);
                l.d.g(i3rVar3, 1.0f);
                l.b = -i2;
            } else {
                float f2 = 1.0f - f;
                py0Var.g(i3rVar, f2 * 1.0f);
                l.d.g(i3rVar2, f2 * (-1.0f));
                l.d.g(i3rVar3, (-1.0f) * f);
                l.d.g(i3rVar4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    l.b = (i2 * f) + ((-i) * f2);
                }
            }
        }
        if (i3 != 8) {
            l.a(this, i3);
        }
        c(l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d3, code lost:
    
        if (r4.k <= 1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d6, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e0, code lost:
    
        if (r4.k <= 1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f5, code lost:
    
        if (r4.k <= 1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f8, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0102, code lost:
    
        if (r4.k <= 1) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(bz0 bz0Var) {
        boolean z;
        boolean z2;
        i3r i3rVar;
        i3r f;
        if (this.k + 1 >= this.l || this.j + 1 >= this.f) {
            o();
        }
        if (bz0Var.e) {
            z = false;
        } else {
            ArrayList arrayList = bz0Var.c;
            if (this.g.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int d = bz0Var.d.d();
                    for (int i = 0; i < d; i++) {
                        i3r e = bz0Var.d.e(i);
                        if (e.c != -1 || e.f) {
                            arrayList.add(e);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            i3r i3rVar2 = (i3r) arrayList.get(i2);
                            if (i3rVar2.f) {
                                bz0Var.h(this, i3rVar2, true);
                            } else {
                                bz0Var.i(this, this.g[i3rVar2.c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (bz0Var.a != null && bz0Var.d.d() == 0) {
                    bz0Var.e = true;
                    this.b = true;
                }
            }
            if (bz0Var.e()) {
                return;
            }
            float f2 = bz0Var.b;
            float f3 = 0.0f;
            if (f2 < 0.0f) {
                bz0Var.b = f2 * (-1.0f);
                py0 py0Var = bz0Var.d;
                int i3 = py0Var.h;
                for (int i4 = 0; i3 != -1 && i4 < py0Var.a; i4++) {
                    float[] fArr = py0Var.g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = py0Var.f[i3];
                }
            }
            int d2 = bz0Var.d.d();
            float f4 = 0.0f;
            float f5 = 0.0f;
            i3r i3rVar3 = null;
            i3r i3rVar4 = null;
            int i5 = 0;
            boolean z4 = false;
            boolean z5 = false;
            while (i5 < d2) {
                float f6 = bz0Var.d.f(i5);
                i3r e2 = bz0Var.d.e(i5);
                float f7 = f3;
                if (e2.l == 1) {
                    if (i3rVar3 != null) {
                        if (f4 <= f6) {
                            if (!z4) {
                                if (e2.k > 1) {
                                }
                            }
                        }
                        z4 = true;
                    }
                    i3rVar3 = e2;
                    f4 = f6;
                } else if (i3rVar3 == null && f6 < f7) {
                    if (i3rVar4 != null) {
                        if (f5 <= f6) {
                            if (!z5) {
                                if (e2.k > 1) {
                                }
                            }
                        }
                        z5 = true;
                    }
                    i3rVar4 = e2;
                    f5 = f6;
                }
                i5++;
                f3 = f7;
            }
            float f8 = f3;
            if (i3rVar3 == null) {
                i3rVar3 = i3rVar4;
            }
            if (i3rVar3 == null) {
                z2 = true;
            } else {
                bz0Var.g(i3rVar3);
                z2 = false;
            }
            if (bz0Var.d.d() == 0) {
                bz0Var.e = true;
            }
            if (z2) {
                if (this.j + 1 >= this.f) {
                    o();
                }
                i3r a = a(3);
                int i6 = this.c + 1;
                this.c = i6;
                this.j++;
                a.b = i6;
                osh oshVar = this.m;
                ((i3r[]) oshVar.c)[i6] = a;
                bz0Var.a = a;
                int i7 = this.k;
                h(bz0Var);
                if (this.k == i7 + 1) {
                    bz0 bz0Var2 = this.p;
                    bz0Var2.a = null;
                    bz0Var2.d.b();
                    for (int i8 = 0; i8 < bz0Var.d.d(); i8++) {
                        bz0Var2.d.a(bz0Var.d.e(i8), bz0Var.d.f(i8), true);
                    }
                    r(this.p);
                    if (a.c == -1) {
                        if (bz0Var.a == a && (f = bz0Var.f(null, a)) != null) {
                            bz0Var.g(f);
                        }
                        if (!bz0Var.e) {
                            bz0Var.a.e(this, bz0Var);
                        }
                        ((dhm) oshVar.a).a(bz0Var);
                        this.k--;
                    }
                    z = true;
                    i3rVar = bz0Var.a;
                    if (i3rVar != null) {
                        return;
                    }
                    if (i3rVar.l != 1 && bz0Var.b < f8) {
                        return;
                    }
                }
            }
            z = false;
            i3rVar = bz0Var.a;
            if (i3rVar != null) {
            }
        }
        if (z) {
            return;
        }
        h(bz0Var);
    }

    public final void d(i3r i3rVar, int i) {
        int i2 = i3rVar.c;
        if (i2 == -1) {
            i3rVar.d(this, i);
            for (int i3 = 0; i3 < this.c + 1; i3++) {
                i3r i3rVar2 = ((i3r[]) this.m.c)[i3];
            }
            return;
        }
        if (i2 == -1) {
            bz0 l = l();
            l.a = i3rVar;
            float f = i;
            i3rVar.e = f;
            l.b = f;
            l.e = true;
            c(l);
            return;
        }
        bz0 bz0Var = this.g[i2];
        if (bz0Var.e) {
            bz0Var.b = i;
            return;
        }
        if (bz0Var.d.d() == 0) {
            bz0Var.e = true;
            bz0Var.b = i;
            return;
        }
        bz0 l2 = l();
        if (i < 0) {
            l2.b = i * (-1);
            l2.d.g(i3rVar, 1.0f);
        } else {
            l2.b = i;
            l2.d.g(i3rVar, -1.0f);
        }
        c(l2);
    }

    public final void e(i3r i3rVar, i3r i3rVar2, int i, int i2) {
        if (i2 == 8 && i3rVar2.f && i3rVar.c == -1) {
            i3rVar.d(this, i3rVar2.e + i);
            return;
        }
        bz0 l = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            l.b = i;
        }
        py0 py0Var = l.d;
        if (z) {
            py0Var.g(i3rVar, 1.0f);
            l.d.g(i3rVar2, -1.0f);
        } else {
            py0Var.g(i3rVar, -1.0f);
            l.d.g(i3rVar2, 1.0f);
        }
        if (i2 != 8) {
            l.a(this, i2);
        }
        c(l);
    }

    public final void f(i3r i3rVar, i3r i3rVar2, int i, int i2) {
        bz0 l = l();
        i3r m = m();
        m.d = 0;
        l.b(i3rVar, i3rVar2, m, i);
        if (i2 != 8) {
            l.d.g(j(i2), (int) (l.d.c(m) * (-1.0f)));
        }
        c(l);
    }

    public final void g(i3r i3rVar, i3r i3rVar2, int i, int i2) {
        bz0 l = l();
        i3r m = m();
        m.d = 0;
        l.c(i3rVar, i3rVar2, m, i);
        if (i2 != 8) {
            l.d.g(j(i2), (int) (l.d.c(m) * (-1.0f)));
        }
        c(l);
    }

    public final void h(bz0 bz0Var) {
        int i;
        if (bz0Var.e) {
            bz0Var.a.d(this, bz0Var.b);
        } else {
            bz0[] bz0VarArr = this.g;
            int i2 = this.k;
            bz0VarArr[i2] = bz0Var;
            i3r i3rVar = bz0Var.a;
            i3rVar.c = i2;
            this.k = i2 + 1;
            i3rVar.e(this, bz0Var);
        }
        if (this.b) {
            int i3 = 0;
            while (i3 < this.k) {
                if (this.g[i3] == null) {
                    System.out.println("WTF");
                }
                bz0 bz0Var2 = this.g[i3];
                if (bz0Var2 != null && bz0Var2.e) {
                    bz0Var2.a.d(this, bz0Var2.b);
                    ((dhm) this.m.a).a(bz0Var2);
                    this.g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.k;
                        if (i4 >= i) {
                            break;
                        }
                        bz0[] bz0VarArr2 = this.g;
                        int i6 = i4 - 1;
                        bz0 bz0Var3 = bz0VarArr2[i4];
                        bz0VarArr2[i6] = bz0Var3;
                        i3r i3rVar2 = bz0Var3.a;
                        if (i3rVar2.c == i4) {
                            i3rVar2.c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.g[i5] = null;
                    }
                    this.k = i - 1;
                    i3--;
                }
                i3++;
            }
            this.b = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.k; i++) {
            bz0 bz0Var = this.g[i];
            bz0Var.a.e = bz0Var.b;
        }
    }

    public final i3r j(int i) {
        if (this.j + 1 >= this.f) {
            o();
        }
        i3r a = a(4);
        float[] fArr = a.h;
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        a.b = i2;
        a.d = i;
        ((i3r[]) this.m.c)[i2] = a;
        psm psmVar = this.d;
        psmVar.i.b = a;
        Arrays.fill(fArr, 0.0f);
        fArr[a.d] = 1.0f;
        psmVar.j(a);
        return a;
    }

    public final i3r k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.j + 1 >= this.f) {
            o();
        }
        if (!(obj instanceof o86)) {
            return null;
        }
        o86 o86Var = (o86) obj;
        i3r i3rVar = o86Var.i;
        if (i3rVar == null) {
            o86Var.k();
            i3rVar = o86Var.i;
        }
        int i = i3rVar.b;
        osh oshVar = this.m;
        if (i != -1 && i <= this.c && ((i3r[]) oshVar.c)[i] != null) {
            return i3rVar;
        }
        if (i != -1) {
            i3rVar.c();
        }
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        i3rVar.b = i2;
        i3rVar.l = 1;
        ((i3r[]) oshVar.c)[i2] = i3rVar;
        return i3rVar;
    }

    public final bz0 l() {
        Object obj;
        osh oshVar = this.m;
        dhm dhmVar = (dhm) oshVar.a;
        int i = dhmVar.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = dhmVar.a;
            obj = objArr[i2];
            objArr[i2] = null;
            dhmVar.b = i2;
        } else {
            obj = null;
        }
        bz0 bz0Var = (bz0) obj;
        if (bz0Var == null) {
            return new bz0(oshVar);
        }
        bz0Var.a = null;
        bz0Var.d.b();
        bz0Var.b = 0.0f;
        bz0Var.e = false;
        return bz0Var;
    }

    public final i3r m() {
        if (this.j + 1 >= this.f) {
            o();
        }
        i3r a = a(3);
        int i = this.c + 1;
        this.c = i;
        this.j++;
        a.b = i;
        ((i3r[]) this.m.c)[i] = a;
        return a;
    }

    public final void o() {
        int i = this.e * 2;
        this.e = i;
        this.g = (bz0[]) Arrays.copyOf(this.g, i);
        osh oshVar = this.m;
        oshVar.c = (i3r[]) Arrays.copyOf((i3r[]) oshVar.c, this.e);
        int i2 = this.e;
        this.i = new boolean[i2];
        this.f = i2;
        this.l = i2;
    }

    public final void p() {
        psm psmVar = this.d;
        if (psmVar.e()) {
            i();
            return;
        }
        if (!this.h) {
            q(psmVar);
            return;
        }
        for (int i = 0; i < this.k; i++) {
            if (!this.g[i].e) {
                q(psmVar);
                return;
            }
        }
        i();
    }

    public final void q(psm psmVar) {
        int i = 0;
        while (true) {
            if (i >= this.k) {
                break;
            }
            bz0 bz0Var = this.g[i];
            int i2 = 1;
            if (bz0Var.a.l != 1) {
                float f = 0.0f;
                if (bz0Var.b < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.k) {
                            bz0 bz0Var2 = this.g[i6];
                            if (bz0Var2.a.l != i2 && !bz0Var2.e && bz0Var2.b < f) {
                                int d = bz0Var2.d.d();
                                int i8 = 0;
                                while (i8 < d) {
                                    i3r e = bz0Var2.d.e(i8);
                                    float c = bz0Var2.d.c(e);
                                    if (c > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = e.g[i9] / c;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = e.b;
                                                i4 = i6;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i6++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            bz0 bz0Var3 = this.g[i4];
                            bz0Var3.a.c = -1;
                            bz0Var3.g(((i3r[]) this.m.c)[i5]);
                            i3r i3rVar = bz0Var3.a;
                            i3rVar.c = i4;
                            i3rVar.e(this, bz0Var3);
                        } else {
                            z = true;
                        }
                        if (i3 > this.j / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        r(psmVar);
        i();
    }

    public final void r(bz0 bz0Var) {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < this.j; i2++) {
            this.i[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            int i4 = 1;
            i3++;
            if (i3 >= this.j * 2) {
                return;
            }
            i3r i3rVar = bz0Var.a;
            if (i3rVar != null) {
                this.i[i3rVar.b] = true;
            }
            i3r d = bz0Var.d(this.i);
            if (d != null) {
                boolean[] zArr = this.i;
                int i5 = d.b;
                if (zArr[i5]) {
                    return;
                } else {
                    zArr[i5] = true;
                }
            }
            if (d != null) {
                float f = Float.MAX_VALUE;
                int i6 = i;
                int i7 = -1;
                while (i6 < this.k) {
                    bz0 bz0Var2 = this.g[i6];
                    if (bz0Var2.a.l != i4 && !bz0Var2.e) {
                        py0 py0Var = bz0Var2.d;
                        int i8 = py0Var.h;
                        if (i8 != -1) {
                            for (int i9 = 0; i8 != -1 && i9 < py0Var.a; i9++) {
                                if (py0Var.e[i8] == d.b) {
                                    z = true;
                                    break;
                                }
                                i8 = py0Var.f[i8];
                            }
                        }
                        z = false;
                        if (z) {
                            float c = bz0Var2.d.c(d);
                            if (c < 0.0f) {
                                float f2 = (-bz0Var2.b) / c;
                                if (f2 < f) {
                                    f = f2;
                                    i7 = i6;
                                }
                            }
                        }
                    }
                    i6++;
                    i4 = 1;
                }
                if (i7 > -1) {
                    bz0 bz0Var3 = this.g[i7];
                    bz0Var3.a.c = -1;
                    bz0Var3.g(d);
                    i3r i3rVar2 = bz0Var3.a;
                    i3rVar2.c = i7;
                    i3rVar2.e(this, bz0Var3);
                }
            } else {
                z2 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.k; i++) {
            bz0 bz0Var = this.g[i];
            if (bz0Var != null) {
                ((dhm) this.m.a).a(bz0Var);
            }
            this.g[i] = null;
        }
    }

    public final void t() {
        osh oshVar;
        int i = 0;
        while (true) {
            oshVar = this.m;
            i3r[] i3rVarArr = (i3r[]) oshVar.c;
            if (i >= i3rVarArr.length) {
                break;
            }
            i3r i3rVar = i3rVarArr[i];
            if (i3rVar != null) {
                i3rVar.c();
            }
            i++;
        }
        dhm dhmVar = (dhm) oshVar.b;
        i3r[] i3rVarArr2 = this.n;
        int i2 = this.o;
        dhmVar.getClass();
        if (i2 > i3rVarArr2.length) {
            i2 = i3rVarArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            i3r i3rVar2 = i3rVarArr2[i3];
            int i4 = dhmVar.b;
            Object[] objArr = dhmVar.a;
            if (i4 < objArr.length) {
                objArr[i4] = i3rVar2;
                dhmVar.b = i4 + 1;
            }
        }
        this.o = 0;
        Arrays.fill((i3r[]) oshVar.c, (Object) null);
        this.c = 0;
        psm psmVar = this.d;
        psmVar.h = 0;
        psmVar.b = 0.0f;
        this.j = 1;
        for (int i5 = 0; i5 < this.k; i5++) {
            bz0 bz0Var = this.g[i5];
        }
        s();
        this.k = 0;
        this.p = new bz0(oshVar);
    }
}
