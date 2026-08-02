package com.squareup.cash.card.onboarding;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CardStudioMoreSheetViewModel {
    public final String cashtag;
    public final boolean isShowingCashtag;
    public final boolean isShowingCashtagToggle;

    public CardStudioMoreSheetViewModel(String str, boolean z, boolean z2) {
        str.getClass();
        this.cashtag = str;
        this.isShowingCashtag = z;
        this.isShowingCashtagToggle = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardStudioMoreSheetViewModel)) {
            return false;
        }
        CardStudioMoreSheetViewModel cardStudioMoreSheetViewModel = (CardStudioMoreSheetViewModel) obj;
        return Intrinsics.areEqual(this.cashtag, cardStudioMoreSheetViewModel.cashtag) && this.isShowingCashtag == cardStudioMoreSheetViewModel.isShowingCashtag && this.isShowingCashtagToggle == cardStudioMoreSheetViewModel.isShowingCashtagToggle;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isShowingCashtagToggle) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.cashtag.hashCode() * 31, 31, this.isShowingCashtag);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Request$Priority$EnumUnboxingLocalUtility.m1540m("CardStudioMoreSheetViewModel(cashtag=", this.cashtag, ", isShowingCashtag=", ", isShowingCashtagToggle=", this.isShowingCashtag), this.isShowingCashtagToggle, ")");
    }
}
