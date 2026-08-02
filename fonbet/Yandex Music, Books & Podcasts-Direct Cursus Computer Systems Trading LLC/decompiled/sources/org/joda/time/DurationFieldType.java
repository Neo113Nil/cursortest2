package org.joda.time;

import defpackage.psa;
import defpackage.rk4;
import defpackage.sd7;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.chrono.ISOChronology;

/* loaded from: classes5.dex */
public abstract class DurationFieldType implements Serializable {
    public static final DurationFieldType a = new StandardDurationFieldType("eras", (byte) 1);
    public static final DurationFieldType b = new StandardDurationFieldType("centuries", (byte) 2);
    public static final DurationFieldType c = new StandardDurationFieldType("weekyears", (byte) 3);
    public static final DurationFieldType d = new StandardDurationFieldType("years", (byte) 4);
    public static final DurationFieldType e = new StandardDurationFieldType("months", (byte) 5);
    public static final DurationFieldType f = new StandardDurationFieldType("weeks", (byte) 6);
    public static final DurationFieldType g = new StandardDurationFieldType("days", (byte) 7);
    public static final DurationFieldType h = new StandardDurationFieldType("halfdays", (byte) 8);
    public static final DurationFieldType i = new StandardDurationFieldType("hours", (byte) 9);
    public static final DurationFieldType j = new StandardDurationFieldType("minutes", (byte) 10);
    public static final DurationFieldType k = new StandardDurationFieldType("seconds", (byte) 11);
    public static final DurationFieldType l = new StandardDurationFieldType("millis", (byte) 12);
    private static final long serialVersionUID = 8765135187319L;
    private final String iName;

    public static class StandardDurationFieldType extends DurationFieldType {
        private static final long serialVersionUID = 31156755687123L;
        private final byte iOrdinal;

        public StandardDurationFieldType(String str, byte b) {
            super(str);
            this.iOrdinal = b;
        }

        private Object readResolve() {
            switch (this.iOrdinal) {
                case 1:
                    return DurationFieldType.a;
                case 2:
                    return DurationFieldType.b;
                case 3:
                    return DurationFieldType.c;
                case 4:
                    return DurationFieldType.d;
                case 5:
                    return DurationFieldType.e;
                case 6:
                    return DurationFieldType.f;
                case 7:
                    return DurationFieldType.g;
                case 8:
                    return DurationFieldType.h;
                case 9:
                    return DurationFieldType.i;
                case 10:
                    return DurationFieldType.j;
                case 11:
                    return DurationFieldType.k;
                case 12:
                    return DurationFieldType.l;
                default:
                    return this;
            }
        }

        @Override // org.joda.time.DurationFieldType
        public final psa a(rk4 rk4Var) {
            AtomicReference atomicReference = sd7.a;
            if (rk4Var == null) {
                rk4Var = ISOChronology.U();
            }
            switch (this.iOrdinal) {
                case 1:
                    return rk4Var.j();
                case 2:
                    return rk4Var.a();
                case 3:
                    return rk4Var.G();
                case 4:
                    return rk4Var.M();
                case 5:
                    return rk4Var.y();
                case 6:
                    return rk4Var.D();
                case 7:
                    return rk4Var.h();
                case 8:
                    return rk4Var.n();
                case 9:
                    return rk4Var.q();
                case 10:
                    return rk4Var.w();
                case 11:
                    return rk4Var.B();
                case 12:
                    return rk4Var.r();
                default:
                    throw new InternalError();
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StandardDurationFieldType) && this.iOrdinal == ((StandardDurationFieldType) obj).iOrdinal;
        }

        public final int hashCode() {
            return 1 << this.iOrdinal;
        }
    }

    public DurationFieldType(String str) {
        this.iName = str;
    }

    public abstract psa a(rk4 rk4Var);

    public final String b() {
        return this.iName;
    }

    public final String toString() {
        return this.iName;
    }
}
