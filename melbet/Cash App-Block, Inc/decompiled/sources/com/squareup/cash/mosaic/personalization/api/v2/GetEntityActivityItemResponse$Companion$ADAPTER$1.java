package com.squareup.cash.mosaic.personalization.api.v2;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class GetEntityActivityItemResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetEntityActivityItemResponse((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetEntityActivityItemResponse getEntityActivityItemResponse = (GetEntityActivityItemResponse) obj;
        reverseProtoWriter.getClass();
        getEntityActivityItemResponse.getClass();
        reverseProtoWriter.writeBytes(getEntityActivityItemResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, getEntityActivityItemResponse.activity_row_json);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetEntityActivityItemResponse getEntityActivityItemResponse = (GetEntityActivityItemResponse) obj;
        getEntityActivityItemResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, getEntityActivityItemResponse.activity_row_json) + getEntityActivityItemResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetEntityActivityItemResponse getEntityActivityItemResponse = (GetEntityActivityItemResponse) obj;
        getEntityActivityItemResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = getEntityActivityItemResponse.activity_row_json;
        byteString.getClass();
        return new GetEntityActivityItemResponse(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetEntityActivityItemResponse getEntityActivityItemResponse = (GetEntityActivityItemResponse) obj;
        getEntityActivityItemResponse.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getEntityActivityItemResponse.activity_row_json);
        protoWriter.writeBytes(getEntityActivityItemResponse.unknownFields());
    }
}
