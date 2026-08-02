package com.squareup.cash.devicegrip.service;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.devicegrip.service.RemoveDevicesResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class RemoveDevicesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RemoveDevicesResponse((ResponseContext) obj, m, (RemoveDevicesResponse.ErrorReason) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = RemoveDevicesResponse.ErrorReason.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RemoveDevicesResponse removeDevicesResponse = (RemoveDevicesResponse) obj;
        reverseProtoWriter.getClass();
        removeDevicesResponse.getClass();
        reverseProtoWriter.writeBytes(removeDevicesResponse.unknownFields());
        RemoveDevicesResponse.ErrorReason.ADAPTER.encodeWithTag(reverseProtoWriter, 3, removeDevicesResponse.error_reason);
        ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 2, removeDevicesResponse.failed_hashed_app_tokens);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, removeDevicesResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RemoveDevicesResponse removeDevicesResponse = (RemoveDevicesResponse) obj;
        removeDevicesResponse.getClass();
        return RemoveDevicesResponse.ErrorReason.ADAPTER.encodedSizeWithTag(3, removeDevicesResponse.error_reason) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, removeDevicesResponse.failed_hashed_app_tokens) + ResponseContext.ADAPTER.encodedSizeWithTag(1, removeDevicesResponse.response_context) + removeDevicesResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RemoveDevicesResponse removeDevicesResponse = (RemoveDevicesResponse) obj;
        removeDevicesResponse.getClass();
        ResponseContext responseContext = removeDevicesResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        List list = removeDevicesResponse.failed_hashed_app_tokens;
        RemoveDevicesResponse.ErrorReason errorReason = removeDevicesResponse.error_reason;
        list.getClass();
        byteString.getClass();
        return new RemoveDevicesResponse(responseContext2, list, errorReason, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RemoveDevicesResponse removeDevicesResponse = (RemoveDevicesResponse) obj;
        removeDevicesResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, removeDevicesResponse.response_context);
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, removeDevicesResponse.failed_hashed_app_tokens);
        RemoveDevicesResponse.ErrorReason.ADAPTER.encodeWithTag(protoWriter, 3, removeDevicesResponse.error_reason);
        protoWriter.writeBytes(removeDevicesResponse.unknownFields());
    }
}
