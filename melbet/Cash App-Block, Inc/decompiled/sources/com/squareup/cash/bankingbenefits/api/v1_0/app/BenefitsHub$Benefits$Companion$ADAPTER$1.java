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
public final class BenefitsHub$Benefits$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BenefitsHub.Benefits((Boolean) obj2, (String) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(TextRow.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BenefitsHub.Benefits benefits = (BenefitsHub.Benefits) obj;
        reverseProtoWriter.getClass();
        benefits.getClass();
        reverseProtoWriter.writeBytes(benefits.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, benefits.unavailable_benefits_rollup_disabled);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, benefits.unavailable_benefits_rollup_title);
        TextRow.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, benefits.details);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BenefitsHub.Benefits benefits = (BenefitsHub.Benefits) obj;
        benefits.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(3, benefits.unavailable_benefits_rollup_disabled) + ProtoAdapter.STRING.encodedSizeWithTag(2, benefits.unavailable_benefits_rollup_title) + TextRow.ADAPTER.asRepeated().encodedSizeWithTag(1, benefits.details) + benefits.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BenefitsHub.Benefits benefits = (BenefitsHub.Benefits) obj;
        benefits.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(benefits.details, TextRow.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = benefits.unavailable_benefits_rollup_title;
        Boolean bool = benefits.unavailable_benefits_rollup_disabled;
        byteString.getClass();
        return new BenefitsHub.Benefits(bool, str, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BenefitsHub.Benefits benefits = (BenefitsHub.Benefits) obj;
        benefits.getClass();
        TextRow.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, benefits.details);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, benefits.unavailable_benefits_rollup_title);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, benefits.unavailable_benefits_rollup_disabled);
        protoWriter.writeBytes(benefits.unknownFields());
    }
}
