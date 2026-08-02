package com.squareup.cash.card.onboarding;

import com.squareup.protos.franklin.api.CardPresentationStyle;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class StyledCardWidgetViewModel {
    public final CardPresentationStyle cardPresentationStyle;
    public final boolean disableFilament;
    public final StyledCardViewModel styledCardViewModel;

    public StyledCardWidgetViewModel(StyledCardViewModel styledCardViewModel, CardPresentationStyle cardPresentationStyle, boolean z) {
        cardPresentationStyle.getClass();
        this.styledCardViewModel = styledCardViewModel;
        this.cardPresentationStyle = cardPresentationStyle;
        this.disableFilament = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StyledCardWidgetViewModel)) {
            return false;
        }
        StyledCardWidgetViewModel styledCardWidgetViewModel = (StyledCardWidgetViewModel) obj;
        return this.styledCardViewModel.equals(styledCardWidgetViewModel.styledCardViewModel) && this.cardPresentationStyle == styledCardWidgetViewModel.cardPresentationStyle && this.disableFilament == styledCardWidgetViewModel.disableFilament;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.disableFilament) + ((this.cardPresentationStyle.hashCode() + (this.styledCardViewModel.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StyledCardWidgetViewModel(styledCardViewModel=");
        sb.append(this.styledCardViewModel);
        sb.append(", cardPresentationStyle=");
        sb.append(this.cardPresentationStyle);
        sb.append(", disableFilament=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.disableFilament, ")");
    }
}
