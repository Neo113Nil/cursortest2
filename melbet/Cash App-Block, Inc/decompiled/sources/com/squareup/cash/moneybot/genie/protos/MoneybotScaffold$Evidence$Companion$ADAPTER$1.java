package com.squareup.cash.moneybot.genie.protos;

import com.squareup.cash.moneybot.genie.protos.MoneybotScaffold;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class MoneybotScaffold$Evidence$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MoneybotScaffold.Evidence((MoneybotScaffold.Evidence.Breakdown) obj, (MoneybotScaffold.Evidence.MerchantCard) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = MoneybotScaffold.Evidence.Breakdown.ADAPTER.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = MoneybotScaffold.Evidence.MerchantCard.ADAPTER.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MoneybotScaffold.Evidence evidence = (MoneybotScaffold.Evidence) obj;
        reverseProtoWriter.getClass();
        evidence.getClass();
        reverseProtoWriter.writeBytes(evidence.unknownFields());
        MoneybotScaffold.Evidence.MerchantCard.ADAPTER.encodeWithTag(reverseProtoWriter, 2, evidence.merchant_card);
        MoneybotScaffold.Evidence.Breakdown.ADAPTER.encodeWithTag(reverseProtoWriter, 1, evidence.breakdown);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MoneybotScaffold.Evidence evidence = (MoneybotScaffold.Evidence) obj;
        evidence.getClass();
        return MoneybotScaffold.Evidence.MerchantCard.ADAPTER.encodedSizeWithTag(2, evidence.merchant_card) + MoneybotScaffold.Evidence.Breakdown.ADAPTER.encodedSizeWithTag(1, evidence.breakdown) + evidence.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MoneybotScaffold.Evidence evidence = (MoneybotScaffold.Evidence) obj;
        evidence.getClass();
        MoneybotScaffold.Evidence.Breakdown breakdown = evidence.breakdown;
        MoneybotScaffold.Evidence.Breakdown breakdown2 = breakdown != null ? (MoneybotScaffold.Evidence.Breakdown) MoneybotScaffold.Evidence.Breakdown.ADAPTER.redact(breakdown) : null;
        MoneybotScaffold.Evidence.MerchantCard merchantCard = evidence.merchant_card;
        MoneybotScaffold.Evidence.MerchantCard merchantCard2 = merchantCard != null ? (MoneybotScaffold.Evidence.MerchantCard) MoneybotScaffold.Evidence.MerchantCard.ADAPTER.redact(merchantCard) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new MoneybotScaffold.Evidence(breakdown2, merchantCard2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MoneybotScaffold.Evidence evidence = (MoneybotScaffold.Evidence) obj;
        evidence.getClass();
        MoneybotScaffold.Evidence.Breakdown.ADAPTER.encodeWithTag(protoWriter, 1, evidence.breakdown);
        MoneybotScaffold.Evidence.MerchantCard.ADAPTER.encodeWithTag(protoWriter, 2, evidence.merchant_card);
        protoWriter.writeBytes(evidence.unknownFields());
    }
}
