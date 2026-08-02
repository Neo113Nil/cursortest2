package com.squareup.cash.mosaic.resources.api.v2;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/mosaic/resources/api/v2/GetAllResourcesResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/mosaic/resources/api/v2/GetAllResourcesResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GetAllResourcesResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetAllResourcesResponse> CREATOR;
    public final List backgrounds;
    public final List fonts;
    public final List presets;
    public final List stickers;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public List backgrounds;
        public List fonts;
        public List presets;
        public List stickers;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new GetAllResourcesResponse(this.backgrounds, this.stickers, this.fonts, this.presets, buildUnknownFields());
                default:
                    return new GetActiveResourcesResponse(this.backgrounds, this.stickers, this.fonts, this.presets, buildUnknownFields());
            }
        }
    }

    static {
        GetAllResourcesResponse$Companion$ADAPTER$1 getAllResourcesResponse$Companion$ADAPTER$1 = new GetAllResourcesResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetAllResourcesResponse.class), "type.googleapis.com/squareup.cash.mosaic.resources.api.v2.GetAllResourcesResponse", Syntax.PROTO_2, null, "squareup/cash/mosaic/resources/api/v2/service.proto");
        ADAPTER = getAllResourcesResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getAllResourcesResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAllResourcesResponse(List list, List list2, List list3, List list4, ByteString byteString) {
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
        if (!(obj instanceof GetAllResourcesResponse)) {
            return false;
        }
        GetAllResourcesResponse getAllResourcesResponse = (GetAllResourcesResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getAllResourcesResponse.unknownFields()) && Intrinsics.areEqual(this.backgrounds, getAllResourcesResponse.backgrounds) && Intrinsics.areEqual(this.stickers, getAllResourcesResponse.stickers) && Intrinsics.areEqual(this.fonts, getAllResourcesResponse.fonts) && Intrinsics.areEqual(this.presets, getAllResourcesResponse.presets);
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
        Builder builder = new Builder(0);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAllResourcesResponse{", "}", 0, null, null, 56);
    }
}
