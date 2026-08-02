package com.squareup.cash.account.settings.viewmodels;

import com.squareup.cash.shopping.autofill.viewmodels.InputViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ArcadeAutofillSettingsDetailViewEvent {

    public final class AutofillToggleClicked implements ArcadeAutofillSettingsDetailViewEvent {
        public static final AutofillToggleClicked INSTANCE = new AutofillToggleClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AutofillToggleClicked);
        }

        public final int hashCode() {
            return 1540689419;
        }

        public final String toString() {
            return "AutofillToggleClicked";
        }
    }

    public final class BackClicked implements ArcadeAutofillSettingsDetailViewEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return 723363882;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    public final class CtaButtonClicked implements ArcadeAutofillSettingsDetailViewEvent {
        public static final CtaButtonClicked INSTANCE = new CtaButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CtaButtonClicked);
        }

        public final int hashCode() {
            return -1445222469;
        }

        public final String toString() {
            return "CtaButtonClicked";
        }
    }

    public final class DiscardChangesAccepted implements ArcadeAutofillSettingsDetailViewEvent {
        public static final DiscardChangesAccepted INSTANCE = new DiscardChangesAccepted();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DiscardChangesAccepted);
        }

        public final int hashCode() {
            return -1513589278;
        }

        public final String toString() {
            return "DiscardChangesAccepted";
        }
    }

    public final class DiscardChangesDismissed implements ArcadeAutofillSettingsDetailViewEvent {
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

    public final class ErrorCloseClicked implements ArcadeAutofillSettingsDetailViewEvent {
        public static final ErrorCloseClicked INSTANCE = new ErrorCloseClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ErrorCloseClicked);
        }

        public final int hashCode() {
            return 1836493985;
        }

        public final String toString() {
            return "ErrorCloseClicked";
        }
    }

    public final class ErrorCtaButtonClicked implements ArcadeAutofillSettingsDetailViewEvent {
        public static final ErrorCtaButtonClicked INSTANCE = new ErrorCtaButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ErrorCtaButtonClicked);
        }

        public final int hashCode() {
            return 1722080503;
        }

        public final String toString() {
            return "ErrorCtaButtonClicked";
        }
    }

    public final class InputChanged implements ArcadeAutofillSettingsDetailViewEvent {
        public final String newValue;

        /* renamed from: type, reason: collision with root package name */
        public final InputViewModel.InputType f1038type;

        public InputChanged(InputViewModel.InputType inputType, String str) {
            inputType.getClass();
            str.getClass();
            this.f1038type = inputType;
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
            return this.f1038type == inputChanged.f1038type && Intrinsics.areEqual(this.newValue, inputChanged.newValue);
        }

        public final int hashCode() {
            return this.newValue.hashCode() + (this.f1038type.hashCode() * 31);
        }

        public final String toString() {
            return "InputChanged(type=" + this.f1038type + ", newValue=" + this.newValue + ")";
        }
    }

    public final class InputDropdownSelection implements ArcadeAutofillSettingsDetailViewEvent {
        public final String newValue;

        /* renamed from: type, reason: collision with root package name */
        public final InputViewModel.InputType f1039type;

        public InputDropdownSelection(InputViewModel.InputType inputType, String str) {
            inputType.getClass();
            str.getClass();
            this.f1039type = inputType;
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
            return this.f1039type == inputDropdownSelection.f1039type && Intrinsics.areEqual(this.newValue, inputDropdownSelection.newValue);
        }

        public final int hashCode() {
            return this.newValue.hashCode() + (this.f1039type.hashCode() * 31);
        }

        public final String toString() {
            return "InputDropdownSelection(type=" + this.f1039type + ", newValue=" + this.newValue + ")";
        }
    }

    public final class SuccessAnimationCompleted implements ArcadeAutofillSettingsDetailViewEvent {
        public static final SuccessAnimationCompleted INSTANCE = new SuccessAnimationCompleted();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SuccessAnimationCompleted);
        }

        public final int hashCode() {
            return -32573964;
        }

        public final String toString() {
            return "SuccessAnimationCompleted";
        }
    }
}
