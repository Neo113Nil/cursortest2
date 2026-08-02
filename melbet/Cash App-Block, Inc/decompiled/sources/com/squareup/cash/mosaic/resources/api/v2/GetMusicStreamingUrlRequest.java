package com.squareup.cash.mosaic.resources.api.v2;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.idv.DisplayName;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetMusicStreamingUrlRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetMusicStreamingUrlRequest> CREATOR;
    public final String music_id;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetMusicStreamingUrlRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.cash.mosaic.resources.api.v2.GetMusicStreamingUrlRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetMusicStreamingUrlRequest((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetMusicStreamingUrlRequest getMusicStreamingUrlRequest = (GetMusicStreamingUrlRequest) obj;
                reverseProtoWriter.getClass();
                getMusicStreamingUrlRequest.getClass();
                reverseProtoWriter.writeBytes(getMusicStreamingUrlRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, getMusicStreamingUrlRequest.music_id);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetMusicStreamingUrlRequest getMusicStreamingUrlRequest = (GetMusicStreamingUrlRequest) obj;
                getMusicStreamingUrlRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(1, getMusicStreamingUrlRequest.music_id) + getMusicStreamingUrlRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetMusicStreamingUrlRequest getMusicStreamingUrlRequest = (GetMusicStreamingUrlRequest) obj;
                getMusicStreamingUrlRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = getMusicStreamingUrlRequest.music_id;
                byteString.getClass();
                return new GetMusicStreamingUrlRequest(str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetMusicStreamingUrlRequest getMusicStreamingUrlRequest = (GetMusicStreamingUrlRequest) obj;
                getMusicStreamingUrlRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getMusicStreamingUrlRequest.music_id);
                protoWriter.writeBytes(getMusicStreamingUrlRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMusicStreamingUrlRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.music_id = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetMusicStreamingUrlRequest)) {
            return false;
        }
        GetMusicStreamingUrlRequest getMusicStreamingUrlRequest = (GetMusicStreamingUrlRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getMusicStreamingUrlRequest.unknownFields()) && Intrinsics.areEqual(this.music_id, getMusicStreamingUrlRequest.music_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.music_id;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DisplayName.Builder builder = new DisplayName.Builder(7);
        builder.display_name = this.music_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.music_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "music_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetMusicStreamingUrlRequest{", "}", 0, null, null, 56);
    }
}
