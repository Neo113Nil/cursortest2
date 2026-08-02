package com.squareup.cash.money.applets.common.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class LoadingServiceShimmerSpec {
    public final long primarySize;
    public final float rowSpacing;
    public final long secondarySize;

    public LoadingServiceShimmerSpec(float f, long j, long j2) {
        this.primarySize = j;
        this.secondarySize = j2;
        this.rowSpacing = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadingServiceShimmerSpec)) {
            return false;
        }
        LoadingServiceShimmerSpec loadingServiceShimmerSpec = (LoadingServiceShimmerSpec) obj;
        return DpSize.m1042equalsimpl0(this.primarySize, loadingServiceShimmerSpec.primarySize) && DpSize.m1042equalsimpl0(this.secondarySize, loadingServiceShimmerSpec.secondarySize) && Dp.m1037equalsimpl0(this.rowSpacing, loadingServiceShimmerSpec.rowSpacing);
    }

    public final int hashCode() {
        return Float.hashCode(this.rowSpacing) + Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.primarySize) * 31, 31, this.secondarySize);
    }

    public final String toString() {
        String m1045toStringimpl = DpSize.m1045toStringimpl(this.primarySize);
        String m1045toStringimpl2 = DpSize.m1045toStringimpl(this.secondarySize);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LoadingServiceShimmerSpec(primarySize=", m1045toStringimpl, ", secondarySize=", m1045toStringimpl2, ", rowSpacing="), Dp.m1038toStringimpl(this.rowSpacing), ")");
    }
}
