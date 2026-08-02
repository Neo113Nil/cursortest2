package com.squareup.cash.lynx.api.v1_0.model;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.janus.api.ContactAlias;
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
public final class InstrumentVerificationDetails extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InstrumentVerificationDetails> CREATOR;
    public final String calling_service;
    public final String instrument_token;
    public final Boolean is_successful;
    public final Long microauth_completed_time_ms;
    public final String owner_token;
    public final String transaction_identifier;
    public final String verification_id;

    static {
        InstrumentVerificationDetails$Companion$ADAPTER$1 instrumentVerificationDetails$Companion$ADAPTER$1 = new InstrumentVerificationDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InstrumentVerificationDetails.class), "type.googleapis.com/squareup.cash.lynx.api.v1_0.model.InstrumentVerificationDetails", Syntax.PROTO_2, null, "squareup/cash/lynx/api/v1_0/model/EnrichedInstrumentLink.proto");
        ADAPTER = instrumentVerificationDetails$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(instrumentVerificationDetails$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentVerificationDetails(Boolean bool, Long l, String str, String str2, String str3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.is_successful = bool;
        this.microauth_completed_time_ms = l;
        this.verification_id = str;
        this.owner_token = str2;
        this.instrument_token = str3;
        this.calling_service = str4;
        this.transaction_identifier = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstrumentVerificationDetails)) {
            return false;
        }
        InstrumentVerificationDetails instrumentVerificationDetails = (InstrumentVerificationDetails) obj;
        return Intrinsics.areEqual(unknownFields(), instrumentVerificationDetails.unknownFields()) && Intrinsics.areEqual(this.is_successful, instrumentVerificationDetails.is_successful) && Intrinsics.areEqual(this.microauth_completed_time_ms, instrumentVerificationDetails.microauth_completed_time_ms) && Intrinsics.areEqual(this.verification_id, instrumentVerificationDetails.verification_id) && Intrinsics.areEqual(this.owner_token, instrumentVerificationDetails.owner_token) && Intrinsics.areEqual(this.instrument_token, instrumentVerificationDetails.instrument_token) && Intrinsics.areEqual(this.calling_service, instrumentVerificationDetails.calling_service) && Intrinsics.areEqual(this.transaction_identifier, instrumentVerificationDetails.transaction_identifier);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.is_successful;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Long l = this.microauth_completed_time_ms;
        int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str = this.verification_id;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.owner_token;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.instrument_token;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.calling_service;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.transaction_identifier;
        int hashCode8 = hashCode7 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ContactAlias.Builder builder = new ContactAlias.Builder(4, false);
        builder.alias_type = this.is_successful;
        builder.updated_at = this.microauth_completed_time_ms;
        builder.customer_token = this.verification_id;
        builder.alias_value = this.owner_token;
        builder.hashed_alias_token = this.instrument_token;
        builder.linked_at = this.calling_service;
        builder.version = this.transaction_identifier;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.is_successful;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_successful=", bool, arrayList);
        }
        Long l = this.microauth_completed_time_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("microauth_completed_time_ms=", l, arrayList);
        }
        String str = this.verification_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "verification_id=", arrayList);
        }
        String str2 = this.owner_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "owner_token=", arrayList);
        }
        String str3 = this.instrument_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "instrument_token=", arrayList);
        }
        String str4 = this.calling_service;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "calling_service=", arrayList);
        }
        String str5 = this.transaction_identifier;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "transaction_identifier=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InstrumentVerificationDetails{", "}", 0, null, null, 56);
    }
}
