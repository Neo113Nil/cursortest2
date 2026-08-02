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
public final class MoneybotScaffold$Answer$Scenario$Parameter$Companion$ADAPTER$1 extends ProtoAdapter {
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
            return new MoneybotScaffold.Answer.Scenario.Parameter(expression, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, AnnotatedPrivateKey.LABEL);
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MoneybotScaffold.Answer.Scenario.Parameter parameter = (MoneybotScaffold.Answer.Scenario.Parameter) obj;
        reverseProtoWriter.getClass();
        parameter.getClass();
        reverseProtoWriter.writeBytes(parameter.unknownFields());
        Expression.ADAPTER.encodeWithTag(reverseProtoWriter, 1, parameter.label);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MoneybotScaffold.Answer.Scenario.Parameter parameter = (MoneybotScaffold.Answer.Scenario.Parameter) obj;
        parameter.getClass();
        return Expression.ADAPTER.encodedSizeWithTag(1, parameter.label) + parameter.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MoneybotScaffold.Answer.Scenario.Parameter parameter = (MoneybotScaffold.Answer.Scenario.Parameter) obj;
        parameter.getClass();
        Expression expression = (Expression) Expression.ADAPTER.redact(parameter.label);
        ByteString byteString = ByteString.EMPTY;
        expression.getClass();
        byteString.getClass();
        return new MoneybotScaffold.Answer.Scenario.Parameter(expression, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MoneybotScaffold.Answer.Scenario.Parameter parameter = (MoneybotScaffold.Answer.Scenario.Parameter) obj;
        parameter.getClass();
        Expression.ADAPTER.encodeWithTag(protoWriter, 1, parameter.label);
        protoWriter.writeBytes(parameter.unknownFields());
    }
}
