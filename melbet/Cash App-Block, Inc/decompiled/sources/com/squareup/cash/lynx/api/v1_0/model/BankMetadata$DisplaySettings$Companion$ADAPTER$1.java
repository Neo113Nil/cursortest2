package com.squareup.cash.lynx.api.v1_0.model;

import androidx.room.TransactorKt;
import com.squareup.cash.lynx.api.v1_0.model.BankMetadata;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class BankMetadata$DisplaySettings$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj9 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BankMetadata.DisplaySettings((BankMetadata.DisplaySettings.Theme) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (String) obj7, (String) obj8, (String) obj9, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(BankMetadata.DisplaySettings.Theme.ADAPTER, protoReader, obj);
                    break;
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
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    obj9 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BankMetadata.DisplaySettings displaySettings = (BankMetadata.DisplaySettings) obj;
        reverseProtoWriter.getClass();
        displaySettings.getClass();
        reverseProtoWriter.writeBytes(displaySettings.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, displaySettings.banner_icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, displaySettings.tab_selection_icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, displaySettings.selection_icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, displaySettings.tab_detail_icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, displaySettings.detail_icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, displaySettings.tab_card_icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, displaySettings.color_card_icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, displaySettings.monochrome_card_icon_url);
        BankMetadata.DisplaySettings.Theme.ADAPTER.encodeWithTag(reverseProtoWriter, 1, displaySettings.display_theme);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BankMetadata.DisplaySettings displaySettings = (BankMetadata.DisplaySettings) obj;
        displaySettings.getClass();
        int encodedSizeWithTag = BankMetadata.DisplaySettings.Theme.ADAPTER.encodedSizeWithTag(1, displaySettings.display_theme) + displaySettings.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(9, displaySettings.banner_icon_url) + protoAdapter.encodedSizeWithTag(8, displaySettings.tab_selection_icon_url) + protoAdapter.encodedSizeWithTag(7, displaySettings.selection_icon_url) + protoAdapter.encodedSizeWithTag(6, displaySettings.tab_detail_icon_url) + protoAdapter.encodedSizeWithTag(5, displaySettings.detail_icon_url) + protoAdapter.encodedSizeWithTag(4, displaySettings.tab_card_icon_url) + protoAdapter.encodedSizeWithTag(3, displaySettings.color_card_icon_url) + protoAdapter.encodedSizeWithTag(2, displaySettings.monochrome_card_icon_url) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BankMetadata.DisplaySettings displaySettings = (BankMetadata.DisplaySettings) obj;
        displaySettings.getClass();
        BankMetadata.DisplaySettings.Theme theme = displaySettings.display_theme;
        BankMetadata.DisplaySettings.Theme theme2 = theme != null ? (BankMetadata.DisplaySettings.Theme) BankMetadata.DisplaySettings.Theme.ADAPTER.redact(theme) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = displaySettings.monochrome_card_icon_url;
        String str2 = displaySettings.color_card_icon_url;
        String str3 = displaySettings.tab_card_icon_url;
        String str4 = displaySettings.detail_icon_url;
        String str5 = displaySettings.tab_detail_icon_url;
        String str6 = displaySettings.selection_icon_url;
        String str7 = displaySettings.tab_selection_icon_url;
        String str8 = displaySettings.banner_icon_url;
        byteString.getClass();
        return new BankMetadata.DisplaySettings(theme2, str, str2, str3, str4, str5, str6, str7, str8, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BankMetadata.DisplaySettings displaySettings = (BankMetadata.DisplaySettings) obj;
        displaySettings.getClass();
        BankMetadata.DisplaySettings.Theme.ADAPTER.encodeWithTag(protoWriter, 1, displaySettings.display_theme);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, displaySettings.monochrome_card_icon_url);
        protoAdapter.encodeWithTag(protoWriter, 3, displaySettings.color_card_icon_url);
        protoAdapter.encodeWithTag(protoWriter, 4, displaySettings.tab_card_icon_url);
        protoAdapter.encodeWithTag(protoWriter, 5, displaySettings.detail_icon_url);
        protoAdapter.encodeWithTag(protoWriter, 6, displaySettings.tab_detail_icon_url);
        protoAdapter.encodeWithTag(protoWriter, 7, displaySettings.selection_icon_url);
        protoAdapter.encodeWithTag(protoWriter, 8, displaySettings.tab_selection_icon_url);
        protoAdapter.encodeWithTag(protoWriter, 9, displaySettings.banner_icon_url);
        protoWriter.writeBytes(displaySettings.unknownFields());
    }
}
