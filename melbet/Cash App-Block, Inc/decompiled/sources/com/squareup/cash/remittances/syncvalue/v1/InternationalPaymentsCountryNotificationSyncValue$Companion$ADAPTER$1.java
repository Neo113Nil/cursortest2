package com.squareup.cash.remittances.syncvalue.v1;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InternationalPaymentsCountryNotificationSyncValue$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        boolean z = false;
        long j = 0;
        while (true) {
            boolean z2 = z;
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    return new InternationalPaymentsCountryNotificationSyncValue(m, j, z2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                }
                if (nextTag == 1) {
                    m.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    j = ((Number) ProtoAdapter.INT64.decode(protoReader)).longValue();
                } else if (nextTag != 3) {
                    protoReader.readUnknownField(nextTag);
                }
            }
            z = ((Boolean) ProtoAdapter.BOOL.decode(protoReader)).booleanValue();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InternationalPaymentsCountryNotificationSyncValue internationalPaymentsCountryNotificationSyncValue = (InternationalPaymentsCountryNotificationSyncValue) obj;
        reverseProtoWriter.getClass();
        internationalPaymentsCountryNotificationSyncValue.getClass();
        reverseProtoWriter.writeBytes(internationalPaymentsCountryNotificationSyncValue.unknownFields());
        boolean z = internationalPaymentsCountryNotificationSyncValue.has_continued_from_nux;
        if (z) {
            ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, Boolean.valueOf(z));
        }
        long j = internationalPaymentsCountryNotificationSyncValue.visited_epoch_seconds;
        if (j != 0) {
            ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, Long.valueOf(j));
        }
        ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 1, internationalPaymentsCountryNotificationSyncValue.notification_requested_identifiers);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InternationalPaymentsCountryNotificationSyncValue internationalPaymentsCountryNotificationSyncValue = (InternationalPaymentsCountryNotificationSyncValue) obj;
        internationalPaymentsCountryNotificationSyncValue.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, internationalPaymentsCountryNotificationSyncValue.notification_requested_identifiers) + internationalPaymentsCountryNotificationSyncValue.unknownFields().getSize$okio();
        long j = internationalPaymentsCountryNotificationSyncValue.visited_epoch_seconds;
        if (j != 0) {
            encodedSizeWithTag += ProtoAdapter.INT64.encodedSizeWithTag(2, Long.valueOf(j));
        }
        boolean z = internationalPaymentsCountryNotificationSyncValue.has_continued_from_nux;
        return z ? SizeMode$EnumUnboxingLocalUtility.m(z, ProtoAdapter.BOOL, 3, encodedSizeWithTag) : encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InternationalPaymentsCountryNotificationSyncValue internationalPaymentsCountryNotificationSyncValue = (InternationalPaymentsCountryNotificationSyncValue) obj;
        internationalPaymentsCountryNotificationSyncValue.getClass();
        ByteString byteString = ByteString.EMPTY;
        List list = internationalPaymentsCountryNotificationSyncValue.notification_requested_identifiers;
        long j = internationalPaymentsCountryNotificationSyncValue.visited_epoch_seconds;
        boolean z = internationalPaymentsCountryNotificationSyncValue.has_continued_from_nux;
        list.getClass();
        byteString.getClass();
        return new InternationalPaymentsCountryNotificationSyncValue(list, j, z, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InternationalPaymentsCountryNotificationSyncValue internationalPaymentsCountryNotificationSyncValue = (InternationalPaymentsCountryNotificationSyncValue) obj;
        internationalPaymentsCountryNotificationSyncValue.getClass();
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, internationalPaymentsCountryNotificationSyncValue.notification_requested_identifiers);
        long j = internationalPaymentsCountryNotificationSyncValue.visited_epoch_seconds;
        if (j != 0) {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, Long.valueOf(j));
        }
        boolean z = internationalPaymentsCountryNotificationSyncValue.has_continued_from_nux;
        if (z) {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, Boolean.valueOf(z));
        }
        protoWriter.writeBytes(internationalPaymentsCountryNotificationSyncValue.unknownFields());
    }
}
