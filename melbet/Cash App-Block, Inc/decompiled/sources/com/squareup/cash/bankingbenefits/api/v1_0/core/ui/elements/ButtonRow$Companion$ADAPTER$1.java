package com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements;

import androidx.room.TransactorKt;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.ButtonRow;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class ButtonRow$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ButtonRow((String) obj, (ButtonRow.Prominence) obj2, (RowAction) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = ButtonRow.Prominence.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(RowAction.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ButtonRow buttonRow = (ButtonRow) obj;
        reverseProtoWriter.getClass();
        buttonRow.getClass();
        reverseProtoWriter.writeBytes(buttonRow.unknownFields());
        RowAction.ADAPTER.encodeWithTag(reverseProtoWriter, 3, buttonRow.row_action);
        ButtonRow.Prominence.ADAPTER.encodeWithTag(reverseProtoWriter, 2, buttonRow.prominence);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, buttonRow.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ButtonRow buttonRow = (ButtonRow) obj;
        buttonRow.getClass();
        return RowAction.ADAPTER.encodedSizeWithTag(3, buttonRow.row_action) + ButtonRow.Prominence.ADAPTER.encodedSizeWithTag(2, buttonRow.prominence) + ProtoAdapter.STRING.encodedSizeWithTag(1, buttonRow.text) + buttonRow.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ButtonRow buttonRow = (ButtonRow) obj;
        buttonRow.getClass();
        RowAction rowAction = buttonRow.row_action;
        RowAction rowAction2 = rowAction != null ? (RowAction) RowAction.ADAPTER.redact(rowAction) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = buttonRow.text;
        ButtonRow.Prominence prominence = buttonRow.prominence;
        byteString.getClass();
        return new ButtonRow(str, prominence, rowAction2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ButtonRow buttonRow = (ButtonRow) obj;
        buttonRow.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, buttonRow.text);
        ButtonRow.Prominence.ADAPTER.encodeWithTag(protoWriter, 2, buttonRow.prominence);
        RowAction.ADAPTER.encodeWithTag(protoWriter, 3, buttonRow.row_action);
        protoWriter.writeBytes(buttonRow.unknownFields());
    }
}
