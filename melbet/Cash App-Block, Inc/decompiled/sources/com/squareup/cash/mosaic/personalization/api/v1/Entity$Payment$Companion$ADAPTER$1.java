package com.squareup.cash.mosaic.personalization.api.v1;

import androidx.room.TransactorKt;
import com.squareup.cash.mosaic.personalization.api.v1.Entity;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class Entity$Payment$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Entity.Payment((Money) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Entity.Payment payment = (Entity.Payment) obj;
        reverseProtoWriter.getClass();
        payment.getClass();
        reverseProtoWriter.writeBytes(payment.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, payment.amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Entity.Payment payment = (Entity.Payment) obj;
        payment.getClass();
        return Money.ADAPTER.encodedSizeWithTag(1, payment.amount) + payment.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Entity.Payment payment = (Entity.Payment) obj;
        payment.getClass();
        Money money = payment.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Entity.Payment(money2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Entity.Payment payment = (Entity.Payment) obj;
        payment.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 1, payment.amount);
        protoWriter.writeBytes(payment.unknownFields());
    }
}
