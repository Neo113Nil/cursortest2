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
public final class MoneybotScaffold$Evidence$MerchantCard$Summary$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = MoneybotScaffold.Evidence.MerchantCard.Summary.Flow.ADAPTER.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = MoneybotScaffold.Evidence.MerchantCard.Summary.Flow.ADAPTER.decode(protoReader);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        Expression expression = (Expression) obj;
        if (expression == null) {
            TransactorKt.missingRequiredFields(obj, "total_label");
            throw null;
        }
        Expression expression2 = (Expression) obj2;
        if (expression2 == null) {
            TransactorKt.missingRequiredFields(obj2, "total");
            throw null;
        }
        MoneybotScaffold.Evidence.MerchantCard.Summary.Flow flow = (MoneybotScaffold.Evidence.MerchantCard.Summary.Flow) obj3;
        if (flow == null) {
            TransactorKt.missingRequiredFields(obj3, "received");
            throw null;
        }
        MoneybotScaffold.Evidence.MerchantCard.Summary.Flow flow2 = (MoneybotScaffold.Evidence.MerchantCard.Summary.Flow) obj4;
        if (flow2 != null) {
            return new MoneybotScaffold.Evidence.MerchantCard.Summary(expression, expression2, flow, flow2, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj4, "sent");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MoneybotScaffold.Evidence.MerchantCard.Summary summary = (MoneybotScaffold.Evidence.MerchantCard.Summary) obj;
        reverseProtoWriter.getClass();
        summary.getClass();
        reverseProtoWriter.writeBytes(summary.unknownFields());
        ProtoAdapter protoAdapter = MoneybotScaffold.Evidence.MerchantCard.Summary.Flow.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, summary.sent);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, summary.received);
        ProtoAdapter protoAdapter2 = Expression.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, summary.total);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, summary.total_label);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MoneybotScaffold.Evidence.MerchantCard.Summary summary = (MoneybotScaffold.Evidence.MerchantCard.Summary) obj;
        summary.getClass();
        int size$okio = summary.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, summary.total) + protoAdapter.encodedSizeWithTag(1, summary.total_label) + size$okio;
        ProtoAdapter protoAdapter2 = MoneybotScaffold.Evidence.MerchantCard.Summary.Flow.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(4, summary.sent) + protoAdapter2.encodedSizeWithTag(3, summary.received) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MoneybotScaffold.Evidence.MerchantCard.Summary summary = (MoneybotScaffold.Evidence.MerchantCard.Summary) obj;
        summary.getClass();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        Expression expression = (Expression) protoAdapter.redact(summary.total_label);
        Expression expression2 = (Expression) protoAdapter.redact(summary.total);
        ProtoAdapter protoAdapter2 = MoneybotScaffold.Evidence.MerchantCard.Summary.Flow.ADAPTER;
        MoneybotScaffold.Evidence.MerchantCard.Summary.Flow flow = (MoneybotScaffold.Evidence.MerchantCard.Summary.Flow) protoAdapter2.redact(summary.received);
        MoneybotScaffold.Evidence.MerchantCard.Summary.Flow flow2 = (MoneybotScaffold.Evidence.MerchantCard.Summary.Flow) protoAdapter2.redact(summary.sent);
        ByteString byteString = ByteString.EMPTY;
        expression.getClass();
        expression2.getClass();
        flow.getClass();
        flow2.getClass();
        byteString.getClass();
        return new MoneybotScaffold.Evidence.MerchantCard.Summary(expression, expression2, flow, flow2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MoneybotScaffold.Evidence.MerchantCard.Summary summary = (MoneybotScaffold.Evidence.MerchantCard.Summary) obj;
        summary.getClass();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, summary.total_label);
        protoAdapter.encodeWithTag(protoWriter, 2, summary.total);
        ProtoAdapter protoAdapter2 = MoneybotScaffold.Evidence.MerchantCard.Summary.Flow.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, summary.received);
        protoAdapter2.encodeWithTag(protoWriter, 4, summary.sent);
        protoWriter.writeBytes(summary.unknownFields());
    }
}
