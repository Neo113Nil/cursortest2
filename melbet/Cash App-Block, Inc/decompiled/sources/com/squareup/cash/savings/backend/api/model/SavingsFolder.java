package com.squareup.cash.savings.backend.api.model;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface SavingsFolder {

    /* loaded from: classes6.dex */
    public final class GeneralFolder implements SavingsFolder {
        public final Money balance;
        public final String iconId;
        public final String label;
        public final String owningCustomerToken;

        public GeneralFolder(Money money, String str, String str2, String str3) {
            money.getClass();
            this.balance = money;
            this.owningCustomerToken = str;
            this.iconId = str2;
            this.label = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GeneralFolder)) {
                return false;
            }
            GeneralFolder generalFolder = (GeneralFolder) obj;
            return Intrinsics.areEqual(this.balance, generalFolder.balance) && this.owningCustomerToken.equals(generalFolder.owningCustomerToken) && this.iconId.equals(generalFolder.iconId) && Intrinsics.areEqual(this.label, generalFolder.label);
        }

        @Override // com.squareup.cash.savings.backend.api.model.SavingsFolder
        public final Money getBalance() {
            return this.balance;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.balance.hashCode() * 31, 31, this.owningCustomerToken), 31, this.iconId);
            String str = this.label;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GeneralFolder(balance=");
            sb.append(this.balance);
            sb.append(", owningCustomerToken=");
            sb.append(this.owningCustomerToken);
            sb.append(", iconId=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.iconId, ", label=", this.label, ")");
        }
    }

    public final class GoalFolder implements SavingsFolder {
        public final Money balance;
        public final String completionToken;
        public final Money goalAmount;
        public final String goalFlowParameters;
        public final String iconId;
        public final String label;
        public final String owningCustomerToken;
        public final Float progress;
        public final String token;

        public GoalFolder(Money money, String str, String str2, String str3, Money money2, String str4, String str5, Float f, String str6) {
            money.getClass();
            str3.getClass();
            this.balance = money;
            this.owningCustomerToken = str;
            this.iconId = str2;
            this.token = str3;
            this.goalAmount = money2;
            this.completionToken = str4;
            this.label = str5;
            this.progress = f;
            this.goalFlowParameters = str6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GoalFolder)) {
                return false;
            }
            GoalFolder goalFolder = (GoalFolder) obj;
            return Intrinsics.areEqual(this.balance, goalFolder.balance) && this.owningCustomerToken.equals(goalFolder.owningCustomerToken) && this.iconId.equals(goalFolder.iconId) && Intrinsics.areEqual(this.token, goalFolder.token) && this.goalAmount.equals(goalFolder.goalAmount) && this.completionToken.equals(goalFolder.completionToken) && this.label.equals(goalFolder.label) && Intrinsics.areEqual((Object) this.progress, (Object) goalFolder.progress) && this.goalFlowParameters.equals(goalFolder.goalFlowParameters);
        }

        @Override // com.squareup.cash.savings.backend.api.model.SavingsFolder
        public final Money getBalance() {
            return this.balance;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m(this.goalAmount, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.balance.hashCode() * 31, 31, this.owningCustomerToken), 31, this.iconId), 31, this.token), 31), 31, this.completionToken), 31, this.label);
            Float f = this.progress;
            return this.goalFlowParameters.hashCode() + ((m + (f == null ? 0 : f.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GoalFolder(balance=");
            sb.append(this.balance);
            sb.append(", owningCustomerToken=");
            sb.append(this.owningCustomerToken);
            sb.append(", iconId=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.iconId, ", token=", this.token, ", goalAmount=");
            sb.append(this.goalAmount);
            sb.append(", completionToken=");
            sb.append(this.completionToken);
            sb.append(", label=");
            sb.append(this.label);
            sb.append(", progress=");
            sb.append(this.progress);
            sb.append(", goalFlowParameters=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.goalFlowParameters, ")");
        }
    }

    Money getBalance();
}
