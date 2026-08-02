package com.squareup.cash.offers.viewmodels.itemviewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FilterGroupsSectionViewModel implements OffersSearchListItemViewModel {
    public final List filterGroups;
    public final String id;
    public final boolean isSticky;

    public FilterGroupsSectionViewModel(List list, boolean z) {
        list.getClass();
        this.id = "FILTER_GROUPS_SECTION_ID";
        this.filterGroups = list;
        this.isSticky = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterGroupsSectionViewModel)) {
            return false;
        }
        FilterGroupsSectionViewModel filterGroupsSectionViewModel = (FilterGroupsSectionViewModel) obj;
        return this.id.equals(filterGroupsSectionViewModel.id) && Intrinsics.areEqual(this.filterGroups, filterGroupsSectionViewModel.filterGroups) && this.isSticky == filterGroupsSectionViewModel.isSticky;
    }

    @Override // com.squareup.cash.offers.viewmodels.itemviewmodels.OffersSearchListItemViewModel
    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isSticky) + Recorder$$ExternalSyntheticOutline2.m(this.id.hashCode() * 31, 31, this.filterGroups);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("FilterGroupsSectionViewModel(id=", this.id, ", filterGroups=", ", isSticky=", this.filterGroups), this.isSticky, ")");
    }
}
