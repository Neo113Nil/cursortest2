package com.squareup.cash.lynx.api.v1_0.model;

import androidx.room.TransactorKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class VerifyResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new VerifyResponse((VerifyResult) obj, (NotVerifiableReason) obj2, (FailedVerificationReason) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = VerifyResult.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                try {
                    obj2 = NotVerifiableReason.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(FailedVerificationReason.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        VerifyResponse verifyResponse = (VerifyResponse) obj;
        reverseProtoWriter.getClass();
        verifyResponse.getClass();
        reverseProtoWriter.writeBytes(verifyResponse.unknownFields());
        FailedVerificationReason.ADAPTER.encodeWithTag(reverseProtoWriter, 3, verifyResponse.failed_verification_reason);
        NotVerifiableReason.ADAPTER.encodeWithTag(reverseProtoWriter, 2, verifyResponse.not_verifiable_reason);
        VerifyResult.ADAPTER.encodeWithTag(reverseProtoWriter, 1, verifyResponse.verify_result);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        VerifyResponse verifyResponse = (VerifyResponse) obj;
        verifyResponse.getClass();
        return FailedVerificationReason.ADAPTER.encodedSizeWithTag(3, verifyResponse.failed_verification_reason) + NotVerifiableReason.ADAPTER.encodedSizeWithTag(2, verifyResponse.not_verifiable_reason) + VerifyResult.ADAPTER.encodedSizeWithTag(1, verifyResponse.verify_result) + verifyResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        VerifyResponse verifyResponse = (VerifyResponse) obj;
        verifyResponse.getClass();
        FailedVerificationReason failedVerificationReason = verifyResponse.failed_verification_reason;
        FailedVerificationReason failedVerificationReason2 = failedVerificationReason != null ? (FailedVerificationReason) FailedVerificationReason.ADAPTER.redact(failedVerificationReason) : null;
        ByteString byteString = ByteString.EMPTY;
        VerifyResult verifyResult = verifyResponse.verify_result;
        NotVerifiableReason notVerifiableReason = verifyResponse.not_verifiable_reason;
        byteString.getClass();
        return new VerifyResponse(verifyResult, notVerifiableReason, failedVerificationReason2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        VerifyResponse verifyResponse = (VerifyResponse) obj;
        verifyResponse.getClass();
        VerifyResult.ADAPTER.encodeWithTag(protoWriter, 1, verifyResponse.verify_result);
        NotVerifiableReason.ADAPTER.encodeWithTag(protoWriter, 2, verifyResponse.not_verifiable_reason);
        FailedVerificationReason.ADAPTER.encodeWithTag(protoWriter, 3, verifyResponse.failed_verification_reason);
        protoWriter.writeBytes(verifyResponse.unknownFields());
    }
}
