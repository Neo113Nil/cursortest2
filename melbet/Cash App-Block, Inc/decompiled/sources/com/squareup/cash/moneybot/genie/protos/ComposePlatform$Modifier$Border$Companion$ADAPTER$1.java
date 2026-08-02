package com.squareup.cash.moneybot.genie.protos;

import androidx.room.TransactorKt;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.Expression;

/* loaded from: classes6.dex */
public final class ComposePlatform$Modifier$Border$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = ComposePlatform.Color.ADAPTER.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = Expression.ADAPTER.decode(protoReader);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        ComposePlatform.Color color = (ComposePlatform.Color) obj;
        if (color != null) {
            return new ComposePlatform.Modifier.Border(color, (Expression) obj2, (Expression) obj3, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "color");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ComposePlatform.Modifier.Border border = (ComposePlatform.Modifier.Border) obj;
        reverseProtoWriter.getClass();
        border.getClass();
        reverseProtoWriter.writeBytes(border.unknownFields());
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, border.corner_radius);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, border.width);
        ComposePlatform.Color.ADAPTER.encodeWithTag(reverseProtoWriter, 1, border.color);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ComposePlatform.Modifier.Border border = (ComposePlatform.Modifier.Border) obj;
        border.getClass();
        int encodedSizeWithTag = ComposePlatform.Color.ADAPTER.encodedSizeWithTag(1, border.color) + border.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, border.corner_radius) + protoAdapter.encodedSizeWithTag(2, border.width) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ComposePlatform.Modifier.Border border = (ComposePlatform.Modifier.Border) obj;
        border.getClass();
        ComposePlatform.Color color = (ComposePlatform.Color) ComposePlatform.Color.ADAPTER.redact(border.color);
        Expression expression = border.width;
        Expression expression2 = expression != null ? (Expression) Expression.ADAPTER.redact(expression) : null;
        Expression expression3 = border.corner_radius;
        Expression expression4 = expression3 != null ? (Expression) Expression.ADAPTER.redact(expression3) : null;
        ByteString byteString = ByteString.EMPTY;
        color.getClass();
        byteString.getClass();
        return new ComposePlatform.Modifier.Border(color, expression2, expression4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ComposePlatform.Modifier.Border border = (ComposePlatform.Modifier.Border) obj;
        border.getClass();
        ComposePlatform.Color.ADAPTER.encodeWithTag(protoWriter, 1, border.color);
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, border.width);
        protoAdapter.encodeWithTag(protoWriter, 3, border.corner_radius);
        protoWriter.writeBytes(border.unknownFields());
    }
}
