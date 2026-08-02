package com.squareup.cash.remittances.syncvalue.v1;

import androidx.room.TransactorKt;
import com.squareup.cash.remittances.syncvalue.v1.InternationalPaymentsCountrySelectionSyncValue;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InternationalPaymentsCountrySelectionSyncValue$SupportedDestinationCountry$PhoneNumberSearchDetailsSheet$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.PhoneNumberSearchDetailsSheet((LocalizedString) obj, (LocalizedString) obj2, (LocalizedString) obj3, (LocalizedString) obj4, (LocalizedString) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.PhoneNumberSearchDetailsSheet phoneNumberSearchDetailsSheet = (InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.PhoneNumberSearchDetailsSheet) obj;
        reverseProtoWriter.getClass();
        phoneNumberSearchDetailsSheet.getClass();
        reverseProtoWriter.writeBytes(phoneNumberSearchDetailsSheet.unknownFields());
        LocalizedString localizedString = phoneNumberSearchDetailsSheet.non_contact_subtitle;
        if (localizedString != null) {
            LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 5, localizedString);
        }
        LocalizedString localizedString2 = phoneNumberSearchDetailsSheet.dismiss_button_label;
        if (localizedString2 != null) {
            LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 4, localizedString2);
        }
        LocalizedString localizedString3 = phoneNumberSearchDetailsSheet.primary_button_label;
        if (localizedString3 != null) {
            LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 3, localizedString3);
        }
        LocalizedString localizedString4 = phoneNumberSearchDetailsSheet.detail_text;
        if (localizedString4 != null) {
            LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, localizedString4);
        }
        LocalizedString localizedString5 = phoneNumberSearchDetailsSheet.title;
        if (localizedString5 != null) {
            LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, localizedString5);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.PhoneNumberSearchDetailsSheet phoneNumberSearchDetailsSheet = (InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.PhoneNumberSearchDetailsSheet) obj;
        phoneNumberSearchDetailsSheet.getClass();
        int size$okio = phoneNumberSearchDetailsSheet.unknownFields().getSize$okio();
        LocalizedString localizedString = phoneNumberSearchDetailsSheet.title;
        if (localizedString != null) {
            size$okio += LocalizedString.ADAPTER.encodedSizeWithTag(1, localizedString);
        }
        LocalizedString localizedString2 = phoneNumberSearchDetailsSheet.detail_text;
        if (localizedString2 != null) {
            size$okio += LocalizedString.ADAPTER.encodedSizeWithTag(2, localizedString2);
        }
        LocalizedString localizedString3 = phoneNumberSearchDetailsSheet.primary_button_label;
        if (localizedString3 != null) {
            size$okio += LocalizedString.ADAPTER.encodedSizeWithTag(3, localizedString3);
        }
        LocalizedString localizedString4 = phoneNumberSearchDetailsSheet.dismiss_button_label;
        if (localizedString4 != null) {
            size$okio += LocalizedString.ADAPTER.encodedSizeWithTag(4, localizedString4);
        }
        LocalizedString localizedString5 = phoneNumberSearchDetailsSheet.non_contact_subtitle;
        return localizedString5 != null ? LocalizedString.ADAPTER.encodedSizeWithTag(5, localizedString5) + size$okio : size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.PhoneNumberSearchDetailsSheet phoneNumberSearchDetailsSheet = (InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.PhoneNumberSearchDetailsSheet) obj;
        phoneNumberSearchDetailsSheet.getClass();
        LocalizedString localizedString = phoneNumberSearchDetailsSheet.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = phoneNumberSearchDetailsSheet.detail_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = phoneNumberSearchDetailsSheet.primary_button_label;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        LocalizedString localizedString7 = phoneNumberSearchDetailsSheet.dismiss_button_label;
        LocalizedString localizedString8 = localizedString7 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString7) : null;
        LocalizedString localizedString9 = phoneNumberSearchDetailsSheet.non_contact_subtitle;
        LocalizedString localizedString10 = localizedString9 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString9) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.PhoneNumberSearchDetailsSheet(localizedString2, localizedString4, localizedString6, localizedString8, localizedString10, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.PhoneNumberSearchDetailsSheet phoneNumberSearchDetailsSheet = (InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.PhoneNumberSearchDetailsSheet) obj;
        phoneNumberSearchDetailsSheet.getClass();
        LocalizedString localizedString = phoneNumberSearchDetailsSheet.title;
        if (localizedString != null) {
            LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, localizedString);
        }
        LocalizedString localizedString2 = phoneNumberSearchDetailsSheet.detail_text;
        if (localizedString2 != null) {
            LocalizedString.ADAPTER.encodeWithTag(protoWriter, 2, localizedString2);
        }
        LocalizedString localizedString3 = phoneNumberSearchDetailsSheet.primary_button_label;
        if (localizedString3 != null) {
            LocalizedString.ADAPTER.encodeWithTag(protoWriter, 3, localizedString3);
        }
        LocalizedString localizedString4 = phoneNumberSearchDetailsSheet.dismiss_button_label;
        if (localizedString4 != null) {
            LocalizedString.ADAPTER.encodeWithTag(protoWriter, 4, localizedString4);
        }
        LocalizedString localizedString5 = phoneNumberSearchDetailsSheet.non_contact_subtitle;
        if (localizedString5 != null) {
            LocalizedString.ADAPTER.encodeWithTag(protoWriter, 5, localizedString5);
        }
        protoWriter.writeBytes(phoneNumberSearchDetailsSheet.unknownFields());
    }
}
