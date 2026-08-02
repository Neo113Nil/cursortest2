package com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class GetMobilePlanHomeResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetMobilePlanHomeResponse((ResponseContext) obj, (MobilePlanHome) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(MobilePlanHome.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetMobilePlanHomeResponse getMobilePlanHomeResponse = (GetMobilePlanHomeResponse) obj;
        reverseProtoWriter.getClass();
        getMobilePlanHomeResponse.getClass();
        reverseProtoWriter.writeBytes(getMobilePlanHomeResponse.unknownFields());
        MobilePlanHome.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getMobilePlanHomeResponse.mobile_plan_home);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getMobilePlanHomeResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetMobilePlanHomeResponse getMobilePlanHomeResponse = (GetMobilePlanHomeResponse) obj;
        getMobilePlanHomeResponse.getClass();
        return MobilePlanHome.ADAPTER.encodedSizeWithTag(2, getMobilePlanHomeResponse.mobile_plan_home) + ResponseContext.ADAPTER.encodedSizeWithTag(1, getMobilePlanHomeResponse.response_context) + getMobilePlanHomeResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetMobilePlanHomeResponse getMobilePlanHomeResponse = (GetMobilePlanHomeResponse) obj;
        getMobilePlanHomeResponse.getClass();
        ResponseContext responseContext = getMobilePlanHomeResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        MobilePlanHome mobilePlanHome = getMobilePlanHomeResponse.mobile_plan_home;
        MobilePlanHome mobilePlanHome2 = mobilePlanHome != null ? (MobilePlanHome) MobilePlanHome.ADAPTER.redact(mobilePlanHome) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetMobilePlanHomeResponse(responseContext2, mobilePlanHome2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetMobilePlanHomeResponse getMobilePlanHomeResponse = (GetMobilePlanHomeResponse) obj;
        getMobilePlanHomeResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, getMobilePlanHomeResponse.response_context);
        MobilePlanHome.ADAPTER.encodeWithTag(protoWriter, 2, getMobilePlanHomeResponse.mobile_plan_home);
        protoWriter.writeBytes(getMobilePlanHomeResponse.unknownFields());
    }
}
