package com.squareup.cash.sheet;

import androidx.compose.ui.unit.Dp;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public final class SheetPeekPosition$FixedHeight {
    public final boolean allowContentExpansion;
    public final boolean enableExperimentalImePeekHeight;
    public final float value;

    public SheetPeekPosition$FixedHeight(int i, float f, boolean z) {
        z = (i & 2) != 0 ? false : z;
        boolean z2 = (i & 4) == 0;
        this.value = f;
        this.enableExperimentalImePeekHeight = z;
        this.allowContentExpansion = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SheetPeekPosition$FixedHeight)) {
            return false;
        }
        SheetPeekPosition$FixedHeight sheetPeekPosition$FixedHeight = (SheetPeekPosition$FixedHeight) obj;
        return Dp.m1037equalsimpl0(this.value, sheetPeekPosition$FixedHeight.value) && this.enableExperimentalImePeekHeight == sheetPeekPosition$FixedHeight.enableExperimentalImePeekHeight && this.allowContentExpansion == sheetPeekPosition$FixedHeight.allowContentExpansion;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.allowContentExpansion) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Float.hashCode(this.value) * 31, 31, this.enableExperimentalImePeekHeight);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Request$Priority$EnumUnboxingLocalUtility.m1540m("FixedHeight(value=", Dp.m1038toStringimpl(this.value), ", enableExperimentalImePeekHeight=", ", allowContentExpansion=", this.enableExperimentalImePeekHeight), this.allowContentExpansion, ")");
    }
}
