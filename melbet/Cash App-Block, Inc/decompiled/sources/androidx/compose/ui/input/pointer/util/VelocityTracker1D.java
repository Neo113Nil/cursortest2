package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.bitcoin.views.send.MoveBitcoinViewKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class VelocityTracker1D {
    public int index;
    public final boolean isDataDifferential;
    public final int minSampleSize;
    public final float[] reusableDataPointsArray;
    public final float[] reusableTimeArray;
    public final float[] reusableVelocityCoefficients;
    public final DataPointAtTime[] samples;
    public final Strategy strategy;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Strategy {
        public static final /* synthetic */ Strategy[] $VALUES;
        public static final Strategy Impulse;
        public static final Strategy Lsq2;

        static {
            Strategy strategy = new Strategy("Lsq2", 0);
            Lsq2 = strategy;
            Strategy strategy2 = new Strategy("Impulse", 1);
            Impulse = strategy2;
            $VALUES = new Strategy[]{strategy, strategy2};
        }

        public static Strategy valueOf(String str) {
            return (Strategy) Enum.valueOf(Strategy.class, str);
        }

        public static Strategy[] values() {
            return (Strategy[]) $VALUES.clone();
        }
    }

    public VelocityTracker1D(boolean z, Strategy strategy) {
        int i;
        this.isDataDifferential = z;
        this.strategy = strategy;
        if (z && strategy.equals(Strategy.Lsq2)) {
            a$$ExternalSyntheticBUOutline0.m$1("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int ordinal = strategy.ordinal();
        if (ordinal == 0) {
            i = 3;
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                throw null;
            }
            i = 2;
        }
        this.minSampleSize = i;
        this.samples = new DataPointAtTime[20];
        this.reusableDataPointsArray = new float[20];
        this.reusableTimeArray = new float[20];
        this.reusableVelocityCoefficients = new float[3];
    }

    public final void addDataPoint(long j, float f) {
        int i = (this.index + 1) % 20;
        this.index = i;
        DataPointAtTime[] dataPointAtTimeArr = this.samples;
        DataPointAtTime dataPointAtTime = dataPointAtTimeArr[i];
        if (dataPointAtTime != null) {
            dataPointAtTime.time = j;
            dataPointAtTime.dataPoint = f;
        } else {
            DataPointAtTime dataPointAtTime2 = new DataPointAtTime();
            dataPointAtTime2.time = j;
            dataPointAtTime2.dataPoint = f;
            dataPointAtTimeArr[i] = dataPointAtTime2;
        }
    }

    public final float calculateVelocity(float f) {
        Strategy strategy;
        float[] fArr;
        float[] fArr2;
        float f2;
        boolean z;
        int i;
        float f3;
        float f4;
        float f5 = RecyclerView.DECELERATION_RATE;
        if (f <= RecyclerView.DECELERATION_RATE) {
            InlineClassHelperKt.throwIllegalStateException("maximumVelocity should be a positive value. You specified=" + f);
        }
        int i2 = this.index;
        DataPointAtTime[] dataPointAtTimeArr = this.samples;
        DataPointAtTime dataPointAtTime = dataPointAtTimeArr[i2];
        if (dataPointAtTime == null) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            int i3 = 0;
            DataPointAtTime dataPointAtTime2 = dataPointAtTime;
            while (true) {
                DataPointAtTime dataPointAtTime3 = dataPointAtTimeArr[i2];
                boolean z2 = this.isDataDifferential;
                strategy = this.strategy;
                fArr = this.reusableDataPointsArray;
                fArr2 = this.reusableTimeArray;
                if (dataPointAtTime3 != null) {
                    long j = dataPointAtTime.time;
                    f2 = f5;
                    int i4 = i2;
                    long j2 = dataPointAtTime3.time;
                    float f6 = j - j2;
                    z = z2;
                    i = 1;
                    float abs = Math.abs(j2 - dataPointAtTime2.time);
                    dataPointAtTime2 = (strategy == Strategy.Lsq2 || z) ? dataPointAtTime3 : dataPointAtTime;
                    if (f6 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    fArr[i3] = dataPointAtTime3.dataPoint;
                    fArr2[i3] = -f6;
                    i2 = (i4 == 0 ? 20 : i4) - 1;
                    i3++;
                    if (i3 >= 20) {
                        break;
                    }
                    f5 = f2;
                } else {
                    f2 = f5;
                    z = z2;
                    i = 1;
                    break;
                }
            }
            if (i3 >= this.minSampleSize) {
                int ordinal = strategy.ordinal();
                if (ordinal == 0) {
                    try {
                        float[] fArr3 = this.reusableVelocityCoefficients;
                        MoveBitcoinViewKt.polyFitLeastSquares(fArr2, fArr, i3, fArr3);
                        f4 = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        f4 = f2;
                    }
                } else {
                    if (ordinal != i) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return f2;
                    }
                    int i5 = i3 - i;
                    float f7 = fArr2[i5];
                    int i6 = i5;
                    float f8 = f2;
                    while (i6 > 0) {
                        int i7 = i6 - 1;
                        float f9 = fArr2[i7];
                        if (f7 != f9) {
                            float f10 = (z ? -fArr[i7] : fArr[i6] - fArr[i7]) / (f7 - f9);
                            f8 += Math.abs(f10) * (f10 - (Math.signum(f8) * ((float) Math.sqrt(Math.abs(f8) * 2.0f))));
                            if (i6 == i5) {
                                f8 *= 0.5f;
                            }
                        }
                        i6--;
                        f7 = f9;
                    }
                    f4 = Math.signum(f8) * ((float) Math.sqrt(Math.abs(f8) * 2.0f));
                }
                f3 = f4 * 1000.0f;
            } else {
                f3 = f2;
            }
        }
        if (f3 == f2 || Float.isNaN(f3)) {
            return f2;
        }
        if (f3 <= f2) {
            float f11 = -f;
            if (f3 < f11) {
                return f11;
            }
        } else if (f3 > f) {
            f3 = f;
        }
        return f3;
    }

    public /* synthetic */ VelocityTracker1D() {
        this(false, Strategy.Lsq2);
    }

    public VelocityTracker1D(int i) {
        this(true, Strategy.Impulse);
    }
}
