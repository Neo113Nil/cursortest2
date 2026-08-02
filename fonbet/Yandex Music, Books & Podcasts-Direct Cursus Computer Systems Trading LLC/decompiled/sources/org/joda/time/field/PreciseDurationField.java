package org.joda.time.field;

import defpackage.ghh;
import defpackage.tlm;
import org.joda.time.DurationFieldType;

/* loaded from: classes5.dex */
public class PreciseDurationField extends BaseDurationField {
    private static final long serialVersionUID = -8346152187724495365L;
    private final long iUnitMillis;

    public PreciseDurationField(DurationFieldType durationFieldType, long j) {
        super(durationFieldType);
        this.iUnitMillis = j;
    }

    @Override // defpackage.psa
    public final long a(int i, long j) {
        return ghh.D(j, i * this.iUnitMillis);
    }

    @Override // defpackage.psa
    public final long b(long j, long j2) {
        long j3 = this.iUnitMillis;
        if (j3 != 1) {
            if (j2 == 1) {
                j2 = j3;
            } else {
                long j4 = 0;
                if (j2 != 0 && j3 != 0) {
                    j4 = j2 * j3;
                    if (j4 / j3 != j2 || ((j2 == Long.MIN_VALUE && j3 == -1) || (j3 == Long.MIN_VALUE && j2 == -1))) {
                        StringBuilder l = tlm.l(j2, "Multiplication overflows a long: ", " * ");
                        l.append(j3);
                        throw new ArithmeticException(l.toString());
                    }
                }
                j2 = j4;
            }
        }
        return ghh.D(j, j2);
    }

    @Override // defpackage.psa
    public final long d() {
        return this.iUnitMillis;
    }

    @Override // defpackage.psa
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PreciseDurationField) {
            PreciseDurationField preciseDurationField = (PreciseDurationField) obj;
            if (c() == preciseDurationField.c() && this.iUnitMillis == preciseDurationField.iUnitMillis) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.iUnitMillis;
        return c().hashCode() + ((int) (j ^ (j >>> 32)));
    }
}
