package com.squareup.cash.card.onboarding.core.instancing;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class GridCell {
    public final int canonicalIndex;
    public final boolean isCanonical;
    public final float opacity;
    public final int virtualCol;
    public final int virtualRow;
    public final float worldX;
    public final float worldY;

    public GridCell(int i, int i2, int i3, float f, float f2, float f3, boolean z) {
        this.virtualCol = i;
        this.virtualRow = i2;
        this.canonicalIndex = i3;
        this.worldX = f;
        this.worldY = f2;
        this.opacity = f3;
        this.isCanonical = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridCell)) {
            return false;
        }
        GridCell gridCell = (GridCell) obj;
        return this.virtualCol == gridCell.virtualCol && this.virtualRow == gridCell.virtualRow && this.canonicalIndex == gridCell.canonicalIndex && Float.compare(this.worldX, gridCell.worldX) == 0 && Float.compare(this.worldY, gridCell.worldY) == 0 && Float.compare(this.opacity, gridCell.opacity) == 0 && this.isCanonical == gridCell.isCanonical;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isCanonical) + CameraState$Type$EnumUnboxingLocalUtility.m(this.opacity, CameraState$Type$EnumUnboxingLocalUtility.m(this.worldY, CameraState$Type$EnumUnboxingLocalUtility.m(this.worldX, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.canonicalIndex, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.virtualRow, Integer.hashCode(this.virtualCol) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(this.virtualCol, this.virtualRow, "GridCell(virtualCol=", ", virtualRow=", ", canonicalIndex=");
        m107m.append(this.canonicalIndex);
        m107m.append(", worldX=");
        m107m.append(this.worldX);
        m107m.append(", worldY=");
        Request$Priority$EnumUnboxingLocalUtility.m(m107m, this.worldY, ", opacity=", this.opacity, ", isCanonical=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m107m, this.isCanonical, ")");
    }
}
