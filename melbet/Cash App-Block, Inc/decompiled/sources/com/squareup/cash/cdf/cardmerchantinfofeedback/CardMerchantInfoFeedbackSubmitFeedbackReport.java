package com.squareup.cash.cdf.cardmerchantinfofeedback;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CardMerchantInfoFeedbackSubmitFeedbackReport implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.SNOWFLAKE);
    public final String customer_token;
    public final IssueType issue_type;
    public final String merchant_token;
    public final LinkedHashMap parameters;
    public final String parent_merchant_token;
    public final String transaction_token;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class IssueType {
        public static final /* synthetic */ IssueType[] $VALUES;
        public static final IssueType MerchantLocation;
        public static final IssueType MerchantLogo;
        public static final IssueType MerchantName;

        static {
            IssueType issueType = new IssueType("MerchantName", 0);
            MerchantName = issueType;
            IssueType issueType2 = new IssueType("MerchantLogo", 1);
            MerchantLogo = issueType2;
            IssueType issueType3 = new IssueType("MerchantLocation", 2);
            MerchantLocation = issueType3;
            $VALUES = new IssueType[]{issueType, issueType2, issueType3};
        }

        public static IssueType valueOf(String str) {
            return (IssueType) Enum.valueOf(IssueType.class, str);
        }

        public static IssueType[] values() {
            return (IssueType[]) $VALUES.clone();
        }
    }

    public CardMerchantInfoFeedbackSubmitFeedbackReport(String str, String str2, String str3, String str4, IssueType issueType) {
        this.merchant_token = str;
        this.parent_merchant_token = str2;
        this.customer_token = str3;
        this.transaction_token = str4;
        this.issue_type = issueType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "CardMerchantInfoFeedback", "cdf_action", "Submit");
        Countries.putSafe(m, "merchant_token", str);
        Countries.putSafe(m, "parent_merchant_token", str2);
        Countries.putSafe(m, "customer_token", str3);
        Countries.putSafe(m, "transaction_token", str4);
        Countries.putSafe(m, "issue_type", issueType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardMerchantInfoFeedbackSubmitFeedbackReport)) {
            return false;
        }
        CardMerchantInfoFeedbackSubmitFeedbackReport cardMerchantInfoFeedbackSubmitFeedbackReport = (CardMerchantInfoFeedbackSubmitFeedbackReport) obj;
        return Intrinsics.areEqual(this.merchant_token, cardMerchantInfoFeedbackSubmitFeedbackReport.merchant_token) && Intrinsics.areEqual(this.parent_merchant_token, cardMerchantInfoFeedbackSubmitFeedbackReport.parent_merchant_token) && this.customer_token.equals(cardMerchantInfoFeedbackSubmitFeedbackReport.customer_token) && Intrinsics.areEqual(this.transaction_token, cardMerchantInfoFeedbackSubmitFeedbackReport.transaction_token) && this.issue_type == cardMerchantInfoFeedbackSubmitFeedbackReport.issue_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CardMerchantInfoFeedback Submit FeedbackReport";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.merchant_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.parent_merchant_token;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.customer_token);
        String str3 = this.transaction_token;
        return this.issue_type.hashCode() + ((m + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CardMerchantInfoFeedbackSubmitFeedbackReport(merchant_token=", this.merchant_token, ", parent_merchant_token=", this.parent_merchant_token, ", customer_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.customer_token, ", transaction_token=", this.transaction_token, ", issue_type=");
        m.append(this.issue_type);
        m.append(")");
        return m.toString();
    }
}
