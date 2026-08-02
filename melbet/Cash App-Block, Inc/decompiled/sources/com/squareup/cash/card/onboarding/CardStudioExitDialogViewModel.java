package com.squareup.cash.card.onboarding;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CardStudioExitDialogViewModel {
    public final String exitButton;
    public final String message;
    public final String stayButton;
    public final String title;

    public CardStudioExitDialogViewModel(String str, String str2, String str3, String str4) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
        this.title = str;
        this.message = str2;
        this.exitButton = str3;
        this.stayButton = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardStudioExitDialogViewModel)) {
            return false;
        }
        CardStudioExitDialogViewModel cardStudioExitDialogViewModel = (CardStudioExitDialogViewModel) obj;
        return Intrinsics.areEqual(this.title, cardStudioExitDialogViewModel.title) && Intrinsics.areEqual(this.message, cardStudioExitDialogViewModel.message) && Intrinsics.areEqual(this.exitButton, cardStudioExitDialogViewModel.exitButton) && Intrinsics.areEqual(this.stayButton, cardStudioExitDialogViewModel.stayButton);
    }

    public final int hashCode() {
        return this.stayButton.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message), 31, this.exitButton);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CardStudioExitDialogViewModel(title=", this.title, ", message=", this.message, ", exitButton="), this.exitButton, ", stayButton=", this.stayButton, ")");
    }
}
