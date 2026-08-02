package com.squareup.cash.moneybot.genie.protos;

import androidx.room.TransactorKt;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class ComposePlatform$Modifier$Overlay$Companion$ADAPTER$1 extends ProtoAdapter {
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
                obj = Node.ADAPTER.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        Node node = (Node) obj;
        if (node != null) {
            return new ComposePlatform.Modifier.Overlay(node, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "content");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ComposePlatform.Modifier.Overlay overlay = (ComposePlatform.Modifier.Overlay) obj;
        reverseProtoWriter.getClass();
        overlay.getClass();
        reverseProtoWriter.writeBytes(overlay.unknownFields());
        Node.ADAPTER.encodeWithTag(reverseProtoWriter, 1, overlay.content);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ComposePlatform.Modifier.Overlay overlay = (ComposePlatform.Modifier.Overlay) obj;
        overlay.getClass();
        return Node.ADAPTER.encodedSizeWithTag(1, overlay.content) + overlay.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ComposePlatform.Modifier.Overlay overlay = (ComposePlatform.Modifier.Overlay) obj;
        overlay.getClass();
        Node node = (Node) Node.ADAPTER.redact(overlay.content);
        ByteString byteString = ByteString.EMPTY;
        node.getClass();
        byteString.getClass();
        return new ComposePlatform.Modifier.Overlay(node, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ComposePlatform.Modifier.Overlay overlay = (ComposePlatform.Modifier.Overlay) obj;
        overlay.getClass();
        Node.ADAPTER.encodeWithTag(protoWriter, 1, overlay.content);
        protoWriter.writeBytes(overlay.unknownFields());
    }
}
