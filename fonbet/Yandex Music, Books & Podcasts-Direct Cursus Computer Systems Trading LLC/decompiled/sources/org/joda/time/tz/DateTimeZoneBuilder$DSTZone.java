package org.joda.time.tz;

import defpackage.ud7;
import java.util.Arrays;
import org.joda.time.DateTimeZone;

/* loaded from: classes5.dex */
final class DateTimeZoneBuilder$DSTZone extends DateTimeZone {
    private static final long serialVersionUID = 6941492635554961361L;
    final ud7 iEndRecurrence;
    final int iStandardOffset;
    final ud7 iStartRecurrence;

    public DateTimeZoneBuilder$DSTZone(String str, int i, ud7 ud7Var, ud7 ud7Var2) {
        super(str);
        this.iStandardOffset = i;
        this.iStartRecurrence = ud7Var;
        this.iEndRecurrence = ud7Var2;
    }

    @Override // org.joda.time.DateTimeZone
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DateTimeZoneBuilder$DSTZone) {
            DateTimeZoneBuilder$DSTZone dateTimeZoneBuilder$DSTZone = (DateTimeZoneBuilder$DSTZone) obj;
            if (f().equals(dateTimeZoneBuilder$DSTZone.f()) && this.iStandardOffset == dateTimeZoneBuilder$DSTZone.iStandardOffset && this.iStartRecurrence.equals(dateTimeZoneBuilder$DSTZone.iStartRecurrence) && this.iEndRecurrence.equals(dateTimeZoneBuilder$DSTZone.iEndRecurrence)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.joda.time.DateTimeZone
    public final String h(long j) {
        return v(j).b;
    }

    @Override // org.joda.time.DateTimeZone
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.iStandardOffset), this.iStartRecurrence, this.iEndRecurrence});
    }

    @Override // org.joda.time.DateTimeZone
    public final int j(long j) {
        return this.iStandardOffset + v(j).c;
    }

    @Override // org.joda.time.DateTimeZone
    public final int o(long j) {
        return this.iStandardOffset;
    }

    @Override // org.joda.time.DateTimeZone
    public final boolean p() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r5 < 0) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // org.joda.time.DateTimeZone
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long q(long j) {
        long j2;
        long a;
        int i = this.iStandardOffset;
        ud7 ud7Var = this.iStartRecurrence;
        ud7 ud7Var2 = this.iEndRecurrence;
        try {
            j2 = ud7Var.a(j, i, ud7Var2.c);
            if (j > 0) {
            }
        } catch (ArithmeticException | IllegalArgumentException unused) {
        }
        try {
            a = ud7Var2.a(j, i, ud7Var.c);
            if (j > 0 || a >= 0) {
                j = a;
            }
        } catch (ArithmeticException | IllegalArgumentException unused2) {
        }
        return j2 <= j ? j : j2;
        j2 = j;
        a = ud7Var2.a(j, i, ud7Var.c);
        if (j > 0) {
        }
        j = a;
        if (j2 <= j) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r7 > 0) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    @Override // org.joda.time.DateTimeZone
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long s(long j) {
        long j2;
        long b;
        long j3 = j + 1;
        int i = this.iStandardOffset;
        ud7 ud7Var = this.iStartRecurrence;
        ud7 ud7Var2 = this.iEndRecurrence;
        try {
            j2 = ud7Var.b(j3, i, ud7Var2.c);
            if (j3 < 0) {
            }
        } catch (ArithmeticException | IllegalArgumentException unused) {
        }
        try {
            b = ud7Var2.b(j3, i, ud7Var.c);
            if (j3 < 0 || b <= 0) {
                j3 = b;
            }
        } catch (ArithmeticException | IllegalArgumentException unused2) {
        }
        if (j2 <= j3) {
            j2 = j3;
        }
        return j2 - 1;
        j2 = j3;
        b = ud7Var2.b(j3, i, ud7Var.c);
        if (j3 < 0) {
        }
        j3 = b;
        if (j2 <= j3) {
        }
        return j2 - 1;
    }

    public final ud7 v(long j) {
        long j2;
        int i = this.iStandardOffset;
        ud7 ud7Var = this.iStartRecurrence;
        ud7 ud7Var2 = this.iEndRecurrence;
        try {
            j2 = ud7Var.a(j, i, ud7Var2.c);
        } catch (ArithmeticException | IllegalArgumentException unused) {
            j2 = j;
        }
        try {
            j = ud7Var2.a(j, i, ud7Var.c);
        } catch (ArithmeticException | IllegalArgumentException unused2) {
        }
        return j2 > j ? ud7Var : ud7Var2;
    }
}
