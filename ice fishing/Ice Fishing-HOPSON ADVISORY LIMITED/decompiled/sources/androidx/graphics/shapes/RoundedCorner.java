package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: RoundedPolygon.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B5\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0006\u001a\u00060\u0003j\u0002`\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u0011H\u0002Jf\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00112\n\u0010-\u001a\u00060\u0003j\u0002`\u00042\n\u0010.\u001a\u00060\u0003j\u0002`\u00042\n\u0010/\u001a\u00060\u0003j\u0002`\u00042\n\u00100\u001a\u00060\u0003j\u0002`\u00042\n\u00101\u001a\u00060\u0003j\u0002`\u00042\u0006\u00102\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b3\u00104J \u00105\u001a\b\u0012\u0004\u0012\u00020*062\u0006\u00107\u001a\u00020\u00112\b\b\u0002\u00108\u001a\u00020\u0011H\u0007JJ\u00109\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\n\u0010:\u001a\u00060\u0003j\u0002`\u00042\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\n\u0010\u0016\u001a\u00060\u0003j\u0002`\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b;\u0010<R&\u0010\n\u001a\u00060\u0003j\u0002`\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001d\u0010\u0016\u001a\u00060\u0003j\u0002`\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0017\u0010\fR\u001d\u0010\u0018\u001a\u00060\u0003j\u0002`\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0019\u0010\fR\u0011\u0010\u001a\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\u001c\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u001d\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u001e\u0010\fR\u001d\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u001f\u0010\fR\u001d\u0010\u0006\u001a\u00060\u0003j\u0002`\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b \u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0013R\u0011\u0010%\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006="}, d2 = {"Landroidx/graphics/shapes/RoundedCorner;", "", "p0", "Landroidx/collection/FloatFloatPair;", "Landroidx/graphics/shapes/Point;", "p1", "p2", "rounding", "Landroidx/graphics/shapes/CornerRounding;", "(JJJLandroidx/graphics/shapes/CornerRounding;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "center", "getCenter-1ufDz9w", "()J", "setCenter-DnnuFBc", "(J)V", "J", "cornerRadius", "", "getCornerRadius", "()F", "cosAngle", "getCosAngle", "d1", "getD1-1ufDz9w", "d2", "getD2-1ufDz9w", "expectedCut", "getExpectedCut", "expectedRoundCut", "getExpectedRoundCut", "getP0-1ufDz9w", "getP1-1ufDz9w", "getP2-1ufDz9w", "getRounding", "()Landroidx/graphics/shapes/CornerRounding;", "sinAngle", "getSinAngle", "smoothing", "getSmoothing", "calculateActualSmoothingValue", "allowedCut", "computeFlankingCurve", "Landroidx/graphics/shapes/Cubic;", "actualRoundCut", "actualSmoothingValues", "corner", "sideStart", "circleSegmentIntersection", "otherCircleSegmentIntersection", "circleCenter", "actualR", "computeFlankingCurve-oAJzIJU", "(FFJJJJJF)Landroidx/graphics/shapes/Cubic;", "getCubics", "", "allowedCut0", "allowedCut1", "lineIntersection", "d0", "lineIntersection-CBFvKDc", "(JJJJ)Landroidx/collection/FloatFloatPair;", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class RoundedCorner {
    private long center;
    private final float cornerRadius;
    private final float cosAngle;
    private final long d1;
    private final long d2;
    private final float expectedRoundCut;
    private final long p0;
    private final long p1;
    private final long p2;
    private final CornerRounding rounding;
    private final float sinAngle;
    private final float smoothing;

    public /* synthetic */ RoundedCorner(long j, long j2, long j3, CornerRounding cornerRounding, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, cornerRounding);
    }

    public final List<Cubic> getCubics(float f) {
        return getCubics$default(this, f, 0.0f, 2, null);
    }

    private RoundedCorner(long j, long j2, long j3, CornerRounding cornerRounding) {
        this.p0 = j;
        this.p1 = j2;
        this.p2 = j3;
        this.rounding = cornerRounding;
        long m99getDirectionDnnuFBc = PointKt.m99getDirectionDnnuFBc(PointKt.m105minusybeJwSQ(j, j2));
        this.d1 = m99getDirectionDnnuFBc;
        long m99getDirectionDnnuFBc2 = PointKt.m99getDirectionDnnuFBc(PointKt.m105minusybeJwSQ(j3, j2));
        this.d2 = m99getDirectionDnnuFBc2;
        float radius = cornerRounding != null ? cornerRounding.getRadius() : 0.0f;
        this.cornerRadius = radius;
        this.smoothing = cornerRounding != null ? cornerRounding.getSmoothing() : 0.0f;
        float m98dotProductybeJwSQ = PointKt.m98dotProductybeJwSQ(m99getDirectionDnnuFBc, m99getDirectionDnnuFBc2);
        this.cosAngle = m98dotProductybeJwSQ;
        float f = 1;
        float sqrt = (float) Math.sqrt(f - Utils.square(m98dotProductybeJwSQ));
        this.sinAngle = sqrt;
        this.expectedRoundCut = ((double) sqrt) > 0.001d ? (radius * (m98dotProductybeJwSQ + f)) / sqrt : 0.0f;
        this.center = FloatFloatPair.m10constructorimpl(0.0f, 0.0f);
    }

    public /* synthetic */ RoundedCorner(long j, long j2, long j3, CornerRounding cornerRounding, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, (i & 8) != 0 ? null : cornerRounding, null);
    }

    /* renamed from: getP0-1ufDz9w, reason: not valid java name and from getter */
    public final long getP0() {
        return this.p0;
    }

    /* renamed from: getP1-1ufDz9w, reason: not valid java name and from getter */
    public final long getP1() {
        return this.p1;
    }

    /* renamed from: getP2-1ufDz9w, reason: not valid java name and from getter */
    public final long getP2() {
        return this.p2;
    }

    public final CornerRounding getRounding() {
        return this.rounding;
    }

    /* renamed from: getD1-1ufDz9w, reason: not valid java name and from getter */
    public final long getD1() {
        return this.d1;
    }

    /* renamed from: getD2-1ufDz9w, reason: not valid java name and from getter */
    public final long getD2() {
        return this.d2;
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public final float getSmoothing() {
        return this.smoothing;
    }

    public final float getCosAngle() {
        return this.cosAngle;
    }

    public final float getSinAngle() {
        return this.sinAngle;
    }

    public final float getExpectedRoundCut() {
        return this.expectedRoundCut;
    }

    public final float getExpectedCut() {
        return (1 + this.smoothing) * this.expectedRoundCut;
    }

    /* renamed from: getCenter-1ufDz9w, reason: not valid java name and from getter */
    public final long getCenter() {
        return this.center;
    }

    /* renamed from: setCenter-DnnuFBc, reason: not valid java name */
    public final void m120setCenterDnnuFBc(long j) {
        this.center = j;
    }

    public static /* synthetic */ List getCubics$default(RoundedCorner roundedCorner, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        return roundedCorner.getCubics(f, f2);
    }

    public final List<Cubic> getCubics(float allowedCut0, float allowedCut1) {
        float min = Math.min(allowedCut0, allowedCut1);
        float f = this.expectedRoundCut;
        if (f < 1.0E-4f || min < 1.0E-4f || this.cornerRadius < 1.0E-4f) {
            this.center = this.p1;
            return CollectionsKt.listOf(Cubic.INSTANCE.straightLine(PointKt.m102getXDnnuFBc(this.p1), PointKt.m103getYDnnuFBc(this.p1), PointKt.m102getXDnnuFBc(this.p1), PointKt.m103getYDnnuFBc(this.p1)));
        }
        float min2 = Math.min(min, f);
        float calculateActualSmoothingValue = calculateActualSmoothingValue(allowedCut0);
        float calculateActualSmoothingValue2 = calculateActualSmoothingValue(allowedCut1);
        float f2 = (this.cornerRadius * min2) / this.expectedRoundCut;
        this.center = PointKt.m106plusybeJwSQ(this.p1, PointKt.m108timesso9K2fw(PointKt.m99getDirectionDnnuFBc(PointKt.m96divso9K2fw(PointKt.m106plusybeJwSQ(this.d1, this.d2), 2.0f)), (float) Math.sqrt(Utils.square(f2) + Utils.square(min2))));
        long m106plusybeJwSQ = PointKt.m106plusybeJwSQ(this.p1, PointKt.m108timesso9K2fw(this.d1, min2));
        long m106plusybeJwSQ2 = PointKt.m106plusybeJwSQ(this.p1, PointKt.m108timesso9K2fw(this.d2, min2));
        Cubic m112computeFlankingCurveoAJzIJU = m112computeFlankingCurveoAJzIJU(min2, calculateActualSmoothingValue, this.p1, this.p0, m106plusybeJwSQ, m106plusybeJwSQ2, this.center, f2);
        Cubic reverse = m112computeFlankingCurveoAJzIJU(min2, calculateActualSmoothingValue2, this.p1, this.p2, m106plusybeJwSQ2, m106plusybeJwSQ, this.center, f2).reverse();
        return CollectionsKt.listOf((Object[]) new Cubic[]{m112computeFlankingCurveoAJzIJU, Cubic.INSTANCE.circularArc(PointKt.m102getXDnnuFBc(this.center), PointKt.m103getYDnnuFBc(this.center), m112computeFlankingCurveoAJzIJU.getAnchor1X(), m112computeFlankingCurveoAJzIJU.getAnchor1Y(), reverse.getAnchor0X(), reverse.getAnchor0Y()), reverse});
    }

    private final float calculateActualSmoothingValue(float allowedCut) {
        if (allowedCut > getExpectedCut()) {
            return this.smoothing;
        }
        float f = this.expectedRoundCut;
        if (allowedCut > f) {
            return (this.smoothing * (allowedCut - f)) / (getExpectedCut() - this.expectedRoundCut);
        }
        return 0.0f;
    }

    /* renamed from: computeFlankingCurve-oAJzIJU, reason: not valid java name */
    private final Cubic m112computeFlankingCurveoAJzIJU(float actualRoundCut, float actualSmoothingValues, long corner, long sideStart, long circleSegmentIntersection, long otherCircleSegmentIntersection, long circleCenter, float actualR) {
        long m99getDirectionDnnuFBc = PointKt.m99getDirectionDnnuFBc(PointKt.m105minusybeJwSQ(sideStart, corner));
        long m106plusybeJwSQ = PointKt.m106plusybeJwSQ(corner, PointKt.m108timesso9K2fw(PointKt.m108timesso9K2fw(m99getDirectionDnnuFBc, actualRoundCut), 1 + actualSmoothingValues));
        long j = circleSegmentIntersection;
        long m104interpolatedLqxh1s = PointKt.m104interpolatedLqxh1s(j, PointKt.m96divso9K2fw(PointKt.m106plusybeJwSQ(circleSegmentIntersection, otherCircleSegmentIntersection), 2.0f), actualSmoothingValues);
        long m106plusybeJwSQ2 = PointKt.m106plusybeJwSQ(circleCenter, PointKt.m108timesso9K2fw(Utils.directionVector(PointKt.m102getXDnnuFBc(m104interpolatedLqxh1s) - PointKt.m102getXDnnuFBc(circleCenter), PointKt.m103getYDnnuFBc(m104interpolatedLqxh1s) - PointKt.m103getYDnnuFBc(circleCenter)), actualR));
        FloatFloatPair m113lineIntersectionCBFvKDc = m113lineIntersectionCBFvKDc(sideStart, m99getDirectionDnnuFBc, m106plusybeJwSQ2, Utils.m123rotate90DnnuFBc(PointKt.m105minusybeJwSQ(m106plusybeJwSQ2, circleCenter)));
        if (m113lineIntersectionCBFvKDc != null) {
            j = m113lineIntersectionCBFvKDc.getPackedValue();
        }
        return new Cubic(m106plusybeJwSQ, PointKt.m96divso9K2fw(PointKt.m106plusybeJwSQ(m106plusybeJwSQ, PointKt.m108timesso9K2fw(j, 2.0f)), 3.0f), j, m106plusybeJwSQ2, null);
    }

    /* renamed from: lineIntersection-CBFvKDc, reason: not valid java name */
    private final FloatFloatPair m113lineIntersectionCBFvKDc(long p0, long d0, long p1, long d1) {
        long m123rotate90DnnuFBc = Utils.m123rotate90DnnuFBc(d1);
        float m98dotProductybeJwSQ = PointKt.m98dotProductybeJwSQ(d0, m123rotate90DnnuFBc);
        if (Math.abs(m98dotProductybeJwSQ) < 1.0E-4f) {
            return null;
        }
        float m98dotProductybeJwSQ2 = PointKt.m98dotProductybeJwSQ(PointKt.m105minusybeJwSQ(p1, p0), m123rotate90DnnuFBc);
        if (Math.abs(m98dotProductybeJwSQ) < Math.abs(m98dotProductybeJwSQ2) * 1.0E-4f) {
            return null;
        }
        return FloatFloatPair.m7boximpl(PointKt.m106plusybeJwSQ(p0, PointKt.m108timesso9K2fw(d0, m98dotProductybeJwSQ2 / m98dotProductybeJwSQ)));
    }
}
