package com.squareup.cash.idv;

import androidx.room.TransactorKt;
import com.squareup.cash.idv.ProfilePageUpsellComponentV2;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class ProfilePageUpsellComponentV2$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ProfilePageUpsellComponentV2((ProfilePageUpsellComponentV2.Icon) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (ProfilePageUpsellComponentV2.IconV2) obj6, (LocalizableString) obj7, (LocalizableString) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = ProfilePageUpsellComponentV2.Icon.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    try {
                        obj6 = ProfilePageUpsellComponentV2.IconV2.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj7);
                    break;
                case 8:
                    obj8 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj8);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ProfilePageUpsellComponentV2 profilePageUpsellComponentV2 = (ProfilePageUpsellComponentV2) obj;
        reverseProtoWriter.getClass();
        profilePageUpsellComponentV2.getClass();
        reverseProtoWriter.writeBytes(profilePageUpsellComponentV2.unknownFields());
        ProtoAdapter protoAdapter = LocalizableString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, profilePageUpsellComponentV2.localizable_subtext);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, profilePageUpsellComponentV2.localizable_header_text);
        ProfilePageUpsellComponentV2.IconV2.ADAPTER.encodeWithTag(reverseProtoWriter, 6, profilePageUpsellComponentV2.icon_v2);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, profilePageUpsellComponentV2.entity_id);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, profilePageUpsellComponentV2.url_on_press);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, profilePageUpsellComponentV2.subtext);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, profilePageUpsellComponentV2.header_text);
        ProfilePageUpsellComponentV2.Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 1, profilePageUpsellComponentV2.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ProfilePageUpsellComponentV2 profilePageUpsellComponentV2 = (ProfilePageUpsellComponentV2) obj;
        profilePageUpsellComponentV2.getClass();
        int encodedSizeWithTag = ProfilePageUpsellComponentV2.Icon.ADAPTER.encodedSizeWithTag(1, profilePageUpsellComponentV2.icon) + profilePageUpsellComponentV2.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = ProfilePageUpsellComponentV2.IconV2.ADAPTER.encodedSizeWithTag(6, profilePageUpsellComponentV2.icon_v2) + protoAdapter.encodedSizeWithTag(5, profilePageUpsellComponentV2.entity_id) + protoAdapter.encodedSizeWithTag(4, profilePageUpsellComponentV2.url_on_press) + protoAdapter.encodedSizeWithTag(3, profilePageUpsellComponentV2.subtext) + protoAdapter.encodedSizeWithTag(2, profilePageUpsellComponentV2.header_text) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(8, profilePageUpsellComponentV2.localizable_subtext) + protoAdapter2.encodedSizeWithTag(7, profilePageUpsellComponentV2.localizable_header_text) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ProfilePageUpsellComponentV2 profilePageUpsellComponentV2 = (ProfilePageUpsellComponentV2) obj;
        profilePageUpsellComponentV2.getClass();
        LocalizableString localizableString = profilePageUpsellComponentV2.localizable_header_text;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        LocalizableString localizableString3 = profilePageUpsellComponentV2.localizable_subtext;
        LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
        ByteString byteString = ByteString.EMPTY;
        ProfilePageUpsellComponentV2.Icon icon = profilePageUpsellComponentV2.icon;
        String str = profilePageUpsellComponentV2.header_text;
        String str2 = profilePageUpsellComponentV2.subtext;
        String str3 = profilePageUpsellComponentV2.url_on_press;
        String str4 = profilePageUpsellComponentV2.entity_id;
        ProfilePageUpsellComponentV2.IconV2 iconV2 = profilePageUpsellComponentV2.icon_v2;
        byteString.getClass();
        return new ProfilePageUpsellComponentV2(icon, str, str2, str3, str4, iconV2, localizableString2, localizableString4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ProfilePageUpsellComponentV2 profilePageUpsellComponentV2 = (ProfilePageUpsellComponentV2) obj;
        profilePageUpsellComponentV2.getClass();
        ProfilePageUpsellComponentV2.Icon.ADAPTER.encodeWithTag(protoWriter, 1, profilePageUpsellComponentV2.icon);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, profilePageUpsellComponentV2.header_text);
        protoAdapter.encodeWithTag(protoWriter, 3, profilePageUpsellComponentV2.subtext);
        protoAdapter.encodeWithTag(protoWriter, 4, profilePageUpsellComponentV2.url_on_press);
        protoAdapter.encodeWithTag(protoWriter, 5, profilePageUpsellComponentV2.entity_id);
        ProfilePageUpsellComponentV2.IconV2.ADAPTER.encodeWithTag(protoWriter, 6, profilePageUpsellComponentV2.icon_v2);
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 7, profilePageUpsellComponentV2.localizable_header_text);
        protoAdapter2.encodeWithTag(protoWriter, 8, profilePageUpsellComponentV2.localizable_subtext);
        protoWriter.writeBytes(profilePageUpsellComponentV2.unknownFields());
    }
}
