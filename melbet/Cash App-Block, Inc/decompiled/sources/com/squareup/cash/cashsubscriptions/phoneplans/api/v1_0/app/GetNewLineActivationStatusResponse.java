package com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.fillr.e;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.crypto.WithdrawalDetails;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/cash/cashsubscriptions/phoneplans/api/v1_0/app/GetNewLineActivationStatusResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/crypto/WithdrawalDetails$Builder;", "Builder", "ActivationStatus", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GetNewLineActivationStatusResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetNewLineActivationStatusResponse> CREATOR;
    public final Integer poll_interval_seconds;
    public final ResponseContext response_context;
    public final ActivationStatus status;

    public enum ActivationStatus implements WireEnum {
        ACTIVATION_STATUS_UNSPECIFIED(0),
        PENDING(1),
        ACTIVATED(2),
        FAILED(3);

        public static final GetNewLineActivationStatusResponse$ActivationStatus$Companion$ADAPTER$1 ADAPTER;
        public static final e Companion;
        public final int value;

        static {
            ActivationStatus activationStatus = ACTIVATION_STATUS_UNSPECIFIED;
            Companion = new e();
            ADAPTER = new GetNewLineActivationStatusResponse$ActivationStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ActivationStatus.class), Syntax.PROTO_2, activationStatus);
        }

        ActivationStatus(int i) {
            this.value = i;
        }

        public static final ActivationStatus fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return ACTIVATION_STATUS_UNSPECIFIED;
            }
            if (i == 1) {
                return PENDING;
            }
            if (i == 2) {
                return ACTIVATED;
            }
            if (i != 3) {
                return null;
            }
            return FAILED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        GetNewLineActivationStatusResponse$Companion$ADAPTER$1 getNewLineActivationStatusResponse$Companion$ADAPTER$1 = new GetNewLineActivationStatusResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetNewLineActivationStatusResponse.class), "type.googleapis.com/squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.GetNewLineActivationStatusResponse", Syntax.PROTO_2, null, "squareup/cash/cashsubscriptions/phoneplans/api/v1_0/app/GetNewLineActivationStatus.proto");
        ADAPTER = getNewLineActivationStatusResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getNewLineActivationStatusResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetNewLineActivationStatusResponse(ResponseContext responseContext, ActivationStatus activationStatus, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.status = activationStatus;
        this.poll_interval_seconds = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetNewLineActivationStatusResponse)) {
            return false;
        }
        GetNewLineActivationStatusResponse getNewLineActivationStatusResponse = (GetNewLineActivationStatusResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getNewLineActivationStatusResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, getNewLineActivationStatusResponse.response_context) && this.status == getNewLineActivationStatusResponse.status && Intrinsics.areEqual(this.poll_interval_seconds, getNewLineActivationStatusResponse.poll_interval_seconds);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = (hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        ActivationStatus activationStatus = this.status;
        int hashCode3 = (hashCode2 + (activationStatus != null ? activationStatus.hashCode() : 0)) * 37;
        Integer num = this.poll_interval_seconds;
        int hashCode4 = hashCode3 + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        WithdrawalDetails.Builder builder = new WithdrawalDetails.Builder(9);
        builder.withdrawalType = this.response_context;
        builder.customer_supplied_amount = this.status;
        builder.customer_token = this.poll_interval_seconds;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        ActivationStatus activationStatus = this.status;
        if (activationStatus != null) {
            arrayList.add("status=" + activationStatus);
        }
        Integer num = this.poll_interval_seconds;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("poll_interval_seconds=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetNewLineActivationStatusResponse{", "}", 0, null, null, 56);
    }
}
