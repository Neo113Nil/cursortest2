package com.squareup.cash.offers.viewmodels.itemviewmodels;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.offers.backend.api.OffersItemToken;
import com.squareup.cash.offers.viewmodels.ImpressionReportable;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* loaded from: classes6.dex */
public final class OffersCommonOfferRowViewModel implements OffersSearchListItemViewModel, ImpressionReportable {
    public final String boostToken;
    public final String id;
    public final ImmutableList impressionEventSpecs;
    public final OffersItemToken itemToken;
    public final String offerToken;
    public final OffersRowViewModel rowViewModel;
    public final String tapActionUrl;

    public OffersCommonOfferRowViewModel(String str, ImmutableList immutableList, String str2, OffersItemToken offersItemToken, String str3, OffersRowViewModel offersRowViewModel, String str4) {
        immutableList.getClass();
        str2.getClass();
        this.id = str;
        this.impressionEventSpecs = immutableList;
        this.offerToken = str2;
        this.itemToken = offersItemToken;
        this.boostToken = str3;
        this.rowViewModel = offersRowViewModel;
        this.tapActionUrl = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersCommonOfferRowViewModel)) {
            return false;
        }
        OffersCommonOfferRowViewModel offersCommonOfferRowViewModel = (OffersCommonOfferRowViewModel) obj;
        return this.id.equals(offersCommonOfferRowViewModel.id) && Intrinsics.areEqual(this.impressionEventSpecs, offersCommonOfferRowViewModel.impressionEventSpecs) && Intrinsics.areEqual(this.offerToken, offersCommonOfferRowViewModel.offerToken) && Intrinsics.areEqual(this.itemToken, offersCommonOfferRowViewModel.itemToken) && Intrinsics.areEqual(this.boostToken, offersCommonOfferRowViewModel.boostToken) && this.rowViewModel.equals(offersCommonOfferRowViewModel.rowViewModel) && this.tapActionUrl.equals(offersCommonOfferRowViewModel.tapActionUrl);
    }

    @Override // com.squareup.cash.offers.viewmodels.itemviewmodels.OffersSearchListItemViewModel
    public final String getId() {
        return this.id;
    }

    @Override // com.squareup.cash.offers.viewmodels.ImpressionReportable
    public final ImmutableList getImpressionEventSpecs() {
        return this.impressionEventSpecs;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(BalanceFeedKt$$ExternalSyntheticOutline0.m(this.impressionEventSpecs, this.id.hashCode() * 31, 31), 31, this.offerToken);
        OffersItemToken offersItemToken = this.itemToken;
        int hashCode = (m + (offersItemToken == null ? 0 : offersItemToken.hashCode())) * 31;
        String str = this.boostToken;
        return this.tapActionUrl.hashCode() + ((this.rowViewModel.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffersCommonOfferRowViewModel(id=");
        sb.append(this.id);
        sb.append(", impressionEventSpecs=");
        sb.append(this.impressionEventSpecs);
        sb.append(", offerToken=");
        sb.append(this.offerToken);
        sb.append(", itemToken=");
        sb.append(this.itemToken);
        sb.append(", boostToken=");
        sb.append(this.boostToken);
        sb.append(", rowViewModel=");
        sb.append(this.rowViewModel);
        sb.append(", tapActionUrl=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.tapActionUrl, ")");
    }
}
