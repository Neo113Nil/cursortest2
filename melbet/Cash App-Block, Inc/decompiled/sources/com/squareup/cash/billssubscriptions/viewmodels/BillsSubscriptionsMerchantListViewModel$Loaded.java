package com.squareup.cash.billssubscriptions.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BillsSubscriptionsMerchantListViewModel$Loaded {
    public final List categoryFilters;
    public final String searchQuery;
    public final List sections;
    public final String selectedCategoryToken;
    public final boolean showDoneButton;

    public BillsSubscriptionsMerchantListViewModel$Loaded(String str, List list, List list2, boolean z) {
        list.getClass();
        list2.getClass();
        this.sections = list;
        this.categoryFilters = list2;
        this.selectedCategoryToken = str;
        this.searchQuery = "";
        this.showDoneButton = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillsSubscriptionsMerchantListViewModel$Loaded)) {
            return false;
        }
        BillsSubscriptionsMerchantListViewModel$Loaded billsSubscriptionsMerchantListViewModel$Loaded = (BillsSubscriptionsMerchantListViewModel$Loaded) obj;
        return Intrinsics.areEqual(this.sections, billsSubscriptionsMerchantListViewModel$Loaded.sections) && Intrinsics.areEqual(this.categoryFilters, billsSubscriptionsMerchantListViewModel$Loaded.categoryFilters) && Intrinsics.areEqual(this.selectedCategoryToken, billsSubscriptionsMerchantListViewModel$Loaded.selectedCategoryToken) && Intrinsics.areEqual(this.searchQuery, billsSubscriptionsMerchantListViewModel$Loaded.searchQuery) && this.showDoneButton == billsSubscriptionsMerchantListViewModel$Loaded.showDoneButton;
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(this.sections.hashCode() * 31, 31, this.categoryFilters);
        String str = this.selectedCategoryToken;
        return Boolean.hashCode(this.showDoneButton) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 961, this.searchQuery);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("Loaded(sections=", ", categoryFilters=", ", selectedCategoryToken=", this.sections, this.categoryFilters);
        Boxes$$ExternalSyntheticOutline1.m(m, this.selectedCategoryToken, ", searchQuery=", this.searchQuery, ", toast=null, showDoneButton=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.showDoneButton, ")");
    }
}
