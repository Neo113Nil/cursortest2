package com.squareup.cash.card.onboarding;

import com.squareup.cash.card.onboarding.CardStudioViewModelV2;

/* loaded from: classes6.dex */
public final class CardStudioViewEventV2$ModeTransition$Enter implements CardStudioViewEventV2 {
    public final CardStudioViewModelV2.CustomizationMode mode;

    public CardStudioViewEventV2$ModeTransition$Enter(CardStudioViewModelV2.CustomizationMode customizationMode) {
        this.mode = customizationMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardStudioViewEventV2$ModeTransition$Enter) && this.mode.equals(((CardStudioViewEventV2$ModeTransition$Enter) obj).mode);
    }

    public final int hashCode() {
        return this.mode.hashCode();
    }

    public final String toString() {
        return "Enter(mode=" + this.mode + ")";
    }
}
