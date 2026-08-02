package com.squareup.cash.moneybot.genie.protos;

import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.Expression;

/* loaded from: classes6.dex */
public final class ComposePlatform$Modifier$WrapContentSize$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ComposePlatform.Modifier.WrapContentSize((Expression) obj, (Expression) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = Expression.ADAPTER.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ComposePlatform.Modifier.WrapContentSize wrapContentSize = (ComposePlatform.Modifier.WrapContentSize) obj;
        reverseProtoWriter.getClass();
        wrapContentSize.getClass();
        reverseProtoWriter.writeBytes(wrapContentSize.unknownFields());
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, wrapContentSize.vertical);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, wrapContentSize.horizontal);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ComposePlatform.Modifier.WrapContentSize wrapContentSize = (ComposePlatform.Modifier.WrapContentSize) obj;
        wrapContentSize.getClass();
        int size$okio = wrapContentSize.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, wrapContentSize.vertical) + protoAdapter.encodedSizeWithTag(1, wrapContentSize.horizontal) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ComposePlatform.Modifier.WrapContentSize wrapContentSize = (ComposePlatform.Modifier.WrapContentSize) obj;
        wrapContentSize.getClass();
        Expression expression = wrapContentSize.horizontal;
        Expression expression2 = expression != null ? (Expression) Expression.ADAPTER.redact(expression) : null;
        Expression expression3 = wrapContentSize.vertical;
        Expression expression4 = expression3 != null ? (Expression) Expression.ADAPTER.redact(expression3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ComposePlatform.Modifier.WrapContentSize(expression2, expression4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ComposePlatform.Modifier.WrapContentSize wrapContentSize = (ComposePlatform.Modifier.WrapContentSize) obj;
        wrapContentSize.getClass();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, wrapContentSize.horizontal);
        protoAdapter.encodeWithTag(protoWriter, 2, wrapContentSize.vertical);
        protoWriter.writeBytes(wrapContentSize.unknownFields());
    }
}
