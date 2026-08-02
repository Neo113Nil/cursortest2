package com.squareup.cash.shopping.autofill.viewmodels;

import com.squareup.cash.shopping.autofill.viewmodels.InputViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface EditAutofillViewEvent {

    public final class BackClicked implements EditAutofillViewEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return -84591660;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    public final class CtaButtonClicked implements EditAutofillViewEvent {
        public static final CtaButtonClicked INSTANCE = new CtaButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CtaButtonClicked);
        }

        public final int hashCode() {
            return 585092689;
        }

        public final String toString() {
            return "CtaButtonClicked";
        }
    }

    public final class DiscardChangesAccepted implements EditAutofillViewEvent {
        public static final DiscardChangesAccepted INSTANCE = new DiscardChangesAccepted();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DiscardChangesAccepted);
        }

        public final int hashCode() {
            return 2004800504;
        }

        public final String toString() {
            return "DiscardChangesAccepted";
        }
    }

    public final class DiscardChangesDismissed implements EditAutofillViewEvent {
        public final String errorTitle;

        public DiscardChangesDismissed(String str) {
            str.getClass();
            this.errorTitle = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DiscardChangesDismissed) && Intrinsics.areEqual(this.errorTitle, ((DiscardChangesDismissed) obj).errorTitle);
        }

        public final int hashCode() {
            return this.errorTitle.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DiscardChangesDismissed(errorTitle=", this.errorTitle, ")");
        }
    }

    public final class ErrorCloseClicked implements EditAutofillViewEvent {
        public static final ErrorCloseClicked INSTANCE = new ErrorCloseClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ErrorCloseClicked);
        }

        public final int hashCode() {
            return 351754443;
        }

        public final String toString() {
            return "ErrorCloseClicked";
        }
    }

    public final class ErrorCtaButtonClicked implements EditAutofillViewEvent {
        public static final ErrorCtaButtonClicked INSTANCE = new ErrorCtaButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ErrorCtaButtonClicked);
        }

        public final int hashCode() {
            return -935369695;
        }

        public final String toString() {
            return "ErrorCtaButtonClicked";
        }
    }

    public final class InputChanged implements EditAutofillViewEvent {
        public final String newValue;

        /* renamed from: type, reason: collision with root package name */
        public final InputViewModel.InputType f1200type;

        public InputChanged(InputViewModel.InputType inputType, String str) {
            inputType.getClass();
            str.getClass();
            this.f1200type = inputType;
            this.newValue = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InputChanged)) {
                return false;
            }
            InputChanged inputChanged = (InputChanged) obj;
            return this.f1200type == inputChanged.f1200type && Intrinsics.areEqual(this.newValue, inputChanged.newValue);
        }

        public final int hashCode() {
            return this.newValue.hashCode() + (this.f1200type.hashCode() * 31);
        }

        public final String toString() {
            return "InputChanged(type=" + this.f1200type + ", newValue=" + this.newValue + ")";
        }
    }

    public final class InputDropdownSelection implements EditAutofillViewEvent {
        public final String newValue;

        /* renamed from: type, reason: collision with root package name */
        public final InputViewModel.InputType f1201type;

        public InputDropdownSelection(InputViewModel.InputType inputType, String str) {
            inputType.getClass();
            str.getClass();
            this.f1201type = inputType;
            this.newValue = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InputDropdownSelection)) {
                return false;
            }
            InputDropdownSelection inputDropdownSelection = (InputDropdownSelection) obj;
            return this.f1201type == inputDropdownSelection.f1201type && Intrinsics.areEqual(this.newValue, inputDropdownSelection.newValue);
        }

        public final int hashCode() {
            return this.newValue.hashCode() + (this.f1201type.hashCode() * 31);
        }

        public final String toString() {
            return "InputDropdownSelection(type=" + this.f1201type + ", newValue=" + this.newValue + ")";
        }
    }

    public final class SuccessAnimationCompleted implements EditAutofillViewEvent {
        public static final SuccessAnimationCompleted INSTANCE = new SuccessAnimationCompleted();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SuccessAnimationCompleted);
        }

        public final int hashCode() {
            return 1935530014;
        }

        public final String toString() {
            return "SuccessAnimationCompleted";
        }
    }
}
