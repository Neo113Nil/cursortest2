package com.squareup.cash.cashapppay.viewmodels;

import com.squareup.cash.common.viewmodels.AvatarViewModel;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class GrantViewModel {

    public final class InTransactionTopUpInfo extends GrantViewModel {
        public static final InTransactionTopUpInfo INSTANCE = new InTransactionTopUpInfo();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InTransactionTopUpInfo);
        }

        public final int hashCode() {
            return 899496590;
        }

        public final String toString() {
            return "InTransactionTopUpInfo";
        }
    }

    public final class Main extends GrantViewModel {
        public final Money amount;
        public final AvatarViewModel avatar;
        public final FormBlocker.Element.CallToActionElement callToAction;
        public final PayWithCashAuthorizationBlocker.Footer footer;
        public final String subtitle;
        public final String title;

        public Main(AvatarViewModel avatarViewModel, String str, String str2, Money money, FormBlocker.Element.CallToActionElement callToActionElement, PayWithCashAuthorizationBlocker.Footer footer) {
            this.avatar = avatarViewModel;
            this.title = str;
            this.subtitle = str2;
            this.amount = money;
            this.callToAction = callToActionElement;
            this.footer = footer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Main)) {
                return false;
            }
            Main main = (Main) obj;
            return this.avatar.equals(main.avatar) && Intrinsics.areEqual(this.title, main.title) && Intrinsics.areEqual(this.subtitle, main.subtitle) && Intrinsics.areEqual(this.amount, main.amount) && Intrinsics.areEqual(this.callToAction, main.callToAction) && Intrinsics.areEqual(this.footer, main.footer);
        }

        public final int hashCode() {
            int hashCode = this.avatar.hashCode() * 31;
            String str = this.title;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.subtitle;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Money money = this.amount;
            int hashCode4 = (hashCode3 + (money == null ? 0 : money.hashCode())) * 31;
            FormBlocker.Element.CallToActionElement callToActionElement = this.callToAction;
            int hashCode5 = (hashCode4 + (callToActionElement == null ? 0 : callToActionElement.hashCode())) * 31;
            PayWithCashAuthorizationBlocker.Footer footer = this.footer;
            return Boolean.hashCode(false) + ((hashCode5 + (footer == null ? 0 : footer.hashCode())) * 31);
        }

        public final String toString() {
            return "Main(avatar=" + this.avatar + ", title=" + this.title + ", subtitle=" + this.subtitle + ", amount=" + this.amount + ", callToAction=" + this.callToAction + ", footer=" + this.footer + ", reset=false)";
        }
    }

    public final class OnDisplayInterstitial extends GrantViewModel {
        public final String statusText;

        public OnDisplayInterstitial(String str) {
            this.statusText = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnDisplayInterstitial) && this.statusText.equals(((OnDisplayInterstitial) obj).statusText);
        }

        public final int hashCode() {
            return this.statusText.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OnDisplayInterstitial(statusText=", this.statusText, ")");
        }
    }

    public final class SubmissionInFlight extends GrantViewModel {
        public final String label;

        public SubmissionInFlight(String str) {
            this.label = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubmissionInFlight) && Intrinsics.areEqual(this.label, ((SubmissionInFlight) obj).label);
        }

        public final int hashCode() {
            String str = this.label;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SubmissionInFlight(label=", this.label, ")");
        }
    }
}
