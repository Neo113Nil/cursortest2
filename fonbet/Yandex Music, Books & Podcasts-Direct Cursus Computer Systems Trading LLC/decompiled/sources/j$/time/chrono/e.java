package j$.time.chrono;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import java.util.Objects;

/* loaded from: classes2.dex */
public interface e extends Temporal, j$.time.temporal.l, Comparable {
    j I(ZoneId zoneId);

    j$.time.l h();

    b n();

    default m d() {
        return n().d();
    }

    @Override // j$.time.temporal.Temporal
    default e a(long j, j$.time.temporal.q qVar) {
        return g.u(d(), super.a(j, qVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object b(j$.time.f fVar) {
        if (fVar == j$.time.temporal.p.a || fVar == j$.time.temporal.p.e || fVar == j$.time.temporal.p.d) {
            return null;
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

    @Override // j$.time.temporal.l
    default Temporal c(Temporal temporal) {
        return temporal.i(n().N(), j$.time.temporal.a.EPOCH_DAY).i(h().j0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    default long z(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((n().N() * 86400) + h().k0()) - zoneOffset.b;
    }

    @Override // java.lang.Comparable
    /* renamed from: S */
    default int compareTo(e eVar) {
        int compareTo = n().compareTo(eVar.n());
        return (compareTo == 0 && (compareTo = h().compareTo(eVar.h())) == 0) ? ((a) d()).s().compareTo(eVar.d().s()) : compareTo;
    }
}
