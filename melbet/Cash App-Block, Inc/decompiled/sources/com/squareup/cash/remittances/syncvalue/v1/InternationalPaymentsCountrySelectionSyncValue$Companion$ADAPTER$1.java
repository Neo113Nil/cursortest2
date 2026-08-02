package com.squareup.cash.remittances.syncvalue.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.remittances.syncvalue.v1.InternationalPaymentsCountrySelectionSyncValue;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InternationalPaymentsCountrySelectionSyncValue$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = "";
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        long j = 0;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InternationalPaymentsCountrySelectionSyncValue((String) obj, (LocalizedString) obj2, (LocalizedString) obj5, (LocalizedString) obj6, (LocalizedString) obj3, (LocalizedString) obj4, m, arrayList, j, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
                    break;
                case 4:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj6);
                    break;
                case 5:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
                    break;
                case 6:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
                    break;
                case 7:
                    m.add(InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    arrayList.add(InternationalPaymentsCountrySelectionSyncValue.DestinationCountryInfo.ADAPTER.decode(protoReader));
                    break;
                case 9:
                    j = ((Number) ProtoAdapter.INT64.decode(protoReader)).longValue();
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InternationalPaymentsCountrySelectionSyncValue internationalPaymentsCountrySelectionSyncValue = (InternationalPaymentsCountrySelectionSyncValue) obj;
        reverseProtoWriter.getClass();
        internationalPaymentsCountrySelectionSyncValue.getClass();
        ByteString unknownFields = internationalPaymentsCountrySelectionSyncValue.unknownFields();
        String str = internationalPaymentsCountrySelectionSyncValue.variant_name;
        reverseProtoWriter.writeBytes(unknownFields);
        long j = internationalPaymentsCountrySelectionSyncValue.last_updated_epoch_seconds;
        if (j != 0) {
            ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 9, Long.valueOf(j));
        }
        InternationalPaymentsCountrySelectionSyncValue.DestinationCountryInfo.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 8, internationalPaymentsCountrySelectionSyncValue.unsupported_destination_countries);
        InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 7, internationalPaymentsCountrySelectionSyncValue.supported_destination_countries);
        LocalizedString localizedString = internationalPaymentsCountrySelectionSyncValue.requested_notification_accessibility_label;
        if (localizedString != null) {
            LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 6, localizedString);
        }
        LocalizedString localizedString2 = internationalPaymentsCountrySelectionSyncValue.request_notification_button_title;
        if (localizedString2 != null) {
            LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 5, localizedString2);
        }
        LocalizedString localizedString3 = internationalPaymentsCountrySelectionSyncValue.unsupported_header_text;
        if (localizedString3 != null) {
            LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 4, localizedString3);
        }
        LocalizedString localizedString4 = internationalPaymentsCountrySelectionSyncValue.subtitle;
        if (localizedString4 != null) {
            LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 3, localizedString4);
        }
        LocalizedString localizedString5 = internationalPaymentsCountrySelectionSyncValue.title;
        if (localizedString5 != null) {
            LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, localizedString5);
        }
        if (Intrinsics.areEqual(str, "")) {
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, str);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InternationalPaymentsCountrySelectionSyncValue internationalPaymentsCountrySelectionSyncValue = (InternationalPaymentsCountrySelectionSyncValue) obj;
        internationalPaymentsCountrySelectionSyncValue.getClass();
        int size$okio = internationalPaymentsCountrySelectionSyncValue.unknownFields().getSize$okio();
        String str = internationalPaymentsCountrySelectionSyncValue.variant_name;
        if (!Intrinsics.areEqual(str, "")) {
            size$okio += ProtoAdapter.STRING.encodedSizeWithTag(1, str);
        }
        LocalizedString localizedString = internationalPaymentsCountrySelectionSyncValue.title;
        if (localizedString != null) {
            size$okio += LocalizedString.ADAPTER.encodedSizeWithTag(2, localizedString);
        }
        LocalizedString localizedString2 = internationalPaymentsCountrySelectionSyncValue.subtitle;
        if (localizedString2 != null) {
            size$okio += LocalizedString.ADAPTER.encodedSizeWithTag(3, localizedString2);
        }
        LocalizedString localizedString3 = internationalPaymentsCountrySelectionSyncValue.unsupported_header_text;
        if (localizedString3 != null) {
            size$okio += LocalizedString.ADAPTER.encodedSizeWithTag(4, localizedString3);
        }
        LocalizedString localizedString4 = internationalPaymentsCountrySelectionSyncValue.request_notification_button_title;
        if (localizedString4 != null) {
            size$okio += LocalizedString.ADAPTER.encodedSizeWithTag(5, localizedString4);
        }
        LocalizedString localizedString5 = internationalPaymentsCountrySelectionSyncValue.requested_notification_accessibility_label;
        if (localizedString5 != null) {
            size$okio += LocalizedString.ADAPTER.encodedSizeWithTag(6, localizedString5);
        }
        int encodedSizeWithTag = InternationalPaymentsCountrySelectionSyncValue.DestinationCountryInfo.ADAPTER.asRepeated().encodedSizeWithTag(8, internationalPaymentsCountrySelectionSyncValue.unsupported_destination_countries) + InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.ADAPTER.asRepeated().encodedSizeWithTag(7, internationalPaymentsCountrySelectionSyncValue.supported_destination_countries) + size$okio;
        long j = internationalPaymentsCountrySelectionSyncValue.last_updated_epoch_seconds;
        return j != 0 ? ProtoAdapter.INT64.encodedSizeWithTag(9, Long.valueOf(j)) + encodedSizeWithTag : encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InternationalPaymentsCountrySelectionSyncValue internationalPaymentsCountrySelectionSyncValue = (InternationalPaymentsCountrySelectionSyncValue) obj;
        internationalPaymentsCountrySelectionSyncValue.getClass();
        LocalizedString localizedString = internationalPaymentsCountrySelectionSyncValue.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = internationalPaymentsCountrySelectionSyncValue.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = internationalPaymentsCountrySelectionSyncValue.unsupported_header_text;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        LocalizedString localizedString7 = internationalPaymentsCountrySelectionSyncValue.request_notification_button_title;
        LocalizedString localizedString8 = localizedString7 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString7) : null;
        LocalizedString localizedString9 = internationalPaymentsCountrySelectionSyncValue.requested_notification_accessibility_label;
        LocalizedString localizedString10 = localizedString9 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString9) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(internationalPaymentsCountrySelectionSyncValue.supported_destination_countries, InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(internationalPaymentsCountrySelectionSyncValue.unsupported_destination_countries, InternationalPaymentsCountrySelectionSyncValue.DestinationCountryInfo.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = internationalPaymentsCountrySelectionSyncValue.variant_name;
        long j = internationalPaymentsCountrySelectionSyncValue.last_updated_epoch_seconds;
        str.getClass();
        byteString.getClass();
        return new InternationalPaymentsCountrySelectionSyncValue(str, localizedString2, localizedString4, localizedString6, localizedString8, localizedString10, m1169redactElements, m1169redactElements2, j, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InternationalPaymentsCountrySelectionSyncValue internationalPaymentsCountrySelectionSyncValue = (InternationalPaymentsCountrySelectionSyncValue) obj;
        internationalPaymentsCountrySelectionSyncValue.getClass();
        String str = internationalPaymentsCountrySelectionSyncValue.variant_name;
        if (!Intrinsics.areEqual(str, "")) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, str);
        }
        LocalizedString localizedString = internationalPaymentsCountrySelectionSyncValue.title;
        if (localizedString != null) {
            LocalizedString.ADAPTER.encodeWithTag(protoWriter, 2, localizedString);
        }
        LocalizedString localizedString2 = internationalPaymentsCountrySelectionSyncValue.subtitle;
        if (localizedString2 != null) {
            LocalizedString.ADAPTER.encodeWithTag(protoWriter, 3, localizedString2);
        }
        LocalizedString localizedString3 = internationalPaymentsCountrySelectionSyncValue.unsupported_header_text;
        if (localizedString3 != null) {
            LocalizedString.ADAPTER.encodeWithTag(protoWriter, 4, localizedString3);
        }
        LocalizedString localizedString4 = internationalPaymentsCountrySelectionSyncValue.request_notification_button_title;
        if (localizedString4 != null) {
            LocalizedString.ADAPTER.encodeWithTag(protoWriter, 5, localizedString4);
        }
        LocalizedString localizedString5 = internationalPaymentsCountrySelectionSyncValue.requested_notification_accessibility_label;
        if (localizedString5 != null) {
            LocalizedString.ADAPTER.encodeWithTag(protoWriter, 6, localizedString5);
        }
        InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, internationalPaymentsCountrySelectionSyncValue.supported_destination_countries);
        InternationalPaymentsCountrySelectionSyncValue.DestinationCountryInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, internationalPaymentsCountrySelectionSyncValue.unsupported_destination_countries);
        long j = internationalPaymentsCountrySelectionSyncValue.last_updated_epoch_seconds;
        if (j != 0) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 9, Long.valueOf(j));
        }
        protoWriter.writeBytes(internationalPaymentsCountrySelectionSyncValue.unknownFields());
    }
}
