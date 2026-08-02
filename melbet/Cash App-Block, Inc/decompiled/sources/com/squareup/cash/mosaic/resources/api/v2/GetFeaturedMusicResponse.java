package com.squareup.cash.mosaic.resources.api.v2;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.appthemes.Gradient;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/mosaic/resources/api/v2/GetFeaturedMusicResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/appthemes/Gradient$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GetFeaturedMusicResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetFeaturedMusicResponse> CREATOR;
    public final List musics;

    static {
        GetFeaturedMusicResponse$Companion$ADAPTER$1 getFeaturedMusicResponse$Companion$ADAPTER$1 = new GetFeaturedMusicResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetFeaturedMusicResponse.class), "type.googleapis.com/squareup.cash.mosaic.resources.api.v2.GetFeaturedMusicResponse", Syntax.PROTO_2, null, "squareup/cash/mosaic/resources/api/v2/music.proto");
        ADAPTER = getFeaturedMusicResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getFeaturedMusicResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFeaturedMusicResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.musics = TransactorKt.immutableCopyOf("musics", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetFeaturedMusicResponse)) {
            return false;
        }
        GetFeaturedMusicResponse getFeaturedMusicResponse = (GetFeaturedMusicResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getFeaturedMusicResponse.unknownFields()) && Intrinsics.areEqual(this.musics, getFeaturedMusicResponse.musics);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.musics.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Gradient.Builder builder = new Gradient.Builder(11, false);
        builder.colors = this.musics;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.musics;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("musics=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetFeaturedMusicResponse{", "}", 0, null, null, 56);
    }
}
