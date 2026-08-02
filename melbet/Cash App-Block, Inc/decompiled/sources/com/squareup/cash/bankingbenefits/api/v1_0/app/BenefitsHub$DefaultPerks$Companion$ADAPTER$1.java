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
public final class BenefitsHub$DefaultPerks$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BenefitsHub.DefaultPerks(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(TextRow.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BenefitsHub.DefaultPerks defaultPerks = (BenefitsHub.DefaultPerks) obj;
        reverseProtoWriter.getClass();
        defaultPerks.getClass();
        reverseProtoWriter.writeBytes(defaultPerks.unknownFields());
        TextRow.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, defaultPerks.details);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BenefitsHub.DefaultPerks defaultPerks = (BenefitsHub.DefaultPerks) obj;
        defaultPerks.getClass();
        return TextRow.ADAPTER.asRepeated().encodedSizeWithTag(1, defaultPerks.details) + defaultPerks.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BenefitsHub.DefaultPerks defaultPerks = (BenefitsHub.DefaultPerks) obj;
        defaultPerks.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(defaultPerks.details, TextRow.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BenefitsHub.DefaultPerks(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BenefitsHub.DefaultPerks defaultPerks = (BenefitsHub.DefaultPerks) obj;
        defaultPerks.getClass();
        TextRow.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, defaultPerks.details);
        protoWriter.writeBytes(defaultPerks.unknownFields());
    }
}
