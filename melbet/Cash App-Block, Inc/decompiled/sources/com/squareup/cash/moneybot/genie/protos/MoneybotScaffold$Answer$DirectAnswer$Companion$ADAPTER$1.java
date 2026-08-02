package com.squareup.cash.moneybot.genie.protos;

import androidx.room.TransactorKt;
import com.squareup.cash.moneybot.genie.protos.MoneybotScaffold;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import xyz.block.protos.genie.Expression;

/* loaded from: classes6.dex */
public final class MoneybotScaffold$Answer$DirectAnswer$Companion$ADAPTER$1 extends ProtoAdapter {
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
        if (expression == null) {
            TransactorKt.missingRequiredFields(obj, AnnotatedPrivateKey.LABEL);
            throw null;
        }
        Expression expression2 = (Expression) obj2;
        if (expression2 != null) {
            return new MoneybotScaffold.Answer.DirectAnswer(expression, expression2, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj2, "value");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MoneybotScaffold.Answer.DirectAnswer directAnswer = (MoneybotScaffold.Answer.DirectAnswer) obj;
        reverseProtoWriter.getClass();
        directAnswer.getClass();
        reverseProtoWriter.writeBytes(directAnswer.unknownFields());
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, directAnswer.value_);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, directAnswer.label);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MoneybotScaffold.Answer.DirectAnswer directAnswer = (MoneybotScaffold.Answer.DirectAnswer) obj;
        directAnswer.getClass();
        int size$okio = directAnswer.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, directAnswer.value_) + protoAdapter.encodedSizeWithTag(1, directAnswer.label) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MoneybotScaffold.Answer.DirectAnswer directAnswer = (MoneybotScaffold.Answer.DirectAnswer) obj;
        directAnswer.getClass();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        Expression expression = (Expression) protoAdapter.redact(directAnswer.label);
        Expression expression2 = (Expression) protoAdapter.redact(directAnswer.value_);
        ByteString byteString = ByteString.EMPTY;
        expression.getClass();
        expression2.getClass();
        byteString.getClass();
        return new MoneybotScaffold.Answer.DirectAnswer(expression, expression2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MoneybotScaffold.Answer.DirectAnswer directAnswer = (MoneybotScaffold.Answer.DirectAnswer) obj;
        directAnswer.getClass();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, directAnswer.label);
        protoAdapter.encodeWithTag(protoWriter, 2, directAnswer.value_);
        protoWriter.writeBytes(directAnswer.unknownFields());
    }
}
