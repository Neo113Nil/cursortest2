package com.squareup.cash.out.api.v1_0;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.out.sync_entity.CashOutInstrumentCapabilityConfig;
import com.squareup.protos.cash.aegis.core.Member;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/out/api/v1_0/GetInstrumentCapabilityConfigResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/aegis/core/Member$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GetInstrumentCapabilityConfigResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetInstrumentCapabilityConfigResponse> CREATOR;
    public final CashOutInstrumentCapabilityConfig cash_out_instrument_capability_config;
    public final ResponseContext response_context;

    static {
        GetInstrumentCapabilityConfigResponse$Companion$ADAPTER$1 getInstrumentCapabilityConfigResponse$Companion$ADAPTER$1 = new GetInstrumentCapabilityConfigResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetInstrumentCapabilityConfigResponse.class), "type.googleapis.com/squareup.cash.out.api.v1_0.GetInstrumentCapabilityConfigResponse", Syntax.PROTO_2, null, "squareup/cash/out/api/v1_0/GetInstrumentCapabilityConfig.proto");
        ADAPTER = getInstrumentCapabilityConfigResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getInstrumentCapabilityConfigResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetInstrumentCapabilityConfigResponse(ResponseContext responseContext, CashOutInstrumentCapabilityConfig cashOutInstrumentCapabilityConfig, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.cash_out_instrument_capability_config = cashOutInstrumentCapabilityConfig;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetInstrumentCapabilityConfigResponse)) {
            return false;
        }
        GetInstrumentCapabilityConfigResponse getInstrumentCapabilityConfigResponse = (GetInstrumentCapabilityConfigResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getInstrumentCapabilityConfigResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, getInstrumentCapabilityConfigResponse.response_context) && Intrinsics.areEqual(this.cash_out_instrument_capability_config, getInstrumentCapabilityConfigResponse.cash_out_instrument_capability_config);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = (hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        CashOutInstrumentCapabilityConfig cashOutInstrumentCapabilityConfig = this.cash_out_instrument_capability_config;
        int hashCode3 = hashCode2 + (cashOutInstrumentCapabilityConfig != null ? cashOutInstrumentCapabilityConfig.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Member.Builder builder = new Member.Builder(22);
        builder.customer_token = this.response_context;
        builder.sponsorship_tier = this.cash_out_instrument_capability_config;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        CashOutInstrumentCapabilityConfig cashOutInstrumentCapabilityConfig = this.cash_out_instrument_capability_config;
        if (cashOutInstrumentCapabilityConfig != null) {
            arrayList.add("cash_out_instrument_capability_config=" + cashOutInstrumentCapabilityConfig);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetInstrumentCapabilityConfigResponse{", "}", 0, null, null, 56);
    }
}
