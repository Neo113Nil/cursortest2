package j$.time.chrono;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;

/* loaded from: classes2.dex */
public interface j extends Temporal, Comparable {
    e A();

    j H(ZoneId zoneId);

    ZoneId M();

    ZoneOffset p();

    j q(ZoneId zoneId);

    @Override // j$.time.temporal.TemporalAccessor
    default j$.time.temporal.s k(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (oVar != j$.time.temporal.a.INSTANT_SECONDS && oVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return A().k(oVar);
            }
            return ((j$.time.temporal.a) oVar).b;
        }
        return oVar.E(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default int e(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i = i.a[((j$.time.temporal.a) oVar).ordinal()];
            if (i == 1) {
                throw new j$.time.temporal.r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i != 2) {
                return A().e(oVar);
            }
            return p().b;
        }
        return super.e(oVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default long g(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i = i.a[((j$.time.temporal.a) oVar).ordinal()];
            if (i == 1) {
                return c0();
            }
            if (i != 2) {
                return A().g(oVar);
            }
            return p().b;
        }
        return oVar.T(this);
    }

    default b n() {
        return A().n();
    }

    default j$.time.l h() {
        return A().h();
    }

    default m d() {
        return n().d();
    }

    @Override // j$.time.temporal.Temporal
    default j m(j$.time.temporal.l lVar) {
        return l.u(d(), lVar.c(this));
    }

    @Override // j$.time.temporal.Temporal
    default j a(long j, j$.time.temporal.q qVar) {
        return l.u(d(), super.a(j, qVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object b(j$.time.f fVar) {
        if (fVar == j$.time.temporal.p.e || fVar == j$.time.temporal.p.a) {
            return M();
        }
        if (fVar == j$.time.temporal.p.d) {
            return p();
        }
        if (fVar == j$.time.temporal.p.g) {
            return h();
        }
        if (fVar == j$.time.temporal.p.b) {
            return d();
        }
        if (fVar == j$.time.temporal.p.c) {
            return ChronoUnit.NANOS;
        }
        return fVar.j(this);
    }

    default long c0() {
        return ((n().N() * 86400) + h().k0()) - p().b;
    }

    @Override // java.lang.Comparable
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    default int compareTo(j jVar) {
        int compare = Long.compare(c0(), jVar.c0());
        return (compare == 0 && (compare = h().d - jVar.h().d) == 0 && (compare = A().compareTo(jVar.A())) == 0 && (compare = M().s().compareTo(jVar.M().s())) == 0) ? ((a) d()).s().compareTo(jVar.d().s()) : compare;
    }
}
