package com.squareup.cash.mosaic.resources.api.v2;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.ToggleScreen;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/mosaic/resources/api/v2/SearchMusicResourcesResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashsuggest/api/ToggleScreen$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SearchMusicResourcesResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SearchMusicResourcesResponse> CREATOR;
    public final List musics;
    public final String next_cursor;

    static {
        SearchMusicResourcesResponse$Companion$ADAPTER$1 searchMusicResourcesResponse$Companion$ADAPTER$1 = new SearchMusicResourcesResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SearchMusicResourcesResponse.class), "type.googleapis.com/squareup.cash.mosaic.resources.api.v2.SearchMusicResourcesResponse", Syntax.PROTO_2, null, "squareup/cash/mosaic/resources/api/v2/music.proto");
        ADAPTER = searchMusicResourcesResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(searchMusicResourcesResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchMusicResourcesResponse(List list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.next_cursor = str;
        this.musics = TransactorKt.immutableCopyOf("musics", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchMusicResourcesResponse)) {
            return false;
        }
        SearchMusicResourcesResponse searchMusicResourcesResponse = (SearchMusicResourcesResponse) obj;
        return Intrinsics.areEqual(unknownFields(), searchMusicResourcesResponse.unknownFields()) && Intrinsics.areEqual(this.musics, searchMusicResourcesResponse.musics) && Intrinsics.areEqual(this.next_cursor, searchMusicResourcesResponse.next_cursor);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.musics);
        String str = this.next_cursor;
        int hashCode = m + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ToggleScreen.Builder builder = new ToggleScreen.Builder(3, false);
        builder.sections = this.musics;
        builder.toggle_title = this.next_cursor;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.musics;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("musics=", arrayList, list);
        }
        String str = this.next_cursor;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "next_cursor=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SearchMusicResourcesResponse{", "}", 0, null, null, 56);
    }
}
