package com.squareup.cash.family.familyhub.backend.real;

import com.squareup.cash.earnings.presenters.home.EarningsHomePresenter$models$3$1;
import com.squareup.cash.recurringpayments.backend.RealRecurringPaymentsManager;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes6.dex */
public final class RealDependentAllowanceManager {
    public final RealRecurringPaymentsManager recurringPaymentsManager;
    public final CoroutineScope scope;

    public RealDependentAllowanceManager(RealRecurringPaymentsManager realRecurringPaymentsManager, CoroutineScope coroutineScope) {
        this.recurringPaymentsManager = realRecurringPaymentsManager;
        this.scope = coroutineScope;
    }

    public final StateFlowImpl getAllowance(String str, String str2) {
        str.getClass();
        str2.getClass();
        JobKt.launch$default(this.scope, null, null, new EarningsHomePresenter$models$3$1(this, str, str2, null, 15), 3);
        return this.recurringPaymentsManager.recurringPayments;
    }
}
