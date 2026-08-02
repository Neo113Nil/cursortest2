package com.squareup.cash.offers.viewmodels.itemviewmodels;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;

/* loaded from: classes6.dex */
public final class OffersRowViewModel {
    public final LegacyOffersAvatarViewModel avatar;
    public final Button button;
    public final OffersSaleChipViewModel salesChipViewModel;
    public final boolean showActiveBoostAvatarBadge;
    public final boolean showActiveBoostButton;
    public final StyledText subtitle;
    public final ImmutableList tapEventSpecs;
    public final StyledText title;

    public /* synthetic */ OffersRowViewModel(LegacyOffersAvatarViewModel legacyOffersAvatarViewModel, StyledText styledText, StyledText styledText2, AbstractPersistentList abstractPersistentList, Button button, OffersSaleChipViewModel offersSaleChipViewModel, int i) {
        this(legacyOffersAvatarViewModel, styledText, styledText2, abstractPersistentList, (i & 16) != 0 ? null : button, false, false, (i & 128) != 0 ? null : offersSaleChipViewModel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersRowViewModel)) {
            return false;
        }
        OffersRowViewModel offersRowViewModel = (OffersRowViewModel) obj;
        return Intrinsics.areEqual(this.avatar, offersRowViewModel.avatar) && Intrinsics.areEqual(this.title, offersRowViewModel.title) && Intrinsics.areEqual(this.subtitle, offersRowViewModel.subtitle) && Intrinsics.areEqual(this.tapEventSpecs, offersRowViewModel.tapEventSpecs) && Intrinsics.areEqual(this.button, offersRowViewModel.button) && this.showActiveBoostButton == offersRowViewModel.showActiveBoostButton && this.showActiveBoostAvatarBadge == offersRowViewModel.showActiveBoostAvatarBadge && Intrinsics.areEqual(this.salesChipViewModel, offersRowViewModel.salesChipViewModel);
    }

    public final int hashCode() {
        int hashCode = (this.title.hashCode() + (this.avatar.hashCode() * 31)) * 31;
        StyledText styledText = this.subtitle;
        int m = BalanceFeedKt$$ExternalSyntheticOutline0.m(this.tapEventSpecs, (hashCode + (styledText == null ? 0 : styledText.hashCode())) * 31, 31);
        Button button = this.button;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (button == null ? 0 : button.hashCode())) * 31, 31, this.showActiveBoostButton), 31, this.showActiveBoostAvatarBadge);
        OffersSaleChipViewModel offersSaleChipViewModel = this.salesChipViewModel;
        return m2 + (offersSaleChipViewModel != null ? offersSaleChipViewModel.hashCode() : 0);
    }

    public final String toString() {
        return "OffersRowViewModel(avatar=" + this.avatar + ", title=" + this.title + ", subtitle=" + this.subtitle + ", tapEventSpecs=" + this.tapEventSpecs + ", button=" + this.button + ", showActiveBoostButton=" + this.showActiveBoostButton + ", showActiveBoostAvatarBadge=" + this.showActiveBoostAvatarBadge + ", salesChipViewModel=" + this.salesChipViewModel + ")";
    }

    public OffersRowViewModel(LegacyOffersAvatarViewModel legacyOffersAvatarViewModel, StyledText styledText, StyledText styledText2, ImmutableList immutableList, Button button, boolean z, boolean z2, OffersSaleChipViewModel offersSaleChipViewModel) {
        styledText.getClass();
        immutableList.getClass();
        this.avatar = legacyOffersAvatarViewModel;
        this.title = styledText;
        this.subtitle = styledText2;
        this.tapEventSpecs = immutableList;
        this.button = button;
        this.showActiveBoostButton = z;
        this.showActiveBoostAvatarBadge = z2;
        this.salesChipViewModel = offersSaleChipViewModel;
    }
}
