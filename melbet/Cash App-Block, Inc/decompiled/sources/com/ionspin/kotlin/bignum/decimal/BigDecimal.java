package com.ionspin.kotlin.bignum.decimal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.mlkit.vision.text.zzc;
import com.google.mlkit.vision.text.zzd;
import com.ionspin.kotlin.bignum.BigNumber;
import com.ionspin.kotlin.bignum.integer.BigInteger;
import com.ionspin.kotlin.bignum.integer.Platform;
import com.ionspin.kotlin.bignum.integer.base63.array.BigInteger63Arithmetic;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class BigDecimal implements BigNumber, Comparable {
    public static final BigDecimal ONE;
    public static final BigDecimal ZERO;
    public final DecimalMode decimalMode;
    public final long exponent;
    public final long precision;
    public final BigInteger significand;
    public final boolean usingScale;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ScaleOps {
        public static final /* synthetic */ ScaleOps[] $VALUES = {new ScaleOps("Max", 0), new ScaleOps("Min", 1), new ScaleOps("Add", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        ScaleOps EF5;

        public static ScaleOps valueOf(String str) {
            return (ScaleOps) Enum.valueOf(ScaleOps.class, str);
        }

        public static ScaleOps[] values() {
            return (ScaleOps[]) $VALUES.clone();
        }
    }

    static {
        long j = 0;
        int i = 6;
        ZERO = new BigDecimal(BigInteger.ZERO, j, i);
        ONE = new BigDecimal(BigInteger.ONE, j, i);
        new BigDecimal(BigInteger.TWO, j, i);
        new BigDecimal(BigInteger.TEN, 1L, 4);
        zzc.fromDouble(Double.MAX_VALUE);
        zzc.fromDouble(Double.MIN_VALUE);
        zzc.fromFloat(Float.MAX_VALUE);
        zzc.fromFloat(Float.MIN_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BigDecimal(BigInteger bigInteger, long j, DecimalMode decimalMode) {
        DecimalMode decimalMode2;
        DecimalMode decimalMode3;
        BigDecimal minus;
        if (decimalMode != null) {
            RoundingMode roundingMode = decimalMode.roundingMode;
            long j2 = decimalMode.scale;
            boolean z = decimalMode.usingScale;
            if (z) {
                if (z) {
                    int i = 4;
                    if (j >= 0) {
                        decimalMode3 = new DecimalMode(1 + j + j2, roundingMode, 4);
                    } else {
                        if (j >= 0) {
                            OptionalProvider$$ExternalSyntheticLambda0.m$1("Unexpected state");
                            throw null;
                        }
                        decimalMode3 = new DecimalMode(1 + j2, roundingMode, 4);
                    }
                    if (j >= 0) {
                        minus = zzc.roundSignificand(bigInteger, j, decimalMode3);
                    } else if (roundingMode == RoundingMode.ROUND_HALF_TO_EVEN) {
                        BigDecimal plus = new BigDecimal(bigInteger, j, i).plus(bigInteger.signum() * 2);
                        minus = zzc.roundSignificand(plus.significand, plus.exponent, decimalMode3).minus(bigInteger.signum() * 2);
                    } else {
                        BigDecimal plus2 = new BigDecimal(bigInteger, j, i).plus(bigInteger.signum());
                        minus = zzc.roundSignificand(plus2.significand, plus2.exponent, decimalMode3).minus(bigInteger.signum());
                    }
                } else {
                    minus = new BigDecimal(bigInteger, j, decimalMode, 0);
                }
                boolean isZero = minus.significand.isZero();
                BigInteger bigInteger2 = minus.significand;
                if (isZero) {
                    this.significand = bigInteger2;
                    long j3 = minus.exponent;
                    long j4 = decimalMode.decimalPrecision + j2;
                    this.exponent = j3 * j4;
                    this.precision = j4;
                    this.decimalMode = DecimalMode.copy$default(decimalMode, j4);
                } else {
                    this.significand = bigInteger2;
                    this.exponent = minus.exponent;
                    long numberOfDecimalDigits = bigInteger2.numberOfDecimalDigits();
                    this.precision = numberOfDecimalDigits;
                    this.decimalMode = DecimalMode.copy$default(decimalMode, numberOfDecimalDigits);
                }
                decimalMode2 = this.decimalMode;
                if (decimalMode2 != null || decimalMode2.roundingMode == null) {
                    RoundingMode roundingMode2 = RoundingMode.FLOOR;
                }
                this.usingScale = (decimalMode2 == null ? decimalMode2.scale : -1L) < 0;
            }
        }
        this.significand = bigInteger;
        this.precision = bigInteger.numberOfDecimalDigits();
        this.exponent = j;
        this.decimalMode = decimalMode;
        decimalMode2 = this.decimalMode;
        if (decimalMode2 != null) {
        }
        RoundingMode roundingMode22 = RoundingMode.FLOOR;
        this.usingScale = (decimalMode2 == null ? decimalMode2.scale : -1L) < 0;
    }

    public static Triple bringSignificandToSameExponent(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        BigInteger bigInteger = bigDecimal.significand;
        long numberOfDecimalDigits = bigInteger.numberOfDecimalDigits();
        long j = bigDecimal.exponent;
        int i = 4;
        BigDecimal bigDecimal3 = new BigDecimal(bigInteger, (j - numberOfDecimalDigits) + 1, i);
        long numberOfDecimalDigits2 = bigDecimal2.significand.numberOfDecimalDigits();
        long j2 = bigDecimal2.exponent;
        BigInteger bigInteger2 = bigDecimal2.significand;
        BigDecimal bigDecimal4 = new BigDecimal(bigInteger2, (j2 - numberOfDecimalDigits2) + 1, i);
        BigInteger bigInteger3 = bigDecimal3.significand;
        BigInteger bigInteger4 = bigDecimal4.significand;
        long j3 = bigDecimal3.exponent;
        long j4 = bigDecimal4.exponent;
        if (j > j2) {
            long j5 = j3 - j4;
            if (j5 >= 0) {
                BigInteger63Arithmetic bigInteger63Arithmetic = BigInteger.arithmetic;
                return new Triple(bigInteger3.times(zzd.fromInt(10).pow(j5)), bigInteger2, Long.valueOf(j4));
            }
            BigInteger63Arithmetic bigInteger63Arithmetic2 = BigInteger.arithmetic;
            return new Triple(bigInteger, bigInteger4.times(zzd.fromInt(10).pow(j5 * (-1))), Long.valueOf(j3));
        }
        if (j < j2) {
            long j6 = j4 - j3;
            if (j6 >= 0) {
                BigInteger63Arithmetic bigInteger63Arithmetic3 = BigInteger.arithmetic;
                return new Triple(bigInteger, bigInteger4.times(zzd.fromInt(10).pow(j6)), Long.valueOf(j3));
            }
            BigInteger63Arithmetic bigInteger63Arithmetic4 = BigInteger.arithmetic;
            return new Triple(bigInteger3.times(zzd.fromInt(10).pow(j6 * (-1))), bigInteger2, Long.valueOf(j3));
        }
        if (j != j2) {
            StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(j, "Invalid comparison state BigInteger: ", ", ");
            m1149m.append(j2);
            throw new RuntimeException(m1149m.toString());
        }
        long j7 = j3 - j4;
        if (j7 > 0) {
            BigInteger63Arithmetic bigInteger63Arithmetic5 = BigInteger.arithmetic;
            return new Triple(bigInteger.times(zzd.fromInt(10).pow(j7)), bigInteger2, Long.valueOf(j3));
        }
        if (j7 < 0) {
            BigInteger63Arithmetic bigInteger63Arithmetic6 = BigInteger.arithmetic;
            return new Triple(bigInteger, bigInteger2.times(zzd.fromInt(10).pow(j7 * (-1))), Long.valueOf(j3));
        }
        if (Intrinsics.compare(j7, 0L) == 0) {
            return new Triple(bigInteger, bigInteger2, Long.valueOf(j3));
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1(Recorder$$ExternalSyntheticOutline2.m(j7, "Invalid delta: "));
        return null;
    }

    public static String placeADotInString(int i, String str) {
        String m = Recorder$$ExternalSyntheticOutline2.m(StringsKt.substring(str, RangesKt___RangesKt.until(0, str.length() - i)), ".", StringsKt.substring(str, RangesKt___RangesKt.until(str.length() - i, str.length())));
        int length = m.length();
        do {
            length--;
            if (-1 >= length) {
                return "";
            }
        } while (m.charAt(length) == '0');
        return m.substring(0, length + 1);
    }

    public final int compare(BigDecimal bigDecimal) {
        bigDecimal.getClass();
        if (this.exponent == bigDecimal.exponent && this.precision == bigDecimal.precision) {
            return this.significand.compare(bigDecimal.significand);
        }
        Triple bringSignificandToSameExponent = bringSignificandToSameExponent(this, bigDecimal);
        return ((BigInteger) bringSignificandToSameExponent.first).compare((BigInteger) bringSignificandToSameExponent.second);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        obj.getClass();
        if (obj instanceof Number) {
            Platform[] platformArr = Platform.$VALUES;
        }
        if (obj instanceof BigDecimal) {
            return compare((BigDecimal) obj);
        }
        if (obj instanceof Long) {
            long longValue = ((Number) obj).longValue();
            BigInteger63Arithmetic bigInteger63Arithmetic = BigInteger.arithmetic;
            BigInteger fromLong = zzd.fromLong(longValue);
            return compare(new BigDecimal(fromLong, fromLong.numberOfDecimalDigits() - 1, (DecimalMode) null));
        }
        if (obj instanceof Integer) {
            return compare(zzc.fromInt(((Number) obj).intValue()));
        }
        if (obj instanceof Short) {
            short shortValue = ((Number) obj).shortValue();
            BigInteger63Arithmetic bigInteger63Arithmetic2 = BigInteger.arithmetic;
            BigInteger fromShort = zzd.fromShort(shortValue);
            return compare(new BigDecimal(fromShort, fromShort.numberOfDecimalDigits() - 1, (DecimalMode) null));
        }
        if (obj instanceof Byte) {
            byte byteValue = ((Number) obj).byteValue();
            BigInteger63Arithmetic bigInteger63Arithmetic3 = BigInteger.arithmetic;
            BigInteger fromByte = zzd.fromByte(byteValue);
            return compare(new BigDecimal(fromByte, fromByte.numberOfDecimalDigits() - 1, (DecimalMode) null));
        }
        if (obj instanceof Double) {
            return compare(zzc.fromDouble(((Number) obj).doubleValue()));
        }
        if (obj instanceof Float) {
            return compare(zzc.fromFloat(((Number) obj).floatValue()));
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1(Recorder$$ExternalSyntheticOutline2.m("Invalid comparison type for BigDecimal: ", Reflection.factory.getOrCreateKotlinClass(obj.getClass()).getSimpleName()));
        return 0;
    }

    public final DecimalMode computeMode(BigDecimal bigDecimal) {
        DecimalMode decimalMode;
        ScaleOps[] scaleOpsArr = ScaleOps.$VALUES;
        DecimalMode decimalMode2 = this.decimalMode;
        if (decimalMode2 == null || decimalMode2.isPrecisionUnlimited || (decimalMode = bigDecimal.decimalMode) == null || decimalMode.isPrecisionUnlimited) {
            return DecimalMode.DEFAULT;
        }
        return new DecimalMode(Math.max(decimalMode2.decimalPrecision, decimalMode.decimalPrecision), decimalMode2.roundingMode, (decimalMode2.usingScale && decimalMode.usingScale) ? Math.max(decimalMode2.scale, decimalMode.scale) : -1L);
    }

    public final boolean equals(Object obj) {
        int compare;
        if (obj instanceof BigDecimal) {
            compare = compare((BigDecimal) obj);
        } else if (obj instanceof Long) {
            long longValue = ((Number) obj).longValue();
            BigInteger63Arithmetic bigInteger63Arithmetic = BigInteger.arithmetic;
            BigInteger fromLong = zzd.fromLong(longValue);
            compare = compare(new BigDecimal(fromLong, fromLong.numberOfDecimalDigits() - 1, (DecimalMode) null));
        } else if (obj instanceof Integer) {
            compare = compare(zzc.fromInt(((Number) obj).intValue()));
        } else if (obj instanceof Short) {
            short shortValue = ((Number) obj).shortValue();
            BigInteger63Arithmetic bigInteger63Arithmetic2 = BigInteger.arithmetic;
            BigInteger fromShort = zzd.fromShort(shortValue);
            compare = compare(new BigDecimal(fromShort, fromShort.numberOfDecimalDigits() - 1, (DecimalMode) null));
        } else if (obj instanceof Byte) {
            byte byteValue = ((Number) obj).byteValue();
            BigInteger63Arithmetic bigInteger63Arithmetic3 = BigInteger.arithmetic;
            BigInteger fromByte = zzd.fromByte(byteValue);
            compare = compare(new BigDecimal(fromByte, fromByte.numberOfDecimalDigits() - 1, (DecimalMode) null));
        } else {
            compare = obj instanceof Double ? compare(zzc.fromDouble(((Number) obj).doubleValue())) : obj instanceof Float ? compare(zzc.fromFloat(((Number) obj).floatValue())) : -1;
        }
        return compare == 0;
    }

    public final int hashCode() {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = this.significand;
        if (bigInteger3.isZero()) {
            return 0;
        }
        boolean isZero = bigInteger3.isZero();
        long j = this.exponent;
        if (!isZero) {
            BigInteger.QuotientAndRemainder quotientAndRemainder = new BigInteger.QuotientAndRemainder(bigInteger3, BigInteger.ZERO);
            do {
                quotientAndRemainder = quotientAndRemainder.quotient.divrem(BigInteger.TEN);
                bigInteger = quotientAndRemainder.remainder;
                bigInteger2 = BigInteger.ZERO;
                if (Intrinsics.areEqual(bigInteger, bigInteger2)) {
                    bigInteger3 = quotientAndRemainder.quotient;
                }
            } while (Intrinsics.areEqual(bigInteger, bigInteger2));
            this = new BigDecimal(bigInteger3, j, 4);
        }
        return Long.hashCode(j) + this.significand.hashCode();
    }

    public final BigDecimal minus(int i) {
        BigDecimal fromInt = zzc.fromInt(i);
        ScaleOps[] scaleOpsArr = ScaleOps.$VALUES;
        return subtract(fromInt, computeMode(fromInt));
    }

    public final BigDecimal plus(int i) {
        BigDecimal fromInt = zzc.fromInt(i);
        ScaleOps[] scaleOpsArr = ScaleOps.$VALUES;
        DecimalMode computeMode = computeMode(fromInt);
        DecimalMode decimalMode = fromInt.decimalMode;
        long j = fromInt.exponent;
        DecimalMode access$resolveDecimalMode = zzc.access$resolveDecimalMode(this.decimalMode, decimalMode, computeMode);
        BigInteger bigInteger = this.significand;
        boolean isZero = bigInteger.isZero();
        BigInteger bigInteger2 = fromInt.significand;
        if (isZero) {
            return zzc.access$roundOrDont(bigInteger2, j, access$resolveDecimalMode);
        }
        boolean isZero2 = bigInteger2.isZero();
        long j2 = this.exponent;
        if (isZero2) {
            return zzc.access$roundOrDont(bigInteger, j2, access$resolveDecimalMode);
        }
        Triple bringSignificandToSameExponent = bringSignificandToSameExponent(this, fromInt);
        BigInteger bigInteger3 = (BigInteger) bringSignificandToSameExponent.first;
        BigInteger bigInteger4 = (BigInteger) bringSignificandToSameExponent.second;
        long numberOfDecimalDigits = bigInteger3.numberOfDecimalDigits();
        long numberOfDecimalDigits2 = bigInteger4.numberOfDecimalDigits();
        BigInteger plus = bigInteger3.plus(bigInteger4);
        long numberOfDecimalDigits3 = plus.numberOfDecimalDigits();
        if (numberOfDecimalDigits <= numberOfDecimalDigits2) {
            numberOfDecimalDigits = numberOfDecimalDigits2;
        }
        long max = Math.max(j2, j) + (numberOfDecimalDigits3 - numberOfDecimalDigits);
        return access$resolveDecimalMode.usingScale ? zzc.access$roundOrDont(plus, max, DecimalMode.copy$default(access$resolveDecimalMode, numberOfDecimalDigits3)) : zzc.access$roundOrDont(plus, max, access$resolveDecimalMode);
    }

    public final BigDecimal roundSignificand(DecimalMode decimalMode) {
        return decimalMode == null ? this : zzc.roundSignificand(this.significand, this.exponent, decimalMode);
    }

    public final BigDecimal roundToDigitPosition(long j, RoundingMode roundingMode) {
        BigDecimal minus;
        if (j == 0) {
            Mod$$ExternalSyntheticBUOutline0.m$2("Rounding to 0 position is not supported");
            return null;
        }
        int i = 4;
        if (this.exponent >= 0) {
            minus = roundSignificand(new DecimalMode(j, roundingMode, 4));
        } else {
            RoundingMode roundingMode2 = RoundingMode.ROUND_HALF_TO_EVEN;
            BigInteger bigInteger = this.significand;
            minus = roundingMode == roundingMode2 ? plus(bigInteger.signum() * 2).roundSignificand(new DecimalMode(j, roundingMode, 4)).minus(bigInteger.signum() * 2) : plus(bigInteger.signum()).roundSignificand(new DecimalMode(j, roundingMode, 4)).minus(bigInteger.signum());
        }
        long j2 = minus.exponent;
        BigInteger bigInteger2 = minus.significand;
        DecimalMode decimalMode = this.decimalMode;
        return decimalMode == null ? new BigDecimal(bigInteger2, j2, i) : new BigDecimal(bigInteger2, j2, decimalMode);
    }

    public final BigDecimal subtract(BigDecimal bigDecimal, DecimalMode decimalMode) {
        bigDecimal.getClass();
        DecimalMode decimalMode2 = bigDecimal.decimalMode;
        long j = bigDecimal.exponent;
        DecimalMode access$resolveDecimalMode = zzc.access$resolveDecimalMode(this.decimalMode, decimalMode2, decimalMode);
        BigInteger bigInteger = this.significand;
        boolean isZero = bigInteger.isZero();
        BigInteger bigInteger2 = bigDecimal.significand;
        if (isZero) {
            return zzc.access$roundOrDont(bigInteger2.negate(), j, access$resolveDecimalMode);
        }
        boolean isZero2 = bigInteger2.isZero();
        long j2 = this.exponent;
        if (isZero2) {
            return zzc.access$roundOrDont(bigInteger, j2, access$resolveDecimalMode);
        }
        Triple bringSignificandToSameExponent = bringSignificandToSameExponent(this, bigDecimal);
        BigInteger bigInteger3 = (BigInteger) bringSignificandToSameExponent.first;
        BigInteger bigInteger4 = (BigInteger) bringSignificandToSameExponent.second;
        long numberOfDecimalDigits = bigInteger3.numberOfDecimalDigits();
        long numberOfDecimalDigits2 = bigInteger4.numberOfDecimalDigits();
        BigInteger minus = bigInteger3.minus(bigInteger4);
        long numberOfDecimalDigits3 = minus.numberOfDecimalDigits();
        if (numberOfDecimalDigits <= numberOfDecimalDigits2) {
            numberOfDecimalDigits = numberOfDecimalDigits2;
        }
        long max = Math.max(j2, j) + (numberOfDecimalDigits3 - numberOfDecimalDigits);
        return this.usingScale ? zzc.access$roundOrDont(minus, max, DecimalMode.copy$default(access$resolveDecimalMode, numberOfDecimalDigits3)) : zzc.access$roundOrDont(minus, max, access$resolveDecimalMode);
    }

    public final BigInteger toBigInteger() {
        long j = this.exponent;
        if (j < 0) {
            return BigInteger.ZERO;
        }
        long j2 = j - this.precision;
        BigInteger bigInteger = this.significand;
        if (j2 > 0) {
            BigInteger63Arithmetic bigInteger63Arithmetic = BigInteger.arithmetic;
            return bigInteger.times(zzd.fromInt(10).pow(j2 + 1));
        }
        if (j2 >= 0) {
            bigInteger.getClass();
            BigInteger63Arithmetic bigInteger63Arithmetic2 = BigInteger.arithmetic;
            return (BigInteger) bigInteger.multiply(zzd.fromInt(10));
        }
        BigInteger63Arithmetic bigInteger63Arithmetic3 = BigInteger.arithmetic;
        BigInteger pow = zzd.fromInt(10).pow(Math.abs(j2) - 1);
        bigInteger.getClass();
        pow.getClass();
        return (BigInteger) bigInteger.divide(pow);
    }

    public final String toString() {
        String str;
        BigInteger bigInteger = this.significand;
        String string$1 = bigInteger.toString$1();
        int i = bigInteger.compareTo(0) < 0 ? 2 : 1;
        String string$12 = bigInteger.toString$1();
        int length = string$12.length() - 1;
        while (true) {
            if (-1 >= length) {
                str = "";
                break;
            }
            if (string$12.charAt(length) != '0') {
                str = string$12.substring(0, length + 1);
                break;
            }
            length--;
        }
        String str2 = str.length() <= 1 ? "0" : "";
        long j = this.exponent;
        if (j > 0) {
            return placeADotInString(string$1.length() - i, string$1) + str2 + "E+" + j;
        }
        if (j >= 0) {
            if (j == 0) {
                return placeADotInString(string$1.length() - i, string$1).concat(str2);
            }
            OptionalProvider$$ExternalSyntheticLambda0.m$1("Invalid state, please report a bug (Integer compareTo invalid)");
            return null;
        }
        return placeADotInString(string$1.length() - i, string$1) + str2 + "E" + j;
    }

    public /* synthetic */ BigDecimal(BigInteger bigInteger, long j, int i) {
        this(bigInteger, (i & 2) != 0 ? 0L : j, (DecimalMode) null);
    }

    public /* synthetic */ BigDecimal(BigInteger bigInteger, long j, DecimalMode decimalMode, int i) {
        this(bigInteger, j, decimalMode);
    }
}
