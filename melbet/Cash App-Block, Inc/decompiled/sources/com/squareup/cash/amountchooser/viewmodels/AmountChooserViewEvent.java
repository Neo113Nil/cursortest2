package com.squareup.cash.amountchooser.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class AmountChooserViewEvent {

    public final class Expanded extends AmountChooserViewEvent {
        public static final Expanded INSTANCE = new Expanded();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Expanded);
        }

        public final int hashCode() {
            return -1494195341;
        }

        public final String toString() {
            return "Expanded";
        }
    }

    /* loaded from: classes10.dex */
    public final class KeypadAmountChanged extends AmountChooserViewEvent {
        public final String rawNewAmount;

        public KeypadAmountChanged(String str) {
            this.rawNewAmount = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof KeypadAmountChanged) && this.rawNewAmount.equals(((KeypadAmountChanged) obj).rawNewAmount);
        }

        public final int hashCode() {
            return this.rawNewAmount.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("KeypadAmountChanged(rawNewAmount=", this.rawNewAmount, ")");
        }
    }

    /* loaded from: classes10.dex */
    public final class TapAmountSelectorOption extends AmountChooserViewEvent {
        public final AmountSelectorOption amountSelectorOption;

        public TapAmountSelectorOption(AmountSelectorOption amountSelectorOption) {
            amountSelectorOption.getClass();
            this.amountSelectorOption = amountSelectorOption;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TapAmountSelectorOption) && Intrinsics.areEqual(this.amountSelectorOption, ((TapAmountSelectorOption) obj).amountSelectorOption);
        }

        public final int hashCode() {
            return this.amountSelectorOption.hashCode();
        }

        public final String toString() {
            return "TapAmountSelectorOption(amountSelectorOption=" + this.amountSelectorOption + ")";
        }
    }

    public final class TapConfigButton extends AmountChooserViewEvent {
        public static final TapConfigButton INSTANCE = new TapConfigButton();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapConfigButton);
        }

        public final int hashCode() {
            return -150701987;
        }

        public final String toString() {
            return "TapConfigButton";
        }
    }

    public final class TapDismiss extends AmountChooserViewEvent {
        public static final TapDismiss INSTANCE = new TapDismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapDismiss);
        }

        public final int hashCode() {
            return -1530450527;
        }

        public final String toString() {
            return "TapDismiss";
        }
    }

    /* loaded from: classes7.dex */
    public final class TapPrimaryButton extends AmountChooserViewEvent {
        public static final TapPrimaryButton INSTANCE = new TapPrimaryButton();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapPrimaryButton);
        }

        public final int hashCode() {
            return -1109875285;
        }

        public final String toString() {
            return "TapPrimaryButton";
        }
    }

    public final class TapSecondaryButton extends AmountChooserViewEvent {
        public static final TapSecondaryButton INSTANCE = new TapSecondaryButton();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapSecondaryButton);
        }

        public final int hashCode() {
            return -39579171;
        }

        public final String toString() {
            return "TapSecondaryButton";
        }
    }
}
