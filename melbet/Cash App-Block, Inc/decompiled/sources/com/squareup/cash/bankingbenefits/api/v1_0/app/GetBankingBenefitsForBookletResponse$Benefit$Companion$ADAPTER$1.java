package com.squareup.cash.bankingbenefits.api.v1_0.app;

import com.squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsForBookletResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetBankingBenefitsForBookletResponse$Benefit$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GetBankingBenefitsForBookletResponse.Benefit((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetBankingBenefitsForBookletResponse.Benefit benefit = (GetBankingBenefitsForBookletResponse.Benefit) obj;
        reverseProtoWriter.getClass();
        benefit.getClass();
        reverseProtoWriter.writeBytes(benefit.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, benefit.icon_arcade_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, benefit.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, benefit.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetBankingBenefitsForBookletResponse.Benefit benefit = (GetBankingBenefitsForBookletResponse.Benefit) obj;
        benefit.getClass();
        int size$okio = benefit.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, benefit.icon_arcade_id) + protoAdapter.encodedSizeWithTag(2, benefit.subtitle) + protoAdapter.encodedSizeWithTag(1, benefit.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetBankingBenefitsForBookletResponse.Benefit benefit = (GetBankingBenefitsForBookletResponse.Benefit) obj;
        benefit.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = benefit.title;
        String str2 = benefit.subtitle;
        String str3 = benefit.icon_arcade_id;
        byteString.getClass();
        return new GetBankingBenefitsForBookletResponse.Benefit(str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetBankingBenefitsForBookletResponse.Benefit benefit = (GetBankingBenefitsForBookletResponse.Benefit) obj;
        benefit.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, benefit.title);
        protoAdapter.encodeWithTag(protoWriter, 2, benefit.subtitle);
        protoAdapter.encodeWithTag(protoWriter, 3, benefit.icon_arcade_id);
        protoWriter.writeBytes(benefit.unknownFields());
    }
}
