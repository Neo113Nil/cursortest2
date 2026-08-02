package com.squareup.cash.mosaic.resources.api.v2;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class Preset$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Preset((String) obj, (String) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Preset preset = (Preset) obj;
        reverseProtoWriter.getClass();
        preset.getClass();
        reverseProtoWriter.writeBytes(preset.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, preset.preview_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, preset.default_font);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, preset.personalization_data);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, preset.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Preset preset = (Preset) obj;
        preset.getClass();
        int size$okio = preset.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, preset.preview_url) + protoAdapter.encodedSizeWithTag(3, preset.default_font) + protoAdapter.encodedSizeWithTag(2, preset.personalization_data) + protoAdapter.encodedSizeWithTag(1, preset.name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Preset preset = (Preset) obj;
        preset.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = preset.name;
        String str2 = preset.personalization_data;
        String str3 = preset.default_font;
        String str4 = preset.preview_url;
        byteString.getClass();
        return new Preset(str, str2, str3, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Preset preset = (Preset) obj;
        preset.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, preset.name);
        protoAdapter.encodeWithTag(protoWriter, 2, preset.personalization_data);
        protoAdapter.encodeWithTag(protoWriter, 3, preset.default_font);
        protoAdapter.encodeWithTag(protoWriter, 4, preset.preview_url);
        protoWriter.writeBytes(preset.unknownFields());
    }
}
