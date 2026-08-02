package com.squareup.cash.out.api.v1_0;

import androidx.room.TransactorKt;
import com.squareup.cash.out.sync_entity.CashOutInstrumentCapabilityConfig;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class GetInstrumentCapabilityConfigResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetInstrumentCapabilityConfigResponse((ResponseContext) obj, (CashOutInstrumentCapabilityConfig) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(CashOutInstrumentCapabilityConfig.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetInstrumentCapabilityConfigResponse getInstrumentCapabilityConfigResponse = (GetInstrumentCapabilityConfigResponse) obj;
        reverseProtoWriter.getClass();
        getInstrumentCapabilityConfigResponse.getClass();
        reverseProtoWriter.writeBytes(getInstrumentCapabilityConfigResponse.unknownFields());
        CashOutInstrumentCapabilityConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getInstrumentCapabilityConfigResponse.cash_out_instrument_capability_config);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getInstrumentCapabilityConfigResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetInstrumentCapabilityConfigResponse getInstrumentCapabilityConfigResponse = (GetInstrumentCapabilityConfigResponse) obj;
        getInstrumentCapabilityConfigResponse.getClass();
        return CashOutInstrumentCapabilityConfig.ADAPTER.encodedSizeWithTag(2, getInstrumentCapabilityConfigResponse.cash_out_instrument_capability_config) + ResponseContext.ADAPTER.encodedSizeWithTag(1, getInstrumentCapabilityConfigResponse.response_context) + getInstrumentCapabilityConfigResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetInstrumentCapabilityConfigResponse getInstrumentCapabilityConfigResponse = (GetInstrumentCapabilityConfigResponse) obj;
        getInstrumentCapabilityConfigResponse.getClass();
        ResponseContext responseContext = getInstrumentCapabilityConfigResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        CashOutInstrumentCapabilityConfig cashOutInstrumentCapabilityConfig = getInstrumentCapabilityConfigResponse.cash_out_instrument_capability_config;
        CashOutInstrumentCapabilityConfig cashOutInstrumentCapabilityConfig2 = cashOutInstrumentCapabilityConfig != null ? (CashOutInstrumentCapabilityConfig) CashOutInstrumentCapabilityConfig.ADAPTER.redact(cashOutInstrumentCapabilityConfig) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetInstrumentCapabilityConfigResponse(responseContext2, cashOutInstrumentCapabilityConfig2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetInstrumentCapabilityConfigResponse getInstrumentCapabilityConfigResponse = (GetInstrumentCapabilityConfigResponse) obj;
        getInstrumentCapabilityConfigResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, getInstrumentCapabilityConfigResponse.response_context);
        CashOutInstrumentCapabilityConfig.ADAPTER.encodeWithTag(protoWriter, 2, getInstrumentCapabilityConfigResponse.cash_out_instrument_capability_config);
        protoWriter.writeBytes(getInstrumentCapabilityConfigResponse.unknownFields());
    }
}
