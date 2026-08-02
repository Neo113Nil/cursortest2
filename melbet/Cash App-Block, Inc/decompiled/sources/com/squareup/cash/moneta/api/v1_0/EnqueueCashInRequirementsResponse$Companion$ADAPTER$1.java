package com.squareup.cash.moneta.api.v1_0;

import com.squareup.cash.moneta.api.v1_0.EnqueueCashInRequirementsResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class EnqueueCashInRequirementsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EnqueueCashInRequirementsResponse((EnqueueCashInRequirementsResponse.Status) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = EnqueueCashInRequirementsResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EnqueueCashInRequirementsResponse enqueueCashInRequirementsResponse = (EnqueueCashInRequirementsResponse) obj;
        reverseProtoWriter.getClass();
        enqueueCashInRequirementsResponse.getClass();
        reverseProtoWriter.writeBytes(enqueueCashInRequirementsResponse.unknownFields());
        EnqueueCashInRequirementsResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, enqueueCashInRequirementsResponse.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EnqueueCashInRequirementsResponse enqueueCashInRequirementsResponse = (EnqueueCashInRequirementsResponse) obj;
        enqueueCashInRequirementsResponse.getClass();
        return EnqueueCashInRequirementsResponse.Status.ADAPTER.encodedSizeWithTag(1, enqueueCashInRequirementsResponse.status) + enqueueCashInRequirementsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EnqueueCashInRequirementsResponse enqueueCashInRequirementsResponse = (EnqueueCashInRequirementsResponse) obj;
        enqueueCashInRequirementsResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        EnqueueCashInRequirementsResponse.Status status = enqueueCashInRequirementsResponse.status;
        byteString.getClass();
        return new EnqueueCashInRequirementsResponse(status, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EnqueueCashInRequirementsResponse enqueueCashInRequirementsResponse = (EnqueueCashInRequirementsResponse) obj;
        enqueueCashInRequirementsResponse.getClass();
        EnqueueCashInRequirementsResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, enqueueCashInRequirementsResponse.status);
        protoWriter.writeBytes(enqueueCashInRequirementsResponse.unknownFields());
    }
}
