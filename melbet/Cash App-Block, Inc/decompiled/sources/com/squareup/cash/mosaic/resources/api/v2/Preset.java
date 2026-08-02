package com.squareup.cash.mosaic.resources.api.v2;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.PoolOwner;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class Preset extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Preset> CREATOR;
    public final String default_font;
    public final String name;
    public final String personalization_data;
    public final String preview_url;

    static {
        Preset$Companion$ADAPTER$1 preset$Companion$ADAPTER$1 = new Preset$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Preset.class), "type.googleapis.com/squareup.cash.mosaic.resources.api.v2.Preset", Syntax.PROTO_2, null, "squareup/cash/mosaic/resources/api/v2/preset.proto");
        ADAPTER = preset$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(preset$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Preset(String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.name = str;
        this.personalization_data = str2;
        this.default_font = str3;
        this.preview_url = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Preset)) {
            return false;
        }
        Preset preset = (Preset) obj;
        return Intrinsics.areEqual(unknownFields(), preset.unknownFields()) && Intrinsics.areEqual(this.name, preset.name) && Intrinsics.areEqual(this.personalization_data, preset.personalization_data) && Intrinsics.areEqual(this.default_font, preset.default_font) && Intrinsics.areEqual(this.preview_url, preset.preview_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.personalization_data;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.default_font;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.preview_url;
        int hashCode5 = hashCode4 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolOwner.Builder builder = new PoolOwner.Builder(1);
        builder.customer_token = this.name;
        builder.full_name = this.personalization_data;
        builder.profile_photo_url = this.default_font;
        builder.cashtag = this.preview_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
        }
        String str2 = this.personalization_data;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "personalization_data=", arrayList);
        }
        String str3 = this.default_font;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "default_font=", arrayList);
        }
        String str4 = this.preview_url;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "preview_url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Preset{", "}", 0, null, null, 56);
    }
}
