package com.squareup.cash.promotionsreferrals.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface PromotionsReferralsHomeViewEvent {

    public final class ActivePromotionTapped implements PromotionsReferralsHomeViewEvent {
        public final String actionUrl;
        public final String campaignToken;
        public final String campaignVariantToken;

        public ActivePromotionTapped(String str, String str2, String str3) {
            str.getClass();
            this.actionUrl = str;
            this.campaignToken = str2;
            this.campaignVariantToken = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActivePromotionTapped)) {
                return false;
            }
            ActivePromotionTapped activePromotionTapped = (ActivePromotionTapped) obj;
            return Intrinsics.areEqual(this.actionUrl, activePromotionTapped.actionUrl) && Intrinsics.areEqual(this.campaignToken, activePromotionTapped.campaignToken) && Intrinsics.areEqual(this.campaignVariantToken, activePromotionTapped.campaignVariantToken);
        }

        public final int hashCode() {
            int hashCode = this.actionUrl.hashCode() * 31;
            String str = this.campaignToken;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.campaignVariantToken;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ActivePromotionTapped(actionUrl=", this.actionUrl, ", campaignToken=", this.campaignToken, ", campaignVariantToken="), this.campaignVariantToken, ")");
        }
    }

    public final class AvailablePromotionTapped implements PromotionsReferralsHomeViewEvent {
        public final String actionUrl;
        public final String campaignToken;
        public final String campaignVariantToken;

        public AvailablePromotionTapped(String str, String str2, String str3) {
            str.getClass();
            this.actionUrl = str;
            this.campaignToken = str2;
            this.campaignVariantToken = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AvailablePromotionTapped)) {
                return false;
            }
            AvailablePromotionTapped availablePromotionTapped = (AvailablePromotionTapped) obj;
            return Intrinsics.areEqual(this.actionUrl, availablePromotionTapped.actionUrl) && Intrinsics.areEqual(this.campaignToken, availablePromotionTapped.campaignToken) && Intrinsics.areEqual(this.campaignVariantToken, availablePromotionTapped.campaignVariantToken);
        }

        public final int hashCode() {
            int hashCode = this.actionUrl.hashCode() * 31;
            String str = this.campaignToken;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.campaignVariantToken;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AvailablePromotionTapped(actionUrl=", this.actionUrl, ", campaignToken=", this.campaignToken, ", campaignVariantToken="), this.campaignVariantToken, ")");
        }
    }

    public final class EnterCodeTapped implements PromotionsReferralsHomeViewEvent {
        public static final EnterCodeTapped INSTANCE = new EnterCodeTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EnterCodeTapped);
        }

        public final int hashCode() {
            return -1823459176;
        }

        public final String toString() {
            return "EnterCodeTapped";
        }
    }

    public final class GoBack implements PromotionsReferralsHomeViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return 1875140936;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    public final class InviteFriendTapped implements PromotionsReferralsHomeViewEvent {
        public static final InviteFriendTapped INSTANCE = new InviteFriendTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InviteFriendTapped);
        }

        public final int hashCode() {
            return -523222452;
        }

        public final String toString() {
            return "InviteFriendTapped";
        }
    }

    public final class PromotionItemViewed implements PromotionsReferralsHomeViewEvent {
        public final String campaignToken;
        public final String campaignVariantToken;
        public final CurrentPromotionState state;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class CurrentPromotionState {
            public static final /* synthetic */ CurrentPromotionState[] $VALUES;
            public static final CurrentPromotionState ACTIVE;
            public static final CurrentPromotionState AVAILABLE;

            static {
                CurrentPromotionState currentPromotionState = new CurrentPromotionState("ACTIVE", 0);
                ACTIVE = currentPromotionState;
                CurrentPromotionState currentPromotionState2 = new CurrentPromotionState("AVAILABLE", 1);
                AVAILABLE = currentPromotionState2;
                $VALUES = new CurrentPromotionState[]{currentPromotionState, currentPromotionState2};
            }

            public static CurrentPromotionState valueOf(String str) {
                return (CurrentPromotionState) Enum.valueOf(CurrentPromotionState.class, str);
            }

            public static CurrentPromotionState[] values() {
                return (CurrentPromotionState[]) $VALUES.clone();
            }
        }

        public PromotionItemViewed(String str, String str2, CurrentPromotionState currentPromotionState) {
            this.campaignToken = str;
            this.campaignVariantToken = str2;
            this.state = currentPromotionState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PromotionItemViewed)) {
                return false;
            }
            PromotionItemViewed promotionItemViewed = (PromotionItemViewed) obj;
            return Intrinsics.areEqual(this.campaignToken, promotionItemViewed.campaignToken) && Intrinsics.areEqual(this.campaignVariantToken, promotionItemViewed.campaignVariantToken) && this.state == promotionItemViewed.state;
        }

        public final int hashCode() {
            String str = this.campaignToken;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.campaignVariantToken;
            return this.state.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PromotionItemViewed(campaignToken=", this.campaignToken, ", campaignVariantToken=", this.campaignVariantToken, ", state=");
            m.append(this.state);
            m.append(")");
            return m.toString();
        }
    }
}
