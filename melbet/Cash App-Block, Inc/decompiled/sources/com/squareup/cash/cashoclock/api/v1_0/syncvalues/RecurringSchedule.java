package com.squareup.cash.cashoclock.api.v1_0.syncvalues;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.fillr.e;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.crypto.WithdrawalDetails;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class RecurringSchedule extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RecurringSchedule> CREATOR;
    public final List day_within_period;
    public final Frequency frequency;
    public final String timezone;

    public enum Frequency implements WireEnum {
        EVERY_WEEK(1),
        EVERY_TWO_WEEKS(2),
        EVERY_MONTH(3),
        EVERY_DAY(4);

        public final int value;
        public static final e Companion = new e();
        public static final RecurringSchedule$Frequency$Companion$ADAPTER$1 ADAPTER = new RecurringSchedule$Frequency$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Frequency.class), Syntax.PROTO_2, null);

        Frequency(int i) {
            this.value = i;
        }

        public static final Frequency fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return EVERY_WEEK;
            }
            if (i == 2) {
                return EVERY_TWO_WEEKS;
            }
            if (i == 3) {
                return EVERY_MONTH;
            }
            if (i != 4) {
                return null;
            }
            return EVERY_DAY;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        RecurringSchedule$Companion$ADAPTER$1 recurringSchedule$Companion$ADAPTER$1 = new RecurringSchedule$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RecurringSchedule.class), "type.googleapis.com/squareup.cash.cashoclock.api.v1_0.syncvalues.RecurringSchedule", Syntax.PROTO_2, null, "squareup/cash/cashoclock/api/v1_0/syncvalues/CashOClockPreference.proto");
        ADAPTER = recurringSchedule$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(recurringSchedule$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringSchedule(Frequency frequency, List list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.frequency = frequency;
        this.timezone = str;
        this.day_within_period = TransactorKt.immutableCopyOf("day_within_period", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecurringSchedule)) {
            return false;
        }
        RecurringSchedule recurringSchedule = (RecurringSchedule) obj;
        return Intrinsics.areEqual(unknownFields(), recurringSchedule.unknownFields()) && this.frequency == recurringSchedule.frequency && Intrinsics.areEqual(this.day_within_period, recurringSchedule.day_within_period) && Intrinsics.areEqual(this.timezone, recurringSchedule.timezone);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Frequency frequency = this.frequency;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (frequency != null ? frequency.hashCode() : 0)) * 37, 37, this.day_within_period);
        String str = this.timezone;
        int hashCode2 = m + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        WithdrawalDetails.Builder builder = new WithdrawalDetails.Builder(8);
        builder.withdrawalType = this.frequency;
        builder.customer_supplied_amount = this.day_within_period;
        builder.customer_token = this.timezone;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Frequency frequency = this.frequency;
        if (frequency != null) {
            arrayList.add("frequency=" + frequency);
        }
        List list = this.day_within_period;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("day_within_period=", arrayList, list);
        }
        String str = this.timezone;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "timezone=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RecurringSchedule{", "}", 0, null, null, 56);
    }
}
