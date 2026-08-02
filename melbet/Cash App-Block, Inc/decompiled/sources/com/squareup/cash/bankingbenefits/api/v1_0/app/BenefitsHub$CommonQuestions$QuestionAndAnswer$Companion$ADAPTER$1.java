package com.squareup.cash.bankingbenefits.api.v1_0.app;

import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class BenefitsHub$CommonQuestions$QuestionAndAnswer$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BenefitsHub.CommonQuestions.QuestionAndAnswer((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BenefitsHub.CommonQuestions.QuestionAndAnswer questionAndAnswer = (BenefitsHub.CommonQuestions.QuestionAndAnswer) obj;
        reverseProtoWriter.getClass();
        questionAndAnswer.getClass();
        reverseProtoWriter.writeBytes(questionAndAnswer.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, questionAndAnswer.answer);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, questionAndAnswer.question);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BenefitsHub.CommonQuestions.QuestionAndAnswer questionAndAnswer = (BenefitsHub.CommonQuestions.QuestionAndAnswer) obj;
        questionAndAnswer.getClass();
        int size$okio = questionAndAnswer.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, questionAndAnswer.answer) + protoAdapter.encodedSizeWithTag(1, questionAndAnswer.question) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BenefitsHub.CommonQuestions.QuestionAndAnswer questionAndAnswer = (BenefitsHub.CommonQuestions.QuestionAndAnswer) obj;
        questionAndAnswer.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = questionAndAnswer.question;
        String str2 = questionAndAnswer.answer;
        byteString.getClass();
        return new BenefitsHub.CommonQuestions.QuestionAndAnswer(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BenefitsHub.CommonQuestions.QuestionAndAnswer questionAndAnswer = (BenefitsHub.CommonQuestions.QuestionAndAnswer) obj;
        questionAndAnswer.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, questionAndAnswer.question);
        protoAdapter.encodeWithTag(protoWriter, 2, questionAndAnswer.answer);
        protoWriter.writeBytes(questionAndAnswer.unknownFields());
    }
}
