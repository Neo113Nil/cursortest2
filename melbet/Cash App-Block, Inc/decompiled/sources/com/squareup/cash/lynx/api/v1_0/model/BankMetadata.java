package com.squareup.cash.lynx.api.v1_0.model;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.cash.aliases.Cashtag;
import com.squareup.protos.cash.cashinstrumentstore.api.v1.cards.common.CardDetailsProto$DisplaySettings;
import com.squareup.protos.cash.janus.api.ContactAlias;
import com.squareup.protos.common.countries.Country;
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

/* loaded from: classes6.dex */
public final class BankMetadata extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BankMetadata> CREATOR;
    public final String bank_token;
    public final CardDetailsProto$DisplaySettings card_display_settings;
    public final Country country;
    public final DisplaySettings display_settings;
    public final String name;
    public final List navigation_urls;
    public final String short_name;

    public final class DisplaySettings extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DisplaySettings> CREATOR;
        public final String banner_icon_url;
        public final String color_card_icon_url;
        public final String detail_icon_url;
        public final Theme display_theme;
        public final String monochrome_card_icon_url;
        public final String selection_icon_url;
        public final String tab_card_icon_url;
        public final String tab_detail_icon_url;
        public final String tab_selection_icon_url;

        /* loaded from: classes7.dex */
        public final class Theme extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Theme> CREATOR;
            public final String accent_colour;
            public final String base_colour;

            static {
                BankMetadata$DisplaySettings$Theme$Companion$ADAPTER$1 bankMetadata$DisplaySettings$Theme$Companion$ADAPTER$1 = new BankMetadata$DisplaySettings$Theme$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Theme.class), "type.googleapis.com/squareup.cash.lynx.api.v1_0.model.BankMetadata.DisplaySettings.Theme", Syntax.PROTO_2, null, "squareup/cash/lynx/api/v1_0/model/EnrichedInstrumentLink.proto");
                ADAPTER = bankMetadata$DisplaySettings$Theme$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(bankMetadata$DisplaySettings$Theme$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Theme(String str, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.base_colour = str;
                this.accent_colour = str2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Theme)) {
                    return false;
                }
                Theme theme = (Theme) obj;
                return Intrinsics.areEqual(unknownFields(), theme.unknownFields()) && Intrinsics.areEqual(this.base_colour, theme.base_colour) && Intrinsics.areEqual(this.accent_colour, theme.accent_colour);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.base_colour;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.accent_colour;
                int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Cashtag.Builder builder = new Cashtag.Builder(2);
                builder.prefix = this.base_colour;
                builder.name = this.accent_colour;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.base_colour;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "base_colour=", arrayList);
                }
                String str2 = this.accent_colour;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "accent_colour=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Theme{", "}", 0, null, null, 56);
            }
        }

        static {
            BankMetadata$DisplaySettings$Companion$ADAPTER$1 bankMetadata$DisplaySettings$Companion$ADAPTER$1 = new BankMetadata$DisplaySettings$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DisplaySettings.class), "type.googleapis.com/squareup.cash.lynx.api.v1_0.model.BankMetadata.DisplaySettings", Syntax.PROTO_2, null, "squareup/cash/lynx/api/v1_0/model/EnrichedInstrumentLink.proto");
            ADAPTER = bankMetadata$DisplaySettings$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(bankMetadata$DisplaySettings$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplaySettings(Theme theme, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.display_theme = theme;
            this.monochrome_card_icon_url = str;
            this.color_card_icon_url = str2;
            this.tab_card_icon_url = str3;
            this.detail_icon_url = str4;
            this.tab_detail_icon_url = str5;
            this.selection_icon_url = str6;
            this.tab_selection_icon_url = str7;
            this.banner_icon_url = str8;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DisplaySettings)) {
                return false;
            }
            DisplaySettings displaySettings = (DisplaySettings) obj;
            return Intrinsics.areEqual(unknownFields(), displaySettings.unknownFields()) && Intrinsics.areEqual(this.display_theme, displaySettings.display_theme) && Intrinsics.areEqual(this.monochrome_card_icon_url, displaySettings.monochrome_card_icon_url) && Intrinsics.areEqual(this.color_card_icon_url, displaySettings.color_card_icon_url) && Intrinsics.areEqual(this.tab_card_icon_url, displaySettings.tab_card_icon_url) && Intrinsics.areEqual(this.detail_icon_url, displaySettings.detail_icon_url) && Intrinsics.areEqual(this.tab_detail_icon_url, displaySettings.tab_detail_icon_url) && Intrinsics.areEqual(this.selection_icon_url, displaySettings.selection_icon_url) && Intrinsics.areEqual(this.tab_selection_icon_url, displaySettings.tab_selection_icon_url) && Intrinsics.areEqual(this.banner_icon_url, displaySettings.banner_icon_url);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Theme theme = this.display_theme;
            int hashCode2 = (hashCode + (theme != null ? theme.hashCode() : 0)) * 37;
            String str = this.monochrome_card_icon_url;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.color_card_icon_url;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.tab_card_icon_url;
            int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.detail_icon_url;
            int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
            String str5 = this.tab_detail_icon_url;
            int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
            String str6 = this.selection_icon_url;
            int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 37;
            String str7 = this.tab_selection_icon_url;
            int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 37;
            String str8 = this.banner_icon_url;
            int hashCode10 = hashCode9 + (str8 != null ? str8.hashCode() : 0);
            this.hashCode = hashCode10;
            return hashCode10;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            PrepurchaseCashCardAppletData.Builder builder = new PrepurchaseCashCardAppletData.Builder(1, false);
            builder.locale = this.display_theme;
            builder.title = this.monochrome_card_icon_url;
            builder.info_rows_header = this.color_card_icon_url;
            builder.footer_text = this.tab_card_icon_url;
            builder.loadable_subtitle = this.detail_icon_url;
            builder.info_rows = this.tab_detail_icon_url;
            builder.primary_footer_button_state = this.selection_icon_url;
            builder.secondary_footer_button_state = this.tab_selection_icon_url;
            builder.payment_plans_data = this.banner_icon_url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Theme theme = this.display_theme;
            if (theme != null) {
                arrayList.add("display_theme=" + theme);
            }
            String str = this.monochrome_card_icon_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "monochrome_card_icon_url=", arrayList);
            }
            String str2 = this.color_card_icon_url;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "color_card_icon_url=", arrayList);
            }
            String str3 = this.tab_card_icon_url;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "tab_card_icon_url=", arrayList);
            }
            String str4 = this.detail_icon_url;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "detail_icon_url=", arrayList);
            }
            String str5 = this.tab_detail_icon_url;
            if (str5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "tab_detail_icon_url=", arrayList);
            }
            String str6 = this.selection_icon_url;
            if (str6 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "selection_icon_url=", arrayList);
            }
            String str7 = this.tab_selection_icon_url;
            if (str7 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "tab_selection_icon_url=", arrayList);
            }
            String str8 = this.banner_icon_url;
            if (str8 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "banner_icon_url=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DisplaySettings{", "}", 0, null, null, 56);
        }
    }

    static {
        BankMetadata$Companion$ADAPTER$1 bankMetadata$Companion$ADAPTER$1 = new BankMetadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BankMetadata.class), "type.googleapis.com/squareup.cash.lynx.api.v1_0.model.BankMetadata", Syntax.PROTO_2, null, "squareup/cash/lynx/api/v1_0/model/EnrichedInstrumentLink.proto");
        ADAPTER = bankMetadata$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(bankMetadata$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BankMetadata(String str, String str2, Country country, DisplaySettings displaySettings, String str3, List list, CardDetailsProto$DisplaySettings cardDetailsProto$DisplaySettings, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.name = str;
        this.short_name = str2;
        this.country = country;
        this.display_settings = displaySettings;
        this.bank_token = str3;
        this.card_display_settings = cardDetailsProto$DisplaySettings;
        this.navigation_urls = TransactorKt.immutableCopyOf("navigation_urls", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BankMetadata)) {
            return false;
        }
        BankMetadata bankMetadata = (BankMetadata) obj;
        return Intrinsics.areEqual(unknownFields(), bankMetadata.unknownFields()) && Intrinsics.areEqual(this.name, bankMetadata.name) && Intrinsics.areEqual(this.short_name, bankMetadata.short_name) && this.country == bankMetadata.country && Intrinsics.areEqual(this.display_settings, bankMetadata.display_settings) && Intrinsics.areEqual(this.bank_token, bankMetadata.bank_token) && Intrinsics.areEqual(this.navigation_urls, bankMetadata.navigation_urls) && Intrinsics.areEqual(this.card_display_settings, bankMetadata.card_display_settings);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.short_name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Country country = this.country;
        int hashCode4 = (hashCode3 + (country != null ? country.hashCode() : 0)) * 37;
        DisplaySettings displaySettings = this.display_settings;
        int hashCode5 = (hashCode4 + (displaySettings != null ? displaySettings.hashCode() : 0)) * 37;
        String str3 = this.bank_token;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37, 37, this.navigation_urls);
        CardDetailsProto$DisplaySettings cardDetailsProto$DisplaySettings = this.card_display_settings;
        int hashCode6 = m + (cardDetailsProto$DisplaySettings != null ? cardDetailsProto$DisplaySettings.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ContactAlias.Builder builder = new ContactAlias.Builder(2, false);
        builder.customer_token = this.name;
        builder.alias_value = this.short_name;
        builder.alias_type = this.country;
        builder.updated_at = this.display_settings;
        builder.hashed_alias_token = this.bank_token;
        builder.linked_at = this.navigation_urls;
        builder.version = this.card_display_settings;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
        }
        String str2 = this.short_name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "short_name=", arrayList);
        }
        Country country = this.country;
        if (country != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("country=", country, arrayList);
        }
        DisplaySettings displaySettings = this.display_settings;
        if (displaySettings != null) {
            arrayList.add("display_settings=" + displaySettings);
        }
        String str3 = this.bank_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "bank_token=", arrayList);
        }
        List list = this.navigation_urls;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("navigation_urls=", arrayList, list);
        }
        CardDetailsProto$DisplaySettings cardDetailsProto$DisplaySettings = this.card_display_settings;
        if (cardDetailsProto$DisplaySettings != null) {
            arrayList.add("card_display_settings=" + cardDetailsProto$DisplaySettings);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BankMetadata{", "}", 0, null, null, 56);
    }
}
