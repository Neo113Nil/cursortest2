package com.squareup.cash.mosaic.resources.api.v2;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class Font$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        String str;
        String str2;
        String str3;
        ?? decode;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        FontStyle fontStyle = null;
        String str8 = null;
        String str9 = null;
        Integer num = null;
        ReleaseState releaseState = null;
        Boolean bool = null;
        String str10 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Font(str4, str5, str6, str7, fontStyle, str8, str9, num, releaseState, m, bool, str10, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 3:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 4:
                    str7 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 5:
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    try {
                        fontStyle = FontStyle.ADAPTER.decode(protoReader);
                        str5 = str;
                        str6 = str2;
                        str7 = str3;
                        decode = str4;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 6:
                    str8 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 7:
                    str9 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 8:
                    num = ProtoAdapter.INT32.decode(protoReader);
                    decode = str4;
                    break;
                case 9:
                    try {
                        releaseState = ReleaseState.ADAPTER.decode(protoReader);
                        decode = str4;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        str = str5;
                        str2 = str6;
                        str3 = str7;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 10:
                    m.add(Tag.ADAPTER.decode(protoReader));
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    decode = str4;
                    str5 = str;
                    str6 = str2;
                    str7 = str3;
                    break;
                case 11:
                    bool = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str4;
                    break;
                case 12:
                    str10 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    str = str5;
                    str2 = str6;
                    str3 = str7;
                    decode = str4;
                    str5 = str;
                    str6 = str2;
                    str7 = str3;
                    break;
            }
            str4 = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Font font = (Font) obj;
        reverseProtoWriter.getClass();
        font.getClass();
        reverseProtoWriter.writeBytes(font.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, font.accessibility_description);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 11, font.is_default);
        Tag.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 10, font.tags);
        ReleaseState.ADAPTER.encodeWithTag(reverseProtoWriter, 9, font.release_state);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 8, font.priority);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, font.font_stroke_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, font.font_color);
        FontStyle.ADAPTER.encodeWithTag(reverseProtoWriter, 5, font.font_style);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, font.font_family);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, font.preview_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, font.main_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, font.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Font font = (Font) obj;
        font.getClass();
        int size$okio = font.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(12, font.accessibility_description) + ProtoAdapter.BOOL.encodedSizeWithTag(11, font.is_default) + Tag.ADAPTER.asRepeated().encodedSizeWithTag(10, font.tags) + ReleaseState.ADAPTER.encodedSizeWithTag(9, font.release_state) + ProtoAdapter.INT32.encodedSizeWithTag(8, font.priority) + protoAdapter.encodedSizeWithTag(7, font.font_stroke_color) + protoAdapter.encodedSizeWithTag(6, font.font_color) + FontStyle.ADAPTER.encodedSizeWithTag(5, font.font_style) + protoAdapter.encodedSizeWithTag(4, font.font_family) + protoAdapter.encodedSizeWithTag(3, font.preview_url) + protoAdapter.encodedSizeWithTag(2, font.main_url) + protoAdapter.encodedSizeWithTag(1, font.name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Font font = (Font) obj;
        font.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(font.tags, Tag.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = font.name;
        String str2 = font.main_url;
        String str3 = font.preview_url;
        String str4 = font.font_family;
        FontStyle fontStyle = font.font_style;
        String str5 = font.font_color;
        String str6 = font.font_stroke_color;
        Integer num = font.priority;
        ReleaseState releaseState = font.release_state;
        Boolean bool = font.is_default;
        String str7 = font.accessibility_description;
        byteString.getClass();
        return new Font(str, str2, str3, str4, fontStyle, str5, str6, num, releaseState, m1169redactElements, bool, str7, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Font font = (Font) obj;
        font.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, font.name);
        protoAdapter.encodeWithTag(protoWriter, 2, font.main_url);
        protoAdapter.encodeWithTag(protoWriter, 3, font.preview_url);
        protoAdapter.encodeWithTag(protoWriter, 4, font.font_family);
        FontStyle.ADAPTER.encodeWithTag(protoWriter, 5, font.font_style);
        protoAdapter.encodeWithTag(protoWriter, 6, font.font_color);
        protoAdapter.encodeWithTag(protoWriter, 7, font.font_stroke_color);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, font.priority);
        ReleaseState.ADAPTER.encodeWithTag(protoWriter, 9, font.release_state);
        Tag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 10, font.tags);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, font.is_default);
        protoAdapter.encodeWithTag(protoWriter, 12, font.accessibility_description);
        protoWriter.writeBytes(font.unknownFields());
    }
}
