package com.squareup.cash.activity.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public interface BalanceFeedViewEvent {

    public final class Exit implements BalanceFeedViewEvent {
        public static final Exit INSTANCE = new Exit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return 44533791;
        }

        public final String toString() {
            return "Exit";
        }
    }

    public final class ToggleInfoSheet implements BalanceFeedViewEvent {
        public final boolean open;

        public ToggleInfoSheet(boolean z) {
            this.open = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToggleInfoSheet) && this.open == ((ToggleInfoSheet) obj).open;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.open);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("ToggleInfoSheet(open=", ")", this.open);
        }
    }
}
