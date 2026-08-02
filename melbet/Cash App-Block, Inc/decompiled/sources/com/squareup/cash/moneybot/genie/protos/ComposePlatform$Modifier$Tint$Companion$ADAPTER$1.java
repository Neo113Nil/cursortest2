package com.squareup.cash.moneybot.genie.protos;

import androidx.room.TransactorKt;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class ComposePlatform$Modifier$Tint$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = ComposePlatform.Color.ADAPTER.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        ComposePlatform.Color color = (ComposePlatform.Color) obj;
        if (color != null) {
            return new ComposePlatform.Modifier.Tint(color, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "color");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ComposePlatform.Modifier.Tint tint = (ComposePlatform.Modifier.Tint) obj;
        reverseProtoWriter.getClass();
        tint.getClass();
        reverseProtoWriter.writeBytes(tint.unknownFields());
        ComposePlatform.Color.ADAPTER.encodeWithTag(reverseProtoWriter, 1, tint.color);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ComposePlatform.Modifier.Tint tint = (ComposePlatform.Modifier.Tint) obj;
        tint.getClass();
        return ComposePlatform.Color.ADAPTER.encodedSizeWithTag(1, tint.color) + tint.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ComposePlatform.Modifier.Tint tint = (ComposePlatform.Modifier.Tint) obj;
        tint.getClass();
        ComposePlatform.Color color = (ComposePlatform.Color) ComposePlatform.Color.ADAPTER.redact(tint.color);
        ByteString byteString = ByteString.EMPTY;
        color.getClass();
        byteString.getClass();
        return new ComposePlatform.Modifier.Tint(color, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ComposePlatform.Modifier.Tint tint = (ComposePlatform.Modifier.Tint) obj;
        tint.getClass();
        ComposePlatform.Color.ADAPTER.encodeWithTag(protoWriter, 1, tint.color);
        protoWriter.writeBytes(tint.unknownFields());
    }
}
