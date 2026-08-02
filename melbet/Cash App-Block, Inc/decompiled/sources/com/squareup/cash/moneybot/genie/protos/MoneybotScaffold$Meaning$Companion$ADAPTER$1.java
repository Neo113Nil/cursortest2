package com.squareup.cash.moneybot.genie.protos;

import com.squareup.cash.moneybot.genie.protos.MoneybotScaffold;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class MoneybotScaffold$Meaning$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MoneybotScaffold.Meaning((MoneybotScaffold.Meaning.RiskPattern) obj, (MoneybotScaffold.Meaning.Opportunity) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = MoneybotScaffold.Meaning.RiskPattern.ADAPTER.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = MoneybotScaffold.Meaning.Opportunity.ADAPTER.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MoneybotScaffold.Meaning meaning = (MoneybotScaffold.Meaning) obj;
        reverseProtoWriter.getClass();
        meaning.getClass();
        reverseProtoWriter.writeBytes(meaning.unknownFields());
        MoneybotScaffold.Meaning.Opportunity.ADAPTER.encodeWithTag(reverseProtoWriter, 2, meaning.opportunity);
        MoneybotScaffold.Meaning.RiskPattern.ADAPTER.encodeWithTag(reverseProtoWriter, 1, meaning.risk_pattern);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MoneybotScaffold.Meaning meaning = (MoneybotScaffold.Meaning) obj;
        meaning.getClass();
        return MoneybotScaffold.Meaning.Opportunity.ADAPTER.encodedSizeWithTag(2, meaning.opportunity) + MoneybotScaffold.Meaning.RiskPattern.ADAPTER.encodedSizeWithTag(1, meaning.risk_pattern) + meaning.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MoneybotScaffold.Meaning meaning = (MoneybotScaffold.Meaning) obj;
        meaning.getClass();
        MoneybotScaffold.Meaning.RiskPattern riskPattern = meaning.risk_pattern;
        MoneybotScaffold.Meaning.RiskPattern riskPattern2 = riskPattern != null ? (MoneybotScaffold.Meaning.RiskPattern) MoneybotScaffold.Meaning.RiskPattern.ADAPTER.redact(riskPattern) : null;
        MoneybotScaffold.Meaning.Opportunity opportunity = meaning.opportunity;
        MoneybotScaffold.Meaning.Opportunity opportunity2 = opportunity != null ? (MoneybotScaffold.Meaning.Opportunity) MoneybotScaffold.Meaning.Opportunity.ADAPTER.redact(opportunity) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new MoneybotScaffold.Meaning(riskPattern2, opportunity2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MoneybotScaffold.Meaning meaning = (MoneybotScaffold.Meaning) obj;
        meaning.getClass();
        MoneybotScaffold.Meaning.RiskPattern.ADAPTER.encodeWithTag(protoWriter, 1, meaning.risk_pattern);
        MoneybotScaffold.Meaning.Opportunity.ADAPTER.encodeWithTag(protoWriter, 2, meaning.opportunity);
        protoWriter.writeBytes(meaning.unknownFields());
    }
}
