package androidx.compose.foundation.layout;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public interface PaddingValues {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes3.dex */
    public final class Absolute implements PaddingValues {
        public final float bottom;
        public final float left;
        public final float right;
        public final float top;

        public Absolute(float f, float f2, float f3, float f4) {
            this.left = f;
            this.top = f2;
            this.right = f3;
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
            return this.left;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* renamed from: calculateRightPadding-u2uoSUM */
        public final float mo266calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
            return this.right;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* renamed from: calculateTopPadding-D9Ej5fM */
        public final float mo267calculateTopPaddingD9Ej5fM() {
            return this.top;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Absolute)) {
                return false;
            }
            Absolute absolute = (Absolute) obj;
            return Dp.m1037equalsimpl0(this.left, absolute.left) && Dp.m1037equalsimpl0(this.top, absolute.top) && Dp.m1037equalsimpl0(this.right, absolute.right) && Dp.m1037equalsimpl0(this.bottom, absolute.bottom);
        }

        public final int hashCode() {
            return Float.hashCode(this.bottom) + CameraState$Type$EnumUnboxingLocalUtility.m(this.right, CameraState$Type$EnumUnboxingLocalUtility.m(this.top, Float.hashCode(this.left) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PaddingValues.Absolute(left=");
            Recorder$$ExternalSyntheticOutline1.m104m(this.left, ", top=", sb);
            Recorder$$ExternalSyntheticOutline1.m104m(this.top, ", right=", sb);
            Recorder$$ExternalSyntheticOutline1.m104m(this.right, ", bottom=", sb);
            sb.append((Object) Dp.m1038toStringimpl(this.bottom));
            sb.append(')');
            return sb.toString();
        }
    }

    /* loaded from: classes3.dex */
    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final Absolute Zero = new Absolute(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);

        public static Absolute getZero() {
            return Zero;
        }
    }

    /* renamed from: calculateBottomPadding-D9Ej5fM */
    float mo264calculateBottomPaddingD9Ej5fM();

    /* renamed from: calculateLeftPadding-u2uoSUM */
    float mo265calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection);

    /* renamed from: calculateRightPadding-u2uoSUM */
    float mo266calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection);

    /* renamed from: calculateTopPadding-D9Ej5fM */
    float mo267calculateTopPaddingD9Ej5fM();
}
