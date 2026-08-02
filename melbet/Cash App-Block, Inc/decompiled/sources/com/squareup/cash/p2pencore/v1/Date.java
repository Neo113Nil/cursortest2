package com.squareup.cash.p2pencore.v1;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.cash.pools.PoolsAppletStats;
import com.squareup.protos.common.time.YearMonthDay;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class Date extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Date> CREATOR;
    public final Integer day;
    public final Integer month;
    public final Integer year;

    /* loaded from: classes8.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Integer day;
        public Integer month;
        public Integer year;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Date(this.year, this.month, this.day, buildUnknownFields());
                case 1:
                    return new LocalBrand.LocationFulfillmentSummary(this.year, this.month, this.day, buildUnknownFields());
                case 2:
                    return new PoolsAppletStats(this.year, this.month, this.day, buildUnknownFields());
                case 3:
                    return new YearMonthDay(this.year, this.month, this.day, buildUnknownFields());
                default:
                    return new SubmitFormRequest.ElementResult.DateInputResult(this.year, this.month, this.day, buildUnknownFields());
            }
        }
    }

    static {
        Date$Companion$ADAPTER$1 date$Companion$ADAPTER$1 = new Date$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Date.class), "type.googleapis.com/squareup.cash.p2pencore.v1beta1.Date", Syntax.PROTO_2, null, "squareup/cash/p2pencore/v1beta1/recurring_payments.proto");
        ADAPTER = date$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(date$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Date(Integer num, Integer num2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.year = num;
        this.month = num2;
        this.day = num3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Date)) {
            return false;
        }
        Date date = (Date) obj;
        return Intrinsics.areEqual(unknownFields(), date.unknownFields()) && Intrinsics.areEqual(this.year, date.year) && Intrinsics.areEqual(this.month, date.month) && Intrinsics.areEqual(this.day, date.day);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.year;
        int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.month;
        int hashCode3 = (hashCode2 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        Integer num3 = this.day;
        int hashCode4 = hashCode3 + (num3 != null ? Integer.hashCode(num3.intValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.year = this.year;
        builder.month = this.month;
        builder.day = this.day;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.year;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("year=", num, arrayList);
        }
        Integer num2 = this.month;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("month=", num2, arrayList);
        }
        Integer num3 = this.day;
        if (num3 != null) {
            re$$ExternalSyntheticOutline0.m("day=", num3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Date{", "}", 0, null, null, 56);
    }
}
