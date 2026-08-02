package j$.time;

import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements j$.time.temporal.l {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i) {
        this.a = i;
    }

    @Override // j$.time.temporal.l
    public Temporal c(Temporal temporal) {
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return temporal.i(temporal.k(aVar).d, aVar);
    }

    public Object j(TemporalAccessor temporalAccessor) {
        switch (this.a) {
            case 0:
                return Instant.E(temporalAccessor);
            case 1:
                return ZonedDateTime.E(temporalAccessor);
            case 2:
                ZoneId zoneId = (ZoneId) temporalAccessor.b(j$.time.temporal.p.a);
                if (zoneId == null || (zoneId instanceof ZoneOffset)) {
                    return null;
                }
                return zoneId;
            case 3:
            default:
                j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_DAY;
                if (temporalAccessor.f(aVar)) {
                    return l.a0(temporalAccessor.g(aVar));
                }
                return null;
            case 4:
                return (ZoneId) temporalAccessor.b(j$.time.temporal.p.a);
            case 5:
                return (j$.time.chrono.m) temporalAccessor.b(j$.time.temporal.p.b);
            case 6:
                return (j$.time.temporal.q) temporalAccessor.b(j$.time.temporal.p.c);
            case 7:
                j$.time.temporal.a aVar2 = j$.time.temporal.a.OFFSET_SECONDS;
                if (temporalAccessor.f(aVar2)) {
                    return ZoneOffset.g0(temporalAccessor.e(aVar2));
                }
                return null;
            case 8:
                ZoneId zoneId2 = (ZoneId) temporalAccessor.b(j$.time.temporal.p.a);
                return zoneId2 != null ? zoneId2 : (ZoneId) temporalAccessor.b(j$.time.temporal.p.d);
            case 9:
                j$.time.temporal.a aVar3 = j$.time.temporal.a.EPOCH_DAY;
                if (temporalAccessor.f(aVar3)) {
                    return LocalDate.j0(temporalAccessor.g(aVar3));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return "ZoneId";
            case 5:
                return "Chronology";
            case 6:
                return "Precision";
            case 7:
                return "ZoneOffset";
            case 8:
                return "Zone";
            case 9:
                return "LocalDate";
            case 10:
                return "LocalTime";
            default:
                return super.toString();
        }
    }
}
