package androidx.compose.animation;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes3.dex */
public abstract class AndroidFlingSpline {
    public static final float[] SplinePositions;

    public final class FlingResult {
        public final float distanceCoefficient;
        public final float velocityCoefficient;

        public FlingResult(float f, float f2) {
            this.distanceCoefficient = f;
            this.velocityCoefficient = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlingResult)) {
                return false;
            }
            FlingResult flingResult = (FlingResult) obj;
            return Float.compare(this.distanceCoefficient, flingResult.distanceCoefficient) == 0 && Float.compare(this.velocityCoefficient, flingResult.velocityCoefficient) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.velocityCoefficient) + (Float.hashCode(this.distanceCoefficient) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
            sb.append(this.distanceCoefficient);
            sb.append(", velocityCoefficient=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.velocityCoefficient, ')');
        }
    }

    static {
        float f;
        float m;
        float f2;
        float f3;
        float f4;
        float f5;
        float m2;
        float f6;
        float f7;
        float f8;
        float[] fArr = new float[101];
        SplinePositions = fArr;
        float[] fArr2 = new float[101];
        float f9 = RecyclerView.DECELERATION_RATE;
        int i = 0;
        float f10 = 0.0f;
        while (true) {
            float f11 = 1.0f;
            if (i >= 100) {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
            float f12 = i / 100.0f;
            float f13 = 1.0f;
            while (true) {
                f = 2.0f;
                m = Recorder$$ExternalSyntheticOutline2.m(f13, f9, 2.0f, f9);
                f2 = f11 - m;
                f3 = m * 3.0f * f2;
                f4 = m * m * m;
                float m$1 = Recorder$$ExternalSyntheticOutline2.m$1(m, 0.35000002f, f2 * 0.175f, f3) + f4;
                f5 = f11;
                if (Math.abs(m$1 - f12) < 1.0E-5d) {
                    break;
                }
                if (m$1 > f12) {
                    f13 = m;
                } else {
                    f9 = m;
                }
                f11 = f5;
            }
            float f14 = 0.5f;
            fArr[i] = (((f2 * 0.5f) + m) * f3) + f4;
            float f15 = f5;
            while (true) {
                m2 = Recorder$$ExternalSyntheticOutline2.m(f15, f10, f, f10);
                f6 = f5 - m2;
                f7 = m2 * 3.0f * f6;
                f8 = m2 * m2 * m2;
                float m$12 = Recorder$$ExternalSyntheticOutline2.m$1(f6, f14, m2, f7) + f8;
                if (Math.abs(m$12 - f12) >= 1.0E-5d) {
                    if (m$12 > f12) {
                        f15 = m2;
                    } else {
                        f10 = m2;
                    }
                    f14 = 0.5f;
                    f = 2.0f;
                }
            }
            fArr2[i] = (((m2 * 0.35000002f) + (f6 * 0.175f)) * f7) + f8;
            i++;
        }
    }

    public static double deceleration(float f, float f2) {
        return Math.log((Math.abs(f) * 0.35f) / f2);
    }

    public static FlingResult flingPosition(float f) {
        float f2 = RecyclerView.DECELERATION_RATE;
        float f3 = 1.0f;
        float coerceIn = RangesKt___RangesKt.coerceIn(f, RecyclerView.DECELERATION_RATE, 1.0f);
        int i = (int) (100.0f * coerceIn);
        if (i < 100) {
            float f4 = i / 100.0f;
            int i2 = i + 1;
            float[] fArr = SplinePositions;
            float f5 = fArr[i];
            float f6 = (fArr[i2] - f5) / ((i2 / 100.0f) - f4);
            float m = CameraState$Type$EnumUnboxingLocalUtility.m(coerceIn, f4, f6, f5);
            f2 = f6;
            f3 = m;
        }
        return new FlingResult(f3, f2);
    }
}
