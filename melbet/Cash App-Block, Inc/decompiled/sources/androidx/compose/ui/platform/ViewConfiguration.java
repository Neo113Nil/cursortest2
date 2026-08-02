package androidx.compose.ui.platform;

import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public interface ViewConfiguration {
    long getDoubleTapTimeoutMillis();

    default float getHandwritingGestureLineMargin() {
        return 16.0f;
    }

    default float getHandwritingSlop() {
        return 2.0f;
    }

    long getLongPressTimeoutMillis();

    default float getMaximumFlingVelocity() {
        return Float.MAX_VALUE;
    }

    default float getMinimumFlingVelocity() {
        return RecyclerView.DECELERATION_RATE;
    }

    /* renamed from: getMinimumTouchTargetSize-MYxV2XQ */
    default long mo873getMinimumTouchTargetSizeMYxV2XQ() {
        return BundleKt.m1091DpSizeYgX7TsA(48.0f, 48.0f);
    }

    float getTouchSlop();
}
