package com.squareup.cash.remittances.syncvalue.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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

/* loaded from: classes7.dex */
public final class InternationalPaymentsCountryNotificationSyncValue extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InternationalPaymentsCountryNotificationSyncValue> CREATOR;
    public final boolean has_continued_from_nux;
    public final List notification_requested_identifiers;
    public final long visited_epoch_seconds;

    public final class Builder extends Message.Builder {
        public boolean has_continued_from_nux;
        public List notification_requested_identifiers;
        public long visited_epoch_seconds;

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            return new InternationalPaymentsCountryNotificationSyncValue(this.notification_requested_identifiers, this.visited_epoch_seconds, this.has_continued_from_nux, buildUnknownFields());
        }
    }

    static {
        InternationalPaymentsCountryNotificationSyncValue$Companion$ADAPTER$1 internationalPaymentsCountryNotificationSyncValue$Companion$ADAPTER$1 = new InternationalPaymentsCountryNotificationSyncValue$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InternationalPaymentsCountryNotificationSyncValue.class), "type.googleapis.com/squareup.cash.remittances.syncvalue.v1.InternationalPaymentsCountryNotificationSyncValue", Syntax.PROTO_3, null, "squareup/cash/remittances/syncvalue/v1/international_payments_country_selection_sync_value.proto");
        ADAPTER = internationalPaymentsCountryNotificationSyncValue$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(internationalPaymentsCountryNotificationSyncValue$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternationalPaymentsCountryNotificationSyncValue(List list, long j, boolean z, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.visited_epoch_seconds = j;
        this.has_continued_from_nux = z;
        this.notification_requested_identifiers = TransactorKt.immutableCopyOf("notification_requested_identifiers", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InternationalPaymentsCountryNotificationSyncValue)) {
            return false;
        }
        InternationalPaymentsCountryNotificationSyncValue internationalPaymentsCountryNotificationSyncValue = (InternationalPaymentsCountryNotificationSyncValue) obj;
        return Intrinsics.areEqual(unknownFields(), internationalPaymentsCountryNotificationSyncValue.unknownFields()) && Intrinsics.areEqual(this.notification_requested_identifiers, internationalPaymentsCountryNotificationSyncValue.notification_requested_identifiers) && this.visited_epoch_seconds == internationalPaymentsCountryNotificationSyncValue.visited_epoch_seconds && this.has_continued_from_nux == internationalPaymentsCountryNotificationSyncValue.has_continued_from_nux;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = Boolean.hashCode(this.has_continued_from_nux) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.notification_requested_identifiers), 37, this.visited_epoch_seconds);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.notification_requested_identifiers = this.notification_requested_identifiers;
        builder.visited_epoch_seconds = this.visited_epoch_seconds;
        builder.has_continued_from_nux = this.has_continued_from_nux;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.notification_requested_identifiers;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("notification_requested_identifiers=", arrayList, list);
        }
        arrayList.add("visited_epoch_seconds=" + this.visited_epoch_seconds);
        arrayList.add("has_continued_from_nux=" + this.has_continued_from_nux);
        return CollectionsKt.joinToString$default(arrayList, ", ", "InternationalPaymentsCountryNotificationSyncValue{", "}", 0, null, null, 56);
    }
}
