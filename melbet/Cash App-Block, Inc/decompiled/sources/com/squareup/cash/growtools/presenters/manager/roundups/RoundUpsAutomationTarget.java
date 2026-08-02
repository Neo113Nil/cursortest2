package com.squareup.cash.growtools.presenters.manager.roundups;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface RoundUpsAutomationTarget {

    /* loaded from: classes9.dex */
    public final class CryptoCurrency implements RoundUpsAutomationTarget {
        public final String displayName;

        public CryptoCurrency(String str) {
            this.displayName = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CryptoCurrency) && this.displayName.equals(((CryptoCurrency) obj).displayName);
        }

        @Override // com.squareup.cash.growtools.presenters.manager.roundups.RoundUpsAutomationTarget
        public final String getDisplayName() {
            return this.displayName;
        }

        public final int hashCode() {
            return this.displayName.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CryptoCurrency(displayName=", this.displayName, ")");
        }
    }

    /* loaded from: classes9.dex */
    public final class InvestmentEntity implements RoundUpsAutomationTarget {
        public final String displayName;
        public final String identifier;

        public InvestmentEntity(String str, String str2) {
            str.getClass();
            this.identifier = str;
            this.displayName = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InvestmentEntity)) {
                return false;
            }
            InvestmentEntity investmentEntity = (InvestmentEntity) obj;
            return Intrinsics.areEqual(this.identifier, investmentEntity.identifier) && this.displayName.equals(investmentEntity.displayName);
        }

        @Override // com.squareup.cash.growtools.presenters.manager.roundups.RoundUpsAutomationTarget
        public final String getDisplayName() {
            return this.displayName;
        }

        public final int hashCode() {
            return this.displayName.hashCode() + (this.identifier.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("InvestmentEntity(identifier=", this.identifier, ", displayName=", this.displayName, ")");
        }
    }

    /* loaded from: classes9.dex */
    public final class SavingsBalance implements RoundUpsAutomationTarget {
        public final String displayName;
        public final String iconId;

        public SavingsBalance(String str, String str2) {
            this.displayName = str;
            this.iconId = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SavingsBalance)) {
                return false;
            }
            SavingsBalance savingsBalance = (SavingsBalance) obj;
            return this.displayName.equals(savingsBalance.displayName) && Intrinsics.areEqual(this.iconId, savingsBalance.iconId);
        }

        @Override // com.squareup.cash.growtools.presenters.manager.roundups.RoundUpsAutomationTarget
        public final String getDisplayName() {
            return this.displayName;
        }

        public final int hashCode() {
            int hashCode = this.displayName.hashCode() * 31;
            String str = this.iconId;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("SavingsBalance(displayName=", this.displayName, ", iconId=", this.iconId, ")");
        }
    }

    /* loaded from: classes9.dex */
    public final class SavingsGoals implements RoundUpsAutomationTarget {
        public final String displayName;
        public final String iconId;
        public final String identifier;

        public SavingsGoals(String str, String str2, String str3) {
            this.identifier = str;
            this.iconId = str2;
            this.displayName = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SavingsGoals)) {
                return false;
            }
            SavingsGoals savingsGoals = (SavingsGoals) obj;
            return Intrinsics.areEqual(this.identifier, savingsGoals.identifier) && this.iconId.equals(savingsGoals.iconId) && this.displayName.equals(savingsGoals.displayName);
        }

        @Override // com.squareup.cash.growtools.presenters.manager.roundups.RoundUpsAutomationTarget
        public final String getDisplayName() {
            return this.displayName;
        }

        public final int hashCode() {
            String str = this.identifier;
            return this.displayName.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.iconId);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SavingsGoals(identifier=", this.identifier, ", iconId=", this.iconId, ", displayName="), this.displayName, ")");
        }
    }

    String getDisplayName();
}
