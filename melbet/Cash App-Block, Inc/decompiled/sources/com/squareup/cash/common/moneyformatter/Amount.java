package com.squareup.cash.common.moneyformatter;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Amount {
    public static final Amount ONE;
    public static final Amount ZERO;
    public final BigDecimal value;

    static {
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        valueOf.getClass();
        ZERO = new Amount(valueOf);
        BigDecimal valueOf2 = BigDecimal.valueOf(1L);
        valueOf2.getClass();
        ONE = new Amount(valueOf2);
    }

    public Amount(BigDecimal bigDecimal) {
        bigDecimal.getClass();
        this.value = bigDecimal;
    }

    public final Amount absoluteValue() {
        BigDecimal abs = this.value.abs();
        abs.getClass();
        return new Amount(abs);
    }

    public final int compareTo(Amount amount) {
        amount.getClass();
        return this.value.compareTo(amount.value);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Amount) && Intrinsics.areEqual(this.value, ((Amount) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final boolean isWholeNumber() {
        return this.value.remainder(BigDecimal.ONE).signum() == 0;
    }

    public final Amount round(int i, RoundingMode roundingMode) {
        java.math.RoundingMode roundingMode2;
        roundingMode.getClass();
        switch (roundingMode.ordinal()) {
            case 0:
                roundingMode2 = java.math.RoundingMode.UP;
                break;
            case 1:
                roundingMode2 = java.math.RoundingMode.DOWN;
                break;
            case 2:
                roundingMode2 = java.math.RoundingMode.CEILING;
                break;
            case 3:
                roundingMode2 = java.math.RoundingMode.FLOOR;
                break;
            case 4:
                roundingMode2 = java.math.RoundingMode.HALF_UP;
                break;
            case 5:
                roundingMode2 = java.math.RoundingMode.HALF_DOWN;
                break;
            case 6:
                roundingMode2 = java.math.RoundingMode.HALF_EVEN;
                break;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
        BigDecimal scale = this.value.setScale(i, roundingMode2);
        scale.getClass();
        return new Amount(scale);
    }

    public final Amount shiftDecimalPoint(int i) {
        BigDecimal movePointRight = this.value.movePointRight(i);
        movePointRight.getClass();
        return new Amount(movePointRight);
    }

    public final String toString() {
        return "Amount(value=" + this.value + ")";
    }
}
