package com.squareup.cash.db2;

import com.squareup.cash.db.WireAdapter;
import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class BlockersConfig {
    public final String add_cash_header_text;
    public final Boolean address_typeahead_enabled;
    public final Money target_balance_amount;

    public final class Adapter {
        public final WireAdapter target_balance_amountAdapter;
    }

    public BlockersConfig(Boolean bool, String str, Money money) {
        this.address_typeahead_enabled = bool;
        this.add_cash_header_text = str;
        this.target_balance_amount = money;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockersConfig)) {
            return false;
        }
        BlockersConfig blockersConfig = (BlockersConfig) obj;
        return Intrinsics.areEqual(this.address_typeahead_enabled, blockersConfig.address_typeahead_enabled) && Intrinsics.areEqual(this.add_cash_header_text, blockersConfig.add_cash_header_text) && Intrinsics.areEqual(this.target_balance_amount, blockersConfig.target_balance_amount);
    }

    public final int hashCode() {
        Boolean bool = this.address_typeahead_enabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.add_cash_header_text;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Money money = this.target_balance_amount;
        return hashCode2 + (money != null ? money.hashCode() : 0);
    }

    public final String toString() {
        return "BlockersConfig(address_typeahead_enabled=" + this.address_typeahead_enabled + ", add_cash_header_text=" + this.add_cash_header_text + ", target_balance_amount=" + this.target_balance_amount + ")";
    }
}
