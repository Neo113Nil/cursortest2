package com.squareup.cash.banking.viewmodels;

/* loaded from: classes5.dex */
public interface DemandDepositDialogViewEvent {

    public final class TapPrimaryButton implements DemandDepositDialogViewEvent {
        public static final TapPrimaryButton INSTANCE = new TapPrimaryButton();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapPrimaryButton);
        }

        public final int hashCode() {
            return -1673886464;
        }

        public final String toString() {
            return "TapPrimaryButton";
        }
    }

    public final class TapSecondaryButton implements DemandDepositDialogViewEvent {
        public static final TapSecondaryButton INSTANCE = new TapSecondaryButton();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapSecondaryButton);
        }

        public final int hashCode() {
            return -888442894;
        }

        public final String toString() {
            return "TapSecondaryButton";
        }
    }
}
