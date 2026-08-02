package com.squareup.cash.investing.viewmodels.market.hours;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InvestingPendingTradesTileWidgetViewModel {
    public final String buttonLabel;
    public final String title;

    public InvestingPendingTradesTileWidgetViewModel(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.buttonLabel = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestingPendingTradesTileWidgetViewModel)) {
            return false;
        }
        InvestingPendingTradesTileWidgetViewModel investingPendingTradesTileWidgetViewModel = (InvestingPendingTradesTileWidgetViewModel) obj;
        return Intrinsics.areEqual(this.title, investingPendingTradesTileWidgetViewModel.title) && Intrinsics.areEqual(this.buttonLabel, investingPendingTradesTileWidgetViewModel.buttonLabel);
    }

    public final int hashCode() {
        return this.buttonLabel.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("InvestingPendingTradesTileWidgetViewModel(title=", this.title, ", buttonLabel=", this.buttonLabel, ")");
    }
}
