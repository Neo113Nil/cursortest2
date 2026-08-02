package com.squareup.cash.banking.applets.presenters;

import androidx.compose.foundation.pager.PagerDefaults;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BalanceRepositoryModel {
    public final AccountAndRoutingState accountAndRoutingState;
    public final Money balance;
    public final boolean canCashIn;
    public final boolean canCashOut;
    public final Money convertedBalance;
    public final PagerDefaults overdraftModel;
    public final Money restrictedBalance;

    public interface AccountAndRoutingState {

        public final class Displayed implements AccountAndRoutingState {
            public final String accountNumber;
            public final String routingNumber;

            public Displayed(String str, String str2) {
                this.accountNumber = str;
                this.routingNumber = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Displayed)) {
                    return false;
                }
                Displayed displayed = (Displayed) obj;
                return this.accountNumber.equals(displayed.accountNumber) && this.routingNumber.equals(displayed.routingNumber);
            }

            public final int hashCode() {
                return this.routingNumber.hashCode() + (this.accountNumber.hashCode() * 31);
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("Displayed(accountNumber=", this.accountNumber, ", routingNumber=", this.routingNumber, ")");
            }
        }

        public final class Hidden implements AccountAndRoutingState {
            public static final Hidden INSTANCE = new Hidden();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Hidden);
            }

            public final int hashCode() {
                return 1863883244;
            }

            public final String toString() {
                return "Hidden";
            }
        }

        public final class Masked implements AccountAndRoutingState {
            public static final Masked INSTANCE = new Masked();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Masked);
            }

            public final int hashCode() {
                return 2000094413;
            }

            public final String toString() {
                return "Masked";
            }
        }
    }

    public BalanceRepositoryModel(Money money, AccountAndRoutingState accountAndRoutingState, boolean z, boolean z2, PagerDefaults pagerDefaults, Money money2, Money money3) {
        this.balance = money;
        this.accountAndRoutingState = accountAndRoutingState;
        this.canCashIn = z;
        this.canCashOut = z2;
        this.overdraftModel = pagerDefaults;
        this.restrictedBalance = money2;
        this.convertedBalance = money3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BalanceRepositoryModel)) {
            return false;
        }
        BalanceRepositoryModel balanceRepositoryModel = (BalanceRepositoryModel) obj;
        return this.balance.equals(balanceRepositoryModel.balance) && this.accountAndRoutingState.equals(balanceRepositoryModel.accountAndRoutingState) && this.canCashIn == balanceRepositoryModel.canCashIn && this.canCashOut == balanceRepositoryModel.canCashOut && Intrinsics.areEqual(this.overdraftModel, balanceRepositoryModel.overdraftModel) && Intrinsics.areEqual(this.restrictedBalance, balanceRepositoryModel.restrictedBalance) && Intrinsics.areEqual(this.convertedBalance, balanceRepositoryModel.convertedBalance);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.accountAndRoutingState.hashCode() + (this.balance.hashCode() * 31)) * 31, 31, this.canCashIn), 31, this.canCashOut);
        PagerDefaults pagerDefaults = this.overdraftModel;
        int hashCode = (m + (pagerDefaults == null ? 0 : pagerDefaults.hashCode())) * 31;
        Money money = this.restrictedBalance;
        int hashCode2 = (hashCode + (money == null ? 0 : money.hashCode())) * 31;
        Money money2 = this.convertedBalance;
        return hashCode2 + (money2 != null ? money2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BalanceRepositoryModel(balance=");
        sb.append(this.balance);
        sb.append(", accountAndRoutingState=");
        sb.append(this.accountAndRoutingState);
        sb.append(", canCashIn=");
        re$$ExternalSyntheticOutline0.m(sb, this.canCashIn, ", canCashOut=", this.canCashOut, ", overdraftModel=");
        sb.append(this.overdraftModel);
        sb.append(", restrictedBalance=");
        sb.append(this.restrictedBalance);
        sb.append(", convertedBalance=");
        sb.append(this.convertedBalance);
        sb.append(")");
        return sb.toString();
    }
}
