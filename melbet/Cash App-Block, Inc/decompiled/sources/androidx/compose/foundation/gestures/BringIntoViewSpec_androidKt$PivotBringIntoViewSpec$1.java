package androidx.compose.foundation.gestures;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class BringIntoViewSpec_androidKt$PivotBringIntoViewSpec$1 implements BringIntoViewSpec {
    @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
    public final float calculateScrollDistance(float f, float f2, float f3) {
        float abs = Math.abs((f2 + f) - f);
        boolean z = abs <= f3;
        float f4 = (0.3f * f3) - (RecyclerView.DECELERATION_RATE * abs);
        float f5 = f3 - f4;
        if (z && f5 < abs) {
            f4 = f3 - abs;
        }
        return f - f4;
    }
}
