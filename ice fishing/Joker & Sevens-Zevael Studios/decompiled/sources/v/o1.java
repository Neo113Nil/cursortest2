package v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o1 implements k1 {

    /* renamed from: g, reason: collision with root package name */
    public final s.t f6909g;

    /* renamed from: h, reason: collision with root package name */
    public final s.u f6910h;

    /* renamed from: i, reason: collision with root package name */
    public final int f6911i;

    /* renamed from: j, reason: collision with root package name */
    public final v f6912j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f6913k;

    /* renamed from: l, reason: collision with root package name */
    public float[] f6914l;

    /* renamed from: m, reason: collision with root package name */
    public n f6915m;

    /* renamed from: n, reason: collision with root package name */
    public n f6916n;

    /* renamed from: o, reason: collision with root package name */
    public n f6917o;

    /* renamed from: p, reason: collision with root package name */
    public n f6918p;

    /* renamed from: q, reason: collision with root package name */
    public float[] f6919q;

    /* renamed from: r, reason: collision with root package name */
    public float[] f6920r;

    /* renamed from: s, reason: collision with root package name */
    public m7.g f6921s;

    public o1(s.t tVar, s.u uVar, int i10, v vVar) {
        this.f6909g = tVar;
        this.f6910h = uVar;
        this.f6911i = i10;
        this.f6912j = vVar;
    }

    public final int c(int i10) {
        int i11;
        s.t tVar = this.f6909g;
        int i12 = tVar.f6342b;
        int i13 = 0;
        if (i12 < 0) {
            m0.a("fromIndex(0) > toIndex(" + i12 + ')');
        }
        if (i12 > tVar.f6342b) {
            throw new IndexOutOfBoundsException(a4.d.g("Index out of range: ", i12));
        }
        int i14 = i12 - 1;
        while (true) {
            if (i13 <= i14) {
                i11 = (i13 + i14) >>> 1;
                int c3 = tVar.c(i11);
                if (c3 >= i10) {
                    if (c3 <= i10) {
                        break;
                    }
                    i14 = i11 - 1;
                } else {
                    i13 = i11 + 1;
                }
            } else {
                i11 = -(i13 + 1);
                break;
            }
        }
        return i11 < -1 ? -(i11 + 2) : i11;
    }

    public final float d(int i10, int i11, boolean z10) {
        v vVar;
        float f10;
        s.t tVar = this.f6909g;
        if (i10 >= tVar.f6342b - 1) {
            f10 = i11;
        } else {
            int c3 = tVar.c(i10);
            int c7 = tVar.c(i10 + 1);
            if (i11 == c3) {
                f10 = c3;
            } else {
                int i12 = c7 - c3;
                n1 n1Var = (n1) this.f6910h.b(c3);
                if (n1Var == null || (vVar = n1Var.f6905b) == null) {
                    vVar = this.f6912j;
                }
                float f11 = i12;
                float a6 = vVar.a((i11 - c3) / f11);
                if (z10) {
                    return a6;
                }
                f10 = (f11 * a6) + c3;
            }
        }
        return f10 / 1000;
    }

    public final void e(n nVar, n nVar2, n nVar3) {
        float[] fArr;
        float[] fArr2;
        boolean z10 = this.f6921s != null;
        n nVar4 = this.f6915m;
        s.u uVar = this.f6910h;
        s.t tVar = this.f6909g;
        if (nVar4 == null) {
            this.f6915m = nVar.c();
            this.f6916n = nVar3.c();
            int i10 = tVar.f6342b;
            float[] fArr3 = new float[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                fArr3[i11] = tVar.c(i11) / 1000;
            }
            this.f6914l = fArr3;
            int i12 = tVar.f6342b;
            int[] iArr = new int[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                iArr[i13] = 0;
            }
            this.f6913k = iArr;
        }
        if (z10) {
            if (this.f6921s != null) {
                n nVar5 = this.f6917o;
                if (nVar5 == null) {
                    pc.j.k("lastInitialValue");
                    throw null;
                }
                if (nVar5.equals(nVar)) {
                    n nVar6 = this.f6918p;
                    if (nVar6 == null) {
                        pc.j.k("lastTargetValue");
                        throw null;
                    }
                    if (nVar6.equals(nVar2)) {
                        return;
                    }
                }
            }
            this.f6917o = nVar;
            this.f6918p = nVar2;
            int b2 = nVar.b() + (nVar.b() % 2);
            this.f6919q = new float[b2];
            this.f6920r = new float[b2];
            int i14 = tVar.f6342b;
            float[][] fArr4 = new float[i14][];
            for (int i15 = 0; i15 < i14; i15++) {
                int c3 = tVar.c(i15);
                if (c3 != 0) {
                    if (c3 != this.f6911i) {
                        fArr = new float[b2];
                        Object b10 = uVar.b(c3);
                        pc.j.b(b10);
                        n nVar7 = ((n1) b10).f6904a;
                        for (int i16 = 0; i16 < b2; i16++) {
                            fArr[i16] = nVar7.a(i16);
                        }
                    } else if (uVar.a(c3)) {
                        fArr = new float[b2];
                        Object b11 = uVar.b(c3);
                        pc.j.b(b11);
                        n nVar8 = ((n1) b11).f6904a;
                        for (int i17 = 0; i17 < b2; i17++) {
                            fArr[i17] = nVar8.a(i17);
                        }
                    } else {
                        fArr2 = new float[b2];
                        for (int i18 = 0; i18 < b2; i18++) {
                            fArr2[i18] = nVar2.a(i18);
                        }
                    }
                    fArr2 = fArr;
                } else if (uVar.a(c3)) {
                    fArr = new float[b2];
                    Object b12 = uVar.b(c3);
                    pc.j.b(b12);
                    n nVar9 = ((n1) b12).f6904a;
                    for (int i19 = 0; i19 < b2; i19++) {
                        fArr[i19] = nVar9.a(i19);
                    }
                    fArr2 = fArr;
                } else {
                    fArr2 = new float[b2];
                    for (int i20 = 0; i20 < b2; i20++) {
                        fArr2[i20] = nVar.a(i20);
                    }
                }
                fArr4[i15] = fArr2;
            }
            int[] iArr2 = this.f6913k;
            if (iArr2 == null) {
                pc.j.k("modes");
                throw null;
            }
            float[] fArr5 = this.f6914l;
            if (fArr5 == null) {
                pc.j.k("times");
                throw null;
            }
            this.f6921s = new m7.g(iArr2, fArr5, fArr4);
        }
    }

    @Override // v.j1
    public final n k(long j3, n nVar, n nVar2, n nVar3) {
        int i10;
        Throwable th;
        int i11;
        int i12;
        boolean z10;
        n nVar4 = nVar;
        n nVar5 = nVar2;
        int i13 = 0;
        int i14 = this.f6911i;
        int i15 = (int) uc.e.i((j3 / 1000000) - 0, 0L, i14);
        s.u uVar = this.f6910h;
        if (uVar.a(i15)) {
            Object b2 = uVar.b(i15);
            pc.j.b(b2);
            return ((n1) b2).f6904a;
        }
        if (i15 >= i14) {
            return nVar5;
        }
        if (i15 <= 0) {
            return nVar4;
        }
        e(nVar4, nVar5, nVar3);
        boolean z11 = true;
        if (this.f6921s == null) {
            int c3 = c(i15);
            float d10 = d(c3, i15, true);
            s.t tVar = this.f6909g;
            int c7 = tVar.c(c3);
            if (uVar.a(c7)) {
                Object b10 = uVar.b(c7);
                pc.j.b(b10);
                nVar4 = ((n1) b10).f6904a;
            }
            int c10 = tVar.c(c3 + 1);
            if (uVar.a(c10)) {
                Object b11 = uVar.b(c10);
                pc.j.b(b11);
                nVar5 = ((n1) b11).f6904a;
            }
            n nVar6 = this.f6915m;
            if (nVar6 == null) {
                pc.j.k("valueVector");
                throw null;
            }
            int b12 = nVar6.b();
            for (int i16 = 0; i16 < b12; i16++) {
                n nVar7 = this.f6915m;
                if (nVar7 == null) {
                    pc.j.k("valueVector");
                    throw null;
                }
                float a6 = nVar4.a(i16);
                float a8 = nVar5.a(i16);
                x4.s sVar = i1.f6863a;
                nVar7.e(i16, (a8 * d10) + ((1 - d10) * a6));
            }
            n nVar8 = this.f6915m;
            if (nVar8 != null) {
                return nVar8;
            }
            pc.j.k("valueVector");
            throw null;
        }
        float d11 = d(c(i15), i15, false);
        m7.g gVar = this.f6921s;
        if (gVar == null) {
            pc.j.k("arcSpline");
            throw null;
        }
        float[] fArr = this.f6919q;
        if (fArr == null) {
            pc.j.k("posArray");
            throw null;
        }
        p[][] pVarArr = (p[][]) gVar.f4957h;
        float f10 = pVarArr[0][0].f6923a;
        if (d11 >= f10 && d11 <= pVarArr[pVarArr.length - 1][0].f6924b) {
            int length = pVarArr.length;
            int i17 = 0;
            boolean z12 = false;
            while (true) {
                if (i17 >= length) {
                    i10 = i13;
                    th = null;
                    break;
                }
                int i18 = i13;
                int i19 = i18;
                while (i18 < fArr.length) {
                    p pVar = pVarArr[i17][i19];
                    if (d11 <= pVar.f6924b) {
                        if (pVar.f6940r) {
                            float f11 = pVar.f6923a;
                            i12 = i13;
                            float f12 = pVar.f6933k;
                            float f13 = pVar.f6925c;
                            z10 = z11;
                            fArr[i18] = ((pVar.f6927e - f13) * (d11 - f11) * f12) + f13;
                            float f14 = (d11 - f11) * f12;
                            float f15 = pVar.f6926d;
                            fArr[i18 + 1] = ((pVar.f6928f - f15) * f14) + f15;
                        } else {
                            i12 = i13;
                            z10 = z11;
                            pVar.c(d11);
                            p pVar2 = pVarArr[i17][i19];
                            fArr[i18] = (pVar2.f6934l * pVar2.f6930h) + pVar2.f6936n;
                            fArr[i18 + 1] = (pVar2.f6935m * pVar2.f6931i) + pVar2.f6937o;
                        }
                        z12 = z10;
                    } else {
                        i12 = i13;
                        z10 = z11;
                    }
                    i18 += 2;
                    i19++;
                    i13 = i12;
                    z11 = z10;
                }
                i10 = i13;
                boolean z13 = z11;
                th = null;
                if (z12) {
                    break;
                }
                i17++;
                i13 = i10;
                z11 = z13;
            }
        } else {
            i10 = 0;
            th = null;
            if (d11 > pVarArr[pVarArr.length - 1][0].f6924b) {
                i11 = pVarArr.length - 1;
                f10 = pVarArr[pVarArr.length - 1][0].f6924b;
            } else {
                i11 = 0;
            }
            float f16 = d11 - f10;
            int i20 = 0;
            int i21 = 0;
            while (i20 < fArr.length) {
                p pVar3 = pVarArr[i11][i21];
                if (pVar3.f6940r) {
                    float f17 = pVar3.f6923a;
                    float f18 = pVar3.f6933k;
                    float f19 = pVar3.f6925c;
                    fArr[i20] = (pVar3.f6936n * f16) + ((pVar3.f6927e - f19) * (f10 - f17) * f18) + f19;
                    float f20 = (f10 - f17) * f18;
                    float f21 = pVar3.f6926d;
                    fArr[i20 + 1] = (pVar3.f6937o * f16) + ((pVar3.f6928f - f21) * f20) + f21;
                } else {
                    pVar3.c(f10);
                    p pVar4 = pVarArr[i11][i21];
                    fArr[i20] = (pVar4.a() * f16) + (pVar4.f6934l * pVar4.f6930h) + pVar4.f6936n;
                    p pVar5 = pVarArr[i11][i21];
                    fArr[i20 + 1] = (pVar5.b() * f16) + (pVar5.f6935m * pVar5.f6931i) + pVar5.f6937o;
                }
                i20 += 2;
                i21++;
            }
        }
        float[] fArr2 = this.f6919q;
        if (fArr2 == null) {
            pc.j.k("posArray");
            throw th;
        }
        int length2 = fArr2.length;
        for (int i22 = i10; i22 < length2; i22++) {
            n nVar9 = this.f6915m;
            if (nVar9 == null) {
                pc.j.k("valueVector");
                throw th;
            }
            float[] fArr3 = this.f6919q;
            if (fArr3 == null) {
                pc.j.k("posArray");
                throw th;
            }
            nVar9.e(i22, fArr3[i22]);
        }
        n nVar10 = this.f6915m;
        if (nVar10 != null) {
            return nVar10;
        }
        pc.j.k("valueVector");
        throw th;
    }

    @Override // v.k1
    public final int l() {
        return 0;
    }

    @Override // v.k1
    public final int m() {
        return this.f6911i;
    }

    @Override // v.j1
    public final n p(long j3, n nVar, n nVar2, n nVar3) {
        int i10 = 0;
        long i11 = uc.e.i((j3 / 1000000) - 0, 0L, this.f6911i);
        if (i11 < 0) {
            return nVar3;
        }
        e(nVar, nVar2, nVar3);
        if (this.f6921s == null) {
            n k3 = k((i11 - 1) * 1000000, nVar, nVar2, nVar3);
            n k10 = k(i11 * 1000000, nVar, nVar2, nVar3);
            int b2 = k3.b();
            while (i10 < b2) {
                n nVar4 = this.f6916n;
                if (nVar4 == null) {
                    pc.j.k("velocityVector");
                    throw null;
                }
                nVar4.e(i10, (k3.a(i10) - k10.a(i10)) * 1000.0f);
                i10++;
            }
            n nVar5 = this.f6916n;
            if (nVar5 != null) {
                return nVar5;
            }
            pc.j.k("velocityVector");
            throw null;
        }
        int i12 = (int) i11;
        float d10 = d(c(i12), i12, false);
        m7.g gVar = this.f6921s;
        if (gVar == null) {
            pc.j.k("arcSpline");
            throw null;
        }
        float[] fArr = this.f6920r;
        if (fArr == null) {
            pc.j.k("slopeArray");
            throw null;
        }
        p[][] pVarArr = (p[][]) gVar.f4957h;
        float f10 = pVarArr[0][0].f6923a;
        if (d10 < f10) {
            d10 = f10;
        } else if (d10 > pVarArr[pVarArr.length - 1][0].f6924b) {
            d10 = pVarArr[pVarArr.length - 1][0].f6924b;
        }
        int length = pVarArr.length;
        boolean z10 = false;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = 0;
            int i15 = 0;
            while (i14 < fArr.length) {
                p pVar = pVarArr[i13][i15];
                if (d10 <= pVar.f6924b) {
                    if (pVar.f6940r) {
                        fArr[i14] = pVar.f6936n;
                        fArr[i14 + 1] = pVar.f6937o;
                    } else {
                        pVar.c(d10);
                        fArr[i14] = pVarArr[i13][i15].a();
                        fArr[i14 + 1] = pVarArr[i13][i15].b();
                    }
                    z10 = true;
                }
                i14 += 2;
                i15++;
            }
            if (z10) {
                break;
            }
        }
        float[] fArr2 = this.f6920r;
        if (fArr2 == null) {
            pc.j.k("slopeArray");
            throw null;
        }
        int length2 = fArr2.length;
        while (i10 < length2) {
            n nVar6 = this.f6916n;
            if (nVar6 == null) {
                pc.j.k("velocityVector");
                throw null;
            }
            float[] fArr3 = this.f6920r;
            if (fArr3 == null) {
                pc.j.k("slopeArray");
                throw null;
            }
            nVar6.e(i10, fArr3[i10]);
            i10++;
        }
        n nVar7 = this.f6916n;
        if (nVar7 != null) {
            return nVar7;
        }
        pc.j.k("velocityVector");
        throw null;
    }
}
