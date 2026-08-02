package com.squareup.cash.paychecks.backend.api.model;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.paychecks.backend.api.model.AllocationDestination;
import com.squareup.cash.paychecks.backend.api.model.PaycheckAllocationDistribution;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes6.dex */
public final class MultipleAllocationBlocker {
    public final ArrayList allocations;
    public final String atmOptionAccessibilityHintTemplate;
    public final List atmPickerOptionsInBasisPoints;
    public final Money averageMonthlyPaycheck;
    public final ActionConfig callToAction;
    public final String customAmountAccessibilityHint;
    public final String customAmountSubtitle;
    public final IntRange editableAllocationIndices;
    public final PaychecksAlertUi exceededMaxDistributionAlertUi;
    public final BottomSheet explanation;
    public final String title;
    public final ZeroAllocationBehavior zeroAllocationBehavior;

    /* loaded from: classes7.dex */
    public final class ActionConfig {
        public final String disableActionText;
        public final String submitActionText;

        public ActionConfig(String str, String str2) {
            this.submitActionText = str;
            this.disableActionText = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionConfig)) {
                return false;
            }
            ActionConfig actionConfig = (ActionConfig) obj;
            return this.submitActionText.equals(actionConfig.submitActionText) && this.disableActionText.equals(actionConfig.disableActionText);
        }

        public final int hashCode() {
            return this.disableActionText.hashCode() + (this.submitActionText.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("ActionConfig(submitActionText=", this.submitActionText, ", disableActionText=", this.disableActionText, ")");
        }
    }

    public interface ZeroAllocationBehavior {

        /* loaded from: classes7.dex */
        public final class RequireAtLeastOnePercentAllocation implements ZeroAllocationBehavior {
            public static final RequireAtLeastOnePercentAllocation INSTANCE = new RequireAtLeastOnePercentAllocation();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RequireAtLeastOnePercentAllocation);
            }

            public final int hashCode() {
                return 1591048064;
            }

            public final String toString() {
                return "RequireAtLeastOnePercentAllocation";
            }
        }

        /* loaded from: classes7.dex */
        public final class ShowDisableCta implements ZeroAllocationBehavior {
            public static final ShowDisableCta INSTANCE = new ShowDisableCta();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowDisableCta);
            }

            public final int hashCode() {
                return 1008897205;
            }

            public final String toString() {
                return "ShowDisableCta";
            }
        }
    }

    public MultipleAllocationBlocker(String str, ActionConfig actionConfig, Money money, List list, String str2, String str3, String str4, PaychecksAlertUi paychecksAlertUi, ArrayList arrayList, IntRange intRange, ZeroAllocationBehavior zeroAllocationBehavior, BottomSheet bottomSheet) {
        list.getClass();
        intRange.getClass();
        this.title = str;
        this.callToAction = actionConfig;
        this.averageMonthlyPaycheck = money;
        this.atmPickerOptionsInBasisPoints = list;
        this.atmOptionAccessibilityHintTemplate = str2;
        this.customAmountSubtitle = str3;
        this.customAmountAccessibilityHint = str4;
        this.exceededMaxDistributionAlertUi = paychecksAlertUi;
        this.allocations = arrayList;
        this.editableAllocationIndices = intRange;
        this.zeroAllocationBehavior = zeroAllocationBehavior;
        this.explanation = bottomSheet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultipleAllocationBlocker)) {
            return false;
        }
        MultipleAllocationBlocker multipleAllocationBlocker = (MultipleAllocationBlocker) obj;
        return this.title.equals(multipleAllocationBlocker.title) && this.callToAction.equals(multipleAllocationBlocker.callToAction) && Intrinsics.areEqual(this.averageMonthlyPaycheck, multipleAllocationBlocker.averageMonthlyPaycheck) && Intrinsics.areEqual(this.atmPickerOptionsInBasisPoints, multipleAllocationBlocker.atmPickerOptionsInBasisPoints) && this.atmOptionAccessibilityHintTemplate.equals(multipleAllocationBlocker.atmOptionAccessibilityHintTemplate) && Intrinsics.areEqual(this.customAmountSubtitle, multipleAllocationBlocker.customAmountSubtitle) && this.customAmountAccessibilityHint.equals(multipleAllocationBlocker.customAmountAccessibilityHint) && this.exceededMaxDistributionAlertUi.equals(multipleAllocationBlocker.exceededMaxDistributionAlertUi) && this.allocations.equals(multipleAllocationBlocker.allocations) && Intrinsics.areEqual(this.editableAllocationIndices, multipleAllocationBlocker.editableAllocationIndices) && this.zeroAllocationBehavior.equals(multipleAllocationBlocker.zeroAllocationBehavior) && Intrinsics.areEqual(this.explanation, multipleAllocationBlocker.explanation);
    }

    public final int hashCode() {
        int hashCode = (this.callToAction.hashCode() + (this.title.hashCode() * 31)) * 31;
        Money money = this.averageMonthlyPaycheck;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m((hashCode + (money == null ? 0 : money.hashCode())) * 31, 31, this.atmPickerOptionsInBasisPoints), 31, this.atmOptionAccessibilityHintTemplate);
        String str = this.customAmountSubtitle;
        int hashCode2 = (this.zeroAllocationBehavior.hashCode() + ((this.editableAllocationIndices.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.allocations, (this.exceededMaxDistributionAlertUi.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.customAmountAccessibilityHint)) * 31, 31)) * 31)) * 31;
        BottomSheet bottomSheet = this.explanation;
        return hashCode2 + (bottomSheet != null ? bottomSheet.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultipleAllocationBlocker(title=");
        sb.append(this.title);
        sb.append(", callToAction=");
        sb.append(this.callToAction);
        sb.append(", averageMonthlyPaycheck=");
        sb.append(this.averageMonthlyPaycheck);
        sb.append(", atmPickerOptionsInBasisPoints=");
        sb.append(this.atmPickerOptionsInBasisPoints);
        sb.append(", atmOptionAccessibilityHintTemplate=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.atmOptionAccessibilityHintTemplate, ", customAmountSubtitle=", this.customAmountSubtitle, ", customAmountAccessibilityHint=");
        sb.append(this.customAmountAccessibilityHint);
        sb.append(", exceededMaxDistributionAlertUi=");
        sb.append(this.exceededMaxDistributionAlertUi);
        sb.append(", allocations=");
        sb.append(this.allocations);
        sb.append(", editableAllocationIndices=");
        sb.append(this.editableAllocationIndices);
        sb.append(", zeroAllocationBehavior=");
        sb.append(this.zeroAllocationBehavior);
        sb.append(", explanation=");
        sb.append(this.explanation);
        sb.append(")");
        return sb.toString();
    }

    public final class Allocation {
        public final Color color;
        public final PaycheckAllocationDistribution.DestinationAndShare destination;
        public final Editability editability;
        public final boolean interactable;

        public interface Editability {
        }

        public final class Editable implements Editability {
            public final String displayName;
            public final SelectionBehavior selectionBehavior;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class SelectionBehavior {
                public static final /* synthetic */ SelectionBehavior[] $VALUES;
                public static final SelectionBehavior MODIFY_LOCALLY;
                public static final SelectionBehavior SUBMIT_SINGLE;

                static {
                    SelectionBehavior selectionBehavior = new SelectionBehavior("MODIFY_LOCALLY", 0);
                    MODIFY_LOCALLY = selectionBehavior;
                    SelectionBehavior selectionBehavior2 = new SelectionBehavior("SUBMIT_SINGLE", 1);
                    SUBMIT_SINGLE = selectionBehavior2;
                    $VALUES = new SelectionBehavior[]{selectionBehavior, selectionBehavior2};
                }

                public static SelectionBehavior valueOf(String str) {
                    return (SelectionBehavior) Enum.valueOf(SelectionBehavior.class, str);
                }

                public static SelectionBehavior[] values() {
                    return (SelectionBehavior[]) $VALUES.clone();
                }
            }

            public Editable(String str, SelectionBehavior selectionBehavior) {
                this.displayName = str;
                this.selectionBehavior = selectionBehavior;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Editable)) {
                    return false;
                }
                Editable editable = (Editable) obj;
                return this.displayName.equals(editable.displayName) && this.selectionBehavior == editable.selectionBehavior;
            }

            public final int hashCode() {
                return this.selectionBehavior.hashCode() + (this.displayName.hashCode() * 31);
            }

            public final String toString() {
                return "Editable(displayName=" + this.displayName + ", selectionBehavior=" + this.selectionBehavior + ")";
            }
        }

        public final class NotEditable implements Editability {
            public static final NotEditable INSTANCE = new NotEditable();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NotEditable);
            }

            public final int hashCode() {
                return 1384383053;
            }

            public final String toString() {
                return "NotEditable";
            }
        }

        public Allocation(PaycheckAllocationDistribution.DestinationAndShare destinationAndShare, Color color, Editability editability, boolean z) {
            destinationAndShare.getClass();
            color.getClass();
            this.destination = destinationAndShare;
            this.color = color;
            this.editability = editability;
            this.interactable = z;
        }

        public static Allocation copy$default(Allocation allocation, PaycheckAllocationDistribution.DestinationAndShare destinationAndShare) {
            Color color = allocation.color;
            Editability editability = allocation.editability;
            boolean z = allocation.interactable;
            color.getClass();
            editability.getClass();
            return new Allocation(destinationAndShare, color, editability, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Allocation)) {
                return false;
            }
            Allocation allocation = (Allocation) obj;
            return Intrinsics.areEqual(this.destination, allocation.destination) && Intrinsics.areEqual(this.color, allocation.color) && Intrinsics.areEqual(this.editability, allocation.editability) && this.interactable == allocation.interactable;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.interactable) + ((this.editability.hashCode() + SVG$Unit$EnumUnboxingLocalUtility.m(this.color, this.destination.hashCode() * 31, 31)) * 31);
        }

        public final String toString() {
            return "Allocation(destination=" + this.destination + ", color=" + this.color + ", editability=" + this.editability + ", interactable=" + this.interactable + ")";
        }

        public Allocation(PaycheckAllocationDistribution.DestinationAndShare destinationAndShare, Color color, Editability editability) {
            this(destinationAndShare, color, editability, !(destinationAndShare.destination instanceof AllocationDestination.CashBalanceDestination));
        }
    }
}
