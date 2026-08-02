package com.squareup.cash.idv;

import android.os.Parcelable;
import com.google.mlkit.vision.text.zzb;
import com.google.mlkit.vision.text.zzc;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.badging.api.Badge;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class ProfilePageUpsellComponentV2 extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ProfilePageUpsellComponentV2> CREATOR;
    public final String entity_id;
    public final String header_text;
    public final Icon icon;
    public final IconV2 icon_v2;
    public final LocalizableString localizable_header_text;
    public final LocalizableString localizable_subtext;
    public final String subtext;
    public final String url_on_press;

    public enum Icon implements WireEnum {
        VERIFYING(1),
        VERIFICATION_FAILED(2),
        FAILURE(3),
        ACTION_REQUIRED(4);

        public final int value;
        public static final zzb Companion = new zzb(25);
        public static final ProfilePageUpsellComponentV2$Icon$Companion$ADAPTER$1 ADAPTER = new ProfilePageUpsellComponentV2$Icon$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Icon.class), Syntax.PROTO_2, null);

        Icon(int i) {
            this.value = i;
        }

        public static final Icon fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return VERIFYING;
            }
            if (i == 2) {
                return VERIFICATION_FAILED;
            }
            if (i == 3) {
                return FAILURE;
            }
            if (i != 4) {
                return null;
            }
            return ACTION_REQUIRED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes4.dex */
    public enum IconV2 implements WireEnum {
        UNKNOWN(0),
        VERIFYING_V2(1),
        VERIFICATION_FAILED_V2(2),
        FAILURE_V2(3),
        ACTION_REQUIRED_V2(4),
        SECURITY_CHECK_OUTLINE(5);

        public static final ProfilePageUpsellComponentV2$IconV2$Companion$ADAPTER$1 ADAPTER;
        public static final zzc Companion;
        public final int value;

        static {
            IconV2 iconV2 = UNKNOWN;
            Companion = new zzc(25);
            ADAPTER = new ProfilePageUpsellComponentV2$IconV2$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(IconV2.class), Syntax.PROTO_2, iconV2);
        }

        IconV2(int i) {
            this.value = i;
        }

        public static final IconV2 fromValue(int i) {
            Companion.getClass();
            return zzc.m2068fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        ProfilePageUpsellComponentV2$Companion$ADAPTER$1 profilePageUpsellComponentV2$Companion$ADAPTER$1 = new ProfilePageUpsellComponentV2$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ProfilePageUpsellComponentV2.class), "type.googleapis.com/squareup.cash.idv.ProfilePageUpsellComponentV2", Syntax.PROTO_2, null, "squareup/cash/idv/ProfilePageUpsellComponentV2.proto");
        ADAPTER = profilePageUpsellComponentV2$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(profilePageUpsellComponentV2$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePageUpsellComponentV2(Icon icon, String str, String str2, String str3, String str4, IconV2 iconV2, LocalizableString localizableString, LocalizableString localizableString2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.icon = icon;
        this.header_text = str;
        this.subtext = str2;
        this.url_on_press = str3;
        this.entity_id = str4;
        this.icon_v2 = iconV2;
        this.localizable_header_text = localizableString;
        this.localizable_subtext = localizableString2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfilePageUpsellComponentV2)) {
            return false;
        }
        ProfilePageUpsellComponentV2 profilePageUpsellComponentV2 = (ProfilePageUpsellComponentV2) obj;
        return Intrinsics.areEqual(unknownFields(), profilePageUpsellComponentV2.unknownFields()) && this.icon == profilePageUpsellComponentV2.icon && Intrinsics.areEqual(this.header_text, profilePageUpsellComponentV2.header_text) && Intrinsics.areEqual(this.subtext, profilePageUpsellComponentV2.subtext) && Intrinsics.areEqual(this.url_on_press, profilePageUpsellComponentV2.url_on_press) && Intrinsics.areEqual(this.entity_id, profilePageUpsellComponentV2.entity_id) && this.icon_v2 == profilePageUpsellComponentV2.icon_v2 && Intrinsics.areEqual(this.localizable_header_text, profilePageUpsellComponentV2.localizable_header_text) && Intrinsics.areEqual(this.localizable_subtext, profilePageUpsellComponentV2.localizable_subtext);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Icon icon = this.icon;
        int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
        String str = this.header_text;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.subtext;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.url_on_press;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.entity_id;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        IconV2 iconV2 = this.icon_v2;
        int hashCode7 = (hashCode6 + (iconV2 != null ? iconV2.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localizable_header_text;
        int hashCode8 = (hashCode7 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
        LocalizableString localizableString2 = this.localizable_subtext;
        int hashCode9 = hashCode8 + (localizableString2 != null ? localizableString2.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Badge.Builder builder = new Badge.Builder(2, false);
        builder.external_version = this.icon;
        builder.external_token = this.header_text;
        builder.customer_token = this.subtext;
        builder.updated_at = this.url_on_press;
        builder.created_at = this.entity_id;
        builder.is_badged = this.icon_v2;
        builder.item_type = this.localizable_header_text;
        builder.count_groups = this.localizable_subtext;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Icon icon = this.icon;
        if (icon != null) {
            arrayList.add("icon=" + icon);
        }
        String str = this.header_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "header_text=", arrayList);
        }
        String str2 = this.subtext;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtext=", arrayList);
        }
        String str3 = this.url_on_press;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "url_on_press=", arrayList);
        }
        String str4 = this.entity_id;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "entity_id=", arrayList);
        }
        IconV2 iconV2 = this.icon_v2;
        if (iconV2 != null) {
            arrayList.add("icon_v2=" + iconV2);
        }
        LocalizableString localizableString = this.localizable_header_text;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_header_text=", localizableString, arrayList);
        }
        LocalizableString localizableString2 = this.localizable_subtext;
        if (localizableString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_subtext=", localizableString2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ProfilePageUpsellComponentV2{", "}", 0, null, null, 56);
    }
}
