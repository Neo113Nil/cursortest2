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
public final class SearchMusicResourcesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SearchMusicResourcesResponse(m, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Music.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SearchMusicResourcesResponse searchMusicResourcesResponse = (SearchMusicResourcesResponse) obj;
        reverseProtoWriter.getClass();
        searchMusicResourcesResponse.getClass();
        reverseProtoWriter.writeBytes(searchMusicResourcesResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, searchMusicResourcesResponse.next_cursor);
        Music.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, searchMusicResourcesResponse.musics);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SearchMusicResourcesResponse searchMusicResourcesResponse = (SearchMusicResourcesResponse) obj;
        searchMusicResourcesResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, searchMusicResourcesResponse.next_cursor) + Music.ADAPTER.asRepeated().encodedSizeWithTag(1, searchMusicResourcesResponse.musics) + searchMusicResourcesResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SearchMusicResourcesResponse searchMusicResourcesResponse = (SearchMusicResourcesResponse) obj;
        searchMusicResourcesResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(searchMusicResourcesResponse.musics, Music.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = searchMusicResourcesResponse.next_cursor;
        byteString.getClass();
        return new SearchMusicResourcesResponse(m1169redactElements, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SearchMusicResourcesResponse searchMusicResourcesResponse = (SearchMusicResourcesResponse) obj;
        searchMusicResourcesResponse.getClass();
        Music.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, searchMusicResourcesResponse.musics);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, searchMusicResourcesResponse.next_cursor);
        protoWriter.writeBytes(searchMusicResourcesResponse.unknownFields());
    }
}
