package com.squareup.cash.savings.viewmodels;

import androidx.core.view.ViewGroupKt;
import com.squareup.cash.savings.backend.api.model.SavingsCard;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.analytics.CdfEvent;

/* loaded from: classes7.dex */
public final class SavingsHeaderEvent$InformationClicked extends ViewGroupKt {
    public final SavingsCard card;
    public final CdfEvent cdfEvent;

    public SavingsHeaderEvent$InformationClicked(SavingsCard savingsCard, CdfEvent cdfEvent) {
        savingsCard.getClass();
        this.card = savingsCard;
        this.cdfEvent = cdfEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavingsHeaderEvent$InformationClicked)) {
            return false;
        }
        SavingsHeaderEvent$InformationClicked savingsHeaderEvent$InformationClicked = (SavingsHeaderEvent$InformationClicked) obj;
        return Intrinsics.areEqual(this.card, savingsHeaderEvent$InformationClicked.card) && Intrinsics.areEqual(this.cdfEvent, savingsHeaderEvent$InformationClicked.cdfEvent);
    }

    public final int hashCode() {
        int hashCode = this.card.hashCode() * 31;
        CdfEvent cdfEvent = this.cdfEvent;
        return hashCode + (cdfEvent == null ? 0 : cdfEvent.hashCode());
    }

    public final String toString() {
        return "InformationClicked(card=" + this.card + ", cdfEvent=" + this.cdfEvent + ")";
    }
}
