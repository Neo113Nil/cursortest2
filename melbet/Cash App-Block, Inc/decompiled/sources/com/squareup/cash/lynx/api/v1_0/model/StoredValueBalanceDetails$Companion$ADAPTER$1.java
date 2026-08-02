package com.squareup.cash.lynx.api.v1_0.model;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class StoredValueBalanceDetails$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StoredValueBalanceDetails((Money) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        StoredValueBalanceDetails storedValueBalanceDetails = (StoredValueBalanceDetails) obj;
        reverseProtoWriter.getClass();
        storedValueBalanceDetails.getClass();
        reverseProtoWriter.writeBytes(storedValueBalanceDetails.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, storedValueBalanceDetails.balance);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StoredValueBalanceDetails storedValueBalanceDetails = (StoredValueBalanceDetails) obj;
        storedValueBalanceDetails.getClass();
        return Money.ADAPTER.encodedSizeWithTag(1, storedValueBalanceDetails.balance) + storedValueBalanceDetails.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StoredValueBalanceDetails storedValueBalanceDetails = (StoredValueBalanceDetails) obj;
        storedValueBalanceDetails.getClass();
        Money money = storedValueBalanceDetails.balance;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new StoredValueBalanceDetails(money2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StoredValueBalanceDetails storedValueBalanceDetails = (StoredValueBalanceDetails) obj;
        storedValueBalanceDetails.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 1, storedValueBalanceDetails.balance);
        protoWriter.writeBytes(storedValueBalanceDetails.unknownFields());
    }
}
