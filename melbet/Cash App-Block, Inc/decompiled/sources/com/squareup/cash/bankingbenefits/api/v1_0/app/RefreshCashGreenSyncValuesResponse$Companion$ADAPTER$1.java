package com.squareup.cash.bankingbenefits.api.v1_0.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RefreshCashGreenSyncValuesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RefreshCashGreenSyncValuesResponse((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RefreshCashGreenSyncValuesResponse refreshCashGreenSyncValuesResponse = (RefreshCashGreenSyncValuesResponse) obj;
        reverseProtoWriter.getClass();
        refreshCashGreenSyncValuesResponse.getClass();
        reverseProtoWriter.writeBytes(refreshCashGreenSyncValuesResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, refreshCashGreenSyncValuesResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RefreshCashGreenSyncValuesResponse refreshCashGreenSyncValuesResponse = (RefreshCashGreenSyncValuesResponse) obj;
        refreshCashGreenSyncValuesResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, refreshCashGreenSyncValuesResponse.response_context) + refreshCashGreenSyncValuesResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RefreshCashGreenSyncValuesResponse refreshCashGreenSyncValuesResponse = (RefreshCashGreenSyncValuesResponse) obj;
        refreshCashGreenSyncValuesResponse.getClass();
        ResponseContext responseContext = refreshCashGreenSyncValuesResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RefreshCashGreenSyncValuesResponse(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RefreshCashGreenSyncValuesResponse refreshCashGreenSyncValuesResponse = (RefreshCashGreenSyncValuesResponse) obj;
        refreshCashGreenSyncValuesResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, refreshCashGreenSyncValuesResponse.response_context);
        protoWriter.writeBytes(refreshCashGreenSyncValuesResponse.unknownFields());
    }
}
