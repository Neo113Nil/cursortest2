package com.squareup.cash.mosaic.resources.api.v2;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.ForEach;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/mosaic/resources/api/v2/GetPersonalizationResourcesResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/moneybot/genie/protos/ForEach$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GetPersonalizationResourcesResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetPersonalizationResourcesResponse> CREATOR;
    public final List backgrounds;
    public final List fonts;
    public final Music music;
    public final List stickers;

    static {
        GetPersonalizationResourcesResponse$Companion$ADAPTER$1 getPersonalizationResourcesResponse$Companion$ADAPTER$1 = new GetPersonalizationResourcesResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetPersonalizationResourcesResponse.class), "type.googleapis.com/squareup.cash.mosaic.resources.api.v2.GetPersonalizationResourcesResponse", Syntax.PROTO_2, null, "squareup/cash/mosaic/resources/api/v2/service.proto");
        ADAPTER = getPersonalizationResourcesResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getPersonalizationResourcesResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPersonalizationResourcesResponse(List list, List list2, Music music, List list3, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.music = music;
        this.backgrounds = TransactorKt.immutableCopyOf("backgrounds", list);
        this.stickers = TransactorKt.immutableCopyOf("stickers", list2);
        this.fonts = TransactorKt.immutableCopyOf("fonts", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetPersonalizationResourcesResponse)) {
            return false;
        }
        GetPersonalizationResourcesResponse getPersonalizationResourcesResponse = (GetPersonalizationResourcesResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getPersonalizationResourcesResponse.unknownFields()) && Intrinsics.areEqual(this.backgrounds, getPersonalizationResourcesResponse.backgrounds) && Intrinsics.areEqual(this.stickers, getPersonalizationResourcesResponse.stickers) && Intrinsics.areEqual(this.music, getPersonalizationResourcesResponse.music) && Intrinsics.areEqual(this.fonts, getPersonalizationResourcesResponse.fonts);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.backgrounds), 37, this.stickers);
        Music music = this.music;
        int hashCode = this.fonts.hashCode() + ((m + (music != null ? music.hashCode() : 0)) * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ForEach.Builder builder = new ForEach.Builder(9);
        builder.collection = this.backgrounds;
        builder.template = this.stickers;
        builder.item_variable = this.music;
        builder.source = this.fonts;
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
        Music music = this.music;
        if (music != null) {
            arrayList.add("music=" + music);
        }
        List list3 = this.fonts;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("fonts=", arrayList, list3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPersonalizationResourcesResponse{", "}", 0, null, null, 56);
    }
}
