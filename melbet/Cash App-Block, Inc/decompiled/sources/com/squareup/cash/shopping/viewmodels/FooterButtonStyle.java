package com.squareup.cash.shopping.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.squareup.cash.shopping.viewmodels.PillStage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface FooterButtonStyle {

    public final class AffiliateButton implements FooterButtonStyle {
        public static final AffiliateButton INSTANCE = new AffiliateButton();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AffiliateButton);
        }

        public final int hashCode() {
            return -5752726;
        }

        public final String toString() {
            return "AffiliateButton";
        }
    }

    public final class AfterPayButton implements FooterButtonStyle {
        public final boolean expandInfoButton;

        public AfterPayButton(boolean z) {
            this.expandInfoButton = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AfterPayButton) && this.expandInfoButton == ((AfterPayButton) obj).expandInfoButton;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.expandInfoButton);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("AfterPayButton(expandInfoButton=", ")", this.expandInfoButton);
        }
    }

    public interface FooterButtonStyleV2 extends FooterButtonStyle {

        public final class AffiliateButton implements FooterButtonStyleV2 {
            public final String discountAmount;

            public AffiliateButton(String str) {
                str.getClass();
                this.discountAmount = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AffiliateButton) || !Intrinsics.areEqual(this.discountAmount, ((AffiliateButton) obj).discountAmount)) {
                    return false;
                }
                PillStage.Initial initial = PillStage.Initial.INSTANCE;
                return initial.equals(initial);
            }

            @Override // com.squareup.cash.shopping.viewmodels.FooterButtonStyle.FooterButtonStyleV2
            public final PillStage getPillStage() {
                return PillStage.Initial.INSTANCE;
            }

            public final int hashCode() {
                return (this.discountAmount.hashCode() * 31) - 170870768;
            }

            public final String toString() {
                return "AffiliateButton(discountAmount=" + this.discountAmount + ", pillStage=" + PillStage.Initial.INSTANCE + ")";
            }
        }

        public final class AfterPayButton implements FooterButtonStyleV2 {
            public final int instalmentCount;

            public AfterPayButton(int i) {
                this.instalmentCount = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AfterPayButton) || this.instalmentCount != ((AfterPayButton) obj).instalmentCount) {
                    return false;
                }
                PillStage.Initial initial = PillStage.Initial.INSTANCE;
                return initial.equals(initial);
            }

            @Override // com.squareup.cash.shopping.viewmodels.FooterButtonStyle.FooterButtonStyleV2
            public final PillStage getPillStage() {
                return PillStage.Initial.INSTANCE;
            }

            public final int hashCode() {
                return (Integer.hashCode(this.instalmentCount) * 31) - 170870768;
            }

            public final String toString() {
                return "AfterPayButton(instalmentCount=" + this.instalmentCount + ", pillStage=" + PillStage.Initial.INSTANCE + ")";
            }
        }

        public final class IncentiveButton implements FooterButtonStyleV2 {
            public final String discountAmount;

            public IncentiveButton(String str) {
                str.getClass();
                this.discountAmount = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof IncentiveButton) || !Intrinsics.areEqual(this.discountAmount, ((IncentiveButton) obj).discountAmount)) {
                    return false;
                }
                PillStage.Initial initial = PillStage.Initial.INSTANCE;
                return initial.equals(initial);
            }

            @Override // com.squareup.cash.shopping.viewmodels.FooterButtonStyle.FooterButtonStyleV2
            public final PillStage getPillStage() {
                return PillStage.Initial.INSTANCE;
            }

            public final int hashCode() {
                return (this.discountAmount.hashCode() * 31) - 170870768;
            }

            public final String toString() {
                return "IncentiveButton(discountAmount=" + this.discountAmount + ", pillStage=" + PillStage.Initial.INSTANCE + ")";
            }
        }

        public final class SingleUsePaymentButton implements FooterButtonStyleV2 {
            public final PillStage pillStage;

            public SingleUsePaymentButton(PillStage pillStage) {
                this.pillStage = pillStage;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SingleUsePaymentButton) && this.pillStage.equals(((SingleUsePaymentButton) obj).pillStage);
            }

            @Override // com.squareup.cash.shopping.viewmodels.FooterButtonStyle.FooterButtonStyleV2
            public final PillStage getPillStage() {
                return this.pillStage;
            }

            public final int hashCode() {
                return this.pillStage.hashCode();
            }

            public final String toString() {
                return "SingleUsePaymentButton(pillStage=" + this.pillStage + ")";
            }
        }

        PillStage getPillStage();
    }

    public final class InfoButton implements FooterButtonStyle {
        public static final InfoButton INSTANCE = new InfoButton();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InfoButton);
        }

        public final int hashCode() {
            return -1091787499;
        }

        public final String toString() {
            return "InfoButton";
        }
    }

    public final class SingleUsePaymentButton implements FooterButtonStyle {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SingleUsePaymentButton);
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        public final String toString() {
            return "SingleUsePaymentButton(isEnabled=false)";
        }
    }
}
