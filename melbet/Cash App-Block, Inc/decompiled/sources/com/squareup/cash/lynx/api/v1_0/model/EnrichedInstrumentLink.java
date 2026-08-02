package com.squareup.cash.lynx.api.v1_0.model;

import android.os.Parcelable;
import com.squareup.lending.PrepurchaseCashCardAppletData;
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
public final class EnrichedInstrumentLink extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EnrichedInstrumentLink> CREATOR;
    public final BankMetadata bank_metadata;
    public final BankinfoDetails bankinfo_details;
    public final BinfoDetails binfo_details;
    public final BrowserInteractionDetails browser_interaction_details;
    public final InstrumentLink instrument_link;
    public final InstrumentLinkMetadata instrument_link_metadata;
    public final InstrumentLinkOwnerDetails instrument_link_owner_details;
    public final InstrumentVerificationDetails instrument_verification_details;
    public final StoredValueBalanceDetails stored_value_balance_details;

    static {
        EnrichedInstrumentLink$Companion$ADAPTER$1 enrichedInstrumentLink$Companion$ADAPTER$1 = new EnrichedInstrumentLink$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EnrichedInstrumentLink.class), "type.googleapis.com/squareup.cash.lynx.api.v1_0.model.EnrichedInstrumentLink", Syntax.PROTO_2, null, "squareup/cash/lynx/api/v1_0/model/EnrichedInstrumentLink.proto");
        ADAPTER = enrichedInstrumentLink$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(enrichedInstrumentLink$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnrichedInstrumentLink(InstrumentLink instrumentLink, BinfoDetails binfoDetails, BankinfoDetails bankinfoDetails, BrowserInteractionDetails browserInteractionDetails, InstrumentVerificationDetails instrumentVerificationDetails, StoredValueBalanceDetails storedValueBalanceDetails, InstrumentLinkMetadata instrumentLinkMetadata, InstrumentLinkOwnerDetails instrumentLinkOwnerDetails, BankMetadata bankMetadata, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.instrument_link = instrumentLink;
        this.binfo_details = binfoDetails;
        this.bankinfo_details = bankinfoDetails;
        this.browser_interaction_details = browserInteractionDetails;
        this.instrument_verification_details = instrumentVerificationDetails;
        this.stored_value_balance_details = storedValueBalanceDetails;
        this.instrument_link_metadata = instrumentLinkMetadata;
        this.instrument_link_owner_details = instrumentLinkOwnerDetails;
        this.bank_metadata = bankMetadata;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EnrichedInstrumentLink)) {
            return false;
        }
        EnrichedInstrumentLink enrichedInstrumentLink = (EnrichedInstrumentLink) obj;
        return Intrinsics.areEqual(unknownFields(), enrichedInstrumentLink.unknownFields()) && Intrinsics.areEqual(this.instrument_link, enrichedInstrumentLink.instrument_link) && Intrinsics.areEqual(this.binfo_details, enrichedInstrumentLink.binfo_details) && Intrinsics.areEqual(this.bankinfo_details, enrichedInstrumentLink.bankinfo_details) && Intrinsics.areEqual(this.browser_interaction_details, enrichedInstrumentLink.browser_interaction_details) && Intrinsics.areEqual(this.instrument_verification_details, enrichedInstrumentLink.instrument_verification_details) && Intrinsics.areEqual(this.stored_value_balance_details, enrichedInstrumentLink.stored_value_balance_details) && Intrinsics.areEqual(this.instrument_link_metadata, enrichedInstrumentLink.instrument_link_metadata) && Intrinsics.areEqual(this.instrument_link_owner_details, enrichedInstrumentLink.instrument_link_owner_details) && Intrinsics.areEqual(this.bank_metadata, enrichedInstrumentLink.bank_metadata);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        InstrumentLink instrumentLink = this.instrument_link;
        int hashCode2 = (hashCode + (instrumentLink != null ? instrumentLink.hashCode() : 0)) * 37;
        BinfoDetails binfoDetails = this.binfo_details;
        int hashCode3 = (hashCode2 + (binfoDetails != null ? binfoDetails.hashCode() : 0)) * 37;
        BankinfoDetails bankinfoDetails = this.bankinfo_details;
        int hashCode4 = (hashCode3 + (bankinfoDetails != null ? bankinfoDetails.hashCode() : 0)) * 37;
        BrowserInteractionDetails browserInteractionDetails = this.browser_interaction_details;
        int hashCode5 = (hashCode4 + (browserInteractionDetails != null ? browserInteractionDetails.hashCode() : 0)) * 37;
        InstrumentVerificationDetails instrumentVerificationDetails = this.instrument_verification_details;
        int hashCode6 = (hashCode5 + (instrumentVerificationDetails != null ? instrumentVerificationDetails.hashCode() : 0)) * 37;
        StoredValueBalanceDetails storedValueBalanceDetails = this.stored_value_balance_details;
        int hashCode7 = (hashCode6 + (storedValueBalanceDetails != null ? storedValueBalanceDetails.hashCode() : 0)) * 37;
        InstrumentLinkMetadata instrumentLinkMetadata = this.instrument_link_metadata;
        int hashCode8 = (hashCode7 + (instrumentLinkMetadata != null ? instrumentLinkMetadata.hashCode() : 0)) * 37;
        InstrumentLinkOwnerDetails instrumentLinkOwnerDetails = this.instrument_link_owner_details;
        int hashCode9 = (hashCode8 + (instrumentLinkOwnerDetails != null ? instrumentLinkOwnerDetails.hashCode() : 0)) * 37;
        BankMetadata bankMetadata = this.bank_metadata;
        int hashCode10 = hashCode9 + (bankMetadata != null ? bankMetadata.hashCode() : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PrepurchaseCashCardAppletData.Builder builder = new PrepurchaseCashCardAppletData.Builder(2, false);
        builder.locale = this.instrument_link;
        builder.title = this.binfo_details;
        builder.info_rows_header = this.bankinfo_details;
        builder.footer_text = this.browser_interaction_details;
        builder.loadable_subtitle = this.instrument_verification_details;
        builder.info_rows = this.stored_value_balance_details;
        builder.primary_footer_button_state = this.instrument_link_metadata;
        builder.secondary_footer_button_state = this.instrument_link_owner_details;
        builder.payment_plans_data = this.bank_metadata;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        InstrumentLink instrumentLink = this.instrument_link;
        if (instrumentLink != null) {
            arrayList.add("instrument_link=" + instrumentLink);
        }
        BinfoDetails binfoDetails = this.binfo_details;
        if (binfoDetails != null) {
            arrayList.add("binfo_details=" + binfoDetails);
        }
        BankinfoDetails bankinfoDetails = this.bankinfo_details;
        if (bankinfoDetails != null) {
            arrayList.add("bankinfo_details=" + bankinfoDetails);
        }
        BrowserInteractionDetails browserInteractionDetails = this.browser_interaction_details;
        if (browserInteractionDetails != null) {
            arrayList.add("browser_interaction_details=" + browserInteractionDetails);
        }
        InstrumentVerificationDetails instrumentVerificationDetails = this.instrument_verification_details;
        if (instrumentVerificationDetails != null) {
            arrayList.add("instrument_verification_details=" + instrumentVerificationDetails);
        }
        StoredValueBalanceDetails storedValueBalanceDetails = this.stored_value_balance_details;
        if (storedValueBalanceDetails != null) {
            arrayList.add("stored_value_balance_details=" + storedValueBalanceDetails);
        }
        InstrumentLinkMetadata instrumentLinkMetadata = this.instrument_link_metadata;
        if (instrumentLinkMetadata != null) {
            arrayList.add("instrument_link_metadata=" + instrumentLinkMetadata);
        }
        InstrumentLinkOwnerDetails instrumentLinkOwnerDetails = this.instrument_link_owner_details;
        if (instrumentLinkOwnerDetails != null) {
            arrayList.add("instrument_link_owner_details=" + instrumentLinkOwnerDetails);
        }
        BankMetadata bankMetadata = this.bank_metadata;
        if (bankMetadata != null) {
            arrayList.add("bank_metadata=" + bankMetadata);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EnrichedInstrumentLink{", "}", 0, null, null, 56);
    }
}
