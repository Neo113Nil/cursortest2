package com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements;

import android.os.Parcelable;
import com.google.mlkit.vision.text.zza;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.crypto.WithdrawalDetails;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class RowAction extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RowAction> CREATOR;
    public final RowAction$Action_$ClientRoute Action;
    public final ID id;
    public final String text;

    public enum ID implements WireEnum {
        UNSPECIFIED(0),
        OVERDRAFT_COVERAGE(1),
        SAVINGS(2),
        SETUP_DIRECT_DEPOSIT(3);

        public static final RowAction$ID$Companion$ADAPTER$1 ADAPTER;
        public static final zza Companion;
        public final int value;

        static {
            ID id = UNSPECIFIED;
            Companion = new zza(17);
            ADAPTER = new RowAction$ID$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ID.class), Syntax.PROTO_2, id);
        }

        ID(int i) {
            this.value = i;
        }

        public static final ID fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return UNSPECIFIED;
            }
            if (i == 1) {
                return OVERDRAFT_COVERAGE;
            }
            if (i == 2) {
                return SAVINGS;
            }
            if (i != 3) {
                return null;
            }
            return SETUP_DIRECT_DEPOSIT;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        RowAction$Companion$ADAPTER$1 rowAction$Companion$ADAPTER$1 = new RowAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RowAction.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.RowAction", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/core/ui/elements/RowAction.proto");
        ADAPTER = rowAction$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(rowAction$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RowAction(String str, RowAction$Action_$ClientRoute rowAction$Action_$ClientRoute, ID id, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.text = str;
        this.Action = rowAction$Action_$ClientRoute;
        this.id = id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RowAction)) {
            return false;
        }
        RowAction rowAction = (RowAction) obj;
        return Intrinsics.areEqual(unknownFields(), rowAction.unknownFields()) && Intrinsics.areEqual(this.text, rowAction.text) && Intrinsics.areEqual(this.Action, rowAction.Action) && this.id == rowAction.id;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        RowAction$Action_$ClientRoute rowAction$Action_$ClientRoute = this.Action;
        int hashCode3 = (hashCode2 + (rowAction$Action_$ClientRoute != null ? rowAction$Action_$ClientRoute.value.hashCode() : 0)) * 37;
        ID id = this.id;
        int hashCode4 = hashCode3 + (id != null ? id.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        WithdrawalDetails.Builder builder = new WithdrawalDetails.Builder(4);
        builder.customer_token = this.text;
        builder.withdrawalType = this.Action;
        builder.customer_supplied_amount = this.id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
        }
        RowAction$Action_$ClientRoute rowAction$Action_$ClientRoute = this.Action;
        if (rowAction$Action_$ClientRoute != null) {
            arrayList.add("Action=" + rowAction$Action_$ClientRoute);
        }
        ID id = this.id;
        if (id != null) {
            arrayList.add("id=" + id);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RowAction{", "}", 0, null, null, 56);
    }
}
