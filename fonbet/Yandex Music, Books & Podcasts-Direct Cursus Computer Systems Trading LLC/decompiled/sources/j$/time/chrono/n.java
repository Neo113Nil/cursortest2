package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;

/* loaded from: classes2.dex */
public interface n extends TemporalAccessor, j$.time.temporal.l {
    int getValue();

    @Override // j$.time.temporal.TemporalAccessor
    default boolean f(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar == j$.time.temporal.a.ERA : oVar != null && oVar.u(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default int e(j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.ERA) {
            return getValue();
        }
        return super.e(oVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default long g(j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.ERA) {
            return getValue();
        }
        if (oVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.r(j$.time.c.a("Unsupported field: ", oVar));
        }
        return oVar.T(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object b(j$.time.f fVar) {
        if (fVar == j$.time.temporal.p.c) {
            return ChronoUnit.ERAS;
        }
        return super.b(fVar);
    }

    @Override // j$.time.temporal.l
    default Temporal c(Temporal temporal) {
        return temporal.i(getValue(), j$.time.temporal.a.ERA);
    }
}
