package com.squareup.cash.cdf.savingsfolder;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SavingsFolderTransferInChooseAmount implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer amount_cents;
    public final String currency_code;
    public final LinkedHashMap parameters;
    public final SelectionType selection_type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class SelectionType {
        public static final /* synthetic */ SelectionType[] $VALUES;
        public static final SelectionType ATM_AMOUNT;
        public static final SelectionType CUSTOM_AMOUNT;

        static {
            SelectionType selectionType = new SelectionType("ATM_AMOUNT", 0);
            ATM_AMOUNT = selectionType;
            SelectionType selectionType2 = new SelectionType("CUSTOM_AMOUNT", 1);
            CUSTOM_AMOUNT = selectionType2;
            $VALUES = new SelectionType[]{selectionType, selectionType2};
        }

        public static SelectionType valueOf(String str) {
            return (SelectionType) Enum.valueOf(SelectionType.class, str);
        }

        public static SelectionType[] values() {
            return (SelectionType[]) $VALUES.clone();
        }
    }

    public SavingsFolderTransferInChooseAmount(SelectionType selectionType, Integer num, String str) {
        this.selection_type = selectionType;
        this.amount_cents = num;
        this.currency_code = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "SavingsFolder", "cdf_action", "TransferIn");
        Countries.putSafe(m, "selection_type", selectionType);
        Countries.putSafe(m, "amount_cents", num);
        Countries.putSafe(m, "currency_code", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavingsFolderTransferInChooseAmount)) {
            return false;
        }
        SavingsFolderTransferInChooseAmount savingsFolderTransferInChooseAmount = (SavingsFolderTransferInChooseAmount) obj;
        return this.selection_type == savingsFolderTransferInChooseAmount.selection_type && Intrinsics.areEqual(this.amount_cents, savingsFolderTransferInChooseAmount.amount_cents) && Intrinsics.areEqual(this.currency_code, savingsFolderTransferInChooseAmount.currency_code);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "SavingsFolder TransferIn ChooseAmount";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.selection_type.hashCode() * 31;
        Integer num = this.amount_cents;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.currency_code;
        return (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SavingsFolderTransferInChooseAmount(selection_type=");
        sb.append(this.selection_type);
        sb.append(", amount_cents=");
        sb.append(this.amount_cents);
        sb.append(", currency_code=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.currency_code, ", transfer_type=null)");
    }
}
