package com.squareup.cash.mosaic.resources.api.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.SyncContactsRequest;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/mosaic/resources/api/v1/GetAllResourcesResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/app/SyncContactsRequest$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GetAllResourcesResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetAllResourcesResponse> CREATOR;
    public final List background_resources;
    public final String default_background_id;
    public final List sticker_resources;

    static {
        GetAllResourcesResponse$Companion$ADAPTER$1 getAllResourcesResponse$Companion$ADAPTER$1 = new GetAllResourcesResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetAllResourcesResponse.class), "type.googleapis.com/squareup.cash.mosaic.resources.api.v1.GetAllResourcesResponse", Syntax.PROTO_2, null, "squareup/cash/mosaic/resources/api/v1/service.proto");
        ADAPTER = getAllResourcesResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getAllResourcesResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAllResourcesResponse(String str, List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.default_background_id = str;
        this.background_resources = TransactorKt.immutableCopyOf("background_resources", list);
        this.sticker_resources = TransactorKt.immutableCopyOf("sticker_resources", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetAllResourcesResponse)) {
            return false;
        }
        GetAllResourcesResponse getAllResourcesResponse = (GetAllResourcesResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getAllResourcesResponse.unknownFields()) && Intrinsics.areEqual(this.background_resources, getAllResourcesResponse.background_resources) && Intrinsics.areEqual(this.sticker_resources, getAllResourcesResponse.sticker_resources) && Intrinsics.areEqual(this.default_background_id, getAllResourcesResponse.default_background_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.background_resources), 37, this.sticker_resources);
        String str = this.default_background_id;
        int hashCode = m + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SyncContactsRequest.Builder builder = new SyncContactsRequest.Builder(2, false);
        builder.add_hashed_aliases = this.background_resources;
        builder.remove_hashed_aliases = this.sticker_resources;
        builder.sync_token = this.default_background_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.background_resources;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("background_resources=", arrayList, list);
        }
        List list2 = this.sticker_resources;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sticker_resources=", arrayList, list2);
        }
        String str = this.default_background_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "default_background_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAllResourcesResponse{", "}", 0, null, null, 56);
    }
}
