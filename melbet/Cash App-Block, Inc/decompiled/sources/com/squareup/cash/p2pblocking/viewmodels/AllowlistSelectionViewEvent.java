package com.squareup.cash.p2pblocking.viewmodels;

import app.cash.inputfieldtext.composeui.TextFieldStateInputFieldText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface AllowlistSelectionViewEvent {

    public final class CancelSkip implements AllowlistSelectionViewEvent {
        public static final CancelSkip INSTANCE = new CancelSkip();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CancelSkip);
        }

        public final int hashCode() {
            return 1664548281;
        }

        public final String toString() {
            return "CancelSkip";
        }
    }

    public final class ChangeSearchText implements AllowlistSelectionViewEvent {
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

    public final class ConfirmSkip implements AllowlistSelectionViewEvent {
        public static final ConfirmSkip INSTANCE = new ConfirmSkip();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConfirmSkip);
        }

        public final int hashCode() {
            return 1988751807;
        }

        public final String toString() {
            return "ConfirmSkip";
        }
    }

    public final class DismissDialog implements AllowlistSelectionViewEvent {
        public static final DismissDialog INSTANCE = new DismissDialog();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissDialog);
        }

        public final int hashCode() {
            return -566934062;
        }

        public final String toString() {
            return "DismissDialog";
        }
    }

    public final class TapBack implements AllowlistSelectionViewEvent {
        public static final TapBack INSTANCE = new TapBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapBack);
        }

        public final int hashCode() {
            return 841314442;
        }

        public final String toString() {
            return "TapBack";
        }
    }

    public final class TapClose implements AllowlistSelectionViewEvent {
        public static final TapClose INSTANCE = new TapClose();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapClose);
        }

        public final int hashCode() {
            return 312207029;
        }

        public final String toString() {
            return "TapClose";
        }
    }

    public final class TapContinue implements AllowlistSelectionViewEvent {
        public static final TapContinue INSTANCE = new TapContinue();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapContinue);
        }

        public final int hashCode() {
            return 695471818;
        }

        public final String toString() {
            return "TapContinue";
        }
    }

    public final class TapCustomerAvatar implements AllowlistSelectionViewEvent {
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

    public final class TapCustomerButton implements AllowlistSelectionViewEvent {
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

    public final class TapSafetyResources implements AllowlistSelectionViewEvent {
        public static final TapSafetyResources INSTANCE = new TapSafetyResources();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapSafetyResources);
        }

        public final int hashCode() {
            return -681620496;
        }

        public final String toString() {
            return "TapSafetyResources";
        }
    }
}
