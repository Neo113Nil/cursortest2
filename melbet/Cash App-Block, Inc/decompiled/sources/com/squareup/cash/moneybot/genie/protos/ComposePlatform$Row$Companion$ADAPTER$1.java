package com.squareup.cash.moneybot.genie.protos;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;
import xyz.block.protos.genie.Expression;

/* loaded from: classes6.dex */
public final class ComposePlatform$Row$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ComposePlatform.Row(m, (Expression) obj, (Expression) obj2, (Expression) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Node.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag == 3) {
                obj2 = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = Expression.ADAPTER.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ComposePlatform.Row row = (ComposePlatform.Row) obj;
        reverseProtoWriter.getClass();
        row.getClass();
        reverseProtoWriter.writeBytes(row.unknownFields());
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, row.vertical_alignment);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, row.spacing);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, row.horizontal_arrangement);
        Node.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, row.children);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ComposePlatform.Row row = (ComposePlatform.Row) obj;
        row.getClass();
        int encodedSizeWithTag = Node.ADAPTER.asRepeated().encodedSizeWithTag(1, row.children) + row.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        return protoAdapter.encodedSizeWithTag(4, row.vertical_alignment) + protoAdapter.encodedSizeWithTag(3, row.spacing) + protoAdapter.encodedSizeWithTag(2, row.horizontal_arrangement) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ComposePlatform.Row row = (ComposePlatform.Row) obj;
        row.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(row.children, Node.ADAPTER);
        Expression expression = row.horizontal_arrangement;
        Expression expression2 = expression != null ? (Expression) Expression.ADAPTER.redact(expression) : null;
        Expression expression3 = row.spacing;
        Expression expression4 = expression3 != null ? (Expression) Expression.ADAPTER.redact(expression3) : null;
        Expression expression5 = row.vertical_alignment;
        Expression expression6 = expression5 != null ? (Expression) Expression.ADAPTER.redact(expression5) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ComposePlatform.Row(m1169redactElements, expression2, expression4, expression6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ComposePlatform.Row row = (ComposePlatform.Row) obj;
        row.getClass();
        Node.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, row.children);
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, row.horizontal_arrangement);
        protoAdapter.encodeWithTag(protoWriter, 3, row.spacing);
        protoAdapter.encodeWithTag(protoWriter, 4, row.vertical_alignment);
        protoWriter.writeBytes(row.unknownFields());
    }
}
