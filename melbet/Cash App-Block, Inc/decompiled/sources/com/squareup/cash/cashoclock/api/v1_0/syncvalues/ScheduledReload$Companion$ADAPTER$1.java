package com.squareup.cash.cashoclock.api.v1_0.syncvalues;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.time.Instant;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class ScheduledReload$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ScheduledReload((Boolean) obj, (Money) obj2, (RecurringSchedule) obj3, (Instant) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(RecurringSchedule.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(ProtoAdapter.INSTANT, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ScheduledReload scheduledReload = (ScheduledReload) obj;
        reverseProtoWriter.getClass();
        scheduledReload.getClass();
        reverseProtoWriter.writeBytes(scheduledReload.unknownFields());
        ProtoAdapter.INSTANT.encodeWithTag(reverseProtoWriter, 4, scheduledReload.next_auto_cash_in_date);
        RecurringSchedule.ADAPTER.encodeWithTag(reverseProtoWriter, 3, scheduledReload.recurring_schedule);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, scheduledReload.amount);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, scheduledReload.enabled);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ScheduledReload scheduledReload = (ScheduledReload) obj;
        scheduledReload.getClass();
        return ProtoAdapter.INSTANT.encodedSizeWithTag(4, scheduledReload.next_auto_cash_in_date) + RecurringSchedule.ADAPTER.encodedSizeWithTag(3, scheduledReload.recurring_schedule) + Money.ADAPTER.encodedSizeWithTag(2, scheduledReload.amount) + ProtoAdapter.BOOL.encodedSizeWithTag(1, scheduledReload.enabled) + scheduledReload.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ScheduledReload scheduledReload = (ScheduledReload) obj;
        scheduledReload.getClass();
        Money money = scheduledReload.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        RecurringSchedule recurringSchedule = scheduledReload.recurring_schedule;
        RecurringSchedule recurringSchedule2 = recurringSchedule != null ? (RecurringSchedule) RecurringSchedule.ADAPTER.redact(recurringSchedule) : null;
        Instant instant = scheduledReload.next_auto_cash_in_date;
        Instant instant2 = instant != null ? (Instant) ProtoAdapter.INSTANT.redact(instant) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = scheduledReload.enabled;
        byteString.getClass();
        return new ScheduledReload(bool, money2, recurringSchedule2, instant2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ScheduledReload scheduledReload = (ScheduledReload) obj;
        scheduledReload.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, scheduledReload.enabled);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, scheduledReload.amount);
        RecurringSchedule.ADAPTER.encodeWithTag(protoWriter, 3, scheduledReload.recurring_schedule);
        ProtoAdapter.INSTANT.encodeWithTag(protoWriter, 4, scheduledReload.next_auto_cash_in_date);
        protoWriter.writeBytes(scheduledReload.unknownFields());
    }
}
