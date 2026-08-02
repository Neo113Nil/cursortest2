package com.squareup.cash.crypto.amount;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class BitcoinAmount$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.UINT64.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.UINT32.decode(protoReader);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        Long l = (Long) obj;
        if (l != null) {
            return new BitcoinAmount(l.longValue(), (Integer) obj2, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "satoshi");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BitcoinAmount bitcoinAmount = (BitcoinAmount) obj;
        reverseProtoWriter.getClass();
        bitcoinAmount.getClass();
        reverseProtoWriter.writeBytes(bitcoinAmount.unknownFields());
        ProtoAdapter.UINT32.encodeWithTag(reverseProtoWriter, 2, bitcoinAmount.remainder_pico);
        ProtoAdapter.UINT64.encodeWithTag(reverseProtoWriter, 1, Long.valueOf(bitcoinAmount.satoshi));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BitcoinAmount bitcoinAmount = (BitcoinAmount) obj;
        bitcoinAmount.getClass();
        return ProtoAdapter.UINT32.encodedSizeWithTag(2, bitcoinAmount.remainder_pico) + ProtoAdapter.UINT64.encodedSizeWithTag(1, Long.valueOf(bitcoinAmount.satoshi)) + bitcoinAmount.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BitcoinAmount bitcoinAmount = (BitcoinAmount) obj;
        bitcoinAmount.getClass();
        ByteString byteString = ByteString.EMPTY;
        long j = bitcoinAmount.satoshi;
        Integer num = bitcoinAmount.remainder_pico;
        byteString.getClass();
        return new BitcoinAmount(j, num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BitcoinAmount bitcoinAmount = (BitcoinAmount) obj;
        bitcoinAmount.getClass();
        ProtoAdapter.UINT64.encodeWithTag(protoWriter, 1, Long.valueOf(bitcoinAmount.satoshi));
        ProtoAdapter.UINT32.encodeWithTag(protoWriter, 2, bitcoinAmount.remainder_pico);
        protoWriter.writeBytes(bitcoinAmount.unknownFields());
    }
}
