package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class RoundedCorner {
    public long center;
    public final float cornerRadius;
    public final long d1;
    public final long d2;
    public final float expectedRoundCut;
    public final long p0;
    public final long p1;
    public final long p2;
    public final float smoothing;

    public RoundedCorner(long j, long j2, long j3, CornerRounding cornerRounding) {
        this.p0 = j;
        this.p1 = j2;
        this.p2 = j3;
        long m1135minusybeJwSQ = PointKt.m1135minusybeJwSQ(j, j2);
        long m1135minusybeJwSQ2 = PointKt.m1135minusybeJwSQ(j3, j2);
        float m1132getDistanceDnnuFBc = PointKt.m1132getDistanceDnnuFBc(m1135minusybeJwSQ);
        float m1132getDistanceDnnuFBc2 = PointKt.m1132getDistanceDnnuFBc(m1135minusybeJwSQ2);
        if (m1132getDistanceDnnuFBc <= RecyclerView.DECELERATION_RATE || m1132getDistanceDnnuFBc2 <= RecyclerView.DECELERATION_RATE) {
            this.d1 = FloatFloatPair.m127constructorimpl(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
            this.d2 = FloatFloatPair.m127constructorimpl(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
            this.cornerRadius = RecyclerView.DECELERATION_RATE;
            this.smoothing = RecyclerView.DECELERATION_RATE;
            this.expectedRoundCut = RecyclerView.DECELERATION_RATE;
        } else {
            long m1130divso9K2fw = PointKt.m1130divso9K2fw(m1135minusybeJwSQ, m1132getDistanceDnnuFBc);
            this.d1 = m1130divso9K2fw;
            long m1130divso9K2fw2 = PointKt.m1130divso9K2fw(m1135minusybeJwSQ2, m1132getDistanceDnnuFBc2);
            this.d2 = m1130divso9K2fw2;
            float f = cornerRounding.radius;
            this.cornerRadius = f;
            this.smoothing = cornerRounding.smoothing;
            float m1131dotProductybeJwSQ = PointKt.m1131dotProductybeJwSQ(m1130divso9K2fw, m1130divso9K2fw2);
            int i = Utils.$r8$clinit;
            float sqrt = (float) Math.sqrt(1.0f - (m1131dotProductybeJwSQ * m1131dotProductybeJwSQ));
            this.expectedRoundCut = ((double) sqrt) > 0.001d ? ((m1131dotProductybeJwSQ + 1.0f) * f) / sqrt : 0.0f;
        }
        this.center = FloatFloatPair.m127constructorimpl(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
    }

    /* renamed from: computeFlankingCurve-oAJzIJU, reason: not valid java name */
    public static Cubic m1138computeFlankingCurveoAJzIJU(float f, float f2, long j, long j2, long j3, long j4, long j5, float f3) {
        long m1135minusybeJwSQ = PointKt.m1135minusybeJwSQ(j2, j);
        float m1132getDistanceDnnuFBc = PointKt.m1132getDistanceDnnuFBc(m1135minusybeJwSQ);
        FloatFloatPair floatFloatPair = null;
        if (m1132getDistanceDnnuFBc <= RecyclerView.DECELERATION_RATE) {
            a$$ExternalSyntheticBUOutline0.m$3("Can't get the direction of a 0-length vector");
            return null;
        }
        long m1130divso9K2fw = PointKt.m1130divso9K2fw(m1135minusybeJwSQ, m1132getDistanceDnnuFBc);
        long m1136plusybeJwSQ = PointKt.m1136plusybeJwSQ(j, PointKt.m1137timesso9K2fw(PointKt.m1137timesso9K2fw(m1130divso9K2fw, f), 1.0f + f2));
        long m1130divso9K2fw2 = PointKt.m1130divso9K2fw(PointKt.m1136plusybeJwSQ(j3, j4), 2.0f);
        long m127constructorimpl = FloatFloatPair.m127constructorimpl(Utils.interpolate(PointKt.m1133getXDnnuFBc(j3), PointKt.m1133getXDnnuFBc(m1130divso9K2fw2), f2), Utils.interpolate(PointKt.m1134getYDnnuFBc(j3), PointKt.m1134getYDnnuFBc(m1130divso9K2fw2), f2));
        long m1136plusybeJwSQ2 = PointKt.m1136plusybeJwSQ(j5, PointKt.m1137timesso9K2fw(Utils.directionVector(PointKt.m1133getXDnnuFBc(m127constructorimpl) - PointKt.m1133getXDnnuFBc(j5), PointKt.m1134getYDnnuFBc(m127constructorimpl) - PointKt.m1134getYDnnuFBc(j5)), f3));
        long m1135minusybeJwSQ2 = PointKt.m1135minusybeJwSQ(m1136plusybeJwSQ2, j5);
        long m127constructorimpl2 = FloatFloatPair.m127constructorimpl(-PointKt.m1134getYDnnuFBc(m1135minusybeJwSQ2), PointKt.m1133getXDnnuFBc(m1135minusybeJwSQ2));
        long m127constructorimpl3 = FloatFloatPair.m127constructorimpl(-PointKt.m1134getYDnnuFBc(m127constructorimpl2), PointKt.m1133getXDnnuFBc(m127constructorimpl2));
        float m1131dotProductybeJwSQ = PointKt.m1131dotProductybeJwSQ(m1130divso9K2fw, m127constructorimpl3);
        if (Math.abs(m1131dotProductybeJwSQ) >= 1.0E-4f) {
            float m1131dotProductybeJwSQ2 = PointKt.m1131dotProductybeJwSQ(PointKt.m1135minusybeJwSQ(m1136plusybeJwSQ2, j2), m127constructorimpl3);
            if (Math.abs(m1131dotProductybeJwSQ) >= Math.abs(m1131dotProductybeJwSQ2) * 1.0E-4f) {
                floatFloatPair = new FloatFloatPair(PointKt.m1136plusybeJwSQ(j2, PointKt.m1137timesso9K2fw(m1130divso9K2fw, m1131dotProductybeJwSQ2 / m1131dotProductybeJwSQ)));
            }
        }
        long j6 = floatFloatPair != null ? floatFloatPair.packedValue : j3;
        long m1130divso9K2fw3 = PointKt.m1130divso9K2fw(PointKt.m1136plusybeJwSQ(m1136plusybeJwSQ, PointKt.m1137timesso9K2fw(j6, 2.0f)), 3.0f);
        return new Cubic(new float[]{PointKt.m1133getXDnnuFBc(m1136plusybeJwSQ), PointKt.m1134getYDnnuFBc(m1136plusybeJwSQ), PointKt.m1133getXDnnuFBc(m1130divso9K2fw3), PointKt.m1134getYDnnuFBc(m1130divso9K2fw3), PointKt.m1133getXDnnuFBc(j6), PointKt.m1134getYDnnuFBc(j6), PointKt.m1133getXDnnuFBc(m1136plusybeJwSQ2), PointKt.m1134getYDnnuFBc(m1136plusybeJwSQ2)});
    }

    public final float calculateActualSmoothingValue(float f) {
        float expectedCut = getExpectedCut();
        float f2 = this.smoothing;
        if (f > expectedCut) {
            return f2;
        }
        float f3 = this.expectedRoundCut;
        return f > f3 ? ((f - f3) * f2) / (getExpectedCut() - f3) : RecyclerView.DECELERATION_RATE;
    }

    public final float getExpectedCut() {
        return (1.0f + this.smoothing) * this.expectedRoundCut;
    }
}
