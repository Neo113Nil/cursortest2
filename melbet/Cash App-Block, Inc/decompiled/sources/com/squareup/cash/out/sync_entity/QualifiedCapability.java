package com.squareup.cash.out.sync_entity;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.crypto.WithdrawalDetails;
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
public final class QualifiedCapability extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<QualifiedCapability> CREATOR;
    public final BankAccountQualifier bank_account_qualifier;
    public final DebitCardQualifier debit_card_qualifier;
    public final List supported_flows;

    static {
        QualifiedCapability$Companion$ADAPTER$1 qualifiedCapability$Companion$ADAPTER$1 = new QualifiedCapability$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(QualifiedCapability.class), "type.googleapis.com/squareup.cash.out.sync_entity.QualifiedCapability", Syntax.PROTO_2, null, "squareup/cash/out/sync_entity/InstrumentCapability.proto");
        ADAPTER = qualifiedCapability$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(qualifiedCapability$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QualifiedCapability(List list, DebitCardQualifier debitCardQualifier, BankAccountQualifier bankAccountQualifier, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.debit_card_qualifier = debitCardQualifier;
        this.bank_account_qualifier = bankAccountQualifier;
        this.supported_flows = TransactorKt.immutableCopyOf("supported_flows", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QualifiedCapability)) {
            return false;
        }
        QualifiedCapability qualifiedCapability = (QualifiedCapability) obj;
        return Intrinsics.areEqual(unknownFields(), qualifiedCapability.unknownFields()) && Intrinsics.areEqual(this.supported_flows, qualifiedCapability.supported_flows) && this.debit_card_qualifier == qualifiedCapability.debit_card_qualifier && this.bank_account_qualifier == qualifiedCapability.bank_account_qualifier;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.supported_flows);
        DebitCardQualifier debitCardQualifier = this.debit_card_qualifier;
        int hashCode = (m + (debitCardQualifier != null ? debitCardQualifier.hashCode() : 0)) * 37;
        BankAccountQualifier bankAccountQualifier = this.bank_account_qualifier;
        int hashCode2 = hashCode + (bankAccountQualifier != null ? bankAccountQualifier.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        WithdrawalDetails.Builder builder = new WithdrawalDetails.Builder(25);
        builder.withdrawalType = this.supported_flows;
        builder.customer_supplied_amount = this.debit_card_qualifier;
        builder.customer_token = this.bank_account_qualifier;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.supported_flows;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("supported_flows=", arrayList, list);
        }
        DebitCardQualifier debitCardQualifier = this.debit_card_qualifier;
        if (debitCardQualifier != null) {
            arrayList.add("debit_card_qualifier=" + debitCardQualifier);
        }
        BankAccountQualifier bankAccountQualifier = this.bank_account_qualifier;
        if (bankAccountQualifier != null) {
            arrayList.add("bank_account_qualifier=" + bankAccountQualifier);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "QualifiedCapability{", "}", 0, null, null, 56);
    }
}
