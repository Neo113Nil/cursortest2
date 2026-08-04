package com.gamericefishpro.space.i3;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static boolean p = false;
    public static int q = 1000;
    public final d c;
    public b[] f;
    public final com.gamericefishpro.space.a8.c l;
    public b o;
    public boolean a = false;
    public int b = 0;
    public int d = 32;
    public int e = 32;
    public boolean g = false;
    public boolean[] h = new boolean[32];
    public int i = 1;
    public int j = 0;
    public int k = 32;
    public f[] m = new f[q];
    public int n = 0;

    public c() {
        this.f = null;
        this.f = new b[32];
        s();
        com.gamericefishpro.space.a8.c cVar = new com.gamericefishpro.space.a8.c(11, false);
        cVar.e = new com.gamericefishpro.space.c4.b();
        cVar.i = new com.gamericefishpro.space.c4.b();
        cVar.v = new f[32];
        this.l = cVar;
        d dVar = new d(cVar);
        dVar.f = new f[128];
        dVar.g = new f[128];
        dVar.h = 0;
        dVar.i = new com.gamericefishpro.space.u6.e(5, dVar);
        this.c = dVar;
        this.o = new b(cVar);
    }

    public static int n(Object obj) {
        f fVar = ((com.gamericefishpro.space.k3.c) obj).i;
        if (fVar != null) {
            return (int) (fVar.w + 0.5f);
        }
        return 0;
    }

    public final f a(int i) {
        com.gamericefishpro.space.c4.b bVar = (com.gamericefishpro.space.c4.b) this.l.i;
        int i2 = bVar.b;
        Object obj = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] objArr = bVar.a;
            Object obj2 = objArr[i3];
            objArr[i3] = null;
            bVar.b = i3;
            obj = obj2;
        }
        f fVar = (f) obj;
        if (fVar == null) {
            fVar = new f(i);
            fVar.E = i;
        } else {
            fVar.c();
            fVar.E = i;
        }
        int i4 = this.n;
        int i5 = q;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            q = i6;
            this.m = (f[]) Arrays.copyOf(this.m, i6);
        }
        f[] fVarArr = this.m;
        int i7 = this.n;
        this.n = i7 + 1;
        fVarArr[i7] = fVar;
        return fVar;
    }

    public final void b(f fVar, f fVar2, int i, float f, f fVar3, f fVar4, int i2, int i3) {
        b bVarL = l();
        if (fVar2 == fVar3) {
            bVarL.d.g(fVar, 1.0f);
            bVarL.d.g(fVar4, 1.0f);
            bVarL.d.g(fVar2, -2.0f);
        } else if (f == 0.5f) {
            bVarL.d.g(fVar, 1.0f);
            bVarL.d.g(fVar2, -1.0f);
            bVarL.d.g(fVar3, -1.0f);
            bVarL.d.g(fVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                bVarL.b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            bVarL.d.g(fVar, -1.0f);
            bVarL.d.g(fVar2, 1.0f);
            bVarL.b = i;
        } else if (f >= 1.0f) {
            bVarL.d.g(fVar4, -1.0f);
            bVarL.d.g(fVar3, 1.0f);
            bVarL.b = -i2;
        } else {
            float f2 = 1.0f - f;
            bVarL.d.g(fVar, f2 * 1.0f);
            bVarL.d.g(fVar2, f2 * (-1.0f));
            bVarL.d.g(fVar3, (-1.0f) * f);
            bVarL.d.g(fVar4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                bVarL.b = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            bVarL.a(this, i3);
        }
        c(bVarL);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f8  */
    public final void c(b bVar) {
        boolean z;
        boolean z2;
        f fVarF;
        if (this.j + 1 >= this.k || this.i + 1 >= this.e) {
            o();
        }
        if (bVar.e) {
            z = false;
        } else {
            ArrayList arrayList = bVar.c;
            if (this.f.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int iD = bVar.d.d();
                    for (int i = 0; i < iD; i++) {
                        f fVarE = bVar.d.e(i);
                        if (fVarE.i != -1 || fVarE.y) {
                            arrayList.add(fVarE);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            f fVar = (f) arrayList.get(i2);
                            if (fVar.y) {
                                bVar.h(this, fVar, true);
                            } else {
                                bVar.i(this, this.f[fVar.i], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (bVar.a != null && bVar.d.d() == 0) {
                    bVar.e = true;
                    this.a = true;
                }
            }
            if (bVar.e()) {
                return;
            }
            float f = bVar.b;
            float f2 = 0.0f;
            if (f < 0.0f) {
                bVar.b = f * (-1.0f);
                a aVar = bVar.d;
                int i3 = aVar.h;
                for (int i4 = 0; i3 != -1 && i4 < aVar.a; i4++) {
                    float[] fArr = aVar.g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = aVar.f[i3];
                }
            }
            int iD2 = bVar.d.d();
            float f3 = 0.0f;
            float f4 = 0.0f;
            f fVar2 = null;
            f fVar3 = null;
            int i5 = 0;
            boolean z4 = false;
            boolean z5 = false;
            while (i5 < iD2) {
                float f5 = bVar.d.f(i5);
                f fVarE2 = bVar.d.e(i5);
                float f6 = f2;
                if (fVarE2.E == 1) {
                    if (fVar2 == null) {
                        if (fVarE2.D <= 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        fVar2 = fVarE2;
                        f3 = f5;
                    } else {
                        if (f3 > f5) {
                            if (fVarE2.D > 1) {
                                z4 = false;
                            }
                            fVar2 = fVarE2;
                            f3 = f5;
                        } else if (z4 || fVarE2.D > 1) {
                        }
                        z4 = true;
                        fVar2 = fVarE2;
                        f3 = f5;
                    }
                } else if (fVar2 == null && f5 < f6) {
                    if (fVar3 == null) {
                        if (fVarE2.D <= 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        fVar3 = fVarE2;
                        f4 = f5;
                    } else {
                        if (f4 > f5) {
                            if (fVarE2.D > 1) {
                                z5 = false;
                            }
                            fVar3 = fVarE2;
                            f4 = f5;
                        } else if (z5 || fVarE2.D > 1) {
                        }
                        z5 = true;
                        fVar3 = fVarE2;
                        f4 = f5;
                    }
                }
                i5++;
                f2 = f6;
            }
            float f7 = f2;
            if (fVar2 == null) {
                fVar2 = fVar3;
            }
            if (fVar2 == null) {
                z2 = true;
            } else {
                bVar.g(fVar2);
                z2 = false;
            }
            if (bVar.d.d() == 0) {
                bVar.e = true;
            }
            if (z2) {
                if (this.i + 1 >= this.e) {
                    o();
                }
                f fVarA = a(3);
                int i6 = this.b + 1;
                this.b = i6;
                this.i++;
                fVarA.e = i6;
                com.gamericefishpro.space.a8.c cVar = this.l;
                ((f[]) cVar.v)[i6] = fVarA;
                bVar.a = fVarA;
                int i7 = this.j;
                h(bVar);
                if (this.j == i7 + 1) {
                    b bVar2 = this.o;
                    bVar2.a = null;
                    bVar2.d.b();
                    for (int i8 = 0; i8 < bVar.d.d(); i8++) {
                        bVar2.d.a(bVar.d.e(i8), bVar.d.f(i8), true);
                    }
                    r(this.o);
                    if (fVarA.i == -1) {
                        if (bVar.a == fVarA && (fVarF = bVar.f(null, fVarA)) != null) {
                            bVar.g(fVarF);
                        }
                        if (!bVar.e) {
                            bVar.a.e(this, bVar);
                        }
                        ((com.gamericefishpro.space.c4.b) cVar.e).b(bVar);
                        this.j--;
                    }
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            f fVar4 = bVar.a;
            if (fVar4 == null) {
                return;
            }
            if (fVar4.E != 1 && bVar.b < f7) {
                return;
            }
        }
        if (z) {
            return;
        }
        h(bVar);
    }

    public final void d(f fVar, int i) {
        int i2 = fVar.i;
        if (i2 == -1) {
            fVar.d(this, i);
            for (int i3 = 0; i3 < this.b + 1; i3++) {
                f fVar2 = ((f[]) this.l.v)[i3];
            }
            return;
        }
        if (i2 == -1) {
            b bVarL = l();
            bVarL.a = fVar;
            float f = i;
            fVar.w = f;
            bVarL.b = f;
            bVarL.e = true;
            c(bVarL);
            return;
        }
        b bVar = this.f[i2];
        if (bVar.e) {
            bVar.b = i;
            return;
        }
        if (bVar.d.d() == 0) {
            bVar.e = true;
            bVar.b = i;
            return;
        }
        b bVarL2 = l();
        if (i < 0) {
            bVarL2.b = i * (-1);
            bVarL2.d.g(fVar, 1.0f);
        } else {
            bVarL2.b = i;
            bVarL2.d.g(fVar, -1.0f);
        }
        c(bVarL2);
    }

    public final void e(f fVar, f fVar2, int i, int i2) {
        if (i2 == 8 && fVar2.y && fVar.i == -1) {
            fVar.d(this, fVar2.w + i);
            return;
        }
        b bVarL = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            bVarL.b = i;
        }
        if (z) {
            bVarL.d.g(fVar, 1.0f);
            bVarL.d.g(fVar2, -1.0f);
        } else {
            bVarL.d.g(fVar, -1.0f);
            bVarL.d.g(fVar2, 1.0f);
        }
        if (i2 != 8) {
            bVarL.a(this, i2);
        }
        c(bVarL);
    }

    public final void f(f fVar, f fVar2, int i, int i2) {
        b bVarL = l();
        f fVarM = m();
        fVarM.v = 0;
        bVarL.b(fVar, fVar2, fVarM, i);
        if (i2 != 8) {
            bVarL.d.g(j(i2), (int) (bVarL.d.c(fVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void g(f fVar, f fVar2, int i, int i2) {
        b bVarL = l();
        f fVarM = m();
        fVarM.v = 0;
        bVarL.c(fVar, fVar2, fVarM, i);
        if (i2 != 8) {
            bVarL.d.g(j(i2), (int) (bVarL.d.c(fVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void h(b bVar) {
        int i;
        if (bVar.e) {
            bVar.a.d(this, bVar.b);
        } else {
            b[] bVarArr = this.f;
            int i2 = this.j;
            bVarArr[i2] = bVar;
            f fVar = bVar.a;
            fVar.i = i2;
            this.j = i2 + 1;
            fVar.e(this, bVar);
        }
        if (this.a) {
            int i3 = 0;
            while (i3 < this.j) {
                if (this.f[i3] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f[i3];
                if (bVar2 != null && bVar2.e) {
                    bVar2.a.d(this, bVar2.b);
                    ((com.gamericefishpro.space.c4.b) this.l.e).b(bVar2);
                    this.f[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.j;
                        if (i4 >= i) {
                            break;
                        }
                        b[] bVarArr2 = this.f;
                        int i6 = i4 - 1;
                        b bVar3 = bVarArr2[i4];
                        bVarArr2[i6] = bVar3;
                        f fVar2 = bVar3.a;
                        if (fVar2.i == i4) {
                            fVar2.i = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f[i5] = null;
                    }
                    this.j = i - 1;
                    i3--;
                }
                i3++;
            }
            this.a = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.j; i++) {
            b bVar = this.f[i];
            bVar.a.w = bVar.b;
        }
    }

    public final f j(int i) {
        if (this.i + 1 >= this.e) {
            o();
        }
        f fVarA = a(4);
        float[] fArr = fVarA.A;
        int i2 = this.b + 1;
        this.b = i2;
        this.i++;
        fVarA.e = i2;
        fVarA.v = i;
        ((f[]) this.l.v)[i2] = fVarA;
        d dVar = this.c;
        dVar.i.b = fVarA;
        Arrays.fill(fArr, 0.0f);
        fArr[fVarA.v] = 1.0f;
        dVar.j(fVarA);
        return fVarA;
    }

    public final f k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.e) {
            o();
        }
        if (!(obj instanceof com.gamericefishpro.space.k3.c)) {
            return null;
        }
        com.gamericefishpro.space.k3.c cVar = (com.gamericefishpro.space.k3.c) obj;
        f fVar = cVar.i;
        if (fVar == null) {
            cVar.k();
            fVar = cVar.i;
        }
        int i = fVar.e;
        com.gamericefishpro.space.a8.c cVar2 = this.l;
        if (i != -1 && i <= this.b && ((f[]) cVar2.v)[i] != null) {
            return fVar;
        }
        if (i != -1) {
            fVar.c();
        }
        int i2 = this.b + 1;
        this.b = i2;
        this.i++;
        fVar.e = i2;
        fVar.E = 1;
        ((f[]) cVar2.v)[i2] = fVar;
        return fVar;
    }

    public final b l() {
        Object obj;
        com.gamericefishpro.space.a8.c cVar = this.l;
        com.gamericefishpro.space.c4.b bVar = (com.gamericefishpro.space.c4.b) cVar.e;
        int i = bVar.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = bVar.a;
            obj = objArr[i2];
            objArr[i2] = null;
            bVar.b = i2;
        } else {
            obj = null;
        }
        b bVar2 = (b) obj;
        if (bVar2 == null) {
            return new b(cVar);
        }
        bVar2.a = null;
        bVar2.d.b();
        bVar2.b = 0.0f;
        bVar2.e = false;
        return bVar2;
    }

    public final f m() {
        if (this.i + 1 >= this.e) {
            o();
        }
        f fVarA = a(3);
        int i = this.b + 1;
        this.b = i;
        this.i++;
        fVarA.e = i;
        ((f[]) this.l.v)[i] = fVarA;
        return fVarA;
    }

    public final void o() {
        int i = this.d * 2;
        this.d = i;
        this.f = (b[]) Arrays.copyOf(this.f, i);
        com.gamericefishpro.space.a8.c cVar = this.l;
        cVar.v = (f[]) Arrays.copyOf((f[]) cVar.v, this.d);
        int i2 = this.d;
        this.h = new boolean[i2];
        this.e = i2;
        this.k = i2;
    }

    public final void p() {
        d dVar = this.c;
        if (dVar.e()) {
            i();
            return;
        }
        if (!this.g) {
            q(dVar);
            return;
        }
        for (int i = 0; i < this.j; i++) {
            if (!this.f[i].e) {
                q(dVar);
                return;
            }
        }
        i();
    }

    public final void q(d dVar) {
        for (int i = 0; i < this.j; i++) {
            b bVar = this.f[i];
            int i2 = 1;
            if (bVar.a.E != 1) {
                float f = 0.0f;
                if (bVar.b < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.j) {
                            b bVar2 = this.f[i6];
                            if (bVar2.a.E != i2 && !bVar2.e && bVar2.b < f) {
                                int iD = bVar2.d.d();
                                int i8 = 0;
                                while (i8 < iD) {
                                    f fVarE = bVar2.d.e(i8);
                                    float fC = bVar2.d.c(fVarE);
                                    if (fC > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = fVarE.z[i9] / fC;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = fVarE.e;
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
                            b bVar3 = this.f[i4];
                            bVar3.a.i = -1;
                            bVar3.g(((f[]) this.l.v)[i5]);
                            f fVar = bVar3.a;
                            fVar.i = i4;
                            fVar.e(this, bVar3);
                        } else {
                            z = true;
                        }
                        if (i3 > this.i / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                    break;
                }
            }
        }
        r(dVar);
        i();
    }

    public final void r(b bVar) {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < this.i; i2++) {
            this.h[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            int i4 = 1;
            i3++;
            if (i3 >= this.i * 2) {
                return;
            }
            f fVar = bVar.a;
            if (fVar != null) {
                this.h[fVar.e] = true;
            }
            f fVarD = bVar.d(this.h);
            if (fVarD != null) {
                boolean[] zArr = this.h;
                int i5 = fVarD.e;
                if (zArr[i5]) {
                    return;
                } else {
                    zArr[i5] = true;
                }
            }
            if (fVarD != null) {
                float f = Float.MAX_VALUE;
                int i6 = i;
                int i7 = -1;
                while (i6 < this.j) {
                    b bVar2 = this.f[i6];
                    if (bVar2.a.E != i4 && !bVar2.e) {
                        a aVar = bVar2.d;
                        int i8 = aVar.h;
                        if (i8 == -1) {
                            z = false;
                            break;
                        }
                        int i9 = 0;
                        while (true) {
                            if (i8 == -1 || i9 >= aVar.a) {
                                z = false;
                                break;
                            } else if (aVar.e[i8] == fVarD.e) {
                                z = true;
                                break;
                            } else {
                                i8 = aVar.f[i8];
                                i9++;
                            }
                        }
                        if (z) {
                            float fC = bVar2.d.c(fVarD);
                            if (fC < 0.0f) {
                                float f2 = (-bVar2.b) / fC;
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
                    b bVar3 = this.f[i7];
                    bVar3.a.i = -1;
                    bVar3.g(fVarD);
                    f fVar2 = bVar3.a;
                    fVar2.i = i7;
                    fVar2.e(this, bVar3);
                }
            } else {
                z2 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.j; i++) {
            b bVar = this.f[i];
            if (bVar != null) {
                ((com.gamericefishpro.space.c4.b) this.l.e).b(bVar);
            }
            this.f[i] = null;
        }
    }

    public final void t() {
        com.gamericefishpro.space.a8.c cVar;
        int i = 0;
        while (true) {
            cVar = this.l;
            f[] fVarArr = (f[]) cVar.v;
            if (i >= fVarArr.length) {
                break;
            }
            f fVar = fVarArr[i];
            if (fVar != null) {
                fVar.c();
            }
            i++;
        }
        com.gamericefishpro.space.c4.b bVar = (com.gamericefishpro.space.c4.b) cVar.i;
        f[] fVarArr2 = this.m;
        int length = this.n;
        bVar.getClass();
        if (length > fVarArr2.length) {
            length = fVarArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            f fVar2 = fVarArr2[i2];
            int i3 = bVar.b;
            Object[] objArr = bVar.a;
            if (i3 < objArr.length) {
                objArr[i3] = fVar2;
                bVar.b = i3 + 1;
            }
        }
        this.n = 0;
        Arrays.fill((f[]) cVar.v, (Object) null);
        this.b = 0;
        d dVar = this.c;
        dVar.h = 0;
        dVar.b = 0.0f;
        this.i = 1;
        for (int i4 = 0; i4 < this.j; i4++) {
            b bVar2 = this.f[i4];
        }
        s();
        this.j = 0;
        this.o = new b(cVar);
    }
}
