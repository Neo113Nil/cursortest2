package com.squareup.cash.mosaic.resources.api.v2;

import android.os.Parcelable;
import com.squareup.protos.cash.aegis.core.SubsectionBlock;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/mosaic/resources/api/v2/GetMusicStreamingUrlResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/aegis/core/SubsectionBlock$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GetMusicStreamingUrlResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetMusicStreamingUrlResponse> CREATOR;
    public final Music music;

    static {
        GetMusicStreamingUrlResponse$Companion$ADAPTER$1 getMusicStreamingUrlResponse$Companion$ADAPTER$1 = new GetMusicStreamingUrlResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetMusicStreamingUrlResponse.class), "type.googleapis.com/squareup.cash.mosaic.resources.api.v2.GetMusicStreamingUrlResponse", Syntax.PROTO_2, null, "squareup/cash/mosaic/resources/api/v2/music.proto");
        ADAPTER = getMusicStreamingUrlResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getMusicStreamingUrlResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMusicStreamingUrlResponse(Music music, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.music = music;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetMusicStreamingUrlResponse)) {
            return false;
        }
        GetMusicStreamingUrlResponse getMusicStreamingUrlResponse = (GetMusicStreamingUrlResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getMusicStreamingUrlResponse.unknownFields()) && Intrinsics.areEqual(this.music, getMusicStreamingUrlResponse.music);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Music music = this.music;
        int hashCode2 = hashCode + (music != null ? music.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SubsectionBlock.Builder builder = new SubsectionBlock.Builder(12);
        builder.f1245type = this.music;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Music music = this.music;
        if (music != null) {
            arrayList.add("music=" + music);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetMusicStreamingUrlResponse{", "}", 0, null, null, 56);
    }
}
