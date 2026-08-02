package com.squareup.cash.mosaic.resources.api.v2;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.giftly.app.GetGiftCardStoreInfoResponse;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/mosaic/resources/api/v2/GetResourcesRecommendedResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/giftly/app/GetGiftCardStoreInfoResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GetResourcesRecommendedResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetResourcesRecommendedResponse> CREATOR;
    public final List backgrounds;
    public final List fonts;
    public final List stickers;

    static {
        GetResourcesRecommendedResponse$Companion$ADAPTER$1 getResourcesRecommendedResponse$Companion$ADAPTER$1 = new GetResourcesRecommendedResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetResourcesRecommendedResponse.class), "type.googleapis.com/squareup.cash.mosaic.resources.api.v2.GetResourcesRecommendedResponse", Syntax.PROTO_2, null, "squareup/cash/mosaic/resources/api/v2/service.proto");
        ADAPTER = getResourcesRecommendedResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getResourcesRecommendedResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetResourcesRecommendedResponse(List list, List list2, List list3, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.backgrounds = TransactorKt.immutableCopyOf("backgrounds", list);
        this.stickers = TransactorKt.immutableCopyOf("stickers", list2);
        this.fonts = TransactorKt.immutableCopyOf("fonts", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetResourcesRecommendedResponse)) {
            return false;
        }
        GetResourcesRecommendedResponse getResourcesRecommendedResponse = (GetResourcesRecommendedResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getResourcesRecommendedResponse.unknownFields()) && Intrinsics.areEqual(this.backgrounds, getResourcesRecommendedResponse.backgrounds) && Intrinsics.areEqual(this.stickers, getResourcesRecommendedResponse.stickers) && Intrinsics.areEqual(this.fonts, getResourcesRecommendedResponse.fonts);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.fonts.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.backgrounds), 37, this.stickers);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GetGiftCardStoreInfoResponse.Builder builder = new GetGiftCardStoreInfoResponse.Builder(1);
        builder.gift_card_types = this.backgrounds;
        builder.gift_card_categories = this.stickers;
        builder.gift_card_upsells = this.fonts;
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetResourcesRecommendedResponse{", "}", 0, null, null, 56);
    }
}
