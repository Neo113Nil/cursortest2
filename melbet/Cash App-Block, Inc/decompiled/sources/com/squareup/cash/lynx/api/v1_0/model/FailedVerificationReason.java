package com.squareup.cash.lynx.api.v1_0.model;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.ForEach;
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
public final class FailedVerificationReason extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FailedVerificationReason> CREATOR;
    public final AuthResultCode auth_result;
    public final AvsResultCode avs_result;
    public final CvcResultCode cvc_result;
    public final String failed_verification_result_reason;

    static {
        FailedVerificationReason$Companion$ADAPTER$1 failedVerificationReason$Companion$ADAPTER$1 = new FailedVerificationReason$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FailedVerificationReason.class), "type.googleapis.com/squareup.cash.lynx.api.v1_0.model.FailedVerificationReason", Syntax.PROTO_2, null, "squareup/cash/lynx/api/v1_0/model/InstrumentLinkMetadata.proto");
        ADAPTER = failedVerificationReason$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(failedVerificationReason$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FailedVerificationReason(String str, AuthResultCode authResultCode, AvsResultCode avsResultCode, CvcResultCode cvcResultCode, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.failed_verification_result_reason = str;
        this.auth_result = authResultCode;
        this.avs_result = avsResultCode;
        this.cvc_result = cvcResultCode;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FailedVerificationReason)) {
            return false;
        }
        FailedVerificationReason failedVerificationReason = (FailedVerificationReason) obj;
        return Intrinsics.areEqual(unknownFields(), failedVerificationReason.unknownFields()) && Intrinsics.areEqual(this.failed_verification_result_reason, failedVerificationReason.failed_verification_result_reason) && this.auth_result == failedVerificationReason.auth_result && this.avs_result == failedVerificationReason.avs_result && this.cvc_result == failedVerificationReason.cvc_result;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.failed_verification_result_reason;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        AuthResultCode authResultCode = this.auth_result;
        int hashCode3 = (hashCode2 + (authResultCode != null ? authResultCode.hashCode() : 0)) * 37;
        AvsResultCode avsResultCode = this.avs_result;
        int hashCode4 = (hashCode3 + (avsResultCode != null ? avsResultCode.hashCode() : 0)) * 37;
        CvcResultCode cvcResultCode = this.cvc_result;
        int hashCode5 = hashCode4 + (cvcResultCode != null ? cvcResultCode.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ForEach.Builder builder = new ForEach.Builder(4);
        builder.item_variable = this.failed_verification_result_reason;
        builder.collection = this.auth_result;
        builder.template = this.avs_result;
        builder.source = this.cvc_result;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.failed_verification_result_reason;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "failed_verification_result_reason=", arrayList);
        }
        AuthResultCode authResultCode = this.auth_result;
        if (authResultCode != null) {
            arrayList.add("auth_result=" + authResultCode);
        }
        AvsResultCode avsResultCode = this.avs_result;
        if (avsResultCode != null) {
            arrayList.add("avs_result=" + avsResultCode);
        }
        CvcResultCode cvcResultCode = this.cvc_result;
        if (cvcResultCode != null) {
            arrayList.add("cvc_result=" + cvcResultCode);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FailedVerificationReason{", "}", 0, null, null, 56);
    }
}
