package com.squareup.cash.prepurchasecashcard.viewmodels;

import androidx.credentials.Credential;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PrepurchaseCashCardPlanningViewModel$PrepurchaseCardHomeSheet$InfoRowAction$ShowInfo extends Credential {
    public final PrepurchaseCashCardPlanningViewModel.PrepurchaseCardInfoSheet infoSheet;

    public PrepurchaseCashCardPlanningViewModel$PrepurchaseCardHomeSheet$InfoRowAction$ShowInfo(PrepurchaseCashCardPlanningViewModel.PrepurchaseCardInfoSheet prepurchaseCardInfoSheet) {
        super(PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet.ActionIconStyle.LEADING_INFO);
        this.infoSheet = prepurchaseCardInfoSheet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrepurchaseCashCardPlanningViewModel$PrepurchaseCardHomeSheet$InfoRowAction$ShowInfo) && Intrinsics.areEqual(this.infoSheet, ((PrepurchaseCashCardPlanningViewModel$PrepurchaseCardHomeSheet$InfoRowAction$ShowInfo) obj).infoSheet);
    }

    public final int hashCode() {
        return this.infoSheet.hashCode();
    }

    public final String toString() {
        return "ShowInfo(infoSheet=" + this.infoSheet + ")";
    }
}
