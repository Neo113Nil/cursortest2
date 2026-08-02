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
public final class GetResourcesRecommendedResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetResourcesRecommendedResponse(m, arrayList, arrayList2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Background.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                arrayList.add(Sticker.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList2.add(Font.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetResourcesRecommendedResponse getResourcesRecommendedResponse = (GetResourcesRecommendedResponse) obj;
        reverseProtoWriter.getClass();
        getResourcesRecommendedResponse.getClass();
        reverseProtoWriter.writeBytes(getResourcesRecommendedResponse.unknownFields());
        Font.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, getResourcesRecommendedResponse.fonts);
        Sticker.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, getResourcesRecommendedResponse.stickers);
        Background.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getResourcesRecommendedResponse.backgrounds);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetResourcesRecommendedResponse getResourcesRecommendedResponse = (GetResourcesRecommendedResponse) obj;
        getResourcesRecommendedResponse.getClass();
        return Font.ADAPTER.asRepeated().encodedSizeWithTag(3, getResourcesRecommendedResponse.fonts) + Sticker.ADAPTER.asRepeated().encodedSizeWithTag(2, getResourcesRecommendedResponse.stickers) + Background.ADAPTER.asRepeated().encodedSizeWithTag(1, getResourcesRecommendedResponse.backgrounds) + getResourcesRecommendedResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetResourcesRecommendedResponse getResourcesRecommendedResponse = (GetResourcesRecommendedResponse) obj;
        getResourcesRecommendedResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getResourcesRecommendedResponse.backgrounds, Background.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(getResourcesRecommendedResponse.stickers, Sticker.ADAPTER);
        ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(getResourcesRecommendedResponse.fonts, Font.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetResourcesRecommendedResponse(m1169redactElements, m1169redactElements2, m1169redactElements3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetResourcesRecommendedResponse getResourcesRecommendedResponse = (GetResourcesRecommendedResponse) obj;
        getResourcesRecommendedResponse.getClass();
        Background.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getResourcesRecommendedResponse.backgrounds);
        Sticker.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getResourcesRecommendedResponse.stickers);
        Font.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, getResourcesRecommendedResponse.fonts);
        protoWriter.writeBytes(getResourcesRecommendedResponse.unknownFields());
    }
}
