package com.squareup.cash.remittances.syncvalue.v1;

import androidx.room.TransactorKt;
import com.squareup.cash.remittances.syncvalue.v1.InternationalPaymentsCountrySelectionSyncValue;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InternationalPaymentsCountrySelectionSyncValue$SupportedDestinationCountry$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        Object obj = InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.TapAction.CLIENT_ROUTE;
        long beginMessage = protoReader.beginMessage();
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = "";
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry((InternationalPaymentsCountrySelectionSyncValue.DestinationCountryInfo) obj5, (InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.DetailsSheet) obj2, (String) obj4, (InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.PhoneNumberSearchDetailsSheet) obj3, (InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.TapAction) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj5 = TransactorKt.decodeMessageOrMerge(InternationalPaymentsCountrySelectionSyncValue.DestinationCountryInfo.ADAPTER, protoReader, obj5);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.DetailsSheet.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj3 = TransactorKt.decodeMessageOrMerge(InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.PhoneNumberSearchDetailsSheet.ADAPTER, protoReader, obj3);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj = InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.TapAction.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry supportedDestinationCountry = (InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry) obj;
        reverseProtoWriter.getClass();
        supportedDestinationCountry.getClass();
        ByteString unknownFields = supportedDestinationCountry.unknownFields();
        String str = supportedDestinationCountry.client_route_url;
        reverseProtoWriter.writeBytes(unknownFields);
        InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.TapAction tapAction = supportedDestinationCountry.tap_action;
        if (tapAction != InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.TapAction.CLIENT_ROUTE) {
            InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 5, tapAction);
        }
        InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.PhoneNumberSearchDetailsSheet phoneNumberSearchDetailsSheet = supportedDestinationCountry.phone_number_search_details_sheet;
        if (phoneNumberSearchDetailsSheet != null) {
            InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.PhoneNumberSearchDetailsSheet.ADAPTER.encodeWithTag(reverseProtoWriter, 4, phoneNumberSearchDetailsSheet);
        }
        if (!Intrinsics.areEqual(str, "")) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, str);
        }
        InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.DetailsSheet detailsSheet = supportedDestinationCountry.details_sheet;
        if (detailsSheet != null) {
            InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.DetailsSheet.ADAPTER.encodeWithTag(reverseProtoWriter, 2, detailsSheet);
        }
        InternationalPaymentsCountrySelectionSyncValue.DestinationCountryInfo destinationCountryInfo = supportedDestinationCountry.country_info;
        if (destinationCountryInfo != null) {
            InternationalPaymentsCountrySelectionSyncValue.DestinationCountryInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 1, destinationCountryInfo);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry supportedDestinationCountry = (InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry) obj;
        supportedDestinationCountry.getClass();
        ByteString unknownFields = supportedDestinationCountry.unknownFields();
        String str = supportedDestinationCountry.client_route_url;
        int size$okio = unknownFields.getSize$okio();
        InternationalPaymentsCountrySelectionSyncValue.DestinationCountryInfo destinationCountryInfo = supportedDestinationCountry.country_info;
        if (destinationCountryInfo != null) {
            size$okio += InternationalPaymentsCountrySelectionSyncValue.DestinationCountryInfo.ADAPTER.encodedSizeWithTag(1, destinationCountryInfo);
        }
        InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.DetailsSheet detailsSheet = supportedDestinationCountry.details_sheet;
        if (detailsSheet != null) {
            size$okio += InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.DetailsSheet.ADAPTER.encodedSizeWithTag(2, detailsSheet);
        }
        if (!Intrinsics.areEqual(str, "")) {
            size$okio += ProtoAdapter.STRING.encodedSizeWithTag(3, str);
        }
        InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.PhoneNumberSearchDetailsSheet phoneNumberSearchDetailsSheet = supportedDestinationCountry.phone_number_search_details_sheet;
        if (phoneNumberSearchDetailsSheet != null) {
            size$okio += InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.PhoneNumberSearchDetailsSheet.ADAPTER.encodedSizeWithTag(4, phoneNumberSearchDetailsSheet);
        }
        InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.TapAction tapAction = supportedDestinationCountry.tap_action;
        return tapAction != InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.TapAction.CLIENT_ROUTE ? InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.TapAction.ADAPTER.encodedSizeWithTag(5, tapAction) + size$okio : size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry supportedDestinationCountry = (InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry) obj;
        supportedDestinationCountry.getClass();
        InternationalPaymentsCountrySelectionSyncValue.DestinationCountryInfo destinationCountryInfo = supportedDestinationCountry.country_info;
        InternationalPaymentsCountrySelectionSyncValue.DestinationCountryInfo destinationCountryInfo2 = destinationCountryInfo != null ? (InternationalPaymentsCountrySelectionSyncValue.DestinationCountryInfo) InternationalPaymentsCountrySelectionSyncValue.DestinationCountryInfo.ADAPTER.redact(destinationCountryInfo) : null;
        InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.DetailsSheet detailsSheet = supportedDestinationCountry.details_sheet;
        InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.DetailsSheet detailsSheet2 = detailsSheet != null ? (InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.DetailsSheet) InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.DetailsSheet.ADAPTER.redact(detailsSheet) : null;
        InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.PhoneNumberSearchDetailsSheet phoneNumberSearchDetailsSheet = supportedDestinationCountry.phone_number_search_details_sheet;
        InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.PhoneNumberSearchDetailsSheet phoneNumberSearchDetailsSheet2 = phoneNumberSearchDetailsSheet != null ? (InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.PhoneNumberSearchDetailsSheet) InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.PhoneNumberSearchDetailsSheet.ADAPTER.redact(phoneNumberSearchDetailsSheet) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = supportedDestinationCountry.client_route_url;
        InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.TapAction tapAction = supportedDestinationCountry.tap_action;
        str.getClass();
        tapAction.getClass();
        byteString.getClass();
        return new InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry(destinationCountryInfo2, detailsSheet2, str, phoneNumberSearchDetailsSheet2, tapAction, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry supportedDestinationCountry = (InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry) obj;
        supportedDestinationCountry.getClass();
        InternationalPaymentsCountrySelectionSyncValue.DestinationCountryInfo destinationCountryInfo = supportedDestinationCountry.country_info;
        String str = supportedDestinationCountry.client_route_url;
        if (destinationCountryInfo != null) {
            InternationalPaymentsCountrySelectionSyncValue.DestinationCountryInfo.ADAPTER.encodeWithTag(protoWriter, 1, destinationCountryInfo);
        }
        InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.DetailsSheet detailsSheet = supportedDestinationCountry.details_sheet;
        if (detailsSheet != null) {
            InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.DetailsSheet.ADAPTER.encodeWithTag(protoWriter, 2, detailsSheet);
        }
        if (!Intrinsics.areEqual(str, "")) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, str);
        }
        InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.PhoneNumberSearchDetailsSheet phoneNumberSearchDetailsSheet = supportedDestinationCountry.phone_number_search_details_sheet;
        if (phoneNumberSearchDetailsSheet != null) {
            InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.PhoneNumberSearchDetailsSheet.ADAPTER.encodeWithTag(protoWriter, 4, phoneNumberSearchDetailsSheet);
        }
        InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.TapAction tapAction = supportedDestinationCountry.tap_action;
        if (tapAction != InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.TapAction.CLIENT_ROUTE) {
            InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.TapAction.ADAPTER.encodeWithTag(protoWriter, 5, tapAction);
        }
        protoWriter.writeBytes(supportedDestinationCountry.unknownFields());
    }
}
