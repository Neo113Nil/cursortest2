package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: com.google.android.gms.internal.ads.yK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4222yK extends AbstractC4006uK {

    /* renamed from: n, reason: collision with root package name */
    public final Serializable f35341n;

    public C4222yK(RF rf) {
        this.f35341n = rf;
    }

    public static boolean g(C4222yK c4222yK) {
        Serializable serializable = c4222yK.f35341n;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4006uK
    public final String a() {
        Serializable serializable = this.f35341n;
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
        Serializable serializable = this.f35341n;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new C4276zK((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4222yK.class != obj.getClass()) {
            return false;
        }
        C4222yK c4222yK = (C4222yK) obj;
        Serializable serializable = this.f35341n;
        Serializable serializable2 = c4222yK.f35341n;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (g(this) && g(c4222yK)) {
            return ((serializable instanceof BigInteger) || (serializable2 instanceof BigInteger)) ? f().equals(c4222yK.f()) : e().longValue() == c4222yK.e().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        if ((serializable instanceof BigDecimal) && (serializable2 instanceof BigDecimal)) {
            return (serializable instanceof BigDecimal ? (BigDecimal) serializable : AbstractC3406jD.c(a())).compareTo(serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : AbstractC3406jD.c(c4222yK.a())) == 0;
        }
        double doubleValue = serializable instanceof Number ? e().doubleValue() : Double.parseDouble(a());
        double doubleValue2 = serializable2 instanceof Number ? c4222yK.e().doubleValue() : Double.parseDouble(c4222yK.a());
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public final BigInteger f() {
        Serializable serializable = this.f35341n;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (g(this)) {
            return BigInteger.valueOf(e().longValue());
        }
        String a9 = a();
        AbstractC3406jD.h(a9);
        return new BigInteger(a9);
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.f35341n;
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

    public C4222yK(Boolean bool) {
        this.f35341n = bool;
    }

    public C4222yK(String str) {
        this.f35341n = str;
    }
}
