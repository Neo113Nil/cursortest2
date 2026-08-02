package com.squareup.cash.bankingbenefits.api.v1_0.app;

import androidx.room.TransactorKt;
import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BenefitsHub$Insights$Insight$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BenefitsHub.Insights.Insight((String) obj, (String) obj2, (Color) obj3, (Prominence) obj4, (BenefitsHub.Insights.Insight.Tooltip) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                try {
                    obj4 = Prominence.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(BenefitsHub.Insights.Insight.Tooltip.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BenefitsHub.Insights.Insight insight = (BenefitsHub.Insights.Insight) obj;
        reverseProtoWriter.getClass();
        insight.getClass();
        reverseProtoWriter.writeBytes(insight.unknownFields());
        BenefitsHub.Insights.Insight.Tooltip.ADAPTER.encodeWithTag(reverseProtoWriter, 5, insight.tooltip);
        Prominence.ADAPTER.encodeWithTag(reverseProtoWriter, 4, insight.prominence);
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 3, insight.tint_color);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, insight.subheading);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, insight.heading);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BenefitsHub.Insights.Insight insight = (BenefitsHub.Insights.Insight) obj;
        insight.getClass();
        int size$okio = insight.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return BenefitsHub.Insights.Insight.Tooltip.ADAPTER.encodedSizeWithTag(5, insight.tooltip) + Prominence.ADAPTER.encodedSizeWithTag(4, insight.prominence) + Color.ADAPTER.encodedSizeWithTag(3, insight.tint_color) + protoAdapter.encodedSizeWithTag(2, insight.subheading) + protoAdapter.encodedSizeWithTag(1, insight.heading) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BenefitsHub.Insights.Insight insight = (BenefitsHub.Insights.Insight) obj;
        insight.getClass();
        Color color = insight.tint_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        BenefitsHub.Insights.Insight.Tooltip tooltip = insight.tooltip;
        BenefitsHub.Insights.Insight.Tooltip tooltip2 = tooltip != null ? (BenefitsHub.Insights.Insight.Tooltip) BenefitsHub.Insights.Insight.Tooltip.ADAPTER.redact(tooltip) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = insight.heading;
        String str2 = insight.subheading;
        Prominence prominence = insight.prominence;
        byteString.getClass();
        return new BenefitsHub.Insights.Insight(str, str2, color2, prominence, tooltip2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BenefitsHub.Insights.Insight insight = (BenefitsHub.Insights.Insight) obj;
        insight.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, insight.heading);
        protoAdapter.encodeWithTag(protoWriter, 2, insight.subheading);
        Color.ADAPTER.encodeWithTag(protoWriter, 3, insight.tint_color);
        Prominence.ADAPTER.encodeWithTag(protoWriter, 4, insight.prominence);
        BenefitsHub.Insights.Insight.Tooltip.ADAPTER.encodeWithTag(protoWriter, 5, insight.tooltip);
        protoWriter.writeBytes(insight.unknownFields());
    }
}
