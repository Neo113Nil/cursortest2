package com.squareup.cash.cashoclock.api.v1_0.syncvalues;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.ForEach;
import com.squareup.protos.common.Money;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.time.Instant;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class ScheduledReload extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ScheduledReload> CREATOR;
    public final Money amount;
    public final Boolean enabled;
    public final Instant next_auto_cash_in_date;
    public final RecurringSchedule recurring_schedule;

    static {
        ScheduledReload$Companion$ADAPTER$1 scheduledReload$Companion$ADAPTER$1 = new ScheduledReload$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ScheduledReload.class), "type.googleapis.com/squareup.cash.cashoclock.api.v1_0.syncvalues.ScheduledReload", Syntax.PROTO_2, null, "squareup/cash/cashoclock/api/v1_0/syncvalues/CashOClockPreference.proto");
        ADAPTER = scheduledReload$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(scheduledReload$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduledReload(Boolean bool, Money money, RecurringSchedule recurringSchedule, Instant instant, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.enabled = bool;
        this.amount = money;
        this.recurring_schedule = recurringSchedule;
        this.next_auto_cash_in_date = instant;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ScheduledReload)) {
            return false;
        }
        ScheduledReload scheduledReload = (ScheduledReload) obj;
        return Intrinsics.areEqual(unknownFields(), scheduledReload.unknownFields()) && Intrinsics.areEqual(this.enabled, scheduledReload.enabled) && Intrinsics.areEqual(this.amount, scheduledReload.amount) && Intrinsics.areEqual(this.recurring_schedule, scheduledReload.recurring_schedule) && Intrinsics.areEqual(this.next_auto_cash_in_date, scheduledReload.next_auto_cash_in_date);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.enabled;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Money money = this.amount;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        RecurringSchedule recurringSchedule = this.recurring_schedule;
        int hashCode4 = (hashCode3 + (recurringSchedule != null ? recurringSchedule.hashCode() : 0)) * 37;
        Instant instant = this.next_auto_cash_in_date;
        int hashCode5 = hashCode4 + (instant != null ? instant.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ForEach.Builder builder = new ForEach.Builder(3);
        builder.collection = this.enabled;
        builder.template = this.amount;
        builder.item_variable = this.recurring_schedule;
        builder.source = this.next_auto_cash_in_date;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool, arrayList);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        RecurringSchedule recurringSchedule = this.recurring_schedule;
        if (recurringSchedule != null) {
            arrayList.add("recurring_schedule=" + recurringSchedule);
        }
        Instant instant = this.next_auto_cash_in_date;
        if (instant != null) {
            Matcher$$ExternalSyntheticOutline0.m("next_auto_cash_in_date=", instant, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ScheduledReload{", "}", 0, null, null, 56);
    }
}
