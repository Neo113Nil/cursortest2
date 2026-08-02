package defpackage;

import com.google.gson.internal.LazilyParsedNumber;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class rdx extends pcx {
    public final Serializable a;

    public rdx(Boolean bool) {
        Objects.requireNonNull(bool);
        this.a = bool;
    }

    public static boolean g(rdx rdxVar) {
        Serializable serializable = rdxVar.a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final BigInteger a() {
        Serializable serializable = this.a;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (g(this)) {
            return BigInteger.valueOf(e().longValue());
        }
        String f = f();
        vtb1.c(f);
        return new BigInteger(f);
    }

    public final boolean b() {
        Serializable serializable = this.a;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(f());
    }

    public final double d() {
        return this.a instanceof Number ? e().doubleValue() : Double.parseDouble(f());
    }

    public final Number e() {
        Serializable serializable = this.a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new LazilyParsedNumber((String) serializable);
        }
        w511.x("Primitive is neither a number nor a string");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rdx.class != obj.getClass()) {
            return false;
        }
        rdx rdxVar = (rdx) obj;
        Serializable serializable = rdxVar.a;
        Serializable serializable2 = this.a;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (g(this) && g(rdxVar)) {
            return ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) ? a().equals(rdxVar.a()) : e().longValue() == rdxVar.e().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : vtb1.d(f())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : vtb1.d(rdxVar.f())) == 0;
        }
        double d = d();
        double d2 = rdxVar.d();
        if (d != d2) {
            return Double.isNaN(d) && Double.isNaN(d2);
        }
        return true;
    }

    public final String f() {
        Serializable serializable = this.a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return e().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        dy31.p(serializable.getClass(), "Unexpected value type: ");
        return null;
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.a;
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

    public rdx(Number number) {
        Objects.requireNonNull(number);
        this.a = number;
    }

    public rdx(String str) {
        Objects.requireNonNull(str);
        this.a = str;
    }
}
