package com.squareup.cash.blockers.viewmodels;

import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public interface ConfirmPaymentViewEvent {

    public final class BackClick implements ConfirmPaymentViewEvent {
        public final Screen screen;

        public BackClick(Screen screen) {
            this.screen = screen;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BackClick) && this.screen.equals(((BackClick) obj).screen);
        }

        public final int hashCode() {
            return this.screen.hashCode();
        }

        public final String toString() {
            return re$$ExternalSyntheticOutline0.m(this.screen, "BackClick(screen=", ")");
        }
    }

    public final class ConfirmOrNextClick implements ConfirmPaymentViewEvent {
        public static final ConfirmOrNextClick INSTANCE = new ConfirmOrNextClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConfirmOrNextClick);
        }

        public final int hashCode() {
            return -1720175251;
        }

        public final String toString() {
            return "ConfirmOrNextClick";
        }
    }

    public final class PayDuplicateClick implements ConfirmPaymentViewEvent {
        public static final PayDuplicateClick INSTANCE = new PayDuplicateClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PayDuplicateClick);
        }

        public final int hashCode() {
            return 1562521098;
        }

        public final String toString() {
            return "PayDuplicateClick";
        }
    }
}
