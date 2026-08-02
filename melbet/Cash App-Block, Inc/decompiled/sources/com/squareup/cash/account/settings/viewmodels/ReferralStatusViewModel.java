package com.squareup.cash.account.settings.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class ReferralStatusViewModel {

    public final class MultiplePayments extends ReferralStatusViewModel {
        public final ArrayList bills;
        public final String headerText;
        public final String mainText;
        public final Money rewardPaymentAmount;
        public final int rewardPayments;

        public MultiplePayments(ArrayList arrayList, int i, Money money, String str, String str2) {
            money.getClass();
            this.bills = arrayList;
            this.rewardPayments = i;
            this.rewardPaymentAmount = money;
            this.headerText = str;
            this.mainText = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MultiplePayments)) {
                return false;
            }
            MultiplePayments multiplePayments = (MultiplePayments) obj;
            return this.bills.equals(multiplePayments.bills) && this.rewardPayments == multiplePayments.rewardPayments && Intrinsics.areEqual(this.rewardPaymentAmount, multiplePayments.rewardPaymentAmount) && Intrinsics.areEqual(this.headerText, multiplePayments.headerText) && Intrinsics.areEqual(this.mainText, multiplePayments.mainText);
        }

        @Override // com.squareup.cash.account.settings.viewmodels.ReferralStatusViewModel
        public final String getHeaderText() {
            return this.headerText;
        }

        @Override // com.squareup.cash.account.settings.viewmodels.ReferralStatusViewModel
        public final String getMainText() {
            return this.mainText;
        }

        public final int hashCode() {
            int m = NavAction$$ExternalSyntheticOutline0.m(this.rewardPaymentAmount, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.rewardPayments, this.bills.hashCode() * 31, 31), 31);
            String str = this.headerText;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.mainText;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MultiplePayments(bills=");
            sb.append(this.bills);
            sb.append(", rewardPayments=");
            sb.append(this.rewardPayments);
            sb.append(", rewardPaymentAmount=");
            sb.append(this.rewardPaymentAmount);
            sb.append(", headerText=");
            sb.append(this.headerText);
            sb.append(", mainText=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.mainText, ")");
        }
    }

    /* loaded from: classes6.dex */
    public abstract class SinglePayment extends ReferralStatusViewModel {

        /* loaded from: classes7.dex */
        public final class CompletedSinglePayment extends SinglePayment {
            public final String headerText;
            public final String mainText;
            public final Money rewardPaymentAmount;

            public CompletedSinglePayment(Money money, String str, String str2) {
                money.getClass();
                this.rewardPaymentAmount = money;
                this.headerText = str;
                this.mainText = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CompletedSinglePayment)) {
                    return false;
                }
                CompletedSinglePayment completedSinglePayment = (CompletedSinglePayment) obj;
                return Intrinsics.areEqual(this.rewardPaymentAmount, completedSinglePayment.rewardPaymentAmount) && Intrinsics.areEqual(this.headerText, completedSinglePayment.headerText) && Intrinsics.areEqual(this.mainText, completedSinglePayment.mainText);
            }

            @Override // com.squareup.cash.account.settings.viewmodels.ReferralStatusViewModel
            public final String getHeaderText() {
                return this.headerText;
            }

            @Override // com.squareup.cash.account.settings.viewmodels.ReferralStatusViewModel
            public final String getMainText() {
                return this.mainText;
            }

            public final int hashCode() {
                int hashCode = this.rewardPaymentAmount.hashCode() * 31;
                String str = this.headerText;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.mainText;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("CompletedSinglePayment(rewardPaymentAmount=");
                sb.append(this.rewardPaymentAmount);
                sb.append(", headerText=");
                sb.append(this.headerText);
                sb.append(", mainText=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.mainText, ")");
            }
        }

        /* loaded from: classes7.dex */
        public final class IncompleteSinglePayment extends SinglePayment {
            public final String headerText;
            public final String mainText;
            public final String paymentText;
            public final int paymentTextColor;
            public final Money rewardPaymentAmount;

            public IncompleteSinglePayment(int i, String str, Money money, String str2, String str3) {
                str.getClass();
                money.getClass();
                this.paymentTextColor = i;
                this.paymentText = str;
                this.rewardPaymentAmount = money;
                this.headerText = str2;
                this.mainText = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof IncompleteSinglePayment)) {
                    return false;
                }
                IncompleteSinglePayment incompleteSinglePayment = (IncompleteSinglePayment) obj;
                return this.paymentTextColor == incompleteSinglePayment.paymentTextColor && Intrinsics.areEqual(this.paymentText, incompleteSinglePayment.paymentText) && Intrinsics.areEqual(this.rewardPaymentAmount, incompleteSinglePayment.rewardPaymentAmount) && Intrinsics.areEqual(this.headerText, incompleteSinglePayment.headerText) && Intrinsics.areEqual(this.mainText, incompleteSinglePayment.mainText);
            }

            @Override // com.squareup.cash.account.settings.viewmodels.ReferralStatusViewModel
            public final String getHeaderText() {
                return this.headerText;
            }

            @Override // com.squareup.cash.account.settings.viewmodels.ReferralStatusViewModel
            public final String getMainText() {
                return this.mainText;
            }

            public final int hashCode() {
                int m = NavAction$$ExternalSyntheticOutline0.m(this.rewardPaymentAmount, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Integer.hashCode(this.paymentTextColor) * 31, 31, this.paymentText), 31);
                String str = this.headerText;
                int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.mainText;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = re$$ExternalSyntheticOutline0.m("IncompleteSinglePayment(paymentTextColor=", this.paymentTextColor, ", paymentText=", this.paymentText, ", rewardPaymentAmount=");
                m.append(this.rewardPaymentAmount);
                m.append(", headerText=");
                m.append(this.headerText);
                m.append(", mainText=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.mainText, ")");
            }
        }
    }

    public abstract String getHeaderText();

    public abstract String getMainText();
}
