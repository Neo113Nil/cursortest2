package androidx.compose.foundation.layout;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class PaddingValuesImpl implements PaddingValues {
    public final float bottom;
    public final float end;
    public final float start;
    public final float top;

    public PaddingValuesImpl(float f, float f2, float f3, float f4) {
        this.start = f;
        this.top = f2;
        this.end = f3;
        this.bottom = f4;
        if (!((f >= RecyclerView.DECELERATION_RATE) & (f2 >= RecyclerView.DECELERATION_RATE) & (f3 >= RecyclerView.DECELERATION_RATE)) || !(f4 >= RecyclerView.DECELERATION_RATE)) {
            InlineClassHelperKt.throwIllegalArgumentException("Padding must be non-negative");
        }
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM */
    public final float mo264calculateBottomPaddingD9Ej5fM() {
        return this.bottom;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM */
    public final float mo265calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? this.start : this.end;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM */
    public final float mo266calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? this.end : this.start;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM */
    public final float mo267calculateTopPaddingD9Ej5fM() {
        return this.top;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PaddingValuesImpl)) {
            return false;
        }
        PaddingValuesImpl paddingValuesImpl = (PaddingValuesImpl) obj;
        return Dp.m1037equalsimpl0(this.start, paddingValuesImpl.start) && Dp.m1037equalsimpl0(this.top, paddingValuesImpl.top) && Dp.m1037equalsimpl0(this.end, paddingValuesImpl.end) && Dp.m1037equalsimpl0(this.bottom, paddingValuesImpl.bottom);
    }

    public final int hashCode() {
        return Float.hashCode(this.bottom) + CameraState$Type$EnumUnboxingLocalUtility.m(this.end, CameraState$Type$EnumUnboxingLocalUtility.m(this.top, Float.hashCode(this.start) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaddingValues(start=");
        Recorder$$ExternalSyntheticOutline1.m104m(this.start, ", top=", sb);
        Recorder$$ExternalSyntheticOutline1.m104m(this.top, ", end=", sb);
        Recorder$$ExternalSyntheticOutline1.m104m(this.end, ", bottom=", sb);
        sb.append((Object) Dp.m1038toStringimpl(this.bottom));
        sb.append(')');
        return sb.toString();
    }
}
