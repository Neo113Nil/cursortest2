package com.squareup.cash.cashmeoutside.app.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class RemittanceViewedResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RemittanceViewedResponse((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        RemittanceViewedResponse remittanceViewedResponse = (RemittanceViewedResponse) obj;
        reverseProtoWriter.getClass();
        remittanceViewedResponse.getClass();
        reverseProtoWriter.writeBytes(remittanceViewedResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, remittanceViewedResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RemittanceViewedResponse remittanceViewedResponse = (RemittanceViewedResponse) obj;
        remittanceViewedResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, remittanceViewedResponse.response_context) + remittanceViewedResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RemittanceViewedResponse remittanceViewedResponse = (RemittanceViewedResponse) obj;
        remittanceViewedResponse.getClass();
        ResponseContext responseContext = remittanceViewedResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RemittanceViewedResponse(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RemittanceViewedResponse remittanceViewedResponse = (RemittanceViewedResponse) obj;
        remittanceViewedResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, remittanceViewedResponse.response_context);
        protoWriter.writeBytes(remittanceViewedResponse.unknownFields());
    }
}
