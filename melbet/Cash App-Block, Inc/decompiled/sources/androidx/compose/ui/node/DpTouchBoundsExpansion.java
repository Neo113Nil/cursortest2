package androidx.compose.ui.node;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.media3.extractor.text.CueEncoder;

/* loaded from: classes.dex */
public final class DpTouchBoundsExpansion {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DpTouchBoundsExpansion) && Dp.m1037equalsimpl0(10.0f, 10.0f) && Dp.m1037equalsimpl0(40.0f, 40.0f) && Dp.m1037equalsimpl0(10.0f, 10.0f) && Dp.m1037equalsimpl0(40.0f, 40.0f);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + CameraState$Type$EnumUnboxingLocalUtility.m(40.0f, CameraState$Type$EnumUnboxingLocalUtility.m(10.0f, CameraState$Type$EnumUnboxingLocalUtility.m(40.0f, Float.hashCode(10.0f) * 31, 31), 31), 31);
    }

    /* renamed from: roundToTouchBoundsExpansion-TW6G1oQ, reason: not valid java name */
    public final long m869roundToTouchBoundsExpansionTW6G1oQ(Density density) {
        int i = TouchBoundsExpansion.$r8$clinit;
        return CueEncoder.pack$ui(density.mo230roundToPx0680j_4(10.0f), density.mo230roundToPx0680j_4(40.0f), density.mo230roundToPx0680j_4(10.0f), density.mo230roundToPx0680j_4(40.0f));
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) Dp.m1038toStringimpl(10.0f)) + ", top=" + ((Object) Dp.m1038toStringimpl(40.0f)) + ", end=" + ((Object) Dp.m1038toStringimpl(10.0f)) + ", bottom=" + ((Object) Dp.m1038toStringimpl(40.0f)) + ", isLayoutDirectionAware=true)";
    }
}
