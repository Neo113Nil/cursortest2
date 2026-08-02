package com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app;

import androidx.room.TransactorKt;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.GetNewLineActivationStatusResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class GetNewLineActivationStatusResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GetNewLineActivationStatusResponse((ResponseContext) obj, (GetNewLineActivationStatusResponse.ActivationStatus) obj2, (Integer) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                try {
                    obj2 = GetNewLineActivationStatusResponse.ActivationStatus.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetNewLineActivationStatusResponse getNewLineActivationStatusResponse = (GetNewLineActivationStatusResponse) obj;
        reverseProtoWriter.getClass();
        getNewLineActivationStatusResponse.getClass();
        reverseProtoWriter.writeBytes(getNewLineActivationStatusResponse.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 3, getNewLineActivationStatusResponse.poll_interval_seconds);
        GetNewLineActivationStatusResponse.ActivationStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getNewLineActivationStatusResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getNewLineActivationStatusResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetNewLineActivationStatusResponse getNewLineActivationStatusResponse = (GetNewLineActivationStatusResponse) obj;
        getNewLineActivationStatusResponse.getClass();
        return ProtoAdapter.INT32.encodedSizeWithTag(3, getNewLineActivationStatusResponse.poll_interval_seconds) + GetNewLineActivationStatusResponse.ActivationStatus.ADAPTER.encodedSizeWithTag(2, getNewLineActivationStatusResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(1, getNewLineActivationStatusResponse.response_context) + getNewLineActivationStatusResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetNewLineActivationStatusResponse getNewLineActivationStatusResponse = (GetNewLineActivationStatusResponse) obj;
        getNewLineActivationStatusResponse.getClass();
        ResponseContext responseContext = getNewLineActivationStatusResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        GetNewLineActivationStatusResponse.ActivationStatus activationStatus = getNewLineActivationStatusResponse.status;
        Integer num = getNewLineActivationStatusResponse.poll_interval_seconds;
        byteString.getClass();
        return new GetNewLineActivationStatusResponse(responseContext2, activationStatus, num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetNewLineActivationStatusResponse getNewLineActivationStatusResponse = (GetNewLineActivationStatusResponse) obj;
        getNewLineActivationStatusResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, getNewLineActivationStatusResponse.response_context);
        GetNewLineActivationStatusResponse.ActivationStatus.ADAPTER.encodeWithTag(protoWriter, 2, getNewLineActivationStatusResponse.status);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getNewLineActivationStatusResponse.poll_interval_seconds);
        protoWriter.writeBytes(getNewLineActivationStatusResponse.unknownFields());
    }
}
