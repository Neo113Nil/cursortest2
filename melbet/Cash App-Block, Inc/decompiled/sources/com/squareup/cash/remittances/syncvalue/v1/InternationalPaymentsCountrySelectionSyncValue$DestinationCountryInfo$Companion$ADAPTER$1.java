package com.squareup.cash.remittances.syncvalue.v1;

import androidx.room.TransactorKt;
import com.squareup.cash.remittances.syncvalue.v1.InternationalPaymentsCountrySelectionSyncValue;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InternationalPaymentsCountrySelectionSyncValue$DestinationCountryInfo$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = "";
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = "";
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InternationalPaymentsCountrySelectionSyncValue.DestinationCountryInfo((LocalizedString) obj2, (LocalizedString) obj3, (String) obj, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InternationalPaymentsCountrySelectionSyncValue.DestinationCountryInfo destinationCountryInfo = (InternationalPaymentsCountrySelectionSyncValue.DestinationCountryInfo) obj;
        reverseProtoWriter.getClass();
        destinationCountryInfo.getClass();
        ByteString unknownFields = destinationCountryInfo.unknownFields();
        String str = destinationCountryInfo.identifier;
        String str2 = destinationCountryInfo.avatar_emoji;
        reverseProtoWriter.writeBytes(unknownFields);
        LocalizedString localizedString = destinationCountryInfo.currency_display;
        if (localizedString != null) {
            LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 4, localizedString);
        }
        LocalizedString localizedString2 = destinationCountryInfo.display_name;
        if (localizedString2 != null) {
            LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 3, localizedString2);
        }
        if (!Intrinsics.areEqual(str2, "")) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, str2);
        }
        if (Intrinsics.areEqual(str, "")) {
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, str);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InternationalPaymentsCountrySelectionSyncValue.DestinationCountryInfo destinationCountryInfo = (InternationalPaymentsCountrySelectionSyncValue.DestinationCountryInfo) obj;
        destinationCountryInfo.getClass();
        ByteString unknownFields = destinationCountryInfo.unknownFields();
        String str = destinationCountryInfo.avatar_emoji;
        int size$okio = unknownFields.getSize$okio();
        String str2 = destinationCountryInfo.identifier;
        if (!Intrinsics.areEqual(str2, "")) {
            size$okio += ProtoAdapter.STRING.encodedSizeWithTag(1, str2);
        }
        if (!Intrinsics.areEqual(str, "")) {
            size$okio += ProtoAdapter.STRING.encodedSizeWithTag(2, str);
        }
        LocalizedString localizedString = destinationCountryInfo.display_name;
        if (localizedString != null) {
            size$okio += LocalizedString.ADAPTER.encodedSizeWithTag(3, localizedString);
        }
        LocalizedString localizedString2 = destinationCountryInfo.currency_display;
        return localizedString2 != null ? LocalizedString.ADAPTER.encodedSizeWithTag(4, localizedString2) + size$okio : size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InternationalPaymentsCountrySelectionSyncValue.DestinationCountryInfo destinationCountryInfo = (InternationalPaymentsCountrySelectionSyncValue.DestinationCountryInfo) obj;
        destinationCountryInfo.getClass();
        LocalizedString localizedString = destinationCountryInfo.display_name;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = destinationCountryInfo.currency_display;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = destinationCountryInfo.identifier;
        String str2 = destinationCountryInfo.avatar_emoji;
        str.getClass();
        str2.getClass();
        byteString.getClass();
        return new InternationalPaymentsCountrySelectionSyncValue.DestinationCountryInfo(localizedString2, localizedString4, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InternationalPaymentsCountrySelectionSyncValue.DestinationCountryInfo destinationCountryInfo = (InternationalPaymentsCountrySelectionSyncValue.DestinationCountryInfo) obj;
        destinationCountryInfo.getClass();
        String str = destinationCountryInfo.identifier;
        String str2 = destinationCountryInfo.avatar_emoji;
        if (!Intrinsics.areEqual(str, "")) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, str);
        }
        if (!Intrinsics.areEqual(str2, "")) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, str2);
        }
        LocalizedString localizedString = destinationCountryInfo.display_name;
        if (localizedString != null) {
            LocalizedString.ADAPTER.encodeWithTag(protoWriter, 3, localizedString);
        }
        LocalizedString localizedString2 = destinationCountryInfo.currency_display;
        if (localizedString2 != null) {
            LocalizedString.ADAPTER.encodeWithTag(protoWriter, 4, localizedString2);
        }
        protoWriter.writeBytes(destinationCountryInfo.unknownFields());
    }
}
