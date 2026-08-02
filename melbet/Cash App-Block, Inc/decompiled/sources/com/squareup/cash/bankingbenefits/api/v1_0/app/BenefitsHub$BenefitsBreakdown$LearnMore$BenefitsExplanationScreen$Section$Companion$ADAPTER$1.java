package com.squareup.cash.bankingbenefits.api.v1_0.app;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class BenefitsHub$BenefitsBreakdown$LearnMore$BenefitsExplanationScreen$Section$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen.Section((String) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen.Section section = (BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen.Section) obj;
        reverseProtoWriter.getClass();
        section.getClass();
        reverseProtoWriter.writeBytes(section.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, section.list_items);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, section.paragraph);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen.Section section = (BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen.Section) obj;
        section.getClass();
        int size$okio = section.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.asRepeated().encodedSizeWithTag(2, section.list_items) + protoAdapter.encodedSizeWithTag(1, section.paragraph) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen.Section section = (BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen.Section) obj;
        section.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = section.paragraph;
        List list = section.list_items;
        list.getClass();
        byteString.getClass();
        return new BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen.Section(str, list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen.Section section = (BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen.Section) obj;
        section.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, section.paragraph);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, section.list_items);
        protoWriter.writeBytes(section.unknownFields());
    }
}
