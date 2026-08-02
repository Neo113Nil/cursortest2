package com.squareup.cash.moneybot.genie.protos;

import com.squareup.cash.moneybot.genie.protos.MoneybotScaffold;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class MoneybotScaffold$Answer$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MoneybotScaffold.Answer((MoneybotScaffold.Answer.DirectAnswer) obj, (MoneybotScaffold.Answer.FallbackTitle) obj2, (MoneybotScaffold.Answer.StatusExplanation) obj3, (MoneybotScaffold.Answer.Decision) obj4, (MoneybotScaffold.Answer.Scenario) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = MoneybotScaffold.Answer.DirectAnswer.ADAPTER.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = MoneybotScaffold.Answer.FallbackTitle.ADAPTER.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = MoneybotScaffold.Answer.StatusExplanation.ADAPTER.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = MoneybotScaffold.Answer.Decision.ADAPTER.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = MoneybotScaffold.Answer.Scenario.ADAPTER.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MoneybotScaffold.Answer answer = (MoneybotScaffold.Answer) obj;
        reverseProtoWriter.getClass();
        answer.getClass();
        reverseProtoWriter.writeBytes(answer.unknownFields());
        MoneybotScaffold.Answer.Scenario.ADAPTER.encodeWithTag(reverseProtoWriter, 5, answer.scenario);
        MoneybotScaffold.Answer.Decision.ADAPTER.encodeWithTag(reverseProtoWriter, 4, answer.decision);
        MoneybotScaffold.Answer.StatusExplanation.ADAPTER.encodeWithTag(reverseProtoWriter, 3, answer.status_explanation);
        MoneybotScaffold.Answer.FallbackTitle.ADAPTER.encodeWithTag(reverseProtoWriter, 2, answer.fallback_title);
        MoneybotScaffold.Answer.DirectAnswer.ADAPTER.encodeWithTag(reverseProtoWriter, 1, answer.direct_answer);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MoneybotScaffold.Answer answer = (MoneybotScaffold.Answer) obj;
        answer.getClass();
        return MoneybotScaffold.Answer.Scenario.ADAPTER.encodedSizeWithTag(5, answer.scenario) + MoneybotScaffold.Answer.Decision.ADAPTER.encodedSizeWithTag(4, answer.decision) + MoneybotScaffold.Answer.StatusExplanation.ADAPTER.encodedSizeWithTag(3, answer.status_explanation) + MoneybotScaffold.Answer.FallbackTitle.ADAPTER.encodedSizeWithTag(2, answer.fallback_title) + MoneybotScaffold.Answer.DirectAnswer.ADAPTER.encodedSizeWithTag(1, answer.direct_answer) + answer.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MoneybotScaffold.Answer answer = (MoneybotScaffold.Answer) obj;
        answer.getClass();
        MoneybotScaffold.Answer.DirectAnswer directAnswer = answer.direct_answer;
        MoneybotScaffold.Answer.DirectAnswer directAnswer2 = directAnswer != null ? (MoneybotScaffold.Answer.DirectAnswer) MoneybotScaffold.Answer.DirectAnswer.ADAPTER.redact(directAnswer) : null;
        MoneybotScaffold.Answer.FallbackTitle fallbackTitle = answer.fallback_title;
        MoneybotScaffold.Answer.FallbackTitle fallbackTitle2 = fallbackTitle != null ? (MoneybotScaffold.Answer.FallbackTitle) MoneybotScaffold.Answer.FallbackTitle.ADAPTER.redact(fallbackTitle) : null;
        MoneybotScaffold.Answer.StatusExplanation statusExplanation = answer.status_explanation;
        MoneybotScaffold.Answer.StatusExplanation statusExplanation2 = statusExplanation != null ? (MoneybotScaffold.Answer.StatusExplanation) MoneybotScaffold.Answer.StatusExplanation.ADAPTER.redact(statusExplanation) : null;
        MoneybotScaffold.Answer.Decision decision = answer.decision;
        MoneybotScaffold.Answer.Decision decision2 = decision != null ? (MoneybotScaffold.Answer.Decision) MoneybotScaffold.Answer.Decision.ADAPTER.redact(decision) : null;
        MoneybotScaffold.Answer.Scenario scenario = answer.scenario;
        MoneybotScaffold.Answer.Scenario scenario2 = scenario != null ? (MoneybotScaffold.Answer.Scenario) MoneybotScaffold.Answer.Scenario.ADAPTER.redact(scenario) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new MoneybotScaffold.Answer(directAnswer2, fallbackTitle2, statusExplanation2, decision2, scenario2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MoneybotScaffold.Answer answer = (MoneybotScaffold.Answer) obj;
        answer.getClass();
        MoneybotScaffold.Answer.DirectAnswer.ADAPTER.encodeWithTag(protoWriter, 1, answer.direct_answer);
        MoneybotScaffold.Answer.FallbackTitle.ADAPTER.encodeWithTag(protoWriter, 2, answer.fallback_title);
        MoneybotScaffold.Answer.StatusExplanation.ADAPTER.encodeWithTag(protoWriter, 3, answer.status_explanation);
        MoneybotScaffold.Answer.Decision.ADAPTER.encodeWithTag(protoWriter, 4, answer.decision);
        MoneybotScaffold.Answer.Scenario.ADAPTER.encodeWithTag(protoWriter, 5, answer.scenario);
        protoWriter.writeBytes(answer.unknownFields());
    }
}
