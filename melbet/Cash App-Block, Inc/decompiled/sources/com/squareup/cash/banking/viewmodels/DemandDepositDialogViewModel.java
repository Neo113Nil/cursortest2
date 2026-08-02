package com.squareup.cash.banking.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class DemandDepositDialogViewModel {
    public final String message;
    public final Button primaryButton;
    public final Button secondaryButton;
    public final String title;

    public final class Button {
        public final String text;

        public Button(String str) {
            str.getClass();
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Button) && Intrinsics.areEqual(this.text, ((Button) obj).text);
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Button(text=", this.text, ")");
        }
    }

    public DemandDepositDialogViewModel(String str, String str2, Button button, Button button2) {
        str2.getClass();
        this.title = str;
        this.message = str2;
        this.primaryButton = button;
        this.secondaryButton = button2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DemandDepositDialogViewModel)) {
            return false;
        }
        DemandDepositDialogViewModel demandDepositDialogViewModel = (DemandDepositDialogViewModel) obj;
        return Intrinsics.areEqual(this.title, demandDepositDialogViewModel.title) && Intrinsics.areEqual(this.message, demandDepositDialogViewModel.message) && this.primaryButton.equals(demandDepositDialogViewModel.primaryButton) && Intrinsics.areEqual(this.secondaryButton, demandDepositDialogViewModel.secondaryButton);
    }

    public final int hashCode() {
        String str = this.title;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.message), 31, this.primaryButton.text);
        Button button = this.secondaryButton;
        return m + (button != null ? button.text.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DemandDepositDialogViewModel(title=", this.title, ", message=", this.message, ", primaryButton=");
        m.append(this.primaryButton);
        m.append(", secondaryButton=");
        m.append(this.secondaryButton);
        m.append(")");
        return m.toString();
    }
}
