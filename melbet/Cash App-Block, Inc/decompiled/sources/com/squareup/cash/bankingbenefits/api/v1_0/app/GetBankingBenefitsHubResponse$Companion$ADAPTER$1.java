package com.squareup.cash.bankingbenefits.api.v1_0.app;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class GetBankingBenefitsHubResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetBankingBenefitsHubResponse((BenefitsHub) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(BenefitsHub.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetBankingBenefitsHubResponse getBankingBenefitsHubResponse = (GetBankingBenefitsHubResponse) obj;
        reverseProtoWriter.getClass();
        getBankingBenefitsHubResponse.getClass();
        reverseProtoWriter.writeBytes(getBankingBenefitsHubResponse.unknownFields());
        BenefitsHub.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getBankingBenefitsHubResponse.benefits_hub);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetBankingBenefitsHubResponse getBankingBenefitsHubResponse = (GetBankingBenefitsHubResponse) obj;
        getBankingBenefitsHubResponse.getClass();
        return BenefitsHub.ADAPTER.encodedSizeWithTag(1, getBankingBenefitsHubResponse.benefits_hub) + getBankingBenefitsHubResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetBankingBenefitsHubResponse getBankingBenefitsHubResponse = (GetBankingBenefitsHubResponse) obj;
        getBankingBenefitsHubResponse.getClass();
        BenefitsHub benefitsHub = getBankingBenefitsHubResponse.benefits_hub;
        BenefitsHub benefitsHub2 = benefitsHub != null ? (BenefitsHub) BenefitsHub.ADAPTER.redact(benefitsHub) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetBankingBenefitsHubResponse(benefitsHub2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetBankingBenefitsHubResponse getBankingBenefitsHubResponse = (GetBankingBenefitsHubResponse) obj;
        getBankingBenefitsHubResponse.getClass();
        BenefitsHub.ADAPTER.encodeWithTag(protoWriter, 1, getBankingBenefitsHubResponse.benefits_hub);
        protoWriter.writeBytes(getBankingBenefitsHubResponse.unknownFields());
    }
}
