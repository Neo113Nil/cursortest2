package com.squareup.cash.maps.views;

import androidx.compose.ui.unit.Dp;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class SelectedLocationCameraReframe {
    public final float bottomObscuredHeight;

    public SelectedLocationCameraReframe(float f) {
        this.bottomObscuredHeight = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SelectedLocationCameraReframe) && Dp.m1037equalsimpl0(this.bottomObscuredHeight, ((SelectedLocationCameraReframe) obj).bottomObscuredHeight) && Float.compare(0.6f, 0.6f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(0.6f) + (Float.hashCode(this.bottomObscuredHeight) * 31);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SelectedLocationCameraReframe(bottomObscuredHeight=", Dp.m1038toStringimpl(this.bottomObscuredHeight), ", targetVerticalAlignmentInVisibleArea=0.6)");
    }
}
