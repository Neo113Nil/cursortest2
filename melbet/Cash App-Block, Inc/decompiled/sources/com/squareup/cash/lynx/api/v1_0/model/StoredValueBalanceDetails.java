package com.squareup.cash.lynx.api.v1_0.model;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.mosaic.personalization.api.v1.Entity;
import com.squareup.protos.common.Money;
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
public final class StoredValueBalanceDetails extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StoredValueBalanceDetails> CREATOR;
    public final Money balance;

    static {
        StoredValueBalanceDetails$Companion$ADAPTER$1 storedValueBalanceDetails$Companion$ADAPTER$1 = new StoredValueBalanceDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StoredValueBalanceDetails.class), "type.googleapis.com/squareup.cash.lynx.api.v1_0.model.StoredValueBalanceDetails", Syntax.PROTO_2, null, "squareup/cash/lynx/api/v1_0/model/EnrichedInstrumentLink.proto");
        ADAPTER = storedValueBalanceDetails$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(storedValueBalanceDetails$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoredValueBalanceDetails(Money money, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.balance = money;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StoredValueBalanceDetails)) {
            return false;
        }
        StoredValueBalanceDetails storedValueBalanceDetails = (StoredValueBalanceDetails) obj;
        return Intrinsics.areEqual(unknownFields(), storedValueBalanceDetails.unknownFields()) && Intrinsics.areEqual(this.balance, storedValueBalanceDetails.balance);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Money money = this.balance;
        int hashCode2 = hashCode + (money != null ? money.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Entity.Payment.Builder builder = new Entity.Payment.Builder(1);
        builder.amount = this.balance;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.balance;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("balance=", money, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StoredValueBalanceDetails{", "}", 0, null, null, 56);
    }
}
