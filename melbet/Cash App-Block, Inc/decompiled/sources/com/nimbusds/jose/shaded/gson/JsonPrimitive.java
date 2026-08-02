package com.nimbusds.jose.shaded.gson;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.nimbusds.jose.shaded.gson.internal.GsonTypes;
import com.nimbusds.jose.shaded.gson.internal.LazilyParsedNumber;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class JsonPrimitive extends JsonElement {
    public final Serializable value;

    public JsonPrimitive(Boolean bool) {
        Objects.requireNonNull(bool);
        this.value = bool;
    }

    public static boolean isIntegral(JsonPrimitive jsonPrimitive) {
        Serializable serializable = jsonPrimitive.value;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JsonPrimitive.class != obj.getClass()) {
            return false;
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
        Serializable serializable = jsonPrimitive.value;
        Serializable serializable2 = this.value;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (isIntegral(this) && isIntegral(jsonPrimitive)) {
            return ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) ? getAsBigInteger().equals(jsonPrimitive.getAsBigInteger()) : getAsNumber().longValue() == jsonPrimitive.getAsNumber().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : GsonTypes.parseBigDecimal(getAsString())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : GsonTypes.parseBigDecimal(jsonPrimitive.getAsString())) == 0;
        }
        double doubleValue = serializable2 instanceof Number ? getAsNumber().doubleValue() : Double.parseDouble(getAsString());
        double doubleValue2 = serializable instanceof Number ? jsonPrimitive.getAsNumber().doubleValue() : Double.parseDouble(jsonPrimitive.getAsString());
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public final BigInteger getAsBigInteger() {
        Serializable serializable = this.value;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (isIntegral(this)) {
            return BigInteger.valueOf(getAsNumber().longValue());
        }
        String asString = getAsString();
        GsonTypes.checkNumberStringLength(asString);
        return new BigInteger(asString);
    }

    public final Number getAsNumber() {
        Serializable serializable = this.value;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new LazilyParsedNumber((String) serializable);
        }
        a$$ExternalSyntheticBUOutline0.m("Primitive is neither a number nor a string");
        return null;
    }

    public final String getAsString() {
        Serializable serializable = this.value;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return getAsNumber().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$2(serializable.getClass(), "Unexpected value type: ");
        return null;
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.value;
        if (serializable == null) {
            return 31;
        }
        if (isIntegral(this)) {
            doubleToLongBits = getAsNumber().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(getAsNumber().doubleValue());
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public JsonPrimitive(Number number) {
        Objects.requireNonNull(number);
        this.value = number;
    }

    public JsonPrimitive(String str) {
        Objects.requireNonNull(str);
        this.value = str;
    }
}
