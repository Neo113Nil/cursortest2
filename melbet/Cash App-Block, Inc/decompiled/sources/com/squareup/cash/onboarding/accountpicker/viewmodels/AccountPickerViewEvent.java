package com.squareup.cash.onboarding.accountpicker.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class AccountPickerViewEvent {

    public final class AccountSelected extends AccountPickerViewEvent {
        public final String accountToken;

        public AccountSelected(String str) {
            this.accountToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AccountSelected) && this.accountToken.equals(((AccountSelected) obj).accountToken);
        }

        public final int hashCode() {
            return this.accountToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AccountSelected(accountToken=", this.accountToken, ")");
        }
    }

    public final class CancelAccountRemoval extends AccountPickerViewEvent {
        public final String accountToken;

        public CancelAccountRemoval(String str) {
            str.getClass();
            this.accountToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CancelAccountRemoval) && Intrinsics.areEqual(this.accountToken, ((CancelAccountRemoval) obj).accountToken);
        }

        public final int hashCode() {
            return this.accountToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CancelAccountRemoval(accountToken=", this.accountToken, ")");
        }
    }

    public final class ConfirmAccountRemoval extends AccountPickerViewEvent {
        public final String accountToken;

        public ConfirmAccountRemoval(String str) {
            str.getClass();
            this.accountToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfirmAccountRemoval) && Intrinsics.areEqual(this.accountToken, ((ConfirmAccountRemoval) obj).accountToken);
        }

        public final int hashCode() {
            return this.accountToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ConfirmAccountRemoval(accountToken=", this.accountToken, ")");
        }
    }

    public final class DisableEditMode extends AccountPickerViewEvent {
        public static final DisableEditMode INSTANCE = new DisableEditMode();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DisableEditMode);
        }

        public final int hashCode() {
            return -379027604;
        }

        public final String toString() {
            return "DisableEditMode";
        }
    }

    public final class EnableEditMode extends AccountPickerViewEvent {
        public static final EnableEditMode INSTANCE = new EnableEditMode();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EnableEditMode);
        }

        public final int hashCode() {
            return -801573639;
        }

        public final String toString() {
            return "EnableEditMode";
        }
    }

    public final class Exit extends AccountPickerViewEvent {
        public static final Exit INSTANCE = new Exit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return 758413287;
        }

        public final String toString() {
            return "Exit";
        }
    }

    public final class OpenOptionsMenu extends AccountPickerViewEvent {
        public static final OpenOptionsMenu INSTANCE = new OpenOptionsMenu();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenOptionsMenu);
        }

        public final int hashCode() {
            return -1443268086;
        }

        public final String toString() {
            return "OpenOptionsMenu";
        }
    }

    public final class RemoveAccount extends AccountPickerViewEvent {
        public final String accountToken;

        public RemoveAccount(String str) {
            this.accountToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoveAccount) && this.accountToken.equals(((RemoveAccount) obj).accountToken);
        }

        public final int hashCode() {
            return this.accountToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RemoveAccount(accountToken=", this.accountToken, ")");
        }
    }

    public final class SkipAccountSelection extends AccountPickerViewEvent {
        public static final SkipAccountSelection INSTANCE = new SkipAccountSelection();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SkipAccountSelection);
        }

        public final int hashCode() {
            return 93880903;
        }

        public final String toString() {
            return "SkipAccountSelection";
        }
    }
}
