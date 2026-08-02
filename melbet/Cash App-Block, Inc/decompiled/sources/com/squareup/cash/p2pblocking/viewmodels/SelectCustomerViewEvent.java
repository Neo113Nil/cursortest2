package com.squareup.cash.p2pblocking.viewmodels;

import app.cash.inputfieldtext.composeui.TextFieldStateInputFieldText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface SelectCustomerViewEvent {

    public final class ChangeSearchText implements SelectCustomerViewEvent {
        public final TextFieldStateInputFieldText text;

        public ChangeSearchText(TextFieldStateInputFieldText textFieldStateInputFieldText) {
            this.text = textFieldStateInputFieldText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeSearchText) && this.text.equals(((ChangeSearchText) obj).text);
        }

        public final int hashCode() {
            return this.text.textFieldState.hashCode();
        }

        public final String toString() {
            return "ChangeSearchText(text=" + this.text + ")";
        }
    }

    public final class DismissDialog implements SelectCustomerViewEvent {
        public static final DismissDialog INSTANCE = new DismissDialog();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissDialog);
        }

        public final int hashCode() {
            return 1478954525;
        }

        public final String toString() {
            return "DismissDialog";
        }
    }

    public final class TapBack implements SelectCustomerViewEvent {
        public static final TapBack INSTANCE = new TapBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapBack);
        }

        public final int hashCode() {
            return -705032939;
        }

        public final String toString() {
            return "TapBack";
        }
    }

    public final class TapClose implements SelectCustomerViewEvent {
        public static final TapClose INSTANCE = new TapClose();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapClose);
        }

        public final int hashCode() {
            return -379921526;
        }

        public final String toString() {
            return "TapClose";
        }
    }

    public final class TapContinue implements SelectCustomerViewEvent {
        public static final TapContinue INSTANCE = new TapContinue();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapContinue);
        }

        public final int hashCode() {
            return 1631677909;
        }

        public final String toString() {
            return "TapContinue";
        }
    }

    public final class TapCustomerAvatar implements SelectCustomerViewEvent {
        public final P2PListRowTapAvatarEvent tapAvatarEvent;

        public TapCustomerAvatar(P2PListRowTapAvatarEvent p2PListRowTapAvatarEvent) {
            p2PListRowTapAvatarEvent.getClass();
            this.tapAvatarEvent = p2PListRowTapAvatarEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TapCustomerAvatar) && Intrinsics.areEqual(this.tapAvatarEvent, ((TapCustomerAvatar) obj).tapAvatarEvent);
        }

        public final int hashCode() {
            return this.tapAvatarEvent.customerToken.hashCode();
        }

        public final String toString() {
            return "TapCustomerAvatar(tapAvatarEvent=" + this.tapAvatarEvent + ")";
        }
    }

    public final class TapCustomerButton implements SelectCustomerViewEvent {
        public final P2PListRowTapButtonEvent tapButtonEvent;

        public TapCustomerButton(P2PListRowTapButtonEvent p2PListRowTapButtonEvent) {
            p2PListRowTapButtonEvent.getClass();
            this.tapButtonEvent = p2PListRowTapButtonEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TapCustomerButton) && Intrinsics.areEqual(this.tapButtonEvent, ((TapCustomerButton) obj).tapButtonEvent);
        }

        public final int hashCode() {
            return this.tapButtonEvent.hashCode();
        }

        public final String toString() {
            return "TapCustomerButton(tapButtonEvent=" + this.tapButtonEvent + ")";
        }
    }
}
