package com.squareup.cash.mosaic.resources.api.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.mosaic.models.v1.TextFormat;
import com.squareup.cash.notifications.Op;
import com.squareup.protos.cash.ui.Color;
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
import xyz.block.protos.genie.Expression;

/* loaded from: classes6.dex */
public final class BackgroundResource extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BackgroundResource> CREATOR;
    public final String accessibility_description;
    public final Color background_color;
    public final String background_url;
    public final String carousel_url;
    public final TextFormat default_text_format;
    public final List effects;
    public final String id;
    public final Boolean is_active;
    public final String mainUrl;
    public final String name;
    public final String previewUrl;
    public final String resourceSetToken;

    public enum BackgroundEffect implements WireEnum {
        BACKGROUND_EFFECT_UNSPECIFIED(0),
        BACKGROUND_EFFECT_GLITTER(1),
        BACKGROUND_EFFECT_TORTOISE(2);

        public static final BackgroundResource$BackgroundEffect$Companion$ADAPTER$1 ADAPTER;
        public static final Op.Companion Companion;
        public final int value;

        static {
            BackgroundEffect backgroundEffect = BACKGROUND_EFFECT_UNSPECIFIED;
            Companion = new Op.Companion();
            ADAPTER = new BackgroundResource$BackgroundEffect$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(BackgroundEffect.class), Syntax.PROTO_2, backgroundEffect);
        }

        BackgroundEffect(int i) {
            this.value = i;
        }

        public static final BackgroundEffect fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return BACKGROUND_EFFECT_UNSPECIFIED;
            }
            if (i == 1) {
                return BACKGROUND_EFFECT_GLITTER;
            }
            if (i != 2) {
                return null;
            }
            return BACKGROUND_EFFECT_TORTOISE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        BackgroundResource$Companion$ADAPTER$1 backgroundResource$Companion$ADAPTER$1 = new BackgroundResource$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BackgroundResource.class), "type.googleapis.com/squareup.cash.mosaic.resources.api.v1.BackgroundResource", Syntax.PROTO_2, null, "squareup/cash/mosaic/resources/api/v1/background.proto");
        ADAPTER = backgroundResource$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(backgroundResource$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundResource(String str, String str2, String str3, String str4, Boolean bool, Color color, TextFormat textFormat, List list, String str5, String str6, String str7, String str8, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.id = str;
        this.background_url = str2;
        this.carousel_url = str3;
        this.name = str4;
        this.is_active = bool;
        this.background_color = color;
        this.default_text_format = textFormat;
        this.resourceSetToken = str5;
        this.mainUrl = str6;
        this.previewUrl = str7;
        this.accessibility_description = str8;
        this.effects = TransactorKt.immutableCopyOf("effects", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackgroundResource)) {
            return false;
        }
        BackgroundResource backgroundResource = (BackgroundResource) obj;
        return Intrinsics.areEqual(unknownFields(), backgroundResource.unknownFields()) && Intrinsics.areEqual(this.id, backgroundResource.id) && Intrinsics.areEqual(this.background_url, backgroundResource.background_url) && Intrinsics.areEqual(this.carousel_url, backgroundResource.carousel_url) && Intrinsics.areEqual(this.name, backgroundResource.name) && Intrinsics.areEqual(this.is_active, backgroundResource.is_active) && Intrinsics.areEqual(this.background_color, backgroundResource.background_color) && Intrinsics.areEqual(this.default_text_format, backgroundResource.default_text_format) && Intrinsics.areEqual(this.effects, backgroundResource.effects) && Intrinsics.areEqual(this.resourceSetToken, backgroundResource.resourceSetToken) && Intrinsics.areEqual(this.mainUrl, backgroundResource.mainUrl) && Intrinsics.areEqual(this.previewUrl, backgroundResource.previewUrl) && Intrinsics.areEqual(this.accessibility_description, backgroundResource.accessibility_description);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.background_url;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.carousel_url;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.name;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Boolean bool = this.is_active;
        int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Color color = this.background_color;
        int hashCode7 = (hashCode6 + (color != null ? color.hashCode() : 0)) * 37;
        TextFormat textFormat = this.default_text_format;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode7 + (textFormat != null ? textFormat.hashCode() : 0)) * 37, 37, this.effects);
        String str5 = this.resourceSetToken;
        int hashCode8 = (m + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.mainUrl;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.previewUrl;
        int hashCode10 = (hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.accessibility_description;
        int hashCode11 = hashCode10 + (str8 != null ? str8.hashCode() : 0);
        this.hashCode = hashCode11;
        return hashCode11;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Expression.Builder builder = new Expression.Builder(1, false);
        builder.string_literal = this.id;
        builder.key_path_ref = this.background_url;
        builder.int_literal = this.carousel_url;
        builder.float_literal = this.name;
        builder.bool_literal = this.is_active;
        builder.blob_literal = this.background_color;
        builder.unary_op = this.default_text_format;
        builder.binary_op = this.effects;
        builder.conditional_op = this.resourceSetToken;
        builder.filter_op = this.mainUrl;
        builder.collection_literal = this.previewUrl;
        builder.format_string_op = this.accessibility_description;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        String str2 = this.background_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "background_url=", arrayList);
        }
        String str3 = this.carousel_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "carousel_url=", arrayList);
        }
        String str4 = this.name;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "name=", arrayList);
        }
        Boolean bool = this.is_active;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_active=", bool, arrayList);
        }
        Color color = this.background_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("background_color=", color, arrayList);
        }
        TextFormat textFormat = this.default_text_format;
        if (textFormat != null) {
            arrayList.add("default_text_format=" + textFormat);
        }
        List list = this.effects;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("effects=", arrayList, list);
        }
        String str5 = this.resourceSetToken;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "resourceSetToken=", arrayList);
        }
        String str6 = this.mainUrl;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "mainUrl=", arrayList);
        }
        String str7 = this.previewUrl;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "previewUrl=", arrayList);
        }
        String str8 = this.accessibility_description;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "accessibility_description=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BackgroundResource{", "}", 0, null, null, 56);
    }
}
