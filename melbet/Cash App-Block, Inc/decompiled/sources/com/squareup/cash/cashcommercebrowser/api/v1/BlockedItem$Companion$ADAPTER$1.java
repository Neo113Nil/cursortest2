package com.squareup.cash.cashcommercebrowser.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class BlockedItem$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BlockedItem((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        BlockedItem blockedItem = (BlockedItem) obj;
        reverseProtoWriter.getClass();
        blockedItem.getClass();
        reverseProtoWriter.writeBytes(blockedItem.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, blockedItem.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BlockedItem blockedItem = (BlockedItem) obj;
        blockedItem.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, blockedItem.name) + blockedItem.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BlockedItem blockedItem = (BlockedItem) obj;
        blockedItem.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = blockedItem.name;
        byteString.getClass();
        return new BlockedItem(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BlockedItem blockedItem = (BlockedItem) obj;
        blockedItem.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, blockedItem.name);
        protoWriter.writeBytes(blockedItem.unknownFields());
    }
}
