package com.squareup.cash.cashlynxflow.api.v2;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class SelectInstrumentResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SelectInstrumentResponse((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SelectInstrumentResponse selectInstrumentResponse = (SelectInstrumentResponse) obj;
        reverseProtoWriter.getClass();
        selectInstrumentResponse.getClass();
        reverseProtoWriter.writeBytes(selectInstrumentResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, selectInstrumentResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SelectInstrumentResponse selectInstrumentResponse = (SelectInstrumentResponse) obj;
        selectInstrumentResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, selectInstrumentResponse.response_context) + selectInstrumentResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SelectInstrumentResponse selectInstrumentResponse = (SelectInstrumentResponse) obj;
        selectInstrumentResponse.getClass();
        ResponseContext responseContext = selectInstrumentResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SelectInstrumentResponse(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SelectInstrumentResponse selectInstrumentResponse = (SelectInstrumentResponse) obj;
        selectInstrumentResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, selectInstrumentResponse.response_context);
        protoWriter.writeBytes(selectInstrumentResponse.unknownFields());
    }
}
