package com.squareup.cash.cryptonauts.api;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class StartCryptoOnboardingResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        ResponseContext responseContext = (ResponseContext) obj;
        if (responseContext != null) {
            return new StartCryptoOnboardingResponse(responseContext, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "response_context");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StartCryptoOnboardingResponse startCryptoOnboardingResponse = (StartCryptoOnboardingResponse) obj;
        reverseProtoWriter.getClass();
        startCryptoOnboardingResponse.getClass();
        reverseProtoWriter.writeBytes(startCryptoOnboardingResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, startCryptoOnboardingResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StartCryptoOnboardingResponse startCryptoOnboardingResponse = (StartCryptoOnboardingResponse) obj;
        startCryptoOnboardingResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, startCryptoOnboardingResponse.response_context) + startCryptoOnboardingResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StartCryptoOnboardingResponse startCryptoOnboardingResponse = (StartCryptoOnboardingResponse) obj;
        startCryptoOnboardingResponse.getClass();
        ResponseContext responseContext = (ResponseContext) ResponseContext.ADAPTER.redact(startCryptoOnboardingResponse.response_context);
        ByteString byteString = ByteString.EMPTY;
        responseContext.getClass();
        byteString.getClass();
        return new StartCryptoOnboardingResponse(responseContext, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StartCryptoOnboardingResponse startCryptoOnboardingResponse = (StartCryptoOnboardingResponse) obj;
        startCryptoOnboardingResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, startCryptoOnboardingResponse.response_context);
        protoWriter.writeBytes(startCryptoOnboardingResponse.unknownFields());
    }
}
