package com.squareup.cash.family.familyhub.backend.api;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.piggybank.api.v2.InterestYieldStatus;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DependentBalance {
    public final DependentBalanceName name;
    public final LoadingState state;

    public interface LoadingState {

        public final class BalanceFailedToLoad implements LoadingState {
            public static final BalanceFailedToLoad INSTANCE = new BalanceFailedToLoad();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof BalanceFailedToLoad);
            }

            public final int hashCode() {
                return -1487205041;
            }

            public final String toString() {
                return "BalanceFailedToLoad";
            }
        }

        public final class BalanceLoaded implements LoadingState {
            public final Money amount;

            public BalanceLoaded(Money money) {
                this.amount = money;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BalanceLoaded) && this.amount.equals(((BalanceLoaded) obj).amount);
            }

            public final int hashCode() {
                return this.amount.hashCode() * 31;
            }

            public final String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(this.amount, "BalanceLoaded(amount=", ", body=null)");
            }
        }

        public final class BalanceLoading implements LoadingState {
            public static final BalanceLoading INSTANCE = new BalanceLoading();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof BalanceLoading);
            }

            public final int hashCode() {
                return 1482955243;
            }

            public final String toString() {
                return "BalanceLoading";
            }
        }

        public final class SavingsBalanceLoaded implements LoadingState {
            public final Money amount;
            public final String interestRate;
            public final InterestYieldStatus status;

            public SavingsBalanceLoaded(Money money, InterestYieldStatus interestYieldStatus, String str) {
                this.amount = money;
                this.status = interestYieldStatus;
                this.interestRate = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SavingsBalanceLoaded)) {
                    return false;
                }
                SavingsBalanceLoaded savingsBalanceLoaded = (SavingsBalanceLoaded) obj;
                return this.amount.equals(savingsBalanceLoaded.amount) && this.status == savingsBalanceLoaded.status && Intrinsics.areEqual(this.interestRate, savingsBalanceLoaded.interestRate);
            }

            public final int hashCode() {
                int hashCode = this.amount.hashCode() * 31;
                InterestYieldStatus interestYieldStatus = this.status;
                int hashCode2 = (hashCode + (interestYieldStatus == null ? 0 : interestYieldStatus.hashCode())) * 31;
                String str = this.interestRate;
                return hashCode2 + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("SavingsBalanceLoaded(amount=");
                sb.append(this.amount);
                sb.append(", status=");
                sb.append(this.status);
                sb.append(", interestRate=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.interestRate, ")");
            }
        }
    }

    public DependentBalance(DependentBalanceName dependentBalanceName, LoadingState loadingState) {
        this.name = dependentBalanceName;
        this.state = loadingState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DependentBalance)) {
            return false;
        }
        DependentBalance dependentBalance = (DependentBalance) obj;
        return this.name == dependentBalance.name && this.state.equals(dependentBalance.state);
    }

    public final int hashCode() {
        return this.state.hashCode() + (this.name.hashCode() * 31);
    }

    public final String toString() {
        return "DependentBalance(name=" + this.name + ", state=" + this.state + ")";
    }
}
