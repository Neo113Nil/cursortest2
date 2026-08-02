package com.squareup.cash.mosaic.resources.api.v2;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.mosaic.resources.api.v2.GetAllResourcesResponse;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/mosaic/resources/api/v2/GetActiveResourcesResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/mosaic/resources/api/v2/GetAllResourcesResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GetActiveResourcesResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetActiveResourcesResponse> CREATOR;
    public final List backgrounds;
    public final List fonts;
    public final List presets;
    public final List stickers;

    static {
        GetActiveResourcesResponse$Companion$ADAPTER$1 getActiveResourcesResponse$Companion$ADAPTER$1 = new GetActiveResourcesResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetActiveResourcesResponse.class), "type.googleapis.com/squareup.cash.mosaic.resources.api.v2.GetActiveResourcesResponse", Syntax.PROTO_2, null, "squareup/cash/mosaic/resources/api/v2/service.proto");
        ADAPTER = getActiveResourcesResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getActiveResourcesResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetActiveResourcesResponse(List list, List list2, List list3, List list4, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        byteString.getClass();
        this.backgrounds = TransactorKt.immutableCopyOf("backgrounds", list);
        this.stickers = TransactorKt.immutableCopyOf("stickers", list2);
        this.fonts = TransactorKt.immutableCopyOf("fonts", list3);
        this.presets = TransactorKt.immutableCopyOf("presets", list4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetActiveResourcesResponse)) {
            return false;
        }
        GetActiveResourcesResponse getActiveResourcesResponse = (GetActiveResourcesResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getActiveResourcesResponse.unknownFields()) && Intrinsics.areEqual(this.backgrounds, getActiveResourcesResponse.backgrounds) && Intrinsics.areEqual(this.stickers, getActiveResourcesResponse.stickers) && Intrinsics.areEqual(this.fonts, getActiveResourcesResponse.fonts) && Intrinsics.areEqual(this.presets, getActiveResourcesResponse.presets);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.presets.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.backgrounds), 37, this.stickers), 37, this.fonts);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GetAllResourcesResponse.Builder builder = new GetAllResourcesResponse.Builder(1);
        builder.backgrounds = this.backgrounds;
        builder.stickers = this.stickers;
        builder.fonts = this.fonts;
        builder.presets = this.presets;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.backgrounds;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("backgrounds=", arrayList, list);
        }
        List list2 = this.stickers;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("stickers=", arrayList, list2);
        }
        List list3 = this.fonts;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("fonts=", arrayList, list3);
        }
        List list4 = this.presets;
        if (!list4.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("presets=", arrayList, list4);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetActiveResourcesResponse{", "}", 0, null, null, 56);
    }
}
