package com.squareup.cash.cdf.balancebasedaddcash;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class BalanceBasedAddCashSettingsEdit implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final SettingsOption option;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class SettingsOption {
        public static final /* synthetic */ SettingsOption[] $VALUES;
        public static final SettingsOption DISABLE;
        public static final SettingsOption ENABLE;

        static {
            SettingsOption settingsOption = new SettingsOption("ENABLE", 0);
            ENABLE = settingsOption;
            SettingsOption settingsOption2 = new SettingsOption("DISABLE", 1);
            DISABLE = settingsOption2;
            $VALUES = new SettingsOption[]{settingsOption, settingsOption2, new SettingsOption("EDIT_MIN_BALANCE", 2), new SettingsOption("EDIT_INCREMENT", 3)};
        }

        public static SettingsOption valueOf(String str) {
            return (SettingsOption) Enum.valueOf(SettingsOption.class, str);
        }

        public static SettingsOption[] values() {
            return (SettingsOption[]) $VALUES.clone();
        }
    }

    public BalanceBasedAddCashSettingsEdit(SettingsOption settingsOption) {
        this.option = settingsOption;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "BalanceBasedAddCash", "cdf_action", "Settings");
        Countries.putSafe(m, "option", settingsOption);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BalanceBasedAddCashSettingsEdit) && this.option == ((BalanceBasedAddCashSettingsEdit) obj).option;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BalanceBasedAddCash Settings Edit";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.option.hashCode();
    }

    public final String toString() {
        return "BalanceBasedAddCashSettingsEdit(option=" + this.option + ")";
    }
}
