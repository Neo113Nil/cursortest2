package com.squareup.cash.bankingbenefits.api.v1_0.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsForBookletResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class GetBankingBenefitsForBookletResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetBankingBenefitsForBookletResponse(m, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(GetBankingBenefitsForBookletResponse.Benefit.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetBankingBenefitsForBookletResponse getBankingBenefitsForBookletResponse = (GetBankingBenefitsForBookletResponse) obj;
        reverseProtoWriter.getClass();
        getBankingBenefitsForBookletResponse.getClass();
        reverseProtoWriter.writeBytes(getBankingBenefitsForBookletResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, getBankingBenefitsForBookletResponse.disclosures_text);
        GetBankingBenefitsForBookletResponse.Benefit.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getBankingBenefitsForBookletResponse.benefits);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetBankingBenefitsForBookletResponse getBankingBenefitsForBookletResponse = (GetBankingBenefitsForBookletResponse) obj;
        getBankingBenefitsForBookletResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, getBankingBenefitsForBookletResponse.disclosures_text) + GetBankingBenefitsForBookletResponse.Benefit.ADAPTER.asRepeated().encodedSizeWithTag(1, getBankingBenefitsForBookletResponse.benefits) + getBankingBenefitsForBookletResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetBankingBenefitsForBookletResponse getBankingBenefitsForBookletResponse = (GetBankingBenefitsForBookletResponse) obj;
        getBankingBenefitsForBookletResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getBankingBenefitsForBookletResponse.benefits, GetBankingBenefitsForBookletResponse.Benefit.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = getBankingBenefitsForBookletResponse.disclosures_text;
        byteString.getClass();
        return new GetBankingBenefitsForBookletResponse(m1169redactElements, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetBankingBenefitsForBookletResponse getBankingBenefitsForBookletResponse = (GetBankingBenefitsForBookletResponse) obj;
        getBankingBenefitsForBookletResponse.getClass();
        GetBankingBenefitsForBookletResponse.Benefit.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getBankingBenefitsForBookletResponse.benefits);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getBankingBenefitsForBookletResponse.disclosures_text);
        protoWriter.writeBytes(getBankingBenefitsForBookletResponse.unknownFields());
    }
}
