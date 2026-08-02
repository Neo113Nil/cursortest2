package com.squareup.cash.moneybot.genie.protos;

import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.Expression;

/* loaded from: classes6.dex */
public final class ComposePlatform$Modifier$Padding$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ComposePlatform.Modifier.Padding((Expression) obj, (Expression) obj2, (Expression) obj3, (Expression) obj4, (Expression) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = Expression.ADAPTER.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ComposePlatform.Modifier.Padding padding = (ComposePlatform.Modifier.Padding) obj;
        reverseProtoWriter.getClass();
        padding.getClass();
        reverseProtoWriter.writeBytes(padding.unknownFields());
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, padding.all);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, padding.end);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, padding.bottom);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, padding.start);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, padding.top);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ComposePlatform.Modifier.Padding padding = (ComposePlatform.Modifier.Padding) obj;
        padding.getClass();
        int size$okio = padding.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        return protoAdapter.encodedSizeWithTag(5, padding.all) + protoAdapter.encodedSizeWithTag(4, padding.end) + protoAdapter.encodedSizeWithTag(3, padding.bottom) + protoAdapter.encodedSizeWithTag(2, padding.start) + protoAdapter.encodedSizeWithTag(1, padding.top) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ComposePlatform.Modifier.Padding padding = (ComposePlatform.Modifier.Padding) obj;
        padding.getClass();
        Expression expression = padding.top;
        Expression expression2 = expression != null ? (Expression) Expression.ADAPTER.redact(expression) : null;
        Expression expression3 = padding.start;
        Expression expression4 = expression3 != null ? (Expression) Expression.ADAPTER.redact(expression3) : null;
        Expression expression5 = padding.bottom;
        Expression expression6 = expression5 != null ? (Expression) Expression.ADAPTER.redact(expression5) : null;
        Expression expression7 = padding.end;
        Expression expression8 = expression7 != null ? (Expression) Expression.ADAPTER.redact(expression7) : null;
        Expression expression9 = padding.all;
        Expression expression10 = expression9 != null ? (Expression) Expression.ADAPTER.redact(expression9) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ComposePlatform.Modifier.Padding(expression2, expression4, expression6, expression8, expression10, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ComposePlatform.Modifier.Padding padding = (ComposePlatform.Modifier.Padding) obj;
        padding.getClass();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, padding.top);
        protoAdapter.encodeWithTag(protoWriter, 2, padding.start);
        protoAdapter.encodeWithTag(protoWriter, 3, padding.bottom);
        protoAdapter.encodeWithTag(protoWriter, 4, padding.end);
        protoAdapter.encodeWithTag(protoWriter, 5, padding.all);
        protoWriter.writeBytes(padding.unknownFields());
    }
}
