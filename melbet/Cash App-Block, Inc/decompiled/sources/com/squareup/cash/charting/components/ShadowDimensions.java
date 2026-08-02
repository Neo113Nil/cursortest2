package com.squareup.cash.charting.components;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class ShadowDimensions {
    public final long offset;
    public final long size;
    public final float startAngle;

    public ShadowDimensions(float f, long j, long j2) {
        this.startAngle = f;
        this.offset = j;
        this.size = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowDimensions)) {
            return false;
        }
        ShadowDimensions shadowDimensions = (ShadowDimensions) obj;
        return Float.compare(this.startAngle, shadowDimensions.startAngle) == 0 && Float.compare(180.0f, 180.0f) == 0 && Offset.m622equalsimpl0(this.offset, shadowDimensions.offset) && Size.m639equalsimpl0(this.size, shadowDimensions.size);
    }

    public final int hashCode() {
        return Long.hashCode(this.size) + Recorder$$ExternalSyntheticOutline2.m(CameraState$Type$EnumUnboxingLocalUtility.m(180.0f, Float.hashCode(this.startAngle) * 31, 31), 31, this.offset);
    }

    public final String toString() {
        String m628toStringimpl = Offset.m628toStringimpl(this.offset);
        String m646toStringimpl = Size.m646toStringimpl(this.size);
        StringBuilder sb = new StringBuilder("ShadowDimensions(startAngle=");
        sb.append(this.startAngle);
        sb.append(", sweepAngle=180.0, offset=");
        sb.append(m628toStringimpl);
        sb.append(", size=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, m646toStringimpl, ")");
    }
}
