package j$.time.format;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalAccessor;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class x {
    public final TemporalAccessor a;
    public final DateTimeFormatter b;
    public int c;

    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        ZoneId zoneId;
        j$.time.zone.f E;
        j$.time.chrono.m mVar = dateTimeFormatter.e;
        ZoneId zoneId2 = dateTimeFormatter.f;
        if (mVar != null || zoneId2 != null) {
            j$.time.chrono.m mVar2 = (j$.time.chrono.m) temporalAccessor.b(j$.time.temporal.p.b);
            ZoneId zoneId3 = (ZoneId) temporalAccessor.b(j$.time.temporal.p.a);
            j$.time.chrono.b bVar = null;
            mVar = Objects.equals(mVar, mVar2) ? null : mVar;
            zoneId2 = Objects.equals(zoneId2, zoneId3) ? null : zoneId2;
            if (mVar != null || zoneId2 != null) {
                j$.time.chrono.m mVar3 = mVar != null ? mVar : mVar2;
                if (zoneId2 != null) {
                    if (temporalAccessor.f(j$.time.temporal.a.INSTANT_SECONDS)) {
                        j$.time.chrono.t tVar = j$.time.chrono.t.c;
                        if (mVar3 == null) {
                            Objects.requireNonNull(tVar, "defaultObj");
                            mVar3 = tVar;
                        }
                        temporalAccessor = mVar3.X(Instant.E(temporalAccessor), zoneId2);
                    } else {
                        try {
                            E = zoneId2.E();
                        } catch (j$.time.zone.g unused) {
                        }
                        if (E.h()) {
                            zoneId = E.d(Instant.c);
                            if (zoneId instanceof ZoneOffset) {
                                j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
                                if (temporalAccessor.f(aVar) && temporalAccessor.e(aVar) != zoneId2.E().d(Instant.c).b) {
                                    j$.time.i.j("Unable to apply override zone '", zoneId2, "' because the temporal object being formatted has a different offset but does not represent an instant: ", temporalAccessor);
                                    throw null;
                                }
                            }
                        }
                        zoneId = zoneId2;
                        if (zoneId instanceof ZoneOffset) {
                        }
                    }
                }
                zoneId3 = zoneId2 != null ? zoneId2 : zoneId3;
                if (mVar != null) {
                    if (temporalAccessor.f(j$.time.temporal.a.EPOCH_DAY)) {
                        bVar = mVar3.K(temporalAccessor);
                    } else if (mVar != j$.time.chrono.t.c || mVar2 != null) {
                        for (j$.time.temporal.a aVar2 : j$.time.temporal.a.values()) {
                            if (aVar2.isDateBased() && temporalAccessor.f(aVar2)) {
                                j$.time.i.j("Unable to apply override chronology '", mVar, "' because the temporal object being formatted contains date fields but does not represent a whole date: ", temporalAccessor);
                                throw null;
                            }
                        }
                    }
                }
                temporalAccessor = new w(bVar, temporalAccessor, mVar3, zoneId3);
            }
        }
        this.a = temporalAccessor;
        this.b = dateTimeFormatter;
    }

    public final Object b(j$.time.f fVar) {
        TemporalAccessor temporalAccessor = this.a;
        Object b = temporalAccessor.b(fVar);
        if (b != null || this.c != 0) {
            return b;
        }
        j$.time.i.j("Unable to extract ", fVar, " from temporal ", temporalAccessor);
        return null;
    }

    public final Long a(j$.time.temporal.o oVar) {
        int i = this.c;
        TemporalAccessor temporalAccessor = this.a;
        if (i <= 0 || temporalAccessor.f(oVar)) {
            return Long.valueOf(temporalAccessor.g(oVar));
        }
        return null;
    }

    public final String toString() {
        return this.a.toString();
    }
}
