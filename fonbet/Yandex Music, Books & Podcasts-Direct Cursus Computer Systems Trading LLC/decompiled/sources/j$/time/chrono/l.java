package j$.time.chrono;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class l implements j, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    public final transient g a;
    public final transient ZoneOffset b;
    public final transient ZoneId c;

    public static l E(ZoneId zoneId, ZoneOffset zoneOffset, g gVar) {
        Objects.requireNonNull(gVar, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new l(zoneId, (ZoneOffset) zoneId, gVar);
        }
        j$.time.zone.f E = zoneId.E();
        LocalDateTime E2 = LocalDateTime.E(gVar);
        List f = E.f(E2);
        if (f.size() == 1) {
            zoneOffset = (ZoneOffset) f.get(0);
        } else if (f.size() != 0) {
            if (zoneOffset == null || !f.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) f.get(0);
            }
            gVar = gVar;
        } else {
            Object e = E.e(E2);
            j$.time.zone.b bVar = e instanceof j$.time.zone.b ? (j$.time.zone.b) e : null;
            gVar = gVar.J(gVar.a, 0L, 0L, Duration.E(bVar.d.b - bVar.c.b, 0).a, 0L);
            zoneOffset = bVar.d;
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new l(zoneId, zoneOffset, gVar);
    }

    public static l J(m mVar, Instant instant, ZoneId zoneId) {
        ZoneOffset d = zoneId.E().d(instant);
        Objects.requireNonNull(d, "offset");
        return new l(zoneId, d, (g) mVar.Q(LocalDateTime.T(instant.a, instant.b, d)));
    }

    public static l u(m mVar, Temporal temporal) {
        l lVar = (l) temporal;
        if (mVar.equals(lVar.d())) {
            return lVar;
        }
        j$.time.i.e("Chronology mismatch, required: ", mVar.s(), lVar.d().s());
        return null;
    }

    public l(ZoneId zoneId, ZoneOffset zoneOffset, g gVar) {
        Objects.requireNonNull(gVar, "dateTime");
        this.a = gVar;
        Objects.requireNonNull(zoneOffset, "offset");
        this.b = zoneOffset;
        Objects.requireNonNull(zoneId, "zone");
        this.c = zoneId;
    }

    @Override // j$.time.chrono.j
    public final ZoneOffset p() {
        return this.b;
    }

    @Override // j$.time.chrono.j
    public final e A() {
        return this.a;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.b) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    public final String toString() {
        String str = this.a.toString() + this.b.c;
        ZoneOffset zoneOffset = this.b;
        ZoneId zoneId = this.c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    @Override // j$.time.chrono.j
    public final ZoneId M() {
        return this.c;
    }

    @Override // j$.time.chrono.j
    public final j H(ZoneId zoneId) {
        return E(zoneId, this.b, this.a);
    }

    @Override // j$.time.chrono.j
    public final j q(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (this.c.equals(zoneId)) {
            return this;
        }
        return J(d(), Instant.J(this.a.z(this.b), r0.h().d), zoneId);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            return true;
        }
        return oVar != null && oVar.u(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal i(long j, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            int i = k.a[aVar.ordinal()];
            if (i == 1) {
                return l(j - c0(), ChronoUnit.SECONDS);
            }
            if (i == 2) {
                ZoneOffset g0 = ZoneOffset.g0(aVar.b.a(j, aVar));
                return J(d(), Instant.J(this.a.z(g0), r5.h().d), this.c);
            }
            return E(this.c, this.b, this.a.i(j, oVar));
        }
        return u(d(), oVar.a0(this, j));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final l l(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof ChronoUnit) {
            return (l) m(this.a.l(j, qVar));
        }
        return u(d(), qVar.u(this, j));
    }

    @Override // j$.time.temporal.Temporal
    public final long o(Temporal temporal, j$.time.temporal.q qVar) {
        Objects.requireNonNull(temporal, "endExclusive");
        j x = d().x(temporal);
        if (qVar instanceof ChronoUnit) {
            return this.a.o(x.q(this.b).A(), qVar);
        }
        Objects.requireNonNull(qVar, "unit");
        return qVar.between(this, x);
    }

    private Object writeReplace() {
        return new f0((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && compareTo((j) obj) == 0;
    }
}
