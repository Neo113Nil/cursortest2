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
public final class MoneybotScaffold$Meaning$Opportunity$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = Expression.ADAPTER.decode(protoReader);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        Expression expression = (Expression) obj;
        if (expression == null) {
            TransactorKt.missingRequiredFields(obj, "eyebrow");
            throw null;
        }
        Expression expression2 = (Expression) obj2;
        if (expression2 != null) {
            return new MoneybotScaffold.Meaning.Opportunity(expression, expression2, (Expression) obj3, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj2, "heading");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MoneybotScaffold.Meaning.Opportunity opportunity = (MoneybotScaffold.Meaning.Opportunity) obj;
        reverseProtoWriter.getClass();
        opportunity.getClass();
        reverseProtoWriter.writeBytes(opportunity.unknownFields());
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, opportunity.body);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, opportunity.heading);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, opportunity.eyebrow);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MoneybotScaffold.Meaning.Opportunity opportunity = (MoneybotScaffold.Meaning.Opportunity) obj;
        opportunity.getClass();
        int size$okio = opportunity.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, opportunity.body) + protoAdapter.encodedSizeWithTag(2, opportunity.heading) + protoAdapter.encodedSizeWithTag(1, opportunity.eyebrow) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MoneybotScaffold.Meaning.Opportunity opportunity = (MoneybotScaffold.Meaning.Opportunity) obj;
        opportunity.getClass();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        Expression expression = (Expression) protoAdapter.redact(opportunity.eyebrow);
        Expression expression2 = (Expression) protoAdapter.redact(opportunity.heading);
        Expression expression3 = opportunity.body;
        Expression expression4 = expression3 != null ? (Expression) protoAdapter.redact(expression3) : null;
        ByteString byteString = ByteString.EMPTY;
        expression.getClass();
        expression2.getClass();
        byteString.getClass();
        return new MoneybotScaffold.Meaning.Opportunity(expression, expression2, expression4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MoneybotScaffold.Meaning.Opportunity opportunity = (MoneybotScaffold.Meaning.Opportunity) obj;
        opportunity.getClass();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, opportunity.eyebrow);
        protoAdapter.encodeWithTag(protoWriter, 2, opportunity.heading);
        protoAdapter.encodeWithTag(protoWriter, 3, opportunity.body);
        protoWriter.writeBytes(opportunity.unknownFields());
    }
}
