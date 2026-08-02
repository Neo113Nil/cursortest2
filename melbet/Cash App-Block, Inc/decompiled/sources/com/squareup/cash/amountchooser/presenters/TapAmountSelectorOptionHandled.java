package com.squareup.cash.amountchooser.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class TapAmountSelectorOptionHandled {
    public final List amountSelectorOptions;
    public final String rawAmount;
    public final boolean shouldExpand;

    public TapAmountSelectorOptionHandled(String str, List list, boolean z) {
        str.getClass();
        list.getClass();
        this.rawAmount = str;
        this.amountSelectorOptions = list;
        this.shouldExpand = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TapAmountSelectorOptionHandled)) {
            return false;
        }
        TapAmountSelectorOptionHandled tapAmountSelectorOptionHandled = (TapAmountSelectorOptionHandled) obj;
        return Intrinsics.areEqual(this.rawAmount, tapAmountSelectorOptionHandled.rawAmount) && Intrinsics.areEqual(this.amountSelectorOptions, tapAmountSelectorOptionHandled.amountSelectorOptions) && this.shouldExpand == tapAmountSelectorOptionHandled.shouldExpand;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.shouldExpand) + Recorder$$ExternalSyntheticOutline2.m(this.rawAmount.hashCode() * 31, 31, this.amountSelectorOptions);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("TapAmountSelectorOptionHandled(rawAmount=", this.rawAmount, ", amountSelectorOptions=", ", shouldExpand=", this.amountSelectorOptions), this.shouldExpand, ")");
    }
}
