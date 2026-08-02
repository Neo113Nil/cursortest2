package com.squareup.cash.out.sync_entity;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashOutFeeData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashOutFeeData((Long) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(MinFeeStep.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashOutFeeData cashOutFeeData = (CashOutFeeData) obj;
        reverseProtoWriter.getClass();
        cashOutFeeData.getClass();
        reverseProtoWriter.writeBytes(cashOutFeeData.unknownFields());
        MinFeeStep.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, cashOutFeeData.min_fee_steps);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, cashOutFeeData.version);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashOutFeeData cashOutFeeData = (CashOutFeeData) obj;
        cashOutFeeData.getClass();
        return MinFeeStep.ADAPTER.asRepeated().encodedSizeWithTag(2, cashOutFeeData.min_fee_steps) + ProtoAdapter.INT64.encodedSizeWithTag(1, cashOutFeeData.version) + cashOutFeeData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashOutFeeData cashOutFeeData = (CashOutFeeData) obj;
        cashOutFeeData.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(cashOutFeeData.min_fee_steps, MinFeeStep.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Long l = cashOutFeeData.version;
        byteString.getClass();
        return new CashOutFeeData(l, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashOutFeeData cashOutFeeData = (CashOutFeeData) obj;
        cashOutFeeData.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, cashOutFeeData.version);
        MinFeeStep.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, cashOutFeeData.min_fee_steps);
        protoWriter.writeBytes(cashOutFeeData.unknownFields());
    }
}
