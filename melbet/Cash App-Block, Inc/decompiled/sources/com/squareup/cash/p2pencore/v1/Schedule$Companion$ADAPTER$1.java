package com.squareup.cash.p2pencore.v1;

import androidx.room.TransactorKt;
import com.squareup.cash.p2pencore.v1.Schedule;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class Schedule$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Schedule((Schedule.Cadence) obj, (Integer) obj2, (Long) obj3, (String) obj4, (String) obj5, (Date) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = Schedule.Cadence.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    obj2 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(Date.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Schedule schedule = (Schedule) obj;
        reverseProtoWriter.getClass();
        schedule.getClass();
        reverseProtoWriter.writeBytes(schedule.unknownFields());
        Date.ADAPTER.encodeWithTag(reverseProtoWriter, 6, schedule.desired_first_payment_date);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, schedule.description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, schedule.time_zone);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 3, schedule.started_at);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 2, schedule.day_of_cadence);
        Schedule.Cadence.ADAPTER.encodeWithTag(reverseProtoWriter, 1, schedule.cadence);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Schedule schedule = (Schedule) obj;
        schedule.getClass();
        int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(3, schedule.started_at) + ProtoAdapter.INT32.encodedSizeWithTag(2, schedule.day_of_cadence) + Schedule.Cadence.ADAPTER.encodedSizeWithTag(1, schedule.cadence) + schedule.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Date.ADAPTER.encodedSizeWithTag(6, schedule.desired_first_payment_date) + protoAdapter.encodedSizeWithTag(5, schedule.description) + protoAdapter.encodedSizeWithTag(4, schedule.time_zone) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Schedule schedule = (Schedule) obj;
        schedule.getClass();
        Date date = schedule.desired_first_payment_date;
        Date date2 = date != null ? (Date) Date.ADAPTER.redact(date) : null;
        ByteString byteString = ByteString.EMPTY;
        Schedule.Cadence cadence = schedule.cadence;
        Integer num = schedule.day_of_cadence;
        Long l = schedule.started_at;
        String str = schedule.time_zone;
        String str2 = schedule.description;
        byteString.getClass();
        return new Schedule(cadence, num, l, str, str2, date2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Schedule schedule = (Schedule) obj;
        schedule.getClass();
        Schedule.Cadence.ADAPTER.encodeWithTag(protoWriter, 1, schedule.cadence);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, schedule.day_of_cadence);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, schedule.started_at);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 4, schedule.time_zone);
        protoAdapter.encodeWithTag(protoWriter, 5, schedule.description);
        Date.ADAPTER.encodeWithTag(protoWriter, 6, schedule.desired_first_payment_date);
        protoWriter.writeBytes(schedule.unknownFields());
    }
}
