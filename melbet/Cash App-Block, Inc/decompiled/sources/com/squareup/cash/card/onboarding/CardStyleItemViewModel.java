package com.squareup.cash.card.onboarding;

import bo.app.re$$ExternalSyntheticOutline0;
import com.fillr.featuretoggle.UnleashContext;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class CardStyleItemViewModel {
    public final String accessibilityText;
    public final boolean available;
    public final StyledCardViewModel card;
    public final UnleashContext cardDetails;

    public CardStyleItemViewModel(StyledCardViewModel styledCardViewModel, UnleashContext unleashContext, String str, boolean z) {
        this.card = styledCardViewModel;
        this.cardDetails = unleashContext;
        this.accessibilityText = str;
        this.available = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CardStyleItemViewModel) {
            CardStyleItemViewModel cardStyleItemViewModel = (CardStyleItemViewModel) obj;
            if (this.card.equals(cardStyleItemViewModel.card) && this.cardDetails == cardStyleItemViewModel.cardDetails && this.accessibilityText.equals(cardStyleItemViewModel.accessibilityText) && this.available == cardStyleItemViewModel.available) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.available) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.cardDetails.hashCode() + (this.card.hashCode() * 31)) * 31, 31, this.accessibilityText);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardStyleItemViewModel(card=");
        sb.append(this.card);
        sb.append(", cardDetails=");
        sb.append(this.cardDetails);
        sb.append(", accessibilityText=");
        return re$$ExternalSyntheticOutline0.m(sb, this.accessibilityText, ", available=", this.available, ")");
    }
}
