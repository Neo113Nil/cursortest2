package org.joda.time.chrono;

import defpackage.glm;
import defpackage.k5r;
import defpackage.mdr;
import defpackage.rtw;
import defpackage.xq0;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDurationField;

/* loaded from: classes5.dex */
abstract class BasicChronology extends AssembledChronology {
    public static final glm A0;
    public static final glm B0;
    public static final glm C0;
    public static final glm D0;
    public static final rtw E0;
    public static final rtw F0;
    public static final a G0;
    public static final PreciseDurationField K;
    public static final PreciseDurationField L;
    public static final PreciseDurationField X;
    public static final PreciseDurationField Y;
    public static final PreciseDurationField Z;
    private static final long serialVersionUID = 8283225332206808863L;
    public static final PreciseDurationField v0;
    public static final glm w0;
    public static final glm x0;
    public static final glm y0;
    public static final glm z0;
    public final transient mdr[] J;
    private final int iMinDaysInFirstWeek;

    static {
        PreciseDurationField preciseDurationField = new PreciseDurationField(DurationFieldType.k, 1000L);
        K = preciseDurationField;
        PreciseDurationField preciseDurationField2 = new PreciseDurationField(DurationFieldType.j, 60000L);
        L = preciseDurationField2;
        PreciseDurationField preciseDurationField3 = new PreciseDurationField(DurationFieldType.i, 3600000L);
        X = preciseDurationField3;
        PreciseDurationField preciseDurationField4 = new PreciseDurationField(DurationFieldType.h, 43200000L);
        Y = preciseDurationField4;
        PreciseDurationField preciseDurationField5 = new PreciseDurationField(DurationFieldType.g, 86400000L);
        Z = preciseDurationField5;
        v0 = new PreciseDurationField(DurationFieldType.f, 604800000L);
        DateTimeFieldType dateTimeFieldType = DateTimeFieldType.w;
        MillisDurationField millisDurationField = MillisDurationField.a;
        w0 = new glm(dateTimeFieldType, millisDurationField, preciseDurationField);
        x0 = new glm(DateTimeFieldType.v, millisDurationField, preciseDurationField5);
        y0 = new glm(DateTimeFieldType.u, preciseDurationField, preciseDurationField2);
        z0 = new glm(DateTimeFieldType.t, preciseDurationField, preciseDurationField5);
        A0 = new glm(DateTimeFieldType.s, preciseDurationField2, preciseDurationField3);
        B0 = new glm(DateTimeFieldType.r, preciseDurationField2, preciseDurationField5);
        glm glmVar = new glm(DateTimeFieldType.q, preciseDurationField3, preciseDurationField5);
        C0 = glmVar;
        glm glmVar2 = new glm(DateTimeFieldType.n, preciseDurationField3, preciseDurationField4);
        D0 = glmVar2;
        E0 = new rtw(glmVar, DateTimeFieldType.p);
        F0 = new rtw(glmVar2, DateTimeFieldType.o);
        G0 = new a(DateTimeFieldType.m, Y, Z);
    }

    public BasicChronology(ZonedChronology zonedChronology, int i) {
        super(zonedChronology, null);
        this.J = new mdr[1024];
        if (i < 1 || i > 7) {
            xq0.x(k5r.i(i, "Invalid min days in first week: "));
            throw null;
        }
        this.iMinDaysInFirstWeek = i;
    }

    public static int V(long j) {
        long j2;
        if (j >= 0) {
            j2 = j / 86400000;
        } else {
            j2 = (j - 86399999) / 86400000;
            if (j2 < -3) {
                return ((int) ((j2 + 4) % 7)) + 7;
            }
        }
        return ((int) ((j2 + 3) % 7)) + 1;
    }

    public static int Y(long j) {
        return j >= 0 ? (int) (j % 86400000) : ((int) ((j + 1) % 86400000)) + 86399999;
    }

    public final int U(long j, int i, int i2) {
        return ((int) ((j - (f0(i) + a0(i, i2))) / 86400000)) + 1;
    }

    public final long X(int i) {
        long f0 = f0(i);
        return V(f0) > 8 - this.iMinDaysInFirstWeek ? ((8 - r8) * 86400000) + f0 : f0 - ((r8 - 1) * 86400000);
    }

    public int Z() {
        return this.iMinDaysInFirstWeek;
    }

    public abstract long a0(int i, int i2);

    public final int b0(int i, long j) {
        long X2 = X(i);
        if (j < X2) {
            return c0(i - 1);
        }
        if (j >= X(i + 1)) {
            return 1;
        }
        return ((int) ((j - X2) / 604800000)) + 1;
    }

    public final int c0(int i) {
        return (int) ((X(i + 1) - X(i)) / 604800000);
    }

    public final int d0(long j) {
        int e0 = e0(j);
        int b0 = b0(e0, j);
        return b0 == 1 ? e0(j + 604800000) : b0 > 51 ? e0(j - 1209600000) : e0;
    }

    public final int e0(long j) {
        long j2 = j >> 1;
        long j3 = 31083597720000L + j2;
        if (j3 < 0) {
            j3 = 31067819244001L + j2;
        }
        int i = (int) (j3 / 15778476000L);
        long f0 = f0(i);
        long j4 = j - f0;
        if (j4 < 0) {
            return i - 1;
        }
        if (j4 >= 31536000000L) {
            return f0 + (h0(i) ? 31622400000L : 31536000000L) <= j ? i + 1 : i;
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BasicChronology basicChronology = (BasicChronology) obj;
        return Z() == basicChronology.Z() && k().equals(basicChronology.k());
    }

    public final long f0(int i) {
        int i2;
        int i3 = i & 1023;
        mdr[] mdrVarArr = this.J;
        mdr mdrVar = mdrVarArr[i3];
        if (mdrVar == null || mdrVar.a != i) {
            GregorianChronology gregorianChronology = (GregorianChronology) this;
            int i4 = i / 100;
            if (i < 0) {
                i2 = ((((i + 3) >> 2) - i4) + ((i4 + 3) >> 2)) - 1;
            } else {
                int i5 = (i4 >> 2) + ((i >> 2) - i4);
                i2 = gregorianChronology.h0(i) ? i5 - 1 : i5;
            }
            mdrVar = new mdr(i, ((i * 365) + (i2 - 719527)) * 86400000, false);
            mdrVarArr[i3] = mdrVar;
        }
        return mdrVar.b;
    }

    public final long g0(int i, int i2, int i3) {
        return ((i3 - 1) * 86400000) + f0(i) + a0(i, i2);
    }

    public abstract boolean h0(int i);

    public int hashCode() {
        return k().hashCode() + (getClass().getName().hashCode() * 11) + Z();
    }

    @Override // org.joda.time.chrono.AssembledChronology, defpackage.rk4
    public abstract DateTimeZone k();

    public String toString() {
        StringBuilder sb = new StringBuilder(60);
        String name = getClass().getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            name = name.substring(lastIndexOf + 1);
        }
        sb.append(name);
        sb.append('[');
        DateTimeZone k = k();
        if (k != null) {
            sb.append(k.f());
        }
        if (Z() != 4) {
            sb.append(",mdfw=");
            sb.append(Z());
        }
        sb.append(']');
        return sb.toString();
    }
}
