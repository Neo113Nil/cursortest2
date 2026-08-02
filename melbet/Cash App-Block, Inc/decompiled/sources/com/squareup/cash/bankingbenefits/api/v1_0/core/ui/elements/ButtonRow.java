package com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements;

import android.os.Parcelable;
import com.fillr.e;
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
public final class ButtonRow extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ButtonRow> CREATOR;
    public final Prominence prominence;
    public final RowAction row_action;
    public final String text;

    public enum Prominence implements WireEnum {
        UNSPECIFIED(0),
        PROMINENT(1),
        STANDARD(2),
        SUBTLE(3);

        public static final ButtonRow$Prominence$Companion$ADAPTER$1 ADAPTER;
        public static final e Companion;
        public final int value;

        static {
            Prominence prominence = UNSPECIFIED;
            Companion = new e();
            ADAPTER = new ButtonRow$Prominence$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Prominence.class), Syntax.PROTO_2, prominence);
        }

        Prominence(int i) {
            this.value = i;
        }

        public static final Prominence fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return UNSPECIFIED;
            }
            if (i == 1) {
                return PROMINENT;
            }
            if (i == 2) {
                return STANDARD;
            }
            if (i != 3) {
                return null;
            }
            return SUBTLE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        ButtonRow$Companion$ADAPTER$1 buttonRow$Companion$ADAPTER$1 = new ButtonRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ButtonRow.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.ButtonRow", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/core/ui/elements/ButtonRow.proto");
        ADAPTER = buttonRow$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(buttonRow$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonRow(String str, Prominence prominence, RowAction rowAction, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.text = str;
        this.prominence = prominence;
        this.row_action = rowAction;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ButtonRow)) {
            return false;
        }
        ButtonRow buttonRow = (ButtonRow) obj;
        return Intrinsics.areEqual(unknownFields(), buttonRow.unknownFields()) && Intrinsics.areEqual(this.text, buttonRow.text) && this.prominence == buttonRow.prominence && Intrinsics.areEqual(this.row_action, buttonRow.row_action);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Prominence prominence = this.prominence;
        int hashCode3 = (hashCode2 + (prominence != null ? prominence.hashCode() : 0)) * 37;
        RowAction rowAction = this.row_action;
        int hashCode4 = hashCode3 + (rowAction != null ? rowAction.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        WithdrawalDetails.Builder builder = new WithdrawalDetails.Builder(3);
        builder.customer_token = this.text;
        builder.withdrawalType = this.prominence;
        builder.customer_supplied_amount = this.row_action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
        }
        Prominence prominence = this.prominence;
        if (prominence != null) {
            arrayList.add("prominence=" + prominence);
        }
        RowAction rowAction = this.row_action;
        if (rowAction != null) {
            arrayList.add("row_action=" + rowAction);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ButtonRow{", "}", 0, null, null, 56);
    }
}
