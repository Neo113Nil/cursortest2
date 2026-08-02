package com.squareup.cash.mosaic.resources.api.v2;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class GetMusicStreamingUrlResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetMusicStreamingUrlResponse((Music) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Music.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetMusicStreamingUrlResponse getMusicStreamingUrlResponse = (GetMusicStreamingUrlResponse) obj;
        reverseProtoWriter.getClass();
        getMusicStreamingUrlResponse.getClass();
        reverseProtoWriter.writeBytes(getMusicStreamingUrlResponse.unknownFields());
        Music.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getMusicStreamingUrlResponse.music);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetMusicStreamingUrlResponse getMusicStreamingUrlResponse = (GetMusicStreamingUrlResponse) obj;
        getMusicStreamingUrlResponse.getClass();
        return Music.ADAPTER.encodedSizeWithTag(1, getMusicStreamingUrlResponse.music) + getMusicStreamingUrlResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetMusicStreamingUrlResponse getMusicStreamingUrlResponse = (GetMusicStreamingUrlResponse) obj;
        getMusicStreamingUrlResponse.getClass();
        Music music = getMusicStreamingUrlResponse.music;
        Music music2 = music != null ? (Music) Music.ADAPTER.redact(music) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetMusicStreamingUrlResponse(music2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetMusicStreamingUrlResponse getMusicStreamingUrlResponse = (GetMusicStreamingUrlResponse) obj;
        getMusicStreamingUrlResponse.getClass();
        Music.ADAPTER.encodeWithTag(protoWriter, 1, getMusicStreamingUrlResponse.music);
        protoWriter.writeBytes(getMusicStreamingUrlResponse.unknownFields());
    }
}
