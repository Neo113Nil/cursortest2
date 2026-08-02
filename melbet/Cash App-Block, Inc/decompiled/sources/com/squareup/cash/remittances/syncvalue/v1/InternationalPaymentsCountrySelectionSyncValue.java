package com.squareup.cash.remittances.syncvalue.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.Node;
import com.squareup.lending.CashCreditScoreEntryPointData;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.OfferTimelineSheet;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.paychecks.PaychecksHomeUi;

/* loaded from: classes7.dex */
public final class InternationalPaymentsCountrySelectionSyncValue extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InternationalPaymentsCountrySelectionSyncValue> CREATOR;
    public final long last_updated_epoch_seconds;
    public final LocalizedString request_notification_button_title;
    public final LocalizedString requested_notification_accessibility_label;
    public final LocalizedString subtitle;
    public final List supported_destination_countries;
    public final LocalizedString title;
    public final List unsupported_destination_countries;
    public final LocalizedString unsupported_header_text;
    public final String variant_name;

    public final class Builder extends Message.Builder {
        public long last_updated_epoch_seconds;
        public LocalizedString request_notification_button_title;
        public LocalizedString requested_notification_accessibility_label;
        public LocalizedString subtitle;
        public List supported_destination_countries;
        public LocalizedString title;
        public List unsupported_destination_countries;
        public LocalizedString unsupported_header_text;
        public String variant_name;

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            return new InternationalPaymentsCountrySelectionSyncValue(this.variant_name, this.title, this.subtitle, this.unsupported_header_text, this.request_notification_button_title, this.requested_notification_accessibility_label, this.supported_destination_countries, this.unsupported_destination_countries, this.last_updated_epoch_seconds, buildUnknownFields());
        }
    }

    public final class DestinationCountryInfo extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DestinationCountryInfo> CREATOR;
        public final String avatar_emoji;
        public final LocalizedString currency_display;
        public final LocalizedString display_name;
        public final String identifier;

        static {
            InternationalPaymentsCountrySelectionSyncValue$DestinationCountryInfo$Companion$ADAPTER$1 internationalPaymentsCountrySelectionSyncValue$DestinationCountryInfo$Companion$ADAPTER$1 = new InternationalPaymentsCountrySelectionSyncValue$DestinationCountryInfo$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DestinationCountryInfo.class), "type.googleapis.com/squareup.cash.remittances.syncvalue.v1.InternationalPaymentsCountrySelectionSyncValue.DestinationCountryInfo", Syntax.PROTO_3, null, "squareup/cash/remittances/syncvalue/v1/international_payments_country_selection_sync_value.proto");
            ADAPTER = internationalPaymentsCountrySelectionSyncValue$DestinationCountryInfo$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(internationalPaymentsCountrySelectionSyncValue$DestinationCountryInfo$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DestinationCountryInfo(LocalizedString localizedString, LocalizedString localizedString2, String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            str.getClass();
            str2.getClass();
            byteString.getClass();
            this.identifier = str;
            this.avatar_emoji = str2;
            this.display_name = localizedString;
            this.currency_display = localizedString2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DestinationCountryInfo)) {
                return false;
            }
            DestinationCountryInfo destinationCountryInfo = (DestinationCountryInfo) obj;
            return Intrinsics.areEqual(unknownFields(), destinationCountryInfo.unknownFields()) && Intrinsics.areEqual(this.identifier, destinationCountryInfo.identifier) && Intrinsics.areEqual(this.avatar_emoji, destinationCountryInfo.avatar_emoji) && Intrinsics.areEqual(this.display_name, destinationCountryInfo.display_name) && Intrinsics.areEqual(this.currency_display, destinationCountryInfo.currency_display);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.identifier), 37, this.avatar_emoji);
            LocalizedString localizedString = this.display_name;
            int hashCode = (m + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.currency_display;
            int hashCode2 = hashCode + (localizedString2 != null ? localizedString2.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            OfferTimelineSheet.LineItem.Builder builder = new OfferTimelineSheet.LineItem.Builder(1);
            builder.title = this.identifier;
            builder.subtitle = this.avatar_emoji;
            builder.l_title = this.display_name;
            builder.l_subtitle = this.currency_display;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            BalanceFeedKt$$ExternalSyntheticOutline0.m(this.identifier, "identifier=", arrayList);
            BalanceFeedKt$$ExternalSyntheticOutline0.m(this.avatar_emoji, "avatar_emoji=", arrayList);
            LocalizedString localizedString = this.display_name;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("display_name=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.currency_display;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("currency_display=", localizedString2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DestinationCountryInfo{", "}", 0, null, null, 56);
        }
    }

    public final class SupportedDestinationCountry extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SupportedDestinationCountry> CREATOR;
        public final String client_route_url;
        public final DestinationCountryInfo country_info;
        public final DetailsSheet details_sheet;
        public final PhoneNumberSearchDetailsSheet phone_number_search_details_sheet;
        public final TapAction tap_action;

        public final class DetailsSheet extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<DetailsSheet> CREATOR;
            public final LocalizedString detail_text;
            public final LocalizedString dismiss_button_label;
            public final LocalizedString title;

            static {
                InternationalPaymentsCountrySelectionSyncValue$SupportedDestinationCountry$DetailsSheet$Companion$ADAPTER$1 internationalPaymentsCountrySelectionSyncValue$SupportedDestinationCountry$DetailsSheet$Companion$ADAPTER$1 = new InternationalPaymentsCountrySelectionSyncValue$SupportedDestinationCountry$DetailsSheet$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DetailsSheet.class), "type.googleapis.com/squareup.cash.remittances.syncvalue.v1.InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.DetailsSheet", Syntax.PROTO_3, null, "squareup/cash/remittances/syncvalue/v1/international_payments_country_selection_sync_value.proto");
                ADAPTER = internationalPaymentsCountrySelectionSyncValue$SupportedDestinationCountry$DetailsSheet$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(internationalPaymentsCountrySelectionSyncValue$SupportedDestinationCountry$DetailsSheet$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DetailsSheet(LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.title = localizedString;
                this.detail_text = localizedString2;
                this.dismiss_button_label = localizedString3;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof DetailsSheet)) {
                    return false;
                }
                DetailsSheet detailsSheet = (DetailsSheet) obj;
                return Intrinsics.areEqual(unknownFields(), detailsSheet.unknownFields()) && Intrinsics.areEqual(this.title, detailsSheet.title) && Intrinsics.areEqual(this.detail_text, detailsSheet.detail_text) && Intrinsics.areEqual(this.dismiss_button_label, detailsSheet.dismiss_button_label);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalizedString localizedString = this.title;
                int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                LocalizedString localizedString2 = this.detail_text;
                int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                LocalizedString localizedString3 = this.dismiss_button_label;
                int hashCode4 = hashCode3 + (localizedString3 != null ? localizedString3.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                CashCreditScoreEntryPointData.InstalledState.Subtitle.Builder builder = new CashCreditScoreEntryPointData.InstalledState.Subtitle.Builder(1);
                builder.emphasis = this.title;
                builder.brief = this.detail_text;
                builder.accessibility_description = this.dismiss_button_label;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                LocalizedString localizedString = this.title;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
                }
                LocalizedString localizedString2 = this.detail_text;
                if (localizedString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("detail_text=", localizedString2, arrayList);
                }
                LocalizedString localizedString3 = this.dismiss_button_label;
                if (localizedString3 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("dismiss_button_label=", localizedString3, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "DetailsSheet{", "}", 0, null, null, 56);
            }
        }

        public final class PhoneNumberSearchDetailsSheet extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<PhoneNumberSearchDetailsSheet> CREATOR;
            public final LocalizedString detail_text;
            public final LocalizedString dismiss_button_label;
            public final LocalizedString non_contact_subtitle;
            public final LocalizedString primary_button_label;
            public final LocalizedString title;

            static {
                InternationalPaymentsCountrySelectionSyncValue$SupportedDestinationCountry$PhoneNumberSearchDetailsSheet$Companion$ADAPTER$1 internationalPaymentsCountrySelectionSyncValue$SupportedDestinationCountry$PhoneNumberSearchDetailsSheet$Companion$ADAPTER$1 = new InternationalPaymentsCountrySelectionSyncValue$SupportedDestinationCountry$PhoneNumberSearchDetailsSheet$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PhoneNumberSearchDetailsSheet.class), "type.googleapis.com/squareup.cash.remittances.syncvalue.v1.InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.PhoneNumberSearchDetailsSheet", Syntax.PROTO_3, null, "squareup/cash/remittances/syncvalue/v1/international_payments_country_selection_sync_value.proto");
                ADAPTER = internationalPaymentsCountrySelectionSyncValue$SupportedDestinationCountry$PhoneNumberSearchDetailsSheet$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(internationalPaymentsCountrySelectionSyncValue$SupportedDestinationCountry$PhoneNumberSearchDetailsSheet$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PhoneNumberSearchDetailsSheet(LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, LocalizedString localizedString4, LocalizedString localizedString5, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.title = localizedString;
                this.detail_text = localizedString2;
                this.primary_button_label = localizedString3;
                this.dismiss_button_label = localizedString4;
                this.non_contact_subtitle = localizedString5;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof PhoneNumberSearchDetailsSheet)) {
                    return false;
                }
                PhoneNumberSearchDetailsSheet phoneNumberSearchDetailsSheet = (PhoneNumberSearchDetailsSheet) obj;
                return Intrinsics.areEqual(unknownFields(), phoneNumberSearchDetailsSheet.unknownFields()) && Intrinsics.areEqual(this.title, phoneNumberSearchDetailsSheet.title) && Intrinsics.areEqual(this.detail_text, phoneNumberSearchDetailsSheet.detail_text) && Intrinsics.areEqual(this.primary_button_label, phoneNumberSearchDetailsSheet.primary_button_label) && Intrinsics.areEqual(this.dismiss_button_label, phoneNumberSearchDetailsSheet.dismiss_button_label) && Intrinsics.areEqual(this.non_contact_subtitle, phoneNumberSearchDetailsSheet.non_contact_subtitle);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalizedString localizedString = this.title;
                int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                LocalizedString localizedString2 = this.detail_text;
                int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                LocalizedString localizedString3 = this.primary_button_label;
                int hashCode4 = (hashCode3 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
                LocalizedString localizedString4 = this.dismiss_button_label;
                int hashCode5 = (hashCode4 + (localizedString4 != null ? localizedString4.hashCode() : 0)) * 37;
                LocalizedString localizedString5 = this.non_contact_subtitle;
                int hashCode6 = hashCode5 + (localizedString5 != null ? localizedString5.hashCode() : 0);
                this.hashCode = hashCode6;
                return hashCode6;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                PaychecksHomeUi.ActivitySection.Builder builder = new PaychecksHomeUi.ActivitySection.Builder(1);
                builder.title = this.title;
                builder.no_activity_subtitle = this.detail_text;
                builder.load_failure_subtitle = this.primary_button_label;
                builder.view_all_button_title = this.dismiss_button_label;
                builder.stale_activity_title = this.non_contact_subtitle;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                LocalizedString localizedString = this.title;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
                }
                LocalizedString localizedString2 = this.detail_text;
                if (localizedString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("detail_text=", localizedString2, arrayList);
                }
                LocalizedString localizedString3 = this.primary_button_label;
                if (localizedString3 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("primary_button_label=", localizedString3, arrayList);
                }
                LocalizedString localizedString4 = this.dismiss_button_label;
                if (localizedString4 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("dismiss_button_label=", localizedString4, arrayList);
                }
                LocalizedString localizedString5 = this.non_contact_subtitle;
                if (localizedString5 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("non_contact_subtitle=", localizedString5, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "PhoneNumberSearchDetailsSheet{", "}", 0, null, null, 56);
            }
        }

        public enum TapAction implements WireEnum {
            CLIENT_ROUTE(0),
            INITIATE_REMITTANCE(1);

            public static final InternationalPaymentsCountrySelectionSyncValue$SupportedDestinationCountry$TapAction$Companion$ADAPTER$1 ADAPTER;
            public static final Error.Code.Companion Companion;
            public final int value;

            static {
                TapAction tapAction = CLIENT_ROUTE;
                Companion = new Error.Code.Companion(9);
                ADAPTER = new InternationalPaymentsCountrySelectionSyncValue$SupportedDestinationCountry$TapAction$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TapAction.class), Syntax.PROTO_3, tapAction);
            }

            TapAction(int i) {
                this.value = i;
            }

            public static final TapAction fromValue(int i) {
                Companion.getClass();
                if (i == 0) {
                    return CLIENT_ROUTE;
                }
                if (i != 1) {
                    return null;
                }
                return INITIATE_REMITTANCE;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            InternationalPaymentsCountrySelectionSyncValue$SupportedDestinationCountry$Companion$ADAPTER$1 internationalPaymentsCountrySelectionSyncValue$SupportedDestinationCountry$Companion$ADAPTER$1 = new InternationalPaymentsCountrySelectionSyncValue$SupportedDestinationCountry$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SupportedDestinationCountry.class), "type.googleapis.com/squareup.cash.remittances.syncvalue.v1.InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry", Syntax.PROTO_3, null, "squareup/cash/remittances/syncvalue/v1/international_payments_country_selection_sync_value.proto");
            ADAPTER = internationalPaymentsCountrySelectionSyncValue$SupportedDestinationCountry$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(internationalPaymentsCountrySelectionSyncValue$SupportedDestinationCountry$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SupportedDestinationCountry(DestinationCountryInfo destinationCountryInfo, DetailsSheet detailsSheet, String str, PhoneNumberSearchDetailsSheet phoneNumberSearchDetailsSheet, TapAction tapAction, ByteString byteString) {
            super(ADAPTER, byteString);
            str.getClass();
            tapAction.getClass();
            byteString.getClass();
            this.country_info = destinationCountryInfo;
            this.details_sheet = detailsSheet;
            this.client_route_url = str;
            this.phone_number_search_details_sheet = phoneNumberSearchDetailsSheet;
            this.tap_action = tapAction;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SupportedDestinationCountry)) {
                return false;
            }
            SupportedDestinationCountry supportedDestinationCountry = (SupportedDestinationCountry) obj;
            return Intrinsics.areEqual(unknownFields(), supportedDestinationCountry.unknownFields()) && Intrinsics.areEqual(this.country_info, supportedDestinationCountry.country_info) && Intrinsics.areEqual(this.details_sheet, supportedDestinationCountry.details_sheet) && Intrinsics.areEqual(this.client_route_url, supportedDestinationCountry.client_route_url) && Intrinsics.areEqual(this.phone_number_search_details_sheet, supportedDestinationCountry.phone_number_search_details_sheet) && this.tap_action == supportedDestinationCountry.tap_action;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            DestinationCountryInfo destinationCountryInfo = this.country_info;
            int hashCode2 = (hashCode + (destinationCountryInfo != null ? destinationCountryInfo.hashCode() : 0)) * 37;
            DetailsSheet detailsSheet = this.details_sheet;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (detailsSheet != null ? detailsSheet.hashCode() : 0)) * 37, 37, this.client_route_url);
            PhoneNumberSearchDetailsSheet phoneNumberSearchDetailsSheet = this.phone_number_search_details_sheet;
            int hashCode3 = this.tap_action.hashCode() + ((m + (phoneNumberSearchDetailsSheet != null ? phoneNumberSearchDetailsSheet.hashCode() : 0)) * 37);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Node.Builder builder = new Node.Builder(8);
            builder.compose_platform = "";
            Error.Code.Companion companion = TapAction.Companion;
            builder.for_each = this.country_info;
            builder.moneybot_scaffold = this.details_sheet;
            builder.compose_platform = this.client_route_url;
            builder.is_included = this.phone_number_search_details_sheet;
            builder.motion = this.tap_action;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            DestinationCountryInfo destinationCountryInfo = this.country_info;
            if (destinationCountryInfo != null) {
                arrayList.add("country_info=" + destinationCountryInfo);
            }
            DetailsSheet detailsSheet = this.details_sheet;
            if (detailsSheet != null) {
                arrayList.add("details_sheet=" + detailsSheet);
            }
            BalanceFeedKt$$ExternalSyntheticOutline0.m(this.client_route_url, "client_route_url=", arrayList);
            PhoneNumberSearchDetailsSheet phoneNumberSearchDetailsSheet = this.phone_number_search_details_sheet;
            if (phoneNumberSearchDetailsSheet != null) {
                arrayList.add("phone_number_search_details_sheet=" + phoneNumberSearchDetailsSheet);
            }
            arrayList.add("tap_action=" + this.tap_action);
            return CollectionsKt.joinToString$default(arrayList, ", ", "SupportedDestinationCountry{", "}", 0, null, null, 56);
        }
    }

    static {
        InternationalPaymentsCountrySelectionSyncValue$Companion$ADAPTER$1 internationalPaymentsCountrySelectionSyncValue$Companion$ADAPTER$1 = new InternationalPaymentsCountrySelectionSyncValue$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InternationalPaymentsCountrySelectionSyncValue.class), "type.googleapis.com/squareup.cash.remittances.syncvalue.v1.InternationalPaymentsCountrySelectionSyncValue", Syntax.PROTO_3, null, "squareup/cash/remittances/syncvalue/v1/international_payments_country_selection_sync_value.proto");
        ADAPTER = internationalPaymentsCountrySelectionSyncValue$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(internationalPaymentsCountrySelectionSyncValue$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternationalPaymentsCountrySelectionSyncValue(String str, LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, LocalizedString localizedString4, LocalizedString localizedString5, List list, List list2, long j, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        list.getClass();
        list2.getClass();
        byteString.getClass();
        this.variant_name = str;
        this.title = localizedString;
        this.subtitle = localizedString2;
        this.unsupported_header_text = localizedString3;
        this.request_notification_button_title = localizedString4;
        this.requested_notification_accessibility_label = localizedString5;
        this.last_updated_epoch_seconds = j;
        this.supported_destination_countries = TransactorKt.immutableCopyOf("supported_destination_countries", list);
        this.unsupported_destination_countries = TransactorKt.immutableCopyOf("unsupported_destination_countries", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InternationalPaymentsCountrySelectionSyncValue)) {
            return false;
        }
        InternationalPaymentsCountrySelectionSyncValue internationalPaymentsCountrySelectionSyncValue = (InternationalPaymentsCountrySelectionSyncValue) obj;
        return Intrinsics.areEqual(unknownFields(), internationalPaymentsCountrySelectionSyncValue.unknownFields()) && Intrinsics.areEqual(this.variant_name, internationalPaymentsCountrySelectionSyncValue.variant_name) && Intrinsics.areEqual(this.title, internationalPaymentsCountrySelectionSyncValue.title) && Intrinsics.areEqual(this.subtitle, internationalPaymentsCountrySelectionSyncValue.subtitle) && Intrinsics.areEqual(this.unsupported_header_text, internationalPaymentsCountrySelectionSyncValue.unsupported_header_text) && Intrinsics.areEqual(this.request_notification_button_title, internationalPaymentsCountrySelectionSyncValue.request_notification_button_title) && Intrinsics.areEqual(this.requested_notification_accessibility_label, internationalPaymentsCountrySelectionSyncValue.requested_notification_accessibility_label) && Intrinsics.areEqual(this.supported_destination_countries, internationalPaymentsCountrySelectionSyncValue.supported_destination_countries) && Intrinsics.areEqual(this.unsupported_destination_countries, internationalPaymentsCountrySelectionSyncValue.unsupported_destination_countries) && this.last_updated_epoch_seconds == internationalPaymentsCountrySelectionSyncValue.last_updated_epoch_seconds;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.variant_name);
        LocalizedString localizedString = this.title;
        int hashCode = (m + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.subtitle;
        int hashCode2 = (hashCode + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        LocalizedString localizedString3 = this.unsupported_header_text;
        int hashCode3 = (hashCode2 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
        LocalizedString localizedString4 = this.request_notification_button_title;
        int hashCode4 = (hashCode3 + (localizedString4 != null ? localizedString4.hashCode() : 0)) * 37;
        LocalizedString localizedString5 = this.requested_notification_accessibility_label;
        int hashCode5 = Long.hashCode(this.last_updated_epoch_seconds) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (localizedString5 != null ? localizedString5.hashCode() : 0)) * 37, 37, this.supported_destination_countries), 37, this.unsupported_destination_countries);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.variant_name = this.variant_name;
        builder.title = this.title;
        builder.subtitle = this.subtitle;
        builder.unsupported_header_text = this.unsupported_header_text;
        builder.request_notification_button_title = this.request_notification_button_title;
        builder.requested_notification_accessibility_label = this.requested_notification_accessibility_label;
        builder.supported_destination_countries = this.supported_destination_countries;
        builder.unsupported_destination_countries = this.unsupported_destination_countries;
        builder.last_updated_epoch_seconds = this.last_updated_epoch_seconds;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.variant_name, "variant_name=", arrayList);
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.subtitle;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
        }
        LocalizedString localizedString3 = this.unsupported_header_text;
        if (localizedString3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("unsupported_header_text=", localizedString3, arrayList);
        }
        LocalizedString localizedString4 = this.request_notification_button_title;
        if (localizedString4 != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_notification_button_title=", localizedString4, arrayList);
        }
        LocalizedString localizedString5 = this.requested_notification_accessibility_label;
        if (localizedString5 != null) {
            Matcher$$ExternalSyntheticOutline0.m("requested_notification_accessibility_label=", localizedString5, arrayList);
        }
        List list = this.supported_destination_countries;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("supported_destination_countries=", arrayList, list);
        }
        List list2 = this.unsupported_destination_countries;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("unsupported_destination_countries=", arrayList, list2);
        }
        arrayList.add("last_updated_epoch_seconds=" + this.last_updated_epoch_seconds);
        return CollectionsKt.joinToString$default(arrayList, ", ", "InternationalPaymentsCountrySelectionSyncValue{", "}", 0, null, null, 56);
    }
}
