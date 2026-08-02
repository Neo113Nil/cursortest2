package com.squareup.cash.payments.views.coreflowsheet;

import androidx.compose.ui.unit.Dp;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class CoreFlowSheetPeekPosition$FixedHeight {
    public final float value;

    public CoreFlowSheetPeekPosition$FixedHeight(float f) {
        this.value = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CoreFlowSheetPeekPosition$FixedHeight) && Dp.m1037equalsimpl0(this.value, ((CoreFlowSheetPeekPosition$FixedHeight) obj).value);
    }

    public final int hashCode() {
        return Float.hashCode(this.value);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FixedHeight(value=", Dp.m1038toStringimpl(this.value), ")");
    }
}
