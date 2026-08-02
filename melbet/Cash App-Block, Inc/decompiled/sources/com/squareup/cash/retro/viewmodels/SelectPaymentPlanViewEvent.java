package com.squareup.cash.retro.viewmodels;

import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.retro.viewmodels.SelectPaymentPlanViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface SelectPaymentPlanViewEvent {

    public final class Close implements SelectPaymentPlanViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -1629408567;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class ConfirmPaymentPlan implements SelectPaymentPlanViewEvent {
        public static final ConfirmPaymentPlan INSTANCE = new ConfirmPaymentPlan();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConfirmPaymentPlan);
        }

        public final int hashCode() {
            return -1953132994;
        }

        public final String toString() {
            return "ConfirmPaymentPlan";
        }
    }

    public final class DismissHalfSheet implements SelectPaymentPlanViewEvent {
        public static final DismissHalfSheet INSTANCE = new DismissHalfSheet();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissHalfSheet);
        }

        public final int hashCode() {
            return 1303292945;
        }

        public final String toString() {
            return "DismissHalfSheet";
        }
    }

    /* loaded from: classes6.dex */
    public final class SelectOption implements SelectPaymentPlanViewEvent {
        public final int optionIndex;

        public SelectOption(int i) {
            this.optionIndex = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectOption) && this.optionIndex == ((SelectOption) obj).optionIndex;
        }

        public final int hashCode() {
            return Integer.hashCode(this.optionIndex);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.optionIndex, "SelectOption(optionIndex=", ")");
        }
    }

    public final class UpdatePaymentPlan implements SelectPaymentPlanViewEvent {
        public static final UpdatePaymentPlan INSTANCE = new UpdatePaymentPlan();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UpdatePaymentPlan);
        }

        public final int hashCode() {
            return -1340823273;
        }

        public final String toString() {
            return "UpdatePaymentPlan";
        }
    }

    public final class ViewHalfSheet implements SelectPaymentPlanViewEvent {
        public final SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet data;

        public ViewHalfSheet(SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet selectPaymentPlanHalfSheet) {
            selectPaymentPlanHalfSheet.getClass();
            this.data = selectPaymentPlanHalfSheet;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewHalfSheet) && Intrinsics.areEqual(this.data, ((ViewHalfSheet) obj).data);
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        public final String toString() {
            return "ViewHalfSheet(data=" + this.data + ")";
        }
    }
}
