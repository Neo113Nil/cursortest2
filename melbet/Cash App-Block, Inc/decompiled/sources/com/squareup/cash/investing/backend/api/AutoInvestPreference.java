package com.squareup.cash.investing.backend.api;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AutoInvestPreference {
    public final Money amount;
    public final boolean enabled;
    public final Long nextReloadAt;
    public final RecurringSchedule recurringSchedule;
    public final String token;

    /* renamed from: type, reason: collision with root package name */
    public final ScheduledTransactionPreference.Type f1149type;

    public AutoInvestPreference(boolean z, Money money, RecurringSchedule recurringSchedule, ScheduledTransactionPreference.Type type2, Long l, String str) {
        this.enabled = z;
        this.amount = money;
        this.recurringSchedule = recurringSchedule;
        this.f1149type = type2;
        this.nextReloadAt = l;
        this.token = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoInvestPreference)) {
            return false;
        }
        AutoInvestPreference autoInvestPreference = (AutoInvestPreference) obj;
        return this.enabled == autoInvestPreference.enabled && this.amount.equals(autoInvestPreference.amount) && this.recurringSchedule.equals(autoInvestPreference.recurringSchedule) && this.f1149type == autoInvestPreference.f1149type && Intrinsics.areEqual(this.nextReloadAt, autoInvestPreference.nextReloadAt) && Intrinsics.areEqual(this.token, autoInvestPreference.token);
    }

    public final int hashCode() {
        int hashCode = (this.f1149type.hashCode() + ((this.recurringSchedule.hashCode() + NavAction$$ExternalSyntheticOutline0.m(this.amount, Boolean.hashCode(this.enabled) * 31, 31)) * 31)) * 31;
        Long l = this.nextReloadAt;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.token;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AutoInvestPreference(enabled=" + this.enabled + ", amount=" + this.amount + ", recurringSchedule=" + this.recurringSchedule + ", type=" + this.f1149type + ", nextReloadAt=" + this.nextReloadAt + ", token=" + this.token + ")";
    }
}
