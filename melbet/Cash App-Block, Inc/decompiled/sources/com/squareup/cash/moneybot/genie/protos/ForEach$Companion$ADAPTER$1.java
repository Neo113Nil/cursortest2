package com.squareup.cash.moneybot.genie.protos;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.Expression;
import xyz.block.protos.genie.KeyPath;

/* loaded from: classes6.dex */
public final class ForEach$Companion$ADAPTER$1 extends ProtoAdapter {
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
                break;
            }
            if (nextTag == 1) {
                obj = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = Node.ADAPTER.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = KeyPath.ADAPTER.decode(protoReader);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        Expression expression = (Expression) obj;
        if (expression == null) {
            TransactorKt.missingRequiredFields(obj, "collection");
            throw null;
        }
        Node node = (Node) obj2;
        if (node == null) {
            TransactorKt.missingRequiredFields(obj2, "template");
            throw null;
        }
        String str = (String) obj3;
        if (str != null) {
            return new ForEach(expression, node, str, (KeyPath) obj4, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj3, "item_variable");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ForEach forEach = (ForEach) obj;
        reverseProtoWriter.getClass();
        forEach.getClass();
        reverseProtoWriter.writeBytes(forEach.unknownFields());
        KeyPath.ADAPTER.encodeWithTag(reverseProtoWriter, 4, forEach.source);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, forEach.item_variable);
        Node.ADAPTER.encodeWithTag(reverseProtoWriter, 2, forEach.template);
        Expression.ADAPTER.encodeWithTag(reverseProtoWriter, 1, forEach.collection);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ForEach forEach = (ForEach) obj;
        forEach.getClass();
        return KeyPath.ADAPTER.encodedSizeWithTag(4, forEach.source) + ProtoAdapter.STRING.encodedSizeWithTag(3, forEach.item_variable) + Node.ADAPTER.encodedSizeWithTag(2, forEach.template) + Expression.ADAPTER.encodedSizeWithTag(1, forEach.collection) + forEach.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ForEach forEach = (ForEach) obj;
        forEach.getClass();
        Expression expression = (Expression) Expression.ADAPTER.redact(forEach.collection);
        Node node = (Node) Node.ADAPTER.redact(forEach.template);
        KeyPath keyPath = forEach.source;
        KeyPath keyPath2 = keyPath != null ? (KeyPath) KeyPath.ADAPTER.redact(keyPath) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = forEach.item_variable;
        expression.getClass();
        node.getClass();
        str.getClass();
        byteString.getClass();
        return new ForEach(expression, node, str, keyPath2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ForEach forEach = (ForEach) obj;
        forEach.getClass();
        Expression.ADAPTER.encodeWithTag(protoWriter, 1, forEach.collection);
        Node.ADAPTER.encodeWithTag(protoWriter, 2, forEach.template);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, forEach.item_variable);
        KeyPath.ADAPTER.encodeWithTag(protoWriter, 4, forEach.source);
        protoWriter.writeBytes(forEach.unknownFields());
    }
}
