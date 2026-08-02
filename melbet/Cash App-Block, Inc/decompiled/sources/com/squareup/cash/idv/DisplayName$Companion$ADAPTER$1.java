package com.squareup.cash.idv;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class DisplayName$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DisplayName((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        DisplayName displayName = (DisplayName) obj;
        reverseProtoWriter.getClass();
        displayName.getClass();
        reverseProtoWriter.writeBytes(displayName.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, displayName.display_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DisplayName displayName = (DisplayName) obj;
        displayName.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, displayName.display_name) + displayName.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((DisplayName) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new DisplayName(null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DisplayName displayName = (DisplayName) obj;
        displayName.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, displayName.display_name);
        protoWriter.writeBytes(displayName.unknownFields());
    }
}
