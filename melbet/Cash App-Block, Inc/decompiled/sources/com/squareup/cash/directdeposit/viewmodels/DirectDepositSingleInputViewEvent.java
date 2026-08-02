package com.squareup.cash.directdeposit.viewmodels;

import app.cash.inputfieldtext.composeui.TextFieldStateInputFieldText;

/* loaded from: classes6.dex */
public interface DirectDepositSingleInputViewEvent {

    public final class ButtonClick implements DirectDepositSingleInputViewEvent {
        public static final ButtonClick INSTANCE = new ButtonClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ButtonClick);
        }

        public final int hashCode() {
            return -1619872036;
        }

        public final String toString() {
            return "ButtonClick";
        }
    }

    public final class InputChanged implements DirectDepositSingleInputViewEvent {
        public final TextFieldStateInputFieldText inputFieldText;

        public InputChanged(TextFieldStateInputFieldText textFieldStateInputFieldText) {
            this.inputFieldText = textFieldStateInputFieldText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InputChanged) && this.inputFieldText.equals(((InputChanged) obj).inputFieldText);
        }

        public final int hashCode() {
            return this.inputFieldText.textFieldState.hashCode();
        }

        public final String toString() {
            return "InputChanged(inputFieldText=" + this.inputFieldText + ")";
        }
    }

    public final class NavigationIconClick implements DirectDepositSingleInputViewEvent {
        public static final NavigationIconClick INSTANCE = new NavigationIconClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigationIconClick);
        }

        public final int hashCode() {
            return -945800127;
        }

        public final String toString() {
            return "NavigationIconClick";
        }
    }
}
