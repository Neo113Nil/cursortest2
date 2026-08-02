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
public final class MoneybotScaffold$Evidence$Breakdown$BarChart$Bar$Companion$ADAPTER$1 extends ProtoAdapter {
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
        if (expression != null) {
            return new MoneybotScaffold.Evidence.Breakdown.BarChart.Bar(expression, (Expression) obj2, (Expression) obj3, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "value");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MoneybotScaffold.Evidence.Breakdown.BarChart.Bar bar = (MoneybotScaffold.Evidence.Breakdown.BarChart.Bar) obj;
        reverseProtoWriter.getClass();
        bar.getClass();
        reverseProtoWriter.writeBytes(bar.unknownFields());
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, bar.emphasized);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, bar.label);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, bar.value_);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MoneybotScaffold.Evidence.Breakdown.BarChart.Bar bar = (MoneybotScaffold.Evidence.Breakdown.BarChart.Bar) obj;
        bar.getClass();
        int size$okio = bar.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, bar.emphasized) + protoAdapter.encodedSizeWithTag(2, bar.label) + protoAdapter.encodedSizeWithTag(1, bar.value_) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MoneybotScaffold.Evidence.Breakdown.BarChart.Bar bar = (MoneybotScaffold.Evidence.Breakdown.BarChart.Bar) obj;
        bar.getClass();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        Expression expression = (Expression) protoAdapter.redact(bar.value_);
        Expression expression2 = bar.label;
        Expression expression3 = expression2 != null ? (Expression) protoAdapter.redact(expression2) : null;
        Expression expression4 = bar.emphasized;
        Expression expression5 = expression4 != null ? (Expression) protoAdapter.redact(expression4) : null;
        ByteString byteString = ByteString.EMPTY;
        expression.getClass();
        byteString.getClass();
        return new MoneybotScaffold.Evidence.Breakdown.BarChart.Bar(expression, expression3, expression5, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MoneybotScaffold.Evidence.Breakdown.BarChart.Bar bar = (MoneybotScaffold.Evidence.Breakdown.BarChart.Bar) obj;
        bar.getClass();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, bar.value_);
        protoAdapter.encodeWithTag(protoWriter, 2, bar.label);
        protoAdapter.encodeWithTag(protoWriter, 3, bar.emphasized);
        protoWriter.writeBytes(bar.unknownFields());
    }
}
