package com.squareup.cash.cashreactions.common.v1;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class AvailableReactions$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AvailableReactions(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AvailableReactions availableReactions = (AvailableReactions) obj;
        reverseProtoWriter.getClass();
        availableReactions.getClass();
        reverseProtoWriter.writeBytes(availableReactions.unknownFields());
        ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 1, availableReactions.emoji);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AvailableReactions availableReactions = (AvailableReactions) obj;
        availableReactions.getClass();
        return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, availableReactions.emoji) + availableReactions.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AvailableReactions availableReactions = (AvailableReactions) obj;
        availableReactions.getClass();
        ByteString byteString = ByteString.EMPTY;
        List list = availableReactions.emoji;
        list.getClass();
        byteString.getClass();
        return new AvailableReactions(list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AvailableReactions availableReactions = (AvailableReactions) obj;
        availableReactions.getClass();
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, availableReactions.emoji);
        protoWriter.writeBytes(availableReactions.unknownFields());
    }
}
