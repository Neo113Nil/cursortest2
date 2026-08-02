package j$.time.temporal;

import j$.time.format.c0;
import j$.time.format.d0;
import java.util.Map;

/* loaded from: classes2.dex */
public interface o {
    s E(TemporalAccessor temporalAccessor);

    s L();

    long T(TemporalAccessor temporalAccessor);

    Temporal a0(Temporal temporal, long j);

    boolean isDateBased();

    boolean u(TemporalAccessor temporalAccessor);

    default TemporalAccessor J(Map map, c0 c0Var, d0 d0Var) {
        return null;
    }
}
