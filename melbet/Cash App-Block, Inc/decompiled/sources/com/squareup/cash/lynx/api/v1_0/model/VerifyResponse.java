package com.squareup.cash.lynx.api.v1_0.model;

import android.os.Parcelable;
import com.squareup.cash.crypto.WithdrawalDetails;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class VerifyResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<VerifyResponse> CREATOR;
    public final FailedVerificationReason failed_verification_reason;
    public final NotVerifiableReason not_verifiable_reason;
    public final VerifyResult verify_result;

    static {
        VerifyResponse$Companion$ADAPTER$1 verifyResponse$Companion$ADAPTER$1 = new VerifyResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(VerifyResponse.class), "type.googleapis.com/squareup.cash.lynx.api.v1_0.model.VerifyResponse", Syntax.PROTO_2, null, "squareup/cash/lynx/api/v1_0/model/InstrumentLinkMetadata.proto");
        ADAPTER = verifyResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(verifyResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyResponse(VerifyResult verifyResult, NotVerifiableReason notVerifiableReason, FailedVerificationReason failedVerificationReason, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.verify_result = verifyResult;
        this.not_verifiable_reason = notVerifiableReason;
        this.failed_verification_reason = failedVerificationReason;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerifyResponse)) {
            return false;
        }
        VerifyResponse verifyResponse = (VerifyResponse) obj;
        return Intrinsics.areEqual(unknownFields(), verifyResponse.unknownFields()) && this.verify_result == verifyResponse.verify_result && this.not_verifiable_reason == verifyResponse.not_verifiable_reason && Intrinsics.areEqual(this.failed_verification_reason, verifyResponse.failed_verification_reason);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        VerifyResult verifyResult = this.verify_result;
        int hashCode2 = (hashCode + (verifyResult != null ? verifyResult.hashCode() : 0)) * 37;
        NotVerifiableReason notVerifiableReason = this.not_verifiable_reason;
        int hashCode3 = (hashCode2 + (notVerifiableReason != null ? notVerifiableReason.hashCode() : 0)) * 37;
        FailedVerificationReason failedVerificationReason = this.failed_verification_reason;
        int hashCode4 = hashCode3 + (failedVerificationReason != null ? failedVerificationReason.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        WithdrawalDetails.Builder builder = new WithdrawalDetails.Builder(16);
        builder.withdrawalType = this.verify_result;
        builder.customer_supplied_amount = this.not_verifiable_reason;
        builder.customer_token = this.failed_verification_reason;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        VerifyResult verifyResult = this.verify_result;
        if (verifyResult != null) {
            arrayList.add("verify_result=" + verifyResult);
        }
        NotVerifiableReason notVerifiableReason = this.not_verifiable_reason;
        if (notVerifiableReason != null) {
            arrayList.add("not_verifiable_reason=" + notVerifiableReason);
        }
        FailedVerificationReason failedVerificationReason = this.failed_verification_reason;
        if (failedVerificationReason != null) {
            arrayList.add("failed_verification_reason=" + failedVerificationReason);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "VerifyResponse{", "}", 0, null, null, 56);
    }
}
