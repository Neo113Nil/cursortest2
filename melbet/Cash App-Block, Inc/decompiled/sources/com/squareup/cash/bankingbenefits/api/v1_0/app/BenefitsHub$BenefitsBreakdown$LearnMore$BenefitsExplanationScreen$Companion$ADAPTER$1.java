package com.squareup.cash.bankingbenefits.api.v1_0.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BenefitsHub$BenefitsBreakdown$LearnMore$BenefitsExplanationScreen$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen((String) obj, m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                m.add(BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen.Section.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList.add(ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen benefitsExplanationScreen = (BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen) obj;
        reverseProtoWriter.getClass();
        benefitsExplanationScreen.getClass();
        reverseProtoWriter.writeBytes(benefitsExplanationScreen.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, benefitsExplanationScreen.footers);
        BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen.Section.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, benefitsExplanationScreen.sections);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, benefitsExplanationScreen.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen benefitsExplanationScreen = (BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen) obj;
        benefitsExplanationScreen.getClass();
        int size$okio = benefitsExplanationScreen.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.asRepeated().encodedSizeWithTag(3, benefitsExplanationScreen.footers) + BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen.Section.ADAPTER.asRepeated().encodedSizeWithTag(2, benefitsExplanationScreen.sections) + protoAdapter.encodedSizeWithTag(1, benefitsExplanationScreen.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen benefitsExplanationScreen = (BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen) obj;
        benefitsExplanationScreen.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(benefitsExplanationScreen.sections, BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen.Section.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = benefitsExplanationScreen.title;
        List list = benefitsExplanationScreen.footers;
        list.getClass();
        byteString.getClass();
        return new BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen(str, m1169redactElements, list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen benefitsExplanationScreen = (BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen) obj;
        benefitsExplanationScreen.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, benefitsExplanationScreen.title);
        BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen.Section.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, benefitsExplanationScreen.sections);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, benefitsExplanationScreen.footers);
        protoWriter.writeBytes(benefitsExplanationScreen.unknownFields());
    }
}
