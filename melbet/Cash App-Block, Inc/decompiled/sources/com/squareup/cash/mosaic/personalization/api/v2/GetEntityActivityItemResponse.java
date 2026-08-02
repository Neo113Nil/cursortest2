package com.squareup.cash.mosaic.personalization.api.v2;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.idv.DisplayName;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v2/GetEntityActivityItemResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/idv/DisplayName$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GetEntityActivityItemResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetEntityActivityItemResponse> CREATOR;
    public final String activity_row_json;

    static {
        GetEntityActivityItemResponse$Companion$ADAPTER$1 getEntityActivityItemResponse$Companion$ADAPTER$1 = new GetEntityActivityItemResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetEntityActivityItemResponse.class), "type.googleapis.com/squareup.cash.mosaic.personalization.api.v2.GetEntityActivityItemResponse", Syntax.PROTO_2, null, "squareup/cash/mosaic/personalization/api/v2/service.proto");
        ADAPTER = getEntityActivityItemResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getEntityActivityItemResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetEntityActivityItemResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.activity_row_json = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetEntityActivityItemResponse)) {
            return false;
        }
        GetEntityActivityItemResponse getEntityActivityItemResponse = (GetEntityActivityItemResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getEntityActivityItemResponse.unknownFields()) && Intrinsics.areEqual(this.activity_row_json, getEntityActivityItemResponse.activity_row_json);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.activity_row_json;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DisplayName.Builder builder = new DisplayName.Builder(6);
        builder.display_name = this.activity_row_json;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.activity_row_json;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "activity_row_json=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetEntityActivityItemResponse{", "}", 0, null, null, 56);
    }
}
