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
public final class InternationalPaymentsCountrySelectionSyncValue$SupportedDestinationCountry$DetailsSheet$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.DetailsSheet((LocalizedString) obj, (LocalizedString) obj2, (LocalizedString) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.DetailsSheet detailsSheet = (InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.DetailsSheet) obj;
        reverseProtoWriter.getClass();
        detailsSheet.getClass();
        reverseProtoWriter.writeBytes(detailsSheet.unknownFields());
        LocalizedString localizedString = detailsSheet.dismiss_button_label;
        if (localizedString != null) {
            LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 3, localizedString);
        }
        LocalizedString localizedString2 = detailsSheet.detail_text;
        if (localizedString2 != null) {
            LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, localizedString2);
        }
        LocalizedString localizedString3 = detailsSheet.title;
        if (localizedString3 != null) {
            LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, localizedString3);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.DetailsSheet detailsSheet = (InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.DetailsSheet) obj;
        detailsSheet.getClass();
        int size$okio = detailsSheet.unknownFields().getSize$okio();
        LocalizedString localizedString = detailsSheet.title;
        if (localizedString != null) {
            size$okio += LocalizedString.ADAPTER.encodedSizeWithTag(1, localizedString);
        }
        LocalizedString localizedString2 = detailsSheet.detail_text;
        if (localizedString2 != null) {
            size$okio += LocalizedString.ADAPTER.encodedSizeWithTag(2, localizedString2);
        }
        LocalizedString localizedString3 = detailsSheet.dismiss_button_label;
        return localizedString3 != null ? LocalizedString.ADAPTER.encodedSizeWithTag(3, localizedString3) + size$okio : size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.DetailsSheet detailsSheet = (InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.DetailsSheet) obj;
        detailsSheet.getClass();
        LocalizedString localizedString = detailsSheet.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = detailsSheet.detail_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = detailsSheet.dismiss_button_label;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.DetailsSheet(localizedString2, localizedString4, localizedString6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.DetailsSheet detailsSheet = (InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.DetailsSheet) obj;
        detailsSheet.getClass();
        LocalizedString localizedString = detailsSheet.title;
        if (localizedString != null) {
            LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, localizedString);
        }
        LocalizedString localizedString2 = detailsSheet.detail_text;
        if (localizedString2 != null) {
            LocalizedString.ADAPTER.encodeWithTag(protoWriter, 2, localizedString2);
        }
        LocalizedString localizedString3 = detailsSheet.dismiss_button_label;
        if (localizedString3 != null) {
            LocalizedString.ADAPTER.encodeWithTag(protoWriter, 3, localizedString3);
        }
        protoWriter.writeBytes(detailsSheet.unknownFields());
    }
}
