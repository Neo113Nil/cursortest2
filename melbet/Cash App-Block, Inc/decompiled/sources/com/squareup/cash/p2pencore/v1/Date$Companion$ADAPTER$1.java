package com.squareup.cash.p2pencore.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class Date$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Date((Integer) obj, (Integer) obj2, (Integer) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Date date = (Date) obj;
        reverseProtoWriter.getClass();
        date.getClass();
        reverseProtoWriter.writeBytes(date.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, date.day);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, date.month);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, date.year);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Date date = (Date) obj;
        date.getClass();
        int size$okio = date.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        return protoAdapter.encodedSizeWithTag(3, date.day) + protoAdapter.encodedSizeWithTag(2, date.month) + protoAdapter.encodedSizeWithTag(1, date.year) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Date date = (Date) obj;
        date.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = date.year;
        Integer num2 = date.month;
        Integer num3 = date.day;
        byteString.getClass();
        return new Date(num, num2, num3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Date date = (Date) obj;
        date.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, date.year);
        protoAdapter.encodeWithTag(protoWriter, 2, date.month);
        protoAdapter.encodeWithTag(protoWriter, 3, date.day);
        protoWriter.writeBytes(date.unknownFields());
    }
}
