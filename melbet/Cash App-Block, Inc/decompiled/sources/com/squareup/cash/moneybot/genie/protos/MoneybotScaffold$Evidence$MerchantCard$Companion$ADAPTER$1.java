package com.squareup.cash.moneybot.genie.protos;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.MoneybotScaffold;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class MoneybotScaffold$Evidence$MerchantCard$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = MoneybotScaffold.Evidence.MerchantCard.Summary.ADAPTER.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(MoneybotScaffold.Evidence.MerchantCard.Transaction.ADAPTER.decode(protoReader));
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        MoneybotScaffold.Evidence.MerchantCard.Summary summary = (MoneybotScaffold.Evidence.MerchantCard.Summary) obj;
        if (summary != null) {
            return new MoneybotScaffold.Evidence.MerchantCard(summary, m, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "summary");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MoneybotScaffold.Evidence.MerchantCard merchantCard = (MoneybotScaffold.Evidence.MerchantCard) obj;
        reverseProtoWriter.getClass();
        merchantCard.getClass();
        reverseProtoWriter.writeBytes(merchantCard.unknownFields());
        MoneybotScaffold.Evidence.MerchantCard.Transaction.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, merchantCard.transactions);
        MoneybotScaffold.Evidence.MerchantCard.Summary.ADAPTER.encodeWithTag(reverseProtoWriter, 1, merchantCard.summary);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MoneybotScaffold.Evidence.MerchantCard merchantCard = (MoneybotScaffold.Evidence.MerchantCard) obj;
        merchantCard.getClass();
        return MoneybotScaffold.Evidence.MerchantCard.Transaction.ADAPTER.asRepeated().encodedSizeWithTag(2, merchantCard.transactions) + MoneybotScaffold.Evidence.MerchantCard.Summary.ADAPTER.encodedSizeWithTag(1, merchantCard.summary) + merchantCard.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MoneybotScaffold.Evidence.MerchantCard merchantCard = (MoneybotScaffold.Evidence.MerchantCard) obj;
        merchantCard.getClass();
        MoneybotScaffold.Evidence.MerchantCard.Summary summary = (MoneybotScaffold.Evidence.MerchantCard.Summary) MoneybotScaffold.Evidence.MerchantCard.Summary.ADAPTER.redact(merchantCard.summary);
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(merchantCard.transactions, MoneybotScaffold.Evidence.MerchantCard.Transaction.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        summary.getClass();
        byteString.getClass();
        return new MoneybotScaffold.Evidence.MerchantCard(summary, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MoneybotScaffold.Evidence.MerchantCard merchantCard = (MoneybotScaffold.Evidence.MerchantCard) obj;
        merchantCard.getClass();
        MoneybotScaffold.Evidence.MerchantCard.Summary.ADAPTER.encodeWithTag(protoWriter, 1, merchantCard.summary);
        MoneybotScaffold.Evidence.MerchantCard.Transaction.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, merchantCard.transactions);
        protoWriter.writeBytes(merchantCard.unknownFields());
    }
}
