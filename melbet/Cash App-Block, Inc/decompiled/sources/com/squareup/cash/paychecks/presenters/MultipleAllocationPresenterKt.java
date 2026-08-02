package com.squareup.cash.paychecks.presenters;

import com.squareup.cash.paychecks.backend.api.mapper.CommonMappersKt;
import com.squareup.cash.paychecks.backend.api.model.MultipleAllocationBlocker;
import com.squareup.cash.paychecks.backend.api.model.PaycheckAllocationDistribution;
import com.squareup.cash.paychecks.presenters.util.UtilsKt;
import com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel;
import com.squareup.cash.paychecks.views.HelpSheetViewKt$$ExternalSyntheticLambda4;
import com.squareup.protos.cash.ui.Color;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import squareup.cash.paychecks.AllocationDistribution;

/* loaded from: classes6.dex */
public abstract class MultipleAllocationPresenterKt {
    public static final AllocationDistribution toAllocationDistribution(List list) {
        list.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            PaycheckAllocationDistribution.DestinationAndShare destinationAndShare = ((MultipleAllocationBlocker.Allocation) it.next()).destination;
            arrayList.add(new AllocationDistribution.DestinationAndShare(CommonMappersKt.toAllocationDestinationProto(destinationAndShare.destination), Long.valueOf(destinationAndShare.shareInBasisPoints), null, 4, null));
        }
        return new AllocationDistribution(arrayList);
    }

    public static final DistributionWheelViewModel.SingleAllocation toViewModel(MultipleAllocationBlocker.Allocation allocation, List list) {
        DistributionWheelViewModel.Allocation.Treatment treatment;
        Color color = allocation.color;
        float forceToWholePercentage = UtilsKt.forceToWholePercentage(allocation.destination.shareInBasisPoints / 10000.0f);
        if (allocation.interactable) {
            MultipleAllocationBlocker.Allocation.Editability editability = allocation.editability;
            if (editability instanceof MultipleAllocationBlocker.Allocation.Editable) {
                treatment = new DistributionWheelViewModel.Allocation.Treatment.InteractableSelected(UtilsKt.forceToWholePercentage(UtilsKt.maxAllocationFor(allocation, list, new HelpSheetViewKt$$ExternalSyntheticLambda4(11), new HelpSheetViewKt$$ExternalSyntheticLambda4(12))));
            } else {
                if (!(editability instanceof MultipleAllocationBlocker.Allocation.NotEditable)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                treatment = DistributionWheelViewModel.Allocation.Treatment.InteractableNotSelected.INSTANCE;
            }
        } else {
            treatment = DistributionWheelViewModel.Allocation.Treatment.Default.INSTANCE;
        }
        return new DistributionWheelViewModel.SingleAllocation(color, forceToWholePercentage, treatment, null);
    }
}
