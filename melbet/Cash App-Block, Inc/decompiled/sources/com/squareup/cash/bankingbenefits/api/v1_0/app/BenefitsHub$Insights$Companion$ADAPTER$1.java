package com.squareup.cash.bankingbenefits.api.v1_0.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class BenefitsHub$Insights$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BenefitsHub.Insights(m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(BenefitsHub.Insights.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList.add(BenefitsHub.Insights.Insight.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BenefitsHub.Insights insights = (BenefitsHub.Insights) obj;
        reverseProtoWriter.getClass();
        insights.getClass();
        reverseProtoWriter.writeBytes(insights.unknownFields());
        BenefitsHub.Insights.Insight.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, insights.insights);
        BenefitsHub.Insights.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, insights.details);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BenefitsHub.Insights insights = (BenefitsHub.Insights) obj;
        insights.getClass();
        return BenefitsHub.Insights.Insight.ADAPTER.asRepeated().encodedSizeWithTag(2, insights.insights) + BenefitsHub.Insights.ADAPTER.asRepeated().encodedSizeWithTag(1, insights.details) + insights.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BenefitsHub.Insights insights = (BenefitsHub.Insights) obj;
        insights.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(insights.details, BenefitsHub.Insights.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(insights.insights, BenefitsHub.Insights.Insight.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BenefitsHub.Insights(m1169redactElements, m1169redactElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BenefitsHub.Insights insights = (BenefitsHub.Insights) obj;
        insights.getClass();
        BenefitsHub.Insights.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, insights.details);
        BenefitsHub.Insights.Insight.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, insights.insights);
        protoWriter.writeBytes(insights.unknownFields());
    }
}
