package com.squareup.cash.lynx.api.v1_0.model;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.lynx.api.v1_0.model.link.LinkedReason;
import com.squareup.protos.employeejobs.Job;
import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class InstrumentLinkMetadata extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InstrumentLinkMetadata> CREATOR;
    public final CardBankDetails card_bank_details;
    public final String eligibility_violation;
    public final List eligibility_violation_metadata;
    public final String instrument_link_token_replaced;
    public final LinkResult link_result;
    public final LinkedReason linked_reason;
    public final CardLinkRiskEvaluationResult risk_result;
    public final String threeds_challenge_token;
    public final UnlinkedBy unlinked_by;
    public final UnlinkedReason unlinked_reason;
    public final VerifyResponse verify_response;

    static {
        InstrumentLinkMetadata$Companion$ADAPTER$1 instrumentLinkMetadata$Companion$ADAPTER$1 = new InstrumentLinkMetadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InstrumentLinkMetadata.class), "type.googleapis.com/squareup.cash.lynx.api.v1_0.model.InstrumentLinkMetadata", Syntax.PROTO_2, null, "squareup/cash/lynx/api/v1_0/model/InstrumentLinkMetadata.proto");
        ADAPTER = instrumentLinkMetadata$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(instrumentLinkMetadata$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentLinkMetadata(LinkResult linkResult, CardBankDetails cardBankDetails, String str, CardLinkRiskEvaluationResult cardLinkRiskEvaluationResult, VerifyResponse verifyResponse, UnlinkedBy unlinkedBy, UnlinkedReason unlinkedReason, String str2, List list, String str3, LinkedReason linkedReason, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.link_result = linkResult;
        this.card_bank_details = cardBankDetails;
        this.threeds_challenge_token = str;
        this.risk_result = cardLinkRiskEvaluationResult;
        this.verify_response = verifyResponse;
        this.unlinked_by = unlinkedBy;
        this.unlinked_reason = unlinkedReason;
        this.eligibility_violation = str2;
        this.instrument_link_token_replaced = str3;
        this.linked_reason = linkedReason;
        this.eligibility_violation_metadata = TransactorKt.immutableCopyOf("eligibility_violation_metadata", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstrumentLinkMetadata)) {
            return false;
        }
        InstrumentLinkMetadata instrumentLinkMetadata = (InstrumentLinkMetadata) obj;
        return Intrinsics.areEqual(unknownFields(), instrumentLinkMetadata.unknownFields()) && this.link_result == instrumentLinkMetadata.link_result && Intrinsics.areEqual(this.card_bank_details, instrumentLinkMetadata.card_bank_details) && Intrinsics.areEqual(this.threeds_challenge_token, instrumentLinkMetadata.threeds_challenge_token) && this.risk_result == instrumentLinkMetadata.risk_result && Intrinsics.areEqual(this.verify_response, instrumentLinkMetadata.verify_response) && this.unlinked_by == instrumentLinkMetadata.unlinked_by && this.unlinked_reason == instrumentLinkMetadata.unlinked_reason && Intrinsics.areEqual(this.eligibility_violation, instrumentLinkMetadata.eligibility_violation) && Intrinsics.areEqual(this.eligibility_violation_metadata, instrumentLinkMetadata.eligibility_violation_metadata) && Intrinsics.areEqual(this.instrument_link_token_replaced, instrumentLinkMetadata.instrument_link_token_replaced) && this.linked_reason == instrumentLinkMetadata.linked_reason;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LinkResult linkResult = this.link_result;
        int hashCode2 = (hashCode + (linkResult != null ? linkResult.hashCode() : 0)) * 37;
        CardBankDetails cardBankDetails = this.card_bank_details;
        int hashCode3 = (hashCode2 + (cardBankDetails != null ? cardBankDetails.hashCode() : 0)) * 37;
        String str = this.threeds_challenge_token;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        CardLinkRiskEvaluationResult cardLinkRiskEvaluationResult = this.risk_result;
        int hashCode5 = (hashCode4 + (cardLinkRiskEvaluationResult != null ? cardLinkRiskEvaluationResult.hashCode() : 0)) * 37;
        VerifyResponse verifyResponse = this.verify_response;
        int hashCode6 = (hashCode5 + (verifyResponse != null ? verifyResponse.hashCode() : 0)) * 37;
        UnlinkedBy unlinkedBy = this.unlinked_by;
        int hashCode7 = (hashCode6 + (unlinkedBy != null ? unlinkedBy.hashCode() : 0)) * 37;
        UnlinkedReason unlinkedReason = this.unlinked_reason;
        int hashCode8 = (hashCode7 + (unlinkedReason != null ? unlinkedReason.hashCode() : 0)) * 37;
        String str2 = this.eligibility_violation;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode8 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.eligibility_violation_metadata);
        String str3 = this.instrument_link_token_replaced;
        int hashCode9 = (m + (str3 != null ? str3.hashCode() : 0)) * 37;
        LinkedReason linkedReason = this.linked_reason;
        int hashCode10 = hashCode9 + (linkedReason != null ? linkedReason.hashCode() : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Job.Builder builder = new Job.Builder(1);
        builder.default_wage = this.link_result;
        builder.created_at_timestamp_ms = this.card_bank_details;
        builder.token = this.threeds_challenge_token;
        builder.updated_at_timestamp_ms = this.risk_result;
        builder.deleted_at_timestamp_ms = this.verify_response;
        builder.team_member_count = this.unlinked_by;
        builder.version = this.unlinked_reason;
        builder.merchant_token = this.eligibility_violation;
        builder.tip_eligible = this.eligibility_violation_metadata;
        builder.title = this.instrument_link_token_replaced;
        builder.default_color_scheme = this.linked_reason;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LinkResult linkResult = this.link_result;
        if (linkResult != null) {
            arrayList.add("link_result=" + linkResult);
        }
        CardBankDetails cardBankDetails = this.card_bank_details;
        if (cardBankDetails != null) {
            arrayList.add("card_bank_details=" + cardBankDetails);
        }
        String str = this.threeds_challenge_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "threeds_challenge_token=", arrayList);
        }
        CardLinkRiskEvaluationResult cardLinkRiskEvaluationResult = this.risk_result;
        if (cardLinkRiskEvaluationResult != null) {
            arrayList.add("risk_result=" + cardLinkRiskEvaluationResult);
        }
        VerifyResponse verifyResponse = this.verify_response;
        if (verifyResponse != null) {
            arrayList.add("verify_response=" + verifyResponse);
        }
        UnlinkedBy unlinkedBy = this.unlinked_by;
        if (unlinkedBy != null) {
            arrayList.add("unlinked_by=" + unlinkedBy);
        }
        UnlinkedReason unlinkedReason = this.unlinked_reason;
        if (unlinkedReason != null) {
            arrayList.add("unlinked_reason=" + unlinkedReason);
        }
        String str2 = this.eligibility_violation;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "eligibility_violation=", arrayList);
        }
        List list = this.eligibility_violation_metadata;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("eligibility_violation_metadata=", arrayList, list);
        }
        String str3 = this.instrument_link_token_replaced;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "instrument_link_token_replaced=", arrayList);
        }
        LinkedReason linkedReason = this.linked_reason;
        if (linkedReason != null) {
            arrayList.add("linked_reason=" + linkedReason);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InstrumentLinkMetadata{", "}", 0, null, null, 56);
    }
}
