package com.squareup.cash.offers.viewmodels.itemviewmodels;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.offers.viewmodels.ImpressionReportable;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.ui.Image;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* loaded from: classes6.dex */
public final class OffersMessageViewModel implements OffersSearchListItemViewModel, ImpressionReportable {
    public final Button actionButton;
    public final String id;
    public final Image image;
    public final ImmutableList impressionEventSpecs;
    public final StyledText subtitle;
    public final StyledText title;

    public OffersMessageViewModel(String str, ImmutableList immutableList, StyledText styledText, StyledText styledText2, Image image, Button button) {
        str.getClass();
        immutableList.getClass();
        styledText.getClass();
        this.id = str;
        this.impressionEventSpecs = immutableList;
        this.title = styledText;
        this.subtitle = styledText2;
        this.image = image;
        this.actionButton = button;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersMessageViewModel)) {
            return false;
        }
        OffersMessageViewModel offersMessageViewModel = (OffersMessageViewModel) obj;
        return Intrinsics.areEqual(this.id, offersMessageViewModel.id) && Intrinsics.areEqual(this.impressionEventSpecs, offersMessageViewModel.impressionEventSpecs) && Intrinsics.areEqual(this.title, offersMessageViewModel.title) && Intrinsics.areEqual(this.subtitle, offersMessageViewModel.subtitle) && Intrinsics.areEqual(this.image, offersMessageViewModel.image) && Intrinsics.areEqual(this.actionButton, offersMessageViewModel.actionButton);
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
        int hashCode = (this.title.hashCode() + BalanceFeedKt$$ExternalSyntheticOutline0.m(this.impressionEventSpecs, this.id.hashCode() * 31, 31)) * 31;
        StyledText styledText = this.subtitle;
        int hashCode2 = (hashCode + (styledText == null ? 0 : styledText.hashCode())) * 31;
        Image image = this.image;
        int hashCode3 = (hashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        Button button = this.actionButton;
        return hashCode3 + (button != null ? button.hashCode() : 0);
    }

    public final String toString() {
        return "OffersMessageViewModel(id=" + this.id + ", impressionEventSpecs=" + this.impressionEventSpecs + ", title=" + this.title + ", subtitle=" + this.subtitle + ", image=" + this.image + ", actionButton=" + this.actionButton + ")";
    }
}
