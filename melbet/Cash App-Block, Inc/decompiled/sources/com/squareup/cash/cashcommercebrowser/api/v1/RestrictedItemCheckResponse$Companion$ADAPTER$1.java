package com.squareup.cash.cashcommercebrowser.api.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class RestrictedItemCheckResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RestrictedItemCheckResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(BlockedItem.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RestrictedItemCheckResponse restrictedItemCheckResponse = (RestrictedItemCheckResponse) obj;
        reverseProtoWriter.getClass();
        restrictedItemCheckResponse.getClass();
        reverseProtoWriter.writeBytes(restrictedItemCheckResponse.unknownFields());
        BlockedItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, restrictedItemCheckResponse.blocked_items);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RestrictedItemCheckResponse restrictedItemCheckResponse = (RestrictedItemCheckResponse) obj;
        restrictedItemCheckResponse.getClass();
        return BlockedItem.ADAPTER.asRepeated().encodedSizeWithTag(1, restrictedItemCheckResponse.blocked_items) + restrictedItemCheckResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RestrictedItemCheckResponse restrictedItemCheckResponse = (RestrictedItemCheckResponse) obj;
        restrictedItemCheckResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(restrictedItemCheckResponse.blocked_items, BlockedItem.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RestrictedItemCheckResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RestrictedItemCheckResponse restrictedItemCheckResponse = (RestrictedItemCheckResponse) obj;
        restrictedItemCheckResponse.getClass();
        BlockedItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, restrictedItemCheckResponse.blocked_items);
        protoWriter.writeBytes(restrictedItemCheckResponse.unknownFields());
    }
}
