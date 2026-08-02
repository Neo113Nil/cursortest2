package com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class TextRow$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TextRow((TintedIcon) obj, (String) obj2, (String) obj3, (RowAction) obj4, (Boolean) obj5, (Boolean) obj6, (Boolean) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(TintedIcon.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(RowAction.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 7:
                    obj7 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TextRow textRow = (TextRow) obj;
        reverseProtoWriter.getClass();
        textRow.getClass();
        reverseProtoWriter.writeBytes(textRow.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, textRow.disabled);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, textRow.unavailable);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, textRow.inactive);
        RowAction.ADAPTER.encodeWithTag(reverseProtoWriter, 4, textRow.row_action);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, textRow.subtitle);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, textRow.title);
        TintedIcon.ADAPTER.encodeWithTag(reverseProtoWriter, 1, textRow.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TextRow textRow = (TextRow) obj;
        textRow.getClass();
        int encodedSizeWithTag = TintedIcon.ADAPTER.encodedSizeWithTag(1, textRow.icon) + textRow.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = RowAction.ADAPTER.encodedSizeWithTag(4, textRow.row_action) + protoAdapter.encodedSizeWithTag(3, textRow.subtitle) + protoAdapter.encodedSizeWithTag(2, textRow.title) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        return protoAdapter2.encodedSizeWithTag(7, textRow.disabled) + protoAdapter2.encodedSizeWithTag(6, textRow.unavailable) + protoAdapter2.encodedSizeWithTag(5, textRow.inactive) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TextRow textRow = (TextRow) obj;
        textRow.getClass();
        TintedIcon tintedIcon = textRow.icon;
        TintedIcon tintedIcon2 = tintedIcon != null ? (TintedIcon) TintedIcon.ADAPTER.redact(tintedIcon) : null;
        RowAction rowAction = textRow.row_action;
        RowAction rowAction2 = rowAction != null ? (RowAction) RowAction.ADAPTER.redact(rowAction) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = textRow.title;
        String str2 = textRow.subtitle;
        Boolean bool = textRow.inactive;
        Boolean bool2 = textRow.unavailable;
        Boolean bool3 = textRow.disabled;
        byteString.getClass();
        return new TextRow(tintedIcon2, str, str2, rowAction2, bool, bool2, bool3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TextRow textRow = (TextRow) obj;
        textRow.getClass();
        TintedIcon.ADAPTER.encodeWithTag(protoWriter, 1, textRow.icon);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, textRow.title);
        protoAdapter.encodeWithTag(protoWriter, 3, textRow.subtitle);
        RowAction.ADAPTER.encodeWithTag(protoWriter, 4, textRow.row_action);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 5, textRow.inactive);
        protoAdapter2.encodeWithTag(protoWriter, 6, textRow.unavailable);
        protoAdapter2.encodeWithTag(protoWriter, 7, textRow.disabled);
        protoWriter.writeBytes(textRow.unknownFields());
    }
}
