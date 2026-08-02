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
public final class ComposePlatform$Modifier$Clip$Companion$ADAPTER$1 extends ProtoAdapter {
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
            return new ComposePlatform.Modifier.Clip(expression, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "corner_radius");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ComposePlatform.Modifier.Clip clip = (ComposePlatform.Modifier.Clip) obj;
        reverseProtoWriter.getClass();
        clip.getClass();
        reverseProtoWriter.writeBytes(clip.unknownFields());
        Expression.ADAPTER.encodeWithTag(reverseProtoWriter, 1, clip.corner_radius);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ComposePlatform.Modifier.Clip clip = (ComposePlatform.Modifier.Clip) obj;
        clip.getClass();
        return Expression.ADAPTER.encodedSizeWithTag(1, clip.corner_radius) + clip.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ComposePlatform.Modifier.Clip clip = (ComposePlatform.Modifier.Clip) obj;
        clip.getClass();
        Expression expression = (Expression) Expression.ADAPTER.redact(clip.corner_radius);
        ByteString byteString = ByteString.EMPTY;
        expression.getClass();
        byteString.getClass();
        return new ComposePlatform.Modifier.Clip(expression, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ComposePlatform.Modifier.Clip clip = (ComposePlatform.Modifier.Clip) obj;
        clip.getClass();
        Expression.ADAPTER.encodeWithTag(protoWriter, 1, clip.corner_radius);
        protoWriter.writeBytes(clip.unknownFields());
    }
}
