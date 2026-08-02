package j$.time.temporal;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import j$.time.format.c0;
import j$.time.format.d0;
import java.util.Map;

/* loaded from: classes2.dex */
public enum j implements o {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);

    private static final long serialVersionUID = -7501623920830201812L;
    public final transient String a;
    public final transient s b;
    public final transient long c;

    @Override // j$.time.temporal.o
    public final boolean isDateBased() {
        return true;
    }

    static {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
    }

    j(String str, long j) {
        this.a = str;
        this.b = s.f((-365243219162L) + j, 365241780471L + j);
        this.c = j;
    }

    @Override // j$.time.temporal.o
    public final s L() {
        return this.b;
    }

    @Override // j$.time.temporal.o
    public final Temporal a0(Temporal temporal, long j) {
        if (!this.b.e(j)) {
            throw new j$.time.b("Invalid value: " + this.a + StringUtil.SPACE + j);
        }
        return temporal.i(Math.subtractExact(j, this.c), a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.o
    public final s E(TemporalAccessor temporalAccessor) {
        if (temporalAccessor.f(a.EPOCH_DAY)) {
            return this.b;
        }
        j$.time.i.i("Unsupported field: ", this);
        return null;
    }

    @Override // j$.time.temporal.o
    public final boolean u(TemporalAccessor temporalAccessor) {
        return temporalAccessor.f(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.o
    public final long T(TemporalAccessor temporalAccessor) {
        return temporalAccessor.g(a.EPOCH_DAY) + this.c;
    }

    @Override // j$.time.temporal.o
    public final TemporalAccessor J(Map map, c0 c0Var, d0 d0Var) {
        long longValue = ((Long) map.remove(this)).longValue();
        j$.time.chrono.m t = j$.time.chrono.m.t(c0Var);
        d0 d0Var2 = d0.LENIENT;
        long j = this.c;
        if (d0Var == d0Var2) {
            return t.r(Math.subtractExact(longValue, j));
        }
        this.b.b(longValue, this);
        return t.r(longValue - j);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
