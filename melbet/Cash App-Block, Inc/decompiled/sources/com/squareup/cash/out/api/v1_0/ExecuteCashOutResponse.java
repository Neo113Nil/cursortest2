package com.squareup.cash.out.api.v1_0;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.crypto.WithdrawalDetails;
import com.squareup.cash.out.core.models.FailureReason;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/out/api/v1_0/ExecuteCashOutResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/crypto/WithdrawalDetails$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExecuteCashOutResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ExecuteCashOutResponse> CREATOR;
    public final FailureReason failure_reason;
    public final ExecuteCashOutStatus status;
    public final String transfer_token;

    static {
        ExecuteCashOutResponse$Companion$ADAPTER$1 executeCashOutResponse$Companion$ADAPTER$1 = new ExecuteCashOutResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ExecuteCashOutResponse.class), "type.googleapis.com/squareup.cash.out.api.v1_0.ExecuteCashOutResponse", Syntax.PROTO_2, null, "squareup/cash/out/api/v1_0/ExecuteCashOut.proto");
        ADAPTER = executeCashOutResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(executeCashOutResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExecuteCashOutResponse(String str, ExecuteCashOutStatus executeCashOutStatus, FailureReason failureReason, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.transfer_token = str;
        this.status = executeCashOutStatus;
        this.failure_reason = failureReason;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExecuteCashOutResponse)) {
            return false;
        }
        ExecuteCashOutResponse executeCashOutResponse = (ExecuteCashOutResponse) obj;
        return Intrinsics.areEqual(unknownFields(), executeCashOutResponse.unknownFields()) && Intrinsics.areEqual(this.transfer_token, executeCashOutResponse.transfer_token) && this.status == executeCashOutResponse.status && this.failure_reason == executeCashOutResponse.failure_reason;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.transfer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        ExecuteCashOutStatus executeCashOutStatus = this.status;
        int hashCode3 = (hashCode2 + (executeCashOutStatus != null ? executeCashOutStatus.hashCode() : 0)) * 37;
        FailureReason failureReason = this.failure_reason;
        int hashCode4 = hashCode3 + (failureReason != null ? failureReason.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        WithdrawalDetails.Builder builder = new WithdrawalDetails.Builder(23);
        builder.customer_token = this.transfer_token;
        builder.withdrawalType = this.status;
        builder.customer_supplied_amount = this.failure_reason;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.transfer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "transfer_token=", arrayList);
        }
        ExecuteCashOutStatus executeCashOutStatus = this.status;
        if (executeCashOutStatus != null) {
            arrayList.add("status=" + executeCashOutStatus);
        }
        FailureReason failureReason = this.failure_reason;
        if (failureReason != null) {
            arrayList.add("failure_reason=" + failureReason);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ExecuteCashOutResponse{", "}", 0, null, null, 56);
    }
}
