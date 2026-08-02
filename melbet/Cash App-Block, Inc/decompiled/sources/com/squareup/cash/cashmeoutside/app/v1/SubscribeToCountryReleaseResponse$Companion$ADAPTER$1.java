package com.squareup.cash.cashmeoutside.app.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class SubscribeToCountryReleaseResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SubscribeToCountryReleaseResponse((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        SubscribeToCountryReleaseResponse subscribeToCountryReleaseResponse = (SubscribeToCountryReleaseResponse) obj;
        reverseProtoWriter.getClass();
        subscribeToCountryReleaseResponse.getClass();
        reverseProtoWriter.writeBytes(subscribeToCountryReleaseResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, subscribeToCountryReleaseResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubscribeToCountryReleaseResponse subscribeToCountryReleaseResponse = (SubscribeToCountryReleaseResponse) obj;
        subscribeToCountryReleaseResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, subscribeToCountryReleaseResponse.response_context) + subscribeToCountryReleaseResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SubscribeToCountryReleaseResponse subscribeToCountryReleaseResponse = (SubscribeToCountryReleaseResponse) obj;
        subscribeToCountryReleaseResponse.getClass();
        ResponseContext responseContext = subscribeToCountryReleaseResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SubscribeToCountryReleaseResponse(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubscribeToCountryReleaseResponse subscribeToCountryReleaseResponse = (SubscribeToCountryReleaseResponse) obj;
        subscribeToCountryReleaseResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, subscribeToCountryReleaseResponse.response_context);
        protoWriter.writeBytes(subscribeToCountryReleaseResponse.unknownFields());
    }
}
