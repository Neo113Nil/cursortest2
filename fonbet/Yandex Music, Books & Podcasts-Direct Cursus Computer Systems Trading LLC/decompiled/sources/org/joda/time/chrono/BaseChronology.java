package org.joda.time.chrono;

import defpackage.psa;
import defpackage.rk4;
import defpackage.xc7;
import java.io.Serializable;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;

/* loaded from: classes5.dex */
public abstract class BaseChronology extends rk4 implements Serializable {
    private static final long serialVersionUID = -7310865996721419676L;

    @Override // defpackage.rk4
    public xc7 A() {
        return UnsupportedDateTimeField.D(DateTimeFieldType.u, B());
    }

    @Override // defpackage.rk4
    public psa B() {
        return UnsupportedDurationField.g(DurationFieldType.k);
    }

    @Override // defpackage.rk4
    public xc7 C() {
        return UnsupportedDateTimeField.D(DateTimeFieldType.k, D());
    }

    @Override // defpackage.rk4
    public psa D() {
        return UnsupportedDurationField.g(DurationFieldType.f);
    }

    @Override // defpackage.rk4
    public xc7 E() {
        return UnsupportedDateTimeField.D(DateTimeFieldType.j, G());
    }

    @Override // defpackage.rk4
    public xc7 F() {
        return UnsupportedDateTimeField.D(DateTimeFieldType.i, G());
    }

    @Override // defpackage.rk4
    public psa G() {
        return UnsupportedDurationField.g(DurationFieldType.c);
    }

    @Override // defpackage.rk4
    public xc7 J() {
        return UnsupportedDateTimeField.D(DateTimeFieldType.e, M());
    }

    @Override // defpackage.rk4
    public xc7 K() {
        return UnsupportedDateTimeField.D(DateTimeFieldType.d, M());
    }

    @Override // defpackage.rk4
    public xc7 L() {
        return UnsupportedDateTimeField.D(DateTimeFieldType.b, M());
    }

    @Override // defpackage.rk4
    public psa M() {
        return UnsupportedDurationField.g(DurationFieldType.d);
    }

    @Override // defpackage.rk4
    public psa a() {
        return UnsupportedDurationField.g(DurationFieldType.b);
    }

    @Override // defpackage.rk4
    public xc7 b() {
        return UnsupportedDateTimeField.D(DateTimeFieldType.c, a());
    }

    @Override // defpackage.rk4
    public xc7 c() {
        return UnsupportedDateTimeField.D(DateTimeFieldType.p, q());
    }

    @Override // defpackage.rk4
    public xc7 d() {
        return UnsupportedDateTimeField.D(DateTimeFieldType.o, q());
    }

    @Override // defpackage.rk4
    public xc7 e() {
        return UnsupportedDateTimeField.D(DateTimeFieldType.h, h());
    }

    @Override // defpackage.rk4
    public xc7 f() {
        return UnsupportedDateTimeField.D(DateTimeFieldType.l, h());
    }

    @Override // defpackage.rk4
    public xc7 g() {
        return UnsupportedDateTimeField.D(DateTimeFieldType.f, h());
    }

    @Override // defpackage.rk4
    public psa h() {
        return UnsupportedDurationField.g(DurationFieldType.g);
    }

    @Override // defpackage.rk4
    public xc7 i() {
        return UnsupportedDateTimeField.D(DateTimeFieldType.a, j());
    }

    @Override // defpackage.rk4
    public psa j() {
        return UnsupportedDurationField.g(DurationFieldType.a);
    }

    @Override // defpackage.rk4
    public xc7 l() {
        return UnsupportedDateTimeField.D(DateTimeFieldType.m, n());
    }

    @Override // defpackage.rk4
    public psa n() {
        return UnsupportedDurationField.g(DurationFieldType.h);
    }

    @Override // defpackage.rk4
    public xc7 o() {
        return UnsupportedDateTimeField.D(DateTimeFieldType.q, q());
    }

    @Override // defpackage.rk4
    public xc7 p() {
        return UnsupportedDateTimeField.D(DateTimeFieldType.n, q());
    }

    @Override // defpackage.rk4
    public psa q() {
        return UnsupportedDurationField.g(DurationFieldType.i);
    }

    @Override // defpackage.rk4
    public psa r() {
        return UnsupportedDurationField.g(DurationFieldType.l);
    }

    @Override // defpackage.rk4
    public xc7 s() {
        return UnsupportedDateTimeField.D(DateTimeFieldType.v, r());
    }

    @Override // defpackage.rk4
    public xc7 t() {
        return UnsupportedDateTimeField.D(DateTimeFieldType.w, r());
    }

    @Override // defpackage.rk4
    public xc7 u() {
        return UnsupportedDateTimeField.D(DateTimeFieldType.r, w());
    }

    @Override // defpackage.rk4
    public xc7 v() {
        return UnsupportedDateTimeField.D(DateTimeFieldType.s, w());
    }

    @Override // defpackage.rk4
    public psa w() {
        return UnsupportedDurationField.g(DurationFieldType.j);
    }

    @Override // defpackage.rk4
    public xc7 x() {
        return UnsupportedDateTimeField.D(DateTimeFieldType.g, y());
    }

    @Override // defpackage.rk4
    public psa y() {
        return UnsupportedDurationField.g(DurationFieldType.e);
    }

    @Override // defpackage.rk4
    public xc7 z() {
        return UnsupportedDateTimeField.D(DateTimeFieldType.t, B());
    }
}
