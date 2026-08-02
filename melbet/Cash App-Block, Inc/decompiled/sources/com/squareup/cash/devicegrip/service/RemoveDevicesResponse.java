package com.squareup.cash.devicegrip.service;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import com.fillr.e;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/cash/devicegrip/service/RemoveDevicesResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/crypto/WithdrawalDetails$Builder;", "Builder", "ErrorReason", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RemoveDevicesResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RemoveDevicesResponse> CREATOR;
    public final ErrorReason error_reason;
    public final List failed_hashed_app_tokens;
    public final ResponseContext response_context;

    public enum ErrorReason implements WireEnum {
        CALLER_DEVICE_NOT_FOUND(1),
        CALLER_DEVICE_NOT_LOGGED_IN_LONG_ENOUGH(2);

        public final int value;
        public static final e Companion = new e();
        public static final RemoveDevicesResponse$ErrorReason$Companion$ADAPTER$1 ADAPTER = new RemoveDevicesResponse$ErrorReason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ErrorReason.class), Syntax.PROTO_2, null);

        ErrorReason(int i) {
            this.value = i;
        }

        public static final ErrorReason fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return CALLER_DEVICE_NOT_FOUND;
            }
            if (i != 2) {
                return null;
            }
            return CALLER_DEVICE_NOT_LOGGED_IN_LONG_ENOUGH;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        RemoveDevicesResponse$Companion$ADAPTER$1 removeDevicesResponse$Companion$ADAPTER$1 = new RemoveDevicesResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RemoveDevicesResponse.class), "type.googleapis.com/squareup.cash.devicegrip.service.RemoveDevicesResponse", Syntax.PROTO_2, null, "squareup/cash/devicegrip/app.proto");
        ADAPTER = removeDevicesResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(removeDevicesResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoveDevicesResponse(ResponseContext responseContext, List list, ErrorReason errorReason, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.response_context = responseContext;
        this.error_reason = errorReason;
        this.failed_hashed_app_tokens = TransactorKt.immutableCopyOf("failed_hashed_app_tokens", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RemoveDevicesResponse)) {
            return false;
        }
        RemoveDevicesResponse removeDevicesResponse = (RemoveDevicesResponse) obj;
        return Intrinsics.areEqual(unknownFields(), removeDevicesResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, removeDevicesResponse.response_context) && Intrinsics.areEqual(this.failed_hashed_app_tokens, removeDevicesResponse.failed_hashed_app_tokens) && this.error_reason == removeDevicesResponse.error_reason;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37, 37, this.failed_hashed_app_tokens);
        ErrorReason errorReason = this.error_reason;
        int hashCode2 = m + (errorReason != null ? errorReason.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        WithdrawalDetails.Builder builder = new WithdrawalDetails.Builder(14);
        builder.withdrawalType = this.response_context;
        builder.customer_supplied_amount = this.failed_hashed_app_tokens;
        builder.customer_token = this.error_reason;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        List list = this.failed_hashed_app_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("failed_hashed_app_tokens=", arrayList, list);
        }
        ErrorReason errorReason = this.error_reason;
        if (errorReason != null) {
            arrayList.add("error_reason=" + errorReason);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RemoveDevicesResponse{", "}", 0, null, null, 56);
    }
}
