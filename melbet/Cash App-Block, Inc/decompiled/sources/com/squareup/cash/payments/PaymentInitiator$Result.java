package com.squareup.cash.payments;

import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public abstract class PaymentInitiator$Result {

    public final class ConfirmDuplicate extends PaymentInitiator$Result {
        public static final ConfirmDuplicate INSTANCE = new ConfirmDuplicate();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConfirmDuplicate);
        }

        public final int hashCode() {
            return -1116228282;
        }

        public final String toString() {
            return "ConfirmDuplicate";
        }
    }

    public final class InitiatePayment extends PaymentInitiator$Result {
        public final Screen screen;

        public InitiatePayment(Screen screen) {
            this.screen = screen;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitiatePayment) && this.screen.equals(((InitiatePayment) obj).screen);
        }

        public final int hashCode() {
            return this.screen.hashCode();
        }

        public final String toString() {
            return re$$ExternalSyntheticOutline0.m(this.screen, "InitiatePayment(screen=", ")");
        }
    }

    public final class LongerNote extends PaymentInitiator$Result {
        public static final LongerNote INSTANCE = new LongerNote();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LongerNote);
        }

        public final int hashCode() {
            return 692638486;
        }

        public final String toString() {
            return "LongerNote";
        }
    }

    public final class SelectCard extends PaymentInitiator$Result {
        public static final SelectCard INSTANCE = new SelectCard();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SelectCard);
        }

        public final int hashCode() {
            return -809693817;
        }

        public final String toString() {
            return "SelectCard";
        }
    }
}
