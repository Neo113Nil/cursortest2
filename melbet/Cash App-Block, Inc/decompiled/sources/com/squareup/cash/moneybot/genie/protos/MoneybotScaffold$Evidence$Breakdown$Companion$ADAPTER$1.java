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

/* loaded from: classes6.dex */
public final class MoneybotScaffold$Evidence$Breakdown$Companion$ADAPTER$1 extends ProtoAdapter {
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
                obj = MoneybotScaffold.Evidence.Breakdown.BarChart.ADAPTER.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(MoneybotScaffold.Evidence.Breakdown.CategoryRow.ADAPTER.decode(protoReader));
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        MoneybotScaffold.Evidence.Breakdown.BarChart barChart = (MoneybotScaffold.Evidence.Breakdown.BarChart) obj;
        if (barChart != null) {
            return new MoneybotScaffold.Evidence.Breakdown(barChart, m, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "chart");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MoneybotScaffold.Evidence.Breakdown breakdown = (MoneybotScaffold.Evidence.Breakdown) obj;
        reverseProtoWriter.getClass();
        breakdown.getClass();
        reverseProtoWriter.writeBytes(breakdown.unknownFields());
        MoneybotScaffold.Evidence.Breakdown.CategoryRow.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, breakdown.rows);
        MoneybotScaffold.Evidence.Breakdown.BarChart.ADAPTER.encodeWithTag(reverseProtoWriter, 1, breakdown.chart);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MoneybotScaffold.Evidence.Breakdown breakdown = (MoneybotScaffold.Evidence.Breakdown) obj;
        breakdown.getClass();
        return MoneybotScaffold.Evidence.Breakdown.CategoryRow.ADAPTER.asRepeated().encodedSizeWithTag(2, breakdown.rows) + MoneybotScaffold.Evidence.Breakdown.BarChart.ADAPTER.encodedSizeWithTag(1, breakdown.chart) + breakdown.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MoneybotScaffold.Evidence.Breakdown breakdown = (MoneybotScaffold.Evidence.Breakdown) obj;
        breakdown.getClass();
        MoneybotScaffold.Evidence.Breakdown.BarChart barChart = (MoneybotScaffold.Evidence.Breakdown.BarChart) MoneybotScaffold.Evidence.Breakdown.BarChart.ADAPTER.redact(breakdown.chart);
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(breakdown.rows, MoneybotScaffold.Evidence.Breakdown.CategoryRow.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        barChart.getClass();
        byteString.getClass();
        return new MoneybotScaffold.Evidence.Breakdown(barChart, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MoneybotScaffold.Evidence.Breakdown breakdown = (MoneybotScaffold.Evidence.Breakdown) obj;
        breakdown.getClass();
        MoneybotScaffold.Evidence.Breakdown.BarChart.ADAPTER.encodeWithTag(protoWriter, 1, breakdown.chart);
        MoneybotScaffold.Evidence.Breakdown.CategoryRow.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, breakdown.rows);
        protoWriter.writeBytes(breakdown.unknownFields());
    }
}
