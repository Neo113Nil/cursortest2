package com.squareup.cash.lynx.api.v1_0.model;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.bankinfo.api.Bank$DisplaySettings;
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
public final class BankinfoDetails$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new BankinfoDetails((String) obj, (String) obj2, (Country) obj3, (Bank$DisplaySettings) obj4, (String) obj5, m, (CardDetailsProto$DisplaySettings) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                    obj4 = TransactorKt.decodeMessageOrMerge(Bank$DisplaySettings.ADAPTER, protoReader, obj4);
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
        BankinfoDetails bankinfoDetails = (BankinfoDetails) obj;
        reverseProtoWriter.getClass();
        bankinfoDetails.getClass();
        reverseProtoWriter.writeBytes(bankinfoDetails.unknownFields());
        CardDetailsProto$DisplaySettings.ADAPTER.encodeWithTag(reverseProtoWriter, 7, bankinfoDetails.card_display_settings);
        NavigationUrl.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, bankinfoDetails.navigation_urls);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, bankinfoDetails.bank_token);
        Bank$DisplaySettings.ADAPTER.encodeWithTag(reverseProtoWriter, 4, bankinfoDetails.display_settings);
        Country.ADAPTER.encodeWithTag(reverseProtoWriter, 3, bankinfoDetails.country);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, bankinfoDetails.short_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, bankinfoDetails.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BankinfoDetails bankinfoDetails = (BankinfoDetails) obj;
        bankinfoDetails.getClass();
        int size$okio = bankinfoDetails.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return CardDetailsProto$DisplaySettings.ADAPTER.encodedSizeWithTag(7, bankinfoDetails.card_display_settings) + NavigationUrl.ADAPTER.asRepeated().encodedSizeWithTag(6, bankinfoDetails.navigation_urls) + protoAdapter.encodedSizeWithTag(5, bankinfoDetails.bank_token) + Bank$DisplaySettings.ADAPTER.encodedSizeWithTag(4, bankinfoDetails.display_settings) + Country.ADAPTER.encodedSizeWithTag(3, bankinfoDetails.country) + protoAdapter.encodedSizeWithTag(2, bankinfoDetails.short_name) + protoAdapter.encodedSizeWithTag(1, bankinfoDetails.name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BankinfoDetails bankinfoDetails = (BankinfoDetails) obj;
        bankinfoDetails.getClass();
        Bank$DisplaySettings bank$DisplaySettings = bankinfoDetails.display_settings;
        Bank$DisplaySettings bank$DisplaySettings2 = bank$DisplaySettings != null ? (Bank$DisplaySettings) Bank$DisplaySettings.ADAPTER.redact(bank$DisplaySettings) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(bankinfoDetails.navigation_urls, NavigationUrl.ADAPTER);
        CardDetailsProto$DisplaySettings cardDetailsProto$DisplaySettings = bankinfoDetails.card_display_settings;
        CardDetailsProto$DisplaySettings cardDetailsProto$DisplaySettings2 = cardDetailsProto$DisplaySettings != null ? (CardDetailsProto$DisplaySettings) CardDetailsProto$DisplaySettings.ADAPTER.redact(cardDetailsProto$DisplaySettings) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = bankinfoDetails.name;
        String str2 = bankinfoDetails.short_name;
        Country country = bankinfoDetails.country;
        String str3 = bankinfoDetails.bank_token;
        byteString.getClass();
        return new BankinfoDetails(str, str2, country, bank$DisplaySettings2, str3, m1169redactElements, cardDetailsProto$DisplaySettings2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BankinfoDetails bankinfoDetails = (BankinfoDetails) obj;
        bankinfoDetails.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, bankinfoDetails.name);
        protoAdapter.encodeWithTag(protoWriter, 2, bankinfoDetails.short_name);
        Country.ADAPTER.encodeWithTag(protoWriter, 3, bankinfoDetails.country);
        Bank$DisplaySettings.ADAPTER.encodeWithTag(protoWriter, 4, bankinfoDetails.display_settings);
        protoAdapter.encodeWithTag(protoWriter, 5, bankinfoDetails.bank_token);
        NavigationUrl.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, bankinfoDetails.navigation_urls);
        CardDetailsProto$DisplaySettings.ADAPTER.encodeWithTag(protoWriter, 7, bankinfoDetails.card_display_settings);
        protoWriter.writeBytes(bankinfoDetails.unknownFields());
    }
}
