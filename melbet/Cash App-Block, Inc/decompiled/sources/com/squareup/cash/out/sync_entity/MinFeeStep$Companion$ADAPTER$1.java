package com.squareup.cash.out.sync_entity;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class MinFeeStep$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new MinFeeStep((Long) obj, (Long) obj2, (Long) obj3, (Long) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MinFeeStep minFeeStep = (MinFeeStep) obj;
        reverseProtoWriter.getClass();
        minFeeStep.getClass();
        reverseProtoWriter.writeBytes(minFeeStep.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, minFeeStep.step_maximum_fee_cents);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, minFeeStep.step_minimum_fee_cents);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, minFeeStep.step_fee_bps);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, minFeeStep.lower_bound_amount_usd_cents);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MinFeeStep minFeeStep = (MinFeeStep) obj;
        minFeeStep.getClass();
        int size$okio = minFeeStep.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        return protoAdapter.encodedSizeWithTag(4, minFeeStep.step_maximum_fee_cents) + protoAdapter.encodedSizeWithTag(3, minFeeStep.step_minimum_fee_cents) + protoAdapter.encodedSizeWithTag(2, minFeeStep.step_fee_bps) + protoAdapter.encodedSizeWithTag(1, minFeeStep.lower_bound_amount_usd_cents) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MinFeeStep minFeeStep = (MinFeeStep) obj;
        minFeeStep.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = minFeeStep.lower_bound_amount_usd_cents;
        Long l2 = minFeeStep.step_fee_bps;
        Long l3 = minFeeStep.step_minimum_fee_cents;
        Long l4 = minFeeStep.step_maximum_fee_cents;
        byteString.getClass();
        return new MinFeeStep(l, l2, l3, l4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MinFeeStep minFeeStep = (MinFeeStep) obj;
        minFeeStep.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, minFeeStep.lower_bound_amount_usd_cents);
        protoAdapter.encodeWithTag(protoWriter, 2, minFeeStep.step_fee_bps);
        protoAdapter.encodeWithTag(protoWriter, 3, minFeeStep.step_minimum_fee_cents);
        protoAdapter.encodeWithTag(protoWriter, 4, minFeeStep.step_maximum_fee_cents);
        protoWriter.writeBytes(minFeeStep.unknownFields());
    }
}
