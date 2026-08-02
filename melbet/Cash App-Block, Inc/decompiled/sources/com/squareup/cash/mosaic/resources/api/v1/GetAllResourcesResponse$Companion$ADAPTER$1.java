package com.squareup.cash.mosaic.resources.api.v1;

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
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetAllResourcesResponse((String) obj, m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(BackgroundResource.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                arrayList.add(StickerResource.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetAllResourcesResponse getAllResourcesResponse = (GetAllResourcesResponse) obj;
        reverseProtoWriter.getClass();
        getAllResourcesResponse.getClass();
        reverseProtoWriter.writeBytes(getAllResourcesResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, getAllResourcesResponse.default_background_id);
        StickerResource.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, getAllResourcesResponse.sticker_resources);
        BackgroundResource.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getAllResourcesResponse.background_resources);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetAllResourcesResponse getAllResourcesResponse = (GetAllResourcesResponse) obj;
        getAllResourcesResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(3, getAllResourcesResponse.default_background_id) + StickerResource.ADAPTER.asRepeated().encodedSizeWithTag(2, getAllResourcesResponse.sticker_resources) + BackgroundResource.ADAPTER.asRepeated().encodedSizeWithTag(1, getAllResourcesResponse.background_resources) + getAllResourcesResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetAllResourcesResponse getAllResourcesResponse = (GetAllResourcesResponse) obj;
        getAllResourcesResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getAllResourcesResponse.background_resources, BackgroundResource.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(getAllResourcesResponse.sticker_resources, StickerResource.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = getAllResourcesResponse.default_background_id;
        byteString.getClass();
        return new GetAllResourcesResponse(str, m1169redactElements, m1169redactElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetAllResourcesResponse getAllResourcesResponse = (GetAllResourcesResponse) obj;
        getAllResourcesResponse.getClass();
        BackgroundResource.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getAllResourcesResponse.background_resources);
        StickerResource.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getAllResourcesResponse.sticker_resources);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getAllResourcesResponse.default_background_id);
        protoWriter.writeBytes(getAllResourcesResponse.unknownFields());
    }
}
