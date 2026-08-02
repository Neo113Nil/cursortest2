package com.squareup.cash.mosaic.resources.api.v1;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.mosaic.resources.api.v1.StickerResource;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class StickerResource$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        ArrayList arrayList;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StickerResource((String) obj2, (String) obj3, (String) obj4, (Boolean) obj5, m, (String) obj6, (String) obj7, (String) obj8, (String) obj9, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    arrayList = m;
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    arrayList = m;
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    arrayList = m;
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    arrayList = m;
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 5:
                    try {
                        StickerResource.StickerEffect.ADAPTER.tryDecode(protoReader, m);
                        obj = obj2;
                        arrayList = m;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj2;
                        arrayList = m;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                    }
                    obj2 = obj;
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    break;
                case 7:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    break;
                case 8:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    break;
                case 9:
                    obj9 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj2;
                    arrayList = m;
                    obj2 = obj;
                    break;
            }
            m = arrayList;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StickerResource stickerResource = (StickerResource) obj;
        reverseProtoWriter.getClass();
        stickerResource.getClass();
        reverseProtoWriter.writeBytes(stickerResource.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, stickerResource.accessibility_description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, stickerResource.previewUrl);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, stickerResource.mainUrl);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, stickerResource.resourceSetToken);
        StickerResource.StickerEffect.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, stickerResource.effects);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, stickerResource.is_active);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, stickerResource.name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, stickerResource.svg_data);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, stickerResource.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StickerResource stickerResource = (StickerResource) obj;
        stickerResource.getClass();
        int size$okio = stickerResource.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(9, stickerResource.accessibility_description) + protoAdapter.encodedSizeWithTag(8, stickerResource.previewUrl) + protoAdapter.encodedSizeWithTag(7, stickerResource.mainUrl) + protoAdapter.encodedSizeWithTag(6, stickerResource.resourceSetToken) + StickerResource.StickerEffect.ADAPTER.asRepeated().encodedSizeWithTag(5, stickerResource.effects) + ProtoAdapter.BOOL.encodedSizeWithTag(4, stickerResource.is_active) + protoAdapter.encodedSizeWithTag(3, stickerResource.name) + protoAdapter.encodedSizeWithTag(2, stickerResource.svg_data) + protoAdapter.encodedSizeWithTag(1, stickerResource.id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StickerResource stickerResource = (StickerResource) obj;
        stickerResource.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = stickerResource.id;
        String str2 = stickerResource.svg_data;
        String str3 = stickerResource.name;
        Boolean bool = stickerResource.is_active;
        List list = stickerResource.effects;
        String str4 = stickerResource.resourceSetToken;
        String str5 = stickerResource.mainUrl;
        String str6 = stickerResource.previewUrl;
        String str7 = stickerResource.accessibility_description;
        list.getClass();
        byteString.getClass();
        return new StickerResource(str, str2, str3, bool, list, str4, str5, str6, str7, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StickerResource stickerResource = (StickerResource) obj;
        stickerResource.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, stickerResource.id);
        protoAdapter.encodeWithTag(protoWriter, 2, stickerResource.svg_data);
        protoAdapter.encodeWithTag(protoWriter, 3, stickerResource.name);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, stickerResource.is_active);
        StickerResource.StickerEffect.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, stickerResource.effects);
        protoAdapter.encodeWithTag(protoWriter, 6, stickerResource.resourceSetToken);
        protoAdapter.encodeWithTag(protoWriter, 7, stickerResource.mainUrl);
        protoAdapter.encodeWithTag(protoWriter, 8, stickerResource.previewUrl);
        protoAdapter.encodeWithTag(protoWriter, 9, stickerResource.accessibility_description);
        protoWriter.writeBytes(stickerResource.unknownFields());
    }
}
