package com.squareup.cash.datefilterbar.viewmodels;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DateFilterBarViewModel {
    public final List filterOptions;
    public final Integer startingIndex;

    public DateFilterBarViewModel(List list, Integer num) {
        list.getClass();
        this.startingIndex = num;
        this.filterOptions = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateFilterBarViewModel)) {
            return false;
        }
        DateFilterBarViewModel dateFilterBarViewModel = (DateFilterBarViewModel) obj;
        return Intrinsics.areEqual(this.startingIndex, dateFilterBarViewModel.startingIndex) && Intrinsics.areEqual(this.filterOptions, dateFilterBarViewModel.filterOptions);
    }

    public final int hashCode() {
        Integer num = this.startingIndex;
        return this.filterOptions.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return "DateFilterBarViewModel(startingIndex=" + this.startingIndex + ", filterOptions=" + this.filterOptions + ")";
    }
}
