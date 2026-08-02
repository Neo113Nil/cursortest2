package com.squareup.cash.bankingbenefits.api.v1_0.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BenefitsHub$Insights$Insight$Tooltip$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BenefitsHub.Insights.Insight.Tooltip((UiAvatar) obj, (String) obj2, m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(UiAvatar.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList.add(ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BenefitsHub.Insights.Insight.Tooltip tooltip = (BenefitsHub.Insights.Insight.Tooltip) obj;
        reverseProtoWriter.getClass();
        tooltip.getClass();
        reverseProtoWriter.writeBytes(tooltip.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 4, tooltip.footnote);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, tooltip.paragraphs);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, tooltip.title);
        UiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 1, tooltip.avatar);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BenefitsHub.Insights.Insight.Tooltip tooltip = (BenefitsHub.Insights.Insight.Tooltip) obj;
        tooltip.getClass();
        int encodedSizeWithTag = UiAvatar.ADAPTER.encodedSizeWithTag(1, tooltip.avatar) + tooltip.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.asRepeated().encodedSizeWithTag(4, tooltip.footnote) + protoAdapter.asRepeated().encodedSizeWithTag(3, tooltip.paragraphs) + protoAdapter.encodedSizeWithTag(2, tooltip.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BenefitsHub.Insights.Insight.Tooltip tooltip = (BenefitsHub.Insights.Insight.Tooltip) obj;
        tooltip.getClass();
        UiAvatar uiAvatar = tooltip.avatar;
        UiAvatar uiAvatar2 = uiAvatar != null ? (UiAvatar) UiAvatar.ADAPTER.redact(uiAvatar) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = tooltip.title;
        List list = tooltip.paragraphs;
        List list2 = tooltip.footnote;
        list.getClass();
        list2.getClass();
        byteString.getClass();
        return new BenefitsHub.Insights.Insight.Tooltip(uiAvatar2, str, list, list2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BenefitsHub.Insights.Insight.Tooltip tooltip = (BenefitsHub.Insights.Insight.Tooltip) obj;
        tooltip.getClass();
        UiAvatar.ADAPTER.encodeWithTag(protoWriter, 1, tooltip.avatar);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, tooltip.title);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, tooltip.paragraphs);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 4, tooltip.footnote);
        protoWriter.writeBytes(tooltip.unknownFields());
    }
}
