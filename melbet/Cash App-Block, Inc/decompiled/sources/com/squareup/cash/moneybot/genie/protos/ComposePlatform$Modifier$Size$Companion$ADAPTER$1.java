package com.squareup.cash.moneybot.genie.protos;

import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.Expression;

/* loaded from: classes6.dex */
public final class ComposePlatform$Modifier$Size$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ComposePlatform.Modifier.Size((Expression) obj, (Expression) obj2, (Expression) obj3, (Expression) obj4, (Expression) obj5, (Expression) obj6, (Expression) obj7, (Expression) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = Expression.ADAPTER.decode(protoReader);
                    break;
                case 2:
                    obj2 = Expression.ADAPTER.decode(protoReader);
                    break;
                case 3:
                    obj3 = Expression.ADAPTER.decode(protoReader);
                    break;
                case 4:
                    obj4 = Expression.ADAPTER.decode(protoReader);
                    break;
                case 5:
                    obj5 = Expression.ADAPTER.decode(protoReader);
                    break;
                case 6:
                    obj6 = Expression.ADAPTER.decode(protoReader);
                    break;
                case 7:
                    obj7 = Expression.ADAPTER.decode(protoReader);
                    break;
                case 8:
                    obj8 = Expression.ADAPTER.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ComposePlatform.Modifier.Size size = (ComposePlatform.Modifier.Size) obj;
        reverseProtoWriter.getClass();
        size.getClass();
        reverseProtoWriter.writeBytes(size.unknownFields());
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, size.fill_max_height);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, size.fill_max_width);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, size.max_height);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, size.min_height);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, size.max_width);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, size.min_width);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, size.height);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, size.width);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ComposePlatform.Modifier.Size size = (ComposePlatform.Modifier.Size) obj;
        size.getClass();
        int size$okio = size.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        return protoAdapter.encodedSizeWithTag(8, size.fill_max_height) + protoAdapter.encodedSizeWithTag(7, size.fill_max_width) + protoAdapter.encodedSizeWithTag(6, size.max_height) + protoAdapter.encodedSizeWithTag(5, size.min_height) + protoAdapter.encodedSizeWithTag(4, size.max_width) + protoAdapter.encodedSizeWithTag(3, size.min_width) + protoAdapter.encodedSizeWithTag(2, size.height) + protoAdapter.encodedSizeWithTag(1, size.width) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ComposePlatform.Modifier.Size size = (ComposePlatform.Modifier.Size) obj;
        size.getClass();
        Expression expression = size.width;
        Expression expression2 = expression != null ? (Expression) Expression.ADAPTER.redact(expression) : null;
        Expression expression3 = size.height;
        Expression expression4 = expression3 != null ? (Expression) Expression.ADAPTER.redact(expression3) : null;
        Expression expression5 = size.min_width;
        Expression expression6 = expression5 != null ? (Expression) Expression.ADAPTER.redact(expression5) : null;
        Expression expression7 = size.max_width;
        Expression expression8 = expression7 != null ? (Expression) Expression.ADAPTER.redact(expression7) : null;
        Expression expression9 = size.min_height;
        Expression expression10 = expression9 != null ? (Expression) Expression.ADAPTER.redact(expression9) : null;
        Expression expression11 = size.max_height;
        Expression expression12 = expression11 != null ? (Expression) Expression.ADAPTER.redact(expression11) : null;
        Expression expression13 = size.fill_max_width;
        Expression expression14 = expression13 != null ? (Expression) Expression.ADAPTER.redact(expression13) : null;
        Expression expression15 = size.fill_max_height;
        Expression expression16 = expression15 != null ? (Expression) Expression.ADAPTER.redact(expression15) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ComposePlatform.Modifier.Size(expression2, expression4, expression6, expression8, expression10, expression12, expression14, expression16, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ComposePlatform.Modifier.Size size = (ComposePlatform.Modifier.Size) obj;
        size.getClass();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, size.width);
        protoAdapter.encodeWithTag(protoWriter, 2, size.height);
        protoAdapter.encodeWithTag(protoWriter, 3, size.min_width);
        protoAdapter.encodeWithTag(protoWriter, 4, size.max_width);
        protoAdapter.encodeWithTag(protoWriter, 5, size.min_height);
        protoAdapter.encodeWithTag(protoWriter, 6, size.max_height);
        protoAdapter.encodeWithTag(protoWriter, 7, size.fill_max_width);
        protoAdapter.encodeWithTag(protoWriter, 8, size.fill_max_height);
        protoWriter.writeBytes(size.unknownFields());
    }
}
