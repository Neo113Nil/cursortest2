package com.squareup.cash.bitcoin.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public interface BitcoinPayInUsdSettingsViewEvent {

    public final class BackClick implements BitcoinPayInUsdSettingsViewEvent {
        public static final BackClick INSTANCE = new BackClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClick);
        }

        public final int hashCode() {
            return 784162795;
        }

        public final String toString() {
            return "BackClick";
        }
    }

    public final class ToggleClick implements BitcoinPayInUsdSettingsViewEvent {
        public final boolean enabled;

        public ToggleClick(boolean z) {
            this.enabled = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToggleClick) && this.enabled == ((ToggleClick) obj).enabled;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.enabled);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("ToggleClick(enabled=", ")", this.enabled);
        }
    }
}
