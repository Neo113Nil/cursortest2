package com.squareup.cash.cryptonauts.api;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class SetUsdOverLNPaymentPreferenceResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetUsdOverLNPaymentPreferenceResponse((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        SetUsdOverLNPaymentPreferenceResponse setUsdOverLNPaymentPreferenceResponse = (SetUsdOverLNPaymentPreferenceResponse) obj;
        reverseProtoWriter.getClass();
        setUsdOverLNPaymentPreferenceResponse.getClass();
        reverseProtoWriter.writeBytes(setUsdOverLNPaymentPreferenceResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setUsdOverLNPaymentPreferenceResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetUsdOverLNPaymentPreferenceResponse setUsdOverLNPaymentPreferenceResponse = (SetUsdOverLNPaymentPreferenceResponse) obj;
        setUsdOverLNPaymentPreferenceResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, setUsdOverLNPaymentPreferenceResponse.response_context) + setUsdOverLNPaymentPreferenceResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetUsdOverLNPaymentPreferenceResponse setUsdOverLNPaymentPreferenceResponse = (SetUsdOverLNPaymentPreferenceResponse) obj;
        setUsdOverLNPaymentPreferenceResponse.getClass();
        ResponseContext responseContext = setUsdOverLNPaymentPreferenceResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SetUsdOverLNPaymentPreferenceResponse(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetUsdOverLNPaymentPreferenceResponse setUsdOverLNPaymentPreferenceResponse = (SetUsdOverLNPaymentPreferenceResponse) obj;
        setUsdOverLNPaymentPreferenceResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, setUsdOverLNPaymentPreferenceResponse.response_context);
        protoWriter.writeBytes(setUsdOverLNPaymentPreferenceResponse.unknownFields());
    }
}
