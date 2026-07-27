package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: com.google.android.gms.internal.ads.pK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3724pK extends AbstractC3508lK {

    /* renamed from: n, reason: collision with root package name */
    public final Serializable f33063n;

    public C3724pK(OF of) {
        this.f33063n = of;
    }

    public static boolean g(C3724pK c3724pK) {
        Serializable serializable = c3724pK.f33063n;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3508lK
    public final String a() {
        Serializable serializable = this.f33063n;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return e().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: ".concat(String.valueOf(serializable.getClass())));
    }

    public final Number e() {
        Serializable serializable = this.f33063n;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new C3778qK((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3724pK.class != obj.getClass()) {
            return false;
        }
        C3724pK c3724pK = (C3724pK) obj;
        Serializable serializable = this.f33063n;
        Serializable serializable2 = c3724pK.f33063n;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (g(this) && g(c3724pK)) {
            return ((serializable instanceof BigInteger) || (serializable2 instanceof BigInteger)) ? f().equals(c3724pK.f()) : e().longValue() == c3724pK.e().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        if ((serializable instanceof BigDecimal) && (serializable2 instanceof BigDecimal)) {
            return (serializable instanceof BigDecimal ? (BigDecimal) serializable : QC.d(a())).compareTo(serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : QC.d(c3724pK.a())) == 0;
        }
        double doubleValue = serializable instanceof Number ? e().doubleValue() : Double.parseDouble(a());
        double doubleValue2 = serializable2 instanceof Number ? c3724pK.e().doubleValue() : Double.parseDouble(c3724pK.a());
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public final BigInteger f() {
        Serializable serializable = this.f33063n;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (g(this)) {
            return BigInteger.valueOf(e().longValue());
        }
        String a9 = a();
        QC.l(a9);
        return new BigInteger(a9);
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.f33063n;
        if (serializable == null) {
            return 31;
        }
        if (g(this)) {
            doubleToLongBits = e().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(e().doubleValue());
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public C3724pK(Boolean bool) {
        this.f33063n = bool;
    }

    public C3724pK(String str) {
        this.f33063n = str;
    }
}
