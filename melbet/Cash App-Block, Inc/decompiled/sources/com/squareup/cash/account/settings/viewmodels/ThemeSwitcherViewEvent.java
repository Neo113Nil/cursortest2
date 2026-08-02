package com.squareup.cash.account.settings.viewmodels;

import com.squareup.cash.paymentpad.viewmodels.PaymentPadTheme;

/* loaded from: classes5.dex */
public interface ThemeSwitcherViewEvent {

    public final class AnimationComplete implements ThemeSwitcherViewEvent {
        public static final AnimationComplete INSTANCE = new AnimationComplete();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AnimationComplete);
        }

        public final int hashCode() {
            return 1238509825;
        }

        public final String toString() {
            return "AnimationComplete";
        }
    }

    public final class Done implements ThemeSwitcherViewEvent {
        public static final Done INSTANCE = new Done();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Done);
        }

        public final int hashCode() {
            return -945619746;
        }

        public final String toString() {
            return "Done";
        }
    }

    public final class Exit implements ThemeSwitcherViewEvent {
        public static final Exit INSTANCE = new Exit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return -945581446;
        }

        public final String toString() {
            return "Exit";
        }
    }

    public final class Retry implements ThemeSwitcherViewEvent {
        public static final Retry INSTANCE = new Retry();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Retry);
        }

        public final int hashCode() {
            return 763196620;
        }

        public final String toString() {
            return "Retry";
        }
    }

    public final class SelectTheme implements ThemeSwitcherViewEvent {
        public final PaymentPadTheme theme;

        public SelectTheme(PaymentPadTheme paymentPadTheme) {
            this.theme = paymentPadTheme;
        }
    }
}
