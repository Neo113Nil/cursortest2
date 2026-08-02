package com.squareup.cash.moneta.api.v1_0;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CashInResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashInResponse((ResponseContext) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashInResponse cashInResponse = (CashInResponse) obj;
        reverseProtoWriter.getClass();
        cashInResponse.getClass();
        reverseProtoWriter.writeBytes(cashInResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, cashInResponse.passcode_token);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cashInResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashInResponse cashInResponse = (CashInResponse) obj;
        cashInResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, cashInResponse.passcode_token) + ResponseContext.ADAPTER.encodedSizeWithTag(1, cashInResponse.response_context) + cashInResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashInResponse cashInResponse = (CashInResponse) obj;
        cashInResponse.getClass();
        ResponseContext responseContext = cashInResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CashInResponse(responseContext2, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashInResponse cashInResponse = (CashInResponse) obj;
        cashInResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, cashInResponse.response_context);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, cashInResponse.passcode_token);
        protoWriter.writeBytes(cashInResponse.unknownFields());
    }
}
