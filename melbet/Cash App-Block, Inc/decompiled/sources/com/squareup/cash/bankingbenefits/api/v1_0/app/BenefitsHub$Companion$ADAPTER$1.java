package com.squareup.cash.bankingbenefits.api.v1_0.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.TextRow;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class BenefitsHub$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BenefitsHub((String) obj, (TextRow) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(TextRow.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(BenefitsHub.Section.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BenefitsHub benefitsHub = (BenefitsHub) obj;
        reverseProtoWriter.getClass();
        benefitsHub.getClass();
        reverseProtoWriter.writeBytes(benefitsHub.unknownFields());
        BenefitsHub.Section.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, benefitsHub.sections);
        TextRow.ADAPTER.encodeWithTag(reverseProtoWriter, 2, benefitsHub.status);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, benefitsHub.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BenefitsHub benefitsHub = (BenefitsHub) obj;
        benefitsHub.getClass();
        return BenefitsHub.Section.ADAPTER.asRepeated().encodedSizeWithTag(3, benefitsHub.sections) + TextRow.ADAPTER.encodedSizeWithTag(2, benefitsHub.status) + ProtoAdapter.STRING.encodedSizeWithTag(1, benefitsHub.title) + benefitsHub.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BenefitsHub benefitsHub = (BenefitsHub) obj;
        benefitsHub.getClass();
        TextRow textRow = benefitsHub.status;
        TextRow textRow2 = textRow != null ? (TextRow) TextRow.ADAPTER.redact(textRow) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(benefitsHub.sections, BenefitsHub.Section.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = benefitsHub.title;
        byteString.getClass();
        return new BenefitsHub(str, textRow2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BenefitsHub benefitsHub = (BenefitsHub) obj;
        benefitsHub.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, benefitsHub.title);
        TextRow.ADAPTER.encodeWithTag(protoWriter, 2, benefitsHub.status);
        BenefitsHub.Section.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, benefitsHub.sections);
        protoWriter.writeBytes(benefitsHub.unknownFields());
    }
}
