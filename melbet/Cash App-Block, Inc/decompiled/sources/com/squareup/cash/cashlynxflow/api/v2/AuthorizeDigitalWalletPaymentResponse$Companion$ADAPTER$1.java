package com.squareup.cash.cashlynxflow.api.v2;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class AuthorizeDigitalWalletPaymentResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AuthorizeDigitalWalletPaymentResponse((ResponseContext) obj2, (Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AuthorizeDigitalWalletPaymentResponse authorizeDigitalWalletPaymentResponse = (AuthorizeDigitalWalletPaymentResponse) obj;
        reverseProtoWriter.getClass();
        authorizeDigitalWalletPaymentResponse.getClass();
        reverseProtoWriter.writeBytes(authorizeDigitalWalletPaymentResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, authorizeDigitalWalletPaymentResponse.response_context);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, authorizeDigitalWalletPaymentResponse.is_successful);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AuthorizeDigitalWalletPaymentResponse authorizeDigitalWalletPaymentResponse = (AuthorizeDigitalWalletPaymentResponse) obj;
        authorizeDigitalWalletPaymentResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(2, authorizeDigitalWalletPaymentResponse.response_context) + ProtoAdapter.BOOL.encodedSizeWithTag(1, authorizeDigitalWalletPaymentResponse.is_successful) + authorizeDigitalWalletPaymentResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AuthorizeDigitalWalletPaymentResponse authorizeDigitalWalletPaymentResponse = (AuthorizeDigitalWalletPaymentResponse) obj;
        authorizeDigitalWalletPaymentResponse.getClass();
        ResponseContext responseContext = authorizeDigitalWalletPaymentResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = authorizeDigitalWalletPaymentResponse.is_successful;
        byteString.getClass();
        return new AuthorizeDigitalWalletPaymentResponse(responseContext2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AuthorizeDigitalWalletPaymentResponse authorizeDigitalWalletPaymentResponse = (AuthorizeDigitalWalletPaymentResponse) obj;
        authorizeDigitalWalletPaymentResponse.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, authorizeDigitalWalletPaymentResponse.is_successful);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 2, authorizeDigitalWalletPaymentResponse.response_context);
        protoWriter.writeBytes(authorizeDigitalWalletPaymentResponse.unknownFields());
    }
}
