package com.squareup.cash.family.fixtures;

import com.squareup.cash.family.familyhub.viewmodels.AllowanceViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentAccessControlsViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentNotificationsSectionModel;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public abstract class FamilyControlsFixtures {
    public static final DependentAccessControlsViewModel FULL_DEPENDENT_ACCESS_CONTROLS;
    public static final DependentAccessControlsViewModel LOADING_DEPENDENT_ACCESS_CONTROLS;

    static {
        DependentNotificationsSectionModel dependentNotificationsSectionModel = new DependentNotificationsSectionModel("Notifications", "Get activity updates");
        AllowanceViewModel.AllowanceDetail allowanceDetail = FamilyAllowanceFixtures.ALLOWANCE_DETAIL_1;
        CollectionsKt__CollectionsKt.listOf((Object[]) new AllowanceViewModel.AllowanceDetail[]{allowanceDetail, FamilyAllowanceFixtures.ALLOWANCE_DETAIL_2}).getClass();
        CollectionsKt__CollectionsJVMKt.listOf(FamilyAllowanceFixtures.NO_ALLOWANCE_IN_DEPENDENT_DETAIL).getClass();
        LOADING_DEPENDENT_ACCESS_CONTROLS = new DependentAccessControlsViewModel(CollectionsKt__CollectionsJVMKt.listOf(AllowanceViewModel.Loading.INSTANCE), dependentNotificationsSectionModel);
        FULL_DEPENDENT_ACCESS_CONTROLS = new DependentAccessControlsViewModel(CollectionsKt__CollectionsJVMKt.listOf(allowanceDetail), dependentNotificationsSectionModel);
    }
}
