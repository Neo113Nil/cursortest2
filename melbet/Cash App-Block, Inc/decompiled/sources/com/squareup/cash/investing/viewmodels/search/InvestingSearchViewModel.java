package com.squareup.cash.investing.viewmodels.search;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InvestingSearchViewModel {
    public final FilterGroupCarousel filterGroupCarousel;
    public final List results;
    public final String searchQuery;
    public final boolean showKeypad;

    public InvestingSearchViewModel(String str, FilterGroupCarousel filterGroupCarousel, List list, boolean z) {
        str.getClass();
        filterGroupCarousel.getClass();
        list.getClass();
        this.searchQuery = str;
        this.filterGroupCarousel = filterGroupCarousel;
        this.results = list;
        this.showKeypad = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestingSearchViewModel)) {
            return false;
        }
        InvestingSearchViewModel investingSearchViewModel = (InvestingSearchViewModel) obj;
        return Intrinsics.areEqual(this.searchQuery, investingSearchViewModel.searchQuery) && Intrinsics.areEqual(this.filterGroupCarousel, investingSearchViewModel.filterGroupCarousel) && Intrinsics.areEqual(this.results, investingSearchViewModel.results) && this.showKeypad == investingSearchViewModel.showKeypad;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.showKeypad) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(this.searchQuery.hashCode() * 31, 31, this.filterGroupCarousel.filterGroups), 31, this.results);
    }

    public final String toString() {
        return "InvestingSearchViewModel(searchQuery=" + this.searchQuery + ", filterGroupCarousel=" + this.filterGroupCarousel + ", results=" + this.results + ", showKeypad=" + this.showKeypad + ")";
    }
}
