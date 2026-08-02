package com.squareup.cash.cashsubscriptions.common.v1_0;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.rewardly.ui.UiReward;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Subscription extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Subscription> CREATOR;
    public final String account_reference_id;
    public final String cancellation_reason;
    public final Long cancelled_at;
    public final Long created_at;
    public final Long current_period_end;
    public final Long current_period_start;
    public final String customer_request_id;
    public final String customer_token;
    public final Long enrolled_at;
    public final String grant_id;
    public final String grant_type;
    public final Long last_payment_at;
    public final String last_payment_token;
    public final PaymentType payment_type;
    public final ProductType product_type;
    public final String recurring_series_id;
    public final SubscriptionState state;
    public final String subscription_token;
    public final Subscription$Tier$CashGreenTier tier;
    public final Long updated_at;

    static {
        Subscription$Companion$ADAPTER$1 subscription$Companion$ADAPTER$1 = new Subscription$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Subscription.class), "type.googleapis.com/squareup.cash.cashsubscriptions.common.v1_0.Subscription", Syntax.PROTO_2, null, "squareup/cash/cashsubscriptions/common/v1_0/CommonModels.proto");
        ADAPTER = subscription$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(subscription$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Subscription(String str, String str2, ProductType productType, PaymentType paymentType, SubscriptionState subscriptionState, Subscription$Tier$CashGreenTier subscription$Tier$CashGreenTier, String str3, String str4, String str5, String str6, String str7, String str8, Long l, Long l2, Long l3, Long l4, Long l5, String str9, Long l6, Long l7, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.subscription_token = str;
        this.customer_token = str2;
        this.product_type = productType;
        this.payment_type = paymentType;
        this.state = subscriptionState;
        this.tier = subscription$Tier$CashGreenTier;
        this.grant_id = str3;
        this.grant_type = str4;
        this.customer_request_id = str5;
        this.account_reference_id = str6;
        this.recurring_series_id = str7;
        this.last_payment_token = str8;
        this.last_payment_at = l;
        this.current_period_start = l2;
        this.current_period_end = l3;
        this.enrolled_at = l4;
        this.cancelled_at = l5;
        this.cancellation_reason = str9;
        this.created_at = l6;
        this.updated_at = l7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Subscription)) {
            return false;
        }
        Subscription subscription = (Subscription) obj;
        return Intrinsics.areEqual(unknownFields(), subscription.unknownFields()) && Intrinsics.areEqual(this.subscription_token, subscription.subscription_token) && Intrinsics.areEqual(this.customer_token, subscription.customer_token) && this.product_type == subscription.product_type && this.payment_type == subscription.payment_type && this.state == subscription.state && Intrinsics.areEqual(this.tier, subscription.tier) && Intrinsics.areEqual(this.grant_id, subscription.grant_id) && Intrinsics.areEqual(this.grant_type, subscription.grant_type) && Intrinsics.areEqual(this.customer_request_id, subscription.customer_request_id) && Intrinsics.areEqual(this.account_reference_id, subscription.account_reference_id) && Intrinsics.areEqual(this.recurring_series_id, subscription.recurring_series_id) && Intrinsics.areEqual(this.last_payment_token, subscription.last_payment_token) && Intrinsics.areEqual(this.last_payment_at, subscription.last_payment_at) && Intrinsics.areEqual(this.current_period_start, subscription.current_period_start) && Intrinsics.areEqual(this.current_period_end, subscription.current_period_end) && Intrinsics.areEqual(this.enrolled_at, subscription.enrolled_at) && Intrinsics.areEqual(this.cancelled_at, subscription.cancelled_at) && Intrinsics.areEqual(this.cancellation_reason, subscription.cancellation_reason) && Intrinsics.areEqual(this.created_at, subscription.created_at) && Intrinsics.areEqual(this.updated_at, subscription.updated_at);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.subscription_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.customer_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        ProductType productType = this.product_type;
        int hashCode4 = (hashCode3 + (productType != null ? productType.hashCode() : 0)) * 37;
        PaymentType paymentType = this.payment_type;
        int hashCode5 = (hashCode4 + (paymentType != null ? paymentType.hashCode() : 0)) * 37;
        SubscriptionState subscriptionState = this.state;
        int hashCode6 = (hashCode5 + (subscriptionState != null ? subscriptionState.hashCode() : 0)) * 37;
        Subscription$Tier$CashGreenTier subscription$Tier$CashGreenTier = this.tier;
        int hashCode7 = (hashCode6 + (subscription$Tier$CashGreenTier != null ? subscription$Tier$CashGreenTier.value.hashCode() : 0)) * 37;
        String str3 = this.grant_id;
        int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.grant_type;
        int hashCode9 = (hashCode8 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.customer_request_id;
        int hashCode10 = (hashCode9 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.account_reference_id;
        int hashCode11 = (hashCode10 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.recurring_series_id;
        int hashCode12 = (hashCode11 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.last_payment_token;
        int hashCode13 = (hashCode12 + (str8 != null ? str8.hashCode() : 0)) * 37;
        Long l = this.last_payment_at;
        int hashCode14 = (hashCode13 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.current_period_start;
        int hashCode15 = (hashCode14 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.current_period_end;
        int hashCode16 = (hashCode15 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        Long l4 = this.enrolled_at;
        int hashCode17 = (hashCode16 + (l4 != null ? Long.hashCode(l4.longValue()) : 0)) * 37;
        Long l5 = this.cancelled_at;
        int hashCode18 = (hashCode17 + (l5 != null ? Long.hashCode(l5.longValue()) : 0)) * 37;
        String str9 = this.cancellation_reason;
        int hashCode19 = (hashCode18 + (str9 != null ? str9.hashCode() : 0)) * 37;
        Long l6 = this.created_at;
        int hashCode20 = (hashCode19 + (l6 != null ? Long.hashCode(l6.longValue()) : 0)) * 37;
        Long l7 = this.updated_at;
        int hashCode21 = hashCode20 + (l7 != null ? Long.hashCode(l7.longValue()) : 0);
        this.hashCode = hashCode21;
        return hashCode21;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiReward.Builder builder = new UiReward.Builder(1);
        builder.token = this.subscription_token;
        builder.category = this.customer_token;
        builder.offerly_token = this.product_type;
        builder.reward_avatars = this.payment_type;
        builder.boost_attributes = this.state;
        builder.merchant_tokens = this.tier;
        builder.title = this.grant_id;
        builder.main_text = this.grant_type;
        builder.affiliate_link_url = this.customer_request_id;
        builder.user_agent = this.account_reference_id;
        builder.full_title_text = this.recurring_series_id;
        builder.discount_text = this.last_payment_token;
        builder.activation_date_time_ms = this.last_payment_at;
        builder.expiration_date_time_ms = this.current_period_start;
        builder.draggable = this.current_period_end;
        builder.is_custom_offer = this.enrolled_at;
        builder.redeemable_with_cash_card = this.cancelled_at;
        builder.merchant_name = this.cancellation_reason;
        builder.redeemable_with_cash_app_pay = this.created_at;
        builder.app_links = this.updated_at;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.subscription_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "subscription_token=", arrayList);
        }
        String str2 = this.customer_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "customer_token=", arrayList);
        }
        ProductType productType = this.product_type;
        if (productType != null) {
            arrayList.add("product_type=" + productType);
        }
        PaymentType paymentType = this.payment_type;
        if (paymentType != null) {
            arrayList.add("payment_type=" + paymentType);
        }
        SubscriptionState subscriptionState = this.state;
        if (subscriptionState != null) {
            arrayList.add("state=" + subscriptionState);
        }
        Subscription$Tier$CashGreenTier subscription$Tier$CashGreenTier = this.tier;
        if (subscription$Tier$CashGreenTier != null) {
            arrayList.add("tier=" + subscription$Tier$CashGreenTier);
        }
        String str3 = this.grant_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "grant_id=", arrayList);
        }
        String str4 = this.grant_type;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "grant_type=", arrayList);
        }
        String str5 = this.customer_request_id;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "customer_request_id=", arrayList);
        }
        String str6 = this.account_reference_id;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "account_reference_id=", arrayList);
        }
        String str7 = this.recurring_series_id;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "recurring_series_id=", arrayList);
        }
        String str8 = this.last_payment_token;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "last_payment_token=", arrayList);
        }
        Long l = this.last_payment_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("last_payment_at=", l, arrayList);
        }
        Long l2 = this.current_period_start;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("current_period_start=", l2, arrayList);
        }
        Long l3 = this.current_period_end;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("current_period_end=", l3, arrayList);
        }
        Long l4 = this.enrolled_at;
        if (l4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("enrolled_at=", l4, arrayList);
        }
        Long l5 = this.cancelled_at;
        if (l5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("cancelled_at=", l5, arrayList);
        }
        String str9 = this.cancellation_reason;
        if (str9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str9, "cancellation_reason=", arrayList);
        }
        Long l6 = this.created_at;
        if (l6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at=", l6, arrayList);
        }
        Long l7 = this.updated_at;
        if (l7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("updated_at=", l7, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Subscription{", "}", 0, null, null, 56);
    }
}
