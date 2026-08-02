package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public abstract class Utils {
    public static final /* synthetic */ int $r8$clinit = 0;

    static {
        FloatFloatPair.m127constructorimpl(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
    }

    public static final long directionVector(float f, float f2) {
        float sqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        if (sqrt > RecyclerView.DECELERATION_RATE) {
            return FloatFloatPair.m127constructorimpl(f / sqrt, f2 / sqrt);
        }
        a$$ExternalSyntheticBUOutline0.m$3("Required distance greater than zero");
        return 0L;
    }

    public static final float interpolate(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }
}
