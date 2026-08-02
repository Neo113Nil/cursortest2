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
public final class BenefitsHub$BenefitsBreakdown$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BenefitsHub.BenefitsBreakdown(m, (BenefitsHub.BenefitsBreakdown.LearnMore) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(TextRow.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(BenefitsHub.BenefitsBreakdown.LearnMore.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BenefitsHub.BenefitsBreakdown benefitsBreakdown = (BenefitsHub.BenefitsBreakdown) obj;
        reverseProtoWriter.getClass();
        benefitsBreakdown.getClass();
        reverseProtoWriter.writeBytes(benefitsBreakdown.unknownFields());
        BenefitsHub.BenefitsBreakdown.LearnMore.ADAPTER.encodeWithTag(reverseProtoWriter, 2, benefitsBreakdown.learn_more);
        TextRow.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, benefitsBreakdown.benefits);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BenefitsHub.BenefitsBreakdown benefitsBreakdown = (BenefitsHub.BenefitsBreakdown) obj;
        benefitsBreakdown.getClass();
        return BenefitsHub.BenefitsBreakdown.LearnMore.ADAPTER.encodedSizeWithTag(2, benefitsBreakdown.learn_more) + TextRow.ADAPTER.asRepeated().encodedSizeWithTag(1, benefitsBreakdown.benefits) + benefitsBreakdown.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BenefitsHub.BenefitsBreakdown benefitsBreakdown = (BenefitsHub.BenefitsBreakdown) obj;
        benefitsBreakdown.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(benefitsBreakdown.benefits, TextRow.ADAPTER);
        BenefitsHub.BenefitsBreakdown.LearnMore learnMore = benefitsBreakdown.learn_more;
        BenefitsHub.BenefitsBreakdown.LearnMore learnMore2 = learnMore != null ? (BenefitsHub.BenefitsBreakdown.LearnMore) BenefitsHub.BenefitsBreakdown.LearnMore.ADAPTER.redact(learnMore) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BenefitsHub.BenefitsBreakdown(m1169redactElements, learnMore2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BenefitsHub.BenefitsBreakdown benefitsBreakdown = (BenefitsHub.BenefitsBreakdown) obj;
        benefitsBreakdown.getClass();
        TextRow.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, benefitsBreakdown.benefits);
        BenefitsHub.BenefitsBreakdown.LearnMore.ADAPTER.encodeWithTag(protoWriter, 2, benefitsBreakdown.learn_more);
        protoWriter.writeBytes(benefitsBreakdown.unknownFields());
    }
}
