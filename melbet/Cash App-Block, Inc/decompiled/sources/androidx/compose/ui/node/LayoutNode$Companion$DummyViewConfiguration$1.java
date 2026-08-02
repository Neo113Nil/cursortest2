package androidx.compose.ui.node;

import androidx.compose.ui.platform.ViewConfiguration;

/* loaded from: classes.dex */
public final class LayoutNode$Companion$DummyViewConfiguration$1 implements ViewConfiguration {
    @Override // androidx.compose.ui.platform.ViewConfiguration
    public final long getDoubleTapTimeoutMillis() {
        return 300L;
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public final long getLongPressTimeoutMillis() {
        return 400L;
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    /* renamed from: getMinimumTouchTargetSize-MYxV2XQ, reason: not valid java name */
    public final long mo873getMinimumTouchTargetSizeMYxV2XQ() {
        return 0L;
    }

    @Override // androidx.compose.ui.platform.ViewConfiguration
    public final float getTouchSlop() {
        return 16.0f;
    }
}
