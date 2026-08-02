package com.squareup.cash.card.onboarding;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CardStudioUndoDialogViewModel {
    public final String cancelButton;
    public final String message;
    public final String title;
    public final String undoButton;

    public CardStudioUndoDialogViewModel(String str, String str2, String str3, String str4) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
        this.title = str;
        this.message = str2;
        this.undoButton = str3;
        this.cancelButton = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardStudioUndoDialogViewModel)) {
            return false;
        }
        CardStudioUndoDialogViewModel cardStudioUndoDialogViewModel = (CardStudioUndoDialogViewModel) obj;
        return Intrinsics.areEqual(this.title, cardStudioUndoDialogViewModel.title) && Intrinsics.areEqual(this.message, cardStudioUndoDialogViewModel.message) && Intrinsics.areEqual(this.undoButton, cardStudioUndoDialogViewModel.undoButton) && Intrinsics.areEqual(this.cancelButton, cardStudioUndoDialogViewModel.cancelButton);
    }

    public final int hashCode() {
        return this.cancelButton.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message), 31, this.undoButton);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CardStudioUndoDialogViewModel(title=", this.title, ", message=", this.message, ", undoButton="), this.undoButton, ", cancelButton=", this.cancelButton, ")");
    }
}
