package com.squareup.cash.out.api.v1_0;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aegis.api.SelectDependentsResponse;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/out/api/v1_0/InitiateInstrumentSelectionResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/aegis/api/SelectDependentsResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InitiateInstrumentSelectionResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InitiateInstrumentSelectionResponse> CREATOR;
    public final ResponseContext response_context;

    static {
        InitiateInstrumentSelectionResponse$Companion$ADAPTER$1 initiateInstrumentSelectionResponse$Companion$ADAPTER$1 = new InitiateInstrumentSelectionResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InitiateInstrumentSelectionResponse.class), "type.googleapis.com/squareup.cash.out.api.v1_0.InitiateInstrumentSelectionResponse", Syntax.PROTO_2, null, "squareup/cash/out/api/v1_0/InstrumentSelection.proto");
        ADAPTER = initiateInstrumentSelectionResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(initiateInstrumentSelectionResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiateInstrumentSelectionResponse(ResponseContext responseContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitiateInstrumentSelectionResponse)) {
            return false;
        }
        InitiateInstrumentSelectionResponse initiateInstrumentSelectionResponse = (InitiateInstrumentSelectionResponse) obj;
        return Intrinsics.areEqual(unknownFields(), initiateInstrumentSelectionResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, initiateInstrumentSelectionResponse.response_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = hashCode + (responseContext != null ? responseContext.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SelectDependentsResponse.Builder builder = new SelectDependentsResponse.Builder(12);
        builder.response_context = this.response_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InitiateInstrumentSelectionResponse{", "}", 0, null, null, 56);
    }
}
