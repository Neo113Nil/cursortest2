package com.squareup.cash.lynx.api.v1_0.model;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.lynx.api.v1_0.model.link.LinkedReason;
import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class InstrumentLinkMetadata$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InstrumentLinkMetadata((LinkResult) obj4, (CardBankDetails) obj5, (String) obj6, (CardLinkRiskEvaluationResult) obj7, (VerifyResponse) obj8, (UnlinkedBy) obj9, (UnlinkedReason) obj10, (String) obj11, m, (String) obj12, (LinkedReason) obj13, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = obj4;
                    obj2 = obj6;
                    obj3 = obj7;
                    try {
                        obj4 = LinkResult.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                    obj6 = obj2;
                    obj7 = obj3;
                    break;
                case 2:
                    obj5 = TransactorKt.decodeMessageOrMerge(CardBankDetails.ADAPTER, protoReader, obj5);
                    break;
                case 3:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj = obj4;
                    obj2 = obj6;
                    obj3 = obj7;
                    try {
                        obj4 = obj;
                        obj7 = CardLinkRiskEvaluationResult.ADAPTER.decode(protoReader);
                        obj6 = obj2;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 5:
                    obj8 = TransactorKt.decodeMessageOrMerge(VerifyResponse.ADAPTER, protoReader, obj8);
                    break;
                case 6:
                    obj = obj4;
                    obj2 = obj6;
                    obj3 = obj7;
                    try {
                        obj4 = obj;
                        obj9 = UnlinkedBy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                    obj6 = obj2;
                    obj7 = obj3;
                    break;
                case 7:
                    obj = obj4;
                    obj2 = obj6;
                    obj3 = obj7;
                    try {
                        obj4 = obj;
                        obj10 = UnlinkedReason.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                        break;
                    }
                    obj6 = obj2;
                    obj7 = obj3;
                    break;
                case 8:
                    obj11 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    obj = obj4;
                    obj2 = obj6;
                    obj3 = obj7;
                    m.add(ProtoAdapter.STRING.decode(protoReader));
                    obj4 = obj;
                    obj6 = obj2;
                    obj7 = obj3;
                    break;
                case 10:
                    obj12 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 11:
                    try {
                        obj13 = LinkedReason.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                        obj = obj4;
                        obj2 = obj6;
                        obj3 = obj7;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj4;
                    obj2 = obj6;
                    obj3 = obj7;
                    obj4 = obj;
                    obj6 = obj2;
                    obj7 = obj3;
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InstrumentLinkMetadata instrumentLinkMetadata = (InstrumentLinkMetadata) obj;
        reverseProtoWriter.getClass();
        instrumentLinkMetadata.getClass();
        reverseProtoWriter.writeBytes(instrumentLinkMetadata.unknownFields());
        LinkedReason.ADAPTER.encodeWithTag(reverseProtoWriter, 11, instrumentLinkMetadata.linked_reason);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, instrumentLinkMetadata.instrument_link_token_replaced);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 9, instrumentLinkMetadata.eligibility_violation_metadata);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, instrumentLinkMetadata.eligibility_violation);
        UnlinkedReason.ADAPTER.encodeWithTag(reverseProtoWriter, 7, instrumentLinkMetadata.unlinked_reason);
        UnlinkedBy.ADAPTER.encodeWithTag(reverseProtoWriter, 6, instrumentLinkMetadata.unlinked_by);
        VerifyResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 5, instrumentLinkMetadata.verify_response);
        CardLinkRiskEvaluationResult.ADAPTER.encodeWithTag(reverseProtoWriter, 4, instrumentLinkMetadata.risk_result);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, instrumentLinkMetadata.threeds_challenge_token);
        CardBankDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 2, instrumentLinkMetadata.card_bank_details);
        LinkResult.ADAPTER.encodeWithTag(reverseProtoWriter, 1, instrumentLinkMetadata.link_result);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InstrumentLinkMetadata instrumentLinkMetadata = (InstrumentLinkMetadata) obj;
        instrumentLinkMetadata.getClass();
        int encodedSizeWithTag = CardBankDetails.ADAPTER.encodedSizeWithTag(2, instrumentLinkMetadata.card_bank_details) + LinkResult.ADAPTER.encodedSizeWithTag(1, instrumentLinkMetadata.link_result) + instrumentLinkMetadata.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LinkedReason.ADAPTER.encodedSizeWithTag(11, instrumentLinkMetadata.linked_reason) + protoAdapter.encodedSizeWithTag(10, instrumentLinkMetadata.instrument_link_token_replaced) + protoAdapter.asRepeated().encodedSizeWithTag(9, instrumentLinkMetadata.eligibility_violation_metadata) + protoAdapter.encodedSizeWithTag(8, instrumentLinkMetadata.eligibility_violation) + UnlinkedReason.ADAPTER.encodedSizeWithTag(7, instrumentLinkMetadata.unlinked_reason) + UnlinkedBy.ADAPTER.encodedSizeWithTag(6, instrumentLinkMetadata.unlinked_by) + VerifyResponse.ADAPTER.encodedSizeWithTag(5, instrumentLinkMetadata.verify_response) + CardLinkRiskEvaluationResult.ADAPTER.encodedSizeWithTag(4, instrumentLinkMetadata.risk_result) + protoAdapter.encodedSizeWithTag(3, instrumentLinkMetadata.threeds_challenge_token) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InstrumentLinkMetadata instrumentLinkMetadata = (InstrumentLinkMetadata) obj;
        instrumentLinkMetadata.getClass();
        CardBankDetails cardBankDetails = instrumentLinkMetadata.card_bank_details;
        CardBankDetails cardBankDetails2 = cardBankDetails != null ? (CardBankDetails) CardBankDetails.ADAPTER.redact(cardBankDetails) : null;
        VerifyResponse verifyResponse = instrumentLinkMetadata.verify_response;
        VerifyResponse verifyResponse2 = verifyResponse != null ? (VerifyResponse) VerifyResponse.ADAPTER.redact(verifyResponse) : null;
        ByteString byteString = ByteString.EMPTY;
        LinkResult linkResult = instrumentLinkMetadata.link_result;
        String str = instrumentLinkMetadata.threeds_challenge_token;
        CardLinkRiskEvaluationResult cardLinkRiskEvaluationResult = instrumentLinkMetadata.risk_result;
        UnlinkedBy unlinkedBy = instrumentLinkMetadata.unlinked_by;
        UnlinkedReason unlinkedReason = instrumentLinkMetadata.unlinked_reason;
        String str2 = instrumentLinkMetadata.eligibility_violation;
        List list = instrumentLinkMetadata.eligibility_violation_metadata;
        String str3 = instrumentLinkMetadata.instrument_link_token_replaced;
        LinkedReason linkedReason = instrumentLinkMetadata.linked_reason;
        list.getClass();
        byteString.getClass();
        return new InstrumentLinkMetadata(linkResult, cardBankDetails2, str, cardLinkRiskEvaluationResult, verifyResponse2, unlinkedBy, unlinkedReason, str2, list, str3, linkedReason, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InstrumentLinkMetadata instrumentLinkMetadata = (InstrumentLinkMetadata) obj;
        instrumentLinkMetadata.getClass();
        LinkResult.ADAPTER.encodeWithTag(protoWriter, 1, instrumentLinkMetadata.link_result);
        CardBankDetails.ADAPTER.encodeWithTag(protoWriter, 2, instrumentLinkMetadata.card_bank_details);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, instrumentLinkMetadata.threeds_challenge_token);
        CardLinkRiskEvaluationResult.ADAPTER.encodeWithTag(protoWriter, 4, instrumentLinkMetadata.risk_result);
        VerifyResponse.ADAPTER.encodeWithTag(protoWriter, 5, instrumentLinkMetadata.verify_response);
        UnlinkedBy.ADAPTER.encodeWithTag(protoWriter, 6, instrumentLinkMetadata.unlinked_by);
        UnlinkedReason.ADAPTER.encodeWithTag(protoWriter, 7, instrumentLinkMetadata.unlinked_reason);
        protoAdapter.encodeWithTag(protoWriter, 8, instrumentLinkMetadata.eligibility_violation);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 9, instrumentLinkMetadata.eligibility_violation_metadata);
        protoAdapter.encodeWithTag(protoWriter, 10, instrumentLinkMetadata.instrument_link_token_replaced);
        LinkedReason.ADAPTER.encodeWithTag(protoWriter, 11, instrumentLinkMetadata.linked_reason);
        protoWriter.writeBytes(instrumentLinkMetadata.unknownFields());
    }
}
