package com.squareup.cash.moneybot.genie.protos;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.MoneybotScaffold;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;
import xyz.block.protos.genie.Expression;

/* loaded from: classes6.dex */
public final class MoneybotScaffold$Answer$Scenario$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
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
                m.add(MoneybotScaffold.Answer.Scenario.Parameter.ADAPTER.decode(protoReader));
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        Expression expression = (Expression) obj;
        if (expression != null) {
            return new MoneybotScaffold.Answer.Scenario(m, endMessageAndGetUnknownFields, expression);
        }
        TransactorKt.missingRequiredFields(obj, "heading");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MoneybotScaffold.Answer.Scenario scenario = (MoneybotScaffold.Answer.Scenario) obj;
        reverseProtoWriter.getClass();
        scenario.getClass();
        reverseProtoWriter.writeBytes(scenario.unknownFields());
        MoneybotScaffold.Answer.Scenario.Parameter.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, scenario.parameters);
        Expression.ADAPTER.encodeWithTag(reverseProtoWriter, 1, scenario.heading);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MoneybotScaffold.Answer.Scenario scenario = (MoneybotScaffold.Answer.Scenario) obj;
        scenario.getClass();
        return MoneybotScaffold.Answer.Scenario.Parameter.ADAPTER.asRepeated().encodedSizeWithTag(2, scenario.parameters) + Expression.ADAPTER.encodedSizeWithTag(1, scenario.heading) + scenario.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MoneybotScaffold.Answer.Scenario scenario = (MoneybotScaffold.Answer.Scenario) obj;
        scenario.getClass();
        Expression expression = (Expression) Expression.ADAPTER.redact(scenario.heading);
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(scenario.parameters, MoneybotScaffold.Answer.Scenario.Parameter.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        expression.getClass();
        byteString.getClass();
        return new MoneybotScaffold.Answer.Scenario(m1169redactElements, byteString, expression);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MoneybotScaffold.Answer.Scenario scenario = (MoneybotScaffold.Answer.Scenario) obj;
        scenario.getClass();
        Expression.ADAPTER.encodeWithTag(protoWriter, 1, scenario.heading);
        MoneybotScaffold.Answer.Scenario.Parameter.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, scenario.parameters);
        protoWriter.writeBytes(scenario.unknownFields());
    }
}
