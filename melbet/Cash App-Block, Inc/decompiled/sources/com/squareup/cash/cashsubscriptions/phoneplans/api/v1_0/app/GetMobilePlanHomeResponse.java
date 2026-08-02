package com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/cashsubscriptions/phoneplans/api/v1_0/app/GetMobilePlanHomeResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/aegis/core/Member$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GetMobilePlanHomeResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetMobilePlanHomeResponse> CREATOR;
    public final MobilePlanHome mobile_plan_home;
    public final ResponseContext response_context;

    static {
        GetMobilePlanHomeResponse$Companion$ADAPTER$1 getMobilePlanHomeResponse$Companion$ADAPTER$1 = new GetMobilePlanHomeResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetMobilePlanHomeResponse.class), "type.googleapis.com/squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.GetMobilePlanHomeResponse", Syntax.PROTO_2, null, "squareup/cash/cashsubscriptions/phoneplans/api/v1_0/app/GetMobilePlanHome.proto");
        ADAPTER = getMobilePlanHomeResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getMobilePlanHomeResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMobilePlanHomeResponse(ResponseContext responseContext, MobilePlanHome mobilePlanHome, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.mobile_plan_home = mobilePlanHome;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetMobilePlanHomeResponse)) {
            return false;
        }
        GetMobilePlanHomeResponse getMobilePlanHomeResponse = (GetMobilePlanHomeResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getMobilePlanHomeResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, getMobilePlanHomeResponse.response_context) && Intrinsics.areEqual(this.mobile_plan_home, getMobilePlanHomeResponse.mobile_plan_home);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = (hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        MobilePlanHome mobilePlanHome = this.mobile_plan_home;
        int hashCode3 = hashCode2 + (mobilePlanHome != null ? mobilePlanHome.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Member.Builder builder = new Member.Builder(8);
        builder.customer_token = this.response_context;
        builder.sponsorship_tier = this.mobile_plan_home;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        MobilePlanHome mobilePlanHome = this.mobile_plan_home;
        if (mobilePlanHome != null) {
            arrayList.add("mobile_plan_home=" + mobilePlanHome);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetMobilePlanHomeResponse{", "}", 0, null, null, 56);
    }
}
