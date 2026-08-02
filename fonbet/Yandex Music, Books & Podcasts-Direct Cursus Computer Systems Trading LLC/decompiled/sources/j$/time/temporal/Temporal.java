package j$.time.temporal;

import j$.time.LocalDate;

/* loaded from: classes2.dex */
public interface Temporal extends TemporalAccessor {
    Temporal i(long j, o oVar);

    Temporal l(long j, q qVar);

    long o(Temporal temporal, q qVar);

    /* renamed from: j */
    default Temporal m(LocalDate localDate) {
        return localDate.c(this);
    }

    default Temporal a(long j, q qVar) {
        return j == Long.MIN_VALUE ? l(Long.MAX_VALUE, qVar).l(1L, qVar) : l(-j, qVar);
    }
}
