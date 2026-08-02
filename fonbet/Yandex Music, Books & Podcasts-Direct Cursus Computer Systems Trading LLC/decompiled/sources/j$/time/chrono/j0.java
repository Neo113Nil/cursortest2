package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class j0 extends d {
    private static final long serialVersionUID = -8722293800195731463L;
    public final transient LocalDate a;

    @Override // j$.time.chrono.b
    public final e O(j$.time.l lVar) {
        return new g(this, lVar);
    }

    public j0(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.a = localDate;
    }

    @Override // j$.time.chrono.b
    public final m d() {
        return h0.c;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        h0.c.getClass();
        return this.a.hashCode() ^ 146118545;
    }

    @Override // j$.time.chrono.b
    public final n R() {
        return a0() >= 1 ? k0.BE : k0.BEFORE_BE;
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
        int i = i0.a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.k(oVar);
        }
        if (i != 4) {
            return h0.c.C(aVar);
        }
        j$.time.temporal.s sVar = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.s.f(1L, a0() <= 0 ? (-(sVar.a + 543)) + 1 : 543 + sVar.d);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i = i0.a[((j$.time.temporal.a) oVar).ordinal()];
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
        return this.a.getYear() + 543;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if (r2 != 7) goto L20;
     */
    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j0 i(long j, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            if (g(aVar) == j) {
                return this;
            }
            int[] iArr = i0.a;
            int i = iArr[aVar.ordinal()];
            if (i != 4) {
                if (i == 5) {
                    h0.c.C(aVar).b(j, aVar);
                    long a0 = a0() * 12;
                    return e0(this.a.n0(j - ((a0 + r10.b) - 1)));
                }
                if (i != 6) {
                }
            }
            int a = h0.c.C(aVar).a(j, aVar);
            int i2 = iArr[aVar.ordinal()];
            if (i2 == 4) {
                LocalDate localDate = this.a;
                if (a0() < 1) {
                    a = 1 - a;
                }
                return e0(localDate.t0(a - 543));
            }
            if (i2 == 6) {
                return e0(this.a.t0(a - 543));
            }
            if (i2 == 7) {
                return e0(this.a.t0((-542) - a0()));
            }
            return e0(this.a.i(j, oVar));
        }
        return (j0) super.i(j, oVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* renamed from: j */
    public final Temporal m(LocalDate localDate) {
        return (j0) super.m(localDate);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b m(j$.time.temporal.l lVar) {
        return (j0) super.m(lVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final b V(j$.time.temporal.n nVar) {
        return (j0) super.V(nVar);
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
        return (j0) super.l(j, qVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal l(long j, j$.time.temporal.q qVar) {
        return (j0) super.l(j, qVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final b a(long j, j$.time.temporal.q qVar) {
        return (j0) super.a(j, qVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal a(long j, j$.time.temporal.q qVar) {
        return (j0) super.a(j, qVar);
    }

    public final j0 e0(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new j0(localDate);
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
        if (obj instanceof j0) {
            return this.a.equals(((j0) obj).a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new f0((byte) 8, this);
    }
}
