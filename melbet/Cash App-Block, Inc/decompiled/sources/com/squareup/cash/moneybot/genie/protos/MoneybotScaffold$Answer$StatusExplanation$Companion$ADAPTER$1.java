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
public final class MoneybotScaffold$Answer$StatusExplanation$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = Expression.ADAPTER.decode(protoReader);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        Expression expression = (Expression) obj;
        if (expression != null) {
            return new MoneybotScaffold.Answer.StatusExplanation(expression, (Expression) obj2, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "heading");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MoneybotScaffold.Answer.StatusExplanation statusExplanation = (MoneybotScaffold.Answer.StatusExplanation) obj;
        reverseProtoWriter.getClass();
        statusExplanation.getClass();
        reverseProtoWriter.writeBytes(statusExplanation.unknownFields());
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, statusExplanation.explanation);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, statusExplanation.heading);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MoneybotScaffold.Answer.StatusExplanation statusExplanation = (MoneybotScaffold.Answer.StatusExplanation) obj;
        statusExplanation.getClass();
        int size$okio = statusExplanation.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, statusExplanation.explanation) + protoAdapter.encodedSizeWithTag(1, statusExplanation.heading) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MoneybotScaffold.Answer.StatusExplanation statusExplanation = (MoneybotScaffold.Answer.StatusExplanation) obj;
        statusExplanation.getClass();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        Expression expression = (Expression) protoAdapter.redact(statusExplanation.heading);
        Expression expression2 = statusExplanation.explanation;
        Expression expression3 = expression2 != null ? (Expression) protoAdapter.redact(expression2) : null;
        ByteString byteString = ByteString.EMPTY;
        expression.getClass();
        byteString.getClass();
        return new MoneybotScaffold.Answer.StatusExplanation(expression, expression3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MoneybotScaffold.Answer.StatusExplanation statusExplanation = (MoneybotScaffold.Answer.StatusExplanation) obj;
        statusExplanation.getClass();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, statusExplanation.heading);
        protoAdapter.encodeWithTag(protoWriter, 2, statusExplanation.explanation);
        protoWriter.writeBytes(statusExplanation.unknownFields());
    }
}
