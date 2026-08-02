package com.squareup.cash.cashsubscriptions.common.v1_0;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Subscription$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        String str;
        ProductType productType;
        PaymentType paymentType;
        ?? decode;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        String str2 = null;
        String str3 = null;
        ProductType productType2 = null;
        PaymentType paymentType2 = null;
        SubscriptionState subscriptionState = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        Subscription$Tier$CashGreenTier subscription$Tier$CashGreenTier = null;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        Long l5 = null;
        String str10 = null;
        Long l6 = null;
        Long l7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Subscription(str2, str3, productType2, paymentType2, subscriptionState, subscription$Tier$CashGreenTier, str4, str5, str6, str7, str8, str9, l, l2, l3, l4, l5, str10, l6, l7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str2;
                    break;
                case 3:
                    str = str3;
                    productType = productType2;
                    paymentType = paymentType2;
                    try {
                        productType2 = ProductType.ADAPTER.decode(protoReader);
                        str3 = str;
                        paymentType2 = paymentType;
                        decode = str2;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 4:
                    str = str3;
                    productType = productType2;
                    paymentType = paymentType2;
                    try {
                        paymentType2 = PaymentType.ADAPTER.decode(protoReader);
                        str3 = str;
                        productType2 = productType;
                        decode = str2;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 5:
                    str = str3;
                    productType = productType2;
                    paymentType = paymentType2;
                    try {
                        subscriptionState = SubscriptionState.ADAPTER.decode(protoReader);
                        str3 = str;
                        productType2 = productType;
                        paymentType2 = paymentType;
                        decode = str2;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 6:
                    try {
                        str = str3;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                        e = e4;
                        str = str3;
                    }
                    try {
                        subscription$Tier$CashGreenTier = new Subscription$Tier$CashGreenTier((CashGreenTierType) CashGreenTierType.ADAPTER.decode(protoReader));
                        str3 = str;
                        decode = str2;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                        e = e5;
                        productType = productType2;
                        paymentType = paymentType2;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        decode = str2;
                        str3 = str;
                        productType2 = productType;
                        paymentType2 = paymentType;
                        str2 = decode;
                    }
                case 7:
                default:
                    protoReader.readUnknownField(nextTag);
                    str = str3;
                    productType = productType2;
                    paymentType = paymentType2;
                    decode = str2;
                    str3 = str;
                    productType2 = productType;
                    paymentType2 = paymentType;
                    break;
                case 8:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str2;
                    break;
                case 9:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str2;
                    break;
                case 10:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str2;
                    break;
                case 11:
                    str7 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str2;
                    break;
                case 12:
                    str8 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str2;
                    break;
                case 13:
                    str9 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str2;
                    break;
                case 14:
                    l = ProtoAdapter.INT64.decode(protoReader);
                    decode = str2;
                    break;
                case 15:
                    l2 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str2;
                    break;
                case 16:
                    l3 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str2;
                    break;
                case 17:
                    l4 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str2;
                    break;
                case 18:
                    l5 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str2;
                    break;
                case 19:
                    str10 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str2;
                    break;
                case 20:
                    l6 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str2;
                    break;
                case 21:
                    l7 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str2;
                    break;
            }
            str2 = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Subscription subscription = (Subscription) obj;
        reverseProtoWriter.getClass();
        subscription.getClass();
        reverseProtoWriter.writeBytes(subscription.unknownFields());
        Subscription$Tier$CashGreenTier subscription$Tier$CashGreenTier = subscription.tier;
        if (subscription$Tier$CashGreenTier != null) {
            CashGreenTierType.ADAPTER.encodeWithTag(reverseProtoWriter, 6, subscription$Tier$CashGreenTier.value);
        } else if (subscription$Tier$CashGreenTier != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 21, subscription.updated_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 20, subscription.created_at);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 19, subscription.cancellation_reason);
        protoAdapter.encodeWithTag(reverseProtoWriter, 18, subscription.cancelled_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 17, subscription.enrolled_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 16, subscription.current_period_end);
        protoAdapter.encodeWithTag(reverseProtoWriter, 15, subscription.current_period_start);
        protoAdapter.encodeWithTag(reverseProtoWriter, 14, subscription.last_payment_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 13, subscription.last_payment_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 12, subscription.recurring_series_id);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 11, subscription.account_reference_id);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, subscription.customer_request_id);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, subscription.grant_type);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, subscription.grant_id);
        SubscriptionState.ADAPTER.encodeWithTag(reverseProtoWriter, 5, subscription.state);
        PaymentType.ADAPTER.encodeWithTag(reverseProtoWriter, 4, subscription.payment_type);
        ProductType.ADAPTER.encodeWithTag(reverseProtoWriter, 3, subscription.product_type);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, subscription.customer_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, subscription.subscription_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Subscription subscription = (Subscription) obj;
        subscription.getClass();
        int size$okio = subscription.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = SubscriptionState.ADAPTER.encodedSizeWithTag(5, subscription.state) + PaymentType.ADAPTER.encodedSizeWithTag(4, subscription.payment_type) + ProductType.ADAPTER.encodedSizeWithTag(3, subscription.product_type) + protoAdapter.encodedSizeWithTag(2, subscription.customer_token) + protoAdapter.encodedSizeWithTag(1, subscription.subscription_token) + size$okio;
        Subscription$Tier$CashGreenTier subscription$Tier$CashGreenTier = subscription.tier;
        if (subscription$Tier$CashGreenTier != null) {
            encodedSizeWithTag += CashGreenTierType.ADAPTER.encodedSizeWithTag(6, subscription$Tier$CashGreenTier.value);
        } else if (subscription$Tier$CashGreenTier != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(13, subscription.last_payment_token) + protoAdapter.encodedSizeWithTag(12, subscription.recurring_series_id) + protoAdapter.encodedSizeWithTag(11, subscription.account_reference_id) + protoAdapter.encodedSizeWithTag(10, subscription.customer_request_id) + protoAdapter.encodedSizeWithTag(9, subscription.grant_type) + protoAdapter.encodedSizeWithTag(8, subscription.grant_id) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        return protoAdapter2.encodedSizeWithTag(21, subscription.updated_at) + protoAdapter2.encodedSizeWithTag(20, subscription.created_at) + protoAdapter.encodedSizeWithTag(19, subscription.cancellation_reason) + protoAdapter2.encodedSizeWithTag(18, subscription.cancelled_at) + protoAdapter2.encodedSizeWithTag(17, subscription.enrolled_at) + protoAdapter2.encodedSizeWithTag(16, subscription.current_period_end) + protoAdapter2.encodedSizeWithTag(15, subscription.current_period_start) + protoAdapter2.encodedSizeWithTag(14, subscription.last_payment_at) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Subscription subscription = (Subscription) obj;
        subscription.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = subscription.subscription_token;
        String str2 = subscription.customer_token;
        ProductType productType = subscription.product_type;
        PaymentType paymentType = subscription.payment_type;
        SubscriptionState subscriptionState = subscription.state;
        Subscription$Tier$CashGreenTier subscription$Tier$CashGreenTier = subscription.tier;
        String str3 = subscription.grant_id;
        String str4 = subscription.grant_type;
        String str5 = subscription.customer_request_id;
        String str6 = subscription.account_reference_id;
        String str7 = subscription.recurring_series_id;
        String str8 = subscription.last_payment_token;
        Long l = subscription.last_payment_at;
        Long l2 = subscription.current_period_start;
        Long l3 = subscription.current_period_end;
        Long l4 = subscription.enrolled_at;
        Long l5 = subscription.cancelled_at;
        String str9 = subscription.cancellation_reason;
        Long l6 = subscription.created_at;
        Long l7 = subscription.updated_at;
        byteString.getClass();
        return new Subscription(str, str2, productType, paymentType, subscriptionState, subscription$Tier$CashGreenTier, str3, str4, str5, str6, str7, str8, l, l2, l3, l4, l5, str9, l6, l7, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Subscription subscription = (Subscription) obj;
        subscription.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, subscription.subscription_token);
        protoAdapter.encodeWithTag(protoWriter, 2, subscription.customer_token);
        ProductType.ADAPTER.encodeWithTag(protoWriter, 3, subscription.product_type);
        PaymentType.ADAPTER.encodeWithTag(protoWriter, 4, subscription.payment_type);
        SubscriptionState.ADAPTER.encodeWithTag(protoWriter, 5, subscription.state);
        protoAdapter.encodeWithTag(protoWriter, 8, subscription.grant_id);
        protoAdapter.encodeWithTag(protoWriter, 9, subscription.grant_type);
        protoAdapter.encodeWithTag(protoWriter, 10, subscription.customer_request_id);
        protoAdapter.encodeWithTag(protoWriter, 11, subscription.account_reference_id);
        protoAdapter.encodeWithTag(protoWriter, 12, subscription.recurring_series_id);
        protoAdapter.encodeWithTag(protoWriter, 13, subscription.last_payment_token);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 14, subscription.last_payment_at);
        protoAdapter2.encodeWithTag(protoWriter, 15, subscription.current_period_start);
        protoAdapter2.encodeWithTag(protoWriter, 16, subscription.current_period_end);
        protoAdapter2.encodeWithTag(protoWriter, 17, subscription.enrolled_at);
        protoAdapter2.encodeWithTag(protoWriter, 18, subscription.cancelled_at);
        protoAdapter.encodeWithTag(protoWriter, 19, subscription.cancellation_reason);
        protoAdapter2.encodeWithTag(protoWriter, 20, subscription.created_at);
        protoAdapter2.encodeWithTag(protoWriter, 21, subscription.updated_at);
        Subscription$Tier$CashGreenTier subscription$Tier$CashGreenTier = subscription.tier;
        if (subscription$Tier$CashGreenTier != null) {
            CashGreenTierType.ADAPTER.encodeWithTag(protoWriter, 6, subscription$Tier$CashGreenTier.value);
        } else if (subscription$Tier$CashGreenTier != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(subscription.unknownFields());
    }
}
