package com.squareup.cash.account.settings.viewmodels;

/* loaded from: classes7.dex */
public interface UnsupportedSettingViewEvent {

    public final class CloseClicked implements UnsupportedSettingViewEvent {
        public static final CloseClicked INSTANCE = new CloseClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseClicked);
        }

        public final int hashCode() {
            return -1422460182;
        }

        public final String toString() {
            return "CloseClicked";
        }
    }

    public final class SwitchAccountsClicked implements UnsupportedSettingViewEvent {
        public static final SwitchAccountsClicked INSTANCE = new SwitchAccountsClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SwitchAccountsClicked);
        }

        public final int hashCode() {
            return 1116429842;
        }

        public final String toString() {
            return "SwitchAccountsClicked";
        }
    }
}
