package com.squareup.cash.investing.viewmodels.market.hours;

import com.squareup.protos.franklin.investing.common.HistoricalRange;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InvestingPlaceholderGraphViewModel {
    public final HistoricalRange selectedRange;
    public final String timePeriod;

    public InvestingPlaceholderGraphViewModel(HistoricalRange historicalRange, String str) {
        str.getClass();
        historicalRange.getClass();
        this.timePeriod = str;
        this.selectedRange = historicalRange;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestingPlaceholderGraphViewModel)) {
            return false;
        }
        InvestingPlaceholderGraphViewModel investingPlaceholderGraphViewModel = (InvestingPlaceholderGraphViewModel) obj;
        return Intrinsics.areEqual(this.timePeriod, investingPlaceholderGraphViewModel.timePeriod) && this.selectedRange == investingPlaceholderGraphViewModel.selectedRange;
    }

    public final int hashCode() {
        return this.selectedRange.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(-1661534997, 31, this.timePeriod);
    }

    public final String toString() {
        return "InvestingPlaceholderGraphViewModel(title=$0.00, totalAmount=$0.00, percent=0%, timePeriod=" + this.timePeriod + ", selectedRange=" + this.selectedRange + ")";
    }
}
