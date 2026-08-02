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
public final class ComposePlatform$Box$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ComposePlatform.Box(m, protoReader.endMessageAndGetUnknownFields(beginMessage), (Expression) obj);
            }
            if (nextTag == 1) {
                m.add(Node.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = Expression.ADAPTER.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ComposePlatform.Box box = (ComposePlatform.Box) obj;
        reverseProtoWriter.getClass();
        box.getClass();
        reverseProtoWriter.writeBytes(box.unknownFields());
        Expression.ADAPTER.encodeWithTag(reverseProtoWriter, 2, box.content_alignment);
        Node.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, box.children);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ComposePlatform.Box box = (ComposePlatform.Box) obj;
        box.getClass();
        return Expression.ADAPTER.encodedSizeWithTag(2, box.content_alignment) + Node.ADAPTER.asRepeated().encodedSizeWithTag(1, box.children) + box.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ComposePlatform.Box box = (ComposePlatform.Box) obj;
        box.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(box.children, Node.ADAPTER);
        Expression expression = box.content_alignment;
        Expression expression2 = expression != null ? (Expression) Expression.ADAPTER.redact(expression) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ComposePlatform.Box(m1169redactElements, byteString, expression2);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ComposePlatform.Box box = (ComposePlatform.Box) obj;
        box.getClass();
        Node.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, box.children);
        Expression.ADAPTER.encodeWithTag(protoWriter, 2, box.content_alignment);
        protoWriter.writeBytes(box.unknownFields());
    }
}
