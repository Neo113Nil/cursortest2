package com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class TintedLink$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TintedLink((String) obj, (Color) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TintedLink tintedLink = (TintedLink) obj;
        reverseProtoWriter.getClass();
        tintedLink.getClass();
        reverseProtoWriter.writeBytes(tintedLink.unknownFields());
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 2, tintedLink.tint_color);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, tintedLink.link_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TintedLink tintedLink = (TintedLink) obj;
        tintedLink.getClass();
        return Color.ADAPTER.encodedSizeWithTag(2, tintedLink.tint_color) + ProtoAdapter.STRING.encodedSizeWithTag(1, tintedLink.link_text) + tintedLink.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TintedLink tintedLink = (TintedLink) obj;
        tintedLink.getClass();
        Color color = tintedLink.tint_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = tintedLink.link_text;
        byteString.getClass();
        return new TintedLink(str, color2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TintedLink tintedLink = (TintedLink) obj;
        tintedLink.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, tintedLink.link_text);
        Color.ADAPTER.encodeWithTag(protoWriter, 2, tintedLink.tint_color);
        protoWriter.writeBytes(tintedLink.unknownFields());
    }
}
