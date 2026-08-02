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
public final class BenefitsHub$Disclosures$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BenefitsHub.Disclosures(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(BenefitsHub.Disclosures.Disclosure.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BenefitsHub.Disclosures disclosures = (BenefitsHub.Disclosures) obj;
        reverseProtoWriter.getClass();
        disclosures.getClass();
        reverseProtoWriter.writeBytes(disclosures.unknownFields());
        BenefitsHub.Disclosures.Disclosure.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, disclosures.details);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BenefitsHub.Disclosures disclosures = (BenefitsHub.Disclosures) obj;
        disclosures.getClass();
        return BenefitsHub.Disclosures.Disclosure.ADAPTER.asRepeated().encodedSizeWithTag(1, disclosures.details) + disclosures.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BenefitsHub.Disclosures disclosures = (BenefitsHub.Disclosures) obj;
        disclosures.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(disclosures.details, BenefitsHub.Disclosures.Disclosure.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BenefitsHub.Disclosures(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BenefitsHub.Disclosures disclosures = (BenefitsHub.Disclosures) obj;
        disclosures.getClass();
        BenefitsHub.Disclosures.Disclosure.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, disclosures.details);
        protoWriter.writeBytes(disclosures.unknownFields());
    }
}
