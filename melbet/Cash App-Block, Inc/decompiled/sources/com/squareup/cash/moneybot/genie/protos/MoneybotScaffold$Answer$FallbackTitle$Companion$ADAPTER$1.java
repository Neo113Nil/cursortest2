package com.squareup.cash.moneybot.genie.protos;

import androidx.room.TransactorKt;
import com.squareup.cash.moneybot.genie.protos.MoneybotScaffold;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.Expression;

/* loaded from: classes6.dex */
public final class MoneybotScaffold$Answer$FallbackTitle$Companion$ADAPTER$1 extends ProtoAdapter {
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
            return new MoneybotScaffold.Answer.FallbackTitle(expression, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "title");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MoneybotScaffold.Answer.FallbackTitle fallbackTitle = (MoneybotScaffold.Answer.FallbackTitle) obj;
        reverseProtoWriter.getClass();
        fallbackTitle.getClass();
        reverseProtoWriter.writeBytes(fallbackTitle.unknownFields());
        Expression.ADAPTER.encodeWithTag(reverseProtoWriter, 1, fallbackTitle.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MoneybotScaffold.Answer.FallbackTitle fallbackTitle = (MoneybotScaffold.Answer.FallbackTitle) obj;
        fallbackTitle.getClass();
        return Expression.ADAPTER.encodedSizeWithTag(1, fallbackTitle.title) + fallbackTitle.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MoneybotScaffold.Answer.FallbackTitle fallbackTitle = (MoneybotScaffold.Answer.FallbackTitle) obj;
        fallbackTitle.getClass();
        Expression expression = (Expression) Expression.ADAPTER.redact(fallbackTitle.title);
        ByteString byteString = ByteString.EMPTY;
        expression.getClass();
        byteString.getClass();
        return new MoneybotScaffold.Answer.FallbackTitle(expression, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MoneybotScaffold.Answer.FallbackTitle fallbackTitle = (MoneybotScaffold.Answer.FallbackTitle) obj;
        fallbackTitle.getClass();
        Expression.ADAPTER.encodeWithTag(protoWriter, 1, fallbackTitle.title);
        protoWriter.writeBytes(fallbackTitle.unknownFields());
    }
}
