package com.ionspin.kotlin.bignum.integer;

import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.mlkit.vision.text.zzc;
import com.google.mlkit.vision.text.zzd;
import com.ionspin.kotlin.bignum.BigNumber;
import com.ionspin.kotlin.bignum.decimal.BigDecimal;
import com.ionspin.kotlin.bignum.integer.base63.array.BigInteger63Arithmetic;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt___StringsKt;
import kotlin.text.UStringsKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class BigInteger implements BigNumber, Comparable {
    public static final BigInteger ONE;
    public static final BigInteger TEN;
    public static final BigInteger TWO;
    public static final BigInteger ZERO;
    public static final BigInteger63Arithmetic arithmetic;
    public final long[] magnitude;
    public final Sign sign;

    public final class QuotientAndRemainder {
        public final BigInteger quotient;
        public final BigInteger remainder;

        public QuotientAndRemainder(BigInteger bigInteger, BigInteger bigInteger2) {
            bigInteger.getClass();
            bigInteger2.getClass();
            this.quotient = bigInteger;
            this.remainder = bigInteger2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuotientAndRemainder)) {
                return false;
            }
            QuotientAndRemainder quotientAndRemainder = (QuotientAndRemainder) obj;
            return Intrinsics.areEqual(this.quotient, quotientAndRemainder.quotient) && Intrinsics.areEqual(this.remainder, quotientAndRemainder.remainder);
        }

        public final int hashCode() {
            return this.remainder.hashCode() + (this.quotient.hashCode() * 31);
        }

        public final String toString() {
            return "QuotientAndRemainder(quotient=" + this.quotient + ", remainder=" + this.remainder + ")";
        }
    }

    static {
        BigInteger63Arithmetic bigInteger63Arithmetic = ConfigurationKt.chosenArithmetic;
        arithmetic = bigInteger63Arithmetic;
        bigInteger63Arithmetic.getClass();
        ZERO = new BigInteger(BigInteger63Arithmetic.ZERO, Sign.ZERO);
        long[] jArr = BigInteger63Arithmetic.ONE;
        Sign sign = Sign.POSITIVE;
        ONE = new BigInteger(jArr, sign);
        TWO = new BigInteger(BigInteger63Arithmetic.TWO, sign);
        TEN = new BigInteger(BigInteger63Arithmetic.TEN, sign);
        Math.log10(2.0d);
    }

    public BigInteger(long[] jArr, Sign sign) {
        jArr.getClass();
        sign.getClass();
        Sign sign2 = Sign.ZERO;
        BigInteger63Arithmetic bigInteger63Arithmetic = arithmetic;
        if (sign == sign2) {
            bigInteger63Arithmetic.getClass();
            if (BigInteger63Arithmetic.m2113compareGR1PJdc(jArr, BigInteger63Arithmetic.ZERO) != 0) {
                a$$ExternalSyntheticBUOutline0.m$3("sign should be Sign.ZERO iff magnitude has a value of 0");
                throw null;
            }
        }
        BigInteger63Arithmetic bigInteger63Arithmetic2 = BigInteger63Arithmetic.INSTANCE;
        long[] m2121removeLeadingZerosJIhQxVY = BigInteger63Arithmetic.m2121removeLeadingZerosJIhQxVY(jArr);
        this.magnitude = m2121removeLeadingZerosJIhQxVY;
        bigInteger63Arithmetic.getClass();
        this.sign = BigInteger63Arithmetic.m2113compareGR1PJdc(m2121removeLeadingZerosJIhQxVY, BigInteger63Arithmetic.ZERO) == 0 ? sign2 : sign;
    }

    public final int compare(BigInteger bigInteger) {
        bigInteger.getClass();
        if (isZero() && bigInteger.isZero()) {
            return 0;
        }
        boolean isZero = bigInteger.isZero();
        Sign sign = bigInteger.sign;
        Sign sign2 = this.sign;
        if (isZero && sign2 == Sign.POSITIVE) {
            return 1;
        }
        if ((!bigInteger.isZero() || sign2 != Sign.NEGATIVE) && (!isZero() || sign != Sign.POSITIVE)) {
            if (isZero() && sign == Sign.NEGATIVE) {
                return 1;
            }
            if (sign2 == sign) {
                long[] jArr = bigInteger.magnitude;
                arithmetic.getClass();
                int m2113compareGR1PJdc = BigInteger63Arithmetic.m2113compareGR1PJdc(this.magnitude, jArr);
                Sign sign3 = Sign.NEGATIVE;
                return (sign2 == sign3 && sign == sign3) ? m2113compareGR1PJdc * (-1) : m2113compareGR1PJdc;
            }
            if (sign2 == Sign.POSITIVE) {
                return 1;
            }
        }
        return -1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        obj.getClass();
        if (obj instanceof Number) {
            Platform[] platformArr = Platform.$VALUES;
        }
        if (obj instanceof BigInteger) {
            return compare((BigInteger) obj);
        }
        if (obj instanceof Long) {
            return compare(zzd.fromLong(((Number) obj).longValue()));
        }
        if (obj instanceof Integer) {
            return compare(zzd.fromInt(((Number) obj).intValue()));
        }
        if (obj instanceof Short) {
            return compare(zzd.fromShort(((Number) obj).shortValue()));
        }
        if (obj instanceof Byte) {
            return compare(zzd.fromByte(((Number) obj).byteValue()));
        }
        if (obj instanceof ULong) {
            return compare(zzd.m2070fromULongVKZWuLQ(((ULong) obj).data));
        }
        boolean z = obj instanceof UInt;
        BigInteger63Arithmetic bigInteger63Arithmetic = arithmetic;
        if (z) {
            int i = ((UInt) obj).data;
            bigInteger63Arithmetic.getClass();
            long j = i & BodyPartID.bodyIdMax;
            ULong.Companion companion = ULong.Companion;
            return compare(new BigInteger(new long[]{j}, Sign.POSITIVE));
        }
        if (obj instanceof UShort) {
            short s = ((UShort) obj).data;
            bigInteger63Arithmetic.getClass();
            long j2 = s & 65535;
            ULong.Companion companion2 = ULong.Companion;
            return compare(new BigInteger(new long[]{j2}, Sign.POSITIVE));
        }
        if (obj instanceof UByte) {
            byte b = ((UByte) obj).data;
            bigInteger63Arithmetic.getClass();
            long j3 = b & 255;
            ULong.Companion companion3 = ULong.Companion;
            return compare(new BigInteger(new long[]{j3}, Sign.POSITIVE));
        }
        if (obj instanceof Float) {
            float floatValue = ((Number) obj).floatValue();
            float floor = (float) Math.floor(floatValue);
            if (floatValue % 1.0f == RecyclerView.DECELERATION_RATE) {
                double d = floor;
                Math.floor(d);
                BigDecimal bigDecimal = BigDecimal.ZERO;
                BigInteger bigInteger = zzc.fromFloat((float) Math.floor(d)).toBigInteger();
                bigInteger.getClass();
                return compare(bigInteger);
            }
            double d2 = floor + 1.0f;
            Math.floor(d2);
            BigDecimal bigDecimal2 = BigDecimal.ZERO;
            BigInteger bigInteger2 = zzc.fromFloat((float) Math.floor(d2)).toBigInteger();
            bigInteger2.getClass();
            int compare = compare(bigInteger2);
            if (compare == 0) {
                return 1;
            }
            return compare;
        }
        if (!(obj instanceof Double)) {
            JWK$$ExternalSyntheticBUOutline0.m$1(Reflection.factory.getOrCreateKotlinClass(obj.getClass()), "Invalid comparison type for BigInteger: ");
            return 0;
        }
        double doubleValue = ((Number) obj).doubleValue();
        double floor2 = Math.floor(doubleValue);
        if (doubleValue % 1.0d == 0.0d) {
            Math.floor(floor2);
            BigDecimal bigDecimal3 = BigDecimal.ZERO;
            BigInteger bigInteger3 = zzc.fromDouble(Math.floor(floor2)).toBigInteger();
            bigInteger3.getClass();
            return compare(bigInteger3);
        }
        double d3 = floor2 + 1.0d;
        Math.floor(d3);
        BigDecimal bigDecimal4 = BigDecimal.ZERO;
        BigInteger bigInteger4 = zzc.fromDouble(Math.floor(d3)).toBigInteger();
        bigInteger4.getClass();
        int compare2 = compare(bigInteger4);
        if (compare2 == 0) {
            return 1;
        }
        return compare2;
    }

    public final BigNumber divide(BigNumber bigNumber) {
        BigInteger bigInteger = (BigInteger) bigNumber;
        bigInteger.getClass();
        if (bigInteger.isZero()) {
            JWK$$ExternalSyntheticBUOutline0.m("Division by zero! ", this, " / ", bigInteger);
            return null;
        }
        long[] jArr = bigInteger.magnitude;
        arithmetic.getClass();
        long[] jArr2 = ((ULongArray) BigInteger63Arithmetic.m2116divideGR1PJdc(this.magnitude, jArr).first).storage;
        if (Intrinsics.areEqual(jArr2, BigInteger63Arithmetic.ZERO)) {
            return ZERO;
        }
        return new BigInteger(jArr2, this.sign != bigInteger.sign ? Sign.NEGATIVE : Sign.POSITIVE);
    }

    public final QuotientAndRemainder divrem(BigInteger bigInteger) {
        bigInteger.getClass();
        if (bigInteger.isZero()) {
            JWK$$ExternalSyntheticBUOutline0.m("Division by zero! ", this, " / ", bigInteger);
            return null;
        }
        Sign sign = bigInteger.sign;
        Sign sign2 = this.sign;
        Sign sign3 = sign2 != sign ? Sign.NEGATIVE : Sign.POSITIVE;
        long[] jArr = bigInteger.magnitude;
        arithmetic.getClass();
        Pair m2116divideGR1PJdc = BigInteger63Arithmetic.m2116divideGR1PJdc(this.magnitude, jArr);
        Object obj = m2116divideGR1PJdc.second;
        ULongArray uLongArray = (ULongArray) m2116divideGR1PJdc.first;
        long[] jArr2 = uLongArray.storage;
        long[] jArr3 = BigInteger63Arithmetic.ZERO;
        boolean areEqual = Intrinsics.areEqual(jArr2, jArr3);
        BigInteger bigInteger2 = ZERO;
        BigInteger bigInteger3 = areEqual ? bigInteger2 : new BigInteger(uLongArray.storage, sign3);
        ULongArray uLongArray2 = (ULongArray) obj;
        if (!Intrinsics.areEqual(uLongArray2.storage, jArr3)) {
            bigInteger2 = new BigInteger(uLongArray2.storage, sign2);
        }
        return new QuotientAndRemainder(bigInteger3, bigInteger2);
    }

    public final boolean equals(Object obj) {
        int i;
        if (obj instanceof BigInteger) {
            i = compare((BigInteger) obj);
        } else if (obj instanceof Long) {
            i = compare(zzd.fromLong(((Number) obj).longValue()));
        } else if (obj instanceof Integer) {
            i = compare(zzd.fromInt(((Number) obj).intValue()));
        } else if (obj instanceof Short) {
            i = compare(zzd.fromShort(((Number) obj).shortValue()));
        } else if (obj instanceof Byte) {
            i = compare(zzd.fromByte(((Number) obj).byteValue()));
        } else if (obj instanceof ULong) {
            i = compare(zzd.m2070fromULongVKZWuLQ(((ULong) obj).data));
        } else {
            boolean z = obj instanceof UInt;
            BigInteger63Arithmetic bigInteger63Arithmetic = arithmetic;
            if (z) {
                int i2 = ((UInt) obj).data;
                bigInteger63Arithmetic.getClass();
                long j = i2 & BodyPartID.bodyIdMax;
                ULong.Companion companion = ULong.Companion;
                i = compare(new BigInteger(new long[]{j}, Sign.POSITIVE));
            } else if (obj instanceof UShort) {
                short s = ((UShort) obj).data;
                bigInteger63Arithmetic.getClass();
                long j2 = s & 65535;
                ULong.Companion companion2 = ULong.Companion;
                i = compare(new BigInteger(new long[]{j2}, Sign.POSITIVE));
            } else if (obj instanceof UByte) {
                byte b = ((UByte) obj).data;
                bigInteger63Arithmetic.getClass();
                long j3 = b & 255;
                ULong.Companion companion3 = ULong.Companion;
                i = compare(new BigInteger(new long[]{j3}, Sign.POSITIVE));
            } else {
                i = -1;
            }
        }
        return i == 0;
    }

    public final int hashCode() {
        int i = 0;
        for (long j : this.magnitude) {
            ULong.Companion companion = ULong.Companion;
            i += Long.hashCode(j);
        }
        return this.sign.hashCode() + i;
    }

    public final int intValue() {
        if (compareTo(Integer.MAX_VALUE) > 0 || compareTo(Integer.valueOf(PKIFailureInfo.systemUnavail)) < 0) {
            Mod$$ExternalSyntheticBUOutline0.m$2("Cannot convert to int and provide exact value");
            return 0;
        }
        long j = this.magnitude[0];
        ULong.Companion companion = ULong.Companion;
        return signum() * ((int) j);
    }

    public final boolean isZero() {
        if (this.sign == Sign.ZERO) {
            return true;
        }
        ConfigurationKt.chosenArithmetic.getClass();
        return BigInteger63Arithmetic.m2113compareGR1PJdc(this.magnitude, BigInteger63Arithmetic.ZERO) == 0;
    }

    public final BigInteger minus(BigNumber bigNumber) {
        Sign sign;
        BigInteger bigInteger = (BigInteger) bigNumber;
        bigInteger.getClass();
        if (isZero()) {
            return bigInteger.negate();
        }
        boolean isZero = bigInteger.isZero();
        long[] jArr = bigInteger.magnitude;
        if (isZero) {
            return this;
        }
        Sign sign2 = bigInteger.sign;
        BigInteger63Arithmetic bigInteger63Arithmetic = arithmetic;
        long[] jArr2 = this.magnitude;
        Sign sign3 = this.sign;
        if (sign2 != sign3) {
            bigInteger63Arithmetic.getClass();
            return new BigInteger(BigInteger63Arithmetic.m2109addj68ebKY(jArr2, jArr), sign3);
        }
        bigInteger63Arithmetic.getClass();
        int m2113compareGR1PJdc = BigInteger63Arithmetic.m2113compareGR1PJdc(jArr2, jArr);
        if (m2113compareGR1PJdc > 0) {
            return new BigInteger(BigInteger63Arithmetic.m2124subtractj68ebKY(jArr2, jArr), sign3);
        }
        if (m2113compareGR1PJdc >= 0) {
            return ZERO;
        }
        long[] m2124subtractj68ebKY = BigInteger63Arithmetic.m2124subtractj68ebKY(jArr, jArr2);
        int ordinal = sign3.ordinal();
        if (ordinal == 0) {
            sign = Sign.NEGATIVE;
        } else if (ordinal == 1) {
            sign = Sign.POSITIVE;
        } else {
            if (ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            sign = Sign.ZERO;
        }
        return new BigInteger(m2124subtractj68ebKY, sign);
    }

    public final BigNumber multiply(BigNumber bigNumber) {
        BigInteger bigInteger = (BigInteger) bigNumber;
        bigInteger.getClass();
        if (!isZero()) {
            boolean isZero = bigInteger.isZero();
            long[] jArr = bigInteger.magnitude;
            if (!isZero) {
                if (bigInteger.equals(ONE)) {
                    return this;
                }
                Sign sign = this.sign != bigInteger.sign ? Sign.NEGATIVE : Sign.POSITIVE;
                Sign sign2 = Sign.POSITIVE;
                BigInteger63Arithmetic bigInteger63Arithmetic = arithmetic;
                long[] jArr2 = this.magnitude;
                if (sign == sign2) {
                    bigInteger63Arithmetic.getClass();
                    return new BigInteger(BigInteger63Arithmetic.m2118multiplyj68ebKY(jArr2, jArr), sign);
                }
                bigInteger63Arithmetic.getClass();
                return new BigInteger(BigInteger63Arithmetic.m2118multiplyj68ebKY(jArr2, jArr), sign);
            }
        }
        return ZERO;
    }

    public final BigInteger negate() {
        Sign sign;
        int ordinal = this.sign.ordinal();
        if (ordinal == 0) {
            sign = Sign.NEGATIVE;
        } else if (ordinal == 1) {
            sign = Sign.POSITIVE;
        } else {
            if (ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            sign = Sign.ZERO;
        }
        return new BigInteger(this.magnitude, sign);
    }

    public final long numberOfDecimalDigits() {
        if (isZero()) {
            return 1L;
        }
        ULongArray[] uLongArrayArr = BigInteger63Arithmetic.powersOf10;
        int length = uLongArrayArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            long[] jArr = uLongArrayArr[i].storage;
            BigInteger63Arithmetic bigInteger63Arithmetic = BigInteger63Arithmetic.INSTANCE;
            jArr.getClass();
            long[] jArr2 = this.magnitude;
            jArr2.getClass();
            if (BigInteger63Arithmetic.m2113compareGR1PJdc(jArr, jArr2) > 0) {
                break;
            }
            i++;
        }
        if (i != -1) {
            return i;
        }
        BigInteger pow = TEN.pow(uLongArrayArr.length);
        pow.getClass();
        BigInteger bigInteger = (BigInteger) divide(pow);
        long j = 0;
        while (!bigInteger.isZero()) {
            bigInteger = (BigInteger) bigInteger.divide(zzd.fromInt(10));
            j++;
        }
        return j + uLongArrayArr.length;
    }

    public final BigInteger plus(BigNumber bigNumber) {
        BigInteger bigInteger = (BigInteger) bigNumber;
        bigInteger.getClass();
        long[] jArr = bigInteger.magnitude;
        arithmetic.getClass();
        long[] jArr2 = this.magnitude;
        int m2113compareGR1PJdc = BigInteger63Arithmetic.m2113compareGR1PJdc(jArr2, jArr);
        Sign sign = bigInteger.sign;
        Sign sign2 = this.sign;
        return sign == sign2 ? new BigInteger(BigInteger63Arithmetic.m2109addj68ebKY(jArr2, jArr), sign2) : m2113compareGR1PJdc > 0 ? new BigInteger(BigInteger63Arithmetic.m2124subtractj68ebKY(jArr2, jArr), sign2) : m2113compareGR1PJdc < 0 ? new BigInteger(BigInteger63Arithmetic.m2124subtractj68ebKY(jArr, jArr2), sign) : ZERO;
    }

    public final BigInteger pow(long j) {
        long j2 = j;
        if (j2 < 0) {
            Mod$$ExternalSyntheticBUOutline0.m$2("Negative exponent not supported with BigInteger");
            return null;
        }
        if (isZero()) {
            return ZERO;
        }
        BigInteger bigInteger = ONE;
        if (equals(bigInteger)) {
            return bigInteger;
        }
        Sign sign = Sign.NEGATIVE;
        if (this.sign != sign) {
            sign = Sign.POSITIVE;
        } else if (j2 % 2 == 0) {
            sign = Sign.POSITIVE;
        }
        arithmetic.getClass();
        long[] jArr = BigInteger63Arithmetic.ONE;
        long[] jArr2 = this.magnitude;
        jArr2.getClass();
        if (j2 != 0) {
            if (j2 == 1) {
                jArr = jArr2;
            } else {
                if (jArr2.length == 1) {
                    long j3 = jArr2[0];
                    ULong.Companion companion = ULong.Companion;
                    if (j3 == 10) {
                        ULongArray[] uLongArrayArr = BigInteger63Arithmetic.powersOf10;
                        if (j2 < uLongArrayArr.length) {
                            jArr = uLongArrayArr[(int) j2].storage;
                        }
                    }
                }
                BigInteger63Arithmetic.m2115countLeadingZeroWordsQwZRm1k(jArr2);
                while (j2 > 1) {
                    if (j2 % 2 == 0) {
                        jArr2 = BigInteger63Arithmetic.m2125timesj68ebKY$bignum(jArr2, jArr2);
                        j2 /= 2;
                    } else {
                        jArr = BigInteger63Arithmetic.m2125timesj68ebKY$bignum(jArr2, jArr);
                        jArr2 = BigInteger63Arithmetic.m2118multiplyj68ebKY(jArr2, jArr2);
                        j2 = (j2 - 1) / 2;
                    }
                }
                jArr = BigInteger63Arithmetic.m2125timesj68ebKY$bignum(jArr, jArr2);
            }
        }
        return new BigInteger(jArr, sign);
    }

    public final int signum() {
        int ordinal = this.sign.ordinal();
        if (ordinal == 0) {
            return 1;
        }
        if (ordinal == 1) {
            return -1;
        }
        if (ordinal == 2) {
            return 0;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    public final BigInteger times(BigNumber bigNumber) {
        BigInteger bigInteger = (BigInteger) bigNumber;
        bigInteger.getClass();
        return (BigInteger) multiply(bigInteger);
    }

    public final String toString() {
        return toString$1();
    }

    public final String toString$1() {
        String str = this.sign == Sign.NEGATIVE ? "-" : "";
        arithmetic.getClass();
        long[] jArr = this.magnitude;
        jArr.getClass();
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        ULong.Companion companion = ULong.Companion;
        long[] jArr2 = {10};
        StringBuilder sb = new StringBuilder();
        while (!Intrinsics.areEqual(copyOf, BigInteger63Arithmetic.ZERO)) {
            copyOf.getClass();
            Pair m2116divideGR1PJdc = BigInteger63Arithmetic.m2116divideGR1PJdc(copyOf, jArr2);
            long[] jArr3 = ((ULongArray) m2116divideGR1PJdc.second).storage;
            if (jArr3.length == 0) {
                sb.append(0);
            } else {
                long j = jArr3[0];
                ULong.Companion companion2 = ULong.Companion;
                sb.append(UStringsKt.m4158toStringJSWoG40(j));
            }
            copyOf = ((ULongArray) m2116divideGR1PJdc.first).storage;
        }
        return str.concat(StringsKt___StringsKt.reversed(sb.toString()).toString());
    }
}
