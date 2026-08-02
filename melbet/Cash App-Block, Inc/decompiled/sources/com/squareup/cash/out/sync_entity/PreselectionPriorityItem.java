package com.squareup.cash.out.sync_entity;

import android.os.Parcelable;
import com.squareup.cash.crypto.WithdrawalDetails;
import com.squareup.cash.lynx.api.v1_0.model.InstrumentType;
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
public final class PreselectionPriorityItem extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PreselectionPriorityItem> CREATOR;
    public final BankAccountQualifier bank_account_qualifier;
    public final DebitCardQualifier debit_card_qualifier;
    public final InstrumentType instrument_type;

    static {
        PreselectionPriorityItem$Companion$ADAPTER$1 preselectionPriorityItem$Companion$ADAPTER$1 = new PreselectionPriorityItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PreselectionPriorityItem.class), "type.googleapis.com/squareup.cash.out.sync_entity.PreselectionPriorityItem", Syntax.PROTO_2, null, "squareup/cash/out/sync_entity/InstrumentCapability.proto");
        ADAPTER = preselectionPriorityItem$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(preselectionPriorityItem$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreselectionPriorityItem(InstrumentType instrumentType, DebitCardQualifier debitCardQualifier, BankAccountQualifier bankAccountQualifier, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.instrument_type = instrumentType;
        this.debit_card_qualifier = debitCardQualifier;
        this.bank_account_qualifier = bankAccountQualifier;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PreselectionPriorityItem)) {
            return false;
        }
        PreselectionPriorityItem preselectionPriorityItem = (PreselectionPriorityItem) obj;
        return Intrinsics.areEqual(unknownFields(), preselectionPriorityItem.unknownFields()) && this.instrument_type == preselectionPriorityItem.instrument_type && this.debit_card_qualifier == preselectionPriorityItem.debit_card_qualifier && this.bank_account_qualifier == preselectionPriorityItem.bank_account_qualifier;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        InstrumentType instrumentType = this.instrument_type;
        int hashCode2 = (hashCode + (instrumentType != null ? instrumentType.hashCode() : 0)) * 37;
        DebitCardQualifier debitCardQualifier = this.debit_card_qualifier;
        int hashCode3 = (hashCode2 + (debitCardQualifier != null ? debitCardQualifier.hashCode() : 0)) * 37;
        BankAccountQualifier bankAccountQualifier = this.bank_account_qualifier;
        int hashCode4 = hashCode3 + (bankAccountQualifier != null ? bankAccountQualifier.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        WithdrawalDetails.Builder builder = new WithdrawalDetails.Builder(24);
        builder.withdrawalType = this.instrument_type;
        builder.customer_supplied_amount = this.debit_card_qualifier;
        builder.customer_token = this.bank_account_qualifier;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        InstrumentType instrumentType = this.instrument_type;
        if (instrumentType != null) {
            arrayList.add("instrument_type=" + instrumentType);
        }
        DebitCardQualifier debitCardQualifier = this.debit_card_qualifier;
        if (debitCardQualifier != null) {
            arrayList.add("debit_card_qualifier=" + debitCardQualifier);
        }
        BankAccountQualifier bankAccountQualifier = this.bank_account_qualifier;
        if (bankAccountQualifier != null) {
            arrayList.add("bank_account_qualifier=" + bankAccountQualifier);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PreselectionPriorityItem{", "}", 0, null, null, 56);
    }
}
