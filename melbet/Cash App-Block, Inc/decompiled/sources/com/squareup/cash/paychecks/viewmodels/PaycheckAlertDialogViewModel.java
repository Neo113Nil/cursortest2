package com.squareup.cash.paychecks.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PaycheckAlertDialogViewModel {
    public final String message;
    public final Button primaryButton;
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

    public PaycheckAlertDialogViewModel(String str, String str2, Button button) {
        str2.getClass();
        this.title = str;
        this.message = str2;
        this.primaryButton = button;
    }
}
