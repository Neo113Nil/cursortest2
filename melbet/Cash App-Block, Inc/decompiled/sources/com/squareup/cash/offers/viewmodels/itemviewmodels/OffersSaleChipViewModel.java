package com.squareup.cash.offers.viewmodels.itemviewmodels;

import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.ui.Color;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OffersSaleChipViewModel {
    public final Color backgroundColor;
    public final StyledText title;

    public OffersSaleChipViewModel(StyledText styledText, Color color) {
        styledText.getClass();
        this.title = styledText;
        this.backgroundColor = color;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersSaleChipViewModel)) {
            return false;
        }
        OffersSaleChipViewModel offersSaleChipViewModel = (OffersSaleChipViewModel) obj;
        return Intrinsics.areEqual(this.title, offersSaleChipViewModel.title) && Intrinsics.areEqual(this.backgroundColor, offersSaleChipViewModel.backgroundColor);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        Color color = this.backgroundColor;
        return hashCode + (color == null ? 0 : color.hashCode());
    }

    public final String toString() {
        return "OffersSaleChipViewModel(title=" + this.title + ", backgroundColor=" + this.backgroundColor + ")";
    }
}
