package com.squareup.cash.p2pencore.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class RecurringPayment$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        ?? r3 = 0;
        String str = null;
        String str2 = null;
        Object obj = null;
        String str3 = null;
        Object obj2 = null;
        String str4 = null;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        String str5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            String str6 = r3;
            if (nextTag == -1) {
                return new RecurringPayment(str6, str, str2, (Money) obj, str3, (Schedule) obj2, str4, l, l2, l3, l4, str5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    r3 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 2:
                    str = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
                    break;
                case 5:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj2 = TransactorKt.decodeMessageOrMerge(Schedule.ADAPTER, protoReader, obj2);
                    break;
                case 7:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    l = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 9:
                    l2 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 10:
                    l3 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 11:
                    l4 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 12:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
            r3 = str6;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RecurringPayment recurringPayment = (RecurringPayment) obj;
        reverseProtoWriter.getClass();
        recurringPayment.getClass();
        reverseProtoWriter.writeBytes(recurringPayment.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, recurringPayment.primary_funding_instrument_token);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 11, recurringPayment.version);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, recurringPayment.canceled_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, recurringPayment.updated_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, recurringPayment.created_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, recurringPayment.f1180type);
        Schedule.ADAPTER.encodeWithTag(reverseProtoWriter, 6, recurringPayment.schedule);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, recurringPayment.initiator_note);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 4, recurringPayment.amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, recurringPayment.recipient_customer_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, recurringPayment.sender_customer_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, recurringPayment.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RecurringPayment recurringPayment = (RecurringPayment) obj;
        recurringPayment.getClass();
        int size$okio = recurringPayment.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(7, recurringPayment.f1180type) + Schedule.ADAPTER.encodedSizeWithTag(6, recurringPayment.schedule) + protoAdapter.encodedSizeWithTag(5, recurringPayment.initiator_note) + Money.ADAPTER.encodedSizeWithTag(4, recurringPayment.amount) + protoAdapter.encodedSizeWithTag(3, recurringPayment.recipient_customer_token) + protoAdapter.encodedSizeWithTag(2, recurringPayment.sender_customer_token) + protoAdapter.encodedSizeWithTag(1, recurringPayment.token) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        return protoAdapter.encodedSizeWithTag(12, recurringPayment.primary_funding_instrument_token) + protoAdapter2.encodedSizeWithTag(11, recurringPayment.version) + protoAdapter2.encodedSizeWithTag(10, recurringPayment.canceled_at) + protoAdapter2.encodedSizeWithTag(9, recurringPayment.updated_at) + protoAdapter2.encodedSizeWithTag(8, recurringPayment.created_at) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RecurringPayment recurringPayment = (RecurringPayment) obj;
        recurringPayment.getClass();
        Money money = recurringPayment.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Schedule schedule = recurringPayment.schedule;
        Schedule schedule2 = schedule != null ? (Schedule) Schedule.ADAPTER.redact(schedule) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = recurringPayment.token;
        String str2 = recurringPayment.sender_customer_token;
        String str3 = recurringPayment.recipient_customer_token;
        String str4 = recurringPayment.f1180type;
        Long l = recurringPayment.created_at;
        Long l2 = recurringPayment.updated_at;
        Long l3 = recurringPayment.canceled_at;
        Long l4 = recurringPayment.version;
        String str5 = recurringPayment.primary_funding_instrument_token;
        byteString.getClass();
        return new RecurringPayment(str, str2, str3, money2, null, schedule2, str4, l, l2, l3, l4, str5, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RecurringPayment recurringPayment = (RecurringPayment) obj;
        recurringPayment.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, recurringPayment.token);
        protoAdapter.encodeWithTag(protoWriter, 2, recurringPayment.sender_customer_token);
        protoAdapter.encodeWithTag(protoWriter, 3, recurringPayment.recipient_customer_token);
        Money.ADAPTER.encodeWithTag(protoWriter, 4, recurringPayment.amount);
        protoAdapter.encodeWithTag(protoWriter, 5, recurringPayment.initiator_note);
        Schedule.ADAPTER.encodeWithTag(protoWriter, 6, recurringPayment.schedule);
        protoAdapter.encodeWithTag(protoWriter, 7, recurringPayment.f1180type);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(protoWriter, 8, recurringPayment.created_at);
        protoAdapter2.encodeWithTag(protoWriter, 9, recurringPayment.updated_at);
        protoAdapter2.encodeWithTag(protoWriter, 10, recurringPayment.canceled_at);
        protoAdapter2.encodeWithTag(protoWriter, 11, recurringPayment.version);
        protoAdapter.encodeWithTag(protoWriter, 12, recurringPayment.primary_funding_instrument_token);
        protoWriter.writeBytes(recurringPayment.unknownFields());
    }
}
