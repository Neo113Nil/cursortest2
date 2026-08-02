package com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class MobilePlanHome$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MobilePlanHome((MobilePlanHome.Header) obj, (MobilePlanHome.InfoCards) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(MobilePlanHome.Header.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(MobilePlanHome.InfoCards.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(MobilePlanHome.Link.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MobilePlanHome mobilePlanHome = (MobilePlanHome) obj;
        reverseProtoWriter.getClass();
        mobilePlanHome.getClass();
        reverseProtoWriter.writeBytes(mobilePlanHome.unknownFields());
        MobilePlanHome.Link.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, mobilePlanHome.links);
        MobilePlanHome.InfoCards.ADAPTER.encodeWithTag(reverseProtoWriter, 2, mobilePlanHome.info_cards);
        MobilePlanHome.Header.ADAPTER.encodeWithTag(reverseProtoWriter, 1, mobilePlanHome.header);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MobilePlanHome mobilePlanHome = (MobilePlanHome) obj;
        mobilePlanHome.getClass();
        return MobilePlanHome.Link.ADAPTER.asRepeated().encodedSizeWithTag(3, mobilePlanHome.links) + MobilePlanHome.InfoCards.ADAPTER.encodedSizeWithTag(2, mobilePlanHome.info_cards) + MobilePlanHome.Header.ADAPTER.encodedSizeWithTag(1, mobilePlanHome.header) + mobilePlanHome.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MobilePlanHome mobilePlanHome = (MobilePlanHome) obj;
        mobilePlanHome.getClass();
        MobilePlanHome.Header header = mobilePlanHome.header;
        MobilePlanHome.Header header2 = header != null ? (MobilePlanHome.Header) MobilePlanHome.Header.ADAPTER.redact(header) : null;
        MobilePlanHome.InfoCards infoCards = mobilePlanHome.info_cards;
        MobilePlanHome.InfoCards infoCards2 = infoCards != null ? (MobilePlanHome.InfoCards) MobilePlanHome.InfoCards.ADAPTER.redact(infoCards) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(mobilePlanHome.links, MobilePlanHome.Link.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new MobilePlanHome(header2, infoCards2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MobilePlanHome mobilePlanHome = (MobilePlanHome) obj;
        mobilePlanHome.getClass();
        MobilePlanHome.Header.ADAPTER.encodeWithTag(protoWriter, 1, mobilePlanHome.header);
        MobilePlanHome.InfoCards.ADAPTER.encodeWithTag(protoWriter, 2, mobilePlanHome.info_cards);
        MobilePlanHome.Link.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, mobilePlanHome.links);
        protoWriter.writeBytes(mobilePlanHome.unknownFields());
    }
}
