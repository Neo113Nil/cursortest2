package com.squareup.cash.instruments.viewmodels;

import com.squareup.cash.instruments.screens.TransferOptionPickerSelection;

/* loaded from: classes6.dex */
public interface TransferOptionPickerViewEvent {

    public final class ContinueTapped implements TransferOptionPickerViewEvent {
        public static final ContinueTapped INSTANCE = new ContinueTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ContinueTapped);
        }

        public final int hashCode() {
            return 2052245893;
        }

        public final String toString() {
            return "ContinueTapped";
        }
    }

    public final class Dismissed implements TransferOptionPickerViewEvent {
        public static final Dismissed INSTANCE = new Dismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismissed);
        }

        public final int hashCode() {
            return 2128381431;
        }

        public final String toString() {
            return "Dismissed";
        }
    }

    public final class OptionTapped implements TransferOptionPickerViewEvent {
        public final TransferOptionPickerSelection selection;

        public OptionTapped(TransferOptionPickerSelection transferOptionPickerSelection) {
            this.selection = transferOptionPickerSelection;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OptionTapped) && this.selection.equals(((OptionTapped) obj).selection);
        }

        public final int hashCode() {
            return this.selection.hashCode();
        }

        public final String toString() {
            return "OptionTapped(selection=" + this.selection + ")";
        }
    }
}
