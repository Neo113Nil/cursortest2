package com.squareup.cash.paychecks.backend.api.mapper;

import com.squareup.cash.banking.observability.ProtoParsingError;
import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.paychecks.backend.api.model.MultipleAllocationBlocker;
import com.squareup.cash.paychecks.backend.api.model.PaycheckAllocationDistribution;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.api.SetPaycheckMultiAllocationBlocker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import squareup.cash.paychecks.AllocationDistribution;

/* loaded from: classes6.dex */
public abstract class SetPaycheckMultipleAllocationMappersKt {

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SetPaycheckMultiAllocationBlocker.EditableAllocation.SelectionBehavior.values().length];
            try {
                iArr[SetPaycheckMultiAllocationBlocker.EditableAllocation.SelectionBehavior.MODIFY_LOCALLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SetPaycheckMultiAllocationBlocker.EditableAllocation.SelectionBehavior.SUBMIT_SINGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SetPaycheckMultiAllocationBlocker.EditableAllocation.SelectionBehavior.UNSUPPORTED_DO_NOT_USE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SetPaycheckMultiAllocationBlocker.ZeroAllocationBehavior.values().length];
            try {
                iArr2[SetPaycheckMultiAllocationBlocker.ZeroAllocationBehavior.REQUIRE_AT_LEAST_ONE_PERCENT_ALLOCATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SetPaycheckMultiAllocationBlocker.ZeroAllocationBehavior.SHOW_DISABLE_CTA.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SetPaycheckMultiAllocationBlocker.ZeroAllocationBehavior.ZERO_ALLOCATION_BEHAVIOR_DO_NOT_USE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final ArrayList toAllocations(ProtoValidationScope protoValidationScope, AllocationDistribution allocationDistribution, List list, List list2, int i) {
        MultipleAllocationBlocker.Allocation allocation;
        MultipleAllocationBlocker.Allocation allocation2;
        MultipleAllocationBlocker.Allocation.Editable.SelectionBehavior selectionBehavior;
        List list3 = PaycheckAllocationDistributionMappersKt.toPaycheckAllocationDistribution(protoValidationScope, allocationDistribution).allocations;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
        int i2 = 0;
        for (Object obj : list3) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            PaycheckAllocationDistribution.DestinationAndShare destinationAndShare = (PaycheckAllocationDistribution.DestinationAndShare) obj;
            Color color = (Color) list2.get(i2);
            MultipleAllocationBlocker.Allocation.NotEditable notEditable = MultipleAllocationBlocker.Allocation.NotEditable.INSTANCE;
            if (i2 < i || i2 >= list.size() + i) {
                allocation = new MultipleAllocationBlocker.Allocation(destinationAndShare, color, notEditable);
            } else {
                int i4 = i2 - i;
                SetPaycheckMultiAllocationBlocker.EditableAllocation editableAllocation = (SetPaycheckMultiAllocationBlocker.EditableAllocation) list.get(i4);
                SetPaycheckMultiAllocationBlocker.EditableAllocation.SelectionBehavior selectionBehavior2 = editableAllocation.selection_behavior;
                int i5 = selectionBehavior2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[selectionBehavior2.ordinal()];
                if (i5 != -1) {
                    if (i5 == 1) {
                        selectionBehavior = MultipleAllocationBlocker.Allocation.Editable.SelectionBehavior.MODIFY_LOCALLY;
                    } else {
                        if (i5 != 2) {
                            if (i5 == 3) {
                                throw new ProtoParsingError("SelectionBehavior", ProtoParsingError.ErrorType.UNSUPPORTED_ENUM_VALUE, "UNSUPPORTED_DO_NOT_USE", null, null, null, null, 120);
                            }
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        selectionBehavior = MultipleAllocationBlocker.Allocation.Editable.SelectionBehavior.SUBMIT_SINGLE;
                    }
                    String str = editableAllocation.display_name;
                    ProtoValidationScope.required(str, "editable_allocations[" + i4 + "].display_name");
                    allocation = new MultipleAllocationBlocker.Allocation(destinationAndShare, color, new MultipleAllocationBlocker.Allocation.Editable(str, selectionBehavior));
                } else {
                    allocation2 = new MultipleAllocationBlocker.Allocation(destinationAndShare, color, notEditable);
                    arrayList.add(allocation2);
                    i2 = i3;
                }
            }
            allocation2 = allocation;
            arrayList.add(allocation2);
            i2 = i3;
        }
        return arrayList;
    }
}
