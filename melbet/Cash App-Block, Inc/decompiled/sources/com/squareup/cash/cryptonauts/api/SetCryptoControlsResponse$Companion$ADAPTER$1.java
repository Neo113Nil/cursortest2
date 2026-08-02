package com.squareup.cash.cryptonauts.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class SetCryptoControlsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        SetCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl setCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetCryptoControlsResponse(setCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                setCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl = new SetCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl((CryptoExchangeCustomerControl) CryptoExchangeCustomerControl.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetCryptoControlsResponse setCryptoControlsResponse = (SetCryptoControlsResponse) obj;
        reverseProtoWriter.getClass();
        setCryptoControlsResponse.getClass();
        reverseProtoWriter.writeBytes(setCryptoControlsResponse.unknownFields());
        SetCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl setCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl = setCryptoControlsResponse.customer_control;
        if (setCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl != null) {
            CryptoExchangeCustomerControl.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl.value);
        } else {
            if (setCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetCryptoControlsResponse setCryptoControlsResponse = (SetCryptoControlsResponse) obj;
        setCryptoControlsResponse.getClass();
        int size$okio = setCryptoControlsResponse.unknownFields().getSize$okio();
        SetCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl setCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl = setCryptoControlsResponse.customer_control;
        if (setCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl != null) {
            return CryptoExchangeCustomerControl.ADAPTER.encodedSizeWithTag(1, setCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl.value) + size$okio;
        }
        if (setCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl == null) {
            return size$okio;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetCryptoControlsResponse setCryptoControlsResponse = (SetCryptoControlsResponse) obj;
        setCryptoControlsResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        SetCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl setCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl = setCryptoControlsResponse.customer_control;
        byteString.getClass();
        return new SetCryptoControlsResponse(setCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetCryptoControlsResponse setCryptoControlsResponse = (SetCryptoControlsResponse) obj;
        setCryptoControlsResponse.getClass();
        SetCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl setCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl = setCryptoControlsResponse.customer_control;
        if (setCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl != null) {
            CryptoExchangeCustomerControl.ADAPTER.encodeWithTag(protoWriter, 1, setCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl.value);
        } else if (setCryptoControlsResponse$CustomerControl$CryptoExchangeCustomerControl != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(setCryptoControlsResponse.unknownFields());
    }
}
