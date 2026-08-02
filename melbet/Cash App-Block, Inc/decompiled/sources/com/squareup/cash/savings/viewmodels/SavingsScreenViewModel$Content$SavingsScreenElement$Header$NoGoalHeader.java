package com.squareup.cash.savings.viewmodels;

import com.squareup.cash.savings.viewmodels.SavingsScreenViewEvent;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SavingsScreenViewModel$Content$SavingsScreenElement$Header$NoGoalHeader implements SavingsScreenViewModel.Content.SavingsScreenElement {
    public final SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance balance;
    public final SavingsScreenViewEvent onRenderedEvent;

    public SavingsScreenViewModel$Content$SavingsScreenElement$Header$NoGoalHeader(SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance savingsScreenViewModel$Content$SavingsScreenElement$Header$Balance, SavingsScreenViewEvent.BalanceSeenEvent balanceSeenEvent) {
        this.balance = savingsScreenViewModel$Content$SavingsScreenElement$Header$Balance;
        this.onRenderedEvent = balanceSeenEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavingsScreenViewModel$Content$SavingsScreenElement$Header$NoGoalHeader)) {
            return false;
        }
        SavingsScreenViewModel$Content$SavingsScreenElement$Header$NoGoalHeader savingsScreenViewModel$Content$SavingsScreenElement$Header$NoGoalHeader = (SavingsScreenViewModel$Content$SavingsScreenElement$Header$NoGoalHeader) obj;
        return this.balance.equals(savingsScreenViewModel$Content$SavingsScreenElement$Header$NoGoalHeader.balance) && Intrinsics.areEqual(this.onRenderedEvent, savingsScreenViewModel$Content$SavingsScreenElement$Header$NoGoalHeader.onRenderedEvent);
    }

    public final int hashCode() {
        int hashCode = this.balance.hashCode() * 31;
        SavingsScreenViewEvent savingsScreenViewEvent = this.onRenderedEvent;
        return hashCode + (savingsScreenViewEvent == null ? 0 : savingsScreenViewEvent.hashCode());
    }

    public final String toString() {
        return "NoGoalHeader(balance=" + this.balance + ", onRenderedEvent=" + this.onRenderedEvent + ")";
    }
}
