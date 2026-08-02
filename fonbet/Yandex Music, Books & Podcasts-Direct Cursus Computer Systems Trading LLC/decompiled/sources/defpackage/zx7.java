package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class zx7 extends ner implements sdr {
    public final Function0 b;
    public final n2r c;
    public xx7 d = new xx7(g2r.k().g());

    public zx7(n2r n2rVar, Function0 function0) {
        this.b = function0;
        this.c = n2rVar;
    }

    @Override // defpackage.mer
    public final void a(per perVar) {
        perVar.getClass();
        this.d = (xx7) perVar;
    }

    @Override // defpackage.mer
    public final per g() {
        return this.d;
    }

    @Override // defpackage.sdr
    public final Object getValue() {
        Function1 e = g2r.k().e();
        if (e != null) {
            e.invoke(this);
        }
        b2r k = g2r.k();
        return h((xx7) g2r.j(this.d, k), k, true, this.b).f;
    }

    public final xx7 h(xx7 xx7Var, b2r b2rVar, boolean z, Function0 function0) {
        eqi S;
        xx7 xx7Var2;
        n2r n2rVar;
        int i;
        if (xx7Var.c(this, b2rVar)) {
            if (z) {
                S = szf.S();
                Object[] objArr = S.a;
                int i2 = S.c;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((nq5) objArr[i3]).b();
                }
                try {
                    cpi cpiVar = xx7Var.e;
                    sfm sfmVar = o2r.a;
                    bqe bqeVar = (bqe) sfmVar.s();
                    if (bqeVar == null) {
                        bqeVar = new bqe();
                        sfmVar.J(bqeVar);
                    }
                    int i4 = bqeVar.a;
                    Object[] objArr2 = cpiVar.b;
                    int[] iArr = cpiVar.c;
                    long[] jArr = cpiVar.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        i = i6;
                                        mer merVar = (mer) objArr2[i9];
                                        bqeVar.a = i4 + iArr[i9];
                                        Function1 e = b2rVar.e();
                                        if (e != null) {
                                            e.invoke(merVar);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                            }
                            if (i5 == length) {
                                break;
                            }
                            i5++;
                        }
                    }
                    bqeVar.a = i4;
                    Object[] objArr3 = S.a;
                    int i10 = S.c;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((nq5) objArr3[i11]).a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return xx7Var;
        }
        cpi cpiVar2 = new cpi();
        sfm sfmVar2 = o2r.a;
        bqe bqeVar2 = (bqe) sfmVar2.s();
        if (bqeVar2 == null) {
            bqeVar2 = new bqe();
            sfmVar2.J(bqeVar2);
        }
        int i12 = bqeVar2.a;
        S = szf.S();
        Object[] objArr4 = S.a;
        int i13 = S.c;
        for (int i14 = 0; i14 < i13; i14++) {
            ((nq5) objArr4[i14]).b();
        }
        try {
            bqeVar2.a = i12 + 1;
            Object U = wyf.U(function0, new yx7(this, bqeVar2, cpiVar2, i12, 0));
            bqeVar2.a = i12;
            Object[] objArr5 = S.a;
            int i15 = S.c;
            for (int i16 = 0; i16 < i15; i16++) {
                ((nq5) objArr5[i16]).a();
            }
            Object obj = g2r.b;
            synchronized (obj) {
                try {
                    b2r k = g2r.k();
                    Object obj2 = xx7Var.f;
                    if (obj2 == xx7.h || (n2rVar = this.c) == null || !n2rVar.J(U, obj2)) {
                        xx7 xx7Var3 = this.d;
                        synchronized (obj) {
                            per m = g2r.m(xx7Var3, this);
                            m.a(xx7Var3);
                            m.a = k.g();
                            xx7Var2 = (xx7) m;
                            xx7Var2.e = cpiVar2;
                            xx7Var2.g = xx7Var2.d(this, k);
                            xx7Var2.f = U;
                        }
                        return xx7Var2;
                    }
                    xx7Var.e = cpiVar2;
                    xx7Var.g = xx7Var.d(this, k);
                    xx7Var2 = xx7Var;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            bqe bqeVar3 = (bqe) o2r.a.s();
            if (bqeVar3 == null || bqeVar3.a != 0) {
                return xx7Var2;
            }
            g2r.k().m();
            synchronized (obj) {
                b2r k2 = g2r.k();
                xx7Var2.c = k2.g();
                xx7Var2.d = k2.h();
                return xx7Var2;
            }
        } finally {
            Object[] objArr6 = S.a;
            int i17 = S.c;
            for (int i18 = 0; i18 < i17; i18++) {
                ((nq5) objArr6[i18]).a();
            }
        }
    }

    public final xx7 i() {
        b2r k = g2r.k();
        return h((xx7) g2r.j(this.d, k), k, false, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        xx7 xx7Var = (xx7) g2r.i(this.d);
        sb.append(xx7Var.c(this, g2r.k()) ? String.valueOf(xx7Var.f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
