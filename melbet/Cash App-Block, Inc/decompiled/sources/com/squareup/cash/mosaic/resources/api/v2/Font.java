package com.squareup.cash.mosaic.resources.api.v2;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.Expression;

/* loaded from: classes6.dex */
public final class Font extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Font> CREATOR;
    public final String accessibility_description;
    public final String font_color;
    public final String font_family;
    public final String font_stroke_color;
    public final FontStyle font_style;
    public final Boolean is_default;
    public final String main_url;
    public final String name;
    public final String preview_url;
    public final Integer priority;
    public final ReleaseState release_state;
    public final List tags;

    static {
        Font$Companion$ADAPTER$1 font$Companion$ADAPTER$1 = new Font$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Font.class), "type.googleapis.com/squareup.cash.mosaic.resources.api.v2.Font", Syntax.PROTO_2, null, "squareup/cash/mosaic/resources/api/v2/font.proto");
        ADAPTER = font$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(font$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Font(String str, String str2, String str3, String str4, FontStyle fontStyle, String str5, String str6, Integer num, ReleaseState releaseState, List list, Boolean bool, String str7, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.name = str;
        this.main_url = str2;
        this.preview_url = str3;
        this.font_family = str4;
        this.font_style = fontStyle;
        this.font_color = str5;
        this.font_stroke_color = str6;
        this.priority = num;
        this.release_state = releaseState;
        this.is_default = bool;
        this.accessibility_description = str7;
        this.tags = TransactorKt.immutableCopyOf("tags", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Font)) {
            return false;
        }
        Font font = (Font) obj;
        return Intrinsics.areEqual(unknownFields(), font.unknownFields()) && Intrinsics.areEqual(this.name, font.name) && Intrinsics.areEqual(this.main_url, font.main_url) && Intrinsics.areEqual(this.preview_url, font.preview_url) && Intrinsics.areEqual(this.font_family, font.font_family) && this.font_style == font.font_style && Intrinsics.areEqual(this.font_color, font.font_color) && Intrinsics.areEqual(this.font_stroke_color, font.font_stroke_color) && Intrinsics.areEqual(this.priority, font.priority) && this.release_state == font.release_state && Intrinsics.areEqual(this.tags, font.tags) && Intrinsics.areEqual(this.is_default, font.is_default) && Intrinsics.areEqual(this.accessibility_description, font.accessibility_description);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.main_url;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.preview_url;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.font_family;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        FontStyle fontStyle = this.font_style;
        int hashCode6 = (hashCode5 + (fontStyle != null ? fontStyle.hashCode() : 0)) * 37;
        String str5 = this.font_color;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.font_stroke_color;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Integer num = this.priority;
        int hashCode9 = (hashCode8 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        ReleaseState releaseState = this.release_state;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode9 + (releaseState != null ? releaseState.hashCode() : 0)) * 37, 37, this.tags);
        Boolean bool = this.is_default;
        int hashCode10 = (m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str7 = this.accessibility_description;
        int hashCode11 = hashCode10 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = hashCode11;
        return hashCode11;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Expression.Builder builder = new Expression.Builder(2, false);
        builder.string_literal = this.name;
        builder.key_path_ref = this.main_url;
        builder.int_literal = this.preview_url;
        builder.float_literal = this.font_family;
        builder.blob_literal = this.font_style;
        builder.unary_op = this.font_color;
        builder.binary_op = this.font_stroke_color;
        builder.conditional_op = this.priority;
        builder.filter_op = this.release_state;
        builder.collection_literal = this.tags;
        builder.bool_literal = this.is_default;
        builder.format_string_op = this.accessibility_description;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
        }
        String str2 = this.main_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "main_url=", arrayList);
        }
        String str3 = this.preview_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "preview_url=", arrayList);
        }
        String str4 = this.font_family;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "font_family=", arrayList);
        }
        FontStyle fontStyle = this.font_style;
        if (fontStyle != null) {
            arrayList.add("font_style=" + fontStyle);
        }
        String str5 = this.font_color;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "font_color=", arrayList);
        }
        String str6 = this.font_stroke_color;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "font_stroke_color=", arrayList);
        }
        Integer num = this.priority;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("priority=", num, arrayList);
        }
        ReleaseState releaseState = this.release_state;
        if (releaseState != null) {
            arrayList.add("release_state=" + releaseState);
        }
        List list = this.tags;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("tags=", arrayList, list);
        }
        Boolean bool = this.is_default;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_default=", bool, arrayList);
        }
        String str7 = this.accessibility_description;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "accessibility_description=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Font{", "}", 0, null, null, 56);
    }
}
