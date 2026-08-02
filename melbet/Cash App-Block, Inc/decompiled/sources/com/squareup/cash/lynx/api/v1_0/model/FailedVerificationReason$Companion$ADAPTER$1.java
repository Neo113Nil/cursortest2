package com.squareup.cash.lynx.api.v1_0.model;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class FailedVerificationReason$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new FailedVerificationReason((String) obj, (AuthResultCode) obj2, (AvsResultCode) obj3, (CvcResultCode) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = AuthResultCode.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 3) {
                try {
                    obj3 = AvsResultCode.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj4 = CvcResultCode.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FailedVerificationReason failedVerificationReason = (FailedVerificationReason) obj;
        reverseProtoWriter.getClass();
        failedVerificationReason.getClass();
        reverseProtoWriter.writeBytes(failedVerificationReason.unknownFields());
        CvcResultCode.ADAPTER.encodeWithTag(reverseProtoWriter, 4, failedVerificationReason.cvc_result);
        AvsResultCode.ADAPTER.encodeWithTag(reverseProtoWriter, 3, failedVerificationReason.avs_result);
        AuthResultCode.ADAPTER.encodeWithTag(reverseProtoWriter, 2, failedVerificationReason.auth_result);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, failedVerificationReason.failed_verification_result_reason);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FailedVerificationReason failedVerificationReason = (FailedVerificationReason) obj;
        failedVerificationReason.getClass();
        return CvcResultCode.ADAPTER.encodedSizeWithTag(4, failedVerificationReason.cvc_result) + AvsResultCode.ADAPTER.encodedSizeWithTag(3, failedVerificationReason.avs_result) + AuthResultCode.ADAPTER.encodedSizeWithTag(2, failedVerificationReason.auth_result) + ProtoAdapter.STRING.encodedSizeWithTag(1, failedVerificationReason.failed_verification_result_reason) + failedVerificationReason.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FailedVerificationReason failedVerificationReason = (FailedVerificationReason) obj;
        failedVerificationReason.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = failedVerificationReason.failed_verification_result_reason;
        AuthResultCode authResultCode = failedVerificationReason.auth_result;
        AvsResultCode avsResultCode = failedVerificationReason.avs_result;
        CvcResultCode cvcResultCode = failedVerificationReason.cvc_result;
        byteString.getClass();
        return new FailedVerificationReason(str, authResultCode, avsResultCode, cvcResultCode, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FailedVerificationReason failedVerificationReason = (FailedVerificationReason) obj;
        failedVerificationReason.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, failedVerificationReason.failed_verification_result_reason);
        AuthResultCode.ADAPTER.encodeWithTag(protoWriter, 2, failedVerificationReason.auth_result);
        AvsResultCode.ADAPTER.encodeWithTag(protoWriter, 3, failedVerificationReason.avs_result);
        CvcResultCode.ADAPTER.encodeWithTag(protoWriter, 4, failedVerificationReason.cvc_result);
        protoWriter.writeBytes(failedVerificationReason.unknownFields());
    }
}
