package com.squareup.cash.moneybot.genie.protos;

import androidx.room.TransactorKt;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class ComposePlatform$Color$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = ComposePlatform.Color.ColorValue.ADAPTER.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ComposePlatform.Color.ColorValue.ADAPTER.decode(protoReader);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        ComposePlatform.Color.ColorValue colorValue = (ComposePlatform.Color.ColorValue) obj;
        if (colorValue != null) {
            return new ComposePlatform.Color(colorValue, (ComposePlatform.Color.ColorValue) obj2, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "light");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ComposePlatform.Color color = (ComposePlatform.Color) obj;
        reverseProtoWriter.getClass();
        color.getClass();
        reverseProtoWriter.writeBytes(color.unknownFields());
        ProtoAdapter protoAdapter = ComposePlatform.Color.ColorValue.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, color.dark);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, color.light);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ComposePlatform.Color color = (ComposePlatform.Color) obj;
        color.getClass();
        int size$okio = color.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ComposePlatform.Color.ColorValue.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, color.dark) + protoAdapter.encodedSizeWithTag(1, color.light) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ComposePlatform.Color color = (ComposePlatform.Color) obj;
        color.getClass();
        ProtoAdapter protoAdapter = ComposePlatform.Color.ColorValue.ADAPTER;
        ComposePlatform.Color.ColorValue colorValue = (ComposePlatform.Color.ColorValue) protoAdapter.redact(color.light);
        ComposePlatform.Color.ColorValue colorValue2 = color.dark;
        ComposePlatform.Color.ColorValue colorValue3 = colorValue2 != null ? (ComposePlatform.Color.ColorValue) protoAdapter.redact(colorValue2) : null;
        ByteString byteString = ByteString.EMPTY;
        colorValue.getClass();
        byteString.getClass();
        return new ComposePlatform.Color(colorValue, colorValue3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ComposePlatform.Color color = (ComposePlatform.Color) obj;
        color.getClass();
        ProtoAdapter protoAdapter = ComposePlatform.Color.ColorValue.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, color.light);
        protoAdapter.encodeWithTag(protoWriter, 2, color.dark);
        protoWriter.writeBytes(color.unknownFields());
    }
}
