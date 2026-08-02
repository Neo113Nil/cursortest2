package com.squareup.cash.cryptonauts.api;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class GetCryptoControlsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetCryptoControlsResponse((String) obj, (CryptoExchangeCustomerControl) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(CryptoExchangeCustomerControl.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetCryptoControlsResponse getCryptoControlsResponse = (GetCryptoControlsResponse) obj;
        reverseProtoWriter.getClass();
        getCryptoControlsResponse.getClass();
        reverseProtoWriter.writeBytes(getCryptoControlsResponse.unknownFields());
        CryptoExchangeCustomerControl.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getCryptoControlsResponse.crypto_exchange_customer_control);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, getCryptoControlsResponse.prerequisite_link);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetCryptoControlsResponse getCryptoControlsResponse = (GetCryptoControlsResponse) obj;
        getCryptoControlsResponse.getClass();
        return CryptoExchangeCustomerControl.ADAPTER.encodedSizeWithTag(2, getCryptoControlsResponse.crypto_exchange_customer_control) + ProtoAdapter.STRING.encodedSizeWithTag(1, getCryptoControlsResponse.prerequisite_link) + getCryptoControlsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetCryptoControlsResponse getCryptoControlsResponse = (GetCryptoControlsResponse) obj;
        getCryptoControlsResponse.getClass();
        CryptoExchangeCustomerControl cryptoExchangeCustomerControl = getCryptoControlsResponse.crypto_exchange_customer_control;
        CryptoExchangeCustomerControl cryptoExchangeCustomerControl2 = cryptoExchangeCustomerControl != null ? (CryptoExchangeCustomerControl) CryptoExchangeCustomerControl.ADAPTER.redact(cryptoExchangeCustomerControl) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = getCryptoControlsResponse.prerequisite_link;
        byteString.getClass();
        return new GetCryptoControlsResponse(str, cryptoExchangeCustomerControl2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetCryptoControlsResponse getCryptoControlsResponse = (GetCryptoControlsResponse) obj;
        getCryptoControlsResponse.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getCryptoControlsResponse.prerequisite_link);
        CryptoExchangeCustomerControl.ADAPTER.encodeWithTag(protoWriter, 2, getCryptoControlsResponse.crypto_exchange_customer_control);
        protoWriter.writeBytes(getCryptoControlsResponse.unknownFields());
    }
}
