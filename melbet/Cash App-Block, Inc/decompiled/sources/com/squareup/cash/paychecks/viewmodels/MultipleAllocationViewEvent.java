package com.squareup.cash.paychecks.viewmodels;

import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.paychecks.PaychecksManageDistributionSubmitMultiAllocation;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface MultipleAllocationViewEvent {

    /* loaded from: classes6.dex */
    public final class DragWheel implements MultipleAllocationViewEvent {
        public final int index;
        public final float percentage;

        public DragWheel(float f, int i) {
            this.index = i;
            this.percentage = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DragWheel)) {
                return false;
            }
            DragWheel dragWheel = (DragWheel) obj;
            return this.index == dragWheel.index && Float.compare(this.percentage, dragWheel.percentage) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.percentage) + (Integer.hashCode(this.index) * 31);
        }

        public final String toString() {
            return "DragWheel(index=" + this.index + ", percentage=" + this.percentage + ")";
        }
    }

    /* loaded from: classes6.dex */
    public final class Exit implements MultipleAllocationViewEvent {
        public static final Exit INSTANCE = new Exit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return -2106362087;
        }

        public final String toString() {
            return "Exit";
        }
    }

    /* loaded from: classes6.dex */
    public final class ExplanationDismissed implements MultipleAllocationViewEvent {
        public static final ExplanationDismissed INSTANCE = new ExplanationDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ExplanationDismissed);
        }

        public final int hashCode() {
            return -630732149;
        }

        public final String toString() {
            return "ExplanationDismissed";
        }
    }

    /* loaded from: classes6.dex */
    public final class OpenSingleAllocationEditor implements MultipleAllocationViewEvent {
        public final String accessibilityDescriptor;
        public final int currentAllocationIndex;
        public final List distribution;

        public OpenSingleAllocationEditor(String str, List list, int i) {
            list.getClass();
            this.distribution = list;
            this.currentAllocationIndex = i;
            this.accessibilityDescriptor = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenSingleAllocationEditor)) {
                return false;
            }
            OpenSingleAllocationEditor openSingleAllocationEditor = (OpenSingleAllocationEditor) obj;
            return Intrinsics.areEqual(this.distribution, openSingleAllocationEditor.distribution) && this.currentAllocationIndex == openSingleAllocationEditor.currentAllocationIndex && this.accessibilityDescriptor.equals(openSingleAllocationEditor.accessibilityDescriptor);
        }

        @Override // com.squareup.cash.paychecks.viewmodels.MultipleAllocationViewEvent
        public final String getAccessibilityDescriptor() {
            return this.accessibilityDescriptor;
        }

        public final int hashCode() {
            return this.accessibilityDescriptor.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.currentAllocationIndex, this.distribution.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenSingleAllocationEditor(distribution=");
            sb.append(this.distribution);
            sb.append(", currentAllocationIndex=");
            sb.append(this.currentAllocationIndex);
            sb.append(", accessibilityDescriptor=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.accessibilityDescriptor, ")");
        }
    }

    /* loaded from: classes6.dex */
    public interface Submit extends MultipleAllocationViewEvent {

        public final class DisableAllocations implements Submit {
            public final PaychecksManageDistributionSubmitMultiAllocation cdfEvent;
            public final List distribution;

            public DisableAllocations(List list, PaychecksManageDistributionSubmitMultiAllocation paychecksManageDistributionSubmitMultiAllocation) {
                list.getClass();
                this.distribution = list;
                this.cdfEvent = paychecksManageDistributionSubmitMultiAllocation;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DisableAllocations)) {
                    return false;
                }
                DisableAllocations disableAllocations = (DisableAllocations) obj;
                return Intrinsics.areEqual(this.distribution, disableAllocations.distribution) && this.cdfEvent.equals(disableAllocations.cdfEvent);
            }

            @Override // com.squareup.cash.paychecks.viewmodels.MultipleAllocationViewEvent
            public final Event getCdfEvent() {
                return this.cdfEvent;
            }

            public final int hashCode() {
                return this.cdfEvent.hashCode() + (this.distribution.hashCode() * 31);
            }

            public final String toString() {
                return "DisableAllocations(distribution=" + this.distribution + ", cdfEvent=" + this.cdfEvent + ")";
            }
        }

        public final class SubmitAllocations implements Submit {
            public final PaychecksManageDistributionSubmitMultiAllocation cdfEvent;
            public final List distribution;

            public SubmitAllocations(List list, PaychecksManageDistributionSubmitMultiAllocation paychecksManageDistributionSubmitMultiAllocation) {
                list.getClass();
                this.distribution = list;
                this.cdfEvent = paychecksManageDistributionSubmitMultiAllocation;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SubmitAllocations)) {
                    return false;
                }
                SubmitAllocations submitAllocations = (SubmitAllocations) obj;
                return Intrinsics.areEqual(this.distribution, submitAllocations.distribution) && this.cdfEvent.equals(submitAllocations.cdfEvent);
            }

            @Override // com.squareup.cash.paychecks.viewmodels.MultipleAllocationViewEvent
            public final Event getCdfEvent() {
                return this.cdfEvent;
            }

            public final int hashCode() {
                return this.cdfEvent.hashCode() + (this.distribution.hashCode() * 31);
            }

            public final String toString() {
                return "SubmitAllocations(distribution=" + this.distribution + ", cdfEvent=" + this.cdfEvent + ")";
            }
        }

        public final class SubmitSingleAllocation implements Submit {
            public final String accessibilityDescriptor;
            public final int currentAllocationIndex;
            public final List distribution;

            public SubmitSingleAllocation(String str, List list, int i) {
                list.getClass();
                this.distribution = list;
                this.currentAllocationIndex = i;
                this.accessibilityDescriptor = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SubmitSingleAllocation)) {
                    return false;
                }
                SubmitSingleAllocation submitSingleAllocation = (SubmitSingleAllocation) obj;
                return Intrinsics.areEqual(this.distribution, submitSingleAllocation.distribution) && this.currentAllocationIndex == submitSingleAllocation.currentAllocationIndex && this.accessibilityDescriptor.equals(submitSingleAllocation.accessibilityDescriptor);
            }

            @Override // com.squareup.cash.paychecks.viewmodels.MultipleAllocationViewEvent
            public final String getAccessibilityDescriptor() {
                return this.accessibilityDescriptor;
            }

            @Override // com.squareup.cash.paychecks.viewmodels.MultipleAllocationViewEvent
            public final Event getCdfEvent() {
                return null;
            }

            public final int hashCode() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.currentAllocationIndex, this.distribution.hashCode() * 31, 31), 31, this.accessibilityDescriptor);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("SubmitSingleAllocation(distribution=");
                sb.append(this.distribution);
                sb.append(", currentAllocationIndex=");
                sb.append(this.currentAllocationIndex);
                sb.append(", accessibilityDescriptor=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.accessibilityDescriptor, ", cdfEvent=null)");
            }
        }
    }

    /* loaded from: classes6.dex */
    public final class TapHeroPercentage implements MultipleAllocationViewEvent {
        public static final TapHeroPercentage INSTANCE = new TapHeroPercentage();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapHeroPercentage);
        }

        public final int hashCode() {
            return -429952356;
        }

        public final String toString() {
            return "TapHeroPercentage";
        }
    }

    /* loaded from: classes6.dex */
    public final class TapInfoButton implements MultipleAllocationViewEvent {
        public static final TapInfoButton INSTANCE = new TapInfoButton();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapInfoButton);
        }

        public final int hashCode() {
            return 1619736040;
        }

        public final String toString() {
            return "TapInfoButton";
        }
    }

    default String getAccessibilityDescriptor() {
        return null;
    }

    default Event getCdfEvent() {
        return null;
    }
}
