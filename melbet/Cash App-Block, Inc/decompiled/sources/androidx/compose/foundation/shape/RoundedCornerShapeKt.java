package androidx.compose.foundation.shape;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class RoundedCornerShapeKt {
    public static final RoundedCornerShape CircleShape = RoundedCornerShape(50);

    public static final RoundedCornerShape RoundedCornerShape(int i) {
        PercentCornerSize percentCornerSize = new PercentCornerSize(i);
        return new RoundedCornerShape(percentCornerSize, percentCornerSize, percentCornerSize, percentCornerSize);
    }

    /* renamed from: RoundedCornerShape-0680j_4, reason: not valid java name */
    public static final RoundedCornerShape m340RoundedCornerShape0680j_4(float f) {
        DpCornerSize dpCornerSize = new DpCornerSize(f);
        return new RoundedCornerShape(dpCornerSize, dpCornerSize, dpCornerSize, dpCornerSize);
    }

    /* renamed from: RoundedCornerShape-a9UjIt4, reason: not valid java name */
    public static final RoundedCornerShape m341RoundedCornerShapea9UjIt4(float f, float f2, float f3, float f4) {
        return new RoundedCornerShape(new DpCornerSize(f), new DpCornerSize(f2), new DpCornerSize(f3), new DpCornerSize(f4));
    }

    /* renamed from: RoundedCornerShape-a9UjIt4$default, reason: not valid java name */
    public static RoundedCornerShape m342RoundedCornerShapea9UjIt4$default(float f, float f2, int i) {
        int i2 = i & 1;
        float f3 = RecyclerView.DECELERATION_RATE;
        if (i2 != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        float f4 = (i & 4) != 0 ? 0.0f : 24.0f;
        if ((i & 8) == 0) {
            f3 = 24.0f;
        }
        return m341RoundedCornerShapea9UjIt4(f, f2, f4, f3);
    }

    public static final RoundedCornerShape RoundedCornerShape(float f) {
        PxCornerSize pxCornerSize = new PxCornerSize(f);
        return new RoundedCornerShape(pxCornerSize, pxCornerSize, pxCornerSize, pxCornerSize);
    }
}
