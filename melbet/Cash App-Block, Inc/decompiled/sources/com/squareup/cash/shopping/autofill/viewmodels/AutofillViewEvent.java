package com.squareup.cash.shopping.autofill.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface AutofillViewEvent {

    public final class ActionButtonPressed implements AutofillViewEvent {
        public static final ActionButtonPressed INSTANCE = new ActionButtonPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ActionButtonPressed);
        }

        public final int hashCode() {
            return -216695560;
        }

        public final String toString() {
            return "ActionButtonPressed";
        }
    }

    public final class AutofillDismissed implements AutofillViewEvent {
        public static final AutofillDismissed INSTANCE = new AutofillDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AutofillDismissed);
        }

        public final int hashCode() {
            return -1488178283;
        }

        public final String toString() {
            return "AutofillDismissed";
        }
    }

    public final class EditButtonPressed implements AutofillViewEvent {
        public static final EditButtonPressed INSTANCE = new EditButtonPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EditButtonPressed);
        }

        public final int hashCode() {
            return 1396542756;
        }

        public final String toString() {
            return "EditButtonPressed";
        }
    }

    public final class ErrorDialogDismissed implements AutofillViewEvent {
        public final String errorMessage;

        public ErrorDialogDismissed(String str) {
            str.getClass();
            this.errorMessage = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ErrorDialogDismissed) && Intrinsics.areEqual(this.errorMessage, ((ErrorDialogDismissed) obj).errorMessage);
        }

        public final int hashCode() {
            return this.errorMessage.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ErrorDialogDismissed(errorMessage=", this.errorMessage, ")");
        }
    }

    public final class SuccessAnimationCompleted implements AutofillViewEvent {
        public static final SuccessAnimationCompleted INSTANCE = new SuccessAnimationCompleted();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SuccessAnimationCompleted);
        }

        public final int hashCode() {
            return 756260104;
        }

        public final String toString() {
            return "SuccessAnimationCompleted";
        }
    }
}
