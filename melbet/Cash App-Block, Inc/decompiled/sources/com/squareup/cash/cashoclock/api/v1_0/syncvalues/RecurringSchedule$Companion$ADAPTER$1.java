package com.squareup.cash.cashoclock.api.v1_0.syncvalues;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.cashoclock.api.v1_0.syncvalues.RecurringSchedule;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class RecurringSchedule$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RecurringSchedule((RecurringSchedule.Frequency) obj, m, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = RecurringSchedule.Frequency.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                m.add(ProtoAdapter.INT32.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RecurringSchedule recurringSchedule = (RecurringSchedule) obj;
        reverseProtoWriter.getClass();
        recurringSchedule.getClass();
        reverseProtoWriter.writeBytes(recurringSchedule.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, recurringSchedule.timezone);
        ProtoAdapter.INT32.asRepeated().encodeWithTag(reverseProtoWriter, 2, recurringSchedule.day_within_period);
        RecurringSchedule.Frequency.ADAPTER.encodeWithTag(reverseProtoWriter, 1, recurringSchedule.frequency);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RecurringSchedule recurringSchedule = (RecurringSchedule) obj;
        recurringSchedule.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(3, recurringSchedule.timezone) + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(2, recurringSchedule.day_within_period) + RecurringSchedule.Frequency.ADAPTER.encodedSizeWithTag(1, recurringSchedule.frequency) + recurringSchedule.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RecurringSchedule recurringSchedule = (RecurringSchedule) obj;
        recurringSchedule.getClass();
        ByteString byteString = ByteString.EMPTY;
        RecurringSchedule.Frequency frequency = recurringSchedule.frequency;
        List list = recurringSchedule.day_within_period;
        String str = recurringSchedule.timezone;
        list.getClass();
        byteString.getClass();
        return new RecurringSchedule(frequency, list, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RecurringSchedule recurringSchedule = (RecurringSchedule) obj;
        recurringSchedule.getClass();
        RecurringSchedule.Frequency.ADAPTER.encodeWithTag(protoWriter, 1, recurringSchedule.frequency);
        ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 2, recurringSchedule.day_within_period);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, recurringSchedule.timezone);
        protoWriter.writeBytes(recurringSchedule.unknownFields());
    }
}
