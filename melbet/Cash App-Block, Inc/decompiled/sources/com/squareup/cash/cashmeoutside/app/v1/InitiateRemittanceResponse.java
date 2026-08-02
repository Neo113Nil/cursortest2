package com.squareup.cash.cashmeoutside.app.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.GetFlowResponse;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/cashmeoutside/app/v1/InitiateRemittanceResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/app/GetFlowResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class InitiateRemittanceResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InitiateRemittanceResponse> CREATOR;
    public final ClientScenario client_scenario;
    public final String flow_token;
    public final ResponseContext response_context;

    static {
        InitiateRemittanceResponse$Companion$ADAPTER$1 initiateRemittanceResponse$Companion$ADAPTER$1 = new InitiateRemittanceResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InitiateRemittanceResponse.class), "type.googleapis.com/squareup.cash.cashmeoutside.app.v1.InitiateRemittanceResponse", Syntax.PROTO_2, null, "squareup/cash/cashmeoutside/app/v1/initiate_remittance.proto");
        ADAPTER = initiateRemittanceResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(initiateRemittanceResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiateRemittanceResponse(ClientScenario clientScenario, ResponseContext responseContext, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.flow_token = str;
        this.client_scenario = clientScenario;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitiateRemittanceResponse)) {
            return false;
        }
        InitiateRemittanceResponse initiateRemittanceResponse = (InitiateRemittanceResponse) obj;
        return Intrinsics.areEqual(unknownFields(), initiateRemittanceResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, initiateRemittanceResponse.response_context) && Intrinsics.areEqual(this.flow_token, initiateRemittanceResponse.flow_token) && this.client_scenario == initiateRemittanceResponse.client_scenario;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = (hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        String str = this.flow_token;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        ClientScenario clientScenario = this.client_scenario;
        int hashCode4 = hashCode3 + (clientScenario != null ? clientScenario.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GetFlowResponse.Builder builder = new GetFlowResponse.Builder(1);
        builder.response_context = this.response_context;
        builder.token = this.flow_token;
        builder.client_scenario = this.client_scenario;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        String str = this.flow_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "flow_token=", arrayList);
        }
        ClientScenario clientScenario = this.client_scenario;
        if (clientScenario != null) {
            Matcher$$ExternalSyntheticOutline0.m("client_scenario=", clientScenario, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InitiateRemittanceResponse{", "}", 0, null, null, 56);
    }
}
