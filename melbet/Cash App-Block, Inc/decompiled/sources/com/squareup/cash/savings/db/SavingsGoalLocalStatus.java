package com.squareup.cash.savings.db;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SavingsGoalLocalStatus {
    public final boolean celebration_shown;
    public final String completion_token;
    public final Money last_seen_balance;
    public final Long last_seen_progress_bps;
    public final Money last_seen_remaining_balance;
    public final boolean met;
    public final String token;

    public SavingsGoalLocalStatus(String str, boolean z, boolean z2, String str2, Money money, Money money2, Long l) {
        str.getClass();
        this.token = str;
        this.met = z;
        this.celebration_shown = z2;
        this.completion_token = str2;
        this.last_seen_balance = money;
        this.last_seen_remaining_balance = money2;
        this.last_seen_progress_bps = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavingsGoalLocalStatus)) {
            return false;
        }
        SavingsGoalLocalStatus savingsGoalLocalStatus = (SavingsGoalLocalStatus) obj;
        return Intrinsics.areEqual(this.token, savingsGoalLocalStatus.token) && this.met == savingsGoalLocalStatus.met && this.celebration_shown == savingsGoalLocalStatus.celebration_shown && Intrinsics.areEqual(this.completion_token, savingsGoalLocalStatus.completion_token) && Intrinsics.areEqual(this.last_seen_balance, savingsGoalLocalStatus.last_seen_balance) && Intrinsics.areEqual(this.last_seen_remaining_balance, savingsGoalLocalStatus.last_seen_remaining_balance) && Intrinsics.areEqual(this.last_seen_progress_bps, savingsGoalLocalStatus.last_seen_progress_bps);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.met), 31, this.celebration_shown);
        String str = this.completion_token;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        Money money = this.last_seen_balance;
        int hashCode2 = (hashCode + (money == null ? 0 : money.hashCode())) * 31;
        Money money2 = this.last_seen_remaining_balance;
        int hashCode3 = (hashCode2 + (money2 == null ? 0 : money2.hashCode())) * 31;
        Long l = this.last_seen_progress_bps;
        return hashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("SavingsGoalLocalStatus(token=", this.token, ", met=", ", celebration_shown=", this.met);
        NavAction$$ExternalSyntheticOutline0.m(m1540m, this.celebration_shown, ", completion_token=", this.completion_token, ", last_seen_balance=");
        m1540m.append(this.last_seen_balance);
        m1540m.append(", last_seen_remaining_balance=");
        m1540m.append(this.last_seen_remaining_balance);
        m1540m.append(", last_seen_progress_bps=");
        return Thread$State$EnumUnboxingLocalUtility.m(m1540m, this.last_seen_progress_bps, ")");
    }
}
