package com.squareup.cash.mosaic.resources.api.v2;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class GetPersonalizationResourcesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetPersonalizationResourcesResponse(m, arrayList, (Music) obj, arrayList2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Background.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                arrayList.add(Sticker.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                obj = TransactorKt.decodeMessageOrMerge(Music.ADAPTER, protoReader, obj);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList2.add(Font.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetPersonalizationResourcesResponse getPersonalizationResourcesResponse = (GetPersonalizationResourcesResponse) obj;
        reverseProtoWriter.getClass();
        getPersonalizationResourcesResponse.getClass();
        reverseProtoWriter.writeBytes(getPersonalizationResourcesResponse.unknownFields());
        Font.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, getPersonalizationResourcesResponse.fonts);
        Music.ADAPTER.encodeWithTag(reverseProtoWriter, 3, getPersonalizationResourcesResponse.music);
        Sticker.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, getPersonalizationResourcesResponse.stickers);
        Background.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getPersonalizationResourcesResponse.backgrounds);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetPersonalizationResourcesResponse getPersonalizationResourcesResponse = (GetPersonalizationResourcesResponse) obj;
        getPersonalizationResourcesResponse.getClass();
        return Font.ADAPTER.asRepeated().encodedSizeWithTag(4, getPersonalizationResourcesResponse.fonts) + Music.ADAPTER.encodedSizeWithTag(3, getPersonalizationResourcesResponse.music) + Sticker.ADAPTER.asRepeated().encodedSizeWithTag(2, getPersonalizationResourcesResponse.stickers) + Background.ADAPTER.asRepeated().encodedSizeWithTag(1, getPersonalizationResourcesResponse.backgrounds) + getPersonalizationResourcesResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetPersonalizationResourcesResponse getPersonalizationResourcesResponse = (GetPersonalizationResourcesResponse) obj;
        getPersonalizationResourcesResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getPersonalizationResourcesResponse.backgrounds, Background.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(getPersonalizationResourcesResponse.stickers, Sticker.ADAPTER);
        Music music = getPersonalizationResourcesResponse.music;
        Music music2 = music != null ? (Music) Music.ADAPTER.redact(music) : null;
        ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(getPersonalizationResourcesResponse.fonts, Font.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetPersonalizationResourcesResponse(m1169redactElements, m1169redactElements2, music2, m1169redactElements3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetPersonalizationResourcesResponse getPersonalizationResourcesResponse = (GetPersonalizationResourcesResponse) obj;
        getPersonalizationResourcesResponse.getClass();
        Background.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getPersonalizationResourcesResponse.backgrounds);
        Sticker.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getPersonalizationResourcesResponse.stickers);
        Music.ADAPTER.encodeWithTag(protoWriter, 3, getPersonalizationResourcesResponse.music);
        Font.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, getPersonalizationResourcesResponse.fonts);
        protoWriter.writeBytes(getPersonalizationResourcesResponse.unknownFields());
    }
}
