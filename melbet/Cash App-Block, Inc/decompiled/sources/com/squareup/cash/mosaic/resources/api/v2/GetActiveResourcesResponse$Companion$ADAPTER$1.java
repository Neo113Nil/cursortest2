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
public final class GetActiveResourcesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GetActiveResourcesResponse(m, arrayList, arrayList2, arrayList3, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        GetActiveResourcesResponse getActiveResourcesResponse = (GetActiveResourcesResponse) obj;
        reverseProtoWriter.getClass();
        getActiveResourcesResponse.getClass();
        reverseProtoWriter.writeBytes(getActiveResourcesResponse.unknownFields());
        Preset.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, getActiveResourcesResponse.presets);
        Font.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, getActiveResourcesResponse.fonts);
        Sticker.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, getActiveResourcesResponse.stickers);
        Background.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getActiveResourcesResponse.backgrounds);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetActiveResourcesResponse getActiveResourcesResponse = (GetActiveResourcesResponse) obj;
        getActiveResourcesResponse.getClass();
        return Preset.ADAPTER.asRepeated().encodedSizeWithTag(4, getActiveResourcesResponse.presets) + Font.ADAPTER.asRepeated().encodedSizeWithTag(3, getActiveResourcesResponse.fonts) + Sticker.ADAPTER.asRepeated().encodedSizeWithTag(2, getActiveResourcesResponse.stickers) + Background.ADAPTER.asRepeated().encodedSizeWithTag(1, getActiveResourcesResponse.backgrounds) + getActiveResourcesResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetActiveResourcesResponse getActiveResourcesResponse = (GetActiveResourcesResponse) obj;
        getActiveResourcesResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getActiveResourcesResponse.backgrounds, Background.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(getActiveResourcesResponse.stickers, Sticker.ADAPTER);
        ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(getActiveResourcesResponse.fonts, Font.ADAPTER);
        ArrayList m1169redactElements4 = TransactorKt.m1169redactElements(getActiveResourcesResponse.presets, Preset.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetActiveResourcesResponse(m1169redactElements, m1169redactElements2, m1169redactElements3, m1169redactElements4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetActiveResourcesResponse getActiveResourcesResponse = (GetActiveResourcesResponse) obj;
        getActiveResourcesResponse.getClass();
        Background.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getActiveResourcesResponse.backgrounds);
        Sticker.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getActiveResourcesResponse.stickers);
        Font.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, getActiveResourcesResponse.fonts);
        Preset.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, getActiveResourcesResponse.presets);
        protoWriter.writeBytes(getActiveResourcesResponse.unknownFields());
    }
}
