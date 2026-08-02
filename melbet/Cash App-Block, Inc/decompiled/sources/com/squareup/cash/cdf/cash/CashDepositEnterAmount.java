package com.squareup.cash.cdf.cash;

import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.CurrencyCode;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class CashDepositEnterAmount implements Event {
    public static final zzd Companion = new zzd(18);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer amount;
    public final CurrencyCode currency;
    public final String flow_token;
    public final String options;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public final class EntryMethod {
        public static final /* synthetic */ EntryMethod[] $VALUES;
        public static final EntryMethod SELECTED;

        static {
            EntryMethod entryMethod = new EntryMethod("SELECTED", 0);
            SELECTED = entryMethod;
            $VALUES = new EntryMethod[]{entryMethod, new EntryMethod("KEYPAD", 1)};
        }

        public static EntryMethod valueOf(String str) {
            return (EntryMethod) Enum.valueOf(EntryMethod.class, str);
        }

        public static EntryMethod[] values() {
            return (EntryMethod[]) $VALUES.clone();
        }
    }

    public CashDepositEnterAmount(Integer num, CurrencyCode currencyCode, String str, String str2) {
        EntryMethod entryMethod = EntryMethod.SELECTED;
        this.amount = num;
        this.currency = currencyCode;
        this.flow_token = str;
        this.options = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "Cash", "cdf_action", "Deposit");
        Countries.putSafe(m, "amount", num);
        Countries.putSafe(m, "currency", currencyCode);
        Countries.putSafe(m, "entry_method", entryMethod);
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "options", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashDepositEnterAmount)) {
            return false;
        }
        CashDepositEnterAmount cashDepositEnterAmount = (CashDepositEnterAmount) obj;
        if (!Intrinsics.areEqual(this.amount, cashDepositEnterAmount.amount) || this.currency != cashDepositEnterAmount.currency) {
            return false;
        }
        EntryMethod entryMethod = EntryMethod.SELECTED;
        return Intrinsics.areEqual(this.flow_token, cashDepositEnterAmount.flow_token) && this.options.equals(cashDepositEnterAmount.options);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Cash Deposit EnterAmount";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Integer num = this.amount;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        CurrencyCode currencyCode = this.currency;
        int hashCode2 = (EntryMethod.SELECTED.hashCode() + ((hashCode + (currencyCode == null ? 0 : currencyCode.hashCode())) * 31)) * 31;
        String str = this.flow_token;
        return this.options.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        EntryMethod entryMethod = EntryMethod.SELECTED;
        StringBuilder sb = new StringBuilder("CashDepositEnterAmount(amount=");
        sb.append(this.amount);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", entry_method=");
        sb.append(entryMethod);
        sb.append(", flow_token=");
        sb.append(this.flow_token);
        sb.append(", options=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.options, ")");
    }
}
