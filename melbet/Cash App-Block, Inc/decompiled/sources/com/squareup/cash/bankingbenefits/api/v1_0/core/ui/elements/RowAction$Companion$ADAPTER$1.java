package com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements;

import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.RowAction;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class RowAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        RowAction$Action_$ClientRoute rowAction$Action_$ClientRoute = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RowAction((String) obj, rowAction$Action_$ClientRoute, (RowAction.ID) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                rowAction$Action_$ClientRoute = new RowAction$Action_$ClientRoute((String) ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = RowAction.ID.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RowAction rowAction = (RowAction) obj;
        reverseProtoWriter.getClass();
        rowAction.getClass();
        reverseProtoWriter.writeBytes(rowAction.unknownFields());
        RowAction$Action_$ClientRoute rowAction$Action_$ClientRoute = rowAction.Action;
        if (rowAction$Action_$ClientRoute != null) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, rowAction$Action_$ClientRoute.value);
        } else if (rowAction$Action_$ClientRoute != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        RowAction.ID.ADAPTER.encodeWithTag(reverseProtoWriter, 3, rowAction.id);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, rowAction.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RowAction rowAction = (RowAction) obj;
        rowAction.getClass();
        int size$okio = rowAction.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, rowAction.text) + size$okio;
        RowAction$Action_$ClientRoute rowAction$Action_$ClientRoute = rowAction.Action;
        if (rowAction$Action_$ClientRoute != null) {
            encodedSizeWithTag += protoAdapter.encodedSizeWithTag(2, rowAction$Action_$ClientRoute.value);
        } else if (rowAction$Action_$ClientRoute != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }
        return RowAction.ID.ADAPTER.encodedSizeWithTag(3, rowAction.id) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RowAction rowAction = (RowAction) obj;
        rowAction.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = rowAction.text;
        RowAction$Action_$ClientRoute rowAction$Action_$ClientRoute = rowAction.Action;
        RowAction.ID id = rowAction.id;
        byteString.getClass();
        return new RowAction(str, rowAction$Action_$ClientRoute, id, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RowAction rowAction = (RowAction) obj;
        rowAction.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, rowAction.text);
        RowAction.ID.ADAPTER.encodeWithTag(protoWriter, 3, rowAction.id);
        RowAction$Action_$ClientRoute rowAction$Action_$ClientRoute = rowAction.Action;
        if (rowAction$Action_$ClientRoute != null) {
            protoAdapter.encodeWithTag(protoWriter, 2, rowAction$Action_$ClientRoute.value);
        } else if (rowAction$Action_$ClientRoute != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(rowAction.unknownFields());
    }
}
