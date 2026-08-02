package com.squareup.cash.mosaic.resources.api.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.mosaic.models.v1.TextFormat;
import com.squareup.cash.mosaic.resources.api.v1.BackgroundResource;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class BackgroundResource$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
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
        Boolean bool = null;
        Object obj = null;
        Object obj2 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BackgroundResource(str4, str5, str6, str7, bool, (Color) obj, (TextFormat) obj2, m, str8, str9, str10, str11, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                    bool = ProtoAdapter.BOOL.decode(protoReader);
                    decode = str4;
                    break;
                case 6:
                    obj = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj);
                    decode = str4;
                    break;
                case 7:
                    obj2 = TransactorKt.decodeMessageOrMerge(TextFormat.ADAPTER, protoReader, obj2);
                    decode = str4;
                    break;
                case 8:
                    try {
                        BackgroundResource.BackgroundEffect.ADAPTER.tryDecode(protoReader, m);
                        str = str5;
                        str2 = str6;
                        str3 = str7;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        str = str5;
                        str2 = str6;
                        str3 = str7;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                    }
                    decode = str4;
                    str5 = str;
                    str6 = str2;
                    str7 = str3;
                    break;
                case 9:
                    str8 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 10:
                    str9 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 11:
                    str10 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str4;
                    break;
                case 12:
                    str11 = ProtoAdapter.STRING.decode(protoReader);
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
        BackgroundResource backgroundResource = (BackgroundResource) obj;
        reverseProtoWriter.getClass();
        backgroundResource.getClass();
        reverseProtoWriter.writeBytes(backgroundResource.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, backgroundResource.accessibility_description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, backgroundResource.previewUrl);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, backgroundResource.mainUrl);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, backgroundResource.resourceSetToken);
        BackgroundResource.BackgroundEffect.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 8, backgroundResource.effects);
        TextFormat.ADAPTER.encodeWithTag(reverseProtoWriter, 7, backgroundResource.default_text_format);
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 6, backgroundResource.background_color);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 5, backgroundResource.is_active);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, backgroundResource.name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, backgroundResource.carousel_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, backgroundResource.background_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, backgroundResource.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BackgroundResource backgroundResource = (BackgroundResource) obj;
        backgroundResource.getClass();
        int size$okio = backgroundResource.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(12, backgroundResource.accessibility_description) + protoAdapter.encodedSizeWithTag(11, backgroundResource.previewUrl) + protoAdapter.encodedSizeWithTag(10, backgroundResource.mainUrl) + protoAdapter.encodedSizeWithTag(9, backgroundResource.resourceSetToken) + BackgroundResource.BackgroundEffect.ADAPTER.asRepeated().encodedSizeWithTag(8, backgroundResource.effects) + TextFormat.ADAPTER.encodedSizeWithTag(7, backgroundResource.default_text_format) + Color.ADAPTER.encodedSizeWithTag(6, backgroundResource.background_color) + ProtoAdapter.BOOL.encodedSizeWithTag(5, backgroundResource.is_active) + protoAdapter.encodedSizeWithTag(4, backgroundResource.name) + protoAdapter.encodedSizeWithTag(3, backgroundResource.carousel_url) + protoAdapter.encodedSizeWithTag(2, backgroundResource.background_url) + protoAdapter.encodedSizeWithTag(1, backgroundResource.id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BackgroundResource backgroundResource = (BackgroundResource) obj;
        backgroundResource.getClass();
        Color color = backgroundResource.background_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        TextFormat textFormat = backgroundResource.default_text_format;
        TextFormat textFormat2 = textFormat != null ? (TextFormat) TextFormat.ADAPTER.redact(textFormat) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = backgroundResource.id;
        String str2 = backgroundResource.background_url;
        String str3 = backgroundResource.carousel_url;
        String str4 = backgroundResource.name;
        Boolean bool = backgroundResource.is_active;
        List list = backgroundResource.effects;
        String str5 = backgroundResource.resourceSetToken;
        String str6 = backgroundResource.mainUrl;
        String str7 = backgroundResource.previewUrl;
        String str8 = backgroundResource.accessibility_description;
        list.getClass();
        byteString.getClass();
        return new BackgroundResource(str, str2, str3, str4, bool, color2, textFormat2, list, str5, str6, str7, str8, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BackgroundResource backgroundResource = (BackgroundResource) obj;
        backgroundResource.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, backgroundResource.id);
        protoAdapter.encodeWithTag(protoWriter, 2, backgroundResource.background_url);
        protoAdapter.encodeWithTag(protoWriter, 3, backgroundResource.carousel_url);
        protoAdapter.encodeWithTag(protoWriter, 4, backgroundResource.name);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, backgroundResource.is_active);
        Color.ADAPTER.encodeWithTag(protoWriter, 6, backgroundResource.background_color);
        TextFormat.ADAPTER.encodeWithTag(protoWriter, 7, backgroundResource.default_text_format);
        BackgroundResource.BackgroundEffect.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, backgroundResource.effects);
        protoAdapter.encodeWithTag(protoWriter, 9, backgroundResource.resourceSetToken);
        protoAdapter.encodeWithTag(protoWriter, 10, backgroundResource.mainUrl);
        protoAdapter.encodeWithTag(protoWriter, 11, backgroundResource.previewUrl);
        protoAdapter.encodeWithTag(protoWriter, 12, backgroundResource.accessibility_description);
        protoWriter.writeBytes(backgroundResource.unknownFields());
    }
}
