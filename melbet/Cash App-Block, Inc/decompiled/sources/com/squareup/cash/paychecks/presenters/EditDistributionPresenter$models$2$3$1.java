package com.squareup.cash.paychecks.presenters;

import com.squareup.cash.paychecks.backend.api.mapper.CommonMappersKt;
import com.squareup.cash.paychecks.backend.api.model.EditDistributionConfiguration;
import com.squareup.cash.paychecks.presenters.util.UtilsKt;
import kotlin.jvm.functions.Function4;
import squareup.cash.paychecks.AllocationDistribution;

/* loaded from: classes6.dex */
public final class EditDistributionPresenter$models$2$3$1 implements Function4 {
    public static final EditDistributionPresenter$models$2$3$1 INSTANCE = new EditDistributionPresenter$models$2$3$1();

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        EditDistributionConfiguration.DestinationUiConfiguration destinationUiConfiguration = (EditDistributionConfiguration.DestinationUiConfiguration) obj;
        float floatValue = ((Number) obj2).floatValue();
        ((Number) obj3).floatValue();
        ((Boolean) obj4).booleanValue();
        destinationUiConfiguration.getClass();
        return new AllocationDistribution.DestinationAndShare(CommonMappersKt.toAllocationDestinationProto(destinationUiConfiguration.destination), Long.valueOf(UtilsKt.getBasisPoints(floatValue)), null, 4, null);
    }
}
