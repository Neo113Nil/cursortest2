package com.squareup.cash.fidesmo.views;

import androidx.compose.ui.unit.IntOffset;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;

/* loaded from: classes6.dex */
public final class ScanningStarLayout {
    public final long offset;
    public final boolean placeInstructionBlockAtTop;

    public ScanningStarLayout(long j, boolean z) {
        this.offset = j;
        this.placeInstructionBlockAtTop = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScanningStarLayout)) {
            return false;
        }
        ScanningStarLayout scanningStarLayout = (ScanningStarLayout) obj;
        return IntOffset.m1047equalsimpl0(this.offset, scanningStarLayout.offset) && this.placeInstructionBlockAtTop == scanningStarLayout.placeInstructionBlockAtTop;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.placeInstructionBlockAtTop) + (Long.hashCode(this.offset) * 31);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("ScanningStarLayout(offset=", IntOffset.m1050toStringimpl(this.offset), ", placeInstructionBlockAtTop=", ")", this.placeInstructionBlockAtTop);
    }
}
