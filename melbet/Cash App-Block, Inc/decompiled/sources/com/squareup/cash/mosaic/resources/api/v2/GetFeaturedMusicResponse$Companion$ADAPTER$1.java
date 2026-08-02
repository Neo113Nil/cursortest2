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
public final class GetFeaturedMusicResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetFeaturedMusicResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Music.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetFeaturedMusicResponse getFeaturedMusicResponse = (GetFeaturedMusicResponse) obj;
        reverseProtoWriter.getClass();
        getFeaturedMusicResponse.getClass();
        reverseProtoWriter.writeBytes(getFeaturedMusicResponse.unknownFields());
        Music.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getFeaturedMusicResponse.musics);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetFeaturedMusicResponse getFeaturedMusicResponse = (GetFeaturedMusicResponse) obj;
        getFeaturedMusicResponse.getClass();
        return Music.ADAPTER.asRepeated().encodedSizeWithTag(1, getFeaturedMusicResponse.musics) + getFeaturedMusicResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetFeaturedMusicResponse getFeaturedMusicResponse = (GetFeaturedMusicResponse) obj;
        getFeaturedMusicResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getFeaturedMusicResponse.musics, Music.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetFeaturedMusicResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetFeaturedMusicResponse getFeaturedMusicResponse = (GetFeaturedMusicResponse) obj;
        getFeaturedMusicResponse.getClass();
        Music.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getFeaturedMusicResponse.musics);
        protoWriter.writeBytes(getFeaturedMusicResponse.unknownFields());
    }
}
