package com.squareup.cash.p2pencore.v1;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.protos.cash.api.Error;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class Schedule extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Schedule> CREATOR;
    public final Cadence cadence;
    public final Integer day_of_cadence;
    public final String description;
    public final Date desired_first_payment_date;
    public final Long started_at;
    public final String time_zone;

    public enum Cadence implements WireEnum {
        CADENCE_UNSPECIFIED(0),
        CADENCE_WEEKLY(1),
        CADENCE_BIWEEKLY(2),
        CADENCE_MONTHLY(3);

        public static final Schedule$Cadence$Companion$ADAPTER$1 ADAPTER;
        public static final CardProduct.Companion Companion;
        public final int value;

        static {
            Cadence cadence = CADENCE_UNSPECIFIED;
            Companion = new CardProduct.Companion(8);
            ADAPTER = new Schedule$Cadence$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Cadence.class), Syntax.PROTO_2, cadence);
        }

        Cadence(int i) {
            this.value = i;
        }

        public static final Cadence fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return CADENCE_UNSPECIFIED;
            }
            if (i == 1) {
                return CADENCE_WEEKLY;
            }
            if (i == 2) {
                return CADENCE_BIWEEKLY;
            }
            if (i != 3) {
                return null;
            }
            return CADENCE_MONTHLY;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        Schedule$Companion$ADAPTER$1 schedule$Companion$ADAPTER$1 = new Schedule$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Schedule.class), "type.googleapis.com/squareup.cash.p2pencore.v1beta1.Schedule", Syntax.PROTO_2, null, "squareup/cash/p2pencore/v1beta1/recurring_payments.proto");
        ADAPTER = schedule$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(schedule$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Schedule(Cadence cadence, Integer num, Long l, String str, String str2, Date date, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.cadence = cadence;
        this.day_of_cadence = num;
        this.started_at = l;
        this.time_zone = str;
        this.description = str2;
        this.desired_first_payment_date = date;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Schedule)) {
            return false;
        }
        Schedule schedule = (Schedule) obj;
        return Intrinsics.areEqual(unknownFields(), schedule.unknownFields()) && this.cadence == schedule.cadence && Intrinsics.areEqual(this.day_of_cadence, schedule.day_of_cadence) && Intrinsics.areEqual(this.started_at, schedule.started_at) && Intrinsics.areEqual(this.time_zone, schedule.time_zone) && Intrinsics.areEqual(this.description, schedule.description) && Intrinsics.areEqual(this.desired_first_payment_date, schedule.desired_first_payment_date);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Cadence cadence = this.cadence;
        int hashCode2 = (hashCode + (cadence != null ? cadence.hashCode() : 0)) * 37;
        Integer num = this.day_of_cadence;
        int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Long l = this.started_at;
        int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str = this.time_zone;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.description;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Date date = this.desired_first_payment_date;
        int hashCode7 = hashCode6 + (date != null ? date.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Error.Builder builder = new Error.Builder(4, false);
        builder.category = this.cadence;
        builder.code = this.day_of_cadence;
        builder.retryable = this.started_at;
        builder.description = this.time_zone;
        builder.field = this.description;
        builder.metadata = this.desired_first_payment_date;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Cadence cadence = this.cadence;
        if (cadence != null) {
            arrayList.add("cadence=" + cadence);
        }
        Integer num = this.day_of_cadence;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("day_of_cadence=", num, arrayList);
        }
        Long l = this.started_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("started_at=", l, arrayList);
        }
        String str = this.time_zone;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "time_zone=", arrayList);
        }
        String str2 = this.description;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description=", arrayList);
        }
        Date date = this.desired_first_payment_date;
        if (date != null) {
            arrayList.add("desired_first_payment_date=" + date);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Schedule{", "}", 0, null, null, 56);
    }
}
