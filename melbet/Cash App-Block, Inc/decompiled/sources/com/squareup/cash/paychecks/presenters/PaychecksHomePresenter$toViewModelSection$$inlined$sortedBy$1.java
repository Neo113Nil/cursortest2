package com.squareup.cash.paychecks.presenters;

import com.squareup.cash.paychecks.backend.api.model.EditDistributionConfiguration;
import com.squareup.cash.paychecks.backend.api.model.PaycheckAllocationDistribution;
import com.squareup.cash.paychecks.common.presenters.UtilsKt;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;

/* loaded from: classes6.dex */
public final class PaychecksHomePresenter$toViewModelSection$$inlined$sortedBy$1 implements Comparator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ PaychecksHomePresenter$toViewModelSection$$inlined$sortedBy$1(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ComparisonsKt__ComparisonsKt.compareValues(Boolean.valueOf(UtilsKt.sortOrderForDistributionWheel(((PaycheckAllocationDistribution.DestinationAndShare) obj).destination)), Boolean.valueOf(UtilsKt.sortOrderForDistributionWheel(((PaycheckAllocationDistribution.DestinationAndShare) obj2).destination)));
            default:
                return ComparisonsKt__ComparisonsKt.compareValues(Boolean.valueOf(UtilsKt.sortOrderForDistributionWheel(((EditDistributionConfiguration.DestinationUiConfiguration) obj).destination)), Boolean.valueOf(UtilsKt.sortOrderForDistributionWheel(((EditDistributionConfiguration.DestinationUiConfiguration) obj2).destination)));
        }
    }
}
