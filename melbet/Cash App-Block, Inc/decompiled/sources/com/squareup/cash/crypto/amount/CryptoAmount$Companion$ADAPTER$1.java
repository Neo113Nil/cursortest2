package com.squareup.cash.crypto.amount;

import androidx.room.TransactorKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class CryptoAmount$Companion$ADAPTER$1 extends ProtoAdapter {
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
                break;
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.UINT64.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = CryptoCurrency.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.UINT32.decode(protoReader);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        Long l = (Long) obj;
        if (l == null) {
            TransactorKt.missingRequiredFields(obj, "units");
            throw null;
        }
        long longValue = l.longValue();
        CryptoCurrency cryptoCurrency = (CryptoCurrency) obj2;
        if (cryptoCurrency != null) {
            return new CryptoAmount(longValue, cryptoCurrency, (Integer) obj3, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj2, "currency");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CryptoAmount cryptoAmount = (CryptoAmount) obj;
        reverseProtoWriter.getClass();
        cryptoAmount.getClass();
        reverseProtoWriter.writeBytes(cryptoAmount.unknownFields());
        ProtoAdapter.UINT32.encodeWithTag(reverseProtoWriter, 3, cryptoAmount.scale);
        CryptoCurrency.ADAPTER.encodeWithTag(reverseProtoWriter, 2, cryptoAmount.currency);
        ProtoAdapter.UINT64.encodeWithTag(reverseProtoWriter, 1, Long.valueOf(cryptoAmount.units));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CryptoAmount cryptoAmount = (CryptoAmount) obj;
        cryptoAmount.getClass();
        return ProtoAdapter.UINT32.encodedSizeWithTag(3, cryptoAmount.scale) + CryptoCurrency.ADAPTER.encodedSizeWithTag(2, cryptoAmount.currency) + ProtoAdapter.UINT64.encodedSizeWithTag(1, Long.valueOf(cryptoAmount.units)) + cryptoAmount.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CryptoAmount cryptoAmount = (CryptoAmount) obj;
        cryptoAmount.getClass();
        ByteString byteString = ByteString.EMPTY;
        long j = cryptoAmount.units;
        CryptoCurrency cryptoCurrency = cryptoAmount.currency;
        Integer num = cryptoAmount.scale;
        cryptoCurrency.getClass();
        byteString.getClass();
        return new CryptoAmount(j, cryptoCurrency, num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CryptoAmount cryptoAmount = (CryptoAmount) obj;
        cryptoAmount.getClass();
        ProtoAdapter.UINT64.encodeWithTag(protoWriter, 1, Long.valueOf(cryptoAmount.units));
        CryptoCurrency.ADAPTER.encodeWithTag(protoWriter, 2, cryptoAmount.currency);
        ProtoAdapter.UINT32.encodeWithTag(protoWriter, 3, cryptoAmount.scale);
        protoWriter.writeBytes(cryptoAmount.unknownFields());
    }
}
