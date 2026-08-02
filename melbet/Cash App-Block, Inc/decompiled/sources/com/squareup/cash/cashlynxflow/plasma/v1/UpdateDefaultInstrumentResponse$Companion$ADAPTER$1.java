package com.squareup.cash.cashlynxflow.plasma.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class UpdateDefaultInstrumentResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UpdateDefaultInstrumentResponse((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        UpdateDefaultInstrumentResponse updateDefaultInstrumentResponse = (UpdateDefaultInstrumentResponse) obj;
        reverseProtoWriter.getClass();
        updateDefaultInstrumentResponse.getClass();
        reverseProtoWriter.writeBytes(updateDefaultInstrumentResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, updateDefaultInstrumentResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UpdateDefaultInstrumentResponse updateDefaultInstrumentResponse = (UpdateDefaultInstrumentResponse) obj;
        updateDefaultInstrumentResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, updateDefaultInstrumentResponse.response_context) + updateDefaultInstrumentResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UpdateDefaultInstrumentResponse updateDefaultInstrumentResponse = (UpdateDefaultInstrumentResponse) obj;
        updateDefaultInstrumentResponse.getClass();
        ResponseContext responseContext = updateDefaultInstrumentResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UpdateDefaultInstrumentResponse(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UpdateDefaultInstrumentResponse updateDefaultInstrumentResponse = (UpdateDefaultInstrumentResponse) obj;
        updateDefaultInstrumentResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, updateDefaultInstrumentResponse.response_context);
        protoWriter.writeBytes(updateDefaultInstrumentResponse.unknownFields());
    }
}
