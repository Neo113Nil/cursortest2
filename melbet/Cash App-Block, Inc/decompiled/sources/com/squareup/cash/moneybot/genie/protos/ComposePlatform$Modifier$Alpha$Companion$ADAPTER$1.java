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
public final class ComposePlatform$Modifier$Alpha$Companion$ADAPTER$1 extends ProtoAdapter {
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
            return new ComposePlatform.Modifier.Alpha(expression, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "alpha");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ComposePlatform.Modifier.Alpha alpha = (ComposePlatform.Modifier.Alpha) obj;
        reverseProtoWriter.getClass();
        alpha.getClass();
        reverseProtoWriter.writeBytes(alpha.unknownFields());
        Expression.ADAPTER.encodeWithTag(reverseProtoWriter, 1, alpha.alpha);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ComposePlatform.Modifier.Alpha alpha = (ComposePlatform.Modifier.Alpha) obj;
        alpha.getClass();
        return Expression.ADAPTER.encodedSizeWithTag(1, alpha.alpha) + alpha.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ComposePlatform.Modifier.Alpha alpha = (ComposePlatform.Modifier.Alpha) obj;
        alpha.getClass();
        Expression expression = (Expression) Expression.ADAPTER.redact(alpha.alpha);
        ByteString byteString = ByteString.EMPTY;
        expression.getClass();
        byteString.getClass();
        return new ComposePlatform.Modifier.Alpha(expression, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ComposePlatform.Modifier.Alpha alpha = (ComposePlatform.Modifier.Alpha) obj;
        alpha.getClass();
        Expression.ADAPTER.encodeWithTag(protoWriter, 1, alpha.alpha);
        protoWriter.writeBytes(alpha.unknownFields());
    }
}
