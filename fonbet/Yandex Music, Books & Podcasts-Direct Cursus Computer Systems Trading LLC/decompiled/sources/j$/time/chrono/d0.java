package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class d0 extends d {
    private static final long serialVersionUID = 1300372329181994526L;
    public final transient LocalDate a;

    @Override // j$.time.chrono.b
    public final e O(j$.time.l lVar) {
        return new g(this, lVar);
    }

    public d0(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.a = localDate;
    }

    @Override // j$.time.chrono.b
    public final m d() {
        return b0.c;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        b0.c.getClass();
        return this.a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.b
    public final n R() {
        return a0() >= 1 ? e0.ROC : e0.BEFORE_ROC;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.E(this);
        }
        if (!f(oVar)) {
            throw new j$.time.temporal.r(j$.time.c.a("Unsupported field: ", oVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        int i = c0.a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.k(oVar);
        }
        if (i != 4) {
            return b0.c.C(aVar);
        }
        j$.time.temporal.s sVar = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.s.f(1L, a0() <= 0 ? (-sVar.a) + 1912 : sVar.d - 1911);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i = c0.a[((j$.time.temporal.a) oVar).ordinal()];
            if (i == 4) {
                int a0 = a0();
                if (a0 < 1) {
                    a0 = 1 - a0;
                }
                return a0;
            }
            if (i == 5) {
                return ((a0() * 12) + this.a.b) - 1;
            }
            if (i == 6) {
                return a0();
            }
            if (i != 7) {
                return this.a.g(oVar);
            }
            return a0() < 1 ? 0 : 1;
        }
        return oVar.T(this);
    }

    public final int a0() {
        return this.a.getYear() - 1911;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if (r2 != 7) goto L20;
     */
    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d0 i(long j, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            if (g(aVar) == j) {
                return this;
            }
            int[] iArr = c0.a;
            int i = iArr[aVar.ordinal()];
            if (i != 4) {
                if (i == 5) {
                    b0.c.C(aVar).b(j, aVar);
                    long a0 = a0() * 12;
                    return e0(this.a.n0(j - ((a0 + r10.b) - 1)));
                }
                if (i != 6) {
                }
            }
            int a = b0.c.C(aVar).a(j, aVar);
            int i2 = iArr[aVar.ordinal()];
            if (i2 == 4) {
                return e0(this.a.t0(a0() >= 1 ? a + 1911 : 1912 - a));
            }
            if (i2 == 6) {
                return e0(this.a.t0(a + 1911));
            }
            if (i2 == 7) {
                return e0(this.a.t0(1912 - a0()));
            }
            return e0(this.a.i(j, oVar));
        }
        return (d0) super.i(j, oVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* renamed from: j */
    public final Temporal m(LocalDate localDate) {
        return (d0) super.m(localDate);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b m(j$.time.temporal.l lVar) {
        return (d0) super.m(lVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b V(j$.time.temporal.n nVar) {
        return (d0) super.V(nVar);
    }

    @Override // j$.time.chrono.d
    public final b T(long j) {
        return e0(this.a.p0(j));
    }

    @Override // j$.time.chrono.d
    public final b L(long j) {
        return e0(this.a.n0(j));
    }

    @Override // j$.time.chrono.d
    public final b J(long j) {
        return e0(this.a.m0(j));
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.Temporal
    public final b l(long j, j$.time.temporal.q qVar) {
        return (d0) super.l(j, qVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal l(long j, j$.time.temporal.q qVar) {
        return (d0) super.l(j, qVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final b a(long j, j$.time.temporal.q qVar) {
        return (d0) super.a(j, qVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal a(long j, j$.time.temporal.q qVar) {
        return (d0) super.a(j, qVar);
    }

    public final d0 e0(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new d0(localDate);
    }

    @Override // j$.time.chrono.b
    public final long N() {
        return this.a.N();
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            return this.a.equals(((d0) obj).a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new f0((byte) 7, this);
    }
}
