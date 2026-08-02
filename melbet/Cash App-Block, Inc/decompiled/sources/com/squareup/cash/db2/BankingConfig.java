package com.squareup.cash.db2;

import com.squareup.protos.franklin.app.BankingConfig;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class BankingConfig {
    public final String main_screen_balance_subtitle;
    public final String main_screen_title;
    public final BankingConfig.RecurringDepositsDdaUpsell recurring_deposits_dda_upsell;

    public BankingConfig(String str, String str2, BankingConfig.RecurringDepositsDdaUpsell recurringDepositsDdaUpsell) {
        this.main_screen_title = str;
        this.main_screen_balance_subtitle = str2;
        this.recurring_deposits_dda_upsell = recurringDepositsDdaUpsell;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BankingConfig)) {
            return false;
        }
        BankingConfig bankingConfig = (BankingConfig) obj;
        return Intrinsics.areEqual(this.main_screen_title, bankingConfig.main_screen_title) && Intrinsics.areEqual(this.main_screen_balance_subtitle, bankingConfig.main_screen_balance_subtitle) && Intrinsics.areEqual(this.recurring_deposits_dda_upsell, bankingConfig.recurring_deposits_dda_upsell);
    }

    public final String getMain_screen_balance_subtitle() {
        return this.main_screen_balance_subtitle;
    }

    public final String getMain_screen_title() {
        return this.main_screen_title;
    }

    public final BankingConfig.RecurringDepositsDdaUpsell getRecurring_deposits_dda_upsell() {
        return this.recurring_deposits_dda_upsell;
    }

    public final int hashCode() {
        String str = this.main_screen_title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.main_screen_balance_subtitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BankingConfig.RecurringDepositsDdaUpsell recurringDepositsDdaUpsell = this.recurring_deposits_dda_upsell;
        return hashCode2 + (recurringDepositsDdaUpsell != null ? recurringDepositsDdaUpsell.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BankingConfig(main_screen_title=", this.main_screen_title, ", main_screen_balance_subtitle=", this.main_screen_balance_subtitle, ", recurring_deposits_dda_upsell=");
        m.append(this.recurring_deposits_dda_upsell);
        m.append(")");
        return m.toString();
    }
}
