package com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app;

import androidx.room.TransactorKt;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class MobilePlanHome$InfoCards$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MobilePlanHome.InfoCards((MobilePlanHome.InfoCard) obj, (MobilePlanHome.InfoCard) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(MobilePlanHome.InfoCard.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(MobilePlanHome.InfoCard.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MobilePlanHome.InfoCards infoCards = (MobilePlanHome.InfoCards) obj;
        reverseProtoWriter.getClass();
        infoCards.getClass();
        reverseProtoWriter.writeBytes(infoCards.unknownFields());
        ProtoAdapter protoAdapter = MobilePlanHome.InfoCard.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, infoCards.second);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, infoCards.first);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MobilePlanHome.InfoCards infoCards = (MobilePlanHome.InfoCards) obj;
        infoCards.getClass();
        int size$okio = infoCards.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = MobilePlanHome.InfoCard.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, infoCards.second) + protoAdapter.encodedSizeWithTag(1, infoCards.first) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MobilePlanHome.InfoCards infoCards = (MobilePlanHome.InfoCards) obj;
        infoCards.getClass();
        MobilePlanHome.InfoCard infoCard = infoCards.first;
        MobilePlanHome.InfoCard infoCard2 = infoCard != null ? (MobilePlanHome.InfoCard) MobilePlanHome.InfoCard.ADAPTER.redact(infoCard) : null;
        MobilePlanHome.InfoCard infoCard3 = infoCards.second;
        MobilePlanHome.InfoCard infoCard4 = infoCard3 != null ? (MobilePlanHome.InfoCard) MobilePlanHome.InfoCard.ADAPTER.redact(infoCard3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new MobilePlanHome.InfoCards(infoCard2, infoCard4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MobilePlanHome.InfoCards infoCards = (MobilePlanHome.InfoCards) obj;
        infoCards.getClass();
        ProtoAdapter protoAdapter = MobilePlanHome.InfoCard.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, infoCards.first);
        protoAdapter.encodeWithTag(protoWriter, 2, infoCards.second);
        protoWriter.writeBytes(infoCards.unknownFields());
    }
}
