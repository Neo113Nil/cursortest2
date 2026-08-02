package com.squareup.cash.prepurchasecashcard.presenters;

import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PrepurchaseCardPlanningState {

    public final class HomeState implements PrepurchaseCardPlanningState {
        public static final HomeState INSTANCE = new HomeState();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HomeState);
        }

        public final int hashCode() {
            return -1266529074;
        }

        public final String toString() {
            return "HomeState";
        }
    }

    public final class InfoState implements PrepurchaseCardPlanningState {
        public final PrepurchaseCashCardPlanningViewModel.PrepurchaseCardInfoSheet infoSheet;

        public InfoState(PrepurchaseCashCardPlanningViewModel.PrepurchaseCardInfoSheet prepurchaseCardInfoSheet) {
            prepurchaseCardInfoSheet.getClass();
            this.infoSheet = prepurchaseCardInfoSheet;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InfoState) && Intrinsics.areEqual(this.infoSheet, ((InfoState) obj).infoSheet);
        }

        public final int hashCode() {
            return this.infoSheet.hashCode();
        }

        public final String toString() {
            return "InfoState(infoSheet=" + this.infoSheet + ")";
        }
    }

    public final class SelectPaymentPlanState implements PrepurchaseCardPlanningState {
        public static final SelectPaymentPlanState INSTANCE = new SelectPaymentPlanState();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SelectPaymentPlanState);
        }

        public final int hashCode() {
            return -1472897982;
        }

        public final String toString() {
            return "SelectPaymentPlanState";
        }
    }
}
