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
public final class BenefitsHub$CommonQuestions$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BenefitsHub.CommonQuestions(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(BenefitsHub.CommonQuestions.QuestionAndAnswer.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BenefitsHub.CommonQuestions commonQuestions = (BenefitsHub.CommonQuestions) obj;
        reverseProtoWriter.getClass();
        commonQuestions.getClass();
        reverseProtoWriter.writeBytes(commonQuestions.unknownFields());
        BenefitsHub.CommonQuestions.QuestionAndAnswer.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, commonQuestions.details);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BenefitsHub.CommonQuestions commonQuestions = (BenefitsHub.CommonQuestions) obj;
        commonQuestions.getClass();
        return BenefitsHub.CommonQuestions.QuestionAndAnswer.ADAPTER.asRepeated().encodedSizeWithTag(1, commonQuestions.details) + commonQuestions.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BenefitsHub.CommonQuestions commonQuestions = (BenefitsHub.CommonQuestions) obj;
        commonQuestions.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(commonQuestions.details, BenefitsHub.CommonQuestions.QuestionAndAnswer.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BenefitsHub.CommonQuestions(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BenefitsHub.CommonQuestions commonQuestions = (BenefitsHub.CommonQuestions) obj;
        commonQuestions.getClass();
        BenefitsHub.CommonQuestions.QuestionAndAnswer.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, commonQuestions.details);
        protoWriter.writeBytes(commonQuestions.unknownFields());
    }
}
