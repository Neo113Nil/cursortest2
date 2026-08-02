package org.joda.time.chrono;

import defpackage.ghh;
import defpackage.mq2;
import defpackage.mzc;
import defpackage.psa;
import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.field.UnsupportedDurationField;

/* loaded from: classes5.dex */
public final class d extends mq2 {
    public final GregorianChronology b;

    public d(GregorianChronology gregorianChronology) {
        super(DateTimeFieldType.a);
        this.b = gregorianChronology;
    }

    @Override // defpackage.xc7
    public final long A(int i, long j) {
        ghh.V(this, i, 0, 1);
        if (b(j) == i) {
            return j;
        }
        GregorianChronology gregorianChronology = this.b;
        return gregorianChronology.l0(-gregorianChronology.e0(j), j);
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final long B(long j, String str, Locale locale) {
        Integer num = (Integer) mzc.b(locale).g.get(str);
        if (num != null) {
            return A(num.intValue(), j);
        }
        throw new IllegalFieldValueException(DateTimeFieldType.a, str);
    }

    @Override // defpackage.xc7
    public final int b(long j) {
        return this.b.e0(j) <= 0 ? 0 : 1;
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final String e(int i, Locale locale) {
        return mzc.b(locale).a[i];
    }

    @Override // defpackage.xc7
    public final psa g() {
        return UnsupportedDurationField.g(DurationFieldType.a);
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final int i(Locale locale) {
        return mzc.b(locale).j;
    }

    @Override // defpackage.xc7
    public final int j() {
        return 1;
    }

    @Override // defpackage.xc7
    public final int n() {
        return 0;
    }

    @Override // defpackage.xc7
    public final psa p() {
        return null;
    }

    @Override // defpackage.xc7
    public final boolean s() {
        return false;
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final long v(long j) {
        if (b(j) == 0) {
            return this.b.l0(1, 0L);
        }
        return Long.MAX_VALUE;
    }

    @Override // defpackage.xc7
    public final long w(long j) {
        if (b(j) == 1) {
            return this.b.l0(1, 0L);
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final long x(long j) {
        return w(j);
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final long y(long j) {
        return w(j);
    }

    @Override // defpackage.mq2, defpackage.xc7
    public final long z(long j) {
        return w(j);
    }
}
