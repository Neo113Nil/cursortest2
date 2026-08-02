package com.squareup.cash.moneybot.genie.protos;

import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.Expression;

/* loaded from: classes6.dex */
public final class ComposePlatform$Color$ColorValue$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ComposePlatform.Color.ColorValue((Expression) obj, (Expression) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        ComposePlatform.Color.ColorValue colorValue = (ComposePlatform.Color.ColorValue) obj;
        reverseProtoWriter.getClass();
        colorValue.getClass();
        reverseProtoWriter.writeBytes(colorValue.unknownFields());
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, colorValue.named);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, colorValue.hex);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ComposePlatform.Color.ColorValue colorValue = (ComposePlatform.Color.ColorValue) obj;
        colorValue.getClass();
        int size$okio = colorValue.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, colorValue.named) + protoAdapter.encodedSizeWithTag(1, colorValue.hex) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ComposePlatform.Color.ColorValue colorValue = (ComposePlatform.Color.ColorValue) obj;
        colorValue.getClass();
        Expression expression = colorValue.hex;
        Expression expression2 = expression != null ? (Expression) Expression.ADAPTER.redact(expression) : null;
        Expression expression3 = colorValue.named;
        Expression expression4 = expression3 != null ? (Expression) Expression.ADAPTER.redact(expression3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ComposePlatform.Color.ColorValue(expression2, expression4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ComposePlatform.Color.ColorValue colorValue = (ComposePlatform.Color.ColorValue) obj;
        colorValue.getClass();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, colorValue.hex);
        protoAdapter.encodeWithTag(protoWriter, 2, colorValue.named);
        protoWriter.writeBytes(colorValue.unknownFields());
    }
}
