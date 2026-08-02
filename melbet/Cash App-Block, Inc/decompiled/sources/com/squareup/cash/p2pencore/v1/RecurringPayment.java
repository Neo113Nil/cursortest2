package com.squareup.cash.p2pencore.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
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
import xyz.block.protos.genie.Expression;

/* loaded from: classes6.dex */
public final class RecurringPayment extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RecurringPayment> CREATOR;
    public final Money amount;
    public final Long canceled_at;
    public final Long created_at;
    public final String initiator_note;
    public final String primary_funding_instrument_token;
    public final String recipient_customer_token;
    public final Schedule schedule;
    public final String sender_customer_token;
    public final String token;

    /* renamed from: type, reason: collision with root package name */
    public final String f1180type;
    public final Long updated_at;
    public final Long version;

    static {
        RecurringPayment$Companion$ADAPTER$1 recurringPayment$Companion$ADAPTER$1 = new RecurringPayment$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RecurringPayment.class), "type.googleapis.com/squareup.cash.p2pencore.v1beta1.RecurringPayment", Syntax.PROTO_2, null, "squareup/cash/p2pencore/v1beta1/recurring_payments.proto");
        ADAPTER = recurringPayment$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(recurringPayment$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringPayment(String str, String str2, String str3, Money money, String str4, Schedule schedule, String str5, Long l, Long l2, Long l3, Long l4, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.sender_customer_token = str2;
        this.recipient_customer_token = str3;
        this.amount = money;
        this.initiator_note = str4;
        this.schedule = schedule;
        this.f1180type = str5;
        this.created_at = l;
        this.updated_at = l2;
        this.canceled_at = l3;
        this.version = l4;
        this.primary_funding_instrument_token = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecurringPayment)) {
            return false;
        }
        RecurringPayment recurringPayment = (RecurringPayment) obj;
        return Intrinsics.areEqual(unknownFields(), recurringPayment.unknownFields()) && Intrinsics.areEqual(this.token, recurringPayment.token) && Intrinsics.areEqual(this.sender_customer_token, recurringPayment.sender_customer_token) && Intrinsics.areEqual(this.recipient_customer_token, recurringPayment.recipient_customer_token) && Intrinsics.areEqual(this.amount, recurringPayment.amount) && Intrinsics.areEqual(this.initiator_note, recurringPayment.initiator_note) && Intrinsics.areEqual(this.schedule, recurringPayment.schedule) && Intrinsics.areEqual(this.f1180type, recurringPayment.f1180type) && Intrinsics.areEqual(this.created_at, recurringPayment.created_at) && Intrinsics.areEqual(this.updated_at, recurringPayment.updated_at) && Intrinsics.areEqual(this.canceled_at, recurringPayment.canceled_at) && Intrinsics.areEqual(this.version, recurringPayment.version) && Intrinsics.areEqual(this.primary_funding_instrument_token, recurringPayment.primary_funding_instrument_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.sender_customer_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.recipient_customer_token;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode5 = (hashCode4 + (money != null ? money.hashCode() : 0)) * 37;
        String str4 = this.initiator_note;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Schedule schedule = this.schedule;
        int hashCode7 = (hashCode6 + (schedule != null ? schedule.hashCode() : 0)) * 37;
        String str5 = this.f1180type;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Long l = this.created_at;
        int hashCode9 = (hashCode8 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.updated_at;
        int hashCode10 = (hashCode9 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.canceled_at;
        int hashCode11 = (hashCode10 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        Long l4 = this.version;
        int hashCode12 = (hashCode11 + (l4 != null ? Long.hashCode(l4.longValue()) : 0)) * 37;
        String str6 = this.primary_funding_instrument_token;
        int hashCode13 = hashCode12 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = hashCode13;
        return hashCode13;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Expression.Builder builder = new Expression.Builder(3, false);
        builder.string_literal = this.token;
        builder.key_path_ref = this.sender_customer_token;
        builder.float_literal = this.recipient_customer_token;
        builder.bool_literal = this.amount;
        builder.blob_literal = this.initiator_note;
        builder.unary_op = this.schedule;
        builder.binary_op = this.f1180type;
        builder.int_literal = this.created_at;
        builder.conditional_op = this.updated_at;
        builder.filter_op = this.canceled_at;
        builder.collection_literal = this.version;
        builder.format_string_op = this.primary_funding_instrument_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.sender_customer_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "sender_customer_token=", arrayList);
        }
        String str3 = this.recipient_customer_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "recipient_customer_token=", arrayList);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        if (this.initiator_note != null) {
            arrayList.add("initiator_note=██");
        }
        Schedule schedule = this.schedule;
        if (schedule != null) {
            arrayList.add("schedule=" + schedule);
        }
        String str4 = this.f1180type;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "type=", arrayList);
        }
        Long l = this.created_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at=", l, arrayList);
        }
        Long l2 = this.updated_at;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("updated_at=", l2, arrayList);
        }
        Long l3 = this.canceled_at;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("canceled_at=", l3, arrayList);
        }
        Long l4 = this.version;
        if (l4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("version=", l4, arrayList);
        }
        String str5 = this.primary_funding_instrument_token;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "primary_funding_instrument_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RecurringPayment{", "}", 0, null, null, 56);
    }
}
