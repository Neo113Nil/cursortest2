package com.squareup.cash.paychecks.viewmodels;

import com.squareup.protos.cash.paychecks.api.blockers.v1.SetPaycheckAllocationAmountInputs;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public interface EditDistributionViewEvent {

    public final class Confirm implements EditDistributionViewEvent, IsSubmissionInteraction {
        public static final Confirm INSTANCE = new Confirm();
        public static final SetPaycheckAllocationAmountInputs.SubmissionInteraction interaction = SetPaycheckAllocationAmountInputs.SubmissionInteraction.SUBMISSION_INTERACTION_BUTTON_TAP_CONFIRM;

        @Override // com.squareup.cash.paychecks.viewmodels.IsSubmissionInteraction
        public final SetPaycheckAllocationAmountInputs.SubmissionInteraction getInteraction() {
            return interaction;
        }
    }

    public final class Disable implements EditDistributionViewEvent, IsSubmissionInteraction {
        public static final Disable INSTANCE = new Disable();
        public static final SetPaycheckAllocationAmountInputs.SubmissionInteraction interaction = SetPaycheckAllocationAmountInputs.SubmissionInteraction.SUBMISSION_INTERACTION_BUTTON_TAP_DISABLE;

        @Override // com.squareup.cash.paychecks.viewmodels.IsSubmissionInteraction
        public final SetPaycheckAllocationAmountInputs.SubmissionInteraction getInteraction() {
            return interaction;
        }
    }

    public final class DragWheel implements EditDistributionViewEvent, UpdateAllocationPercentage {
        public final float percentage;

        public DragWheel(float f) {
            this.percentage = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DragWheel) && Float.compare(this.percentage, ((DragWheel) obj).percentage) == 0;
        }

        @Override // com.squareup.cash.paychecks.viewmodels.UpdateAllocationPercentage
        public final float getPercentage() {
            return this.percentage;
        }

        public final int hashCode() {
            return Float.hashCode(this.percentage);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.percentage, "DragWheel(percentage=", ")");
        }
    }

    public final class EditConfiguration implements EditDistributionViewEvent, IsSubmissionInteraction {
        public static final EditConfiguration INSTANCE = new EditConfiguration();
        public static final SetPaycheckAllocationAmountInputs.SubmissionInteraction interaction = SetPaycheckAllocationAmountInputs.SubmissionInteraction.SUBMISSION_INTERACTION_CONFIGURATION_ROW_TAP;

        @Override // com.squareup.cash.paychecks.viewmodels.IsSubmissionInteraction
        public final SetPaycheckAllocationAmountInputs.SubmissionInteraction getInteraction() {
            return interaction;
        }
    }

    public final class Exit implements EditDistributionViewEvent, IsSubmissionInteraction {
        public static final Exit INSTANCE = new Exit();
        public static final SetPaycheckAllocationAmountInputs.SubmissionInteraction interaction = SetPaycheckAllocationAmountInputs.SubmissionInteraction.SUBMISSION_INTERACTION_CANCEL;

        @Override // com.squareup.cash.paychecks.viewmodels.IsSubmissionInteraction
        public final SetPaycheckAllocationAmountInputs.SubmissionInteraction getInteraction() {
            return interaction;
        }
    }

    public final class ExplanationDismissed implements EditDistributionViewEvent {
        public static final ExplanationDismissed INSTANCE = new ExplanationDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ExplanationDismissed);
        }

        public final int hashCode() {
            return -854302423;
        }

        public final String toString() {
            return "ExplanationDismissed";
        }
    }

    public final class SetCustomAllocation implements EditDistributionViewEvent {
        public static final SetCustomAllocation INSTANCE = new SetCustomAllocation();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SetCustomAllocation);
        }

        public final int hashCode() {
            return -1591269894;
        }

        public final String toString() {
            return "SetCustomAllocation";
        }
    }

    public final class SubmitUpdatedAllocationAnswer implements EditDistributionViewEvent {
        public static final SubmitUpdatedAllocationAnswer INSTANCE = new SubmitUpdatedAllocationAnswer();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SubmitUpdatedAllocationAnswer);
        }

        public final int hashCode() {
            return 286719464;
        }

        public final String toString() {
            return "SubmitUpdatedAllocationAnswer";
        }
    }

    public final class TapATMButton implements EditDistributionViewEvent, UpdateAllocationPercentage {
        public final float percentage;

        public TapATMButton(float f) {
            this.percentage = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TapATMButton) && Float.compare(this.percentage, ((TapATMButton) obj).percentage) == 0;
        }

        @Override // com.squareup.cash.paychecks.viewmodels.UpdateAllocationPercentage
        public final float getPercentage() {
            return this.percentage;
        }

        public final int hashCode() {
            return Float.hashCode(this.percentage);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.percentage, "TapATMButton(percentage=", ")");
        }
    }

    public final class TapHeroPercentage implements EditDistributionViewEvent {
        public static final TapHeroPercentage INSTANCE = new TapHeroPercentage();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapHeroPercentage);
        }

        public final int hashCode() {
            return -1280995138;
        }

        public final String toString() {
            return "TapHeroPercentage";
        }
    }

    public final class TapInfoButton implements EditDistributionViewEvent {
        public static final TapInfoButton INSTANCE = new TapInfoButton();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapInfoButton);
        }

        public final int hashCode() {
            return -1119242998;
        }

        public final String toString() {
            return "TapInfoButton";
        }
    }
}
