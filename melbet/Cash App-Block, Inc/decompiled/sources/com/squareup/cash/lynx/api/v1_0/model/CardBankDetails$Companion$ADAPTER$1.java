package com.squareup.cash.lynx.api.v1_0.model;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class CardBankDetails$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardBankDetails((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardBankDetails cardBankDetails = (CardBankDetails) obj;
        reverseProtoWriter.getClass();
        cardBankDetails.getClass();
        reverseProtoWriter.writeBytes(cardBankDetails.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, cardBankDetails.tab_selection_icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, cardBankDetails.tab_detail_icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, cardBankDetails.tab_card_icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cardBankDetails.short_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cardBankDetails.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardBankDetails cardBankDetails = (CardBankDetails) obj;
        cardBankDetails.getClass();
        int size$okio = cardBankDetails.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, cardBankDetails.tab_selection_icon_url) + protoAdapter.encodedSizeWithTag(4, cardBankDetails.tab_detail_icon_url) + protoAdapter.encodedSizeWithTag(3, cardBankDetails.tab_card_icon_url) + protoAdapter.encodedSizeWithTag(2, cardBankDetails.short_name) + protoAdapter.encodedSizeWithTag(1, cardBankDetails.name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardBankDetails cardBankDetails = (CardBankDetails) obj;
        cardBankDetails.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = cardBankDetails.name;
        String str2 = cardBankDetails.short_name;
        String str3 = cardBankDetails.tab_card_icon_url;
        String str4 = cardBankDetails.tab_detail_icon_url;
        String str5 = cardBankDetails.tab_selection_icon_url;
        byteString.getClass();
        return new CardBankDetails(str, str2, str3, str4, str5, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardBankDetails cardBankDetails = (CardBankDetails) obj;
        cardBankDetails.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, cardBankDetails.name);
        protoAdapter.encodeWithTag(protoWriter, 2, cardBankDetails.short_name);
        protoAdapter.encodeWithTag(protoWriter, 3, cardBankDetails.tab_card_icon_url);
        protoAdapter.encodeWithTag(protoWriter, 4, cardBankDetails.tab_detail_icon_url);
        protoAdapter.encodeWithTag(protoWriter, 5, cardBankDetails.tab_selection_icon_url);
        protoWriter.writeBytes(cardBankDetails.unknownFields());
    }
}
