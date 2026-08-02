package com.squareup.cash.cdf.cash;

import com.google.mlkit.common.internal.zze;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.CurrencyCode;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class CashWithdrawEnterAmount implements Event {
    public static final zze Companion = new zze(19);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer amount;
    public final CurrencyCode currency;
    public final String flow_token;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class EntryMethod {
        public static final /* synthetic */ EntryMethod[] $VALUES;
        public static final EntryMethod KEYPAD;

        static {
            EntryMethod entryMethod = new EntryMethod("KEYPAD", 0);
            KEYPAD = entryMethod;
            $VALUES = new EntryMethod[]{entryMethod, new EntryMethod("SLIDER", 1), new EntryMethod("SELECTED", 2)};
        }

        public static EntryMethod valueOf(String str) {
            return (EntryMethod) Enum.valueOf(EntryMethod.class, str);
        }

        public static EntryMethod[] values() {
            return (EntryMethod[]) $VALUES.clone();
        }
    }

    public CashWithdrawEnterAmount(CurrencyCode currencyCode, Integer num, String str) {
        EntryMethod entryMethod = EntryMethod.KEYPAD;
        this.amount = num;
        this.currency = currencyCode;
        this.flow_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "Cash", "cdf_action", "Withdraw");
        Countries.putSafe(m, "amount", num);
        Countries.putSafe(m, "currency", currencyCode);
        Countries.putSafe(m, "entry_method", entryMethod);
        Countries.putSafe(m, "flow_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashWithdrawEnterAmount)) {
            return false;
        }
        CashWithdrawEnterAmount cashWithdrawEnterAmount = (CashWithdrawEnterAmount) obj;
        if (!Intrinsics.areEqual(this.amount, cashWithdrawEnterAmount.amount) || this.currency != cashWithdrawEnterAmount.currency) {
            return false;
        }
        EntryMethod entryMethod = EntryMethod.KEYPAD;
        return Intrinsics.areEqual(this.flow_token, cashWithdrawEnterAmount.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Cash Withdraw EnterAmount";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Integer num = this.amount;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        CurrencyCode currencyCode = this.currency;
        int hashCode2 = (EntryMethod.KEYPAD.hashCode() + ((hashCode + (currencyCode == null ? 0 : currencyCode.hashCode())) * 31)) * 31;
        String str = this.flow_token;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "CashWithdrawEnterAmount(amount=" + this.amount + ", currency=" + this.currency + ", entry_method=" + EntryMethod.KEYPAD + ", flow_token=" + this.flow_token + ")";
    }
}
