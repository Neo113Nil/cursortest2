package com.squareup.cash.banking.viewmodels;

import com.squareup.protos.franklin.api.ClientScenario;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BankingDialogViewModel {
    public final String message;
    public final Button primaryButton;
    public final Button secondaryButton;
    public final String title;

    public final class Button {
        public final ClientScenario clientScenario;
        public final String text;

        public Button(ClientScenario clientScenario, String str) {
            str.getClass();
            this.text = str;
            this.clientScenario = clientScenario;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.areEqual(this.text, button.text) && this.clientScenario == button.clientScenario;
        }

        public final int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            ClientScenario clientScenario = this.clientScenario;
            return hashCode + (clientScenario == null ? 0 : clientScenario.hashCode());
        }

        public final String toString() {
            return "Button(text=" + this.text + ", clientScenario=" + this.clientScenario + ")";
        }
    }

    public BankingDialogViewModel(String str, String str2, Button button, Button button2) {
        this.title = str;
        this.message = str2;
        this.primaryButton = button;
        this.secondaryButton = button2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BankingDialogViewModel)) {
            return false;
        }
        BankingDialogViewModel bankingDialogViewModel = (BankingDialogViewModel) obj;
        return Intrinsics.areEqual(this.title, bankingDialogViewModel.title) && Intrinsics.areEqual(this.message, bankingDialogViewModel.message) && this.primaryButton.equals(bankingDialogViewModel.primaryButton) && Intrinsics.areEqual(this.secondaryButton, bankingDialogViewModel.secondaryButton);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int hashCode2 = (this.primaryButton.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Button button = this.secondaryButton;
        return hashCode2 + (button != null ? button.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BankingDialogViewModel(title=", this.title, ", message=", this.message, ", primaryButton=");
        m.append(this.primaryButton);
        m.append(", secondaryButton=");
        m.append(this.secondaryButton);
        m.append(")");
        return m.toString();
    }
}
