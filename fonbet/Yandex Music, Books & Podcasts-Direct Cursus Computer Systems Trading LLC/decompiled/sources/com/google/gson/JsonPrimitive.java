package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.NumberLimits;
import defpackage.qq6;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class JsonPrimitive extends JsonElement {
    public final Serializable a;

    public JsonPrimitive(String str) {
        Objects.requireNonNull(str);
        this.a = str;
    }

    public static boolean v(JsonPrimitive jsonPrimitive) {
        Serializable serializable = jsonPrimitive.a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.google.gson.JsonElement
    public final int a() {
        return this.a instanceof Number ? u().intValue() : Integer.parseInt(q());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JsonPrimitive.class != obj.getClass()) {
            return false;
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
        Serializable serializable = jsonPrimitive.a;
        Serializable serializable2 = this.a;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (v(this) && v(jsonPrimitive)) {
            return ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) ? r().equals(jsonPrimitive.r()) : u().longValue() == jsonPrimitive.u().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : NumberLimits.b(q())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : NumberLimits.b(jsonPrimitive.q())) == 0;
        }
        double t = t();
        double t2 = jsonPrimitive.t();
        if (t != t2) {
            return Double.isNaN(t) && Double.isNaN(t2);
        }
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.a;
        if (serializable == null) {
            return 31;
        }
        if (v(this)) {
            doubleToLongBits = u().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(u().doubleValue());
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    @Override // com.google.gson.JsonElement
    public final long o() {
        return this.a instanceof Number ? u().longValue() : Long.parseLong(q());
    }

    @Override // com.google.gson.JsonElement
    public final String q() {
        Serializable serializable = this.a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return u().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final BigInteger r() {
        Serializable serializable = this.a;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (v(this)) {
            return BigInteger.valueOf(u().longValue());
        }
        String q = q();
        NumberLimits.a(q);
        return new BigInteger(q);
    }

    public final boolean s() {
        Serializable serializable = this.a;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(q());
    }

    public final double t() {
        return this.a instanceof Number ? u().doubleValue() : Double.parseDouble(q());
    }

    public final Number u() {
        Serializable serializable = this.a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new LazilyParsedNumber((String) serializable);
        }
        qq6.d("Primitive is neither a number nor a string");
        return null;
    }

    public JsonPrimitive(Number number) {
        this.a = number;
    }

    public JsonPrimitive(Boolean bool) {
        this.a = bool;
    }
}
