package com.squareup.cash.cryptonauts.api;

import androidx.room.TransactorKt;
import com.squareup.cash.cryptonauts.api.CryptoExchangeCustomerControl;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class CryptoExchangeCustomerControl$CryptoExchangeLimit$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CryptoExchangeCustomerControl.CryptoExchangeLimit((CryptoExchangeCustomerControl.CryptoExchangeLimit.Frequency) obj, (Money) obj2, (Money) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = CryptoExchangeCustomerControl.CryptoExchangeLimit.Frequency.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CryptoExchangeCustomerControl.CryptoExchangeLimit cryptoExchangeLimit = (CryptoExchangeCustomerControl.CryptoExchangeLimit) obj;
        reverseProtoWriter.getClass();
        cryptoExchangeLimit.getClass();
        reverseProtoWriter.writeBytes(cryptoExchangeLimit.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, cryptoExchangeLimit.remaining_usage);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cryptoExchangeLimit.max);
        CryptoExchangeCustomerControl.CryptoExchangeLimit.Frequency.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cryptoExchangeLimit.frequency);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CryptoExchangeCustomerControl.CryptoExchangeLimit cryptoExchangeLimit = (CryptoExchangeCustomerControl.CryptoExchangeLimit) obj;
        cryptoExchangeLimit.getClass();
        int encodedSizeWithTag = CryptoExchangeCustomerControl.CryptoExchangeLimit.Frequency.ADAPTER.encodedSizeWithTag(1, cryptoExchangeLimit.frequency) + cryptoExchangeLimit.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, cryptoExchangeLimit.remaining_usage) + protoAdapter.encodedSizeWithTag(2, cryptoExchangeLimit.max) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CryptoExchangeCustomerControl.CryptoExchangeLimit cryptoExchangeLimit = (CryptoExchangeCustomerControl.CryptoExchangeLimit) obj;
        cryptoExchangeLimit.getClass();
        Money money = cryptoExchangeLimit.max;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = cryptoExchangeLimit.remaining_usage;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        CryptoExchangeCustomerControl.CryptoExchangeLimit.Frequency frequency = cryptoExchangeLimit.frequency;
        byteString.getClass();
        return new CryptoExchangeCustomerControl.CryptoExchangeLimit(frequency, money2, money4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CryptoExchangeCustomerControl.CryptoExchangeLimit cryptoExchangeLimit = (CryptoExchangeCustomerControl.CryptoExchangeLimit) obj;
        cryptoExchangeLimit.getClass();
        CryptoExchangeCustomerControl.CryptoExchangeLimit.Frequency.ADAPTER.encodeWithTag(protoWriter, 1, cryptoExchangeLimit.frequency);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, cryptoExchangeLimit.max);
        protoAdapter.encodeWithTag(protoWriter, 3, cryptoExchangeLimit.remaining_usage);
        protoWriter.writeBytes(cryptoExchangeLimit.unknownFields());
    }
}
