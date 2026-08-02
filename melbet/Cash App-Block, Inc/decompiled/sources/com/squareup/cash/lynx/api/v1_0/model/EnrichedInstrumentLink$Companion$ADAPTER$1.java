package com.squareup.cash.lynx.api.v1_0.model;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class EnrichedInstrumentLink$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EnrichedInstrumentLink((InstrumentLink) obj, (BinfoDetails) obj2, (BankinfoDetails) obj3, (BrowserInteractionDetails) obj4, (InstrumentVerificationDetails) obj5, (StoredValueBalanceDetails) obj6, (InstrumentLinkMetadata) obj7, (InstrumentLinkOwnerDetails) obj8, (BankMetadata) obj9, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(InstrumentLink.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(BinfoDetails.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(BankinfoDetails.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(BrowserInteractionDetails.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(InstrumentVerificationDetails.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(StoredValueBalanceDetails.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(InstrumentLinkMetadata.ADAPTER, protoReader, obj7);
                    break;
                case 8:
                    obj8 = TransactorKt.decodeMessageOrMerge(InstrumentLinkOwnerDetails.ADAPTER, protoReader, obj8);
                    break;
                case 9:
                    obj9 = TransactorKt.decodeMessageOrMerge(BankMetadata.ADAPTER, protoReader, obj9);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EnrichedInstrumentLink enrichedInstrumentLink = (EnrichedInstrumentLink) obj;
        reverseProtoWriter.getClass();
        enrichedInstrumentLink.getClass();
        reverseProtoWriter.writeBytes(enrichedInstrumentLink.unknownFields());
        BankMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 9, enrichedInstrumentLink.bank_metadata);
        InstrumentLinkOwnerDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 8, enrichedInstrumentLink.instrument_link_owner_details);
        InstrumentLinkMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 7, enrichedInstrumentLink.instrument_link_metadata);
        StoredValueBalanceDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 6, enrichedInstrumentLink.stored_value_balance_details);
        InstrumentVerificationDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 5, enrichedInstrumentLink.instrument_verification_details);
        BrowserInteractionDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 4, enrichedInstrumentLink.browser_interaction_details);
        BankinfoDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 3, enrichedInstrumentLink.bankinfo_details);
        BinfoDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 2, enrichedInstrumentLink.binfo_details);
        InstrumentLink.ADAPTER.encodeWithTag(reverseProtoWriter, 1, enrichedInstrumentLink.instrument_link);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EnrichedInstrumentLink enrichedInstrumentLink = (EnrichedInstrumentLink) obj;
        enrichedInstrumentLink.getClass();
        return BankMetadata.ADAPTER.encodedSizeWithTag(9, enrichedInstrumentLink.bank_metadata) + InstrumentLinkOwnerDetails.ADAPTER.encodedSizeWithTag(8, enrichedInstrumentLink.instrument_link_owner_details) + InstrumentLinkMetadata.ADAPTER.encodedSizeWithTag(7, enrichedInstrumentLink.instrument_link_metadata) + StoredValueBalanceDetails.ADAPTER.encodedSizeWithTag(6, enrichedInstrumentLink.stored_value_balance_details) + InstrumentVerificationDetails.ADAPTER.encodedSizeWithTag(5, enrichedInstrumentLink.instrument_verification_details) + BrowserInteractionDetails.ADAPTER.encodedSizeWithTag(4, enrichedInstrumentLink.browser_interaction_details) + BankinfoDetails.ADAPTER.encodedSizeWithTag(3, enrichedInstrumentLink.bankinfo_details) + BinfoDetails.ADAPTER.encodedSizeWithTag(2, enrichedInstrumentLink.binfo_details) + InstrumentLink.ADAPTER.encodedSizeWithTag(1, enrichedInstrumentLink.instrument_link) + enrichedInstrumentLink.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EnrichedInstrumentLink enrichedInstrumentLink = (EnrichedInstrumentLink) obj;
        enrichedInstrumentLink.getClass();
        InstrumentLink instrumentLink = enrichedInstrumentLink.instrument_link;
        InstrumentLink instrumentLink2 = instrumentLink != null ? (InstrumentLink) InstrumentLink.ADAPTER.redact(instrumentLink) : null;
        BinfoDetails binfoDetails = enrichedInstrumentLink.binfo_details;
        BinfoDetails binfoDetails2 = binfoDetails != null ? (BinfoDetails) BinfoDetails.ADAPTER.redact(binfoDetails) : null;
        BankinfoDetails bankinfoDetails = enrichedInstrumentLink.bankinfo_details;
        BankinfoDetails bankinfoDetails2 = bankinfoDetails != null ? (BankinfoDetails) BankinfoDetails.ADAPTER.redact(bankinfoDetails) : null;
        BrowserInteractionDetails browserInteractionDetails = enrichedInstrumentLink.browser_interaction_details;
        BrowserInteractionDetails browserInteractionDetails2 = browserInteractionDetails != null ? (BrowserInteractionDetails) BrowserInteractionDetails.ADAPTER.redact(browserInteractionDetails) : null;
        InstrumentVerificationDetails instrumentVerificationDetails = enrichedInstrumentLink.instrument_verification_details;
        InstrumentVerificationDetails instrumentVerificationDetails2 = instrumentVerificationDetails != null ? (InstrumentVerificationDetails) InstrumentVerificationDetails.ADAPTER.redact(instrumentVerificationDetails) : null;
        StoredValueBalanceDetails storedValueBalanceDetails = enrichedInstrumentLink.stored_value_balance_details;
        StoredValueBalanceDetails storedValueBalanceDetails2 = storedValueBalanceDetails != null ? (StoredValueBalanceDetails) StoredValueBalanceDetails.ADAPTER.redact(storedValueBalanceDetails) : null;
        InstrumentLinkMetadata instrumentLinkMetadata = enrichedInstrumentLink.instrument_link_metadata;
        InstrumentLinkMetadata instrumentLinkMetadata2 = instrumentLinkMetadata != null ? (InstrumentLinkMetadata) InstrumentLinkMetadata.ADAPTER.redact(instrumentLinkMetadata) : null;
        InstrumentLinkOwnerDetails instrumentLinkOwnerDetails = enrichedInstrumentLink.instrument_link_owner_details;
        InstrumentLinkOwnerDetails instrumentLinkOwnerDetails2 = instrumentLinkOwnerDetails != null ? (InstrumentLinkOwnerDetails) InstrumentLinkOwnerDetails.ADAPTER.redact(instrumentLinkOwnerDetails) : null;
        BankMetadata bankMetadata = enrichedInstrumentLink.bank_metadata;
        BankMetadata bankMetadata2 = bankMetadata != null ? (BankMetadata) BankMetadata.ADAPTER.redact(bankMetadata) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new EnrichedInstrumentLink(instrumentLink2, binfoDetails2, bankinfoDetails2, browserInteractionDetails2, instrumentVerificationDetails2, storedValueBalanceDetails2, instrumentLinkMetadata2, instrumentLinkOwnerDetails2, bankMetadata2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EnrichedInstrumentLink enrichedInstrumentLink = (EnrichedInstrumentLink) obj;
        enrichedInstrumentLink.getClass();
        InstrumentLink.ADAPTER.encodeWithTag(protoWriter, 1, enrichedInstrumentLink.instrument_link);
        BinfoDetails.ADAPTER.encodeWithTag(protoWriter, 2, enrichedInstrumentLink.binfo_details);
        BankinfoDetails.ADAPTER.encodeWithTag(protoWriter, 3, enrichedInstrumentLink.bankinfo_details);
        BrowserInteractionDetails.ADAPTER.encodeWithTag(protoWriter, 4, enrichedInstrumentLink.browser_interaction_details);
        InstrumentVerificationDetails.ADAPTER.encodeWithTag(protoWriter, 5, enrichedInstrumentLink.instrument_verification_details);
        StoredValueBalanceDetails.ADAPTER.encodeWithTag(protoWriter, 6, enrichedInstrumentLink.stored_value_balance_details);
        InstrumentLinkMetadata.ADAPTER.encodeWithTag(protoWriter, 7, enrichedInstrumentLink.instrument_link_metadata);
        InstrumentLinkOwnerDetails.ADAPTER.encodeWithTag(protoWriter, 8, enrichedInstrumentLink.instrument_link_owner_details);
        BankMetadata.ADAPTER.encodeWithTag(protoWriter, 9, enrichedInstrumentLink.bank_metadata);
        protoWriter.writeBytes(enrichedInstrumentLink.unknownFields());
    }
}
