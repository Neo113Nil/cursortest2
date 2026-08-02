package com.squareup.cash.mosaic.resources.api.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.protos.cash.local.client.v1.GetMarketingCouponOfferDetailsResponse;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class StickerResource extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StickerResource> CREATOR;
    public final String accessibility_description;
    public final List effects;
    public final String id;
    public final Boolean is_active;
    public final String mainUrl;
    public final String name;
    public final String previewUrl;
    public final String resourceSetToken;
    public final String svg_data;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String accessibility_description;
        public List effects;
        public String id;
        public Boolean is_active;
        public String mainUrl;
        public String name;
        public String previewUrl;
        public String resourceSetToken;
        public String svg_data;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new StickerResource(this.id, this.svg_data, this.name, this.is_active, this.effects, this.resourceSetToken, this.mainUrl, this.previewUrl, this.accessibility_description, buildUnknownFields());
                default:
                    return new GetMarketingCouponOfferDetailsResponse.CouponOfferDetails(this.id, this.svg_data, this.name, this.is_active, this.effects, this.resourceSetToken, this.mainUrl, this.previewUrl, this.accessibility_description, buildUnknownFields());
            }
        }
    }

    public enum StickerEffect implements WireEnum {
        STICKER_EFFECT_UNSPECIFIED(0),
        STICKER_EFFECT_GLITTER(1);

        public static final StickerResource$StickerEffect$Companion$ADAPTER$1 ADAPTER;
        public static final CardProduct.Companion Companion;
        public final int value;

        static {
            StickerEffect stickerEffect = STICKER_EFFECT_UNSPECIFIED;
            Companion = new CardProduct.Companion(5);
            ADAPTER = new StickerResource$StickerEffect$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(StickerEffect.class), Syntax.PROTO_2, stickerEffect);
        }

        StickerEffect(int i) {
            this.value = i;
        }

        public static final StickerEffect fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return STICKER_EFFECT_UNSPECIFIED;
            }
            if (i != 1) {
                return null;
            }
            return STICKER_EFFECT_GLITTER;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        StickerResource$Companion$ADAPTER$1 stickerResource$Companion$ADAPTER$1 = new StickerResource$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StickerResource.class), "type.googleapis.com/squareup.cash.mosaic.resources.api.v1.StickerResource", Syntax.PROTO_2, null, "squareup/cash/mosaic/resources/api/v1/sticker.proto");
        ADAPTER = stickerResource$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(stickerResource$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerResource(String str, String str2, String str3, Boolean bool, List list, String str4, String str5, String str6, String str7, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.id = str;
        this.svg_data = str2;
        this.name = str3;
        this.is_active = bool;
        this.resourceSetToken = str4;
        this.mainUrl = str5;
        this.previewUrl = str6;
        this.accessibility_description = str7;
        this.effects = TransactorKt.immutableCopyOf("effects", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StickerResource)) {
            return false;
        }
        StickerResource stickerResource = (StickerResource) obj;
        return Intrinsics.areEqual(unknownFields(), stickerResource.unknownFields()) && Intrinsics.areEqual(this.id, stickerResource.id) && Intrinsics.areEqual(this.svg_data, stickerResource.svg_data) && Intrinsics.areEqual(this.name, stickerResource.name) && Intrinsics.areEqual(this.is_active, stickerResource.is_active) && Intrinsics.areEqual(this.effects, stickerResource.effects) && Intrinsics.areEqual(this.resourceSetToken, stickerResource.resourceSetToken) && Intrinsics.areEqual(this.mainUrl, stickerResource.mainUrl) && Intrinsics.areEqual(this.previewUrl, stickerResource.previewUrl) && Intrinsics.areEqual(this.accessibility_description, stickerResource.accessibility_description);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.svg_data;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.name;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Boolean bool = this.is_active;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37, 37, this.effects);
        String str4 = this.resourceSetToken;
        int hashCode5 = (m + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.mainUrl;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.previewUrl;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.accessibility_description;
        int hashCode8 = hashCode7 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.id = this.id;
        builder.svg_data = this.svg_data;
        builder.name = this.name;
        builder.is_active = this.is_active;
        builder.effects = this.effects;
        builder.resourceSetToken = this.resourceSetToken;
        builder.mainUrl = this.mainUrl;
        builder.previewUrl = this.previewUrl;
        builder.accessibility_description = this.accessibility_description;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        String str2 = this.svg_data;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "svg_data=", arrayList);
        }
        String str3 = this.name;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "name=", arrayList);
        }
        Boolean bool = this.is_active;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_active=", bool, arrayList);
        }
        List list = this.effects;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("effects=", arrayList, list);
        }
        String str4 = this.resourceSetToken;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "resourceSetToken=", arrayList);
        }
        String str5 = this.mainUrl;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "mainUrl=", arrayList);
        }
        String str6 = this.previewUrl;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "previewUrl=", arrayList);
        }
        String str7 = this.accessibility_description;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "accessibility_description=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StickerResource{", "}", 0, null, null, 56);
    }
}
