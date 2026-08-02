package org.joda.time.field;

import defpackage.e7o;
import defpackage.psa;
import defpackage.xc7;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import org.joda.time.DateTimeFieldType;

/* loaded from: classes5.dex */
public final class UnsupportedDateTimeField extends xc7 implements Serializable {
    public static HashMap a = null;
    private static final long serialVersionUID = -1934618396111902255L;
    private final psa iDurationField;
    private final DateTimeFieldType iType;

    public UnsupportedDateTimeField(DateTimeFieldType dateTimeFieldType, psa psaVar) {
        if (dateTimeFieldType == null || psaVar == null) {
            e7o.e();
            throw null;
        }
        this.iType = dateTimeFieldType;
        this.iDurationField = psaVar;
    }

    public static synchronized UnsupportedDateTimeField D(DateTimeFieldType dateTimeFieldType, psa psaVar) {
        UnsupportedDateTimeField unsupportedDateTimeField;
        synchronized (UnsupportedDateTimeField.class) {
            try {
                HashMap hashMap = a;
                unsupportedDateTimeField = null;
                if (hashMap == null) {
                    a = new HashMap(7);
                } else {
                    UnsupportedDateTimeField unsupportedDateTimeField2 = (UnsupportedDateTimeField) hashMap.get(dateTimeFieldType);
                    if (unsupportedDateTimeField2 == null || unsupportedDateTimeField2.iDurationField == psaVar) {
                        unsupportedDateTimeField = unsupportedDateTimeField2;
                    }
                }
                if (unsupportedDateTimeField == null) {
                    unsupportedDateTimeField = new UnsupportedDateTimeField(dateTimeFieldType, psaVar);
                    a.put(dateTimeFieldType, unsupportedDateTimeField);
                }
            } finally {
            }
        }
        return unsupportedDateTimeField;
    }

    private Object readResolve() {
        return D(this.iType, this.iDurationField);
    }

    @Override // defpackage.xc7
    public final long A(int i, long j) {
        throw E();
    }

    @Override // defpackage.xc7
    public final long B(long j, String str, Locale locale) {
        throw E();
    }

    public final UnsupportedOperationException E() {
        return new UnsupportedOperationException(this.iType + " field is unsupported");
    }

    @Override // defpackage.xc7
    public final long a(int i, long j) {
        return this.iDurationField.a(i, j);
    }

    @Override // defpackage.xc7
    public final int b(long j) {
        throw E();
    }

    @Override // defpackage.xc7
    public final String c(int i, Locale locale) {
        throw E();
    }

    @Override // defpackage.xc7
    public final String d(long j, Locale locale) {
        throw E();
    }

    @Override // defpackage.xc7
    public final String e(int i, Locale locale) {
        throw E();
    }

    @Override // defpackage.xc7
    public final String f(long j, Locale locale) {
        throw E();
    }

    @Override // defpackage.xc7
    public final psa g() {
        return this.iDurationField;
    }

    @Override // defpackage.xc7
    public final psa h() {
        return null;
    }

    @Override // defpackage.xc7
    public final int i(Locale locale) {
        throw E();
    }

    @Override // defpackage.xc7
    public final int j() {
        throw E();
    }

    @Override // defpackage.xc7
    public final int n() {
        throw E();
    }

    @Override // defpackage.xc7
    public final String o() {
        return this.iType.c();
    }

    @Override // defpackage.xc7
    public final psa p() {
        return null;
    }

    @Override // defpackage.xc7
    public final DateTimeFieldType q() {
        return this.iType;
    }

    @Override // defpackage.xc7
    public final boolean r(long j) {
        throw E();
    }

    @Override // defpackage.xc7
    public final boolean s() {
        return false;
    }

    @Override // defpackage.xc7
    public final boolean t() {
        return false;
    }

    public final String toString() {
        return "UnsupportedDateTimeField";
    }

    @Override // defpackage.xc7
    public final long u(long j) {
        throw E();
    }

    @Override // defpackage.xc7
    public final long v(long j) {
        throw E();
    }

    @Override // defpackage.xc7
    public final long w(long j) {
        throw E();
    }

    @Override // defpackage.xc7
    public final long x(long j) {
        throw E();
    }

    @Override // defpackage.xc7
    public final long y(long j) {
        throw E();
    }

    @Override // defpackage.xc7
    public final long z(long j) {
        throw E();
    }
}
