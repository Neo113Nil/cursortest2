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
public final class ComposePlatform$Text$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = Expression.ADAPTER.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        Expression expression = (Expression) obj;
        if (expression != null) {
            return new ComposePlatform.Text(expression, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "text");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ComposePlatform.Text text = (ComposePlatform.Text) obj;
        reverseProtoWriter.getClass();
        text.getClass();
        reverseProtoWriter.writeBytes(text.unknownFields());
        Expression.ADAPTER.encodeWithTag(reverseProtoWriter, 1, text.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ComposePlatform.Text text = (ComposePlatform.Text) obj;
        text.getClass();
        return Expression.ADAPTER.encodedSizeWithTag(1, text.text) + text.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ComposePlatform.Text text = (ComposePlatform.Text) obj;
        text.getClass();
        Expression expression = (Expression) Expression.ADAPTER.redact(text.text);
        ByteString byteString = ByteString.EMPTY;
        expression.getClass();
        byteString.getClass();
        return new ComposePlatform.Text(expression, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ComposePlatform.Text text = (ComposePlatform.Text) obj;
        text.getClass();
        Expression.ADAPTER.encodeWithTag(protoWriter, 1, text.text);
        protoWriter.writeBytes(text.unknownFields());
    }
}
