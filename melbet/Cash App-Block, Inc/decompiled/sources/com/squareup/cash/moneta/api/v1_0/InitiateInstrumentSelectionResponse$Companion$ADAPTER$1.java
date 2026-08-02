package com.squareup.cash.moneta.api.v1_0;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class InitiateInstrumentSelectionResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InitiateInstrumentSelectionResponse((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        InitiateInstrumentSelectionResponse initiateInstrumentSelectionResponse = (InitiateInstrumentSelectionResponse) obj;
        reverseProtoWriter.getClass();
        initiateInstrumentSelectionResponse.getClass();
        reverseProtoWriter.writeBytes(initiateInstrumentSelectionResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, initiateInstrumentSelectionResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InitiateInstrumentSelectionResponse initiateInstrumentSelectionResponse = (InitiateInstrumentSelectionResponse) obj;
        initiateInstrumentSelectionResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, initiateInstrumentSelectionResponse.response_context) + initiateInstrumentSelectionResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InitiateInstrumentSelectionResponse initiateInstrumentSelectionResponse = (InitiateInstrumentSelectionResponse) obj;
        initiateInstrumentSelectionResponse.getClass();
        ResponseContext responseContext = initiateInstrumentSelectionResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new InitiateInstrumentSelectionResponse(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InitiateInstrumentSelectionResponse initiateInstrumentSelectionResponse = (InitiateInstrumentSelectionResponse) obj;
        initiateInstrumentSelectionResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, initiateInstrumentSelectionResponse.response_context);
        protoWriter.writeBytes(initiateInstrumentSelectionResponse.unknownFields());
    }
}
