package com.squareup.cash.out.api.v1_0;

import com.squareup.cash.out.core.models.FailureReason;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class ExecuteCashOutResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ExecuteCashOutResponse((String) obj, (ExecuteCashOutStatus) obj2, (FailureReason) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = ExecuteCashOutStatus.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = FailureReason.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ExecuteCashOutResponse executeCashOutResponse = (ExecuteCashOutResponse) obj;
        reverseProtoWriter.getClass();
        executeCashOutResponse.getClass();
        reverseProtoWriter.writeBytes(executeCashOutResponse.unknownFields());
        FailureReason.ADAPTER.encodeWithTag(reverseProtoWriter, 3, executeCashOutResponse.failure_reason);
        ExecuteCashOutStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 2, executeCashOutResponse.status);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, executeCashOutResponse.transfer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ExecuteCashOutResponse executeCashOutResponse = (ExecuteCashOutResponse) obj;
        executeCashOutResponse.getClass();
        return FailureReason.ADAPTER.encodedSizeWithTag(3, executeCashOutResponse.failure_reason) + ExecuteCashOutStatus.ADAPTER.encodedSizeWithTag(2, executeCashOutResponse.status) + ProtoAdapter.STRING.encodedSizeWithTag(1, executeCashOutResponse.transfer_token) + executeCashOutResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ExecuteCashOutResponse executeCashOutResponse = (ExecuteCashOutResponse) obj;
        executeCashOutResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = executeCashOutResponse.transfer_token;
        ExecuteCashOutStatus executeCashOutStatus = executeCashOutResponse.status;
        FailureReason failureReason = executeCashOutResponse.failure_reason;
        byteString.getClass();
        return new ExecuteCashOutResponse(str, executeCashOutStatus, failureReason, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ExecuteCashOutResponse executeCashOutResponse = (ExecuteCashOutResponse) obj;
        executeCashOutResponse.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, executeCashOutResponse.transfer_token);
        ExecuteCashOutStatus.ADAPTER.encodeWithTag(protoWriter, 2, executeCashOutResponse.status);
        FailureReason.ADAPTER.encodeWithTag(protoWriter, 3, executeCashOutResponse.failure_reason);
        protoWriter.writeBytes(executeCashOutResponse.unknownFields());
    }
}
