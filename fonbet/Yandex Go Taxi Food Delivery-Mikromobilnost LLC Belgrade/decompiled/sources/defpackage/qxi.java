package defpackage;

import androidx.compose.runtime.f;

/* loaded from: classes.dex */
public final class qxi extends h5u0 implements m3u0 {
    public final sls a;
    public final e3t0 b;
    public pxi c = new pxi(q2t0.j().g());

    public qxi(sls slsVar, e3t0 e3t0Var) {
        this.a = slsVar;
        this.b = e3t0Var;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [oxi] */
    public final pxi b(pxi pxiVar, i2t0 i2t0Var, boolean z, sls slsVar) {
        int i;
        e3t0 e3t0Var;
        int i2;
        pxi pxiVar2 = pxiVar;
        int i3 = 0;
        if (pxiVar2.d(this, i2t0Var)) {
            if (z) {
                wz40 c = f.c();
                Object[] objArr = c.a;
                int i4 = c.c;
                for (int i5 = 0; i5 < i4; i5++) {
                    ((ats) objArr[i5]).b();
                }
                try {
                    qy40 qy40Var = pxiVar2.e;
                    p3t0 p3t0Var = i3t0.a;
                    g6w g6wVar = (g6w) p3t0Var.a();
                    if (g6wVar == null) {
                        g6wVar = new g6w(0);
                        p3t0Var.b(g6wVar);
                    }
                    int i6 = g6wVar.a;
                    Object[] objArr2 = qy40Var.b;
                    int[] iArr = qy40Var.c;
                    long[] jArr = qy40Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i7 = 0;
                        while (true) {
                            long j = jArr[i7];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i8 = 8;
                                int i9 = 8 - ((~(i7 - length)) >>> 31);
                                int i10 = i3;
                                while (i10 < i9) {
                                    if ((j & 255) < 128) {
                                        int i11 = (i7 << 3) + i10;
                                        g5u0 g5u0Var = (g5u0) objArr2[i11];
                                        i2 = i8;
                                        g6wVar.a = i6 + iArr[i11];
                                        tls e = i2t0Var.e();
                                        if (e != null) {
                                            e.invoke(g5u0Var);
                                        }
                                    } else {
                                        i2 = i8;
                                    }
                                    j >>= i2;
                                    i10++;
                                    i8 = i2;
                                }
                                if (i9 != i8) {
                                    break;
                                }
                            }
                            if (i7 == length) {
                                break;
                            }
                            i7++;
                            i3 = 0;
                        }
                    }
                    g6wVar.a = i6;
                    Object[] objArr3 = c.a;
                    int i12 = c.c;
                    for (int i13 = 0; i13 < i12; i13++) {
                        ((ats) objArr3[i13]).a();
                    }
                } catch (Throwable th) {
                    Object[] objArr4 = c.a;
                    int i14 = c.c;
                    for (int i15 = 0; i15 < i14; i15++) {
                        ((ats) objArr4[i15]).a();
                    }
                    throw th;
                }
            }
            return pxiVar2;
        }
        final qy40 qy40Var2 = new qy40((Object) null);
        p3t0 p3t0Var2 = i3t0.a;
        final g6w g6wVar2 = (g6w) p3t0Var2.a();
        if (g6wVar2 == null) {
            i = 0;
            g6wVar2 = new g6w(0);
            p3t0Var2.b(g6wVar2);
        } else {
            i = 0;
        }
        final int i16 = g6wVar2.a;
        wz40 c2 = f.c();
        Object[] objArr5 = c2.a;
        int i17 = c2.c;
        for (int i18 = i; i18 < i17; i18++) {
            ((ats) objArr5[i18]).b();
        }
        try {
            g6wVar2.a = i16 + 1;
            Object R = tje.R(new tls() { // from class: oxi
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    if (obj == qxi.this) {
                        ny61.r("A derived state calculation cannot read itself");
                        return null;
                    }
                    if (obj instanceof g5u0) {
                        int i19 = g6wVar2.a - i16;
                        qy40 qy40Var3 = qy40Var2;
                        int d = qy40Var3.d(obj);
                        qy40Var3.g(obj, Math.min(i19, d >= 0 ? qy40Var3.c[d] : Integer.MAX_VALUE));
                    }
                    return zy11.a;
                }
            }, slsVar);
            g6wVar2.a = i16;
            Object[] objArr6 = c2.a;
            int i19 = c2.c;
            while (i < i19) {
                ((ats) objArr6[i]).a();
                i++;
            }
            Object obj = q2t0.c;
            synchronized (obj) {
                try {
                    i2t0 j2 = q2t0.j();
                    Object obj2 = pxiVar2.f;
                    if (obj2 == pxi.h || (e3t0Var = this.b) == null || !e3t0Var.f(R, obj2)) {
                        pxi pxiVar3 = this.c;
                        synchronized (obj) {
                            j5u0 m = q2t0.m(pxiVar3, this);
                            m.a(pxiVar3);
                            m.a = j2.g();
                            pxiVar2 = (pxi) m;
                            pxiVar2.e = qy40Var2;
                            pxiVar2.g = pxiVar2.e(this, j2);
                            pxiVar2.f = R;
                        }
                        return pxiVar2;
                    }
                    pxiVar2.e = qy40Var2;
                    pxiVar2.g = pxiVar2.e(this, j2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            g6w g6wVar3 = (g6w) i3t0.a.a();
            if (g6wVar3 == null || g6wVar3.a != 0) {
                return pxiVar2;
            }
            q2t0.j().m();
            synchronized (obj) {
                i2t0 j3 = q2t0.j();
                pxiVar2.c = j3.g();
                pxiVar2.d = j3.h();
                return pxiVar2;
            }
        } catch (Throwable th3) {
            Object[] objArr7 = c2.a;
            int i20 = c2.c;
            for (int i21 = i; i21 < i20; i21++) {
                ((ats) objArr7[i21]).a();
            }
            throw th3;
        }
    }

    public final pxi d() {
        i2t0 j = q2t0.j();
        return b((pxi) q2t0.i(this.c, j), j, false, this.a);
    }

    @Override // defpackage.g5u0
    public final j5u0 getFirstStateRecord() {
        return this.c;
    }

    @Override // defpackage.m3u0
    public final Object getValue() {
        tls e = q2t0.j().e();
        if (e != null) {
            e.invoke(this);
        }
        i2t0 j = q2t0.j();
        return b((pxi) q2t0.i(this.c, j), j, true, this.a).f;
    }

    @Override // defpackage.g5u0
    public final void prependStateRecord(j5u0 j5u0Var) {
        this.c = (pxi) j5u0Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        pxi pxiVar = (pxi) q2t0.h(this.c);
        sb.append(pxiVar.d(this, q2t0.j()) ? String.valueOf(pxiVar.f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
