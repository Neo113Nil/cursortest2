package com.squareup.cash.moneybot.genie.protos;

import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.Action;
import xyz.block.protos.genie.Expression;

/* loaded from: classes6.dex */
public final class ComposePlatform$Button$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ComposePlatform.Button((Expression) obj, (Node) obj2, (Action) obj3, (Expression) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = Node.ADAPTER.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = Action.ADAPTER.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = Expression.ADAPTER.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ComposePlatform.Button button = (ComposePlatform.Button) obj;
        reverseProtoWriter.getClass();
        button.getClass();
        reverseProtoWriter.writeBytes(button.unknownFields());
        Node.ADAPTER.encodeWithTag(reverseProtoWriter, 2, button.label);
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, button.title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, button.style);
        Action.ADAPTER.encodeWithTag(reverseProtoWriter, 3, button.action);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ComposePlatform.Button button = (ComposePlatform.Button) obj;
        button.getClass();
        int size$okio = button.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        return protoAdapter.encodedSizeWithTag(4, button.style) + Action.ADAPTER.encodedSizeWithTag(3, button.action) + Node.ADAPTER.encodedSizeWithTag(2, button.label) + protoAdapter.encodedSizeWithTag(1, button.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ComposePlatform.Button button = (ComposePlatform.Button) obj;
        button.getClass();
        Expression expression = button.title;
        Expression expression2 = expression != null ? (Expression) Expression.ADAPTER.redact(expression) : null;
        Node node = button.label;
        Node node2 = node != null ? (Node) Node.ADAPTER.redact(node) : null;
        Action action = button.action;
        Action action2 = action != null ? (Action) Action.ADAPTER.redact(action) : null;
        Expression expression3 = button.style;
        Expression expression4 = expression3 != null ? (Expression) Expression.ADAPTER.redact(expression3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ComposePlatform.Button(expression2, node2, action2, expression4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ComposePlatform.Button button = (ComposePlatform.Button) obj;
        button.getClass();
        Action.ADAPTER.encodeWithTag(protoWriter, 3, button.action);
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 4, button.style);
        protoAdapter.encodeWithTag(protoWriter, 1, button.title);
        Node.ADAPTER.encodeWithTag(protoWriter, 2, button.label);
        protoWriter.writeBytes(button.unknownFields());
    }
}
