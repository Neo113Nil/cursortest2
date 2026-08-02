package com.squareup.cash.family.fixtures;

import com.squareup.cash.family.familyhub.viewmodels.AllowanceViewModel;

/* loaded from: classes6.dex */
public abstract class FamilyAllowanceFixtures {
    public static final AllowanceViewModel.AllowanceDetail ALLOWANCE_DETAIL_1 = new AllowanceViewModel.AllowanceDetail("token1", "Allowance", "description1", "$10", "edit-url", false);
    public static final AllowanceViewModel.AllowanceDetail ALLOWANCE_DETAIL_2 = new AllowanceViewModel.AllowanceDetail("token2", "Allowance", "description2", "$100", null, false);
    public static final AllowanceViewModel.NoAllowanceInDependentDetail NO_ALLOWANCE_IN_DEPENDENT_DETAIL = new AllowanceViewModel.NoAllowanceInDependentDetail("Add allowance", "Weekly, biweekly, or monthly");
}
