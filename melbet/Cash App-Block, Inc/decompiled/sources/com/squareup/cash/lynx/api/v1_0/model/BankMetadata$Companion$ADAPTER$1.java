package com.squareup.cash.lynx.api.v1_0.model;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.lynx.api.v1_0.model.BankMetadata;
import com.squareup.protos.cash.cashinstrumentstore.api.v1.cards.common.CardDetailsProto$DisplaySettings;
import com.squareup.protos.cash.cashinstrumentstore.api.v1.cards.common.NavigationUrl;
import com.squareup.protos.common.countries.Country;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class BankMetadata$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BankMetadata((String) obj, (String) obj2, (Country) obj3, (BankMetadata.DisplaySettings) obj4, (String) obj5, m, (CardDetailsProto$DisplaySettings) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    try {
                        obj3 = Country.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(BankMetadata.DisplaySettings.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    m.add(NavigationUrl.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    obj6 = TransactorKt.decodeMessageOrMerge(CardDetailsProto$DisplaySettings.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BankMetadata bankMetadata = (BankMetadata) obj;
        reverseProtoWriter.getClass();
        bankMetadata.getClass();
        reverseProtoWriter.writeBytes(bankMetadata.unknownFields());
        CardDetailsProto$DisplaySettings.ADAPTER.encodeWithTag(reverseProtoWriter, 7, bankMetadata.card_display_settings);
        NavigationUrl.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, bankMetadata.navigation_urls);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, bankMetadata.bank_token);
        BankMetadata.DisplaySettings.ADAPTER.encodeWithTag(reverseProtoWriter, 4, bankMetadata.display_settings);
        Country.ADAPTER.encodeWithTag(reverseProtoWriter, 3, bankMetadata.country);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, bankMetadata.short_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, bankMetadata.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BankMetadata bankMetadata = (BankMetadata) obj;
        bankMetadata.getClass();
        int size$okio = bankMetadata.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return CardDetailsProto$DisplaySettings.ADAPTER.encodedSizeWithTag(7, bankMetadata.card_display_settings) + NavigationUrl.ADAPTER.asRepeated().encodedSizeWithTag(6, bankMetadata.navigation_urls) + protoAdapter.encodedSizeWithTag(5, bankMetadata.bank_token) + BankMetadata.DisplaySettings.ADAPTER.encodedSizeWithTag(4, bankMetadata.display_settings) + Country.ADAPTER.encodedSizeWithTag(3, bankMetadata.country) + protoAdapter.encodedSizeWithTag(2, bankMetadata.short_name) + protoAdapter.encodedSizeWithTag(1, bankMetadata.name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BankMetadata bankMetadata = (BankMetadata) obj;
        bankMetadata.getClass();
        BankMetadata.DisplaySettings displaySettings = bankMetadata.display_settings;
        BankMetadata.DisplaySettings displaySettings2 = displaySettings != null ? (BankMetadata.DisplaySettings) BankMetadata.DisplaySettings.ADAPTER.redact(displaySettings) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(bankMetadata.navigation_urls, NavigationUrl.ADAPTER);
        CardDetailsProto$DisplaySettings cardDetailsProto$DisplaySettings = bankMetadata.card_display_settings;
        CardDetailsProto$DisplaySettings cardDetailsProto$DisplaySettings2 = cardDetailsProto$DisplaySettings != null ? (CardDetailsProto$DisplaySettings) CardDetailsProto$DisplaySettings.ADAPTER.redact(cardDetailsProto$DisplaySettings) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = bankMetadata.name;
        String str2 = bankMetadata.short_name;
        Country country = bankMetadata.country;
        String str3 = bankMetadata.bank_token;
        byteString.getClass();
        return new BankMetadata(str, str2, country, displaySettings2, str3, m1169redactElements, cardDetailsProto$DisplaySettings2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BankMetadata bankMetadata = (BankMetadata) obj;
        bankMetadata.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, bankMetadata.name);
        protoAdapter.encodeWithTag(protoWriter, 2, bankMetadata.short_name);
        Country.ADAPTER.encodeWithTag(protoWriter, 3, bankMetadata.country);
        BankMetadata.DisplaySettings.ADAPTER.encodeWithTag(protoWriter, 4, bankMetadata.display_settings);
        protoAdapter.encodeWithTag(protoWriter, 5, bankMetadata.bank_token);
        NavigationUrl.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, bankMetadata.navigation_urls);
        CardDetailsProto$DisplaySettings.ADAPTER.encodeWithTag(protoWriter, 7, bankMetadata.card_display_settings);
        protoWriter.writeBytes(bankMetadata.unknownFields());
    }
}
