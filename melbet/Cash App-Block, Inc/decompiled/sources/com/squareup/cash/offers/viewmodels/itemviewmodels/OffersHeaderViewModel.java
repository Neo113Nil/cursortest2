package com.squareup.cash.offers.viewmodels.itemviewmodels;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* loaded from: classes6.dex */
public final class OffersHeaderViewModel implements OffersHomeListItemViewModel, OffersSearchListItemViewModel {
    public final Button button;
    public final String id;
    public final String tapActionUrl;
    public final ImmutableList tapEventSpecs;
    public final StyledText title;

    public OffersHeaderViewModel(String str, StyledText styledText, String str2, ImmutableList immutableList, Button button) {
        styledText.getClass();
        immutableList.getClass();
        this.id = str;
        this.title = styledText;
        this.tapActionUrl = str2;
        this.tapEventSpecs = immutableList;
        this.button = button;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersHeaderViewModel)) {
            return false;
        }
        OffersHeaderViewModel offersHeaderViewModel = (OffersHeaderViewModel) obj;
        return this.id.equals(offersHeaderViewModel.id) && Intrinsics.areEqual(this.title, offersHeaderViewModel.title) && Intrinsics.areEqual(this.tapActionUrl, offersHeaderViewModel.tapActionUrl) && Intrinsics.areEqual(this.tapEventSpecs, offersHeaderViewModel.tapEventSpecs) && Intrinsics.areEqual(this.button, offersHeaderViewModel.button);
    }

    @Override // com.squareup.cash.offers.viewmodels.itemviewmodels.OffersSearchListItemViewModel
    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int hashCode = (this.title.hashCode() + (this.id.hashCode() * 31)) * 31;
        String str = this.tapActionUrl;
        int m = BalanceFeedKt$$ExternalSyntheticOutline0.m(this.tapEventSpecs, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        Button button = this.button;
        return m + (button != null ? button.hashCode() : 0);
    }

    public final String toString() {
        return "OffersHeaderViewModel(id=" + this.id + ", title=" + this.title + ", tapActionUrl=" + this.tapActionUrl + ", tapEventSpecs=" + this.tapEventSpecs + ", button=" + this.button + ")";
    }
}
