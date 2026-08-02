package com.squareup.cash.banking.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface RecurringDepositsViewEvent {

    public final class BalanceBasedLockedConfirmedClick implements RecurringDepositsViewEvent {
        public final String route;

        public BalanceBasedLockedConfirmedClick(String str) {
            str.getClass();
            this.route = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BalanceBasedLockedConfirmedClick) && Intrinsics.areEqual(this.route, ((BalanceBasedLockedConfirmedClick) obj).route);
        }

        public final int hashCode() {
            return this.route.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BalanceBasedLockedConfirmedClick(route=", this.route, ")");
        }
    }

    public final class BalanceBasedOptionClick implements RecurringDepositsViewEvent {
        public static final BalanceBasedOptionClick INSTANCE = new BalanceBasedOptionClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BalanceBasedOptionClick);
        }

        public final int hashCode() {
            return -1837666826;
        }

        public final String toString() {
            return "BalanceBasedOptionClick";
        }
    }

    public final class ExitFlow implements RecurringDepositsViewEvent {
        public static final ExitFlow INSTANCE = new ExitFlow();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ExitFlow);
        }

        public final int hashCode() {
            return 588464146;
        }

        public final String toString() {
            return "ExitFlow";
        }
    }

    public final class LearnMoreHelpClick implements RecurringDepositsViewEvent {
        public static final LearnMoreHelpClick INSTANCE = new LearnMoreHelpClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LearnMoreHelpClick);
        }

        public final int hashCode() {
            return -1816648652;
        }

        public final String toString() {
            return "LearnMoreHelpClick";
        }
    }

    public final class ScheduledOptionClick implements RecurringDepositsViewEvent {
        public static final ScheduledOptionClick INSTANCE = new ScheduledOptionClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ScheduledOptionClick);
        }

        public final int hashCode() {
            return 1839529676;
        }

        public final String toString() {
            return "ScheduledOptionClick";
        }
    }
}
