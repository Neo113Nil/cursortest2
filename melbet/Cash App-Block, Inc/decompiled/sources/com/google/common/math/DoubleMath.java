package com.google.common.math;

import androidx.tracing.Trace;
import io.noties.markwon.utils.ColorUtils;
import java.math.RoundingMode;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public abstract class DoubleMath {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* renamed from: com.google.common.math.DoubleMath$1, reason: invalid class name */
    public abstract /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            $SwitchMap$java$math$RoundingMode = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        Math.log(2.0d);
    }

    public static boolean isMathematicalInteger(double d) {
        if (DoubleUtils.isFinite(d)) {
            return d == 0.0d || 52 - Long.numberOfTrailingZeros(DoubleUtils.getSignificand(d)) <= Math.getExponent(d);
        }
        return false;
    }

    public static boolean isPowerOfTwo(double d) {
        if (d > 0.0d && DoubleUtils.isFinite(d)) {
            long significand = DoubleUtils.getSignificand(d);
            if ((significand & (significand - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int log2(double d) {
        boolean isPowerOfTwo;
        RoundingMode roundingMode = RoundingMode.CEILING;
        Trace.checkArgument("x must be positive and finite", d > 0.0d && DoubleUtils.isFinite(d));
        int exponent = Math.getExponent(d);
        if (Math.getExponent(d) < -1022) {
            return log2(d * 4.503599627370496E15d) - 52;
        }
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                ColorUtils.checkRoundingUnnecessary(isPowerOfTwo(d));
                return !r2 ? exponent + 1 : exponent;
            case 2:
                if (!r2) {
                }
                break;
            case 3:
                r2 = !isPowerOfTwo(d);
                if (!r2) {
                }
                break;
            case 4:
                r2 = exponent < 0;
                isPowerOfTwo = isPowerOfTwo(d);
                r2 &= !isPowerOfTwo;
                if (!r2) {
                }
                break;
            case 5:
                r2 = exponent >= 0;
                isPowerOfTwo = isPowerOfTwo(d);
                r2 &= !isPowerOfTwo;
                if (!r2) {
                }
                break;
            case 6:
            case 7:
            case 8:
                double longBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d) & 4503599627370495L) | 4607182418800017408L);
                if (longBitsToDouble * longBitsToDouble > 2.0d) {
                    r2 = true;
                }
                if (!r2) {
                }
                break;
            default:
                Path$$ExternalSyntheticBUOutline0.m$2();
                return 0;
        }
    }
}
