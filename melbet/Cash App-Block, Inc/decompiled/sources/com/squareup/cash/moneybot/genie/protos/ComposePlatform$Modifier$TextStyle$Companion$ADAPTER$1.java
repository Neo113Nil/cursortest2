package com.squareup.cash.moneybot.genie.protos;

import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.Expression;

/* loaded from: classes6.dex */
public final class ComposePlatform$Modifier$TextStyle$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ComposePlatform.Modifier.TextStyle((Expression) obj, (Expression) obj2, (Expression) obj3, (Expression) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = Expression.ADAPTER.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ComposePlatform.Modifier.TextStyle textStyle = (ComposePlatform.Modifier.TextStyle) obj;
        reverseProtoWriter.getClass();
        textStyle.getClass();
        reverseProtoWriter.writeBytes(textStyle.unknownFields());
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, textStyle.text_align);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, textStyle.weight);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, textStyle.size);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, textStyle.typography);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ComposePlatform.Modifier.TextStyle textStyle = (ComposePlatform.Modifier.TextStyle) obj;
        textStyle.getClass();
        int size$okio = textStyle.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        return protoAdapter.encodedSizeWithTag(4, textStyle.text_align) + protoAdapter.encodedSizeWithTag(3, textStyle.weight) + protoAdapter.encodedSizeWithTag(2, textStyle.size) + protoAdapter.encodedSizeWithTag(1, textStyle.typography) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ComposePlatform.Modifier.TextStyle textStyle = (ComposePlatform.Modifier.TextStyle) obj;
        textStyle.getClass();
        Expression expression = textStyle.typography;
        Expression expression2 = expression != null ? (Expression) Expression.ADAPTER.redact(expression) : null;
        Expression expression3 = textStyle.size;
        Expression expression4 = expression3 != null ? (Expression) Expression.ADAPTER.redact(expression3) : null;
        Expression expression5 = textStyle.weight;
        Expression expression6 = expression5 != null ? (Expression) Expression.ADAPTER.redact(expression5) : null;
        Expression expression7 = textStyle.text_align;
        Expression expression8 = expression7 != null ? (Expression) Expression.ADAPTER.redact(expression7) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ComposePlatform.Modifier.TextStyle(expression2, expression4, expression6, expression8, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ComposePlatform.Modifier.TextStyle textStyle = (ComposePlatform.Modifier.TextStyle) obj;
        textStyle.getClass();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, textStyle.typography);
        protoAdapter.encodeWithTag(protoWriter, 2, textStyle.size);
        protoAdapter.encodeWithTag(protoWriter, 3, textStyle.weight);
        protoAdapter.encodeWithTag(protoWriter, 4, textStyle.text_align);
        protoWriter.writeBytes(textStyle.unknownFields());
    }
}
