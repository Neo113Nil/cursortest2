package com.squareup.cash.moneybot.genie.protos;

import androidx.room.TransactorKt;
import com.squareup.cash.moneybot.genie.protos.MoneybotScaffold;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class MoneybotScaffold$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = MoneybotScaffold.Answer.ADAPTER.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = MoneybotScaffold.Evidence.ADAPTER.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = MoneybotScaffold.Meaning.ADAPTER.decode(protoReader);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        MoneybotScaffold.Answer answer = (MoneybotScaffold.Answer) obj;
        if (answer == null) {
            TransactorKt.missingRequiredFields(obj, "answer");
            throw null;
        }
        MoneybotScaffold.Evidence evidence = (MoneybotScaffold.Evidence) obj2;
        if (evidence == null) {
            TransactorKt.missingRequiredFields(obj2, "evidence");
            throw null;
        }
        MoneybotScaffold.Meaning meaning = (MoneybotScaffold.Meaning) obj3;
        if (meaning != null) {
            return new MoneybotScaffold(answer, evidence, meaning, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj3, "meaning");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MoneybotScaffold moneybotScaffold = (MoneybotScaffold) obj;
        reverseProtoWriter.getClass();
        moneybotScaffold.getClass();
        reverseProtoWriter.writeBytes(moneybotScaffold.unknownFields());
        MoneybotScaffold.Meaning.ADAPTER.encodeWithTag(reverseProtoWriter, 3, moneybotScaffold.meaning);
        MoneybotScaffold.Evidence.ADAPTER.encodeWithTag(reverseProtoWriter, 2, moneybotScaffold.evidence);
        MoneybotScaffold.Answer.ADAPTER.encodeWithTag(reverseProtoWriter, 1, moneybotScaffold.answer);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MoneybotScaffold moneybotScaffold = (MoneybotScaffold) obj;
        moneybotScaffold.getClass();
        return MoneybotScaffold.Meaning.ADAPTER.encodedSizeWithTag(3, moneybotScaffold.meaning) + MoneybotScaffold.Evidence.ADAPTER.encodedSizeWithTag(2, moneybotScaffold.evidence) + MoneybotScaffold.Answer.ADAPTER.encodedSizeWithTag(1, moneybotScaffold.answer) + moneybotScaffold.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MoneybotScaffold moneybotScaffold = (MoneybotScaffold) obj;
        moneybotScaffold.getClass();
        MoneybotScaffold.Answer answer = (MoneybotScaffold.Answer) MoneybotScaffold.Answer.ADAPTER.redact(moneybotScaffold.answer);
        MoneybotScaffold.Evidence evidence = (MoneybotScaffold.Evidence) MoneybotScaffold.Evidence.ADAPTER.redact(moneybotScaffold.evidence);
        MoneybotScaffold.Meaning meaning = (MoneybotScaffold.Meaning) MoneybotScaffold.Meaning.ADAPTER.redact(moneybotScaffold.meaning);
        ByteString byteString = ByteString.EMPTY;
        answer.getClass();
        evidence.getClass();
        meaning.getClass();
        byteString.getClass();
        return new MoneybotScaffold(answer, evidence, meaning, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MoneybotScaffold moneybotScaffold = (MoneybotScaffold) obj;
        moneybotScaffold.getClass();
        MoneybotScaffold.Answer.ADAPTER.encodeWithTag(protoWriter, 1, moneybotScaffold.answer);
        MoneybotScaffold.Evidence.ADAPTER.encodeWithTag(protoWriter, 2, moneybotScaffold.evidence);
        MoneybotScaffold.Meaning.ADAPTER.encodeWithTag(protoWriter, 3, moneybotScaffold.meaning);
        protoWriter.writeBytes(moneybotScaffold.unknownFields());
    }
}
