package defpackage;

/* loaded from: classes.dex */
public final class pis extends sis {
    public final yde e;
    public final yde f;
    public final int[] g;
    public final int[] h;

    public pis(qsn qsnVar, qsn qsnVar2, int[] iArr) {
        vq1.v(qsnVar.d == iArr.length);
        this.e = qsnVar;
        this.f = qsnVar2;
        this.g = iArr;
        this.h = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.h[iArr[i]] = i;
        }
    }

    @Override // defpackage.sis
    public final int a(boolean z) {
        if (p()) {
            return -1;
        }
        if (z) {
            return this.g[0];
        }
        return 0;
    }

    @Override // defpackage.sis
    public final int b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.sis
    public final int c(boolean z) {
        if (p()) {
            return -1;
        }
        yde ydeVar = this.e;
        if (!z) {
            return ydeVar.size() - 1;
        }
        return this.g[ydeVar.size() - 1];
    }

    @Override // defpackage.sis
    public final int e(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i == c(z)) {
            if (i2 == 2) {
                return a(z);
            }
            return -1;
        }
        if (!z) {
            return i + 1;
        }
        return this.g[this.h[i] + 1];
    }

    @Override // defpackage.sis
    public final ois f(int i, ois oisVar, boolean z) {
        ois oisVar2 = (ois) this.f.get(i);
        oisVar.j(oisVar2.a, oisVar2.b, oisVar2.c, oisVar2.d, oisVar2.e, oisVar2.g, oisVar2.f);
        return oisVar;
    }

    @Override // defpackage.sis
    public final int h() {
        return this.f.size();
    }

    @Override // defpackage.sis
    public final int k(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i == a(z)) {
            if (i2 == 2) {
                return c(z);
            }
            return -1;
        }
        if (!z) {
            return i - 1;
        }
        return this.g[this.h[i] - 1];
    }

    @Override // defpackage.sis
    public final Object l(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.sis
    public final ris m(int i, ris risVar, long j) {
        ris risVar2 = (ris) this.e.get(i);
        risVar.b(risVar2.a, risVar2.c, risVar2.d, risVar2.e, risVar2.f, risVar2.g, risVar2.h, risVar2.i, risVar2.j, risVar2.l, risVar2.m, risVar2.n, risVar2.o, risVar2.p);
        risVar.k = risVar2.k;
        return risVar;
    }

    @Override // defpackage.sis
    public final int o() {
        return this.e.size();
    }
}
