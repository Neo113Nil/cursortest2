package com.squareup.cash.cryptonauts.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.cryptonauts.api.CryptoExchangeCustomerControl;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class CryptoExchangeCustomerControl$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CryptoExchangeCustomerControl((Boolean) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(CryptoExchangeCustomerControl.CryptoExchangeLimit.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CryptoExchangeCustomerControl cryptoExchangeCustomerControl = (CryptoExchangeCustomerControl) obj;
        reverseProtoWriter.getClass();
        cryptoExchangeCustomerControl.getClass();
        reverseProtoWriter.writeBytes(cryptoExchangeCustomerControl.unknownFields());
        CryptoExchangeCustomerControl.CryptoExchangeLimit.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, cryptoExchangeCustomerControl.limits);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, cryptoExchangeCustomerControl.is_enabled);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CryptoExchangeCustomerControl cryptoExchangeCustomerControl = (CryptoExchangeCustomerControl) obj;
        cryptoExchangeCustomerControl.getClass();
        return CryptoExchangeCustomerControl.CryptoExchangeLimit.ADAPTER.asRepeated().encodedSizeWithTag(2, cryptoExchangeCustomerControl.limits) + ProtoAdapter.BOOL.encodedSizeWithTag(1, cryptoExchangeCustomerControl.is_enabled) + cryptoExchangeCustomerControl.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CryptoExchangeCustomerControl cryptoExchangeCustomerControl = (CryptoExchangeCustomerControl) obj;
        cryptoExchangeCustomerControl.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(cryptoExchangeCustomerControl.limits, CryptoExchangeCustomerControl.CryptoExchangeLimit.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = cryptoExchangeCustomerControl.is_enabled;
        byteString.getClass();
        return new CryptoExchangeCustomerControl(bool, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CryptoExchangeCustomerControl cryptoExchangeCustomerControl = (CryptoExchangeCustomerControl) obj;
        cryptoExchangeCustomerControl.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, cryptoExchangeCustomerControl.is_enabled);
        CryptoExchangeCustomerControl.CryptoExchangeLimit.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, cryptoExchangeCustomerControl.limits);
        protoWriter.writeBytes(cryptoExchangeCustomerControl.unknownFields());
    }
}
