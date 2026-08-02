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
public final class GetAllResourcesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetAllResourcesResponse(m, arrayList, arrayList2, arrayList3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Background.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                arrayList.add(Sticker.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                arrayList2.add(Font.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList3.add(Preset.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetAllResourcesResponse getAllResourcesResponse = (GetAllResourcesResponse) obj;
        reverseProtoWriter.getClass();
        getAllResourcesResponse.getClass();
        reverseProtoWriter.writeBytes(getAllResourcesResponse.unknownFields());
        Preset.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, getAllResourcesResponse.presets);
        Font.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, getAllResourcesResponse.fonts);
        Sticker.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, getAllResourcesResponse.stickers);
        Background.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getAllResourcesResponse.backgrounds);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetAllResourcesResponse getAllResourcesResponse = (GetAllResourcesResponse) obj;
        getAllResourcesResponse.getClass();
        return Preset.ADAPTER.asRepeated().encodedSizeWithTag(4, getAllResourcesResponse.presets) + Font.ADAPTER.asRepeated().encodedSizeWithTag(3, getAllResourcesResponse.fonts) + Sticker.ADAPTER.asRepeated().encodedSizeWithTag(2, getAllResourcesResponse.stickers) + Background.ADAPTER.asRepeated().encodedSizeWithTag(1, getAllResourcesResponse.backgrounds) + getAllResourcesResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetAllResourcesResponse getAllResourcesResponse = (GetAllResourcesResponse) obj;
        getAllResourcesResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getAllResourcesResponse.backgrounds, Background.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(getAllResourcesResponse.stickers, Sticker.ADAPTER);
        ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(getAllResourcesResponse.fonts, Font.ADAPTER);
        ArrayList m1169redactElements4 = TransactorKt.m1169redactElements(getAllResourcesResponse.presets, Preset.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetAllResourcesResponse(m1169redactElements, m1169redactElements2, m1169redactElements3, m1169redactElements4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetAllResourcesResponse getAllResourcesResponse = (GetAllResourcesResponse) obj;
        getAllResourcesResponse.getClass();
        Background.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getAllResourcesResponse.backgrounds);
        Sticker.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getAllResourcesResponse.stickers);
        Font.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, getAllResourcesResponse.fonts);
        Preset.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, getAllResourcesResponse.presets);
        protoWriter.writeBytes(getAllResourcesResponse.unknownFields());
    }
}
