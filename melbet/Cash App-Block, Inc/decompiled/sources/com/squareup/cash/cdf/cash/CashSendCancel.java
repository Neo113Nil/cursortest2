package com.squareup.cash.cdf.cash;

import com.google.mlkit.common.internal.zzb;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class CashSendCancel implements Event {
    public static final zzb Companion = new zzb(19);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer amount;
    public final Boolean is_offline;
    public final LinkedHashMap parameters;
    public final String payment_token;
    public final Integer recipient_count;

    public CashSendCancel(Boolean bool, Integer num, Integer num2, String str) {
        this.amount = num;
        this.is_offline = bool;
        this.payment_token = str;
        this.recipient_count = num2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "Cash", "cdf_action", "Send");
        Countries.putSafe(m, "amount", num);
        Countries.putSafe(m, "is_offline", bool);
        Countries.putSafe(m, "payment_token", str);
        Countries.putSafe(m, "recipient_count", num2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashSendCancel)) {
            return false;
        }
        CashSendCancel cashSendCancel = (CashSendCancel) obj;
        return Intrinsics.areEqual(this.amount, cashSendCancel.amount) && Intrinsics.areEqual(this.is_offline, cashSendCancel.is_offline) && Intrinsics.areEqual(this.payment_token, cashSendCancel.payment_token) && Intrinsics.areEqual(this.recipient_count, cashSendCancel.recipient_count);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Cash Send Cancel";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Integer num = this.amount;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.is_offline;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.payment_token;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.recipient_count;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "CashSendCancel(amount=" + this.amount + ", is_offline=" + this.is_offline + ", payment_token=" + this.payment_token + ", recipient_count=" + this.recipient_count + ")";
    }
}
